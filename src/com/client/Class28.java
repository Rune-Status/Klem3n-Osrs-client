package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public class Class28 {
   @ObfuscatedName("ph")
   @ObfuscatedSignature(
      signature = "Lcx;"
   )
   static Class95 field244;
   @ObfuscatedName("bo")
   static String field238;
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "[Lly;"
   )
   static Class317[] field237;
   @ObfuscatedName("ex")
   @ObfuscatedSignature(
      signature = "Ler;"
   )
   static Class135 field249;
   @ObfuscatedName("fc")
   @ObfuscatedSignature(
      signature = "Ldm;"
   )
   static Class125 field248;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -634505767
   )
   public final int field240;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lha;"
   )
   public final Class226 field236;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lha;"
   )
   public final Class226 field243;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -39739323
   )
   final int field242;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1039553607
   )
   final int field239;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Ld;"
   )
   final Class22 field246;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1300917331
   )
   int field235;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 484533419
   )
   int field245;

   @ObfuscatedSignature(
      signature = "(ILha;Lha;Ld;)V"
   )
   Class28(int var1, Class226 var2, Class226 var3, Class22 var4) {
      this.field240 = var1;
      this.field243 = var2;
      this.field236 = var3;
      this.field246 = var4;
      Class255 var5 = Class255.field3246[this.field240];
      Class318 var6 = var5.method4815(false);
      if (var6 != null) {
         this.field242 = var6.field3787;
         this.field239 = var6.field3788;
      } else {
         this.field242 = 0;
         this.field239 = 0;
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-2020334736"
   )
   boolean method464(int var1, int var2) {
      if (this.method465(var1, var2)) {
         return true;
      } else {
         return this.method466(var1, var2);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-1022312970"
   )
   boolean method465(int var1, int var2) {
      Class255 var3 = Class255.field3246[this.field240];
      switch(var3.field3252.field3482) {
      case 0:
         if (var1 >= this.field235 - this.field242 / 2 && var1 <= this.field242 / 2 + this.field235) {
            break;
         }

         return false;
      case 1:
         if (var1 > this.field235 - this.field242 && var1 <= this.field235) {
            break;
         }

         return false;
      case 2:
         if (var1 < this.field235 || var1 >= this.field235 + this.field242) {
            return false;
         }
      }

      switch(var3.field3253.field3223) {
      case 0:
         if (var2 >= this.field245 && var2 < this.field245 + this.field239) {
            break;
         }

         return false;
      case 1:
         if (var2 < this.field245 - this.field239 / 2 || var2 > this.field239 / 2 + this.field245) {
            return false;
         }
         break;
      case 2:
         if (var2 <= this.field245 - this.field239 || var2 > this.field245) {
            return false;
         }
      }

      return true;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "-43"
   )
   boolean method466(int var1, int var2) {
      if (this.field246 == null) {
         return false;
      } else if (var1 >= this.field235 - this.field246.field184 / 2 && var1 <= this.field246.field184 / 2 + this.field235) {
         return var2 >= this.field245 && var2 <= this.field246.field182 + this.field245;
      } else {
         return false;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1804250172"
   )
   static final void method475() {
      Object var10000 = null;
      String var0 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
      Class143.method3172(30, "", var0);
   }

   @ObfuscatedName("if")
   @ObfuscatedSignature(
      signature = "(Ljq;IIII)V",
      garbageValue = "-801364707"
   )
   static final void method474(Class271 var0, int var1, int var2, int var3) {
      if (Client.field771 < 400) {
         if (var0.field3516 != null) {
            var0 = var0.method5189();
         }

         if (var0 != null) {
            if (var0.field3504) {
               if (!var0.field3517 || Client.field748 == var1) {
                  String var4 = var0.field3491;
                  if (var0.field3508 != 0) {
                     var4 = var4 + Class135.method3113(var0.field3508, Class138.field1876.field551) + " " + " (" + "level-" + var0.field3508 + ")";
                  }

                  if (var0.field3517 && Client.field725) {
                     Class50.method993("Examine", Class6.method71(16776960) + var4, 1003, var1, var2, var3);
                  }

                  if (Client.field733 == 1) {
                     Class50.method993("Use", Client.field734 + " " + "->" + " " + Class6.method71(16776960) + var4, 7, var1, var2, var3);
                  } else if (Client.field785) {
                     if ((Class63.field932 & 2) == 2) {
                        Class50.method993(Client.field612, Client.field739 + " " + "->" + " " + Class6.method71(16776960) + var4, 8, var1, var2, var3);
                     }
                  } else {
                     int var5 = var0.field3517 && Client.field725 ? 2000 : 0;
                     String[] var6 = var0.field3506;
                     int var7;
                     int var8;
                     if (var6 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if (var6[var7] != null && !var6[var7].equalsIgnoreCase("Attack")) {
                              var8 = 0;
                              if (var7 == 0) {
                                 var8 = var5 + 9;
                              }

                              if (var7 == 1) {
                                 var8 = var5 + 10;
                              }

                              if (var7 == 2) {
                                 var8 = var5 + 11;
                              }

                              if (var7 == 3) {
                                 var8 = var5 + 12;
                              }

                              if (var7 == 4) {
                                 var8 = var5 + 13;
                              }

                              Class50.method993(var6[var7], Class6.method71(16776960) + var4, var8, var1, var2, var3);
                           }
                        }
                     }

                     if (var6 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if (var6[var7] != null && var6[var7].equalsIgnoreCase("Attack")) {
                              short var9 = 0;
                              if (Client.field780 != Class77.field1074) {
                                 if (Client.field780 == Class77.field1075 || Class77.field1080 == Client.field780 && var0.field3508 > Class138.field1876.field551) {
                                    var9 = 2000;
                                 }

                                 var8 = 0;
                                 if (var7 == 0) {
                                    var8 = var9 + 9;
                                 }

                                 if (var7 == 1) {
                                    var8 = var9 + 10;
                                 }

                                 if (var7 == 2) {
                                    var8 = var9 + 11;
                                 }

                                 if (var7 == 3) {
                                    var8 = var9 + 12;
                                 }

                                 if (var7 == 4) {
                                    var8 = var9 + 13;
                                 }

                                 Class50.method993(var6[var7], Class6.method71(16776960) + var4, var8, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if (!var0.field3517 || !Client.field725) {
                        Class50.method993("Examine", Class6.method71(16776960) + var4, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }

   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      signature = "([Lhi;IIIIIIIII)V",
      garbageValue = "1699160696"
   )
   static final void method467(Class230[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Class314.method5720(var2, var3, var4, var5);
      Class122.method2862();

      for(int var9 = 0; var9 < var0.length; ++var9) {
         Class230 var10 = var0[var9];
         if (var10 != null && (var10.field2605 == var1 || var1 == -1412584499 && var10 == Client.field583)) {
            int var11;
            if (var8 == -1) {
               Client.field786[Client.field603] = var10.field2618 + var6;
               Client.field787[Client.field603] = var7 + var10.field2619;
               Client.field641[Client.field603] = var10.field2675;
               Client.field789[Client.field603] = var10.field2621;
               var11 = ++Client.field603 - 1;
            } else {
               var11 = var8;
            }

            var10.field2737 = var11;
            var10.field2627 = Client.field591;
            if (!var10.field2604 || !Class81.method1885(var10)) {
               int var12;
               if (var10.field2609 > 0) {
                  var12 = var10.field2609;
                  if (var12 == 324) {
                     if (Client.field842 == -1) {
                        Client.field842 = var10.field2640;
                        Client.field586 = var10.field2641;
                     }

                     if (Client.field841.field2571) {
                        var10.field2640 = Client.field842;
                     } else {
                        var10.field2640 = Client.field586;
                     }
                  } else if (var12 == 325) {
                     if (Client.field842 == -1) {
                        Client.field842 = var10.field2640;
                        Client.field586 = var10.field2641;
                     }

                     if (Client.field841.field2571) {
                        var10.field2640 = Client.field586;
                     } else {
                        var10.field2640 = Client.field842;
                     }
                  } else if (var12 == 327) {
                     var10.field2656 = 150;
                     var10.field2657 = (int)(Math.sin((double)Client.field591 / 40.0D) * 256.0D) & 2047;
                     var10.field2665 = 5;
                     var10.field2593 = 0;
                  } else if (var12 == 328) {
                     var10.field2656 = 150;
                     var10.field2657 = (int)(Math.sin((double)Client.field591 / 40.0D) * 256.0D) & 2047;
                     var10.field2665 = 5;
                     var10.field2593 = 1;
                  }
               }

               var12 = var10.field2618 + var6;
               int var13 = var7 + var10.field2619;
               int var14 = var10.field2636;
               int var15;
               int var16;
               if (var10 == Client.field583) {
                  if (var1 != -1412584499 && !var10.field2634) {
                     Class132.field1814 = var0;
                     Class297.field3687 = var6;
                     Class1.field15 = var7;
                     continue;
                  }

                  if (Client.field763 && Client.field601) {
                     var15 = Class48.field425;
                     var16 = Class48.field426 * 673804999;
                     var15 -= Client.field753;
                     var16 -= Client.field749;
                     if (var15 < Client.field757) {
                        var15 = Client.field757;
                     }

                     if (var15 + var10.field2675 > Client.field757 + Client.field752.field2675) {
                        var15 = Client.field757 + Client.field752.field2675 - var10.field2675;
                     }

                     if (var16 < Client.field758) {
                        var16 = Client.field758;
                     }

                     if (var16 + var10.field2621 > Client.field758 + Client.field752.field2621) {
                        var16 = Client.field758 + Client.field752.field2621 - var10.field2621;
                     }

                     var12 = var15;
                     var13 = var16;
                  }

                  if (!var10.field2634) {
                     var14 = 128;
                  }
               }

               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if (var10.field2721 == 2) {
                  var15 = var2;
                  var16 = var3;
                  var17 = var4;
                  var18 = var5;
               } else if (var10.field2721 == 9) {
                  var19 = var12;
                  var20 = var13;
                  var21 = var12 + var10.field2675;
                  var22 = var13 + var10.field2621;
                  if (var21 < var12) {
                     var19 = var21;
                     var21 = var12;
                  }

                  if (var22 < var13) {
                     var20 = var22;
                     var22 = var13;
                  }

                  ++var21;
                  ++var22;
                  var15 = var19 > var2 ? var19 : var2;
                  var16 = var20 > var3 ? var20 : var3;
                  var17 = var21 < var4 ? var21 : var4;
                  var18 = var22 < var5 ? var22 : var5;
               } else {
                  var19 = var12 + var10.field2675;
                  var20 = var13 + var10.field2621;
                  var15 = var12 > var2 ? var12 : var2;
                  var16 = var13 > var3 ? var13 : var3;
                  var17 = var19 < var4 ? var19 : var4;
                  var18 = var20 < var5 ? var20 : var5;
               }

               if (!var10.field2604 || var15 < var17 && var16 < var18) {
                  int var23;
                  int var25;
                  int var26;
                  int var27;
                  int var28;
                  int var29;
                  int var30;
                  int var31;
                  int var33;
                  int var34;
                  int var35;
                  int var37;
                  int var39;
                  int var40;
                  int var41;
                  int var43;
                  int var44;
                  int var45;
                  int var49;
                  int var52;
                  if (var10.field2609 != 0) {
                     if (var10.field2609 == 1336) {
                        if (Client.field597) {
                           var13 += 15;
                           Class63.field933.method5524("Fps:" + Class47.field393, var12 + var10.field2675, var13, 16776960, -1);
                           var13 += 15;
                           Runtime var68 = Runtime.getRuntime();
                           var20 = (int)((var68.totalMemory() - var68.freeMemory()) / 1024L);
                           var21 = 16776960;
                           if (var20 > 327680 && !Client.field585) {
                              var21 = 16711680;
                           }

                           Class63.field933.method5524("Mem:" + var20 + "k", var12 + var10.field2675, var13, var21, -1);
                           var13 += 15;
                        }
                        continue;
                     }

                     if (var10.field2609 == 1337) {
                        Client.field729 = var12;
                        Client.field730 = var13;
                        var21 = var10.field2675;
                        var22 = var10.field2621;
                        ++Client.field687;
                        Class148.method3198();
                        Class162.method3380();
                        Class54.method1019();
                        Class24.method424(true);
                        Class67.method1655();
                        Class24.method424(false);

                        for(Class79 var70 = (Class79)Client.field710.method4098(); var70 != null; var70 = (Class79)Client.field710.method4079()) {
                           if (var70.field1121 == Class13.field82 && Client.field591 <= var70.field1127) {
                              if (Client.field591 >= var70.field1126) {
                                 if (var70.field1135 > 0) {
                                    Class72 var59 = Client.field843[var70.field1135 - 1];
                                    if (var59 != null && var59.field931 >= 0 && var59.field931 < 13312 && var59.field881 >= 0 && var59.field881 < 13312) {
                                       var70.method1849(var59.field931, var59.field881, Class27.method460(var59.field931, var59.field881, var70.field1121) - var70.field1123, Client.field591);
                                    }
                                 }

                                 if (var70.field1135 < 0) {
                                    var25 = -var70.field1135 - 1;
                                    Class60 var60;
                                    if (var25 == Client.field628) {
                                       var60 = Class138.field1876;
                                    } else {
                                       var60 = Client.field610[var25];
                                    }

                                    if (var60 != null && var60.field931 >= 0 && var60.field931 < 13312 && var60.field881 >= 0 && var60.field881 < 13312) {
                                       var70.method1849(var60.field931, var60.field881, Class27.method460(var60.field931, var60.field881, var70.field1121) - var70.field1123, Client.field591);
                                    }
                                 }

                                 var70.method1850(Client.field700);
                                 field248.method2883(Class13.field82, (int)var70.field1144, (int)var70.field1125, (int)var70.field1137, 60, var70, var70.field1140, -1L, false);
                              }
                           } else {
                              var70.method4064();
                           }
                        }

                        for(Class70 var71 = (Class70)Client.field711.method4098(); var71 != null; var71 = (Class70)Client.field711.method4079()) {
                           if (var71.field1014 == Class13.field82 && !var71.field1021) {
                              if (Client.field591 >= var71.field1012) {
                                 var71.method1771(Client.field700);
                                 if (var71.field1021) {
                                    var71.method4064();
                                 } else {
                                    field248.method2883(var71.field1014, var71.field1015, var71.field1016, var71.field1017, 60, var71, 0, -1L, false);
                                 }
                              }
                           } else {
                              var71.method4064();
                           }
                        }

                        Class43.method714(var12, var13, var21, var22, true);
                        var19 = Client.field762;
                        var20 = Client.field837;
                        var21 = Client.field838;
                        var22 = Client.field662;
                        Class314.method5720(var19, var20, var21 + var19, var22 + var20);
                        Class122.method2862();
                        if (!Client.field822) {
                           var23 = Client.field649;
                           if (Client.field738 / 256 > var23) {
                              var23 = Client.field738 / 256;
                           }

                           if (Client.field823[4] && Client.field825[4] + 128 > var23) {
                              var23 = Client.field825[4] + 128;
                           }

                           var49 = Client.field717 & 2047;
                           Class49.method951(Class109.field1428, Class269.field3478, Class2.field23, var23, var49, var23 * 3 + 600);
                        }

                        if (!Client.field822) {
                           var23 = Class12.method108();
                        } else {
                           if (Class10.field61.field960) {
                              var49 = Class13.field82;
                           } else {
                              var25 = Class27.method460(Class109.field1431, Class226.field2563, Class13.field82);
                              if (var25 - Class123.field1702 < 800 && (Class50.field443[Class13.field82][Class109.field1431 >> 7][Class226.field2563 >> 7] & 4) != 0) {
                                 var49 = Class13.field82;
                              } else {
                                 var49 = 3;
                              }
                           }

                           var23 = var49;
                        }

                        var49 = Class109.field1431;
                        var25 = Class123.field1702;
                        var26 = Class226.field2563;
                        var27 = Class7.field41;
                        var28 = Class85.field1201;

                        for(var29 = 0; var29 < 5; ++var29) {
                           if (Client.field823[var29]) {
                              var30 = (int)(Math.random() * (double)(Client.field824[var29] * 2 + 1) - (double)Client.field824[var29] + Math.sin((double)Client.field705[var29] * ((double)Client.field826[var29] / 100.0D)) * (double)Client.field825[var29]);
                              if (var29 == 0) {
                                 Class109.field1431 += var30;
                              }

                              if (var29 == 1) {
                                 Class123.field1702 += var30;
                              }

                              if (var29 == 2) {
                                 Class226.field2563 += var30;
                              }

                              if (var29 == 3) {
                                 Class85.field1201 = var30 + Class85.field1201 & 2047;
                              }

                              if (var29 == 4) {
                                 Class7.field41 += var30;
                                 if (Class7.field41 < 128) {
                                    Class7.field41 = 128;
                                 }

                                 if (Class7.field41 > 383) {
                                    Class7.field41 = 383;
                                 }
                              }
                           }
                        }

                        var29 = Class48.field425;
                        var30 = Class48.field426 * 673804999;
                        if (Class48.field431 != 0) {
                           var29 = Class48.field432;
                           var30 = Class48.field428;
                        }

                        if (var29 >= var19 && var29 < var19 + var21 && var30 >= var20 && var30 < var20 + var22) {
                           Class47.method913(var29 - var19, var30 - var20);
                        } else {
                           Class120.field1650 = false;
                           Class120.field1656 = 0;
                        }

                        Class54.method1017();
                        Class314.method5763(var19, var20, var21, var22, 0);
                        Class54.method1017();
                        var31 = Class122.field1678;
                        Class122.field1678 = Client.field840;
                        field248.method2912(Class109.field1431, Class123.field1702, Class226.field2563, Class7.field41, Class85.field1201, var23);
                        Class122.field1678 = var31;
                        Class54.method1017();
                        field248.method3017();
                        Client.field667 = 0;
                        boolean var62 = false;
                        var33 = -1;
                        var34 = -1;
                        var35 = Class81.field1167;
                        int[] var36 = Class81.field1159;

                        for(var37 = 0; var37 < var35 + Client.field622; ++var37) {
                           Object var38;
                           if (var37 < var35) {
                              var38 = Client.field610[var36[var37]];
                              if (var36[var37] == Client.field707) {
                                 var62 = true;
                                 var33 = var37;
                                 continue;
                              }

                              if (var38 == Class138.field1876) {
                                 var34 = var37;
                                 continue;
                              }
                           } else {
                              var38 = Client.field843[Client.field639[var37 - var35]];
                           }

                           Class35.method628((Class63)var38, var37, var19, var20, var21, var22);
                        }

                        if (Client.field699 && var34 != -1) {
                           Class35.method628(Class138.field1876, var34, var19, var20, var21, var22);
                        }

                        if (var62) {
                           Class35.method628(Client.field610[Client.field707], var33, var19, var20, var21, var22);
                        }

                        for(var37 = 0; var37 < Client.field667; ++var37) {
                           var52 = Client.field669[var37];
                           var39 = Client.field670[var37];
                           var40 = Client.field672[var37];
                           var41 = Client.field671[var37];
                           boolean var63 = true;

                           while(var63) {
                              var63 = false;

                              for(var43 = 0; var43 < var37; ++var43) {
                                 if (var39 + 2 > Client.field670[var43] - Client.field671[var43] && var39 - var41 < Client.field670[var43] + 2 && var52 - var40 < Client.field672[var43] + Client.field669[var43] && var40 + var52 > Client.field669[var43] - Client.field672[var43] && Client.field670[var43] - Client.field671[var43] < var39) {
                                    var39 = Client.field670[var43] - Client.field671[var43];
                                    var63 = true;
                                 }
                              }
                           }

                           Client.field679 = Client.field669[var37];
                           Client.field680 = Client.field670[var37] = var39;
                           String var53 = Client.field721[var37];
                           if (Client.field742 == 0) {
                              var44 = 16776960;
                              if (Client.field673[var37] < 6) {
                                 var44 = Client.field731[Client.field673[var37]];
                              }

                              if (Client.field673[var37] == 6) {
                                 var44 = Client.field687 % 20 < 10 ? 16711680 : 16776960;
                              }

                              if (Client.field673[var37] == 7) {
                                 var44 = Client.field687 % 20 < 10 ? 255 : '\uffff';
                              }

                              if (Client.field673[var37] == 8) {
                                 var44 = Client.field687 % 20 < 10 ? '뀀' : 8454016;
                              }

                              if (Client.field673[var37] == 9) {
                                 var45 = 150 - Client.field675[var37];
                                 if (var45 < 50) {
                                    var44 = var45 * 1280 + 16711680;
                                 } else if (var45 < 100) {
                                    var44 = 16776960 - (var45 - 50) * 327680;
                                 } else if (var45 < 150) {
                                    var44 = (var45 - 100) * 5 + '\uff00';
                                 }
                              }

                              if (Client.field673[var37] == 10) {
                                 var45 = 150 - Client.field675[var37];
                                 if (var45 < 50) {
                                    var44 = var45 * 5 + 16711680;
                                 } else if (var45 < 100) {
                                    var44 = 16711935 - (var45 - 50) * 327680;
                                 } else if (var45 < 150) {
                                    var44 = (var45 - 100) * 327680 + 255 - (var45 - 100) * 5;
                                 }
                              }

                              if (Client.field673[var37] == 11) {
                                 var45 = 150 - Client.field675[var37];
                                 if (var45 < 50) {
                                    var44 = 16777215 - var45 * 327685;
                                 } else if (var45 < 100) {
                                    var44 = (var45 - 50) * 327685 + '\uff00';
                                 } else if (var45 < 150) {
                                    var44 = 16777215 - (var45 - 100) * 327680;
                                 }
                              }

                              if (Client.field674[var37] == 0) {
                                 Class293.field3660.method5525(var53, var19 + Client.field679, var20 + Client.field680, var44, 0);
                              }

                              if (Client.field674[var37] == 1) {
                                 Class293.field3660.method5609(var53, var19 + Client.field679, var20 + Client.field680, var44, 0, Client.field687);
                              }

                              if (Client.field674[var37] == 2) {
                                 Class293.field3660.method5575(var53, var19 + Client.field679, var20 + Client.field680, var44, 0, Client.field687);
                              }

                              if (Client.field674[var37] == 3) {
                                 Class293.field3660.method5539(var53, var19 + Client.field679, var20 + Client.field680, var44, 0, Client.field687, 150 - Client.field675[var37]);
                              }

                              if (Client.field674[var37] == 4) {
                                 var45 = (150 - Client.field675[var37]) * (Class293.field3660.method5517(var53) + 100) / 150;
                                 Class314.method5790(var19 + Client.field679 - 50, var20, var19 + Client.field679 + 50, var20 + var22);
                                 Class293.field3660.method5522(var53, var19 + Client.field679 + 50 - var45, var20 + Client.field680, var44, 0);
                                 Class314.method5720(var19, var20, var19 + var21, var22 + var20);
                              }

                              if (Client.field674[var37] == 5) {
                                 var45 = 150 - Client.field675[var37];
                                 int var46 = 0;
                                 if (var45 < 25) {
                                    var46 = var45 - 25;
                                 } else if (var45 > 125) {
                                    var46 = var45 - 125;
                                 }

                                 Class314.method5790(var19, var20 + Client.field680 - Class293.field3660.field3695 - 1, var21 + var19, var20 + Client.field680 + 5);
                                 Class293.field3660.method5525(var53, var19 + Client.field679, var46 + var20 + Client.field680, var44, 0);
                                 Class314.method5720(var19, var20, var19 + var21, var20 + var22);
                              }
                           } else {
                              Class293.field3660.method5525(var53, var19 + Client.field679, var20 + Client.field680, 16776960, 0);
                           }
                        }

                        if (Client.field599 == 2) {
                           Class238.method4594((Client.field602 - Class62.field868 << 7) + Client.field605, (Client.field818 - Client.field754 << 7) + Client.field637, Client.field604 * 2);
                           if (Client.field679 > -1 && Client.field591 % 20 < 10) {
                              Class150.field1926[0].method5851(var19 + Client.field679 - 12, var20 + Client.field680 - 28);
                           }
                        }

                        ((Class111)Class122.field1667).method2537(Client.field700);
                        Class16.method158(var19, var20, var21, var22);
                        Class109.field1431 = var49;
                        Class123.field1702 = var25;
                        Class226.field2563 = var26;
                        Class7.field41 = var27;
                        Class85.field1201 = var28;
                        if (Client.field625 && Class185.method3786(true, false) == 0) {
                           Client.field625 = false;
                        }

                        if (Client.field625) {
                           Class314.method5763(var19, var20, var21, var22, 0);
                           Class83.method1933("Loading - please wait.", false);
                        }

                        Client.field697[var10.field2737] = true;
                        Class314.method5720(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.field2609 == 1338) {
                        Class173.method3473(var10, var12, var13, var11);
                        Class314.method5720(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.field2609 == 1339) {
                        Class224 var67 = var10.method4517(false);
                        if (var67 != null) {
                           if (Client.field810 < 3) {
                              Class128.field1791.method5845(var12, var13, var67.field2553, var67.field2549, 25, 25, Client.field717, 256, var67.field2551, var67.field2550);
                           } else {
                              Class314.method5742(var12, var13, 0, var67.field2551, var67.field2550);
                           }
                        }

                        Class314.method5720(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.field2609 == 1400) {
                        Class53.field476.method6018(var12, var13, var10.field2675, var10.field2621, Client.field591);
                     }

                     if (var10.field2609 == 1401) {
                        Class53.field476.method6022(var12, var13, var10.field2675, var10.field2621);
                     }
                  }

                  boolean var57;
                  if (var10.field2721 == 0) {
                     if (!var10.field2604) {
                        var57 = var10.field2625;
                        if (var57 && var10 != Class143.field1897) {
                           continue;
                        }
                     }

                     if (!var10.field2604) {
                        if (var10.field2663 > var10.field2629 - var10.field2621) {
                           var10.field2663 = var10.field2629 - var10.field2621;
                        }

                        if (var10.field2663 < 0) {
                           var10.field2663 = 0;
                        }
                     }

                     method467(var0, var10.field2691, var15, var16, var17, var18, var12 - var10.field2626, var13 - var10.field2663, var11);
                     if (var10.field2736 != null) {
                        method467(var10.field2736, var10.field2691, var15, var16, var17, var18, var12 - var10.field2626, var13 - var10.field2663, var11);
                     }

                     Class55 var47 = (Class55)Client.field741.method4020((long)var10.field2691);
                     if (var47 != null) {
                        Class35.method630(var47.field501, var15, var16, var17, var18, var12, var13, var11);
                     }

                     Class314.method5720(var2, var3, var4, var5);
                     Class122.method2862();
                  }

                  if (Client.field792 || Client.field723[var11] || Client.field790 > 1) {
                     if (var10.field2721 == 0 && !var10.field2604 && var10.field2629 > var10.field2621) {
                        var19 = var12 + var10.field2675;
                        var20 = var10.field2663;
                        var21 = var10.field2621;
                        var22 = var10.field2629;
                        Class243.field3139[0].method5829(var19, var13);
                        Class243.field3139[1].method5829(var19, var21 + var13 - 16);
                        Class314.method5763(var19, var13 + 16, 16, var21 - 32, Client.field643);
                        var23 = var21 * (var21 - 32) / var22;
                        if (var23 < 8) {
                           var23 = 8;
                        }

                        var49 = var20 * (var21 - 32 - var23) / (var22 - var21);
                        Class314.method5763(var19, var13 + var49 + 16, 16, var23, Client.field584);
                        Class314.method5738(var19, var49 + var13 + 16, var23, Client.field646);
                        Class314.method5738(var19 + 1, var13 + var49 + 16, var23, Client.field646);
                        Class314.method5736(var19, var13 + var49 + 16, 16, Client.field646);
                        Class314.method5736(var19, var49 + var13 + 17, 16, Client.field646);
                        Class314.method5738(var19 + 15, var13 + var49 + 16, var23, Client.field836);
                        Class314.method5738(var19 + 14, var49 + var13 + 17, var23 - 1, Client.field836);
                        Class314.method5736(var19, var13 + var49 + var23 + 15, 16, Client.field836);
                        Class314.method5736(var19 + 1, var49 + var13 + var23 + 14, 15, Client.field836);
                     }

                     if (var10.field2721 != 1) {
                        if (var10.field2721 == 2) {
                           var19 = 0;

                           for(var20 = 0; var20 < var10.field2617; ++var20) {
                              for(var21 = 0; var21 < var10.field2616; ++var21) {
                                 var22 = var12 + var21 * (var10.field2672 + 32);
                                 var23 = var20 * (var10.field2673 + 32) + var13;
                                 if (var19 < 20) {
                                    var22 += var10.field2685[var19];
                                    var23 += var10.field2738[var19];
                                 }

                                 if (var10.field2724[var19] <= 0) {
                                    if (var10.field2676 != null && var19 < 20) {
                                       Class318 var58 = var10.method4509(var19);
                                       if (var58 != null) {
                                          var58.method5851(var22, var23);
                                       } else if (Class230.field2603) {
                                          Class60.method1114(var10);
                                       }
                                    }
                                 } else {
                                    boolean var72 = false;
                                    boolean var61 = false;
                                    var26 = var10.field2724[var19] - 1;
                                    if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == Class276.field3559 && var19 == Client.field688) {
                                       Class318 var50;
                                       if (Client.field733 == 1 && var19 == Class13.field84 && var10.field2691 == Class187.field2372) {
                                          var50 = Class21.method276(var26, var10.field2725[var19], 2, 0, 2, false);
                                       } else {
                                          var50 = Class21.method276(var26, var10.field2725[var19], 1, 3153952, 2, false);
                                       }

                                       if (var50 != null) {
                                          if (var10 == Class276.field3559 && var19 == Client.field688) {
                                             var49 = Class48.field425 - Client.field678;
                                             var25 = Class48.field426 * 673804999 - Client.field821;
                                             if (var49 < 5 && var49 > -5) {
                                                var49 = 0;
                                             }

                                             if (var25 < 5 && var25 > -5) {
                                                var25 = 0;
                                             }

                                             if (Client.field693 < 5) {
                                                var49 = 0;
                                                var25 = 0;
                                             }

                                             var50.method5857(var49 + var22, var23 + var25, 128);
                                             if (var1 != -1) {
                                                Class230 var51 = var0[var1 & '\uffff'];
                                                if (var25 + var23 < Class314.field3763 && var51.field2663 > 0) {
                                                   var29 = (Class314.field3763 - var23 - var25) * Client.field700 / 3;
                                                   if (var29 > Client.field700 * 10) {
                                                      var29 = Client.field700 * 10;
                                                   }

                                                   if (var29 > var51.field2663) {
                                                      var29 = var51.field2663;
                                                   }

                                                   var51.field2663 -= var29;
                                                   Client.field821 += var29;
                                                   Class60.method1114(var51);
                                                }

                                                if (var25 + var23 + 32 > Class314.field3764 && var51.field2663 < var51.field2629 - var51.field2621) {
                                                   var29 = (var25 + var23 + 32 - Class314.field3764) * Client.field700 / 3;
                                                   if (var29 > Client.field700 * 10) {
                                                      var29 = Client.field700 * 10;
                                                   }

                                                   if (var29 > var51.field2629 - var51.field2621 - var51.field2663) {
                                                      var29 = var51.field2629 - var51.field2621 - var51.field2663;
                                                   }

                                                   var51.field2663 += var29;
                                                   Client.field821 -= var29;
                                                   Class60.method1114(var51);
                                                }
                                             }
                                          } else if (var10 == Class240.field3096 && var19 == Client.field582) {
                                             var50.method5857(var22, var23, 128);
                                          } else {
                                             var50.method5851(var22, var23);
                                          }
                                       } else {
                                          Class60.method1114(var10);
                                       }
                                    }
                                 }

                                 ++var19;
                              }
                           }
                        } else if (var10.field2721 == 3) {
                           if (Class132.method3097(var10)) {
                              var19 = var10.field2631;
                              if (var10 == Class143.field1897 && var10.field2633 != 0) {
                                 var19 = var10.field2633;
                              }
                           } else {
                              var19 = var10.field2630;
                              if (var10 == Class143.field1897 && var10.field2632 != 0) {
                                 var19 = var10.field2632;
                              }
                           }

                           if (var10.field2710) {
                              switch(var10.field2701.field3776) {
                              case 1:
                                 Class314.method5728(var12, var13, var10.field2675, var10.field2621, var10.field2630, var10.field2631, 256 - (var10.field2636 & 255), 256 - (var10.field2608 & 255));
                                 break;
                              case 2:
                                 Class314.method5729(var12, var13, var10.field2675, var10.field2621, var10.field2630, var10.field2631, 256 - (var10.field2636 & 255), 256 - (var10.field2608 & 255));
                                 break;
                              case 3:
                                 Class314.method5739(var12, var13, var10.field2675, var10.field2621, var10.field2630, var10.field2631, 256 - (var10.field2636 & 255), 256 - (var10.field2608 & 255));
                                 break;
                              case 4:
                                 Class314.method5726(var12, var13, var10.field2675, var10.field2621, var10.field2630, var10.field2631, 256 - (var10.field2636 & 255), 256 - (var10.field2608 & 255));
                                 break;
                              default:
                                 if (var14 == 0) {
                                    Class314.method5763(var12, var13, var10.field2675, var10.field2621, var19);
                                 } else {
                                    Class314.method5727(var12, var13, var10.field2675, var10.field2621, var19, 256 - (var14 & 255));
                                 }
                              }
                           } else if (var14 == 0) {
                              Class314.method5734(var12, var13, var10.field2675, var10.field2621, var19);
                           } else {
                              Class314.method5741(var12, var13, var10.field2675, var10.field2621, var19, 256 - (var14 & 255));
                           }
                        } else {
                           Class298 var64;
                           if (var10.field2721 == 4) {
                              var64 = var10.method4545();
                              if (var64 == null) {
                                 if (Class230.field2603) {
                                    Class60.method1114(var10);
                                 }
                              } else {
                                 String var74 = var10.field2667;
                                 if (Class132.method3097(var10)) {
                                    var20 = var10.field2631;
                                    if (var10 == Class143.field1897 && var10.field2633 != 0) {
                                       var20 = var10.field2633;
                                    }

                                    if (var10.field2717.length() > 0) {
                                       var74 = var10.field2717;
                                    }
                                 } else {
                                    var20 = var10.field2630;
                                    if (var10 == Class143.field1897 && var10.field2632 != 0) {
                                       var20 = var10.field2632;
                                    }
                                 }

                                 if (var10.field2604 && var10.field2649 != -1) {
                                    Class269 var75 = Class111.method2563(var10.field2649);
                                    var74 = var75.field3433;
                                    if (var74 == null) {
                                       var74 = "null";
                                    }

                                    if ((var75.field3444 == 1 || var10.field2727 != 1) && var10.field2727 != -1) {
                                       var74 = Class6.method71(16748608) + var74 + "</col>" + " " + 'x' + Class35.method623(var10.field2727);
                                    }
                                 }

                                 if (var10 == Client.field744) {
                                    var74 = "Please wait...";
                                    var20 = var10.field2630;
                                 }

                                 if (!var10.field2604) {
                                    var74 = Class1.method11(var74, var10);
                                 }

                                 var64.method5526(var74, var12, var13, var10.field2675, var10.field2621, var20, var10.field2671 ? 0 : -1, var10.field2669, var10.field2681, var10.field2668);
                              }
                           } else if (var10.field2721 == 5) {
                              Class318 var65;
                              if (!var10.field2604) {
                                 var65 = var10.method4508(Class132.method3097(var10));
                                 if (var65 != null) {
                                    var65.method5851(var12, var13);
                                 } else if (Class230.field2603) {
                                    Class60.method1114(var10);
                                 }
                              } else {
                                 if (var10.field2649 != -1) {
                                    var65 = Class21.method276(var10.field2649, var10.field2727, var10.field2644, var10.field2645, var10.field2664, false);
                                 } else {
                                    var65 = var10.method4508(false);
                                 }

                                 if (var65 == null) {
                                    if (Class230.field2603) {
                                       Class60.method1114(var10);
                                    }
                                 } else {
                                    var20 = var65.field3796;
                                    var21 = var65.field3792;
                                    if (!var10.field2643) {
                                       var22 = var10.field2675 * 4096 / var20;
                                       if (var10.field2596 != 0) {
                                          var65.method5870(var10.field2675 / 2 + var12, var10.field2621 / 2 + var13, var10.field2596, var22);
                                       } else if (var14 != 0) {
                                          var65.method5856(var12, var13, var10.field2675, var10.field2621, 256 - (var14 & 255));
                                       } else if (var20 == var10.field2675 && var21 == var10.field2621) {
                                          var65.method5851(var12, var13);
                                       } else {
                                          var65.method5853(var12, var13, var10.field2675, var10.field2621);
                                       }
                                    } else {
                                       Class314.method5790(var12, var13, var12 + var10.field2675, var13 + var10.field2621);
                                       var22 = (var20 - 1 + var10.field2675) / var20;
                                       var23 = (var21 - 1 + var10.field2621) / var21;

                                       for(var49 = 0; var49 < var22; ++var49) {
                                          for(var25 = 0; var25 < var23; ++var25) {
                                             if (var10.field2596 != 0) {
                                                var65.method5870(var20 / 2 + var12 + var49 * var20, var21 / 2 + var13 + var21 * var25, var10.field2596, 4096);
                                             } else if (var14 != 0) {
                                                var65.method5857(var12 + var49 * var20, var13 + var21 * var25, 256 - (var14 & 255));
                                             } else {
                                                var65.method5851(var12 + var20 * var49, var13 + var21 * var25);
                                             }
                                          }
                                       }

                                       Class314.method5720(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              Class269 var48;
                              if (var10.field2721 == 6) {
                                 var57 = Class132.method3097(var10);
                                 if (var57) {
                                    var20 = var10.field2653;
                                 } else {
                                    var20 = var10.field2595;
                                 }

                                 Class119 var73 = null;
                                 var22 = 0;
                                 if (var10.field2649 != -1) {
                                    var48 = Class111.method2563(var10.field2649);
                                    if (var48 != null) {
                                       var48 = var48.method5094(var10.field2727);
                                       var73 = var48.method5093(1);
                                       if (var73 != null) {
                                          var73.method2670();
                                          var22 = var73.field1781 / 2;
                                       } else {
                                          Class60.method1114(var10);
                                       }
                                    }
                                 } else if (var10.field2665 == 5) {
                                    if (var10.field2593 == 0) {
                                       var73 = Client.field841.method4468((Class273)null, -1, (Class273)null, -1);
                                    } else {
                                       var73 = Class138.field1876.vmethod3067();
                                    }
                                 } else if (var20 == -1) {
                                    var73 = var10.method4510((Class273)null, -1, var57, Class138.field1876.field546);
                                    if (var73 == null && Class230.field2603) {
                                       Class60.method1114(var10);
                                    }
                                 } else {
                                    Class273 var69 = Class3.method25(var20);
                                    var73 = var10.method4510(var69, var10.field2728, var57, Class138.field1876.field546);
                                    if (var73 == null && Class230.field2603) {
                                       Class60.method1114(var10);
                                    }
                                 }

                                 Class122.method2827(var10.field2675 / 2 + var12, var10.field2621 / 2 + var13);
                                 var23 = Class122.field1681[var10.field2656] * var10.field2704 >> 16;
                                 var49 = Class122.field1693[var10.field2656] * var10.field2704 >> 16;
                                 if (var73 != null) {
                                    if (!var10.field2604) {
                                       var73.method2682(0, var10.field2657, 0, var10.field2656, 0, var23, var49);
                                    } else {
                                       var73.method2670();
                                       if (var10.field2662) {
                                          var73.method2710(0, var10.field2657, var10.field2658, var10.field2656, var10.field2592, var23 + var22 + var10.field2655, var49 + var10.field2655, var10.field2704);
                                       } else {
                                          var73.method2682(0, var10.field2657, var10.field2658, var10.field2656, var10.field2592, var22 + var23 + var10.field2655, var49 + var10.field2655);
                                       }
                                    }
                                 }

                                 Class122.method2832();
                              } else {
                                 if (var10.field2721 == 7) {
                                    var64 = var10.method4545();
                                    if (var64 == null) {
                                       if (Class230.field2603) {
                                          Class60.method1114(var10);
                                       }
                                       continue;
                                    }

                                    var20 = 0;

                                    for(var21 = 0; var21 < var10.field2617; ++var21) {
                                       for(var22 = 0; var22 < var10.field2616; ++var22) {
                                          if (var10.field2724[var20] > 0) {
                                             var48 = Class111.method2563(var10.field2724[var20] - 1);
                                             String var24;
                                             if (var48.field3444 != 1 && var10.field2725[var20] == 1) {
                                                var24 = Class6.method71(16748608) + var48.field3433 + "</col>";
                                             } else {
                                                var24 = Class6.method71(16748608) + var48.field3433 + "</col>" + " " + 'x' + Class35.method623(var10.field2725[var20]);
                                             }

                                             var25 = var22 * (var10.field2672 + 115) + var12;
                                             var26 = var13 + (var10.field2673 + 12) * var21;
                                             if (var10.field2669 == 0) {
                                                var64.method5522(var24, var25, var26, var10.field2630, var10.field2671 ? 0 : -1);
                                             } else if (var10.field2669 == 1) {
                                                var64.method5525(var24, var10.field2675 / 2 + var25, var26, var10.field2630, var10.field2671 ? 0 : -1);
                                             } else {
                                                var64.method5524(var24, var25 + var10.field2675 - 1, var26, var10.field2630, var10.field2671 ? 0 : -1);
                                             }
                                          }

                                          ++var20;
                                       }
                                    }
                                 }

                                 if (var10.field2721 == 8 && var10 == Class141.field1888 && Client.field623 == Client.field732) {
                                    var19 = 0;
                                    var20 = 0;
                                    Class298 var54 = Class63.field933;
                                    String var55 = var10.field2667;

                                    String var66;
                                    for(var55 = Class1.method11(var55, var10); var55.length() > 0; var20 = var20 + var54.field3695 + 1) {
                                       var49 = var55.indexOf("<br>");
                                       if (var49 != -1) {
                                          var66 = var55.substring(0, var49);
                                          var55 = var55.substring(var49 + 4);
                                       } else {
                                          var66 = var55;
                                          var55 = "";
                                       }

                                       var25 = var54.method5517(var66);
                                       if (var25 > var19) {
                                          var19 = var25;
                                       }
                                    }

                                    var19 += 6;
                                    var20 += 7;
                                    var49 = var12 + var10.field2675 - 5 - var19;
                                    var25 = var13 + var10.field2621 + 5;
                                    if (var49 < var12 + 5) {
                                       var49 = var12 + 5;
                                    }

                                    if (var19 + var49 > var4) {
                                       var49 = var4 - var19;
                                    }

                                    if (var20 + var25 > var5) {
                                       var25 = var5 - var20;
                                    }

                                    Class314.method5763(var49, var25, var19, var20, 16777120);
                                    Class314.method5734(var49, var25, var19, var20, 0);
                                    var55 = var10.field2667;
                                    var26 = var25 + var54.field3695 + 2;

                                    for(var55 = Class1.method11(var55, var10); var55.length() > 0; var26 = var26 + var54.field3695 + 1) {
                                       var27 = var55.indexOf("<br>");
                                       if (var27 != -1) {
                                          var66 = var55.substring(0, var27);
                                          var55 = var55.substring(var27 + 4);
                                       } else {
                                          var66 = var55;
                                          var55 = "";
                                       }

                                       var54.method5522(var66, var49 + 3, var26, 0, -1);
                                    }
                                 }

                                 if (var10.field2721 == 9) {
                                    if (var10.field2639) {
                                       var19 = var12;
                                       var20 = var13 + var10.field2621;
                                       var21 = var12 + var10.field2675;
                                       var22 = var13;
                                    } else {
                                       var19 = var12;
                                       var20 = var13;
                                       var21 = var12 + var10.field2675;
                                       var22 = var13 + var10.field2621;
                                    }

                                    if (var10.field2638 == 1) {
                                       Class314.method5765(var19, var20, var21, var22, var10.field2630);
                                    } else {
                                       var25 = var10.field2630;
                                       var26 = var10.field2638;
                                       var27 = var21 - var19;
                                       var28 = var22 - var20;
                                       var29 = var27 >= 0 ? var27 : -var27;
                                       var30 = var28 >= 0 ? var28 : -var28;
                                       var31 = var29;
                                       if (var29 < var30) {
                                          var31 = var30;
                                       }

                                       if (var31 != 0) {
                                          int var32 = (var27 << 16) / var31;
                                          var33 = (var28 << 16) / var31;
                                          if (var33 <= var32) {
                                             var32 = -var32;
                                          } else {
                                             var33 = -var33;
                                          }

                                          var34 = var26 * var33 >> 17;
                                          var35 = var33 * var26 + 1 >> 17;
                                          int var56 = var26 * var32 >> 17;
                                          var37 = var32 * var26 + 1 >> 17;
                                          var23 = var19 - Class314.field3765;
                                          var49 = var20 - Class314.field3763;
                                          var52 = var23 + var34;
                                          var39 = var23 - var35;
                                          var40 = var23 + var27 - var35;
                                          var41 = var34 + var27 + var23;
                                          int var42 = var49 + var56;
                                          var43 = var49 - var37;
                                          var44 = var49 + var28 - var37;
                                          var45 = var49 + var28 + var56;
                                          Class122.method2793(var52, var39, var40);
                                          Class122.method2796(var42, var43, var44, var52, var39, var40, var25);
                                          Class122.method2793(var52, var40, var41);
                                          Class122.method2796(var42, var44, var45, var52, var40, var41, var25);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }
}
