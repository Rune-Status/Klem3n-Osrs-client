package com.client;
import java.net.URL;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
public class Class13 {
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "[Lly;"
   )
   static Class317[] field85;
   @ObfuscatedName("iu")
   @ObfuscatedGetter(
      intValue = -1440413395
   )
   static int field82;
   @ObfuscatedName("kb")
   @ObfuscatedGetter(
      intValue = 1699850059
   )
   static int field84;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1337486339
   )
   int field83;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lha;"
   )
   Class226 field88;

   @ObfuscatedSignature(
      signature = "(ILha;)V"
   )
   Class13(int var1, Class226 var2) {
      this.field83 = var1;
      this.field88 = var2;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lir;Ljava/lang/String;Ljava/lang/String;I)[Lly;",
      garbageValue = "2135043627"
   )
   public static Class317[] method113(Class247 var0, String var1, String var2) {
      int var3 = var0.method4642(var1);
      int var4 = var0.method4643(var3, var2);
      return Class21.method278(var0, var3, var4);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ILjava/lang/String;S)Z",
      garbageValue = "-4835"
   )
   static boolean method112(String var0, int var1, String var2) {
      if (var1 == 0) {
         try {
            if (!Class45.field379.startsWith("win")) {
               throw new Exception();
            } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var4 = 0; var4 < var0.length(); ++var4) {
                  if (var10.indexOf(var0.charAt(var4)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var5) {
            return false;
         }
      } else if (var1 == 1) {
         try {
            Object var3 = Class41.method700(Class45.field378, var2, new Object[]{(new URL(Class45.field378.getCodeBase(), var0)).toString()});
            return var3 != null;
         } catch (Throwable var6) {
            return false;
         }
      } else if (var1 == 2) {
         try {
            Class45.field378.getAppletContext().showDocument(new URL(Class45.field378.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var7) {
            return false;
         }
      } else if (var1 == 3) {
         try {
            Class41.method702(Class45.field378, "loggedout");
         } catch (Throwable var9) {
            ;
         }

         try {
            Class45.field378.getAppletContext().showDocument(new URL(Class45.field378.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(ILce;ZS)I",
      garbageValue = "12509"
   )
   static int method111(int var0, Class84 var1, boolean var2) {
      Class230 var3 = Class26.method434(Class69.field999[--Class69.field1003]);
      if (var0 == 2600) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2626;
         return 1;
      } else if (var0 == 2601) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2663;
         return 1;
      } else if (var0 == 2602) {
         Class69.field1001[++Class55.field497 - 1] = var3.field2667;
         return 1;
      } else if (var0 == 2603) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2628;
         return 1;
      } else if (var0 == 2604) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2629;
         return 1;
      } else if (var0 == 2605) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2704;
         return 1;
      } else if (var0 == 2606) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2656;
         return 1;
      } else if (var0 == 2607) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2658;
         return 1;
      } else if (var0 == 2608) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2657;
         return 1;
      } else if (var0 == 2609) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2636;
         return 1;
      } else if (var0 == 2610) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2608;
         return 1;
      } else if (var0 == 2611) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2630;
         return 1;
      } else if (var0 == 2612) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2631;
         return 1;
      } else if (var0 == 2613) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2701.vmethod5815();
         return 1;
      } else if (var0 == 2614) {
         Class69.field999[++Class69.field1003 - 1] = var3.field2726 ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }
}
