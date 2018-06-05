import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import java.net.Socket;
import java.io.OutputStream;
import java.io.InputStream;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("fr")
public final class Class161 extends Class157 implements Runnable
{
    @ObfuscatedName("fm")
    @ObfuscatedSignature(signature = "[Lll;")
    static Class318[] field1997;
    @ObfuscatedName("z")
    InputStream field1988;
    @ObfuscatedName("w")
    OutputStream field1986;
    @ObfuscatedName("s")
    Socket field1985;
    @ObfuscatedName("l")
    boolean field1990;
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "Lev;")
    Signlink field1989;
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "Lee;")
    Class153 field1987;
    @ObfuscatedName("k")
    byte[] field1994;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -540627)
    int field1992;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = -1830674929)
    int field1993;
    @ObfuscatedName("e")
    boolean field1998;
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = -841887779)
    final int field1995;
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = -1684221721)
    final int field1996;
    
    public Class161(final Socket field1985, final Signlink field1986, final int field1987) throws IOException {
        this.field1990 = false;
        this.field1992 = 0;
        this.field1993 = 0;
        this.field1998 = false;
        this.field1989 = field1986;
        this.field1985 = field1985;
        this.field1995 = field1987;
        this.field1996 = field1987 - 100;
        this.field1985.setSoTimeout(30000);
        this.field1985.setTcpNoDelay(true);
        this.field1985.setReceiveBufferSize(65536);
        this.field1985.setSendBufferSize(65536);
        this.field1988 = this.field1985.getInputStream();
        this.field1986 = this.field1985.getOutputStream();
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IB)Z", garbageValue = "1")
    @Override
    public boolean vmethod3350(final int n) throws IOException {
        return !this.field1990 && this.field1988.available() >= n;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "1213474120")
    @Override
    public int vmethod3349() throws IOException {
        if (this.field1990) {
            return 0;
        }
        return this.field1988.available();
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-2096783031")
    @Override
    public int vmethod3353() throws IOException {
        if (this.field1990) {
            return 0;
        }
        return this.field1988.read();
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "([BIII)I", garbageValue = "-2097961075")
    @Override
    public int vmethod3351(final byte[] array, int n, int i) throws IOException {
        if (this.field1990) {
            return 0;
        }
        final int n2 = i;
        while (i > 0) {
            final int read = this.field1988.read(array, n, i);
            if (read <= 0) {
                throw new EOFException();
            }
            n += read;
            i -= read;
        }
        return n2;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "([BIIB)V", garbageValue = "-100")
    @Override
    public void vmethod3347(final byte[] array, final int n, final int n2) throws IOException {
        this.method3352(array, n, n2);
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1775992211")
    @Override
    public void vmethod3346() {
        if (this.field1990) {
            return;
        }
        synchronized (this) {
            this.field1990 = true;
            this.notifyAll();
        }
        if (this.field1987 != null) {
            while (this.field1987.status == 0) {
                Class63.method1539(1L);
            }
            if (this.field1987.status == 1) {
                try {
                    ((Thread)this.field1987.value).join();
                }
                catch (InterruptedException ex) {}
            }
        }
        this.field1987 = null;
    }
    
    @ObfuscatedName("ak")
    @ObfuscatedSignature(signature = "([BIII)V", garbageValue = "-436228985")
    void method3352(final byte[] array, final int n, final int n2) throws IOException {
        if (this.field1990) {
            return;
        }
        if (this.field1998) {
            this.field1998 = false;
            throw new IOException();
        }
        if (this.field1994 == null) {
            this.field1994 = new byte[this.field1995];
        }
        synchronized (this) {
            for (int i = 0; i < n2; ++i) {
                this.field1994[this.field1993] = array[i + n];
                this.field1993 = (this.field1993 + 1) % this.field1995;
                if ((this.field1996 + this.field1992) % this.field1995 == this.field1993) {
                    throw new IOException();
                }
            }
            if (this.field1987 == null) {
                this.field1987 = this.field1989.method3249(this, 3);
            }
            this.notifyAll();
        }
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                final int field1992;
                int n;
                synchronized (this) {
                    if (this.field1993 == this.field1992) {
                        if (this.field1990) {
                            break;
                        }
                        try {
                            this.wait();
                        }
                        catch (InterruptedException ex2) {}
                    }
                    field1992 = this.field1992;
                    if (this.field1993 >= this.field1992) {
                        n = this.field1993 - this.field1992;
                    }
                    else {
                        n = this.field1995 - this.field1992;
                    }
                }
                if (n > 0) {
                    try {
                        this.field1986.write(this.field1994, field1992, n);
                    }
                    catch (IOException ex3) {
                        this.field1998 = true;
                    }
                    this.field1992 = (n + this.field1992) % this.field1995;
                    try {
                        if (this.field1993 != this.field1992) {
                            continue;
                        }
                        this.field1986.flush();
                    }
                    catch (IOException ex4) {
                        this.field1998 = true;
                    }
                }
            }
            try {
                if (this.field1988 != null) {
                    this.field1988.close();
                }
                if (this.field1986 != null) {
                    this.field1986.close();
                }
                if (this.field1985 != null) {
                    this.field1985.close();
                }
            }
            catch (IOException ex5) {}
            this.field1994 = null;
        }
        catch (Exception ex) {
            Class5.method65(null, ex);
        }
    }
    
    @Override
    protected void finalize() {
        this.vmethod3346();
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(CI)Z", garbageValue = "1286925984")
    public static boolean method3362(final char c) {
        return (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}
