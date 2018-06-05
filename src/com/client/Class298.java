package com.client;
import com.conf.mapping.ObfuscatedName;

@ObfuscatedName("kj")
public final class Class298 extends Class299 {
   public Class298(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   public Class298(byte[] var1) {
      super(var1);
   }

   @ObfuscatedName("z")
   final void vmethod5536(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var3 * Class314.field3761 + var2;
      int var8 = Class314.field3761 - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var3 < Class314.field3763) {
         var11 = Class314.field3763 - var3;
         var5 -= var11;
         var3 = Class314.field3763;
         var10 += var11 * var4;
         var7 += var11 * Class314.field3761;
      }

      if (var3 + var5 > Class314.field3764) {
         var5 -= var3 + var5 - Class314.field3764;
      }

      if (var2 < Class314.field3765) {
         var11 = Class314.field3765 - var2;
         var4 -= var11;
         var2 = Class314.field3765;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var2 + var4 > Class314.field3760) {
         var11 = var2 + var4 - Class314.field3760;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var4 > 0 && var5 > 0) {
         Class299.method5556(Class314.field3766, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   @ObfuscatedName("w")
   final void vmethod5542(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var3 * Class314.field3761 + var2;
      int var9 = Class314.field3761 - var4;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if (var3 < Class314.field3763) {
         var12 = Class314.field3763 - var3;
         var5 -= var12;
         var3 = Class314.field3763;
         var11 += var12 * var4;
         var8 += var12 * Class314.field3761;
      }

      if (var3 + var5 > Class314.field3764) {
         var5 -= var3 + var5 - Class314.field3764;
      }

      if (var2 < Class314.field3765) {
         var12 = Class314.field3765 - var2;
         var4 -= var12;
         var2 = Class314.field3765;
         var11 += var12;
         var8 += var12;
         var10 += var12;
         var9 += var12;
      }

      if (var2 + var4 > Class314.field3760) {
         var12 = var2 + var4 - Class314.field3760;
         var4 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if (var4 > 0 && var5 > 0) {
         Class299.method5585(Class314.field3766, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }
}
