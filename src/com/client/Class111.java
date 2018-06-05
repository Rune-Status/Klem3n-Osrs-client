package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
public class Class111 implements Class131 {
   @ObfuscatedName("fo")
   @ObfuscatedSignature(
      signature = "[Lll;"
   )
   static Class318[] field1446;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "[Ldu;"
   )
   Class116[] field1441;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   Class205 field1444 = new Class205();
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 114884877
   )
   int field1440;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1966961957
   )
   int field1439 = 0;
   @ObfuscatedName("u")
   double field1442 = 1.0D;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1617478817
   )
   int field1443 = 128;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   Class247 field1438;

   @ObfuscatedSignature(
      signature = "(Lir;Lir;IDI)V"
   )
   public Class111(Class247 var1, Class247 var2, int var3, double var4, int var6) {
      this.field1438 = var2;
      this.field1440 = var3;
      this.field1439 = this.field1440;
      this.field1442 = var4;
      this.field1443 = var6;
      int[] var7 = var1.method4668(0);
      int var8 = var7.length;
      this.field1441 = new Class116[var1.method4636(0)];

      for(int var9 = 0; var9 < var8; ++var9) {
         Class182 var10 = new Class182(var1.method4625(0, var7[var9]));
         this.field1441[var7[var9]] = new Class116(var10);
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1808085828"
   )
   public int method2530() {
      int var1 = 0;
      int var2 = 0;
      Class116[] var3 = this.field1441;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Class116 var5 = var3[var4];
         if (var5 != null && var5.field1533 != null) {
            var1 += var5.field1533.length;
            int[] var6 = var5.field1533;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               int var8 = var6[var7];
               if (this.field1438.method4627(var8)) {
                  ++var2;
               }
            }
         }
      }

      if (var1 == 0) {
         return 0;
      } else {
         return var2 * 100 / var1;
      }
   }

   @ObfuscatedName("w")
   public void method2544(double var1) {
      this.field1442 = var1;
      this.method2561();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)[I",
      garbageValue = "-1935357081"
   )
   public int[] vmethod3079(int var1) {
      Class116 var2 = this.field1441[var1];
      if (var2 != null) {
         if (var2.field1539 != null) {
            this.field1444.method4074(var2);
            var2.field1540 = true;
            return var2.field1539;
         }

         boolean var3 = var2.method2661(this.field1442, this.field1443, this.field1438);
         if (var3) {
            if (this.field1439 == 0) {
               Class116 var4 = (Class116)this.field1444.method4080();
               var4.method2656();
            } else {
               --this.field1439;
            }

            this.field1444.method4074(var2);
            var2.field1540 = true;
            return var2.field1539;
         }
      }

      return null;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "2017103535"
   )
   public int vmethod3092(int var1) {
      return this.field1441[var1] != null ? this.field1441[var1].field1527 : 0;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "70"
   )
   public boolean vmethod3081(int var1) {
      return this.field1441[var1].field1530;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "443897939"
   )
   public boolean vmethod3082(int var1) {
      return this.field1443 == 64;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "566742688"
   )
   public void method2561() {
      for(int var1 = 0; var1 < this.field1441.length; ++var1) {
         if (this.field1441[var1] != null) {
            this.field1441[var1].method2656();
         }
      }

      this.field1444 = new Class205();
      this.field1439 = this.field1440;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "0"
   )
   public void method2537(int var1) {
      for(int var2 = 0; var2 < this.field1441.length; ++var2) {
         Class116 var3 = this.field1441[var2];
         if (var3 != null && var3.field1537 != 0 && var3.field1540) {
            var3.method2657(var1);
            var3.field1540 = false;
         }
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IB)Ljt;",
      garbageValue = "56"
   )
   public static Class269 method2563(int var0) {
      Class269 var1 = (Class269)Class269.field3461.method3989((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Class269.field3424.method4625(10, var0);
         var1 = new Class269();
         var1.field3431 = var0;
         if (var2 != null) {
            var1.method5090(new Class182(var2));
         }

         var1.method5087();
         if (var1.field3465 != -1) {
            var1.method5126(method2563(var1.field3465), method2563(var1.field3464));
         }

         if (var1.field3475 != -1) {
            var1.method5110(method2563(var1.field3475), method2563(var1.field3473));
         }

         if (var1.field3477 != -1) {
            var1.method5091(method2563(var1.field3477), method2563(var1.field3476));
         }

         if (!Class269.field3426 && var1.field3446) {
            var1.field3433 = "Members object";
            var1.field3436 = false;
            var1.field3447 = null;
            var1.field3425 = null;
            var1.field3449 = -1;
            var1.field3462 = 0;
            if (var1.field3472 != null) {
               boolean var3 = false;

               for(Class204 var4 = var1.field3472.method3955(); var4 != null; var4 = var1.field3472.method3947()) {
                  Class264 var5 = Class241.method4603((int)var4.field2421);
                  if (var5.field3332) {
                     var4.method4064();
                  } else {
                     var3 = true;
                  }
               }

               if (!var3) {
                  var1.field3472 = null;
               }
            }
         }

         Class269.field3461.method3983(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-33"
   )
   static void method2562() {
      Class81.field1167 = 0;

      for(int var0 = 0; var0 < 2048; ++var0) {
         Class81.field1157[var0] = null;
         Class81.field1153[var0] = 1;
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(ILce;ZB)I",
      garbageValue = "41"
   )
   static int method2531(int var0, Class84 var1, boolean var2) {
      if (var0 == 5630) {
         Client.field627 = 250;
         return 1;
      } else {
         return 2;
      }
   }
}
