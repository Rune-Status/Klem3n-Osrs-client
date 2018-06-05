package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class Class258 extends Class206 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static Class247 field3272;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static Class247 field3279;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static Class200 field3267 = new Class200(64);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static Class200 field3265 = new Class200(30);
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -222748263
   )
   int field3280;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1890309405
   )
   int field3268;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1738740977
   )
   public int field3271 = -1;
   @ObfuscatedName("i")
   short[] field3266;
   @ObfuscatedName("x")
   short[] field3270;
   @ObfuscatedName("e")
   short[] field3274;
   @ObfuscatedName("p")
   short[] field3275;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1496956879
   )
   int field3276 = 128;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -3859707
   )
   int field3277 = 128;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1793069157
   )
   int field3278 = 0;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1287651757
   )
   int field3273 = 0;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1462355847
   )
   int field3269 = 0;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "713149858"
   )
   void method4864(Class182 var1) {
      while(true) {
         int var2 = var1.method3544();
         if (var2 == 0) {
            return;
         }

         this.method4865(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "269273917"
   )
   void method4865(Class182 var1, int var2) {
      if (var2 == 1) {
         this.field3268 = var1.method3550();
      } else if (var2 == 2) {
         this.field3271 = var1.method3550();
      } else if (var2 == 4) {
         this.field3276 = var1.method3550();
      } else if (var2 == 5) {
         this.field3277 = var1.method3550();
      } else if (var2 == 6) {
         this.field3278 = var1.method3550();
      } else if (var2 == 7) {
         this.field3273 = var1.method3544();
      } else if (var2 == 8) {
         this.field3269 = var1.method3544();
      } else {
         int var3;
         int var4;
         if (var2 == 40) {
            var3 = var1.method3544();
            this.field3266 = new short[var3];
            this.field3270 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3266[var4] = (short)var1.method3550();
               this.field3270[var4] = (short)var1.method3550();
            }
         } else if (var2 == 41) {
            var3 = var1.method3544();
            this.field3274 = new short[var3];
            this.field3275 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3274[var4] = (short)var1.method3550();
               this.field3275[var4] = (short)var1.method3550();
            }
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Ldc;",
      garbageValue = "-226282486"
   )
   public final Class119 method4866(int var1) {
      Class119 var2 = (Class119)field3265.method3989((long)this.field3280);
      if (var2 == null) {
         Class113 var3 = Class113.method2568(field3279, this.field3268, 0);
         if (var3 == null) {
            return null;
         }

         int var4;
         if (this.field3266 != null) {
            for(var4 = 0; var4 < this.field3266.length; ++var4) {
               var3.method2581(this.field3266[var4], this.field3270[var4]);
            }
         }

         if (this.field3274 != null) {
            for(var4 = 0; var4 < this.field3274.length; ++var4) {
               var3.method2582(this.field3274[var4], this.field3275[var4]);
            }
         }

         var2 = var3.method2589(this.field3273 + 64, this.field3269 + 850, -30, -50, -30);
         field3265.method3983(var2, (long)this.field3280);
      }

      Class119 var5;
      if (this.field3271 != -1 && var1 != -1) {
         var5 = Class3.method25(this.field3271).method5217(var2, var1);
      } else {
         var5 = var2.method2667(true);
      }

      if (this.field3276 != 128 || this.field3277 != 128) {
         var5.method2681(this.field3276, this.field3277, this.field3276);
      }

      if (this.field3278 != 0) {
         if (this.field3278 == 90) {
            var5.method2677();
         }

         if (this.field3278 == 180) {
            var5.method2677();
            var5.method2677();
         }

         if (this.field3278 == 270) {
            var5.method2677();
            var5.method2677();
            var5.method2677();
         }
      }

      return var5;
   }
}
