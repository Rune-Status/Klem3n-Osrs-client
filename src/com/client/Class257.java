package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
public class Class257 extends Class206 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static Class247 field3264;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static Class200 field3260 = new Class200(64);
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1654146755
   )
   static int field3259;
   @ObfuscatedName("s")
   public boolean field3261 = false;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "75"
   )
   void method4852(Class182 var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.method4854(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;IS)V",
      garbageValue = "1000"
   )
   void method4854(Class182 var1, int var2) {
      if (var2 == 2) {
         this.field3261 = true;
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;Lir;I)V",
      garbageValue = "-1839091252"
   )
   public static void method4851(Class247 var0, Class247 var1) {
      Class260.field3292 = var0;
      Class260.field3290 = var1;
      Class260.field3294 = Class260.field3292.method4636(3);
   }
}
