package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public final class Class190 {
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1238242625
   )
   int field2381;
   @ObfuscatedName("u")
   int[] field2384 = new int[256];
   @ObfuscatedName("q")
   int[] field2386 = new int[256];
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -32911809
   )
   int field2387;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 165032263
   )
   int field2385;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -248497899
   )
   int field2382;

   public Class190(int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.field2384[var2] = var1[var2];
      }

      this.method3861();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1244339201"
   )
   final int method3850() {
      if (0 == --this.field2381 + 1) {
         this.method3852();
         this.field2381 = 255;
      }

      return this.field2384[this.field2381];
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1777636866"
   )
   final int method3853() {
      if (this.field2381 == 0) {
         this.method3852();
         this.field2381 = 256;
      }

      return this.field2384[this.field2381 - 1];
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-544469787"
   )
   final void method3852() {
      this.field2385 += ++this.field2382;

      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.field2386[var1];
         if ((var1 & 2) == 0) {
            if ((var1 & 1) == 0) {
               this.field2387 ^= this.field2387 << 13;
            } else {
               this.field2387 ^= this.field2387 >>> 6;
            }
         } else if ((var1 & 1) == 0) {
            this.field2387 ^= this.field2387 << 2;
         } else {
            this.field2387 ^= this.field2387 >>> 16;
         }

         this.field2387 += this.field2386[128 + var1 & 255];
         int var3;
         this.field2386[var1] = var3 = this.field2386[(var2 & 1020) >> 2] + this.field2385 + this.field2387;
         this.field2384[var1] = this.field2385 = this.field2386[(var3 >> 8 & 1020) >> 2] + var2;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-322691741"
   )
   final void method3861() {
      int var9 = -1640531527;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;
      int var2 = -1640531527;

      int var1;
      for(var1 = 0; var1 < 4; ++var1) {
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.field2384[var1];
         var3 += this.field2384[var1 + 1];
         var4 += this.field2384[var1 + 2];
         var5 += this.field2384[var1 + 3];
         var6 += this.field2384[var1 + 4];
         var7 += this.field2384[var1 + 5];
         var8 += this.field2384[var1 + 6];
         var9 += this.field2384[var1 + 7];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.field2386[var1] = var2;
         this.field2386[var1 + 1] = var3;
         this.field2386[var1 + 2] = var4;
         this.field2386[var1 + 3] = var5;
         this.field2386[var1 + 4] = var6;
         this.field2386[var1 + 5] = var7;
         this.field2386[var1 + 6] = var8;
         this.field2386[var1 + 7] = var9;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.field2386[var1];
         var3 += this.field2386[var1 + 1];
         var4 += this.field2386[var1 + 2];
         var5 += this.field2386[var1 + 3];
         var6 += this.field2386[var1 + 4];
         var7 += this.field2386[var1 + 5];
         var8 += this.field2386[var1 + 6];
         var9 += this.field2386[var1 + 7];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.field2386[var1] = var2;
         this.field2386[var1 + 1] = var3;
         this.field2386[var1 + 2] = var4;
         this.field2386[var1 + 3] = var5;
         this.field2386[var1 + 4] = var6;
         this.field2386[var1 + 5] = var7;
         this.field2386[var1 + 6] = var8;
         this.field2386[var1 + 7] = var9;
      }

      this.method3852();
      this.field2381 = 256;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IS)I",
      garbageValue = "-25401"
   )
   public static int method3865(int var0) {
      return var0 >> 17 & 7;
   }
}
