package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
public class Class273 extends Class206 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static Class247 field3538;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static Class247 field3536;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static Class247 field3537;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static Class200 field3552 = new Class200(64);
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static Class200 field3539 = new Class200(100);
   @ObfuscatedName("q")
   public int[] field3540;
   @ObfuscatedName("k")
   int[] field3542;
   @ObfuscatedName("i")
   public int[] field3541;
   @ObfuscatedName("x")
   public int[] field3543;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 375095033
   )
   public int field3544 = -1;
   @ObfuscatedName("p")
   int[] field3545;
   @ObfuscatedName("b")
   public boolean field3546 = false;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -2125188827
   )
   public int field3547 = 5;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1256278085
   )
   public int field3548 = -1;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -185139073
   )
   public int field3549 = -1;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -2058553279
   )
   public int field3550 = 99;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1744953403
   )
   public int field3551 = -1;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 1087712135
   )
   public int field3535 = -1;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1665152249
   )
   public int field3553 = 2;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "243481336"
   )
   void method5212(Class182 var1) {
      while(true) {
         int var2 = var1.method3544();
         if (var2 == 0) {
            return;
         }

         this.method5213(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;IB)V",
      garbageValue = "39"
   )
   void method5213(Class182 var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.method3550();
         this.field3541 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3541[var4] = var1.method3550();
         }

         this.field3540 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3540[var4] = var1.method3550();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3540[var4] += var1.method3550() << 16;
         }
      } else if (var2 == 2) {
         this.field3544 = var1.method3550();
      } else if (var2 == 3) {
         var3 = var1.method3544();
         this.field3545 = new int[var3 + 1];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3545[var4] = var1.method3544();
         }

         this.field3545[var3] = 9999999;
      } else if (var2 == 4) {
         this.field3546 = true;
      } else if (var2 == 5) {
         this.field3547 = var1.method3544();
      } else if (var2 == 6) {
         this.field3548 = var1.method3550();
      } else if (var2 == 7) {
         this.field3549 = var1.method3550();
      } else if (var2 == 8) {
         this.field3550 = var1.method3544();
      } else if (var2 == 9) {
         this.field3551 = var1.method3544();
      } else if (var2 == 10) {
         this.field3535 = var1.method3544();
      } else if (var2 == 11) {
         this.field3553 = var1.method3544();
      } else if (var2 == 12) {
         var3 = var1.method3544();
         this.field3542 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3542[var4] = var1.method3550();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3542[var4] += var1.method3550() << 16;
         }
      } else if (var2 == 13) {
         var3 = var1.method3544();
         this.field3543 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3543[var4] = var1.method3552();
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1055944735"
   )
   void method5220() {
      if (this.field3551 == -1) {
         if (this.field3545 != null) {
            this.field3551 = 2;
         } else {
            this.field3551 = 0;
         }
      }

      if (this.field3535 == -1) {
         if (this.field3545 != null) {
            this.field3535 = 2;
         } else {
            this.field3535 = 0;
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Ldc;II)Ldc;",
      garbageValue = "-1433585529"
   )
   public Class119 method5215(Class119 var1, int var2) {
      var2 = this.field3540[var2];
      Class130 var3 = Class19.method198(var2 >> 16);
      var2 &= 65535;
      if (var3 == null) {
         return var1.method2666(true);
      } else {
         Class119 var4 = var1.method2666(!var3.method3075(var2));
         var4.method2724(var3, var2);
         return var4;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Ldc;III)Ldc;",
      garbageValue = "416381559"
   )
   Class119 method5216(Class119 var1, int var2, int var3) {
      var2 = this.field3540[var2];
      Class130 var4 = Class19.method198(var2 >> 16);
      var2 &= 65535;
      if (var4 == null) {
         return var1.method2666(true);
      } else {
         Class119 var5 = var1.method2666(!var4.method3075(var2));
         var3 &= 3;
         if (var3 == 1) {
            var5.method2679();
         } else if (var3 == 2) {
            var5.method2678();
         } else if (var3 == 3) {
            var5.method2677();
         }

         var5.method2724(var4, var2);
         if (var3 == 1) {
            var5.method2677();
         } else if (var3 == 2) {
            var5.method2678();
         } else if (var3 == 3) {
            var5.method2679();
         }

         return var5;
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Ldc;IB)Ldc;",
      garbageValue = "43"
   )
   Class119 method5217(Class119 var1, int var2) {
      var2 = this.field3540[var2];
      Class130 var3 = Class19.method198(var2 >> 16);
      var2 &= 65535;
      if (var3 == null) {
         return var1.method2667(true);
      } else {
         Class119 var4 = var1.method2667(!var3.method3075(var2));
         var4.method2724(var3, var2);
         return var4;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ldc;ILjn;II)Ldc;",
      garbageValue = "1488793247"
   )
   public Class119 method5221(Class119 var1, int var2, Class273 var3, int var4) {
      var2 = this.field3540[var2];
      Class130 var5 = Class19.method198(var2 >> 16);
      var2 &= 65535;
      if (var5 == null) {
         return var3.method5215(var1, var4);
      } else {
         var4 = var3.field3540[var4];
         Class130 var6 = Class19.method198(var4 >> 16);
         var4 &= 65535;
         Class119 var7;
         if (var6 == null) {
            var7 = var1.method2666(!var5.method3075(var2));
            var7.method2724(var5, var2);
            return var7;
         } else {
            var7 = var1.method2666(!var5.method3075(var2) & !var6.method3075(var4));
            var7.method2745(var5, var2, var6, var4, this.field3545);
            return var7;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ldc;II)Ldc;",
      garbageValue = "1136380155"
   )
   public Class119 method5219(Class119 var1, int var2) {
      int var3 = this.field3540[var2];
      Class130 var4 = Class19.method198(var3 >> 16);
      var3 &= 65535;
      if (var4 == null) {
         return var1.method2666(true);
      } else {
         Class130 var5 = null;
         int var6 = 0;
         if (this.field3542 != null && var2 < this.field3542.length) {
            var6 = this.field3542[var2];
            var5 = Class19.method198(var6 >> 16);
            var6 &= 65535;
         }

         Class119 var7;
         if (var5 != null && var6 != 65535) {
            var7 = var1.method2666(!var4.method3075(var3) & !var5.method3075(var6));
            var7.method2724(var4, var3);
            var7.method2724(var5, var6);
            return var7;
         } else {
            var7 = var1.method2666(!var4.method3075(var3));
            var7.method2724(var4, var3);
            return var7;
         }
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;Lkj;ZI)V",
      garbageValue = "1837948515"
   )
   static void method5227(Class298 var0, Class298 var1, Class298 var2, boolean var3) {
      if (var3) {
         Class78.field1082 = (Class82.field1179 - 765) / 2;
         Class78.field1090 = Class78.field1082 + 202;
         Class78.field1091 = Class78.field1090 + 180;
      }

      byte var4;
      int var5;
      int var7;
      int var8;
      int var11;
      int var12;
      int var29;
      int var31;
      int var35;
      int var37;
      int var39;
      if (Class78.field1107) {
         if (Class166.field2047 == null) {
            Class166.field2047 = Class21.method279(Class175.field2270, "sl_back", "");
         }

         if (Class13.field85 == null) {
            Class13.field85 = Class13.method113(Class175.field2270, "sl_flags", "");
         }

         if (Class126.field1779 == null) {
            Class126.field1779 = Class13.method113(Class175.field2270, "sl_arrows", "");
         }

         if (Class28.field237 == null) {
            Class28.field237 = Class13.method113(Class175.field2270, "sl_stars", "");
         }

         Class314.method5763(Class78.field1082, 23, 765, 480, 0);
         Class314.method5748(Class78.field1082, 0, 125, 23, 12425273, 9135624);
         Class314.method5748(Class78.field1082 + 125, 0, 640, 23, 5197647, 2697513);
         var0.method5525("Select a world", Class78.field1082 + 62, 15, 0, -1);
         if (Class28.field237 != null) {
            Class28.field237[1].method5829(Class78.field1082 + 140, 1);
            var1.method5522("Members only world", Class78.field1082 + 152, 10, 16777215, -1);
            Class28.field237[0].method5829(Class78.field1082 + 140, 12);
            var1.method5522("Free world", Class78.field1082 + 152, 21, 16777215, -1);
         }

         if (Class126.field1779 != null) {
            var29 = Class78.field1082 + 280;
            if (Class65.field946[0] == 0 && Class65.field939[0] == 0) {
               Class126.field1779[2].method5829(var29, 4);
            } else {
               Class126.field1779[0].method5829(var29, 4);
            }

            if (Class65.field946[0] == 0 && Class65.field939[0] == 1) {
               Class126.field1779[3].method5829(var29 + 15, 4);
            } else {
               Class126.field1779[1].method5829(var29 + 15, 4);
            }

            var0.method5522("World", var29 + 32, 17, 16777215, -1);
            var5 = Class78.field1082 + 390;
            if (Class65.field946[0] == 1 && Class65.field939[0] == 0) {
               Class126.field1779[2].method5829(var5, 4);
            } else {
               Class126.field1779[0].method5829(var5, 4);
            }

            if (Class65.field946[0] == 1 && Class65.field939[0] == 1) {
               Class126.field1779[3].method5829(var5 + 15, 4);
            } else {
               Class126.field1779[1].method5829(var5 + 15, 4);
            }

            var0.method5522("Players", var5 + 32, 17, 16777215, -1);
            var31 = Class78.field1082 + 500;
            if (Class65.field946[0] == 2 && Class65.field939[0] == 0) {
               Class126.field1779[2].method5829(var31, 4);
            } else {
               Class126.field1779[0].method5829(var31, 4);
            }

            if (Class65.field946[0] == 2 && Class65.field939[0] == 1) {
               Class126.field1779[3].method5829(var31 + 15, 4);
            } else {
               Class126.field1779[1].method5829(var31 + 15, 4);
            }

            var0.method5522("Location", var31 + 32, 17, 16777215, -1);
            var7 = Class78.field1082 + 610;
            if (Class65.field946[0] == 3 && Class65.field939[0] == 0) {
               Class126.field1779[2].method5829(var7, 4);
            } else {
               Class126.field1779[0].method5829(var7, 4);
            }

            if (Class65.field946[0] == 3 && Class65.field939[0] == 1) {
               Class126.field1779[3].method5829(var7 + 15, 4);
            } else {
               Class126.field1779[1].method5829(var7 + 15, 4);
            }

            var0.method5522("Type", var7 + 32, 17, 16777215, -1);
         }

         Class314.method5763(Class78.field1082 + 708, 4, 50, 16, 0);
         var1.method5525("Cancel", Class78.field1082 + 708 + 25, 16, 16777215, -1);
         Class78.field1116 = -1;
         if (Class166.field2047 != null) {
            var4 = 88;
            byte var38 = 19;
            var31 = 765 / (var4 + 1);
            var7 = 480 / (var38 + 1);

            do {
               var8 = var7;
               var35 = var31;
               if (var7 * (var31 - 1) >= Class65.field945) {
                  --var31;
               }

               if (var31 * (var7 - 1) >= Class65.field945) {
                  --var7;
               }

               if (var31 * (var7 - 1) >= Class65.field945) {
                  --var7;
               }
            } while(var8 != var7 || var31 != var35);

            var8 = (765 - var4 * var31) / (var31 + 1);
            if (var8 > 5) {
               var8 = 5;
            }

            var35 = (480 - var38 * var7) / (var7 + 1);
            if (var35 > 5) {
               var35 = 5;
            }

            var37 = (765 - var4 * var31 - var8 * (var31 - 1)) / 2;
            var11 = (480 - var7 * var38 - var35 * (var7 - 1)) / 2;
            var12 = var11 + 23;
            var39 = var37 + Class78.field1082;
            int var40 = 0;
            boolean var41 = false;

            int var42;
            for(var42 = 0; var42 < Class65.field945; ++var42) {
               Class65 var17 = Class65.field949[var42];
               boolean var18 = true;
               String var19 = Integer.toString(var17.field955);
               if (var17.field955 == -1) {
                  var19 = "OFF";
                  var18 = false;
               } else if (var17.field955 > 1980) {
                  var19 = "FULL";
                  var18 = false;
               }

               int var21 = 0;
               byte var20;
               if (var17.method1577()) {
                  if (var17.method1589()) {
                     var20 = 7;
                  } else {
                     var20 = 6;
                  }
               } else if (var17.method1570()) {
                  var21 = 16711680;
                  if (var17.method1589()) {
                     var20 = 5;
                  } else {
                     var20 = 4;
                  }
               } else if (var17.method1568()) {
                  if (var17.method1589()) {
                     var20 = 3;
                  } else {
                     var20 = 2;
                  }
               } else if (var17.method1589()) {
                  var20 = 1;
               } else {
                  var20 = 0;
               }

               if (Class48.field425 >= var39 && Class48.field426 * 673804999 >= var12 && Class48.field425 < var39 + var4 && Class48.field426 * 673804999 < var38 + var12 && var18) {
                  Class78.field1116 = var42;
                  Class166.field2047[var20].method5855(var39, var12, 128, 16777215);
                  var41 = true;
               } else {
                  Class166.field2047[var20].method5849(var39, var12);
               }

               if (Class13.field85 != null) {
                  Class13.field85[(var17.method1589() ? 8 : 0) + var17.field952].method5829(var39 + 29, var12);
               }

               var0.method5525(Integer.toString(var17.field947), var39 + 15, var38 / 2 + var12 + 5, var21, -1);
               var1.method5525(var19, var39 + 60, var38 / 2 + var12 + 5, 268435455, -1);
               var12 = var12 + var38 + var35;
               ++var40;
               if (var40 >= var7) {
                  var12 = var11 + 23;
                  var39 = var39 + var4 + var8;
                  var40 = 0;
               }
            }

            if (var41) {
               var42 = var1.method5517(Class65.field949[Class78.field1116].field951) + 6;
               int var26 = var1.field3695 + 8;
               Class314.method5763(Class48.field425 - var42 / 2, Class48.field426 * 673804999 + 20 + 5, var42, var26, 16777120);
               Class314.method5734(Class48.field425 - var42 / 2, Class48.field426 * 673804999 + 20 + 5, var42, var26, 0);
               var1.method5525(Class65.field949[Class78.field1116].field951, Class48.field425, Class48.field426 * 673804999 + var1.field3695 + 20 + 5 + 4, 0, -1);
            }
         }

         Class163.field2014.vmethod5809(0, 0);
      } else {
         if (var3) {
            Class78.field1092.method5849(Class78.field1082, 0);
            Class78.field1087.method5849(Class78.field1082 + 382, 0);
            Class78.field1117.method5829(Class78.field1082 + 382 - Class78.field1117.field3780 / 2, 18);
         }

         if (Client.field589 == 0 || Client.field589 == 5) {
            var4 = 20;
            var0.method5525("RuneScape is loading - please wait...", Class78.field1090 + 180, 245 - var4, 16777215, -1);
            var5 = 253 - var4;
            Class314.method5734(Class78.field1090 + 180 - 152, var5, 304, 34, 9179409);
            Class314.method5734(Class78.field1090 + 180 - 151, var5 + 1, 302, 32, 0);
            Class314.method5763(Class78.field1090 + 180 - 150, var5 + 2, Class78.field1099 * 3, 30, 9179409);
            Class314.method5763(Class78.field1099 * 3 + (Class78.field1090 + 180 - 150), var5 + 2, 300 - Class78.field1099 * 3, 30, 0);
            var0.method5525(Class78.field1100, Class78.field1090 + 180, 276 - var4, 16777215, -1);
         }

         String var22;
         short var28;
         short var30;
         if (Client.field589 == 20) {
            Class78.field1083.method5829(Class78.field1090 + 180 - Class78.field1083.field3780 / 2, 271 - Class78.field1083.field3781 / 2);
            var28 = 201;
            var0.method5525(Class78.field1103, Class78.field1090 + 180, var28, 16776960, 0);
            var29 = var28 + 15;
            var0.method5525(Class78.field1112, Class78.field1090 + 180, var29, 16776960, 0);
            var29 += 15;
            var0.method5525(Class78.field1105, Class78.field1090 + 180, var29, 16776960, 0);
            var29 += 15;
            var29 += 7;
            if (Class78.field1081 != 4) {
               var0.method5522("Login: ", Class78.field1090 + 180 - 110, var29, 16777215, 0);
               var30 = 200;

               for(var22 = Class59.method1076(); var0.method5517(var22) > var30; var22 = var22.substring(0, var22.length() - 1)) {
                  ;
               }

               var0.method5522(Class299.method5521(var22), Class78.field1090 + 180 - 70, var29, 16777215, 0);
               var29 += 15;
               var0.method5522("Password: " + Class265.method4976(Class78.field1086), Class78.field1090 + 180 - 108, var29, 16777215, 0);
               var29 += 15;
            }
         }

         if (Client.field589 == 10 || Client.field589 == 11) {
            Class78.field1083.method5829(Class78.field1090, 171);
            short var6;
            if (Class78.field1081 == 0) {
               var28 = 251;
               var0.method5525("Welcome to RuneScape", Class78.field1090 + 180, var28, 16776960, 0);
               var29 = var28 + 30;
               var5 = Class78.field1090 + 180 - 80;
               var6 = 291;
               Class78.field1084.method5829(var5 - 73, var6 - 20);
               var0.method5526("New User", var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var5 = Class78.field1090 + 180 + 80;
               Class78.field1084.method5829(var5 - 73, var6 - 20);
               var0.method5526("Existing User", var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (Class78.field1081 == 1) {
               var0.method5525(Class78.field1098, Class78.field1090 + 180, 201, 16776960, 0);
               var28 = 236;
               var0.method5525(Class78.field1103, Class78.field1090 + 180, var28, 16777215, 0);
               var29 = var28 + 15;
               var0.method5525(Class78.field1112, Class78.field1090 + 180, var29, 16777215, 0);
               var29 += 15;
               var0.method5525(Class78.field1105, Class78.field1090 + 180, var29, 16777215, 0);
               var29 += 15;
               var5 = Class78.field1090 + 180 - 80;
               var6 = 321;
               Class78.field1084.method5829(var5 - 73, var6 - 20);
               var0.method5525("Continue", var5, var6 + 5, 16777215, 0);
               var5 = Class78.field1090 + 180 + 80;
               Class78.field1084.method5829(var5 - 73, var6 - 20);
               var0.method5525("Cancel", var5, var6 + 5, 16777215, 0);
            } else if (Class78.field1081 == 2) {
               var28 = 201;
               var0.method5525(Class78.field1103, Class78.field1091, var28, 16776960, 0);
               var29 = var28 + 15;
               var0.method5525(Class78.field1112, Class78.field1091, var29, 16776960, 0);
               var29 += 15;
               var0.method5525(Class78.field1105, Class78.field1091, var29, 16776960, 0);
               var29 += 15;
               var29 += 7;
               var0.method5522("Login: ", Class78.field1091 - 110, var29, 16777215, 0);
               var30 = 200;

               for(var22 = Class59.method1076(); var0.method5517(var22) > var30; var22 = var22.substring(1)) {
                  ;
               }

               var0.method5522(Class299.method5521(var22) + (Class78.field1102 == 0 & Client.field591 % 40 < 20 ? Class6.method71(16776960) + "|" : ""), Class78.field1091 - 70, var29, 16777215, 0);
               var29 += 15;
               var0.method5522("Password: " + Class265.method4976(Class78.field1086) + (Class78.field1102 == 1 & Client.field591 % 40 < 20 ? Class6.method71(16776960) + "|" : ""), Class78.field1091 - 108, var29, 16777215, 0);
               var29 += 15;
               var28 = 277;
               var7 = Class78.field1091 + -117;
               boolean var9 = Class78.field1108;
               boolean var10 = Class78.field1110;
               Class317 var23 = var9 ? (var10 ? Class53.field472 : Class78.field1089) : (var10 ? Class102.field1352 : Class235.field2783);
               var23.method5829(var7, var28);
               var7 = var7 + var23.field3780 + 5;
               var1.method5522("Remember username", var7, var28 + 13, 16776960, 0);
               var7 = Class78.field1091 + 24;
               boolean var13 = Class10.field61.field962;
               boolean var14 = Class78.field1115;
               Class317 var25 = var13 ? (var14 ? Class53.field472 : Class78.field1089) : (var14 ? Class102.field1352 : Class235.field2783);
               var25.method5829(var7, var28);
               var7 = var7 + var25.field3780 + 5;
               var1.method5522("Hide username", var7, var28 + 13, 16776960, 0);
               var29 = var28 + 15;
               int var15 = Class78.field1091 - 80;
               short var16 = 321;
               Class78.field1084.method5829(var15 - 73, var16 - 20);
               var0.method5525("Login", var15, var16 + 5, 16777215, 0);
               var15 = Class78.field1091 + 80;
               Class78.field1084.method5829(var15 - 73, var16 - 20);
               var0.method5525("Cancel", var15, var16 + 5, 16777215, 0);
               var28 = 357;
               var1.method5525("Forgotten your password? <col=ffffff>Click here.", Class78.field1091, var28, 16776960, 0);
            } else if (Class78.field1081 == 3) {
               var28 = 201;
               var0.method5525("Invalid username or password.", Class78.field1090 + 180, var28, 16776960, 0);
               var29 = var28 + 20;
               var1.method5525("For accounts created after 24th November 2010, please use your", Class78.field1090 + 180, var29, 16776960, 0);
               var29 += 15;
               var1.method5525("email address to login. Otherwise please login with your username.", Class78.field1090 + 180, var29, 16776960, 0);
               var29 += 15;
               var5 = Class78.field1090 + 180;
               var6 = 276;
               Class78.field1084.method5829(var5 - 73, var6 - 20);
               var2.method5525("Try again", var5, var6 + 5, 16777215, 0);
               var5 = Class78.field1090 + 180;
               var6 = 326;
               Class78.field1084.method5829(var5 - 73, var6 - 20);
               var2.method5525("Forgotten password?", var5, var6 + 5, 16777215, 0);
            } else if (Class78.field1081 == 4) {
               var0.method5525("Authenticator", Class78.field1090 + 180, 201, 16776960, 0);
               var28 = 236;
               var0.method5525(Class78.field1103, Class78.field1090 + 180, var28, 16777215, 0);
               var29 = var28 + 15;
               var0.method5525(Class78.field1112, Class78.field1090 + 180, var29, 16777215, 0);
               var29 += 15;
               var0.method5525(Class78.field1105, Class78.field1090 + 180, var29, 16777215, 0);
               var29 += 15;
               var0.method5522("PIN: " + Class265.method4976(Class28.field238) + (Client.field591 % 40 < 20 ? Class6.method71(16776960) + "|" : ""), Class78.field1090 + 180 - 108, var29, 16777215, 0);
               var29 -= 8;
               var0.method5522("Trust this computer", Class78.field1090 + 180 - 9, var29, 16776960, 0);
               var29 += 15;
               var0.method5522("for 30 days: ", Class78.field1090 + 180 - 9, var29, 16776960, 0);
               var5 = Class78.field1090 + 180 - 9 + var0.method5517("for 30 days: ") + 15;
               var31 = var29 - var0.field3695;
               Class317 var27;
               if (Class78.field1104) {
                  var27 = Class78.field1089;
               } else {
                  var27 = Class235.field2783;
               }

               var27.method5829(var5, var31);
               var29 += 15;
               var8 = Class78.field1090 + 180 - 80;
               short var34 = 321;
               Class78.field1084.method5829(var8 - 73, var34 - 20);
               var0.method5525("Continue", var8, var34 + 5, 16777215, 0);
               var8 = Class78.field1090 + 180 + 80;
               Class78.field1084.method5829(var8 - 73, var34 - 20);
               var0.method5525("Cancel", var8, var34 + 5, 16777215, 0);
               var1.method5525("<u=ff>Can't Log In?</u>", Class78.field1090 + 180, var34 + 36, 255, 0);
            } else if (Class78.field1081 == 5) {
               var0.method5525("Forgotten your password?", Class78.field1090 + 180, 201, 16776960, 0);
               var28 = 221;
               var2.method5525(Class78.field1103, Class78.field1090 + 180, var28, 16776960, 0);
               var29 = var28 + 15;
               var2.method5525(Class78.field1112, Class78.field1090 + 180, var29, 16776960, 0);
               var29 += 15;
               var2.method5525(Class78.field1105, Class78.field1090 + 180, var29, 16776960, 0);
               var29 += 15;
               var29 += 14;
               var0.method5522("Username/email: ", Class78.field1090 + 180 - 145, var29, 16777215, 0);
               var30 = 174;

               for(var22 = Class59.method1076(); var0.method5517(var22) > var30; var22 = var22.substring(1)) {
                  ;
               }

               var0.method5522(Class299.method5521(var22) + (Client.field591 % 40 < 20 ? Class6.method71(16776960) + "|" : ""), Class78.field1090 + 180 - 34, var29, 16777215, 0);
               var29 += 15;
               var7 = Class78.field1090 + 180 - 80;
               short var32 = 321;
               Class78.field1084.method5829(var7 - 73, var32 - 20);
               var0.method5525("Recover", var7, var32 + 5, 16777215, 0);
               var7 = Class78.field1090 + 180 + 80;
               Class78.field1084.method5829(var7 - 73, var32 - 20);
               var0.method5525("Back", var7, var32 + 5, 16777215, 0);
            } else if (Class78.field1081 == 6) {
               var28 = 201;
               var0.method5525(Class78.field1103, Class78.field1090 + 180, var28, 16776960, 0);
               var29 = var28 + 15;
               var0.method5525(Class78.field1112, Class78.field1090 + 180, var29, 16776960, 0);
               var29 += 15;
               var0.method5525(Class78.field1105, Class78.field1090 + 180, var29, 16776960, 0);
               var29 += 15;
               var5 = Class78.field1090 + 180;
               var6 = 321;
               Class78.field1084.method5829(var5 - 73, var6 - 20);
               var0.method5525("Back", var5, var6 + 5, 16777215, 0);
            } else if (Class78.field1081 == 7) {
               var28 = 216;
               var0.method5525("Your date of birth isn't set.", Class78.field1090 + 180, var28, 16776960, 0);
               var29 = var28 + 15;
               var2.method5525("Please verify your account status by", Class78.field1090 + 180, var29, 16776960, 0);
               var29 += 15;
               var2.method5525("setting your date of birth.", Class78.field1090 + 180, var29, 16776960, 0);
               var29 += 15;
               var5 = Class78.field1090 + 180 - 80;
               var6 = 321;
               Class78.field1084.method5829(var5 - 73, var6 - 20);
               var0.method5525("Set Date of Birth", var5, var6 + 5, 16777215, 0);
               var5 = Class78.field1090 + 180 + 80;
               Class78.field1084.method5829(var5 - 73, var6 - 20);
               var0.method5525("Back", var5, var6 + 5, 16777215, 0);
            } else if (Class78.field1081 == 8) {
               var28 = 216;
               var0.method5525("Sorry, but your account is not eligible to play.", Class78.field1090 + 180, var28, 16776960, 0);
               var29 = var28 + 15;
               var2.method5525("For more information, please take a look at", Class78.field1090 + 180, var29, 16776960, 0);
               var29 += 15;
               var2.method5525("our privacy policy.", Class78.field1090 + 180, var29, 16776960, 0);
               var29 += 15;
               var5 = Class78.field1090 + 180 - 80;
               var6 = 321;
               Class78.field1084.method5829(var5 - 73, var6 - 20);
               var0.method5525("Privacy Policy", var5, var6 + 5, 16777215, 0);
               var5 = Class78.field1090 + 180 + 80;
               Class78.field1084.method5829(var5 - 73, var6 - 20);
               var0.method5525("Back", var5, var6 + 5, 16777215, 0);
            }
         }

         if (Class78.field1097 > 0) {
            var29 = Class78.field1097;
            var30 = 256;
            Class78.field1095 += var29 * 128;
            if (Class78.field1095 > Class186.field2367.length) {
               Class78.field1095 -= Class186.field2367.length;
               var31 = (int)(Math.random() * 12.0D);
               Class67.method1682(Class78.field1111[var31]);
            }

            var31 = 0;
            var7 = var29 * 128;
            var8 = (var30 - var29) * 128;

            for(var35 = 0; var35 < var8; ++var35) {
               var37 = Class40.field357[var7 + var31] - Class186.field2367[var31 + Class78.field1095 & Class186.field2367.length - 1] * var29 / 6;
               if (var37 < 0) {
                  var37 = 0;
               }

               Class40.field357[var31++] = var37;
            }

            for(var35 = var30 - var29; var35 < var30; ++var35) {
               var37 = var35 * 128;

               for(var11 = 0; var11 < 128; ++var11) {
                  var12 = (int)(Math.random() * 100.0D);
                  if (var12 < 50 && var11 > 10 && var11 < 118) {
                     Class40.field357[var11 + var37] = 255;
                  } else {
                     Class40.field357[var37 + var11] = 0;
                  }
               }
            }

            if (Class78.field1088 > 0) {
               Class78.field1088 -= var29 * 4;
            }

            if (Class78.field1094 > 0) {
               Class78.field1094 -= var29 * 4;
            }

            if (Class78.field1088 == 0 && Class78.field1094 == 0) {
               var35 = (int)(Math.random() * (double)(2000 / var29));
               if (var35 == 0) {
                  Class78.field1088 = 1024;
               }

               if (var35 == 1) {
                  Class78.field1094 = 1024;
               }
            }

            for(var35 = 0; var35 < var30 - var29; ++var35) {
               Class78.field1093[var35] = Class78.field1093[var29 + var35];
            }

            for(var35 = var30 - var29; var35 < var30; ++var35) {
               Class78.field1093[var35] = (int)(Math.sin((double)Class78.field1114 / 14.0D) * 16.0D + Math.sin((double)Class78.field1114 / 15.0D) * 14.0D + Math.sin((double)Class78.field1114 / 16.0D) * 12.0D);
               ++Class78.field1114;
            }

            Class78.field1096 += var29;
            var35 = (var29 + (Client.field591 & 1)) / 2;
            if (var35 > 0) {
               for(var37 = 0; var37 < Class78.field1096 * 100; ++var37) {
                  var11 = (int)(Math.random() * 124.0D) + 2;
                  var12 = (int)(Math.random() * 128.0D) + 128;
                  Class40.field357[var11 + (var12 << 7)] = 192;
               }

               Class78.field1096 = 0;
               var37 = 0;

               label575:
               while(true) {
                  if (var37 >= var30) {
                     var37 = 0;

                     while(true) {
                        if (var37 >= 128) {
                           break label575;
                        }

                        var11 = 0;

                        for(var12 = -var35; var12 < var30; ++var12) {
                           var39 = var12 * 128;
                           if (var12 + var35 < var30) {
                              var11 += Class76.field1073[var35 * 128 + var39 + var37];
                           }

                           if (var12 - (var35 + 1) >= 0) {
                              var11 -= Class76.field1073[var39 + var37 - (var35 + 1) * 128];
                           }

                           if (var12 >= 0) {
                              Class40.field357[var39 + var37] = var11 / (var35 * 2 + 1);
                           }
                        }

                        ++var37;
                     }
                  }

                  var11 = 0;
                  var12 = var37 * 128;

                  for(var39 = -var35; var39 < 128; ++var39) {
                     if (var35 + var39 < 128) {
                        var11 += Class40.field357[var39 + var12 + var35];
                     }

                     if (var39 - (var35 + 1) >= 0) {
                        var11 -= Class40.field357[var12 + var39 - (var35 + 1)];
                     }

                     if (var39 >= 0) {
                        Class76.field1073[var39 + var12] = var11 / (var35 * 2 + 1);
                     }
                  }

                  ++var37;
               }
            }

            Class78.field1097 = 0;
         }

         Class133.method3098();
         Class124.field1708[Class10.field61.field958 ? 1 : 0].method5829(Class78.field1082 + 765 - 40, 463);
         if (Client.field589 > 5 && Client.field827 == 0) {
            if (Class232.field2752 != null) {
               var29 = Class78.field1082 + 5;
               var30 = 463;
               byte var36 = 100;
               byte var33 = 35;
               Class232.field2752.method5829(var29, var30);
               var0.method5525("World" + " " + Client.field581, var36 / 2 + var29, var33 / 2 + var30 - 2, 16777215, 0);
               if (Class49.field439 != null) {
                  var1.method5525("Loading...", var36 / 2 + var29, var33 / 2 + var30 + 12, 16777215, 0);
               } else {
                  var1.method5525("Click to switch", var36 / 2 + var29, var33 / 2 + var30 + 12, 16777215, 0);
               }
            } else {
               Class232.field2752 = Class221.method4374(Class175.field2270, "sl_button", "");
            }
         }

      }
   }
}
