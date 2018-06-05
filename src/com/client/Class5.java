package com.client;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.util.Comparator;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
final class Class5 implements Comparator {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ls;Ls;B)I",
      garbageValue = "43"
   )
   int method58(Class2 var1, Class2 var2) {
      return var1.field17.field30 < var2.field17.field30 ? -1 : (var2.field17.field30 == var1.field17.field30 ? 0 : 1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method58((Class2)var1, (Class2)var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
      garbageValue = "53"
   )
   public static void method65(String var0, Throwable var1) {
      if (var1 != null) {
         var1.printStackTrace();
      } else {
         try {
            String var2 = "";
            if (var1 != null) {
               Throwable var4 = var1;
               String var5;
               if (var1 instanceof Class152) {
                  Class152 var6 = (Class152)var1;
                  var5 = var6.field1941 + " | ";
                  var4 = var6.field1943;
               } else {
                  var5 = "";
               }

               StringWriter var18 = new StringWriter();
               PrintWriter var7 = new PrintWriter(var18);
               var4.printStackTrace(var7);
               var7.close();
               String var8 = var18.toString();
               BufferedReader var9 = new BufferedReader(new StringReader(var8));
               String var10 = var9.readLine();

               label63:
               while(true) {
                  while(true) {
                     String var11 = var9.readLine();
                     if (var11 == null) {
                        var5 = var5 + "| " + var10;
                        var2 = var5;
                        break label63;
                     }

                     int var12 = var11.indexOf(40);
                     int var13 = var11.indexOf(41, var12 + 1);
                     if (var12 >= 0 && var13 >= 0) {
                        String var14 = var11.substring(var12 + 1, var13);
                        int var15 = var14.indexOf(".java:");
                        if (var15 >= 0) {
                           var14 = var14.substring(0, var15) + var14.substring(var15 + 5);
                           var5 = var5 + var14 + ' ';
                           continue;
                        }

                        var11 = var11.substring(0, var12);
                     }

                     var11 = var11.trim();
                     var11 = var11.substring(var11.lastIndexOf(32) + 1);
                     var11 = var11.substring(var11.lastIndexOf(9) + 1);
                     var5 = var5 + var11 + ' ';
                  }
               }
            }

            if (var0 != null) {
               if (var1 != null) {
                  var2 = var2 + " | ";
               }

               var2 = var2 + var0;
            }

            System.out.println("Error: " + var2);
            var2 = var2.replace(':', '.');
            var2 = var2.replace('@', '_');
            var2 = var2.replace('&', '_');
            var2 = var2.replace('#', '_');
            if (Class152.field1938 == null) {
               return;
            }

            URL var3 = new URL(Class152.field1938.getCodeBase(), "clienterror.ws?c=" + Class42.field362 + "&u=" + Class152.field1939 + "&v1=" + Class154.field1960 + "&v2=" + Class154.field1954 + "&ct=" + Class152.field1940 + "&e=" + var2);
            DataInputStream var17 = new DataInputStream(var3.openStream());
            var17.read();
            var17.close();
         } catch (Exception var16) {
            ;
         }

      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(ILce;ZB)I",
      garbageValue = "116"
   )
   static int method59(int var0, Class84 var1, boolean var2) {
      if (var0 == 6500) {
         Class69.field999[++Class69.field1003 - 1] = Class4.method36() ? 1 : 0;
         return 1;
      } else {
         Class65 var3;
         if (var0 == 6501) {
            Class65.field944 = 0;
            var3 = Class236.method4592();
            if (var3 != null) {
               Class69.field999[++Class69.field1003 - 1] = var3.field947;
               Class69.field999[++Class69.field1003 - 1] = var3.field948;
               Class69.field1001[++Class55.field497 - 1] = var3.field951;
               Class69.field999[++Class69.field1003 - 1] = var3.field952;
               Class69.field999[++Class69.field1003 - 1] = var3.field955;
               Class69.field1001[++Class55.field497 - 1] = var3.field950;
            } else {
               Class69.field999[++Class69.field1003 - 1] = -1;
               Class69.field999[++Class69.field1003 - 1] = 0;
               Class69.field1001[++Class55.field497 - 1] = "";
               Class69.field999[++Class69.field1003 - 1] = 0;
               Class69.field999[++Class69.field1003 - 1] = 0;
               Class69.field1001[++Class55.field497 - 1] = "";
            }

            return 1;
         } else if (var0 == 6502) {
            var3 = Class236.method4592();
            if (var3 != null) {
               Class69.field999[++Class69.field1003 - 1] = var3.field947;
               Class69.field999[++Class69.field1003 - 1] = var3.field948;
               Class69.field1001[++Class55.field497 - 1] = var3.field951;
               Class69.field999[++Class69.field1003 - 1] = var3.field952;
               Class69.field999[++Class69.field1003 - 1] = var3.field955;
               Class69.field1001[++Class55.field497 - 1] = var3.field950;
            } else {
               Class69.field999[++Class69.field1003 - 1] = -1;
               Class69.field999[++Class69.field1003 - 1] = 0;
               Class69.field1001[++Class55.field497 - 1] = "";
               Class69.field999[++Class69.field1003 - 1] = 0;
               Class69.field999[++Class69.field1003 - 1] = 0;
               Class69.field1001[++Class55.field497 - 1] = "";
            }

            return 1;
         } else {
            Class65 var4;
            int var5;
            int var11;
            if (var0 == 6506) {
               var11 = Class69.field999[--Class69.field1003];
               var4 = null;

               for(var5 = 0; var5 < Class65.field945; ++var5) {
                  if (var11 == Class65.field949[var5].field947) {
                     var4 = Class65.field949[var5];
                     break;
                  }
               }

               if (var4 != null) {
                  Class69.field999[++Class69.field1003 - 1] = var4.field947;
                  Class69.field999[++Class69.field1003 - 1] = var4.field948;
                  Class69.field1001[++Class55.field497 - 1] = var4.field951;
                  Class69.field999[++Class69.field1003 - 1] = var4.field952;
                  Class69.field999[++Class69.field1003 - 1] = var4.field955;
                  Class69.field1001[++Class55.field497 - 1] = var4.field950;
               } else {
                  Class69.field999[++Class69.field1003 - 1] = -1;
                  Class69.field999[++Class69.field1003 - 1] = 0;
                  Class69.field1001[++Class55.field497 - 1] = "";
                  Class69.field999[++Class69.field1003 - 1] = 0;
                  Class69.field999[++Class69.field1003 - 1] = 0;
                  Class69.field1001[++Class55.field497 - 1] = "";
               }

               return 1;
            } else if (var0 == 6507) {
               Class69.field1003 -= 4;
               var11 = Class69.field999[Class69.field1003];
               boolean var15 = Class69.field999[Class69.field1003 + 1] == 1;
               var5 = Class69.field999[Class69.field1003 + 2];
               boolean var6 = Class69.field999[Class69.field1003 + 3] == 1;
               if (Class65.field949 != null) {
                  Class120.method2781(0, Class65.field949.length - 1, var11, var15, var5, var6);
               }

               return 1;
            } else if (var0 != 6511) {
               if (var0 == 6512) {
                  Client.field725 = Class69.field999[--Class69.field1003] == 1;
                  return 1;
               } else {
                  int var12;
                  Class264 var13;
                  if (var0 == 6513) {
                     Class69.field1003 -= 2;
                     var11 = Class69.field999[Class69.field1003];
                     var12 = Class69.field999[Class69.field1003 + 1];
                     var13 = Class241.method4603(var12);
                     if (var13.method4951()) {
                        Class69.field1001[++Class55.field497 - 1] = Class270.method5157(var11).method5167(var12, var13.field3333);
                     } else {
                        Class69.field999[++Class69.field1003 - 1] = Class270.method5157(var11).method5166(var12, var13.field3330);
                     }

                     return 1;
                  } else if (var0 == 6514) {
                     Class69.field1003 -= 2;
                     var11 = Class69.field999[Class69.field1003];
                     var12 = Class69.field999[Class69.field1003 + 1];
                     var13 = Class241.method4603(var12);
                     if (var13.method4951()) {
                        Class69.field1001[++Class55.field497 - 1] = Class110.method2527(var11).method5036(var12, var13.field3333);
                     } else {
                        Class69.field999[++Class69.field1003 - 1] = Class110.method2527(var11).method5035(var12, var13.field3330);
                     }

                     return 1;
                  } else if (var0 == 6515) {
                     Class69.field1003 -= 2;
                     var11 = Class69.field999[Class69.field1003];
                     var12 = Class69.field999[Class69.field1003 + 1];
                     var13 = Class241.method4603(var12);
                     if (var13.method4951()) {
                        Class69.field1001[++Class55.field497 - 1] = Class111.method2563(var11).method5121(var12, var13.field3333);
                     } else {
                        Class69.field999[++Class69.field1003 - 1] = Class111.method2563(var11).method5099(var12, var13.field3330);
                     }

                     return 1;
                  } else if (var0 == 6516) {
                     Class69.field1003 -= 2;
                     var11 = Class69.field999[Class69.field1003];
                     var12 = Class69.field999[Class69.field1003 + 1];
                     var13 = Class241.method4603(var12);
                     int var7;
                     Class265 var8;
                     Class265 var9;
                     byte[] var10;
                     if (var13.method4951()) {
                        String[] var14 = Class69.field1001;
                        var7 = ++Class55.field497 - 1;
                        var9 = (Class265)Class265.field3334.method3989((long)var11);
                        if (var9 != null) {
                           var8 = var9;
                        } else {
                           var10 = Class7.field42.method4625(34, var11);
                           var9 = new Class265();
                           if (var10 != null) {
                              var9.method4960(new Class182(var10));
                           }

                           var9.method4961();
                           Class265.field3334.method3983(var9, (long)var11);
                           var8 = var9;
                        }

                        var14[var7] = var8.method4963(var12, var13.field3333);
                     } else {
                        int[] var16 = Class69.field999;
                        var7 = ++Class69.field1003 - 1;
                        var9 = (Class265)Class265.field3334.method3989((long)var11);
                        if (var9 != null) {
                           var8 = var9;
                        } else {
                           var10 = Class7.field42.method4625(34, var11);
                           var9 = new Class265();
                           if (var10 != null) {
                              var9.method4960(new Class182(var10));
                           }

                           var9.method4961();
                           Class265.field3334.method3983(var9, (long)var11);
                           var8 = var9;
                        }

                        var16[var7] = var8.method4962(var12, var13.field3330);
                     }

                     return 1;
                  } else if (var0 == 6518) {
                     Class69.field999[++Class69.field1003 - 1] = Client.field588 ? 1 : 0;
                     return 1;
                  } else if (var0 == 6520) {
                     return 1;
                  } else if (var0 == 6521) {
                     return 1;
                  } else if (var0 == 6522) {
                     --Class55.field497;
                     --Class69.field1003;
                     return 1;
                  } else if (var0 == 6523) {
                     --Class55.field497;
                     --Class69.field1003;
                     return 1;
                  } else if (var0 == 6524) {
                     Class69.field999[++Class69.field1003 - 1] = -1;
                     return 1;
                  } else if (var0 == 6525) {
                     Class69.field999[++Class69.field1003 - 1] = 1;
                     return 1;
                  } else if (var0 == 6526) {
                     Class69.field999[++Class69.field1003 - 1] = 1;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var11 = Class69.field999[--Class69.field1003];
               if (var11 >= 0 && var11 < Class65.field945) {
                  var4 = Class65.field949[var11];
                  Class69.field999[++Class69.field1003 - 1] = var4.field947;
                  Class69.field999[++Class69.field1003 - 1] = var4.field948;
                  Class69.field1001[++Class55.field497 - 1] = var4.field951;
                  Class69.field999[++Class69.field1003 - 1] = var4.field952;
                  Class69.field999[++Class69.field1003 - 1] = var4.field955;
                  Class69.field1001[++Class55.field497 - 1] = var4.field950;
               } else {
                  Class69.field999[++Class69.field1003 - 1] = -1;
                  Class69.field999[++Class69.field1003 - 1] = 0;
                  Class69.field1001[++Class55.field497 - 1] = "";
                  Class69.field999[++Class69.field1003 - 1] = 0;
                  Class69.field999[++Class69.field1003 - 1] = 0;
                  Class69.field1001[++Class55.field497 - 1] = "";
               }

               return 1;
            }
         }
      }
   }
}
