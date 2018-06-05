package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
public class Class260 extends Class206 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   static Class247 field3292;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   static Class247 field3290;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 726327701
   )
   public static int field3294;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static Class200 field3291 = new Class200(64);
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   static Class230 field3301;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1006781997
   )
   public int field3293 = -1;
   @ObfuscatedName("q")
   int[] field3299;
   @ObfuscatedName("k")
   short[] field3302;
   @ObfuscatedName("i")
   short[] field3296;
   @ObfuscatedName("x")
   short[] field3297;
   @ObfuscatedName("e")
   short[] field3298;
   @ObfuscatedName("p")
   int[] field3289 = new int[]{-1, -1, -1, -1, -1};
   @ObfuscatedName("b")
   public boolean field3295 = false;

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "-148271753"
   )
   void method4894(Class182 var1) {
      while(true) {
         int var2 = var1.method3544();
         if (var2 == 0) {
            return;
         }

         this.method4909(var1, var2);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-1740935180"
   )
   void method4909(Class182 var1, int var2) {
      if (var2 == 1) {
         this.field3293 = var1.method3544();
      } else {
         int var3;
         int var4;
         if (var2 == 2) {
            var3 = var1.method3544();
            this.field3299 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3299[var4] = var1.method3550();
            }
         } else if (var2 == 3) {
            this.field3295 = true;
         } else if (var2 == 40) {
            var3 = var1.method3544();
            this.field3302 = new short[var3];
            this.field3296 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3302[var4] = (short)var1.method3550();
               this.field3296[var4] = (short)var1.method3550();
            }
         } else if (var2 == 41) {
            var3 = var1.method3544();
            this.field3297 = new short[var3];
            this.field3298 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3297[var4] = (short)var1.method3550();
               this.field3298[var4] = (short)var1.method3550();
            }
         } else if (var2 >= 60 && var2 < 70) {
            this.field3289[var2 - 60] = var1.method3550();
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "2"
   )
   public boolean method4896() {
      if (this.field3299 == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.field3299.length; ++var2) {
            if (!field3290.method4696(this.field3299[var2], 0)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Ldb;",
      garbageValue = "1023847556"
   )
   public Class113 method4897() {
      if (this.field3299 == null) {
         return null;
      } else {
         Class113[] var1 = new Class113[this.field3299.length];

         for(int var2 = 0; var2 < this.field3299.length; ++var2) {
            var1[var2] = Class113.method2568(field3290, this.field3299[var2], 0);
         }

         Class113 var4;
         if (var1.length == 1) {
            var4 = var1[0];
         } else {
            var4 = new Class113(var1, var1.length);
         }

         int var3;
         if (this.field3302 != null) {
            for(var3 = 0; var3 < this.field3302.length; ++var3) {
               var4.method2581(this.field3302[var3], this.field3296[var3]);
            }
         }

         if (this.field3297 != null) {
            for(var3 = 0; var3 < this.field3297.length; ++var3) {
               var4.method2582(this.field3297[var3], this.field3298[var3]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "2062826807"
   )
   public boolean method4905() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if (this.field3289[var2] != -1 && !field3290.method4696(this.field3289[var2], 0)) {
            var1 = false;
         }
      }

      return var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)Ldb;",
      garbageValue = "1278198342"
   )
   public Class113 method4899() {
      Class113[] var1 = new Class113[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (this.field3289[var3] != -1) {
            var1[var2++] = Class113.method2568(field3290, this.field3289[var3], 0);
         }
      }

      Class113 var5 = new Class113(var1, var2);
      int var4;
      if (this.field3302 != null) {
         for(var4 = 0; var4 < this.field3302.length; ++var4) {
            var5.method2581(this.field3302[var4], this.field3296[var4]);
         }
      }

      if (this.field3297 != null) {
         for(var4 = 0; var4 < this.field3297.length; ++var4) {
            var5.method2582(this.field3297[var4], this.field3298[var4]);
         }
      }

      return var5;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "-30984690"
   )
   static int method4908(int var0, int var1, int var2) {
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
}
