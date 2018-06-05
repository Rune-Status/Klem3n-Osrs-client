package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public class Class34 extends Class16 {
   @ObfuscatedName("rx")
   @ObfuscatedSignature(
      signature = "Lff;"
   )
   static Class162 field302;
   @ObfuscatedName("ej")
   @ObfuscatedGetter(
      intValue = -1954811163
   )
   static int field301;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 708492455
   )
   int field299;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 890340593
   )
   int field297;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1440084157
   )
   int field298;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -747624987
   )
   int field296;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lgk;Lgk;I)V",
      garbageValue = "-1293834661"
   )
   void method561(Class182 var1, Class182 var2) {
      int var3 = var2.method3544();
      if (var3 != Class25.field209.field211) {
         throw new IllegalStateException("");
      } else {
         super.field120 = var2.method3544();
         super.field121 = var2.method3544();
         super.field127 = var2.method3550();
         super.field117 = var2.method3550();
         this.field299 = var2.method3544();
         this.field297 = var2.method3544();
         super.field118 = var2.method3550();
         super.field119 = var2.method3550();
         this.field298 = var2.method3544();
         this.field296 = var2.method3544();
         super.field121 = Math.min(super.field121, 4);
         super.field125 = new short[1][64][64];
         super.field123 = new short[super.field121][64][64];
         super.field124 = new byte[super.field121][64][64];
         super.field116 = new byte[super.field121][64][64];
         super.field126 = new Class19[super.field121][64][64][];
         var3 = var1.method3544();
         if (var3 != Class24.field204.field205) {
            throw new IllegalStateException("");
         } else {
            int var4 = var1.method3544();
            int var5 = var1.method3544();
            int var6 = var1.method3544();
            int var7 = var1.method3544();
            if (var4 == super.field118 && var5 == super.field119 && var6 == this.field298 && var7 == this.field296) {
               for(int var8 = 0; var8 < 8; ++var8) {
                  for(int var9 = 0; var9 < 8; ++var9) {
                     this.method150(var8 + this.field298 * 8, var9 + this.field296 * 8, var1);
                  }
               }

            } else {
               throw new IllegalStateException("");
            }
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-1697676286"
   )
   boolean method562(int var1, int var2) {
      if (var1 < this.field298 * 8) {
         return false;
      } else if (var2 < this.field296 * 8) {
         return false;
      } else if (var1 >= this.field298 * 8 + 8) {
         return false;
      } else {
         return var2 < this.field296 * 8 + 8;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "1"
   )
   int method584() {
      return this.field299;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(S)I",
      garbageValue = "-552"
   )
   int method564() {
      return this.field297;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "421563863"
   )
   int method565() {
      return this.field298;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2136604695"
   )
   int method563() {
      return this.field296;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof Class34)) {
         return false;
      } else {
         Class34 var2 = (Class34)var1;
         if (var2.field118 == super.field118 && super.field119 == var2.field119) {
            return var2.field298 == this.field298 && var2.field296 == this.field296;
         } else {
            return false;
         }
      }
   }

   public int hashCode() {
      return super.field118 | super.field119 << 8 | this.field298 << 16 | this.field296 << 24;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1158823389"
   )
   static void method586() {
      if (Class78.field1108 && Class78.field1106 != null && Class78.field1106.length() > 0) {
         Class78.field1102 = 1;
      } else {
         Class78.field1102 = 0;
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIIB)I",
      garbageValue = "-10"
   )
   static final int method560(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      return var3;
   }

   @ObfuscatedName("hb")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "995963221"
   )
   static void method585() {
      if (Client.field785) {
         Class230 var0 = Class146.method3191(Class40.field361, Client.field736);
         if (var0 != null && var0.field2698 != null) {
            Class56 var1 = new Class56();
            var1.field506 = var0;
            var1.field512 = var0.field2698;
            Class68.method1696(var1);
         }

         Client.field785 = false;
         Class60.method1114(var0);
      }
   }
}
