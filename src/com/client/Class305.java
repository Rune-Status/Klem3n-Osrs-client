package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public final class Class305 {
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -259078735
   )
   static int field3729;
   @ObfuscatedName("p")
   static int[] field3725;

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)Lly;",
      garbageValue = "1052310546"
   )
   static Class317 method5658() {
      Class317 var0 = new Class317();
      var0.field3784 = field3729;
      var0.field3783 = Class319.field3798;
      var0.field3782 = Class7.field45[0];
      var0.field3778 = Class225.field2562[0];
      var0.field3780 = Class319.field3800[0];
      var0.field3781 = Class319.field3799[0];
      var0.field3779 = Class172.field2260;
      var0.field3785 = Class319.field3801[0];
      Class7.field45 = null;
      Class225.field2562 = null;
      Class319.field3800 = null;
      Class319.field3799 = null;
      Class172.field2260 = null;
      Class319.field3801 = null;
      return var0;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "1903036691"
   )
   static int method5659(int var0, Class84 var1, boolean var2) {
      Class230 var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = Class26.method434(Class69.field999[--Class69.field1003]);
      } else {
         var3 = var2 ? Class276.field3561 : Class260.field3301;
      }

      if (var0 == 1927) {
         if (Class69.field1009 >= 10) {
            throw new RuntimeException();
         } else if (var3.field2715 == null) {
            return 0;
         } else {
            Class56 var4 = new Class56();
            var4.field506 = var3;
            var4.field512 = var3.field2715;
            var4.field514 = Class69.field1009 + 1;
            Client.field638.method4073(var4);
            return 1;
         }
      } else {
         return 2;
      }
   }
}
