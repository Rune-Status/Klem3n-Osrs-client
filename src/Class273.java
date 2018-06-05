import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("jn")
public class Class273 extends Class206
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    public static Class247 field3538;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lir;")
    public static Class247 field3536;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lir;")
    public static Class247 field3537;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lgj;")
    public static Class200 field3552;
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "Lgj;")
    public static Class200 field3539;
    @ObfuscatedName("q")
    public int[] field3540;
    @ObfuscatedName("k")
    int[] field3542;
    @ObfuscatedName("i")
    public int[] field3541;
    @ObfuscatedName("x")
    public int[] field3543;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 375095033)
    public int field3544;
    @ObfuscatedName("p")
    int[] field3545;
    @ObfuscatedName("b")
    public boolean field3546;
    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = -2125188827)
    public int field3547;
    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = 1256278085)
    public int field3548;
    @ObfuscatedName("g")
    @ObfuscatedGetter(intValue = -185139073)
    public int field3549;
    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = -2058553279)
    public int field3550;
    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 1744953403)
    public int field3551;
    @ObfuscatedName("t")
    @ObfuscatedGetter(intValue = 1087712135)
    public int field3535;
    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = -1665152249)
    public int field3553;
    
    static {
        Class273.field3552 = new Class200(64);
        Class273.field3539 = new Class200(100);
    }
    
    Class273() {
        this.field3544 = -1;
        this.field3546 = false;
        this.field3547 = 5;
        this.field3548 = -1;
        this.field3549 = -1;
        this.field3550 = 99;
        this.field3551 = -1;
        this.field3535 = -1;
        this.field3553 = 2;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lgk;I)V", garbageValue = "243481336")
    void method5212(final Class182 class182) {
        while (true) {
            final int method3544 = class182.method3544();
            if (method3544 == 0) {
                break;
            }
            this.method5213(class182, method3544);
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgk;IB)V", garbageValue = "39")
    void method5213(final Class182 class182, final int n) {
        if (n == 1) {
            final int method3550 = class182.method3550();
            this.field3541 = new int[method3550];
            for (int i = 0; i < method3550; ++i) {
                this.field3541[i] = class182.method3550();
            }
            this.field3540 = new int[method3550];
            for (int j = 0; j < method3550; ++j) {
                this.field3540[j] = class182.method3550();
            }
            for (int k = 0; k < method3550; ++k) {
                this.field3540[k] += class182.method3550() << 16;
            }
        }
        else if (n == 2) {
            this.field3544 = class182.method3550();
        }
        else if (n == 3) {
            final int method3551 = class182.method3544();
            this.field3545 = new int[method3551 + 1];
            for (int l = 0; l < method3551; ++l) {
                this.field3545[l] = class182.method3544();
            }
            this.field3545[method3551] = 9999999;
        }
        else if (n == 4) {
            this.field3546 = true;
        }
        else if (n == 5) {
            this.field3547 = class182.method3544();
        }
        else if (n == 6) {
            this.field3548 = class182.method3550();
        }
        else if (n == 7) {
            this.field3549 = class182.method3550();
        }
        else if (n == 8) {
            this.field3550 = class182.method3544();
        }
        else if (n == 9) {
            this.field3551 = class182.method3544();
        }
        else if (n == 10) {
            this.field3535 = class182.method3544();
        }
        else if (n == 11) {
            this.field3553 = class182.method3544();
        }
        else if (n == 12) {
            final int method3552 = class182.method3544();
            this.field3542 = new int[method3552];
            for (int n2 = 0; n2 < method3552; ++n2) {
                this.field3542[n2] = class182.method3550();
            }
            for (int n3 = 0; n3 < method3552; ++n3) {
                this.field3542[n3] += class182.method3550() << 16;
            }
        }
        else if (n == 13) {
            final int method3553 = class182.method3544();
            this.field3543 = new int[method3553];
            for (int n4 = 0; n4 < method3553; ++n4) {
                this.field3543[n4] = class182.method3552();
            }
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1055944735")
    void method5220() {
        if (this.field3551 == -1) {
            if (this.field3545 != null) {
                this.field3551 = 2;
            }
            else {
                this.field3551 = 0;
            }
        }
        if (this.field3535 == -1) {
            if (this.field3545 != null) {
                this.field3535 = 2;
            }
            else {
                this.field3535 = 0;
            }
        }
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(Ldc;II)Ldc;", garbageValue = "-1433585529")
    public Class119 method5215(final Class119 class119, int n) {
        n = this.field3540[n];
        final Class130 method198 = Class19.method198(n >> 16);
        n &= 0xFFFF;
        if (method198 == null) {
            return class119.method2666(true);
        }
        final Class119 method199 = class119.method2666(!method198.method3075(n));
        method199.method2724(method198, n);
        return method199;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(Ldc;III)Ldc;", garbageValue = "416381559")
    Class119 method5216(final Class119 class119, int n, int n2) {
        n = this.field3540[n];
        final Class130 method198 = Class19.method198(n >> 16);
        n &= 0xFFFF;
        if (method198 == null) {
            return class119.method2666(true);
        }
        final Class119 method199 = class119.method2666(!method198.method3075(n));
        n2 &= 0x3;
        if (n2 == 1) {
            method199.method2679();
        }
        else if (n2 == 2) {
            method199.method2678();
        }
        else if (n2 == 3) {
            method199.method2677();
        }
        method199.method2724(method198, n);
        if (n2 == 1) {
            method199.method2677();
        }
        else if (n2 == 2) {
            method199.method2678();
        }
        else if (n2 == 3) {
            method199.method2679();
        }
        return method199;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(Ldc;IB)Ldc;", garbageValue = "43")
    Class119 method5217(final Class119 class119, int n) {
        n = this.field3540[n];
        final Class130 method198 = Class19.method198(n >> 16);
        n &= 0xFFFF;
        if (method198 == null) {
            return class119.method2667(true);
        }
        final Class119 method199 = class119.method2667(!method198.method3075(n));
        method199.method2724(method198, n);
        return method199;
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(Ldc;ILjn;II)Ldc;", garbageValue = "1488793247")
    public Class119 method5221(final Class119 class119, int n, final Class273 class120, int n2) {
        n = this.field3540[n];
        final Class130 method198 = Class19.method198(n >> 16);
        n &= 0xFFFF;
        if (method198 == null) {
            return class120.method5215(class119, n2);
        }
        n2 = class120.field3540[n2];
        final Class130 method199 = Class19.method198(n2 >> 16);
        n2 &= 0xFFFF;
        if (method199 == null) {
            final Class119 method200 = class119.method2666(!method198.method3075(n));
            method200.method2724(method198, n);
            return method200;
        }
        final Class119 method201 = class119.method2666(!method198.method3075(n) & !method199.method3075(n2));
        method201.method2745(method198, n, method199, n2, this.field3545);
        return method201;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(Ldc;II)Ldc;", garbageValue = "1136380155")
    public Class119 method5219(final Class119 class119, final int n) {
        final int n2 = this.field3540[n];
        final Class130 method198 = Class19.method198(n2 >> 16);
        final int n3 = n2 & 0xFFFF;
        if (method198 == null) {
            return class119.method2666(true);
        }
        Class130 method199 = null;
        int n4 = 0;
        if (this.field3542 != null && n < this.field3542.length) {
            final int n5 = this.field3542[n];
            method199 = Class19.method198(n5 >> 16);
            n4 = (n5 & 0xFFFF);
        }
        if (method199 == null || n4 == 65535) {
            final Class119 method200 = class119.method2666(!method198.method3075(n3));
            method200.method2724(method198, n3);
            return method200;
        }
        final Class119 method201 = class119.method2666(!method198.method3075(n3) & !method199.method3075(n4));
        method201.method2724(method198, n3);
        method201.method2724(method199, n4);
        return method201;
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(Lkj;Lkj;Lkj;ZI)V", garbageValue = "1837948515")
    static void method5227(final Class298 class298, final Class298 class299, final Class298 class300, final boolean b) {
        if (b) {
            Class78.field1082 = (Class82.field1179 - 765) / 2;
            Class78.field1090 = Class78.field1082 + 202;
            Class78.field1091 = Class78.field1090 + 180;
        }
        if (Class78.field1107) {
            if (Class166.field2047 == null) {
                Class166.field2047 = Class21.method279(Class175.field2270, "sl_back", "");
            }
            if (Class13.field85 == null) {
                Class13.field85 = Class13.method113(Class175.field2270, "sl_flags", "");
            }
            if (Class126.field1779 == null) {
                Class126.field1779 = Class13.method113(Class175.field2270, "sl_arrows", "");
            }
            if (Class28.field237 == null) {
                Class28.field237 = Class13.method113(Class175.field2270, "sl_stars", "");
            }
            Class314.method5763(Class78.field1082, 23, 765, 480, 0);
            Class314.method5748(Class78.field1082, 0, 125, 23, 12425273, 9135624);
            Class314.method5748(Class78.field1082 + 125, 0, 640, 23, 5197647, 2697513);
            class298.method5525("Select a world", Class78.field1082 + 62, 15, 0, -1);
            if (Class28.field237 != null) {
                Class28.field237[1].method5829(Class78.field1082 + 140, 1);
                class299.method5522("Members only world", Class78.field1082 + 152, 10, 16777215, -1);
                Class28.field237[0].method5829(Class78.field1082 + 140, 12);
                class299.method5522("Free world", Class78.field1082 + 152, 21, 16777215, -1);
            }
            if (Class126.field1779 != null) {
                final int n = Class78.field1082 + 280;
                if (Class65.field946[0] == 0 && Class65.field939[0] == 0) {
                    Class126.field1779[2].method5829(n, 4);
                }
                else {
                    Class126.field1779[0].method5829(n, 4);
                }
                if (Class65.field946[0] == 0 && Class65.field939[0] == 1) {
                    Class126.field1779[3].method5829(n + 15, 4);
                }
                else {
                    Class126.field1779[1].method5829(n + 15, 4);
                }
                class298.method5522("World", n + 32, 17, 16777215, -1);
                final int n2 = Class78.field1082 + 390;
                if (Class65.field946[0] == 1 && Class65.field939[0] == 0) {
                    Class126.field1779[2].method5829(n2, 4);
                }
                else {
                    Class126.field1779[0].method5829(n2, 4);
                }
                if (Class65.field946[0] == 1 && Class65.field939[0] == 1) {
                    Class126.field1779[3].method5829(n2 + 15, 4);
                }
                else {
                    Class126.field1779[1].method5829(n2 + 15, 4);
                }
                class298.method5522("Players", n2 + 32, 17, 16777215, -1);
                final int n3 = Class78.field1082 + 500;
                if (Class65.field946[0] == 2 && Class65.field939[0] == 0) {
                    Class126.field1779[2].method5829(n3, 4);
                }
                else {
                    Class126.field1779[0].method5829(n3, 4);
                }
                if (Class65.field946[0] == 2 && Class65.field939[0] == 1) {
                    Class126.field1779[3].method5829(n3 + 15, 4);
                }
                else {
                    Class126.field1779[1].method5829(n3 + 15, 4);
                }
                class298.method5522("Location", n3 + 32, 17, 16777215, -1);
                final int n4 = Class78.field1082 + 610;
                if (Class65.field946[0] == 3 && Class65.field939[0] == 0) {
                    Class126.field1779[2].method5829(n4, 4);
                }
                else {
                    Class126.field1779[0].method5829(n4, 4);
                }
                if (Class65.field946[0] == 3 && Class65.field939[0] == 1) {
                    Class126.field1779[3].method5829(n4 + 15, 4);
                }
                else {
                    Class126.field1779[1].method5829(n4 + 15, 4);
                }
                class298.method5522("Type", n4 + 32, 17, 16777215, -1);
            }
            Class314.method5763(Class78.field1082 + 708, 4, 50, 16, 0);
            class299.method5525("Cancel", Class78.field1082 + 708 + 25, 16, 16777215, -1);
            Class78.field1116 = -1;
            if (Class166.field2047 != null) {
                final int n5 = 88;
                final int n6 = 19;
                int n7 = 765 / (n5 + 1);
                int n8 = 480 / (n6 + 1);
                int n9;
                int n10;
                do {
                    n9 = n8;
                    n10 = n7;
                    if (n8 * (n7 - 1) >= Class65.field945) {
                        --n7;
                    }
                    if (n7 * (n8 - 1) >= Class65.field945) {
                        --n8;
                    }
                    if (n7 * (n8 - 1) >= Class65.field945) {
                        --n8;
                    }
                } while (n9 != n8 || n7 != n10);
                int n11 = (765 - n5 * n7) / (n7 + 1);
                if (n11 > 5) {
                    n11 = 5;
                }
                int n12 = (480 - n6 * n8) / (n8 + 1);
                if (n12 > 5) {
                    n12 = 5;
                }
                final int n13 = (765 - n5 * n7 - n11 * (n7 - 1)) / 2;
                final int n14 = (480 - n8 * n6 - n12 * (n8 - 1)) / 2;
                int n15 = n14 + 23;
                int n16 = n13 + Class78.field1082;
                int n17 = 0;
                boolean b2 = false;
                for (int i = 0; i < Class65.field945; ++i) {
                    final Class65 class301 = Class65.field949[i];
                    boolean b3 = true;
                    String string = Integer.toString(class301.field955);
                    if (class301.field955 == -1) {
                        string = "OFF";
                        b3 = false;
                    }
                    else if (class301.field955 > 1980) {
                        string = "FULL";
                        b3 = false;
                    }
                    int n18 = 0;
                    int n19;
                    if (class301.method1577()) {
                        if (class301.method1589()) {
                            n19 = 7;
                        }
                        else {
                            n19 = 6;
                        }
                    }
                    else if (class301.method1570()) {
                        n18 = 16711680;
                        if (class301.method1589()) {
                            n19 = 5;
                        }
                        else {
                            n19 = 4;
                        }
                    }
                    else if (class301.method1568()) {
                        if (class301.method1589()) {
                            n19 = 3;
                        }
                        else {
                            n19 = 2;
                        }
                    }
                    else if (class301.method1589()) {
                        n19 = 1;
                    }
                    else {
                        n19 = 0;
                    }
                    if (Class48.field425 >= n16 && Class48.field426 * 673804999 >= n15 && Class48.field425 < n16 + n5 && Class48.field426 * 673804999 < n6 + n15 && b3) {
                        Class78.field1116 = i;
                        Class166.field2047[n19].method5855(n16, n15, 128, 16777215);
                        b2 = true;
                    }
                    else {
                        Class166.field2047[n19].method5849(n16, n15);
                    }
                    if (Class13.field85 != null) {
                        Class13.field85[(class301.method1589() ? 8 : 0) + class301.field952].method5829(n16 + 29, n15);
                    }
                    class298.method5525(Integer.toString(class301.field947), n16 + 15, n6 / 2 + n15 + 5, n18, -1);
                    class299.method5525(string, n16 + 60, n6 / 2 + n15 + 5, 268435455, -1);
                    n15 = n15 + n6 + n12;
                    if (++n17 >= n8) {
                        n15 = n14 + 23;
                        n16 = n16 + n5 + n11;
                        n17 = 0;
                    }
                }
                if (b2) {
                    final int n20 = class299.method5517(Class65.field949[Class78.field1116].field951) + 6;
                    final int n21 = class299.field3695 + 8;
                    Class314.method5763(Class48.field425 - n20 / 2, Class48.field426 * 673804999 + 20 + 5, n20, n21, 16777120);
                    Class314.method5734(Class48.field425 - n20 / 2, Class48.field426 * 673804999 + 20 + 5, n20, n21, 0);
                    class299.method5525(Class65.field949[Class78.field1116].field951, Class48.field425, Class48.field426 * 673804999 + class299.field3695 + 20 + 5 + 4, 0, -1);
                }
            }
            Class163.field2014.vmethod5809(0, 0);
            return;
        }
        if (b) {
            Class78.field1092.method5849(Class78.field1082, 0);
            Class78.field1087.method5849(Class78.field1082 + 382, 0);
            Class78.field1117.method5829(Class78.field1082 + 382 - Class78.field1117.field3780 / 2, 18);
        }
        if (Client.field589 == 0 || Client.field589 == 5) {
            final int n22 = 20;
            class298.method5525("RuneScape is loading - please wait...", Class78.field1090 + 180, 245 - n22, 16777215, -1);
            final int n23 = 253 - n22;
            Class314.method5734(Class78.field1090 + 180 - 152, n23, 304, 34, 9179409);
            Class314.method5734(Class78.field1090 + 180 - 151, n23 + 1, 302, 32, 0);
            Class314.method5763(Class78.field1090 + 180 - 150, n23 + 2, Class78.field1099 * 3, 30, 9179409);
            Class314.method5763(Class78.field1099 * 3 + (Class78.field1090 + 180 - 150), n23 + 2, 300 - Class78.field1099 * 3, 30, 0);
            class298.method5525(Class78.field1100, Class78.field1090 + 180, 276 - n22, 16777215, -1);
        }
        if (Client.field589 == 20) {
            Class78.field1083.method5829(Class78.field1090 + 180 - Class78.field1083.field3780 / 2, 271 - Class78.field1083.field3781 / 2);
            int n24 = 201;
            class298.method5525(Class78.field1103, Class78.field1090 + 180, n24, 16776960, 0);
            n24 += 15;
            class298.method5525(Class78.field1112, Class78.field1090 + 180, n24, 16776960, 0);
            n24 += 15;
            class298.method5525(Class78.field1105, Class78.field1090 + 180, n24, 16776960, 0);
            n24 += 15;
            n24 += 7;
            if (Class78.field1081 != 4) {
                class298.method5522("Login: ", Class78.field1090 + 180 - 110, n24, 16777215, 0);
                int n25;
                String s;
                for (n25 = 200, s = Class59.method1076(); class298.method5517(s) > n25; s = s.substring(0, s.length() - 1)) {}
                class298.method5522(Class299.method5521(s), Class78.field1090 + 180 - 70, n24, 16777215, 0);
                n24 += 15;
                class298.method5522("Password: " + Class265.method4976(Class78.field1086), Class78.field1090 + 180 - 108, n24, 16777215, 0);
                n24 += 15;
            }
        }
        if (Client.field589 == 10 || Client.field589 == 11) {
            Class78.field1083.method5829(Class78.field1090, 171);
            if (Class78.field1081 == 0) {
                int n26 = 251;
                class298.method5525("Welcome to RuneScape", Class78.field1090 + 180, n26, 16776960, 0);
                n26 += 30;
                final int n27 = Class78.field1090 + 180 - 80;
                final int n28 = 291;
                Class78.field1084.method5829(n27 - 73, n28 - 20);
                class298.method5526("New User", n27 - 73, n28 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                final int n29 = Class78.field1090 + 180 + 80;
                Class78.field1084.method5829(n29 - 73, n28 - 20);
                class298.method5526("Existing User", n29 - 73, n28 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            }
            else if (Class78.field1081 == 1) {
                class298.method5525(Class78.field1098, Class78.field1090 + 180, 201, 16776960, 0);
                int n30 = 236;
                class298.method5525(Class78.field1103, Class78.field1090 + 180, n30, 16777215, 0);
                n30 += 15;
                class298.method5525(Class78.field1112, Class78.field1090 + 180, n30, 16777215, 0);
                n30 += 15;
                class298.method5525(Class78.field1105, Class78.field1090 + 180, n30, 16777215, 0);
                n30 += 15;
                final int n31 = Class78.field1090 + 180 - 80;
                final int n32 = 321;
                Class78.field1084.method5829(n31 - 73, n32 - 20);
                class298.method5525("Continue", n31, n32 + 5, 16777215, 0);
                final int n33 = Class78.field1090 + 180 + 80;
                Class78.field1084.method5829(n33 - 73, n32 - 20);
                class298.method5525("Cancel", n33, n32 + 5, 16777215, 0);
            }
            else if (Class78.field1081 == 2) {
                int n34 = 201;
                class298.method5525(Class78.field1103, Class78.field1091, n34, 16776960, 0);
                n34 += 15;
                class298.method5525(Class78.field1112, Class78.field1091, n34, 16776960, 0);
                n34 += 15;
                class298.method5525(Class78.field1105, Class78.field1091, n34, 16776960, 0);
                n34 += 15;
                n34 += 7;
                class298.method5522("Login: ", Class78.field1091 - 110, n34, 16777215, 0);
                int n35;
                String s2;
                for (n35 = 200, s2 = Class59.method1076(); class298.method5517(s2) > n35; s2 = s2.substring(1)) {}
                class298.method5522(Class299.method5521(s2) + ((Class78.field1102 == 0 & Client.field591 % 40 < 20) ? (Class6.method71(16776960) + "|") : ""), Class78.field1091 - 70, n34, 16777215, 0);
                n34 += 15;
                class298.method5522("Password: " + Class265.method4976(Class78.field1086) + ((Class78.field1102 == 1 & Client.field591 % 40 < 20) ? (Class6.method71(16776960) + "|") : ""), Class78.field1091 - 108, n34, 16777215, 0);
                n34 += 15;
                int n36 = 277;
                final int n37 = Class78.field1091 - 117;
                final boolean field1108 = Class78.field1108;
                final boolean field1109 = Class78.field1110;
                final Class317 class302 = field1108 ? (field1109 ? Class53.field472 : Class78.field1089) : (field1109 ? Class102.field1352 : Class235.field2783);
                class302.method5829(n37, n36);
                class299.method5522("Remember username", n37 + class302.field3780 + 5, n36 + 13, 16776960, 0);
                final int n38 = Class78.field1091 + 24;
                final boolean field1110 = Class10.field61.field962;
                final boolean field1111 = Class78.field1115;
                final Class317 class303 = field1110 ? (field1111 ? Class53.field472 : Class78.field1089) : (field1111 ? Class102.field1352 : Class235.field2783);
                class303.method5829(n38, n36);
                class299.method5522("Hide username", n38 + class303.field3780 + 5, n36 + 13, 16776960, 0);
                n36 += 15;
                final int n39 = Class78.field1091 - 80;
                final int n40 = 321;
                Class78.field1084.method5829(n39 - 73, n40 - 20);
                class298.method5525("Login", n39, n40 + 5, 16777215, 0);
                final int n41 = Class78.field1091 + 80;
                Class78.field1084.method5829(n41 - 73, n40 - 20);
                class298.method5525("Cancel", n41, n40 + 5, 16777215, 0);
                class299.method5525("Forgotten your password? <col=ffffff>Click here.", Class78.field1091, 357, 16776960, 0);
            }
            else if (Class78.field1081 == 3) {
                int n42 = 201;
                class298.method5525("Invalid username or password.", Class78.field1090 + 180, n42, 16776960, 0);
                n42 += 20;
                class299.method5525("For accounts created after 24th November 2010, please use your", Class78.field1090 + 180, n42, 16776960, 0);
                n42 += 15;
                class299.method5525("email address to login. Otherwise please login with your username.", Class78.field1090 + 180, n42, 16776960, 0);
                n42 += 15;
                final int n43 = Class78.field1090 + 180;
                final int n44 = 276;
                Class78.field1084.method5829(n43 - 73, n44 - 20);
                class300.method5525("Try again", n43, n44 + 5, 16777215, 0);
                final int n45 = Class78.field1090 + 180;
                final int n46 = 326;
                Class78.field1084.method5829(n45 - 73, n46 - 20);
                class300.method5525("Forgotten password?", n45, n46 + 5, 16777215, 0);
            }
            else if (Class78.field1081 == 4) {
                class298.method5525("Authenticator", Class78.field1090 + 180, 201, 16776960, 0);
                int n47 = 236;
                class298.method5525(Class78.field1103, Class78.field1090 + 180, n47, 16777215, 0);
                n47 += 15;
                class298.method5525(Class78.field1112, Class78.field1090 + 180, n47, 16777215, 0);
                n47 += 15;
                class298.method5525(Class78.field1105, Class78.field1090 + 180, n47, 16777215, 0);
                n47 += 15;
                class298.method5522("PIN: " + Class265.method4976(Class28.field238) + ((Client.field591 % 40 < 20) ? (Class6.method71(16776960) + "|") : ""), Class78.field1090 + 180 - 108, n47, 16777215, 0);
                n47 -= 8;
                class298.method5522("Trust this computer", Class78.field1090 + 180 - 9, n47, 16776960, 0);
                n47 += 15;
                class298.method5522("for 30 days: ", Class78.field1090 + 180 - 9, n47, 16776960, 0);
                final int n48 = Class78.field1090 + 180 - 9 + class298.method5517("for 30 days: ") + 15;
                final int n49 = n47 - class298.field3695;
                Class317 class304;
                if (Class78.field1104) {
                    class304 = Class78.field1089;
                }
                else {
                    class304 = Class235.field2783;
                }
                class304.method5829(n48, n49);
                n47 += 15;
                final int n50 = Class78.field1090 + 180 - 80;
                final int n51 = 321;
                Class78.field1084.method5829(n50 - 73, n51 - 20);
                class298.method5525("Continue", n50, n51 + 5, 16777215, 0);
                final int n52 = Class78.field1090 + 180 + 80;
                Class78.field1084.method5829(n52 - 73, n51 - 20);
                class298.method5525("Cancel", n52, n51 + 5, 16777215, 0);
                class299.method5525("<u=ff>Can't Log In?</u>", Class78.field1090 + 180, n51 + 36, 255, 0);
            }
            else if (Class78.field1081 == 5) {
                class298.method5525("Forgotten your password?", Class78.field1090 + 180, 201, 16776960, 0);
                int n53 = 221;
                class300.method5525(Class78.field1103, Class78.field1090 + 180, n53, 16776960, 0);
                n53 += 15;
                class300.method5525(Class78.field1112, Class78.field1090 + 180, n53, 16776960, 0);
                n53 += 15;
                class300.method5525(Class78.field1105, Class78.field1090 + 180, n53, 16776960, 0);
                n53 += 15;
                n53 += 14;
                class298.method5522("Username/email: ", Class78.field1090 + 180 - 145, n53, 16777215, 0);
                int n54;
                String s3;
                for (n54 = 174, s3 = Class59.method1076(); class298.method5517(s3) > n54; s3 = s3.substring(1)) {}
                class298.method5522(Class299.method5521(s3) + ((Client.field591 % 40 < 20) ? (Class6.method71(16776960) + "|") : ""), Class78.field1090 + 180 - 34, n53, 16777215, 0);
                n53 += 15;
                final int n55 = Class78.field1090 + 180 - 80;
                final int n56 = 321;
                Class78.field1084.method5829(n55 - 73, n56 - 20);
                class298.method5525("Recover", n55, n56 + 5, 16777215, 0);
                final int n57 = Class78.field1090 + 180 + 80;
                Class78.field1084.method5829(n57 - 73, n56 - 20);
                class298.method5525("Back", n57, n56 + 5, 16777215, 0);
            }
            else if (Class78.field1081 == 6) {
                int n58 = 201;
                class298.method5525(Class78.field1103, Class78.field1090 + 180, n58, 16776960, 0);
                n58 += 15;
                class298.method5525(Class78.field1112, Class78.field1090 + 180, n58, 16776960, 0);
                n58 += 15;
                class298.method5525(Class78.field1105, Class78.field1090 + 180, n58, 16776960, 0);
                n58 += 15;
                final int n59 = Class78.field1090 + 180;
                final int n60 = 321;
                Class78.field1084.method5829(n59 - 73, n60 - 20);
                class298.method5525("Back", n59, n60 + 5, 16777215, 0);
            }
            else if (Class78.field1081 == 7) {
                int n61 = 216;
                class298.method5525("Your date of birth isn't set.", Class78.field1090 + 180, n61, 16776960, 0);
                n61 += 15;
                class300.method5525("Please verify your account status by", Class78.field1090 + 180, n61, 16776960, 0);
                n61 += 15;
                class300.method5525("setting your date of birth.", Class78.field1090 + 180, n61, 16776960, 0);
                n61 += 15;
                final int n62 = Class78.field1090 + 180 - 80;
                final int n63 = 321;
                Class78.field1084.method5829(n62 - 73, n63 - 20);
                class298.method5525("Set Date of Birth", n62, n63 + 5, 16777215, 0);
                final int n64 = Class78.field1090 + 180 + 80;
                Class78.field1084.method5829(n64 - 73, n63 - 20);
                class298.method5525("Back", n64, n63 + 5, 16777215, 0);
            }
            else if (Class78.field1081 == 8) {
                int n65 = 216;
                class298.method5525("Sorry, but your account is not eligible to play.", Class78.field1090 + 180, n65, 16776960, 0);
                n65 += 15;
                class300.method5525("For more information, please take a look at", Class78.field1090 + 180, n65, 16776960, 0);
                n65 += 15;
                class300.method5525("our privacy policy.", Class78.field1090 + 180, n65, 16776960, 0);
                n65 += 15;
                final int n66 = Class78.field1090 + 180 - 80;
                final int n67 = 321;
                Class78.field1084.method5829(n66 - 73, n67 - 20);
                class298.method5525("Privacy Policy", n66, n67 + 5, 16777215, 0);
                final int n68 = Class78.field1090 + 180 + 80;
                Class78.field1084.method5829(n68 - 73, n67 - 20);
                class298.method5525("Back", n68, n67 + 5, 16777215, 0);
            }
        }
        if (Class78.field1097 > 0) {
            final int field1112 = Class78.field1097;
            final int n69 = 256;
            Class78.field1095 += field1112 * 128;
            if (Class78.field1095 > Class186.field2367.length) {
                Class78.field1095 -= Class186.field2367.length;
                Class67.method1682(Class78.field1111[(int)(Math.random() * 12.0)]);
            }
            int n70 = 0;
            final int n71 = field1112 * 128;
            for (int n72 = (n69 - field1112) * 128, j = 0; j < n72; ++j) {
                int n73 = Class40.field357[n71 + n70] - Class186.field2367[n70 + Class78.field1095 & Class186.field2367.length - 1] * field1112 / 6;
                if (n73 < 0) {
                    n73 = 0;
                }
                Class40.field357[n70++] = n73;
            }
            for (int k = n69 - field1112; k < n69; ++k) {
                final int n74 = k * 128;
                for (int l = 0; l < 128; ++l) {
                    if ((int)(Math.random() * 100.0) < 50 && l > 10 && l < 118) {
                        Class40.field357[l + n74] = 255;
                    }
                    else {
                        Class40.field357[n74 + l] = 0;
                    }
                }
            }
            if (Class78.field1088 > 0) {
                Class78.field1088 -= field1112 * 4;
            }
            if (Class78.field1094 > 0) {
                Class78.field1094 -= field1112 * 4;
            }
            if (Class78.field1088 == 0 && Class78.field1094 == 0) {
                final int n75 = (int)(Math.random() * (2000 / field1112));
                if (n75 == 0) {
                    Class78.field1088 = 1024;
                }
                if (n75 == 1) {
                    Class78.field1094 = 1024;
                }
            }
            for (int n76 = 0; n76 < n69 - field1112; ++n76) {
                Class78.field1093[n76] = Class78.field1093[field1112 + n76];
            }
            for (int n77 = n69 - field1112; n77 < n69; ++n77) {
                Class78.field1093[n77] = (int)(Math.sin(Class78.field1114 / 14.0) * 16.0 + Math.sin(Class78.field1114 / 15.0) * 14.0 + Math.sin(Class78.field1114 / 16.0) * 12.0);
                ++Class78.field1114;
            }
            Class78.field1096 += field1112;
            final int n78 = (field1112 + (Client.field591 & 0x1)) / 2;
            if (n78 > 0) {
                for (int n79 = 0; n79 < Class78.field1096 * 100; ++n79) {
                    Class40.field357[(int)(Math.random() * 124.0) + 2 + ((int)(Math.random() * 128.0) + 128 << 7)] = 192;
                }
                Class78.field1096 = 0;
                for (int n80 = 0; n80 < n69; ++n80) {
                    int n81 = 0;
                    final int n82 = n80 * 128;
                    for (int n83 = -n78; n83 < 128; ++n83) {
                        if (n78 + n83 < 128) {
                            n81 += Class40.field357[n83 + n82 + n78];
                        }
                        if (n83 - (n78 + 1) >= 0) {
                            n81 -= Class40.field357[n82 + n83 - (n78 + 1)];
                        }
                        if (n83 >= 0) {
                            Class76.field1073[n83 + n82] = n81 / (n78 * 2 + 1);
                        }
                    }
                }
                for (int n84 = 0; n84 < 128; ++n84) {
                    int n85 = 0;
                    for (int n86 = -n78; n86 < n69; ++n86) {
                        final int n87 = n86 * 128;
                        if (n86 + n78 < n69) {
                            n85 += Class76.field1073[n78 * 128 + n87 + n84];
                        }
                        if (n86 - (n78 + 1) >= 0) {
                            n85 -= Class76.field1073[n87 + n84 - (n78 + 1) * 128];
                        }
                        if (n86 >= 0) {
                            Class40.field357[n87 + n84] = n85 / (n78 * 2 + 1);
                        }
                    }
                }
            }
            Class78.field1097 = 0;
        }
        Class133.method3098();
        Class124.field1708[Class10.field61.field958?1:0].method5829(Class78.field1082 + 765 - 40, 463);
        if (Client.field589 > 5 && Client.field827 == 0) {
            if (Class232.field2752 != null) {
                final int n88 = Class78.field1082 + 5;
                final int n89 = 463;
                final int n90 = 100;
                final int n91 = 35;
                Class232.field2752.method5829(n88, n89);
                class298.method5525("World" + " " + Client.field581, n90 / 2 + n88, n91 / 2 + n89 - 2, 16777215, 0);
                if (Class49.field439 != null) {
                    class299.method5525("Loading...", n90 / 2 + n88, n91 / 2 + n89 + 12, 16777215, 0);
                }
                else {
                    class299.method5525("Click to switch", n90 / 2 + n88, n91 / 2 + n89 + 12, 16777215, 0);
                }
            }
            else {
                Class232.field2752 = Class221.method4374(Class175.field2270, "sl_button", "");
            }
        }
    }
}
