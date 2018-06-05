import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("m")
public enum Class15 implements Class188
{
    field108("runelite", 0, 2, (byte)0), 
    field107("runelite", 1, 3, (byte)1), 
    field112("runelite", 2, 0, (byte)2), 
    field106("runelite", 3, 1, (byte)3);
    
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -640646291)
    final int field110;
    @ObfuscatedName("q")
    final byte field111;
    
    Class15(final String s, final int n, final int field110, final byte field111) {
        this.field110 = field110;
        this.field111 = field111;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "59")
    @Override
    public int vmethod5815() {
        return this.field111;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)[Lm;", garbageValue = "-1961233435")
    static Class15[] method145() {
        return new Class15[] { Class15.field106, Class15.field107, Class15.field108, Class15.field112 };
    }
    
    @ObfuscatedName("gw")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "2126633421")
    static final void method148() {
        Class14.method137(false);
        Client.field633 = 0;
        int n = 1;
        for (int i = 0; i < Class171.field2252.length; ++i) {
            if (Class295.field3676[i] != -1 && Class171.field2252[i] == null) {
                Class171.field2252[i] = Class246.field3159.method4625(Class295.field3676[i], 0);
                if (Class171.field2252[i] == null) {
                    n = 0;
                    ++Client.field633;
                }
            }
            if (Class9.field56[i] != -1 && Class29.field253[i] == null) {
                Class29.field253[i] = Class246.field3159.method4628(Class9.field56[i], 0, Class67.field973[i]);
                if (Class29.field253[i] == null) {
                    n = 0;
                    ++Client.field633;
                }
            }
        }
        if (n == 0) {
            Client.field751 = 1;
            return;
        }
        Client.field635 = 0;
        boolean b = true;
        for (int j = 0; j < Class171.field2252.length; ++j) {
            final byte[] array = Class29.field253[j];
            if (array != null) {
                int n2 = (Class143.field1900[j] >> 8) * 64 - Class62.field868;
                int n3 = (Class143.field1900[j] & 0xFF) * 64 - Client.field754;
                if (Client.field759) {
                    n2 = 10;
                    n3 = 10;
                }
                b &= Class33.method557(array, n2, n3);
            }
        }
        if (!b) {
            Client.field751 = 2;
            return;
        }
        if (Client.field751 != 0) {
            Class83.method1933("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
        }
        Class54.method1017();
        Class28.field248.method2903();
        for (int k = 0; k < 4; ++k) {
            Client.field642[k].method3392();
        }
        for (int l = 0; l < 4; ++l) {
            for (int n4 = 0; n4 < 104; ++n4) {
                for (int n5 = 0; n5 < 104; ++n5) {
                    Class50.field443[l][n4][n5] = 0;
                }
            }
        }
        Class54.method1017();
        Class40.method695();
        final int length = Class171.field2252.length;
        for (Class68 class68 = (Class68)Class68.field985.method4098(); class68 != null; class68 = (Class68)Class68.field985.method4079()) {
            if (class68.field993 != null) {
                Class36.field310.method2009(class68.field993);
                class68.field993 = null;
            }
            if (class68.field980 != null) {
                Class36.field310.method2009(class68.field980);
                class68.field980 = null;
            }
        }
        Class68.field985.method4072();
        Class14.method137(true);
        if (!Client.field759) {
            for (int n6 = 0; n6 < length; ++n6) {
                final int n7 = (Class143.field1900[n6] >> 8) * 64 - Class62.field868;
                final int n8 = (Class143.field1900[n6] & 0xFF) * 64 - Client.field754;
                final byte[] array2 = Class171.field2252[n6];
                if (array2 != null) {
                    Class54.method1017();
                    final int n9 = Class27.field224 * 8 - 48;
                    final int n10 = Class34.field301 * 8 - 48;
                    final Class164[] field642 = Client.field642;
                    for (int n11 = 0; n11 < 4; ++n11) {
                        for (int n12 = 0; n12 < 64; ++n12) {
                            for (int n13 = 0; n13 < 64; ++n13) {
                                if (n12 + n7 > 0 && n7 + n12 < 103 && n13 + n8 > 0 && n13 + n8 < 103) {
                                    final int[] array3 = field642[n11].field2029[n12 + n7];
                                    final int n14 = n8 + n13;
                                    array3[n14] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    final Class182 class69 = new Class182(array2);
                    for (int n15 = 0; n15 < 4; ++n15) {
                        for (int n16 = 0; n16 < 64; ++n16) {
                            for (int n17 = 0; n17 < 64; ++n17) {
                                Class65.method1603(class69, n15, n16 + n7, n17 + n8, n9, n10, 0);
                            }
                        }
                    }
                }
            }
            for (int n18 = 0; n18 < length; ++n18) {
                final int n19 = (Class143.field1900[n18] >> 8) * 64 - Class62.field868;
                final int n20 = (Class143.field1900[n18] & 0xFF) * 64 - Client.field754;
                if (Class171.field2252[n18] == null && Class34.field301 < 800) {
                    Class54.method1017();
                    Class177.method3510(n19, n20, 64, 64);
                }
            }
            Class14.method137(true);
            for (int n21 = 0; n21 < length; ++n21) {
                final byte[] array4 = Class29.field253[n21];
                if (array4 != null) {
                    final int n22 = (Class143.field1900[n21] >> 8) * 64 - Class62.field868;
                    final int n23 = (Class143.field1900[n21] & 0xFF) * 64 - Client.field754;
                    Class54.method1017();
                    final Class125 field643 = Class28.field248;
                    final Class164[] field644 = Client.field642;
                    final Class182 class70 = new Class182(array4);
                    int n24 = -1;
                    while (true) {
                        final int method3563 = class70.method3563();
                        if (method3563 == 0) {
                            break;
                        }
                        n24 += method3563;
                        int n25 = 0;
                        while (true) {
                            final int method3564 = class70.method3562();
                            if (method3564 == 0) {
                                break;
                            }
                            n25 += method3564 - 1;
                            final int n26 = n25 & 0x3F;
                            final int n27 = n25 >> 6 & 0x3F;
                            final int n28 = n25 >> 12;
                            final int method3565 = class70.method3544();
                            final int n29 = method3565 >> 2;
                            final int n30 = method3565 & 0x3;
                            final int n31 = n22 + n27;
                            final int n32 = n26 + n23;
                            if (n31 <= 0 || n32 <= 0 || n31 >= 103 || n32 >= 103) {
                                continue;
                            }
                            int n33 = n28;
                            if ((Class50.field443[1][n31][n32] & 0x2) == 0x2) {
                                --n33;
                            }
                            Class164 class71 = null;
                            if (n33 >= 0) {
                                class71 = field644[n33];
                            }
                            Class171.method3450(n28, n31, n32, n24, n30, n29, field643, class71);
                        }
                    }
                }
            }
        }
        if (Client.field759) {
            for (int n34 = 0; n34 < 4; ++n34) {
                Class54.method1017();
                for (int n35 = 0; n35 < 13; ++n35) {
                    for (int n36 = 0; n36 < 13; ++n36) {
                        int n37 = 0;
                        final int n38 = Client.field645[n34][n35][n36];
                        if (n38 != -1) {
                            final int n39 = n38 >> 24 & 0x3;
                            final int n40 = n38 >> 1 & 0x3;
                            final int n41 = n38 >> 14 & 0x3FF;
                            final int n42 = n38 >> 3 & 0x7FF;
                            final int n43 = (n41 / 8 << 8) + n42 / 8;
                            for (int n44 = 0; n44 < Class143.field1900.length; ++n44) {
                                if (Class143.field1900[n44] == n43 && Class171.field2252[n44] != null) {
                                    final byte[] array5 = Class171.field2252[n44];
                                    final int n45 = n35 * 8;
                                    final int n46 = n36 * 8;
                                    final int n47 = (n41 & 0x7) * 8;
                                    final int n48 = (n42 & 0x7) * 8;
                                    final Class164[] field645 = Client.field642;
                                    for (int n49 = 0; n49 < 8; ++n49) {
                                        for (int n50 = 0; n50 < 8; ++n50) {
                                            if (n45 + n49 > 0 && n45 + n49 < 103 && n50 + n46 > 0 && n50 + n46 < 103) {
                                                final int[] array6 = field645[n34].field2029[n45 + n49];
                                                final int n51 = n50 + n46;
                                                array6[n51] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    final Class182 class72 = new Class182(array5);
                                    for (int n52 = 0; n52 < 4; ++n52) {
                                        for (int n53 = 0; n53 < 64; ++n53) {
                                            for (int n54 = 0; n54 < 64; ++n54) {
                                                if (n52 == n39 && n53 >= n47 && n53 < n47 + 8 && n54 >= n48 && n54 < n48 + 8) {
                                                    final Class182 class73 = class72;
                                                    final int n55 = n34;
                                                    final int n56 = n45;
                                                    final int n57 = n53 & 0x7;
                                                    final int n58 = n54 & 0x7;
                                                    final int n59 = n40 & 0x3;
                                                    int n60;
                                                    if (n59 == 0) {
                                                        n60 = n57;
                                                    }
                                                    else if (n59 == 1) {
                                                        n60 = n58;
                                                    }
                                                    else if (n59 == 2) {
                                                        n60 = 7 - n57;
                                                    }
                                                    else {
                                                        n60 = 7 - n58;
                                                    }
                                                    Class65.method1603(class73, n55, n60 + n56, n46 + Class75.method1802(n53 & 0x7, n54 & 0x7, n40), 0, 0, n40);
                                                }
                                                else {
                                                    Class65.method1603(class72, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    n37 = 1;
                                    break;
                                }
                            }
                        }
                        if (n37 == 0) {
                            Class160.method3338(n34, n35 * 8, n36 * 8);
                        }
                    }
                }
            }
            for (int n61 = 0; n61 < 13; ++n61) {
                for (int n62 = 0; n62 < 13; ++n62) {
                    if (Client.field645[0][n61][n62] == -1) {
                        Class177.method3510(n61 * 8, n62 * 8, 8, 8);
                    }
                }
            }
            Class14.method137(true);
            for (int n63 = 0; n63 < 4; ++n63) {
                Class54.method1017();
                for (int n64 = 0; n64 < 13; ++n64) {
                    for (int n65 = 0; n65 < 13; ++n65) {
                        final int n66 = Client.field645[n63][n64][n65];
                        if (n66 != -1) {
                            final int n67 = n66 >> 24 & 0x3;
                            final int n68 = n66 >> 1 & 0x3;
                            final int n69 = n66 >> 14 & 0x3FF;
                            final int n70 = n66 >> 3 & 0x7FF;
                            final int n71 = (n69 / 8 << 8) + n70 / 8;
                            for (int n72 = 0; n72 < Class143.field1900.length; ++n72) {
                                if (Class143.field1900[n72] == n71 && Class29.field253[n72] != null) {
                                    final byte[] array7 = Class29.field253[n72];
                                    final int n73 = n64 * 8;
                                    final int n74 = n65 * 8;
                                    final int n75 = (n69 & 0x7) * 8;
                                    final int n76 = (n70 & 0x7) * 8;
                                    final Class125 field646 = Class28.field248;
                                    final Class164[] field647 = Client.field642;
                                    final Class182 class74 = new Class182(array7);
                                    int n77 = -1;
                                    while (true) {
                                        final int method3566 = class74.method3563();
                                        if (method3566 == 0) {
                                            break;
                                        }
                                        n77 += method3566;
                                        int n78 = 0;
                                        while (true) {
                                            final int method3567 = class74.method3562();
                                            if (method3567 == 0) {
                                                break;
                                            }
                                            n78 += method3567 - 1;
                                            final int n79 = n78 & 0x3F;
                                            final int n80 = n78 >> 6 & 0x3F;
                                            final int n81 = n78 >> 12;
                                            final int method3568 = class74.method3544();
                                            final int n82 = method3568 >> 2;
                                            final int n83 = method3568 & 0x3;
                                            if (n67 != n81 || n80 < n75 || n80 >= n75 + 8 || n79 < n76 || n79 >= n76 + 8) {
                                                continue;
                                            }
                                            final Class268 method3569 = Class110.method2527(n77);
                                            final int n84 = n73;
                                            final int n85 = n80 & 0x7;
                                            final int n86 = n79 & 0x7;
                                            final int n87 = n68;
                                            int field648 = method3569.field3384;
                                            int field649 = method3569.field3385;
                                            if ((n83 & 0x1) == 0x1) {
                                                final int n88 = field648;
                                                field648 = field649;
                                                field649 = n88;
                                            }
                                            final int n89 = n87 & 0x3;
                                            int n90;
                                            if (n89 == 0) {
                                                n90 = n85;
                                            }
                                            else if (n89 == 1) {
                                                n90 = n86;
                                            }
                                            else if (n89 == 2) {
                                                n90 = 7 - n85 - (field648 - 1);
                                            }
                                            else {
                                                n90 = 7 - n86 - (field649 - 1);
                                            }
                                            final int n91 = n84 + n90;
                                            final int n92 = n74 + Class86.method1970(n80 & 0x7, n79 & 0x7, n68, method3569.field3384, method3569.field3385, n83);
                                            if (n91 <= 0 || n92 <= 0 || n91 >= 103 || n92 >= 103) {
                                                continue;
                                            }
                                            int n93 = n63;
                                            if ((Class50.field443[1][n91][n92] & 0x2) == 0x2) {
                                                --n93;
                                            }
                                            Class164 class75 = null;
                                            if (n93 >= 0) {
                                                class75 = field647[n93];
                                            }
                                            Class171.method3450(n63, n91, n92, n77, n68 + n83 & 0x3, n82, field646, class75);
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        Class14.method137(true);
        Class54.method1017();
        final Class125 field650 = Class28.field248;
        final Class164[] field651 = Client.field642;
        for (int n94 = 0; n94 < 4; ++n94) {
            for (int n95 = 0; n95 < 104; ++n95) {
                for (int n96 = 0; n96 < 104; ++n96) {
                    if ((Class50.field443[n94][n95][n96] & 0x1) == 0x1) {
                        int n97 = n94;
                        if ((Class50.field443[1][n95][n96] & 0x2) == 0x2) {
                            --n97;
                        }
                        if (n97 >= 0) {
                            field651[n97].method3395(n95, n96);
                        }
                    }
                }
            }
        }
        Class50.field457 += (int)(Math.random() * 5.0) - 2;
        if (Class50.field457 < -8) {
            Class50.field457 = -8;
        }
        if (Class50.field457 > 8) {
            Class50.field457 = 8;
        }
        Class50.field455 += (int)(Math.random() * 5.0) - 2;
        if (Class50.field455 < -16) {
            Class50.field455 = -16;
        }
        if (Class50.field455 > 16) {
            Class50.field455 = 16;
        }
        for (int field652 = 0; field652 < 4; ++field652) {
            final byte[][] array8 = Class50.field447[field652];
            final int n98 = (int)Math.sqrt(5100.0) * 768 >> 8;
            for (int n99 = 1; n99 < 103; ++n99) {
                for (int n100 = 1; n100 < 103; ++n100) {
                    final int n101 = Class50.field459[field652][n100 + 1][n99] - Class50.field459[field652][n100 - 1][n99];
                    final int n102 = Class50.field459[field652][n100][n99 + 1] - Class50.field459[field652][n100][n99 - 1];
                    final int n103 = (int)Math.sqrt(n102 * n102 + n101 * n101 + 65536);
                    Class50.field448[n100][n99] = ((n101 << 8) / n103 * -50 + (n102 << 8) / n103 * -50 + 65536 / n103 * -10) / n98 + 96 - ((array8[n100 - 1][n99] >> 2) + (array8[n100][n99 - 1] >> 2) + (array8[n100 + 1][n99] >> 3) + (array8[n100][n99 + 1] >> 3) + (array8[n100][n99] >> 1));
                }
            }
            for (int n104 = 0; n104 < 104; ++n104) {
                Class50.field454[n104] = 0;
                Class305.field3725[n104] = 0;
                Class72.field1035[n104] = 0;
                Class263.field3325[n104] = 0;
                Class243.field3137[n104] = 0;
            }
            for (int n105 = -5; n105 < 109; ++n105) {
                for (int n106 = 0; n106 < 104; ++n106) {
                    final int n107 = n105 + 5;
                    if (n107 >= 0 && n107 < 104) {
                        final int n108 = Class50.field445[field652][n107][n106] & 0xFF;
                        if (n108 > 0) {
                            final Class259 method3570 = Class49.method953(n108 - 1);
                            final int[] field653 = Class50.field454;
                            final int n109 = n106;
                            field653[n109] += method3570.field3284;
                            final int[] field654 = Class305.field3725;
                            final int n110 = n106;
                            field654[n110] += method3570.field3287;
                            final int[] field655 = Class72.field1035;
                            final int n111 = n106;
                            field655[n111] += method3570.field3286;
                            final int[] field656 = Class263.field3325;
                            final int n112 = n106;
                            field656[n112] += method3570.field3281;
                            final int[] field657 = Class243.field3137;
                            final int n113 = n106;
                            ++field657[n113];
                        }
                    }
                    final int n114 = n105 - 5;
                    if (n114 >= 0 && n114 < 104) {
                        final int n115 = Class50.field445[field652][n114][n106] & 0xFF;
                        if (n115 > 0) {
                            final Class259 method3571 = Class49.method953(n115 - 1);
                            final int[] field658 = Class50.field454;
                            final int n116 = n106;
                            field658[n116] -= method3571.field3284;
                            final int[] field659 = Class305.field3725;
                            final int n117 = n106;
                            field659[n117] -= method3571.field3287;
                            final int[] field660 = Class72.field1035;
                            final int n118 = n106;
                            field660[n118] -= method3571.field3286;
                            final int[] field661 = Class263.field3325;
                            final int n119 = n106;
                            field661[n119] -= method3571.field3281;
                            final int[] field662 = Class243.field3137;
                            final int n120 = n106;
                            --field662[n120];
                        }
                    }
                }
                if (n105 >= 1 && n105 < 103) {
                    int n121 = 0;
                    int n122 = 0;
                    int n123 = 0;
                    int n124 = 0;
                    int n125 = 0;
                    for (int n126 = -5; n126 < 109; ++n126) {
                        final int n127 = n126 + 5;
                        if (n127 >= 0 && n127 < 104) {
                            n121 += Class50.field454[n127];
                            n122 += Class305.field3725[n127];
                            n123 += Class72.field1035[n127];
                            n124 += Class263.field3325[n127];
                            n125 += Class243.field3137[n127];
                        }
                        final int n128 = n126 - 5;
                        if (n128 >= 0 && n128 < 104) {
                            n121 -= Class50.field454[n128];
                            n122 -= Class305.field3725[n128];
                            n123 -= Class72.field1035[n128];
                            n124 -= Class263.field3325[n128];
                            n125 -= Class243.field3137[n128];
                        }
                        if (n126 >= 1 && n126 < 103) {
                            if (!Client.field585 || (Class50.field443[0][n105][n126] & 0x2) != 0x0 || (Class50.field443[field652][n105][n126] & 0x10) == 0x0) {
                                if (field652 < Class50.field442) {
                                    Class50.field442 = field652;
                                }
                                final int n129 = Class50.field445[field652][n105][n126] & 0xFF;
                                final int n130 = Class165.field2033[field652][n105][n126] & 0xFF;
                                if (n129 > 0 || n130 > 0) {
                                    final int n131 = Class50.field459[field652][n105][n126];
                                    final int n132 = Class50.field459[field652][n105 + 1][n126];
                                    final int n133 = Class50.field459[field652][n105 + 1][n126 + 1];
                                    final int n134 = Class50.field459[field652][n105][n126 + 1];
                                    final int n135 = Class50.field448[n105][n126];
                                    final int n136 = Class50.field448[n105 + 1][n126];
                                    final int n137 = Class50.field448[n105 + 1][n126 + 1];
                                    final int n138 = Class50.field448[n105][n126 + 1];
                                    int method3572 = -1;
                                    int method3573 = -1;
                                    if (n129 > 0) {
                                        final int n139 = n121 * 256 / n124;
                                        final int n140 = n122 / n125;
                                        final int n141 = n123 / n125;
                                        method3572 = Class34.method560(n139, n140, n141);
                                        final int n142 = n139 + Class50.field457 & 0xFF;
                                        int n143 = n141 + Class50.field455;
                                        if (n143 < 0) {
                                            n143 = 0;
                                        }
                                        else if (n143 > 255) {
                                            n143 = 255;
                                        }
                                        method3573 = Class34.method560(n142, n140, n143);
                                    }
                                    if (field652 > 0) {
                                        boolean b2 = true;
                                        if (n129 == 0 && Class50.field446[field652][n105][n126] != 0) {
                                            b2 = false;
                                        }
                                        if (n130 > 0 && !Class1.method15(n130 - 1).field3523) {
                                            b2 = false;
                                        }
                                        if (b2 && n131 == n132 && n131 == n133 && n131 == n134) {
                                            final int[] array9 = Class37.field325[field652][n105];
                                            final int n144 = n126;
                                            array9[n144] |= 0x924;
                                        }
                                    }
                                    int n145 = 0;
                                    if (method3573 != -1) {
                                        n145 = Class122.field1675[Class102.method2248(method3573, 96)];
                                    }
                                    if (n130 == 0) {
                                        field650.method3000(field652, n105, n126, 0, 0, -1, n131, n132, n133, n134, Class102.method2248(method3572, n135), Class102.method2248(method3572, n136), Class102.method2248(method3572, n137), Class102.method2248(method3572, n138), 0, 0, 0, 0, n145, 0);
                                    }
                                    else {
                                        final byte b3 = (byte)(Class50.field446[field652][n105][n126] + 1);
                                        final byte b4 = Class19.field159[field652][n105][n126];
                                        final Class272 method3574 = Class1.method15(n130 - 1);
                                        int field663 = method3574.field3526;
                                        int n146;
                                        int method3575;
                                        if (field663 >= 0) {
                                            n146 = Class122.field1667.vmethod3092(field663);
                                            method3575 = -1;
                                        }
                                        else if (method3574.field3533 == 16711935) {
                                            method3575 = -2;
                                            field663 = -1;
                                            n146 = -2;
                                        }
                                        else {
                                            method3575 = Class34.method560(method3574.field3525, method3574.field3530, method3574.field3531);
                                            final int n147 = method3574.field3525 + Class50.field457 & 0xFF;
                                            int n148 = method3574.field3531 + Class50.field455;
                                            if (n148 < 0) {
                                                n148 = 0;
                                            }
                                            else if (n148 > 255) {
                                                n148 = 255;
                                            }
                                            n146 = Class34.method560(n147, method3574.field3530, n148);
                                        }
                                        int n149 = 0;
                                        if (n146 != -2) {
                                            n149 = Class122.field1675[Class30.method519(n146, 96)];
                                        }
                                        if (method3574.field3528 != -1) {
                                            final int n150 = method3574.field3527 + Class50.field457 & 0xFF;
                                            int n151 = method3574.field3534 + Class50.field455;
                                            if (n151 < 0) {
                                                n151 = 0;
                                            }
                                            else if (n151 > 255) {
                                                n151 = 255;
                                            }
                                            n149 = Class122.field1675[Class30.method519(Class34.method560(n150, method3574.field3532, n151), 96)];
                                        }
                                        field650.method3000(field652, n105, n126, b3, b4, field663, n131, n132, n133, n134, Class102.method2248(method3572, n135), Class102.method2248(method3572, n136), Class102.method2248(method3572, n137), Class102.method2248(method3572, n138), Class30.method519(method3575, n135), Class30.method519(method3575, n136), Class30.method519(method3575, n137), Class30.method519(method3575, n138), n145, n149);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int n152 = 1; n152 < 103; ++n152) {
                for (int n153 = 1; n153 < 103; ++n153) {
                    final Class125 class76 = field650;
                    final int n154 = field652;
                    final int n155 = n153;
                    final int n156 = n152;
                    int n157;
                    if ((Class50.field443[field652][n153][n152] & 0x8) != 0x0) {
                        n157 = 0;
                    }
                    else if (field652 > 0 && (Class50.field443[1][n153][n152] & 0x2) != 0x0) {
                        n157 = field652 - 1;
                    }
                    else {
                        n157 = field652;
                    }
                    class76.method2876(n154, n155, n156, n157);
                }
            }
            Class50.field445[field652] = null;
            Class165.field2033[field652] = null;
            Class50.field446[field652] = null;
            Class19.field159[field652] = null;
            Class50.field447[field652] = null;
        }
        field650.method3038(-50, -10, -50);
        for (int n158 = 0; n158 < 104; ++n158) {
            for (int n159 = 0; n159 < 104; ++n159) {
                if ((Class50.field443[1][n158][n159] & 0x2) == 0x2) {
                    field650.method3041(n158, n159);
                }
            }
        }
        int n160 = 1;
        int n161 = 2;
        int n162 = 4;
        for (int n163 = 0; n163 < 4; ++n163) {
            if (n163 > 0) {
                n160 <<= 3;
                n161 <<= 3;
                n162 <<= 3;
            }
            for (int n164 = 0; n164 <= n163; ++n164) {
                for (int n165 = 0; n165 <= 104; ++n165) {
                    for (int n166 = 0; n166 <= 104; ++n166) {
                        if ((Class37.field325[n164][n166][n165] & n160) != 0x0) {
                            int n167 = n165;
                            int n168 = n165;
                            int n169 = n164;
                            int n170 = n164;
                            while (n167 > 0 && (Class37.field325[n164][n166][n167 - 1] & n160) != 0x0) {
                                --n167;
                            }
                            while (n168 < 104 && (Class37.field325[n164][n166][n168 + 1] & n160) != 0x0) {
                                ++n168;
                            }
                        Label_6354:
                            while (n169 > 0) {
                                for (int n171 = n167; n171 <= n168; ++n171) {
                                    if ((Class37.field325[n169 - 1][n166][n171] & n160) == 0x0) {
                                        break Label_6354;
                                    }
                                }
                                --n169;
                            }
                        Label_6471:
                            while (n170 < n163) {
                                for (int n172 = n167; n172 <= n168; ++n172) {
                                    if ((Class37.field325[n170 + 1][n166][n172] & n160) == 0x0) {
                                        break Label_6471;
                                    }
                                }
                                ++n170;
                            }
                            if ((n168 - n167 + 1) * (n170 + 1 - n169) >= 8) {
                                Class125.method2997(n163, 1, n166 * 128, n166 * 128, n167 * 128, n168 * 128 + 128, Class50.field459[n170][n166][n167] - 240, Class50.field459[n169][n166][n167]);
                                for (int n173 = n169; n173 <= n170; ++n173) {
                                    for (int n174 = n167; n174 <= n168; ++n174) {
                                        final int[] array10 = Class37.field325[n173][n166];
                                        final int n175 = n174;
                                        array10[n175] &= ~n160;
                                    }
                                }
                            }
                        }
                        if ((Class37.field325[n164][n166][n165] & n161) != 0x0) {
                            int n176 = n166;
                            int n177 = n166;
                            int n178 = n164;
                            int n179 = n164;
                            while (n176 > 0 && (Class37.field325[n164][n176 - 1][n165] & n161) != 0x0) {
                                --n176;
                            }
                            while (n177 < 104 && (Class37.field325[n164][n177 + 1][n165] & n161) != 0x0) {
                                ++n177;
                            }
                        Label_4976:
                            while (n178 > 0) {
                                for (int n180 = n176; n180 <= n177; ++n180) {
                                    if ((Class37.field325[n178 - 1][n180][n165] & n161) == 0x0) {
                                        break Label_4976;
                                    }
                                }
                                --n178;
                            }
                        Label_5075:
                            while (n179 < n163) {
                                for (int n181 = n176; n181 <= n177; ++n181) {
                                    if ((Class37.field325[n179 + 1][n181][n165] & n161) == 0x0) {
                                        break Label_5075;
                                    }
                                }
                                ++n179;
                            }
                            if ((n177 - n176 + 1) * (n179 + 1 - n178) >= 8) {
                                Class125.method2997(n163, 2, n176 * 128, n177 * 128 + 128, n165 * 128, n165 * 128, Class50.field459[n179][n176][n165] - 240, Class50.field459[n178][n176][n165]);
                                for (int n182 = n178; n182 <= n179; ++n182) {
                                    for (int n183 = n176; n183 <= n177; ++n183) {
                                        final int[] array11 = Class37.field325[n182][n183];
                                        final int n184 = n165;
                                        array11[n184] &= ~n161;
                                    }
                                }
                            }
                        }
                        if ((Class37.field325[n164][n166][n165] & n162) != 0x0) {
                            int n185 = n166;
                            int n186 = n166;
                            int n187 = n165;
                            int n188 = n165;
                            while (n187 > 0 && (Class37.field325[n164][n166][n187 - 1] & n162) != 0x0) {
                                --n187;
                            }
                            while (n188 < 104 && (Class37.field325[n164][n166][n188 + 1] & n162) != 0x0) {
                                ++n188;
                            }
                        Label_5419:
                            while (n185 > 0) {
                                for (int n189 = n187; n189 <= n188; ++n189) {
                                    if ((Class37.field325[n164][n185 - 1][n189] & n162) == 0x0) {
                                        break Label_5419;
                                    }
                                }
                                --n185;
                            }
                        Label_5436:
                            while (n186 < 104) {
                                for (int n190 = n187; n190 <= n188; ++n190) {
                                    if ((Class37.field325[n164][n186 + 1][n190] & n162) == 0x0) {
                                        break Label_5436;
                                    }
                                }
                                ++n186;
                            }
                            if ((n188 - n187 + 1) * (n186 - n185 + 1) >= 4) {
                                final int n191 = Class50.field459[n164][n185][n187];
                                Class125.method2997(n163, 4, n185 * 128, n186 * 128 + 128, n187 * 128, n188 * 128 + 128, n191, n191);
                                for (int n192 = n185; n192 <= n186; ++n192) {
                                    for (int n193 = n187; n193 <= n188; ++n193) {
                                        final int[] array12 = Class37.field325[n164][n192];
                                        final int n194 = n193;
                                        array12[n194] &= ~n162;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Class14.method137(true);
        int n195 = Class50.field442;
        if (n195 > Class13.field82) {
            n195 = Class13.field82;
        }
        if (n195 < Class13.field82 - 1) {
            final int n196 = Class13.field82 - 1;
        }
        if (Client.field585) {
            Class28.field248.method2904(Class50.field442);
        }
        else {
            Class28.field248.method2904(0);
        }
        for (int n197 = 0; n197 < 104; ++n197) {
            for (int n198 = 0; n198 < 104; ++n198) {
                Class253.method4808(n197, n198);
            }
        }
        Class54.method1017();
        Class160.method3342();
        Class268.field3391.method3984();
        if (Class182.field2334.method801()) {
            final Class172 method3576 = Class26.method433(Class169.field2148, Client.field626.field1218);
            method3576.field2257.method3707(1057001181);
            Client.field626.method1980(method3576);
        }
        if (!Client.field759) {
            final int n199 = (Class27.field224 - 6) / 8;
            final int n200 = (Class27.field224 + 6) / 8;
            final int n201 = (Class34.field301 - 6) / 8;
            final int n202 = (Class34.field301 + 6) / 8;
            for (int n203 = n199 - 1; n203 <= n200 + 1; ++n203) {
                for (int n204 = n201 - 1; n204 <= n202 + 1; ++n204) {
                    if (n203 < n199 || n203 > n200 || n204 < n201 || n204 > n202) {
                        Class246.field3159.method4648("m" + n203 + "_" + n204);
                        Class246.field3159.method4648("l" + n203 + "_" + n204);
                    }
                }
            }
        }
        Class48.method947(30);
        Class54.method1017();
        Class49.method952();
        Client.field626.method1980(Class26.method433(Class169.field2224, Client.field626.field1218));
        RunException.timer.vmethod3330();
        for (int n205 = 0; n205 < 32; ++n205) {
            Class47.field394[n205] = 0L;
        }
        for (int n206 = 0; n206 < 32; ++n206) {
            Class47.field404[n206] = 0L;
        }
        Class8.field48 = 0;
    }
}
