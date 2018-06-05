import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("hg")
public class Class218 extends Class105
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lgx;")
    Class202 field2481;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 457776721)
    int field2466;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -1323407617)
    int field2474;
    @ObfuscatedName("u")
    int[] field2468;
    @ObfuscatedName("q")
    int[] field2469;
    @ObfuscatedName("k")
    int[] field2473;
    @ObfuscatedName("i")
    int[] field2484;
    @ObfuscatedName("x")
    int[] field2472;
    @ObfuscatedName("e")
    int[] field2467;
    @ObfuscatedName("p")
    int[] field2465;
    @ObfuscatedName("b")
    int[] field2475;
    @ObfuscatedName("n")
    int[] field2476;
    @ObfuscatedName("y")
    int[] field2478;
    @ObfuscatedName("a")
    int[] field2479;
    @ObfuscatedName("j")
    int[] field2480;
    @ObfuscatedName("d")
    int[] field2471;
    @ObfuscatedName("h")
    int[] field2482;
    @ObfuscatedName("c")
    int[] field2483;
    @ObfuscatedName("v")
    @ObfuscatedSignature(signature = "[[Lhn;")
    Class219[][] field2470;
    @ObfuscatedName("af")
    @ObfuscatedSignature(signature = "[[Lhn;")
    Class219[][] field2485;
    @ObfuscatedName("ah")
    @ObfuscatedSignature(signature = "Lhe;")
    Class220 field2486;
    @ObfuscatedName("ab")
    boolean field2487;
    @ObfuscatedName("aw")
    @ObfuscatedGetter(intValue = 803571383)
    int field2488;
    @ObfuscatedName("ak")
    @ObfuscatedGetter(intValue = -1528762725)
    int field2489;
    @ObfuscatedName("as")
    @ObfuscatedGetter(longValue = 6073614026251895677L)
    long field2490;
    @ObfuscatedName("an")
    @ObfuscatedGetter(longValue = 3476685645422985587L)
    long field2491;
    @ObfuscatedName("ao")
    @ObfuscatedSignature(signature = "Lhz;")
    Class222 field2492;
    
    public Class218() {
        this.field2466 = 256;
        this.field2474 = 1000000;
        this.field2468 = new int[16];
        this.field2469 = new int[16];
        this.field2473 = new int[16];
        this.field2484 = new int[16];
        this.field2472 = new int[16];
        this.field2467 = new int[16];
        this.field2465 = new int[16];
        this.field2475 = new int[16];
        this.field2476 = new int[16];
        this.field2478 = new int[16];
        this.field2479 = new int[16];
        this.field2480 = new int[16];
        this.field2471 = new int[16];
        this.field2482 = new int[16];
        this.field2483 = new int[16];
        this.field2470 = new Class219[16][128];
        this.field2485 = new Class219[16][128];
        this.field2486 = new Class220();
        this.field2492 = new Class222(this);
        this.field2481 = new Class202(128);
        this.method4216();
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "1769486649")
    public synchronized void method4236(final int field2466) {
        this.field2466 = field2466;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "392205958")
    public int method4288() {
        return this.field2466;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lhq;Lir;Lcn;II)Z", garbageValue = "1013201658")
    synchronized boolean method4198(final Class223 class223, final Class247 class224, final Class98 class225, final int n) {
        class223.method4412();
        boolean b = true;
        int[] array = null;
        if (n > 0) {
            array = new int[] { n };
        }
        Class213 class226 = (Class213)class223.field2547.method4018();
    Label_0114_Outer:
        while (class226 != null) {
            final int n2 = (int)class226.field2421;
            Class221 class227 = (Class221)this.field2481.method4020(n2);
            while (true) {
                Label_0156: {
                    if (class227 != null) {
                        break Label_0156;
                    }
                    final byte[] method4689 = class224.method4689(n2);
                    Class221 class228;
                    if (method4689 == null) {
                        class228 = null;
                    }
                    else {
                        class228 = new Class221(method4689);
                    }
                    class227 = class228;
                    if (class227 != null) {
                        this.field2481.method4016(class227, n2);
                        break Label_0156;
                    }
                    b = false;
                    class226 = (Class213)class223.field2547.method4019();
                    continue Label_0114_Outer;
                }
                if (!class227.method4372(class225, class226.field2440, array)) {
                    b = false;
                }
                continue;
            }
        }
        if (b) {
            class223.method4413();
        }
        return b;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-2111468279")
    synchronized void method4199() {
        for (Class221 class221 = (Class221)this.field2481.method4018(); class221 != null; class221 = (Class221)this.field2481.method4019()) {
            class221.method4373();
        }
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1788128150")
    public synchronized void method4200() {
        for (Class221 class221 = (Class221)this.field2481.method4018(); class221 != null; class221 = (Class221)this.field2481.method4019()) {
            class221.method4064();
        }
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "()Ldo;")
    @Override
    protected synchronized Class105 vmethod4382() {
        return this.field2492;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "()Ldo;")
    @Override
    protected synchronized Class105 vmethod4389() {
        return null;
    }
    
    @ObfuscatedName("x")
    @Override
    protected synchronized int vmethod4395() {
        return 0;
    }
    
    @ObfuscatedName("e")
    @Override
    protected synchronized void vmethod4385(final int[] array, int n, int n2) {
        if (this.field2486.method4345()) {
            final int n3 = this.field2486.field2519 * this.field2474 / Class95.field1300;
            do {
                final long field2490 = this.field2490 + n2 * n3;
                if (this.field2491 - field2490 >= 0L) {
                    this.field2490 = field2490;
                    break;
                }
                final int n4 = (int)((this.field2491 - this.field2490 + n3 - 1L) / n3);
                this.field2490 += n3 * n4;
                this.field2492.vmethod4385(array, n, n4);
                n += n4;
                n2 -= n4;
                this.method4277();
            } while (this.field2486.method4345());
        }
        this.field2492.vmethod4385(array, n, n2);
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(Lhq;ZI)V", garbageValue = "1233433858")
    synchronized void method4267(final Class223 class223, final boolean field2487) {
        this.method4202();
        this.field2486.method4328(class223.field2546);
        this.field2487 = field2487;
        this.field2490 = 0L;
        for (int method4331 = this.field2486.method4331(), i = 0; i < method4331; ++i) {
            this.field2486.method4350(i);
            this.field2486.method4335(i);
            this.field2486.method4333(i);
        }
        this.field2488 = this.field2486.method4339();
        this.field2489 = this.field2486.field2525[this.field2488];
        this.field2491 = this.field2486.method4338(this.field2489);
    }
    
    @ObfuscatedName("b")
    @Override
    protected synchronized void vmethod4386(int n) {
        if (this.field2486.method4345()) {
            final int n2 = this.field2486.field2519 * this.field2474 / Class95.field1300;
            do {
                final long field2490 = n * n2 + this.field2490;
                if (this.field2491 - field2490 >= 0L) {
                    this.field2490 = field2490;
                    break;
                }
                final int n3 = (int)((this.field2491 - this.field2490 + n2 - 1L) / n2);
                this.field2490 += n3 * n2;
                this.field2492.vmethod4386(n3);
                n -= n3;
                this.method4277();
            } while (this.field2486.method4345());
        }
        this.field2492.vmethod4386(n);
    }
    
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "27")
    public synchronized void method4202() {
        this.field2486.method4329();
        this.method4216();
    }
    
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "1343580600")
    public synchronized boolean method4203() {
        return this.field2486.method4345();
    }
    
    @ObfuscatedName("g")
    @ObfuscatedSignature(signature = "(III)V", garbageValue = "2070435347")
    public synchronized void method4257(final int n, final int n2) {
        this.method4205(n, n2);
    }
    
    @ObfuscatedName("m")
    @ObfuscatedSignature(signature = "(IIS)V", garbageValue = "-9665")
    void method4205(final int n, final int n2) {
        this.field2484[n] = n2;
        this.field2467[n] = (n2 & 0xFFFFFF80);
        this.method4206(n, n2);
    }
    
    @ObfuscatedName("r")
    @ObfuscatedSignature(signature = "(IIB)V", garbageValue = "75")
    void method4206(final int n, final int n2) {
        if (n2 != this.field2472[n]) {
            this.field2472[n] = n2;
            for (int i = 0; i < 128; ++i) {
                this.field2485[n][i] = null;
            }
        }
    }
    
    @ObfuscatedName("t")
    @ObfuscatedSignature(signature = "(IIII)V", garbageValue = "254280843")
    void method4305(final int field2500, final int n, final int n2) {
        this.method4209(field2500, n, 64);
        if ((this.field2478[field2500] & 0x2) != 0x0) {
            for (Class219 class219 = (Class219)this.field2492.field2543.method4083(); class219 != null; class219 = (Class219)this.field2492.field2543.method4093()) {
                if (class219.field2500 == field2500 && class219.field2508 < 0) {
                    this.field2470[field2500][class219.field2502] = null;
                    this.field2470[field2500][n] = class219;
                    final int n3 = (class219.field2504 * class219.field2503 >> 12) + class219.field2516;
                    final Class219 class220 = class219;
                    class220.field2516 += n - class219.field2502 << 8;
                    class219.field2503 = n3 - class219.field2516;
                    class219.field2504 = 4096;
                    class219.field2502 = n;
                    return;
                }
            }
        }
        final Class221 field2501 = (Class221)this.field2481.method4020(this.field2472[field2500]);
        if (field2501 == null) {
            return;
        }
        final Class93 field2502 = field2501.field2533[n];
        if (field2502 == null) {
            return;
        }
        final Class219 class221 = new Class219();
        class221.field2500 = field2500;
        class221.field2517 = field2501;
        class221.field2496 = field2502;
        class221.field2511 = field2501.field2537[n];
        class221.field2498 = field2501.field2538[n];
        class221.field2502 = n;
        class221.field2507 = n2 * n2 * field2501.field2532[n] * field2501.field2540 + 1024 >> 11;
        class221.field2501 = (field2501.field2536[n] & 0xFF);
        class221.field2516 = (n << 8) - (field2501.field2534[n] & 0x7FFF);
        class221.field2505 = 0;
        class221.field2506 = 0;
        class221.field2497 = 0;
        class221.field2508 = -1;
        class221.field2495 = 0;
        if (this.field2471[field2500] == 0) {
            class221.field2512 = Class103.method2256(field2502, this.method4249(class221), this.method4222(class221), this.method4286(class221));
        }
        else {
            class221.field2512 = Class103.method2256(field2502, this.method4249(class221), 0, this.method4286(class221));
            this.method4208(class221, field2501.field2534[n] < 0);
        }
        if (field2501.field2534[n] < 0) {
            class221.field2512.method2258(-1);
        }
        if (class221.field2498 >= 0) {
            final Class219 class222 = this.field2485[field2500][class221.field2498];
            if (class222 != null && class222.field2508 < 0) {
                this.field2470[field2500][class222.field2502] = null;
                class222.field2508 = 0;
            }
            this.field2485[field2500][class221.field2498] = class221;
        }
        this.field2492.field2543.method4073(class221);
        this.field2470[field2500][n] = class221;
    }
    
    @ObfuscatedName("o")
    @ObfuscatedSignature(signature = "(Lhn;ZI)V", garbageValue = "1940134269")
    void method4208(final Class219 class219, final boolean b) {
        final int length = class219.field2496.field1278.length;
        int n;
        if (b && class219.field2496.field1281) {
            n = (length + length - class219.field2496.field1277) * this.field2471[class219.field2500] >> 6;
            final int n2 = length << 8;
            if (n >= n2) {
                n = n2 + n2 - 1 - n;
                class219.field2512.method2307();
            }
        }
        else {
            n = length * this.field2471[class219.field2500] >> 6;
        }
        class219.field2512.method2264(n);
    }
    
    @ObfuscatedName("y")
    @ObfuscatedSignature(signature = "(IIII)V", garbageValue = "-1229887011")
    void method4209(final int n, final int n2, final int n3) {
        final Class219 class219 = this.field2470[n][n2];
        if (class219 == null) {
            return;
        }
        this.field2470[n][n2] = null;
        if ((this.field2478[n] & 0x2) != 0x0) {
            for (Class219 class220 = (Class219)this.field2492.field2543.method4098(); class220 != null; class220 = (Class219)this.field2492.field2543.method4079()) {
                if (class220.field2500 == class219.field2500 && class220.field2508 < 0 && class219 != class220) {
                    class219.field2508 = 0;
                    break;
                }
            }
        }
        else {
            class219.field2508 = 0;
        }
    }
    
    @ObfuscatedName("a")
    @ObfuscatedSignature(signature = "(IIII)V", garbageValue = "-962421621")
    void method4210(final int n, final int n2, final int n3) {
    }
    
    @ObfuscatedName("c")
    @ObfuscatedSignature(signature = "(III)V", garbageValue = "-1379201347")
    void method4211(final int n, final int n2) {
    }
    
    @ObfuscatedName("v")
    @ObfuscatedSignature(signature = "(IIS)V", garbageValue = "-29508")
    void method4212(final int n, final int n2) {
        this.field2465[n] = n2;
    }
    
    @ObfuscatedName("ai")
    @ObfuscatedSignature(signature = "(IB)V", garbageValue = "70")
    void method4213(final int n) {
        for (Class219 class219 = (Class219)this.field2492.field2543.method4098(); class219 != null; class219 = (Class219)this.field2492.field2543.method4079()) {
            if (n < 0 || class219.field2500 == n) {
                if (class219.field2512 != null) {
                    class219.field2512.method2269(Class95.field1300 / 100);
                    if (class219.field2512.method2273()) {
                        this.field2492.field2544.method2032(class219.field2512);
                    }
                    class219.method4322();
                }
                if (class219.field2508 < 0) {
                    this.field2470[class219.field2500][class219.field2502] = null;
                }
                class219.method4064();
            }
        }
    }
    
    @ObfuscatedName("ac")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "1809929257")
    void method4241(int i) {
        if (i < 0) {
            for (i = 0; i < 16; ++i) {
                this.method4241(i);
            }
            return;
        }
        this.field2468[i] = 12800;
        this.field2469[i] = 8192;
        this.field2473[i] = 16383;
        this.field2465[i] = 8192;
        this.field2475[i] = 0;
        this.field2476[i] = 8192;
        this.method4278(i);
        this.method4218(i);
        this.field2478[i] = 0;
        this.field2479[i] = 32767;
        this.field2480[i] = 256;
        this.field2471[i] = 0;
        this.method4309(i, 8192);
    }
    
    @ObfuscatedName("ap")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-2037469354")
    void method4215(final int n) {
        for (Class219 class219 = (Class219)this.field2492.field2543.method4098(); class219 != null; class219 = (Class219)this.field2492.field2543.method4079()) {
            if ((n < 0 || class219.field2500 == n) && class219.field2508 < 0) {
                this.field2470[class219.field2500][class219.field2502] = null;
                class219.field2508 = 0;
            }
        }
    }
    
    @ObfuscatedName("aa")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "2143238650")
    void method4216() {
        this.method4213(-1);
        this.method4241(-1);
        for (int i = 0; i < 16; ++i) {
            this.field2472[i] = this.field2484[i];
        }
        for (int j = 0; j < 16; ++j) {
            this.field2467[j] = (this.field2484[j] & 0xFFFFFF80);
        }
    }
    
    @ObfuscatedName("al")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-84179680")
    void method4278(final int n) {
        if ((this.field2478[n] & 0x2) != 0x0) {
            for (Class219 class219 = (Class219)this.field2492.field2543.method4098(); class219 != null; class219 = (Class219)this.field2492.field2543.method4079()) {
                if (class219.field2500 == n && this.field2470[n][class219.field2502] == null && class219.field2508 < 0) {
                    class219.field2508 = 0;
                }
            }
        }
    }
    
    @ObfuscatedName("ae")
    @ObfuscatedSignature(signature = "(IS)V", garbageValue = "-16188")
    void method4218(final int n) {
        if ((this.field2478[n] & 0x4) != 0x0) {
            for (Class219 class219 = (Class219)this.field2492.field2543.method4098(); class219 != null; class219 = (Class219)this.field2492.field2543.method4079()) {
                if (class219.field2500 == n) {
                    class219.field2514 = 0;
                }
            }
        }
    }
    
    @ObfuscatedName("am")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-1648204035")
    void method4219(final int n) {
        final int n2 = n & 0xF0;
        if (n2 == 128) {
            this.method4209(n & 0xF, n >> 8 & 0x7F, n >> 16 & 0x7F);
            return;
        }
        if (n2 == 144) {
            final int n3 = n & 0xF;
            final int n4 = n >> 8 & 0x7F;
            final int n5 = n >> 16 & 0x7F;
            if (n5 > 0) {
                this.method4305(n3, n4, n5);
            }
            else {
                this.method4209(n3, n4, 64);
            }
            return;
        }
        if (n2 == 160) {
            this.method4210(n & 0xF, n >> 8 & 0x7F, n >> 16 & 0x7F);
            return;
        }
        if (n2 == 176) {
            final int n6 = n & 0xF;
            final int n7 = n >> 8 & 0x7F;
            final int n8 = n >> 16 & 0x7F;
            if (n7 == 0) {
                this.field2467[n6] = (n8 << 14) + (this.field2467[n6] & 0xFFE03FFF);
            }
            if (n7 == 32) {
                this.field2467[n6] = (n8 << 7) + (this.field2467[n6] & 0xFFFFC07F);
            }
            if (n7 == 1) {
                this.field2475[n6] = (n8 << 7) + (this.field2475[n6] & 0xFFFFC07F);
            }
            if (n7 == 33) {
                this.field2475[n6] = n8 + (this.field2475[n6] & 0xFFFFFF80);
            }
            if (n7 == 5) {
                this.field2476[n6] = (n8 << 7) + (this.field2476[n6] & 0xFFFFC07F);
            }
            if (n7 == 37) {
                this.field2476[n6] = n8 + (this.field2476[n6] & 0xFFFFFF80);
            }
            if (n7 == 7) {
                this.field2468[n6] = (n8 << 7) + (this.field2468[n6] & 0xFFFFC07F);
            }
            if (n7 == 39) {
                this.field2468[n6] = n8 + (this.field2468[n6] & 0xFFFFFF80);
            }
            if (n7 == 10) {
                this.field2469[n6] = (n8 << 7) + (this.field2469[n6] & 0xFFFFC07F);
            }
            if (n7 == 42) {
                this.field2469[n6] = n8 + (this.field2469[n6] & 0xFFFFFF80);
            }
            if (n7 == 11) {
                this.field2473[n6] = (n8 << 7) + (this.field2473[n6] & 0xFFFFC07F);
            }
            if (n7 == 43) {
                this.field2473[n6] = n8 + (this.field2473[n6] & 0xFFFFFF80);
            }
            if (n7 == 64) {
                if (n8 >= 64) {
                    final int[] field2478 = this.field2478;
                    final int n9 = n6;
                    field2478[n9] |= 0x1;
                }
                else {
                    final int[] field2479 = this.field2478;
                    final int n10 = n6;
                    field2479[n10] &= 0xFFFFFFFE;
                }
            }
            if (n7 == 65) {
                if (n8 >= 64) {
                    final int[] field2480 = this.field2478;
                    final int n11 = n6;
                    field2480[n11] |= 0x2;
                }
                else {
                    this.method4278(n6);
                    final int[] field2481 = this.field2478;
                    final int n12 = n6;
                    field2481[n12] &= 0xFFFFFFFD;
                }
            }
            if (n7 == 99) {
                this.field2479[n6] = (n8 << 7) + (this.field2479[n6] & 0x7F);
            }
            if (n7 == 98) {
                this.field2479[n6] = (this.field2479[n6] & 0x3F80) + n8;
            }
            if (n7 == 101) {
                this.field2479[n6] = (n8 << 7) + (this.field2479[n6] & 0x7F) + 16384;
            }
            if (n7 == 100) {
                this.field2479[n6] = (this.field2479[n6] & 0x3F80) + n8 + 16384;
            }
            if (n7 == 120) {
                this.method4213(n6);
            }
            if (n7 == 121) {
                this.method4241(n6);
            }
            if (n7 == 123) {
                this.method4215(n6);
            }
            if (n7 == 6 && this.field2479[n6] == 16384) {
                this.field2480[n6] = (n8 << 7) + (this.field2480[n6] & 0xFFFFC07F);
            }
            if (n7 == 38 && this.field2479[n6] == 16384) {
                this.field2480[n6] = n8 + (this.field2480[n6] & 0xFFFFFF80);
            }
            if (n7 == 16) {
                this.field2471[n6] = (n8 << 7) + (this.field2471[n6] & 0xFFFFC07F);
            }
            if (n7 == 48) {
                this.field2471[n6] = n8 + (this.field2471[n6] & 0xFFFFFF80);
            }
            if (n7 == 81) {
                if (n8 >= 64) {
                    final int[] field2482 = this.field2478;
                    final int n13 = n6;
                    field2482[n13] |= 0x4;
                }
                else {
                    this.method4218(n6);
                    final int[] field2483 = this.field2478;
                    final int n14 = n6;
                    field2483[n14] &= 0xFFFFFFFB;
                }
            }
            if (n7 == 17) {
                this.method4309(n6, (n8 << 7) + (this.field2482[n6] & 0xFFFFC07F));
            }
            if (n7 == 49) {
                this.method4309(n6, n8 + (this.field2482[n6] & 0xFFFFFF80));
            }
            return;
        }
        if (n2 == 192) {
            final int n15 = n & 0xF;
            this.method4206(n15, (n >> 8 & 0x7F) + this.field2467[n15]);
            return;
        }
        if (n2 == 208) {
            this.method4211(n & 0xF, n >> 8 & 0x7F);
            return;
        }
        if (n2 == 224) {
            this.method4212(n & 0xF, (n >> 8 & 0x7F) + (n >> 9 & 0x3F80));
            return;
        }
        if ((n & 0xFF) == 0xFF) {
            this.method4216();
        }
    }
    
    @ObfuscatedName("ay")
    @ObfuscatedSignature(signature = "(III)V", garbageValue = "-2103498086")
    void method4309(final int n, final int n2) {
        this.field2482[n] = n2;
        this.field2483[n] = (int)(2097152.0 * Math.pow(2.0, 5.4931640625E-4 * n2) + 0.5);
    }
    
    @ObfuscatedName("ag")
    @ObfuscatedSignature(signature = "(Lhn;I)I", garbageValue = "497644695")
    int method4249(final Class219 class219) {
        int n = ((this.field2465[class219.field2500] - 8192) * this.field2480[class219.field2500] >> 12) + ((class219.field2503 * class219.field2504 >> 12) + class219.field2516);
        final Class216 field2511 = class219.field2511;
        if (field2511.field2452 > 0 && (field2511.field2453 > 0 || this.field2475[class219.field2500] > 0)) {
            int n2 = field2511.field2453 << 2;
            final int n3 = field2511.field2454 << 1;
            if (class219.field2499 < n3) {
                n2 = n2 * class219.field2499 / n3;
            }
            n += (int)(Math.sin(0.01227184630308513 * (class219.field2509 & 0x1FF)) * (n2 + (this.field2475[class219.field2500] >> 7)));
        }
        final int n4 = (int)(class219.field2496.field1279 * 256 * Math.pow(2.0, n * 3.255208333333333E-4) / Class95.field1300 + 0.5);
        return (n4 < 1) ? 1 : n4;
    }
    
    @ObfuscatedName("bk")
    @ObfuscatedSignature(signature = "(Lhn;I)I", garbageValue = "2064514172")
    int method4222(final Class219 class219) {
        final Class216 field2511 = class219.field2511;
        final int n = this.field2473[class219.field2500] * this.field2468[class219.field2500] + 4096 >> 13;
        int n2 = ((n * n + 16384 >> 15) * class219.field2507 + 16384 >> 15) * this.field2466 + 128 >> 8;
        if (field2511.field2448 > 0) {
            n2 = (int)(n2 * Math.pow(0.5, 1.953125E-5 * class219.field2505 * field2511.field2448) + 0.5);
        }
        if (field2511.field2447 != null) {
            final int field2512 = class219.field2506;
            int n3 = field2511.field2447[class219.field2497 + 1];
            if (class219.field2497 < field2511.field2447.length - 2) {
                final int n4 = (field2511.field2447[class219.field2497] & 0xFF) << 8;
                n3 += (field2512 - n4) * (field2511.field2447[class219.field2497 + 3] - n3) / (((field2511.field2447[class219.field2497 + 2] & 0xFF) << 8) - n4);
            }
            n2 = n2 * n3 + 32 >> 6;
        }
        if (class219.field2508 > 0 && field2511.field2449 != null) {
            final int field2513 = class219.field2508;
            int n5 = field2511.field2449[class219.field2495 + 1];
            if (class219.field2495 < field2511.field2449.length - 2) {
                final int n6 = (field2511.field2449[class219.field2495] & 0xFF) << 8;
                n5 += (field2513 - n6) * (field2511.field2449[class219.field2495 + 3] - n5) / (((field2511.field2449[class219.field2495 + 2] & 0xFF) << 8) - n6);
            }
            n2 = n5 * n2 + 32 >> 6;
        }
        return n2;
    }
    
    @ObfuscatedName("bp")
    @ObfuscatedSignature(signature = "(Lhn;I)I", garbageValue = "1858181418")
    int method4286(final Class219 class219) {
        final int n = this.field2469[class219.field2500];
        if (n < 8192) {
            return n * class219.field2501 + 32 >> 6;
        }
        return 16384 - ((128 - class219.field2501) * (16384 - n) + 32 >> 6);
    }
    
    @ObfuscatedName("bi")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1502621602")
    void method4277() {
        int field2488 = this.field2488;
        int i = this.field2489;
        long field2489 = this.field2491;
        while (i == this.field2489) {
            while (i == this.field2486.field2525[field2488]) {
                this.field2486.method4350(field2488);
                final int method4336 = this.field2486.method4336(field2488);
                if (method4336 == 1) {
                    this.field2486.method4334();
                    this.field2486.method4333(field2488);
                    if (!this.field2486.method4340()) {
                        break;
                    }
                    if (this.field2487 && i != 0) {
                        this.field2486.method4341(field2489);
                        break;
                    }
                    this.method4216();
                    this.field2486.method4329();
                    return;
                }
                else {
                    if ((method4336 & 0x80) != 0x0) {
                        this.method4219(method4336);
                    }
                    this.field2486.method4335(field2488);
                    this.field2486.method4333(field2488);
                }
            }
            field2488 = this.field2486.method4339();
            i = this.field2486.field2525[field2488];
            field2489 = this.field2486.method4338(i);
        }
        this.field2488 = field2488;
        this.field2489 = i;
        this.field2491 = field2489;
    }
    
    @ObfuscatedName("bj")
    @ObfuscatedSignature(signature = "(Lhn;I)Z", garbageValue = "724893779")
    boolean method4230(final Class219 class219) {
        if (class219.field2512 == null) {
            if (class219.field2508 >= 0) {
                class219.method4064();
                if (class219.field2498 > 0 && class219 == this.field2485[class219.field2500][class219.field2498]) {
                    this.field2485[class219.field2500][class219.field2498] = null;
                }
            }
            return true;
        }
        return false;
    }
    
    @ObfuscatedName("bo")
    @ObfuscatedSignature(signature = "(Lhn;[IIII)Z", garbageValue = "-549826874")
    boolean method4231(final Class219 class219, final int[] array, final int n, final int n2) {
        class219.field2513 = Class95.field1300 / 100;
        if (class219.field2508 >= 0 && (class219.field2512 == null || class219.field2512.method2272())) {
            class219.method4322();
            class219.method4064();
            if (class219.field2498 > 0 && class219 == this.field2485[class219.field2500][class219.field2498]) {
                this.field2485[class219.field2500][class219.field2498] = null;
            }
            return true;
        }
        final int field2504 = class219.field2504;
        if (field2504 > 0) {
            int field2505 = field2504 - (int)(16.0 * Math.pow(2.0, 4.921259842519685E-4 * this.field2476[class219.field2500]) + 0.5);
            if (field2505 < 0) {
                field2505 = 0;
            }
            class219.field2504 = field2505;
        }
        class219.field2512.method2270(this.method4249(class219));
        final Class216 field2506 = class219.field2511;
        int n3 = 0;
        ++class219.field2499;
        class219.field2509 += field2506.field2452;
        final double n4 = ((class219.field2502 - 60 << 8) + (class219.field2503 * class219.field2504 >> 12)) * 5.086263020833333E-6;
        if (field2506.field2448 > 0) {
            if (field2506.field2451 > 0) {
                class219.field2505 += (int)(128.0 * Math.pow(2.0, n4 * field2506.field2451) + 0.5);
            }
            else {
                class219.field2505 += 128;
            }
        }
        if (field2506.field2447 != null) {
            if (field2506.field2450 > 0) {
                class219.field2506 += (int)(128.0 * Math.pow(2.0, field2506.field2450 * n4) + 0.5);
            }
            else {
                class219.field2506 += 128;
            }
            while (class219.field2497 < field2506.field2447.length - 2 && class219.field2506 > (field2506.field2447[class219.field2497 + 2] & 0xFF) << 8) {
                class219.field2497 += 2;
            }
            if (field2506.field2447.length - 2 == class219.field2497 && field2506.field2447[class219.field2497 + 1] == 0) {
                n3 = 1;
            }
        }
        if (class219.field2508 >= 0 && field2506.field2449 != null && (this.field2478[class219.field2500] & 0x1) == 0x0 && (class219.field2498 < 0 || class219 != this.field2485[class219.field2500][class219.field2498])) {
            if (field2506.field2446 > 0) {
                class219.field2508 += (int)(128.0 * Math.pow(2.0, field2506.field2446 * n4) + 0.5);
            }
            else {
                class219.field2508 += 128;
            }
            while (class219.field2495 < field2506.field2449.length - 2 && class219.field2508 > (field2506.field2449[class219.field2495 + 2] & 0xFF) << 8) {
                class219.field2495 += 2;
            }
            if (field2506.field2449.length - 2 == class219.field2495) {
                n3 = 1;
            }
        }
        if (n3 != 0) {
            class219.field2512.method2269(class219.field2513);
            if (array != null) {
                class219.field2512.vmethod4385(array, n, n2);
            }
            else {
                class219.field2512.vmethod4386(n2);
            }
            if (class219.field2512.method2273()) {
                this.field2492.field2544.method2032(class219.field2512);
            }
            class219.method4322();
            if (class219.field2508 >= 0) {
                class219.method4064();
                if (class219.field2498 > 0 && class219 == this.field2485[class219.field2500][class219.field2498]) {
                    this.field2485[class219.field2500][class219.field2498] = null;
                }
            }
            return true;
        }
        class219.field2512.method2268(class219.field2513, this.method4222(class219), this.method4286(class219));
        return false;
    }
}
