import java.io.EOFException;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("cq")
public class Class82
{
    @ObfuscatedName("h")
    @ObfuscatedGetter(intValue = -1811094485)
    public static int field1179;
    @ObfuscatedName("s")
    boolean[] field1175;
    @ObfuscatedName("l")
    boolean[] field1173;
    @ObfuscatedName("u")
    int[] field1174;
    @ObfuscatedName("q")
    String[] field1170;
    @ObfuscatedName("k")
    boolean field1176;
    @ObfuscatedName("i")
    @ObfuscatedGetter(longValue = 7130902202106963315L)
    long field1177;
    
    Class82() {
        this.field1176 = false;
        this.field1174 = new int[Class97.field1329.method4636(19)];
        this.field1170 = new String[Class97.field1329.method4636(15)];
        this.field1175 = new boolean[this.field1174.length];
        for (int i = 0; i < this.field1174.length; ++i) {
            this.field1175[i] = Class21.method275(i).field3256;
        }
        this.field1173 = new boolean[this.field1170.length];
        for (int j = 0; j < this.field1170.length; ++j) {
            this.field1173[j] = Class175.method3485(j).field3261;
        }
        for (int k = 0; k < this.field1174.length; ++k) {
            this.field1174[k] = -1;
        }
        this.method1887();
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(III)V", garbageValue = "-1213879855")
    void method1903(final int n, final int n2) {
        this.field1174[n] = n2;
        if (this.field1175[n]) {
            this.field1176 = true;
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IB)I", garbageValue = "82")
    int method1897(final int n) {
        return this.field1174[n];
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(ILjava/lang/String;I)V", garbageValue = "541625191")
    void method1889(final int n, final String s) {
        this.field1170[n] = s;
        if (this.field1173[n]) {
            this.field1176 = true;
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(II)Ljava/lang/String;", garbageValue = "-2060094389")
    String method1890(final int n) {
        return this.field1170[n];
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "60637204")
    void method1891() {
        for (int i = 0; i < this.field1174.length; ++i) {
            if (!this.field1175[i]) {
                this.field1174[i] = -1;
            }
        }
        for (int j = 0; j < this.field1170.length; ++j) {
            if (!this.field1173[j]) {
                this.field1170[j] = null;
            }
        }
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(ZI)Ldv;", garbageValue = "-1191303198")
    Class110 method1892(final boolean b) {
        return Class22.method283("2", Class112.field1455.field3144, b);
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "5")
    void method1893() {
        final Class110 method1892 = this.method1892(true);
        try {
            int n = 3;
            int n2 = 0;
            for (int i = 0; i < this.field1174.length; ++i) {
                if (this.field1175[i] && this.field1174[i] != -1) {
                    n += 6;
                    ++n2;
                }
            }
            n += 2;
            int n3 = 0;
            for (int j = 0; j < this.field1170.length; ++j) {
                if (this.field1173[j] && this.field1170[j] != null) {
                    n += 2 + Class316.method5820(this.field1170[j]);
                    ++n3;
                }
            }
            final Class182 class182 = new Class182(n);
            class182.method3532(1);
            class182.method3755(n2);
            for (int k = 0; k < this.field1174.length; ++k) {
                if (this.field1175[k] && this.field1174[k] != -1) {
                    class182.method3755(k);
                    class182.method3707(this.field1174[k]);
                }
            }
            class182.method3755(n3);
            for (int l = 0; l < this.field1170.length; ++l) {
                if (this.field1173[l] && this.field1170[l] != null) {
                    class182.method3755(l);
                    class182.method3699(this.field1170[l]);
                }
            }
            method1892.method2506(class182.payload, 0, class182.field2339);
        }
        catch (Exception ex) {}
        finally {
            try {
                method1892.method2507();
            }
            catch (Exception ex2) {}
        }
        this.field1176 = false;
        this.field1177 = Class182.method3547();
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-505500629")
    void method1887() {
        final Class110 method1892 = this.method1892(false);
        try {
            final byte[] array = new byte[(int)method1892.method2509()];
            int method1893;
            for (int i = 0; i < array.length; i += method1893) {
                method1893 = method1892.method2510(array, i, array.length - i);
                if (method1893 == -1) {
                    throw new EOFException();
                }
            }
            final Class182 class182 = new Class182(array);
            if (class182.payload.length - class182.field2339 < 1) {
                return;
            }
            final int method1894 = class182.method3544();
            if (method1894 >= 0) {
                if (method1894 <= 1) {
                    for (int method1895 = class182.method3550(), j = 0; j < method1895; ++j) {
                        final int method1896 = class182.method3550();
                        final int method1897 = class182.method3671();
                        if (this.field1175[method1896]) {
                            this.field1174[method1896] = method1897;
                        }
                    }
                    for (int method1898 = class182.method3550(), k = 0; k < method1898; ++k) {
                        final int method1899 = class182.method3550();
                        final String method1900 = class182.method3738();
                        if (this.field1173[method1899]) {
                            this.field1170[method1899] = method1900;
                        }
                    }
                }
            }
            return;
        }
        catch (Exception ex) {}
        finally {
            try {
                method1892.method2507();
            }
            catch (Exception ex2) {}
        }
        this.field1176 = false;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-196804596")
    void method1902() {
        if (this.field1176 && this.field1177 < Class182.method3547() - 60000L) {
            this.method1893();
        }
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(S)Z", garbageValue = "9220")
    boolean method1896() {
        return this.field1176;
    }
    
    @ObfuscatedName("fl")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "670209353")
    static final void method1894() {
        if (Class13.field82 != Client.field651) {
            Client.field651 = Class13.field82;
            final int field82 = Class13.field82;
            final int[] field83 = Class72.field1038.field3791;
            for (int length = field83.length, i = 0; i < length; ++i) {
                field83[i] = 0;
            }
            for (int j = 1; j < 103; ++j) {
                int n = (103 - j) * 2048 + 24628;
                for (int k = 1; k < 103; ++k) {
                    if ((Class50.field443[field82][k][j] & 0x18) == 0x0) {
                        Class28.field248.method2906(field83, n, 512, field82, k, j);
                    }
                    if (field82 < 3 && (Class50.field443[field82 + 1][k][j] & 0x8) != 0x0) {
                        Class28.field248.method2906(field83, n, 512, field82 + 1, k, j);
                    }
                    n += 4;
                }
            }
            final int n2 = (238 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
            final int n3 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
            Class72.field1038.method5850();
            for (int l = 1; l < 103; ++l) {
                for (int n4 = 1; n4 < 103; ++n4) {
                    if ((Class50.field443[field82][n4][l] & 0x18) == 0x0) {
                        Class224.method4422(field82, n4, l, n2, n3);
                    }
                    if (field82 < 3 && (Class50.field443[field82 + 1][n4][l] & 0x8) != 0x0) {
                        Class224.method4422(field82 + 1, n4, l, n2, n3);
                    }
                }
            }
            Client.field724 = 0;
            for (int n5 = 0; n5 < 104; ++n5) {
                for (int n6 = 0; n6 < 104; ++n6) {
                    final long method2901 = Class28.field248.method2901(Class13.field82, n5, n6);
                    if (0L != method2901) {
                        final int field84 = Class110.method2527(Class39.method673(method2901)).field3397;
                        if (field84 >= 0) {
                            Client.field816[Client.field724] = Class255.field3246[field84].method4815(false);
                            Client.field805[Client.field724] = n5;
                            Client.field806[Client.field724] = n6;
                            ++Client.field724;
                        }
                    }
                }
            }
            Class163.field2014.method5808();
        }
    }
    
    @ObfuscatedName("ht")
    @ObfuscatedSignature(signature = "(IIB)V", garbageValue = "-3")
    static void method1921(final int n, final int n2) {
        final Class172 method433 = Class26.method433(Class169.field2158, Client.field626.field1218);
        method433.field2257.method3687(n);
        method433.field2257.method3583(n2);
        Client.field626.method1980(method433);
    }
}
