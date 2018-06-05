import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.io.IOException;
import java.io.DataInputStream;
import java.net.URL;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("er")
public class Class135 implements Runnable
{
    @ObfuscatedName("i")
    static ScheduledExecutorService field1855;
    @ObfuscatedName("cp")
    @ObfuscatedSignature(signature = "Lic;")
    static Class249 field1852;
    @ObfuscatedName("jf")
    @ObfuscatedGetter(intValue = 1445652317)
    static int field1856;
    @ObfuscatedName("z")
    final Thread field1854;
    @ObfuscatedName("w")
    volatile boolean field1853;
    @ObfuscatedName("s")
    Queue field1858;
    
    public Class135() {
        this.field1858 = new LinkedList();
        (this.field1854 = new Thread(this)).setPriority(1);
        this.field1854.start();
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ljava/net/URL;I)Leh;", garbageValue = "790678851")
    public Class136 method3109(final URL url) {
        final Class136 class136 = new Class136(url);
        synchronized (this) {
            this.field1858.add(class136);
            this.notify();
        }
        return class136;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1955026569")
    public void method3106() {
        this.field1853 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1854.join();
        }
        catch (InterruptedException ex) {}
    }
    
    @Override
    public void run() {
        while (!this.field1853) {
            try {
                final Class136 class136;
                synchronized (this) {
                    class136 = (Class136) this.field1858.poll();
                    if (class136 == null) {
                        try {
                            this.wait();
                        }
                        catch (InterruptedException ex) {}
                        continue;
                    }
                }
                DataInputStream dataInputStream = null;
                URLConnection openConnection = null;
                try {
                    openConnection = class136.field1867.openConnection();
                    openConnection.setConnectTimeout(5000);
                    openConnection.setReadTimeout(5000);
                    openConnection.setUseCaches(false);
                    openConnection.setRequestProperty("Connection", "close");
                    final int contentLength = openConnection.getContentLength();
                    if (contentLength >= 0) {
                        final byte[] field1861 = new byte[contentLength];
                        dataInputStream = new DataInputStream(openConnection.getInputStream());
                        dataInputStream.readFully(field1861);
                        class136.field1861 = field1861;
                    }
                    class136.field1859 = true;
                }
                catch (IOException ex2) {
                    class136.field1859 = true;
                }
                finally {
                    if (dataInputStream != null) {
                        dataInputStream.close();
                    }
                    if (openConnection != null && openConnection instanceof HttpURLConnection) {
                        ((HttpURLConnection)openConnection).disconnect();
                    }
                }
            }
            catch (Exception class136) {
                Class5.method65(null, (Throwable)class136);
            }
        }
    }
    
    @ObfuscatedName("ak")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "892303579")
    static void method3114(final int n) {
        if (n == -1) {
            return;
        }
        if (!Class261.method4931(n)) {
            return;
        }
        final Class230[] array = Class42.field366[n];
        for (int i = 0; i < array.length; ++i) {
            final Class230 field506 = array[i];
            if (field506.field2687 != null) {
                final Class56 class56 = new Class56();
                class56.field506 = field506;
                class56.field512 = field506.field2687;
                Class309.method5674(class56, 5000000);
            }
        }
    }
    
    @ObfuscatedName("iz")
    @ObfuscatedSignature(signature = "(III)Ljava/lang/String;", garbageValue = "-509659041")
    static final String method3113(final int n, final int n2) {
        final int n3 = n2 - n;
        if (n3 < -9) {
            return Class6.method71(16711680);
        }
        if (n3 < -6) {
            return Class6.method71(16723968);
        }
        if (n3 < -3) {
            return Class6.method71(16740352);
        }
        if (n3 < 0) {
            return Class6.method71(16756736);
        }
        if (n3 > 9) {
            return Class6.method71(65280);
        }
        if (n3 > 6) {
            return Class6.method71(4259584);
        }
        if (n3 > 3) {
            return Class6.method71(8453888);
        }
        if (n3 > 0) {
            return Class6.method71(12648192);
        }
        return Class6.method71(16776960);
    }
}
