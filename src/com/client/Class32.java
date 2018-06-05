package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
public class Class32 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 2003642713
   )
   int field282;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1427733301
   )
   int field287;
   @ObfuscatedName("s")
   int[][] field283;
   @ObfuscatedName("l")
   int[][] field281;
   @ObfuscatedName("u")
   int[][] field285;
   @ObfuscatedName("q")
   int[][] field286;

   Class32(int var1, int var2) {
      this.field282 = var1;
      this.field287 = var2;
      this.field283 = new int[var1][var2];
      this.field281 = new int[var1][var2];
      this.field285 = new int[var1][var2];
      this.field286 = new int[var1][var2];
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIILiq;S)V",
      garbageValue = "11065"
   )
   void method541(int var1, int var2, int var3, Class259 var4) {
      if (var4 != null) {
         if (var3 + var1 >= 0 && var3 + var2 >= 0) {
            if (var1 - var3 <= this.field282 && var2 - var3 <= this.field287) {
               int var5 = Math.max(0, var1 - var3);
               int var6 = Math.min(this.field282, var3 + var1);
               int var7 = Math.max(0, var2 - var3);
               int var8 = Math.min(this.field287, var3 + var2);

               for(int var9 = var5; var9 < var6; ++var9) {
                  for(int var10 = var7; var10 < var8; ++var10) {
                     this.field283[var9][var10] += var4.field3284 * 256 / var4.field3281;
                     this.field281[var9][var10] += var4.field3287;
                     this.field285[var9][var10] += var4.field3286;
                     ++this.field286[var9][var10];
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "1"
   )
   int method547(int var1, int var2) {
      if (var1 >= 0 && var2 >= 0 && var1 < this.field282 && var2 < this.field287) {
         if (this.field285[var1][var2] == 0) {
            return 0;
         } else {
            int var3 = this.field283[var1][var2] / this.field286[var1][var2];
            int var4 = this.field281[var1][var2] / this.field286[var1][var2];
            int var5 = this.field285[var1][var2] / this.field286[var1][var2];
            return Class143.method3167((double)var3 / 256.0D, (double)var4 / 256.0D, (double)var5 / 256.0D);
         }
      } else {
         return 0;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "15233496"
   )
   static int method540(int var0, Class84 var1, boolean var2) {
      int var3;
      int var4;
      if (var0 == 100) {
         Class69.field1003 -= 3;
         var3 = Class69.field999[Class69.field1003];
         var4 = Class69.field999[Class69.field1003 + 1];
         int var5 = Class69.field999[Class69.field1003 + 2];
         if (var4 == 0) {
            throw new RuntimeException();
         } else {
            Class230 var6 = Class26.method434(var3);
            if (var6.field2736 == null) {
               var6.field2736 = new Class230[var5 + 1];
            }

            if (var6.field2736.length <= var5) {
               Class230[] var7 = new Class230[var5 + 1];

               for(int var8 = 0; var8 < var6.field2736.length; ++var8) {
                  var7[var8] = var6.field2736[var8];
               }

               var6.field2736 = var7;
            }

            if (var5 > 0 && var6.field2736[var5 - 1] == null) {
               throw new RuntimeException("" + (var5 - 1));
            } else {
               Class230 var12 = new Class230();
               var12.field2721 = var4;
               var12.field2605 = var12.field2691 = var6.field2691;
               var12.field2606 = var5;
               var12.field2604 = true;
               var6.field2736[var5] = var12;
               if (var2) {
                  Class276.field3561 = var12;
               } else {
                  Class260.field3301 = var12;
               }

               Class60.method1114(var6);
               return 1;
            }
         }
      } else {
         Class230 var9;
         if (var0 == 101) {
            var9 = var2 ? Class276.field3561 : Class260.field3301;
            Class230 var10 = Class26.method434(var9.field2691);
            var10.field2736[var9.field2606] = null;
            Class60.method1114(var10);
            return 1;
         } else if (var0 == 102) {
            var9 = Class26.method434(Class69.field999[--Class69.field1003]);
            var9.field2736 = null;
            Class60.method1114(var9);
            return 1;
         } else if (var0 != 200) {
            if (var0 == 201) {
               var9 = Class26.method434(Class69.field999[--Class69.field1003]);
               if (var9 != null) {
                  Class69.field999[++Class69.field1003 - 1] = 1;
                  if (var2) {
                     Class276.field3561 = var9;
                  } else {
                     Class260.field3301 = var9;
                  }
               } else {
                  Class69.field999[++Class69.field1003 - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            Class69.field1003 -= 2;
            var3 = Class69.field999[Class69.field1003];
            var4 = Class69.field999[Class69.field1003 + 1];
            Class230 var11 = Class146.method3191(var3, var4);
            if (var11 != null && var4 != -1) {
               Class69.field999[++Class69.field1003 - 1] = 1;
               if (var2) {
                  Class276.field3561 = var11;
               } else {
                  Class260.field3301 = var11;
               }
            } else {
               Class69.field999[++Class69.field1003 - 1] = 0;
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "-2015845683"
   )
   static final int method549(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = Class186.method3805(var3, var5);
      int var8 = Class186.method3805(var3 + 1, var5);
      int var9 = Class186.method3805(var3, var5 + 1);
      int var10 = Class186.method3805(var3 + 1, var5 + 1);
      int var11 = Class123.method2870(var7, var8, var4, var2);
      int var12 = Class123.method2870(var9, var10, var4, var2);
      return Class123.method2870(var11, var12, var6, var2);
   }

   @ObfuscatedName("ef")
   @ObfuscatedSignature(
      signature = "(Lic;Ljava/lang/String;I)V",
      garbageValue = "2071314705"
   )
   static void method548(Class249 var0, String var1) {
      Class52 var2 = new Class52(var0, var1);
      Client.field781.add(var2);
   }
}
