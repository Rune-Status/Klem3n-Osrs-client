import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("db")
public class Class113 extends Class127
{
    @ObfuscatedName("ai")
    static int[] field1494;
    @ObfuscatedName("ac")
    static int[] field1475;
    @ObfuscatedName("ap")
    static int field1474;
    @ObfuscatedName("aa")
    static int[] field1497;
    @ObfuscatedName("ar")
    static int[] field1495;
    @ObfuscatedName("z")
    int field1461;
    @ObfuscatedName("w")
    int[] field1460;
    @ObfuscatedName("s")
    int[] field1490;
    @ObfuscatedName("l")
    int[] field1462;
    @ObfuscatedName("u")
    int field1463;
    @ObfuscatedName("q")
    int[] field1477;
    @ObfuscatedName("k")
    int[] field1465;
    @ObfuscatedName("i")
    int[] field1466;
    @ObfuscatedName("x")
    byte[] field1467;
    @ObfuscatedName("e")
    byte[] field1468;
    @ObfuscatedName("p")
    byte[] field1469;
    @ObfuscatedName("b")
    byte[] field1470;
    @ObfuscatedName("n")
    short[] field1471;
    @ObfuscatedName("f")
    short[] field1472;
    @ObfuscatedName("g")
    byte field1473;
    @ObfuscatedName("m")
    int field1484;
    @ObfuscatedName("r")
    byte[] field1459;
    @ObfuscatedName("t")
    short[] field1476;
    @ObfuscatedName("o")
    short[] field1491;
    @ObfuscatedName("y")
    short[] field1464;
    @ObfuscatedName("a")
    int[] field1479;
    @ObfuscatedName("j")
    int[] field1478;
    @ObfuscatedName("d")
    int[][] field1481;
    @ObfuscatedName("h")
    int[][] field1482;
    @ObfuscatedName("c")
    @ObfuscatedSignature(signature = "[Ldj;")
    Class129[] field1483;
    @ObfuscatedName("v")
    @ObfuscatedSignature(signature = "[Ldw;")
    Class121[] field1496;
    @ObfuscatedName("af")
    @ObfuscatedSignature(signature = "[Ldw;")
    Class121[] field1485;
    @ObfuscatedName("ah")
    public short field1486;
    @ObfuscatedName("ab")
    public short field1487;
    @ObfuscatedName("aw")
    boolean field1488;
    @ObfuscatedName("ak")
    int field1489;
    @ObfuscatedName("as")
    int field1480;
    @ObfuscatedName("an")
    int field1492;
    @ObfuscatedName("ao")
    int field1498;
    @ObfuscatedName("at")
    int field1493;
    
    static {
        Class113.field1494 = new int[10000];
        Class113.field1475 = new int[10000];
        Class113.field1474 = 0;
        Class113.field1497 = Class122.field1681;
        Class113.field1495 = Class122.field1693;
    }
    
    Class113() {
        this.field1461 = 0;
        this.field1463 = 0;
        this.field1473 = 0;
        this.field1488 = false;
    }
    
    public Class113(final Class113[] array, final int n) {
        this.field1461 = 0;
        this.field1463 = 0;
        this.field1473 = 0;
        this.field1488 = false;
        boolean b = false;
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;
        boolean b5 = false;
        boolean b6 = false;
        this.field1461 = 0;
        this.field1463 = 0;
        this.field1484 = 0;
        this.field1473 = -1;
        for (final Class113 class113 : array) {
            if (class113 != null) {
                this.field1461 += class113.field1461;
                this.field1463 += class113.field1463;
                this.field1484 += class113.field1484;
                if (class113.field1468 != null) {
                    b2 = true;
                }
                else {
                    if (this.field1473 == -1) {
                        this.field1473 = class113.field1473;
                    }
                    if (this.field1473 != class113.field1473) {
                        b2 = true;
                    }
                }
                b |= (class113.field1467 != null);
                b3 |= (class113.field1469 != null);
                b4 |= (class113.field1478 != null);
                b5 |= (class113.field1472 != null);
                b6 |= (class113.field1470 != null);
            }
        }
        this.field1460 = new int[this.field1461];
        this.field1490 = new int[this.field1461];
        this.field1462 = new int[this.field1461];
        this.field1479 = new int[this.field1461];
        this.field1477 = new int[this.field1463];
        this.field1465 = new int[this.field1463];
        this.field1466 = new int[this.field1463];
        if (b) {
            this.field1467 = new byte[this.field1463];
        }
        if (b2) {
            this.field1468 = new byte[this.field1463];
        }
        if (b3) {
            this.field1469 = new byte[this.field1463];
        }
        if (b4) {
            this.field1478 = new int[this.field1463];
        }
        if (b5) {
            this.field1472 = new short[this.field1463];
        }
        if (b6) {
            this.field1470 = new byte[this.field1463];
        }
        this.field1471 = new short[this.field1463];
        if (this.field1484 > 0) {
            this.field1459 = new byte[this.field1484];
            this.field1476 = new short[this.field1484];
            this.field1491 = new short[this.field1484];
            this.field1464 = new short[this.field1484];
        }
        this.field1461 = 0;
        this.field1463 = 0;
        this.field1484 = 0;
        for (final Class113 class114 : array) {
            if (class114 != null) {
                for (int k = 0; k < class114.field1463; ++k) {
                    if (b && class114.field1467 != null) {
                        this.field1467[this.field1463] = class114.field1467[k];
                    }
                    if (b2) {
                        if (class114.field1468 != null) {
                            this.field1468[this.field1463] = class114.field1468[k];
                        }
                        else {
                            this.field1468[this.field1463] = class114.field1473;
                        }
                    }
                    if (b3 && class114.field1469 != null) {
                        this.field1469[this.field1463] = class114.field1469[k];
                    }
                    if (b4 && class114.field1478 != null) {
                        this.field1478[this.field1463] = class114.field1478[k];
                    }
                    if (b5) {
                        if (class114.field1472 != null) {
                            this.field1472[this.field1463] = class114.field1472[k];
                        }
                        else {
                            this.field1472[this.field1463] = -1;
                        }
                    }
                    if (b6) {
                        if (class114.field1470 != null && class114.field1470[k] != -1) {
                            this.field1470[this.field1463] = (byte)(this.field1484 + class114.field1470[k]);
                        }
                        else {
                            this.field1470[this.field1463] = -1;
                        }
                    }
                    this.field1471[this.field1463] = class114.field1471[k];
                    this.field1477[this.field1463] = this.method2572(class114, class114.field1477[k]);
                    this.field1465[this.field1463] = this.method2572(class114, class114.field1465[k]);
                    this.field1466[this.field1463] = this.method2572(class114, class114.field1466[k]);
                    ++this.field1463;
                }
                for (int l = 0; l < class114.field1484; ++l) {
                    if ((this.field1459[this.field1484] = class114.field1459[l]) == 0) {
                        this.field1476[this.field1484] = (short)this.method2572(class114, class114.field1476[l]);
                        this.field1491[this.field1484] = (short)this.method2572(class114, class114.field1491[l]);
                        this.field1464[this.field1484] = (short)this.method2572(class114, class114.field1464[l]);
                    }
                    ++this.field1484;
                }
            }
        }
    }
    
    Class113(final byte[] array) {
        this.field1461 = 0;
        this.field1463 = 0;
        this.field1473 = 0;
        this.field1488 = false;
        if (array[array.length - 1] == -1 && array[array.length - 2] == -1) {
            this.method2632(array);
        }
        else {
            this.method2570(array);
        }
    }
    
    public Class113(final Class113 class113, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        this.field1461 = 0;
        this.field1463 = 0;
        this.field1473 = 0;
        this.field1488 = false;
        this.field1461 = class113.field1461;
        this.field1463 = class113.field1463;
        this.field1484 = class113.field1484;
        if (b) {
            this.field1460 = class113.field1460;
            this.field1490 = class113.field1490;
            this.field1462 = class113.field1462;
        }
        else {
            this.field1460 = new int[this.field1461];
            this.field1490 = new int[this.field1461];
            this.field1462 = new int[this.field1461];
            for (int i = 0; i < this.field1461; ++i) {
                this.field1460[i] = class113.field1460[i];
                this.field1490[i] = class113.field1490[i];
                this.field1462[i] = class113.field1462[i];
            }
        }
        if (b2) {
            this.field1471 = class113.field1471;
        }
        else {
            this.field1471 = new short[this.field1463];
            for (int j = 0; j < this.field1463; ++j) {
                this.field1471[j] = class113.field1471[j];
            }
        }
        if (b3 || class113.field1472 == null) {
            this.field1472 = class113.field1472;
        }
        else {
            this.field1472 = new short[this.field1463];
            for (int k = 0; k < this.field1463; ++k) {
                this.field1472[k] = class113.field1472[k];
            }
        }
        this.field1469 = class113.field1469;
        this.field1477 = class113.field1477;
        this.field1465 = class113.field1465;
        this.field1466 = class113.field1466;
        this.field1467 = class113.field1467;
        this.field1468 = class113.field1468;
        this.field1470 = class113.field1470;
        this.field1473 = class113.field1473;
        this.field1459 = class113.field1459;
        this.field1476 = class113.field1476;
        this.field1491 = class113.field1491;
        this.field1464 = class113.field1464;
        this.field1479 = class113.field1479;
        this.field1478 = class113.field1478;
        this.field1481 = class113.field1481;
        this.field1482 = class113.field1482;
        this.field1496 = class113.field1496;
        this.field1483 = class113.field1483;
        this.field1485 = class113.field1485;
        this.field1486 = class113.field1486;
        this.field1487 = class113.field1487;
    }
    
    @ObfuscatedName("w")
    void method2632(final byte[] array) {
        final Class182 class182 = new Class182(array);
        final Class182 class183 = new Class182(array);
        final Class182 class184 = new Class182(array);
        final Class182 class185 = new Class182(array);
        final Class182 class186 = new Class182(array);
        final Class182 class187 = new Class182(array);
        final Class182 class188 = new Class182(array);
        class182.field2339 = array.length - 23;
        final int method3550 = class182.method3550();
        final int method3551 = class182.method3550();
        final int method3552 = class182.method3544();
        final int method3553 = class182.method3544();
        final int method3554 = class182.method3544();
        final int method3555 = class182.method3544();
        final int method3556 = class182.method3544();
        final int method3557 = class182.method3544();
        final int method3558 = class182.method3544();
        final int method3559 = class182.method3550();
        final int method3560 = class182.method3550();
        final int method3561 = class182.method3550();
        final int method3562 = class182.method3550();
        final int method3563 = class182.method3550();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        if (method3552 > 0) {
            this.field1459 = new byte[method3552];
            class182.field2339 = 0;
            for (int i = 0; i < method3552; ++i) {
                final byte[] field1459 = this.field1459;
                final int n4 = i;
                final byte method3564 = class182.method3681();
                field1459[n4] = method3564;
                final byte b = method3564;
                if (b == 0) {
                    ++n;
                }
                if (b >= 1 && b <= 3) {
                    ++n2;
                }
                if (b == 2) {
                    ++n3;
                }
            }
        }
        final int field1461;
        final int field1460;
        int n5 = field1460 = (field1461 = method3552) + method3550;
        if (method3553 == 1) {
            n5 += method3551;
        }
        final int field1462 = n5;
        final int field1463;
        int n6 = field1463 = n5 + method3551;
        if (method3554 == 255) {
            n6 += method3551;
        }
        final int field1464 = n6;
        if (method3556 == 1) {
            n6 += method3551;
        }
        final int field1465 = n6;
        if (method3558 == 1) {
            n6 += method3550;
        }
        final int field1466 = n6;
        if (method3555 == 1) {
            n6 += method3551;
        }
        final int field1467 = n6;
        final int field1468;
        int n7 = field1468 = n6 + method3562;
        if (method3557 == 1) {
            n7 += method3551 * 2;
        }
        final int field1469 = n7;
        final int field1480;
        final int field1479;
        final int field1478;
        final int field1477;
        final int field1476;
        final int field1475;
        final int field1474;
        final int field1473;
        final int field1472;
        final int field1471;
        final int field1470 = n2 * 2 + n3 * 2 + (field1471 = (field1472 = n2 * 2 + (field1473 = n2 * 6 + (field1474 = n2 * 6 + (field1475 = n * 6 + (field1476 = (field1477 = (field1478 = (field1479 = method3551 * 2 + (field1480 = n7 + method3563)) + method3559) + method3560) + method3561))))) + n2);
        this.field1461 = method3550;
        this.field1463 = method3551;
        this.field1484 = method3552;
        this.field1460 = new int[method3550];
        this.field1490 = new int[method3550];
        this.field1462 = new int[method3550];
        this.field1477 = new int[method3551];
        this.field1465 = new int[method3551];
        this.field1466 = new int[method3551];
        if (method3558 == 1) {
            this.field1479 = new int[method3550];
        }
        if (method3553 == 1) {
            this.field1467 = new byte[method3551];
        }
        if (method3554 == 255) {
            this.field1468 = new byte[method3551];
        }
        else {
            this.field1473 = (byte)method3554;
        }
        if (method3555 == 1) {
            this.field1469 = new byte[method3551];
        }
        if (method3556 == 1) {
            this.field1478 = new int[method3551];
        }
        if (method3557 == 1) {
            this.field1472 = new short[method3551];
        }
        if (method3557 == 1 && method3552 > 0) {
            this.field1470 = new byte[method3551];
        }
        this.field1471 = new short[method3551];
        if (method3552 > 0) {
            this.field1476 = new short[method3552];
            this.field1491 = new short[method3552];
            this.field1464 = new short[method3552];
        }
        class182.field2339 = field1461;
        class183.field2339 = field1479;
        class184.field2339 = field1478;
        class185.field2339 = field1477;
        class186.field2339 = field1465;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        for (int j = 0; j < method3550; ++j) {
            final int method3565 = class182.method3544();
            int method3566 = 0;
            if ((method3565 & 0x1) != 0x0) {
                method3566 = class183.method3561();
            }
            int method3567 = 0;
            if ((method3565 & 0x2) != 0x0) {
                method3567 = class184.method3561();
            }
            int method3568 = 0;
            if ((method3565 & 0x4) != 0x0) {
                method3568 = class185.method3561();
            }
            this.field1460[j] = n8 + method3566;
            this.field1490[j] = n9 + method3567;
            this.field1462[j] = n10 + method3568;
            n8 = this.field1460[j];
            n9 = this.field1490[j];
            n10 = this.field1462[j];
            if (method3558 == 1) {
                this.field1479[j] = class186.method3544();
            }
        }
        class182.field2339 = field1480;
        class183.field2339 = field1460;
        class184.field2339 = field1463;
        class185.field2339 = field1466;
        class186.field2339 = field1464;
        class187.field2339 = field1468;
        class188.field2339 = field1469;
        for (int k = 0; k < method3551; ++k) {
            this.field1471[k] = (short)class182.method3550();
            if (method3553 == 1) {
                this.field1467[k] = class183.method3681();
            }
            if (method3554 == 255) {
                this.field1468[k] = class184.method3681();
            }
            if (method3555 == 1) {
                this.field1469[k] = class185.method3681();
            }
            if (method3556 == 1) {
                this.field1478[k] = class186.method3544();
            }
            if (method3557 == 1) {
                this.field1472[k] = (short)(class187.method3550() - 1);
            }
            if (this.field1470 != null && this.field1472[k] != -1) {
                this.field1470[k] = (byte)(class188.method3544() - 1);
            }
        }
        class182.field2339 = field1467;
        class183.field2339 = field1462;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        for (int l = 0; l < method3551; ++l) {
            final int method3569 = class183.method3544();
            if (method3569 == 1) {
                n11 = class182.method3561() + n14;
                n12 = class182.method3561() + n11;
                n13 = (n14 = class182.method3561() + n12);
                this.field1477[l] = n11;
                this.field1465[l] = n12;
                this.field1466[l] = n13;
            }
            if (method3569 == 2) {
                n12 = n13;
                n13 = (n14 += class182.method3561());
                this.field1477[l] = n11;
                this.field1465[l] = n12;
                this.field1466[l] = n13;
            }
            if (method3569 == 3) {
                n11 = n13;
                n13 = (n14 += class182.method3561());
                this.field1477[l] = n11;
                this.field1465[l] = n12;
                this.field1466[l] = n13;
            }
            if (method3569 == 4) {
                final int n15 = n11;
                n11 = n12;
                n12 = n15;
                n13 = (n14 += class182.method3561());
                this.field1477[l] = n11;
                this.field1465[l] = n12;
                this.field1466[l] = n13;
            }
        }
        class182.field2339 = field1476;
        class183.field2339 = field1475;
        class184.field2339 = field1474;
        class185.field2339 = field1473;
        class186.field2339 = field1472;
        class187.field2339 = field1471;
        for (int n16 = 0; n16 < method3552; ++n16) {
            if ((this.field1459[n16] & 0xFF) == 0x0) {
                this.field1476[n16] = (short)class182.method3550();
                this.field1491[n16] = (short)class182.method3550();
                this.field1464[n16] = (short)class182.method3550();
            }
        }
        class182.field2339 = field1470;
        if (class182.method3544() != 0) {
            new Class126();
            class182.method3550();
            class182.method3550();
            class182.method3550();
            class182.method3671();
        }
    }
    
    @ObfuscatedName("s")
    void method2570(final byte[] array) {
        boolean b = false;
        boolean b2 = false;
        final Class182 class182 = new Class182(array);
        final Class182 class183 = new Class182(array);
        final Class182 class184 = new Class182(array);
        final Class182 class185 = new Class182(array);
        final Class182 class186 = new Class182(array);
        class182.field2339 = array.length - 18;
        final int method3550 = class182.method3550();
        final int method3551 = class182.method3550();
        final int method3552 = class182.method3544();
        final int method3553 = class182.method3544();
        final int method3554 = class182.method3544();
        final int method3555 = class182.method3544();
        final int method3556 = class182.method3544();
        final int method3557 = class182.method3544();
        final int method3558 = class182.method3550();
        final int method3559 = class182.method3550();
        class182.method3550();
        final int method3560 = class182.method3550();
        final int field2341;
        final int field2340;
        final int field2339;
        int n = field2339 = (field2340 = (field2341 = 0) + method3550) + method3551;
        if (method3554 == 255) {
            n += method3551;
        }
        final int field2342 = n;
        if (method3556 == 1) {
            n += method3551;
        }
        final int field2343 = n;
        if (method3553 == 1) {
            n += method3551;
        }
        final int field2344 = n;
        if (method3557 == 1) {
            n += method3550;
        }
        final int field2345 = n;
        if (method3555 == 1) {
            n += method3551;
        }
        final int field2346 = n;
        final int field2351;
        final int field2350;
        final int field2349;
        final int field2348;
        final int field2347 = (field2348 = (field2349 = method3552 * 6 + (field2350 = method3551 * 2 + (field2351 = n + method3560))) + method3558) + method3559;
        this.field1461 = method3550;
        this.field1463 = method3551;
        this.field1484 = method3552;
        this.field1460 = new int[method3550];
        this.field1490 = new int[method3550];
        this.field1462 = new int[method3550];
        this.field1477 = new int[method3551];
        this.field1465 = new int[method3551];
        this.field1466 = new int[method3551];
        if (method3552 > 0) {
            this.field1459 = new byte[method3552];
            this.field1476 = new short[method3552];
            this.field1491 = new short[method3552];
            this.field1464 = new short[method3552];
        }
        if (method3557 == 1) {
            this.field1479 = new int[method3550];
        }
        if (method3553 == 1) {
            this.field1467 = new byte[method3551];
            this.field1470 = new byte[method3551];
            this.field1472 = new short[method3551];
        }
        if (method3554 == 255) {
            this.field1468 = new byte[method3551];
        }
        else {
            this.field1473 = (byte)method3554;
        }
        if (method3555 == 1) {
            this.field1469 = new byte[method3551];
        }
        if (method3556 == 1) {
            this.field1478 = new int[method3551];
        }
        this.field1471 = new short[method3551];
        class182.field2339 = field2341;
        class183.field2339 = field2349;
        class184.field2339 = field2348;
        class185.field2339 = field2347;
        class186.field2339 = field2344;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        for (int i = 0; i < method3550; ++i) {
            final int method3561 = class182.method3544();
            int method3562 = 0;
            if ((method3561 & 0x1) != 0x0) {
                method3562 = class183.method3561();
            }
            int method3563 = 0;
            if ((method3561 & 0x2) != 0x0) {
                method3563 = class184.method3561();
            }
            int method3564 = 0;
            if ((method3561 & 0x4) != 0x0) {
                method3564 = class185.method3561();
            }
            this.field1460[i] = n2 + method3562;
            this.field1490[i] = n3 + method3563;
            this.field1462[i] = n4 + method3564;
            n2 = this.field1460[i];
            n3 = this.field1490[i];
            n4 = this.field1462[i];
            if (method3557 == 1) {
                this.field1479[i] = class186.method3544();
            }
        }
        class182.field2339 = field2351;
        class183.field2339 = field2343;
        class184.field2339 = field2339;
        class185.field2339 = field2345;
        class186.field2339 = field2342;
        for (int j = 0; j < method3551; ++j) {
            this.field1471[j] = (short)class182.method3550();
            if (method3553 == 1) {
                final int method3565 = class183.method3544();
                if ((method3565 & 0x1) == 0x1) {
                    this.field1467[j] = 1;
                    b = true;
                }
                else {
                    this.field1467[j] = 0;
                }
                if ((method3565 & 0x2) == 0x2) {
                    this.field1470[j] = (byte)(method3565 >> 2);
                    this.field1472[j] = this.field1471[j];
                    this.field1471[j] = 127;
                    if (this.field1472[j] != -1) {
                        b2 = true;
                    }
                }
                else {
                    this.field1470[j] = -1;
                    this.field1472[j] = -1;
                }
            }
            if (method3554 == 255) {
                this.field1468[j] = class184.method3681();
            }
            if (method3555 == 1) {
                this.field1469[j] = class185.method3681();
            }
            if (method3556 == 1) {
                this.field1478[j] = class186.method3544();
            }
        }
        class182.field2339 = field2346;
        class183.field2339 = field2340;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        for (int k = 0; k < method3551; ++k) {
            final int method3566 = class183.method3544();
            if (method3566 == 1) {
                n5 = class182.method3561() + n8;
                n6 = class182.method3561() + n5;
                n7 = (n8 = class182.method3561() + n6);
                this.field1477[k] = n5;
                this.field1465[k] = n6;
                this.field1466[k] = n7;
            }
            if (method3566 == 2) {
                n6 = n7;
                n7 = (n8 += class182.method3561());
                this.field1477[k] = n5;
                this.field1465[k] = n6;
                this.field1466[k] = n7;
            }
            if (method3566 == 3) {
                n5 = n7;
                n7 = (n8 += class182.method3561());
                this.field1477[k] = n5;
                this.field1465[k] = n6;
                this.field1466[k] = n7;
            }
            if (method3566 == 4) {
                final int n9 = n5;
                n5 = n6;
                n6 = n9;
                n7 = (n8 += class182.method3561());
                this.field1477[k] = n5;
                this.field1465[k] = n6;
                this.field1466[k] = n7;
            }
        }
        class182.field2339 = field2350;
        for (int l = 0; l < method3552; ++l) {
            this.field1459[l] = 0;
            this.field1476[l] = (short)class182.method3550();
            this.field1491[l] = (short)class182.method3550();
            this.field1464[l] = (short)class182.method3550();
        }
        if (this.field1470 != null) {
            boolean b3 = false;
            for (int n10 = 0; n10 < method3551; ++n10) {
                final int n11 = this.field1470[n10] & 0xFF;
                if (n11 != 255) {
                    if (this.field1477[n10] == (this.field1476[n11] & 0xFFFF) && this.field1465[n10] == (this.field1491[n11] & 0xFFFF) && this.field1466[n10] == (this.field1464[n11] & 0xFFFF)) {
                        this.field1470[n10] = -1;
                    }
                    else {
                        b3 = true;
                    }
                }
            }
            if (!b3) {
                this.field1470 = null;
            }
        }
        if (!b2) {
            this.field1472 = null;
        }
        if (!b) {
            this.field1467 = null;
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Ldb;I)I")
    final int method2572(final Class113 class113, final int n) {
        int n2 = -1;
        final int n3 = class113.field1460[n];
        final int n4 = class113.field1490[n];
        final int n5 = class113.field1462[n];
        for (int i = 0; i < this.field1461; ++i) {
            if (n3 == this.field1460[i] && n4 == this.field1490[i] && n5 == this.field1462[i]) {
                n2 = i;
                break;
            }
        }
        if (n2 == -1) {
            this.field1460[this.field1461] = n3;
            this.field1490[this.field1461] = n4;
            this.field1462[this.field1461] = n5;
            if (class113.field1479 != null) {
                this.field1479[this.field1461] = class113.field1479[n];
            }
            n2 = this.field1461++;
        }
        return n2;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "()Ldb;")
    public Class113 method2650() {
        final Class113 class113 = new Class113();
        if (this.field1467 != null) {
            class113.field1467 = new byte[this.field1463];
            for (int i = 0; i < this.field1463; ++i) {
                class113.field1467[i] = this.field1467[i];
            }
        }
        class113.field1461 = this.field1461;
        class113.field1463 = this.field1463;
        class113.field1484 = this.field1484;
        class113.field1460 = this.field1460;
        class113.field1490 = this.field1490;
        class113.field1462 = this.field1462;
        class113.field1477 = this.field1477;
        class113.field1465 = this.field1465;
        class113.field1466 = this.field1466;
        class113.field1468 = this.field1468;
        class113.field1469 = this.field1469;
        class113.field1470 = this.field1470;
        class113.field1471 = this.field1471;
        class113.field1472 = this.field1472;
        class113.field1473 = this.field1473;
        class113.field1459 = this.field1459;
        class113.field1476 = this.field1476;
        class113.field1491 = this.field1491;
        class113.field1464 = this.field1464;
        class113.field1479 = this.field1479;
        class113.field1478 = this.field1478;
        class113.field1481 = this.field1481;
        class113.field1482 = this.field1482;
        class113.field1496 = this.field1496;
        class113.field1483 = this.field1483;
        class113.field1486 = this.field1486;
        class113.field1487 = this.field1487;
        return class113;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "([[IIIIZI)Ldb;")
    public Class113 method2567(final int[][] array, final int n, final int n2, final int n3, final boolean b, final int n4) {
        this.method2627();
        final int n5 = n + this.field1480;
        final int n6 = n + this.field1492;
        final int n7 = n3 + this.field1493;
        final int n8 = n3 + this.field1498;
        if (n5 < 0 || n6 + 128 >> 7 >= array.length || n7 < 0 || n8 + 128 >> 7 >= array[0].length) {
            return this;
        }
        final int n9 = n5 >> 7;
        final int n10 = n6 + 127 >> 7;
        final int n11 = n7 >> 7;
        final int n12 = n8 + 127 >> 7;
        if (n2 == array[n9][n11] && n2 == array[n10][n11] && n2 == array[n9][n12] && n2 == array[n10][n12]) {
            return this;
        }
        final Class113 class113 = new Class113();
        class113.field1461 = this.field1461;
        class113.field1463 = this.field1463;
        class113.field1484 = this.field1484;
        class113.field1460 = this.field1460;
        class113.field1462 = this.field1462;
        class113.field1477 = this.field1477;
        class113.field1465 = this.field1465;
        class113.field1466 = this.field1466;
        class113.field1467 = this.field1467;
        class113.field1468 = this.field1468;
        class113.field1469 = this.field1469;
        class113.field1470 = this.field1470;
        class113.field1471 = this.field1471;
        class113.field1472 = this.field1472;
        class113.field1473 = this.field1473;
        class113.field1459 = this.field1459;
        class113.field1476 = this.field1476;
        class113.field1491 = this.field1491;
        class113.field1464 = this.field1464;
        class113.field1479 = this.field1479;
        class113.field1478 = this.field1478;
        class113.field1481 = this.field1481;
        class113.field1482 = this.field1482;
        class113.field1486 = this.field1486;
        class113.field1487 = this.field1487;
        class113.field1490 = new int[class113.field1461];
        if (n4 == 0) {
            for (int i = 0; i < class113.field1461; ++i) {
                final int n13 = n + this.field1460[i];
                final int n14 = n3 + this.field1462[i];
                final int n15 = n13 & 0x7F;
                final int n16 = n14 & 0x7F;
                final int n17 = n13 >> 7;
                final int n18 = n14 >> 7;
                class113.field1490[i] = ((array[n17][n18] * (128 - n15) + array[n17 + 1][n18] * n15 >> 7) * (128 - n16) + (array[n17][n18 + 1] * (128 - n15) + n15 * array[n17 + 1][n18 + 1] >> 7) * n16 >> 7) + this.field1490[i] - n2;
            }
        }
        else {
            for (int j = 0; j < class113.field1461; ++j) {
                final int n19 = (-this.field1490[j] << 16) / super.field1781;
                if (n19 < n4) {
                    final int n20 = n + this.field1460[j];
                    final int n21 = n3 + this.field1462[j];
                    final int n22 = n20 & 0x7F;
                    final int n23 = n21 & 0x7F;
                    final int n24 = n20 >> 7;
                    final int n25 = n21 >> 7;
                    class113.field1490[j] = (n4 - n19) * (((array[n24][n25] * (128 - n22) + array[n24 + 1][n25] * n22 >> 7) * (128 - n23) + (array[n24][n25 + 1] * (128 - n22) + n22 * array[n24 + 1][n25 + 1] >> 7) * n23 >> 7) - n2) / n4 + this.field1490[j];
                }
            }
        }
        class113.method2586();
        return class113;
    }
    
    @ObfuscatedName("i")
    void method2575() {
        if (this.field1479 != null) {
            final int[] array = new int[256];
            int n = 0;
            for (int i = 0; i < this.field1461; ++i) {
                final int n2 = this.field1479[i];
                final int[] array2 = array;
                final int n3 = n2;
                ++array2[n3];
                if (n2 > n) {
                    n = n2;
                }
            }
            this.field1481 = new int[n + 1][];
            for (int j = 0; j <= n; ++j) {
                this.field1481[j] = new int[array[j]];
                array[j] = 0;
            }
            for (int k = 0; k < this.field1461; ++k) {
                final int n4 = this.field1479[k];
                this.field1481[n4][array[n4]++] = k;
            }
            this.field1479 = null;
        }
        if (this.field1478 != null) {
            final int[] array3 = new int[256];
            int n5 = 0;
            for (int l = 0; l < this.field1463; ++l) {
                final int n6 = this.field1478[l];
                final int[] array4 = array3;
                final int n7 = n6;
                ++array4[n7];
                if (n6 > n5) {
                    n5 = n6;
                }
            }
            this.field1482 = new int[n5 + 1][];
            for (int n8 = 0; n8 <= n5; ++n8) {
                this.field1482[n8] = new int[array3[n8]];
                array3[n8] = 0;
            }
            for (int n9 = 0; n9 < this.field1463; ++n9) {
                final int n10 = this.field1478[n9];
                this.field1482[n10][array3[n10]++] = n9;
            }
            this.field1478 = null;
        }
    }
    
    @ObfuscatedName("x")
    public void method2576() {
        for (int i = 0; i < this.field1461; ++i) {
            final int n = this.field1460[i];
            this.field1460[i] = this.field1462[i];
            this.field1462[i] = -n;
        }
        this.method2586();
    }
    
    @ObfuscatedName("p")
    public void method2573() {
        for (int i = 0; i < this.field1461; ++i) {
            this.field1460[i] = -this.field1460[i];
            this.field1462[i] = -this.field1462[i];
        }
        this.method2586();
    }
    
    @ObfuscatedName("b")
    public void method2578() {
        for (int i = 0; i < this.field1461; ++i) {
            final int n = this.field1462[i];
            this.field1462[i] = this.field1460[i];
            this.field1460[i] = -n;
        }
        this.method2586();
    }
    
    @ObfuscatedName("n")
    public void method2653(final int n) {
        final int n2 = Class113.field1497[n];
        final int n3 = Class113.field1495[n];
        for (int i = 0; i < this.field1461; ++i) {
            final int n4 = n2 * this.field1462[i] + n3 * this.field1460[i] >> 16;
            this.field1462[i] = n3 * this.field1462[i] - n2 * this.field1460[i] >> 16;
            this.field1460[i] = n4;
        }
        this.method2586();
    }
    
    @ObfuscatedName("f")
    public void method2580(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.field1461; ++i) {
            final int[] field1460 = this.field1460;
            final int n4 = i;
            field1460[n4] += n;
            final int[] field1461 = this.field1490;
            final int n5 = i;
            field1461[n5] += n2;
            final int[] field1462 = this.field1462;
            final int n6 = i;
            field1462[n6] += n3;
        }
        this.method2586();
    }
    
    @ObfuscatedName("g")
    public void method2581(final short n, final short n2) {
        for (int i = 0; i < this.field1463; ++i) {
            if (this.field1471[i] == n) {
                this.field1471[i] = n2;
            }
        }
    }
    
    @ObfuscatedName("m")
    public void method2582(final short n, final short n2) {
        if (this.field1472 == null) {
            return;
        }
        for (int i = 0; i < this.field1463; ++i) {
            if (this.field1472[i] == n) {
                this.field1472[i] = n2;
            }
        }
    }
    
    @ObfuscatedName("r")
    public void method2583() {
        for (int i = 0; i < this.field1461; ++i) {
            this.field1462[i] = -this.field1462[i];
        }
        for (int j = 0; j < this.field1463; ++j) {
            final int n = this.field1477[j];
            this.field1477[j] = this.field1466[j];
            this.field1466[j] = n;
        }
        this.method2586();
    }
    
    @ObfuscatedName("t")
    public void method2592(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.field1461; ++i) {
            this.field1460[i] = this.field1460[i] * n / 128;
            this.field1490[i] = n2 * this.field1490[i] / 128;
            this.field1462[i] = n3 * this.field1462[i] / 128;
        }
        this.method2586();
    }
    
    @ObfuscatedName("o")
    public void method2585() {
        if (this.field1496 != null) {
            return;
        }
        this.field1496 = new Class121[this.field1461];
        for (int i = 0; i < this.field1461; ++i) {
            this.field1496[i] = new Class121();
        }
        for (int j = 0; j < this.field1463; ++j) {
            final int n = this.field1477[j];
            final int n2 = this.field1465[j];
            final int n3 = this.field1466[j];
            final int n4 = this.field1460[n2] - this.field1460[n];
            final int n5 = this.field1490[n2] - this.field1490[n];
            final int n6 = this.field1462[n2] - this.field1462[n];
            final int n7 = this.field1460[n3] - this.field1460[n];
            final int n8 = this.field1490[n3] - this.field1490[n];
            final int n9 = this.field1462[n3] - this.field1462[n];
            int n10;
            int n11;
            int n12;
            for (n10 = n5 * n9 - n8 * n6, n11 = n6 * n7 - n9 * n4, n12 = n4 * n8 - n7 * n5; n10 > 8192 || n11 > 8192 || n12 > 8192 || n10 < -8192 || n11 < -8192 || n12 < -8192; n10 >>= 1, n11 >>= 1, n12 >>= 1) {}
            int n13 = (int)Math.sqrt(n10 * n10 + n11 * n11 + n12 * n12);
            if (n13 <= 0) {
                n13 = 1;
            }
            final int field1793 = n10 * 256 / n13;
            final int field1794 = n11 * 256 / n13;
            final int field1795 = n12 * 256 / n13;
            byte b;
            if (this.field1467 == null) {
                b = 0;
            }
            else {
                b = this.field1467[j];
            }
            if (b == 0) {
                final Class121 class122;
                final Class121 class121 = class122 = this.field1496[n];
                class122.field1665 += field1793;
                final Class121 class123 = class121;
                class123.field1661 += field1794;
                final Class121 class124 = class121;
                class124.field1662 += field1795;
                final Class121 class125 = class121;
                ++class125.field1666;
                final Class121 class127;
                final Class121 class126 = class127 = this.field1496[n2];
                class127.field1665 += field1793;
                final Class121 class128 = class126;
                class128.field1661 += field1794;
                final Class121 class129 = class126;
                class129.field1662 += field1795;
                final Class121 class130 = class126;
                ++class130.field1666;
                final Class121 class132;
                final Class121 class131 = class132 = this.field1496[n3];
                class132.field1665 += field1793;
                final Class121 class133 = class131;
                class133.field1661 += field1794;
                final Class121 class134 = class131;
                class134.field1662 += field1795;
                final Class121 class135 = class131;
                ++class135.field1666;
            }
            else if (b == 1) {
                if (this.field1483 == null) {
                    this.field1483 = new Class129[this.field1463];
                }
                final Class129[] field1796 = this.field1483;
                final int n14 = j;
                final Class129 class136 = new Class129();
                field1796[n14] = class136;
                final Class129 class137 = class136;
                class137.field1793 = field1793;
                class137.field1794 = field1794;
                class137.field1795 = field1795;
            }
        }
    }
    
    @ObfuscatedName("y")
    void method2586() {
        this.field1496 = null;
        this.field1485 = null;
        this.field1483 = null;
        this.field1488 = false;
    }
    
    @ObfuscatedName("a")
    void method2627() {
        if (this.field1488) {
            return;
        }
        super.field1781 = 0;
        this.field1489 = 0;
        this.field1480 = 999999;
        this.field1492 = -999999;
        this.field1498 = -99999;
        this.field1493 = 99999;
        for (int i = 0; i < this.field1461; ++i) {
            final int n = this.field1460[i];
            final int field1489 = this.field1490[i];
            final int n2 = this.field1462[i];
            if (n < this.field1480) {
                this.field1480 = n;
            }
            if (n > this.field1492) {
                this.field1492 = n;
            }
            if (n2 < this.field1493) {
                this.field1493 = n2;
            }
            if (n2 > this.field1498) {
                this.field1498 = n2;
            }
            if (-field1489 > super.field1781) {
                super.field1781 = -field1489;
            }
            if (field1489 > this.field1489) {
                this.field1489 = field1489;
            }
        }
        this.field1488 = true;
    }
    
    @ObfuscatedName("v")
    @ObfuscatedSignature(signature = "(IIIII)Ldc;")
    public final Class119 method2589(final int n, final int n2, final int n3, final int n4, final int n5) {
        this.method2585();
        final int n6 = (int)Math.sqrt(n5 * n5 + n3 * n3 + n4 * n4) * n2 >> 8;
        final Class119 class119 = new Class119();
        class119.field1615 = new int[this.field1463];
        class119.field1620 = new int[this.field1463];
        class119.field1591 = new int[this.field1463];
        if (this.field1484 > 0 && this.field1470 != null) {
            final int[] array = new int[this.field1484];
            for (int i = 0; i < this.field1463; ++i) {
                if (this.field1470[i] != -1) {
                    final int[] array2 = array;
                    final int n7 = this.field1470[i] & 0xFF;
                    ++array2[n7];
                }
            }
            class119.field1597 = 0;
            for (int j = 0; j < this.field1484; ++j) {
                if (array[j] > 0 && this.field1459[j] == 0) {
                    final Class119 class120 = class119;
                    ++class120.field1597;
                }
            }
            class119.field1621 = new int[class119.field1597];
            class119.field1599 = new int[class119.field1597];
            class119.field1600 = new int[class119.field1597];
            int n8 = 0;
            for (int k = 0; k < this.field1484; ++k) {
                if (array[k] > 0 && this.field1459[k] == 0) {
                    class119.field1621[n8] = (this.field1476[k] & 0xFFFF);
                    class119.field1599[n8] = (this.field1491[k] & 0xFFFF);
                    class119.field1600[n8] = (this.field1464[k] & 0xFFFF);
                    array[k] = n8++;
                }
                else {
                    array[k] = -1;
                }
            }
            class119.field1617 = new byte[this.field1463];
            for (int l = 0; l < this.field1463; ++l) {
                if (this.field1470[l] != -1) {
                    class119.field1617[l] = (byte)array[this.field1470[l] & 0xFF];
                }
                else {
                    class119.field1617[l] = -1;
                }
            }
        }
        for (int n9 = 0; n9 < this.field1463; ++n9) {
            int n10;
            if (this.field1467 == null) {
                n10 = 0;
            }
            else {
                n10 = this.field1467[n9];
            }
            byte b;
            if (this.field1469 == null) {
                b = 0;
            }
            else {
                b = this.field1469[n9];
            }
            int n11;
            if (this.field1472 == null) {
                n11 = -1;
            }
            else {
                n11 = this.field1472[n9];
            }
            if (b == -2) {
                n10 = 3;
            }
            if (b == -1) {
                n10 = 2;
            }
            if (n11 == -1) {
                if (n10 == 0) {
                    final int n12 = this.field1471[n9] & 0xFFFF;
                    Class121 class121;
                    if (this.field1485 != null && this.field1485[this.field1477[n9]] != null) {
                        class121 = this.field1485[this.field1477[n9]];
                    }
                    else {
                        class121 = this.field1496[this.field1477[n9]];
                    }
                    class119.field1615[n9] = method2590(n12, (n4 * class121.field1661 + n5 * class121.field1662 + n3 * class121.field1665) / (n6 * class121.field1666) + n);
                    Class121 class122;
                    if (this.field1485 != null && this.field1485[this.field1465[n9]] != null) {
                        class122 = this.field1485[this.field1465[n9]];
                    }
                    else {
                        class122 = this.field1496[this.field1465[n9]];
                    }
                    class119.field1620[n9] = method2590(n12, (n4 * class122.field1661 + n5 * class122.field1662 + n3 * class122.field1665) / (n6 * class122.field1666) + n);
                    Class121 class123;
                    if (this.field1485 != null && this.field1485[this.field1466[n9]] != null) {
                        class123 = this.field1485[this.field1466[n9]];
                    }
                    else {
                        class123 = this.field1496[this.field1466[n9]];
                    }
                    class119.field1591[n9] = method2590(n12, (n4 * class123.field1661 + n5 * class123.field1662 + n3 * class123.field1665) / (n6 * class123.field1666) + n);
                }
                else if (n10 == 1) {
                    final Class129 class124 = this.field1483[n9];
                    class119.field1615[n9] = method2590(this.field1471[n9] & 0xFFFF, (n4 * class124.field1794 + n5 * class124.field1795 + n3 * class124.field1793) / (n6 / 2 + n6) + n);
                    class119.field1591[n9] = -1;
                }
                else if (n10 == 3) {
                    class119.field1615[n9] = 128;
                    class119.field1591[n9] = -1;
                }
                else {
                    class119.field1591[n9] = -2;
                }
            }
            else if (n10 == 0) {
                Class121 class125;
                if (this.field1485 != null && this.field1485[this.field1477[n9]] != null) {
                    class125 = this.field1485[this.field1477[n9]];
                }
                else {
                    class125 = this.field1496[this.field1477[n9]];
                }
                class119.field1615[n9] = method2591((n4 * class125.field1661 + n5 * class125.field1662 + n3 * class125.field1665) / (n6 * class125.field1666) + n);
                Class121 class126;
                if (this.field1485 != null && this.field1485[this.field1465[n9]] != null) {
                    class126 = this.field1485[this.field1465[n9]];
                }
                else {
                    class126 = this.field1496[this.field1465[n9]];
                }
                class119.field1620[n9] = method2591((n4 * class126.field1661 + n5 * class126.field1662 + n3 * class126.field1665) / (n6 * class126.field1666) + n);
                Class121 class127;
                if (this.field1485 != null && this.field1485[this.field1466[n9]] != null) {
                    class127 = this.field1485[this.field1466[n9]];
                }
                else {
                    class127 = this.field1496[this.field1466[n9]];
                }
                class119.field1591[n9] = method2591((n4 * class127.field1661 + n5 * class127.field1662 + n3 * class127.field1665) / (n6 * class127.field1666) + n);
            }
            else if (n10 == 1) {
                final Class129 class128 = this.field1483[n9];
                class119.field1615[n9] = method2591((n4 * class128.field1794 + n5 * class128.field1795 + n3 * class128.field1793) / (n6 / 2 + n6) + n);
                class119.field1591[n9] = -1;
            }
            else {
                class119.field1591[n9] = -2;
            }
        }
        this.method2575();
        class119.field1581 = this.field1461;
        class119.field1646 = this.field1460;
        class119.field1583 = this.field1490;
        class119.field1584 = this.field1462;
        class119.field1585 = this.field1463;
        class119.field1586 = this.field1477;
        class119.field1587 = this.field1465;
        class119.field1588 = this.field1466;
        class119.field1645 = this.field1468;
        class119.field1593 = this.field1469;
        class119.field1596 = this.field1473;
        class119.field1601 = this.field1481;
        class119.field1602 = this.field1482;
        class119.field1604 = this.field1472;
        return class119;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lir;II)Ldb;")
    public static Class113 method2568(final Class247 class247, final int n, final int n2) {
        final byte[] method4625 = class247.method4625(n, n2);
        if (method4625 == null) {
            return null;
        }
        return new Class113(method4625);
    }
    
    @ObfuscatedName("c")
    @ObfuscatedSignature(signature = "(Ldb;Ldb;IIIZ)V")
    static void method2588(final Class113 class113, final Class113 class114, final int n, final int n2, final int n3, final boolean b) {
        class113.method2627();
        class113.method2585();
        class114.method2627();
        class114.method2585();
        ++Class113.field1474;
        int n4 = 0;
        final int[] field1460 = class114.field1460;
        final int field1461 = class114.field1461;
        for (int i = 0; i < class113.field1461; ++i) {
            final Class121 class115 = class113.field1496[i];
            if (class115.field1666 != 0) {
                final int n5 = class113.field1490[i] - n2;
                if (n5 <= class114.field1489) {
                    final int n6 = class113.field1460[i] - n;
                    if (n6 >= class114.field1480) {
                        if (n6 <= class114.field1492) {
                            final int n7 = class113.field1462[i] - n3;
                            if (n7 >= class114.field1493) {
                                if (n7 <= class114.field1498) {
                                    for (int j = 0; j < field1461; ++j) {
                                        final Class121 class116 = class114.field1496[j];
                                        if (n6 == field1460[j] && n7 == class114.field1462[j] && n5 == class114.field1490[j] && class116.field1666 != 0) {
                                            if (class113.field1485 == null) {
                                                class113.field1485 = new Class121[class113.field1461];
                                            }
                                            if (class114.field1485 == null) {
                                                class114.field1485 = new Class121[field1461];
                                            }
                                            Class121 class117 = class113.field1485[i];
                                            if (class117 == null) {
                                                final Class121[] field1462 = class113.field1485;
                                                final int n8 = i;
                                                final Class121 class118 = new Class121(class115);
                                                field1462[n8] = class118;
                                                class117 = class118;
                                            }
                                            Class121 class119 = class114.field1485[j];
                                            if (class119 == null) {
                                                final Class121[] field1463 = class114.field1485;
                                                final int n9 = j;
                                                final Class121 class120 = new Class121(class116);
                                                field1463[n9] = class120;
                                                class119 = class120;
                                            }
                                            final Class121 class121 = class117;
                                            class121.field1665 += class116.field1665;
                                            final Class121 class122 = class117;
                                            class122.field1661 += class116.field1661;
                                            final Class121 class123 = class117;
                                            class123.field1662 += class116.field1662;
                                            final Class121 class124 = class117;
                                            class124.field1666 += class116.field1666;
                                            final Class121 class125 = class119;
                                            class125.field1665 += class115.field1665;
                                            final Class121 class126 = class119;
                                            class126.field1661 += class115.field1661;
                                            final Class121 class127 = class119;
                                            class127.field1662 += class115.field1662;
                                            final Class121 class128 = class119;
                                            class128.field1666 += class115.field1666;
                                            ++n4;
                                            Class113.field1494[i] = Class113.field1474;
                                            Class113.field1475[j] = Class113.field1474;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (n4 >= 3 && b) {
            for (int k = 0; k < class113.field1463; ++k) {
                if (Class113.field1494[class113.field1477[k]] == Class113.field1474 && Class113.field1494[class113.field1465[k]] == Class113.field1474 && Class113.field1494[class113.field1466[k]] == Class113.field1474) {
                    if (class113.field1467 == null) {
                        class113.field1467 = new byte[class113.field1463];
                    }
                    class113.field1467[k] = 2;
                }
            }
            for (int l = 0; l < class114.field1463; ++l) {
                if (Class113.field1474 == Class113.field1475[class114.field1477[l]] && Class113.field1474 == Class113.field1475[class114.field1465[l]] && Class113.field1474 == Class113.field1475[class114.field1466[l]]) {
                    if (class114.field1467 == null) {
                        class114.field1467 = new byte[class114.field1463];
                    }
                    class114.field1467[l] = 2;
                }
            }
        }
    }
    
    @ObfuscatedName("af")
    static final int method2590(final int n, int n2) {
        n2 = (n & 0x7F) * n2 >> 7;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
    
    @ObfuscatedName("ah")
    static final int method2591(int n) {
        if (n < 2) {
            n = 2;
        }
        else if (n > 126) {
            n = 126;
        }
        return n;
    }
}
