package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public enum Class146 implements Class188 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Let;"
   )
   field1908(3, 0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Let;"
   )
   field1910(1, 1),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Let;"
   )
   field1907(2, 2),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Let;"
   )
   field1905(0, 3);

   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1737035263
   )
   public final int field1909;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -999687567
   )
   final int field1906;

   Class146(int var3, int var4) {
      this.field1909 = var3;
      this.field1906 = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
   )
   public int vmethod5815() {
      return this.field1906;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "5"
   )
   public static int method3193(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(III)Lhi;",
      garbageValue = "-1708513832"
   )
   public static Class230 method3191(int var0, int var1) {
      Class230 var2 = Class26.method434(var0);
      if (var1 == -1) {
         return var2;
      } else {
         return var2 != null && var2.field2736 != null && var1 < var2.field2736.length ? var2.field2736[var1] : null;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgk;IB)V",
      garbageValue = "0"
   )
   public static void method3190(Class182 var0, int var1) {
      if (Class155.field1968 != null) {
         try {
            Class155.field1968.method2476(0L);
            Class155.field1968.method2481(var0.payload, var1, 24);
         } catch (Exception var3) {
            ;
         }
      }

   }
}
