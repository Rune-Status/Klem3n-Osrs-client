import java.io.SyncFailedException;
import net.runelite.mapping.ObfuscatedSignature;
import java.io.EOFException;
import java.io.IOException;
import java.io.File;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("dv")
public final class Class110
{
    @ObfuscatedName("z")
    RandomAccessFile field1435;
    @ObfuscatedName("w")
    @ObfuscatedGetter(longValue = 274542586179813579L)
    long field1433;
    @ObfuscatedName("s")
    @ObfuscatedGetter(longValue = -2383434283230612419L)
    long field1432;
    
    public Class110(final File file, final String s, long field1433) throws IOException {
        if (-1L == field1433) {
            field1433 = Long.MAX_VALUE;
        }
        if (file.length() >= field1433) {
            file.delete();
        }
        this.field1435 = new RandomAccessFile(file, s);
        this.field1433 = field1433;
        this.field1432 = 0L;
        final int read = this.field1435.read();
        if (read != -1 && !s.equals("r")) {
            this.field1435.seek(0L);
            this.field1435.write(read);
        }
        this.field1435.seek(0L);
    }
    
    @ObfuscatedName("z")
    final void method2514(final long field1432) throws IOException {
        this.field1435.seek(field1432);
        this.field1432 = field1432;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "([BIII)V", garbageValue = "2068014538")
    public final void method2506(final byte[] array, final int n, final int n2) throws IOException {
        if (n2 + this.field1432 > this.field1433) {
            this.field1435.seek(1L + this.field1433);
            this.field1435.write(1);
            throw new EOFException();
        }
        this.field1435.write(array, n, n2);
        this.field1432 += n2;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "746943081")
    public final void method2507() throws IOException {
        this.method2508(false);
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(ZB)V", garbageValue = "122")
    public final void method2508(final boolean b) throws IOException {
        if (this.field1435 != null) {
            if (b) {
                try {
                    this.field1435.getFD().sync();
                }
                catch (SyncFailedException ex) {}
            }
            this.field1435.close();
            this.field1435 = null;
        }
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(I)J", garbageValue = "-1046460358")
    public final long method2509() throws IOException {
        return this.field1435.length();
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "([BIII)I", garbageValue = "-210430337")
    public final int method2510(final byte[] array, final int n, final int n2) throws IOException {
        final int read = this.field1435.read(array, n, n2);
        if (read > 0) {
            this.field1432 += read;
        }
        return read;
    }
    
    @Override
    protected void finalize() throws Throwable {
        if (this.field1435 != null) {
            System.out.println("");
            this.method2507();
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(IB)Ljj;", garbageValue = "0")
    public static Class268 method2527(final int field3376) {
        final Class268 class268 = (Class268)Class268.field3371.method3989(field3376);
        if (class268 != null) {
            return class268;
        }
        final byte[] method4625 = Class268.field3377.method4625(6, field3376);
        final Class268 class269 = new Class268();
        class269.field3376 = field3376;
        if (method4625 != null) {
            class269.method5026(new Class182(method4625));
        }
        class269.method5025();
        if (class269.field3398) {
            class269.field3386 = 0;
            class269.field3404 = false;
        }
        Class268.field3371.method3983(class269, field3376);
        return class269;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)Ljava/lang/Class;", garbageValue = "471719686")
    static Class method2528(final String s) throws ClassNotFoundException {
        if (s.equals("B")) {
            return Byte.TYPE;
        }
        if (s.equals("I")) {
            return Integer.TYPE;
        }
        if (s.equals("S")) {
            return Short.TYPE;
        }
        if (s.equals("J")) {
            return Long.TYPE;
        }
        if (s.equals("Z")) {
            return Boolean.TYPE;
        }
        if (s.equals("F")) {
            return Float.TYPE;
        }
        if (s.equals("D")) {
            return Double.TYPE;
        }
        if (s.equals("C")) {
            return Character.TYPE;
        }
        if (s.equals("void")) {
            return Void.TYPE;
        }
        return Class.forName(s);
    }
    
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "(III)I", garbageValue = "1058679148")
    static final int method2511(final int n, final int n2) {
        final int n3 = n + n2 * 57;
        final int n4 = n3 << 13 ^ n3;
        return ((n4 * n4 * 15731 + 789221) * n4 + 1376312589 & Integer.MAX_VALUE) >> 19 & 0xFF;
    }
}
