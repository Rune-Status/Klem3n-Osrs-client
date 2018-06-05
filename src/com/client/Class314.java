package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
public class Class314 extends Class206 {
   @ObfuscatedName("ah")
   public static int[] field3766;
   @ObfuscatedName("ab")
   public static int field3761;
   @ObfuscatedName("aw")
   public static int field3762;
   @ObfuscatedName("ak")
   public static int field3763 = 0;
   @ObfuscatedName("as")
   public static int field3764 = 0;
   @ObfuscatedName("an")
   public static int field3765 = 0;
   @ObfuscatedName("ao")
   protected static int field3760 = 0;

   @ObfuscatedName("dz")
   public static void method5718(int[] var0, int var1, int var2) {
      field3766 = var0;
      field3761 = var1;
      field3762 = var2;
      method5720(0, 0, var1, var2);
   }

   @ObfuscatedName("dn")
   public static void method5719() {
      field3765 = 0;
      field3763 = 0;
      field3760 = field3761;
      field3764 = field3762;
   }

   @ObfuscatedName("dg")
   public static void method5720(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > field3761) {
         var2 = field3761;
      }

      if (var3 > field3762) {
         var3 = field3762;
      }

      field3765 = var0;
      field3763 = var1;
      field3760 = var2;
      field3764 = var3;
   }

   @ObfuscatedName("dy")
   public static void method5790(int var0, int var1, int var2, int var3) {
      if (field3765 < var0) {
         field3765 = var0;
      }

      if (field3763 < var1) {
         field3763 = var1;
      }

      if (field3760 > var2) {
         field3760 = var2;
      }

      if (field3764 > var3) {
         field3764 = var3;
      }

   }

   @ObfuscatedName("dv")
   public static void method5722(int[] var0) {
      var0[0] = field3765;
      var0[1] = field3763;
      var0[2] = field3760;
      var0[3] = field3764;
   }

   @ObfuscatedName("de")
   public static void method5723(int[] var0) {
      field3765 = var0[0];
      field3763 = var0[1];
      field3760 = var0[2];
      field3764 = var0[3];
   }

   @ObfuscatedName("dp")
   public static void method5724() {
      int var0 = 0;

      int var1;
      for(var1 = field3761 * field3762 - 7; var0 < var1; field3766[var0++] = 0) {
         field3766[var0++] = 0;
         field3766[var0++] = 0;
         field3766[var0++] = 0;
         field3766[var0++] = 0;
         field3766[var0++] = 0;
         field3766[var0++] = 0;
         field3766[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; field3766[var0++] = 0) {
         ;
      }

   }

   @ObfuscatedName("db")
   static void method5744(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         method5730(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < field3763) {
            var4 = field3763;
         }

         int var5 = var2 + var1 + 1;
         if (var5 > field3764) {
            var5 = field3764;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if (var1 > var5) {
            var1 = var5;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         while(var6 < var1) {
            while(var11 <= var7 || var10 <= var7) {
               var10 = var10 + var8 + var8;
               var11 += var8++ + var8;
            }

            var12 = var0 - var8 + 1;
            if (var12 < field3765) {
               var12 = field3765;
            }

            var13 = var0 + var8;
            if (var13 > field3760) {
               var13 = field3760;
            }

            var14 = var12 + var6 * field3761;

            for(var15 = var12; var15 < var13; ++var15) {
               field3766[var14++] = var3;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var7 + var9 * var9;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if (var12 < field3765) {
               var12 = field3765;
            }

            var13 = var0 + var8;
            if (var13 > field3760 - 1) {
               var13 = field3760 - 1;
            }

            var14 = var12 + var6 * field3761;

            for(var15 = var12; var15 <= var13; ++var15) {
               field3766[var14++] = var3;
            }

            ++var6;
            var11 = var11 + var9 + var9;
         }

      }
   }

   @ObfuscatedName("dq")
   public static void method5784(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            method5744(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = var4 * (var3 & 255);
            int var12 = var1 - var2;
            if (var12 < field3763) {
               var12 = field3763;
            }

            int var13 = var2 + var1 + 1;
            if (var13 > field3764) {
               var13 = field3764;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if (var1 > var13) {
               var1 = var13;
            }

            int var9;
            int var10;
            int var11;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            while(var14 < var1) {
               while(var19 <= var15 || var18 <= var15) {
                  var18 = var18 + var16 + var16;
                  var19 += var16++ + var16;
               }

               var20 = var0 - var16 + 1;
               if (var20 < field3765) {
                  var20 = field3765;
               }

               var21 = var0 + var16;
               if (var21 > field3760) {
                  var21 = field3760;
               }

               var22 = var20 + var14 * field3761;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = var5 * (field3766[var22] >> 16 & 255);
                  var10 = (field3766[var22] >> 8 & 255) * var5;
                  var11 = var5 * (field3766[var22] & 255);
                  var24 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
                  field3766[var22++] = var24;
               }

               ++var14;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var15 + var17 * var17;
            var18 = var19 - var2;

            for(var19 -= var17; var14 < var13; var18 += var17++ + var17) {
               while(var19 > var15 && var18 > var15) {
                  var19 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               var20 = var0 - var16;
               if (var20 < field3765) {
                  var20 = field3765;
               }

               var21 = var0 + var16;
               if (var21 > field3760 - 1) {
                  var21 = field3760 - 1;
               }

               var22 = var20 + var14 * field3761;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = var5 * (field3766[var22] >> 16 & 255);
                  var10 = (field3766[var22] >> 8 & 255) * var5;
                  var11 = var5 * (field3766[var22] & 255);
                  var24 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
                  field3766[var22++] = var24;
               }

               ++var14;
               var19 = var19 + var17 + var17;
            }

         }
      }
   }

   @ObfuscatedName("dx")
   public static void method5727(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < field3765) {
         var2 -= field3765 - var0;
         var0 = field3765;
      }

      if (var1 < field3763) {
         var3 -= field3763 - var1;
         var1 = field3763;
      }

      if (var0 + var2 > field3760) {
         var2 = field3760 - var0;
      }

      if (var3 + var1 > field3764) {
         var3 = field3764 - var1;
      }

      var4 = (var5 * (var4 & 16711935) >> 8 & 16711935) + (var5 * (var4 & '\uff00') >> 8 & '\uff00');
      int var6 = 256 - var5;
      int var7 = field3761 - var2;
      int var8 = var0 + field3761 * var1;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = field3766[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + (var6 * (var11 & '\uff00') >> 8 & '\uff00');
            field3766[var8++] = var11 + var4;
         }

         var8 += var7;
      }

   }

   @ObfuscatedName("du")
   public static void method5763(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < field3765) {
         var2 -= field3765 - var0;
         var0 = field3765;
      }

      if (var1 < field3763) {
         var3 -= field3763 - var1;
         var1 = field3763;
      }

      if (var0 + var2 > field3760) {
         var2 = field3760 - var0;
      }

      if (var3 + var1 > field3764) {
         var3 = field3764 - var1;
      }

      int var5 = field3761 - var2;
      int var6 = var0 + field3761 * var1;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            field3766[var6++] = var4;
         }

         var6 += var5;
      }

   }

   @ObfuscatedName("da")
   public static void method5728(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = var5 == var4 && var7 == var6 ? -1 : 65536 / var3;
         int var10 = var6;
         int var11 = 256 - var6;
         int var12 = var4;
         if (var0 < field3765) {
            var2 -= field3765 - var0;
            var0 = field3765;
         }

         if (var1 < field3763) {
            var8 += (field3763 - var1) * var9;
            var3 -= field3763 - var1;
            var1 = field3763;
         }

         if (var0 + var2 > field3760) {
            var2 = field3760 - var0;
         }

         if (var3 + var1 > field3764) {
            var3 = field3764 - var1;
         }

         int var13 = field3761 - var2;
         int var14 = var0 + field3761 * var1;

         for(int var15 = -var3; var15 < 0; ++var15) {
            int var16;
            int var17;
            for(var16 = -var2; var16 < 0; ++var16) {
               var17 = field3766[var14];
               int var18 = var12 + var17;
               int var19 = (var12 & 16711935) + (var17 & 16711935);
               int var20 = (var19 & 16777472) + (var18 - var19 & 65536);
               if (var11 == 0) {
                  field3766[var14++] = var18 - var20 | var20 - (var20 >>> 8);
               } else {
                  int var21 = var18 - var20 | var20 - (var20 >>> 8);
                  field3766[var14++] = ((var21 & 16711935) * var10 >> 8 & 16711935) + ((var17 & 16711935) * var11 >> 8 & 16711935) + (var10 * (var21 & '\uff00') >> 8 & '\uff00') + (var11 * (var17 & '\uff00') >> 8 & '\uff00');
               }
            }

            if (var9 > 0) {
               var8 += var9;
               var16 = 65536 - var8 >> 8;
               var17 = var8 >> 8;
               if (var7 != var6) {
                  var10 = (65536 - var8) * var6 + var8 * var7 >> 16;
                  var11 = 256 - var10;
               }

               if (var5 != var4) {
                  var12 = (var17 * (var5 & 16711935) + var16 * (var4 & 16711935) & -16711936) + (var17 * (var5 & '\uff00') + var16 * (var4 & '\uff00') & 16711680) >>> 8;
               }
            }

            var14 += var13;
         }

      }
   }

   @ObfuscatedName("dd")
   public static void method5729(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = var5 == var4 && var7 == var6 ? -1 : 65536 / var3;
         int var10 = var6;
         int var11 = 256 - var6;
         if (var0 < field3765) {
            var2 -= field3765 - var0;
            var0 = field3765;
         }

         if (var1 < field3763) {
            var8 += (field3763 - var1) * var9;
            var3 -= field3763 - var1;
            var1 = field3763;
         }

         if (var0 + var2 > field3760) {
            var2 = field3760 - var0;
         }

         if (var3 + var1 > field3764) {
            var3 = field3764 - var1;
         }

         int var12 = var4 >> 16;
         int var13 = (var4 & '\uff00') >> 8;
         int var14 = var4 & 255;
         int var18 = field3761 - var2;
         int var19 = var0 + field3761 * var1;

         for(int var20 = 0; var20 < var3; ++var20) {
            int var21;
            int var22;
            int var23;
            for(var21 = -var2; var21 < 0; ++var21) {
               var22 = field3766[var19];
               var23 = var22 >> 16;
               int var24 = (var22 & '\uff00') >> 8;
               int var25 = var22 & 255;
               int var15;
               int var16;
               int var17;
               if (var11 == 0) {
                  var15 = var23 < 127 ? var12 * var23 >> 7 : 255 - ((255 - var12) * (255 - var23) >> 7);
                  var16 = var24 < 127 ? var13 * var24 >> 7 : 255 - ((255 - var13) * (255 - var24) >> 7);
                  var17 = var25 < 127 ? var14 * var25 >> 7 : 255 - ((255 - var14) * (255 - var25) >> 7);
               } else {
                  var15 = var23 < 127 ? var23 * var11 + (var12 * var23 * var10 >> 7) >> 8 : var10 * (255 - ((255 - var12) * (255 - var23) >> 7)) + var23 * var11 >> 8;
                  var16 = var24 < 127 ? var24 * var11 + (var13 * var24 * var10 >> 7) >> 8 : var10 * (255 - ((255 - var13) * (255 - var24) >> 7)) + var24 * var11 >> 8;
                  var17 = var25 < 127 ? var25 * var11 + (var14 * var25 * var10 >> 7) >> 8 : var10 * (255 - ((255 - var14) * (255 - var25) >> 7)) + var25 * var11 >> 8;
               }

               field3766[var19++] = var17 + (var16 << 8) + (var15 << 16);
            }

            if (var9 > 0) {
               var8 += var9;
               var21 = 65536 - var8 >> 8;
               var22 = var8 >> 8;
               if (var7 != var6) {
                  var10 = (65536 - var8) * var6 + var8 * var7 >> 16;
                  var11 = 256 - var10;
               }

               if (var5 != var4) {
                  var23 = (var22 * (var5 & 16711935) + var21 * (var4 & 16711935) & -16711936) + (var22 * (var5 & '\uff00') + var21 * (var4 & '\uff00') & 16711680) >>> 8;
                  var12 = var23 >> 16;
                  var13 = (var23 & '\uff00') >> 8;
                  var14 = var23 & 255;
               }
            }

            var19 += var18;
         }

      }
   }

   @ObfuscatedName("dc")
   public static void method5739(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         int var10 = var6;
         int var11 = 256 - var6;
         if (var0 < field3765) {
            var2 -= field3765 - var0;
            var0 = field3765;
         }

         if (var1 < field3763) {
            var8 += (field3763 - var1) * var9;
            var3 -= field3763 - var1;
            var1 = field3763;
         }

         if (var0 + var2 > field3760) {
            var2 = field3760 - var0;
         }

         if (var3 + var1 > field3764) {
            var3 = field3764 - var1;
         }

         int var12 = var4 & 16711680;
         int var13 = var4 & '\uff00';
         int var14 = var4 & 255;
         int var15 = var12 * var6 >> 8;
         int var16 = var13 * var6 >> 8;
         int var17 = var14 * var6 >> 8;
         int var18 = field3761 - var2;
         int var19 = var0 + field3761 * var1;

         for(int var20 = 0; var20 < var3; ++var20) {
            int var21;
            int var22;
            int var23;
            for(var21 = -var2; var21 < 0; ++var21) {
               var22 = field3766[var19];
               var23 = var22 & 16711680;
               int var24 = var23 <= var12 ? var23 : (var11 == 0 ? var12 : var15 + (var23 * var11 >> 8) & 16711680);
               int var25 = var22 & '\uff00';
               int var26 = var25 <= var13 ? var25 : (var11 == 0 ? var13 : var16 + (var25 * var11 >> 8) & '\uff00');
               int var27 = var22 & 255;
               int var28 = var27 <= var14 ? var27 : (var11 == 0 ? var14 : var17 + (var27 * var11 >> 8));
               field3766[var19++] = var24 + var26 + var28;
            }

            if (var9 > 0) {
               var8 += var9;
               var21 = 65536 - var8 >> 8;
               var22 = var8 >> 8;
               if (var7 != var6) {
                  var10 = (65536 - var8) * var6 + var8 * var7 >> 16;
                  var11 = 256 - var10;
               }

               if (var5 != var4) {
                  var23 = (var22 * (var5 & 16711935) + var21 * (var4 & 16711935) & -16711936) + (var22 * (var5 & '\uff00') + var21 * (var4 & '\uff00') & 16711680) >>> 8;
                  var12 = var23 & 16711680;
                  var13 = var23 & '\uff00';
                  var14 = var23 & 255;
                  var15 = var12 * var10 >> 8;
                  var16 = var13 * var10 >> 8;
                  var17 = var14 * var10 >> 8;
               }
            }

            var19 += var18;
         }

      }
   }

   @ObfuscatedName("ds")
   public static void method5726(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var3 > 0 && var2 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         int var10 = var6;
         int var11 = 256 - var6;
         if (var0 < field3765) {
            var2 -= field3765 - var0;
            var0 = field3765;
         }

         if (var1 < field3763) {
            var8 += (field3763 - var1) * var9;
            var3 -= field3763 - var1;
            var1 = field3763;
         }

         if (var0 + var2 > field3760) {
            var2 = field3760 - var0;
         }

         if (var3 + var1 > field3764) {
            var3 = field3764 - var1;
         }

         int var12 = var4 & 16711680;
         int var13 = var4 & '\uff00';
         int var14 = var4 & 255;
         int var15 = var12 * var6 >> 8;
         int var16 = var13 * var6 >> 8;
         int var17 = var14 * var6 >> 8;
         int var18 = field3761 - var2;
         int var19 = var0 + field3761 * var1;

         for(int var20 = 0; var20 < var3; ++var20) {
            int var21;
            int var22;
            int var23;
            for(var21 = -var2; var21 < 0; ++var21) {
               var22 = field3766[var19];
               var23 = var22 & 16711680;
               int var24 = var23 >= var12 ? var23 : (var11 == 0 ? var12 : var15 + (var23 * var11 >> 8) & 16711680);
               int var25 = var22 & '\uff00';
               int var26 = var25 >= var13 ? var25 : (var11 == 0 ? var13 : var16 + (var25 * var11 >> 8) & '\uff00');
               int var27 = var22 & 255;
               int var28 = var27 >= var14 ? var27 : (var11 == 0 ? var14 : var17 + (var27 * var11 >> 8));
               field3766[var19++] = var24 + var26 + var28;
            }

            if (var9 > 0) {
               var8 += var9;
               var21 = 65536 - var8 >> 8;
               var22 = var8 >> 8;
               if (var7 != var6) {
                  var10 = (65536 - var8) * var6 + var8 * var7 >> 16;
                  var11 = 256 - var10;
               }

               if (var5 != var4) {
                  var23 = (var22 * (var5 & 16711935) + var21 * (var4 & 16711935) & -16711936) + (var22 * (var5 & '\uff00') + var21 * (var4 & '\uff00') & 16711680) >>> 8;
                  var12 = var23 & 16711680;
                  var13 = var23 & '\uff00';
                  var14 = var23 & 255;
                  var15 = var12 * var10 >> 8;
                  var16 = var13 * var10 >> 8;
                  var17 = var14 * var10 >> 8;
               }
            }

            var19 += var18;
         }

      }
   }

   @ObfuscatedName("dw")
   public static void method5748(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if (var0 < field3765) {
            var2 -= field3765 - var0;
            var0 = field3765;
         }

         if (var1 < field3763) {
            var6 += (field3763 - var1) * var7;
            var3 -= field3763 - var1;
            var1 = field3763;
         }

         if (var0 + var2 > field3760) {
            var2 = field3760 - var0;
         }

         if (var3 + var1 > field3764) {
            var3 = field3764 - var1;
         }

         int var8 = field3761 - var2;
         int var9 = var0 + field3761 * var1;

         for(int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = (var12 * (var5 & 16711935) + var11 * (var4 & 16711935) & -16711936) + (var12 * (var5 & '\uff00') + var11 * (var4 & '\uff00') & 16711680) >>> 8;

            for(int var14 = -var2; var14 < 0; ++var14) {
               field3766[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }

      }
   }

   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      signature = "(IIIIII[BIZ)V",
      garbageValue = "1"
   )
   public static void method5733(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7) {
      if (var0 + var2 >= 0 && var3 + var1 >= 0) {
         if (var0 < field3761 && var1 < field3762) {
            int var8 = 0;
            int var9 = 0;
            if (var0 < 0) {
               var8 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var9 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > field3761) {
               var2 = field3761 - var0;
            }

            if (var3 + var1 > field3762) {
               var3 = field3762 - var1;
            }

            int var10 = var6.length / var7;
            int var11 = field3761 - var2;
            int var12 = var4 >>> 24;
            int var13 = var5 >>> 24;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            if (var12 == 255 && var13 == 255) {
               var14 = var0 + var8 + (var9 + var1) * field3761;

               for(var15 = var9 + var1; var15 < var3 + var9 + var1; ++var15) {
                  for(var16 = var0 + var8; var16 < var0 + var8 + var2; ++var16) {
                     var17 = (var15 - var1) % var10;
                     var18 = (var16 - var0) % var7;
                     if (var6[var18 + var17 * var7] != 0) {
                        field3766[var14++] = var5;
                     } else {
                        field3766[var14++] = var4;
                     }
                  }

                  var14 += var11;
               }
            } else {
               var14 = var0 + var8 + (var9 + var1) * field3761;

               for(var15 = var9 + var1; var15 < var3 + var9 + var1; ++var15) {
                  for(var16 = var0 + var8; var16 < var0 + var8 + var2; ++var16) {
                     var17 = (var15 - var1) % var10;
                     var18 = (var16 - var0) % var7;
                     int var19 = var4;
                     if (var6[var18 + var17 * var7] != 0) {
                        var19 = var5;
                     }

                     int var20 = var19 >>> 24;
                     int var21 = 255 - var20;
                     int var22 = field3766[var14];
                     int var23 = ((var19 & 16711935) * var20 + (var22 & 16711935) * var21 & -16711936) + (var20 * (var19 & '\uff00') + var21 * (var22 & '\uff00') & 16711680) >> 8;
                     field3766[var14++] = var23;
                  }

                  var14 += var11;
               }
            }

         }
      }
   }

   @ObfuscatedName("di")
   public static void method5734(int var0, int var1, int var2, int var3, int var4) {
      method5736(var0, var1, var2, var4);
      method5736(var0, var3 + var1 - 1, var2, var4);
      method5738(var0, var1, var3, var4);
      method5738(var0 + var2 - 1, var1, var3, var4);
   }

   @ObfuscatedName("dt")
   public static void method5741(int var0, int var1, int var2, int var3, int var4, int var5) {
      method5785(var0, var1, var2, var4, var5);
      method5785(var0, var3 + var1 - 1, var2, var4, var5);
      if (var3 >= 3) {
         method5752(var0, var1 + 1, var3 - 2, var4, var5);
         method5752(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   @ObfuscatedName("dm")
   public static void method5736(int var0, int var1, int var2, int var3) {
      if (var1 >= field3763 && var1 < field3764) {
         if (var0 < field3765) {
            var2 -= field3765 - var0;
            var0 = field3765;
         }

         if (var0 + var2 > field3760) {
            var2 = field3760 - var0;
         }

         int var4 = var0 + field3761 * var1;

         for(int var5 = 0; var5 < var2; ++var5) {
            field3766[var4 + var5] = var3;
         }

      }
   }

   @ObfuscatedName("dk")
   static void method5785(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= field3763 && var1 < field3764) {
         if (var0 < field3765) {
            var2 -= field3765 - var0;
            var0 = field3765;
         }

         if (var0 + var2 > field3760) {
            var2 = field3760 - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = var4 * (var3 & 255);
         int var12 = var0 + field3761 * var1;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = var5 * (field3766[var12] >> 16 & 255);
            int var10 = (field3766[var12] >> 8 & 255) * var5;
            int var11 = var5 * (field3766[var12] & 255);
            int var14 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
            field3766[var12++] = var14;
         }

      }
   }

   @ObfuscatedName("df")
   public static void method5738(int var0, int var1, int var2, int var3) {
      if (var0 >= field3765 && var0 < field3760) {
         if (var1 < field3763) {
            var2 -= field3763 - var1;
            var1 = field3763;
         }

         if (var2 + var1 > field3764) {
            var2 = field3764 - var1;
         }

         int var4 = var0 + field3761 * var1;

         for(int var5 = 0; var5 < var2; ++var5) {
            field3766[var4 + var5 * field3761] = var3;
         }

      }
   }

   @ObfuscatedName("dr")
   static void method5752(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= field3765 && var0 < field3760) {
         if (var1 < field3763) {
            var2 -= field3763 - var1;
            var1 = field3763;
         }

         if (var2 + var1 > field3764) {
            var2 = field3764 - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = var4 * (var3 & 255);
         int var12 = var0 + field3761 * var1;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = var5 * (field3766[var12] >> 16 & 255);
            int var10 = (field3766[var12] >> 8 & 255) * var5;
            int var11 = var5 * (field3766[var12] & 255);
            int var14 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
            field3766[var12] = var14;
            var12 += field3761;
         }

      }
   }

   @ObfuscatedName("dj")
   public static void method5765(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            method5736(var0, var1, var2 + 1, var4);
         } else {
            method5736(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if (var2 == 0) {
         if (var3 >= 0) {
            method5738(var0, var1, var3 + 1, var4);
         } else {
            method5738(var0, var3 + var1, -var3 + 1, var4);
         }

      } else {
         if (var3 + var2 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if (var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
            var2 += var0;
            if (var0 < field3765) {
               var1 += var5 * (field3765 - var0);
               var0 = field3765;
            }

            if (var2 >= field3760) {
               var2 = field3760 - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if (var6 >= field3763 && var6 < field3764) {
                  field3766[var0 + var6 * field3761] = var4;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += 32768;
            var2 <<= 16;
            var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
            var3 += var1;
            if (var1 < field3763) {
               var0 += (field3763 - var1) * var5;
               var1 = field3763;
            }

            if (var3 >= field3764) {
               var3 = field3764 - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if (var6 >= field3765 && var6 < field3760) {
                  field3766[var6 + field3761 * var1] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   @ObfuscatedName("ew")
   static void method5730(int var0, int var1, int var2) {
      if (var0 >= field3765 && var1 >= field3763 && var0 < field3760 && var1 < field3764) {
         field3766[var0 + field3761 * var1] = var2;
      }
   }

   @ObfuscatedName("es")
   public static void method5742(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + field3761 * var1;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            field3766[var6++] = var2;
         }

         var5 += field3761;
      }

   }
}
