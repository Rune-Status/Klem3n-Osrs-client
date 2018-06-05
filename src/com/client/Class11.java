package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
public class Class11 {
   @ObfuscatedName("pl")
   @ObfuscatedGetter(
      intValue = -1317413597
   )
   static int field68;
   @ObfuscatedName("c")
   static int[] field69;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;Lir;Lir;Lir;S)V",
      garbageValue = "22982"
   )
   public static void method100(Class247 var0, Class247 var1, Class247 var2, Class247 var3) {
      Class230.field2729 = var0;
      Class230.field2642 = var1;
      Class154.field1956 = var2;
      Class230.field2598 = var3;
      Class42.field366 = new Class230[Class230.field2729.method4637()][];
      Class175.field2271 = new boolean[Class230.field2729.method4637()];
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1543564143"
   )
   static int method99() {
      return 11;
   }

   @ObfuscatedName("gr")
   @ObfuscatedSignature(
      signature = "(Lbu;ZI)V",
      garbageValue = "-863688081"
   )
   static void method98(Class60 var0, boolean var1) {
      if (var0 != null && var0.vmethod1786() && !var0.field566) {
         var0.field560 = false;
         if ((Client.field585 && Class81.field1167 > 50 || Class81.field1167 > 200) && var1 && var0.field893 == var0.field900) {
            var0.field560 = true;
         }

         int var2 = var0.field931 >> 7;
         int var3 = var0.field881 >> 7;
         if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
            long var4 = Class76.method1804(0, 0, 0, false, var0.field574);
            if (var0.field563 != null && Client.field591 >= var0.field545 && Client.field591 < var0.field555) {
               var0.field560 = false;
               var0.field562 = Class27.method460(var0.field931, var0.field881, Class13.field82);
               var0.field889 = Client.field591;
               Class28.field248.method3010(Class13.field82, var0.field931, var0.field881, var0.field562, 60, var0, var0.field905, var4, var0.field559, var0.field547, var0.field565, var0.field553);
            } else {
               if ((var0.field931 & 127) == 64 && (var0.field881 & 127) == 64) {
                  if (Client.field761[var2][var3] == Client.field687) {
                     return;
                  }

                  Client.field761[var2][var3] = Client.field687;
               }

               var0.field562 = Class27.method460(var0.field931, var0.field881, Class13.field82);
               var0.field889 = Client.field591;
               Class28.field248.method2883(Class13.field82, var0.field931, var0.field881, var0.field562, 60, var0, var0.field905, var4, var0.field873);
            }
         }
      }

   }
}
