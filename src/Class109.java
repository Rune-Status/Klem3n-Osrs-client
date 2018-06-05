import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("dy")
public class Class109
{
    @ObfuscatedName("gb")
    @ObfuscatedGetter(intValue = -616699681)
    static int field1431;
    @ObfuscatedName("gx")
    @ObfuscatedGetter(intValue = -1361811045)
    static int field1428;
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Ldv;")
    Class110 field1425;
    @ObfuscatedName("w")
    byte[] field1418;
    @ObfuscatedName("s")
    @ObfuscatedGetter(longValue = -3424543290675881475L)
    long field1417;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -1746214469)
    int field1421;
    @ObfuscatedName("u")
    byte[] field1423;
    @ObfuscatedName("q")
    @ObfuscatedGetter(longValue = 3274252712356881353L)
    long field1420;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 2034614507)
    int field1426;
    @ObfuscatedName("i")
    @ObfuscatedGetter(longValue = 3254553962279722903L)
    long field1424;
    @ObfuscatedName("x")
    @ObfuscatedGetter(longValue = 2659913085887693439L)
    long field1422;
    @ObfuscatedName("e")
    @ObfuscatedGetter(longValue = -1520059601555540455L)
    long field1429;
    @ObfuscatedName("p")
    @ObfuscatedGetter(longValue = -4630283547641529923L)
    long field1427;
    
    public Class109(final Class110 field1425, final int n, final int n2) throws IOException {
        this.field1417 = -1L;
        this.field1420 = -1L;
        this.field1426 = 0;
        this.field1425 = field1425;
        final long method2509 = field1425.method2509();
        this.field1422 = method2509;
        this.field1429 = method2509;
        this.field1418 = new byte[n];
        this.field1423 = new byte[n2];
        this.field1424 = 0L;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-2129971155")
    public void method2493() throws IOException {
        this.method2482();
        this.field1425.method2507();
    }
    
    @ObfuscatedName("w")
    public void method2476(final long field1424) throws IOException {
        if (field1424 < 0L) {
            throw new IOException("");
        }
        this.field1424 = field1424;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I)J", garbageValue = "711180324")
    public long method2486() {
        return this.field1429;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "([BI)V", garbageValue = "1031181832")
    public void method2478(final byte[] array) throws IOException {
        this.method2479(array, 0, array.length);
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "([BIII)V", garbageValue = "-1873838718")
    public void method2479(final byte[] array, int i, int j) throws IOException {
        try {
            if (j + i > array.length) {
                throw new ArrayIndexOutOfBoundsException(j + i - array.length);
            }
            if (-1L != this.field1420 && this.field1424 >= this.field1420 && this.field1424 + j <= this.field1426 + this.field1420) {
                System.arraycopy(this.field1423, (int)(this.field1424 - this.field1420), array, i, j);
                this.field1424 += j;
                return;
            }
            final long field1424 = this.field1424;
            final int n = i;
            final int n2 = j;
            if (this.field1424 >= this.field1417 && this.field1424 < this.field1421 + this.field1417) {
                int n3 = (int)(this.field1421 - (this.field1424 - this.field1417));
                if (n3 > j) {
                    n3 = j;
                }
                System.arraycopy(this.field1418, (int)(this.field1424 - this.field1417), array, i, n3);
                this.field1424 += n3;
                i += n3;
                j -= n3;
            }
            if (j > this.field1418.length) {
                this.field1425.method2514(this.field1424);
                this.field1427 = this.field1424;
                while (j > 0) {
                    final int method2510 = this.field1425.method2510(array, i, j);
                    if (method2510 == -1) {
                        break;
                    }
                    this.field1427 += method2510;
                    this.field1424 += method2510;
                    i += method2510;
                    j -= method2510;
                }
            }
            else if (j > 0) {
                this.method2480();
                int field1425 = j;
                if (field1425 > this.field1421) {
                    field1425 = this.field1421;
                }
                System.arraycopy(this.field1418, 0, array, i, field1425);
                i += field1425;
                j -= field1425;
                this.field1424 += field1425;
            }
            if (-1L != this.field1420) {
                if (this.field1420 > this.field1424 && j > 0) {
                    int n4 = i + (int)(this.field1420 - this.field1424);
                    if (n4 > j + i) {
                        n4 = j + i;
                    }
                    while (i < n4) {
                        array[i++] = 0;
                        --j;
                        ++this.field1424;
                    }
                }
                long field1426 = -1L;
                long field1427 = -1L;
                if (this.field1420 >= field1424 && this.field1420 < field1424 + n2) {
                    field1426 = this.field1420;
                }
                else if (field1424 >= this.field1420 && field1424 < this.field1420 + this.field1426) {
                    field1426 = field1424;
                }
                if (this.field1426 + this.field1420 > field1424 && this.field1420 + this.field1426 <= field1424 + n2) {
                    field1427 = this.field1420 + this.field1426;
                }
                else if (n2 + field1424 > this.field1420 && field1424 + n2 <= this.field1426 + this.field1420) {
                    field1427 = n2 + field1424;
                }
                if (field1426 > -1L && field1427 > field1426) {
                    System.arraycopy(this.field1423, (int)(field1426 - this.field1420), array, (int)(field1426 - field1424) + n, (int)(field1427 - field1426));
                    if (field1427 > this.field1424) {
                        j -= (int)(field1427 - this.field1424);
                        this.field1424 = field1427;
                    }
                }
            }
        }
        catch (IOException ex) {
            this.field1427 = -1L;
            throw ex;
        }
        if (j > 0) {
            throw new EOFException();
        }
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1728368269")
    void method2480() throws IOException {
        this.field1421 = 0;
        if (this.field1427 != this.field1424) {
            this.field1425.method2514(this.field1424);
            this.field1427 = this.field1424;
        }
        this.field1417 = this.field1424;
        while (this.field1421 < this.field1418.length) {
            final int method2510 = this.field1425.method2510(this.field1418, this.field1421, this.field1418.length - this.field1421);
            if (method2510 == -1) {
                break;
            }
            this.field1427 += method2510;
            this.field1421 += method2510;
        }
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "([BIII)V", garbageValue = "1219631347")
    public void method2481(final byte[] array, int n, int n2) throws IOException {
        try {
            if (n2 + this.field1424 > this.field1429) {
                this.field1429 = n2 + this.field1424;
            }
            if (-1L != this.field1420 && (this.field1424 < this.field1420 || this.field1424 > this.field1420 + this.field1426)) {
                this.method2482();
            }
            if (-1L != this.field1420 && this.field1424 + n2 > this.field1423.length + this.field1420) {
                final int n3 = (int)(this.field1423.length - (this.field1424 - this.field1420));
                System.arraycopy(array, n, this.field1423, (int)(this.field1424 - this.field1420), n3);
                this.field1424 += n3;
                n += n3;
                n2 -= n3;
                this.field1426 = this.field1423.length;
                this.method2482();
            }
            if (n2 > this.field1423.length) {
                if (this.field1427 != this.field1424) {
                    this.field1425.method2514(this.field1424);
                    this.field1427 = this.field1424;
                }
                this.field1425.method2506(array, n, n2);
                this.field1427 += n2;
                if (this.field1427 > this.field1422) {
                    this.field1422 = this.field1427;
                }
                long n4 = -1L;
                long n5 = -1L;
                if (this.field1424 >= this.field1417 && this.field1424 < this.field1417 + this.field1421) {
                    n4 = this.field1424;
                }
                else if (this.field1417 >= this.field1424 && this.field1417 < this.field1424 + n2) {
                    n4 = this.field1417;
                }
                if (n2 + this.field1424 > this.field1417 && n2 + this.field1424 <= this.field1421 + this.field1417) {
                    n5 = n2 + this.field1424;
                }
                else if (this.field1421 + this.field1417 > this.field1424 && this.field1417 + this.field1421 <= this.field1424 + n2) {
                    n5 = this.field1421 + this.field1417;
                }
                if (n4 > -1L && n5 > n4) {
                    System.arraycopy(array, (int)(n4 + n - this.field1424), this.field1418, (int)(n4 - this.field1417), (int)(n5 - n4));
                }
                this.field1424 += n2;
                return;
            }
            if (n2 > 0) {
                if (this.field1420 == -1L) {
                    this.field1420 = this.field1424;
                }
                System.arraycopy(array, n, this.field1423, (int)(this.field1424 - this.field1420), n2);
                this.field1424 += n2;
                if (this.field1424 - this.field1420 > this.field1426) {
                    this.field1426 = (int)(this.field1424 - this.field1420);
                }
            }
        }
        catch (IOException ex) {
            this.field1427 = -1L;
            throw ex;
        }
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "-4")
    void method2482() throws IOException {
        if (-1L != this.field1420) {
            if (this.field1420 != this.field1427) {
                this.field1425.method2514(this.field1420);
                this.field1427 = this.field1420;
            }
            this.field1425.method2506(this.field1423, 0, this.field1426);
            this.field1427 += this.field1426 * 1776216003 * 2034614507L;
            if (this.field1427 > this.field1422) {
                this.field1422 = this.field1427;
            }
            long n = -1L;
            long n2 = -1L;
            if (this.field1420 >= this.field1417 && this.field1420 < this.field1417 + this.field1421) {
                n = this.field1420;
            }
            else if (this.field1417 >= this.field1420 && this.field1417 < this.field1426 + this.field1420) {
                n = this.field1417;
            }
            if (this.field1426 + this.field1420 > this.field1417 && this.field1420 + this.field1426 <= this.field1421 + this.field1417) {
                n2 = this.field1426 + this.field1420;
            }
            else if (this.field1421 + this.field1417 > this.field1420 && this.field1421 + this.field1417 <= this.field1426 + this.field1420) {
                n2 = this.field1421 + this.field1417;
            }
            if (n > -1L && n2 > n) {
                System.arraycopy(this.field1423, (int)(n - this.field1420), this.field1418, (int)(n - this.field1417), (int)(n2 - n));
            }
            this.field1420 = -1L;
            this.field1426 = 0;
        }
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(Lbb;Lbb;IZIZI)I", garbageValue = "623148827")
    static int method2503(final Class65 class65, final Class65 class66, final int n, final boolean b, final int n2, final boolean b2) {
        final int method428 = Class26.method428(class65, class66, n, b);
        if (method428 != 0) {
            if (b) {
                return -method428;
            }
            return method428;
        }
        else {
            if (n2 == -1) {
                return 0;
            }
            final int method429 = Class26.method428(class65, class66, n2, b2);
            if (b2) {
                return -method429;
            }
            return method429;
        }
    }
    
    @ObfuscatedName("q")
    public static int method2484(final long n) {
        return (int)(n >>> 7 & 0x7FL);
    }
}
