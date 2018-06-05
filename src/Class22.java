import java.io.IOException;
import java.io.File;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("d")
public class Class22
{
    @ObfuscatedName("mu")
    @ObfuscatedSignature(signature = "Lcq;")
    static Class82 field185;
    @ObfuscatedName("do")
    @ObfuscatedSignature(signature = "Lic;")
    static Class249 field183;
    @ObfuscatedName("z")
    String field186;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -595301837)
    int field184;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 252294915)
    int field182;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Ln;")
    Class12 field181;
    
    Class22(final String field186, final int field187, final int field188, final Class12 field189) {
        this.field186 = field186;
        this.field184 = field187;
        this.field182 = field188;
        this.field181 = field189;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lic;IIIBZI)V", garbageValue = "-1235545078")
    static void method280(final Class249 field3155, final int n, final int n2, final int field3156, final byte field3157, final boolean b) {
        final long n3 = (n << 16) + n2;
        if (Class250.field3212.method4020(n3) != null) {
            return;
        }
        if (Class250.field3199.method4020(n3) != null) {
            return;
        }
        final Class246 class246 = (Class246)Class250.field3204.method4020(n3);
        if (class246 != null) {
            if (b) {
                class246.method4101();
                Class250.field3212.method4016(class246, n3);
                --Class250.field3205;
                ++Class250.field3211;
            }
            return;
        }
        if (!b && Class250.field3206.method4020(n3) != null) {
            return;
        }
        final Class246 class247 = new Class246();
        class247.field3155 = field3155;
        class247.field3156 = field3156;
        class247.field3157 = field3157;
        if (b) {
            Class250.field3212.method4016(class247, n3);
            ++Class250.field3211;
        }
        else {
            Class250.field3202.method3910(class247);
            Class250.field3204.method4016(class247, n3);
            ++Class250.field3205;
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "([Lbb;II[I[II)V", garbageValue = "1515419045")
    static void method282(final Class65[] array, final int n, final int n2, final int[] array2, final int[] array3) {
        if (n < n2) {
            int i = n - 1;
            int n3 = n2 + 1;
            final int n4 = (n2 + n) / 2;
            final Class65 class65 = array[n4];
            array[n4] = array[n];
            array[n] = class65;
            while (i < n3) {
                int n5 = 1;
                do {
                    --n3;
                    int j = 0;
                    while (j < 4) {
                        int n6;
                        int n7;
                        if (array2[j] == 2) {
                            n6 = array[n3].field943;
                            n7 = class65.field943;
                        }
                        else if (array2[j] == 1) {
                            n6 = array[n3].field955;
                            n7 = class65.field955;
                            if (n6 == -1 && array3[j] == 1) {
                                n6 = 2001;
                            }
                            if (n7 == -1 && array3[j] == 1) {
                                n7 = 2001;
                            }
                        }
                        else if (array2[j] == 3) {
                            n6 = (array[n3].method1589() ? 1 : 0);
                            n7 = (class65.method1589() ? 1 : 0);
                        }
                        else {
                            n6 = array[n3].field947;
                            n7 = class65.field947;
                        }
                        if (n6 == n7) {
                            if (j == 3) {
                                n5 = 0;
                            }
                            ++j;
                        }
                        else {
                            if (array3[j] == 1 && n6 > n7) {
                                break;
                            }
                            if (array3[j] == 0 && n6 < n7) {
                                break;
                            }
                            n5 = 0;
                            break;
                        }
                    }
                } while (n5 != 0);
                int n8 = 1;
                do {
                    ++i;
                    int k = 0;
                    while (k < 4) {
                        int n9;
                        int n10;
                        if (array2[k] == 2) {
                            n9 = array[i].field943;
                            n10 = class65.field943;
                        }
                        else if (array2[k] == 1) {
                            n9 = array[i].field955;
                            n10 = class65.field955;
                            if (n9 == -1 && array3[k] == 1) {
                                n9 = 2001;
                            }
                            if (n10 == -1 && array3[k] == 1) {
                                n10 = 2001;
                            }
                        }
                        else if (array2[k] == 3) {
                            n9 = (array[i].method1589() ? 1 : 0);
                            n10 = (class65.method1589() ? 1 : 0);
                        }
                        else {
                            n9 = array[i].field947;
                            n10 = class65.field947;
                        }
                        if (n10 == n9) {
                            if (k == 3) {
                                n8 = 0;
                            }
                            ++k;
                        }
                        else {
                            if (array3[k] == 1 && n9 < n10) {
                                break;
                            }
                            if (array3[k] == 0 && n9 > n10) {
                                break;
                            }
                            n8 = 0;
                            break;
                        }
                    }
                } while (n8 != 0);
                if (i < n3) {
                    final Class65 class66 = array[i];
                    array[i] = array[n3];
                    array[n3] = class66;
                }
            }
            method282(array, n, n3, array2, array3);
            method282(array, n3 + 1, n2, array2, array3);
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;Ljava/lang/String;ZI)Ldv;", garbageValue = "1914569734")
    public static Class110 method283(final String s, final String s2, final boolean b) {
        final File file = new File(Class155.field1966, "preferences" + s + ".dat");
        if (file.exists()) {
            try {
                return new Class110(file, "rw", 10000L);
            }
            catch (IOException ex) {}
        }
        String s3 = "";
        if (Class141.field1885 == 33) {
            s3 = "_rc";
        }
        else if (Class141.field1885 == 34) {
            s3 = "_wip";
        }
        final File file2 = new File(Class18.field143, "jagex_" + s2 + "_preferences" + s + s3 + ".dat");
        if (!b && file2.exists()) {
            try {
                return new Class110(file2, "rw", 10000L);
            }
            catch (IOException ex2) {}
        }
        try {
            return new Class110(file, "rw", 10000L);
        }
        catch (IOException ex3) {
            throw new RuntimeException();
        }
    }
    
    @ObfuscatedName("iu")
    @ObfuscatedSignature(signature = "(Lhi;III)V", garbageValue = "-1127848526")
    static void method281(final Class230 class230, final int n, final int n2) {
        if (class230.field2610 == 0) {
            class230.field2618 = class230.field2607;
        }
        else if (class230.field2610 == 1) {
            class230.field2618 = class230.field2607 + (n - class230.field2675) / 2;
        }
        else if (class230.field2610 == 2) {
            class230.field2618 = n - class230.field2675 - class230.field2607;
        }
        else if (class230.field2610 == 3) {
            class230.field2618 = class230.field2607 * n >> 14;
        }
        else if (class230.field2610 == 4) {
            class230.field2618 = (n - class230.field2675) / 2 + (class230.field2607 * n >> 14);
        }
        else {
            class230.field2618 = n - class230.field2675 - (class230.field2607 * n >> 14);
        }
        if (class230.field2611 == 0) {
            class230.field2619 = class230.field2615;
        }
        else if (class230.field2611 == 1) {
            class230.field2619 = (n2 - class230.field2621) / 2 + class230.field2615;
        }
        else if (class230.field2611 == 2) {
            class230.field2619 = n2 - class230.field2621 - class230.field2615;
        }
        else if (class230.field2611 == 3) {
            class230.field2619 = n2 * class230.field2615 >> 14;
        }
        else if (class230.field2611 == 4) {
            class230.field2619 = (n2 - class230.field2621) / 2 + (n2 * class230.field2615 >> 14);
        }
        else {
            class230.field2619 = n2 - class230.field2621 - (n2 * class230.field2615 >> 14);
        }
    }
}
