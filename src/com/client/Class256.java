package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
public class Class256 extends Class206 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   static Class247 field3258;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static Class200 field3257 = new Class200(64);
   @ObfuscatedName("s")
   public boolean field3256 = false;

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "2142685495"
   )
   void method4848(Class182 var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.method4839(var1, var2);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-1677882054"
   )
   void method4839(Class182 var1, int var2) {
      if (var2 == 2) {
         this.field3256 = true;
      }

   }
}
