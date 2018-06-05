package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
public class Class74 {
   @ObfuscatedName("hh")
   @ObfuscatedSignature(
      signature = "(Lbl;B)V",
      garbageValue = "7"
   )
   static final void method1800(Class62 var0) {
      long var1 = 0L;
      int var3 = -1;
      int var4 = 0;
      int var5 = 0;
      if (var0.field856 == 0) {
         var1 = Class28.field248.method2898(var0.field861, var0.field857, var0.field858);
      }

      if (var0.field856 == 1) {
         var1 = Class28.field248.method2899(var0.field861, var0.field857, var0.field858);
      }

      if (var0.field856 == 2) {
         var1 = Class28.field248.method2900(var0.field861, var0.field857, var0.field858);
      }

      if (var0.field856 == 3) {
         var1 = Class28.field248.method2901(var0.field861, var0.field857, var0.field858);
      }

      if (0L != var1) {
         int var6 = Class28.field248.method2902(var0.field861, var0.field857, var0.field858, var1);
         var3 = Class39.method673(var1);
         var4 = var6 & 31;
         var5 = var6 >> 6 & 3;
      }

      var0.field859 = var3;
      var0.field866 = var4;
      var0.field865 = var5;
   }
}
