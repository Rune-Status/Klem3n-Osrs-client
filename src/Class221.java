import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("hx")
public class Class221 extends Class204
{
    @ObfuscatedName("em")
    @ObfuscatedGetter(longValue = 2964529997511100277L)
    static long field2535;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 682383381)
    int field2540;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "[Lct;")
    Class93[] field2533;
    @ObfuscatedName("s")
    short[] field2534;
    @ObfuscatedName("l")
    byte[] field2532;
    @ObfuscatedName("u")
    byte[] field2536;
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "[Lho;")
    Class216[] field2537;
    @ObfuscatedName("k")
    byte[] field2538;
    @ObfuscatedName("i")
    int[] field2539;
    
    Class221(final byte[] array) {
        this.field2533 = new Class93[128];
        this.field2534 = new short[128];
        this.field2532 = new byte[128];
        this.field2536 = new byte[128];
        this.field2537 = new Class216[128];
        this.field2538 = new byte[128];
        this.field2539 = new int[128];
        Class182 class182;
        int n;
        for (class182 = new Class182(array), n = 0; class182.payload[n + class182.field2339] != 0; ++n) {}
        final byte[] array2 = new byte[n];
        for (int i = 0; i < n; ++i) {
            array2[i] = class182.method3681();
        }
        final Class182 class183 = class182;
        ++class183.field2339;
        ++n;
        int field2339 = class182.field2339;
        final Class182 class184 = class182;
        class184.field2339 += n;
        int n2;
        for (n2 = 0; class182.payload[n2 + class182.field2339] != 0; ++n2) {}
        final byte[] array3 = new byte[n2];
        for (int j = 0; j < n2; ++j) {
            array3[j] = class182.method3681();
        }
        final Class182 class185 = class182;
        ++class185.field2339;
        ++n2;
        int field2340 = class182.field2339;
        final Class182 class186 = class182;
        class186.field2339 += n2;
        int n3;
        for (n3 = 0; class182.payload[n3 + class182.field2339] != 0; ++n3) {}
        final byte[] array4 = new byte[n3];
        for (int k = 0; k < n3; ++k) {
            array4[k] = class182.method3681();
        }
        final Class182 class187 = class182;
        ++class187.field2339;
        final byte[] array5 = new byte[++n3];
        int n5;
        if (n3 > 1) {
            array5[1] = 1;
            int n4 = 1;
            n5 = 2;
            for (int l = 2; l < n3; ++l) {
                int method3544 = class182.method3544();
                if (method3544 == 0) {
                    n4 = n5++;
                }
                else {
                    if (method3544 <= n4) {
                        --method3544;
                    }
                    n4 = method3544;
                }
                array5[l] = (byte)n4;
            }
        }
        else {
            n5 = n3;
        }
        final Class216[] array6 = new Class216[n5];
        for (int n6 = 0; n6 < array6.length; ++n6) {
            final Class216[] array7 = array6;
            final int n7 = n6;
            final Class216 class188 = new Class216();
            array7[n7] = class188;
            final Class216 class189 = class188;
            final int method3545 = class182.method3544();
            if (method3545 > 0) {
                class189.field2447 = new byte[method3545 * 2];
            }
            final int method3546 = class182.method3544();
            if (method3546 > 0) {
                (class189.field2449 = new byte[method3546 * 2 + 2])[1] = 64;
            }
        }
        final int method3547 = class182.method3544();
        final byte[] array8 = (byte[])((method3547 > 0) ? new byte[method3547 * 2] : null);
        final int method3548 = class182.method3544();
        final byte[] array9 = (byte[])((method3548 > 0) ? new byte[method3548 * 2] : null);
        int n8;
        for (n8 = 0; class182.payload[n8 + class182.field2339] != 0; ++n8) {}
        final byte[] array10 = new byte[n8];
        for (int n9 = 0; n9 < n8; ++n9) {
            array10[n9] = class182.method3681();
        }
        final Class182 class190 = class182;
        ++class190.field2339;
        ++n8;
        int n10 = 0;
        for (int n11 = 0; n11 < 128; ++n11) {
            n10 += class182.method3544();
            this.field2534[n11] = (short)n10;
        }
        int n12 = 0;
        for (int n13 = 0; n13 < 128; ++n13) {
            n12 += class182.method3544();
            final short[] field2341 = this.field2534;
            final int n14 = n13;
            field2341[n14] += (short)(n12 << 8);
        }
        int n15 = 0;
        int n16 = 0;
        int method3549 = 0;
        for (int n17 = 0; n17 < 128; ++n17) {
            if (n15 == 0) {
                if (n16 < array10.length) {
                    n15 = array10[n16++];
                }
                else {
                    n15 = -1;
                }
                method3549 = class182.method3566();
            }
            final short[] field2342 = this.field2534;
            final int n18 = n17;
            field2342[n18] += (short)((method3549 - 1 & 0x2) << 14);
            this.field2539[n17] = method3549;
            --n15;
        }
        int n19 = 0;
        int n20 = 0;
        byte b = 0;
        for (int n21 = 0; n21 < 128; ++n21) {
            if (this.field2539[n21] != 0) {
                if (n19 == 0) {
                    if (n20 < array2.length) {
                        n19 = array2[n20++];
                    }
                    else {
                        n19 = -1;
                    }
                    b = (byte)(class182.payload[field2339++] - 1);
                }
                this.field2538[n21] = b;
                --n19;
            }
        }
        int n22 = 0;
        int n23 = 0;
        int n24 = 0;
        for (int n25 = 0; n25 < 128; ++n25) {
            if (this.field2539[n25] != 0) {
                if (n22 == 0) {
                    if (n23 < array3.length) {
                        n22 = array3[n23++];
                    }
                    else {
                        n22 = -1;
                    }
                    n24 = class182.payload[field2340++] + 16 << 2;
                }
                this.field2536[n25] = (byte)n24;
                --n22;
            }
        }
        int n26 = 0;
        int n27 = 0;
        Class216 class191 = null;
        for (int n28 = 0; n28 < 128; ++n28) {
            if (this.field2539[n28] != 0) {
                if (n26 == 0) {
                    class191 = array6[array5[n27]];
                    if (n27 < array4.length) {
                        n26 = array4[n27++];
                    }
                    else {
                        n26 = -1;
                    }
                }
                this.field2537[n28] = class191;
                --n26;
            }
        }
        int n29 = 0;
        int n30 = 0;
        int n31 = 0;
        for (int n32 = 0; n32 < 128; ++n32) {
            if (n29 == 0) {
                if (n30 < array10.length) {
                    n29 = array10[n30++];
                }
                else {
                    n29 = -1;
                }
                if (this.field2539[n32] > 0) {
                    n31 = class182.method3544() + 1;
                }
            }
            this.field2532[n32] = (byte)n31;
            --n29;
        }
        this.field2540 = class182.method3544() + 1;
        for (final Class216 class192 : array6) {
            if (class192.field2447 != null) {
                for (int n34 = 1; n34 < class192.field2447.length; n34 += 2) {
                    class192.field2447[n34] = class182.method3681();
                }
            }
            if (class192.field2449 != null) {
                for (int n35 = 3; n35 < class192.field2449.length - 2; n35 += 2) {
                    class192.field2449[n35] = class182.method3681();
                }
            }
        }
        if (array8 != null) {
            for (int n36 = 1; n36 < array8.length; n36 += 2) {
                array8[n36] = class182.method3681();
            }
        }
        if (array9 != null) {
            for (int n37 = 1; n37 < array9.length; n37 += 2) {
                array9[n37] = class182.method3681();
            }
        }
        for (final Class216 class193 : array6) {
            if (class193.field2449 != null) {
                int n39 = 0;
                for (int n40 = 2; n40 < class193.field2449.length; n40 += 2) {
                    n39 = 1 + n39 + class182.method3544();
                    class193.field2449[n40] = (byte)n39;
                }
            }
        }
        for (final Class216 class194 : array6) {
            if (class194.field2447 != null) {
                int n42 = 0;
                for (int n43 = 2; n43 < class194.field2447.length; n43 += 2) {
                    n42 = 1 + n42 + class182.method3544();
                    class194.field2447[n43] = (byte)n42;
                }
            }
        }
        if (array8 != null) {
            int method3550 = class182.method3544();
            array8[0] = (byte)method3550;
            for (int n44 = 2; n44 < array8.length; n44 += 2) {
                method3550 = 1 + method3550 + class182.method3544();
                array8[n44] = (byte)method3550;
            }
            byte b2 = array8[0];
            byte b3 = array8[1];
            for (byte b4 = 0; b4 < b2; ++b4) {
                this.field2532[b4] = (byte)(b3 * this.field2532[b4] + 32 >> 6);
            }
            for (int n45 = 2; n45 < array8.length; n45 += 2) {
                final byte b5 = array8[n45];
                final byte b6 = array8[n45 + 1];
                byte b7 = (byte)(b3 * (b5 - b2) + (b5 - b2) / 2);
                for (byte b8 = b2; b8 < b5; ++b8) {
                    final byte b9 = (byte)(b5 - b2);
                    final int n46 = b7 >>> 31;
                    this.field2532[b8] = (byte)(((b7 + n46) / b9 - n46) * this.field2532[b8] + 32 >> 6);
                    b7 += (byte)(b6 - b3);
                }
                b2 = b5;
                b3 = b6;
            }
            for (int n47 = b2; n47 < 128; ++n47) {
                this.field2532[n47] = (byte)(b3 * this.field2532[n47] + 32 >> 6);
            }
        }
        if (array9 != null) {
            int method3551 = class182.method3544();
            array9[0] = (byte)method3551;
            for (int n48 = 2; n48 < array9.length; n48 += 2) {
                method3551 = 1 + method3551 + class182.method3544();
                array9[n48] = (byte)method3551;
            }
            byte b10 = array9[0];
            int n49 = array9[1] << 1;
            for (byte b11 = 0; b11 < b10; ++b11) {
                int n50 = n49 + (this.field2536[b11] & 0xFF);
                if (n50 < 0) {
                    n50 = 0;
                }
                if (n50 > 128) {
                    n50 = 128;
                }
                this.field2536[b11] = (byte)n50;
            }
            for (int n51 = 2; n51 < array9.length; n51 += 2) {
                final byte b12 = array9[n51];
                final int n52 = array9[n51 + 1] << 1;
                byte b13 = (byte)(n49 * (b12 - b10) + (b12 - b10) / 2);
                for (byte b14 = b10; b14 < b12; ++b14) {
                    final byte b15 = (byte)(b12 - b10);
                    final int n53 = b13 >>> 31;
                    int n54 = (n53 + b13) / b15 - n53 + (this.field2536[b14] & 0xFF);
                    if (n54 < 0) {
                        n54 = 0;
                    }
                    if (n54 > 128) {
                        n54 = 128;
                    }
                    this.field2536[b14] = (byte)n54;
                    b13 += (byte)(n52 - n49);
                }
                b10 = b12;
                n49 = n52;
            }
            for (int n55 = b10; n55 < 128; ++n55) {
                int n56 = n49 + (this.field2536[n55] & 0xFF);
                if (n56 < 0) {
                    n56 = 0;
                }
                if (n56 > 128) {
                    n56 = 128;
                }
                this.field2536[n55] = (byte)n56;
            }
        }
        for (int n57 = 0; n57 < n5; ++n57) {
            array6[n57].field2448 = class182.method3544();
        }
        for (final Class216 class195 : array6) {
            if (class195.field2447 != null) {
                class195.field2450 = class182.method3544();
            }
            if (class195.field2449 != null) {
                class195.field2446 = class182.method3544();
            }
            if (class195.field2448 > 0) {
                class195.field2451 = class182.method3544();
            }
        }
        for (int n59 = 0; n59 < n5; ++n59) {
            array6[n59].field2452 = class182.method3544();
        }
        for (final Class216 class196 : array6) {
            if (class196.field2452 > 0) {
                class196.field2453 = class182.method3544();
            }
        }
        for (final Class216 class197 : array6) {
            if (class197.field2453 > 0) {
                class197.field2454 = class182.method3544();
            }
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lcn;[B[IB)Z", garbageValue = "19")
    boolean method4372(final Class98 class98, final byte[] array, final int[] array2) {
        boolean b = true;
        int n = 0;
        Class93 class99 = null;
        for (int i = 0; i < 128; ++i) {
            if (array == null || array[i] != 0) {
                int n2 = this.field2539[i];
                if (n2 != 0) {
                    if (n != n2) {
                        n = n2;
                        if ((--n2 & 0x1) == 0x0) {
                            class99 = class98.method2216(n2 >> 2, array2);
                        }
                        else {
                            class99 = class98.method2220(n2 >> 2, array2);
                        }
                        if (class99 == null) {
                            b = false;
                        }
                    }
                    if (class99 != null) {
                        this.field2533[i] = class99;
                        this.field2539[i] = 0;
                    }
                }
            }
        }
        return b;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1211152813")
    void method4373() {
        this.field2539 = null;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(Lir;Ljava/lang/String;Ljava/lang/String;I)Lly;", garbageValue = "1835582979")
    public static Class317 method4374(final Class247 class247, final String s, final String s2) {
        final int method4642 = class247.method4642(s);
        Class317 method4643;
        if (!Class306.method5660(class247, method4642, class247.method4643(method4642, s2))) {
            method4643 = null;
        }
        else {
            method4643 = Class305.method5658();
        }
        return method4643;
    }
    
    @ObfuscatedName("ix")
    @ObfuscatedSignature(signature = "(Lbu;IIII)V", garbageValue = "-1709674854")
    static final void method4371(final Class60 class60, final int n, final int n2, final int n3) {
        if (Class138.field1876 == class60) {
            return;
        }
        if (Client.field771 >= 400) {
            return;
        }
        String s;
        if (class60.field564 == 0) {
            s = class60.field550[0] + class60.field552 + class60.field550[1] + Class135.method3113(class60.field551, Class138.field1876.field551) + " " + " (" + "level-" + class60.field551 + ")" + class60.field550[2];
        }
        else {
            s = class60.field550[0] + class60.field552 + class60.field550[1] + " " + " (" + "skill-" + class60.field564 + ")" + class60.field550[2];
        }
        if (Client.field733 == 1) {
            Class50.method993("Use", Client.field734 + " " + "->" + " " + Class6.method71(16777215) + s, 14, n, n2, n3);
        }
        else if (Client.field785) {
            if ((Class63.field932 & 0x8) == 0x8) {
                Class50.method993(Client.field612, Client.field739 + " " + "->" + " " + Class6.method71(16777215) + s, 15, n, n2, n3);
            }
        }
        else {
            for (int i = 7; i >= 0; --i) {
                if (Client.field704[i] != null) {
                    int n4 = 0;
                    if (Client.field704[i].equalsIgnoreCase("Attack")) {
                        if (Client.field607 == Class77.field1074) {
                            continue;
                        }
                        if (Client.field607 == Class77.field1075 || (Client.field607 == Class77.field1080 && class60.field551 > Class138.field1876.field551)) {
                            n4 = 2000;
                        }
                        if (Class138.field1876.field568 != 0 && class60.field568 != 0) {
                            if (class60.field568 == Class138.field1876.field568) {
                                n4 = 2000;
                            }
                            else {
                                n4 = 0;
                            }
                        }
                    }
                    else if (Client.field709[i]) {
                        n4 = 2000;
                    }
                    Class50.method993(Client.field704[i], Class6.method71(16777215) + s, Client.field703[i] + n4, n, n2, n3);
                }
            }
        }
        for (int j = 0; j < Client.field771; ++j) {
            if (Client.field720[j] == 23) {
                Client.field740[j] = Class6.method71(16777215) + s;
                break;
            }
        }
    }
}
