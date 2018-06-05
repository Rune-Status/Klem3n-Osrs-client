import java.io.RandomAccessFile;
import java.io.File;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("by")
public final class Class70 extends Class127
{
    @ObfuscatedName("qa")
    @ObfuscatedGetter(longValue = 6136871153165894453L)
    static long field1013;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -904369215)
    int field1017;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -975901259)
    int field1023;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -975475893)
    int field1012;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 1389377337)
    int field1014;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 1930171125)
    int field1015;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 1202134777)
    int field1016;
    @ObfuscatedName("k")
    @ObfuscatedSignature(signature = "Ljn;")
    Class273 field1018;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -1404768991)
    int field1019;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = 1843616515)
    int field1020;
    @ObfuscatedName("e")
    boolean field1021;
    
    Class70(final int field1023, final int field1024, final int field1025, final int field1026, final int field1027, final int n, final int n2) {
        this.field1019 = 0;
        this.field1020 = 0;
        this.field1021 = false;
        this.field1023 = field1023;
        this.field1014 = field1024;
        this.field1015 = field1025;
        this.field1016 = field1026;
        this.field1017 = field1027;
        this.field1012 = n2 + n;
        final int field1028 = Class57.method1035(this.field1023).field3271;
        if (field1028 != -1) {
            this.field1021 = false;
            this.field1018 = Class3.method25(field1028);
        }
        else {
            this.field1021 = true;
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(IB)V", garbageValue = "-58")
    final void method1771(final int n) {
        if (this.field1021) {
            return;
        }
        this.field1020 += n;
        while (this.field1020 > this.field1018.field3541[this.field1019]) {
            this.field1020 -= this.field1018.field3541[this.field1019];
            ++this.field1019;
            if (this.field1019 >= this.field1018.field3540.length) {
                this.field1021 = true;
                break;
            }
        }
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(I)Ldc;", garbageValue = "2119202332")
    @Override
    protected final Class119 vmethod3067() {
        final Class258 method1035 = Class57.method1035(this.field1023);
        Class119 class119;
        if (!this.field1021) {
            class119 = method1035.method4866(this.field1019);
        }
        else {
            class119 = method1035.method4866(-1);
        }
        if (class119 == null) {
            return null;
        }
        return class119;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Ljava/io/File;ZI)Z", garbageValue = "307061840")
    static boolean method1766(final File file, final boolean b) {
        try {
            final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            final int read = randomAccessFile.read();
            randomAccessFile.seek(0L);
            randomAccessFile.write(read);
            randomAccessFile.seek(0L);
            randomAccessFile.close();
            if (b) {
                file.delete();
            }
            return true;
        }
        catch (Exception ex) {
            return false;
        }
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(ILce;ZB)I", garbageValue = "5")
    static int method1768(int n, final Class84 class84, final boolean b) {
        Class230 method434;
        if (n >= 2000) {
            n -= 1000;
            method434 = Class26.method434(Class69.field999[--Class69.field1003]);
        }
        else {
            method434 = (b ? Class276.field3561 : Class260.field3301);
        }
        Class60.method1114(method434);
        if (n == 1200 || n == 1205 || n == 1212) {
            Class69.field1003 -= 2;
            final int field2649 = Class69.field999[Class69.field1003];
            final int field2650 = Class69.field999[Class69.field1003 + 1];
            method434.field2649 = field2649;
            method434.field2727 = field2650;
            final Class269 method435 = Class111.method2563(field2649);
            method434.field2656 = method435.field3439;
            method434.field2657 = method435.field3440;
            method434.field2658 = method435.field3474;
            method434.field2592 = method435.field3442;
            method434.field2655 = method435.field3443;
            method434.field2704 = method435.field3438;
            if (n == 1205) {
                method434.field2664 = 0;
            }
            else if (n == 1212 | 1 == method435.field3444) {
                method434.field2664 = 1;
            }
            else {
                method434.field2664 = 2;
            }
            if (method434.field2660 > 0) {
                method434.field2704 = method434.field2704 * 32 / method434.field2660;
            }
            else if (method434.field2616 > 0) {
                method434.field2704 = method434.field2704 * 32 / method434.field2616;
            }
            return 1;
        }
        if (n == 1201) {
            method434.field2665 = 2;
            method434.field2593 = Class69.field999[--Class69.field1003];
            return 1;
        }
        if (n == 1202) {
            method434.field2665 = 3;
            method434.field2593 = Class138.field1876.field546.method4483();
            return 1;
        }
        return 2;
    }
}
