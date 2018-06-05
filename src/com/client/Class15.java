package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public enum Class15 implements Class188 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lm;"
   )
   field108(2, (byte)0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lm;"
   )
   field107(3, (byte)1),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lm;"
   )
   field112(0, (byte)2),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lm;"
   )
   field106(1, (byte)3);

   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -640646291
   )
   final int field110;
   @ObfuscatedName("q")
   final byte field111;

   Class15(int var3, byte var4) {
      this.field110 = var3;
      this.field111 = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
   )
   public int vmethod5815() {
      return this.field111;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)[Lm;",
      garbageValue = "-1961233435"
   )
   static Class15[] method145() {
      return new Class15[]{field106, field107, field108, field112};
   }

   @ObfuscatedName("gw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2126633421"
   )
   static final void method148() {
      Class14.method137(false);
      Client.field633 = 0;
      boolean var0 = true;

      int var1;
      for(var1 = 0; var1 < Class171.field2252.length; ++var1) {
         if (Class295.field3676[var1] != -1 && Class171.field2252[var1] == null) {
            Class171.field2252[var1] = Class246.field3159.method4625(Class295.field3676[var1], 0);
            if (Class171.field2252[var1] == null) {
               var0 = false;
               ++Client.field633;
            }
         }

         if (Class9.field56[var1] != -1 && Class29.field253[var1] == null) {
            Class29.field253[var1] = Class246.field3159.method4628(Class9.field56[var1], 0, Class67.field973[var1]);
            if (Class29.field253[var1] == null) {
               var0 = false;
               ++Client.field633;
            }
         }
      }

      if (!var0) {
         Client.field751 = 1;
      } else {
         Client.field635 = 0;
         var0 = true;

         int var3;
         int var4;
         for(var1 = 0; var1 < Class171.field2252.length; ++var1) {
            byte[] var2 = Class29.field253[var1];
            if (var2 != null) {
               var3 = (Class143.field1900[var1] >> 8) * 64 - Class62.field868;
               var4 = (Class143.field1900[var1] & 255) * 64 - Client.field754;
               if (Client.field759) {
                  var3 = 10;
                  var4 = 10;
               }

               var0 &= Class33.method557(var2, var3, var4);
            }
         }

         if (!var0) {
            Client.field751 = 2;
         } else {
            if (Client.field751 != 0) {
               Class83.method1933("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
            }

            Class54.method1017();
            Class28.field248.method2903();

            for(var1 = 0; var1 < 4; ++var1) {
               Client.field642[var1].method3392();
            }

            int var44;
            for(var1 = 0; var1 < 4; ++var1) {
               for(var44 = 0; var44 < 104; ++var44) {
                  for(var3 = 0; var3 < 104; ++var3) {
                     Class50.field443[var1][var44][var3] = 0;
                  }
               }
            }

            Class54.method1017();
            Class40.method695();
            var1 = Class171.field2252.length;

            for(Class68 var62 = (Class68)Class68.field985.method4098(); var62 != null; var62 = (Class68)Class68.field985.method4079()) {
               if (var62.field993 != null) {
                  Class36.field310.method2009(var62.field993);
                  var62.field993 = null;
               }

               if (var62.field980 != null) {
                  Class36.field310.method2009(var62.field980);
                  var62.field980 = null;
               }
            }

            Class68.field985.method4072();
            Class14.method137(true);
            int var6;
            int var7;
            int var9;
            int var10;
            int var11;
            int var12;
            int var14;
            int var15;
            int var16;
            int var17;
            int var19;
            int var20;
            int var21;
            int var46;
            int var49;
            int var52;
            if (!Client.field759) {
               byte[] var5;
               for(var44 = 0; var44 < var1; ++var44) {
                  var3 = (Class143.field1900[var44] >> 8) * 64 - Class62.field868;
                  var4 = (Class143.field1900[var44] & 255) * 64 - Client.field754;
                  var5 = Class171.field2252[var44];
                  if (var5 != null) {
                     Class54.method1017();
                     var6 = Class27.field224 * 8 - 48;
                     var7 = Class34.field301 * 8 - 48;
                     Class164[] var8 = Client.field642;

                     for(var9 = 0; var9 < 4; ++var9) {
                        for(var10 = 0; var10 < 64; ++var10) {
                           for(var11 = 0; var11 < 64; ++var11) {
                              if (var10 + var3 > 0 && var3 + var10 < 103 && var11 + var4 > 0 && var11 + var4 < 103) {
                                 var8[var9].field2029[var10 + var3][var4 + var11] &= -16777217;
                              }
                           }
                        }
                     }

                     Class182 var45 = new Class182(var5);

                     for(var10 = 0; var10 < 4; ++var10) {
                        for(var11 = 0; var11 < 64; ++var11) {
                           for(var12 = 0; var12 < 64; ++var12) {
                              Class65.method1603(var45, var10, var11 + var3, var12 + var4, var6, var7, 0);
                           }
                        }
                     }
                  }
               }

               for(var44 = 0; var44 < var1; ++var44) {
                  var3 = (Class143.field1900[var44] >> 8) * 64 - Class62.field868;
                  var4 = (Class143.field1900[var44] & 255) * 64 - Client.field754;
                  var5 = Class171.field2252[var44];
                  if (var5 == null && Class34.field301 < 800) {
                     Class54.method1017();
                     Class177.method3510(var3, var4, 64, 64);
                  }
               }

               Class14.method137(true);

               for(var44 = 0; var44 < var1; ++var44) {
                  byte[] var48 = Class29.field253[var44];
                  if (var48 != null) {
                     var4 = (Class143.field1900[var44] >> 8) * 64 - Class62.field868;
                     var46 = (Class143.field1900[var44] & 255) * 64 - Client.field754;
                     Class54.method1017();
                     Class125 var50 = Class28.field248;
                     Class164[] var51 = Client.field642;
                     Class182 var66 = new Class182(var48);
                     var9 = -1;

                     while(true) {
                        var10 = var66.method3563();
                        if (var10 == 0) {
                           break;
                        }

                        var9 += var10;
                        var11 = 0;

                        while(true) {
                           var12 = var66.method3562();
                           if (var12 == 0) {
                              break;
                           }

                           var11 += var12 - 1;
                           var49 = var11 & 63;
                           var14 = var11 >> 6 & 63;
                           var15 = var11 >> 12;
                           var16 = var66.method3544();
                           var17 = var16 >> 2;
                           var52 = var16 & 3;
                           var19 = var4 + var14;
                           var20 = var49 + var46;
                           if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                              var21 = var15;
                              if ((Class50.field443[1][var19][var20] & 2) == 2) {
                                 var21 = var15 - 1;
                              }

                              Class164 var55 = null;
                              if (var21 >= 0) {
                                 var55 = var51[var21];
                              }

                              Class171.method3450(var15, var19, var20, var9, var52, var17, var50, var55);
                           }
                        }
                     }
                  }
               }
            }

            int var22;
            int var23;
            int var24;
            int var25;
            int var26;
            int var27;
            int var28;
            int var29;
            int var32;
            int var33;
            int var34;
            int var35;
            int var36;
            int var38;
            int var39;
            int var40;
            int var47;
            if (Client.field759) {
               Class164[] var18;
               Class182 var56;
               for(var44 = 0; var44 < 4; ++var44) {
                  Class54.method1017();

                  for(var3 = 0; var3 < 13; ++var3) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        boolean var71 = false;
                        var6 = Client.field645[var44][var3][var4];
                        if (var6 != -1) {
                           var7 = var6 >> 24 & 3;
                           var47 = var6 >> 1 & 3;
                           var9 = var6 >> 14 & 1023;
                           var10 = var6 >> 3 & 2047;
                           var11 = (var9 / 8 << 8) + var10 / 8;

                           for(var12 = 0; var12 < Class143.field1900.length; ++var12) {
                              if (Class143.field1900[var12] == var11 && Class171.field2252[var12] != null) {
                                 byte[] var13 = Class171.field2252[var12];
                                 var14 = var3 * 8;
                                 var15 = var4 * 8;
                                 var16 = (var9 & 7) * 8;
                                 var17 = (var10 & 7) * 8;
                                 var18 = Client.field642;

                                 for(var19 = 0; var19 < 8; ++var19) {
                                    for(var20 = 0; var20 < 8; ++var20) {
                                       if (var14 + var19 > 0 && var14 + var19 < 103 && var20 + var15 > 0 && var20 + var15 < 103) {
                                          var18[var44].field2029[var14 + var19][var20 + var15] &= -16777217;
                                       }
                                    }
                                 }

                                 var56 = new Class182(var13);

                                 for(var20 = 0; var20 < 4; ++var20) {
                                    for(var21 = 0; var21 < 64; ++var21) {
                                       for(var22 = 0; var22 < 64; ++var22) {
                                          if (var20 == var7 && var21 >= var16 && var21 < var16 + 8 && var22 >= var17 && var22 < var17 + 8) {
                                             var27 = var21 & 7;
                                             var28 = var22 & 7;
                                             var29 = var47 & 3;
                                             if (var29 == 0) {
                                                var26 = var27;
                                             } else if (var29 == 1) {
                                                var26 = var28;
                                             } else if (var29 == 2) {
                                                var26 = 7 - var27;
                                             } else {
                                                var26 = 7 - var28;
                                             }

                                             Class65.method1603(var56, var44, var26 + var14, var15 + Class75.method1802(var21 & 7, var22 & 7, var47), 0, 0, var47);
                                          } else {
                                             Class65.method1603(var56, 0, -1, -1, 0, 0, 0);
                                          }
                                       }
                                    }
                                 }

                                 var71 = true;
                                 break;
                              }
                           }
                        }

                        if (!var71) {
                           Class160.method3338(var44, var3 * 8, var4 * 8);
                        }
                     }
                  }
               }

               for(var44 = 0; var44 < 13; ++var44) {
                  for(var3 = 0; var3 < 13; ++var3) {
                     var4 = Client.field645[0][var44][var3];
                     if (var4 == -1) {
                        Class177.method3510(var44 * 8, var3 * 8, 8, 8);
                     }
                  }
               }

               Class14.method137(true);

               for(var44 = 0; var44 < 4; ++var44) {
                  Class54.method1017();

                  for(var3 = 0; var3 < 13; ++var3) {
                     label1302:
                     for(var4 = 0; var4 < 13; ++var4) {
                        var46 = Client.field645[var44][var3][var4];
                        if (var46 != -1) {
                           var6 = var46 >> 24 & 3;
                           var7 = var46 >> 1 & 3;
                           var47 = var46 >> 14 & 1023;
                           var9 = var46 >> 3 & 2047;
                           var10 = (var47 / 8 << 8) + var9 / 8;

                           for(var11 = 0; var11 < Class143.field1900.length; ++var11) {
                              if (Class143.field1900[var11] == var10 && Class29.field253[var11] != null) {
                                 byte[] var58 = Class29.field253[var11];
                                 var49 = var3 * 8;
                                 var14 = var4 * 8;
                                 var15 = (var47 & 7) * 8;
                                 var16 = (var9 & 7) * 8;
                                 Class125 var53 = Class28.field248;
                                 var18 = Client.field642;
                                 var56 = new Class182(var58);
                                 var20 = -1;

                                 while(true) {
                                    var21 = var56.method3563();
                                    if (var21 == 0) {
                                       continue label1302;
                                    }

                                    var20 += var21;
                                    var22 = 0;

                                    while(true) {
                                       var23 = var56.method3562();
                                       if (var23 == 0) {
                                          break;
                                       }

                                       var22 += var23 - 1;
                                       var24 = var22 & 63;
                                       var25 = var22 >> 6 & 63;
                                       var26 = var22 >> 12;
                                       var27 = var56.method3544();
                                       var28 = var27 >> 2;
                                       var29 = var27 & 3;
                                       if (var6 == var26 && var25 >= var15 && var25 < var15 + 8 && var24 >= var16 && var24 < var16 + 8) {
                                          Class268 var59 = Class110.method2527(var20);
                                          var33 = var25 & 7;
                                          var34 = var24 & 7;
                                          var36 = var59.field3384;
                                          int var60 = var59.field3385;
                                          if ((var29 & 1) == 1) {
                                             var38 = var36;
                                             var36 = var60;
                                             var60 = var38;
                                          }

                                          var35 = var7 & 3;
                                          if (var35 == 0) {
                                             var32 = var33;
                                          } else if (var35 == 1) {
                                             var32 = var34;
                                          } else if (var35 == 2) {
                                             var32 = 7 - var33 - (var36 - 1);
                                          } else {
                                             var32 = 7 - var34 - (var60 - 1);
                                          }

                                          var38 = var49 + var32;
                                          var39 = var14 + Class86.method1970(var25 & 7, var24 & 7, var7, var59.field3384, var59.field3385, var29);
                                          if (var38 > 0 && var39 > 0 && var38 < 103 && var39 < 103) {
                                             var40 = var44;
                                             if ((Class50.field443[1][var38][var39] & 2) == 2) {
                                                var40 = var44 - 1;
                                             }

                                             Class164 var61 = null;
                                             if (var40 >= 0) {
                                                var61 = var18[var40];
                                             }

                                             Class171.method3450(var44, var38, var39, var20, var7 + var29 & 3, var28, var53, var61);
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

            Class14.method137(true);
            Class54.method1017();
            Class125 var63 = Class28.field248;
            Class164[] var72 = Client.field642;

            for(var4 = 0; var4 < 4; ++var4) {
               for(var46 = 0; var46 < 104; ++var46) {
                  for(var6 = 0; var6 < 104; ++var6) {
                     if ((Class50.field443[var4][var46][var6] & 1) == 1) {
                        var7 = var4;
                        if ((Class50.field443[1][var46][var6] & 2) == 2) {
                           var7 = var4 - 1;
                        }

                        if (var7 >= 0) {
                           var72[var7].method3395(var46, var6);
                        }
                     }
                  }
               }
            }

            Class50.field457 += (int)(Math.random() * 5.0D) - 2;
            if (Class50.field457 < -8) {
               Class50.field457 = -8;
            }

            if (Class50.field457 > 8) {
               Class50.field457 = 8;
            }

            Class50.field455 += (int)(Math.random() * 5.0D) - 2;
            if (Class50.field455 < -16) {
               Class50.field455 = -16;
            }

            if (Class50.field455 > 16) {
               Class50.field455 = 16;
            }

            for(var4 = 0; var4 < 4; ++var4) {
               byte[][] var64 = Class50.field447[var4];
               var11 = (int)Math.sqrt(5100.0D);
               var12 = var11 * 768 >> 8;

               for(var49 = 1; var49 < 103; ++var49) {
                  for(var14 = 1; var14 < 103; ++var14) {
                     var15 = Class50.field459[var4][var14 + 1][var49] - Class50.field459[var4][var14 - 1][var49];
                     var16 = Class50.field459[var4][var14][var49 + 1] - Class50.field459[var4][var14][var49 - 1];
                     var17 = (int)Math.sqrt((double)(var16 * var16 + var15 * var15 + 65536));
                     var52 = (var15 << 8) / var17;
                     var19 = 65536 / var17;
                     var20 = (var16 << 8) / var17;
                     var21 = (var52 * -50 + var20 * -50 + var19 * -10) / var12 + 96;
                     var22 = (var64[var14 - 1][var49] >> 2) + (var64[var14][var49 - 1] >> 2) + (var64[var14 + 1][var49] >> 3) + (var64[var14][var49 + 1] >> 3) + (var64[var14][var49] >> 1);
                     Class50.field448[var14][var49] = var21 - var22;
                  }
               }

               for(var49 = 0; var49 < 104; ++var49) {
                  Class50.field454[var49] = 0;
                  Class305.field3725[var49] = 0;
                  Class72.field1035[var49] = 0;
                  Class263.field3325[var49] = 0;
                  Class243.field3137[var49] = 0;
               }

               for(var49 = -5; var49 < 109; ++var49) {
                  for(var14 = 0; var14 < 104; ++var14) {
                     var15 = var49 + 5;
                     if (var15 >= 0 && var15 < 104) {
                        var16 = Class50.field445[var4][var15][var14] & 255;
                        if (var16 > 0) {
                           Class259 var73 = Class49.method953(var16 - 1);
                           Class50.field454[var14] += var73.field3284;
                           Class305.field3725[var14] += var73.field3287;
                           Class72.field1035[var14] += var73.field3286;
                           Class263.field3325[var14] += var73.field3281;
                           ++Class243.field3137[var14];
                        }
                     }

                     var16 = var49 - 5;
                     if (var16 >= 0 && var16 < 104) {
                        var17 = Class50.field445[var4][var16][var14] & 255;
                        if (var17 > 0) {
                           Class259 var67 = Class49.method953(var17 - 1);
                           Class50.field454[var14] -= var67.field3284;
                           Class305.field3725[var14] -= var67.field3287;
                           Class72.field1035[var14] -= var67.field3286;
                           Class263.field3325[var14] -= var67.field3281;
                           --Class243.field3137[var14];
                        }
                     }
                  }

                  if (var49 >= 1 && var49 < 103) {
                     var14 = 0;
                     var15 = 0;
                     var16 = 0;
                     var17 = 0;
                     var52 = 0;

                     for(var19 = -5; var19 < 109; ++var19) {
                        var20 = var19 + 5;
                        if (var20 >= 0 && var20 < 104) {
                           var14 += Class50.field454[var20];
                           var15 += Class305.field3725[var20];
                           var16 += Class72.field1035[var20];
                           var17 += Class263.field3325[var20];
                           var52 += Class243.field3137[var20];
                        }

                        var21 = var19 - 5;
                        if (var21 >= 0 && var21 < 104) {
                           var14 -= Class50.field454[var21];
                           var15 -= Class305.field3725[var21];
                           var16 -= Class72.field1035[var21];
                           var17 -= Class263.field3325[var21];
                           var52 -= Class243.field3137[var21];
                        }

                        if (var19 >= 1 && var19 < 103 && (!Client.field585 || (Class50.field443[0][var49][var19] & 2) != 0 || (Class50.field443[var4][var49][var19] & 16) == 0)) {
                           if (var4 < Class50.field442) {
                              Class50.field442 = var4;
                           }

                           var22 = Class50.field445[var4][var49][var19] & 255;
                           var23 = Class165.field2033[var4][var49][var19] & 255;
                           if (var22 > 0 || var23 > 0) {
                              var24 = Class50.field459[var4][var49][var19];
                              var25 = Class50.field459[var4][var49 + 1][var19];
                              var26 = Class50.field459[var4][var49 + 1][var19 + 1];
                              var27 = Class50.field459[var4][var49][var19 + 1];
                              var28 = Class50.field448[var49][var19];
                              var29 = Class50.field448[var49 + 1][var19];
                              int var30 = Class50.field448[var49 + 1][var19 + 1];
                              int var31 = Class50.field448[var49][var19 + 1];
                              var32 = -1;
                              var33 = -1;
                              if (var22 > 0) {
                                 var34 = var14 * 256 / var17;
                                 var35 = var15 / var52;
                                 var36 = var16 / var52;
                                 var32 = Class34.method560(var34, var35, var36);
                                 var34 = var34 + Class50.field457 & 255;
                                 var36 += Class50.field455;
                                 if (var36 < 0) {
                                    var36 = 0;
                                 } else if (var36 > 255) {
                                    var36 = 255;
                                 }

                                 var33 = Class34.method560(var34, var35, var36);
                              }

                              if (var4 > 0) {
                                 boolean var69 = true;
                                 if (var22 == 0 && Class50.field446[var4][var49][var19] != 0) {
                                    var69 = false;
                                 }

                                 if (var23 > 0 && !Class1.method15(var23 - 1).field3523) {
                                    var69 = false;
                                 }

                                 if (var69 && var24 == var25 && var24 == var26 && var24 == var27) {
                                    Class37.field325[var4][var49][var19] |= 2340;
                                 }
                              }

                              var34 = 0;
                              if (var33 != -1) {
                                 var34 = Class122.field1675[Class102.method2248(var33, 96)];
                              }

                              if (var23 == 0) {
                                 var63.method3000(var4, var49, var19, 0, 0, -1, var24, var25, var26, var27, Class102.method2248(var32, var28), Class102.method2248(var32, var29), Class102.method2248(var32, var30), Class102.method2248(var32, var31), 0, 0, 0, 0, var34, 0);
                              } else {
                                 var35 = Class50.field446[var4][var49][var19] + 1;
                                 byte var70 = Class19.field159[var4][var49][var19];
                                 Class272 var37 = Class1.method15(var23 - 1);
                                 var38 = var37.field3526;
                                 int var41;
                                 int var42;
                                 if (var38 >= 0) {
                                    var40 = Class122.field1667.vmethod3092(var38);
                                    var39 = -1;
                                 } else if (var37.field3533 == 16711935) {
                                    var39 = -2;
                                    var38 = -1;
                                    var40 = -2;
                                 } else {
                                    var39 = Class34.method560(var37.field3525, var37.field3530, var37.field3531);
                                    var41 = var37.field3525 + Class50.field457 & 255;
                                    var42 = var37.field3531 + Class50.field455;
                                    if (var42 < 0) {
                                       var42 = 0;
                                    } else if (var42 > 255) {
                                       var42 = 255;
                                    }

                                    var40 = Class34.method560(var41, var37.field3530, var42);
                                 }

                                 var41 = 0;
                                 if (var40 != -2) {
                                    var41 = Class122.field1675[Class30.method519(var40, 96)];
                                 }

                                 if (var37.field3528 != -1) {
                                    var42 = var37.field3527 + Class50.field457 & 255;
                                    int var43 = var37.field3534 + Class50.field455;
                                    if (var43 < 0) {
                                       var43 = 0;
                                    } else if (var43 > 255) {
                                       var43 = 255;
                                    }

                                    var40 = Class34.method560(var42, var37.field3532, var43);
                                    var41 = Class122.field1675[Class30.method519(var40, 96)];
                                 }

                                 var63.method3000(var4, var49, var19, var35, var70, var38, var24, var25, var26, var27, Class102.method2248(var32, var28), Class102.method2248(var32, var29), Class102.method2248(var32, var30), Class102.method2248(var32, var31), Class30.method519(var39, var28), Class30.method519(var39, var29), Class30.method519(var39, var30), Class30.method519(var39, var31), var34, var41);
                              }
                           }
                        }
                     }
                  }
               }

               for(var49 = 1; var49 < 103; ++var49) {
                  for(var14 = 1; var14 < 103; ++var14) {
                     if ((Class50.field443[var4][var14][var49] & 8) != 0) {
                        var19 = 0;
                     } else if (var4 > 0 && (Class50.field443[1][var14][var49] & 2) != 0) {
                        var19 = var4 - 1;
                     } else {
                        var19 = var4;
                     }

                     var63.method2876(var4, var14, var49, var19);
                  }
               }

               Class50.field445[var4] = null;
               Class165.field2033[var4] = null;
               Class50.field446[var4] = null;
               Class19.field159[var4] = null;
               Class50.field447[var4] = null;
            }

            var63.method3038(-50, -10, -50);

            for(var4 = 0; var4 < 104; ++var4) {
               for(var46 = 0; var46 < 104; ++var46) {
                  if ((Class50.field443[1][var4][var46] & 2) == 2) {
                     var63.method3041(var4, var46);
                  }
               }
            }

            var4 = 1;
            var46 = 2;
            var6 = 4;

            for(var7 = 0; var7 < 4; ++var7) {
               if (var7 > 0) {
                  var4 <<= 3;
                  var46 <<= 3;
                  var6 <<= 3;
               }

               for(var47 = 0; var47 <= var7; ++var47) {
                  for(var9 = 0; var9 <= 104; ++var9) {
                     for(var10 = 0; var10 <= 104; ++var10) {
                        short var68;
                        if ((Class37.field325[var47][var10][var9] & var4) != 0) {
                           var11 = var9;
                           var12 = var9;
                           var49 = var47;

                           for(var14 = var47; var11 > 0 && (Class37.field325[var47][var10][var11 - 1] & var4) != 0; --var11) {
                              ;
                           }

                           while(var12 < 104 && (Class37.field325[var47][var10][var12 + 1] & var4) != 0) {
                              ++var12;
                           }

                           label1030:
                           while(var49 > 0) {
                              for(var15 = var11; var15 <= var12; ++var15) {
                                 if ((Class37.field325[var49 - 1][var10][var15] & var4) == 0) {
                                    break label1030;
                                 }
                              }

                              --var49;
                           }

                           label1019:
                           while(var14 < var7) {
                              for(var15 = var11; var15 <= var12; ++var15) {
                                 if ((Class37.field325[var14 + 1][var10][var15] & var4) == 0) {
                                    break label1019;
                                 }
                              }

                              ++var14;
                           }

                           var15 = (var12 - var11 + 1) * (var14 + 1 - var49);
                           if (var15 >= 8) {
                              var68 = 240;
                              var17 = Class50.field459[var14][var10][var11] - var68;
                              var52 = Class50.field459[var49][var10][var11];
                              Class125.method2997(var7, 1, var10 * 128, var10 * 128, var11 * 128, var12 * 128 + 128, var17, var52);

                              for(var19 = var49; var19 <= var14; ++var19) {
                                 for(var20 = var11; var20 <= var12; ++var20) {
                                    Class37.field325[var19][var10][var20] &= ~var4;
                                 }
                              }
                           }
                        }

                        if ((Class37.field325[var47][var10][var9] & var46) != 0) {
                           var11 = var10;
                           var12 = var10;
                           var49 = var47;

                           for(var14 = var47; var11 > 0 && (Class37.field325[var47][var11 - 1][var9] & var46) != 0; --var11) {
                              ;
                           }

                           while(var12 < 104 && (Class37.field325[var47][var12 + 1][var9] & var46) != 0) {
                              ++var12;
                           }

                           label1083:
                           while(var49 > 0) {
                              for(var15 = var11; var15 <= var12; ++var15) {
                                 if ((Class37.field325[var49 - 1][var15][var9] & var46) == 0) {
                                    break label1083;
                                 }
                              }

                              --var49;
                           }

                           label1072:
                           while(var14 < var7) {
                              for(var15 = var11; var15 <= var12; ++var15) {
                                 if ((Class37.field325[var14 + 1][var15][var9] & var46) == 0) {
                                    break label1072;
                                 }
                              }

                              ++var14;
                           }

                           var15 = (var12 - var11 + 1) * (var14 + 1 - var49);
                           if (var15 >= 8) {
                              var68 = 240;
                              var17 = Class50.field459[var14][var11][var9] - var68;
                              var52 = Class50.field459[var49][var11][var9];
                              Class125.method2997(var7, 2, var11 * 128, var12 * 128 + 128, var9 * 128, var9 * 128, var17, var52);

                              for(var19 = var49; var19 <= var14; ++var19) {
                                 for(var20 = var11; var20 <= var12; ++var20) {
                                    Class37.field325[var19][var20][var9] &= ~var46;
                                 }
                              }
                           }
                        }

                        if ((Class37.field325[var47][var10][var9] & var6) != 0) {
                           var11 = var10;
                           var12 = var10;
                           var49 = var9;

                           for(var14 = var9; var49 > 0 && (Class37.field325[var47][var10][var49 - 1] & var6) != 0; --var49) {
                              ;
                           }

                           while(var14 < 104 && (Class37.field325[var47][var10][var14 + 1] & var6) != 0) {
                              ++var14;
                           }

                           label1136:
                           while(var11 > 0) {
                              for(var15 = var49; var15 <= var14; ++var15) {
                                 if ((Class37.field325[var47][var11 - 1][var15] & var6) == 0) {
                                    break label1136;
                                 }
                              }

                              --var11;
                           }

                           label1125:
                           while(var12 < 104) {
                              for(var15 = var49; var15 <= var14; ++var15) {
                                 if ((Class37.field325[var47][var12 + 1][var15] & var6) == 0) {
                                    break label1125;
                                 }
                              }

                              ++var12;
                           }

                           if ((var14 - var49 + 1) * (var12 - var11 + 1) >= 4) {
                              var15 = Class50.field459[var47][var11][var49];
                              Class125.method2997(var7, 4, var11 * 128, var12 * 128 + 128, var49 * 128, var14 * 128 + 128, var15, var15);

                              for(var16 = var11; var16 <= var12; ++var16) {
                                 for(var17 = var49; var17 <= var14; ++var17) {
                                    Class37.field325[var47][var16][var17] &= ~var6;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            Class14.method137(true);
            var4 = Class50.field442;
            if (var4 > Class13.field82) {
               var4 = Class13.field82;
            }

            if (var4 < Class13.field82 - 1) {
               var4 = Class13.field82 - 1;
            }

            if (Client.field585) {
               Class28.field248.method2904(Class50.field442);
            } else {
               Class28.field248.method2904(0);
            }

            for(var46 = 0; var46 < 104; ++var46) {
               for(var6 = 0; var6 < 104; ++var6) {
                  Class253.method4808(var46, var6);
               }
            }

            Class54.method1017();
            Class160.method3342();
            Class268.field3391.method3984();
            Class172 var65;
            if (Class182.field2334.method801()) {
               var65 = Class26.method433(Class169.field2148, Client.field626.field1218);
               var65.field2257.method3707(1057001181);
               Client.field626.method1980(var65);
            }

            if (!Client.field759) {
               var46 = (Class27.field224 - 6) / 8;
               var6 = (Class27.field224 + 6) / 8;
               var7 = (Class34.field301 - 6) / 8;
               var47 = (Class34.field301 + 6) / 8;

               for(var9 = var46 - 1; var9 <= var6 + 1; ++var9) {
                  for(var10 = var7 - 1; var10 <= var47 + 1; ++var10) {
                     if (var9 < var46 || var9 > var6 || var10 < var7 || var10 > var47) {
                        Class246.field3159.method4648("m" + var9 + "_" + var10);
                        Class246.field3159.method4648("l" + var9 + "_" + var10);
                     }
                  }
               }
            }

            Class48.method947(30);
            Class54.method1017();
            Class49.method952();
            var65 = Class26.method433(Class169.field2224, Client.field626.field1218);
            Client.field626.method1980(var65);
            Class43.field368.vmethod3330();

            for(var6 = 0; var6 < 32; ++var6) {
               Class47.field394[var6] = 0L;
            }

            for(var6 = 0; var6 < 32; ++var6) {
               Class47.field404[var6] = 0L;
            }

            Class8.field48 = 0;
         }
      }
   }
}
