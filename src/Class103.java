import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("cm")
public class Class103 extends Class105
{
    @ObfuscatedName("z")
    int field1357;
    @ObfuscatedName("s")
    int field1364;
    @ObfuscatedName("l")
    int field1356;
    @ObfuscatedName("u")
    int field1366;
    @ObfuscatedName("q")
    int field1359;
    @ObfuscatedName("k")
    int field1360;
    @ObfuscatedName("i")
    int field1361;
    @ObfuscatedName("x")
    int field1362;
    @ObfuscatedName("e")
    int field1363;
    @ObfuscatedName("p")
    int field1367;
    @ObfuscatedName("b")
    boolean field1365;
    @ObfuscatedName("n")
    int field1355;
    @ObfuscatedName("f")
    int field1358;
    @ObfuscatedName("g")
    int field1368;
    @ObfuscatedName("m")
    int field1369;
    
    Class103(final Class93 field1383, final int field1384, final int field1385, final int field1386) {
        super.field1383 = field1383;
        this.field1363 = field1383.field1277;
        this.field1367 = field1383.field1280;
        this.field1365 = field1383.field1281;
        this.field1364 = field1384;
        this.field1356 = field1385;
        this.field1366 = field1386;
        this.field1357 = 0;
        this.method2324();
    }
    
    Class103(final Class93 field1383, final int field1384, final int field1385) {
        super.field1383 = field1383;
        this.field1363 = field1383.field1277;
        this.field1367 = field1383.field1280;
        this.field1365 = field1383.field1281;
        this.field1364 = field1384;
        this.field1356 = field1385;
        this.field1366 = 8192;
        this.field1357 = 0;
        this.method2324();
    }
    
    @ObfuscatedName("u")
    void method2324() {
        this.field1359 = this.field1356;
        this.field1360 = method2341(this.field1356, this.field1366);
        this.field1361 = method2251(this.field1356, this.field1366);
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "()Ldo;")
    @Override
    protected Class105 vmethod4382() {
        return null;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "()Ldo;")
    @Override
    protected Class105 vmethod4389() {
        return null;
    }
    
    @ObfuscatedName("x")
    @Override
    protected int vmethod4395() {
        if (this.field1356 == 0 && this.field1355 == 0) {
            return 0;
        }
        return 1;
    }
    
    @ObfuscatedName("e")
    public synchronized void vmethod4385(final int[] array, final int n, int n2) {
        if (this.field1356 == 0 && this.field1355 == 0) {
            this.vmethod4386(n2);
            return;
        }
        final Class93 class93 = (Class93)super.field1383;
        final int n3 = this.field1363 << 8;
        final int n4 = this.field1367 << 8;
        final int field1357 = class93.field1278.length << 8;
        final int n5 = n4 - n3;
        if (n5 <= 0) {
            this.field1362 = 0;
        }
        int n6 = n;
        n2 += n;
        if (this.field1357 < 0) {
            if (this.field1364 <= 0) {
                this.method2266();
                this.method4064();
                return;
            }
            this.field1357 = 0;
        }
        if (this.field1357 >= field1357) {
            if (this.field1364 >= 0) {
                this.method2266();
                this.method4064();
                return;
            }
            this.field1357 = field1357 - 1;
        }
        if (this.field1362 >= 0) {
            Label_0335: {
                if (this.field1362 > 0) {
                    if (this.field1365) {
                        if (this.field1364 < 0) {
                            n6 = this.method2280(array, n6, n3, n2, class93.field1278[this.field1363]);
                            if (this.field1357 >= n3) {
                                return;
                            }
                            this.field1357 = n3 + n3 - 1 - this.field1357;
                            this.field1364 = -this.field1364;
                            if (--this.field1362 == 0) {
                                break Label_0335;
                            }
                        }
                        do {
                            n6 = this.method2402(array, n6, n4, n2, class93.field1278[this.field1367 - 1]);
                            if (this.field1357 < n4) {
                                return;
                            }
                            this.field1357 = n4 + n4 - 1 - this.field1357;
                            this.field1364 = -this.field1364;
                            if (--this.field1362 == 0) {
                                break;
                            }
                            n6 = this.method2280(array, n6, n3, n2, class93.field1278[this.field1363]);
                            if (this.field1357 >= n3) {
                                return;
                            }
                            this.field1357 = n3 + n3 - 1 - this.field1357;
                            this.field1364 = -this.field1364;
                        } while (--this.field1362 != 0);
                    }
                    else if (this.field1364 < 0) {
                        while (true) {
                            n6 = this.method2280(array, n6, n3, n2, class93.field1278[this.field1367 - 1]);
                            if (this.field1357 >= n3) {
                                return;
                            }
                            final int n7 = (n4 - 1 - this.field1357) / n5;
                            if (n7 >= this.field1362) {
                                this.field1357 += n5 * this.field1362;
                                this.field1362 = 0;
                                break;
                            }
                            this.field1357 += n5 * n7;
                            this.field1362 -= n7;
                        }
                    }
                    else {
                        while (true) {
                            n6 = this.method2402(array, n6, n4, n2, class93.field1278[this.field1363]);
                            if (this.field1357 < n4) {
                                return;
                            }
                            final int n8 = (this.field1357 - n3) / n5;
                            if (n8 >= this.field1362) {
                                this.field1357 -= n5 * this.field1362;
                                this.field1362 = 0;
                                break;
                            }
                            this.field1357 -= n5 * n8;
                            this.field1362 -= n8;
                        }
                    }
                }
            }
            if (this.field1364 < 0) {
                this.method2280(array, n6, 0, n2, 0);
                if (this.field1357 < 0) {
                    this.field1357 = -1;
                    this.method2266();
                    this.method4064();
                }
            }
            else {
                this.method2402(array, n6, field1357, n2, 0);
                if (this.field1357 >= field1357) {
                    this.field1357 = field1357;
                    this.method2266();
                    this.method4064();
                }
            }
            return;
        }
        if (this.field1365) {
            if (this.field1364 < 0) {
                n6 = this.method2280(array, n6, n3, n2, class93.field1278[this.field1363]);
                if (this.field1357 >= n3) {
                    return;
                }
                this.field1357 = n3 + n3 - 1 - this.field1357;
                this.field1364 = -this.field1364;
            }
            while (true) {
                final int method2402 = this.method2402(array, n6, n4, n2, class93.field1278[this.field1367 - 1]);
                if (this.field1357 < n4) {
                    return;
                }
                this.field1357 = n4 + n4 - 1 - this.field1357;
                this.field1364 = -this.field1364;
                n6 = this.method2280(array, method2402, n3, n2, class93.field1278[this.field1363]);
                if (this.field1357 >= n3) {
                    return;
                }
                this.field1357 = n3 + n3 - 1 - this.field1357;
                this.field1364 = -this.field1364;
            }
        }
        else {
            if (this.field1364 < 0) {
                while (true) {
                    n6 = this.method2280(array, n6, n3, n2, class93.field1278[this.field1367 - 1]);
                    if (this.field1357 >= n3) {
                        break;
                    }
                    this.field1357 = n4 - 1 - (n4 - 1 - this.field1357) % n5;
                }
                return;
            }
            while (true) {
                n6 = this.method2402(array, n6, n4, n2, class93.field1278[this.field1363]);
                if (this.field1357 < n4) {
                    break;
                }
                this.field1357 = n3 + (this.field1357 - n3) % n5;
            }
        }
    }
    
    @ObfuscatedName("p")
    public synchronized void method2258(final int field1362) {
        this.field1362 = field1362;
    }
    
    @ObfuscatedName("b")
    public synchronized void vmethod4386(int field1355) {
        if (this.field1355 > 0) {
            if (field1355 >= this.field1355) {
                if (this.field1356 == Integer.MIN_VALUE) {
                    this.field1356 = 0;
                    this.field1361 = 0;
                    this.field1360 = 0;
                    this.field1359 = 0;
                    this.method4064();
                    field1355 = this.field1355;
                }
                this.field1355 = 0;
                this.method2324();
            }
            else {
                this.field1359 += this.field1358 * field1355;
                this.field1360 += this.field1368 * field1355;
                this.field1361 += this.field1369 * field1355;
                this.field1355 -= field1355;
            }
        }
        final Class93 class93 = (Class93)super.field1383;
        final int n = this.field1363 << 8;
        final int n2 = this.field1367 << 8;
        final int field1356 = class93.field1278.length << 8;
        final int n3 = n2 - n;
        if (n3 <= 0) {
            this.field1362 = 0;
        }
        if (this.field1357 < 0) {
            if (this.field1364 <= 0) {
                this.method2266();
                this.method4064();
                return;
            }
            this.field1357 = 0;
        }
        if (this.field1357 >= field1356) {
            if (this.field1364 >= 0) {
                this.method2266();
                this.method4064();
                return;
            }
            this.field1357 = field1356 - 1;
        }
        this.field1357 += this.field1364 * field1355;
        if (this.field1362 >= 0) {
            Label_0432: {
                if (this.field1362 > 0) {
                    if (this.field1365) {
                        if (this.field1364 < 0) {
                            if (this.field1357 >= n) {
                                return;
                            }
                            this.field1357 = n + n - 1 - this.field1357;
                            this.field1364 = -this.field1364;
                            if (--this.field1362 == 0) {
                                break Label_0432;
                            }
                        }
                        while (this.field1357 >= n2) {
                            this.field1357 = n2 + n2 - 1 - this.field1357;
                            this.field1364 = -this.field1364;
                            if (--this.field1362 == 0) {
                                break Label_0432;
                            }
                            if (this.field1357 >= n) {
                                return;
                            }
                            this.field1357 = n + n - 1 - this.field1357;
                            this.field1364 = -this.field1364;
                            if (--this.field1362 == 0) {
                                break Label_0432;
                            }
                        }
                        return;
                    }
                    if (this.field1364 < 0) {
                        if (this.field1357 >= n) {
                            return;
                        }
                        final int n4 = (n2 - 1 - this.field1357) / n3;
                        if (n4 >= this.field1362) {
                            this.field1357 += n3 * this.field1362;
                            this.field1362 = 0;
                            break Label_0432;
                        }
                        this.field1357 += n3 * n4;
                        this.field1362 -= n4;
                    }
                    else {
                        if (this.field1357 < n2) {
                            return;
                        }
                        final int n5 = (this.field1357 - n) / n3;
                        if (n5 >= this.field1362) {
                            this.field1357 -= n3 * this.field1362;
                            this.field1362 = 0;
                            break Label_0432;
                        }
                        this.field1357 -= n3 * n5;
                        this.field1362 -= n5;
                    }
                    return;
                }
            }
            if (this.field1364 < 0) {
                if (this.field1357 < 0) {
                    this.field1357 = -1;
                    this.method2266();
                    this.method4064();
                }
            }
            else if (this.field1357 >= field1356) {
                this.field1357 = field1356;
                this.method2266();
                this.method4064();
            }
            return;
        }
        if (this.field1365) {
            if (this.field1364 < 0) {
                if (this.field1357 >= n) {
                    return;
                }
                this.field1357 = n + n - 1 - this.field1357;
                this.field1364 = -this.field1364;
            }
            while (this.field1357 >= n2) {
                this.field1357 = n2 + n2 - 1 - this.field1357;
                this.field1364 = -this.field1364;
                if (this.field1357 >= n) {
                    return;
                }
                this.field1357 = n + n - 1 - this.field1357;
                this.field1364 = -this.field1364;
            }
            return;
        }
        if (this.field1364 < 0) {
            if (this.field1357 >= n) {
                return;
            }
            this.field1357 = n2 - 1 - (n2 - 1 - this.field1357) % n3;
        }
        else {
            if (this.field1357 < n2) {
                return;
            }
            this.field1357 = n + (this.field1357 - n) % n3;
        }
    }
    
    @ObfuscatedName("n")
    public synchronized void method2267(final int n) {
        this.method2261(n << 6, this.method2263());
    }
    
    @ObfuscatedName("f")
    synchronized void method2260(final int n) {
        this.method2261(n, this.method2263());
    }
    
    @ObfuscatedName("g")
    synchronized void method2261(final int field1356, final int field1357) {
        this.field1356 = field1356;
        this.field1366 = field1357;
        this.field1355 = 0;
        this.method2324();
    }
    
    @ObfuscatedName("m")
    public synchronized int method2262() {
        return (this.field1356 == Integer.MIN_VALUE) ? 0 : this.field1356;
    }
    
    @ObfuscatedName("r")
    public synchronized int method2263() {
        return (this.field1366 < 0) ? -1 : this.field1366;
    }
    
    @ObfuscatedName("t")
    public synchronized void method2264(int field1357) {
        final int n = ((Class93)super.field1383).field1278.length << 8;
        if (field1357 < -1) {
            field1357 = -1;
        }
        if (field1357 > n) {
            field1357 = n;
        }
        this.field1357 = field1357;
    }
    
    @ObfuscatedName("o")
    @ObfuscatedSignature(signature = "(Z)V", garbageValue = "1")
    public synchronized void method2307() {
        this.field1364 = (this.field1364 ^ this.field1364 >> 31) + (this.field1364 >>> 31);
        this.field1364 = -this.field1364;
    }
    
    @ObfuscatedName("y")
    void method2266() {
        if (this.field1355 != 0) {
            if (this.field1356 == Integer.MIN_VALUE) {
                this.field1356 = 0;
            }
            this.field1355 = 0;
            this.method2324();
        }
    }
    
    @ObfuscatedName("a")
    public synchronized void method2408(final int n, final int n2) {
        this.method2268(n, n2, this.method2263());
    }
    
    @ObfuscatedName("c")
    public synchronized void method2268(int field1355, final int field1356, final int field1357) {
        if (field1355 == 0) {
            this.method2261(field1356, field1357);
            return;
        }
        final int method2341 = method2341(field1356, field1357);
        final int method2342 = method2251(field1356, field1357);
        if (method2341 == this.field1360 && method2342 == this.field1361) {
            this.field1355 = 0;
            return;
        }
        int n = field1356 - this.field1359;
        if (this.field1359 - field1356 > n) {
            n = this.field1359 - field1356;
        }
        if (method2341 - this.field1360 > n) {
            n = method2341 - this.field1360;
        }
        if (this.field1360 - method2341 > n) {
            n = this.field1360 - method2341;
        }
        if (method2342 - this.field1361 > n) {
            n = method2342 - this.field1361;
        }
        if (this.field1361 - method2342 > n) {
            n = this.field1361 - method2342;
        }
        if (field1355 > n) {
            field1355 = n;
        }
        this.field1355 = field1355;
        this.field1356 = field1356;
        this.field1366 = field1357;
        this.field1358 = (field1356 - this.field1359) / field1355;
        this.field1368 = (method2341 - this.field1360) / field1355;
        this.field1369 = (method2342 - this.field1361) / field1355;
    }
    
    @ObfuscatedName("v")
    public synchronized void method2269(int field1355) {
        if (field1355 == 0) {
            this.method2260(0);
            this.method4064();
            return;
        }
        if (this.field1360 == 0 && this.field1361 == 0) {
            this.field1355 = 0;
            this.field1356 = 0;
            this.field1359 = 0;
            this.method4064();
            return;
        }
        int n = -this.field1359;
        if (this.field1359 > n) {
            n = this.field1359;
        }
        if (-this.field1360 > n) {
            n = -this.field1360;
        }
        if (this.field1360 > n) {
            n = this.field1360;
        }
        if (-this.field1361 > n) {
            n = -this.field1361;
        }
        if (this.field1361 > n) {
            n = this.field1361;
        }
        if (field1355 > n) {
            field1355 = n;
        }
        this.field1355 = field1355;
        this.field1356 = Integer.MIN_VALUE;
        this.field1358 = -this.field1359 / field1355;
        this.field1368 = -this.field1360 / field1355;
        this.field1369 = -this.field1361 / field1355;
    }
    
    @ObfuscatedName("ai")
    public synchronized void method2270(final int field1364) {
        if (this.field1364 < 0) {
            this.field1364 = -field1364;
        }
        else {
            this.field1364 = field1364;
        }
    }
    
    @ObfuscatedName("ac")
    public synchronized int method2351() {
        return (this.field1364 < 0) ? (-this.field1364) : this.field1364;
    }
    
    @ObfuscatedName("ap")
    public boolean method2272() {
        return this.field1357 < 0 || this.field1357 >= ((Class93)super.field1383).field1278.length << 8;
    }
    
    @ObfuscatedName("aa")
    public boolean method2273() {
        return this.field1355 != 0;
    }
    
    @ObfuscatedName("al")
    int method2402(final int[] array, int n, final int n2, final int n3, final int n4) {
        while (this.field1355 > 0) {
            int n5 = n + this.field1355;
            if (n5 > n3) {
                n5 = n3;
            }
            this.field1355 += n;
            if (this.field1364 == 256 && (this.field1357 & 0xFF) == 0x0) {
                if (Class95.field1295) {
                    n = method2288(0, ((Class93)super.field1383).field1278, array, this.field1357, n, this.field1360, this.field1361, this.field1368, this.field1369, 0, n5, n2, this);
                }
                else {
                    n = method2417(((Class93)super.field1383).field1278, array, this.field1357, n, this.field1359, this.field1358, 0, n5, n2, this);
                }
            }
            else if (Class95.field1295) {
                n = method2295(0, 0, ((Class93)super.field1383).field1278, array, this.field1357, n, this.field1360, this.field1361, this.field1368, this.field1369, 0, n5, n2, this, this.field1364, n4);
            }
            else {
                n = method2294(0, 0, ((Class93)super.field1383).field1278, array, this.field1357, n, this.field1359, this.field1358, 0, n5, n2, this, this.field1364, n4);
            }
            this.field1355 -= n;
            if (this.field1355 != 0) {
                return n;
            }
            if (this.method2281()) {
                return n3;
            }
        }
        if (this.field1364 == 256 && (this.field1357 & 0xFF) == 0x0) {
            if (Class95.field1295) {
                return method2283(0, ((Class93)super.field1383).field1278, array, this.field1357, n, this.field1360, this.field1361, 0, n3, n2, this);
            }
            return method2275(((Class93)super.field1383).field1278, array, this.field1357, n, this.field1359, 0, n3, n2, this);
        }
        else {
            if (Class95.field1295) {
                return method2302(0, 0, ((Class93)super.field1383).field1278, array, this.field1357, n, this.field1360, this.field1361, 0, n3, n2, this, this.field1364, n4);
            }
            return method2286(0, 0, ((Class93)super.field1383).field1278, array, this.field1357, n, this.field1359, 0, n3, n2, this, this.field1364, n4);
        }
    }
    
    @ObfuscatedName("ae")
    int method2280(final int[] array, int n, final int n2, final int n3, final int n4) {
        while (this.field1355 > 0) {
            int n5 = n + this.field1355;
            if (n5 > n3) {
                n5 = n3;
            }
            this.field1355 += n;
            if (this.field1364 == -256 && (this.field1357 & 0xFF) == 0x0) {
                if (Class95.field1295) {
                    n = method2293(0, ((Class93)super.field1383).field1278, array, this.field1357, n, this.field1360, this.field1361, this.field1368, this.field1369, 0, n5, n2, this);
                }
                else {
                    n = method2328(((Class93)super.field1383).field1278, array, this.field1357, n, this.field1359, this.field1358, 0, n5, n2, this);
                }
            }
            else if (Class95.field1295) {
                n = method2360(0, 0, ((Class93)super.field1383).field1278, array, this.field1357, n, this.field1360, this.field1361, this.field1368, this.field1369, 0, n5, n2, this, this.field1364, n4);
            }
            else {
                n = method2271(0, 0, ((Class93)super.field1383).field1278, array, this.field1357, n, this.field1359, this.field1358, 0, n5, n2, this, this.field1364, n4);
            }
            this.field1355 -= n;
            if (this.field1355 != 0) {
                return n;
            }
            if (this.method2281()) {
                return n3;
            }
        }
        if (this.field1364 == -256 && (this.field1357 & 0xFF) == 0x0) {
            if (Class95.field1295) {
                return method2274(0, ((Class93)super.field1383).field1278, array, this.field1357, n, this.field1360, this.field1361, 0, n3, n2, this);
            }
            return method2374(((Class93)super.field1383).field1278, array, this.field1357, n, this.field1359, 0, n3, n2, this);
        }
        else {
            if (Class95.field1295) {
                return method2289(0, 0, ((Class93)super.field1383).field1278, array, this.field1357, n, this.field1360, this.field1361, 0, n3, n2, this, this.field1364, n4);
            }
            return method2362(0, 0, ((Class93)super.field1383).field1278, array, this.field1357, n, this.field1359, 0, n3, n2, this, this.field1364, n4);
        }
    }
    
    @ObfuscatedName("ax")
    @Override
    int vmethod2435() {
        final int n = this.field1359 * 3 >> 6;
        int n2 = (n ^ n >> 31) + (n >>> 31);
        if (this.field1362 == 0) {
            n2 -= n2 * this.field1357 / (((Class93)super.field1383).field1278.length << 8);
        }
        else if (this.field1362 >= 0) {
            n2 -= n2 * this.field1363 / ((Class93)super.field1383).field1278.length;
        }
        return (n2 > 255) ? 255 : n2;
    }
    
    @ObfuscatedName("am")
    boolean method2281() {
        int field1356 = this.field1356;
        int method2251;
        int method2252;
        if (field1356 == Integer.MIN_VALUE) {
            method2251 = 0;
            method2252 = 0;
            field1356 = 0;
        }
        else {
            method2252 = method2341(field1356, this.field1366);
            method2251 = method2251(field1356, this.field1366);
        }
        if (field1356 != this.field1359 || method2252 != this.field1360 || method2251 != this.field1361) {
            if (this.field1359 < field1356) {
                this.field1358 = 1;
                this.field1355 = field1356 - this.field1359;
            }
            else if (this.field1359 > field1356) {
                this.field1358 = -1;
                this.field1355 = this.field1359 - field1356;
            }
            else {
                this.field1358 = 0;
            }
            if (this.field1360 < method2252) {
                this.field1368 = 1;
                if (this.field1355 == 0 || this.field1355 > method2252 - this.field1360) {
                    this.field1355 = method2252 - this.field1360;
                }
            }
            else if (this.field1360 > method2252) {
                this.field1368 = -1;
                if (this.field1355 == 0 || this.field1355 > this.field1360 - method2252) {
                    this.field1355 = this.field1360 - method2252;
                }
            }
            else {
                this.field1368 = 0;
            }
            if (this.field1361 < method2251) {
                this.field1369 = 1;
                if (this.field1355 == 0 || this.field1355 > method2251 - this.field1361) {
                    this.field1355 = method2251 - this.field1361;
                }
            }
            else if (this.field1361 > method2251) {
                this.field1369 = -1;
                if (this.field1355 == 0 || this.field1355 > this.field1361 - method2251) {
                    this.field1355 = this.field1361 - method2251;
                }
            }
            else {
                this.field1369 = 0;
            }
            return false;
        }
        if (this.field1356 == Integer.MIN_VALUE) {
            this.field1356 = 0;
            this.field1361 = 0;
            this.field1360 = 0;
            this.field1359 = 0;
            this.method4064();
            return true;
        }
        this.method2324();
        return false;
    }
    
    @ObfuscatedName("z")
    static int method2341(final int n, final int n2) {
        return (n2 < 0) ? n : ((int)(n * Math.sqrt((16384 - n2) * 1.220703125E-4) + 0.5));
    }
    
    @ObfuscatedName("w")
    static int method2251(final int n, final int n2) {
        return (n2 < 0) ? (-n) : ((int)(n * Math.sqrt(n2 * 1.220703125E-4) + 0.5));
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lct;II)Lcm;")
    public static Class103 method2287(final Class93 class93, final int n, final int n2) {
        if (class93.field1278 == null || class93.field1278.length == 0) {
            return null;
        }
        return new Class103(class93, (int)(class93.field1279 * 256L * n / (Class95.field1300 * 100)), n2 << 6);
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Lct;III)Lcm;")
    public static Class103 method2256(final Class93 class93, final int n, final int n2, final int n3) {
        if (class93.field1278 != null && class93.field1278.length != 0) {
            return new Class103(class93, n, n2, n3);
        }
        return null;
    }
    
    @ObfuscatedName("ay")
    @ObfuscatedSignature(signature = "([B[IIIIIIILcm;)I")
    static int method2275(final byte[] array, final int[] array2, int n, int i, int n2, int n3, final int n4, int n5, final Class103 class103) {
        n >>= 8;
        n5 >>= 8;
        n2 <<= 2;
        if ((n3 = i + n5 - n) > n4) {
            n3 = n4;
        }
        int n6;
        int n7;
        int n8;
        int n9;
        for (n3 -= 3; i < n3; n6 = i++, array2[n6] += array[n++] * n2, n7 = i++, array2[n7] += array[n++] * n2, n8 = i++, array2[n8] += array[n++] * n2, n9 = i++, array2[n9] += array[n++] * n2) {}
        int n10;
        for (n3 += 3; i < n3; n10 = i++, array2[n10] += array[n++] * n2) {}
        class103.field1357 = n << 8;
        return i;
    }
    
    @ObfuscatedName("ag")
    @ObfuscatedSignature(signature = "(I[B[IIIIIIIILcm;)I")
    static int method2283(int n, final byte[] array, final int[] array2, int n2, int i, int n3, int n4, int n5, final int n6, int n7, final Class103 class103) {
        n2 >>= 8;
        n7 >>= 8;
        n3 <<= 2;
        n4 <<= 2;
        if ((n5 = i + n7 - n2) > n6) {
            n5 = n6;
        }
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        for (i <<= 1, n5 <<= 1, n5 -= 6; i < n5; n8 = i++, array2[n8] += n * n3, n9 = i++, array2[n9] += n * n4, n = array[n2++], n10 = i++, array2[n10] += n * n3, n11 = i++, array2[n11] += n * n4, n = array[n2++], n12 = i++, array2[n12] += n * n3, n13 = i++, array2[n13] += n * n4, n = array[n2++], n14 = i++, array2[n14] += n * n3, n15 = i++, array2[n15] += n * n4) {
            n = array[n2++];
        }
        int n16;
        int n17;
        for (n5 += 6; i < n5; n16 = i++, array2[n16] += n * n3, n17 = i++, array2[n17] += n * n4) {
            n = array[n2++];
        }
        class103.field1357 = n2 << 8;
        return i >> 1;
    }
    
    @ObfuscatedName("bk")
    @ObfuscatedSignature(signature = "([B[IIIIIIILcm;)I")
    static int method2374(final byte[] array, final int[] array2, int n, int i, int n2, int n3, final int n4, int n5, final Class103 class103) {
        n >>= 8;
        n5 >>= 8;
        n2 <<= 2;
        if ((n3 = i + n - (n5 - 1)) > n4) {
            n3 = n4;
        }
        int n6;
        int n7;
        int n8;
        int n9;
        for (n3 -= 3; i < n3; n6 = i++, array2[n6] += array[n--] * n2, n7 = i++, array2[n7] += array[n--] * n2, n8 = i++, array2[n8] += array[n--] * n2, n9 = i++, array2[n9] += array[n--] * n2) {}
        int n10;
        for (n3 += 3; i < n3; n10 = i++, array2[n10] += array[n--] * n2) {}
        class103.field1357 = n << 8;
        return i;
    }
    
    @ObfuscatedName("bp")
    @ObfuscatedSignature(signature = "(I[B[IIIIIIIILcm;)I")
    static int method2274(int n, final byte[] array, final int[] array2, int n2, int i, int n3, int n4, int n5, final int n6, int n7, final Class103 class103) {
        n2 >>= 8;
        n7 >>= 8;
        n3 <<= 2;
        n4 <<= 2;
        if ((n5 = n2 + i - (n7 - 1)) > n6) {
            n5 = n6;
        }
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        for (i <<= 1, n5 <<= 1, n5 -= 6; i < n5; n8 = i++, array2[n8] += n * n3, n9 = i++, array2[n9] += n * n4, n = array[n2--], n10 = i++, array2[n10] += n * n3, n11 = i++, array2[n11] += n * n4, n = array[n2--], n12 = i++, array2[n12] += n * n3, n13 = i++, array2[n13] += n * n4, n = array[n2--], n14 = i++, array2[n14] += n * n3, n15 = i++, array2[n15] += n * n4) {
            n = array[n2--];
        }
        int n16;
        int n17;
        for (n5 += 6; i < n5; n16 = i++, array2[n16] += n * n3, n17 = i++, array2[n17] += n * n4) {
            n = array[n2--];
        }
        class103.field1357 = n2 << 8;
        return i >> 1;
    }
    
    @ObfuscatedName("bi")
    @ObfuscatedSignature(signature = "(II[B[IIIIIIILcm;II)I")
    static int method2286(int n, int n2, final byte[] array, final int[] array2, int field1357, int i, final int n3, int n4, final int n5, final int n6, final Class103 class103, final int n7, final int n8) {
        if (n7 == 0 || (n4 = i + (n7 + (n6 - field1357) - 257) / n7) > n5) {
            n4 = n5;
        }
        while (i < n4) {
            n2 = field1357 >> 8;
            n = array[n2];
            final int n9 = i++;
            array2[n9] += ((n << 8) + (array[n2 + 1] - n) * (field1357 & 0xFF)) * n3 >> 6;
            field1357 += n7;
        }
        if (n7 == 0 || (n4 = i + (n7 + (n6 - field1357) - 1) / n7) > n5) {
            n4 = n5;
        }
        int n10;
        for (n2 = n8; i < n4; n10 = i++, array2[n10] += ((n << 8) + (n2 - n) * (field1357 & 0xFF)) * n3 >> 6, field1357 += n7) {
            n = array[field1357 >> 8];
        }
        class103.field1357 = field1357;
        return i;
    }
    
    @ObfuscatedName("bj")
    @ObfuscatedSignature(signature = "(II[B[IIIIIIIILcm;II)I")
    static int method2302(int n, int n2, final byte[] array, final int[] array2, int field1357, int i, final int n3, final int n4, int n5, final int n6, final int n7, final Class103 class103, final int n8, final int n9) {
        if (n8 == 0 || (n5 = i + (n7 - field1357 + n8 - 257) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * n3 >> 6, n11 = i++, array2[n11] += n * n4 >> 6, field1357 += n8) {
            n2 = field1357 >> 8;
            n = array[n2];
            n = (n << 8) + (field1357 & 0xFF) * (array[n2 + 1] - n);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - field1357 + n8 - 1) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = array[field1357 >> 8];
            n = (n << 8) + (n2 - n) * (field1357 & 0xFF);
            final int n12 = i++;
            array2[n12] += n * n3 >> 6;
            final int n13 = i++;
            array2[n13] += n * n4 >> 6;
            field1357 += n8;
        }
        class103.field1357 = field1357;
        return i >> 1;
    }
    
    @ObfuscatedName("bo")
    @ObfuscatedSignature(signature = "(II[B[IIIIIIILcm;II)I")
    static int method2362(int n, int n2, final byte[] array, final int[] array2, int field1357, int i, final int n3, int n4, final int n5, final int n6, final Class103 class103, final int n7, final int n8) {
        if (n7 == 0 || (n4 = i + (n7 + (n6 + 256 - field1357)) / n7) > n5) {
            n4 = n5;
        }
        while (i < n4) {
            n2 = field1357 >> 8;
            n = array[n2 - 1];
            final int n9 = i++;
            array2[n9] += ((n << 8) + (array[n2] - n) * (field1357 & 0xFF)) * n3 >> 6;
            field1357 += n7;
        }
        if (n7 == 0 || (n4 = i + (n7 + (n6 - field1357)) / n7) > n5) {
            n4 = n5;
        }
        int n10;
        for (n = n8, n2 = n7; i < n4; n10 = i++, array2[n10] += ((n << 8) + (array[field1357 >> 8] - n) * (field1357 & 0xFF)) * n3 >> 6, field1357 += n2) {}
        class103.field1357 = field1357;
        return i;
    }
    
    @ObfuscatedName("bq")
    @ObfuscatedSignature(signature = "(II[B[IIIIIIIILcm;II)I")
    static int method2289(int n, int n2, final byte[] array, final int[] array2, int field1357, int i, final int n3, final int n4, int n5, final int n6, final int n7, final Class103 class103, final int n8, final int n9) {
        if (n8 == 0 || (n5 = i + (n7 + 256 - field1357 + n8) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * n3 >> 6, n11 = i++, array2[n11] += n * n4 >> 6, field1357 += n8) {
            n2 = field1357 >> 8;
            n = array[n2 - 1];
            n = (array[n2] - n) * (field1357 & 0xFF) + (n << 8);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - field1357 + n8) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = (n2 << 8) + (field1357 & 0xFF) * (array[field1357 >> 8] - n2);
            final int n12 = i++;
            array2[n12] += n * n3 >> 6;
            final int n13 = i++;
            array2[n13] += n * n4 >> 6;
            field1357 += n8;
        }
        class103.field1357 = field1357;
        return i >> 1;
    }
    
    @ObfuscatedName("bh")
    @ObfuscatedSignature(signature = "([B[IIIIIIIILcm;)I")
    static int method2417(final byte[] array, final int[] array2, int n, int i, int n2, int n3, int n4, final int n5, int n6, final Class103 class103) {
        n >>= 8;
        n6 >>= 8;
        n2 <<= 2;
        n3 <<= 2;
        if ((n4 = i + n6 - n) > n5) {
            n4 = n5;
        }
        class103.field1360 += class103.field1368 * (n4 - i);
        class103.field1361 += class103.field1369 * (n4 - i);
        int n7;
        int n8;
        int n9;
        int n10;
        for (n4 -= 3; i < n4; n7 = i++, array2[n7] += array[n++] * n2, n2 += n3, n8 = i++, array2[n8] += array[n++] * n2, n2 += n3, n9 = i++, array2[n9] += array[n++] * n2, n2 += n3, n10 = i++, array2[n10] += array[n++] * n2, n2 += n3) {}
        int n11;
        for (n4 += 3; i < n4; n11 = i++, array2[n11] += array[n++] * n2, n2 += n3) {}
        class103.field1359 = n2 >> 2;
        class103.field1357 = n << 8;
        return i;
    }
    
    @ObfuscatedName("bz")
    @ObfuscatedSignature(signature = "(I[B[IIIIIIIIIILcm;)I")
    static int method2288(int n, final byte[] array, final int[] array2, int n2, int i, int n3, int n4, int n5, int n6, int n7, final int n8, int n9, final Class103 class103) {
        n2 >>= 8;
        n9 >>= 8;
        n3 <<= 2;
        n4 <<= 2;
        n5 <<= 2;
        n6 <<= 2;
        if ((n7 = n9 + i - n2) > n8) {
            n7 = n8;
        }
        class103.field1359 += class103.field1358 * (n7 - i);
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        for (i <<= 1, n7 <<= 1, n7 -= 6; i < n7; n10 = i++, array2[n10] += n * n3, n3 += n5, n11 = i++, array2[n11] += n * n4, n4 += n6, n = array[n2++], n12 = i++, array2[n12] += n * n3, n3 += n5, n13 = i++, array2[n13] += n * n4, n4 += n6, n = array[n2++], n14 = i++, array2[n14] += n * n3, n3 += n5, n15 = i++, array2[n15] += n * n4, n4 += n6, n = array[n2++], n16 = i++, array2[n16] += n * n3, n3 += n5, n17 = i++, array2[n17] += n * n4, n4 += n6) {
            n = array[n2++];
        }
        int n18;
        int n19;
        for (n7 += 6; i < n7; n18 = i++, array2[n18] += n * n3, n3 += n5, n19 = i++, array2[n19] += n * n4, n4 += n6) {
            n = array[n2++];
        }
        class103.field1360 = n3 >> 2;
        class103.field1361 = n4 >> 2;
        class103.field1357 = n2 << 8;
        return i >> 1;
    }
    
    @ObfuscatedName("bu")
    @ObfuscatedSignature(signature = "([B[IIIIIIIILcm;)I")
    static int method2328(final byte[] array, final int[] array2, int n, int i, int n2, int n3, int n4, final int n5, int n6, final Class103 class103) {
        n >>= 8;
        n6 >>= 8;
        n2 <<= 2;
        n3 <<= 2;
        if ((n4 = i + n - (n6 - 1)) > n5) {
            n4 = n5;
        }
        class103.field1360 += class103.field1368 * (n4 - i);
        class103.field1361 += class103.field1369 * (n4 - i);
        int n7;
        int n8;
        int n9;
        int n10;
        for (n4 -= 3; i < n4; n7 = i++, array2[n7] += array[n--] * n2, n2 += n3, n8 = i++, array2[n8] += array[n--] * n2, n2 += n3, n9 = i++, array2[n9] += array[n--] * n2, n2 += n3, n10 = i++, array2[n10] += array[n--] * n2, n2 += n3) {}
        int n11;
        for (n4 += 3; i < n4; n11 = i++, array2[n11] += array[n--] * n2, n2 += n3) {}
        class103.field1359 = n2 >> 2;
        class103.field1357 = n << 8;
        return i;
    }
    
    @ObfuscatedName("bg")
    @ObfuscatedSignature(signature = "(I[B[IIIIIIIIIILcm;)I")
    static int method2293(int n, final byte[] array, final int[] array2, int n2, int i, int n3, int n4, int n5, int n6, int n7, final int n8, int n9, final Class103 class103) {
        n2 >>= 8;
        n9 >>= 8;
        n3 <<= 2;
        n4 <<= 2;
        n5 <<= 2;
        n6 <<= 2;
        if ((n7 = n2 + i - (n9 - 1)) > n8) {
            n7 = n8;
        }
        class103.field1359 += class103.field1358 * (n7 - i);
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        for (i <<= 1, n7 <<= 1, n7 -= 6; i < n7; n10 = i++, array2[n10] += n * n3, n3 += n5, n11 = i++, array2[n11] += n * n4, n4 += n6, n = array[n2--], n12 = i++, array2[n12] += n * n3, n3 += n5, n13 = i++, array2[n13] += n * n4, n4 += n6, n = array[n2--], n14 = i++, array2[n14] += n * n3, n3 += n5, n15 = i++, array2[n15] += n * n4, n4 += n6, n = array[n2--], n16 = i++, array2[n16] += n * n3, n3 += n5, n17 = i++, array2[n17] += n * n4, n4 += n6) {
            n = array[n2--];
        }
        int n18;
        int n19;
        for (n7 += 6; i < n7; n18 = i++, array2[n18] += n * n3, n3 += n5, n19 = i++, array2[n19] += n * n4, n4 += n6) {
            n = array[n2--];
        }
        class103.field1360 = n3 >> 2;
        class103.field1361 = n4 >> 2;
        class103.field1357 = n2 << 8;
        return i >> 1;
    }
    
    @ObfuscatedName("bl")
    @ObfuscatedSignature(signature = "(II[B[IIIIIIIILcm;II)I")
    static int method2294(int n, int n2, final byte[] array, final int[] array2, int field1357, int i, int field1358, final int n3, int n4, final int n5, final int n6, final Class103 class103, final int n7, final int n8) {
        class103.field1360 -= class103.field1368 * i;
        class103.field1361 -= class103.field1369 * i;
        if (n7 == 0 || (n4 = i + (n6 - field1357 + n7 - 257) / n7) > n5) {
            n4 = n5;
        }
        while (i < n4) {
            n2 = field1357 >> 8;
            n = array[n2];
            final int n9 = i++;
            array2[n9] += ((n << 8) + (array[n2 + 1] - n) * (field1357 & 0xFF)) * field1358 >> 6;
            field1358 += n3;
            field1357 += n7;
        }
        if (n7 == 0 || (n4 = i + (n6 - field1357 + n7 - 1) / n7) > n5) {
            n4 = n5;
        }
        int n10;
        for (n2 = n8; i < n4; n10 = i++, array2[n10] += ((n << 8) + (n2 - n) * (field1357 & 0xFF)) * field1358 >> 6, field1358 += n3, field1357 += n7) {
            n = array[field1357 >> 8];
        }
        class103.field1360 += class103.field1368 * i;
        class103.field1361 += class103.field1369 * i;
        class103.field1359 = field1358;
        class103.field1357 = field1357;
        return i;
    }
    
    @ObfuscatedName("ba")
    @ObfuscatedSignature(signature = "(II[B[IIIIIIIIIILcm;II)I")
    static int method2295(int n, int n2, final byte[] array, final int[] array2, int field1357, int i, int field1358, int field1359, final int n3, final int n4, int n5, final int n6, final int n7, final Class103 class103, final int n8, final int n9) {
        class103.field1359 -= i * class103.field1358;
        if (n8 == 0 || (n5 = i + (n7 - field1357 + n8 - 257) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * field1358 >> 6, field1358 += n3, n11 = i++, array2[n11] += n * field1359 >> 6, field1359 += n4, field1357 += n8) {
            n2 = field1357 >> 8;
            n = array[n2];
            n = (n << 8) + (field1357 & 0xFF) * (array[n2 + 1] - n);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - field1357 + n8 - 1) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = array[field1357 >> 8];
            n = (n << 8) + (n2 - n) * (field1357 & 0xFF);
            final int n12 = i++;
            array2[n12] += n * field1358 >> 6;
            field1358 += n3;
            final int n13 = i++;
            array2[n13] += n * field1359 >> 6;
            field1359 += n4;
            field1357 += n8;
        }
        i >>= 1;
        class103.field1359 += class103.field1358 * i;
        class103.field1360 = field1358;
        class103.field1361 = field1359;
        class103.field1357 = field1357;
        return i;
    }
    
    @ObfuscatedName("bn")
    @ObfuscatedSignature(signature = "(II[B[IIIIIIIILcm;II)I")
    static int method2271(int n, int n2, final byte[] array, final int[] array2, int field1357, int i, int field1358, final int n3, int n4, final int n5, final int n6, final Class103 class103, final int n7, final int n8) {
        class103.field1360 -= class103.field1368 * i;
        class103.field1361 -= class103.field1369 * i;
        if (n7 == 0 || (n4 = i + (n6 + 256 - field1357 + n7) / n7) > n5) {
            n4 = n5;
        }
        while (i < n4) {
            n2 = field1357 >> 8;
            n = array[n2 - 1];
            final int n9 = i++;
            array2[n9] += ((n << 8) + (array[n2] - n) * (field1357 & 0xFF)) * field1358 >> 6;
            field1358 += n3;
            field1357 += n7;
        }
        if (n7 == 0 || (n4 = i + (n6 - field1357 + n7) / n7) > n5) {
            n4 = n5;
        }
        int n10;
        for (n = n8, n2 = n7; i < n4; n10 = i++, array2[n10] += ((n << 8) + (array[field1357 >> 8] - n) * (field1357 & 0xFF)) * field1358 >> 6, field1358 += n3, field1357 += n2) {}
        class103.field1360 += class103.field1368 * i;
        class103.field1361 += class103.field1369 * i;
        class103.field1359 = field1358;
        class103.field1357 = field1357;
        return i;
    }
    
    @ObfuscatedName("bb")
    @ObfuscatedSignature(signature = "(II[B[IIIIIIIIIILcm;II)I")
    static int method2360(int n, int n2, final byte[] array, final int[] array2, int field1357, int i, int field1358, int field1359, final int n3, final int n4, int n5, final int n6, final int n7, final Class103 class103, final int n8, final int n9) {
        class103.field1359 -= i * class103.field1358;
        if (n8 == 0 || (n5 = i + (n7 + 256 - field1357 + n8) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * field1358 >> 6, field1358 += n3, n11 = i++, array2[n11] += n * field1359 >> 6, field1359 += n4, field1357 += n8) {
            n2 = field1357 >> 8;
            n = array[n2 - 1];
            n = (array[n2] - n) * (field1357 & 0xFF) + (n << 8);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - field1357 + n8) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = (n2 << 8) + (field1357 & 0xFF) * (array[field1357 >> 8] - n2);
            final int n12 = i++;
            array2[n12] += n * field1358 >> 6;
            field1358 += n3;
            final int n13 = i++;
            array2[n13] += n * field1359 >> 6;
            field1359 += n4;
            field1357 += n8;
        }
        i >>= 1;
        class103.field1359 += class103.field1358 * i;
        class103.field1360 = field1358;
        class103.field1361 = field1359;
        class103.field1357 = field1357;
        return i;
    }
}
