package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class Class173 {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "1423471307"
   )
   static void method3472(int var0, String var1, String var2, String var3) {
      Class86 var4 = (Class86)Class83.field1180.get(var0);
      if (var4 == null) {
         var4 = new Class86();
         Class83.field1180.put(var0, var4);
      }

      Class58 var5 = var4.method1964(var0, var1, var2, var3);
      Class83.field1181.method3944(var5, (long)var5.field540);
      Class83.field1184.method4155(var5);
      Client.field770 = Client.field801;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "1923178651"
   )
   static int method3469(int var0, Class84 var1, boolean var2) {
      if (var0 == 3300) {
         Class69.field999[++Class69.field1003 - 1] = Client.field591;
         return 1;
      } else {
         int var3;
         int var4;
         if (var0 == 3301) {
            Class69.field1003 -= 2;
            var3 = Class69.field999[Class69.field1003];
            var4 = Class69.field999[Class69.field1003 + 1];
            Class69.field999[++Class69.field1003 - 1] = Class230.method4559(var3, var4);
            return 1;
         } else {
            int[] var5;
            int var6;
            int var7;
            Class53 var8;
            if (var0 == 3302) {
               Class69.field1003 -= 2;
               var3 = Class69.field999[Class69.field1003];
               var4 = Class69.field999[Class69.field1003 + 1];
               var5 = Class69.field999;
               var6 = ++Class69.field1003 - 1;
               var8 = (Class53)Class53.field474.method4020((long)var3);
               if (var8 == null) {
                  var7 = 0;
               } else if (var4 >= 0 && var4 < var8.field473.length) {
                  var7 = var8.field473[var4];
               } else {
                  var7 = 0;
               }

               var5[var6] = var7;
               return 1;
            } else if (var0 == 3303) {
               Class69.field1003 -= 2;
               var3 = Class69.field999[Class69.field1003];
               var4 = Class69.field999[Class69.field1003 + 1];
               Class69.field999[++Class69.field1003 - 1] = Class139.method3143(var3, var4);
               return 1;
            } else if (var0 == 3304) {
               var3 = Class69.field999[--Class69.field1003];
               Class69.field999[++Class69.field1003 - 1] = Class130.method3074(var3).field3227;
               return 1;
            } else if (var0 == 3305) {
               var3 = Class69.field999[--Class69.field1003];
               Class69.field999[++Class69.field1003 - 1] = Client.field712[var3];
               return 1;
            } else if (var0 == 3306) {
               var3 = Class69.field999[--Class69.field1003];
               Class69.field999[++Class69.field1003 - 1] = Client.field713[var3];
               return 1;
            } else if (var0 == 3307) {
               var3 = Class69.field999[--Class69.field1003];
               Class69.field999[++Class69.field1003 - 1] = Client.field640[var3];
               return 1;
            } else {
               int var9;
               if (var0 == 3308) {
                  var3 = Class13.field82;
                  var4 = (Class138.field1876.field931 >> 7) + Class62.field868;
                  var9 = (Class138.field1876.field881 >> 7) + Client.field754;
                  Class69.field999[++Class69.field1003 - 1] = (var4 << 14) + var9 + (var3 << 28);
                  return 1;
               } else if (var0 == 3309) {
                  var3 = Class69.field999[--Class69.field1003];
                  Class69.field999[++Class69.field1003 - 1] = var3 >> 14 & 16383;
                  return 1;
               } else if (var0 == 3310) {
                  var3 = Class69.field999[--Class69.field1003];
                  Class69.field999[++Class69.field1003 - 1] = var3 >> 28;
                  return 1;
               } else if (var0 == 3311) {
                  var3 = Class69.field999[--Class69.field1003];
                  Class69.field999[++Class69.field1003 - 1] = var3 & 16383;
                  return 1;
               } else if (var0 == 3312) {
                  Class69.field999[++Class69.field1003 - 1] = Client.field668 ? 1 : 0;
                  return 1;
               } else if (var0 == 3313) {
                  Class69.field1003 -= 2;
                  var3 = Class69.field999[Class69.field1003] + '耀';
                  var4 = Class69.field999[Class69.field1003 + 1];
                  Class69.field999[++Class69.field1003 - 1] = Class230.method4559(var3, var4);
                  return 1;
               } else if (var0 != 3314) {
                  if (var0 == 3315) {
                     Class69.field1003 -= 2;
                     var3 = Class69.field999[Class69.field1003] + '耀';
                     var4 = Class69.field999[Class69.field1003 + 1];
                     Class69.field999[++Class69.field1003 - 1] = Class139.method3143(var3, var4);
                     return 1;
                  } else if (var0 == 3316) {
                     if (Client.field747 >= 2) {
                        Class69.field999[++Class69.field1003 - 1] = Client.field747;
                     } else {
                        Class69.field999[++Class69.field1003 - 1] = 0;
                     }

                     return 1;
                  } else if (var0 == 3317) {
                     Class69.field999[++Class69.field1003 - 1] = Client.field598;
                     return 1;
                  } else if (var0 == 3318) {
                     Class69.field999[++Class69.field1003 - 1] = Client.field581;
                     return 1;
                  } else if (var0 == 3321) {
                     Class69.field999[++Class69.field1003 - 1] = Client.field745;
                     return 1;
                  } else if (var0 == 3322) {
                     Class69.field999[++Class69.field1003 - 1] = Client.field782;
                     return 1;
                  } else if (var0 == 3323) {
                     if (Client.field776) {
                        Class69.field999[++Class69.field1003 - 1] = 1;
                     } else {
                        Class69.field999[++Class69.field1003 - 1] = 0;
                     }

                     return 1;
                  } else if (var0 == 3324) {
                     Class69.field999[++Class69.field1003 - 1] = Client.field632;
                     return 1;
                  } else if (var0 == 3325) {
                     Class69.field1003 -= 4;
                     var3 = Class69.field999[Class69.field1003];
                     var4 = Class69.field999[Class69.field1003 + 1];
                     var9 = Class69.field999[Class69.field1003 + 2];
                     var6 = Class69.field999[Class69.field1003 + 3];
                     var3 += var4 << 14;
                     var3 += var9 << 28;
                     var3 += var6;
                     Class69.field999[++Class69.field1003 - 1] = var3;
                     return 1;
                  } else {
                     return 2;
                  }
               } else {
                  Class69.field1003 -= 2;
                  var3 = Class69.field999[Class69.field1003] + '耀';
                  var4 = Class69.field999[Class69.field1003 + 1];
                  var5 = Class69.field999;
                  var6 = ++Class69.field1003 - 1;
                  var8 = (Class53)Class53.field474.method4020((long)var3);
                  if (var8 == null) {
                     var7 = 0;
                  } else if (var4 >= 0 && var4 < var8.field473.length) {
                     var7 = var8.field473[var4];
                  } else {
                     var7 = 0;
                  }

                  var5[var6] = var7;
                  return 1;
               }
            }
         }
      }
   }

   @ObfuscatedName("fi")
   @ObfuscatedSignature(
      signature = "(Ljn;IIII)V",
      garbageValue = "1672351117"
   )
   static void method3471(Class273 var0, int var1, int var2, int var3) {
      if (Client.field656 < 50 && Client.field815 != 0) {
         if (var0.field3543 != null && var1 < var0.field3543.length) {
            int var4 = var0.field3543[var1];
            if (var4 != 0) {
               int var5 = var4 >> 8;
               int var6 = var4 >> 4 & 7;
               int var7 = var4 & 15;
               Client.field817[Client.field656] = var5;
               Client.field676[Client.field656] = var6;
               Client.field819[Client.field656] = 0;
               Client.field719[Client.field656] = null;
               int var8 = (var2 - 64) / 128;
               int var9 = (var3 - 64) / 128;
               Client.field820[Client.field656] = var7 + (var9 << 8) + (var8 << 16);
               ++Client.field656;
            }
         }
      }
   }

   @ObfuscatedName("iy")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "1"
   )
   static boolean method3470(int var0) {
      return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30;
   }

   @ObfuscatedName("jq")
   @ObfuscatedSignature(
      signature = "(Lhi;IIIS)V",
      garbageValue = "-9115"
   )
   static final void method3473(Class230 var0, int var1, int var2, int var3) {
      Class54.method1017();
      Class224 var4 = var0.method4517(false);
      if (var4 != null) {
         Class314.method5720(var1, var2, var4.field2553 + var1, var2 + var4.field2549);
         if (Client.field810 != 2 && Client.field810 != 5) {
            int var5 = Client.field717 & 2047;
            int var6 = Class138.field1876.field931 / 32 + 48;
            int var7 = 464 - Class138.field1876.field881 / 32;
            Class72.field1038.method5845(var1, var2, var4.field2553, var4.field2549, var6, var7, var5, 256, var4.field2551, var4.field2550);

            int var8;
            int var9;
            int var10;
            for(var8 = 0; var8 < Client.field724; ++var8) {
               var9 = Client.field805[var8] * 4 + 2 - Class138.field1876.field931 / 32;
               var10 = Client.field806[var8] * 4 + 2 - Class138.field1876.field881 / 32;
               Class55.method1022(var1, var2, var9, var10, Client.field816[var8], var4);
            }

            int var11;
            int var12;
            for(var8 = 0; var8 < 104; ++var8) {
               for(var9 = 0; var9 < 104; ++var9) {
                  Class205 var15 = Client.field708[Class13.field82][var8][var9];
                  if (var15 != null) {
                     var11 = var8 * 4 + 2 - Class138.field1876.field931 / 32;
                     var12 = var9 * 4 + 2 - Class138.field1876.field881 / 32;
                     Class55.method1022(var1, var2, var11, var12, Class36.field314[0], var4);
                  }
               }
            }

            for(var8 = 0; var8 < Client.field622; ++var8) {
               Class72 var16 = Client.field843[Client.field639[var8]];
               if (var16 != null && var16.vmethod1786()) {
                  Class271 var18 = var16.field1037;
                  if (var18 != null && var18.field3516 != null) {
                     var18 = var18.method5189();
                  }

                  if (var18 != null && var18.field3507 && var18.field3504) {
                     var11 = var16.field931 / 32 - Class138.field1876.field931 / 32;
                     var12 = var16.field881 / 32 - Class138.field1876.field881 / 32;
                     Class55.method1022(var1, var2, var11, var12, Class36.field314[1], var4);
                  }
               }
            }

            var8 = Class81.field1167;
            int[] var19 = Class81.field1159;

            for(var10 = 0; var10 < var8; ++var10) {
               Class60 var17 = Client.field610[var19[var10]];
               if (var17 != null && var17.vmethod1786() && !var17.field566 && var17 != Class138.field1876) {
                  var12 = var17.field931 / 32 - Class138.field1876.field931 / 32;
                  int var13 = var17.field881 / 32 - Class138.field1876.field881 / 32;
                  boolean var14 = false;
                  if (Class138.field1876.field568 != 0 && var17.field568 != 0 && var17.field568 == Class138.field1876.field568) {
                     var14 = true;
                  }

                  if (var17.method1083()) {
                     Class55.method1022(var1, var2, var12, var13, Class36.field314[3], var4);
                  } else if (var14) {
                     Class55.method1022(var1, var2, var12, var13, Class36.field314[4], var4);
                  } else if (var17.method1104()) {
                     Class55.method1022(var1, var2, var12, var13, Class36.field314[5], var4);
                  } else {
                     Class55.method1022(var1, var2, var12, var13, Class36.field314[2], var4);
                  }
               }
            }

            if (Client.field599 != 0 && Client.field591 % 20 < 10) {
               if (Client.field599 == 1 && Client.field600 >= 0 && Client.field600 < Client.field843.length) {
                  Class72 var20 = Client.field843[Client.field600];
                  if (var20 != null) {
                     var11 = var20.field931 / 32 - Class138.field1876.field931 / 32;
                     var12 = var20.field881 / 32 - Class138.field1876.field881 / 32;
                     Class121.method2783(var1, var2, var11, var12, Class111.field1446[1], var4);
                  }
               }

               if (Client.field599 == 2) {
                  var10 = Client.field602 * 4 - Class62.field868 * 4 + 2 - Class138.field1876.field931 / 32;
                  var11 = Client.field818 * 4 - Client.field754 * 4 + 2 - Class138.field1876.field881 / 32;
                  Class121.method2783(var1, var2, var10, var11, Class111.field1446[1], var4);
               }

               if (Client.field599 == 10 && Client.field579 >= 0 && Client.field579 < Client.field610.length) {
                  Class60 var21 = Client.field610[Client.field579];
                  if (var21 != null) {
                     var11 = var21.field931 / 32 - Class138.field1876.field931 / 32;
                     var12 = var21.field881 / 32 - Class138.field1876.field881 / 32;
                     Class121.method2783(var1, var2, var11, var12, Class111.field1446[1], var4);
                  }
               }
            }

            if (Client.field808 != 0) {
               var10 = Client.field808 * 4 + 2 - Class138.field1876.field931 / 32;
               var11 = Client.field809 * 4 + 2 - Class138.field1876.field881 / 32;
               Class55.method1022(var1, var2, var10, var11, Class111.field1446[0], var4);
            }

            if (!Class138.field1876.field566) {
               Class314.method5763(var4.field2553 / 2 + var1 - 1, var4.field2549 / 2 + var2 - 1, 3, 3, 16777215);
            }
         } else {
            Class314.method5742(var1, var2, 0, var4.field2551, var4.field2550);
         }

         Client.field788[var3] = true;
      }
   }
}
