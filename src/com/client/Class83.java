package com.client;
import java.util.HashMap;
import java.util.Map;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class Class83 {
   @ObfuscatedName("z")
   static final Map field1180 = new HashMap();
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   static final Class197 field1181 = new Class197(1024);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhj;"
   )
   static final Class215 field1184 = new Class215();
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 556765175
   )
   static int field1186 = 0;

   @ObfuscatedName("gv")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZI)V",
      garbageValue = "1049390668"
   )
   static final void method1933(String var0, boolean var1) {
      if (Client.field677) {
         byte var2 = 4;
         int var3 = var2 + 6;
         int var4 = var2 + 6;
         int var5 = Class63.field933.method5519(var0, 250);
         int var6 = Class63.field933.method5520(var0, 250) * 13;
         Class314.method5763(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 0);
         Class314.method5734(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2, 16777215);
         Class63.field933.method5526(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
         Class48.method948(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6);
         if (var1) {
            Class163.field2014.vmethod5809(0, 0);
         } else {
            int var7 = var3;
            int var8 = var4;
            int var9 = var5;
            int var10 = var6;

            for(int var11 = 0; var11 < Client.field603; ++var11) {
               if (Client.field641[var11] + Client.field786[var11] > var7 && Client.field786[var11] < var7 + var9 && Client.field789[var11] + Client.field787[var11] > var8 && Client.field787[var11] < var10 + var8) {
                  Client.field788[var11] = true;
               }
            }
         }

      }
   }

   @ObfuscatedName("he")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1621920950"
   )
   static final void method1940() {
      int var0 = Class48.field435;
      int var1 = Class0.field1;
      int var2 = Class135.field1856;
      int var3 = Class151.field1933;
      int var4 = 6116423;
      Class314.method5763(var0, var1, var2, var3, var4);
      Class314.method5763(var0 + 1, var1 + 1, var2 - 2, 16, 0);
      Class314.method5734(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
      Class293.field3660.method5522("Choose Option", var0 + 3, var1 + 14, var4, -1);
      int var5 = Class48.field425;
      int var6 = Class48.field426 * 673804999;

      int var7;
      int var8;
      int var9;
      for(var7 = 0; var7 < Client.field771; ++var7) {
         var8 = var1 + (Client.field771 - 1 - var7) * 15 + 31;
         var9 = 16777215;
         if (var5 > var0 && var5 < var2 + var0 && var6 > var8 - 13 && var6 < var8 + 3) {
            var9 = 16776960;
         }

         Class293.field3660.method5522(Class18.method176(var7), var0 + 3, var8, var9, 0);
      }

      var7 = Class48.field435;
      var8 = Class0.field1;
      var9 = Class135.field1856;
      int var10 = Class151.field1933;

      for(int var11 = 0; var11 < Client.field603; ++var11) {
         if (Client.field641[var11] + Client.field786[var11] > var7 && Client.field786[var11] < var7 + var9 && Client.field789[var11] + Client.field787[var11] > var8 && Client.field787[var11] < var8 + var10) {
            Client.field788[var11] = true;
         }
      }

   }

   @ObfuscatedName("ib")
   @ObfuscatedSignature(
      signature = "([Lhi;II)V",
      garbageValue = "1406653934"
   )
   static final void method1923(Class230[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         Class230 var3 = var0[var2];
         if (var3 != null) {
            if (var3.field2721 == 0) {
               if (var3.field2736 != null) {
                  method1923(var3.field2736, var1);
               }

               Class55 var4 = (Class55)Client.field741.method4020((long)var3.field2691);
               if (var4 != null) {
                  int var5 = var4.field501;
                  if (Class261.method4931(var5)) {
                     method1923(Class42.field366[var5], var1);
                  }
               }
            }

            Class56 var6;
            if (var1 == 0 && var3.field2654 != null) {
               var6 = new Class56();
               var6.field506 = var3;
               var6.field512 = var3.field2654;
               Class68.method1696(var6);
            }

            if (var1 == 1 && var3.field2714 != null) {
               if (var3.field2606 >= 0) {
                  Class230 var7 = Class26.method434(var3.field2691);
                  if (var7 == null || var7.field2736 == null || var3.field2606 >= var7.field2736.length || var3 != var7.field2736[var3.field2606]) {
                     continue;
                  }
               }

               var6 = new Class56();
               var6.field506 = var3;
               var6.field512 = var3.field2714;
               Class68.method1696(var6);
            }
         }
      }

   }
}
