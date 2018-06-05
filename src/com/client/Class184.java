package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public class Class184 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      longValue = -7929231222859405373L
   )
   static long field2351;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      longValue = 2010951404606687319L
   )
   static long field2350;

   @ObfuscatedName("hy")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "805819777"
   )
   static void method3785(int var0, int var1) {
      int var2 = Class293.field3660.method5517("Choose Option");

      int var3;
      int var4;
      for(var3 = 0; var3 < Client.field771; ++var3) {
         var4 = Class293.field3660.method5517(Class18.method176(var3));
         if (var4 > var2) {
            var2 = var4;
         }
      }

      var2 += 8;
      var3 = Client.field771 * 15 + 22;
      var4 = var0 - var2 / 2;
      if (var2 + var4 > Class82.field1179) {
         var4 = Class82.field1179 - var2;
      }

      if (var4 < 0) {
         var4 = 0;
      }

      int var5 = var1;
      if (var1 + var3 > Class243.field3138) {
         var5 = Class243.field3138 - var3;
      }

      if (var5 < 0) {
         var5 = 0;
      }

      Class48.field435 = var4;
      Class0.field1 = var5;
      Class135.field1856 = var2;
      Class151.field1933 = Client.field771 * 15 + 22;
   }
}
