import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("gv")
public abstract class Class186
{
    @ObfuscatedName("w")
    static boolean field2365;
    @ObfuscatedName("ah")
    static int[] field2367;
    
    static {
        Class186.field2365 = false;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(B)[B", garbageValue = "-44")
    abstract byte[] vmethod3789();
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "([BI)V", garbageValue = "339302128")
    abstract void vmethod3792(final byte[] p0);
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(Laj;I)V", garbageValue = "-1775785270")
    static void method3806(final Class47 class47) {
        if (Class78.field1107) {
            if (Class48.field431 == 1 || (!Class253.field3229 && Class48.field431 == 4)) {
                final int n = Class78.field1082 + 280;
                if (Class48.field432 >= n && Class48.field432 <= n + 14 && Class48.field428 >= 4 && Class48.field428 <= 18) {
                    Class148.method3195(0, 0);
                }
                else if (Class48.field432 >= n + 15 && Class48.field432 <= n + 80 && Class48.field428 >= 4 && Class48.field428 <= 18) {
                    Class148.method3195(0, 1);
                }
                else {
                    final int n2 = Class78.field1082 + 390;
                    if (Class48.field432 >= n2 && Class48.field432 <= n2 + 14 && Class48.field428 >= 4 && Class48.field428 <= 18) {
                        Class148.method3195(1, 0);
                    }
                    else if (Class48.field432 >= n2 + 15 && Class48.field432 <= n2 + 80 && Class48.field428 >= 4 && Class48.field428 <= 18) {
                        Class148.method3195(1, 1);
                    }
                    else {
                        final int n3 = Class78.field1082 + 500;
                        if (Class48.field432 >= n3 && Class48.field432 <= n3 + 14 && Class48.field428 >= 4 && Class48.field428 <= 18) {
                            Class148.method3195(2, 0);
                        }
                        else if (Class48.field432 >= n3 + 15 && Class48.field432 <= n3 + 80 && Class48.field428 >= 4 && Class48.field428 <= 18) {
                            Class148.method3195(2, 1);
                        }
                        else {
                            final int n4 = Class78.field1082 + 610;
                            if (Class48.field432 >= n4 && Class48.field432 <= n4 + 14 && Class48.field428 >= 4 && Class48.field428 <= 18) {
                                Class148.method3195(3, 0);
                            }
                            else if (Class48.field432 >= n4 + 15 && Class48.field432 <= n4 + 80 && Class48.field428 >= 4 && Class48.field428 <= 18) {
                                Class148.method3195(3, 1);
                            }
                            else if (Class48.field432 >= Class78.field1082 + 708 && Class48.field428 >= 4 && Class48.field432 <= Class78.field1082 + 708 + 50 && Class48.field428 <= 20) {
                                Class78.field1107 = false;
                                Class78.field1092.method5849(Class78.field1082, 0);
                                Class78.field1087.method5849(Class78.field1082 + 382, 0);
                                Class78.field1117.method5829(Class78.field1082 + 382 - Class78.field1117.field3780 / 2, 18);
                            }
                            else if (Class78.field1116 != -1) {
                                Class61.method1129(Class65.field949[Class78.field1116]);
                                Class78.field1107 = false;
                                Class78.field1092.method5849(Class78.field1082, 0);
                                Class78.field1087.method5849(Class78.field1082 + 382, 0);
                                Class78.field1117.method5829(Class78.field1082 + 382 - Class78.field1117.field3780 / 2, 18);
                            }
                        }
                    }
                }
            }
            return;
        }
        if ((Class48.field431 == 1 || (!Class253.field3229 && Class48.field431 == 4)) && Class48.field432 >= Class78.field1082 + 765 - 50 && Class48.field428 >= 453) {
            Class10.field61.field958 = !Class10.field61.field958;
            Class54.method1018();
            if (!Class10.field61.field958) {
                Class219.method4325(Class80.field1147, "scape main", "", 255, false);
            }
            else {
                Class9.method88();
            }
        }
        if (Client.field589 == 5) {
            return;
        }
        if (-1L == Class78.field1109) {
            Class78.field1109 = Class182.method3547() + 1000L;
        }
        final long method3547 = Class182.method3547();
        if (Class10.method92() && Class78.field1118 == -1L) {
            Class78.field1118 = method3547;
            if (Class78.field1118 > Class78.field1109) {
                Class78.field1109 = Class78.field1118;
            }
        }
        ++Class78.field1097;
        if (Client.field589 != 10 && Client.field589 != 11) {
            return;
        }
        if (Client.field827 == 0) {
            if (Class48.field431 == 1 || (!Class253.field3229 && Class48.field431 == 4)) {
                final int n5 = Class78.field1082 + 5;
                final int n6 = 463;
                final int n7 = 100;
                final int n8 = 35;
                if (Class48.field432 >= n5 && Class48.field432 <= n5 + n7 && Class48.field428 >= n6 && Class48.field428 <= n6 + n8) {
                    Class59.method1078();
                    return;
                }
            }
            if (Class49.field439 != null) {
                Class59.method1078();
            }
        }
        int field431 = Class48.field431;
        int n9 = Class48.field432;
        int field432 = Class48.field428;
        if (field431 == 0) {
            n9 = Class48.field425;
            field432 = Class48.field426 * 673804999;
        }
        if (!Class253.field3229 && field431 == 4) {
            field431 = 1;
        }
        if (Class78.field1081 == 0) {
            boolean b = false;
            while (Class1.method8()) {
                if (Class163.field2016 == 84) {
                    b = true;
                }
            }
            final int n10 = Class78.field1091 - 80;
            final int n11 = 291;
            if (field431 == 1 && n9 >= n10 - 75 && n9 <= n10 + 75 && field432 >= n11 - 20 && field432 <= n11 + 20) {
                Class270.method5156(Class142.method3161("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            final int n12 = Class78.field1091 + 80;
            if ((field431 == 1 && n9 >= n12 - 75 && n9 <= n12 + 75 && field432 >= n11 - 20 && field432 <= n11 + 20) || b) {
                if ((Client.field632 & 0x2000000) != 0x0) {
                    Class78.field1098 = "";
                    Class78.field1103 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                    Class78.field1112 = "Your normal account will not be affected.";
                    Class78.field1105 = "";
                    Class78.field1081 = 1;
                    Class34.method586();
                }
                else if ((Client.field632 & 0x4) != 0x0) {
                    if ((Client.field632 & 0x400) != 0x0) {
                        Class78.field1103 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                        Class78.field1112 = "Players can attack each other almost everywhere";
                        Class78.field1105 = "and the Protect Item prayer won't work.";
                    }
                    else {
                        Class78.field1103 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                        Class78.field1112 = "Players can attack each other";
                        Class78.field1105 = "almost everywhere.";
                    }
                    Class78.field1098 = "Warning!";
                    Class78.field1081 = 1;
                    Class34.method586();
                }
                else if ((Client.field632 & 0x400) != 0x0) {
                    Class78.field1103 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                    Class78.field1112 = "The Protect Item prayer will";
                    Class78.field1105 = "not work on this world.";
                    Class78.field1098 = "Warning!";
                    Class78.field1081 = 1;
                    Class34.method586();
                }
                else {
                    Class56.method1030(false);
                }
            }
        }
        else if (Class78.field1081 == 1) {
            while (Class1.method8()) {
                if (Class163.field2016 == 84) {
                    Class56.method1030(false);
                }
                else {
                    if (Class163.field2016 != 13) {
                        continue;
                    }
                    Class78.field1081 = 0;
                }
            }
            final int n13 = Class78.field1091 - 80;
            final int n14 = 321;
            if (field431 == 1 && n9 >= n13 - 75 && n9 <= n13 + 75 && field432 >= n14 - 20 && field432 <= n14 + 20) {
                Class56.method1030(false);
            }
            final int n15 = Class78.field1091 + 80;
            if (field431 == 1 && n9 >= n15 - 75 && n9 <= n15 + 75 && field432 >= n14 - 20 && field432 <= n14 + 20) {
                Class78.field1081 = 0;
            }
        }
        else if (Class78.field1081 == 2) {
            int n16 = 201;
            n16 += 52;
            if (field431 == 1 && field432 >= n16 - 12 && field432 < n16 + 2) {
                Class78.field1102 = 0;
            }
            n16 += 15;
            if (field431 == 1 && field432 >= n16 - 12 && field432 < n16 + 2) {
                Class78.field1102 = 1;
            }
            n16 += 15;
            final int n17 = 361;
            if (field431 == 1 && field432 >= n17 - 15 && field432 < n17) {
                Class2.method22("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                Class78.field1081 = 5;
                return;
            }
            final int n18 = Class78.field1091 - 80;
            final int n19 = 321;
            if (field431 == 1 && n9 >= n18 - 75 && n9 <= n18 + 75 && field432 >= n19 - 20 && field432 <= n19 + 20) {
                Class78.field1106 = Class78.field1106.trim();
                if (Class78.field1106.length() == 0) {
                    Class2.method22("", "Please enter your username/email address.", "");
                    return;
                }
                if (Class78.field1086.length() == 0) {
                    Class2.method22("", "Please enter your password.", "");
                    return;
                }
                Class2.method22("", "Connecting to server...", "");
                Class87.method2005(false);
                Class48.method947(20);
            }
            else {
                final int n20 = Class78.field1090 + 180 + 80;
                if (field431 == 1 && n9 >= n20 - 75 && n9 <= n20 + 75 && field432 >= n19 - 20 && field432 <= n19 + 20) {
                    Class78.field1081 = 0;
                    Class78.field1106 = "";
                    Class78.field1086 = "";
                    Class14.field104 = 0;
                    Class28.field238 = "";
                    Class78.field1104 = true;
                }
                final int n21 = Class78.field1091 - 117;
                final int n22 = 277;
                Class78.field1110 = (n9 >= n21 && n9 < n21 + Class67.field978 && field432 >= n22 && field432 < n22 + Class66.field966);
                if (field431 == 1 && Class78.field1110 && !(Class78.field1108 = !Class78.field1108) && Class10.field61.field959 != null) {
                    Class10.field61.field959 = null;
                    Class54.method1018();
                }
                final int n23 = Class78.field1091 + 24;
                final int n24 = 277;
                Class78.field1115 = (n9 >= n23 && n9 < n23 + Class67.field978 && field432 >= n24 && field432 < n24 + Class66.field966);
                if (field431 == 1 && Class78.field1115) {
                    if (!(Class10.field61.field962 = !Class10.field61.field962)) {
                        Class78.field1106 = "";
                        Class10.field61.field959 = null;
                        Class34.method586();
                    }
                    Class54.method1018();
                }
                while (Class1.method8()) {
                    boolean b2 = false;
                    for (int i = 0; i < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"?$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++i) {
                        if (Class39.field342 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"?$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(i)) {
                            b2 = true;
                            break;
                        }
                    }
                    if (Class163.field2016 == 13) {
                        Class78.field1081 = 0;
                        Class78.field1106 = "";
                        Class78.field1086 = "";
                        Class14.field104 = 0;
                        Class28.field238 = "";
                        Class78.field1104 = true;
                    }
                    else if (Class78.field1102 == 0) {
                        if (Class163.field2016 == 85 && Class78.field1106.length() > 0) {
                            Class78.field1106 = Class78.field1106.substring(0, Class78.field1106.length() - 1);
                        }
                        if (Class163.field2016 == 84 || Class163.field2016 == 80) {
                            Class78.field1102 = 1;
                        }
                        if (!b2 || Class78.field1106.length() >= 320) {
                            continue;
                        }
                        Class78.field1106 += Class39.field342;
                    }
                    else {
                        if (Class78.field1102 != 1) {
                            continue;
                        }
                        if (Class163.field2016 == 85 && Class78.field1086.length() > 0) {
                            Class78.field1086 = Class78.field1086.substring(0, Class78.field1086.length() - 1);
                        }
                        if (Class163.field2016 == 84 || Class163.field2016 == 80) {
                            Class78.field1102 = 0;
                        }
                        if (Class163.field2016 == 84) {
                            Class78.field1106 = Class78.field1106.trim();
                            if (Class78.field1106.length() == 0) {
                                Class2.method22("", "Please enter your username/email address.", "");
                                return;
                            }
                            if (Class78.field1086.length() == 0) {
                                Class2.method22("", "Please enter your password.", "");
                                return;
                            }
                            Class2.method22("", "Connecting to server...", "");
                            Class87.method2005(false);
                            Class48.method947(20);
                        }
                        else {
                            if (!b2 || Class78.field1086.length() >= 20) {
                                continue;
                            }
                            Class78.field1086 += Class39.field342;
                        }
                    }
                }
            }
        }
        else if (Class78.field1081 == 3) {
            final int n25 = Class78.field1090 + 180;
            final int n26 = 276;
            if (field431 == 1 && n9 >= n25 - 75 && n9 <= n25 + 75 && field432 >= n26 - 20 && field432 <= n26 + 20) {
                Class56.method1030(false);
            }
            final int n27 = Class78.field1090 + 180;
            final int n28 = 326;
            if (field431 == 1 && n9 >= n27 - 75 && n9 <= n27 + 75 && field432 >= n28 - 20 && field432 <= n28 + 20) {
                Class2.method22("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                Class78.field1081 = 5;
            }
        }
        else if (Class78.field1081 == 4) {
            final int n29 = Class78.field1090 + 180 - 80;
            final int n30 = 321;
            if (field431 == 1 && n9 >= n29 - 75 && n9 <= n29 + 75 && field432 >= n30 - 20 && field432 <= n30 + 20) {
                Class28.field238.trim();
                if (Class28.field238.length() != 6) {
                    Class2.method22("", "Please enter a 6-digit PIN.", "");
                    return;
                }
                Class14.field104 = Integer.parseInt(Class28.field238);
                Class28.field238 = "";
                Class87.method2005(true);
                Class2.method22("", "Connecting to server...", "");
                Class48.method947(20);
            }
            else {
                if (field431 == 1 && n9 >= Class78.field1090 + 180 - 9 && n9 <= Class78.field1090 + 180 + 130 && field432 >= 263 && field432 <= 296) {
                    Class78.field1104 = !Class78.field1104;
                }
                if (field431 == 1 && n9 >= Class78.field1090 + 180 - 34 && n9 <= Class78.field1090 + 34 + 180 && field432 >= 351 && field432 <= 363) {
                    Class270.method5156(Class142.method3161("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                }
                final int n31 = Class78.field1090 + 180 + 80;
                if (field431 == 1 && n9 >= n31 - 75 && n9 <= n31 + 75 && field432 >= n30 - 20 && field432 <= n30 + 20) {
                    Class78.field1081 = 0;
                    Class78.field1106 = "";
                    Class78.field1086 = "";
                    Class14.field104 = 0;
                    Class28.field238 = "";
                }
                while (Class1.method8()) {
                    boolean b3 = false;
                    for (int j = 0; j < "1234567890".length(); ++j) {
                        if (Class39.field342 == "1234567890".charAt(j)) {
                            b3 = true;
                            break;
                        }
                    }
                    if (Class163.field2016 == 13) {
                        Class78.field1081 = 0;
                        Class78.field1106 = "";
                        Class78.field1086 = "";
                        Class14.field104 = 0;
                        Class28.field238 = "";
                    }
                    else {
                        if (Class163.field2016 == 85 && Class28.field238.length() > 0) {
                            Class28.field238 = Class28.field238.substring(0, Class28.field238.length() - 1);
                        }
                        if (Class163.field2016 == 84) {
                            Class28.field238.trim();
                            if (Class28.field238.length() != 6) {
                                Class2.method22("", "Please enter a 6-digit PIN.", "");
                                return;
                            }
                            Class14.field104 = Integer.parseInt(Class28.field238);
                            Class28.field238 = "";
                            Class87.method2005(true);
                            Class2.method22("", "Connecting to server...", "");
                            Class48.method947(20);
                        }
                        else {
                            if (!b3 || Class28.field238.length() >= 6) {
                                continue;
                            }
                            Class28.field238 += Class39.field342;
                        }
                    }
                }
            }
        }
        else if (Class78.field1081 == 5) {
            final int n32 = Class78.field1090 + 180 - 80;
            final int n33 = 321;
            if (field431 == 1 && n9 >= n32 - 75 && n9 <= n32 + 75 && field432 >= n33 - 20 && field432 <= n33 + 20) {
                Class234.method4590();
                return;
            }
            final int n34 = Class78.field1090 + 180 + 80;
            if (field431 == 1 && n9 >= n34 - 75 && n9 <= n34 + 75 && field432 >= n33 - 20 && field432 <= n33 + 20) {
                Class56.method1030(true);
            }
            while (Class1.method8()) {
                boolean b4 = false;
                for (int k = 0; k < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"?$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++k) {
                    if (Class39.field342 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"?$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(k)) {
                        b4 = true;
                        break;
                    }
                }
                if (Class163.field2016 == 13) {
                    Class56.method1030(true);
                }
                else {
                    if (Class163.field2016 == 85 && Class78.field1106.length() > 0) {
                        Class78.field1106 = Class78.field1106.substring(0, Class78.field1106.length() - 1);
                    }
                    if (Class163.field2016 == 84) {
                        Class234.method4590();
                        return;
                    }
                    if (!b4 || Class78.field1106.length() >= 320) {
                        continue;
                    }
                    Class78.field1106 += Class39.field342;
                }
            }
        }
        else if (Class78.field1081 == 6) {
            while (Class1.method8()) {
                if (Class163.field2016 != 84 && Class163.field2016 != 13) {
                    continue;
                }
                Class56.method1030(true);
            }
            final int n35 = 321;
            if (field431 == 1 && field432 >= n35 - 20 && field432 <= n35 + 20) {
                Class56.method1030(true);
            }
        }
        else if (Class78.field1081 == 7) {
            final int n36 = Class78.field1090 + 180 - 80;
            final int n37 = 321;
            if (field431 == 1 && n9 >= n36 - 75 && n9 <= n36 + 75 && field432 >= n37 - 20 && field432 <= n37 + 20) {
                Class270.method5156(Class142.method3161("secure", true) + "m=dob/set_dob.ws", true, false);
                Class2.method22("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                Class78.field1081 = 6;
                return;
            }
            final int n38 = Class78.field1090 + 180 + 80;
            if (field431 == 1 && n9 >= n38 - 75 && n9 <= n38 + 75 && field432 >= n37 - 20 && field432 <= n37 + 20) {
                Class56.method1030(true);
            }
        }
        else if (Class78.field1081 == 8) {
            final int n39 = Class78.field1090 + 180 - 80;
            final int n40 = 321;
            if (field431 == 1 && n9 >= n39 - 75 && n9 <= n39 + 75 && field432 >= n40 - 20 && field432 <= n40 + 20) {
                Class270.method5156("https://www.jagex.com/terms/privacy/#eight", true, false);
                Class2.method22("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                Class78.field1081 = 6;
                return;
            }
            final int n41 = Class78.field1090 + 180 + 80;
            if (field431 == 1 && n9 >= n41 - 75 && n9 <= n41 + 75 && field432 >= n40 - 20 && field432 <= n40 + 20) {
                Class56.method1030(true);
            }
        }
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(III)I", garbageValue = "1067447403")
    static final int method3805(final int n, final int n2) {
        return (Class110.method2511(n - 1, n2 - 1) + Class110.method2511(1 + n, n2 - 1) + Class110.method2511(n - 1, n2 + 1) + Class110.method2511(1 + n, 1 + n2)) / 16 + (Class110.method2511(n - 1, n2) + Class110.method2511(1 + n, n2) + Class110.method2511(n, n2 - 1) + Class110.method2511(n, 1 + n2)) / 8 + Class110.method2511(n, n2) / 4;
    }
}
