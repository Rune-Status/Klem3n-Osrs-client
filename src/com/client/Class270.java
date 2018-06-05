package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
public enum Class270 implements Class188 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Ljd;"
   )
   field3484(1, 0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Ljd;"
   )
   field3479(0, 1),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Ljd;"
   )
   field3481(2, 2);

   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1528745209
   )
   public final int field3482;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1338680937
   )
   final int field3483;

   Class270(int var3, int var4) {
      this.field3482 = var3;
      this.field3483 = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
   )
   public int vmethod5815() {
      return this.field3483;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)Ljq;",
      garbageValue = "1922127141"
   )
   public static Class271 method5157(int var0) {
      Class271 var1 = (Class271)Class271.field3488.method3989((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Class271.field3490.method4625(9, var0);
         var1 = new Class271();
         var1.field3510 = var0;
         if (var2 != null) {
            var1.method5186(new Class182(var2));
         }

         var1.method5159();
         Class271.field3488.method3983(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZZI)V",
      garbageValue = "-1107846037"
   )
   public static void method5156(String var0, boolean var1, boolean var2) {
      Class58.method1053(var0, var1, "openjs", var2);
   }
}
