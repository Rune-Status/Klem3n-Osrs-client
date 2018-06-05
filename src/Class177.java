import java.io.IOException;
import java.io.File;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("fm")
public class Class177
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    public static Class247 field2284;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 1679580901)
    static int field2283;
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "Lhq;")
    public static Class223 field2285;
    
    static {
        new HashMap();
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;Ljava/lang/String;IIB)V", garbageValue = "29")
    public static void method3509(final String s, final String s2, final int field1885, final int field1886) throws IOException {
        Class148.field1913 = field1886;
        Class141.field1885 = field1885;
        try {
            Class229.field2587 = System.getProperty("os.name");
        }
        catch (Exception ex) {
            Class229.field2587 = "Unknown";
        }
        Class75.field1065 = Class229.field2587.toLowerCase();
        try {
            Class18.field143 = System.getProperty("user.home");
            if (Class18.field143 != null) {
                Class18.field143 += "/";
            }
        }
        catch (Exception ex2) {}
        try {
            if (Class75.field1065.startsWith("win")) {
                if (Class18.field143 == null) {
                    Class18.field143 = System.getenv("USERPROFILE");
                }
            }
            else if (Class18.field143 == null) {
                Class18.field143 = System.getenv("HOME");
            }
            if (Class18.field143 != null) {
                Class18.field143 += "/";
            }
        }
        catch (Exception ex3) {}
        if (Class18.field143 == null) {
            Class18.field143 = "~/";
        }
        Class155.field1965 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class18.field143, "/tmp/", "" };
        Class8.field52 = new String[] { ".jagex_cache_" + Class141.field1885, ".file_store_" + Class141.field1885 };
        int i = 0;
    Label_0286:
        while (i < 4) {
            Class155.field1966 = Class65.method1583(s, s2, i);
            if (!Class155.field1966.exists()) {
                Class155.field1966.mkdirs();
            }
            final File[] listFiles = Class155.field1966.listFiles();
            if (listFiles != null) {
                final File[] array = listFiles;
                for (int j = 0; j < array.length; ++j) {
                    if (!Class70.method1766(array[j], false)) {
                        ++i;
                        continue Label_0286;
                    }
                }
                break;
            }
            break;
        }
        Class158.field1974 = Class155.field1966;
        if (!Class158.field1974.exists()) {
            throw new RuntimeException("");
        }
        Class158.field1979 = true;
        Class29.method476();
        Class155.field1969 = new Class109(new Class110(Class151.method3238("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        Class155.field1970 = new Class109(new Class110(Class151.method3238("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Class76.field1068 = new Class109[Class148.field1913];
        for (int k = 0; k < Class148.field1913; ++k) {
            Class76.field1068[k] = new Class109(new Class110(Class151.method3238("main_file_cache.idx" + k), "rw", 1048576L), 6000, 0);
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgi;I)V", garbageValue = "-2137286029")
    static final void method3512(final Class189 class189) {
        int n = 0;
        class189.method3823();
        for (int i = 0; i < Class81.field1167; ++i) {
            final int n2 = Class81.field1159[i];
            if ((Class81.field1156[n2] & 0x1) == 0x0) {
                if (n > 0) {
                    --n;
                    final byte[] field1156 = Class81.field1156;
                    final int n3 = n2;
                    field1156[n3] |= 0x2;
                }
                else if (class189.method3817(1) == 0) {
                    n = Class168.method3445(class189);
                    final byte[] field1157 = Class81.field1156;
                    final int n4 = n2;
                    field1157[n4] |= 0x2;
                }
                else {
                    Class6.method73(class189, n2);
                }
            }
        }
        class189.method3816();
        if (n != 0) {
            throw new RuntimeException();
        }
        class189.method3823();
        for (int j = 0; j < Class81.field1167; ++j) {
            final int n5 = Class81.field1159[j];
            if ((Class81.field1156[n5] & 0x1) != 0x0) {
                if (n > 0) {
                    --n;
                    final byte[] field1158 = Class81.field1156;
                    final int n6 = n5;
                    field1158[n6] |= 0x2;
                }
                else if (class189.method3817(1) == 0) {
                    n = Class168.method3445(class189);
                    final byte[] field1159 = Class81.field1156;
                    final int n7 = n5;
                    field1159[n7] |= 0x2;
                }
                else {
                    Class6.method73(class189, n5);
                }
            }
        }
        class189.method3816();
        if (n != 0) {
            throw new RuntimeException();
        }
        class189.method3823();
        for (int k = 0; k < Class81.field1160; ++k) {
            final int n8 = Class81.field1161[k];
            if ((Class81.field1156[n8] & 0x1) != 0x0) {
                if (n > 0) {
                    --n;
                    final byte[] field1160 = Class81.field1156;
                    final int n9 = n8;
                    field1160[n9] |= 0x2;
                }
                else if (class189.method3817(1) == 0) {
                    n = Class168.method3445(class189);
                    final byte[] field1161 = Class81.field1156;
                    final int n10 = n8;
                    field1161[n10] |= 0x2;
                }
                else if (Class240.method4601(class189, n8)) {
                    final byte[] field1162 = Class81.field1156;
                    final int n11 = n8;
                    field1162[n11] |= 0x2;
                }
            }
        }
        class189.method3816();
        if (n != 0) {
            throw new RuntimeException();
        }
        class189.method3823();
        for (int l = 0; l < Class81.field1160; ++l) {
            final int n12 = Class81.field1161[l];
            if ((Class81.field1156[n12] & 0x1) == 0x0) {
                if (n > 0) {
                    --n;
                    final byte[] field1163 = Class81.field1156;
                    final int n13 = n12;
                    field1163[n13] |= 0x2;
                }
                else if (class189.method3817(1) == 0) {
                    n = Class168.method3445(class189);
                    final byte[] field1164 = Class81.field1156;
                    final int n14 = n12;
                    field1164[n14] |= 0x2;
                }
                else if (Class240.method4601(class189, n12)) {
                    final byte[] field1165 = Class81.field1156;
                    final int n15 = n12;
                    field1165[n15] |= 0x2;
                }
            }
        }
        class189.method3816();
        if (n != 0) {
            throw new RuntimeException();
        }
        Class81.field1167 = 0;
        Class81.field1160 = 0;
        for (int n16 = 1; n16 < 2048; ++n16) {
            final byte[] field1166 = Class81.field1156;
            final int n17 = n16;
            field1166[n17] >>= 1;
            if (Client.field610[n16] != null) {
                Class81.field1159[++Class81.field1167 - 1] = n16;
            }
            else {
                Class81.field1161[++Class81.field1160 - 1] = n16;
            }
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(IIIII)V", garbageValue = "885632790")
    static final void method3510(final int n, final int n2, final int n3, final int n4) {
        for (int i = n2; i <= n4 + n2; ++i) {
            for (int j = n; j <= n + n3; ++j) {
                if (j >= 0 && j < 104 && i >= 0 && i < 104) {
                    Class50.field447[0][j][i] = 127;
                    if (n == j && j > 0) {
                        Class50.field459[0][j][i] = Class50.field459[0][j - 1][i];
                    }
                    if (j == n + n3 && j < 103) {
                        Class50.field459[0][j][i] = Class50.field459[0][j + 1][i];
                    }
                    if (i == n2 && i > 0) {
                        Class50.field459[0][j][i] = Class50.field459[0][j][i - 1];
                    }
                    if (n4 + n2 == i && i < 103) {
                        Class50.field459[0][j][i] = Class50.field459[0][j][i + 1];
                    }
                }
            }
        }
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-1945852899")
    static void method3507(final int n) {
        final Class53 class53 = (Class53)Class53.field474.method4020(n);
        if (class53 == null) {
            return;
        }
        class53.method4064();
    }
    
    @ObfuscatedName("ed")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "2097572835")
    static final void method3513() {
        Class125.field1760 = false;
        Client.field585 = false;
    }
    
    @ObfuscatedName("jm")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)V", garbageValue = "-280665232")
    static final void method3508(final String s) {
        if (Class14.field94 == null) {
            return;
        }
        final Class172 method433 = Class26.method433(Class169.field2174, Client.field626.field1218);
        method433.field2257.method3532(Class316.method5820(s));
        method433.field2257.method3699(s);
        Client.field626.method1980(method433);
    }
}
