import java.util.Comparator;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("gc")
public class Class191
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(B)[Liw;", garbageValue = "17")
    public static Class244[] method3870() {
        return new Class244[] { Class244.field3143, Class244.field3145, Class244.field3146, Class244.field3141, Class244.field3140, Class244.field3142 };
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(ILce;ZB)I", garbageValue = "-73")
    static int method3866(final int n, final Class84 class84, final boolean b) {
        if (n < 1000) {
            return Class32.method540(n, class84, b);
        }
        if (n < 1100) {
            return Class47.method909(n, class84, b);
        }
        if (n < 1200) {
            return Class102.method2238(n, class84, b);
        }
        if (n < 1300) {
            return Class70.method1768(n, class84, b);
        }
        if (n < 1400) {
            return Class21.method274(n, class84, b);
        }
        if (n < 1500) {
            return Class228.method4495(n, class84, b);
        }
        if (n < 1600) {
            return Class65.method1605(n, class84, b);
        }
        if (n < 1700) {
            final Class230 class85 = b ? Class276.field3561 : Class260.field3301;
            int n2;
            if (n == 1600) {
                Class69.field999[++Class69.field1003 - 1] = class85.field2626;
                n2 = 1;
            }
            else if (n == 1601) {
                Class69.field999[++Class69.field1003 - 1] = class85.field2663;
                n2 = 1;
            }
            else if (n == 1602) {
                Class69.field1001[++Class55.field497 - 1] = class85.field2667;
                n2 = 1;
            }
            else if (n == 1603) {
                Class69.field999[++Class69.field1003 - 1] = class85.field2628;
                n2 = 1;
            }
            else if (n == 1604) {
                Class69.field999[++Class69.field1003 - 1] = class85.field2629;
                n2 = 1;
            }
            else if (n == 1605) {
                Class69.field999[++Class69.field1003 - 1] = class85.field2704;
                n2 = 1;
            }
            else if (n == 1606) {
                Class69.field999[++Class69.field1003 - 1] = class85.field2656;
                n2 = 1;
            }
            else if (n == 1607) {
                Class69.field999[++Class69.field1003 - 1] = class85.field2658;
                n2 = 1;
            }
            else if (n == 1608) {
                Class69.field999[++Class69.field1003 - 1] = class85.field2657;
                n2 = 1;
            }
            else if (n == 1609) {
                Class69.field999[++Class69.field1003 - 1] = class85.field2636;
                n2 = 1;
            }
            else if (n == 1610) {
                Class69.field999[++Class69.field1003 - 1] = class85.field2608;
                n2 = 1;
            }
            else if (n == 1611) {
                Class69.field999[++Class69.field1003 - 1] = class85.field2630;
                n2 = 1;
            }
            else if (n == 1612) {
                Class69.field999[++Class69.field1003 - 1] = class85.field2631;
                n2 = 1;
            }
            else if (n == 1613) {
                Class69.field999[++Class69.field1003 - 1] = class85.field2701.vmethod5815();
                n2 = 1;
            }
            else if (n == 1614) {
                Class69.field999[++Class69.field1003 - 1] = (class85.field2726 ? 1 : 0);
                n2 = 1;
            }
            else {
                n2 = 2;
            }
            return n2;
        }
        if (n < 1800) {
            final Class230 class86 = b ? Class276.field3561 : Class260.field3301;
            int n3;
            if (n == 1700) {
                Class69.field999[++Class69.field1003 - 1] = class86.field2649;
                n3 = 1;
            }
            else if (n == 1701) {
                if (class86.field2649 != -1) {
                    Class69.field999[++Class69.field1003 - 1] = class86.field2727;
                }
                else {
                    Class69.field999[++Class69.field1003 - 1] = 0;
                }
                n3 = 1;
            }
            else if (n == 1702) {
                Class69.field999[++Class69.field1003 - 1] = class86.field2606;
                n3 = 1;
            }
            else {
                n3 = 2;
            }
            return n3;
        }
        if (n < 1900) {
            return Class47.method914(n, class84, b);
        }
        if (n < 2000) {
            return Class305.method5659(n, class84, b);
        }
        if (n < 2100) {
            return Class47.method909(n, class84, b);
        }
        if (n < 2200) {
            return Class102.method2238(n, class84, b);
        }
        if (n < 2300) {
            return Class70.method1768(n, class84, b);
        }
        if (n < 2400) {
            return Class21.method274(n, class84, b);
        }
        if (n < 2500) {
            return Class228.method4495(n, class84, b);
        }
        if (n < 2600) {
            final Class230 method434 = Class26.method434(Class69.field999[--Class69.field1003]);
            int n4;
            if (n == 2500) {
                Class69.field999[++Class69.field1003 - 1] = method434.field2618;
                n4 = 1;
            }
            else if (n == 2501) {
                Class69.field999[++Class69.field1003 - 1] = method434.field2619;
                n4 = 1;
            }
            else if (n == 2502) {
                Class69.field999[++Class69.field1003 - 1] = method434.field2675;
                n4 = 1;
            }
            else if (n == 2503) {
                Class69.field999[++Class69.field1003 - 1] = method434.field2621;
                n4 = 1;
            }
            else if (n == 2504) {
                Class69.field999[++Class69.field1003 - 1] = (method434.field2625 ? 1 : 0);
                n4 = 1;
            }
            else if (n == 2505) {
                Class69.field999[++Class69.field1003 - 1] = method434.field2605;
                n4 = 1;
            }
            else {
                n4 = 2;
            }
            return n4;
        }
        if (n < 2700) {
            return Class13.method111(n, class84, b);
        }
        if (n < 2800) {
            return Class160.method3341(n, class84, b);
        }
        if (n < 2900) {
            return Class61.method1126(n, class84, b);
        }
        if (n < 3000) {
            return Class305.method5659(n, class84, b);
        }
        if (n < 3200) {
            int n5;
            if (n == 3100) {
                Class143.method3172(0, "", Class69.field1001[--Class55.field497]);
                n5 = 1;
            }
            else if (n == 3101) {
                Class69.field1003 -= 2;
                Class134.method3102(Class138.field1876, Class69.field999[Class69.field1003], Class69.field999[Class69.field1003 + 1]);
                n5 = 1;
            }
            else if (n == 3103) {
                Client.field626.method1980(Class26.method433(Class169.field2195, Client.field626.field1218));
                for (Class55 class87 = (Class55)Client.field741.method4018(); class87 != null; class87 = (Class55)Client.field741.method4019()) {
                    if (class87.field494 == 0 || class87.field494 == 3) {
                        Class20.method261(class87, true);
                    }
                }
                if (Client.field744 != null) {
                    Class60.method1114(Client.field744);
                    Client.field744 = null;
                }
                n5 = 1;
            }
            else if (n == 3104) {
                final String s = Class69.field1001[--Class55.field497];
                int method435 = 0;
                if (Class102.method2249(s)) {
                    method435 = Class68.method1693(s, 10, true);
                }
                final Class172 method436 = Class26.method433(Class169.field2150, Client.field626.field1218);
                method436.field2257.method3707(method435);
                Client.field626.method1980(method436);
                n5 = 1;
            }
            else if (n == 3105) {
                final String s2 = Class69.field1001[--Class55.field497];
                final Class172 method437 = Class26.method433(Class169.field2209, Client.field626.field1218);
                method437.field2257.method3532(s2.length() + 1);
                method437.field2257.method3699(s2);
                Client.field626.method1980(method437);
                n5 = 1;
            }
            else if (n == 3106) {
                final String s3 = Class69.field1001[--Class55.field497];
                final Class172 method438 = Class26.method433(Class169.field2136, Client.field626.field1218);
                method438.field2257.method3532(s3.length() + 1);
                method438.field2257.method3699(s3);
                Client.field626.method1980(method438);
                n5 = 1;
            }
            else if (n == 3107) {
                final int n6 = Class69.field999[--Class69.field1003];
                final String s4 = Class69.field1001[--Class55.field497];
                final int field1167 = Class81.field1167;
                final int[] field1168 = Class81.field1159;
                boolean b2 = false;
                final Class291 class88 = new Class291(s4, Class36.field306);
                for (int i = 0; i < field1167; ++i) {
                    final Class60 class89 = Client.field610[field1168[i]];
                    if (class89 != null && class89 != Class138.field1876 && class89.field552 != null && class89.field552.equals(class88)) {
                        if (n6 == 1) {
                            final Class172 method439 = Class26.method433(Class169.field2206, Client.field626.field1218);
                            method439.field2257.method3532(0);
                            method439.field2257.method3755(field1168[i]);
                            Client.field626.method1980(method439);
                        }
                        else if (n6 == 4) {
                            final Class172 method440 = Class26.method433(Class169.field2220, Client.field626.field1218);
                            method440.field2257.method3771(field1168[i]);
                            method440.field2257.method3532(0);
                            Client.field626.method1980(method440);
                        }
                        else if (n6 == 6) {
                            final Class172 method441 = Class26.method433(Class169.field2163, Client.field626.field1218);
                            method441.field2257.method3575(0);
                            method441.field2257.method3771(field1168[i]);
                            Client.field626.method1980(method441);
                        }
                        else if (n6 == 7) {
                            final Class172 method442 = Class26.method433(Class169.field2222, Client.field626.field1218);
                            method442.field2257.method3582(field1168[i]);
                            method442.field2257.method3574(0);
                            Client.field626.method1980(method442);
                        }
                        b2 = true;
                        break;
                    }
                }
                if (!b2) {
                    Class143.method3172(4, "", "Unable to find " + s4);
                }
                n5 = 1;
            }
            else if (n == 3108) {
                Class69.field1003 -= 3;
                Class169.method3447(Class26.method434(Class69.field999[Class69.field1003 + 2]), Class69.field999[Class69.field1003], Class69.field999[Class69.field1003 + 1]);
                n5 = 1;
            }
            else if (n == 3109) {
                Class69.field1003 -= 2;
                Class169.method3447(b ? Class276.field3561 : Class260.field3301, Class69.field999[Class69.field1003], Class69.field999[Class69.field1003 + 1]);
                n5 = 1;
            }
            else if (n == 3110) {
                Class253.field3229 = (Class69.field999[--Class69.field1003] == 1);
                n5 = 1;
            }
            else if (n == 3111) {
                Class69.field999[++Class69.field1003 - 1] = (Class10.field61.field960 ? 1 : 0);
                n5 = 1;
            }
            else if (n == 3112) {
                Class10.field61.field960 = (Class69.field999[--Class69.field1003] == 1);
                Class54.method1018();
                n5 = 1;
            }
            else if (n == 3113) {
                Class270.method5156(Class69.field1001[--Class55.field497], Class69.field999[--Class69.field1003] == 1, false);
                n5 = 1;
            }
            else if (n == 3115) {
                final int n7 = Class69.field999[--Class69.field1003];
                final Class172 method443 = Class26.method433(Class169.field2225, Client.field626.field1218);
                method443.field2257.method3755(n7);
                Client.field626.method1980(method443);
                n5 = 1;
            }
            else if (n == 3116) {
                final int n8 = Class69.field999[--Class69.field1003];
                Class55.field497 -= 2;
                final String s5 = Class69.field1001[Class55.field497];
                final String s6 = Class69.field1001[Class55.field497 + 1];
                if (s5.length() > 500) {
                    n5 = 1;
                }
                else if (s6.length() > 500) {
                    n5 = 1;
                }
                else {
                    final Class172 method444 = Class26.method433(Class169.field2167, Client.field626.field1218);
                    method444.field2257.method3755(1 + Class316.method5820(s5) + Class316.method5820(s6));
                    method444.field2257.method3575(n8);
                    method444.field2257.method3699(s6);
                    method444.field2257.method3699(s5);
                    Client.field626.method1980(method444);
                    n5 = 1;
                }
            }
            else if (n == 3117) {
                Client.field726 = (Class69.field999[--Class69.field1003] == 1);
                n5 = 1;
            }
            else if (n == 3118) {
                Client.field728 = (Class69.field999[--Class69.field1003] == 1);
                n5 = 1;
            }
            else if (n == 3119) {
                Client.field699 = (Class69.field999[--Class69.field1003] == 1);
                n5 = 1;
            }
            else if (n == 3120) {
                if (Class69.field999[--Class69.field1003] == 1) {
                    Client.field658 |= 0x1;
                }
                else {
                    Client.field658 &= 0xFFFFFFFE;
                }
                n5 = 1;
            }
            else if (n == 3121) {
                if (Class69.field999[--Class69.field1003] == 1) {
                    Client.field658 |= 0x2;
                }
                else {
                    Client.field658 &= 0xFFFFFFFD;
                }
                n5 = 1;
            }
            else if (n == 3122) {
                if (Class69.field999[--Class69.field1003] == 1) {
                    Client.field658 |= 0x4;
                }
                else {
                    Client.field658 &= 0xFFFFFFFB;
                }
                n5 = 1;
            }
            else if (n == 3123) {
                if (Class69.field999[--Class69.field1003] == 1) {
                    Client.field658 |= 0x8;
                }
                else {
                    Client.field658 &= 0xFFFFFFF7;
                }
                n5 = 1;
            }
            else if (n == 3124) {
                Client.field658 = 0;
                n5 = 1;
            }
            else if (n == 3125) {
                Client.field621 = (Class69.field999[--Class69.field1003] == 1);
                n5 = 1;
            }
            else if (n == 3126) {
                Client.field677 = (Class69.field999[--Class69.field1003] == 1);
                n5 = 1;
            }
            else if (n == 3127) {
                Client.field727 = (Class69.field999[--Class69.field1003] == 1);
                n5 = 1;
            }
            else if (n == 3128) {
                Class69.field999[++Class69.field1003 - 1] = (Client.field727 ? 1 : 0);
                n5 = 1;
            }
            else if (n == 3129) {
                Class69.field1003 -= 2;
                Client.field750 = Class69.field999[Class69.field1003];
                Client.field661 = Class69.field999[Class69.field1003 + 1];
                n5 = 1;
            }
            else if (n == 3130) {
                Class69.field1003 -= 2;
                n5 = 1;
            }
            else if (n == 3131) {
                --Class69.field1003;
                n5 = 1;
            }
            else if (n == 3132) {
                Class69.field999[++Class69.field1003 - 1] = Class82.field1179;
                Class69.field999[++Class69.field1003 - 1] = Class243.field3138;
                n5 = 1;
            }
            else if (n == 3133) {
                --Class69.field1003;
                n5 = 1;
            }
            else {
                n5 = 2;
            }
            return n5;
        }
        if (n < 3300) {
            int n12;
            if (n == 3200) {
                Class69.field1003 -= 3;
                final int n9 = Class69.field999[Class69.field1003];
                final int n10 = Class69.field999[Class69.field1003 + 1];
                final int n11 = Class69.field999[Class69.field1003 + 2];
                if (Client.field814 != 0 && n10 != 0 && Client.field656 < 50) {
                    Client.field817[Client.field656] = n9;
                    Client.field676[Client.field656] = n10;
                    Client.field819[Client.field656] = n11;
                    Client.field719[Client.field656] = null;
                    Client.field820[Client.field656] = 0;
                    ++Client.field656;
                }
                n12 = 1;
            }
            else if (n == 3201) {
                final int field1169 = Class69.field999[--Class69.field1003];
                if (field1169 == -1 && !Client.field813) {
                    Class9.method88();
                }
                else if (field1169 != -1 && field1169 != Client.field812 && Client.field811 != 0 && !Client.field813) {
                    Class65.method1602(2, Class80.field1147, field1169, 0, Client.field811, false);
                }
                Client.field812 = field1169;
                n12 = 1;
            }
            else if (n == 3202) {
                Class69.field1003 -= 2;
                final int n13 = Class69.field999[Class69.field1003];
                final int n14 = Class69.field999[Class69.field1003 + 1];
                if (Client.field811 != 0 && n13 != -1) {
                    Class63.method1554(Class61.field576, n13, 0, Client.field811, false);
                    Client.field813 = true;
                }
                n12 = 1;
            }
            else {
                n12 = 2;
            }
            return n12;
        }
        if (n < 3400) {
            return Class173.method3469(n, class84, b);
        }
        if (n < 3500) {
            int n17;
            if (n == 3400) {
                Class69.field1003 -= 2;
                final int n15 = Class69.field999[Class69.field1003];
                final int n16 = Class69.field999[Class69.field1003 + 1];
                Class266 method445 = Class182.method3603(n15);
                if (method445.field3337 != 's') {}
                for (int j = 0; j < method445.field3345; ++j) {
                    if (n16 == method445.field3343[j]) {
                        Class69.field1001[++Class55.field497 - 1] = method445.field3339[j];
                        method445 = null;
                        break;
                    }
                }
                if (method445 != null) {
                    Class69.field1001[++Class55.field497 - 1] = method445.field3340;
                }
                n17 = 1;
            }
            else if (n == 3408) {
                Class69.field1003 -= 4;
                final int n18 = Class69.field999[Class69.field1003];
                final int n19 = Class69.field999[Class69.field1003 + 1];
                final int n20 = Class69.field999[Class69.field1003 + 2];
                final int n21 = Class69.field999[Class69.field1003 + 3];
                Class266 method446 = Class182.method3603(n20);
                if (n18 == method446.field3336 && n19 == method446.field3337) {
                    for (int k = 0; k < method446.field3345; ++k) {
                        if (n21 == method446.field3343[k]) {
                            if (n19 == 's') {
                                Class69.field1001[++Class55.field497 - 1] = method446.field3339[k];
                            }
                            else {
                                Class69.field999[++Class69.field1003 - 1] = method446.field3344[k];
                            }
                            method446 = null;
                            break;
                        }
                    }
                    if (method446 != null) {
                        if (n19 == 's') {
                            Class69.field1001[++Class55.field497 - 1] = method446.field3340;
                        }
                        else {
                            Class69.field999[++Class69.field1003 - 1] = method446.field3341;
                        }
                    }
                    n17 = 1;
                }
                else {
                    if (n19 == 's') {
                        Class69.field1001[++Class55.field497 - 1] = "null";
                    }
                    else {
                        Class69.field999[++Class69.field1003 - 1] = 0;
                    }
                    n17 = 1;
                }
            }
            else if (n == 3411) {
                Class69.field999[++Class69.field1003 - 1] = Class182.method3603(Class69.field999[--Class69.field1003]).method4980();
                n17 = 1;
            }
            else {
                n17 = 2;
            }
            return n17;
        }
        if (n < 3700) {
            int n22;
            if (n == 3600) {
                if (Class181.field2332.field976 == 0) {
                    Class69.field999[++Class69.field1003 - 1] = -2;
                }
                else if (Class181.field2332.field976 == 1) {
                    Class69.field999[++Class69.field1003 - 1] = -1;
                }
                else {
                    Class69.field999[++Class69.field1003 - 1] = Class181.field2332.field970.method5327();
                }
                n22 = 1;
            }
            else if (n == 3601) {
                final int n23 = Class69.field999[--Class69.field1003];
                if (Class181.field2332.method1624() && n23 >= 0 && n23 < Class181.field2332.field970.method5327()) {
                    final Class292 class90 = (Class292)Class181.field2332.field970.method5336(n23);
                    Class69.field1001[++Class55.field497 - 1] = class90.method5288();
                    Class69.field1001[++Class55.field497 - 1] = class90.method5289();
                }
                else {
                    Class69.field1001[++Class55.field497 - 1] = "";
                    Class69.field1001[++Class55.field497 - 1] = "";
                }
                n22 = 1;
            }
            else if (n == 3602) {
                final int n24 = Class69.field999[--Class69.field1003];
                if (Class181.field2332.method1624() && n24 >= 0 && n24 < Class181.field2332.field970.method5327()) {
                    Class69.field999[++Class69.field1003 - 1] = ((Class287)Class181.field2332.field970.method5336(n24)).field3628;
                }
                else {
                    Class69.field999[++Class69.field1003 - 1] = 0;
                }
                n22 = 1;
            }
            else if (n == 3603) {
                final int n25 = Class69.field999[--Class69.field1003];
                if (Class181.field2332.method1624() && n25 >= 0 && n25 < Class181.field2332.field970.method5327()) {
                    Class69.field999[++Class69.field1003 - 1] = ((Class287)Class181.field2332.field970.method5336(n25)).field3629;
                }
                else {
                    Class69.field999[++Class69.field1003 - 1] = 0;
                }
                n22 = 1;
            }
            else if (n == 3604) {
                final String s7 = Class69.field1001[--Class55.field497];
                final int n26 = Class69.field999[--Class69.field1003];
                final Class172 method447 = Class26.method433(Class169.field2168, Client.field626.field1218);
                method447.field2257.method3532(Class316.method5820(s7) + 1);
                method447.field2257.method3574(n26);
                method447.field2257.method3699(s7);
                Client.field626.method1980(method447);
                n22 = 1;
            }
            else if (n == 3605) {
                Class181.field2332.method1631(Class69.field1001[--Class55.field497]);
                n22 = 1;
            }
            else if (n == 3606) {
                Class181.field2332.method1665(Class69.field1001[--Class55.field497]);
                n22 = 1;
            }
            else if (n == 3607) {
                Class181.field2332.method1633(Class69.field1001[--Class55.field497]);
                n22 = 1;
            }
            else if (n == 3608) {
                Class181.field2332.method1636(Class69.field1001[--Class55.field497]);
                n22 = 1;
            }
            else if (n == 3609) {
                Class69.field999[++Class69.field1003 - 1] = (Class181.field2332.method1660(new Class291(Class139.method3138(Class69.field1001[--Class55.field497]), Class36.field306), false) ? 1 : 0);
                n22 = 1;
            }
            else if (n == 3611) {
                if (Class14.field94 != null) {
                    Class69.field1001[++Class55.field497 - 1] = Class14.field94.field3654;
                }
                else {
                    Class69.field1001[++Class55.field497 - 1] = "";
                }
                n22 = 1;
            }
            else if (n == 3612) {
                if (Class14.field94 != null) {
                    Class69.field999[++Class69.field1003 - 1] = Class14.field94.method5327();
                }
                else {
                    Class69.field999[++Class69.field1003 - 1] = 0;
                }
                n22 = 1;
            }
            else if (n == 3613) {
                final int n27 = Class69.field999[--Class69.field1003];
                if (Class14.field94 != null && n27 < Class14.field94.method5327()) {
                    Class69.field1001[++Class55.field497 - 1] = Class14.field94.method5336(n27).method5287().method5447();
                }
                else {
                    Class69.field1001[++Class55.field497 - 1] = "";
                }
                n22 = 1;
            }
            else if (n == 3614) {
                final int n28 = Class69.field999[--Class69.field1003];
                if (Class14.field94 != null && n28 < Class14.field94.method5327()) {
                    Class69.field999[++Class69.field1003 - 1] = ((Class287)Class14.field94.method5336(n28)).method5414();
                }
                else {
                    Class69.field999[++Class69.field1003 - 1] = 0;
                }
                n22 = 1;
            }
            else if (n == 3615) {
                final int n29 = Class69.field999[--Class69.field1003];
                if (Class14.field94 != null && n29 < Class14.field94.method5327()) {
                    Class69.field999[++Class69.field1003 - 1] = ((Class287)Class14.field94.method5336(n29)).field3629;
                }
                else {
                    Class69.field999[++Class69.field1003 - 1] = 0;
                }
                n22 = 1;
            }
            else if (n == 3616) {
                Class69.field999[++Class69.field1003 - 1] = ((Class14.field94 != null) ? Class14.field94.field3651 : 0);
                n22 = 1;
            }
            else if (n == 3617) {
                Class177.method3508(Class69.field1001[--Class55.field497]);
                n22 = 1;
            }
            else if (n == 3618) {
                Class69.field999[++Class69.field1003 - 1] = ((Class14.field94 != null) ? Class14.field94.field3657 : 0);
                n22 = 1;
            }
            else if (n == 3619) {
                Class12.method110(Class69.field1001[--Class55.field497]);
                n22 = 1;
            }
            else if (n == 3620) {
                final Class172 method448 = Class26.method433(Class169.field2153, Client.field626.field1218);
                method448.field2257.method3532(0);
                Client.field626.method1980(method448);
                n22 = 1;
            }
            else if (n == 3621) {
                if (!Class181.field2332.method1624()) {
                    Class69.field999[++Class69.field1003 - 1] = -1;
                }
                else {
                    Class69.field999[++Class69.field1003 - 1] = Class181.field2332.field975.method5327();
                }
                n22 = 1;
            }
            else if (n == 3622) {
                final int n30 = Class69.field999[--Class69.field1003];
                if (Class181.field2332.method1624() && n30 >= 0 && n30 < Class181.field2332.field975.method5327()) {
                    final Class286 class91 = (Class286)Class181.field2332.field975.method5336(n30);
                    Class69.field1001[++Class55.field497 - 1] = class91.method5288();
                    Class69.field1001[++Class55.field497 - 1] = class91.method5289();
                }
                else {
                    Class69.field1001[++Class55.field497 - 1] = "";
                    Class69.field1001[++Class55.field497 - 1] = "";
                }
                n22 = 1;
            }
            else if (n == 3623) {
                Class69.field999[++Class69.field1003 - 1] = (Class181.field2332.method1630(new Class291(Class139.method3138(Class69.field1001[--Class55.field497]), Class36.field306)) ? 1 : 0);
                n22 = 1;
            }
            else if (n == 3624) {
                final int n31 = Class69.field999[--Class69.field1003];
                if (Class14.field94 != null && n31 < Class14.field94.method5327() && Class14.field94.method5336(n31).method5287().equals(Class138.field1876.field552)) {
                    Class69.field999[++Class69.field1003 - 1] = 1;
                }
                else {
                    Class69.field999[++Class69.field1003 - 1] = 0;
                }
                n22 = 1;
            }
            else if (n == 3625) {
                if (Class14.field94 != null && Class14.field94.field3655 != null) {
                    Class69.field1001[++Class55.field497 - 1] = Class14.field94.field3655;
                }
                else {
                    Class69.field1001[++Class55.field497 - 1] = "";
                }
                n22 = 1;
            }
            else if (n == 3626) {
                final int n32 = Class69.field999[--Class69.field1003];
                if (Class14.field94 != null && n32 < Class14.field94.method5327() && ((Class281)Class14.field94.method5336(n32)).method5266()) {
                    Class69.field999[++Class69.field1003 - 1] = 1;
                }
                else {
                    Class69.field999[++Class69.field1003 - 1] = 0;
                }
                n22 = 1;
            }
            else if (n == 3627) {
                final int n33 = Class69.field999[--Class69.field1003];
                if (Class14.field94 != null && n33 < Class14.field94.method5327() && ((Class281)Class14.field94.method5336(n33)).method5267()) {
                    Class69.field999[++Class69.field1003 - 1] = 1;
                }
                else {
                    Class69.field999[++Class69.field1003 - 1] = 0;
                }
                n22 = 1;
            }
            else if (n == 3628) {
                Class181.field2332.field970.method5346();
                n22 = 1;
            }
            else if (n == 3629) {
                Class181.field2332.field970.method5347(new Class308(Class69.field999[--Class69.field1003] == 1));
                n22 = 1;
            }
            else if (n == 3630) {
                Class181.field2332.field970.method5347(new Class309(Class69.field999[--Class69.field1003] == 1));
                n22 = 1;
            }
            else if (n == 3631) {
                Class181.field2332.field970.method5347(new Class143(Class69.field999[--Class69.field1003] == 1));
                n22 = 1;
            }
            else if (n == 3632) {
                Class181.field2332.field970.method5347(new Class137(Class69.field999[--Class69.field1003] == 1));
                n22 = 1;
            }
            else if (n == 3633) {
                Class181.field2332.field970.method5347(new Class142(Class69.field999[--Class69.field1003] == 1));
                n22 = 1;
            }
            else if (n == 3634) {
                Class181.field2332.field970.method5347(new Class145(Class69.field999[--Class69.field1003] == 1));
                n22 = 1;
            }
            else if (n == 3635) {
                Class181.field2332.field970.method5347(new Class141(Class69.field999[--Class69.field1003] == 1));
                n22 = 1;
            }
            else if (n == 3636) {
                Class181.field2332.field970.method5347(new Class139(Class69.field999[--Class69.field1003] == 1));
                n22 = 1;
            }
            else if (n == 3637) {
                Class181.field2332.field970.method5347(new Class138(Class69.field999[--Class69.field1003] == 1));
                n22 = 1;
            }
            else if (n == 3638) {
                Class181.field2332.field970.method5347(new Class140(Class69.field999[--Class69.field1003] == 1));
                n22 = 1;
            }
            else if (n == 3639) {
                Class181.field2332.field970.method5337();
                n22 = 1;
            }
            else if (n == 3640) {
                Class181.field2332.field975.method5346();
                n22 = 1;
            }
            else if (n == 3641) {
                Class181.field2332.field975.method5347(new Class308(Class69.field999[--Class69.field1003] == 1));
                n22 = 1;
            }
            else if (n == 3642) {
                Class181.field2332.field975.method5347(new Class309(Class69.field999[--Class69.field1003] == 1));
                n22 = 1;
            }
            else if (n == 3643) {
                Class181.field2332.field975.method5337();
                n22 = 1;
            }
            else if (n == 3644) {
                if (Class14.field94 != null) {
                    Class14.field94.method5346();
                }
                n22 = 1;
            }
            else if (n == 3645) {
                final boolean b3 = Class69.field999[--Class69.field1003] == 1;
                if (Class14.field94 != null) {
                    Class14.field94.method5347(new Class308(b3));
                }
                n22 = 1;
            }
            else if (n == 3646) {
                final boolean b4 = Class69.field999[--Class69.field1003] == 1;
                if (Class14.field94 != null) {
                    Class14.field94.method5347(new Class309(b4));
                }
                n22 = 1;
            }
            else if (n == 3647) {
                final boolean b5 = Class69.field999[--Class69.field1003] == 1;
                if (Class14.field94 != null) {
                    Class14.field94.method5347(new Class143(b5));
                }
                n22 = 1;
            }
            else if (n == 3648) {
                final boolean b6 = Class69.field999[--Class69.field1003] == 1;
                if (Class14.field94 != null) {
                    Class14.field94.method5347(new Class137(b6));
                }
                n22 = 1;
            }
            else if (n == 3649) {
                final boolean b7 = Class69.field999[--Class69.field1003] == 1;
                if (Class14.field94 != null) {
                    Class14.field94.method5347(new Class142(b7));
                }
                n22 = 1;
            }
            else if (n == 3650) {
                final boolean b8 = Class69.field999[--Class69.field1003] == 1;
                if (Class14.field94 != null) {
                    Class14.field94.method5347(new Class145(b8));
                }
                n22 = 1;
            }
            else if (n == 3651) {
                final boolean b9 = Class69.field999[--Class69.field1003] == 1;
                if (Class14.field94 != null) {
                    Class14.field94.method5347(new Class141(b9));
                }
                n22 = 1;
            }
            else if (n == 3652) {
                final boolean b10 = Class69.field999[--Class69.field1003] == 1;
                if (Class14.field94 != null) {
                    Class14.field94.method5347(new Class139(b10));
                }
                n22 = 1;
            }
            else if (n == 3653) {
                final boolean b11 = Class69.field999[--Class69.field1003] == 1;
                if (Class14.field94 != null) {
                    Class14.field94.method5347(new Class138(b11));
                }
                n22 = 1;
            }
            else if (n == 3654) {
                final boolean b12 = Class69.field999[--Class69.field1003] == 1;
                if (Class14.field94 != null) {
                    Class14.field94.method5347(new Class140(b12));
                }
                n22 = 1;
            }
            else if (n == 3655) {
                if (Class14.field94 != null) {
                    Class14.field94.method5337();
                }
                n22 = 1;
            }
            else if (n == 3656) {
                Class181.field2332.field970.method5347(new Class144(Class69.field999[--Class69.field1003] == 1));
                n22 = 1;
            }
            else if (n == 3657) {
                final boolean b13 = Class69.field999[--Class69.field1003] == 1;
                if (Class14.field94 != null) {
                    Class14.field94.method5347(new Class144(b13));
                }
                n22 = 1;
            }
            else {
                n22 = 2;
            }
            return n22;
        }
        if (n < 4000) {
            return Class29.method477(n, class84, b);
        }
        if (n < 4100) {
            int n34;
            if (n == 4000) {
                Class69.field1003 -= 2;
                Class69.field999[++Class69.field1003 - 1] = Class69.field999[Class69.field1003 + 1] + Class69.field999[Class69.field1003];
                n34 = 1;
            }
            else if (n == 4001) {
                Class69.field1003 -= 2;
                Class69.field999[++Class69.field1003 - 1] = Class69.field999[Class69.field1003] - Class69.field999[Class69.field1003 + 1];
                n34 = 1;
            }
            else if (n == 4002) {
                Class69.field1003 -= 2;
                Class69.field999[++Class69.field1003 - 1] = Class69.field999[Class69.field1003 + 1] * Class69.field999[Class69.field1003];
                n34 = 1;
            }
            else if (n == 4003) {
                Class69.field1003 -= 2;
                Class69.field999[++Class69.field1003 - 1] = Class69.field999[Class69.field1003] / Class69.field999[Class69.field1003 + 1];
                n34 = 1;
            }
            else if (n == 4004) {
                Class69.field999[++Class69.field1003 - 1] = (int)(Math.random() * Class69.field999[--Class69.field1003]);
                n34 = 1;
            }
            else if (n == 4005) {
                Class69.field999[++Class69.field1003 - 1] = (int)(Math.random() * (Class69.field999[--Class69.field1003] + 1));
                n34 = 1;
            }
            else if (n == 4006) {
                Class69.field1003 -= 5;
                final int n35 = Class69.field999[Class69.field1003];
                final int n36 = Class69.field999[Class69.field1003 + 1];
                final int n37 = Class69.field999[Class69.field1003 + 2];
                Class69.field999[++Class69.field1003 - 1] = n35 + (Class69.field999[Class69.field1003 + 4] - n37) * (n36 - n35) / (Class69.field999[Class69.field1003 + 3] - n37);
                n34 = 1;
            }
            else if (n == 4007) {
                Class69.field1003 -= 2;
                final int n38 = Class69.field999[Class69.field1003];
                Class69.field999[++Class69.field1003 - 1] = n38 + Class69.field999[Class69.field1003 + 1] * n38 / 100;
                n34 = 1;
            }
            else if (n == 4008) {
                Class69.field1003 -= 2;
                Class69.field999[++Class69.field1003 - 1] = (Class69.field999[Class69.field1003] | 1 << Class69.field999[Class69.field1003 + 1]);
                n34 = 1;
            }
            else if (n == 4009) {
                Class69.field1003 -= 2;
                Class69.field999[++Class69.field1003 - 1] = (Class69.field999[Class69.field1003] & -1 - (1 << Class69.field999[Class69.field1003 + 1]));
                n34 = 1;
            }
            else if (n == 4010) {
                Class69.field1003 -= 2;
                Class69.field999[++Class69.field1003 - 1] = (((Class69.field999[Class69.field1003] & 1 << Class69.field999[Class69.field1003 + 1]) != 0x0) ? 1 : 0);
                n34 = 1;
            }
            else if (n == 4011) {
                Class69.field1003 -= 2;
                Class69.field999[++Class69.field1003 - 1] = Class69.field999[Class69.field1003] % Class69.field999[Class69.field1003 + 1];
                n34 = 1;
            }
            else if (n == 4012) {
                Class69.field1003 -= 2;
                final int n39 = Class69.field999[Class69.field1003];
                final int n40 = Class69.field999[Class69.field1003 + 1];
                if (n39 == 0) {
                    Class69.field999[++Class69.field1003 - 1] = 0;
                }
                else {
                    Class69.field999[++Class69.field1003 - 1] = (int)Math.pow(n39, n40);
                }
                n34 = 1;
            }
            else if (n == 4013) {
                Class69.field1003 -= 2;
                final int n41 = Class69.field999[Class69.field1003];
                final int n42 = Class69.field999[Class69.field1003 + 1];
                if (n41 == 0) {
                    Class69.field999[++Class69.field1003 - 1] = 0;
                    n34 = 1;
                }
                else {
                    switch (n42) {
                        default: {
                            Class69.field999[++Class69.field1003 - 1] = (int)Math.pow(n41, 1.0 / n42);
                            break;
                        }
                        case 4: {
                            Class69.field999[++Class69.field1003 - 1] = (int)Math.sqrt(Math.sqrt(n41));
                            break;
                        }
                        case 2: {
                            Class69.field999[++Class69.field1003 - 1] = (int)Math.sqrt(n41);
                            break;
                        }
                        case 0: {
                            Class69.field999[++Class69.field1003 - 1] = Integer.MAX_VALUE;
                            break;
                        }
                        case 1: {
                            Class69.field999[++Class69.field1003 - 1] = n41;
                            break;
                        }
                        case 3: {
                            Class69.field999[++Class69.field1003 - 1] = (int)Math.cbrt(n41);
                            break;
                        }
                    }
                    n34 = 1;
                }
            }
            else if (n == 4014) {
                Class69.field1003 -= 2;
                Class69.field999[++Class69.field1003 - 1] = (Class69.field999[Class69.field1003] & Class69.field999[Class69.field1003 + 1]);
                n34 = 1;
            }
            else if (n == 4015) {
                Class69.field1003 -= 2;
                Class69.field999[++Class69.field1003 - 1] = (Class69.field999[Class69.field1003] | Class69.field999[Class69.field1003 + 1]);
                n34 = 1;
            }
            else if (n == 4018) {
                Class69.field1003 -= 3;
                Class69.field999[++Class69.field1003 - 1] = Class69.field999[Class69.field1003 + 2] * Class69.field999[Class69.field1003] / Class69.field999[Class69.field1003 + 1];
                n34 = 1;
            }
            else {
                n34 = 2;
            }
            return n34;
        }
        if (n < 4200) {
            return Class57.method1034(n, class84, b);
        }
        if (n < 4300) {
            return Class73.method1799(n, class84, b);
        }
        if (n < 5100) {
            return Class14.method139(n, class84, b);
        }
        if (n < 5400) {
            return Class6.method74(n, class84, b);
        }
        if (n < 5600) {
            return Class181.method3526(n, class84, b);
        }
        if (n < 5700) {
            return Class111.method2531(n, class84, b);
        }
        if (n < 6300) {
            return Class151.method3240(n, class84, b);
        }
        if (n < 6600) {
            return Class5.method59(n, class84, b);
        }
        if (n < 6700) {
            return Class64.method1558(n, class84, b);
        }
        return 2;
    }
}
