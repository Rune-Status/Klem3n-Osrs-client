package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
public class Class102 {
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static Class317 field1352;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 135122197
   )
   int field1346;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 343750491
   )
   int field1350;
   @ObfuscatedName("q")
   int[][] field1351;

   public Class102(int var1, int var2) {
      if (var2 != var1) {
         int var4 = var1;
         int var5 = var2;
         if (var2 > var1) {
            var4 = var2;
            var5 = var1;
         }

         while(var5 != 0) {
            int var6 = var4 % var5;
            var4 = var5;
            var5 = var6;
         }

         var1 /= var4;
         var2 /= var4;
         this.field1346 = var1;
         this.field1350 = var2;
         this.field1351 = new int[var1][14];

         for(int var7 = 0; var7 < var1; ++var7) {
            int[] var8 = this.field1351[var7];
            double var9 = (double)var7 / (double)var1 + 6.0D;
            int var11 = (int)Math.floor(var9 - 7.0D + 1.0D);
            if (var11 < 0) {
               var11 = 0;
            }

            int var12 = (int)Math.ceil(7.0D + var9);
            if (var12 > 14) {
               var12 = 14;
            }

            for(double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
               double var15 = ((double)var11 - var9) * 3.141592653589793D;
               double var17 = var13;
               if (var15 < -1.0E-4D || var15 > 1.0E-4D) {
                  var17 = var13 * (Math.sin(var15) / var15);
               }

               var17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var11 - var9));
               var8[var11] = (int)Math.floor(var17 * 65536.0D + 0.5D);
            }
         }

      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "([BI)[B",
      garbageValue = "160754994"
   )
   byte[] method2239(byte[] var1) {
      if (this.field1351 != null) {
         int var2 = (int)((long)this.field1350 * (long)var1.length / (long)this.field1346) + 14;
         int[] var3 = new int[var2];
         int var4 = 0;
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < var1.length; ++var6) {
            byte var7 = var1[var6];
            int[] var8 = this.field1351[var5];

            int var9;
            for(var9 = 0; var9 < 14; ++var9) {
               var3[var4 + var9] += var7 * var8[var9];
            }

            var5 += this.field1350;
            var9 = var5 / this.field1346;
            var4 += var9;
            var5 -= var9 * this.field1346;
         }

         var1 = new byte[var2];

         for(var6 = 0; var6 < var2; ++var6) {
            int var10 = var3[var6] + '耀' >> 16;
            if (var10 < -128) {
               var1[var6] = -128;
            } else if (var10 > 127) {
               var1[var6] = 127;
            } else {
               var1[var6] = (byte)var10;
            }
         }
      }

      return var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "715273606"
   )
   int method2240(int var1) {
      if (this.field1351 != null) {
         var1 = (int)((long)var1 * (long)this.field1350 / (long)this.field1346);
      }

      return var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "149890453"
   )
   int method2241(int var1) {
      if (this.field1351 != null) {
         var1 = (int)((long)this.field1350 * (long)var1 / (long)this.field1346) + 6;
      }

      return var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;B)Z",
      garbageValue = "1"
   )
   public static boolean method2249(CharSequence var0) {
      boolean var2 = false;
      boolean var3 = false;
      int var4 = 0;
      int var5 = var0.length();
      int var6 = 0;

      boolean var1;
      while(true) {
         if (var6 >= var5) {
            var1 = var3;
            break;
         }

         label86: {
            char var7 = var0.charAt(var6);
            if (var6 == 0) {
               if (var7 == '-') {
                  var2 = true;
                  break label86;
               }

               if (var7 == '+') {
                  break label86;
               }
            }

            int var9;
            if (var7 >= '0' && var7 <= '9') {
               var9 = var7 - 48;
            } else if (var7 >= 'A' && var7 <= 'Z') {
               var9 = var7 - 55;
            } else {
               if (var7 < 'a' || var7 > 'z') {
                  var1 = false;
                  break;
               }

               var9 = var7 - 87;
            }

            if (var9 >= 10) {
               var1 = false;
               break;
            }

            if (var2) {
               var9 = -var9;
            }

            int var8 = var4 * 10 + var9;
            if (var4 != var8 / 10) {
               var1 = false;
               break;
            }

            var4 = var8;
            var3 = true;
         }

         ++var6;
      }

      return var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-879743478"
   )
   static int method2238(int var0, Class84 var1, boolean var2) {
      int var4 = -1;
      Class230 var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = Class69.field999[--Class69.field1003];
         var3 = Class26.method434(var4);
      } else {
         var3 = var2 ? Class276.field3561 : Class260.field3301;
      }

      if (var0 == 1100) {
         Class69.field1003 -= 2;
         var3.field2626 = Class69.field999[Class69.field1003];
         if (var3.field2626 > var3.field2628 - var3.field2675) {
            var3.field2626 = var3.field2628 - var3.field2675;
         }

         if (var3.field2626 < 0) {
            var3.field2626 = 0;
         }

         var3.field2663 = Class69.field999[Class69.field1003 + 1];
         if (var3.field2663 > var3.field2629 - var3.field2621) {
            var3.field2663 = var3.field2629 - var3.field2621;
         }

         if (var3.field2663 < 0) {
            var3.field2663 = 0;
         }

         Class60.method1114(var3);
         return 1;
      } else if (var0 == 1101) {
         var3.field2630 = Class69.field999[--Class69.field1003];
         Class60.method1114(var3);
         return 1;
      } else if (var0 == 1102) {
         var3.field2710 = Class69.field999[--Class69.field1003] == 1;
         Class60.method1114(var3);
         return 1;
      } else if (var0 == 1103) {
         var3.field2636 = Class69.field999[--Class69.field1003];
         Class60.method1114(var3);
         return 1;
      } else if (var0 == 1104) {
         var3.field2638 = Class69.field999[--Class69.field1003];
         Class60.method1114(var3);
         return 1;
      } else if (var0 == 1105) {
         var3.field2640 = Class69.field999[--Class69.field1003];
         Class60.method1114(var3);
         return 1;
      } else if (var0 == 1106) {
         var3.field2596 = Class69.field999[--Class69.field1003];
         Class60.method1114(var3);
         return 1;
      } else if (var0 == 1107) {
         var3.field2643 = Class69.field999[--Class69.field1003] == 1;
         Class60.method1114(var3);
         return 1;
      } else if (var0 == 1108) {
         var3.field2665 = 1;
         var3.field2593 = Class69.field999[--Class69.field1003];
         Class60.method1114(var3);
         return 1;
      } else if (var0 == 1109) {
         Class69.field1003 -= 6;
         var3.field2592 = Class69.field999[Class69.field1003];
         var3.field2655 = Class69.field999[Class69.field1003 + 1];
         var3.field2656 = Class69.field999[Class69.field1003 + 2];
         var3.field2657 = Class69.field999[Class69.field1003 + 3];
         var3.field2658 = Class69.field999[Class69.field1003 + 4];
         var3.field2704 = Class69.field999[Class69.field1003 + 5];
         Class60.method1114(var3);
         return 1;
      } else {
         int var8;
         if (var0 == 1110) {
            var8 = Class69.field999[--Class69.field1003];
            if (var8 != var3.field2595) {
               var3.field2595 = var8;
               var3.field2728 = 0;
               var3.field2613 = 0;
               Class60.method1114(var3);
            }

            return 1;
         } else if (var0 == 1111) {
            var3.field2662 = Class69.field999[--Class69.field1003] == 1;
            Class60.method1114(var3);
            return 1;
         } else if (var0 == 1112) {
            String var7 = Class69.field1001[--Class55.field497];
            if (!var7.equals(var3.field2667)) {
               var3.field2667 = var7;
               Class60.method1114(var3);
            }

            return 1;
         } else if (var0 == 1113) {
            var3.field2739 = Class69.field999[--Class69.field1003];
            Class60.method1114(var3);
            return 1;
         } else if (var0 == 1114) {
            Class69.field1003 -= 3;
            var3.field2669 = Class69.field999[Class69.field1003];
            var3.field2681 = Class69.field999[Class69.field1003 + 1];
            var3.field2668 = Class69.field999[Class69.field1003 + 2];
            Class60.method1114(var3);
            return 1;
         } else if (var0 == 1115) {
            var3.field2671 = Class69.field999[--Class69.field1003] == 1;
            Class60.method1114(var3);
            return 1;
         } else if (var0 == 1116) {
            var3.field2644 = Class69.field999[--Class69.field1003];
            Class60.method1114(var3);
            return 1;
         } else if (var0 == 1117) {
            var3.field2645 = Class69.field999[--Class69.field1003];
            Class60.method1114(var3);
            return 1;
         } else if (var0 == 1118) {
            var3.field2646 = Class69.field999[--Class69.field1003] == 1;
            Class60.method1114(var3);
            return 1;
         } else if (var0 == 1119) {
            var3.field2647 = Class69.field999[--Class69.field1003] == 1;
            Class60.method1114(var3);
            return 1;
         } else if (var0 == 1120) {
            Class69.field1003 -= 2;
            var3.field2628 = Class69.field999[Class69.field1003];
            var3.field2629 = Class69.field999[Class69.field1003 + 1];
            Class60.method1114(var3);
            if (var4 != -1 && var3.field2721 == 0) {
               Class163.method3388(Class42.field366[var4 >> 16], var3, false);
            }

            return 1;
         } else if (var0 == 1121) {
            Class82.method1921(var3.field2691, var3.field2606);
            Client.field744 = var3;
            Class60.method1114(var3);
            return 1;
         } else if (var0 == 1122) {
            var3.field2641 = Class69.field999[--Class69.field1003];
            Class60.method1114(var3);
            return 1;
         } else if (var0 == 1123) {
            var3.field2631 = Class69.field999[--Class69.field1003];
            Class60.method1114(var3);
            return 1;
         } else if (var0 == 1124) {
            var3.field2608 = Class69.field999[--Class69.field1003];
            Class60.method1114(var3);
            return 1;
         } else if (var0 == 1125) {
            var8 = Class69.field999[--Class69.field1003];
            Class316 var6 = (Class316)Class76.method1803(Class23.method423(), var8);
            if (var6 != null) {
               var3.field2701 = var6;
               Class60.method1114(var3);
            }

            return 1;
         } else {
            boolean var5;
            if (var0 == 1126) {
               var5 = Class69.field999[--Class69.field1003] == 1;
               var3.field2639 = var5;
               return 1;
            } else if (var0 == 1127) {
               var5 = Class69.field999[--Class69.field1003] == 1;
               var3.field2726 = var5;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "158001383"
   )
   static final int method2248(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }
}
