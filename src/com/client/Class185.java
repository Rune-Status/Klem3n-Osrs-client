package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class Class185 {
   @ObfuscatedName("e")
   static final int[] field2361 = new int[2048];
   @ObfuscatedName("p")
   static final int[] field2362 = new int[2048];
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "Lgk;"
   )
   public static Class182 field2359;
   @ObfuscatedName("h")
   static int[] field2364;

   static {
      double var0 = 0.0030679615757712823D;

      for(int var2 = 0; var2 < 2048; ++var2) {
         field2361[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
         field2362[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "29745"
   )
   public static void method3787() {
      if (Class48.field429 != null) {
         Class48 var0 = Class48.field429;
         synchronized(Class48.field429) {
            Class48.field429 = null;
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(ZZI)I",
      garbageValue = "-249249572"
   )
   public static int method3786(boolean var0, boolean var1) {
      byte var2 = 0;
      int var3 = var2 + Class250.field3198 + Class250.field3211;
      return var3;
   }
}
