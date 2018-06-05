package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
public class Class64 extends Class204 {
   @ObfuscatedName("d")
   static int[] field936;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -854731803
   )
   int field934;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1588453017
   )
   int field935;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1549500065
   )
   int field938;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 2023364683
   )
   int field937;

   Class64(int var1, int var2, int var3, int var4) {
      this.field934 = var1;
      this.field935 = var2;
      this.field938 = var3;
      this.field937 = var4;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-2116871828"
   )
   void method1559(int var1, int var2, int var3, int var4) {
      this.field934 = var1;
      this.field935 = var2;
      this.field938 = var3;
      this.field937 = var4;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "66"
   )
   static void method1560() {
      Class224.field2554 = new int[2000];
      int var0 = 0;
      int var1 = 240;

      int var3;
      for(byte var2 = 12; var0 < 16; var1 -= var2) {
         var3 = Class143.method3167((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + (float)var0 * 0.425F / 16.0F));
         Class224.field2554[var0] = var3;
         ++var0;
      }

      var1 = 48;

      for(int var5 = var1 / 6; var0 < Class224.field2554.length; var1 -= var5) {
         var3 = var0 * 2;

         for(int var4 = Class143.method3167((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < Class224.field2554.length; ++var0) {
            Class224.field2554[var0] = var4;
         }
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(ILce;ZB)I",
      garbageValue = "-95"
   )
   static int method1558(int var0, Class84 var1, boolean var2) {
      int var3;
      if (var0 == 6600) {
         var3 = Class13.field82;
         int var13 = (Class138.field1876.field931 >> 7) + Class62.field868;
         int var5 = (Class138.field1876.field881 >> 7) + Client.field754;
         Class18.method196().method6011(var3, var13, var5, true);
         return 1;
      } else {
         Class20 var15;
         if (var0 == 6601) {
            var3 = Class69.field999[--Class69.field1003];
            String var20 = "";
            var15 = Class18.method196().method6029(var3);
            if (var15 != null) {
               var20 = var15.method210();
            }

            Class69.field1001[++Class55.field497 - 1] = var20;
            return 1;
         } else if (var0 == 6602) {
            var3 = Class69.field999[--Class69.field1003];
            Class18.method196().method6012(var3);
            return 1;
         } else if (var0 == 6603) {
            Class69.field999[++Class69.field1003 - 1] = Class18.method196().method6026();
            return 1;
         } else if (var0 == 6604) {
            var3 = Class69.field999[--Class69.field1003];
            Class18.method196().method6023(var3);
            return 1;
         } else if (var0 == 6605) {
            Class69.field999[++Class69.field1003 - 1] = Class18.method196().method6096() ? 1 : 0;
            return 1;
         } else {
            Class226 var19;
            if (var0 == 6606) {
               var19 = new Class226(Class69.field999[--Class69.field1003]);
               Class18.method196().method6054(var19.field2564, var19.field2565);
               return 1;
            } else if (var0 == 6607) {
               var19 = new Class226(Class69.field999[--Class69.field1003]);
               Class18.method196().method6031(var19.field2564, var19.field2565);
               return 1;
            } else if (var0 == 6608) {
               var19 = new Class226(Class69.field999[--Class69.field1003]);
               Class18.method196().method6046(var19.field2567, var19.field2564, var19.field2565);
               return 1;
            } else if (var0 == 6609) {
               var19 = new Class226(Class69.field999[--Class69.field1003]);
               Class18.method196().method6033(var19.field2567, var19.field2564, var19.field2565);
               return 1;
            } else if (var0 == 6610) {
               Class69.field999[++Class69.field1003 - 1] = Class18.method196().method6002();
               Class69.field999[++Class69.field1003 - 1] = Class18.method196().method6035();
               return 1;
            } else {
               Class20 var17;
               if (var0 == 6611) {
                  var3 = Class69.field999[--Class69.field1003];
                  var17 = Class18.method196().method6029(var3);
                  if (var17 == null) {
                     Class69.field999[++Class69.field1003 - 1] = 0;
                  } else {
                     Class69.field999[++Class69.field1003 - 1] = var17.method256().method4437();
                  }

                  return 1;
               } else if (var0 == 6612) {
                  var3 = Class69.field999[--Class69.field1003];
                  var17 = Class18.method196().method6029(var3);
                  if (var17 == null) {
                     Class69.field999[++Class69.field1003 - 1] = 0;
                     Class69.field999[++Class69.field1003 - 1] = 0;
                  } else {
                     Class69.field999[++Class69.field1003 - 1] = (var17.method214() - var17.method258() + 1) * 64;
                     Class69.field999[++Class69.field1003 - 1] = (var17.method249() - var17.method247() + 1) * 64;
                  }

                  return 1;
               } else if (var0 == 6613) {
                  var3 = Class69.field999[--Class69.field1003];
                  var17 = Class18.method196().method6029(var3);
                  if (var17 == null) {
                     Class69.field999[++Class69.field1003 - 1] = 0;
                     Class69.field999[++Class69.field1003 - 1] = 0;
                     Class69.field999[++Class69.field1003 - 1] = 0;
                     Class69.field999[++Class69.field1003 - 1] = 0;
                  } else {
                     Class69.field999[++Class69.field1003 - 1] = var17.method258() * 64;
                     Class69.field999[++Class69.field1003 - 1] = var17.method247() * 64;
                     Class69.field999[++Class69.field1003 - 1] = var17.method214() * 64 + 64 - 1;
                     Class69.field999[++Class69.field1003 - 1] = var17.method249() * 64 + 64 - 1;
                  }

                  return 1;
               } else if (var0 == 6614) {
                  var3 = Class69.field999[--Class69.field1003];
                  var17 = Class18.method196().method6029(var3);
                  if (var17 == null) {
                     Class69.field999[++Class69.field1003 - 1] = -1;
                  } else {
                     Class69.field999[++Class69.field1003 - 1] = var17.method212();
                  }

                  return 1;
               } else if (var0 == 6615) {
                  var19 = Class18.method196().method6001();
                  if (var19 == null) {
                     Class69.field999[++Class69.field1003 - 1] = -1;
                     Class69.field999[++Class69.field1003 - 1] = -1;
                  } else {
                     Class69.field999[++Class69.field1003 - 1] = var19.field2564;
                     Class69.field999[++Class69.field1003 - 1] = var19.field2565;
                  }

                  return 1;
               } else if (var0 == 6616) {
                  Class69.field999[++Class69.field1003 - 1] = Class18.method196().method6153();
                  return 1;
               } else if (var0 == 6617) {
                  var19 = new Class226(Class69.field999[--Class69.field1003]);
                  var17 = Class18.method196().method6014();
                  if (var17 == null) {
                     Class69.field999[++Class69.field1003 - 1] = -1;
                     Class69.field999[++Class69.field1003 - 1] = -1;
                     return 1;
                  } else {
                     int[] var18 = var17.method213(var19.field2567, var19.field2564, var19.field2565);
                     if (var18 == null) {
                        Class69.field999[++Class69.field1003 - 1] = -1;
                        Class69.field999[++Class69.field1003 - 1] = -1;
                     } else {
                        Class69.field999[++Class69.field1003 - 1] = var18[0];
                        Class69.field999[++Class69.field1003 - 1] = var18[1];
                     }

                     return 1;
                  }
               } else {
                  Class226 var11;
                  if (var0 == 6618) {
                     var19 = new Class226(Class69.field999[--Class69.field1003]);
                     var17 = Class18.method196().method6014();
                     if (var17 == null) {
                        Class69.field999[++Class69.field1003 - 1] = -1;
                        Class69.field999[++Class69.field1003 - 1] = -1;
                        return 1;
                     } else {
                        var11 = var17.method205(var19.field2564, var19.field2565);
                        if (var11 == null) {
                           Class69.field999[++Class69.field1003 - 1] = -1;
                        } else {
                           Class69.field999[++Class69.field1003 - 1] = var11.method4437();
                        }

                        return 1;
                     }
                  } else {
                     int var6;
                     int var7;
                     int var8;
                     Class226 var9;
                     Class226 var16;
                     if (var0 == 6619) {
                        Class69.field1003 -= 2;
                        var3 = Class69.field999[Class69.field1003];
                        var16 = new Class226(Class69.field999[Class69.field1003 + 1]);
                        var15 = Class18.method196().method6029(var3);
                        var6 = Class138.field1876.field567;
                        var7 = (Class138.field1876.field931 >> 7) + Class62.field868;
                        var8 = (Class138.field1876.field881 >> 7) + Client.field754;
                        var9 = new Class226(var6, var7, var8);
                        Class18.method196().method6073(var15, var9, var16, false);
                        return 1;
                     } else if (var0 == 6620) {
                        Class69.field1003 -= 2;
                        var3 = Class69.field999[Class69.field1003];
                        var16 = new Class226(Class69.field999[Class69.field1003 + 1]);
                        var15 = Class18.method196().method6029(var3);
                        var6 = Class138.field1876.field567;
                        var7 = (Class138.field1876.field931 >> 7) + Class62.field868;
                        var8 = (Class138.field1876.field881 >> 7) + Client.field754;
                        var9 = new Class226(var6, var7, var8);
                        Class18.method196().method6073(var15, var9, var16, true);
                        return 1;
                     } else if (var0 == 6621) {
                        Class69.field1003 -= 2;
                        var3 = Class69.field999[Class69.field1003];
                        var16 = new Class226(Class69.field999[Class69.field1003 + 1]);
                        var15 = Class18.method196().method6029(var3);
                        if (var15 == null) {
                           Class69.field999[++Class69.field1003 - 1] = 0;
                           return 1;
                        } else {
                           Class69.field999[++Class69.field1003 - 1] = var15.method202(var16.field2567, var16.field2564, var16.field2565) ? 1 : 0;
                           return 1;
                        }
                     } else if (var0 == 6622) {
                        Class69.field999[++Class69.field1003 - 1] = Class18.method196().method6142();
                        Class69.field999[++Class69.field1003 - 1] = Class18.method196().method6038();
                        return 1;
                     } else if (var0 == 6623) {
                        var19 = new Class226(Class69.field999[--Class69.field1003]);
                        var17 = Class18.method196().method6116(var19.field2567, var19.field2564, var19.field2565);
                        if (var17 == null) {
                           Class69.field999[++Class69.field1003 - 1] = -1;
                        } else {
                           Class69.field999[++Class69.field1003 - 1] = var17.method207();
                        }

                        return 1;
                     } else if (var0 == 6624) {
                        Class18.method196().method6089(Class69.field999[--Class69.field1003]);
                        return 1;
                     } else if (var0 == 6625) {
                        Class18.method196().method6040();
                        return 1;
                     } else if (var0 == 6626) {
                        Class18.method196().method6041(Class69.field999[--Class69.field1003]);
                        return 1;
                     } else if (var0 == 6627) {
                        Class18.method196().method6042();
                        return 1;
                     } else {
                        boolean var14;
                        if (var0 == 6628) {
                           var14 = Class69.field999[--Class69.field1003] == 1;
                           Class18.method196().method6034(var14);
                           return 1;
                        } else if (var0 == 6629) {
                           var3 = Class69.field999[--Class69.field1003];
                           Class18.method196().method6106(var3);
                           return 1;
                        } else if (var0 == 6630) {
                           var3 = Class69.field999[--Class69.field1003];
                           Class18.method196().method6152(var3);
                           return 1;
                        } else if (var0 == 6631) {
                           Class18.method196().method6114();
                           return 1;
                        } else if (var0 == 6632) {
                           var14 = Class69.field999[--Class69.field1003] == 1;
                           Class18.method196().method6047(var14);
                           return 1;
                        } else {
                           boolean var4;
                           if (var0 == 6633) {
                              Class69.field1003 -= 2;
                              var3 = Class69.field999[Class69.field1003];
                              var4 = Class69.field999[Class69.field1003 + 1] == 1;
                              Class18.method196().method6048(var3, var4);
                              return 1;
                           } else if (var0 == 6634) {
                              Class69.field1003 -= 2;
                              var3 = Class69.field999[Class69.field1003];
                              var4 = Class69.field999[Class69.field1003 + 1] == 1;
                              Class18.method196().method6049(var3, var4);
                              return 1;
                           } else if (var0 == 6635) {
                              Class69.field999[++Class69.field1003 - 1] = Class18.method196().method6050() ? 1 : 0;
                              return 1;
                           } else if (var0 == 6636) {
                              var3 = Class69.field999[--Class69.field1003];
                              Class69.field999[++Class69.field1003 - 1] = Class18.method196().method6051(var3) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6637) {
                              var3 = Class69.field999[--Class69.field1003];
                              Class69.field999[++Class69.field1003 - 1] = Class18.method196().method6052(var3) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6638) {
                              Class69.field1003 -= 2;
                              var3 = Class69.field999[Class69.field1003];
                              var16 = new Class226(Class69.field999[Class69.field1003 + 1]);
                              var11 = Class18.method196().method6100(var3, var16);
                              if (var11 == null) {
                                 Class69.field999[++Class69.field1003 - 1] = -1;
                              } else {
                                 Class69.field999[++Class69.field1003 - 1] = var11.method4437();
                              }

                              return 1;
                           } else {
                              Class28 var12;
                              if (var0 == 6639) {
                                 var12 = Class18.method196().method6146();
                                 if (var12 == null) {
                                    Class69.field999[++Class69.field1003 - 1] = -1;
                                    Class69.field999[++Class69.field1003 - 1] = -1;
                                 } else {
                                    Class69.field999[++Class69.field1003 - 1] = var12.field240;
                                    Class69.field999[++Class69.field1003 - 1] = var12.field236.method4437();
                                 }

                                 return 1;
                              } else if (var0 == 6640) {
                                 var12 = Class18.method196().method6186();
                                 if (var12 == null) {
                                    Class69.field999[++Class69.field1003 - 1] = -1;
                                    Class69.field999[++Class69.field1003 - 1] = -1;
                                 } else {
                                    Class69.field999[++Class69.field1003 - 1] = var12.field240;
                                    Class69.field999[++Class69.field1003 - 1] = var12.field236.method4437();
                                 }

                                 return 1;
                              } else {
                                 Class255 var10;
                                 if (var0 == 6693) {
                                    var3 = Class69.field999[--Class69.field1003];
                                    var10 = Class255.field3246[var3];
                                    if (var10.field3241 == null) {
                                       Class69.field1001[++Class55.field497 - 1] = "";
                                    } else {
                                       Class69.field1001[++Class55.field497 - 1] = var10.field3241;
                                    }

                                    return 1;
                                 } else if (var0 == 6694) {
                                    var3 = Class69.field999[--Class69.field1003];
                                    var10 = Class255.field3246[var3];
                                    Class69.field999[++Class69.field1003 - 1] = var10.field3243;
                                    return 1;
                                 } else if (var0 == 6695) {
                                    var3 = Class69.field999[--Class69.field1003];
                                    var10 = Class255.field3246[var3];
                                    if (var10 == null) {
                                       Class69.field999[++Class69.field1003 - 1] = -1;
                                    } else {
                                       Class69.field999[++Class69.field1003 - 1] = var10.field3240;
                                    }

                                    return 1;
                                 } else if (var0 == 6696) {
                                    var3 = Class69.field999[--Class69.field1003];
                                    var10 = Class255.field3246[var3];
                                    if (var10 == null) {
                                       Class69.field999[++Class69.field1003 - 1] = -1;
                                    } else {
                                       Class69.field999[++Class69.field1003 - 1] = var10.field3239;
                                    }

                                    return 1;
                                 } else if (var0 == 6697) {
                                    Class69.field999[++Class69.field1003 - 1] = Class312.field3750.field307;
                                    return 1;
                                 } else if (var0 == 6698) {
                                    Class69.field999[++Class69.field1003 - 1] = Class312.field3750.field311.method4437();
                                    return 1;
                                 } else if (var0 == 6699) {
                                    Class69.field999[++Class69.field1003 - 1] = Class312.field3750.field308.method4437();
                                    return 1;
                                 } else {
                                    return 2;
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

   @ObfuscatedName("is")
   @ObfuscatedSignature(
      signature = "(Lhi;IIZI)V",
      garbageValue = "-1969536993"
   )
   static void method1563(Class230 var0, int var1, int var2, boolean var3) {
      int var4 = var0.field2675;
      int var5 = var0.field2621;
      if (var0.field2612 == 0) {
         var0.field2675 = var0.field2616;
      } else if (var0.field2612 == 1) {
         var0.field2675 = var1 - var0.field2616;
      } else if (var0.field2612 == 2) {
         var0.field2675 = var0.field2616 * var1 >> 14;
      }

      if (var0.field2624 == 0) {
         var0.field2621 = var0.field2617;
      } else if (var0.field2624 == 1) {
         var0.field2621 = var2 - var0.field2617;
      } else if (var0.field2624 == 2) {
         var0.field2621 = var2 * var0.field2617 >> 14;
      }

      if (var0.field2612 == 4) {
         var0.field2675 = var0.field2621 * var0.field2622 / var0.field2623;
      }

      if (var0.field2624 == 4) {
         var0.field2621 = var0.field2623 * var0.field2675 / var0.field2622;
      }

      if (var0.field2609 == 1337) {
         Client.field784 = var0;
      }

      if (var3 && var0.field2715 != null && (var4 != var0.field2675 || var5 != var0.field2621)) {
         Class56 var6 = new Class56();
         var6.field506 = var0;
         var6.field512 = var0.field2715;
         Client.field638.method4073(var6);
      }

   }
}
