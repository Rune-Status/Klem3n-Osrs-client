package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
public class Class266 extends Class206 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static Class247 field3338;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static Class200 field3342 = new Class200(64);
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "Lid;"
   )
   static Class243 field3346;
   @ObfuscatedName("s")
   public char field3336;
   @ObfuscatedName("l")
   public char field3337;
   @ObfuscatedName("u")
   public String field3340 = "null";
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1596194807
   )
   public int field3341;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 689327517
   )
   public int field3345 = 0;
   @ObfuscatedName("i")
   public int[] field3343;
   @ObfuscatedName("x")
   public int[] field3344;
   @ObfuscatedName("e")
   public String[] field3339;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "2"
   )
   void method4978(Class182 var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.method4979(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;IB)V",
      garbageValue = "1"
   )
   void method4979(Class182 var1, int var2) {
      if (var2 == 1) {
         this.field3336 = (char)var1.readUnsignedByte();
      } else if (var2 == 2) {
         this.field3337 = (char)var1.readUnsignedByte();
      } else if (var2 == 3) {
         this.field3340 = var1.method3738();
      } else if (var2 == 4) {
         this.field3341 = var1.method3671();
      } else {
         int var3;
         if (var2 == 5) {
            this.field3345 = var1.readUnsignedShort();
            this.field3343 = new int[this.field3345];
            this.field3339 = new String[this.field3345];

            for(var3 = 0; var3 < this.field3345; ++var3) {
               this.field3343[var3] = var1.method3671();
               this.field3339[var3] = var1.method3738();
            }
         } else if (var2 == 6) {
            this.field3345 = var1.readUnsignedShort();
            this.field3343 = new int[this.field3345];
            this.field3344 = new int[this.field3345];

            for(var3 = 0; var3 < this.field3345; ++var3) {
               this.field3343[var3] = var1.method3671();
               this.field3344[var3] = var1.method3671();
            }
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-530255352"
   )
   public int method4980() {
      return this.field3345;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(DDIB)[D",
      garbageValue = "2"
   )
   public static double[] method4986(double var0, double var2, int var4) {
      int var5 = var4 * 2 + 1;
      double[] var6 = new double[var5];
      int var7 = -var4;

      for(int var8 = 0; var7 <= var4; ++var8) {
         double var15 = ((double)var7 - var0) / var2;
         double var13 = Math.exp(-var15 * var15 / 2.0D) / Math.sqrt(6.283185307179586D);
         double var11 = var13 / var2;
         var6[var8] = var11;
         ++var7;
      }

      return var6;
   }
}
