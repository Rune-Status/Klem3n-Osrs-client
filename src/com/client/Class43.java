package com.client;
import javax.imageio.ImageIO;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class Class43 {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   protected static Class160 field368;
   @ObfuscatedName("fy")
   @ObfuscatedSignature(
      signature = "[Lll;"
   )
   static Class318[] field369;

   static {
      ImageIO.setUseCache(false);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIII)J",
      garbageValue = "-1030997020"
   )
   static long method716(int var0, int var1, int var2) {
      return (long)(var2 << 16 | var0 << 8 | var1);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1093362390"
   )
   public static void method715() {
      Class272.field3524.method3984();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Lfu;",
      garbageValue = "1681202713"
   )
   public static Class160 method712() {
      try {
         return new Class149();
      } catch (Throwable var1) {
         return new Class150();
      }
   }

   @ObfuscatedName("gb")
   @ObfuscatedSignature(
      signature = "(IIIIZI)V",
      garbageValue = "2123332164"
   )
   static final void method714(int var0, int var1, int var2, int var3, boolean var4) {
      if (var2 < 1) {
         var2 = 1;
      }

      if (var3 < 1) {
         var3 = 1;
      }

      int var5 = var3 - 334;
      if (var5 < 0) {
         var5 = 0;
      } else if (var5 > 100) {
         var5 = 100;
      }

      int var6 = (Client.field829 - Client.field802) * var5 / 100 + Client.field802;
      int var7 = var3 * var6 * 512 / (var2 * 334);
      int var8;
      int var9;
      short var15;
      if (var7 < Client.field834) {
         var15 = Client.field834;
         var6 = var15 * var2 * 334 / (var3 * 512);
         if (var6 > Client.field833) {
            var6 = Client.field833;
            var8 = var3 * var6 * 512 / (var15 * 334);
            var9 = (var2 - var8) / 2;
            if (var4) {
               Class314.method5719();
               Class314.method5763(var0, var1, var9, var3, -16777216);
               Class314.method5763(var0 + var2 - var9, var1, var9, var3, -16777216);
            }

            var0 += var9;
            var2 -= var9 * 2;
         }
      } else if (var7 > Client.field835) {
         var15 = Client.field835;
         var6 = var15 * var2 * 334 / (var3 * 512);
         if (var6 < Client.field832) {
            var6 = Client.field832;
            var8 = var15 * var2 * 334 / (var6 * 512);
            var9 = (var3 - var8) / 2;
            if (var4) {
               Class314.method5719();
               Class314.method5763(var0, var1, var2, var9, -16777216);
               Class314.method5763(var0, var3 + var1 - var9, var2, var9, -16777216);
            }

            var1 += var9;
            var3 -= var9 * 2;
         }
      }

      var8 = (Client.field831 - Client.field848) * var5 / 100 + Client.field848;
      Client.field840 = var3 * var6 * var8 / 85504 << 1;
      if (var2 != Client.field838 || var3 != Client.field662) {
         int[] var14 = new int[9];

         for(int var10 = 0; var10 < 9; ++var10) {
            int var11 = var10 * 32 + 15 + 128;
            int var12 = var11 * 3 + 600;
            int var13 = Class122.field1681[var11];
            var14[var10] = var12 * var13 >> 16;
         }

         Class125.method2893(var14, 500, 800, var2, var3);
      }

      Client.field762 = var0;
      Client.field837 = var1;
      Client.field838 = var2;
      Client.field662 = var3;
   }

   @ObfuscatedName("ha")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "0"
   )
   static final boolean method713(int var0) {
      if (var0 < 0) {
         return false;
      } else {
         int var1 = Client.field720[var0];
         if (var1 >= 2000) {
            var1 -= 2000;
         }

         return var1 == 1007;
      }
   }
}
