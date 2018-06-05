package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
public class Class53 extends Class204 {
   @ObfuscatedName("ri")
   @ObfuscatedSignature(
      signature = "Llw;"
   )
   static Class321 field476;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   static Class202 field474 = new Class202(32);
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static Class317 field472;
   @ObfuscatedName("w")
   int[] field477 = new int[]{-1};
   @ObfuscatedName("s")
   int[] field473 = new int[]{0};

   @ObfuscatedName("fa")
   @ObfuscatedSignature(
      signature = "(IZZZB)Lic;",
      garbageValue = "95"
   )
   static Class249 method1009(int var0, boolean var1, boolean var2, boolean var3) {
      Class162 var4 = null;
      if (Class155.field1969 != null) {
         var4 = new Class162(var0, Class155.field1969, Class76.field1068[var0], 1000000);
      }

      return new Class249(var4, Class34.field302, var0, var1, var2, var3);
   }

   @ObfuscatedName("jc")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1595845951"
   )
   static final void method1012() {
      for(int var0 = 0; var0 < Class81.field1167; ++var0) {
         Class60 var1 = Client.field610[Class81.field1159[var0]];
         var1.method1084();
      }

      Class37.method640();
      if (Class14.field94 != null) {
         Class14.field94.method5467();
      }

   }
}
