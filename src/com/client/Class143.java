package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class Class143 extends Class283 {
   @ObfuscatedName("no")
   @ObfuscatedSignature(
      signature = "Lkb;"
   )
   static Class307 field1899;
   @ObfuscatedName("fd")
   static int[] field1900;
   @ObfuscatedName("kl")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   static Class230 field1897;
   @ObfuscatedName("z")
   final boolean field1893;

   public Class143(boolean var1) {
      this.field1893 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lkz;Lkz;B)I",
      garbageValue = "3"
   )
   int method3165(Class287 var1, Class287 var2) {
      if (var2.field3628 != var1.field3628) {
         return this.field1893 ? var1.field3628 - var2.field3628 : var2.field3628 - var1.field3628;
      } else {
         return this.method5308(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method3165((Class287)var1, (Class287)var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;B)V",
      garbageValue = "16"
   )
   static void method3172(int var0, String var1, String var2) {
      Class173.method3472(var0, var1, var2, (String)null);
   }

   @ObfuscatedName("z")
   public static final int method3167(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if (0.0D != var2) {
         double var12;
         if (var4 < 0.5D) {
            var12 = var4 * (var2 + 1.0D);
         } else {
            var12 = var4 + var2 - var2 * var4;
         }

         double var14 = 2.0D * var4 - var12;
         double var16 = var0 + 0.3333333333333333D;
         if (var16 > 1.0D) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333D;
         if (var20 < 0.0D) {
            ++var20;
         }

         if (6.0D * var16 < 1.0D) {
            var6 = var14 + var16 * 6.0D * (var12 - var14);
         } else if (var16 * 2.0D < 1.0D) {
            var6 = var12;
         } else if (var16 * 3.0D < 2.0D) {
            var6 = var14 + 6.0D * (0.6666666666666666D - var16) * (var12 - var14);
         } else {
            var6 = var14;
         }

         if (var0 * 6.0D < 1.0D) {
            var8 = var14 + var0 * 6.0D * (var12 - var14);
         } else if (2.0D * var0 < 1.0D) {
            var8 = var12;
         } else if (3.0D * var0 < 2.0D) {
            var8 = 6.0D * (0.6666666666666666D - var0) * (var12 - var14) + var14;
         } else {
            var8 = var14;
         }

         if (var20 * 6.0D < 1.0D) {
            var10 = (var12 - var14) * 6.0D * var20 + var14;
         } else if (2.0D * var20 < 1.0D) {
            var10 = var12;
         } else if (3.0D * var20 < 2.0D) {
            var10 = (var12 - var14) * (0.6666666666666666D - var20) * 6.0D + var14;
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(var6 * 256.0D);
      int var13 = (int)(var8 * 256.0D);
      int var23 = (int)(256.0D * var10);
      int var15 = var23 + (var13 << 8) + (var22 << 16);
      return var15;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-329911544"
   )
   public static int method3173(int var0) {
      int var1 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var0 + var1;
   }
}
