package com.client;
import java.util.Random;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public class Class107 {
   @ObfuscatedName("t")
   static int[] field1407;
   @ObfuscatedName("o")
   static int[] field1408 = new int['耀'];
   @ObfuscatedName("y")
   static int[] field1409;
   @ObfuscatedName("j")
   static int[] field1390;
   @ObfuscatedName("d")
   static int[] field1399;
   @ObfuscatedName("h")
   static int[] field1413;
   @ObfuscatedName("c")
   static int[] field1414;
   @ObfuscatedName("v")
   static int[] field1411;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lcj;"
   )
   Class96 field1400;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lcj;"
   )
   Class96 field1401;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lcj;"
   )
   Class96 field1392;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lcj;"
   )
   Class96 field1393;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lcj;"
   )
   Class96 field1394;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lcj;"
   )
   Class96 field1395;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lcj;"
   )
   Class96 field1396;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lcj;"
   )
   Class96 field1397;
   @ObfuscatedName("x")
   int[] field1406 = new int[]{0, 0, 0, 0, 0};
   @ObfuscatedName("e")
   int[] field1415 = new int[]{0, 0, 0, 0, 0};
   @ObfuscatedName("p")
   int[] field1412 = new int[]{0, 0, 0, 0, 0};
   @ObfuscatedName("b")
   int field1398 = 0;
   @ObfuscatedName("n")
   int field1402 = 100;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Ldh;"
   )
   Class104 field1403;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lcj;"
   )
   Class96 field1410;
   @ObfuscatedName("m")
   int field1404 = 500;
   @ObfuscatedName("r")
   int field1405 = 0;

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < 32768; ++var1) {
         field1408[var1] = (var0.nextInt() & 2) - 1;
      }

      field1409 = new int['耀'];

      for(var1 = 0; var1 < 32768; ++var1) {
         field1409[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      field1407 = new int[220500];
      field1390 = new int[5];
      field1399 = new int[5];
      field1413 = new int[5];
      field1414 = new int[5];
      field1411 = new int[5];
   }

   @ObfuscatedName("z")
   final int[] method2464(int var1, int var2) {
      Class193.method3895(field1407, 0, var1);
      if (var2 < 10) {
         return field1407;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.field1400.method2198();
         this.field1401.method2198();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.field1392 != null) {
            this.field1392.method2198();
            this.field1393.method2198();
            var5 = (int)((double)(this.field1392.field1318 - this.field1392.field1314) * 32.768D / var3);
            var6 = (int)((double)this.field1392.field1314 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.field1394 != null) {
            this.field1394.method2198();
            this.field1395.method2198();
            var8 = (int)((double)(this.field1394.field1318 - this.field1394.field1314) * 32.768D / var3);
            var9 = (int)((double)this.field1394.field1314 * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.field1406[var11] != 0) {
               field1390[var11] = 0;
               field1399[var11] = (int)((double)this.field1412[var11] * var3);
               field1413[var11] = (this.field1406[var11] << 14) / 100;
               field1414[var11] = (int)((double)(this.field1400.field1318 - this.field1400.field1314) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field1415[var11]) / var3);
               field1411[var11] = (int)((double)this.field1400.field1314 * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field1400.method2206(var1);
            var13 = this.field1401.method2206(var1);
            if (this.field1392 != null) {
               var14 = this.field1392.method2206(var1);
               var15 = this.field1393.method2206(var1);
               var12 += this.method2467(var7, var15, this.field1392.field1317) >> 1;
               var7 = var7 + var6 + (var14 * var5 >> 16);
            }

            if (this.field1394 != null) {
               var14 = this.field1394.method2206(var1);
               var15 = this.field1395.method2206(var1);
               var13 = var13 * ((this.method2467(var10, var15, this.field1394.field1317) >> 1) + '耀') >> 15;
               var10 = var10 + var9 + (var14 * var8 >> 16);
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.field1406[var14] != 0) {
                  var15 = field1399[var14] + var11;
                  if (var15 < var1) {
                     field1407[var15] += this.method2467(field1390[var14], var13 * field1413[var14] >> 15, this.field1400.field1317);
                     field1390[var14] += (var12 * field1414[var14] >> 16) + field1411[var14];
                  }
               }
            }
         }

         int var16;
         if (this.field1396 != null) {
            this.field1396.method2198();
            this.field1397.method2198();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field1396.method2206(var1);
               var16 = this.field1397.method2206(var1);
               if (var20) {
                  var12 = (var15 * (this.field1396.field1318 - this.field1396.field1314) >> 8) + this.field1396.field1314;
               } else {
                  var12 = (var16 * (this.field1396.field1318 - this.field1396.field1314) >> 8) + this.field1396.field1314;
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if (var20) {
                  field1407[var14] = 0;
               }
            }
         }

         if (this.field1398 > 0 && this.field1402 > 0) {
            var11 = (int)((double)this.field1398 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               field1407[var12] += field1407[var12 - var11] * this.field1402 / 100;
            }
         }

         if (this.field1403.field1373[0] > 0 || this.field1403.field1373[1] > 0) {
            this.field1410.method2198();
            var11 = this.field1410.method2206(var1 + 1);
            var12 = this.field1403.method2428(0, (float)var11 / 65536.0F);
            var13 = this.field1403.method2428(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)field1407[var14 + var12] * (long)Class104.field1378 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)field1407[var14 + var12 - 1 - var17] * (long)Class104.field1376[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)field1407[var14 - 1 - var17] * (long)Class104.field1376[1][var17] >> 16);
                  }

                  field1407[var14] = var16;
                  var11 = this.field1410.method2206(var1 + 1);
                  ++var14;
               }

               var15 = 128;

               while(true) {
                  if (var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)field1407[var14 + var12] * (long)Class104.field1378 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)field1407[var14 + var12 - 1 - var18] * (long)Class104.field1376[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)field1407[var14 - 1 - var18] * (long)Class104.field1376[1][var18] >> 16);
                     }

                     field1407[var14] = var17;
                     var11 = this.field1410.method2206(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)field1407[var14 + var12 - 1 - var18] * (long)Class104.field1376[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)field1407[var14 - 1 - var18] * (long)Class104.field1376[1][var18] >> 16);
                        }

                        field1407[var14] = var17;
                        this.field1410.method2206(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field1403.method2428(0, (float)var11 / 65536.0F);
                  var13 = this.field1403.method2428(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (field1407[var11] < -32768) {
               field1407[var11] = -32768;
            }

            if (field1407[var11] > 32767) {
               field1407[var11] = 32767;
            }
         }

         return field1407;
      }
   }

   @ObfuscatedName("w")
   final int method2467(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return field1409[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return (var2 * (var1 & 32767) >> 14) - var2;
      } else {
         return var3 == 4 ? var2 * field1408[var1 / 2607 & 32767] : 0;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;)V"
   )
   final void method2466(Class182 var1) {
      this.field1400 = new Class96();
      this.field1400.method2199(var1);
      this.field1401 = new Class96();
      this.field1401.method2199(var1);
      int var2 = var1.method3544();
      if (var2 != 0) {
         --var1.field2339;
         this.field1392 = new Class96();
         this.field1392.method2199(var1);
         this.field1393 = new Class96();
         this.field1393.method2199(var1);
      }

      var2 = var1.method3544();
      if (var2 != 0) {
         --var1.field2339;
         this.field1394 = new Class96();
         this.field1394.method2199(var1);
         this.field1395 = new Class96();
         this.field1395.method2199(var1);
      }

      var2 = var1.method3544();
      if (var2 != 0) {
         --var1.field2339;
         this.field1396 = new Class96();
         this.field1396.method2199(var1);
         this.field1397 = new Class96();
         this.field1397.method2199(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.method3562();
         if (var4 == 0) {
            break;
         }

         this.field1406[var3] = var4;
         this.field1415[var3] = var1.method3561();
         this.field1412[var3] = var1.method3562();
      }

      this.field1398 = var1.method3562();
      this.field1402 = var1.method3562();
      this.field1404 = var1.method3550();
      this.field1405 = var1.method3550();
      this.field1403 = new Class104();
      this.field1410 = new Class96();
      this.field1403.method2425(var1, this.field1410);
   }
}
