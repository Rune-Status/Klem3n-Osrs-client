package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
public class Class12 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Ln;"
   )
   public static final Class12 field70 = new Class12("SMALL", 0, 0, 4);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Ln;"
   )
   public static final Class12 field71 = new Class12("MEDIUM", 2, 1, 2);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Ln;"
   )
   public static final Class12 field72 = new Class12("LARGE", 1, 2, 0);
   @ObfuscatedName("l")
   final String field73;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -2147190539
   )
   final int field79;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 94613509
   )
   final int field75;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -321383721
   )
   final int field76;

   Class12(String var1, int var2, int var3, int var4) {
      this.field73 = var1;
      this.field79 = var2;
      this.field75 = var3;
      this.field76 = var4;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(FB)Z",
      garbageValue = "-53"
   )
   boolean method103(float var1) {
      return var1 >= (float)this.field76;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)Ln;",
      garbageValue = "-15"
   )
   static Class12 method101(int var0) {
      Class12[] var1 = new Class12[]{field72, field70, field71};
      Class12[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Class12 var4 = var2[var3];
         if (var0 == var4.field75) {
            return var4;
         }
      }

      return null;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lj;III)V",
      garbageValue = "-442042913"
   )
   static void method104(Class21 var0, int var1, int var2) {
      Class23.field189.method4007(var0, Class43.method716(var1, var2, 0));
   }

   @ObfuscatedName("go")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "65280"
   )
   static final int method108() {
      if (Class10.field61.field960) {
         return Class13.field82;
      } else {
         int var0 = 3;
         if (Class7.field41 < 310) {
            int var1;
            int var2;
            if (Client.field655 == 1) {
               var1 = Class109.field1428 >> 7;
               var2 = Class2.field23 >> 7;
            } else {
               var1 = Class138.field1876.field931 >> 7;
               var2 = Class138.field1876.field881 >> 7;
            }

            int var3 = Class109.field1431 >> 7;
            int var4 = Class226.field2563 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
               return Class13.field82;
            }

            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
               return Class13.field82;
            }

            if ((Class50.field443[Class13.field82][var3][var4] & 4) != 0) {
               var0 = Class13.field82;
            }

            int var5;
            if (var1 > var3) {
               var5 = var1 - var3;
            } else {
               var5 = var3 - var1;
            }

            int var6;
            if (var2 > var4) {
               var6 = var2 - var4;
            } else {
               var6 = var4 - var2;
            }

            int var7;
            int var8;
            if (var5 > var6) {
               var7 = var6 * 65536 / var5;
               var8 = 32768;

               while(var3 != var1) {
                  if (var3 < var1) {
                     ++var3;
                  } else if (var3 > var1) {
                     --var3;
                  }

                  if ((Class50.field443[Class13.field82][var3][var4] & 4) != 0) {
                     var0 = Class13.field82;
                  }

                  var8 += var7;
                  if (var8 >= 65536) {
                     var8 -= 65536;
                     if (var4 < var2) {
                        ++var4;
                     } else if (var4 > var2) {
                        --var4;
                     }

                     if ((Class50.field443[Class13.field82][var3][var4] & 4) != 0) {
                        var0 = Class13.field82;
                     }
                  }
               }
            } else if (var6 > 0) {
               var7 = var5 * 65536 / var6;
               var8 = 32768;

               while(var2 != var4) {
                  if (var4 < var2) {
                     ++var4;
                  } else if (var4 > var2) {
                     --var4;
                  }

                  if ((Class50.field443[Class13.field82][var3][var4] & 4) != 0) {
                     var0 = Class13.field82;
                  }

                  var8 += var7;
                  if (var8 >= 65536) {
                     var8 -= 65536;
                     if (var3 < var1) {
                        ++var3;
                     } else if (var3 > var1) {
                        --var3;
                     }

                     if ((Class50.field443[Class13.field82][var3][var4] & 4) != 0) {
                        var0 = Class13.field82;
                     }
                  }
               }
            }
         }

         if (Class138.field1876.field931 >= 0 && Class138.field1876.field881 >= 0 && Class138.field1876.field931 < 13312 && Class138.field1876.field881 < 13312) {
            if ((Class50.field443[Class13.field82][Class138.field1876.field931 >> 7][Class138.field1876.field881 >> 7] & 4) != 0) {
               var0 = Class13.field82;
            }

            return var0;
         } else {
            return Class13.field82;
         }
      }
   }

   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      signature = "([Lhi;IIIIIIII)V",
      garbageValue = "-1825826206"
   )
   static final void method102(Class230[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < var0.length; ++var8) {
         Class230 var9 = var0[var8];
         if (var9 != null && (!var9.field2604 || var9.field2721 == 0 || var9.field2686 || Class24.method425(var9) != 0 || var9 == Client.field752 || var9.field2609 == 1338) && var9.field2605 == var1 && (!var9.field2604 || !Class81.method1885(var9))) {
            int var10 = var9.field2618 + var6;
            int var11 = var7 + var9.field2619;
            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var42;
            if (var9.field2721 == 2) {
               var12 = var2;
               var13 = var3;
               var14 = var4;
               var15 = var5;
            } else if (var9.field2721 == 9) {
               var16 = var10;
               var17 = var11;
               int var18 = var10 + var9.field2675;
               var42 = var11 + var9.field2621;
               if (var18 < var10) {
                  var16 = var18;
                  var18 = var10;
               }

               if (var42 < var11) {
                  var17 = var42;
                  var42 = var11;
               }

               ++var18;
               ++var42;
               var12 = var16 > var2 ? var16 : var2;
               var13 = var17 > var3 ? var17 : var3;
               var14 = var18 < var4 ? var18 : var4;
               var15 = var42 < var5 ? var42 : var5;
            } else {
               var16 = var10 + var9.field2675;
               var17 = var11 + var9.field2621;
               var12 = var10 > var2 ? var10 : var2;
               var13 = var11 > var3 ? var11 : var3;
               var14 = var16 < var4 ? var16 : var4;
               var15 = var17 < var5 ? var17 : var5;
            }

            if (var9 == Client.field583) {
               Client.field772 = true;
               Client.field696 = var10;
               Client.field760 = var11;
            }

            if (!var9.field2604 || var12 < var14 && var13 < var15) {
               var16 = Class48.field425;
               var17 = Class48.field426 * 673804999;
               if (Class48.field431 != 0) {
                  var16 = Class48.field432;
                  var17 = Class48.field428;
               }

               boolean var56 = var16 >= var12 && var17 >= var13 && var16 < var14 && var17 < var15;
               int var23;
               int var24;
               int var25;
               int var28;
               int var59;
               if (var9.field2609 == 1337) {
                  if (!Client.field625 && !Client.field716 && var56) {
                     if (Client.field733 == 0 && !Client.field785) {
                        Class50.method993("Walk here", "", 23, 0, var16 - var12, var17 - var13);
                     }

                     long var19 = -1L;
                     long var21 = -1L;
                     var23 = 0;

                     while(true) {
                        var25 = Class120.field1656;
                        if (var23 >= var25) {
                           if (var19 != -1L) {
                              var23 = Class37.method662(var19);
                              var24 = Class109.method2484(var19);
                              Class60 var39 = Client.field610[Client.field707];
                              Class221.method4371(var39, Client.field707, var23, var24);
                           }
                           break;
                        }

                        long var49 = Class20.method262(var23);
                        if (var49 != var21) {
                           label1671: {
                              var21 = var49;
                              var28 = Class3.method32(var23);
                              var59 = Class27.method435(var23);
                              long var32 = Class120.field1647[var23];
                              int var31 = (int)(var32 >>> 14 & 3L);
                              int var51 = Class80.method1864(var23);
                              if (var31 == 2 && Class28.field248.method2902(Class13.field82, var28, var59, var49) >= 0) {
                                 Class268 var33 = Class110.method2527(var51);
                                 if (var33.field3410 != null) {
                                    var33 = var33.method5056();
                                 }

                                 if (var33 == null) {
                                    break label1671;
                                 }

                                 if (Client.field733 == 1) {
                                    Class50.method993("Use", Client.field734 + " " + "->" + " " + Class6.method71(65535) + var33.field3373, 1, var51, var28, var59);
                                 } else if (Client.field785) {
                                    if ((Class63.field932 & 4) == 4) {
                                       Class50.method993(Client.field612, Client.field739 + " " + "->" + " " + Class6.method71(65535) + var33.field3373, 2, var51, var28, var59);
                                    }
                                 } else {
                                    String[] var34 = var33.field3387;
                                    if (var34 != null) {
                                       for(int var35 = 4; var35 >= 0; --var35) {
                                          if (var34[var35] != null) {
                                             short var36 = 0;
                                             if (var35 == 0) {
                                                var36 = 3;
                                             }

                                             if (var35 == 1) {
                                                var36 = 4;
                                             }

                                             if (var35 == 2) {
                                                var36 = 5;
                                             }

                                             if (var35 == 3) {
                                                var36 = 6;
                                             }

                                             if (var35 == 4) {
                                                var36 = 1001;
                                             }

                                             Class50.method993(var34[var35], Class6.method71(65535) + var33.field3373, var36, var51, var28, var59);
                                          }
                                       }
                                    }

                                    Class50.method993("Examine", Class6.method71(65535) + var33.field3373, 1002, var33.field3376, var28, var59);
                                 }
                              }

                              Class60 var37;
                              int var52;
                              Class72 var53;
                              int var64;
                              int[] var70;
                              if (var31 == 1) {
                                 Class72 var60 = Client.field843[var51];
                                 if (var60 == null) {
                                    break label1671;
                                 }

                                 if (var60.field1037.field3497 == 1 && (var60.field931 & 127) == 64 && (var60.field881 & 127) == 64) {
                                    for(var52 = 0; var52 < Client.field622; ++var52) {
                                       var53 = Client.field843[Client.field639[var52]];
                                       if (var53 != null && var60 != var53 && var53.field1037.field3497 == 1 && var53.field931 == var60.field931 && var60.field881 == var53.field881) {
                                          Class28.method474(var53.field1037, Client.field639[var52], var28, var59);
                                       }
                                    }

                                    var52 = Class81.field1167;
                                    var70 = Class81.field1159;

                                    for(var64 = 0; var64 < var52; ++var64) {
                                       var37 = Client.field610[var70[var64]];
                                       if (var37 != null && var37.field931 == var60.field931 && var37.field881 == var60.field881) {
                                          Class221.method4371(var37, var70[var64], var28, var59);
                                       }
                                    }
                                 }

                                 Class28.method474(var60.field1037, var51, var28, var59);
                              }

                              if (var31 == 0) {
                                 Class60 var61 = Client.field610[var51];
                                 if (var61 == null) {
                                    break label1671;
                                 }

                                 if ((var61.field931 & 127) == 64 && (var61.field881 & 127) == 64) {
                                    for(var52 = 0; var52 < Client.field622; ++var52) {
                                       var53 = Client.field843[Client.field639[var52]];
                                       if (var53 != null && var53.field1037.field3497 == 1 && var61.field931 == var53.field931 && var53.field881 == var61.field881) {
                                          Class28.method474(var53.field1037, Client.field639[var52], var28, var59);
                                       }
                                    }

                                    var52 = Class81.field1167;
                                    var70 = Class81.field1159;

                                    for(var64 = 0; var64 < var52; ++var64) {
                                       var37 = Client.field610[var70[var64]];
                                       if (var37 != null && var37 != var61 && var61.field931 == var37.field931 && var37.field881 == var61.field881) {
                                          Class221.method4371(var37, var70[var64], var28, var59);
                                       }
                                    }
                                 }

                                 if (var51 != Client.field707) {
                                    Class221.method4371(var61, var51, var28, var59);
                                 } else {
                                    var19 = var49;
                                 }
                              }

                              if (var31 == 3) {
                                 Class205 var63 = Client.field708[Class13.field82][var28][var59];
                                 if (var63 != null) {
                                    for(Class80 var62 = (Class80)var63.method4083(); var62 != null; var62 = (Class80)var63.method4093()) {
                                       Class269 var71 = Class111.method2563(var62.field1151);
                                       if (Client.field733 == 1) {
                                          Class50.method993("Use", Client.field734 + " " + "->" + " " + Class6.method71(16748608) + var71.field3433, 16, var62.field1151, var28, var59);
                                       } else if (Client.field785) {
                                          if ((Class63.field932 & 1) == 1) {
                                             Class50.method993(Client.field612, Client.field739 + " " + "->" + " " + Class6.method71(16748608) + var71.field3433, 17, var62.field1151, var28, var59);
                                          }
                                       } else {
                                          String[] var54 = var71.field3447;

                                          for(int var55 = 4; var55 >= 0; --var55) {
                                             if (var54 != null && var54[var55] != null) {
                                                byte var38 = 0;
                                                if (var55 == 0) {
                                                   var38 = 18;
                                                }

                                                if (var55 == 1) {
                                                   var38 = 19;
                                                }

                                                if (var55 == 2) {
                                                   var38 = 20;
                                                }

                                                if (var55 == 3) {
                                                   var38 = 21;
                                                }

                                                if (var55 == 4) {
                                                   var38 = 22;
                                                }

                                                Class50.method993(var54[var55], Class6.method71(16748608) + var71.field3433, var38, var62.field1151, var28, var59);
                                             } else if (var55 == 2) {
                                                Class50.method993("Take", Class6.method71(16748608) + var71.field3433, 20, var62.field1151, var28, var59);
                                             }
                                          }

                                          Class50.method993("Examine", Class6.method71(16748608) + var71.field3433, 1004, var62.field1151, var28, var59);
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        ++var23;
                     }
                  }
               } else if (var9.field2609 == 1338) {
                  Class36.method632(var9, var10, var11);
               } else {
                  if (var9.field2609 == 1400) {
                     Class53.field476.method6003(Class48.field425, Class48.field426 * 673804999, var56, var10, var11, var9.field2675, var9.field2621);
                  }

                  int var20;
                  int var22;
                  int var43;
                  boolean var67;
                  if (!Client.field716 && var56) {
                     if (var9.field2609 == 1400) {
                        Class53.field476.method6158(var10, var11, var9.field2675, var9.field2621, var16, var17);
                     } else {
                        var42 = var16 - var10;
                        var20 = var17 - var11;
                        if (var9.field2709 == 1) {
                           Class50.method993(var9.field2723, "", 24, 0, 0, var9.field2691);
                        }

                        String var44;
                        if (var9.field2709 == 2 && !Client.field785) {
                           var44 = Class151.method3239(var9);
                           if (var44 != null) {
                              Class50.method993(var44, Class6.method71(65280) + var9.field2722, 25, 0, -1, var9.field2691);
                           }
                        }

                        if (var9.field2709 == 3) {
                           Class50.method993("Close", "", 26, 0, 0, var9.field2691);
                        }

                        if (var9.field2709 == 4) {
                           Class50.method993(var9.field2723, "", 28, 0, 0, var9.field2691);
                        }

                        if (var9.field2709 == 5) {
                           Class50.method993(var9.field2723, "", 29, 0, 0, var9.field2691);
                        }

                        if (var9.field2709 == 6 && Client.field744 == null) {
                           Class50.method993(var9.field2723, "", 30, 0, -1, var9.field2691);
                        }

                        if (var9.field2721 == 2) {
                           var43 = 0;

                           for(var22 = 0; var22 < var9.field2621; ++var22) {
                              for(var23 = 0; var23 < var9.field2675; ++var23) {
                                 var24 = var23 * (var9.field2672 + 32);
                                 var25 = var22 * (var9.field2673 + 32);
                                 if (var43 < 20) {
                                    var24 += var9.field2685[var43];
                                    var25 += var9.field2738[var43];
                                 }

                                 if (var42 >= var24 && var20 >= var25 && var42 < var24 + 32 && var20 < var25 + 32) {
                                    Client.field691 = var43;
                                    Class132.field1819 = var9;
                                    if (var9.field2724[var43] > 0) {
                                       Class269 var26 = Class111.method2563(var9.field2724[var43] - 1);
                                       if (Client.field733 == 1 && Class145.method3188(Class24.method425(var9))) {
                                          if (var9.field2691 != Class187.field2372 || var43 != Class13.field84) {
                                             Class50.method993("Use", Client.field734 + " " + "->" + " " + Class6.method71(16748608) + var26.field3433, 31, var26.field3431, var43, var9.field2691);
                                          }
                                       } else if (Client.field785 && Class145.method3188(Class24.method425(var9))) {
                                          if ((Class63.field932 & 16) == 16) {
                                             Class50.method993(Client.field612, Client.field739 + " " + "->" + " " + Class6.method71(16748608) + var26.field3433, 32, var26.field3431, var43, var9.field2691);
                                          }
                                       } else {
                                          String[] var27 = var26.field3425;
                                          var28 = -1;
                                          if (Client.field726) {
                                             boolean var29 = Client.field727 || Class39.field341[81];
                                             if (var29) {
                                                var28 = var26.method5101();
                                             }
                                          }

                                          if (Class145.method3188(Class24.method425(var9))) {
                                             for(var59 = 4; var59 >= 3; --var59) {
                                                if (var28 != var59) {
                                                   Class56.method1027(var9, var26, var43, var59, false);
                                                }
                                             }
                                          }

                                          if (Class148.method3197(Class24.method425(var9))) {
                                             Class50.method993("Use", Class6.method71(16748608) + var26.field3433, 38, var26.field3431, var43, var9.field2691);
                                          }

                                          if (Class145.method3188(Class24.method425(var9))) {
                                             for(var59 = 2; var59 >= 0; --var59) {
                                                if (var59 != var28) {
                                                   Class56.method1027(var9, var26, var43, var59, false);
                                                }
                                             }

                                             if (var28 >= 0) {
                                                Class56.method1027(var9, var26, var43, var28, true);
                                             }
                                          }

                                          var27 = var9.field2677;
                                          if (var27 != null) {
                                             for(var59 = 4; var59 >= 0; --var59) {
                                                if (var27[var59] != null) {
                                                   byte var30 = 0;
                                                   if (var59 == 0) {
                                                      var30 = 39;
                                                   }

                                                   if (var59 == 1) {
                                                      var30 = 40;
                                                   }

                                                   if (var59 == 2) {
                                                      var30 = 41;
                                                   }

                                                   if (var59 == 3) {
                                                      var30 = 42;
                                                   }

                                                   if (var59 == 4) {
                                                      var30 = 43;
                                                   }

                                                   Class50.method993(var27[var59], Class6.method71(16748608) + var26.field3433, var30, var26.field3431, var43, var9.field2691);
                                                }
                                             }
                                          }

                                          Class50.method993("Examine", Class6.method71(16748608) + var26.field3433, 1005, var26.field3431, var43, var9.field2691);
                                       }
                                    }
                                 }

                                 ++var43;
                              }
                           }
                        }

                        if (var9.field2604) {
                           if (Client.field785) {
                              var22 = Class24.method425(var9);
                              var67 = (var22 >> 21 & 1) != 0;
                              if (var67 && (Class63.field932 & 32) == 32) {
                                 Class50.method993(Client.field612, Client.field739 + " " + "->" + " " + var9.field2679, 58, 0, var9.field2606, var9.field2691);
                              }
                           } else {
                              for(var43 = 9; var43 >= 5; --var43) {
                                 String var46 = Class112.method2565(var9, var43);
                                 if (var46 != null) {
                                    Class50.method993(var46, var9.field2679, 1007, var43 + 1, var9.field2606, var9.field2691);
                                 }
                              }

                              var44 = Class151.method3239(var9);
                              if (var44 != null) {
                                 Class50.method993(var44, var9.field2679, 25, 0, var9.field2606, var9.field2691);
                              }

                              for(var22 = 4; var22 >= 0; --var22) {
                                 String var47 = Class112.method2565(var9, var22);
                                 if (var47 != null) {
                                    Class50.method993(var47, var9.field2679, 57, var22 + 1, var9.field2606, var9.field2691);
                                 }
                              }

                              var23 = Class24.method425(var9);
                              boolean var58 = (var23 & 1) != 0;
                              if (var58) {
                                 Class50.method993("Continue", "", 30, 0, var9.field2606, var9.field2691);
                              }
                           }
                        }
                     }
                  }

                  if (var9.field2721 == 0) {
                     if (!var9.field2604 && Class81.method1885(var9) && var9 != Class143.field1897) {
                        continue;
                     }

                     method102(var0, var9.field2691, var12, var13, var14, var15, var10 - var9.field2626, var11 - var9.field2663);
                     if (var9.field2736 != null) {
                        method102(var9.field2736, var9.field2691, var12, var13, var14, var15, var10 - var9.field2626, var11 - var9.field2663);
                     }

                     Class55 var40 = (Class55)Client.field741.method4020((long)var9.field2691);
                     if (var40 != null) {
                        if (var40.field494 == 0 && Class48.field425 >= var12 && Class48.field426 * 673804999 >= var13 && Class48.field425 < var14 && Class48.field426 * 673804999 < var15 && !Client.field716) {
                           for(Class56 var41 = (Class56)Client.field638.method4098(); var41 != null; var41 = (Class56)Client.field638.method4079()) {
                              if (var41.field505) {
                                 var41.method4064();
                                 var41.field506.field2731 = false;
                              }
                           }

                           if (Class6.field39 == 0) {
                              Client.field583 = null;
                              Client.field752 = null;
                           }

                           if (!Client.field716) {
                              Class59.method1077();
                           }
                        }

                        var20 = var40.field501;
                        if (Class261.method4931(var20)) {
                           method102(Class42.field366[var20], -1, var12, var13, var14, var15, var10, var11);
                        }
                     }
                  }

                  if (var9.field2604) {
                     Class56 var65;
                     if (!var9.field2648) {
                        if (var9.field2740 && Class48.field425 >= var12 && Class48.field426 * 673804999 >= var13 && Class48.field425 < var14 && Class48.field426 * 673804999 < var15) {
                           for(var65 = (Class56)Client.field638.method4098(); var65 != null; var65 = (Class56)Client.field638.method4079()) {
                              if (var65.field505 && var65.field506.field2707 == var65.field512) {
                                 var65.method4064();
                              }
                           }
                        }
                     } else if (Class48.field425 >= var12 && Class48.field426 * 673804999 >= var13 && Class48.field425 < var14 && Class48.field426 * 673804999 < var15) {
                        for(var65 = (Class56)Client.field638.method4098(); var65 != null; var65 = (Class56)Client.field638.method4079()) {
                           if (var65.field505) {
                              var65.method4064();
                              var65.field506.field2731 = false;
                           }
                        }

                        if (Class6.field39 == 0) {
                           Client.field583 = null;
                           Client.field752 = null;
                        }

                        if (!Client.field716) {
                           Class59.method1077();
                        }
                     }

                     if (Class48.field425 >= var12 && Class48.field426 * 673804999 >= var13 && Class48.field425 < var14 && Class48.field426 * 673804999 < var15) {
                        var56 = true;
                     } else {
                        var56 = false;
                     }

                     boolean var66 = false;
                     if ((Class48.field419 == 1 || !Class253.field3229 && Class48.field419 == 4) && var56) {
                        var66 = true;
                     }

                     boolean var57 = false;
                     if ((Class48.field431 == 1 || !Class253.field3229 && Class48.field431 == 4) && Class48.field432 >= var12 && Class48.field428 >= var13 && Class48.field432 < var14 && Class48.field428 < var15) {
                        var57 = true;
                     }

                     if (var57) {
                        Class169.method3447(var9, Class48.field432 - var10, Class48.field428 - var11);
                     }

                     if (var9.field2609 == 1400) {
                        Class53.field476.method6174(var16, var17, var56 & var66, var56 & var57);
                     }

                     if (Client.field583 != null && var9 != Client.field583 && var56) {
                        var22 = Class24.method425(var9);
                        var67 = (var22 >> 20 & 1) != 0;
                        if (var67) {
                           Client.field755 = var9;
                        }
                     }

                     if (var9 == Client.field752) {
                        Client.field601 = true;
                        Client.field757 = var10;
                        Client.field758 = var11;
                     }

                     if (var9.field2686) {
                        Class56 var68;
                        if (var56 && Client.field695 != 0 && var9.field2707 != null) {
                           var68 = new Class56();
                           var68.field505 = true;
                           var68.field506 = var9;
                           var68.field508 = Client.field695;
                           var68.field512 = var9.field2707;
                           Client.field638.method4073(var68);
                        }

                        if (Client.field583 != null || Class276.field3559 != null || Client.field716) {
                           var57 = false;
                           var66 = false;
                           var56 = false;
                        }

                        if (!var9.field2674 && var57) {
                           var9.field2674 = true;
                           if (var9.field2688 != null) {
                              var68 = new Class56();
                              var68.field505 = true;
                              var68.field506 = var9;
                              var68.field511 = Class48.field432 - var10;
                              var68.field508 = Class48.field428 - var11;
                              var68.field512 = var9.field2688;
                              Client.field638.method4073(var68);
                           }
                        }

                        if (var9.field2674 && var66 && var9.field2689 != null) {
                           var68 = new Class56();
                           var68.field505 = true;
                           var68.field506 = var9;
                           var68.field511 = Class48.field425 - var10;
                           var68.field508 = Class48.field426 * 673804999 - var11;
                           var68.field512 = var9.field2689;
                           Client.field638.method4073(var68);
                        }

                        if (var9.field2674 && !var66) {
                           var9.field2674 = false;
                           if (var9.field2690 != null) {
                              var68 = new Class56();
                              var68.field505 = true;
                              var68.field506 = var9;
                              var68.field511 = Class48.field425 - var10;
                              var68.field508 = Class48.field426 * 673804999 - var11;
                              var68.field512 = var9.field2690;
                              Client.field779.method4073(var68);
                           }
                        }

                        if (var66 && var9.field2614 != null) {
                           var68 = new Class56();
                           var68.field505 = true;
                           var68.field506 = var9;
                           var68.field511 = Class48.field425 - var10;
                           var68.field508 = Class48.field426 * 673804999 - var11;
                           var68.field512 = var9.field2614;
                           Client.field638.method4073(var68);
                        }

                        if (!var9.field2731 && var56) {
                           var9.field2731 = true;
                           if (var9.field2692 != null) {
                              var68 = new Class56();
                              var68.field505 = true;
                              var68.field506 = var9;
                              var68.field511 = Class48.field425 - var10;
                              var68.field508 = Class48.field426 * 673804999 - var11;
                              var68.field512 = var9.field2692;
                              Client.field638.method4073(var68);
                           }
                        }

                        if (var9.field2731 && var56 && var9.field2594 != null) {
                           var68 = new Class56();
                           var68.field505 = true;
                           var68.field506 = var9;
                           var68.field511 = Class48.field425 - var10;
                           var68.field508 = Class48.field426 * 673804999 - var11;
                           var68.field512 = var9.field2594;
                           Client.field638.method4073(var68);
                        }

                        if (var9.field2731 && !var56) {
                           var9.field2731 = false;
                           if (var9.field2694 != null) {
                              var68 = new Class56();
                              var68.field505 = true;
                              var68.field506 = var9;
                              var68.field511 = Class48.field425 - var10;
                              var68.field508 = Class48.field426 * 673804999 - var11;
                              var68.field512 = var9.field2694;
                              Client.field779.method4073(var68);
                           }
                        }

                        if (var9.field2705 != null) {
                           var68 = new Class56();
                           var68.field506 = var9;
                           var68.field512 = var9.field2705;
                           Client.field778.method4073(var68);
                        }

                        Class56 var45;
                        if (var9.field2699 != null && Client.field765 > var9.field2683) {
                           if (var9.field2700 != null && Client.field765 - var9.field2683 <= 32) {
                              label1369:
                              for(var43 = var9.field2683; var43 < Client.field765; ++var43) {
                                 var22 = Client.field764[var43 & 31];

                                 for(var23 = 0; var23 < var9.field2700.length; ++var23) {
                                    if (var22 == var9.field2700[var23]) {
                                       var45 = new Class56();
                                       var45.field506 = var9;
                                       var45.field512 = var9.field2699;
                                       Client.field638.method4073(var45);
                                       break label1369;
                                    }
                                 }
                              }
                           } else {
                              var68 = new Class56();
                              var68.field506 = var9;
                              var68.field512 = var9.field2699;
                              Client.field638.method4073(var68);
                           }

                           var9.field2683 = Client.field765;
                        }

                        if (var9.field2670 != null && Client.field767 > var9.field2735) {
                           if (var9.field2733 != null && Client.field767 - var9.field2735 <= 32) {
                              label1345:
                              for(var43 = var9.field2735; var43 < Client.field767; ++var43) {
                                 var22 = Client.field766[var43 & 31];

                                 for(var23 = 0; var23 < var9.field2733.length; ++var23) {
                                    if (var22 == var9.field2733[var23]) {
                                       var45 = new Class56();
                                       var45.field506 = var9;
                                       var45.field512 = var9.field2670;
                                       Client.field638.method4073(var45);
                                       break label1345;
                                    }
                                 }
                              }
                           } else {
                              var68 = new Class56();
                              var68.field506 = var9;
                              var68.field512 = var9.field2670;
                              Client.field638.method4073(var68);
                           }

                           var9.field2735 = Client.field767;
                        }

                        if (var9.field2703 != null && Client.field769 > var9.field2702) {
                           if (var9.field2635 != null && Client.field769 - var9.field2702 <= 32) {
                              label1321:
                              for(var43 = var9.field2702; var43 < Client.field769; ++var43) {
                                 var22 = Client.field690[var43 & 31];

                                 for(var23 = 0; var23 < var9.field2635.length; ++var23) {
                                    if (var22 == var9.field2635[var23]) {
                                       var45 = new Class56();
                                       var45.field506 = var9;
                                       var45.field512 = var9.field2703;
                                       Client.field638.method4073(var45);
                                       break label1321;
                                    }
                                 }
                              }
                           } else {
                              var68 = new Class56();
                              var68.field506 = var9;
                              var68.field512 = var9.field2703;
                              Client.field638.method4073(var68);
                           }

                           var9.field2702 = Client.field769;
                        }

                        if (Client.field770 > var9.field2697 && var9.field2708 != null) {
                           var68 = new Class56();
                           var68.field506 = var9;
                           var68.field512 = var9.field2708;
                           Client.field638.method4073(var68);
                        }

                        if (Client.field647 > var9.field2697 && var9.field2718 != null) {
                           var68 = new Class56();
                           var68.field506 = var9;
                           var68.field512 = var9.field2718;
                           Client.field638.method4073(var68);
                        }

                        if (Client.field828 > var9.field2697 && var9.field2711 != null) {
                           var68 = new Class56();
                           var68.field506 = var9;
                           var68.field512 = var9.field2711;
                           Client.field638.method4073(var68);
                        }

                        if (Client.field793 > var9.field2697 && var9.field2716 != null) {
                           var68 = new Class56();
                           var68.field506 = var9;
                           var68.field512 = var9.field2716;
                           Client.field638.method4073(var68);
                        }

                        if (Client.field774 > var9.field2697 && var9.field2693 != null) {
                           var68 = new Class56();
                           var68.field506 = var9;
                           var68.field512 = var9.field2693;
                           Client.field638.method4073(var68);
                        }

                        if (Client.field775 > var9.field2697 && var9.field2712 != null) {
                           var68 = new Class56();
                           var68.field506 = var9;
                           var68.field512 = var9.field2712;
                           Client.field638.method4073(var68);
                        }

                        var9.field2697 = Client.field801;
                        if (var9.field2637 != null) {
                           for(var43 = 0; var43 < Client.field799; ++var43) {
                              Class56 var69 = new Class56();
                              var69.field506 = var9;
                              var69.field509 = Client.field773[var43];
                              var69.field513 = Client.field800[var43];
                              var69.field512 = var9.field2637;
                              Client.field638.method4073(var69);
                           }
                        }
                     }
                  }

                  if (!var9.field2604 && Client.field583 == null && Class276.field3559 == null && !Client.field716) {
                     if ((var9.field2713 >= 0 || var9.field2632 != 0) && Class48.field425 >= var12 && Class48.field426 * 673804999 >= var13 && Class48.field425 < var14 && Class48.field426 * 673804999 < var15) {
                        if (var9.field2713 >= 0) {
                           Class143.field1897 = var0[var9.field2713];
                        } else {
                           Class143.field1897 = var9;
                        }
                     }

                     if (var9.field2721 == 8 && Class48.field425 >= var12 && Class48.field426 * 673804999 >= var13 && Class48.field425 < var14 && Class48.field426 * 673804999 < var15) {
                        Class141.field1888 = var9;
                     }

                     if (var9.field2629 > var9.field2621) {
                        var42 = var10 + var9.field2675;
                        var20 = var9.field2621;
                        var43 = var9.field2629;
                        var22 = Class48.field425;
                        var23 = Class48.field426 * 673804999;
                        if (Client.field746) {
                           Client.field660 = 32;
                        } else {
                           Client.field660 = 0;
                        }

                        Client.field746 = false;
                        if (Class48.field419 == 1 || !Class253.field3229 && Class48.field419 == 4) {
                           if (var22 >= var42 && var22 < var42 + 16 && var23 >= var11 && var23 < var11 + 16) {
                              var9.field2663 -= 4;
                              Class60.method1114(var9);
                           } else if (var22 >= var42 && var22 < var42 + 16 && var23 >= var11 + var20 - 16 && var23 < var11 + var20) {
                              var9.field2663 += 4;
                              Class60.method1114(var9);
                           } else if (var22 >= var42 - Client.field660 && var22 < var42 + Client.field660 + 16 && var23 >= var11 + 16 && var23 < var11 + var20 - 16) {
                              var24 = var20 * (var20 - 32) / var43;
                              if (var24 < 8) {
                                 var24 = 8;
                              }

                              var25 = var23 - var11 - 16 - var24 / 2;
                              int var48 = var20 - 32 - var24;
                              var9.field2663 = var25 * (var43 - var20) / var48;
                              Class60.method1114(var9);
                              Client.field746 = true;
                           }
                        }

                        if (Client.field695 != 0) {
                           var24 = var9.field2675;
                           if (var22 >= var42 - var24 && var23 >= var11 && var22 < var42 + 16 && var23 <= var20 + var11) {
                              var9.field2663 += Client.field695 * 45;
                              Class60.method1114(var9);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("jw")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1351336355"
   )
   static final void method110(String var0) {
      if (!var0.equals("")) {
         Class172 var1 = Class26.method433(Class169.field2153, Client.field626.field1218);
         var1.field2257.method3532(Class316.method5820(var0));
         var1.field2257.method3699(var0);
         Client.field626.method1980(var1);
      }
   }
}
