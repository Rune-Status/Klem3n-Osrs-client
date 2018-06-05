package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
public final class Class62 extends Class204 {
   @ObfuscatedName("er")
   @ObfuscatedSignature(
      signature = "Lfd;"
   )
   static Class157 field869;
   @ObfuscatedName("el")
   @ObfuscatedGetter(
      intValue = 701830261
   )
   static int field868;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1275517341
   )
   int field859;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1431899603
   )
   int field861;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1725586571
   )
   int field856;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 963481089
   )
   int field857;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -773006769
   )
   int field858;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -3180471
   )
   int field865;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -66772787
   )
   int field866;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 920179015
   )
   int field862;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 208398471
   )
   int field863;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 2065155657
   )
   int field864;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -37170881
   )
   int field855 = 0;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1332159199
   )
   int field860 = -1;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Lfn;",
      garbageValue = "2059542848"
   )
   public static Class172 method1536() {
      Class172 var0;
      if (Class172.field2258 == 0) {
         var0 = new Class172();
      } else {
         var0 = Class172.field2256[--Class172.field2258];
      }

      var0.field2254 = null;
      var0.field2253 = 0;
      var0.field2257 = new Class189(5000);
      return var0;
   }

   @ObfuscatedName("ga")
   @ObfuscatedSignature(
      signature = "(IIZI)V",
      garbageValue = "-149430841"
   )
   static final void method1537(int var0, int var1, boolean var2) {
      if (!var2 || var0 != Class27.field224 || Class34.field301 != var1) {
         Class27.field224 = var0;
         Class34.field301 = var1;
         Class48.method947(25);
         Class83.method1933("Loading - please wait.", true);
         int var3 = field868;
         int var4 = Client.field754;
         field868 = (var0 - 6) * 8;
         Client.field754 = (var1 - 6) * 8;
         int var5 = field868 - var3;
         int var6 = Client.field754 - var4;
         var3 = field868;
         var4 = Client.field754;

         int var7;
         int var9;
         for(var7 = 0; var7 < 32768; ++var7) {
            Class72 var8 = Client.field843[var7];
            if (var8 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var8.field922[var9] -= var5;
                  var8.field872[var9] -= var6;
               }

               var8.field931 -= var5 * 128;
               var8.field881 -= var6 * 128;
            }
         }

         for(var7 = 0; var7 < 2048; ++var7) {
            Class60 var21 = Client.field610[var7];
            if (var21 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var21.field922[var9] -= var5;
                  var21.field872[var9] -= var6;
               }

               var21.field931 -= var5 * 128;
               var21.field881 -= var6 * 128;
            }
         }

         byte var20 = 0;
         byte var18 = 104;
         byte var22 = 1;
         if (var5 < 0) {
            var20 = 103;
            var18 = -1;
            var22 = -1;
         }

         byte var10 = 0;
         byte var11 = 104;
         byte var12 = 1;
         if (var6 < 0) {
            var10 = 103;
            var11 = -1;
            var12 = -1;
         }

         int var14;
         for(int var13 = var20; var18 != var13; var13 += var22) {
            for(var14 = var10; var14 != var11; var14 += var12) {
               int var15 = var5 + var13;
               int var16 = var14 + var6;

               for(int var17 = 0; var17 < 4; ++var17) {
                  if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                     Client.field708[var17][var13][var14] = Client.field708[var17][var15][var16];
                  } else {
                     Client.field708[var17][var13][var14] = null;
                  }
               }
            }
         }

         for(Class62 var19 = (Class62)Client.field714.method4098(); var19 != null; var19 = (Class62)Client.field714.method4079()) {
            var19.field857 -= var5;
            var19.field858 -= var6;
            if (var19.field857 < 0 || var19.field858 < 0 || var19.field857 >= 104 || var19.field858 >= 104) {
               var19.method4064();
            }
         }

         if (Client.field808 != 0) {
            Client.field808 -= var5;
            Client.field809 -= var6;
         }

         Client.field656 = 0;
         Client.field822 = false;
         Class109.field1431 -= var5 << 7;
         Class226.field2563 -= var6 << 7;
         Class109.field1428 -= var5 << 7;
         Class2.field23 -= var6 << 7;
         Client.field651 = -1;
         Client.field711.method4072();
         Client.field710.method4072();

         for(var14 = 0; var14 < 4; ++var14) {
            Client.field642[var14].method3392();
         }

      }
   }

   @ObfuscatedName("hm")
   @ObfuscatedSignature(
      signature = "(Lbu;IIBB)V",
      garbageValue = "-55"
   )
   static final void method1538(Class60 var0, int var1, int var2, byte var3) {
      int var4 = var0.field922[0];
      int var5 = var0.field872[0];
      int var6 = var0.method1088();
      if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
         if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
            int var9 = var0.method1088();
            Client.field849.field2043 = var1;
            Client.field849.field2048 = var2;
            Client.field849.field2042 = 1;
            Client.field849.field2045 = 1;
            Class59 var10 = Client.field849;
            int var11 = Class112.method2566(var4, var5, var9, var10, Client.field642[var0.field567], true, Client.field850, Client.field596);
            if (var11 >= 1) {
               for(int var12 = 0; var12 < var11 - 1; ++var12) {
                  var0.method1105(Client.field850[var12], Client.field596[var12], var3);
               }

            }
         }
      }
   }
}
