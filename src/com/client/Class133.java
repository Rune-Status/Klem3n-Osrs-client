package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public final class Class133 {
   @ObfuscatedName("pv")
   @ObfuscatedGetter(
      intValue = -470021269
   )
   static int field1834;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 855735479
   )
   int field1826;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -2145900331
   )
   int field1832;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -568631363
   )
   int field1828;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -970601677
   )
   int field1825;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 409489705
   )
   int field1827;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -995153033
   )
   int field1830;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1452216279
   )
   int field1829;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Ldf;"
   )
   public Class127 field1823;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Ldf;"
   )
   public Class127 field1831;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      longValue = -9170110495421091263L
   )
   public long field1824 = 0L;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1910323591
   )
   int field1833 = 0;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)Lce;",
      garbageValue = "-1297454162"
   )
   static Class84 method3099(int var0) {
      Class84 var1 = (Class84)Class84.field1190.method3989((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Client.field854.method4625(var0, 0);
         if (var2 == null) {
            return null;
         } else {
            var1 = Class10.method97(var2);
            Class84.field1190.method3983(var1, (long)var0);
            return var1;
         }
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/String;[SB)V",
      garbageValue = "4"
   )
   public static void method3100(String[] var0, short[] var1) {
      method3101(var0, var1, 0, var0.length - 1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/String;[SIII)V",
      garbageValue = "-659552878"
   )
   static void method3101(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         method3101(var0, var1, var2, var5 - 1);
         method3101(var0, var1, var5 + 1, var3);
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "30"
   )
   static final void method3098() {
      short var0 = 256;
      int var1;
      if (Class78.field1088 > 0) {
         for(var1 = 0; var1 < 256; ++var1) {
            if (Class78.field1088 > 768) {
               Class77.field1077[var1] = Class33.method558(Class64.field936[var1], Class185.field2364[var1], 1024 - Class78.field1088);
            } else if (Class78.field1088 > 256) {
               Class77.field1077[var1] = Class185.field2364[var1];
            } else {
               Class77.field1077[var1] = Class33.method558(Class185.field2364[var1], Class64.field936[var1], 256 - Class78.field1088);
            }
         }
      } else if (Class78.field1094 > 0) {
         for(var1 = 0; var1 < 256; ++var1) {
            if (Class78.field1094 > 768) {
               Class77.field1077[var1] = Class33.method558(Class64.field936[var1], Class11.field69[var1], 1024 - Class78.field1094);
            } else if (Class78.field1094 > 256) {
               Class77.field1077[var1] = Class11.field69[var1];
            } else {
               Class77.field1077[var1] = Class33.method558(Class11.field69[var1], Class64.field936[var1], 256 - Class78.field1094);
            }
         }
      } else {
         for(var1 = 0; var1 < 256; ++var1) {
            Class77.field1077[var1] = Class64.field936[var1];
         }
      }

      Class314.method5720(Class78.field1082, 9, Class78.field1082 + 128, var0 + 7);
      Class78.field1092.method5849(Class78.field1082, 0);
      Class314.method5719();
      var1 = 0;
      int var2 = Class163.field2014.field3767 * 9 + Class78.field1082;

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      for(var3 = 1; var3 < var0 - 1; ++var3) {
         var4 = Class78.field1093[var3] * (var0 - var3) / var0;
         var5 = var4 + 22;
         if (var5 < 0) {
            var5 = 0;
         }

         var1 += var5;

         for(var6 = var5; var6 < 128; ++var6) {
            var7 = Class40.field357[var1++];
            if (var7 != 0) {
               var8 = var7;
               var9 = 256 - var7;
               var7 = Class77.field1077[var7];
               var10 = Class163.field2014.field3768[var2];
               Class163.field2014.field3768[var2++] = ((var7 & 16711935) * var8 + (var10 & 16711935) * var9 & -16711936) + (var8 * (var7 & '\uff00') + var9 * (var10 & '\uff00') & 16711680) >> 8;
            } else {
               ++var2;
            }
         }

         var2 += var5 + Class163.field2014.field3767 - 128;
      }

      Class314.method5720(Class78.field1082 + 765 - 128, 9, Class78.field1082 + 765, var0 + 7);
      Class78.field1087.method5849(Class78.field1082 + 382, 0);
      Class314.method5719();
      var1 = 0;
      var2 = Class163.field2014.field3767 * 9 + Class78.field1082 + 637 + 24;

      for(var3 = 1; var3 < var0 - 1; ++var3) {
         var4 = Class78.field1093[var3] * (var0 - var3) / var0;
         var5 = 103 - var4;
         var2 += var4;

         for(var6 = 0; var6 < var5; ++var6) {
            var7 = Class40.field357[var1++];
            if (var7 != 0) {
               var8 = var7;
               var9 = 256 - var7;
               var7 = Class77.field1077[var7];
               var10 = Class163.field2014.field3768[var2];
               Class163.field2014.field3768[var2++] = ((var7 & 16711935) * var8 + (var10 & 16711935) * var9 & -16711936) + (var9 * (var10 & '\uff00') + var8 * (var7 & '\uff00') & 16711680) >> 8;
            } else {
               ++var2;
            }
         }

         var1 += 128 - var5;
         var2 += Class163.field2014.field3767 - var5 - var4;
      }

   }
}
