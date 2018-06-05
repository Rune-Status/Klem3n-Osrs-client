package com.client;
import java.lang.management.GarbageCollectorMXBean;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
public class Class121 {
   @ObfuscatedName("ad")
   static GarbageCollectorMXBean field1660;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -2066832217
   )
   int field1666;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -917159191
   )
   int field1665;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1983063125
   )
   int field1661;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -397804509
   )
   int field1662;

   Class121() {
   }

   @ObfuscatedSignature(
      signature = "(Ldw;)V"
   )
   Class121(Class121 var1) {
      this.field1665 = var1.field1665;
      this.field1661 = var1.field1661;
      this.field1662 = var1.field1662;
      this.field1666 = var1.field1666;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "32"
   )
   static void method2782(int var0) {
      Class53 var1 = (Class53)Class53.field474.method4020((long)var0);
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.field477.length; ++var2) {
            var1.field477[var2] = -1;
            var1.field473[var2] = 0;
         }

      }
   }

   @ObfuscatedName("jv")
   @ObfuscatedSignature(
      signature = "(IIIILll;Lhv;I)V",
      garbageValue = "606939264"
   )
   static final void method2783(int var0, int var1, int var2, int var3, Class318 var4, Class224 var5) {
      int var6 = var3 * var3 + var2 * var2;
      if (var6 > 4225 && var6 < 90000) {
         int var7 = Client.field717 & 2047;
         int var8 = Class122.field1681[var7];
         int var9 = Class122.field1693[var7];
         int var10 = var9 * var2 + var3 * var8 >> 16;
         int var11 = var3 * var9 - var8 * var2 >> 16;
         double var12 = Math.atan2((double)var10, (double)var11);
         int var14 = var5.field2553 / 2 - 25;
         int var15 = (int)(Math.sin(var12) * (double)var14);
         int var16 = (int)(Math.cos(var12) * (double)var14);
         byte var17 = 20;
         Class136.field1862.method5865(var15 + (var0 + var5.field2553 / 2 - var17 / 2), var5.field2549 / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
      } else {
         Class55.method1022(var0, var1, var2, var3, var4, var5);
      }

   }
}
