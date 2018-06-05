package com.client;
import java.util.Date;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
public class Class57 implements Runnable {
   @ObfuscatedName("fx")
   @ObfuscatedGetter(
      intValue = -245212773
   )
   static int field524;
   @ObfuscatedName("z")
   boolean field529 = true;
   @ObfuscatedName("w")
   Object field523 = new Object();
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 139404487
   )
   int field522 = 0;
   @ObfuscatedName("l")
   int[] field525 = new int[500];
   @ObfuscatedName("u")
   int[] field526 = new int[500];

   public void run() {
      for(; this.field529; Class63.method1539(50L)) {
         Object var1 = this.field523;
         synchronized(this.field523) {
            if (this.field522 < 500) {
               this.field525[this.field522] = Class48.field425;
               this.field526[this.field522] = Class48.field426 * 673804999;
               ++this.field522;
            }
         }
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)Lib;",
      garbageValue = "-1295663391"
   )
   public static Class258 method1035(int var0) {
      Class258 var1 = (Class258)Class258.field3267.method3989((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Class258.field3272.method4625(13, var0);
         var1 = new Class258();
         var1.field3280 = var0;
         if (var2 != null) {
            var1.method4864(new Class182(var2));
         }

         Class258.field3267.method3983(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-332860398"
   )
   static int method1034(int var0, Class84 var1, boolean var2) {
      String var3;
      int var4;
      if (var0 == 4100) {
         var3 = Class69.field1001[--Class55.field497];
         var4 = Class69.field999[--Class69.field1003];
         Class69.field1001[++Class55.field497 - 1] = var3 + var4;
         return 1;
      } else {
         String var27;
         if (var0 == 4101) {
            Class55.field497 -= 2;
            var3 = Class69.field1001[Class55.field497];
            var27 = Class69.field1001[Class55.field497 + 1];
            Class69.field1001[++Class55.field497 - 1] = var3 + var27;
            return 1;
         } else {
            int var26;
            if (var0 == 4102) {
               var3 = Class69.field1001[--Class55.field497];
               var4 = Class69.field999[--Class69.field1003];
               String[] var5 = Class69.field1001;
               var26 = ++Class55.field497 - 1;
               String var8;
               if (var4 < 0) {
                  var8 = Integer.toString(var4);
               } else {
                  int var10 = var4;
                  String var9;
                  if (var4 < 0) {
                     var9 = Integer.toString(var4, 10);
                  } else {
                     int var11 = 2;

                     for(int var12 = var4 / 10; var12 != 0; ++var11) {
                        var12 /= 10;
                     }

                     char[] var13 = new char[var11];
                     var13[0] = '+';

                     for(int var14 = var11 - 1; var14 > 0; --var14) {
                        int var15 = var10;
                        var10 /= 10;
                        int var16 = var15 - var10 * 10;
                        if (var16 >= 10) {
                           var13[var14] = (char)(var16 + 87);
                        } else {
                           var13[var14] = (char)(var16 + 48);
                        }
                     }

                     var9 = new String(var13);
                  }

                  var8 = var9;
               }

               var5[var26] = var3 + var8;
               return 1;
            } else if (var0 == 4103) {
               var3 = Class69.field1001[--Class55.field497];
               Class69.field1001[++Class55.field497 - 1] = var3.toLowerCase();
               return 1;
            } else {
               int var18;
               if (var0 == 4104) {
                  var18 = Class69.field999[--Class69.field1003];
                  long var19 = 86400000L * ((long)var18 + 11745L);
                  Class69.field1007.setTime(new Date(var19));
                  var26 = Class69.field1007.get(5);
                  int var29 = Class69.field1007.get(2);
                  int var22 = Class69.field1007.get(1);
                  Class69.field1001[++Class55.field497 - 1] = var26 + "-" + Class69.field998[var29] + "-" + var22;
                  return 1;
               } else if (var0 == 4105) {
                  Class55.field497 -= 2;
                  var3 = Class69.field1001[Class55.field497];
                  var27 = Class69.field1001[Class55.field497 + 1];
                  if (Class138.field1876.field546 != null && Class138.field1876.field546.field2571) {
                     Class69.field1001[++Class55.field497 - 1] = var27;
                  } else {
                     Class69.field1001[++Class55.field497 - 1] = var3;
                  }

                  return 1;
               } else if (var0 == 4106) {
                  var18 = Class69.field999[--Class69.field1003];
                  Class69.field1001[++Class55.field497 - 1] = Integer.toString(var18);
                  return 1;
               } else if (var0 == 4107) {
                  Class55.field497 -= 2;
                  int[] var25 = Class69.field999;
                  var4 = ++Class69.field1003 - 1;
                  var26 = Class155.method3269(Class69.field1001[Class55.field497], Class69.field1001[Class55.field497 + 1], Client.field827);
                  byte var31;
                  if (var26 > 0) {
                     var31 = 1;
                  } else if (var26 < 0) {
                     var31 = -1;
                  } else {
                     var31 = 0;
                  }

                  var25[var4] = var31;
                  return 1;
               } else {
                  Class298 var7;
                  int var23;
                  byte[] var24;
                  if (var0 == 4108) {
                     var3 = Class69.field1001[--Class55.field497];
                     Class69.field1003 -= 2;
                     var4 = Class69.field999[Class69.field1003];
                     var23 = Class69.field999[Class69.field1003 + 1];
                     var24 = Class50.field461.method4625(var23, 0);
                     var7 = new Class298(var24);
                     Class69.field999[++Class69.field1003 - 1] = var7.method5520(var3, var4);
                     return 1;
                  } else if (var0 == 4109) {
                     var3 = Class69.field1001[--Class55.field497];
                     Class69.field1003 -= 2;
                     var4 = Class69.field999[Class69.field1003];
                     var23 = Class69.field999[Class69.field1003 + 1];
                     var24 = Class50.field461.method4625(var23, 0);
                     var7 = new Class298(var24);
                     Class69.field999[++Class69.field1003 - 1] = var7.method5519(var3, var4);
                     return 1;
                  } else if (var0 == 4110) {
                     Class55.field497 -= 2;
                     var3 = Class69.field1001[Class55.field497];
                     var27 = Class69.field1001[Class55.field497 + 1];
                     if (Class69.field999[--Class69.field1003] == 1) {
                        Class69.field1001[++Class55.field497 - 1] = var3;
                     } else {
                        Class69.field1001[++Class55.field497 - 1] = var27;
                     }

                     return 1;
                  } else if (var0 == 4111) {
                     var3 = Class69.field1001[--Class55.field497];
                     Class69.field1001[++Class55.field497 - 1] = Class299.method5521(var3);
                     return 1;
                  } else if (var0 == 4112) {
                     var3 = Class69.field1001[--Class55.field497];
                     var4 = Class69.field999[--Class69.field1003];
                     Class69.field1001[++Class55.field497 - 1] = var3 + (char)var4;
                     return 1;
                  } else if (var0 == 4113) {
                     var18 = Class69.field999[--Class69.field1003];
                     Class69.field999[++Class69.field1003 - 1] = Class52.method1002((char)var18) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4114) {
                     var18 = Class69.field999[--Class69.field1003];
                     Class69.field999[++Class69.field1003 - 1] = Class161.method3362((char)var18) ? 1 : 0;
                     return 1;
                  } else {
                     boolean var6;
                     int[] var17;
                     char var21;
                     if (var0 == 4115) {
                        var18 = Class69.field999[--Class69.field1003];
                        var17 = Class69.field999;
                        var23 = ++Class69.field1003 - 1;
                        var21 = (char)var18;
                        var6 = var21 >= 'A' && var21 <= 'Z' || var21 >= 'a' && var21 <= 'z';
                        var17[var23] = var6 ? 1 : 0;
                        return 1;
                     } else if (var0 != 4116) {
                        if (var0 == 4117) {
                           var3 = Class69.field1001[--Class55.field497];
                           if (var3 != null) {
                              Class69.field999[++Class69.field1003 - 1] = var3.length();
                           } else {
                              Class69.field999[++Class69.field1003 - 1] = 0;
                           }

                           return 1;
                        } else if (var0 == 4118) {
                           var3 = Class69.field1001[--Class55.field497];
                           Class69.field1003 -= 2;
                           var4 = Class69.field999[Class69.field1003];
                           var23 = Class69.field999[Class69.field1003 + 1];
                           Class69.field1001[++Class55.field497 - 1] = var3.substring(var4, var23);
                           return 1;
                        } else if (var0 == 4119) {
                           var3 = Class69.field1001[--Class55.field497];
                           StringBuilder var28 = new StringBuilder(var3.length());
                           boolean var30 = false;

                           for(var26 = 0; var26 < var3.length(); ++var26) {
                              var21 = var3.charAt(var26);
                              if (var21 == '<') {
                                 var30 = true;
                              } else if (var21 == '>') {
                                 var30 = false;
                              } else if (!var30) {
                                 var28.append(var21);
                              }
                           }

                           Class69.field1001[++Class55.field497 - 1] = var28.toString();
                           return 1;
                        } else if (var0 == 4120) {
                           var3 = Class69.field1001[--Class55.field497];
                           var4 = Class69.field999[--Class69.field1003];
                           Class69.field999[++Class69.field1003 - 1] = var3.indexOf(var4);
                           return 1;
                        } else if (var0 == 4121) {
                           Class55.field497 -= 2;
                           var3 = Class69.field1001[Class55.field497];
                           var27 = Class69.field1001[Class55.field497 + 1];
                           var23 = Class69.field999[--Class69.field1003];
                           Class69.field999[++Class69.field1003 - 1] = var3.indexOf(var27, var23);
                           return 1;
                        } else {
                           return 2;
                        }
                     } else {
                        var18 = Class69.field999[--Class69.field1003];
                        var17 = Class69.field999;
                        var23 = ++Class69.field1003 - 1;
                        var21 = (char)var18;
                        var6 = var21 >= '0' && var21 <= '9';
                        var17[var23] = var6 ? 1 : 0;
                        return 1;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-113"
   )
   public static void method1036() {
      Class269.field3461.method3984();
      Class269.field3428.method3984();
      Class269.field3429.method3984();
   }
}
