package com.client;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public class Class65 {
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "[Lbb;"
   )
   static Class65[] field949;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -484083453
   )
   static int field945 = 0;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -2045294689
   )
   static int field944 = 0;
   @ObfuscatedName("i")
   static int[] field939 = new int[]{1, 1, 1, 1};
   @ObfuscatedName("x")
   static int[] field946 = new int[]{0, 1, 2, 3};
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1592935297
   )
   int field947;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1045794303
   )
   int field948;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 405776969
   )
   int field955;
   @ObfuscatedName("f")
   String field950;
   @ObfuscatedName("g")
   String field951;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -2021362795
   )
   int field952;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 777704071
   )
   int field943;

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "66"
   )
   boolean method1589() {
      return (1 & this.field948) != 0;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2036146048"
   )
   boolean method1567() {
      return (2 & this.field948) != 0;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "83"
   )
   boolean method1568() {
      return (4 & this.field948) != 0;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-648432612"
   )
   boolean method1569() {
      return (8 & this.field948) != 0;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "185165272"
   )
   boolean method1570() {
      return (536870912 & this.field948) != 0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "753404361"
   )
   boolean method1577() {
      return (33554432 & this.field948) != 0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IS)Ljava/io/File;",
      garbageValue = "-8731"
   )
   static File method1583(String var0, String var1, int var2) {
      String var3 = var2 == 0 ? "" : "" + var2;
      Class155.field1964 = new File(Class18.field143, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
      String var4 = null;
      String var5 = null;
      boolean var6 = false;
      Class182 var8;
      File var23;
      if (Class155.field1964.exists()) {
         try {
            Class110 var7 = new Class110(Class155.field1964, "rw", 10000L);

            int var9;
            for(var8 = new Class182((int)var7.method2509()); var8.field2339 < var8.payload.length; var8.field2339 += var9) {
               var9 = var7.method2510(var8.payload, var8.field2339, var8.payload.length - var8.field2339);
               if (var9 == -1) {
                  throw new IOException();
               }
            }

            var8.field2339 = 0;
            var9 = var8.readUnsignedByte();
            if (var9 < 1 || var9 > 3) {
               throw new IOException("" + var9);
            }

            int var10 = 0;
            if (var9 > 1) {
               var10 = var8.readUnsignedByte();
            }

            if (var9 <= 2) {
               var4 = var8.method3558();
               if (var10 == 1) {
                  var5 = var8.method3558();
               }
            } else {
               var4 = var8.method3559();
               if (var10 == 1) {
                  var5 = var8.method3559();
               }
            }

            var7.method2507();
         } catch (IOException var21) {
            var21.printStackTrace();
         }

         if (var4 != null) {
            var23 = new File(var4);
            if (!var23.exists()) {
               var4 = null;
            }
         }

         if (var4 != null) {
            var23 = new File(var4, "test.dat");
            if (!Class70.method1766(var23, true)) {
               var4 = null;
            }
         }
      }

      if (var4 == null && var2 == 0) {
         label137:
         for(int var15 = 0; var15 < Class8.field52.length; ++var15) {
            for(int var16 = 0; var16 < Class155.field1965.length; ++var16) {
               File var17 = new File(Class155.field1965[var16] + Class8.field52[var15] + File.separatorChar + var0 + File.separatorChar);
               if (var17.exists() && Class70.method1766(new File(var17, "test.dat"), true)) {
                  var4 = var17.toString();
                  var6 = true;
                  break label137;
               }
            }
         }
      }

      if (var4 == null) {
         var4 = Class18.field143 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var6 = true;
      }

      File var22;
      if (var5 != null) {
         var22 = new File(var5);
         var23 = new File(var4);

         try {
            File[] var24 = var22.listFiles();
            File[] var18 = var24;

            for(int var11 = 0; var11 < var18.length; ++var11) {
               File var12 = var18[var11];
               File var13 = new File(var23, var12.getName());
               boolean var14 = var12.renameTo(var13);
               if (!var14) {
                  throw new IOException();
               }
            }
         } catch (Exception var20) {
            var20.printStackTrace();
         }

         var6 = true;
      }

      if (var6) {
         var22 = new File(var4);
         var8 = null;

         try {
            Class110 var25 = new Class110(Class155.field1964, "rw", 10000L);
            Class182 var26 = new Class182(500);
            var26.method3532(3);
            var26.method3532(var8 != null ? 1 : 0);
            var26.method3541(var22.getPath());
            if (var8 != null) {
               var26.method3541("");
            }

            var25.method2506(var26.payload, 0, var26.field2339);
            var25.method2507();
         } catch (IOException var19) {
            var19.printStackTrace();
         }
      }

      return new File(var4);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lgk;IIIIIIS)V",
      garbageValue = "-9209"
   )
   static final void method1603(Class182 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         Class50.field443[var1][var2][var3] = 0;

         while(true) {
            var7 = var0.readUnsignedByte();
            if (var7 == 0) {
               if (var1 == 0) {
                  int[] var8 = Class50.field459[0][var2];
                  int var11 = var2 + var4 + 932731;
                  int var12 = var3 + var5 + 556238;
                  int var13 = Class32.method549('넵' + var11, var12 + 91923, 4) - 128 + (Class32.method549(10294 + var11, '鎽' + var12, 2) - 128 >> 1) + (Class32.method549(var11, var12, 1) - 128 >> 2);
                  var13 = (int)((double)var13 * 0.3D) + 35;
                  if (var13 < 10) {
                     var13 = 10;
                  } else if (var13 > 60) {
                     var13 = 60;
                  }

                  var8[var3] = -var13 * 8;
               } else {
                  Class50.field459[var1][var2][var3] = Class50.field459[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if (var7 == 1) {
               int var14 = var0.readUnsignedByte();
               if (var14 == 1) {
                  var14 = 0;
               }

               if (var1 == 0) {
                  Class50.field459[0][var2][var3] = -var14 * 8;
               } else {
                  Class50.field459[var1][var2][var3] = Class50.field459[var1 - 1][var2][var3] - var14 * 8;
               }
               break;
            }

            if (var7 <= 49) {
               Class165.field2033[var1][var2][var3] = var0.readByte();
               Class50.field446[var1][var2][var3] = (byte)((var7 - 2) / 4);
               Class19.field159[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
            } else if (var7 <= 81) {
               Class50.field443[var1][var2][var3] = (byte)(var7 - 49);
            } else {
               Class50.field445[var1][var2][var3] = (byte)(var7 - 81);
            }
         }
      } else {
         while(true) {
            var7 = var0.readUnsignedByte();
            if (var7 == 0) {
               break;
            }

            if (var7 == 1) {
               var0.readUnsignedByte();
               break;
            }

            if (var7 <= 49) {
               var0.readUnsignedByte();
            }
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(ILir;IIIZB)V",
      garbageValue = "38"
   )
   public static void method1602(int var0, Class247 var1, int var2, int var3, int var4, boolean var5) {
      Class217.field2460 = 1;
      Class138.field1871 = var1;
      Class217.field2461 = var2;
      Class217.field2462 = var3;
      Class309.field3740 = var4;
      Class217.field2463 = var5;
      Class6.field37 = var0;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "168369"
   )
   static int method1605(int var0, Class84 var1, boolean var2) {
      Class230 var3 = var2 ? Class276.field3561 : Class260.field3301;
      if (var0 == 1500) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2618;
         return 1;
      } else if (var0 == 1501) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2619;
         return 1;
      } else if (var0 == 1502) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2675;
         return 1;
      } else if (var0 == 1503) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2621;
         return 1;
      } else if (var0 == 1504) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2625 ? 1 : 0;
         return 1;
      } else if (var0 == 1505) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2605;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(Lev;III)Lcx;",
      garbageValue = "30833833"
   )
   public static final Class95 method1582(Class154 var0, int var1, int var2) {
      if (Class95.field1300 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = 256;
         }

         try {
            Class95 var3 = Class95.field1297.vmethod2052();
            var3.field1299 = new int[(Class95.field1295 ? 2 : 1) * 256];
            var3.field1303 = var2;
            var3.vmethod2176();
            var3.field1302 = (var2 & -1024) + 1024;
            if (var3.field1302 > 16384) {
               var3.field1302 = 16384;
            }

            var3.vmethod2163(var3.field1302);
            if (Class27.field230 > 0 && Class69.field1010 == null) {
               Class69.field1010 = new Class97();
               Class135.field1855 = Executors.newScheduledThreadPool(1);
               Class135.field1855.scheduleAtFixedRate(Class69.field1010, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (Class69.field1010 != null) {
               if (Class69.field1010.field1327[var1] != null) {
                  throw new IllegalArgumentException();
               }

               Class69.field1010.field1327[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            return new Class95();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("gg")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1540740873"
   )
   static void method1604() {
      Class172 var0 = Class26.method433(ClientPackets.field2215, Client.field626.field1218);
      Class189 var1 = var0.field2257;
      int var2 = Client.field792 ? 2 : 1;
      var1.method3532(var2);
      var0.field2257.method3755(Class82.field1179);
      var0.field2257.method3755(Class243.field3138);
      Client.field626.method1980(var0);
   }
}
