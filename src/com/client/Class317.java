package com.client;
import com.conf.mapping.ObfuscatedName;

@ObfuscatedName("ly")
public final class Class317 extends Class314 {
   @ObfuscatedName("z")
   public byte[] field3785;
   @ObfuscatedName("w")
   public int[] field3779;
   @ObfuscatedName("s")
   public int field3780;
   @ObfuscatedName("l")
   public int field3781;
   @ObfuscatedName("u")
   public int field3782;
   @ObfuscatedName("q")
   public int field3778;
   @ObfuscatedName("k")
   public int field3784;
   @ObfuscatedName("i")
   public int field3783;

   @ObfuscatedName("z")
   public void method5824() {
      if (this.field3780 != this.field3784 || this.field3781 != this.field3783) {
         byte[] var1 = new byte[this.field3784 * this.field3783];
         int var2 = 0;

         for(int var3 = 0; var3 < this.field3781; ++var3) {
            for(int var4 = 0; var4 < this.field3780; ++var4) {
               var1[var4 + (var3 + this.field3778) * this.field3784 + this.field3782] = this.field3785[var2++];
            }
         }

         this.field3785 = var1;
         this.field3780 = this.field3784;
         this.field3781 = this.field3783;
         this.field3782 = 0;
         this.field3778 = 0;
      }
   }

   @ObfuscatedName("w")
   public void method5822(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field3779.length; ++var4) {
         int var5 = this.field3779[var4] >> 16 & 255;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.field3779[var4] >> 8 & 255;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.field3779[var4] & 255;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.field3779[var4] = var7 + (var6 << 8) + (var5 << 16);
      }

   }

   @ObfuscatedName("s")
   public void method5829(int var1, int var2) {
      var1 += this.field3782;
      var2 += this.field3778;
      int var3 = var1 + var2 * Class314.field3761;
      int var4 = 0;
      int var5 = this.field3781;
      int var6 = this.field3780;
      int var7 = Class314.field3761 - var6;
      int var8 = 0;
      int var9;
      if (var2 < Class314.field3763) {
         var9 = Class314.field3763 - var2;
         var5 -= var9;
         var2 = Class314.field3763;
         var4 += var9 * var6;
         var3 += var9 * Class314.field3761;
      }

      if (var5 + var2 > Class314.field3764) {
         var5 -= var5 + var2 - Class314.field3764;
      }

      if (var1 < Class314.field3765) {
         var9 = Class314.field3765 - var1;
         var6 -= var9;
         var1 = Class314.field3765;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 + var1 > Class314.field3760) {
         var9 = var6 + var1 - Class314.field3760;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         method5823(Class314.field3766, this.field3785, this.field3779, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedName("u")
   public void method5825(int var1, int var2, int var3, int var4) {
      int var5 = this.field3780;
      int var6 = this.field3781;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.field3784;
      int var10 = this.field3783;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.field3782 > 0) {
         var13 = (var11 + (this.field3782 << 16) - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.field3782 << 16);
      }

      if (this.field3778 > 0) {
         var13 = (var12 + (this.field3778 << 16) - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.field3778 << 16);
      }

      if (var5 < var9) {
         var3 = (var11 + ((var5 << 16) - var7) - 1) / var11;
      }

      if (var6 < var10) {
         var4 = (var12 + ((var6 << 16) - var8) - 1) / var12;
      }

      var13 = var1 + var2 * Class314.field3761;
      int var14 = Class314.field3761 - var3;
      if (var2 + var4 > Class314.field3764) {
         var4 -= var2 + var4 - Class314.field3764;
      }

      int var15;
      if (var2 < Class314.field3763) {
         var15 = Class314.field3763 - var2;
         var4 -= var15;
         var13 += var15 * Class314.field3761;
         var8 += var12 * var15;
      }

      if (var3 + var1 > Class314.field3760) {
         var15 = var3 + var1 - Class314.field3760;
         var3 -= var15;
         var14 += var15;
      }

      if (var1 < Class314.field3765) {
         var15 = Class314.field3765 - var1;
         var3 -= var15;
         var13 += var15;
         var7 += var11 * var15;
         var14 += var15;
      }

      method5826(Class314.field3766, this.field3785, this.field3779, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   @ObfuscatedName("l")
   static void method5823(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("q")
   static void method5826(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = var11 * (var4 >> 16);

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if (var16 != 0) {
               var0[var5++] = var2[var16 & 255];
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }
}
