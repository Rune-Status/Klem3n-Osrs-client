import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("au")
public class Class40 implements Class89
{
    @ObfuscatedName("aw")
    static int[] field357;
    @ObfuscatedName("ki")
    @ObfuscatedGetter(intValue = 172478671)
    static int field361;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(B)Lcx;", garbageValue = "39")
    @Override
    public Class95 vmethod2052() {
        return new Class44();
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "1")
    static void method695() {
        Class50.field442 = 99;
        Class50.field445 = new byte[4][104][104];
        Class165.field2033 = new byte[4][104][104];
        Class50.field446 = new byte[4][104][104];
        Class19.field159 = new byte[4][104][104];
        Class37.field325 = new int[4][105][105];
        Class50.field447 = new byte[4][105][105];
        Class50.field448 = new int[105][105];
        Class50.field454 = new int[104];
        Class305.field3725 = new int[104];
        Class72.field1035 = new int[104];
        Class263.field3325 = new int[104];
        Class243.field3137 = new int[104];
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IILfw;Lfk;I)Z", garbageValue = "-1332801903")
    static final boolean method693(final int n, final int n2, final Class166 class166, final Class164 class167) {
        int n3 = n;
        int n4 = n2;
        final int n5 = 64;
        final int n6 = 64;
        final int n7 = n - n5;
        final int n8 = n2 - n6;
        Class165.field2035[n5][n6] = 99;
        Class165.field2041[n5][n6] = 0;
        int n9 = 0;
        int i = 0;
        Class165.field2039[n9] = n3;
        Class165.field2038[n9++] = n4;
        final int[][] field2029 = class167.field2029;
        while (i != n9) {
            n3 = Class165.field2039[i];
            n4 = Class165.field2038[i];
            i = (i + 1 & 0xFFF);
            final int n10 = n3 - n7;
            final int n11 = n4 - n8;
            final int n12 = n3 - class167.field2025;
            final int n13 = n4 - class167.field2026;
            if (class166.vmethod3440(2, n3, n4, class167)) {
                Class19.field152 = n3;
                Class165.field2037 = n4;
                return true;
            }
            final int n14 = Class165.field2041[n10][n11] + 1;
            if (n10 > 0 && Class165.field2035[n10 - 1][n11] == 0) {
                if ((field2029[n12 - 1][n13] & 0x124010E) == 0x0) {
                    if ((field2029[n12 - 1][n13 + 1] & 0x1240138) == 0x0) {
                        Class165.field2039[n9] = n3 - 1;
                        Class165.field2038[n9] = n4;
                        n9 = (n9 + 1 & 0xFFF);
                        Class165.field2035[n10 - 1][n11] = 2;
                        Class165.field2041[n10 - 1][n11] = n14;
                    }
                }
            }
            if (n10 < 126) {
                if (Class165.field2035[n10 + 1][n11] == 0) {
                    if ((field2029[n12 + 2][n13] & 0x1240183) == 0x0) {
                        if ((field2029[n12 + 2][n13 + 1] & 0x12401E0) == 0x0) {
                            Class165.field2039[n9] = n3 + 1;
                            Class165.field2038[n9] = n4;
                            n9 = (n9 + 1 & 0xFFF);
                            Class165.field2035[n10 + 1][n11] = 8;
                            Class165.field2041[n10 + 1][n11] = n14;
                        }
                    }
                }
            }
            if (n11 > 0 && Class165.field2035[n10][n11 - 1] == 0) {
                if ((field2029[n12][n13 - 1] & 0x124010E) == 0x0) {
                    if ((field2029[n12 + 1][n13 - 1] & 0x1240183) == 0x0) {
                        Class165.field2039[n9] = n3;
                        Class165.field2038[n9] = n4 - 1;
                        n9 = (n9 + 1 & 0xFFF);
                        Class165.field2035[n10][n11 - 1] = 1;
                        Class165.field2041[n10][n11 - 1] = n14;
                    }
                }
            }
            if (n11 < 126 && Class165.field2035[n10][n11 + 1] == 0) {
                if ((field2029[n12][n13 + 2] & 0x1240138) == 0x0) {
                    if ((field2029[n12 + 1][n13 + 2] & 0x12401E0) == 0x0) {
                        Class165.field2039[n9] = n3;
                        Class165.field2038[n9] = n4 + 1;
                        n9 = (n9 + 1 & 0xFFF);
                        Class165.field2035[n10][n11 + 1] = 4;
                        Class165.field2041[n10][n11 + 1] = n14;
                    }
                }
            }
            if (n10 > 0 && n11 > 0 && Class165.field2035[n10 - 1][n11 - 1] == 0) {
                if ((field2029[n12 - 1][n13] & 0x124013E) == 0x0) {
                    if ((field2029[n12 - 1][n13 - 1] & 0x124010E) == 0x0) {
                        if ((field2029[n12][n13 - 1] & 0x124018F) == 0x0) {
                            Class165.field2039[n9] = n3 - 1;
                            Class165.field2038[n9] = n4 - 1;
                            n9 = (n9 + 1 & 0xFFF);
                            Class165.field2035[n10 - 1][n11 - 1] = 3;
                            Class165.field2041[n10 - 1][n11 - 1] = n14;
                        }
                    }
                }
            }
            if (n10 < 126 && n11 > 0) {
                if (Class165.field2035[n10 + 1][n11 - 1] == 0) {
                    if ((field2029[n12 + 1][n13 - 1] & 0x124018F) == 0x0) {
                        if ((field2029[n12 + 2][n13 - 1] & 0x1240183) == 0x0) {
                            if ((field2029[n12 + 2][n13] & 0x12401E3) == 0x0) {
                                Class165.field2039[n9] = n3 + 1;
                                Class165.field2038[n9] = n4 - 1;
                                n9 = (n9 + 1 & 0xFFF);
                                Class165.field2035[n10 + 1][n11 - 1] = 9;
                                Class165.field2041[n10 + 1][n11 - 1] = n14;
                            }
                        }
                    }
                }
            }
            if (n10 > 0 && n11 < 126) {
                if (Class165.field2035[n10 - 1][n11 + 1] == 0) {
                    if ((field2029[n12 - 1][n13 + 1] & 0x124013E) == 0x0) {
                        if ((field2029[n12 - 1][n13 + 2] & 0x1240138) == 0x0) {
                            if ((field2029[n12][n13 + 2] & 0x12401F8) == 0x0) {
                                Class165.field2039[n9] = n3 - 1;
                                Class165.field2038[n9] = n4 + 1;
                                n9 = (n9 + 1 & 0xFFF);
                                Class165.field2035[n10 - 1][n11 + 1] = 6;
                                Class165.field2041[n10 - 1][n11 + 1] = n14;
                            }
                        }
                    }
                }
            }
            if (n10 >= 126 || n11 >= 126 || Class165.field2035[n10 + 1][n11 + 1] != 0) {
                continue;
            }
            if ((field2029[n12 + 1][n13 + 2] & 0x12401F8) != 0x0) {
                continue;
            }
            if ((field2029[n12 + 2][n13 + 2] & 0x12401E0) != 0x0) {
                continue;
            }
            if ((field2029[n12 + 2][n13 + 1] & 0x12401E3) != 0x0) {
                continue;
            }
            Class165.field2039[n9] = n3 + 1;
            Class165.field2038[n9] = n4 + 1;
            n9 = (n9 + 1 & 0xFFF);
            Class165.field2035[n10 + 1][n11 + 1] = 12;
            Class165.field2041[n10 + 1][n11 + 1] = n14;
        }
        Class19.field152 = n3;
        Class165.field2037 = n4;
        return false;
    }
    
    @ObfuscatedName("kz")
    @ObfuscatedSignature(signature = "(B)Z", garbageValue = "63")
    static boolean method696() {
        return Client.field747 >= 2;
    }
}
