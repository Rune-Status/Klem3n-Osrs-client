package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
public class Class27 implements Class31 {
   @ObfuscatedName("ql")
   @ObfuscatedSignature(
      signature = "Llg;"
   )
   static Class324 field228;
   @ObfuscatedName("rq")
   static short[] field231;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1816385673
   )
   static int field230;
   @ObfuscatedName("ed")
   @ObfuscatedGetter(
      intValue = 1306481991
   )
   static int field224;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 538244709
   )
   int field226;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -169692371
   )
   int field225;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1674803295
   )
   int field234;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -560747201
   )
   int field227;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -499712717
   )
   int field233;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1093650467
   )
   int field229;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(La;B)V",
      garbageValue = "-105"
   )
   public void vmethod635(Class20 var1) {
      if (var1.field166 > this.field233) {
         var1.field166 = this.field233;
      }

      if (var1.field167 < this.field233) {
         var1.field167 = this.field233;
      }

      if (var1.field168 > this.field229) {
         var1.field168 = this.field229;
      }

      if (var1.field162 < this.field229) {
         var1.field162 = this.field229;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "2090621319"
   )
   public boolean vmethod636(int var1, int var2, int var3) {
      if (var1 >= this.field226 && var1 < this.field226 + this.field225) {
         return var2 >> 6 == this.field234 && var3 >> 6 == this.field227;
      } else {
         return false;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-658565537"
   )
   public boolean vmethod637(int var1, int var2) {
      return var1 >> 6 == this.field233 && var2 >> 6 == this.field229;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIB)[I",
      garbageValue = "56"
   )
   public int[] vmethod638(int var1, int var2, int var3) {
      if (!this.vmethod636(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field233 * 64 - this.field234 * 64 + var2, var3 + (this.field229 * 64 - this.field227 * 64)};
         return var4;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(III)Lha;",
      garbageValue = "2128900046"
   )
   public Class226 vmethod659(int var1, int var2) {
      if (!this.vmethod637(var1, var2)) {
         return null;
      } else {
         int var3 = this.field234 * 64 - this.field233 * 64 + var1;
         int var4 = this.field227 * 64 - this.field229 * 64 + var2;
         return new Class226(this.field226, var3, var4);
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "-40"
   )
   public void vmethod639(Class182 var1) {
      this.field226 = var1.method3544();
      this.field225 = var1.method3544();
      this.field234 = var1.method3550();
      this.field227 = var1.method3550();
      this.field233 = var1.method3550();
      this.field229 = var1.method3550();
      this.method442();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "23"
   )
   void method442() {
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "60"
   )
   public static int method435(int var0) {
      return Class109.method2484(Class120.field1647[var0]);
   }

   @ObfuscatedName("gl")
   @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "585185755"
   )
   static final int method460(int var0, int var1, int var2) {
      int var3 = var0 >> 7;
      int var4 = var1 >> 7;
      if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
         int var5 = var2;
         if (var2 < 3 && (Class50.field443[1][var3][var4] & 2) == 2) {
            var5 = var2 + 1;
         }

         int var6 = var0 & 127;
         int var7 = var1 & 127;
         int var8 = (128 - var6) * Class50.field459[var5][var3][var4] + var6 * Class50.field459[var5][var3 + 1][var4] >> 7;
         int var9 = var6 * Class50.field459[var5][var3 + 1][var4 + 1] + Class50.field459[var5][var3][var4 + 1] * (128 - var6) >> 7;
         return var9 * var7 + var8 * (128 - var7) >> 7;
      } else {
         return 0;
      }
   }
}
