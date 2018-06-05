package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public class Class238 {
   @ObfuscatedName("gj")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "111587198"
   )
   static final void method4594(int var0, int var1, int var2) {
      if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var3 = Class27.method460(var0, var1, Class13.field82) - var2;
         var0 -= Class109.field1431;
         var3 -= Class123.field1702;
         var1 -= Class226.field2563;
         int var4 = Class122.field1681[Class7.field41];
         int var5 = Class122.field1693[Class7.field41];
         int var6 = Class122.field1681[Class85.field1201];
         int var7 = Class122.field1693[Class85.field1201];
         int var8 = var6 * var1 + var0 * var7 >> 16;
         var1 = var7 * var1 - var0 * var6 >> 16;
         var0 = var8;
         var8 = var5 * var3 - var4 * var1 >> 16;
         var1 = var3 * var4 + var5 * var1 >> 16;
         if (var1 >= 50) {
            Client.field679 = var0 * Client.field840 / var1 + Client.field838 / 2;
            Client.field680 = var8 * Client.field840 / var1 + Client.field662 / 2;
         } else {
            Client.field679 = -1;
            Client.field680 = -1;
         }

      } else {
         Client.field679 = -1;
         Client.field680 = -1;
      }
   }
}
