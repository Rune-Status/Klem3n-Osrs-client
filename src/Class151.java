import java.io.RandomAccessFile;
import java.io.File;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ej")
public class Class151 implements Runnable
{
    @ObfuscatedName("eu")
    @ObfuscatedSignature(signature = "Lkj;")
    static Class298 field1936;
    @ObfuscatedName("je")
    @ObfuscatedGetter(intValue = -1606452513)
    static int field1933;
    @ObfuscatedName("z")
    Thread field1930;
    @ObfuscatedName("w")
    InputStream field1937;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 254778797)
    int field1934;
    @ObfuscatedName("l")
    byte[] field1932;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 60058349)
    int field1931;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 1081366057)
    int field1929;
    @ObfuscatedName("k")
    IOException field1935;
    
    Class151(final InputStream field1937, final int n) {
        this.field1931 = 0;
        this.field1929 = 0;
        this.field1937 = field1937;
        this.field1934 = n + 1;
        this.field1932 = new byte[this.field1934];
        (this.field1930 = new Thread(this)).setDaemon(true);
        this.field1930.start();
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(II)Z", garbageValue = "-1623980181")
    boolean method3219(final int n) throws IOException {
        if (n == 0) {
            return true;
        }
        if (n <= 0 || n >= this.field1934) {
            throw new IOException();
        }
        synchronized (this) {
            int n2;
            if (this.field1931 <= this.field1929) {
                n2 = this.field1929 - this.field1931;
            }
            else {
                n2 = this.field1934 - this.field1931 + this.field1929;
            }
            if (n2 >= n) {
                return true;
            }
            if (this.field1935 != null) {
                throw new IOException(this.field1935.toString());
            }
            this.notifyAll();
            return false;
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-200801409")
    int method3217() throws IOException {
        synchronized (this) {
            int n;
            if (this.field1931 <= this.field1929) {
                n = this.field1929 - this.field1931;
            }
            else {
                n = this.field1934 - this.field1931 + this.field1929;
            }
            if (n <= 0 && this.field1935 != null) {
                throw new IOException(this.field1935.toString());
            }
            this.notifyAll();
            return n;
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-1567970843")
    int method3218() throws IOException {
        synchronized (this) {
            if (this.field1931 != this.field1929) {
                final int n = this.field1932[this.field1931] & 0xFF;
                this.field1931 = (this.field1931 + 1) % this.field1934;
                this.notifyAll();
                return n;
            }
            if (this.field1935 != null) {
                throw new IOException(this.field1935.toString());
            }
            return -1;
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "([BIII)I", garbageValue = "2131824940")
    int method3224(final byte[] array, final int n, int n2) throws IOException {
        if (n2 < 0 || n < 0 || n2 + n > array.length) {
            throw new IOException();
        }
        synchronized (this) {
            int n3;
            if (this.field1931 <= this.field1929) {
                n3 = this.field1929 - this.field1931;
            }
            else {
                n3 = this.field1934 - this.field1931 + this.field1929;
            }
            if (n2 > n3) {
                n2 = n3;
            }
            if (n2 == 0 && this.field1935 != null) {
                throw new IOException(this.field1935.toString());
            }
            if (n2 + this.field1931 <= this.field1934) {
                System.arraycopy(this.field1932, this.field1931, array, n, n2);
            }
            else {
                final int n4 = this.field1934 - this.field1931;
                System.arraycopy(this.field1932, this.field1931, array, n, n4);
                System.arraycopy(this.field1932, 0, array, n4 + n, n2 - n4);
            }
            this.field1931 = (n2 + this.field1931) % this.field1934;
            this.notifyAll();
            return n2;
        }
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "17")
    void method3215() {
        synchronized (this) {
            if (this.field1935 == null) {
                this.field1935 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field1930.join();
        }
        catch (InterruptedException ex) {}
    }

    public void run() {
        while(true) {
           int var1 = 0;
           synchronized (this) {
               while (this.field1935 == null) {
                   if (this.field1931 == 0) {
                       var1 = this.field1934 - this.field1929 - 1;
                   }
                   else if (this.field1931 <= this.field1929) {
                	   var1 = this.field1934 - this.field1929;
                   }
                   else {
                	   var1 = this.field1931 - this.field1929 - 1;
                   }
                   if (var1 > 0) {
                       break;
                   }
                   try {
                       this.wait();
                    } catch (InterruptedException var10) {
                       ;
                    }
               }
           }

           int var7 = 0;
           try {
              var7 = this.field1937.read(this.field1932, this.field1929, var1);
              if(var7 == -1) {
                 throw new EOFException();
              }
           } catch (IOException var11) {
              IOException var3 = var11;
              synchronized(this) {
                 this.field1935 = var3;
                 return;
              }
           }

           synchronized(this) {
        	   this.field1929 = (var7 + this.field1929) % this.field1934;
           }
        }
     }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)Ljava/io/File;", garbageValue = "512337969")
    static File method3238(final String s) {
        if (!Class158.field1979) {
            throw new RuntimeException("");
        }
        final File file = (File) Class158.field1975.get(s);
        if (file != null) {
            return file;
        }
        final File file2 = new File(Class158.field1974, s);
        RandomAccessFile randomAccessFile = null;
        try {
            if (!new File(file2.getParent()).exists()) {
                throw new RuntimeException("");
            }
            randomAccessFile = new RandomAccessFile(file2, "rw");
            final int read = randomAccessFile.read();
            randomAccessFile.seek(0L);
            randomAccessFile.write(read);
            randomAccessFile.seek(0L);
            randomAccessFile.close();
            Class158.field1975.put(s, file2);
            return file2;
        }
        catch (Exception ex) {
            try {
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            }
            catch (Exception ex2) {}
            throw new RuntimeException();
        }
    }
    
    @ObfuscatedName("ah")
    @ObfuscatedSignature(signature = "(ILce;ZI)I", garbageValue = "-1833118422")
    static int method3240(final int n, final Class84 class84, final boolean b) {
        if (n == 6200) {
            Class69.field1003 -= 2;
            Client.field802 = (short)Class69.field999[Class69.field1003];
            if (Client.field802 <= 0) {
                Client.field802 = 256;
            }
            Client.field829 = (short)Class69.field999[Class69.field1003 + 1];
            if (Client.field829 <= 0) {
                Client.field829 = 205;
            }
            return 1;
        }
        if (n == 6201) {
            Class69.field1003 -= 2;
            Client.field848 = (short)Class69.field999[Class69.field1003];
            if (Client.field848 <= 0) {
                Client.field848 = 256;
            }
            Client.field831 = (short)Class69.field999[Class69.field1003 + 1];
            if (Client.field831 <= 0) {
                Client.field831 = 320;
            }
            return 1;
        }
        if (n == 6202) {
            Class69.field1003 -= 4;
            Client.field832 = (short)Class69.field999[Class69.field1003];
            if (Client.field832 <= 0) {
                Client.field832 = 1;
            }
            Client.field833 = (short)Class69.field999[Class69.field1003 + 1];
            if (Client.field833 <= 0) {
                Client.field833 = 32767;
            }
            else if (Client.field833 < Client.field832) {
                Client.field833 = Client.field832;
            }
            Client.field834 = (short)Class69.field999[Class69.field1003 + 2];
            if (Client.field834 <= 0) {
                Client.field834 = 1;
            }
            Client.field835 = (short)Class69.field999[Class69.field1003 + 3];
            if (Client.field835 <= 0) {
                Client.field835 = 32767;
            }
            else if (Client.field835 < Client.field834) {
                Client.field835 = Client.field834;
            }
            return 1;
        }
        if (n == 6203) {
            if (Client.field784 != null) {
                RunException.method714(0, 0, Client.field784.field2675, Client.field784.field2621, false);
                Class69.field999[++Class69.field1003 - 1] = Client.field838;
                Class69.field999[++Class69.field1003 - 1] = Client.field662;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = -1;
                Class69.field999[++Class69.field1003 - 1] = -1;
            }
            return 1;
        }
        if (n == 6204) {
            Class69.field999[++Class69.field1003 - 1] = Client.field848;
            Class69.field999[++Class69.field1003 - 1] = Client.field831;
            return 1;
        }
        if (n == 6205) {
            Class69.field999[++Class69.field1003 - 1] = Client.field802;
            Class69.field999[++Class69.field1003 - 1] = Client.field829;
            return 1;
        }
        return 2;
    }
    
    @ObfuscatedName("jx")
    @ObfuscatedSignature(signature = "(Lhi;I)Ljava/lang/String;", garbageValue = "-2016324060")
    static String method3239(final Class230 class230) {
        if (Signlink.method3252(Class24.method425(class230)) == 0) {
            return null;
        }
        if (class230.field2661 == null || class230.field2661.trim().length() == 0) {
            return null;
        }
        return class230.field2661;
    }
}
