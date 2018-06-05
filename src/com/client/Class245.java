package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public class Class245 extends Class204 {
   @ObfuscatedName("pq")
   @ObfuscatedGetter(
      intValue = 117401965
   )
   static int field3154;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 2021384191
   )
   int field3150;
   @ObfuscatedName("w")
   byte[] field3149;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lff;"
   )
   Class162 field3151;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   Class249 field3152;

   @ObfuscatedName("hj")
   @ObfuscatedSignature(
      signature = "(ZLgi;B)V",
      garbageValue = "30"
   )
   static final void method4619(boolean var0, Class189 var1) {
      Client.field701 = 0;
      Client.field624 = 0;
      Class189 var2 = Client.field626.field1219;
      var2.method3823();
      int var3 = var2.method3817(8);
      int var4;
      if (var3 < Client.field622) {
         for(var4 = var3; var4 < Client.field622; ++var4) {
            Client.field702[++Client.field701 - 1] = Client.field639[var4];
         }
      }

      if (var3 > Client.field622) {
         throw new RuntimeException("");
      } else {
         Client.field622 = 0;

         int var5;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         for(var4 = 0; var4 < var3; ++var4) {
            var5 = Client.field639[var4];
            Class72 var6 = Client.field843[var5];
            var7 = var2.method3817(1);
            if (var7 == 0) {
               Client.field639[++Client.field622 - 1] = var5;
               var6.field914 = Client.field591;
            } else {
               var8 = var2.method3817(2);
               if (var8 == 0) {
                  Client.field639[++Client.field622 - 1] = var5;
                  var6.field914 = Client.field591;
                  Client.field666[++Client.field624 - 1] = var5;
               } else if (var8 == 1) {
                  Client.field639[++Client.field622 - 1] = var5;
                  var6.field914 = Client.field591;
                  var9 = var2.method3817(3);
                  var6.method1794(var9, (byte)1);
                  var10 = var2.method3817(1);
                  if (var10 == 1) {
                     Client.field666[++Client.field624 - 1] = var5;
                  }
               } else if (var8 == 2) {
                  Client.field639[++Client.field622 - 1] = var5;
                  var6.field914 = Client.field591;
                  var9 = var2.method3817(3);
                  var6.method1794(var9, (byte)2);
                  var10 = var2.method3817(3);
                  var6.method1794(var10, (byte)2);
                  var11 = var2.method3817(1);
                  if (var11 == 1) {
                     Client.field666[++Client.field624 - 1] = var5;
                  }
               } else if (var8 == 3) {
                  Client.field702[++Client.field701 - 1] = var5;
               }
            }
         }

         Class30.method500(var0, var1);

         int var14;
         for(var14 = 0; var14 < Client.field624; ++var14) {
            var3 = Client.field666[var14];
            Class72 var15 = Client.field843[var3];
            var5 = var1.readUnsignedByte();
            int var16;
            if ((var5 & 4) != 0) {
               var15.field891 = var1.method3646();
               var16 = var1.method3770();
               var15.field871 = var16 >> 16;
               var15.field911 = (var16 & '\uffff') + Client.field591;
               var15.field876 = 0;
               var15.field910 = 0;
               if (var15.field911 > Client.field591) {
                  var15.field876 = -1;
               }

               if (var15.field891 == 65535) {
                  var15.field891 = -1;
               }
            }

            if ((var5 & 1) != 0) {
               var16 = var1.readUShort();
               var7 = var1.readUShort();
               var8 = var15.field931 - (var16 - Class62.field868 - Class62.field868) * 64;
               var9 = var15.field881 - (var7 - Client.field754 - Client.field754) * 64;
               if (var8 != 0 || var9 != 0) {
                  var15.field920 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
               }
            }

            if ((var5 & 64) != 0) {
               var16 = var1.method3577();
               int var12;
               if (var16 > 0) {
                  for(var7 = 0; var7 < var16; ++var7) {
                     var9 = -1;
                     var10 = -1;
                     var11 = -1;
                     var8 = var1.readSmart();
                     if (var8 == 32767) {
                        var8 = var1.readSmart();
                        var10 = var1.readSmart();
                        var9 = var1.readSmart();
                        var11 = var1.readSmart();
                     } else if (var8 != 32766) {
                        var10 = var1.readSmart();
                     } else {
                        var8 = -1;
                     }

                     var12 = var1.readSmart();
                     var15.method1542(var8, var10, var9, var11, Client.field591, var12);
                  }
               }

               var7 = var1.method3577();
               if (var7 > 0) {
                  for(var8 = 0; var8 < var7; ++var8) {
                     var9 = var1.readSmart();
                     var10 = var1.readSmart();
                     if (var10 != 32767) {
                        var11 = var1.readSmart();
                        var12 = var1.method3765();
                        int var13 = var10 > 0 ? var1.method3765() : var12;
                        var15.method1543(var9, Client.field591, var10, var11, var12, var13);
                     } else {
                        var15.method1557(var9);
                     }
                  }
               }
            }

            if ((var5 & 8) != 0) {
               var15.field1037 = Class270.method5157(var1.method3613());
               var15.field874 = var15.field1037.field3497;
               var15.field924 = var15.field1037.field3500;
               var15.field899 = var15.field1037.field3498;
               var15.field880 = var15.field1037.field3495;
               var15.field870 = var15.field1037.field3502;
               var15.field882 = var15.field1037.field3501;
               var15.field893 = var15.field1037.field3519;
               var15.field877 = var15.field1037.field3496;
               var15.field878 = var15.field1037.field3486;
            }

            if ((var5 & 16) != 0) {
               var15.field897 = var1.readUShort();
               if (var15.field897 == 65535) {
                  var15.field897 = -1;
               }
            }

            if ((var5 & 32) != 0) {
               var16 = var1.method3613();
               if (var16 == 65535) {
                  var16 = -1;
               }

               var7 = var1.readUnsignedByte();
               if (var16 == var15.field903 && var16 != -1) {
                  var8 = Class3.method25(var16).field3553;
                  if (var8 == 1) {
                     var15.field904 = 0;
                     var15.field901 = 0;
                     var15.field906 = var7;
                     var15.field907 = 0;
                  }

                  if (var8 == 2) {
                     var15.field907 = 0;
                  }
               } else if (var16 == -1 || var15.field903 == -1 || Class3.method25(var16).field3547 >= Class3.method25(var15.field903).field3547) {
                  var15.field903 = var16;
                  var15.field904 = 0;
                  var15.field901 = 0;
                  var15.field906 = var7;
                  var15.field907 = 0;
                  var15.field930 = var15.field909;
               }
            }

            if ((var5 & 2) != 0) {
               var15.field884 = var1.method3738();
               var15.field887 = 100;
            }
         }

         for(var14 = 0; var14 < Client.field701; ++var14) {
            var3 = Client.field702[var14];
            if (Client.field843[var3].field914 != Client.field591) {
               Client.field843[var3].field1037 = null;
               Client.field843[var3] = null;
            }
         }

         if (var1.field2339 != Client.field626.packetSize) {
            throw new RuntimeException(var1.field2339 + "," + Client.field626.packetSize);
         } else {
            for(var14 = 0; var14 < Client.field622; ++var14) {
               if (Client.field843[Client.field639[var14]] == null) {
                  throw new RuntimeException(var14 + "," + Client.field622);
               }
            }

         }
      }
   }

   @ObfuscatedName("jp")
   @ObfuscatedSignature(
      signature = "([Lhi;II)V",
      garbageValue = "-2000374394"
   )
   static final void method4620(Class230[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         Class230 var3 = var0[var2];
         if (var3 != null && var3.field2605 == var1 && (!var3.field2604 || !Class81.method1885(var3))) {
            if (var3.field2721 == 0) {
               if (!var3.field2604 && Class81.method1885(var3) && var3 != Class143.field1897) {
                  continue;
               }

               method4620(var0, var3.field2691);
               if (var3.field2736 != null) {
                  method4620(var3.field2736, var3.field2691);
               }

               Class55 var4 = (Class55)Client.field741.method4020((long)var3.field2691);
               if (var4 != null) {
                  Class21.method270(var4.field501);
               }
            }

            if (var3.field2721 == 6) {
               int var5;
               if (var3.field2595 != -1 || var3.field2653 != -1) {
                  boolean var7 = Class132.method3097(var3);
                  if (var7) {
                     var5 = var3.field2653;
                  } else {
                     var5 = var3.field2595;
                  }

                  if (var5 != -1) {
                     Class273 var6 = Class3.method25(var5);

                     for(var3.field2613 += Client.field700; var3.field2613 > var6.field3541[var3.field2728]; Class60.method1114(var3)) {
                        var3.field2613 -= var6.field3541[var3.field2728];
                        ++var3.field2728;
                        if (var3.field2728 >= var6.field3540.length) {
                           var3.field2728 -= var6.field3544;
                           if (var3.field2728 < 0 || var3.field2728 >= var6.field3540.length) {
                              var3.field2728 = 0;
                           }
                        }
                     }
                  }
               }

               if (var3.field2732 != 0 && !var3.field2604) {
                  int var8 = var3.field2732 >> 16;
                  var5 = var3.field2732 << 16 >> 16;
                  var8 *= Client.field700;
                  var5 *= Client.field700;
                  var3.field2656 = var8 + var3.field2656 & 2047;
                  var3.field2657 = var5 + var3.field2657 & 2047;
                  Class60.method1114(var3);
               }
            }
         }
      }

   }
}
