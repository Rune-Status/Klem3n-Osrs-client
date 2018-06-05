package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class Class171 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final Class171 field2249 = new Class171(5);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final Class171 field2242 = new Class171(3);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final Class171 field2244 = new Class171(7);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final Class171 field2243 = new Class171(4);
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final Class171 field2245 = new Class171(14);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final Class171 field2246 = new Class171(15);
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final Class171 field2241 = new Class171(6);
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final Class171 field2248 = new Class171(4);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final Class171 field2247 = new Class171(2);
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   public static final Class171 field2250 = new Class171(5);
   @ObfuscatedName("fr")
   static byte[][] field2252;

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "5"
   )
   Class171(int var1) {
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(IIIIIILdm;Lfk;I)V",
      garbageValue = "1712806345"
   )
   static final void method3450(int var0, int var1, int var2, int var3, int var4, int var5, Class125 var6, Class164 var7) {
      if (!Client.field585 || (Class50.field443[0][var1][var2] & 2) != 0 || (Class50.field443[var0][var1][var2] & 16) == 0) {
         if (var0 < Class50.field442) {
            Class50.field442 = var0;
         }

         Class268 var8 = Class110.method2527(var3);
         int var9;
         int var10;
         if (var4 != 1 && var4 != 3) {
            var9 = var8.field3384;
            var10 = var8.field3385;
         } else {
            var9 = var8.field3385;
            var10 = var8.field3384;
         }

         int var11;
         int var12;
         if (var9 + var1 <= 104) {
            var11 = (var9 >> 1) + var1;
            var12 = (var9 + 1 >> 1) + var1;
         } else {
            var11 = var1;
            var12 = var1 + 1;
         }

         int var13;
         int var14;
         if (var10 + var2 <= 104) {
            var13 = (var10 >> 1) + var2;
            var14 = var2 + (var10 + 1 >> 1);
         } else {
            var13 = var2;
            var14 = var2 + 1;
         }

         int[][] var15 = Class50.field459[var0];
         int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
         int var17 = (var1 << 7) + (var9 << 6);
         int var18 = (var2 << 7) + (var10 << 6);
         long var19 = Class76.method1804(var1, var2, 2, var8.field3388 == 0, var3);
         int var21 = var5 + (var4 << 6);
         if (var8.field3409 == 1) {
            var21 += 256;
         }

         if (var8.method5024()) {
            Class181.method3528(var0, var1, var2, var8, var4);
         }

         Object var22;
         if (var5 == 22) {
            if (!Client.field585 || var8.field3388 != 0 || var8.field3386 == 1 || var8.field3407) {
               if (var8.field3372 == -1 && var8.field3410 == null) {
                  var22 = var8.method5079(22, var4, var15, var17, var16, var18);
               } else {
                  var22 = new Class85(var3, 22, var4, var0, var1, var2, var8.field3372, true, (Class127)null);
               }

               var6.method3009(var0, var1, var2, var16, (Class127)var22, var19, var21);
               if (var8.field3386 == 1 && var7 != null) {
                  var7.method3410(var1, var2);
               }

            }
         } else {
            int var23;
            if (var5 != 10 && var5 != 11) {
               if (var5 >= 12) {
                  if (var8.field3372 == -1 && var8.field3410 == null) {
                     var22 = var8.method5079(var5, var4, var15, var17, var16, var18);
                  } else {
                     var22 = new Class85(var3, var5, var4, var0, var1, var2, var8.field3372, true, (Class127)null);
                  }

                  var6.method2882(var0, var1, var2, var16, 1, 1, (Class127)var22, 0, var19, var21);
                  if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                     Class37.field325[var0][var1][var2] |= 2340;
                  }

                  if (var8.field3386 != 0 && var7 != null) {
                     var7.method3394(var1, var2, var9, var10, var8.field3404);
                  }

               } else if (var5 == 0) {
                  if (var8.field3372 == -1 && var8.field3410 == null) {
                     var22 = var8.method5079(0, var4, var15, var17, var16, var18);
                  } else {
                     var22 = new Class85(var3, 0, var4, var0, var1, var2, var8.field3372, true, (Class127)null);
                  }

                  var6.method2927(var0, var1, var2, var16, (Class127)var22, (Class127)null, Class50.field450[var4], 0, var19, var21);
                  if (var4 == 0) {
                     if (var8.field3400) {
                        Class50.field447[var0][var1][var2] = 50;
                        Class50.field447[var0][var1][var2 + 1] = 50;
                     }

                     if (var8.field3383) {
                        Class37.field325[var0][var1][var2] |= 585;
                     }
                  } else if (var4 == 1) {
                     if (var8.field3400) {
                        Class50.field447[var0][var1][var2 + 1] = 50;
                        Class50.field447[var0][var1 + 1][var2 + 1] = 50;
                     }

                     if (var8.field3383) {
                        Class37.field325[var0][var1][var2 + 1] |= 1170;
                     }
                  } else if (var4 == 2) {
                     if (var8.field3400) {
                        Class50.field447[var0][var1 + 1][var2] = 50;
                        Class50.field447[var0][var1 + 1][var2 + 1] = 50;
                     }

                     if (var8.field3383) {
                        Class37.field325[var0][var1 + 1][var2] |= 585;
                     }
                  } else if (var4 == 3) {
                     if (var8.field3400) {
                        Class50.field447[var0][var1][var2] = 50;
                        Class50.field447[var0][var1 + 1][var2] = 50;
                     }

                     if (var8.field3383) {
                        Class37.field325[var0][var1][var2] |= 1170;
                     }
                  }

                  if (var8.field3386 != 0 && var7 != null) {
                     var7.method3393(var1, var2, var5, var4, var8.field3404);
                  }

                  if (var8.field3379 != 16) {
                     var6.method3053(var0, var1, var2, var8.field3379);
                  }

               } else if (var5 == 1) {
                  if (var8.field3372 == -1 && var8.field3410 == null) {
                     var22 = var8.method5079(1, var4, var15, var17, var16, var18);
                  } else {
                     var22 = new Class85(var3, 1, var4, var0, var1, var2, var8.field3372, true, (Class127)null);
                  }

                  var6.method2927(var0, var1, var2, var16, (Class127)var22, (Class127)null, Class50.field451[var4], 0, var19, var21);
                  if (var8.field3400) {
                     if (var4 == 0) {
                        Class50.field447[var0][var1][var2 + 1] = 50;
                     } else if (var4 == 1) {
                        Class50.field447[var0][var1 + 1][var2 + 1] = 50;
                     } else if (var4 == 2) {
                        Class50.field447[var0][var1 + 1][var2] = 50;
                     } else if (var4 == 3) {
                        Class50.field447[var0][var1][var2] = 50;
                     }
                  }

                  if (var8.field3386 != 0 && var7 != null) {
                     var7.method3393(var1, var2, var5, var4, var8.field3404);
                  }

               } else {
                  int var28;
                  if (var5 == 2) {
                     var28 = var4 + 1 & 3;
                     Object var29;
                     Object var30;
                     if (var8.field3372 == -1 && var8.field3410 == null) {
                        var29 = var8.method5079(2, var4 + 4, var15, var17, var16, var18);
                        var30 = var8.method5079(2, var28, var15, var17, var16, var18);
                     } else {
                        var29 = new Class85(var3, 2, var4 + 4, var0, var1, var2, var8.field3372, true, (Class127)null);
                        var30 = new Class85(var3, 2, var28, var0, var1, var2, var8.field3372, true, (Class127)null);
                     }

                     var6.method2927(var0, var1, var2, var16, (Class127)var29, (Class127)var30, Class50.field450[var4], Class50.field450[var28], var19, var21);
                     if (var8.field3383) {
                        if (var4 == 0) {
                           Class37.field325[var0][var1][var2] |= 585;
                           Class37.field325[var0][var1][1 + var2] |= 1170;
                        } else if (var4 == 1) {
                           Class37.field325[var0][var1][1 + var2] |= 1170;
                           Class37.field325[var0][var1 + 1][var2] |= 585;
                        } else if (var4 == 2) {
                           Class37.field325[var0][var1 + 1][var2] |= 585;
                           Class37.field325[var0][var1][var2] |= 1170;
                        } else if (var4 == 3) {
                           Class37.field325[var0][var1][var2] |= 1170;
                           Class37.field325[var0][var1][var2] |= 585;
                        }
                     }

                     if (var8.field3386 != 0 && var7 != null) {
                        var7.method3393(var1, var2, var5, var4, var8.field3404);
                     }

                     if (var8.field3379 != 16) {
                        var6.method3053(var0, var1, var2, var8.field3379);
                     }

                  } else if (var5 == 3) {
                     if (var8.field3372 == -1 && var8.field3410 == null) {
                        var22 = var8.method5079(3, var4, var15, var17, var16, var18);
                     } else {
                        var22 = new Class85(var3, 3, var4, var0, var1, var2, var8.field3372, true, (Class127)null);
                     }

                     var6.method2927(var0, var1, var2, var16, (Class127)var22, (Class127)null, Class50.field451[var4], 0, var19, var21);
                     if (var8.field3400) {
                        if (var4 == 0) {
                           Class50.field447[var0][var1][var2 + 1] = 50;
                        } else if (var4 == 1) {
                           Class50.field447[var0][var1 + 1][var2 + 1] = 50;
                        } else if (var4 == 2) {
                           Class50.field447[var0][var1 + 1][var2] = 50;
                        } else if (var4 == 3) {
                           Class50.field447[var0][var1][var2] = 50;
                        }
                     }

                     if (var8.field3386 != 0 && var7 != null) {
                        var7.method3393(var1, var2, var5, var4, var8.field3404);
                     }

                  } else if (var5 == 9) {
                     if (var8.field3372 == -1 && var8.field3410 == null) {
                        var22 = var8.method5079(var5, var4, var15, var17, var16, var18);
                     } else {
                        var22 = new Class85(var3, var5, var4, var0, var1, var2, var8.field3372, true, (Class127)null);
                     }

                     var6.method2882(var0, var1, var2, var16, 1, 1, (Class127)var22, 0, var19, var21);
                     if (var8.field3386 != 0 && var7 != null) {
                        var7.method3394(var1, var2, var9, var10, var8.field3404);
                     }

                     if (var8.field3379 != 16) {
                        var6.method3053(var0, var1, var2, var8.field3379);
                     }

                  } else if (var5 == 4) {
                     if (var8.field3372 == -1 && var8.field3410 == null) {
                        var22 = var8.method5079(4, var4, var15, var17, var16, var18);
                     } else {
                        var22 = new Class85(var3, 4, var4, var0, var1, var2, var8.field3372, true, (Class127)null);
                     }

                     var6.method2881(var0, var1, var2, var16, (Class127)var22, (Class127)null, Class50.field450[var4], 0, 0, 0, var19, var21);
                  } else {
                     long var31;
                     Object var33;
                     if (var5 == 5) {
                        var28 = 16;
                        var31 = var6.method2898(var0, var1, var2);
                        if (var31 != 0L) {
                           var28 = Class110.method2527(Class39.method673(var31)).field3379;
                        }

                        if (var8.field3372 == -1 && var8.field3410 == null) {
                           var33 = var8.method5079(4, var4, var15, var17, var16, var18);
                        } else {
                           var33 = new Class85(var3, 4, var4, var0, var1, var2, var8.field3372, true, (Class127)null);
                        }

                        var6.method2881(var0, var1, var2, var16, (Class127)var33, (Class127)null, Class50.field450[var4], 0, var28 * Class50.field452[var4], var28 * Class50.field453[var4], var19, var21);
                     } else if (var5 == 6) {
                        var28 = 8;
                        var31 = var6.method2898(var0, var1, var2);
                        if (0L != var31) {
                           var28 = Class110.method2527(Class39.method673(var31)).field3379 / 2;
                        }

                        if (var8.field3372 == -1 && var8.field3410 == null) {
                           var33 = var8.method5079(4, var4 + 4, var15, var17, var16, var18);
                        } else {
                           var33 = new Class85(var3, 4, var4 + 4, var0, var1, var2, var8.field3372, true, (Class127)null);
                        }

                        var6.method2881(var0, var1, var2, var16, (Class127)var33, (Class127)null, 256, var4, var28 * Class50.field458[var4], var28 * Class50.field449[var4], var19, var21);
                     } else if (var5 == 7) {
                        var23 = var4 + 2 & 3;
                        if (var8.field3372 == -1 && var8.field3410 == null) {
                           var22 = var8.method5079(4, var23 + 4, var15, var17, var16, var18);
                        } else {
                           var22 = new Class85(var3, 4, var23 + 4, var0, var1, var2, var8.field3372, true, (Class127)null);
                        }

                        var6.method2881(var0, var1, var2, var16, (Class127)var22, (Class127)null, 256, var23, 0, 0, var19, var21);
                     } else if (var5 == 8) {
                        var28 = 8;
                        var31 = var6.method2898(var0, var1, var2);
                        if (0L != var31) {
                           var28 = Class110.method2527(Class39.method673(var31)).field3379 / 2;
                        }

                        int var27 = var4 + 2 & 3;
                        Object var26;
                        if (var8.field3372 == -1 && var8.field3410 == null) {
                           var33 = var8.method5079(4, var4 + 4, var15, var17, var16, var18);
                           var26 = var8.method5079(4, var27 + 4, var15, var17, var16, var18);
                        } else {
                           var33 = new Class85(var3, 4, var4 + 4, var0, var1, var2, var8.field3372, true, (Class127)null);
                           var26 = new Class85(var3, 4, var27 + 4, var0, var1, var2, var8.field3372, true, (Class127)null);
                        }

                        var6.method2881(var0, var1, var2, var16, (Class127)var33, (Class127)var26, 256, var4, var28 * Class50.field458[var4], var28 * Class50.field449[var4], var19, var21);
                     }
                  }
               }
            } else {
               if (var8.field3372 == -1 && var8.field3410 == null) {
                  var22 = var8.method5079(10, var4, var15, var17, var16, var18);
               } else {
                  var22 = new Class85(var3, 10, var4, var0, var1, var2, var8.field3372, true, (Class127)null);
               }

               if (var22 != null && var6.method2882(var0, var1, var2, var16, var9, var10, (Class127)var22, var5 == 11 ? 256 : 0, var19, var21) && var8.field3400) {
                  var23 = 15;
                  if (var22 instanceof Class119) {
                     var23 = ((Class119)var22).method2672() / 4;
                     if (var23 > 30) {
                        var23 = 30;
                     }
                  }

                  for(int var24 = 0; var24 <= var9; ++var24) {
                     for(int var25 = 0; var25 <= var10; ++var25) {
                        if (var23 > Class50.field447[var0][var24 + var1][var25 + var2]) {
                           Class50.field447[var0][var24 + var1][var25 + var2] = (byte)var23;
                        }
                     }
                  }
               }

               if (var8.field3386 != 0 && var7 != null) {
                  var7.method3394(var1, var2, var9, var10, var8.field3404);
               }

            }
         }
      }
   }

   @ObfuscatedName("hr")
   @ObfuscatedSignature(
      signature = "(Lbf;III)V",
      garbageValue = "-1489132269"
   )
   static final void method3451(Class75 var0, int var1, int var2) {
      Class39.method692(var0.field1066, var0.field1060, var0.field1061, var0.field1062, var0.field1063, var0.field1063, var1, var2);
   }
}
