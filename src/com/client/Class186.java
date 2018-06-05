package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
public abstract class Class186 {
   @ObfuscatedName("w")
   static boolean field2365 = false;
   @ObfuscatedName("ah")
   static int[] field2367;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)[B",
      garbageValue = "-44"
   )
   abstract byte[] vmethod3789();

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "339302128"
   )
   abstract void vmethod3792(byte[] var1);

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Laj;I)V",
      garbageValue = "-1775785270"
   )
   static void method3806(Class47 var0) {
      int var3;
      int var14;
      if (Class78.field1107) {
         if (Class48.field431 == 1 || !Class253.field3229 && Class48.field431 == 4) {
            int var1 = Class78.field1082 + 280;
            if (Class48.field432 >= var1 && Class48.field432 <= var1 + 14 && Class48.field428 >= 4 && Class48.field428 <= 18) {
               Class148.method3195(0, 0);
            } else if (Class48.field432 >= var1 + 15 && Class48.field432 <= var1 + 80 && Class48.field428 >= 4 && Class48.field428 <= 18) {
               Class148.method3195(0, 1);
            } else {
               int var2 = Class78.field1082 + 390;
               if (Class48.field432 >= var2 && Class48.field432 <= var2 + 14 && Class48.field428 >= 4 && Class48.field428 <= 18) {
                  Class148.method3195(1, 0);
               } else if (Class48.field432 >= var2 + 15 && Class48.field432 <= var2 + 80 && Class48.field428 >= 4 && Class48.field428 <= 18) {
                  Class148.method3195(1, 1);
               } else {
                  var3 = Class78.field1082 + 500;
                  if (Class48.field432 >= var3 && Class48.field432 <= var3 + 14 && Class48.field428 >= 4 && Class48.field428 <= 18) {
                     Class148.method3195(2, 0);
                  } else if (Class48.field432 >= var3 + 15 && Class48.field432 <= var3 + 80 && Class48.field428 >= 4 && Class48.field428 <= 18) {
                     Class148.method3195(2, 1);
                  } else {
                     var14 = Class78.field1082 + 610;
                     if (Class48.field432 >= var14 && Class48.field432 <= var14 + 14 && Class48.field428 >= 4 && Class48.field428 <= 18) {
                        Class148.method3195(3, 0);
                     } else if (Class48.field432 >= var14 + 15 && Class48.field432 <= var14 + 80 && Class48.field428 >= 4 && Class48.field428 <= 18) {
                        Class148.method3195(3, 1);
                     } else if (Class48.field432 >= Class78.field1082 + 708 && Class48.field428 >= 4 && Class48.field432 <= Class78.field1082 + 708 + 50 && Class48.field428 <= 20) {
                        Class78.field1107 = false;
                        Class78.field1092.method5849(Class78.field1082, 0);
                        Class78.field1087.method5849(Class78.field1082 + 382, 0);
                        Class78.field1117.method5829(Class78.field1082 + 382 - Class78.field1117.field3780 / 2, 18);
                     } else if (Class78.field1116 != -1) {
                        Class65 var5 = Class65.field949[Class78.field1116];
                        Class61.method1129(var5);
                        Class78.field1107 = false;
                        Class78.field1092.method5849(Class78.field1082, 0);
                        Class78.field1087.method5849(Class78.field1082 + 382, 0);
                        Class78.field1117.method5829(Class78.field1082 + 382 - Class78.field1117.field3780 / 2, 18);
                     }
                  }
               }
            }
         }

      } else {
         if ((Class48.field431 == 1 || !Class253.field3229 && Class48.field431 == 4) && Class48.field432 >= Class78.field1082 + 765 - 50 && Class48.field428 >= 453) {
            Class10.field61.field958 = !Class10.field61.field958;
            Class54.method1018();
            if (!Class10.field61.field958) {
               Class219.method4325(Class80.field1147, "scape main", "", 255, false);
            } else {
               Class9.method88();
            }
         }

         if (Client.field589 != 5) {
            if (-1L == Class78.field1109) {
               Class78.field1109 = Class182.method3547() + 1000L;
            }

            long var11 = Class182.method3547();
            if (Class10.method92() && Class78.field1118 == -1L) {
               Class78.field1118 = var11;
               if (Class78.field1118 > Class78.field1109) {
                  Class78.field1109 = Class78.field1118;
               }
            }

            ++Class78.field1097;
            if (Client.field589 == 10 || Client.field589 == 11) {
               if (Client.field827 == 0) {
                  if (Class48.field431 == 1 || !Class253.field3229 && Class48.field431 == 4) {
                     var3 = Class78.field1082 + 5;
                     short var4 = 463;
                     byte var13 = 100;
                     byte var6 = 35;
                     if (Class48.field432 >= var3 && Class48.field432 <= var3 + var13 && Class48.field428 >= var4 && Class48.field428 <= var4 + var6) {
                        Class59.method1078();
                        return;
                     }
                  }

                  if (Class49.field439 != null) {
                     Class59.method1078();
                  }
               }

               var3 = Class48.field431;
               var14 = Class48.field432;
               int var21 = Class48.field428;
               if (var3 == 0) {
                  var14 = Class48.field425;
                  var21 = Class48.field426 * 673804999;
               }

               if (!Class253.field3229 && var3 == 4) {
                  var3 = 1;
               }

               int var7;
               short var8;
               if (Class78.field1081 == 0) {
                  boolean var15 = false;

                  while(Class1.method8()) {
                     if (Class163.field2016 == 84) {
                        var15 = true;
                     }
                  }

                  var7 = Class78.field1091 - 80;
                  var8 = 291;
                  if (var3 == 1 && var14 >= var7 - 75 && var14 <= var7 + 75 && var21 >= var8 - 20 && var21 <= var8 + 20) {
                     Class270.method5156(Class142.method3161("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var7 = Class78.field1091 + 80;
                  if (var3 == 1 && var14 >= var7 - 75 && var14 <= var7 + 75 && var21 >= var8 - 20 && var21 <= var8 + 20 || var15) {
                     if ((Client.field632 & 33554432) != 0) {
                        Class78.field1098 = "";
                        Class78.field1103 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                        Class78.field1112 = "Your normal account will not be affected.";
                        Class78.field1105 = "";
                        Class78.field1081 = 1;
                        Class34.method586();
                     } else if ((Client.field632 & 4) != 0) {
                        if ((Client.field632 & 1024) != 0) {
                           Class78.field1103 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                           Class78.field1112 = "Players can attack each other almost everywhere";
                           Class78.field1105 = "and the Protect Item prayer won't work.";
                        } else {
                           Class78.field1103 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                           Class78.field1112 = "Players can attack each other";
                           Class78.field1105 = "almost everywhere.";
                        }

                        Class78.field1098 = "Warning!";
                        Class78.field1081 = 1;
                        Class34.method586();
                     } else if ((Client.field632 & 1024) != 0) {
                        Class78.field1103 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                        Class78.field1112 = "The Protect Item prayer will";
                        Class78.field1105 = "not work on this world.";
                        Class78.field1098 = "Warning!";
                        Class78.field1081 = 1;
                        Class34.method586();
                     } else {
                        Class56.method1030(false);
                     }
                  }
               } else {
                  int var16;
                  short var18;
                  if (Class78.field1081 != 1) {
                     short var17;
                     if (Class78.field1081 == 2) {
                        var17 = 201;
                        var16 = var17 + 52;
                        if (var3 == 1 && var21 >= var16 - 12 && var21 < var16 + 2) {
                           Class78.field1102 = 0;
                        }

                        var16 += 15;
                        if (var3 == 1 && var21 >= var16 - 12 && var21 < var16 + 2) {
                           Class78.field1102 = 1;
                        }

                        var16 += 15;
                        var17 = 361;
                        if (var3 == 1 && var21 >= var17 - 15 && var21 < var17) {
                           Class2.method22("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                           Class78.field1081 = 5;
                           return;
                        }

                        var7 = Class78.field1091 - 80;
                        var8 = 321;
                        if (var3 == 1 && var14 >= var7 - 75 && var14 <= var7 + 75 && var21 >= var8 - 20 && var21 <= var8 + 20) {
                           Class78.field1106 = Class78.field1106.trim();
                           if (Class78.field1106.length() == 0) {
                              Class2.method22("", "Please enter your username/email address.", "");
                              return;
                           }

                           if (Class78.field1086.length() == 0) {
                              Class2.method22("", "Please enter your password.", "");
                              return;
                           }

                           Class2.method22("", "Connecting to server...", "");
                           NetWriter.method2005(false);
                           Class48.method947(20);
                           return;
                        }

                        var7 = Class78.field1090 + 180 + 80;
                        if (var3 == 1 && var14 >= var7 - 75 && var14 <= var7 + 75 && var21 >= var8 - 20 && var21 <= var8 + 20) {
                           Class78.field1081 = 0;
                           Class78.field1106 = "";
                           Class78.field1086 = "";
                           Class14.field104 = 0;
                           Class28.field238 = "";
                           Class78.field1104 = true;
                        }

                        var7 = Class78.field1091 + -117;
                        var8 = 277;
                        Class78.field1110 = var14 >= var7 && var14 < var7 + Class67.field978 && var21 >= var8 && var21 < var8 + Class66.field966;
                        if (var3 == 1 && Class78.field1110) {
                           Class78.field1108 = !Class78.field1108;
                           if (!Class78.field1108 && Class10.field61.field959 != null) {
                              Class10.field61.field959 = null;
                              Class54.method1018();
                           }
                        }

                        var7 = Class78.field1091 + 24;
                        var8 = 277;
                        Class78.field1115 = var14 >= var7 && var14 < var7 + Class67.field978 && var21 >= var8 && var21 < var8 + Class66.field966;
                        if (var3 == 1 && Class78.field1115) {
                           Class10.field61.field962 = !Class10.field61.field962;
                           if (!Class10.field61.field962) {
                              Class78.field1106 = "";
                              Class10.field61.field959 = null;
                              Class34.method586();
                           }

                           Class54.method1018();
                        }

                        while(true) {
                           while(Class1.method8()) {
                              boolean var9 = false;

                              for(int var10 = 0; var10 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var10) {
                                 if (Class39.field342 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var10)) {
                                    var9 = true;
                                    break;
                                 }
                              }

                              if (Class163.field2016 == 13) {
                                 Class78.field1081 = 0;
                                 Class78.field1106 = "";
                                 Class78.field1086 = "";
                                 Class14.field104 = 0;
                                 Class28.field238 = "";
                                 Class78.field1104 = true;
                              } else if (Class78.field1102 == 0) {
                                 if (Class163.field2016 == 85 && Class78.field1106.length() > 0) {
                                    Class78.field1106 = Class78.field1106.substring(0, Class78.field1106.length() - 1);
                                 }

                                 if (Class163.field2016 == 84 || Class163.field2016 == 80) {
                                    Class78.field1102 = 1;
                                 }

                                 if (var9 && Class78.field1106.length() < 320) {
                                    Class78.field1106 = Class78.field1106 + Class39.field342;
                                 }
                              } else if (Class78.field1102 == 1) {
                                 if (Class163.field2016 == 85 && Class78.field1086.length() > 0) {
                                    Class78.field1086 = Class78.field1086.substring(0, Class78.field1086.length() - 1);
                                 }

                                 if (Class163.field2016 == 84 || Class163.field2016 == 80) {
                                    Class78.field1102 = 0;
                                 }

                                 if (Class163.field2016 == 84) {
                                    Class78.field1106 = Class78.field1106.trim();
                                    if (Class78.field1106.length() == 0) {
                                       Class2.method22("", "Please enter your username/email address.", "");
                                       return;
                                    }

                                    if (Class78.field1086.length() == 0) {
                                       Class2.method22("", "Please enter your password.", "");
                                       return;
                                    }

                                    Class2.method22("", "Connecting to server...", "");
                                    NetWriter.method2005(false);
                                    Class48.method947(20);
                                    return;
                                 }

                                 if (var9 && Class78.field1086.length() < 20) {
                                    Class78.field1086 = Class78.field1086 + Class39.field342;
                                 }
                              }
                           }

                           return;
                        }
                     } else if (Class78.field1081 == 3) {
                        var16 = Class78.field1090 + 180;
                        var18 = 276;
                        if (var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                           Class56.method1030(false);
                        }

                        var16 = Class78.field1090 + 180;
                        var18 = 326;
                        if (var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                           Class2.method22("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                           Class78.field1081 = 5;
                           return;
                        }
                     } else {
                        boolean var19;
                        int var20;
                        if (Class78.field1081 == 4) {
                           var16 = Class78.field1090 + 180 - 80;
                           var18 = 321;
                           if (var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                              Class28.field238.trim();
                              if (Class28.field238.length() != 6) {
                                 Class2.method22("", "Please enter a 6-digit PIN.", "");
                                 return;
                              }

                              Class14.field104 = Integer.parseInt(Class28.field238);
                              Class28.field238 = "";
                              NetWriter.method2005(true);
                              Class2.method22("", "Connecting to server...", "");
                              Class48.method947(20);
                              return;
                           }

                           if (var3 == 1 && var14 >= Class78.field1090 + 180 - 9 && var14 <= Class78.field1090 + 180 + 130 && var21 >= 263 && var21 <= 296) {
                              Class78.field1104 = !Class78.field1104;
                           }

                           if (var3 == 1 && var14 >= Class78.field1090 + 180 - 34 && var14 <= Class78.field1090 + 34 + 180 && var21 >= 351 && var21 <= 363) {
                              Class270.method5156(Class142.method3161("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                           }

                           var16 = Class78.field1090 + 180 + 80;
                           if (var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                              Class78.field1081 = 0;
                              Class78.field1106 = "";
                              Class78.field1086 = "";
                              Class14.field104 = 0;
                              Class28.field238 = "";
                           }

                           while(Class1.method8()) {
                              var19 = false;

                              for(var20 = 0; var20 < "1234567890".length(); ++var20) {
                                 if (Class39.field342 == "1234567890".charAt(var20)) {
                                    var19 = true;
                                    break;
                                 }
                              }

                              if (Class163.field2016 == 13) {
                                 Class78.field1081 = 0;
                                 Class78.field1106 = "";
                                 Class78.field1086 = "";
                                 Class14.field104 = 0;
                                 Class28.field238 = "";
                              } else {
                                 if (Class163.field2016 == 85 && Class28.field238.length() > 0) {
                                    Class28.field238 = Class28.field238.substring(0, Class28.field238.length() - 1);
                                 }

                                 if (Class163.field2016 == 84) {
                                    Class28.field238.trim();
                                    if (Class28.field238.length() != 6) {
                                       Class2.method22("", "Please enter a 6-digit PIN.", "");
                                       return;
                                    }

                                    Class14.field104 = Integer.parseInt(Class28.field238);
                                    Class28.field238 = "";
                                    NetWriter.method2005(true);
                                    Class2.method22("", "Connecting to server...", "");
                                    Class48.method947(20);
                                    return;
                                 }

                                 if (var19 && Class28.field238.length() < 6) {
                                    Class28.field238 = Class28.field238 + Class39.field342;
                                 }
                              }
                           }
                        } else if (Class78.field1081 == 5) {
                           var16 = Class78.field1090 + 180 - 80;
                           var18 = 321;
                           if (var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                              Class234.method4590();
                              return;
                           }

                           var16 = Class78.field1090 + 180 + 80;
                           if (var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                              Class56.method1030(true);
                           }

                           while(Class1.method8()) {
                              var19 = false;

                              for(var20 = 0; var20 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var20) {
                                 if (Class39.field342 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var20)) {
                                    var19 = true;
                                    break;
                                 }
                              }

                              if (Class163.field2016 == 13) {
                                 Class56.method1030(true);
                              } else {
                                 if (Class163.field2016 == 85 && Class78.field1106.length() > 0) {
                                    Class78.field1106 = Class78.field1106.substring(0, Class78.field1106.length() - 1);
                                 }

                                 if (Class163.field2016 == 84) {
                                    Class234.method4590();
                                    return;
                                 }

                                 if (var19 && Class78.field1106.length() < 320) {
                                    Class78.field1106 = Class78.field1106 + Class39.field342;
                                 }
                              }
                           }
                        } else if (Class78.field1081 == 6) {
                           while(true) {
                              do {
                                 if (!Class1.method8()) {
                                    var17 = 321;
                                    if (var3 == 1 && var21 >= var17 - 20 && var21 <= var17 + 20) {
                                       Class56.method1030(true);
                                    }

                                    return;
                                 }
                              } while(Class163.field2016 != 84 && Class163.field2016 != 13);

                              Class56.method1030(true);
                           }
                        } else if (Class78.field1081 == 7) {
                           var16 = Class78.field1090 + 180 - 80;
                           var18 = 321;
                           if (var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                              Class270.method5156(Class142.method3161("secure", true) + "m=dob/set_dob.ws", true, false);
                              Class2.method22("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              Class78.field1081 = 6;
                              return;
                           }

                           var16 = Class78.field1090 + 180 + 80;
                           if (var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                              Class56.method1030(true);
                           }
                        } else if (Class78.field1081 == 8) {
                           var16 = Class78.field1090 + 180 - 80;
                           var18 = 321;
                           if (var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                              Class270.method5156("https://www.jagex.com/terms/privacy/#eight", true, false);
                              Class2.method22("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              Class78.field1081 = 6;
                              return;
                           }

                           var16 = Class78.field1090 + 180 + 80;
                           if (var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                              Class56.method1030(true);
                           }
                        }
                     }
                  } else {
                     while(Class1.method8()) {
                        if (Class163.field2016 == 84) {
                           Class56.method1030(false);
                        } else if (Class163.field2016 == 13) {
                           Class78.field1081 = 0;
                        }
                     }

                     var16 = Class78.field1091 - 80;
                     var18 = 321;
                     if (var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                        Class56.method1030(false);
                     }

                     var16 = Class78.field1091 + 80;
                     if (var3 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var21 >= var18 - 20 && var21 <= var18 + 20) {
                        Class78.field1081 = 0;
                     }
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1067447403"
   )
   static final int method3805(int var0, int var1) {
      int var2 = Class110.method2511(var0 - 1, var1 - 1) + Class110.method2511(1 + var0, var1 - 1) + Class110.method2511(var0 - 1, var1 + 1) + Class110.method2511(1 + var0, 1 + var1);
      int var3 = Class110.method2511(var0 - 1, var1) + Class110.method2511(1 + var0, var1) + Class110.method2511(var0, var1 - 1) + Class110.method2511(var0, 1 + var1);
      int var4 = Class110.method2511(var0, var1);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }
}
