package com.client;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
public class Class58 extends Class206 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -216410853
   )
   int field540;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 279680387
   )
   int field535;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1058139231
   )
   int field532;
   @ObfuscatedName("l")
   String field531;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lkm;"
   )
   Class291 field534;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lkd;"
   )
   Class289 field539;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lkd;"
   )
   Class289 field536;
   @ObfuscatedName("i")
   String field537;
   @ObfuscatedName("x")
   String field533;

   Class58(int var1, String var2, String var3, String var4) {
      this.field539 = Class289.field3633;
      this.field536 = Class289.field3633;
      int var5 = ++Class83.field1186 - 1;
      this.field540 = var5;
      this.field535 = Client.field591;
      this.field532 = var1;
      this.field531 = var2;
      this.method1044();
      this.field537 = var3;
      this.field533 = var4;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
      garbageValue = "27"
   )
   void method1070(int var1, String var2, String var3, String var4) {
      int var5 = ++Class83.field1186 - 1;
      this.field540 = var5;
      this.field535 = Client.field591;
      this.field532 = var1;
      this.field531 = var2;
      this.method1044();
      this.field537 = var3;
      this.field533 = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1016035319"
   )
   void method1048() {
      this.field539 = Class289.field3633;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1033770680"
   )
   final boolean method1040() {
      if (this.field539 == Class289.field3633) {
         this.method1041();
      }

      return this.field539 == Class289.field3631;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1665152249"
   )
   void method1041() {
      this.field539 = Class181.field2332.field970.method5329(this.field534) ? Class289.field3631 : Class289.field3634;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "725816073"
   )
   void method1042() {
      this.field536 = Class289.field3633;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1678594295"
   )
   final boolean method1043() {
      if (this.field536 == Class289.field3633) {
         this.method1061();
      }

      return this.field536 == Class289.field3631;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2118903561"
   )
   void method1061() {
      this.field536 = Class181.field2332.field975.method5329(this.field534) ? Class289.field3631 : Class289.field3634;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2077717645"
   )
   final void method1044() {
      if (this.field531 != null) {
         this.field534 = new Class291(Class139.method3138(this.field531), Class36.field306);
      } else {
         this.field534 = null;
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;I)V",
      garbageValue = "-1743479306"
   )
   public static void method1069(Class247 var0) {
      Class259.field3283 = var0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lir;Lir;III)Lkj;",
      garbageValue = "-2132588897"
   )
   public static Class298 method1058(Class247 var0, Class247 var1, int var2, int var3) {
      if (!Class306.method5660(var0, var2, var3)) {
         return null;
      } else {
         byte[] var5 = var1.method4625(var2, var3);
         Class298 var4;
         if (var5 == null) {
            var4 = null;
         } else {
            Class298 var6 = new Class298(var5, Class7.field45, Class225.field2562, Class319.field3800, Class319.field3799, Class172.field2260, Class319.field3801);
            Class7.field45 = null;
            Class225.field2562 = null;
            Class319.field3800 = null;
            Class319.field3799 = null;
            Class172.field2260 = null;
            Class319.field3801 = null;
            var4 = var6;
         }

         return var4;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZLjava/lang/String;ZB)V",
      garbageValue = "15"
   )
   static void method1053(String var0, boolean var1, String var2, boolean var3) {
      if (var1) {
         if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var5) {
               ;
            }
         }

         if (Class45.field379.startsWith("win") && !var3) {
            Class128.method3071(var0, 0);
            return;
         }

         if (Class45.field379.startsWith("mac")) {
            Class13.method112(var0, 1, var2);
            return;
         }

         Class128.method3071(var0, 2);
      } else {
         Class128.method3071(var0, 3);
      }

   }

   @ObfuscatedName("gm")
   @ObfuscatedSignature(
      signature = "(Lba;IB)V",
      garbageValue = "-9"
   )
   static final void method1068(Class63 var0, int var1) {
      Class238.method4594(var0.field931, var0.field881, var1);
   }
}
