import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("fc")
public class Class163 implements Runnable
{
    @ObfuscatedName("au")
    @ObfuscatedSignature(signature = "Llc;")
    public static Class315 field2014;
    @ObfuscatedName("bl")
    static String field2013;
    @ObfuscatedName("ca")
    @ObfuscatedGetter(intValue = 1930449729)
    public static int field2016;
    @ObfuscatedName("z")
    Thread field2008;
    @ObfuscatedName("w")
    OutputStream field2006;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -837409575)
    int field2015;
    @ObfuscatedName("l")
    byte[] field2012;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 769097443)
    int field2010;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -2146315675)
    int field2005;
    @ObfuscatedName("k")
    IOException field2011;
    @ObfuscatedName("i")
    boolean field2009;
    
    Class163(final OutputStream field2006, final int n) {
        this.field2010 = 0;
        this.field2005 = 0;
        this.field2006 = field2006;
        this.field2015 = n + 1;
        this.field2012 = new byte[this.field2015];
        (this.field2008 = new Thread(this)).setDaemon(true);
        this.field2008.start();
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "1097599728")
    boolean method3390() {
        if (this.field2009) {
            try {
                this.field2006.close();
                if (this.field2011 == null) {
                    this.field2011 = new IOException("");
                }
            }
            catch (IOException ex) {
                if (this.field2011 == null) {
                    this.field2011 = new IOException(ex);
                }
            }
            return true;
        }
        return false;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "([BIII)V", garbageValue = "1100841407")
    void method3383(final byte[] var1, final int var2, final int var3) throws IOException {
        if(var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
            synchronized(this) {
               if(this.field2011 != null) {
                  throw new IOException(this.field2011.toString());
               } else {
                  int var5;
                  if(this.field2010 <= this.field2005) {
                     var5 = this.field2015 - this.field2005 + this.field2010 - 1;
                  } else {
                     var5 = this.field2010 - this.field2005 - 1;
                  }

                  if(var5 < var3) {
                     throw new IOException("");
                  } else {
                     if(var3 + this.field2005 <= this.field2015) {
                        System.arraycopy(var1, var2, this.field2012, this.field2005, var3);
                     } else {
                        int var6 = this.field2015 - this.field2005;
                        System.arraycopy(var1, var2, this.field2012, this.field2005, var6);
                        System.arraycopy(var1, var6 + var2, this.field2012, 0, var3 - var6);
                     }

                     this.field2005 = (var3 + this.field2005) % this.field2015;
                     this.notifyAll();
                  }
               }
            }
         } else {
            throw new IOException();
         }
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1681840837")
    void method3384() {
        synchronized (this) {
            this.field2009 = true;
            this.notifyAll();
        }
        try {
            this.field2008.join();
        }
        catch (InterruptedException ex) {}
    }

    public void run() {
        do {
           int var1;
           synchronized(this) {
              while(true) {
                 if(this.field2011 != null) {
                    return;
                 }

                 if(this.field2010 <= this.field2005) {
                    var1 = this.field2005 - this.field2010;
                 } else {
                    var1 = this.field2015 - this.field2010 + this.field2005;
                 }

                 if(var1 > 0) {
                    break;
                 }

                 try {
                    this.field2006.flush();
                 } catch (IOException var11) {
                    this.field2011 = var11;
                    return;
                 }

                 if(this.method3390()) {
                    return;
                 }

                 try {
                    this.wait();
                 } catch (InterruptedException var12) {
                    ;
                 }
              }
           }

           try {
              if(var1 + this.field2010 <= this.field2015) {
                 this.field2006.write(this.field2012, this.field2010, var1);
              } else {
                 int var7 = this.field2015 - this.field2010;
                 this.field2006.write(this.field2012, this.field2010, var7);
                 this.field2006.write(this.field2012, 0, var1 - var7);
              }
           } catch (IOException var10) {
              IOException var2 = var10;
              synchronized(this) {
                 this.field2011 = var2;
                 return;
              }
           }

           synchronized(this) {
              this.field2010 = (var1 + this.field2010) % this.field2015;
           }
        } while(!this.method3390());

     }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(II)I", garbageValue = "-397804509")
    public static int method3389(final int n) {
        final Class263 class263 = (Class263)Class263.field3321.method3989(n);
        Class263 class264;
        if (class263 != null) {
            class264 = class263;
        }
        else {
            final byte[] method4625 = Class263.field3322.method4625(14, n);
            final Class263 class265 = new Class263();
            if (method4625 != null) {
                class265.method4941(new Class182(method4625));
            }
            Class263.field3321.method3983(class265, n);
            class264 = class265;
        }
        final Class263 class266 = class264;
        final int field3320 = class266.field3320;
        final int field3321 = class266.field3323;
        return Class225.field2558[field3320] >> field3321 & Class225.field2557[class266.field3326 - field3321];
    }
    
    @ObfuscatedName("ic")
    @ObfuscatedSignature(signature = "([Lhi;Lhi;ZI)V", garbageValue = "96383462")
    static void method3388(final Class230[] array, final Class230 class230, final boolean b) {
        final int n = (class230.field2628 != 0) ? class230.field2628 : class230.field2675;
        final int n2 = (class230.field2629 != 0) ? class230.field2629 : class230.field2621;
        Class304.method5635(array, class230.field2691, n, n2, b);
        if (class230.field2736 != null) {
            Class304.method5635(class230.field2736, class230.field2691, n, n2, b);
        }
        final Class55 class231 = (Class55)Client.field741.method4020(class230.field2691);
        if (class231 != null) {
            Class84.method1946(class231.field501, n, n2, b);
        }
        if (class230.field2609 == 1337) {}
    }
}
