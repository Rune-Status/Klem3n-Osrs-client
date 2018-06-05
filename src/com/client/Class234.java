package com.client;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class Class234 {
   @ObfuscatedName("w")
   public static final boolean[] field2780 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
   @ObfuscatedName("s")
   public static int[] field2779 = new int[99];

   static {
      int var0 = 0;

      for(int var1 = 0; var1 < 99; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var3;
         field2779[var1] = var0 / 4;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1543629382"
   )
   static void method4590() {
      Class78.field1106 = Class78.field1106.trim();
      if (Class78.field1106.length() == 0) {
         Class2.method22("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
      } else {
         long var1 = Client.method1535();
         byte var0;
         if (0L == var1) {
            var0 = 5;
         } else {
            String var4 = Class78.field1106;
            Random var5 = new Random();
            Class182 var6 = new Class182(128);
            Class182 var7 = new Class182(128);
            int[] var8 = new int[]{var5.nextInt(), var5.nextInt(), (int)(var1 >> 32), (int)var1};
            var6.method3532(10);

            int var9;
            for(var9 = 0; var9 < 4; ++var9) {
               var6.method3707(var5.nextInt());
            }

            var6.method3707(var8[0]);
            var6.method3707(var8[1]);
            var6.method3659(var1);
            var6.method3659(0L);

            for(var9 = 0; var9 < 4; ++var9) {
               var6.method3707(var5.nextInt());
            }

            var6.method3571(Class73.field1039, Class73.field1044);
            var7.method3532(10);

            for(var9 = 0; var9 < 3; ++var9) {
               var7.method3707(var5.nextInt());
            }

            var7.method3659(var5.nextLong());
            var7.method3584(var5.nextLong());
            if (Client.field620 != null) {
               var7.method3542(Client.field620, 0, Client.field620.length);
            } else {
               byte[] var10 = new byte[24];

               try {
                  Class155.field1968.method2476(0L);
                  Class155.field1968.method2478(var10);

                  int var11;
                  for(var11 = 0; var11 < 24 && var10[var11] == 0; ++var11) {
                     ;
                  }

                  if (var11 >= 24) {
                     throw new IOException();
                  }
               } catch (Exception var31) {
                  for(int var12 = 0; var12 < 24; ++var12) {
                     var10[var12] = -1;
                  }
               }

               var7.method3542(var10, 0, var10.length);
            }

            var7.method3659(var5.nextLong());
            var7.method3571(Class73.field1039, Class73.field1044);
            var9 = Class316.method5820(var4);
            if (var9 % 8 != 0) {
               var9 += 8 - var9 % 8;
            }

            Class182 var32 = new Class182(var9);
            var32.method3699(var4);
            var32.field2339 = var9;
            var32.method3567(var8);
            Class182 var22 = new Class182(var7.field2339 + var6.field2339 + var32.field2339 + 5);
            var22.method3532(2);
            var22.method3532(var6.field2339);
            var22.method3542(var6.payload, 0, var6.field2339);
            var22.method3532(var7.field2339);
            var22.method3542(var7.payload, 0, var7.field2339);
            var22.method3755(var32.field2339);
            var22.method3542(var32.payload, 0, var32.field2339);
            byte[] var13 = var22.payload;
            int var15 = var13.length;
            StringBuilder var16 = new StringBuilder();

            int var19;
            for(int var17 = 0; var17 < var15 + 0; var17 += 3) {
               int var18 = var13[var17] & 255;
               var16.append(Class304.field3722[var18 >>> 2]);
               if (var17 < var15 - 1) {
                  var19 = var13[var17 + 1] & 255;
                  var16.append(Class304.field3722[(var18 & 3) << 4 | var19 >>> 4]);
                  if (var17 < var15 - 2) {
                     int var20 = var13[var17 + 2] & 255;
                     var16.append(Class304.field3722[(var19 & 15) << 2 | var20 >>> 6]).append(Class304.field3722[var20 & 63]);
                  } else {
                     var16.append(Class304.field3722[(var19 & 15) << 2]).append("=");
                  }
               } else {
                  var16.append(Class304.field3722[(var18 & 3) << 4]).append("==");
               }
            }

            String var14 = var16.toString();
            var14 = var14;

            byte var3;
            try {
               URL var25 = new URL(Class142.method3161("services", false) + "m=accountappeal/login.ws");
               URLConnection var33 = var25.openConnection();
               var33.setDoInput(true);
               var33.setDoOutput(true);
               var33.setConnectTimeout(5000);
               OutputStreamWriter var26 = new OutputStreamWriter(var33.getOutputStream());
               var26.write("data2=" + Class304.method5634(var14) + "&dest=" + Class304.method5634("passwordchoice.ws"));
               var26.flush();
               InputStream var27 = var33.getInputStream();
               var22 = new Class182(new byte[1000]);

               while(true) {
                  var19 = var27.read(var22.payload, var22.field2339, 1000 - var22.field2339);
                  if (var19 == -1) {
                     var26.close();
                     var27.close();
                     String var28 = new String(var22.payload);
                     if (var28.startsWith("OFFLINE")) {
                        var3 = 4;
                     } else if (var28.startsWith("WRONG")) {
                        var3 = 7;
                     } else if (var28.startsWith("RELOAD")) {
                        var3 = 3;
                     } else if (var28.startsWith("Not permitted for social network accounts.")) {
                        var3 = 6;
                     } else {
                        var22.method3553(var8);

                        while(var22.field2339 > 0 && var22.payload[var22.field2339 - 1] == 0) {
                           --var22.field2339;
                        }

                        var28 = new String(var22.payload, 0, var22.field2339);
                        boolean var34;
                        if (var28 == null) {
                           var34 = false;
                        } else {
                           label137: {
                              try {
                                 new URL(var28);
                              } catch (MalformedURLException var29) {
                                 var34 = false;
                                 break label137;
                              }

                              var34 = true;
                           }
                        }

                        if (var34) {
                           Class270.method5156(var28, true, false);
                           var3 = 2;
                        } else {
                           var3 = 5;
                        }
                     }
                     break;
                  }

                  var22.field2339 += var19;
                  if (var22.field2339 >= 1000) {
                     var3 = 5;
                     break;
                  }
               }
            } catch (Throwable var30) {
               var30.printStackTrace();
               var3 = 5;
            }

            var0 = var3;
         }

         switch(var0) {
         case 2:
            Class2.method22(Class237.field3049, Class237.field3050, Class237.field3072);
            Class78.field1081 = 6;
            break;
         case 3:
            Class2.method22("", "Error connecting to server.", "");
            break;
         case 4:
            Class2.method22("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
            break;
         case 5:
            Class2.method22("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
            break;
         case 6:
            Class2.method22("", "Error connecting to server.", "");
            break;
         case 7:
            Class2.method22("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
         }

      }
   }
}
