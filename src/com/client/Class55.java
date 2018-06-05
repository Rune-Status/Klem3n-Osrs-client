package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
public class Class55 extends Class204 {
   @ObfuscatedName("rz")
   @ObfuscatedGetter(
      intValue = -150808717
   )
   static int field495;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1708585715
   )
   static int field497;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -432145823
   )
   int field501;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1556790455
   )
   int field494;
   @ObfuscatedName("s")
   boolean field496 = false;

   @ObfuscatedName("jn")
   @ObfuscatedSignature(
      signature = "(IIIILll;Lhv;B)V",
      garbageValue = "103"
   )
   static final void method1022(int var0, int var1, int var2, int var3, Class318 var4, Class224 var5) {
      if (var4 != null) {
         int var6 = Client.field717 & 2047;
         int var7 = var3 * var3 + var2 * var2;
         if (var7 <= 6400) {
            int var8 = Class122.field1681[var6];
            int var9 = Class122.field1693[var6];
            int var10 = var3 * var8 + var9 * var2 >> 16;
            int var11 = var3 * var9 - var8 * var2 >> 16;
            if (var7 > 2500) {
               var4.method5867(var10 + var5.field2553 / 2 - var4.field3796 / 2, var5.field2549 / 2 - var11 - var4.field3792 / 2, var0, var1, var5.field2553, var5.field2549, var5.field2551, var5.field2550);
            } else {
               var4.method5851(var0 + var10 + var5.field2553 / 2 - var4.field3796 / 2, var5.field2549 / 2 + var1 - var11 - var4.field3792 / 2);
            }

         }
      }
   }
}
