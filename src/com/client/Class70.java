package com.client;
import java.io.File;
import java.io.RandomAccessFile;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
public final class Class70 extends Class127 {
   @ObfuscatedName("qa")
   @ObfuscatedGetter(
      longValue = 6136871153165894453L
   )
   static long field1013;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -904369215
   )
   int field1017;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -975901259
   )
   int field1023;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -975475893
   )
   int field1012;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1389377337
   )
   int field1014;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1930171125
   )
   int field1015;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1202134777
   )
   int field1016;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Ljn;"
   )
   Class273 field1018;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1404768991
   )
   int field1019 = 0;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1843616515
   )
   int field1020 = 0;
   @ObfuscatedName("e")
   boolean field1021 = false;

   Class70(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field1023 = var1;
      this.field1014 = var2;
      this.field1015 = var3;
      this.field1016 = var4;
      this.field1017 = var5;
      this.field1012 = var7 + var6;
      int var8 = Class57.method1035(this.field1023).field3271;
      if (var8 != -1) {
         this.field1021 = false;
         this.field1018 = Class3.method25(var8);
      } else {
         this.field1021 = true;
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-58"
   )
   final void method1771(int var1) {
      if (!this.field1021) {
         this.field1020 += var1;

         while(this.field1020 > this.field1018.field3541[this.field1019]) {
            this.field1020 -= this.field1018.field3541[this.field1019];
            ++this.field1019;
            if (this.field1019 >= this.field1018.field3540.length) {
               this.field1021 = true;
               break;
            }
         }

      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Ldc;",
      garbageValue = "2119202332"
   )
   protected final Class119 vmethod3067() {
      Class258 var1 = Class57.method1035(this.field1023);
      Class119 var2;
      if (!this.field1021) {
         var2 = var1.method4866(this.field1019);
      } else {
         var2 = var1.method4866(-1);
      }

      return var2 == null ? null : var2;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/io/File;ZI)Z",
      garbageValue = "307061840"
   )
   static boolean method1766(File var0, boolean var1) {
      try {
         RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
         int var3 = var2.read();
         var2.seek(0L);
         var2.write(var3);
         var2.seek(0L);
         var2.close();
         if (var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var4) {
         return false;
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(ILce;ZB)I",
      garbageValue = "5"
   )
   static int method1768(int var0, Class84 var1, boolean var2) {
      Class230 var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = Class26.method434(Class69.field999[--Class69.field1003]);
      } else {
         var3 = var2 ? Class276.field3561 : Class260.field3301;
      }

      Class60.method1114(var3);
      if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
         if (var0 == 1201) {
            var3.field2665 = 2;
            var3.field2593 = Class69.field999[--Class69.field1003];
            return 1;
         } else if (var0 == 1202) {
            var3.field2665 = 3;
            var3.field2593 = Class138.field1876.field546.method4483();
            return 1;
         } else {
            return 2;
         }
      } else {
         Class69.field1003 -= 2;
         int var4 = Class69.field999[Class69.field1003];
         int var5 = Class69.field999[Class69.field1003 + 1];
         var3.field2649 = var4;
         var3.field2727 = var5;
         Class269 var6 = Class111.method2563(var4);
         var3.field2656 = var6.field3439;
         var3.field2657 = var6.field3440;
         var3.field2658 = var6.field3474;
         var3.field2592 = var6.field3442;
         var3.field2655 = var6.field3443;
         var3.field2704 = var6.field3438;
         if (var0 == 1205) {
            var3.field2664 = 0;
         } else if (var0 == 1212 | 1 == var6.field3444) {
            var3.field2664 = 1;
         } else {
            var3.field2664 = 2;
         }

         if (var3.field2660 > 0) {
            var3.field2704 = var3.field2704 * 32 / var3.field2660;
         } else if (var3.field2616 > 0) {
            var3.field2704 = var3.field2704 * 32 / var3.field2616;
         }

         return 1;
      }
   }
}
