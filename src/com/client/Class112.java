package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
public final class Class112 {
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "Liw;"
   )
   static Class244 field1455;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Ldf;"
   )
   Class127 field1447;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1713209305
   )
   int field1450;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -487172753
   )
   int field1448;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -629897321
   )
   int field1449;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Ldf;"
   )
   Class127 field1451;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Ldf;"
   )
   Class127 field1452;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      longValue = -7021382517737045299L
   )
   long field1456;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -766143801
   )
   int field1454;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIILfw;Lfk;Z[I[II)I",
      garbageValue = "190310969"
   )
   public static int method2566(int var0, int var1, int var2, Class166 var3, Class164 var4, boolean var5, int[] var6, int[] var7) {
      int var9;
      for(int var8 = 0; var8 < 128; ++var8) {
         for(var9 = 0; var9 < 128; ++var9) {
            Class165.field2035[var8][var9] = 0;
            Class165.field2041[var8][var9] = 99999999;
         }
      }

      int var10;
      int var11;
      byte var13;
      int var14;
      int var15;
      int var17;
      int var19;
      int var20;
      int var21;
      boolean var28;
      int var30;
      int var31;
      int var33;
      if (var2 == 1) {
         var10 = var0;
         var11 = var1;
         byte var12 = 64;
         var13 = 64;
         var14 = var0 - var12;
         var15 = var1 - var13;
         Class165.field2035[var12][var13] = 99;
         Class165.field2041[var12][var13] = 0;
         byte var16 = 0;
         var17 = 0;
         Class165.field2039[var16] = var0;
         var33 = var16 + 1;
         Class165.field2038[var16] = var1;
         int[][] var18 = var4.field2029;

         boolean var29;
         while(true) {
            if (var33 == var17) {
               Class19.field152 = var10;
               Class165.field2037 = var11;
               var29 = false;
               break;
            }

            var10 = Class165.field2039[var17];
            var11 = Class165.field2038[var17];
            var17 = var17 + 1 & 4095;
            var30 = var10 - var14;
            var31 = var11 - var15;
            var19 = var10 - var4.field2025;
            var20 = var11 - var4.field2026;
            if (var3.vmethod3440(1, var10, var11, var4)) {
               Class19.field152 = var10;
               Class165.field2037 = var11;
               var29 = true;
               break;
            }

            var21 = Class165.field2041[var30][var31] + 1;
            if (var30 > 0 && Class165.field2035[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136776) == 0) {
               Class165.field2039[var33] = var10 - 1;
               Class165.field2038[var33] = var11;
               var33 = var33 + 1 & 4095;
               Class165.field2035[var30 - 1][var31] = 2;
               Class165.field2041[var30 - 1][var31] = var21;
            }

            if (var30 < 127 && Class165.field2035[var30 + 1][var31] == 0 && (var18[var19 + 1][var20] & 19136896) == 0) {
               Class165.field2039[var33] = var10 + 1;
               Class165.field2038[var33] = var11;
               var33 = var33 + 1 & 4095;
               Class165.field2035[var30 + 1][var31] = 8;
               Class165.field2041[var30 + 1][var31] = var21;
            }

            if (var31 > 0 && Class165.field2035[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
               Class165.field2039[var33] = var10;
               Class165.field2038[var33] = var11 - 1;
               var33 = var33 + 1 & 4095;
               Class165.field2035[var30][var31 - 1] = 1;
               Class165.field2041[var30][var31 - 1] = var21;
            }

            if (var31 < 127 && Class165.field2035[var30][var31 + 1] == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
               Class165.field2039[var33] = var10;
               Class165.field2038[var33] = var11 + 1;
               var33 = var33 + 1 & 4095;
               Class165.field2035[var30][var31 + 1] = 4;
               Class165.field2041[var30][var31 + 1] = var21;
            }

            if (var30 > 0 && var31 > 0 && Class165.field2035[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
               Class165.field2039[var33] = var10 - 1;
               Class165.field2038[var33] = var11 - 1;
               var33 = var33 + 1 & 4095;
               Class165.field2035[var30 - 1][var31 - 1] = 3;
               Class165.field2041[var30 - 1][var31 - 1] = var21;
            }

            if (var30 < 127 && var31 > 0 && Class165.field2035[var30 + 1][var31 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
               Class165.field2039[var33] = var10 + 1;
               Class165.field2038[var33] = var11 - 1;
               var33 = var33 + 1 & 4095;
               Class165.field2035[var30 + 1][var31 - 1] = 9;
               Class165.field2041[var30 + 1][var31 - 1] = var21;
            }

            if (var30 > 0 && var31 < 127 && Class165.field2035[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
               Class165.field2039[var33] = var10 - 1;
               Class165.field2038[var33] = var11 + 1;
               var33 = var33 + 1 & 4095;
               Class165.field2035[var30 - 1][var31 + 1] = 6;
               Class165.field2041[var30 - 1][var31 + 1] = var21;
            }

            if (var30 < 127 && var31 < 127 && Class165.field2035[var30 + 1][var31 + 1] == 0 && (var18[var19 + 1][var20 + 1] & 19136992) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
               Class165.field2039[var33] = var10 + 1;
               Class165.field2038[var33] = var11 + 1;
               var33 = var33 + 1 & 4095;
               Class165.field2035[var30 + 1][var31 + 1] = 12;
               Class165.field2041[var30 + 1][var31 + 1] = var21;
            }
         }

         var28 = var29;
      } else if (var2 == 2) {
         var28 = Class40.method693(var0, var1, var3, var4);
      } else {
         var28 = Class21.method273(var0, var1, var2, var3, var4);
      }

      var9 = var0 - 64;
      var10 = var1 - 64;
      var11 = Class19.field152;
      var30 = Class165.field2037;
      if (!var28) {
         var31 = Integer.MAX_VALUE;
         var14 = Integer.MAX_VALUE;
         byte var32 = 10;
         var33 = var3.field2043;
         var17 = var3.field2048;
         int var27 = var3.field2042;
         var19 = var3.field2045;

         for(var20 = var33 - var32; var20 <= var32 + var33; ++var20) {
            for(var21 = var17 - var32; var21 <= var32 + var17; ++var21) {
               int var22 = var20 - var9;
               int var23 = var21 - var10;
               if (var22 >= 0 && var23 >= 0 && var22 < 128 && var23 < 128 && Class165.field2041[var22][var23] < 100) {
                  int var24 = 0;
                  if (var20 < var33) {
                     var24 = var33 - var20;
                  } else if (var20 > var27 + var33 - 1) {
                     var24 = var20 - (var27 + var33 - 1);
                  }

                  int var25 = 0;
                  if (var21 < var17) {
                     var25 = var17 - var21;
                  } else if (var21 > var17 + var19 - 1) {
                     var25 = var21 - (var17 + var19 - 1);
                  }

                  int var26 = var24 * var24 + var25 * var25;
                  if (var26 < var31 || var31 == var26 && Class165.field2041[var22][var23] < var14) {
                     var31 = var26;
                     var14 = Class165.field2041[var22][var23];
                     var11 = var20;
                     var30 = var21;
                  }
               }
            }
         }

         if (var31 == Integer.MAX_VALUE) {
            return -1;
         }
      }

      if (var0 == var11 && var30 == var1) {
         return 0;
      } else {
         var13 = 0;
         Class165.field2039[var13] = var11;
         var31 = var13 + 1;
         Class165.field2038[var13] = var30;

         for(var14 = var15 = Class165.field2035[var11 - var9][var30 - var10]; var0 != var11 || var30 != var1; var14 = Class165.field2035[var11 - var9][var30 - var10]) {
            if (var15 != var14) {
               var15 = var14;
               Class165.field2039[var31] = var11;
               Class165.field2038[var31++] = var30;
            }

            if ((var14 & 2) != 0) {
               ++var11;
            } else if ((var14 & 8) != 0) {
               --var11;
            }

            if ((var14 & 1) != 0) {
               ++var30;
            } else if ((var14 & 4) != 0) {
               --var30;
            }
         }

         var33 = 0;

         while(var31-- > 0) {
            var6[var33] = Class165.field2039[var31];
            var7[var33++] = Class165.field2038[var31];
            if (var33 >= var6.length) {
               break;
            }
         }

         return var33;
      }
   }

   @ObfuscatedName("hd")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "464504900"
   )
   static final void method2564(int var0) {
      if (var0 >= 0) {
         int var1 = Client.field718[var0];
         int var2 = Client.field851[var0];
         int var3 = Client.field720[var0];
         int var4 = Client.field794[var0];
         String var5 = Client.field735[var0];
         String var6 = Client.field740[var0];
         Class39.method692(var1, var2, var3, var4, var5, var6, Class48.field432, Class48.field428);
      }
   }

   @ObfuscatedName("jz")
   @ObfuscatedSignature(
      signature = "(Lhi;II)Ljava/lang/String;",
      garbageValue = "878774611"
   )
   static String method2565(Class230 var0, int var1) {
      if (!Class97.method2214(Class24.method425(var0), var1) && var0.field2706 == null) {
         return null;
      } else {
         return var0.field2680 != null && var0.field2680.length > var1 && var0.field2680[var1] != null && var0.field2680[var1].trim().length() != 0 ? var0.field2680[var1] : null;
      }
   }
}
