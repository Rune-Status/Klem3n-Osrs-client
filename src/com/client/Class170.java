package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class Class170 implements Class167 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lfq;"
   )
   public static final Class170 field2237 = new Class170(14, 0);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lfq;"
   )
   static final Class170 field2236 = new Class170(15, 4);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lfq;"
   )
   public static final Class170 field2235 = new Class170(16, -2);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lfq;"
   )
   public static final Class170 field2238 = new Class170(18, -2);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "[Lfq;"
   )
   static final Class170[] field2240 = new Class170[32];
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1358043829
   )
   public final int field2239;

   static {
      Class170[] var0 = new Class170[]{field2235, field2236, field2237, field2238};
      Class170[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         field2240[var1[var2].field2239] = var1[var2];
      }

   }

   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "0"
   )
   Class170(int var1, int var2) {
      this.field2239 = var1;
   }

   @ObfuscatedName("hw")
   @ObfuscatedSignature(
      signature = "(IIIIIIIB)V",
      garbageValue = "15"
   )
   static final void method3449(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if (Client.field585 && var0 != Class13.field82) {
            return;
         }

         long var7 = 0L;
         boolean var9 = true;
         boolean var10 = false;
         boolean var11 = false;
         if (var1 == 0) {
            var7 = Class28.field248.method2898(var0, var2, var3);
         }

         if (var1 == 1) {
            var7 = Class28.field248.method2899(var0, var2, var3);
         }

         if (var1 == 2) {
            var7 = Class28.field248.method2900(var0, var2, var3);
         }

         if (var1 == 3) {
            var7 = Class28.field248.method2901(var0, var2, var3);
         }

         int var12;
         if (var7 != 0L) {
            var12 = Class28.field248.method2902(var0, var2, var3, var7);
            int var14 = Class39.method673(var7);
            int var15 = var12 & 31;
            int var16 = var12 >> 6 & 3;
            Class268 var13;
            if (var1 == 0) {
               Class28.field248.method2889(var0, var2, var3);
               var13 = Class110.method2527(var14);
               if (var13.field3386 != 0) {
                  Client.field642[var0].method3391(var2, var3, var15, var16, var13.field3404);
               }
            }

            if (var1 == 1) {
               Class28.field248.method2890(var0, var2, var3);
            }

            if (var1 == 2) {
               Class28.field248.method2891(var0, var2, var3);
               var13 = Class110.method2527(var14);
               if (var2 + var13.field3384 > 103 || var3 + var13.field3384 > 103 || var2 + var13.field3385 > 103 || var3 + var13.field3385 > 103) {
                  return;
               }

               if (var13.field3386 != 0) {
                  Client.field642[var0].method3399(var2, var3, var13.field3384, var13.field3385, var16, var13.field3404);
               }
            }

            if (var1 == 3) {
               Class28.field248.method2971(var0, var2, var3);
               var13 = Class110.method2527(var14);
               if (var13.field3386 == 1) {
                  Client.field642[var0].method3401(var2, var3);
               }
            }
         }

         if (var4 >= 0) {
            var12 = var0;
            if (var0 < 3 && (Class50.field443[1][var2][var3] & 2) == 2) {
               var12 = var0 + 1;
            }

            Class262.method4939(var0, var12, var2, var3, var4, var5, var6, Class28.field248, Client.field642[var0]);
         }
      }

   }

   @ObfuscatedName("im")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2129925873"
   )
   static void method3448() {
      for(int var0 = 0; var0 < Client.field771; ++var0) {
         if (Class173.method3470(Client.field720[var0])) {
            if (var0 < Client.field771 - 1) {
               for(int var1 = var0; var1 < Client.field771 - 1; ++var1) {
                  Client.field735[var1] = Client.field735[var1 + 1];
                  Client.field740[var1] = Client.field740[var1 + 1];
                  Client.field720[var1] = Client.field720[var1 + 1];
                  Client.field794[var1] = Client.field794[var1 + 1];
                  Client.field718[var1] = Client.field718[var1 + 1];
                  Client.field851[var1] = Client.field851[var1 + 1];
                  Client.field590[var1] = Client.field590[var1 + 1];
               }
            }

            --var0;
            --Client.field771;
         }
      }

      Class184.method3785(Class135.field1856 / 2 + Class48.field435, Class0.field1);
   }
}
