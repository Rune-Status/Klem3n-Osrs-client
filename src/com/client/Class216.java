package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
public class Class216 {
   @ObfuscatedName("z")
   byte[] field2447;
   @ObfuscatedName("w")
   byte[] field2449;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 2049158647
   )
   int field2448;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1438007951
   )
   int field2450;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -2031677397
   )
   int field2446;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1415705735
   )
   int field2451;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1604102077
   )
   int field2453;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -560836309
   )
   int field2452;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 341977341
   )
   int field2454;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgi;IB)V",
      garbageValue = "1"
   )
   static final void method4179(Class189 var0, int var1) {
      int var2 = var0.field2339;
      Class81.field1165 = 0;
      Class177.method3512(var0);

      for(int var3 = 0; var3 < Class81.field1165; ++var3) {
         int var4 = Class81.field1166[var3];
         Class60 var5 = Client.field610[var4];
         int var6 = var0.readUnsignedByte();
         if ((var6 & 128) != 0) {
            var6 += var0.readUnsignedByte() << 8;
         }

         byte var7 = -1;
         if ((var6 & 512) != 0) {
            var7 = var0.readAByte();
         }

         if ((var6 & 8) != 0) {
            var5.field884 = var0.method3738();
            if (var5.field884.charAt(0) == '~') {
               var5.field884 = var5.field884.substring(1);
               Class143.method3172(2, var5.field552.method5447(), var5.field884);
            } else if (var5 == Class138.field1876) {
               Class143.method3172(2, var5.field552.method5447(), var5.field884);
            }

            var5.field885 = false;
            var5.field888 = 0;
            var5.field927 = 0;
            var5.field887 = 150;
         }

         int var8;
         if ((var6 & 2048) != 0) {
            var5.field891 = var0.method3646();
            var8 = var0.readInt();
            var5.field871 = var8 >> 16;
            var5.field911 = (var8 & '\uffff') + Client.field591;
            var5.field876 = 0;
            var5.field910 = 0;
            if (var5.field911 > Client.field591) {
               var5.field876 = -1;
            }

            if (var5.field891 == 65535) {
               var5.field891 = -1;
            }
         }

         if ((var6 & 1024) != 0) {
            for(var8 = 0; var8 < 3; ++var8) {
               var5.field550[var8] = var0.method3738();
            }
         }

         int var9;
         if ((var6 & 32) != 0) {
            var8 = var0.method3646();
            if (var8 == 65535) {
               var8 = -1;
            }

            var9 = var0.method3577();
            Class134.method3102(var5, var8, var9);
         }

         int var11;
         int var12;
         if ((var6 & 64) != 0) {
            var8 = var0.readUShort();
            Class242 var21 = (Class242)Class76.method1803(Class20.method216(), var0.method3577());
            boolean var10 = var0.readReverseUnsignedByte() == 1;
            var11 = var0.readUnsignedByte();
            var12 = var0.field2339;
            if (var5.field552 != null && var5.field546 != null) {
               boolean var13 = false;
               if (var21.field3127 && Class181.field2332.method1630(var5.field552)) {
                  var13 = true;
               }

               if (!var13 && Client.field694 == 0 && !var5.field566) {
                  Class81.field1154.field2339 = 0;
                  var0.method3539(Class81.field1154.payload, 0, var11);
                  Class81.field1154.field2339 = 0;
                  Class182 var15 = Class81.field1154;

                  String var16;
                  int var17;
                  String var19;
                  try {
                     var17 = var15.readSmart();
                     if (var17 > 32767) {
                        var17 = 32767;
                     }

                     byte[] var18 = new byte[var17];
                     var15.field2339 += Class300.field3712.method3480(var15.payload, var15.field2339, var18, 0, var17);
                     var19 = Class78.method1831(var18, 0, var17);
                     var16 = var19;
                  } catch (Exception var27) {
                     var16 = "Cabbage";
                  }

                  var16 = Class299.method5521(Class51.method998(var16));
                  var5.field884 = var16.trim();
                  var5.field888 = var8 >> 8;
                  var5.field927 = var8 & 255;
                  var5.field887 = 150;
                  var5.field885 = var10;
                  var5.field886 = var5 != Class138.field1876 && var21.field3127 && "" != Client.field796 && var16.toLowerCase().indexOf(Client.field796) == -1;
                  if (var21.field3126) {
                     var17 = var10 ? 91 : 1;
                  } else {
                     var17 = var10 ? 90 : 2;
                  }

                  if (var21.field3128 != -1) {
                     int var20 = var21.field3128;
                     var19 = "<img=" + var20 + ">";
                     Class143.method3172(var17, var19 + var5.field552.method5447(), var16);
                  } else {
                     Class143.method3172(var17, var5.field552.method5447(), var16);
                  }
               }
            }

            var0.field2339 = var11 + var12;
         }

         if ((var6 & 4096) != 0) {
            Class81.field1153[var4] = var0.readAByte();
         }

         if ((var6 & 1) != 0) {
            var8 = var0.method3577();
            int var24;
            int var28;
            int var30;
            if (var8 > 0) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var11 = -1;
                  var12 = -1;
                  var30 = -1;
                  var28 = var0.readSmart();
                  if (var28 == 32767) {
                     var28 = var0.readSmart();
                     var12 = var0.readSmart();
                     var11 = var0.readSmart();
                     var30 = var0.readSmart();
                  } else if (var28 != 32766) {
                     var12 = var0.readSmart();
                  } else {
                     var28 = -1;
                  }

                  var24 = var0.readSmart();
                  var5.method1542(var28, var12, var11, var30, Client.field591, var24);
               }
            }

            var9 = var0.readUnsignedByte();
            if (var9 > 0) {
               for(var28 = 0; var28 < var9; ++var28) {
                  var11 = var0.readSmart();
                  var12 = var0.readSmart();
                  if (var12 != 32767) {
                     var30 = var0.readSmart();
                     var24 = var0.method3577();
                     int var25 = var12 > 0 ? var0.readReverseUnsignedByte() : var24;
                     var5.method1543(var11, Client.field591, var12, var30, var24, var25);
                  } else {
                     var5.method1557(var11);
                  }
               }
            }
         }

         if ((var6 & 256) != 0) {
            var5.field913 = var0.method3660();
            var5.field915 = var0.readAByte();
            var5.field916 = var0.method3660();
            var5.field929 = var0.readAByte();
            var5.field917 = var0.readUnsignedShort() + Client.field591;
            var5.field918 = var0.method3646() + Client.field591;
            var5.field919 = var0.method3646();
            if (var5.field571) {
               var5.field913 += var5.field572;
               var5.field915 += var5.field573;
               var5.field916 += var5.field572;
               var5.field929 += var5.field573;
               var5.field909 = 0;
            } else {
               var5.field913 += var5.field922[0];
               var5.field915 += var5.field872[0];
               var5.field916 += var5.field922[0];
               var5.field929 += var5.field872[0];
               var5.field909 = 1;
            }

            var5.field930 = 0;
         }

         if ((var6 & 16) != 0) {
            var5.field897 = var0.readUShort();
            if (var5.field897 == 65535) {
               var5.field897 = -1;
            }
         }

         if ((var6 & 4) != 0) {
            var8 = var0.method3577();
            byte[] var31 = new byte[var8];
            Class182 var26 = new Class182(var31);
            var0.method3539(var31, 0, var8);
            Class81.field1157[var4] = var26;
            var5.method1082(var26);
         }

         if ((var6 & 2) != 0) {
            var5.field920 = var0.readUnsignedShort();
            if (var5.field909 == 0) {
               var5.field926 = var5.field920;
               var5.field920 = -1;
            }
         }

         if (var5.field571) {
            if (var7 == 127) {
               var5.method1103(var5.field572, var5.field573);
            } else {
               byte var29;
               if (var7 != -1) {
                  var29 = var7;
               } else {
                  var29 = Class81.field1153[var4];
               }

               var5.method1106(var5.field572, var5.field573, var29);
            }
         }
      }

      if (var0.field2339 - var2 != var1) {
         throw new RuntimeException(var0.field2339 - var2 + " " + var1);
      }
   }

   @ObfuscatedName("ji")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1403972661"
   )
   static final void method4178(int var0) {
      if (Class261.method4931(var0)) {
         Class230[] var1 = Class42.field366[var0];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            Class230 var3 = var1[var2];
            if (var3 != null) {
               var3.field2728 = 0;
               var3.field2613 = 0;
            }
         }

      }
   }
}
