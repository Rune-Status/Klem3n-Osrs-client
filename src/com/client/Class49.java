package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public final class Class49 {
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Leh;"
   )
   static Class136 field439;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)Liq;",
      garbageValue = "860567064"
   )
   public static Class259 method953(int var0) {
      Class259 var1 = (Class259)Class259.field3282.method3989((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Class259.field3283.method4625(1, var0);
         var1 = new Class259();
         if (var2 != null) {
            var1.method4880(new Class182(var2), var0);
         }

         var1.method4875();
         Class259.field3282.method3983(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-66"
   )
   static void method952() {
      Class50.field445 = null;
      Class165.field2033 = null;
      Class50.field446 = null;
      Class19.field159 = null;
      Class37.field325 = null;
      Class50.field447 = null;
      Class50.field448 = null;
      Class50.field454 = null;
      Class305.field3725 = null;
      Class72.field1035 = null;
      Class263.field3325 = null;
      Class243.field3137 = null;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)[Lly;",
      garbageValue = "2064294997"
   )
   static Class317[] method950() {
      Class317[] var0 = new Class317[Class319.field3802];

      for(int var1 = 0; var1 < Class319.field3802; ++var1) {
         Class317 var2 = var0[var1] = new Class317();
         var2.field3784 = Class305.field3729;
         var2.field3783 = Class319.field3798;
         var2.field3782 = Class7.field45[var1];
         var2.field3778 = Class225.field2562[var1];
         var2.field3780 = Class319.field3800[var1];
         var2.field3781 = Class319.field3799[var1];
         var2.field3779 = Class172.field2260;
         var2.field3785 = Class319.field3801[var1];
      }

      Class7.field45 = null;
      Class225.field2562 = null;
      Class319.field3800 = null;
      Class319.field3799 = null;
      Class172.field2260 = null;
      Class319.field3801 = null;
      return var0;
   }

   @ObfuscatedName("gx")
   @ObfuscatedSignature(
      signature = "(IIIIIIB)V",
      garbageValue = "35"
   )
   static final void method951(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = 2048 - var3 & 2047;
      int var7 = 2048 - var4 & 2047;
      int var8 = 0;
      int var9 = 0;
      int var10 = var5;
      int var11;
      int var12;
      int var13;
      if (var6 != 0) {
         var11 = Class122.field1681[var6];
         var12 = Class122.field1693[var6];
         var13 = var12 * var9 - var5 * var11 >> 16;
         var10 = var12 * var5 + var9 * var11 >> 16;
         var9 = var13;
      }

      if (var7 != 0) {
         var11 = Class122.field1681[var7];
         var12 = Class122.field1693[var7];
         var13 = var8 * var12 + var11 * var10 >> 16;
         var10 = var10 * var12 - var8 * var11 >> 16;
         var8 = var13;
      }

      Class109.field1431 = var0 - var8;
      Class123.field1702 = var1 - var9;
      Class226.field2563 = var2 - var10;
      Class7.field41 = var3;
      Class85.field1201 = var4;
      if (Client.field655 == 1 && Client.field747 >= 2 && Client.field591 % 50 == 0 && (Class109.field1428 >> 7 != Class138.field1876.field931 >> 7 || Class2.field23 >> 7 != Class138.field1876.field881 >> 7)) {
         var11 = Class138.field1876.field567;
         var12 = (Class109.field1428 >> 7) + Class62.field868;
         var13 = (Class2.field23 >> 7) + Client.field754;
         Class19.method197(var12, var13, var11, true);
      }

   }
}
