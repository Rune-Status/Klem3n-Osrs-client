package com.client;
import java.awt.FontMetrics;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class Class29 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Law;"
   )
   public static final Class29 field252 = new Class29("details");
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Law;"
   )
   public static final Class29 field251 = new Class29("compositemap");
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Law;"
   )
   public static final Class29 field257 = new Class29("compositetexture");
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Law;"
   )
   public static final Class29 field262 = new Class29("area");
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Law;"
   )
   public static final Class29 field254 = new Class29("labels");
   @ObfuscatedName("ak")
   static FontMetrics field256;
   @ObfuscatedName("ff")
   static byte[][] field253;
   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      signature = "Lde;"
   )
   static Class111 field250;
   @ObfuscatedName("q")
   public final String field255;

   Class29(String var1) {
      this.field255 = var1;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1545308790"
   )
   static void method476() {
      try {
         File var0 = new File(Class18.field143, "random.dat");
         int var2;
         if (var0.exists()) {
            Class155.field1968 = new Class109(new Class110(var0, "rw", 25L), 24, 0);
         } else {
            label38:
            for(int var1 = 0; var1 < Class8.field52.length; ++var1) {
               for(var2 = 0; var2 < Class155.field1965.length; ++var2) {
                  File var3 = new File(Class155.field1965[var2] + Class8.field52[var1] + File.separatorChar + "random.dat");
                  if (var3.exists()) {
                     Class155.field1968 = new Class109(new Class110(var3, "rw", 25L), 24, 0);
                     break label38;
                  }
               }
            }
         }

         if (Class155.field1968 == null) {
            RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
            var2 = var4.read();
            var4.seek(0L);
            var4.write(var2);
            var4.seek(0L);
            var4.close();
            Class155.field1968 = new Class109(new Class110(var0, "rw", 25L), 24, 0);
         }
      } catch (IOException var5) {
         ;
      }

   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(ILce;ZB)I",
      garbageValue = "123"
   )
   static int method477(int var0, Class84 var1, boolean var2) {
      int var3;
      if (var0 == 3903) {
         var3 = Class69.field999[--Class69.field1003];
         Class69.field999[++Class69.field1003 - 1] = Client.field844[var3].method39();
         return 1;
      } else if (var0 == 3904) {
         var3 = Class69.field999[--Class69.field1003];
         Class69.field999[++Class69.field1003 - 1] = Client.field844[var3].field29;
         return 1;
      } else if (var0 == 3905) {
         var3 = Class69.field999[--Class69.field1003];
         Class69.field999[++Class69.field1003 - 1] = Client.field844[var3].field30;
         return 1;
      } else if (var0 == 3906) {
         var3 = Class69.field999[--Class69.field1003];
         Class69.field999[++Class69.field1003 - 1] = Client.field844[var3].field33;
         return 1;
      } else if (var0 == 3907) {
         var3 = Class69.field999[--Class69.field1003];
         Class69.field999[++Class69.field1003 - 1] = Client.field844[var3].field32;
         return 1;
      } else if (var0 == 3908) {
         var3 = Class69.field999[--Class69.field1003];
         Class69.field999[++Class69.field1003 - 1] = Client.field844[var3].field28;
         return 1;
      } else {
         int var12;
         if (var0 == 3910) {
            var3 = Class69.field999[--Class69.field1003];
            var12 = Client.field844[var3].method38();
            Class69.field999[++Class69.field1003 - 1] = var12 == 0 ? 1 : 0;
            return 1;
         } else if (var0 == 3911) {
            var3 = Class69.field999[--Class69.field1003];
            var12 = Client.field844[var3].method38();
            Class69.field999[++Class69.field1003 - 1] = var12 == 2 ? 1 : 0;
            return 1;
         } else if (var0 == 3912) {
            var3 = Class69.field999[--Class69.field1003];
            var12 = Client.field844[var3].method38();
            Class69.field999[++Class69.field1003 - 1] = var12 == 5 ? 1 : 0;
            return 1;
         } else if (var0 == 3913) {
            var3 = Class69.field999[--Class69.field1003];
            var12 = Client.field844[var3].method38();
            Class69.field999[++Class69.field1003 - 1] = var12 == 1 ? 1 : 0;
            return 1;
         } else {
            boolean var13;
            if (var0 == 3914) {
               var13 = Class69.field999[--Class69.field1003] == 1;
               if (Class19.field154 != null) {
                  Class19.field154.method9(Class1.field11, var13);
               }

               return 1;
            } else if (var0 == 3915) {
               var13 = Class69.field999[--Class69.field1003] == 1;
               if (Class19.field154 != null) {
                  Class19.field154.method9(Class1.field13, var13);
               }

               return 1;
            } else if (var0 == 3916) {
               Class69.field1003 -= 2;
               var13 = Class69.field999[Class69.field1003] == 1;
               boolean var4 = Class69.field999[Class69.field1003 + 1] == 1;
               if (Class19.field154 != null) {
                  Client.field665.field575 = var4;
                  Class19.field154.method9(Client.field665, var13);
               }

               return 1;
            } else if (var0 == 3917) {
               var13 = Class69.field999[--Class69.field1003] == 1;
               if (Class19.field154 != null) {
                  Class19.field154.method9(Class1.field9, var13);
               }

               return 1;
            } else if (var0 == 3918) {
               var13 = Class69.field999[--Class69.field1003] == 1;
               if (Class19.field154 != null) {
                  Class19.field154.method9(Class1.field16, var13);
               }

               return 1;
            } else if (var0 == 3919) {
               Class69.field999[++Class69.field1003 - 1] = Class19.field154 == null ? 0 : Class19.field154.field10.size();
               return 1;
            } else {
               Class2 var11;
               if (var0 == 3920) {
                  var3 = Class69.field999[--Class69.field1003];
                  var11 = (Class2)Class19.field154.field10.get(var3);
                  Class69.field999[++Class69.field1003 - 1] = var11.field19;
                  return 1;
               } else if (var0 == 3921) {
                  var3 = Class69.field999[--Class69.field1003];
                  var11 = (Class2)Class19.field154.field10.get(var3);
                  Class69.field1001[++Class55.field497 - 1] = var11.method16();
                  return 1;
               } else if (var0 == 3922) {
                  var3 = Class69.field999[--Class69.field1003];
                  var11 = (Class2)Class19.field154.field10.get(var3);
                  Class69.field1001[++Class55.field497 - 1] = var11.method18();
                  return 1;
               } else if (var0 == 3923) {
                  var3 = Class69.field999[--Class69.field1003];
                  var11 = (Class2)Class19.field154.field10.get(var3);
                  long var5 = Class182.method3547() - Class70.field1013 - var11.field20;
                  int var7 = (int)(var5 / 3600000L);
                  int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
                  int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * '\uea60')) / 1000L);
                  String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
                  Class69.field1001[++Class55.field497 - 1] = var10;
                  return 1;
               } else if (var0 == 3924) {
                  var3 = Class69.field999[--Class69.field1003];
                  var11 = (Class2)Class19.field154.field10.get(var3);
                  Class69.field999[++Class69.field1003 - 1] = var11.field17.field33;
                  return 1;
               } else if (var0 == 3925) {
                  var3 = Class69.field999[--Class69.field1003];
                  var11 = (Class2)Class19.field154.field10.get(var3);
                  Class69.field999[++Class69.field1003 - 1] = var11.field17.field30;
                  return 1;
               } else if (var0 == 3926) {
                  var3 = Class69.field999[--Class69.field1003];
                  var11 = (Class2)Class19.field154.field10.get(var3);
                  Class69.field999[++Class69.field1003 - 1] = var11.field17.field29;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   @ObfuscatedName("fd")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "120"
   )
   static void method478() {
      int var0;
      if (Client.field609 == 0) {
         Class28.field248 = new Class125(4, 104, 104, Class50.field459);

         for(var0 = 0; var0 < 4; ++var0) {
            Client.field642[var0] = new Class164(104, 104);
         }

         Class72.field1038 = new Class318(512, 512);
         Class78.field1100 = "Starting game engine...";
         Class78.field1099 = 5;
         Client.field609 = 20;
      } else {
         int var1;
         int var2;
         int var3;
         int var4;
         if (Client.field609 == 20) {
            int[] var33 = new int[9];

            for(var1 = 0; var1 < 9; ++var1) {
               var2 = var1 * 32 + 15 + 128;
               var3 = var2 * 3 + 600;
               var4 = Class122.field1681[var2];
               var33[var1] = var4 * var3 >> 16;
            }

            Class125.method2893(var33, 500, 800, 512, 334);
            Class78.field1100 = "Prepared visibility map";
            Class78.field1099 = 10;
            Client.field609 = 30;
         } else if (Client.field609 == 30) {
            Class77.field1079 = Class53.method1009(0, false, true, true);
            Class37.field326 = Class53.method1009(1, false, true, true);
            Class97.field1329 = Class53.method1009(2, true, false, true);
            Class224.field2548 = Class53.method1009(3, false, true, true);
            Class135.field1852 = Class53.method1009(4, false, true, true);
            Class246.field3159 = Class53.method1009(5, true, true, true);
            Class80.field1147 = Class53.method1009(6, true, true, true);
            Class21.field179 = Class53.method1009(7, false, true, true);
            Class175.field2270 = Class53.method1009(8, false, true, true);
            Class268.field3419 = Class53.method1009(9, false, true, true);
            Class22.field183 = Class53.method1009(10, false, true, true);
            Class61.field576 = Class53.method1009(11, false, true, true);
            Client.field854 = Class53.method1009(12, false, true, true);
            Class50.field461 = Class53.method1009(13, true, false, true);
            Class59.field543 = Class53.method1009(14, false, true, true);
            Class36.field312 = Class53.method1009(15, false, true, true);
            Class24.field207 = Class53.method1009(16, true, true, true);
            Class78.field1100 = "Connecting to update server";
            Class78.field1099 = 20;
            Client.field609 = 40;
         } else if (Client.field609 == 40) {
            byte var30 = 0;
            var0 = var30 + Class77.field1079.method4720() * 4 / 100;
            var0 += Class37.field326.method4720() * 4 / 100;
            var0 += Class97.field1329.method4720() * 2 / 100;
            var0 += Class224.field2548.method4720() * 2 / 100;
            var0 += Class135.field1852.method4720() * 6 / 100;
            var0 += Class246.field3159.method4720() * 4 / 100;
            var0 += Class80.field1147.method4720() * 2 / 100;
            var0 += Class21.field179.method4720() * 58 / 100;
            var0 += Class175.field2270.method4720() * 2 / 100;
            var0 += Class268.field3419.method4720() * 2 / 100;
            var0 += Class22.field183.method4720() * 2 / 100;
            var0 += Class61.field576.method4720() * 2 / 100;
            var0 += Client.field854.method4720() * 2 / 100;
            var0 += Class50.field461.method4720() * 2 / 100;
            var0 += Class59.field543.method4720() * 2 / 100;
            var0 += Class36.field312.method4720() * 2 / 100;
            var0 += Class24.field207.method4720() * 2 / 100;
            if (var0 != 100) {
               if (var0 != 0) {
                  Class78.field1100 = "Checking for updates - " + var0 + "%";
               }

               Class78.field1099 = 30;
            } else {
               Class32.method548(Class77.field1079, "Animations");
               Class32.method548(Class37.field326, "Skeletons");
               Class32.method548(Class135.field1852, "Sound FX");
               Class32.method548(Class246.field3159, "Maps");
               Class32.method548(Class80.field1147, "Music Tracks");
               Class32.method548(Class21.field179, "Models");
               Class32.method548(Class175.field2270, "Sprites");
               Class32.method548(Class61.field576, "Music Jingles");
               Class32.method548(Class59.field543, "Music Samples");
               Class32.method548(Class36.field312, "Music Patches");
               Class32.method548(Class24.field207, "World Map");
               Class78.field1100 = "Loaded update list";
               Class78.field1099 = 30;
               Client.field609 = 45;
            }
         } else {
            Class249 var25;
            Class249 var27;
            if (Client.field609 == 45) {
               Class68.method1697(22050, !Client.field585, 2);
               Class218 var32 = new Class218();
               var32.method4257(9, 128);
               Class28.field244 = Class65.method1582(Class47.field392, 0, 22050);
               Class28.field244.method2143(var32);
               var25 = Class36.field312;
               Class249 var26 = Class59.field543;
               var27 = Class135.field1852;
               Class177.field2284 = var25;
               Class217.field2464 = var26;
               Class217.field2458 = var27;
               Class217.field2459 = var32;
               Class63.field879 = Class65.method1582(Class47.field392, 1, 2048);
               Class36.field310 = new Class88();
               Class63.field879.method2143(Class36.field310);
               Class61.field577 = new Class102(22050, Class95.field1300);
               Class78.field1100 = "Prepared sound engine";
               Class78.field1099 = 35;
               Client.field609 = 50;
               Class1.field14 = new Class296(Class175.field2270, Class50.field461);
            } else if (Client.field609 == 50) {
               var0 = Class295.method5498().length;
               Client.field631 = Class1.field14.method5504(Class295.method5498());
               if (Client.field631.size() < var0) {
                  Class78.field1100 = "Loading fonts - " + Client.field631.size() * 100 / var0 + "%";
                  Class78.field1099 = 40;
               } else {
                  Class151.field1936 = (Class298)Client.field631.get(Class295.field3678);
                  Class63.field933 = (Class298)Client.field631.get(Class295.field3672);
                  Class293.field3660 = (Class298)Client.field631.get(Class295.field3668);
                  Class27.field228 = new Class324(true);
                  Class78.field1100 = "Loaded fonts";
                  Class78.field1099 = 40;
                  Client.field609 = 60;
               }
            } else if (Client.field609 == 60) {
               var0 = Class224.method4426(Class22.field183, Class175.field2270);
               var1 = Class11.method99();
               if (var0 < var1) {
                  Class78.field1100 = "Loading title screen - " + var0 * 100 / var1 + "%";
                  Class78.field1099 = 50;
               } else {
                  Class78.field1100 = "Loaded title screen";
                  Class78.field1099 = 50;
                  Class48.method947(5);
                  Client.field609 = 70;
               }
            } else if (Client.field609 == 70) {
               if (!Class97.field1329.method4629()) {
                  Class78.field1100 = "Loading config - " + Class97.field1329.method4755() + "%";
                  Class78.field1099 = 60;
               } else {
                  Class21.method277(Class97.field1329);
                  Class58.method1069(Class97.field1329);
                  Class257.method4851(Class97.field1329, Class21.field179);
                  Class249 var31 = Class97.field1329;
                  var25 = Class21.field179;
                  boolean var29 = Client.field585;
                  Class268.field3377 = var31;
                  Class130.field1801 = var25;
                  Class268.field3416 = var29;
                  var27 = Class97.field1329;
                  Class249 var28 = Class21.field179;
                  Class271.field3490 = var27;
                  Class271.field3487 = var28;
                  Class249 var5 = Class97.field1329;
                  Class7.field42 = var5;
                  Class249 var6 = Class97.field1329;
                  Class249 var7 = Class21.field179;
                  boolean var8 = Client.field668;
                  Class298 var9 = Class151.field1936;
                  Class269.field3424 = var6;
                  Class269.field3454 = var7;
                  Class269.field3426 = var8;
                  Class86.field1212 = Class269.field3424.method4636(10);
                  Class269.field3466 = var9;
                  Class249 var10 = Class97.field1329;
                  Class249 var11 = Class77.field1079;
                  Class249 var12 = Class37.field326;
                  Class273.field3538 = var10;
                  Class273.field3536 = var11;
                  Class273.field3537 = var12;
                  Class249 var13 = Class97.field1329;
                  Class249 var14 = Class21.field179;
                  Class258.field3272 = var13;
                  Class258.field3279 = var14;
                  Class249 var15 = Class97.field1329;
                  Class263.field3322 = var15;
                  Class249 var16 = Class97.field1329;
                  Class0.field2 = var16;
                  Class254.field3232 = Class0.field2.method4636(16);
                  Class11.method100(Class224.field2548, Class21.field179, Class175.field2270, Class50.field461);
                  Class160.method3344(Class97.field1329);
                  Class249 var17 = Class97.field1329;
                  Class266.field3338 = var17;
                  Class129.method3072(Class97.field1329);
                  Class249 var18 = Class97.field1329;
                  Class257.field3264 = var18;
                  Class249 var19 = Class97.field1329;
                  Class264.field3327 = var19;
                  Class22.field185 = new Class82();
                  Class250.method4766(Class97.field1329, Class175.field2270, Class50.field461);
                  Class144.method3181(Class97.field1329, Class175.field2270);
                  Class249 var20 = Class97.field1329;
                  Class249 var21 = Class175.field2270;
                  Class255.field3237 = var21;
                  if (var20.method4629()) {
                     Class255.field3236 = var20.method4636(35);
                     Class255.field3246 = new Class255[Class255.field3236];

                     for(int var22 = 0; var22 < Class255.field3236; ++var22) {
                        byte[] var23 = var20.method4625(35, var22);
                        if (var23 != null) {
                           Class255.field3246[var22] = new Class255(var22);
                           Class255.field3246[var22].method4816(new Class182(var23));
                           Class255.field3246[var22].method4828();
                        }
                     }
                  }

                  Class78.field1100 = "Loaded config";
                  Class78.field1099 = 60;
                  Client.field609 = 80;
               }
            } else if (Client.field609 == 80) {
               var0 = 0;
               if (Class128.field1791 == null) {
                  Class128.field1791 = Class137.method3127(Class175.field2270, "compass", "");
               } else {
                  ++var0;
               }

               if (Class136.field1862 == null) {
                  Class136.field1862 = Class137.method3127(Class175.field2270, "mapedge", "");
               } else {
                  ++var0;
               }

               if (Class25.field214 == null) {
                  Class25.field214 = Class13.method113(Class175.field2270, "mapscene", "");
               } else {
                  ++var0;
               }

               if (Class150.field1919 == null) {
                  Class150.field1919 = Class21.method279(Class175.field2270, "headicons_pk", "");
               } else {
                  ++var0;
               }

               if (Class43.field369 == null) {
                  Class43.field369 = Class21.method279(Class175.field2270, "headicons_prayer", "");
               } else {
                  ++var0;
               }

               if (Class150.field1926 == null) {
                  Class150.field1926 = Class21.method279(Class175.field2270, "headicons_hint", "");
               } else {
                  ++var0;
               }

               if (Class111.field1446 == null) {
                  Class111.field1446 = Class21.method279(Class175.field2270, "mapmarker", "");
               } else {
                  ++var0;
               }

               if (Class161.field1997 == null) {
                  Class161.field1997 = Class21.method279(Class175.field2270, "cross", "");
               } else {
                  ++var0;
               }

               if (Class36.field314 == null) {
                  Class36.field314 = Class21.method279(Class175.field2270, "mapdots", "");
               } else {
                  ++var0;
               }

               if (Class243.field3139 == null) {
                  Class243.field3139 = Class13.method113(Class175.field2270, "scrollbar", "");
               } else {
                  ++var0;
               }

               if (Class322.field3881 == null) {
                  Class322.field3881 = Class13.method113(Class175.field2270, "mod_icons", "");
               } else {
                  ++var0;
               }

               if (var0 < 11) {
                  Class78.field1100 = "Loading sprites - " + var0 * 100 / 12 + "%";
                  Class78.field1099 = 70;
               } else {
                  Class299.field3698 = Class322.field3881;
                  Class136.field1862.method5843();
                  var1 = (int)(Math.random() * 21.0D) - 10;
                  var2 = (int)(Math.random() * 21.0D) - 10;
                  var3 = (int)(Math.random() * 21.0D) - 10;
                  var4 = (int)(Math.random() * 41.0D) - 20;
                  Class25.field214[0].method5822(var1 + var4, var2 + var4, var3 + var4);
                  Class78.field1100 = "Loaded sprites";
                  Class78.field1099 = 70;
                  Client.field609 = 90;
               }
            } else if (Client.field609 == 90) {
               if (!Class268.field3419.method4629()) {
                  Class78.field1100 = "Loading textures - " + "0%";
                  Class78.field1099 = 90;
               } else {
                  field250 = new Class111(Class268.field3419, Class175.field2270, 20, 0.8D, Client.field585 ? 64 : 128);
                  Class122.method2789(field250);
                  Class122.method2830(0.8D);
                  Client.field609 = 100;
               }
            } else if (Client.field609 == 100) {
               var0 = field250.method2530();
               if (var0 < 100) {
                  Class78.field1100 = "Loading textures - " + var0 + "%";
                  Class78.field1099 = 90;
               } else {
                  Class78.field1100 = "Loaded textures";
                  Class78.field1099 = 90;
                  Client.field609 = 110;
               }
            } else if (Client.field609 == 110) {
               Class26.field220 = new Class57();
               Class47.field392.method3249(Class26.field220, 10);
               Class78.field1100 = "Loaded input handler";
               Class78.field1099 = 92;
               Client.field609 = 120;
            } else if (Client.field609 == 120) {
               if (!Class22.field183.method4646("huffman", "")) {
                  Class78.field1100 = "Loading wordpack - " + 0 + "%";
                  Class78.field1099 = 94;
               } else {
                  Class174 var24 = new Class174(Class22.field183.method4684("huffman", ""));
                  Class181.method3529(var24);
                  Class78.field1100 = "Loaded wordpack";
                  Class78.field1099 = 94;
                  Client.field609 = 130;
               }
            } else if (Client.field609 == 130) {
               if (!Class224.field2548.method4629()) {
                  Class78.field1100 = "Loading interfaces - " + Class224.field2548.method4755() * 4 / 5 + "%";
                  Class78.field1099 = 96;
               } else if (!Client.field854.method4629()) {
                  Class78.field1100 = "Loading interfaces - " + (80 + Client.field854.method4755() / 6) + "%";
                  Class78.field1099 = 96;
               } else if (!Class50.field461.method4629()) {
                  Class78.field1100 = "Loading interfaces - " + (96 + Class50.field461.method4755() / 50) + "%";
                  Class78.field1099 = 96;
               } else {
                  Class78.field1100 = "Loaded interfaces";
                  Class78.field1099 = 98;
                  Client.field609 = 140;
               }
            } else if (Client.field609 == 140) {
               Class78.field1099 = 100;
               if (!Class24.field207.method4704(field252.field255)) {
                  Class78.field1100 = "Loading world map - " + Class24.field207.method4687(field252.field255) / 10 + "%";
               } else {
                  if (Class53.field476 == null) {
                     Class53.field476 = new Class321();
                     Class53.field476.method6000(Class24.field207, Class293.field3660, Client.field631, Class25.field214);
                  }

                  var0 = Class53.field476.method6094();
                  if (var0 < 100) {
                     Class78.field1100 = "Loading world map - " + (var0 * 9 / 10 + 10) + "%";
                  } else {
                     Class78.field1100 = "Loaded world map";
                     Client.field609 = 150;
                  }
               }
            } else if (Client.field609 == 150) {
               Class48.method947(10);
            }
         }
      }
   }

   @ObfuscatedName("hk")
   @ObfuscatedSignature(
      signature = "(Lfl;S)V",
      garbageValue = "-22268"
   )
   static final void method479(Class171 var0) {
      Class189 var1 = Client.field626.field1219;
      int var2;
      int var3;
      int var4;
      byte var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var12;
      int var13;
      int var37;
      int var39;
      if (Class171.field2246 == var0) {
         var2 = var1.readUnsignedShort();
         var3 = var1.method3551();
         byte var38 = var1.readByte();
         var5 = var1.method3660();
         var6 = var1.readUnsignedByte() * 4;
         var7 = var1.method3765();
         var8 = var1.method3765();
         var9 = var1.method3765();
         var10 = (var9 >> 4 & 7) + Class57.field524;
         var39 = (var9 & 7) + Class226.field2568;
         var12 = var1.method3613();
         var13 = var1.method3577() * 4;
         int var40 = var1.readUnsignedShort();
         var4 = var38 + var10;
         var37 = var5 + var39;
         if (var10 >= 0 && var39 >= 0 && var10 < 104 && var39 < 104 && var4 >= 0 && var37 >= 0 && var4 < 104 && var37 < 104 && var12 != 65535) {
            var10 = var10 * 128 + 64;
            var39 = var39 * 128 + 64;
            var4 = var4 * 128 + 64;
            var37 = var37 * 128 + 64;
            Class79 var15 = new Class79(var12, Class13.field82, var10, var39, Class27.method460(var10, var39, Class13.field82) - var13, var40 + Client.field591, var2 + Client.field591, var7, var8, var3, var6);
            var15.method1849(var4, var37, Class27.method460(var4, var37, Class13.field82) - var6, var40 + Client.field591);
            Client.field710.method4073(var15);
         }

      } else if (Class171.field2243 == var0) {
         var2 = var1.readReverseUnsignedByte();
         var3 = (var2 >> 4 & 7) + Class57.field524;
         var4 = (var2 & 7) + Class226.field2568;
         var37 = var1.method3765();
         var6 = var37 >> 2;
         var7 = var37 & 3;
         var8 = Client.field846[var6];
         var9 = var1.method3613();
         if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
            Class241.method4602(Class13.field82, var3, var4, var8, var9, var6, var7, 0, -1);
         }

      } else if (Class171.field2248 == var0) {
         var2 = var1.method3646();
         var3 = var1.readUnsignedByte();
         var4 = var3 >> 2;
         var37 = var3 & 3;
         var6 = Client.field846[var4];
         var7 = var1.readUnsignedByte();
         var8 = (var7 >> 4 & 7) + Class57.field524;
         var9 = (var7 & 7) + Class226.field2568;
         if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
            if (var6 == 0) {
               Class128 var31 = Class28.field248.method2894(Class13.field82, var8, var9);
               if (var31 != null) {
                  var39 = Class39.method673(var31.field1786);
                  if (var4 == 2) {
                     var31.field1787 = new Class85(var39, 2, var37 + 4, Class13.field82, var8, var9, var2, false, var31.field1787);
                     var31.field1788 = new Class85(var39, 2, var37 + 1 & 3, Class13.field82, var8, var9, var2, false, var31.field1788);
                  } else {
                     var31.field1787 = new Class85(var39, var4, var37, Class13.field82, var8, var9, var2, false, var31.field1787);
                  }
               }
            }

            if (var6 == 1) {
               Class133 var41 = Class28.field248.method2895(Class13.field82, var8, var9);
               if (var41 != null) {
                  var39 = Class39.method673(var41.field1824);
                  if (var4 != 4 && var4 != 5) {
                     if (var4 == 6) {
                        var41.field1823 = new Class85(var39, 4, var37 + 4, Class13.field82, var8, var9, var2, false, var41.field1823);
                     } else if (var4 == 7) {
                        var41.field1823 = new Class85(var39, 4, (var37 + 2 & 3) + 4, Class13.field82, var8, var9, var2, false, var41.field1823);
                     } else if (var4 == 8) {
                        var41.field1823 = new Class85(var39, 4, var37 + 4, Class13.field82, var8, var9, var2, false, var41.field1823);
                        var41.field1831 = new Class85(var39, 4, (var37 + 2 & 3) + 4, Class13.field82, var8, var9, var2, false, var41.field1831);
                     }
                  } else {
                     var41.field1823 = new Class85(var39, 4, var37, Class13.field82, var8, var9, var2, false, var41.field1823);
                  }
               }
            }

            if (var6 == 2) {
               Class134 var42 = Class28.field248.method2896(Class13.field82, var8, var9);
               if (var4 == 11) {
                  var4 = 10;
               }

               if (var42 != null) {
                  var42.field1844 = new Class85(Class39.method673(var42.field1848), var4, var37, Class13.field82, var8, var9, var2, false, var42.field1844);
               }
            }

            if (var6 == 3) {
               Class115 var43 = Class28.field248.method2953(Class13.field82, var8, var9);
               if (var43 != null) {
                  var43.field1524 = new Class85(Class39.method673(var43.field1526), 22, var37, Class13.field82, var8, var9, var2, false, var43.field1524);
               }
            }
         }

      } else if (Class171.field2241 == var0) {
         var2 = var1.readUnsignedShort();
         var3 = var1.readUnsignedShort();
         var4 = var1.method3765();
         var37 = (var4 >> 4 & 7) + Class57.field524;
         var6 = (var4 & 7) + Class226.field2568;
         var7 = var1.readUnsignedByte();
         if (var37 >= 0 && var6 >= 0 && var37 < 104 && var6 < 104) {
            var37 = var37 * 128 + 64;
            var6 = var6 * 128 + 64;
            Class70 var44 = new Class70(var2, Class13.field82, var37, var6, Class27.method460(var37, var6, Class13.field82) - var7, var3, Client.field591);
            Client.field711.method4073(var44);
         }

      } else {
         Class80 var33;
         if (Class171.field2249 == var0) {
            var2 = var1.method3765();
            var3 = (var2 >> 4 & 7) + Class57.field524;
            var4 = (var2 & 7) + Class226.field2568;
            var37 = var1.method3613();
            var6 = var1.readUShort();
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
               var33 = new Class80();
               var33.field1151 = var37;
               var33.field1148 = var6;
               if (Client.field708[Class13.field82][var3][var4] == null) {
                  Client.field708[Class13.field82][var3][var4] = new Class205();
               }

               Client.field708[Class13.field82][var3][var4].method4073(var33);
               Class253.method4808(var3, var4);
            }

         } else if (Class171.field2247 == var0) {
            var2 = var1.readUnsignedByte();
            var3 = var2 >> 2;
            var4 = var2 & 3;
            var37 = Client.field846[var3];
            var6 = var1.method3765();
            var7 = (var6 >> 4 & 7) + Class57.field524;
            var8 = (var6 & 7) + Class226.field2568;
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
               Class241.method4602(Class13.field82, var7, var8, var37, -1, var3, var4, 0, -1);
            }

         } else if (Class171.field2242 == var0) {
            var2 = var1.method3646();
            var3 = var1.method3577();
            var4 = (var3 >> 4 & 7) + Class57.field524;
            var37 = (var3 & 7) + Class226.field2568;
            if (var4 >= 0 && var37 >= 0 && var4 < 104 && var37 < 104) {
               Class205 var34 = Client.field708[Class13.field82][var4][var37];
               if (var34 != null) {
                  for(var33 = (Class80)var34.method4098(); var33 != null; var33 = (Class80)var34.method4079()) {
                     if ((var2 & 32767) == var33.field1151) {
                        var33.method4064();
                        break;
                     }
                  }

                  if (var34.method4098() == null) {
                     Client.field708[Class13.field82][var4][var37] = null;
                  }

                  Class253.method4808(var4, var37);
               }
            }

         } else {
            if (Class171.field2245 == var0) {
               var2 = var1.readReverseUnsignedByte();
               var3 = (var2 >> 4 & 7) + Class57.field524;
               var4 = (var2 & 7) + Class226.field2568;
               var5 = var1.readByte();
               var6 = var1.readUnsignedShort();
               var7 = var1.readReverseUnsignedByte();
               var8 = var7 >> 2;
               var9 = var7 & 3;
               var10 = Client.field846[var8];
               byte var11 = var1.readByte();
               var12 = var1.readUnsignedShort();
               var13 = var1.readUShort();
               byte var14 = var1.readAByte();
               int var35 = var1.method3613();
               byte var16 = var1.method3660();
               Class60 var17;
               if (var35 == Client.field628) {
                  var17 = Class138.field1876;
               } else {
                  var17 = Client.field610[var35];
               }

               if (var17 != null) {
                  Class268 var18 = Class110.method2527(var6);
                  int var19;
                  int var20;
                  if (var9 != 1 && var9 != 3) {
                     var19 = var18.field3384;
                     var20 = var18.field3385;
                  } else {
                     var19 = var18.field3385;
                     var20 = var18.field3384;
                  }

                  int var21 = var3 + (var19 >> 1);
                  int var22 = var3 + (var19 + 1 >> 1);
                  int var23 = var4 + (var20 >> 1);
                  int var24 = var4 + (var20 + 1 >> 1);
                  int[][] var25 = Class50.field459[Class13.field82];
                  int var26 = var25[var22][var24] + var25[var21][var23] + var25[var22][var23] + var25[var21][var24] >> 2;
                  int var27 = (var3 << 7) + (var19 << 6);
                  int var28 = (var4 << 7) + (var20 << 6);
                  Class119 var29 = var18.method5031(var8, var9, var25, var27, var26, var28);
                  if (var29 != null) {
                     Class241.method4602(Class13.field82, var3, var4, var10, -1, 0, 0, var12 + 1, var13 + 1);
                     var17.field545 = var12 + Client.field591;
                     var17.field555 = var13 + Client.field591;
                     var17.field563 = var29;
                     var17.field556 = var3 * 128 + var19 * 64;
                     var17.field558 = var4 * 128 + var20 * 64;
                     var17.field557 = var26;
                     byte var30;
                     if (var14 > var5) {
                        var30 = var14;
                        var14 = var5;
                        var5 = var30;
                     }

                     if (var16 > var11) {
                        var30 = var16;
                        var16 = var11;
                        var11 = var30;
                     }

                     var17.field559 = var14 + var3;
                     var17.field565 = var5 + var3;
                     var17.field547 = var16 + var4;
                     var17.field553 = var4 + var11;
                  }
               }
            }

            if (Class171.field2250 == var0) {
               var2 = var1.readReverseUnsignedByte();
               var3 = var1.readUnsignedByte();
               var4 = var3 >> 4 & 15;
               var37 = var3 & 7;
               var6 = var1.readReverseUnsignedByte();
               var7 = (var6 >> 4 & 7) + Class57.field524;
               var8 = (var6 & 7) + Class226.field2568;
               var9 = var1.method3646();
               if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                  var10 = var4 + 1;
                  if (Class138.field1876.field922[0] >= var7 - var10 && Class138.field1876.field922[0] <= var7 + var10 && Class138.field1876.field872[0] >= var8 - var10 && Class138.field1876.field872[0] <= var10 + var8 && Client.field815 != 0 && var37 > 0 && Client.field656 < 50) {
                     Client.field817[Client.field656] = var9;
                     Client.field676[Client.field656] = var37;
                     Client.field819[Client.field656] = var2;
                     Client.field719[Client.field656] = null;
                     Client.field820[Client.field656] = var4 + (var8 << 8) + (var7 << 16);
                     ++Client.field656;
                  }
               }
            }

            if (Class171.field2244 == var0) {
               var2 = var1.readUnsignedByte();
               var3 = (var2 >> 4 & 7) + Class57.field524;
               var4 = (var2 & 7) + Class226.field2568;
               var37 = var1.method3613();
               var6 = var1.method3613();
               var7 = var1.method3646();
               if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                  Class205 var32 = Client.field708[Class13.field82][var3][var4];
                  if (var32 != null) {
                     for(Class80 var36 = (Class80)var32.method4098(); var36 != null; var36 = (Class80)var32.method4079()) {
                        if ((var6 & 32767) == var36.field1151 && var7 == var36.field1148) {
                           var36.field1148 = var37;
                           break;
                        }
                     }

                     Class253.method4808(var3, var4);
                  }
               }

            }
         }
      }
   }
}
