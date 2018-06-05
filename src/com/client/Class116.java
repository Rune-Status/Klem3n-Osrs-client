package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class Class116 extends Class204 {
   @ObfuscatedName("g")
   static int[] field1541;
   @ObfuscatedName("u")
   int field1527;
   @ObfuscatedName("q")
   boolean field1530;
   @ObfuscatedName("k")
   int[] field1533;
   @ObfuscatedName("i")
   int[] field1535;
   @ObfuscatedName("x")
   int[] field1532;
   @ObfuscatedName("e")
   int[] field1536;
   @ObfuscatedName("p")
   int field1537;
   @ObfuscatedName("b")
   int field1538;
   @ObfuscatedName("n")
   int[] field1539;
   @ObfuscatedName("f")
   boolean field1540 = false;

   @ObfuscatedSignature(
      signature = "(Lgk;)V"
   )
   Class116(Class182 var1) {
      this.field1527 = var1.method3550();
      this.field1530 = var1.method3544() == 1;
      int var2 = var1.method3544();
      if (var2 >= 1 && var2 <= 4) {
         this.field1533 = new int[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.field1533[var3] = var1.method3550();
         }

         if (var2 > 1) {
            this.field1535 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field1535[var3] = var1.method3544();
            }
         }

         if (var2 > 1) {
            this.field1532 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field1532[var3] = var1.method3544();
            }
         }

         this.field1536 = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.field1536[var3] = var1.method3671();
         }

         this.field1537 = var1.method3544();
         this.field1538 = var1.method3544();
         this.field1539 = null;
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(DILir;)Z"
   )
   boolean method2661(double var1, int var3, Class247 var4) {
      int var5;
      for(var5 = 0; var5 < this.field1533.length; ++var5) {
         if (var4.method4626(this.field1533[var5]) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.field1539 = new int[var5];

      for(int var6 = 0; var6 < this.field1533.length; ++var6) {
         Class317 var7 = Class233.method4589(var4, this.field1533[var6]);
         var7.method5824();
         byte[] var8 = var7.field3785;
         int[] var9 = var7.field3779;
         int var10 = this.field1536[var6];
         if ((var10 & -16777216) == 16777216) {
            ;
         }

         if ((var10 & -16777216) == 33554432) {
            ;
         }

         int var11;
         int var12;
         int var13;
         int var14;
         if ((var10 & -16777216) == 50331648) {
            var11 = var10 & 16711935;
            var12 = var10 >> 8 & 255;

            for(var13 = 0; var13 < var9.length; ++var13) {
               var14 = var9[var13];
               if (var14 >> 8 == (var14 & '\uffff')) {
                  var14 &= 255;
                  var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & '\uff00';
               }
            }
         }

         for(var11 = 0; var11 < var9.length; ++var11) {
            var9[var11] = Class122.method2792(var9[var11], var1);
         }

         if (var6 == 0) {
            var11 = 0;
         } else {
            var11 = this.field1535[var6 - 1];
         }

         if (var11 == 0) {
            if (var3 == var7.field3780) {
               for(var12 = 0; var12 < var5; ++var12) {
                  this.field1539[var12] = var9[var8[var12] & 255];
               }
            } else if (var7.field3780 == 64 && var3 == 128) {
               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field1539[var12++] = var9[var8[(var13 >> 1 << 6) + (var14 >> 1)] & 255];
                  }
               }
            } else {
               if (var7.field3780 != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field1539[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if (var11 == 1) {
            ;
         }

         if (var11 == 2) {
            ;
         }

         if (var11 == 3) {
            ;
         }
      }

      return true;
   }

   @ObfuscatedName("w")
   void method2656() {
      this.field1539 = null;
   }

   @ObfuscatedName("s")
   void method2657(int var1) {
      if (this.field1539 != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if (this.field1537 == 1 || this.field1537 == 3) {
            if (field1541 == null || field1541.length < this.field1539.length) {
               field1541 = new int[this.field1539.length];
            }

            if (this.field1539.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field1539.length;
            var4 = var2 * this.field1538 * var1;
            var5 = var3 - 1;
            if (this.field1537 == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               field1541[var6] = this.field1539[var7];
            }

            var10 = this.field1539;
            this.field1539 = field1541;
            field1541 = var10;
         }

         if (this.field1537 == 2 || this.field1537 == 4) {
            if (field1541 == null || field1541.length < this.field1539.length) {
               field1541 = new int[this.field1539.length];
            }

            if (this.field1539.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field1539.length;
            var4 = this.field1538 * var1;
            var5 = var2 - 1;
            if (this.field1537 == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  field1541[var8] = this.field1539[var9];
               }
            }

            var10 = this.field1539;
            this.field1539 = field1541;
            field1541 = var10;
         }

      }
   }
}
