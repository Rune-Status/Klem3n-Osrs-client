package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
public class Class254 extends Class206 {
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 215378471
   )
   public static int field3232;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static Class200 field3231 = new Class200(64);
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -740255657
   )
   public int field3230 = 0;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "531410703"
   )
   void method4809(Class182 var1) {
      while(true) {
         int var2 = var1.method3544();
         if (var2 == 0) {
            return;
         }

         this.method4810(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;IB)V",
      garbageValue = "-13"
   )
   void method4810(Class182 var1, int var2) {
      if (var2 == 5) {
         this.field3230 = var1.method3550();
      }

   }
}
