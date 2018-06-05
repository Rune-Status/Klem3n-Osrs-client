package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
public class Class84 extends Class206 {
   @ObfuscatedName("ps")
   @ObfuscatedGetter(
      intValue = 1528740431
   )
   static int field1197;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static Class200 field1190 = new Class200(128);
   @ObfuscatedName("w")
   int[] field1189;
   @ObfuscatedName("s")
   int[] field1196;
   @ObfuscatedName("l")
   String[] field1191;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1475914653
   )
   int field1192;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1631134769
   )
   int field1193;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 508133827
   )
   int field1188;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 546616217
   )
   int field1195;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "[Lgu;"
   )
   Class197[] field1194;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)[Lgu;",
      garbageValue = "-1761127859"
   )
   Class197[] method1944(int var1) {
      return new Class197[var1];
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "952694011"
   )
   public static void method1955() {
      while(true) {
         Class205 var1 = Class248.field3182;
         Class245 var0;
         synchronized(Class248.field3182) {
            var0 = (Class245)Class248.field3180.method4076();
         }

         if (var0 == null) {
            return;
         }

         var0.field3152.method4746(var0.field3151, (int)var0.field2421, var0.field3149, false);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "-886650438"
   )
   static synchronized byte[] method1943(int var0) {
      return Class183.method3773(var0, false);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(Ldo;I)V",
      garbageValue = "2023211616"
   )
   static final void method1956(Class105 var0) {
      var0.field1385 = false;
      if (var0.field1383 != null) {
         var0.field1383.field1416 = 0;
      }

      for(Class105 var1 = var0.vmethod4382(); var1 != null; var1 = var0.vmethod4389()) {
         method1956(var1);
      }

   }

   @ObfuscatedName("ia")
   @ObfuscatedSignature(
      signature = "(IIIZB)V",
      garbageValue = "26"
   )
   static final void method1946(int var0, int var1, int var2, boolean var3) {
      if (Class261.method4931(var0)) {
         Class304.method5635(Class42.field366[var0], -1, var1, var2, var3);
      }
   }
}
