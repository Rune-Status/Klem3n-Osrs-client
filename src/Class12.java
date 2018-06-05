import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("n")
public class Class12
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Ln;")
    public static final Class12 field70;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Ln;")
    public static final Class12 field71;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Ln;")
    public static final Class12 field72;
    @ObfuscatedName("l")
    final String field73;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -2147190539)
    final int field79;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 94613509)
    final int field75;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -321383721)
    final int field76;
    
    static {
        field70 = new Class12("SMALL", 0, 0, 4);
        field71 = new Class12("MEDIUM", 2, 1, 2);
        field72 = new Class12("LARGE", 1, 2, 0);
    }
    
    Class12(final String field73, final int field74, final int field75, final int field76) {
        this.field73 = field73;
        this.field79 = field74;
        this.field75 = field75;
        this.field76 = field76;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(FB)Z", garbageValue = "-53")
    boolean method103(final float n) {
        return n >= this.field76;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IB)Ln;", garbageValue = "-15")
    static Class12 method101(final int n) {
        final Class12[] array = { Class12.field72, Class12.field70, Class12.field71 };
        for (int i = 0; i < array.length; ++i) {
            final Class12 class12 = array[i];
            if (n == class12.field75) {
                return class12;
            }
        }
        return null;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lj;III)V", garbageValue = "-442042913")
    static void method104(final Class21 class21, final int n, final int n2) {
        Class23.field189.method4007(class21, RunException.method716(n, n2, 0));
    }
    
    @ObfuscatedName("go")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "65280")
    static final int method108() {
        if (Class10.field61.field960) {
            return Class13.field82;
        }
        int n = 3;
        if (Class7.field41 < 310) {
            int n2;
            int i;
            if (Client.field655 == 1) {
                n2 = Class109.field1428 >> 7;
                i = Class2.field23 >> 7;
            }
            else {
                n2 = Class138.field1876.field931 >> 7;
                i = Class138.field1876.field881 >> 7;
            }
            int j = Class109.field1431 >> 7;
            int n3 = Class226.field2563 >> 7;
            if (j < 0 || n3 < 0 || j >= 104 || n3 >= 104) {
                return Class13.field82;
            }
            if (n2 < 0 || i < 0 || n2 >= 104 || i >= 104) {
                return Class13.field82;
            }
            if ((Class50.field443[Class13.field82][j][n3] & 0x4) != 0x0) {
                n = Class13.field82;
            }
            int n4;
            if (n2 > j) {
                n4 = n2 - j;
            }
            else {
                n4 = j - n2;
            }
            int n5;
            if (i > n3) {
                n5 = i - n3;
            }
            else {
                n5 = n3 - i;
            }
            if (n4 > n5) {
                final int n6 = n5 * 65536 / n4;
                int n7 = 32768;
                while (j != n2) {
                    if (j < n2) {
                        ++j;
                    }
                    else if (j > n2) {
                        --j;
                    }
                    if ((Class50.field443[Class13.field82][j][n3] & 0x4) != 0x0) {
                        n = Class13.field82;
                    }
                    n7 += n6;
                    if (n7 >= 65536) {
                        n7 -= 65536;
                        if (n3 < i) {
                            ++n3;
                        }
                        else if (n3 > i) {
                            --n3;
                        }
                        if ((Class50.field443[Class13.field82][j][n3] & 0x4) == 0x0) {
                            continue;
                        }
                        n = Class13.field82;
                    }
                }
            }
            else if (n5 > 0) {
                final int n8 = n4 * 65536 / n5;
                int n9 = 32768;
                while (i != n3) {
                    if (n3 < i) {
                        ++n3;
                    }
                    else if (n3 > i) {
                        --n3;
                    }
                    if ((Class50.field443[Class13.field82][j][n3] & 0x4) != 0x0) {
                        n = Class13.field82;
                    }
                    n9 += n8;
                    if (n9 >= 65536) {
                        n9 -= 65536;
                        if (j < n2) {
                            ++j;
                        }
                        else if (j > n2) {
                            --j;
                        }
                        if ((Class50.field443[Class13.field82][j][n3] & 0x4) == 0x0) {
                            continue;
                        }
                        n = Class13.field82;
                    }
                }
            }
        }
        if (Class138.field1876.field931 >= 0 && Class138.field1876.field881 >= 0 && Class138.field1876.field931 < 13312 && Class138.field1876.field881 < 13312) {
            if ((Class50.field443[Class13.field82][Class138.field1876.field931 >> 7][Class138.field1876.field881 >> 7] & 0x4) != 0x0) {
                n = Class13.field82;
            }
            return n;
        }
        return Class13.field82;
    }
    
    @ObfuscatedName("ii")
    @ObfuscatedSignature(signature = "([Lhi;IIIIIIII)V", garbageValue = "-1825826206")
    static final void method102(final Class230[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        for (int i = 0; i < array.length; ++i) {
            final Class230 class230 = array[i];
            if (class230 != null) {
                if (!class230.field2604 || class230.field2721 == 0 || class230.field2686 || Class24.method425(class230) != 0 || class230 == Client.field752 || class230.field2609 == 1338) {
                    if (class230.field2605 == n) {
                        if (!class230.field2604 || !Class81.method1885(class230)) {
                            final int n8 = class230.field2618 + n6;
                            final int n9 = n7 + class230.field2619;
                            int n10;
                            int n11;
                            int n12;
                            int n13;
                            if (class230.field2721 == 2) {
                                n10 = n2;
                                n11 = n3;
                                n12 = n4;
                                n13 = n5;
                            }
                            else if (class230.field2721 == 9) {
                                int n14 = n8;
                                int n15 = n9;
                                int n16 = n8 + class230.field2675;
                                int n17 = n9 + class230.field2621;
                                if (n16 < n14) {
                                    final int n18 = n14;
                                    n14 = n16;
                                    n16 = n18;
                                }
                                if (n17 < n15) {
                                    final int n19 = n15;
                                    n15 = n17;
                                    n17 = n19;
                                }
                                ++n16;
                                ++n17;
                                n10 = ((n14 > n2) ? n14 : n2);
                                n11 = ((n15 > n3) ? n15 : n3);
                                n12 = ((n16 < n4) ? n16 : n4);
                                n13 = ((n17 < n5) ? n17 : n5);
                            }
                            else {
                                final int n20 = n8 + class230.field2675;
                                final int n21 = n9 + class230.field2621;
                                n10 = ((n8 > n2) ? n8 : n2);
                                n11 = ((n9 > n3) ? n9 : n3);
                                n12 = ((n20 < n4) ? n20 : n4);
                                n13 = ((n21 < n5) ? n21 : n5);
                            }
                            if (class230 == Client.field583) {
                                Client.field772 = true;
                                Client.field696 = n8;
                                Client.field760 = n9;
                            }
                            if (class230.field2604) {
                                if (n10 >= n12) {
                                    continue;
                                }
                                if (n11 >= n13) {
                                    continue;
                                }
                            }
                            int n22 = Class48.field425;
                            int field428 = Class48.field426 * 673804999;
                            if (Class48.field431 != 0) {
                                n22 = Class48.field432;
                                field428 = Class48.field428;
                            }
                            final boolean b = n22 >= n10 && field428 >= n11 && n22 < n12 && field428 < n13;
                            if (class230.field2609 == 1337) {
                                if (!Client.field625 && !Client.field716 && b) {
                                    if (Client.field733 == 0 && !Client.field785) {
                                        Class50.method993("Walk here", "", 23, 0, n22 - n10, field428 - n11);
                                    }
                                    long n23 = -1L;
                                    long n24 = -1L;
                                    for (int j = 0; j < Class120.field1656; ++j) {
                                        final long method262 = Class20.method262(j);
                                        if (method262 != n24) {
                                            n24 = method262;
                                            final int method263 = Class3.method32(j);
                                            final int method264 = Class27.method435(j);
                                            final int n25 = (int)(Class120.field1647[j] >>> 14 & 0x3L);
                                            final int method265 = Class80.method1864(j);
                                            if (n25 == 2 && Class28.field248.method2902(Class13.field82, method263, method264, method262) >= 0) {
                                                Class268 class231 = Class110.method2527(method265);
                                                if (class231.field3410 != null) {
                                                    class231 = class231.method5056();
                                                }
                                                if (class231 == null) {
                                                    continue;
                                                }
                                                if (Client.field733 == 1) {
                                                    Class50.method993("Use", Client.field734 + " " + "->" + " " + Class6.method71(65535) + class231.field3373, 1, method265, method263, method264);
                                                }
                                                else if (Client.field785) {
                                                    if ((Class63.field932 & 0x4) == 0x4) {
                                                        Class50.method993(Client.field612, Client.field739 + " " + "->" + " " + Class6.method71(65535) + class231.field3373, 2, method265, method263, method264);
                                                    }
                                                }
                                                else {
                                                    final String[] field429 = class231.field3387;
                                                    if (field429 != null) {
                                                        for (int k = 4; k >= 0; --k) {
                                                            if (field429[k] != null) {
                                                                int n26 = 0;
                                                                if (k == 0) {
                                                                    n26 = 3;
                                                                }
                                                                if (k == 1) {
                                                                    n26 = 4;
                                                                }
                                                                if (k == 2) {
                                                                    n26 = 5;
                                                                }
                                                                if (k == 3) {
                                                                    n26 = 6;
                                                                }
                                                                if (k == 4) {
                                                                    n26 = 1001;
                                                                }
                                                                Class50.method993(field429[k], Class6.method71(65535) + class231.field3373, n26, method265, method263, method264);
                                                            }
                                                        }
                                                    }
                                                    Class50.method993("Examine", Class6.method71(65535) + class231.field3373, 1002, class231.field3376, method263, method264);
                                                }
                                            }
                                            if (n25 == 1) {
                                                final Class72 class232 = Client.field843[method265];
                                                if (class232 == null) {
                                                    continue;
                                                }
                                                if (class232.field1037.field3497 == 1 && (class232.field931 & 0x7F) == 0x40 && (class232.field881 & 0x7F) == 0x40) {
                                                    for (int l = 0; l < Client.field622; ++l) {
                                                        final Class72 class233 = Client.field843[Client.field639[l]];
                                                        if (class233 != null && class232 != class233 && class233.field1037.field3497 == 1 && class233.field931 == class232.field931 && class232.field881 == class233.field881) {
                                                            Class28.method474(class233.field1037, Client.field639[l], method263, method264);
                                                        }
                                                    }
                                                    final int field430 = Class81.field1167;
                                                    final int[] field431 = Class81.field1159;
                                                    for (int n27 = 0; n27 < field430; ++n27) {
                                                        final Class60 class234 = Client.field610[field431[n27]];
                                                        if (class234 != null && class234.field931 == class232.field931 && class234.field881 == class232.field881) {
                                                            Class221.method4371(class234, field431[n27], method263, method264);
                                                        }
                                                    }
                                                }
                                                Class28.method474(class232.field1037, method265, method263, method264);
                                            }
                                            if (n25 == 0) {
                                                final Class60 class235 = Client.field610[method265];
                                                if (class235 == null) {
                                                    continue;
                                                }
                                                if ((class235.field931 & 0x7F) == 0x40 && (class235.field881 & 0x7F) == 0x40) {
                                                    for (int n28 = 0; n28 < Client.field622; ++n28) {
                                                        final Class72 class236 = Client.field843[Client.field639[n28]];
                                                        if (class236 != null && class236.field1037.field3497 == 1 && class235.field931 == class236.field931 && class236.field881 == class235.field881) {
                                                            Class28.method474(class236.field1037, Client.field639[n28], method263, method264);
                                                        }
                                                    }
                                                    final int field432 = Class81.field1167;
                                                    final int[] field433 = Class81.field1159;
                                                    for (int n29 = 0; n29 < field432; ++n29) {
                                                        final Class60 class237 = Client.field610[field433[n29]];
                                                        if (class237 != null && class237 != class235 && class235.field931 == class237.field931 && class237.field881 == class235.field881) {
                                                            Class221.method4371(class237, field433[n29], method263, method264);
                                                        }
                                                    }
                                                }
                                                if (method265 != Client.field707) {
                                                    Class221.method4371(class235, method265, method263, method264);
                                                }
                                                else {
                                                    n23 = n24;
                                                }
                                            }
                                            if (n25 == 3) {
                                                final Class205 class238 = Client.field708[Class13.field82][method263][method264];
                                                if (class238 != null) {
                                                    for (Class80 class239 = (Class80)class238.method4083(); class239 != null; class239 = (Class80)class238.method4093()) {
                                                        final Class269 method266 = Class111.method2563(class239.field1151);
                                                        if (Client.field733 == 1) {
                                                            Class50.method993("Use", Client.field734 + " " + "->" + " " + Class6.method71(16748608) + method266.field3433, 16, class239.field1151, method263, method264);
                                                        }
                                                        else if (Client.field785) {
                                                            if ((Class63.field932 & 0x1) == 0x1) {
                                                                Class50.method993(Client.field612, Client.field739 + " " + "->" + " " + Class6.method71(16748608) + method266.field3433, 17, class239.field1151, method263, method264);
                                                            }
                                                        }
                                                        else {
                                                            final String[] field434 = method266.field3447;
                                                            for (int n30 = 4; n30 >= 0; --n30) {
                                                                if (field434 != null && field434[n30] != null) {
                                                                    int n31 = 0;
                                                                    if (n30 == 0) {
                                                                        n31 = 18;
                                                                    }
                                                                    if (n30 == 1) {
                                                                        n31 = 19;
                                                                    }
                                                                    if (n30 == 2) {
                                                                        n31 = 20;
                                                                    }
                                                                    if (n30 == 3) {
                                                                        n31 = 21;
                                                                    }
                                                                    if (n30 == 4) {
                                                                        n31 = 22;
                                                                    }
                                                                    Class50.method993(field434[n30], Class6.method71(16748608) + method266.field3433, n31, class239.field1151, method263, method264);
                                                                }
                                                                else if (n30 == 2) {
                                                                    Class50.method993("Take", Class6.method71(16748608) + method266.field3433, 20, class239.field1151, method263, method264);
                                                                }
                                                            }
                                                            Class50.method993("Examine", Class6.method71(16748608) + method266.field3433, 1004, class239.field1151, method263, method264);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (n23 != -1L) {
                                        Class221.method4371(Client.field610[Client.field707], Client.field707, Class37.method662(n23), Class109.method2484(n23));
                                    }
                                }
                            }
                            else if (class230.field2609 == 1338) {
                                Class36.method632(class230, n8, n9);
                            }
                            else {
                                if (class230.field2609 == 1400) {
                                    Class53.field476.method6003(Class48.field425, Class48.field426 * 673804999, b, n8, n9, class230.field2675, class230.field2621);
                                }
                                if (!Client.field716 && b) {
                                    if (class230.field2609 == 1400) {
                                        Class53.field476.method6158(n8, n9, class230.field2675, class230.field2621, n22, field428);
                                    }
                                    else {
                                        final int n32 = n22 - n8;
                                        final int n33 = field428 - n9;
                                        if (class230.field2709 == 1) {
                                            Class50.method993(class230.field2723, "", 24, 0, 0, class230.field2691);
                                        }
                                        if (class230.field2709 == 2 && !Client.field785) {
                                            final String method267 = Class151.method3239(class230);
                                            if (method267 != null) {
                                                Class50.method993(method267, Class6.method71(65280) + class230.field2722, 25, 0, -1, class230.field2691);
                                            }
                                        }
                                        if (class230.field2709 == 3) {
                                            Class50.method993("Close", "", 26, 0, 0, class230.field2691);
                                        }
                                        if (class230.field2709 == 4) {
                                            Class50.method993(class230.field2723, "", 28, 0, 0, class230.field2691);
                                        }
                                        if (class230.field2709 == 5) {
                                            Class50.method993(class230.field2723, "", 29, 0, 0, class230.field2691);
                                        }
                                        if (class230.field2709 == 6 && Client.field744 == null) {
                                            Class50.method993(class230.field2723, "", 30, 0, -1, class230.field2691);
                                        }
                                        if (class230.field2721 == 2) {
                                            int field435 = 0;
                                            for (int n34 = 0; n34 < class230.field2621; ++n34) {
                                                for (int n35 = 0; n35 < class230.field2675; ++n35) {
                                                    int n36 = n35 * (class230.field2672 + 32);
                                                    int n37 = n34 * (class230.field2673 + 32);
                                                    if (field435 < 20) {
                                                        n36 += class230.field2685[field435];
                                                        n37 += class230.field2738[field435];
                                                    }
                                                    if (n32 >= n36 && n33 >= n37 && n32 < n36 + 32 && n33 < n37 + 32) {
                                                        Client.field691 = field435;
                                                        Class132.field1819 = class230;
                                                        if (class230.field2724[field435] > 0) {
                                                            final Class269 method268 = Class111.method2563(class230.field2724[field435] - 1);
                                                            if (Client.field733 == 1 && Class145.method3188(Class24.method425(class230))) {
                                                                if (class230.field2691 != Class187.field2372 || field435 != Class13.field84) {
                                                                    Class50.method993("Use", Client.field734 + " " + "->" + " " + Class6.method71(16748608) + method268.field3433, 31, method268.field3431, field435, class230.field2691);
                                                                }
                                                            }
                                                            else if (Client.field785 && Class145.method3188(Class24.method425(class230))) {
                                                                if ((Class63.field932 & 0x10) == 0x10) {
                                                                    Class50.method993(Client.field612, Client.field739 + " " + "->" + " " + Class6.method71(16748608) + method268.field3433, 32, method268.field3431, field435, class230.field2691);
                                                                }
                                                            }
                                                            else {
                                                                final String[] field436 = method268.field3425;
                                                                int method269 = -1;
                                                                if (Client.field726 && (Client.field727 || Class39.field341[81])) {
                                                                    method269 = method268.method5101();
                                                                }
                                                                if (Class145.method3188(Class24.method425(class230))) {
                                                                    for (int n38 = 4; n38 >= 3; --n38) {
                                                                        if (method269 != n38) {
                                                                            Class56.method1027(class230, method268, field435, n38, false);
                                                                        }
                                                                    }
                                                                }
                                                                if (Class148.method3197(Class24.method425(class230))) {
                                                                    Class50.method993("Use", Class6.method71(16748608) + method268.field3433, 38, method268.field3431, field435, class230.field2691);
                                                                }
                                                                if (Class145.method3188(Class24.method425(class230))) {
                                                                    for (int n39 = 2; n39 >= 0; --n39) {
                                                                        if (n39 != method269) {
                                                                            Class56.method1027(class230, method268, field435, n39, false);
                                                                        }
                                                                    }
                                                                    if (method269 >= 0) {
                                                                        Class56.method1027(class230, method268, field435, method269, true);
                                                                    }
                                                                }
                                                                final String[] field437 = class230.field2677;
                                                                if (field437 != null) {
                                                                    for (int n40 = 4; n40 >= 0; --n40) {
                                                                        if (field437[n40] != null) {
                                                                            int n41 = 0;
                                                                            if (n40 == 0) {
                                                                                n41 = 39;
                                                                            }
                                                                            if (n40 == 1) {
                                                                                n41 = 40;
                                                                            }
                                                                            if (n40 == 2) {
                                                                                n41 = 41;
                                                                            }
                                                                            if (n40 == 3) {
                                                                                n41 = 42;
                                                                            }
                                                                            if (n40 == 4) {
                                                                                n41 = 43;
                                                                            }
                                                                            Class50.method993(field437[n40], Class6.method71(16748608) + method268.field3433, n41, method268.field3431, field435, class230.field2691);
                                                                        }
                                                                    }
                                                                }
                                                                Class50.method993("Examine", Class6.method71(16748608) + method268.field3433, 1005, method268.field3431, field435, class230.field2691);
                                                            }
                                                        }
                                                    }
                                                    ++field435;
                                                }
                                            }
                                        }
                                        if (class230.field2604) {
                                            if (Client.field785) {
                                                if ((Class24.method425(class230) >> 21 & 0x1) != 0x0 && (Class63.field932 & 0x20) == 0x20) {
                                                    Class50.method993(Client.field612, Client.field739 + " " + "->" + " " + class230.field2679, 58, 0, class230.field2606, class230.field2691);
                                                }
                                            }
                                            else {
                                                for (int n42 = 9; n42 >= 5; --n42) {
                                                    final String method270 = Class112.method2565(class230, n42);
                                                    if (method270 != null) {
                                                        Class50.method993(method270, class230.field2679, 1007, n42 + 1, class230.field2606, class230.field2691);
                                                    }
                                                }
                                                final String method271 = Class151.method3239(class230);
                                                if (method271 != null) {
                                                    Class50.method993(method271, class230.field2679, 25, 0, class230.field2606, class230.field2691);
                                                }
                                                for (int n43 = 4; n43 >= 0; --n43) {
                                                    final String method272 = Class112.method2565(class230, n43);
                                                    if (method272 != null) {
                                                        Class50.method993(method272, class230.field2679, 57, n43 + 1, class230.field2606, class230.field2691);
                                                    }
                                                }
                                                if ((Class24.method425(class230) & 0x1) != 0x0) {
                                                    Class50.method993("Continue", "", 30, 0, class230.field2606, class230.field2691);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (class230.field2721 == 0) {
                                    if (!class230.field2604 && Class81.method1885(class230) && class230 != Class143.field1897) {
                                        continue;
                                    }
                                    method102(array, class230.field2691, n10, n11, n12, n13, n8 - class230.field2626, n9 - class230.field2663);
                                    if (class230.field2736 != null) {
                                        method102(class230.field2736, class230.field2691, n10, n11, n12, n13, n8 - class230.field2626, n9 - class230.field2663);
                                    }
                                    final Class55 class240 = (Class55)Client.field741.method4020(class230.field2691);
                                    if (class240 != null) {
                                        if (class240.field494 == 0 && Class48.field425 >= n10 && Class48.field426 * 673804999 >= n11 && Class48.field425 < n12 && Class48.field426 * 673804999 < n13 && !Client.field716) {
                                            for (Class56 class241 = (Class56)Client.field638.method4098(); class241 != null; class241 = (Class56)Client.field638.method4079()) {
                                                if (class241.field505) {
                                                    class241.method4064();
                                                    class241.field506.field2731 = false;
                                                }
                                            }
                                            if (Class6.field39 == 0) {
                                                Client.field583 = null;
                                                Client.field752 = null;
                                            }
                                            if (!Client.field716) {
                                                Class59.method1077();
                                            }
                                        }
                                        final int field438 = class240.field501;
                                        if (Class261.method4931(field438)) {
                                            method102(Class42.field366[field438], -1, n10, n11, n12, n13, n8, n9);
                                        }
                                    }
                                }
                                if (class230.field2604) {
                                    if (class230.field2648) {
                                        if (Class48.field425 >= n10 && Class48.field426 * 673804999 >= n11 && Class48.field425 < n12 && Class48.field426 * 673804999 < n13) {
                                            for (Class56 class242 = (Class56)Client.field638.method4098(); class242 != null; class242 = (Class56)Client.field638.method4079()) {
                                                if (class242.field505) {
                                                    class242.method4064();
                                                    class242.field506.field2731 = false;
                                                }
                                            }
                                            if (Class6.field39 == 0) {
                                                Client.field583 = null;
                                                Client.field752 = null;
                                            }
                                            if (!Client.field716) {
                                                Class59.method1077();
                                            }
                                        }
                                    }
                                    else if (class230.field2740 && Class48.field425 >= n10 && Class48.field426 * 673804999 >= n11 && Class48.field425 < n12 && Class48.field426 * 673804999 < n13) {
                                        for (Class56 class243 = (Class56)Client.field638.method4098(); class243 != null; class243 = (Class56)Client.field638.method4079()) {
                                            if (class243.field505 && class243.field506.field2707 == class243.field512) {
                                                class243.method4064();
                                            }
                                        }
                                    }
                                    int n44;
                                    if (Class48.field425 >= n10 && Class48.field426 * 673804999 >= n11 && Class48.field425 < n12 && Class48.field426 * 673804999 < n13) {
                                        n44 = 1;
                                    }
                                    else {
                                        n44 = 0;
                                    }
                                    int n45 = 0;
                                    if ((Class48.field419 == 1 || (!Class253.field3229 && Class48.field419 == 4)) && n44 != 0) {
                                        n45 = 1;
                                    }
                                    int n46 = 0;
                                    if ((Class48.field431 == 1 || (!Class253.field3229 && Class48.field431 == 4)) && Class48.field432 >= n10 && Class48.field428 >= n11 && Class48.field432 < n12 && Class48.field428 < n13) {
                                        n46 = 1;
                                    }
                                    if (n46 != 0) {
                                        Class169.method3447(class230, Class48.field432 - n8, Class48.field428 - n9);
                                    }
                                    if (class230.field2609 == 1400) {
                                        Class53.field476.method6174(n22, field428, (n44 & n45) != 0x0, (n44 & n46) != 0x0);
                                    }
                                    if (Client.field583 != null && class230 != Client.field583 && n44 != 0 && (Class24.method425(class230) >> 20 & 0x1) != 0x0) {
                                        Client.field755 = class230;
                                    }
                                    if (class230 == Client.field752) {
                                        Client.field601 = true;
                                        Client.field757 = n8;
                                        Client.field758 = n9;
                                    }
                                    if (class230.field2686) {
                                        if (n44 != 0 && Client.field695 != 0 && class230.field2707 != null) {
                                            final Class56 class244 = new Class56();
                                            class244.field505 = true;
                                            class244.field506 = class230;
                                            class244.field508 = Client.field695;
                                            class244.field512 = class230.field2707;
                                            Client.field638.method4073(class244);
                                        }
                                        if (Client.field583 != null || Class276.field3559 != null || Client.field716) {
                                            n46 = 0;
                                            n45 = 0;
                                            n44 = 0;
                                        }
                                        if (!class230.field2674 && n46 != 0) {
                                            class230.field2674 = true;
                                            if (class230.field2688 != null) {
                                                final Class56 class245 = new Class56();
                                                class245.field505 = true;
                                                class245.field506 = class230;
                                                class245.field511 = Class48.field432 - n8;
                                                class245.field508 = Class48.field428 - n9;
                                                class245.field512 = class230.field2688;
                                                Client.field638.method4073(class245);
                                            }
                                        }
                                        if (class230.field2674 && n45 != 0 && class230.field2689 != null) {
                                            final Class56 class246 = new Class56();
                                            class246.field505 = true;
                                            class246.field506 = class230;
                                            class246.field511 = Class48.field425 - n8;
                                            class246.field508 = Class48.field426 * 673804999 - n9;
                                            class246.field512 = class230.field2689;
                                            Client.field638.method4073(class246);
                                        }
                                        if (class230.field2674 && n45 == 0) {
                                            class230.field2674 = false;
                                            if (class230.field2690 != null) {
                                                final Class56 class247 = new Class56();
                                                class247.field505 = true;
                                                class247.field506 = class230;
                                                class247.field511 = Class48.field425 - n8;
                                                class247.field508 = Class48.field426 * 673804999 - n9;
                                                class247.field512 = class230.field2690;
                                                Client.field779.method4073(class247);
                                            }
                                        }
                                        if (n45 != 0 && class230.field2614 != null) {
                                            final Class56 class248 = new Class56();
                                            class248.field505 = true;
                                            class248.field506 = class230;
                                            class248.field511 = Class48.field425 - n8;
                                            class248.field508 = Class48.field426 * 673804999 - n9;
                                            class248.field512 = class230.field2614;
                                            Client.field638.method4073(class248);
                                        }
                                        if (!class230.field2731 && n44 != 0) {
                                            class230.field2731 = true;
                                            if (class230.field2692 != null) {
                                                final Class56 class249 = new Class56();
                                                class249.field505 = true;
                                                class249.field506 = class230;
                                                class249.field511 = Class48.field425 - n8;
                                                class249.field508 = Class48.field426 * 673804999 - n9;
                                                class249.field512 = class230.field2692;
                                                Client.field638.method4073(class249);
                                            }
                                        }
                                        if (class230.field2731 && n44 != 0 && class230.field2594 != null) {
                                            final Class56 class250 = new Class56();
                                            class250.field505 = true;
                                            class250.field506 = class230;
                                            class250.field511 = Class48.field425 - n8;
                                            class250.field508 = Class48.field426 * 673804999 - n9;
                                            class250.field512 = class230.field2594;
                                            Client.field638.method4073(class250);
                                        }
                                        if (class230.field2731 && n44 == 0) {
                                            class230.field2731 = false;
                                            if (class230.field2694 != null) {
                                                final Class56 class251 = new Class56();
                                                class251.field505 = true;
                                                class251.field506 = class230;
                                                class251.field511 = Class48.field425 - n8;
                                                class251.field508 = Class48.field426 * 673804999 - n9;
                                                class251.field512 = class230.field2694;
                                                Client.field779.method4073(class251);
                                            }
                                        }
                                        if (class230.field2705 != null) {
                                            final Class56 class252 = new Class56();
                                            class252.field506 = class230;
                                            class252.field512 = class230.field2705;
                                            Client.field778.method4073(class252);
                                        }
                                        if (class230.field2699 != null && Client.field765 > class230.field2683) {
                                            Label_3172: {
                                                if (class230.field2700 == null || Client.field765 - class230.field2683 > 32) {
                                                    final Class56 class253 = new Class56();
                                                    class253.field506 = class230;
                                                    class253.field512 = class230.field2699;
                                                    Client.field638.method4073(class253);
                                                }
                                                else {
                                                    for (int field439 = class230.field2683; field439 < Client.field765; ++field439) {
                                                        final int n47 = Client.field764[field439 & 0x1F];
                                                        for (int n48 = 0; n48 < class230.field2700.length; ++n48) {
                                                            if (n47 == class230.field2700[n48]) {
                                                                final Class56 class254 = new Class56();
                                                                class254.field506 = class230;
                                                                class254.field512 = class230.field2699;
                                                                Client.field638.method4073(class254);
                                                                break Label_3172;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            class230.field2683 = Client.field765;
                                        }
                                        if (class230.field2670 != null && Client.field767 > class230.field2735) {
                                            Label_3217: {
                                                if (class230.field2733 != null && Client.field767 - class230.field2735 <= 32) {
                                                    for (int field440 = class230.field2735; field440 < Client.field767; ++field440) {
                                                        final int n49 = Client.field766[field440 & 0x1F];
                                                        for (int n50 = 0; n50 < class230.field2733.length; ++n50) {
                                                            if (n49 == class230.field2733[n50]) {
                                                                final Class56 class255 = new Class56();
                                                                class255.field506 = class230;
                                                                class255.field512 = class230.field2670;
                                                                Client.field638.method4073(class255);
                                                                break Label_3217;
                                                            }
                                                        }
                                                    }
                                                }
                                                else {
                                                    final Class56 class256 = new Class56();
                                                    class256.field506 = class230;
                                                    class256.field512 = class230.field2670;
                                                    Client.field638.method4073(class256);
                                                }
                                            }
                                            class230.field2735 = Client.field767;
                                        }
                                        if (class230.field2703 != null && Client.field769 > class230.field2702) {
                                            Label_3309: {
                                                if (class230.field2635 == null || Client.field769 - class230.field2702 > 32) {
                                                    final Class56 class257 = new Class56();
                                                    class257.field506 = class230;
                                                    class257.field512 = class230.field2703;
                                                    Client.field638.method4073(class257);
                                                }
                                                else {
                                                    for (int field441 = class230.field2702; field441 < Client.field769; ++field441) {
                                                        final int n51 = Client.field690[field441 & 0x1F];
                                                        for (int n52 = 0; n52 < class230.field2635.length; ++n52) {
                                                            if (n51 == class230.field2635[n52]) {
                                                                final Class56 class258 = new Class56();
                                                                class258.field506 = class230;
                                                                class258.field512 = class230.field2703;
                                                                Client.field638.method4073(class258);
                                                                break Label_3309;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            class230.field2702 = Client.field769;
                                        }
                                        if (Client.field770 > class230.field2697 && class230.field2708 != null) {
                                            final Class56 class259 = new Class56();
                                            class259.field506 = class230;
                                            class259.field512 = class230.field2708;
                                            Client.field638.method4073(class259);
                                        }
                                        if (Client.field647 > class230.field2697 && class230.field2718 != null) {
                                            final Class56 class260 = new Class56();
                                            class260.field506 = class230;
                                            class260.field512 = class230.field2718;
                                            Client.field638.method4073(class260);
                                        }
                                        if (Client.field828 > class230.field2697 && class230.field2711 != null) {
                                            final Class56 class261 = new Class56();
                                            class261.field506 = class230;
                                            class261.field512 = class230.field2711;
                                            Client.field638.method4073(class261);
                                        }
                                        if (Client.field793 > class230.field2697 && class230.field2716 != null) {
                                            final Class56 class262 = new Class56();
                                            class262.field506 = class230;
                                            class262.field512 = class230.field2716;
                                            Client.field638.method4073(class262);
                                        }
                                        if (Client.field774 > class230.field2697 && class230.field2693 != null) {
                                            final Class56 class263 = new Class56();
                                            class263.field506 = class230;
                                            class263.field512 = class230.field2693;
                                            Client.field638.method4073(class263);
                                        }
                                        if (Client.field775 > class230.field2697 && class230.field2712 != null) {
                                            final Class56 class264 = new Class56();
                                            class264.field506 = class230;
                                            class264.field512 = class230.field2712;
                                            Client.field638.method4073(class264);
                                        }
                                        class230.field2697 = Client.field801;
                                        if (class230.field2637 != null) {
                                            for (int n53 = 0; n53 < Client.field799; ++n53) {
                                                final Class56 class265 = new Class56();
                                                class265.field506 = class230;
                                                class265.field509 = Client.field773[n53];
                                                class265.field513 = Client.field800[n53];
                                                class265.field512 = class230.field2637;
                                                Client.field638.method4073(class265);
                                            }
                                        }
                                    }
                                }
                                if (!class230.field2604 && Client.field583 == null && Class276.field3559 == null) {
                                    if (!Client.field716) {
                                        if ((class230.field2713 >= 0 || class230.field2632 != 0) && (Class48.field425 >= n10 && Class48.field426 * 673804999 >= n11 && Class48.field425 < n12 && Class48.field426 * 673804999 < n13)) {
                                            if (class230.field2713 >= 0) {
                                                Class143.field1897 = array[class230.field2713];
                                            }
                                            else {
                                                Class143.field1897 = class230;
                                            }
                                        }
                                        if (class230.field2721 == 8 && Class48.field425 >= n10 && Class48.field426 * 673804999 >= n11 && Class48.field425 < n12 && Class48.field426 * 673804999 < n13) {
                                            Class141.field1888 = class230;
                                        }
                                        if (class230.field2629 > class230.field2621) {
                                            final int n54 = n8 + class230.field2675;
                                            final int field442 = class230.field2621;
                                            final int field443 = class230.field2629;
                                            final int field444 = Class48.field425;
                                            final int n55 = Class48.field426 * 673804999;
                                            if (Client.field746) {
                                                Client.field660 = 32;
                                            }
                                            else {
                                                Client.field660 = 0;
                                            }
                                            Client.field746 = false;
                                            if (Class48.field419 == 1 || (!Class253.field3229 && Class48.field419 == 4)) {
                                                if (field444 >= n54 && field444 < n54 + 16 && n55 >= n9 && n55 < n9 + 16) {
                                                    final Class230 class266 = class230;
                                                    class266.field2663 -= 4;
                                                    Class60.method1114(class230);
                                                }
                                                else if (field444 >= n54 && field444 < n54 + 16 && n55 >= n9 + field442 - 16 && n55 < n9 + field442) {
                                                    final Class230 class267 = class230;
                                                    class267.field2663 += 4;
                                                    Class60.method1114(class230);
                                                }
                                                else if (field444 >= n54 - Client.field660 && field444 < n54 + Client.field660 + 16 && n55 >= n9 + 16 && n55 < n9 + field442 - 16) {
                                                    int n56 = field442 * (field442 - 32) / field443;
                                                    if (n56 < 8) {
                                                        n56 = 8;
                                                    }
                                                    class230.field2663 = (n55 - n9 - 16 - n56 / 2) * (field443 - field442) / (field442 - 32 - n56);
                                                    Class60.method1114(class230);
                                                    Client.field746 = true;
                                                }
                                            }
                                            if (Client.field695 != 0 && field444 >= n54 - class230.field2675 && n55 >= n9 && field444 < n54 + 16 && n55 <= field442 + n9) {
                                                final Class230 class268 = class230;
                                                class268.field2663 += Client.field695 * 45;
                                                Class60.method1114(class230);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    @ObfuscatedName("jw")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)V", garbageValue = "1351336355")
    static final void method110(final String s) {
        if (s.equals("")) {
            return;
        }
        final Class172 method433 = Class26.method433(Class169.field2153, Client.field626.field1218);
        method433.field2257.method3532(Class316.method5820(s));
        method433.field2257.method3699(s);
        Client.field626.method1980(method433);
    }
}
