import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.io.IOException;
import java.io.File;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bb")
public class Class65
{
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "[Lbb;")
    static Class65[] field949;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -484083453)
    static int field945;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -2045294689)
    static int field944;
    @ObfuscatedName("i")
    static int[] field939;
    @ObfuscatedName("x")
    static int[] field946;
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = -1592935297)
    int field947;
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = -1045794303)
    int field948;
    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = 405776969)
    int field955;
    @ObfuscatedName("f")
    String field950;
    @ObfuscatedName("g")
    String field951;
    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = -2021362795)
    int field952;
    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 777704071)
    int field943;
    
    static {
        Class65.field945 = 0;
        Class65.field944 = 0;
        Class65.field939 = new int[] { 1, 1, 1, 1 };
        Class65.field946 = new int[] { 0, 1, 2, 3 };
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(B)Z", garbageValue = "66")
    boolean method1589() {
        return (0x1 & this.field948) != 0x0;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "-2036146048")
    boolean method1567() {
        return (0x2 & this.field948) != 0x0;
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(B)Z", garbageValue = "83")
    boolean method1568() {
        return (0x4 & this.field948) != 0x0;
    }
    
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "-648432612")
    boolean method1569() {
        return (0x8 & this.field948) != 0x0;
    }
    
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "185165272")
    boolean method1570() {
        return (0x20000000 & this.field948) != 0x0;
    }
    
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "753404361")
    boolean method1577() {
        return (0x2000000 & this.field948) != 0x0;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;Ljava/lang/String;IS)Ljava/io/File;", garbageValue = "-8731")
    static File method1583(final String s, final String s2, final int n) {
        final String s3 = (n == 0) ? "" : ("" + n);
        Class155.field1964 = new File(Class18.field143, "jagex_cl_" + s + "_" + s2 + s3 + ".dat");
        String s4 = null;
        String s5 = null;
        boolean b = false;
        if (Class155.field1964.exists()) {
            try {
                final Class110 class110 = new Class110(Class155.field1964, "rw", 10000L);
                final Class182 class111 = new Class182((int)class110.method2509());
                while (class111.field2339 < class111.payload.length) {
                    final int method2510 = class110.method2510(class111.payload, class111.field2339, class111.payload.length - class111.field2339);
                    if (method2510 == -1) {
                        throw new IOException();
                    }
                    final Class182 class112 = class111;
                    class112.field2339 += method2510;
                }
                class111.field2339 = 0;
                final int method2511 = class111.method3544();
                if (method2511 < 1 || method2511 > 3) {
                    throw new IOException("" + method2511);
                }
                int method2512 = 0;
                if (method2511 > 1) {
                    method2512 = class111.method3544();
                }
                if (method2511 <= 2) {
                    s4 = class111.method3558();
                    if (method2512 == 1) {
                        s5 = class111.method3558();
                    }
                }
                else {
                    s4 = class111.method3559();
                    if (method2512 == 1) {
                        s5 = class111.method3559();
                    }
                }
                class110.method2507();
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
            if (s4 != null && !new File(s4).exists()) {
                s4 = null;
            }
            if (s4 != null && !Class70.method1766(new File(s4, "test.dat"), true)) {
                s4 = null;
            }
        }
        Label_0572: {
            if (s4 == null && n == 0) {
                for (int i = 0; i < Class8.field52.length; ++i) {
                    for (int j = 0; j < Class155.field1965.length; ++j) {
                        final File file = new File(Class155.field1965[j] + Class8.field52[i] + File.separatorChar + s + File.separatorChar);
                        if (file.exists() && Class70.method1766(new File(file, "test.dat"), true)) {
                            s4 = file.toString();
                            b = true;
                            break Label_0572;
                        }
                    }
                }
            }
        }
        if (s4 == null) {
            s4 = Class18.field143 + File.separatorChar + "jagexcache" + s3 + File.separatorChar + s + File.separatorChar + s2 + File.separatorChar;
            b = true;
        }
        if (s5 != null) {
            final File file2 = new File(s5);
            final File file3 = new File(s4);
            try {
                final File[] listFiles = file2.listFiles();
                for (int k = 0; k < listFiles.length; ++k) {
                    final File file4 = listFiles[k];
                    if (!file4.renameTo(new File(file3, file4.getName()))) {
                        throw new IOException();
                    }
                }
            }
            catch (Exception ex2) {
                ex2.printStackTrace();
            }
            b = true;
        }
        if (b) {
            final File file5 = new File(s4);
            final Object o = null;
            try {
                final Class110 class113 = new Class110(Class155.field1964, "rw", 10000L);
                final Class182 class114 = new Class182(500);
                class114.method3532(3);
                class114.method3532((o != null) ? 1 : 0);
                class114.method3541(file5.getPath());
                if (o != null) {
                    class114.method3541("");
                }
                class113.method2506(class114.payload, 0, class114.field2339);
                class113.method2507();
            }
            catch (IOException ex3) {
                ex3.printStackTrace();
            }
        }
        return new File(s4);
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(Lgk;IIIIIIS)V", garbageValue = "-9209")
    static final void method1603(final Class182 class182, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n2 >= 0 && n2 < 104 && n3 >= 0 && n3 < 104) {
            Class50.field443[n][n2][n3] = 0;
            while (true) {
                final int method3544 = class182.method3544();
                if (method3544 == 0) {
                    if (n == 0) {
                        final int[] array = Class50.field459[0][n2];
                        final int n7 = n2 + n4 + 932731;
                        final int n8 = n3 + n5 + 556238;
                        int n9 = (int)((Class32.method549(45365 + n7, n8 + 91923, 4) - 128 + (Class32.method549(10294 + n7, 37821 + n8, 2) - 128 >> 1) + (Class32.method549(n7, n8, 1) - 128 >> 2)) * 0.3) + 35;
                        if (n9 < 10) {
                            n9 = 10;
                        }
                        else if (n9 > 60) {
                            n9 = 60;
                        }
                        array[n3] = -n9 * 8;
                        break;
                    }
                    Class50.field459[n][n2][n3] = Class50.field459[n - 1][n2][n3] - 240;
                    break;
                }
                else if (method3544 == 1) {
                    int method3545 = class182.method3544();
                    if (method3545 == 1) {
                        method3545 = 0;
                    }
                    if (n == 0) {
                        Class50.field459[0][n2][n3] = -method3545 * 8;
                        break;
                    }
                    Class50.field459[n][n2][n3] = Class50.field459[n - 1][n2][n3] - method3545 * 8;
                    break;
                }
                else if (method3544 <= 49) {
                    Class165.field2033[n][n2][n3] = class182.method3681();
                    Class50.field446[n][n2][n3] = (byte)((method3544 - 2) / 4);
                    Class19.field159[n][n2][n3] = (byte)(method3544 - 2 + n6 & 0x3);
                }
                else if (method3544 <= 81) {
                    Class50.field443[n][n2][n3] = (byte)(method3544 - 49);
                }
                else {
                    Class50.field445[n][n2][n3] = (byte)(method3544 - 81);
                }
            }
        }
        else {
            while (true) {
                final int method3546 = class182.method3544();
                if (method3546 == 0) {
                    break;
                }
                if (method3546 == 1) {
                    class182.method3544();
                    break;
                }
                if (method3546 > 49) {
                    continue;
                }
                class182.method3544();
            }
        }
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(ILir;IIIZB)V", garbageValue = "38")
    public static void method1602(final int field37, final Class247 field38, final int field39, final int field40, final int field41, final boolean field42) {
        Class217.field2460 = 1;
        Class138.field1871 = field38;
        Class217.field2461 = field39;
        Class217.field2462 = field40;
        Class309.field3740 = field41;
        Class217.field2463 = field42;
        Class6.field37 = field37;
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(ILce;ZI)I", garbageValue = "168369")
    static int method1605(final int n, final Class84 class84, final boolean b) {
        final Class230 class85 = b ? Class276.field3561 : Class260.field3301;
        if (n == 1500) {
            Class69.field999[++Class69.field1003 - 1] = class85.field2618;
            return 1;
        }
        if (n == 1501) {
            Class69.field999[++Class69.field1003 - 1] = class85.field2619;
            return 1;
        }
        if (n == 1502) {
            Class69.field999[++Class69.field1003 - 1] = class85.field2675;
            return 1;
        }
        if (n == 1503) {
            Class69.field999[++Class69.field1003 - 1] = class85.field2621;
            return 1;
        }
        if (n == 1504) {
            Class69.field999[++Class69.field1003 - 1] = (class85.field2625 ? 1 : 0);
            return 1;
        }
        if (n == 1505) {
            Class69.field999[++Class69.field1003 - 1] = class85.field2605;
            return 1;
        }
        return 2;
    }
    
    @ObfuscatedName("af")
    @ObfuscatedSignature(signature = "(Lev;III)Lcx;", garbageValue = "30833833")
    public static final Class95 method1582(final Signlink class154, final int n, int field1303) {
        if (Class95.field1300 == 0) {
            throw new IllegalStateException();
        }
        if (n < 0 || n >= 2) {
            throw new IllegalArgumentException();
        }
        if (field1303 < 256) {
            field1303 = 256;
        }
        try {
            final Class95 vmethod2052 = Class95.field1297.vmethod2052();
            vmethod2052.field1299 = new int[(Class95.field1295 ? 2 : 1) * 256];
            vmethod2052.field1303 = field1303;
            vmethod2052.vmethod2176();
            vmethod2052.field1302 = (field1303 & 0xFFFFFC00) + 1024;
            if (vmethod2052.field1302 > 16384) {
                vmethod2052.field1302 = 16384;
            }
            vmethod2052.vmethod2163(vmethod2052.field1302);
            if (Class27.field230 > 0 && Class69.field1010 == null) {
                Class69.field1010 = new Class97();
                (Class135.field1855 = Executors.newScheduledThreadPool(1)).scheduleAtFixedRate(Class69.field1010, 0L, 10L, TimeUnit.MILLISECONDS);
            }
            if (Class69.field1010 != null) {
                if (Class69.field1010.field1327[n] != null) {
                    throw new IllegalArgumentException();
                }
                Class69.field1010.field1327[n] = vmethod2052;
            }
            return vmethod2052;
        }
        catch (Throwable t) {
            return new Class95();
        }
    }
    
    @ObfuscatedName("gg")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1540740873")
    static void method1604() {
        final Class172 method433 = Class26.method433(Class169.field2215, Client.field626.field1218);
        method433.field2257.method3532(Client.field792 ? 2 : 1);
        method433.field2257.method3755(Class82.field1179);
        method433.field2257.method3755(Class243.field3138);
        Client.field626.method1980(method433);
    }
}
