package com.client;
import java.util.Comparator;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
public class Class309 implements Comparator {
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -298322265
   )
   public static int field3740;
   @ObfuscatedName("z")
   final boolean field3741;

   public Class309(boolean var1) {
      this.field3741 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljx;Ljx;I)I",
      garbageValue = "870668832"
   )
   int method5670(Class282 var1, Class282 var2) {
      return this.field3741 ? var1.method5287().method5435(var2.method5287()) : var2.method5287().method5435(var1.method5287());
   }

   public int compare(Object var1, Object var2) {
      return this.method5670((Class282)var1, (Class282)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lbo;II)V",
      garbageValue = "1199859581"
   )
   static void method5674(Class56 var0, int var1) {
      Object[] var2 = var0.field512;
      int var5 = var0.field515;
      boolean var4 = var5 == 10 || var5 == 11 || var5 == 12 || var5 == 13 || var5 == 14 || var5 == 15 || var5 == 16 || var5 == 17;
      Class84 var3;
      int var9;
      int var10;
      int var11;
      int var13;
      int var18;
      if (var4) {
         Class312.field3750 = (Class36)var2[0];
         Class255 var6 = Class255.field3246[Class312.field3750.field307];
         int var8 = var0.field515;
         var9 = var6.field3238;
         var10 = var6.field3240;
         var11 = Class17.method170(var9, var8);
         Class84 var12 = Class134.method3104(var11, var8);
         Class84 var7;
         if (var12 != null) {
            var7 = var12;
         } else {
            var13 = var8 + (var10 + '鱀' << 8);
            var12 = Class134.method3104(var13, var8);
            if (var12 != null) {
               var7 = var12;
            } else {
               var7 = null;
            }
         }

         var3 = var7;
      } else {
         var18 = (Integer)var2[0];
         var3 = Class133.method3099(var18);
      }

      if (var3 != null) {
         Class69.field1003 = 0;
         Class55.field497 = 0;
         var18 = -1;
         int[] var29 = var3.field1189;
         int[] var19 = var3.field1196;
         byte var30 = -1;
         Class69.field1008 = 0;

         int var20;
         try {
            Class69.field1005 = new int[var3.field1192];
            var10 = 0;
            Class130.field1800 = new String[var3.field1193];
            var11 = 0;

            String var21;
            for(var20 = 1; var20 < var2.length; ++var20) {
               if (var2[var20] instanceof Integer) {
                  var13 = (Integer)var2[var20];
                  if (var13 == -2147483647) {
                     var13 = var0.field511;
                  }

                  if (var13 == -2147483646) {
                     var13 = var0.field508;
                  }

                  if (var13 == -2147483645) {
                     var13 = var0.field506 != null ? var0.field506.field2691 : -1;
                  }

                  if (var13 == -2147483644) {
                     var13 = var0.field517;
                  }

                  if (var13 == -2147483643) {
                     var13 = var0.field506 != null ? var0.field506.field2606 : -1;
                  }

                  if (var13 == -2147483642) {
                     var13 = var0.field507 != null ? var0.field507.field2691 : -1;
                  }

                  if (var13 == -2147483641) {
                     var13 = var0.field507 != null ? var0.field507.field2606 : -1;
                  }

                  if (var13 == -2147483640) {
                     var13 = var0.field509;
                  }

                  if (var13 == -2147483639) {
                     var13 = var0.field513;
                  }

                  Class69.field1005[var10++] = var13;
               } else if (var2[var20] instanceof String) {
                  var21 = (String)var2[var20];
                  if (var21.equals("event_opbase")) {
                     var21 = var0.field504;
                  }

                  Class130.field1800[var11++] = var21;
               }
            }

            var20 = 0;
            Class69.field1009 = var0.field514;

            while(true) {
               while(true) {
                  while(true) {
                     while(true) {
                        while(true) {
                           while(true) {
                              while(true) {
                                 while(true) {
                                    while(true) {
                                       while(true) {
                                          while(true) {
                                             while(true) {
                                                while(true) {
                                                   while(true) {
                                                      while(true) {
                                                         while(true) {
                                                            while(true) {
                                                               while(true) {
                                                                  while(true) {
                                                                     while(true) {
                                                                        while(true) {
                                                                           while(true) {
                                                                              while(true) {
                                                                                 while(true) {
                                                                                    while(true) {
                                                                                       label310:
                                                                                       while(true) {
                                                                                          ++var20;
                                                                                          if (var20 > var1) {
                                                                                             throw new RuntimeException();
                                                                                          }

                                                                                          ++var18;
                                                                                          var9 = var29[var18];
                                                                                          int var23;
                                                                                          if (var9 < 100) {
                                                                                             if (var9 != 0) {
                                                                                                if (var9 != 1) {
                                                                                                   if (var9 != 2) {
                                                                                                      if (var9 != 3) {
                                                                                                         if (var9 != 6) {
                                                                                                            if (var9 != 7) {
                                                                                                               if (var9 != 8) {
                                                                                                                  if (var9 != 9) {
                                                                                                                     if (var9 != 10) {
                                                                                                                        if (var9 != 21) {
                                                                                                                           if (var9 != 25) {
                                                                                                                              if (var9 != 27) {
                                                                                                                                 if (var9 != 31) {
                                                                                                                                    if (var9 != 32) {
                                                                                                                                       if (var9 != 33) {
                                                                                                                                          if (var9 != 34) {
                                                                                                                                             if (var9 != 35) {
                                                                                                                                                if (var9 != 36) {
                                                                                                                                                   if (var9 != 37) {
                                                                                                                                                      if (var9 != 38) {
                                                                                                                                                         if (var9 != 39) {
                                                                                                                                                            int var17;
                                                                                                                                                            if (var9 != 40) {
                                                                                                                                                               if (var9 != 42) {
                                                                                                                                                                  if (var9 != 43) {
                                                                                                                                                                     if (var9 == 44) {
                                                                                                                                                                        var13 = var19[var18] >> 16;
                                                                                                                                                                        var23 = var19[var18] & '\uffff';
                                                                                                                                                                        int var24 = Class69.field999[--Class69.field1003];
                                                                                                                                                                        if (var24 >= 0 && var24 <= 5000) {
                                                                                                                                                                           Class69.field1000[var13] = var24;
                                                                                                                                                                           byte var25 = -1;
                                                                                                                                                                           if (var23 == 105) {
                                                                                                                                                                              var25 = 0;
                                                                                                                                                                           }

                                                                                                                                                                           var17 = 0;

                                                                                                                                                                           while(true) {
                                                                                                                                                                              if (var17 >= var24) {
                                                                                                                                                                                 continue label310;
                                                                                                                                                                              }

                                                                                                                                                                              Class69.field1002[var13][var17] = var25;
                                                                                                                                                                              ++var17;
                                                                                                                                                                           }
                                                                                                                                                                        }

                                                                                                                                                                        throw new RuntimeException();
                                                                                                                                                                     } else if (var9 == 45) {
                                                                                                                                                                        var13 = var19[var18];
                                                                                                                                                                        var23 = Class69.field999[--Class69.field1003];
                                                                                                                                                                        if (var23 < 0 || var23 >= Class69.field1000[var13]) {
                                                                                                                                                                           throw new RuntimeException();
                                                                                                                                                                        }

                                                                                                                                                                        Class69.field999[++Class69.field1003 - 1] = Class69.field1002[var13][var23];
                                                                                                                                                                     } else if (var9 == 46) {
                                                                                                                                                                        var13 = var19[var18];
                                                                                                                                                                        Class69.field1003 -= 2;
                                                                                                                                                                        var23 = Class69.field999[Class69.field1003];
                                                                                                                                                                        if (var23 < 0 || var23 >= Class69.field1000[var13]) {
                                                                                                                                                                           throw new RuntimeException();
                                                                                                                                                                        }

                                                                                                                                                                        Class69.field1002[var13][var23] = Class69.field999[Class69.field1003 + 1];
                                                                                                                                                                     } else if (var9 == 47) {
                                                                                                                                                                        var21 = Class22.field185.method1890(var19[var18]);
                                                                                                                                                                        if (var21 == null) {
                                                                                                                                                                           var21 = "null";
                                                                                                                                                                        }

                                                                                                                                                                        Class69.field1001[++Class55.field497 - 1] = var21;
                                                                                                                                                                     } else if (var9 == 48) {
                                                                                                                                                                        Class22.field185.method1889(var19[var18], Class69.field1001[--Class55.field497]);
                                                                                                                                                                     } else {
                                                                                                                                                                        if (var9 != 60) {
                                                                                                                                                                           throw new IllegalStateException();
                                                                                                                                                                        }

                                                                                                                                                                        Class197 var35 = var3.field1194[var19[var18]];
                                                                                                                                                                        Class211 var32 = (Class211)var35.method3945((long)Class69.field999[--Class69.field1003]);
                                                                                                                                                                        if (var32 != null) {
                                                                                                                                                                           var18 += var32.field2438;
                                                                                                                                                                        }
                                                                                                                                                                     }
                                                                                                                                                                  } else {
                                                                                                                                                                     Class22.field185.method1903(var19[var18], Class69.field999[--Class69.field1003]);
                                                                                                                                                                  }
                                                                                                                                                               } else {
                                                                                                                                                                  Class69.field999[++Class69.field1003 - 1] = Class22.field185.method1897(var19[var18]);
                                                                                                                                                               }
                                                                                                                                                            } else {
                                                                                                                                                               var13 = var19[var18];
                                                                                                                                                               Class84 var31 = Class133.method3099(var13);
                                                                                                                                                               int[] var15 = new int[var31.field1192];
                                                                                                                                                               String[] var16 = new String[var31.field1193];

                                                                                                                                                               for(var17 = 0; var17 < var31.field1188; ++var17) {
                                                                                                                                                                  var15[var17] = Class69.field999[var17 + (Class69.field1003 - var31.field1188)];
                                                                                                                                                               }

                                                                                                                                                               for(var17 = 0; var17 < var31.field1195; ++var17) {
                                                                                                                                                                  var16[var17] = Class69.field1001[var17 + (Class55.field497 - var31.field1195)];
                                                                                                                                                               }

                                                                                                                                                               Class69.field1003 -= var31.field1188;
                                                                                                                                                               Class55.field497 -= var31.field1195;
                                                                                                                                                               Class51 var22 = new Class51();
                                                                                                                                                               var22.field466 = var3;
                                                                                                                                                               var22.field463 = var18;
                                                                                                                                                               var22.field462 = Class69.field1005;
                                                                                                                                                               var22.field465 = Class130.field1800;
                                                                                                                                                               Class69.field1006[++Class69.field1008 - 1] = var22;
                                                                                                                                                               var3 = var31;
                                                                                                                                                               var29 = var31.field1189;
                                                                                                                                                               var19 = var31.field1196;
                                                                                                                                                               var18 = -1;
                                                                                                                                                               Class69.field1005 = var15;
                                                                                                                                                               Class130.field1800 = var16;
                                                                                                                                                            }
                                                                                                                                                         } else {
                                                                                                                                                            --Class55.field497;
                                                                                                                                                         }
                                                                                                                                                      } else {
                                                                                                                                                         --Class69.field1003;
                                                                                                                                                      }
                                                                                                                                                   } else {
                                                                                                                                                      var13 = var19[var18];
                                                                                                                                                      Class55.field497 -= var13;
                                                                                                                                                      String var14 = Class251.method4794(Class69.field1001, Class55.field497, var13);
                                                                                                                                                      Class69.field1001[++Class55.field497 - 1] = var14;
                                                                                                                                                   }
                                                                                                                                                } else {
                                                                                                                                                   Class130.field1800[var19[var18]] = Class69.field1001[--Class55.field497];
                                                                                                                                                }
                                                                                                                                             } else {
                                                                                                                                                Class69.field1001[++Class55.field497 - 1] = Class130.field1800[var19[var18]];
                                                                                                                                             }
                                                                                                                                          } else {
                                                                                                                                             Class69.field1005[var19[var18]] = Class69.field999[--Class69.field1003];
                                                                                                                                          }
                                                                                                                                       } else {
                                                                                                                                          Class69.field999[++Class69.field1003 - 1] = Class69.field1005[var19[var18]];
                                                                                                                                       }
                                                                                                                                    } else {
                                                                                                                                       Class69.field1003 -= 2;
                                                                                                                                       if (Class69.field999[Class69.field1003] >= Class69.field999[Class69.field1003 + 1]) {
                                                                                                                                          var18 += var19[var18];
                                                                                                                                       }
                                                                                                                                    }
                                                                                                                                 } else {
                                                                                                                                    Class69.field1003 -= 2;
                                                                                                                                    if (Class69.field999[Class69.field1003] <= Class69.field999[Class69.field1003 + 1]) {
                                                                                                                                       var18 += var19[var18];
                                                                                                                                    }
                                                                                                                                 }
                                                                                                                              } else {
                                                                                                                                 var13 = var19[var18];
                                                                                                                                 Class67.method1685(var13, Class69.field999[--Class69.field1003]);
                                                                                                                              }
                                                                                                                           } else {
                                                                                                                              var13 = var19[var18];
                                                                                                                              Class69.field999[++Class69.field1003 - 1] = Class163.method3389(var13);
                                                                                                                           }
                                                                                                                        } else {
                                                                                                                           if (Class69.field1008 == 0) {
                                                                                                                              return;
                                                                                                                           }

                                                                                                                           Class51 var34 = Class69.field1006[--Class69.field1008];
                                                                                                                           var3 = var34.field466;
                                                                                                                           var29 = var3.field1189;
                                                                                                                           var19 = var3.field1196;
                                                                                                                           var18 = var34.field463;
                                                                                                                           Class69.field1005 = var34.field462;
                                                                                                                           Class130.field1800 = var34.field465;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        Class69.field1003 -= 2;
                                                                                                                        if (Class69.field999[Class69.field1003] > Class69.field999[Class69.field1003 + 1]) {
                                                                                                                           var18 += var19[var18];
                                                                                                                        }
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     Class69.field1003 -= 2;
                                                                                                                     if (Class69.field999[Class69.field1003] < Class69.field999[Class69.field1003 + 1]) {
                                                                                                                        var18 += var19[var18];
                                                                                                                     }
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  Class69.field1003 -= 2;
                                                                                                                  if (Class69.field999[Class69.field1003] == Class69.field999[Class69.field1003 + 1]) {
                                                                                                                     var18 += var19[var18];
                                                                                                                  }
                                                                                                               }
                                                                                                            } else {
                                                                                                               Class69.field1003 -= 2;
                                                                                                               if (Class69.field999[Class69.field1003] != Class69.field999[Class69.field1003 + 1]) {
                                                                                                                  var18 += var19[var18];
                                                                                                               }
                                                                                                            }
                                                                                                         } else {
                                                                                                            var18 += var19[var18];
                                                                                                         }
                                                                                                      } else {
                                                                                                         Class69.field1001[++Class55.field497 - 1] = var3.field1191[var18];
                                                                                                      }
                                                                                                   } else {
                                                                                                      var13 = var19[var18];
                                                                                                      Class225.field2558[var13] = Class69.field999[--Class69.field1003];
                                                                                                      Class45.method749(var13);
                                                                                                   }
                                                                                                } else {
                                                                                                   var13 = var19[var18];
                                                                                                   Class69.field999[++Class69.field1003 - 1] = Class225.field2558[var13];
                                                                                                }
                                                                                             } else {
                                                                                                Class69.field999[++Class69.field1003 - 1] = var19[var18];
                                                                                             }
                                                                                          } else {
                                                                                             boolean var33;
                                                                                             if (var3.field1196[var18] == 1) {
                                                                                                var33 = true;
                                                                                             } else {
                                                                                                var33 = false;
                                                                                             }

                                                                                             var23 = Class191.method3866(var9, var3, var33);
                                                                                             switch(var23) {
                                                                                             case 0:
                                                                                                return;
                                                                                             case 1:
                                                                                             default:
                                                                                                break;
                                                                                             case 2:
                                                                                                throw new IllegalStateException();
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
         } catch (Exception var28) {
            StringBuilder var27 = new StringBuilder(30);
            var27.append("").append(var3.field2421).append(" ");

            for(var20 = Class69.field1008 - 1; var20 >= 0; --var20) {
               var27.append("").append(Class69.field1006[var20].field466.field2421).append(" ");
            }

            var27.append("").append(var30);
            Class5.method65(var27.toString(), var28);
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "1705135152"
   )
   static synchronized void method5671(byte[] var0) {
      if (var0.length == 100 && Class183.field2344 < 1000) {
         Class183.field2340[++Class183.field2344 - 1] = var0;
      } else if (var0.length == 5000 && Class183.field2346 < 250) {
         Class183.field2343[++Class183.field2346 - 1] = var0;
      } else if (var0.length == 30000 && Class183.field2342 < 50) {
         Class183.field2345[++Class183.field2342 - 1] = var0;
      } else {
         if (Class183.field2341 != null) {
            for(int var1 = 0; var1 < Class183.field2348.length; ++var1) {
               if (var0.length == Class183.field2348[var1] && Class183.field2347[var1] < Class183.field2341[var1].length) {
                  Class183.field2341[var1][Class183.field2347[var1]++] = var0;
                  return;
               }
            }
         }

      }
   }
}
