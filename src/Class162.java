import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ff")
public final class Class162
{
    @ObfuscatedName("z")
    static byte[] field2004;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Ldy;")
    Class109 field2000;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Ldy;")
    Class109 field2001;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -561550751)
    int field2002;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -1445683659)
    int field1999;
    
    static {
        Class162.field2004 = new byte[520];
    }
    
    public Class162(final int field2002, final Class109 field2003, final Class109 field2004, final int field2005) {
        this.field2000 = null;
        this.field2001 = null;
        this.field1999 = 65000;
        this.field2002 = field2002;
        this.field2000 = field2003;
        this.field2001 = field2004;
        this.field1999 = field2005;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(II)[B", garbageValue = "1936326418")
    public byte[] method3372(final int n) {
        synchronized (this.field2000) {
            try {
                if (this.field2001.method2486() < n * 6 + 6) {
                    return null;
                }
                this.field2001.method2476(n * 6);
                this.field2001.method2479(Class162.field2004, 0, 6);
                final int n2 = ((Class162.field2004[0] & 0xFF) << 16) + (Class162.field2004[2] & 0xFF) + ((Class162.field2004[1] & 0xFF) << 8);
                int n3 = (Class162.field2004[5] & 0xFF) + ((Class162.field2004[3] & 0xFF) << 16) + ((Class162.field2004[4] & 0xFF) << 8);
                if (n2 < 0 || n2 > this.field1999) {
                    return null;
                }
                if (n3 <= 0 || n3 > this.field2000.method2486() / 520L) {
                    return null;
                }
                final byte[] array = new byte[n2];
                int i = 0;
                int n4 = 0;
                while (i < n2) {
                    if (n3 == 0) {
                        return null;
                    }
                    this.field2000.method2476(n3 * 520);
                    int n5 = n2 - i;
                    if (n5 > 512) {
                        n5 = 512;
                    }
                    this.field2000.method2479(Class162.field2004, 0, n5 + 8);
                    final int n6 = (Class162.field2004[1] & 0xFF) + ((Class162.field2004[0] & 0xFF) << 8);
                    final int n7 = (Class162.field2004[3] & 0xFF) + ((Class162.field2004[2] & 0xFF) << 8);
                    final int n8 = ((Class162.field2004[5] & 0xFF) << 8) + ((Class162.field2004[4] & 0xFF) << 16) + (Class162.field2004[6] & 0xFF);
                    final int n9 = Class162.field2004[7] & 0xFF;
                    if (n6 != n || n4 != n7 || n9 != this.field2002) {
                        return null;
                    }
                    if (n8 < 0 || n8 > this.field2000.method2486() / 520L) {
                        return null;
                    }
                    for (int j = 0; j < n5; ++j) {
                        array[i++] = Class162.field2004[j + 8];
                    }
                    n3 = n8;
                    ++n4;
                }
                return array;
            }
            catch (IOException ex) {
                return null;
            }
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(I[BII)Z", garbageValue = "-1888723881")
    public boolean method3371(final int n, final byte[] array, final int n2) {
        synchronized (this.field2000) {
            if (n2 < 0 || n2 > this.field1999) {
                throw new IllegalArgumentException();
            }
            boolean b = this.method3375(n, array, n2, true);
            if (!b) {
                b = this.method3375(n, array, n2, false);
            }
            return b;
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I[BIZB)Z", garbageValue = "20")
    boolean method3375(final int n, final byte[] array, final int n2, boolean b) {
        synchronized (this.field2000) {
            try {
                int n3;
                if (b) {
                    if (this.field2001.method2486() < n * 6 + 6) {
                        return false;
                    }
                    this.field2001.method2476(n * 6);
                    this.field2001.method2479(Class162.field2004, 0, 6);
                    n3 = (Class162.field2004[5] & 0xFF) + ((Class162.field2004[3] & 0xFF) << 16) + ((Class162.field2004[4] & 0xFF) << 8);
                    if (n3 <= 0 || n3 > this.field2000.method2486() / 520L) {
                        return false;
                    }
                }
                else {
                    n3 = (int)((this.field2000.method2486() + 519L) / 520L);
                    if (n3 == 0) {
                        n3 = 1;
                    }
                }
                Class162.field2004[0] = (byte)(n2 >> 16);
                Class162.field2004[1] = (byte)(n2 >> 8);
                Class162.field2004[2] = (byte)n2;
                Class162.field2004[3] = (byte)(n3 >> 16);
                Class162.field2004[4] = (byte)(n3 >> 8);
                Class162.field2004[5] = (byte)n3;
                this.field2001.method2476(n * 6);
                this.field2001.method2481(Class162.field2004, 0, 6);
                int n5;
                int n9;
                for (int i = 0, n4 = 0; i < n2; i += n9, n3 = n5, ++n4) {
                    n5 = 0;
                    if (b) {
                        this.field2000.method2476(n3 * 520);
                        try {
                            this.field2000.method2479(Class162.field2004, 0, 8);
                        }
                        catch (EOFException ex) {
                            break;
                        }
                        final int n6 = (Class162.field2004[1] & 0xFF) + ((Class162.field2004[0] & 0xFF) << 8);
                        final int n7 = (Class162.field2004[3] & 0xFF) + ((Class162.field2004[2] & 0xFF) << 8);
                        n5 = ((Class162.field2004[5] & 0xFF) << 8) + ((Class162.field2004[4] & 0xFF) << 16) + (Class162.field2004[6] & 0xFF);
                        final int n8 = Class162.field2004[7] & 0xFF;
                        if (n6 != n || n4 != n7 || n8 != this.field2002) {
                            return false;
                        }
                        if (n5 < 0 || n5 > this.field2000.method2486() / 520L) {
                            return false;
                        }
                    }
                    if (n5 == 0) {
                        b = false;
                        n5 = (int)((this.field2000.method2486() + 519L) / 520L);
                        if (n5 == 0) {
                            ++n5;
                        }
                        if (n5 == n3) {
                            ++n5;
                        }
                    }
                    if (n2 - i <= 512) {
                        n5 = 0;
                    }
                    Class162.field2004[0] = (byte)(n >> 8);
                    Class162.field2004[1] = (byte)n;
                    Class162.field2004[2] = (byte)(n4 >> 8);
                    Class162.field2004[3] = (byte)n4;
                    Class162.field2004[4] = (byte)(n5 >> 16);
                    Class162.field2004[5] = (byte)(n5 >> 8);
                    Class162.field2004[6] = (byte)n5;
                    Class162.field2004[7] = (byte)this.field2002;
                    this.field2000.method2476(n3 * 520);
                    this.field2000.method2481(Class162.field2004, 0, 8);
                    n9 = n2 - i;
                    if (n9 > 512) {
                        n9 = 512;
                    }
                    this.field2000.method2481(array, i, n9);
                }
                return true;
            }
            catch (IOException ex2) {
                return false;
            }
        }
    }
    
    @ObfuscatedName("gi")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "2")
    static void method3380() {
        if (Client.field699) {
            Class11.method98(Class138.field1876, false);
        }
    }
}
