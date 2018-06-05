import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("a")
public class Class20
{
    @ObfuscatedName("t")
    @ObfuscatedGetter(intValue = 589485321)
    static int field172;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -569300431)
    int field170;
    @ObfuscatedName("w")
    String field161;
    @ObfuscatedName("s")
    String field171;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 332294683)
    int field163;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -851588879)
    int field164;
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "Lha;")
    Class226 field165;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -1049310257)
    int field166;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 1487084263)
    int field167;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = -1973252047)
    int field168;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -1303313193)
    int field162;
    @ObfuscatedName("p")
    boolean field173;
    @ObfuscatedName("b")
    LinkedList field160;
    
    public Class20() {
        this.field170 = -1;
        this.field163 = -1;
        this.field164 = -1;
        this.field165 = null;
        this.field166 = Integer.MAX_VALUE;
        this.field167 = 0;
        this.field168 = Integer.MAX_VALUE;
        this.field162 = 0;
        this.field173 = false;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lgk;II)V", garbageValue = "1965636190")
    public void method200(final Class182 class182, final int field170) {
        this.field170 = field170;
        this.field161 = class182.method3738();
        this.field171 = class182.method3738();
        this.field165 = new Class226(class182.method3671());
        this.field163 = class182.method3671();
        class182.method3544();
        this.field173 = (class182.method3544() == 1);
        this.field164 = class182.method3544();
        final int method3544 = class182.method3544();
        this.field160 = new LinkedList();
        for (int i = 0; i < method3544; ++i) {
            this.field160.add(this.method201(class182));
        }
        this.method206();
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lgk;I)Las;", garbageValue = "2074726298")
    Class31 method201(final Class182 class182) {
        Class31 class183 = null;
        switch (((Class15)Class76.method1803(Class15.method145(), class182.method3544())).field110) {
            default: {
                throw new IllegalStateException("");
            }
            case 1: {
                class183 = new Class37();
                break;
            }
            case 3: {
                class183 = new Class27();
                break;
            }
            case 2: {
                class183 = new Class18();
                break;
            }
            case 0: {
                class183 = new Class14();
                break;
            }
        }
        class183.vmethod639(class182);
        return class183;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(IIIB)Z", garbageValue = "8")
    public boolean method202(final int n, final int n2, final int n3) {
        final Iterator iterator = this.field160.iterator();
        while (iterator.hasNext()) {
            if (((Class31) iterator.next()).vmethod636(n, n2, n3)) {
                return true;
            }
        }
        return false;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(III)Z", garbageValue = "1006376583")
    public boolean method203(final int n, final int n2) {
        final int n3 = n / 64;
        final int n4 = n2 / 64;
        if (n3 < this.field166 || n3 > this.field167) {
            return false;
        }
        if (n4 >= this.field168 && n4 <= this.field162) {
            final Iterator iterator = this.field160.iterator();
            while (iterator.hasNext()) {
                if (((Class31) iterator.next()).vmethod637(n, n2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(IIIB)[I", garbageValue = "-19")
    public int[] method213(final int n, final int n2, final int n3) {
        for (final Object class31 : this.field160) {
            if (((Class31) class31).vmethod636(n, n2, n3)) {
                return ((Class31) class31).vmethod638(n, n2, n3);
            }
        }
        return null;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(III)Lha;", garbageValue = "-2056689977")
    public Class226 method205(final int n, final int n2) {
        for (final Object class31 : this.field160) {
            if (((Class31) class31).vmethod637(n, n2)) {
                return ((Class31) class31).vmethod659(n, n2);
            }
        }
        return null;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1897199586")
    void method206() {
        final Iterator iterator = this.field160.iterator();
        while (iterator.hasNext()) {
            ((Class31) iterator.next()).vmethod635(this);
        }
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "-31")
    public int method207() {
        return this.field170;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(B)Z", garbageValue = "-8")
    public boolean method208() {
        return this.field173;
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(I)Ljava/lang/String;", garbageValue = "210931606")
    public String method209() {
        return this.field161;
    }
    
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "(I)Ljava/lang/String;", garbageValue = "-1948906738")
    public String method210() {
        return this.field171;
    }
    
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "118")
    int method211() {
        return this.field163;
    }
    
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "57")
    public int method212() {
        return this.field164;
    }
    
    @ObfuscatedName("g")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-162318051")
    public int method258() {
        return this.field166;
    }
    
    @ObfuscatedName("m")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-2125416250")
    public int method214() {
        return this.field167;
    }
    
    @ObfuscatedName("r")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "308300610")
    public int method247() {
        return this.field168;
    }
    
    @ObfuscatedName("t")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "255269420")
    public int method249() {
        return this.field162;
    }
    
    @ObfuscatedName("o")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-1363563177")
    public int method217() {
        return this.field165.field2564;
    }
    
    @ObfuscatedName("y")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "825438900")
    public int method218() {
        return this.field165.field2567;
    }
    
    @ObfuscatedName("a")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "-108")
    public int method219() {
        return this.field165.field2565;
    }
    
    @ObfuscatedName("c")
    @ObfuscatedSignature(signature = "(I)Lha;", garbageValue = "-1421911827")
    public Class226 method256() {
        return new Class226(this.field165);
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(B)[Liz;", garbageValue = "-4")
    public static Class242[] method216() {
        return new Class242[] { Class242.field3125, Class242.field3118, Class242.field3121, Class242.field3120, Class242.field3122, Class242.field3119 };
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(II)J", garbageValue = "-1525705371")
    public static long method262(final int n) {
        return Class120.field1647[n];
    }
    
    @ObfuscatedName("gd")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "-2118827798")
    static boolean method260() {
        return (Client.field658 & 0x4) != 0x0;
    }
    
    @ObfuscatedName("jt")
    @ObfuscatedSignature(signature = "(Lbj;ZI)V", garbageValue = "1846472560")
    static final void method261(final Class55 class55, final boolean b) {
        final int field501 = class55.field501;
        final int n = (int)class55.field2421;
        class55.method4064();
        if (b) {
            Class66.method1622(field501);
        }
        Class130.method3077(field501);
        final Class230 method434 = Class26.method434(n);
        if (method434 != null) {
            Class60.method1114(method434);
        }
        Class170.method3448();
        if (Client.field683 != -1) {
            final int field502 = Client.field683;
            if (Class261.method4931(field502)) {
                Class83.method1923(Class42.field366[field502], 1);
            }
        }
    }
}
