import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ak")
public final class Class30
{
    @ObfuscatedName("z")
    boolean field272;
    @ObfuscatedName("w")
    boolean field264;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lao;")
    Class33 field265;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lll;")
    Class318 field266;
    @ObfuscatedName("u")
    HashMap field267;
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "[[Lh;")
    Class23[][] field268;
    @ObfuscatedName("k")
    HashMap field269;
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "[Lly;")
    Class317[] field279;
    @ObfuscatedName("x")
    final HashMap field271;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 1298084395)
    int field273;
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = -1151941721)
    int field278;
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = -572130391)
    int field274;
    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = -1931488771)
    int field270;
    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = 984068981)
    public int field276;
    
    public Class30(final Class317[] field279, final HashMap field280) {
        this.field272 = false;
        this.field264 = false;
        this.field269 = new HashMap();
        this.field276 = 0;
        this.field279 = field279;
        this.field271 = field280;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lir;Ljava/lang/String;ZB)V", garbageValue = "2")
    public void method490(final Class247 class247, final String s, final boolean b) {
        if (this.field264) {
            return;
        }
        this.field272 = false;
        this.field264 = true;
        System.nanoTime();
        final int method4643 = class247.method4643(class247.method4642(Class29.field252.field255), s);
        final Class182 class248 = new Class182(class247.method4684(Class29.field252.field255, s));
        final Class182 class249 = new Class182(class247.method4684(Class29.field251.field255, s));
        final Class182 class250 = new Class182(class247.method4684(s, Class29.field262.field255));
        System.nanoTime();
        System.nanoTime();
        this.field265 = new Class33();
        try {
            this.field265.method550(class248, class250, class249, method4643, b);
        }
        catch (IllegalStateException ex) {
            return;
        }
        this.field265.method217();
        this.field265.method218();
        this.field265.method219();
        this.field273 = this.field265.method258() * 64;
        this.field278 = this.field265.method247() * 64;
        this.field274 = (this.field265.method214() - this.field265.method258() + 1) * 64;
        this.field270 = (this.field265.method249() - this.field265.method247() + 1) * 64;
        final int n = this.field265.method214() - this.field265.method258() + 1;
        final int n2 = this.field265.method249() - this.field265.method247() + 1;
        System.nanoTime();
        System.nanoTime();
        Class23.field188.method4006();
        Class23.field189.method4006();
        this.field268 = new Class23[n][n2];
        for (final Object class251 : this.field265.field292) {
            final int field127 = ((Class10)class251).field127;
            final int field128 = ((Class10)class251).field117;
            (this.field268[field127 - this.field265.method258()][field128 - this.field265.method247()] = new Class23(field127, field128, this.field265.method211(), this.field271)).method400(((Class10)class251), this.field265.field290);
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n2; ++j) {
                if (this.field268[i][j] == null) {
                    (this.field268[i][j] = new Class23(this.field265.method258() + i, this.field265.method247() + j, this.field265.method211(), this.field271)).method287(this.field265.field291, this.field265.field290);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (class247.method4644(Class29.field257.field255, s)) {
            this.field266 = Class284.method5324(class247.method4684(Class29.field257.field255, s));
        }
        System.nanoTime();
        class247.method4702();
        class247.method4640();
        this.field272 = true;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "-109")
    public final void method482() {
        this.field267 = null;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(IIIIIIIIB)V", garbageValue = "-102")
    public final void method483(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final int[] field3766 = Class314.field3766;
        final int field3767 = Class314.field3761;
        final int field3768 = Class314.field3762;
        final int[] array = new int[4];
        Class314.method5722(array);
        final Class17 method518 = this.method518(n, n2, n3, n4);
        final float method519 = this.method492(n7 - n5, n3 - n);
        final int field3769 = (int)Math.ceil(method519);
        this.field276 = field3769;
        if (!this.field269.containsKey(field3769)) {
            final Class35 class35 = new Class35(field3769);
            class35.method592();
            this.field269.put(field3769, class35);
        }
        final Class23[] array2 = new Class23[8];
        for (int i = method518.field132; i < method518.field132 + method518.field131; ++i) {
            for (int j = method518.field134; j < method518.field134 + method518.field133; ++j) {
                this.method485(i, j, array2);
                this.field268[i][j].method290(field3769, (Class35) this.field269.get(field3769), array2, this.field279);
            }
        }
        Class314.method5718(field3766, field3767, field3768);
        Class314.method5723(array);
        final int n9 = (int)(64.0f * method519);
        final int n10 = this.field273 + n;
        final int n11 = n2 + this.field278;
        for (int k = method518.field132; k < method518.field131 + method518.field132; ++k) {
            for (int l = method518.field134; l < method518.field133 + method518.field134; ++l) {
                this.field268[k][l].method314(n5 + n9 * (this.field268[k][l].field191 * 64 - n10) / 64, n8 - n9 * (this.field268[k][l].field192 * 64 - n11 + 64) / 64, n9);
            }
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V", garbageValue = "-1738532416")
    public final void method491(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final HashSet set, final HashSet set2, final int n9, final int n10, final boolean b) {
        final Class17 method518 = this.method518(n, n2, n3, n4);
        final int n11 = (int)(this.method492(n7 - n5, n3 - n) * 64.0f);
        final int n12 = this.field273 + n;
        final int n13 = n2 + this.field278;
        for (int i = method518.field132; i < method518.field132 + method518.field131; ++i) {
            for (int j = method518.field134; j < method518.field134 + method518.field133; ++j) {
                if (b) {
                    this.field268[i][j].method340();
                }
                this.field268[i][j].method382(n5 + n11 * (this.field268[i][j].field191 * 64 - n12) / 64, n8 - n11 * (this.field268[i][j].field192 * 64 - n13 + 64) / 64, n11, set);
            }
        }
        if (set2 != null && n9 > 0) {
            for (int k = method518.field132; k < method518.field132 + method518.field131; ++k) {
                for (int l = method518.field134; l < method518.field133 + method518.field134; ++l) {
                    this.field268[k][l].method311(set2, n9, n10);
                }
            }
        }
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(II[Lh;I)V", garbageValue = "1440038510")
    void method485(final int n, final int n2, final Class23[] array) {
        final boolean b = n <= 0;
        final boolean b2 = n >= this.field268.length - 1;
        final boolean b3 = n2 <= 0;
        final boolean b4 = n2 >= this.field268[0].length - 1;
        if (b4) {
            array[Class240.field3101.vmethod5815()] = null;
        }
        else {
            array[Class240.field3101.vmethod5815()] = this.field268[n][n2 + 1];
        }
        array[Class240.field3107.vmethod5815()] = ((b4 || b2) ? null : this.field268[n + 1][n2 + 1]);
        array[Class240.field3103.vmethod5815()] = ((b4 || b) ? null : this.field268[n - 1][n2 + 1]);
        array[Class240.field3097.vmethod5815()] = (b2 ? null : this.field268[n + 1][n2]);
        array[Class240.field3102.vmethod5815()] = (b ? null : this.field268[n - 1][n2]);
        array[Class240.field3100.vmethod5815()] = (b3 ? null : this.field268[n][n2 - 1]);
        array[Class240.field3099.vmethod5815()] = ((b3 || b2) ? null : this.field268[n + 1][n2 - 1]);
        array[Class240.field3098.vmethod5815()] = ((b3 || b) ? null : this.field268[n - 1][n2 - 1]);
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(IIIILjava/util/HashSet;III)V", garbageValue = "2097379080")
    public void method486(final int n, final int n2, final int n3, final int n4, final HashSet set, final int n5, final int n6) {
        if (this.field266 == null) {
            return;
        }
        this.field266.method5853(n, n2, n3, n4);
        if (n5 <= 0 || n5 % n6 >= n6 / 2) {
            return;
        }
        if (this.field267 == null) {
            this.method505();
        }
        final Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            final List<Class28> list = (List<Class28>) this.field267.get((int)iterator.next());
            if (list == null) {
                continue;
            }
            for (final Class28 class28 : list) {
                Class314.method5784(n3 * (class28.field236.field2564 - this.field273) / this.field274 + n, n4 - (class28.field236.field2565 - this.field278) * n4 / this.field270 + n2, 2, 16776960, 256);
            }
        }
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(IIIIIIIIIII)Ljava/util/List;", garbageValue = "-1764374656")
    public List method487(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        final LinkedList list = new LinkedList();
        if (!this.field272) {
            return list;
        }
        final Class17 method518 = this.method518(n, n2, n3, n4);
        final int n11 = (int)(64.0f * this.method492(n7, n3 - n));
        final int n12 = this.field273 + n;
        final int n13 = n2 + this.field278;
        for (int i = method518.field132; i < method518.field132 + method518.field131; ++i) {
            for (int j = method518.field134; j < method518.field134 + method518.field133; ++j) {
                final List method519 = this.field268[i][j].method319(n5 + n11 * (this.field268[i][j].field191 * 64 - n12) / 64, n8 + n6 - n11 * (this.field268[i][j].field192 * 64 - n13 + 64) / 64, n11, n9, n10);
                if (!method519.isEmpty()) {
                    list.addAll(method519);
                }
            }
        }
        return list;
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(IIIIS)Lt;", garbageValue = "1596")
    Class17 method518(final int n, final int n2, final int n3, final int n4) {
        final Class17 class17 = new Class17(this);
        final int n5 = this.field273 + n;
        final int n6 = n2 + this.field278;
        final int n7 = n3 + this.field273;
        final int n8 = n4 + this.field278;
        final int n9 = n5 / 64;
        final int n10 = n6 / 64;
        final int n11 = n7 / 64;
        final int n12 = n8 / 64;
        class17.field131 = n11 - n9 + 1;
        class17.field133 = n12 - n10 + 1;
        class17.field132 = n9 - this.field265.method258();
        class17.field134 = n10 - this.field265.method247();
        if (class17.field132 < 0) {
            final Class17 class18 = class17;
            class18.field131 += class17.field132;
            class17.field132 = 0;
        }
        if (class17.field132 > this.field268.length - class17.field131) {
            class17.field131 = this.field268.length - class17.field132;
        }
        if (class17.field134 < 0) {
            final Class17 class19 = class17;
            class19.field133 += class17.field134;
            class17.field134 = 0;
        }
        if (class17.field134 > this.field268[0].length - class17.field133) {
            class17.field133 = this.field268[0].length - class17.field134;
        }
        class17.field131 = Math.min(class17.field131, this.field268.length);
        class17.field133 = Math.min(class17.field133, this.field268[0].length);
        return class17;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "-2090974664")
    public boolean method513() {
        return this.field272;
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(B)Ljava/util/HashMap;", garbageValue = "-63")
    public HashMap method489() {
        this.method505();
        return this.field267;
    }
    
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "21")
    void method505() {
        if (this.field267 == null) {
            this.field267 = new HashMap();
        }
        this.field267.clear();
        for (int i = 0; i < this.field268.length; ++i) {
            for (int j = 0; j < this.field268[i].length; ++j) {
                for (final Object class28 : this.field268[i][j].method356()) {
                    if (!this.field267.containsKey(((Class28)class28).field240)) {
                        final LinkedList<Class28> list = new LinkedList<Class28>();
                        list.add(((Class28)class28));
                        this.field267.put(((Class28)class28).field240, list);
                    }
                    else {
                        ((List<Class28>)this.field267.get(((Class28)class28).field240)).add(((Class28)class28));
                    }
                }
            }
        }
    }
    
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "(III)F", garbageValue = "-168004314")
    float method492(final int n, final int n2) {
        final float n3 = n / n2;
        if (n3 > 8.0f) {
            return 8.0f;
        }
        if (n3 < 1.0f) {
            return 1.0f;
        }
        final int round = Math.round(n3);
        if (Math.abs(round - n3) < 0.05f) {
            return round;
        }
        return n3;
    }
    
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "(III)I", garbageValue = "-1780304289")
    static final int method519(final int n, int n2) {
        if (n == -2) {
            return 12345678;
        }
        if (n == -1) {
            if (n2 < 2) {
                n2 = 2;
            }
            else if (n2 > 126) {
                n2 = 126;
            }
            return n2;
        }
        n2 = (n & 0x7F) * n2 / 128;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
    
    @ObfuscatedName("fu")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "-28")
    static void method484() {
        Client.field626.method1978();
        Client.field626.field1219.field2339 = 0;
        Client.field626.field1220 = null;
        Client.field626.field1215 = null;
        Client.field626.field1226 = null;
        Client.field626.field1227 = null;
        Client.field626.field1225 = 0;
        Client.field626.field1228 = 0;
        Client.field598 = 0;
        Client.field771 = 0;
        Client.field716 = false;
        Client.field810 = 0;
        Client.field808 = 0;
        for (int i = 0; i < 2048; ++i) {
            Client.field610[i] = null;
        }
        Class138.field1876 = null;
        for (int j = 0; j < Client.field843.length; ++j) {
            final Class72 class72 = Client.field843[j];
            if (class72 != null) {
                class72.field897 = -1;
                class72.field898 = false;
            }
        }
        Class53.field474 = new Class202(32);
        Class48.method947(30);
        for (int k = 0; k < 100; ++k) {
            Client.field697[k] = true;
        }
        final Class172 method433 = Class26.method433(Class169.field2215, Client.field626.field1218);
        method433.field2257.method3532(Client.field792 ? 2 : 1);
        method433.field2257.method3755(Class82.field1179);
        method433.field2257.method3755(Class243.field3138);
        Client.field626.method1980(method433);
    }
    
    @ObfuscatedName("fk")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-248203091")
    static final void method516() {
        if (Client.field627 > 0) {
            Class97.method2213();
            return;
        }
        Client.field804.method5262();
        Class48.method947(40);
        Class62.field869 = Client.field626.method1983();
        Client.field626.method1984();
    }
    
    @ObfuscatedName("ho")
    @ObfuscatedSignature(signature = "(ZLgi;I)V", garbageValue = "993240466")
    static final void method500(final boolean b, final Class189 class189) {
        while (class189.method3825(Client.field626.field1225) >= 27) {
            final int method3817 = class189.method3817(15);
            if (method3817 == 32767) {
                break;
            }
            boolean b2 = false;
            if (Client.field843[method3817] == null) {
                Client.field843[method3817] = new Class72();
                b2 = true;
            }
            final Class72 class190 = Client.field843[method3817];
            Client.field639[++Client.field622 - 1] = method3817;
            class190.field914 = Client.field591;
            int n;
            if (b) {
                n = class189.method3817(8);
                if (n > 127) {
                    n -= 256;
                }
            }
            else {
                n = class189.method3817(5);
                if (n > 15) {
                    n -= 32;
                }
            }
            final int n2 = Client.field706[class189.method3817(3)];
            if (b2) {
                final Class72 class191 = class190;
                final Class72 class192 = class190;
                final int n3 = n2;
                class192.field905 = n3;
                class191.field926 = n3;
            }
            final int method3818 = class189.method3817(1);
            int n4;
            if (b) {
                n4 = class189.method3817(8);
                if (n4 > 127) {
                    n4 -= 256;
                }
            }
            else {
                n4 = class189.method3817(5);
                if (n4 > 15) {
                    n4 -= 32;
                }
            }
            class190.field1037 = Class270.method5157(class189.method3817(14));
            if (class189.method3817(1) == 1) {
                Client.field666[++Client.field624 - 1] = method3817;
            }
            class190.field874 = class190.field1037.field3497;
            class190.field924 = class190.field1037.field3500;
            if (class190.field924 == 0) {
                class190.field905 = 0;
            }
            class190.field899 = class190.field1037.field3498;
            class190.field880 = class190.field1037.field3495;
            class190.field870 = class190.field1037.field3502;
            class190.field882 = class190.field1037.field3501;
            class190.field893 = class190.field1037.field3519;
            class190.field877 = class190.field1037.field3496;
            class190.field878 = class190.field1037.field3486;
            class190.method1788(Class138.field1876.field922[0] + n, Class138.field1876.field872[0] + n4, method3818 == 1);
        }
        class189.method3816();
    }
}
