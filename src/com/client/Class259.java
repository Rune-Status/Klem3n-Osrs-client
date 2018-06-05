package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
public class Class259 extends Class206 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   static Class247 field3283;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static Class200 field3282 = new Class200(64);
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -299191193
   )
   int field3288 = 0;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1454643395
   )
   public int field3284;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1887824785
   )
   public int field3287;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1637596643
   )
   public int field3286;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1884630157
   )
   public int field3281;

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1291543523"
   )
   void method4875() {
      this.method4885(this.field3288);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "1570676740"
   )
   void method4880(Class182 var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method4881(var1, var3, var2);
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lgk;IIB)V",
      garbageValue = "-45"
   )
   void method4881(Class182 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field3288 = var1.method3552();
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-82283989"
   )
   void method4885(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var10 + var8) / 2.0D;
      if (var8 != var10) {
         if (var16 < 0.5D) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if (var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var10 == var4) {
            var12 = 2.0D + (var6 - var2) / (var10 - var8);
         } else if (var10 == var6) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      var12 /= 6.0D;
      this.field3287 = (int)(var14 * 256.0D);
      this.field3286 = (int)(256.0D * var16);
      if (this.field3287 < 0) {
         this.field3287 = 0;
      } else if (this.field3287 > 255) {
         this.field3287 = 255;
      }

      if (this.field3286 < 0) {
         this.field3286 = 0;
      } else if (this.field3286 > 255) {
         this.field3286 = 255;
      }

      if (var16 > 0.5D) {
         this.field3281 = (int)(var14 * (1.0D - var16) * 512.0D);
      } else {
         this.field3281 = (int)(512.0D * var14 * var16);
      }

      if (this.field3281 < 1) {
         this.field3281 = 1;
      }

      this.field3284 = (int)(var12 * (double)this.field3281);
   }
}
