package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public abstract class Class160 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2021286604"
   )
   public abstract void vmethod3330();

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "2142370282"
   )
   public abstract int vmethod3331(int var1, int var2);

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;B)V",
      garbageValue = "-42"
   )
   public static void method3344(Class247 var0) {
      Class253.field3226 = var0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "1518279696"
   )
   static final void method3338(int var0, int var1, int var2) {
      int var3;
      for(var3 = 0; var3 < 8; ++var3) {
         for(int var4 = 0; var4 < 8; ++var4) {
            Class50.field459[var0][var3 + var1][var4 + var2] = 0;
         }
      }

      if (var1 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            Class50.field459[var0][var1][var3 + var2] = Class50.field459[var0][var1 - 1][var3 + var2];
         }
      }

      if (var2 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            Class50.field459[var0][var3 + var1][var2] = Class50.field459[var0][var3 + var1][var2 - 1];
         }
      }

      if (var1 > 0 && Class50.field459[var0][var1 - 1][var2] != 0) {
         Class50.field459[var0][var1][var2] = Class50.field459[var0][var1 - 1][var2];
      } else if (var2 > 0 && Class50.field459[var0][var1][var2 - 1] != 0) {
         Class50.field459[var0][var1][var2] = Class50.field459[var0][var1][var2 - 1];
      } else if (var1 > 0 && var2 > 0 && Class50.field459[var0][var1 - 1][var2 - 1] != 0) {
         Class50.field459[var0][var1][var2] = Class50.field459[var0][var1 - 1][var2 - 1];
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-39289384"
   )
   static int method3341(int var0, Class84 var1, boolean var2) {
      Class230 var3;
      if (var0 == 2700) {
         var3 = Class26.method434(Class69.field999[--Class69.field1003]);
         Class69.field999[++Class69.field1003 - 1] = var3.field2649;
         return 1;
      } else if (var0 == 2701) {
         var3 = Class26.method434(Class69.field999[--Class69.field1003]);
         if (var3.field2649 != -1) {
            Class69.field999[++Class69.field1003 - 1] = var3.field2727;
         } else {
            Class69.field999[++Class69.field1003 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2702) {
         int var5 = Class69.field999[--Class69.field1003];
         Class55 var4 = (Class55)Client.field741.method4020((long)var5);
         if (var4 != null) {
            Class69.field999[++Class69.field1003 - 1] = 1;
         } else {
            Class69.field999[++Class69.field1003 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2706) {
         Class69.field999[++Class69.field1003 - 1] = Client.field683;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("hu")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1653590324"
   )
   static final void method3342() {
      for(Class62 var0 = (Class62)Client.field714.method4098(); var0 != null; var0 = (Class62)Client.field714.method4079()) {
         if (var0.field860 == -1) {
            var0.field855 = 0;
            Class74.method1800(var0);
         } else {
            var0.method4064();
         }
      }

   }
}
