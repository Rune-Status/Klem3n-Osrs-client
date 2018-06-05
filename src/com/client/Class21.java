package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public final class Class21 {
   @ObfuscatedName("rb")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   public static Class251 field175;
   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static Class249 field179;
   @ObfuscatedName("w")
   final int[] field178 = new int[4096];

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lan;B)V",
      garbageValue = "-31"
   )
   final void method265(Class32 var1) {
      for(int var2 = 0; var2 < 64; ++var2) {
         for(int var3 = 0; var3 < 64; ++var3) {
            this.field178[var2 * 64 + var3] = var1.method547(var2, var3) | -16777216;
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "9"
   )
   final int method272(int var1, int var2) {
      return this.field178[var1 * 64 + var2];
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;III)[Lly;",
      garbageValue = "-711086556"
   )
   static Class317[] method278(Class247 var0, int var1, int var2) {
      return !Class306.method5660(var0, var1, var2) ? null : Class49.method950();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;I)V",
      garbageValue = "1802927852"
   )
   public static void method277(Class247 var0) {
      Class272.field3529 = var0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)Lio;",
      garbageValue = "-116299600"
   )
   public static Class256 method275(int var0) {
      Class256 var1 = (Class256)Class256.field3257.method3989((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Class256.field3258.method4625(19, var0);
         var1 = new Class256();
         if (var2 != null) {
            var1.method4848(new Class182(var2));
         }

         Class256.field3257.method3983(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIILfw;Lfk;B)Z",
      garbageValue = "96"
   )
   static final boolean method273(int var0, int var1, int var2, Class166 var3, Class164 var4) {
      int var5 = var0;
      int var6 = var1;
      byte var7 = 64;
      byte var8 = 64;
      int var9 = var0 - var7;
      int var10 = var1 - var8;
      Class165.field2035[var7][var8] = 99;
      Class165.field2041[var7][var8] = 0;
      byte var11 = 0;
      int var12 = 0;
      Class165.field2039[var11] = var0;
      int var20 = var11 + 1;
      Class165.field2038[var11] = var1;
      int[][] var13 = var4.field2029;

      while(true) {
         label313:
         while(true) {
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            do {
               do {
                  do {
                     label290:
                     do {
                        if (var12 == var20) {
                           Class19.field152 = var5;
                           Class165.field2037 = var6;
                           return false;
                        }

                        var5 = Class165.field2039[var12];
                        var6 = Class165.field2038[var12];
                        var12 = var12 + 1 & 4095;
                        var18 = var5 - var9;
                        var19 = var6 - var10;
                        var14 = var5 - var4.field2025;
                        var15 = var6 - var4.field2026;
                        if (var3.vmethod3440(var2, var5, var6, var4)) {
                           Class19.field152 = var5;
                           Class165.field2037 = var6;
                           return true;
                        }

                        var16 = Class165.field2041[var18][var19] + 1;
                        if (var18 > 0 && Class165.field2035[var18 - 1][var19] == 0 && (var13[var14 - 1][var15] & 19136782) == 0 && (var13[var14 - 1][var15 + var2 - 1] & 19136824) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 Class165.field2039[var20] = var5 - 1;
                                 Class165.field2038[var20] = var6;
                                 var20 = var20 + 1 & 4095;
                                 Class165.field2035[var18 - 1][var19] = 2;
                                 Class165.field2041[var18 - 1][var19] = var16;
                                 break;
                              }

                              if ((var13[var14 - 1][var17 + var15] & 19136830) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var18 < 128 - var2 && Class165.field2035[var18 + 1][var19] == 0 && (var13[var14 + var2][var15] & 19136899) == 0 && (var13[var14 + var2][var15 + var2 - 1] & 19136992) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 Class165.field2039[var20] = var5 + 1;
                                 Class165.field2038[var20] = var6;
                                 var20 = var20 + 1 & 4095;
                                 Class165.field2035[var18 + 1][var19] = 8;
                                 Class165.field2041[var18 + 1][var19] = var16;
                                 break;
                              }

                              if ((var13[var14 + var2][var15 + var17] & 19136995) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var19 > 0 && Class165.field2035[var18][var19 - 1] == 0 && (var13[var14][var15 - 1] & 19136782) == 0 && (var13[var14 + var2 - 1][var15 - 1] & 19136899) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 Class165.field2039[var20] = var5;
                                 Class165.field2038[var20] = var6 - 1;
                                 var20 = var20 + 1 & 4095;
                                 Class165.field2035[var18][var19 - 1] = 1;
                                 Class165.field2041[var18][var19 - 1] = var16;
                                 break;
                              }

                              if ((var13[var14 + var17][var15 - 1] & 19136911) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var19 < 128 - var2 && Class165.field2035[var18][var19 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var14 + var2 - 1][var15 + var2] & 19136992) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 Class165.field2039[var20] = var5;
                                 Class165.field2038[var20] = var6 + 1;
                                 var20 = var20 + 1 & 4095;
                                 Class165.field2035[var18][var19 + 1] = 4;
                                 Class165.field2041[var18][var19 + 1] = var16;
                                 break;
                              }

                              if ((var13[var17 + var14][var15 + var2] & 19137016) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var18 > 0 && var19 > 0 && Class165.field2035[var18 - 1][var19 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 19136782) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2) {
                                 Class165.field2039[var20] = var5 - 1;
                                 Class165.field2038[var20] = var6 - 1;
                                 var20 = var20 + 1 & 4095;
                                 Class165.field2035[var18 - 1][var19 - 1] = 3;
                                 Class165.field2041[var18 - 1][var19 - 1] = var16;
                                 break;
                              }

                              if ((var13[var14 - 1][var17 + (var15 - 1)] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 - 1] & 19136911) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var18 < 128 - var2 && var19 > 0 && Class165.field2035[var18 + 1][var19 - 1] == 0 && (var13[var14 + var2][var15 - 1] & 19136899) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2) {
                                 Class165.field2039[var20] = var5 + 1;
                                 Class165.field2038[var20] = var6 - 1;
                                 var20 = var20 + 1 & 4095;
                                 Class165.field2035[var18 + 1][var19 - 1] = 9;
                                 Class165.field2041[var18 + 1][var19 - 1] = var16;
                                 break;
                              }

                              if ((var13[var14 + var2][var17 + (var15 - 1)] & 19136995) != 0 || (var13[var14 + var17][var15 - 1] & 19136911) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var18 > 0 && var19 < 128 - var2 && Class165.field2035[var18 - 1][var19 + 1] == 0 && (var13[var14 - 1][var15 + var2] & 19136824) == 0) {
                           for(var17 = 1; var17 < var2; ++var17) {
                              if ((var13[var14 - 1][var17 + var15] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 + var2] & 19137016) != 0) {
                                 continue label290;
                              }
                           }

                           Class165.field2039[var20] = var5 - 1;
                           Class165.field2038[var20] = var6 + 1;
                           var20 = var20 + 1 & 4095;
                           Class165.field2035[var18 - 1][var19 + 1] = 6;
                           Class165.field2041[var18 - 1][var19 + 1] = var16;
                        }
                     } while(var18 >= 128 - var2);
                  } while(var19 >= 128 - var2);
               } while(Class165.field2035[var18 + 1][var19 + 1] != 0);
            } while((var13[var14 + var2][var15 + var2] & 19136992) != 0);

            for(var17 = 1; var17 < var2; ++var17) {
               if ((var13[var17 + var14][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var15 + var17] & 19136995) != 0) {
                  continue label313;
               }
            }

            Class165.field2039[var20] = var5 + 1;
            Class165.field2038[var20] = var6 + 1;
            var20 = var20 + 1 & 4095;
            Class165.field2035[var18 + 1][var19 + 1] = 12;
            Class165.field2041[var18 + 1][var19 + 1] = var16;
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lir;Ljava/lang/String;Ljava/lang/String;I)[Lll;",
      garbageValue = "1309811201"
   )
   public static Class318[] method279(Class247 var0, String var1, String var2) {
      int var3 = var0.method4642(var1);
      int var4 = var0.method4643(var3, var2);
      Class318[] var5;
      if (!Class306.method5660(var0, var3, var4)) {
         var5 = null;
      } else {
         Class318[] var7 = new Class318[Class319.field3802];

         for(int var8 = 0; var8 < Class319.field3802; ++var8) {
            Class318 var9 = var7[var8] = new Class318();
            var9.field3796 = Class305.field3729;
            var9.field3792 = Class319.field3798;
            var9.field3793 = Class7.field45[var8];
            var9.field3790 = Class225.field2562[var8];
            var9.field3787 = Class319.field3800[var8];
            var9.field3788 = Class319.field3799[var8];
            int var10 = var9.field3788 * var9.field3787;
            byte[] var11 = Class319.field3801[var8];
            var9.field3791 = new int[var10];

            for(int var12 = 0; var12 < var10; ++var12) {
               var9.field3791[var12] = Class172.field2260[var11[var12] & 255];
            }
         }

         Class7.field45 = null;
         Class225.field2562 = null;
         Class319.field3800 = null;
         Class319.field3799 = null;
         Class172.field2260 = null;
         Class319.field3801 = null;
         var5 = var7;
      }

      return var5;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-1457560196"
   )
   static int method274(int var0, Class84 var1, boolean var2) {
      Class230 var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = Class26.method434(Class69.field999[--Class69.field1003]);
      } else {
         var3 = var2 ? Class276.field3561 : Class260.field3301;
      }

      int var4;
      if (var0 == 1300) {
         var4 = Class69.field999[--Class69.field1003] - 1;
         if (var4 >= 0 && var4 <= 9) {
            var3.method4512(var4, Class69.field1001[--Class55.field497]);
            return 1;
         } else {
            --Class55.field497;
            return 1;
         }
      } else if (var0 == 1301) {
         Class69.field1003 -= 2;
         var4 = Class69.field999[Class69.field1003];
         int var5 = Class69.field999[Class69.field1003 + 1];
         var3.field2666 = Class146.method3191(var4, var5);
         return 1;
      } else if (var0 == 1302) {
         var3.field2634 = Class69.field999[--Class69.field1003] == 1;
         return 1;
      } else if (var0 == 1303) {
         var3.field2682 = Class69.field999[--Class69.field1003];
         return 1;
      } else if (var0 == 1304) {
         var3.field2684 = Class69.field999[--Class69.field1003];
         return 1;
      } else if (var0 == 1305) {
         var3.field2679 = Class69.field1001[--Class55.field497];
         return 1;
      } else if (var0 == 1306) {
         var3.field2661 = Class69.field1001[--Class55.field497];
         return 1;
      } else if (var0 == 1307) {
         var3.field2680 = null;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(IIIIIZI)Lll;",
      garbageValue = "-1686094834"
   )
   public static final Class318 method276(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var1 == -1) {
         var4 = 0;
      } else if (var4 == 2 && var1 != 1) {
         var4 = 1;
      }

      long var6 = ((long)var3 << 42) + ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0;
      Class318 var8;
      if (!var5) {
         var8 = (Class318)Class269.field3429.method3989(var6);
         if (var8 != null) {
            return var8;
         }
      }

      Class269 var9 = Class111.method2563(var0);
      if (var1 > 1 && var9.field3420 != null) {
         int var10 = -1;

         for(int var11 = 0; var11 < 10; ++var11) {
            if (var1 >= var9.field3459[var11] && var9.field3459[var11] != 0) {
               var10 = var9.field3420[var11];
            }
         }

         if (var10 != -1) {
            var9 = Class111.method2563(var10);
         }
      }

      Class119 var21 = var9.method5093(1);
      if (var21 == null) {
         return null;
      } else {
         Class318 var22 = null;
         if (var9.field3465 != -1) {
            var22 = method276(var9.field3464, 10, 1, 0, 0, true);
            if (var22 == null) {
               return null;
            }
         } else if (var9.field3475 != -1) {
            var22 = method276(var9.field3473, var1, var2, var3, 0, false);
            if (var22 == null) {
               return null;
            }
         } else if (var9.field3477 != -1) {
            var22 = method276(var9.field3476, var1, 0, 0, 0, false);
            if (var22 == null) {
               return null;
            }
         }

         int[] var12 = Class314.field3766;
         int var13 = Class314.field3761;
         int var14 = Class314.field3762;
         int[] var15 = new int[4];
         Class314.method5722(var15);
         var8 = new Class318(36, 32);
         Class314.method5718(var8.field3791, 36, 32);
         Class314.method5724();
         Class122.method2862();
         Class122.method2827(16, 16);
         Class122.field1670 = false;
         if (var9.field3477 != -1) {
            var22.method5851(0, 0);
         }

         int var16 = var9.field3438;
         if (var5) {
            var16 = (int)(1.5D * (double)var16);
         } else if (var2 == 2) {
            var16 = (int)((double)var16 * 1.04D);
         }

         int var17 = var16 * Class122.field1681[var9.field3439] >> 16;
         int var18 = var16 * Class122.field1693[var9.field3439] >> 16;
         var21.method2670();
         var21.method2682(0, var9.field3440, var9.field3474, var9.field3439, var9.field3442, var21.field1781 / 2 + var17 + var9.field3443, var18 + var9.field3443);
         if (var9.field3475 != -1) {
            var22.method5851(0, 0);
         }

         if (var2 >= 1) {
            var8.method5847(1);
         }

         if (var2 >= 2) {
            var8.method5847(16777215);
         }

         if (var3 != 0) {
            var8.method5848(var3);
         }

         Class314.method5718(var8.field3791, 36, 32);
         if (var9.field3465 != -1) {
            var22.method5851(0, 0);
         }

         if (var4 == 1 || var4 == 2 && var9.field3444 == 1) {
            Class298 var19 = Class269.field3466;
            String var20;
            if (var1 < 100000) {
               var20 = "<col=ffff00>" + var1 + "</col>";
            } else if (var1 < 10000000) {
               var20 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>";
            } else {
               var20 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>";
            }

            var19.method5522(var20, 0, 9, 16776960, 1);
         }

         if (!var5) {
            Class269.field3429.method3983(var8, var6);
         }

         Class314.method5718(var12, var13, var14);
         Class314.method5723(var15);
         Class122.method2862();
         Class122.field1670 = true;
         return var8;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1994445247"
   )
   static final void method271(String var0) {
      StringBuilder var10000 = (new StringBuilder()).append(var0);
      Object var10001 = null;
      String var1 = var10000.append(" is already on your ignore list").toString();
      Class143.method3172(30, "", var1);
   }

   @ObfuscatedName("jo")
   @ObfuscatedSignature(
      signature = "(Lhi;I)Lhi;",
      garbageValue = "-1594952261"
   )
   static Class230 method264(Class230 var0) {
      Class230 var2 = var0;
      int var3 = Class190.method3865(Class24.method425(var0));
      Class230 var1;
      if (var3 == 0) {
         var1 = null;
      } else {
         int var4 = 0;

         while(true) {
            if (var4 >= var3) {
               var1 = var2;
               break;
            }

            var2 = Class26.method434(var2.field2605);
            if (var2 == null) {
               var1 = null;
               break;
            }

            ++var4;
         }
      }

      Class230 var5 = var1;
      if (var1 == null) {
         var5 = var0.field2666;
      }

      return var5;
   }

   @ObfuscatedName("jy")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1316208853"
   )
   static final void method270(int var0) {
      if (Class261.method4931(var0)) {
         Class245.method4620(Class42.field366[var0], -1);
      }
   }
}
