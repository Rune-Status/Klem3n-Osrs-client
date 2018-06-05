package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class Class40 implements Class89 {
   @ObfuscatedName("aw")
   static int[] field357;
   @ObfuscatedName("ki")
   @ObfuscatedGetter(
      intValue = 172478671
   )
   static int field361;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)Lcx;",
      garbageValue = "39"
   )
   public Class95 vmethod2052() {
      return new Class44();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   static void method695() {
      Class50.field442 = 99;
      Class50.field445 = new byte[4][104][104];
      Class165.field2033 = new byte[4][104][104];
      Class50.field446 = new byte[4][104][104];
      Class19.field159 = new byte[4][104][104];
      Class37.field325 = new int[4][105][105];
      Class50.field447 = new byte[4][105][105];
      Class50.field448 = new int[105][105];
      Class50.field454 = new int[104];
      Class305.field3725 = new int[104];
      Class72.field1035 = new int[104];
      Class263.field3325 = new int[104];
      Class243.field3137 = new int[104];
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IILfw;Lfk;I)Z",
      garbageValue = "-1332801903"
   )
   static final boolean method693(int var0, int var1, Class166 var2, Class164 var3) {
      int var4 = var0;
      int var5 = var1;
      byte var6 = 64;
      byte var7 = 64;
      int var8 = var0 - var6;
      int var9 = var1 - var7;
      Class165.field2035[var6][var7] = 99;
      Class165.field2041[var6][var7] = 0;
      byte var10 = 0;
      int var11 = 0;
      Class165.field2039[var10] = var0;
      byte var10001 = var10;
      int var18 = var10 + 1;
      Class165.field2038[var10001] = var1;
      int[][] var12 = var3.field2029;

      while(var11 != var18) {
         var4 = Class165.field2039[var11];
         var5 = Class165.field2038[var11];
         var11 = var11 + 1 & 4095;
         int var16 = var4 - var8;
         int var17 = var5 - var9;
         int var13 = var4 - var3.field2025;
         int var14 = var5 - var3.field2026;
         if (var2.vmethod3440(2, var4, var5, var3)) {
            Class19.field152 = var4;
            Class165.field2037 = var5;
            return true;
         }

         int var15 = Class165.field2041[var16][var17] + 1;
         if (var16 > 0 && Class165.field2035[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) {
            Class165.field2039[var18] = var4 - 1;
            Class165.field2038[var18] = var5;
            var18 = var18 + 1 & 4095;
            Class165.field2035[var16 - 1][var17] = 2;
            Class165.field2041[var16 - 1][var17] = var15;
         }

         if (var16 < 126 && Class165.field2035[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) {
            Class165.field2039[var18] = var4 + 1;
            Class165.field2038[var18] = var5;
            var18 = var18 + 1 & 4095;
            Class165.field2035[var16 + 1][var17] = 8;
            Class165.field2041[var16 + 1][var17] = var15;
         }

         if (var17 > 0 && Class165.field2035[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) {
            Class165.field2039[var18] = var4;
            Class165.field2038[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            Class165.field2035[var16][var17 - 1] = 1;
            Class165.field2041[var16][var17 - 1] = var15;
         }

         if (var17 < 126 && Class165.field2035[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) {
            Class165.field2039[var18] = var4;
            Class165.field2038[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            Class165.field2035[var16][var17 + 1] = 4;
            Class165.field2041[var16][var17 + 1] = var15;
         }

         if (var16 > 0 && var17 > 0 && Class165.field2035[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) {
            Class165.field2039[var18] = var4 - 1;
            Class165.field2038[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            Class165.field2035[var16 - 1][var17 - 1] = 3;
            Class165.field2041[var16 - 1][var17 - 1] = var15;
         }

         if (var16 < 126 && var17 > 0 && Class165.field2035[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) {
            Class165.field2039[var18] = var4 + 1;
            Class165.field2038[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            Class165.field2035[var16 + 1][var17 - 1] = 9;
            Class165.field2041[var16 + 1][var17 - 1] = var15;
         }

         if (var16 > 0 && var17 < 126 && Class165.field2035[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) {
            Class165.field2039[var18] = var4 - 1;
            Class165.field2038[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            Class165.field2035[var16 - 1][var17 + 1] = 6;
            Class165.field2041[var16 - 1][var17 + 1] = var15;
         }

         if (var16 < 126 && var17 < 126 && Class165.field2035[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) {
            Class165.field2039[var18] = var4 + 1;
            Class165.field2038[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            Class165.field2035[var16 + 1][var17 + 1] = 12;
            Class165.field2041[var16 + 1][var17 + 1] = var15;
         }
      }

      Class19.field152 = var4;
      Class165.field2037 = var5;
      return false;
   }

   @ObfuscatedName("kz")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "63"
   )
   static boolean method696() {
      return Client.field747 >= 2;
   }
}
