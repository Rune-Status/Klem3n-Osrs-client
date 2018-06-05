package com.client;
import java.awt.Image;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
public class Class71 extends Class204 {
   @ObfuscatedName("at")
   static Image field1028;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lja;"
   )
   Class261 field1025;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgy;"
   )
   Class203 field1026 = new Class203();

   @ObfuscatedSignature(
      signature = "(Lja;)V"
   )
   Class71(Class261 var1) {
      this.field1025 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "2106192110"
   )
   void method1772(int var1, int var2, int var3, int var4) {
      Class64 var5 = null;
      int var6 = 0;

      for(Class64 var7 = (Class64)this.field1026.method4048(); var7 != null; var7 = (Class64)this.field1026.method4033()) {
         ++var6;
         if (var7.field934 == var1) {
            var7.method1559(var1, var2, var3, var4);
            return;
         }

         if (var7.field934 <= var1) {
            var5 = var7;
         }
      }

      if (var5 == null) {
         if (var6 < 4) {
            this.field1026.method4038(new Class64(var1, var2, var3, var4));
         }

      } else {
         Class203.method4036(new Class64(var1, var2, var3, var4), var5);
         if (var6 >= 4) {
            this.field1026.method4048().method4064();
         }

      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)Lbn;",
      garbageValue = "1625981633"
   )
   Class64 method1773(int var1) {
      Class64 var2 = (Class64)this.field1026.method4048();
      if (var2 != null && var2.field934 <= var1) {
         for(Class64 var3 = (Class64)this.field1026.method4033(); var3 != null && var3.field934 <= var1; var3 = (Class64)this.field1026.method4033()) {
            var2.method4064();
            var2 = var3;
         }

         if (this.field1025.field3313 + var2.field934 + var2.field937 > var1) {
            return var2;
         } else {
            var2.method4064();
            return null;
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "44"
   )
   boolean method1774() {
      return this.field1026.method4043();
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)Lll;",
      garbageValue = "792090098"
   )
   static Class318 method1781() {
      Class318 var0 = new Class318();
      var0.field3796 = Class305.field3729;
      var0.field3792 = Class319.field3798;
      var0.field3793 = Class7.field45[0];
      var0.field3790 = Class225.field2562[0];
      var0.field3787 = Class319.field3800[0];
      var0.field3788 = Class319.field3799[0];
      int var1 = var0.field3788 * var0.field3787;
      byte[] var2 = Class319.field3801[0];
      var0.field3791 = new int[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var0.field3791[var3] = Class172.field2260[var2[var3] & 255];
      }

      Class7.field45 = null;
      Class225.field2562 = null;
      Class319.field3800 = null;
      Class319.field3799 = null;
      Class172.field2260 = null;
      Class319.field3801 = null;
      return var0;
   }
}
