package com.client;
import java.applet.Applet;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
public class Class45 {
   @ObfuscatedName("z")
   static Applet field378 = null;
   @ObfuscatedName("w")
   static String field379 = "";

   @ObfuscatedName("hl")
   @ObfuscatedSignature(
      signature = "(IIIILjava/lang/String;B)V",
      garbageValue = "66"
   )
   static void method747(int var0, int var1, int var2, int var3, String var4) {
      Class230 var5 = Class146.method3191(var1, var2);
      if (var5 != null) {
         if (var5.field2706 != null) {
            Class56 var6 = new Class56();
            var6.field506 = var5;
            var6.field517 = var0;
            var6.field504 = var4;
            var6.field512 = var5.field2706;
            Class68.method1696(var6);
         }

         boolean var11 = true;
         if (var5.field2609 > 0) {
            var11 = Class25.method426(var5);
         }

         if (var11) {
            int var8 = Class24.method425(var5);
            int var9 = var0 - 1;
            boolean var7 = (var8 >> var9 + 1 & 1) != 0;
            if (var7) {
               Class172 var10;
               if (var0 == 1) {
                  var10 = Class26.method433(ClientPackets.field2149, Client.field626.field1218);
                  var10.field2257.method3707(var1);
                  var10.field2257.method3755(var2);
                  var10.field2257.method3755(var3);
                  Client.field626.method1980(var10);
               }

               if (var0 == 2) {
                  var10 = Class26.method433(ClientPackets.field2141, Client.field626.field1218);
                  var10.field2257.method3707(var1);
                  var10.field2257.method3755(var2);
                  var10.field2257.method3755(var3);
                  Client.field626.method1980(var10);
               }

               if (var0 == 3) {
                  var10 = Class26.method433(ClientPackets.field2155, Client.field626.field1218);
                  var10.field2257.method3707(var1);
                  var10.field2257.method3755(var2);
                  var10.field2257.method3755(var3);
                  Client.field626.method1980(var10);
               }

               if (var0 == 4) {
                  var10 = Class26.method433(ClientPackets.field2144, Client.field626.field1218);
                  var10.field2257.method3707(var1);
                  var10.field2257.method3755(var2);
                  var10.field2257.method3755(var3);
                  Client.field626.method1980(var10);
               }

               if (var0 == 5) {
                  var10 = Class26.method433(ClientPackets.field2213, Client.field626.field1218);
                  var10.field2257.method3707(var1);
                  var10.field2257.method3755(var2);
                  var10.field2257.method3755(var3);
                  Client.field626.method1980(var10);
               }

               if (var0 == 6) {
                  var10 = Class26.method433(ClientPackets.field2231, Client.field626.field1218);
                  var10.field2257.method3707(var1);
                  var10.field2257.method3755(var2);
                  var10.field2257.method3755(var3);
                  Client.field626.method1980(var10);
               }

               if (var0 == 7) {
                  var10 = Class26.method433(ClientPackets.field2160, Client.field626.field1218);
                  var10.field2257.method3707(var1);
                  var10.field2257.method3755(var2);
                  var10.field2257.method3755(var3);
                  Client.field626.method1980(var10);
               }

               if (var0 == 8) {
                  var10 = Class26.method433(ClientPackets.field2226, Client.field626.field1218);
                  var10.field2257.method3707(var1);
                  var10.field2257.method3755(var2);
                  var10.field2257.method3755(var3);
                  Client.field626.method1980(var10);
               }

               if (var0 == 9) {
                  var10 = Class26.method433(ClientPackets.field2138, Client.field626.field1218);
                  var10.field2257.method3707(var1);
                  var10.field2257.method3755(var2);
                  var10.field2257.method3755(var3);
                  Client.field626.method1980(var10);
               }

               if (var0 == 10) {
                  var10 = Class26.method433(ClientPackets.field2180, Client.field626.field1218);
                  var10.field2257.method3707(var1);
                  var10.field2257.method3755(var2);
                  var10.field2257.method3755(var3);
                  Client.field626.method1980(var10);
               }

            }
         }
      }
   }

   @ObfuscatedName("jj")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-65961600"
   )
   static final void method749(int var0) {
      Class295.method5501();
      Class6.method75();
      int var1 = Class63.method1549(var0).field3230;
      if (var1 != 0) {
         int var2 = Class225.clientVarps[var0];
         if (var1 == 1) {
            if (var2 == 1) {
               Class122.method2830(0.9D);
               ((Class111)Class122.field1667).method2544(0.9D);
            }

            if (var2 == 2) {
               Class122.method2830(0.8D);
               ((Class111)Class122.field1667).method2544(0.8D);
            }

            if (var2 == 3) {
               Class122.method2830(0.7D);
               ((Class111)Class122.field1667).method2544(0.7D);
            }

            if (var2 == 4) {
               Class122.method2830(0.6D);
               ((Class111)Class122.field1667).method2544(0.6D);
            }

            Class269.field3429.method3984();
         }

         if (var1 == 3) {
            short var3 = 0;
            if (var2 == 0) {
               var3 = 255;
            }

            if (var2 == 1) {
               var3 = 192;
            }

            if (var2 == 2) {
               var3 = 128;
            }

            if (var2 == 3) {
               var3 = 64;
            }

            if (var2 == 4) {
               var3 = 0;
            }

            if (var3 != Client.field811) {
               if (Client.field811 == 0 && Client.field812 != -1) {
                  Class63.method1554(Class80.field1147, Client.field812, 0, var3, false);
                  Client.field813 = false;
               } else if (var3 == 0) {
                  Class9.method88();
                  Client.field813 = false;
               } else if (Class217.field2460 != 0) {
                  Class309.field3740 = var3;
               } else {
                  Class217.field2459.method4236(var3);
               }

               Client.field811 = var3;
            }
         }

         if (var1 == 4) {
            if (var2 == 0) {
               Client.field814 = 127;
            }

            if (var2 == 1) {
               Client.field814 = 96;
            }

            if (var2 == 2) {
               Client.field814 = 64;
            }

            if (var2 == 3) {
               Client.field814 = 32;
            }

            if (var2 == 4) {
               Client.field814 = 0;
            }
         }

         if (var1 == 5) {
            Client.field715 = var2;
         }

         if (var1 == 6) {
            Client.field742 = var2;
         }

         if (var1 == 9) {
            Client.field743 = var2;
         }

         if (var1 == 10) {
            if (var2 == 0) {
               Client.field815 = 127;
            }

            if (var2 == 1) {
               Client.field815 = 96;
            }

            if (var2 == 2) {
               Client.field815 = 64;
            }

            if (var2 == 3) {
               Client.field815 = 32;
            }

            if (var2 == 4) {
               Client.field815 = 0;
            }
         }

         if (var1 == 17) {
            Client.field748 = var2 & '\uffff';
         }

         Class77[] var4;
         if (var1 == 18) {
            var4 = new Class77[]{Class77.field1080, Class77.field1074, Class77.field1075, Class77.field1076};
            Client.field607 = (Class77)Class76.method1803(var4, var2);
            if (Client.field607 == null) {
               Client.field607 = Class77.field1080;
            }
         }

         if (var1 == 19) {
            if (var2 == -1) {
               Client.field707 = -1;
            } else {
               Client.field707 = var2 & 2047;
            }
         }

         if (var1 == 22) {
            var4 = new Class77[]{Class77.field1080, Class77.field1074, Class77.field1075, Class77.field1076};
            Client.field780 = (Class77)Class76.method1803(var4, var2);
            if (Client.field780 == null) {
               Client.field780 = Class77.field1080;
            }
         }

      }
   }
}
