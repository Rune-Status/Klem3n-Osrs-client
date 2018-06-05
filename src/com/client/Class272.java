package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class Class272 extends Class206 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   static Class247 field3529;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static Class200 field3524 = new Class200(64);
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1227278643
   )
   public int field3533 = 0;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 322304585
   )
   public int field3526 = -1;
   @ObfuscatedName("u")
   public boolean field3523 = true;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1819527723
   )
   public int field3528 = -1;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 119640423
   )
   public int field3525;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1975802877
   )
   public int field3530;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1348598639
   )
   public int field3531;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -700053543
   )
   public int field3527;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 2014252323
   )
   public int field3532;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -496210747
   )
   public int field3534;

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2121765043"
   )
   void method5195() {
      if (this.field3528 != -1) {
         this.method5192(this.field3528);
         this.field3527 = this.field3525;
         this.field3532 = this.field3530;
         this.field3534 = this.field3531;
      }

      this.method5192(this.field3533);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-2042165277"
   )
   void method5194(Class182 var1, int var2) {
      while(true) {
         int var3 = var1.method3544();
         if (var3 == 0) {
            return;
         }

         this.method5191(var1, var3, var2);
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lgk;III)V",
      garbageValue = "-1678244242"
   )
   void method5191(Class182 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field3533 = var1.method3552();
      } else if (var2 == 2) {
         this.field3526 = var1.method3544();
      } else if (var2 == 5) {
         this.field3523 = false;
      } else if (var2 == 7) {
         this.field3528 = var1.method3552();
      } else if (var2 == 8) {
         ;
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1230983884"
   )
   void method5192(int var1) {
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

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var10 == var4) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0D;
         } else if (var6 == var10) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      var12 /= 6.0D;
      this.field3525 = (int)(256.0D * var12);
      this.field3530 = (int)(256.0D * var14);
      this.field3531 = (int)(var16 * 256.0D);
      if (this.field3530 < 0) {
         this.field3530 = 0;
      } else if (this.field3530 > 255) {
         this.field3530 = 255;
      }

      if (this.field3531 < 0) {
         this.field3531 = 0;
      } else if (this.field3531 > 255) {
         this.field3531 = 255;
      }

   }
}
