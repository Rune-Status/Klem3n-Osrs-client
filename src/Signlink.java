import java.io.DataInputStream;
import java.net.URL;

import java.net.Socket;
import java.net.InetAddress;
import java.awt.Font;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ev")
public class Signlink implements Runnable
{
    @ObfuscatedName("z")
    public static String javaVendor;
    @ObfuscatedName("w")
    public static String javaVersion;
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "Lir;")
    static Class247 field1956;
    @ObfuscatedName("aw")
    static Font field1961;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lee;")
    Class153 currentTask;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lee;")
    Class153 cachedTask;
    @ObfuscatedName("u")
    Thread field1957;
    @ObfuscatedName("q")
    boolean field1958;
    
    public Signlink() {
        this.currentTask = null;
        this.cachedTask = null;
        this.field1958 = false;
        Signlink.javaVendor = "Unknown";
        Signlink.javaVersion = "1.6";
        try {
            Signlink.javaVendor = System.getProperty("java.vendor");
            Signlink.javaVersion = System.getProperty("java.version");
        }
        catch (Exception ex) {}
        this.field1958 = false;
        (this.field1957 = new Thread(this)).setPriority(10);
        this.field1957.setDaemon(true);
        this.field1957.start();
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "417031791")
    public final void method3256() {
        synchronized (this) {
            this.field1958 = true;
            this.notifyAll();
        }
        try {
            this.field1957.join();
        }
        catch (InterruptedException ex) {}
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IIILjava/lang/Object;I)Lee;", garbageValue = "755580471")
    final Class153 newTask(final int type, final int intArgument, final int n, final Object field1951) {
        final Class153 class153 = new Class153();
        class153.type = type;
        class153.intArgument = intArgument;
        class153.objectArgument = field1951;
        synchronized (this) {
            if (this.cachedTask != null) {
                this.cachedTask.task = class153;
                this.cachedTask = class153;
            }
            else {
                final Class153 class154 = class153;
                this.currentTask = class154;
                this.cachedTask = class154;
            }
            this.notify();
        }
        return class153;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;II)Lee;", garbageValue = "-334479783")
    public final Class153 method3259(final String s, final int n) {
        return this.newTask(1, n, 0, s);
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Ljava/lang/Runnable;II)Lee;", garbageValue = "1672602296")
    public final Class153 method3249(final Runnable runnable, final int n) {
        return this.newTask(2, n, 0, runnable);
    }
    
    /*public final void run() {
        while (true) {
            Label_0075: {
                Class153 field1955;
                synchronized (this) {
                    while (!this.field1958) {
                        if (this.currentTask != null) {
                            field1955 = this.currentTask;
                            this.currentTask = this.currentTask.task;
                            if (this.currentTask == null) {
                                this.cachedTask = null;
                            }
                            break Label_0075;
                        }
                        try {
                            this.wait();
                        }
                        catch (InterruptedException ex) {}
                    }
                    return;
                }
            }
        }
    }*/
    
    public final void run() {
        while(true) {
        Class153 var1;
           synchronized(this) {
              while(true) {
                 if(this.field1958) {
                    return;
                 }

                 if(this.currentTask != null) {
                    var1 = this.currentTask;
                    this.currentTask = this.currentTask.task;
                    if(this.currentTask == null) {
                       this.cachedTask = null;
                    }
                    break;
                 }

                 try {
                    this.wait();
                 } catch (InterruptedException var8) {
                    ;
                 }
              }
           }

           try {
              int var5 = var1.type;
              if(var5 == 1) {
                 var1.value = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument);
              } else if(var5 == 2) {
                 Thread var3 = new Thread((Runnable)var1.objectArgument);
                 var3.setDaemon(true);
                 var3.start();
                 var3.setPriority(var1.intArgument);
                 var1.value = var3;
              } else if(var5 == 4) {
                 var1.value = new DataInputStream(((URL)var1.objectArgument).openStream());
              }

              var1.status = 1;
           } catch (ThreadDeath var6) {
              throw var6;
           } catch (Throwable var7) {
              var1.status = 2;
           }
        }
     }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IB)I", garbageValue = "-80")
    public static int method3252(final int n) {
        return n >> 11 & 0x3F;
    }
}
