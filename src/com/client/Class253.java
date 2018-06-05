package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public class Class253 extends Class206 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   static Class247 field3226;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static Class200 field3228 = new Class200(64);
   @ObfuscatedName("ch")
   static boolean field3229;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 690841177
   )
   public int field3227 = 0;

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "884121490"
   )
   void method4799(Class182 var1) {
      while(true) {
         int var2 = var1.method3544();
         if (var2 == 0) {
            return;
         }

         this.method4805(var1, var2);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "646065158"
   )
   void method4805(Class182 var1, int var2) {
      if (var2 == 2) {
         this.field3227 = var1.method3550();
      }

   }

   @ObfuscatedName("hc")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "843953881"
   )
   static final void method4808(int var0, int var1) {
      Class205 var2 = Client.field708[Class13.field82][var0][var1];
      if (var2 == null) {
         Class28.field248.method2877(Class13.field82, var0, var1);
      } else {
         long var3 = -99999999L;
         Class80 var5 = null;

         Class80 var6;
         for(var6 = (Class80)var2.method4098(); var6 != null; var6 = (Class80)var2.method4079()) {
            Class269 var7 = Class111.method2563(var6.field1151);
            long var8 = (long)var7.field3445;
            if (var7.field3444 == 1) {
               var8 *= (long)(var6.field1148 + 1);
            }

            if (var8 > var3) {
               var3 = var8;
               var5 = var6;
            }
         }

         if (var5 == null) {
            Class28.field248.method2877(Class13.field82, var0, var1);
         } else {
            var2.method4074(var5);
            Class80 var12 = null;
            Class80 var11 = null;

            for(var6 = (Class80)var2.method4098(); var6 != null; var6 = (Class80)var2.method4079()) {
               if (var6.field1151 != var5.field1151) {
                  if (var12 == null) {
                     var12 = var6;
                  }

                  if (var12.field1151 != var6.field1151 && var11 == null) {
                     var11 = var6;
                  }
               }
            }

            long var9 = Class76.method1804(var0, var1, 3, false, 0);
            Class28.field248.method2879(Class13.field82, var0, var1, Class27.method460(var0 * 128 + 64, var1 * 128 + 64, Class13.field82), var5, var9, var12, var11);
         }
      }
   }
}
