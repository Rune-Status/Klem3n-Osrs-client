package com.client;
import java.io.IOException;
import java.io.OutputStream;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class Class163 implements Runnable {
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "Llc;"
   )
   public static Class315 field2014;
   @ObfuscatedName("bl")
   static String field2013;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      intValue = 1930449729
   )
   public static int field2016;
   @ObfuscatedName("z")
   Thread field2008;
   @ObfuscatedName("w")
   OutputStream field2006;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -837409575
   )
   int field2015;
   @ObfuscatedName("l")
   byte[] field2012;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 769097443
   )
   int field2010 = 0;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2146315675
   )
   int field2005 = 0;
   @ObfuscatedName("k")
   IOException field2011;
   @ObfuscatedName("i")
   boolean field2009;

   Class163(OutputStream var1, int var2) {
      this.field2006 = var1;
      this.field2015 = var2 + 1;
      this.field2012 = new byte[this.field2015];
      this.field2008 = new Thread(this);
      this.field2008.setDaemon(true);
      this.field2008.start();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1097599728"
   )
   boolean method3390() {
      if (this.field2009) {
         try {
            this.field2006.close();
            if (this.field2011 == null) {
               this.field2011 = new IOException("");
            }
         } catch (IOException var2) {
            if (this.field2011 == null) {
               this.field2011 = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "1100841407"
   )
   void method3383(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            if (this.field2011 != null) {
               throw new IOException(this.field2011.toString());
            } else {
               int var5;
               if (this.field2010 <= this.field2005) {
                  var5 = this.field2015 - this.field2005 + this.field2010 - 1;
               } else {
                  var5 = this.field2010 - this.field2005 - 1;
               }

               if (var5 < var3) {
                  throw new IOException("");
               } else {
                  if (var3 + this.field2005 <= this.field2015) {
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
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1681840837"
   )
   void method3384() {
      synchronized(this) {
         this.field2009 = true;
         this.notifyAll();
      }

      try {
         this.field2008.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   public void run() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if (this.field2011 != null) {
                  return;
               }

               if (this.field2010 <= this.field2005) {
                  var1 = this.field2005 - this.field2010;
               } else {
                  var1 = this.field2015 - this.field2010 + this.field2005;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.field2006.flush();
               } catch (IOException var11) {
                  this.field2011 = var11;
                  return;
               }

               if (this.method3390()) {
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
            if (var1 + this.field2010 <= this.field2015) {
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
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-397804509"
   )
   public static int method3389(int var0) {
      Class263 var2 = (Class263)Class263.field3321.method3989((long)var0);
      Class263 var1;
      if (var2 != null) {
         var1 = var2;
      } else {
         byte[] var7 = Class263.field3322.method4625(14, var0);
         var2 = new Class263();
         if (var7 != null) {
            var2.method4941(new Class182(var7));
         }

         Class263.field3321.method3983(var2, (long)var0);
         var1 = var2;
      }

      int var3 = var1.field3320;
      int var4 = var1.field3323;
      int var5 = var1.field3326;
      int var6 = Class225.field2557[var5 - var4];
      return Class225.clientVarps[var3] >> var4 & var6;
   }

   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      signature = "([Lhi;Lhi;ZI)V",
      garbageValue = "96383462"
   )
   static void method3388(Class230[] var0, Class230 var1, boolean var2) {
      int var3 = var1.field2628 != 0 ? var1.field2628 : var1.field2675;
      int var4 = var1.field2629 != 0 ? var1.field2629 : var1.field2621;
      Class304.method5635(var0, var1.field2691, var3, var4, var2);
      if (var1.field2736 != null) {
         Class304.method5635(var1.field2736, var1.field2691, var3, var4, var2);
      }

      Class55 var5 = (Class55)Client.field741.method4020((long)var1.field2691);
      if (var5 != null) {
         Class84.method1946(var5.field501, var3, var4, var2);
      }

      if (var1.field2609 == 1337) {
         ;
      }

   }
}
