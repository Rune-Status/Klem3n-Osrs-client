import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("hq")
public class Class223 extends Class204
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lgx;")
    Class202 field2547;
    @ObfuscatedName("w")
    byte[] field2546;
    
    Class223(final Class182 class182) {
        class182.field2339 = class182.payload.length - 3;
        final int method3544 = class182.method3544();
        final int method3545 = class182.method3550();
        int n = method3544 * 10 + 14;
        class182.field2339 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        for (int i = 0; i < method3544; ++i) {
            int n10 = -1;
            while (true) {
                final int method3546 = class182.method3544();
                if (method3546 != n10) {
                    ++n;
                }
                n10 = (method3546 & 0xF);
                if (method3546 == 7) {
                    break;
                }
                if (method3546 == 23) {
                    ++n2;
                }
                else if (n10 == 0) {
                    ++n4;
                }
                else if (n10 == 1) {
                    ++n5;
                }
                else if (n10 == 2) {
                    ++n3;
                }
                else if (n10 == 3) {
                    ++n6;
                }
                else if (n10 == 4) {
                    ++n7;
                }
                else if (n10 == 5) {
                    ++n8;
                }
                else {
                    if (n10 != 6) {
                        throw new RuntimeException();
                    }
                    ++n9;
                }
            }
        }
        final int n11 = n + n2 * 5 + (n4 + n5 + n3 + n6 + n8) * 2 + n7 + n9;
        final int field2339 = class182.field2339;
        for (int n12 = method3544 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9, j = 0; j < n12; ++j) {
            class182.method3566();
        }
        final int n13 = n11 + (class182.field2339 - field2339);
        int field2340 = class182.field2339;
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        int n17 = 0;
        int n18 = 0;
        int n19 = 0;
        int n20 = 0;
        int n21 = 0;
        int n22 = 0;
        int n23 = 0;
        int n24 = 0;
        int n25 = 0;
        int n26 = 0;
        for (int k = 0; k < n3; ++k) {
            n26 = (n26 + class182.method3544() & 0x7F);
            if (n26 != 0 && n26 != 32) {
                if (n26 == 1) {
                    ++n14;
                }
                else if (n26 == 33) {
                    ++n15;
                }
                else if (n26 == 7) {
                    ++n16;
                }
                else if (n26 == 39) {
                    ++n17;
                }
                else if (n26 == 10) {
                    ++n18;
                }
                else if (n26 == 42) {
                    ++n19;
                }
                else if (n26 == 99) {
                    ++n20;
                }
                else if (n26 == 98) {
                    ++n21;
                }
                else if (n26 == 101) {
                    ++n22;
                }
                else if (n26 == 100) {
                    ++n23;
                }
                else if (n26 != 64 && n26 != 65 && n26 != 120 && n26 != 121 && n26 != 123) {
                    ++n25;
                }
                else {
                    ++n24;
                }
            }
            else {
                ++n9;
            }
        }
        int n27 = 0;
        int field2341 = class182.field2339;
        class182.field2339 += n24;
        int field2342 = class182.field2339;
        class182.field2339 += n8;
        int field2343 = class182.field2339;
        class182.field2339 += n7;
        int field2344 = class182.field2339;
        class182.field2339 += n6;
        int field2345 = class182.field2339;
        class182.field2339 += n14;
        int field2346 = class182.field2339;
        class182.field2339 += n16;
        int field2347 = class182.field2339;
        class182.field2339 += n18;
        int field2348 = class182.field2339;
        class182.field2339 += n4 + n5 + n8;
        int field2349 = class182.field2339;
        class182.field2339 += n4;
        int field2350 = class182.field2339;
        class182.field2339 += n25;
        int field2351 = class182.field2339;
        class182.field2339 += n5;
        int field2352 = class182.field2339;
        class182.field2339 += n15;
        int field2353 = class182.field2339;
        class182.field2339 += n17;
        int field2354 = class182.field2339;
        class182.field2339 += n19;
        int field2355 = class182.field2339;
        class182.field2339 += n9;
        int field2356 = class182.field2339;
        class182.field2339 += n6;
        int field2357 = class182.field2339;
        class182.field2339 += n20;
        int field2358 = class182.field2339;
        class182.field2339 += n21;
        int field2359 = class182.field2339;
        class182.field2339 += n22;
        int field2360 = class182.field2339;
        class182.field2339 += n23;
        int field2361 = class182.field2339;
        class182.field2339 += n2 * 3;
        this.field2546 = new byte[n13];
        final Class182 class183 = new Class182(this.field2546);
        class183.method3707(1297377380);
        class183.method3707(6);
        class183.method3755((method3544 > 1) ? 1 : 0);
        class183.method3755(method3544);
        class183.method3755(method3545);
        class182.field2339 = field2339;
        int n28 = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        int n29 = 0;
        byte b4 = 0;
        byte b5 = 0;
        final int[] array = new int[128];
        byte b6 = 0;
        for (int l = 0; l < method3544; ++l) {
            class183.method3707(1297379947);
            final Class182 class184 = class183;
            class184.field2339 += 4;
            final int field2362 = class183.field2339;
            int n30 = -1;
            while (true) {
                class183.method3688(class182.method3566());
                final int n31 = class182.payload[n27++] & 0xFF;
                final boolean b7 = n31 != n30;
                n30 = (n31 & 0xF);
                if (n31 == 7) {
                    if (b7) {
                        class183.method3532(255);
                    }
                    class183.method3532(47);
                    class183.method3532(0);
                    class183.method3543(class183.field2339 - field2362);
                    break;
                }
                if (n31 == 23) {
                    if (b7) {
                        class183.method3532(255);
                    }
                    class183.method3532(81);
                    class183.method3532(3);
                    class183.method3532(class182.payload[field2361++]);
                    class183.method3532(class182.payload[field2361++]);
                    class183.method3532(class182.payload[field2361++]);
                }
                else {
                    n28 ^= n31 >> 4;
                    if (n30 == 0) {
                        if (b7) {
                            class183.method3532(n28 + 144);
                        }
                        b += class182.payload[field2348++];
                        b2 += class182.payload[field2349++];
                        class183.method3532(b & 0x7F);
                        class183.method3532(b2 & 0x7F);
                    }
                    else if (n30 == 1) {
                        if (b7) {
                            class183.method3532(n28 + 128);
                        }
                        b += class182.payload[field2348++];
                        b3 += class182.payload[field2351++];
                        class183.method3532(b & 0x7F);
                        class183.method3532(b3 & 0x7F);
                    }
                    else if (n30 == 2) {
                        if (b7) {
                            class183.method3532(n28 + 176);
                        }
                        b6 = (byte)(b6 + class182.payload[field2340++] & 0x7F);
                        class183.method3532(b6);
                        byte b8;
                        if (b6 != 0 && b6 != 32) {
                            if (b6 == 1) {
                                b8 = class182.payload[field2345++];
                            }
                            else if (b6 == 33) {
                                b8 = class182.payload[field2352++];
                            }
                            else if (b6 == 7) {
                                b8 = class182.payload[field2346++];
                            }
                            else if (b6 == 39) {
                                b8 = class182.payload[field2353++];
                            }
                            else if (b6 == 10) {
                                b8 = class182.payload[field2347++];
                            }
                            else if (b6 == 42) {
                                b8 = class182.payload[field2354++];
                            }
                            else if (b6 == 99) {
                                b8 = class182.payload[field2357++];
                            }
                            else if (b6 == 98) {
                                b8 = class182.payload[field2358++];
                            }
                            else if (b6 == 101) {
                                b8 = class182.payload[field2359++];
                            }
                            else if (b6 == 100) {
                                b8 = class182.payload[field2360++];
                            }
                            else if (b6 != 64 && b6 != 65 && b6 != 120 && b6 != 121 && b6 != 123) {
                                b8 = class182.payload[field2350++];
                            }
                            else {
                                b8 = class182.payload[field2341++];
                            }
                        }
                        else {
                            b8 = class182.payload[field2355++];
                        }
                        class183.method3532((array[b6] += b8) & 0x7F);
                    }
                    else if (n30 == 3) {
                        if (b7) {
                            class183.method3532(n28 + 224);
                        }
                        n29 = n29 + class182.payload[field2356++] + (class182.payload[field2344++] << 7);
                        class183.method3532(n29 & 0x7F);
                        class183.method3532(n29 >> 7 & 0x7F);
                    }
                    else if (n30 == 4) {
                        if (b7) {
                            class183.method3532(n28 + 208);
                        }
                        b4 += class182.payload[field2343++];
                        class183.method3532(b4 & 0x7F);
                    }
                    else if (n30 == 5) {
                        if (b7) {
                            class183.method3532(n28 + 160);
                        }
                        b += class182.payload[field2348++];
                        b5 += class182.payload[field2342++];
                        class183.method3532(b & 0x7F);
                        class183.method3532(b5 & 0x7F);
                    }
                    else {
                        if (n30 != 6) {
                            throw new RuntimeException();
                        }
                        if (b7) {
                            class183.method3532(n28 + 192);
                        }
                        class183.method3532(class182.payload[field2355++]);
                    }
                }
            }
        }
    }
    
    @ObfuscatedName("w")
    void method4412() {
        if (this.field2547 != null) {
            return;
        }
        this.field2547 = new Class202(16);
        final int[] array = new int[16];
        final int[] array2 = new int[16];
        array[9] = (array2[9] = 128);
        final Class220 class220 = new Class220(this.field2546);
        for (int method4331 = class220.method4331(), i = 0; i < method4331; ++i) {
            class220.method4350(i);
            class220.method4335(i);
            class220.method4333(i);
        }
    Label_0423:
        while (true) {
            final int method4332 = class220.method4339();
            while (class220.field2525[method4332] == class220.field2525[method4332]) {
                class220.method4350(method4332);
                final int method4333 = class220.method4336(method4332);
                if (method4333 == 1) {
                    class220.method4334();
                    class220.method4333(method4332);
                    if (!class220.method4340()) {
                        break;
                    }
                    break Label_0423;
                }
                else {
                    final int n = method4333 & 0xF0;
                    if (n == 176) {
                        final int n2 = method4333 & 0xF;
                        final int n3 = method4333 >> 8 & 0x7F;
                        final int n4 = method4333 >> 16 & 0x7F;
                        if (n3 == 0) {
                            array[n2] = (n4 << 14) + (array[n2] & 0xFFE03FFF);
                        }
                        if (n3 == 32) {
                            array[n2] = (array[n2] & 0xFFFFC07F) + (n4 << 7);
                        }
                    }
                    if (n == 192) {
                        final int n5 = method4333 & 0xF;
                        array2[n5] = (method4333 >> 8 & 0x7F) + array[n5];
                    }
                    if (n == 144) {
                        final int n6 = method4333 & 0xF;
                        final int n7 = method4333 >> 8 & 0x7F;
                        if ((method4333 >> 16 & 0x7F) > 0) {
                            final int n8 = array2[n6];
                            Class213 class221 = (Class213)this.field2547.method4020(n8);
                            if (class221 == null) {
                                class221 = new Class213(new byte[128]);
                                this.field2547.method4016(class221, n8);
                            }
                            class221.field2440[n7] = 1;
                        }
                    }
                    class220.method4335(method4332);
                    class220.method4333(method4332);
                }
            }
        }
    }
    
    @ObfuscatedName("s")
    void method4413() {
        this.field2547 = null;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lir;II)Lhq;")
    static Class223 method4415(final Class247 class247, final int n, final int n2) {
        final byte[] method4625 = class247.method4625(n, n2);
        if (method4625 == null) {
            return null;
        }
        return new Class223(new Class182(method4625));
    }
}
