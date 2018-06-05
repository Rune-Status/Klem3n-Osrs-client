package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
public class Class225 {
   @ObfuscatedName("z")
   static int[] field2557 = new int[32];
   @ObfuscatedName("w")
   public static int[] field2559;
   @ObfuscatedName("s")
   public static int[] clientVarps;
   @ObfuscatedName("u")
   static int[] field2562;
   @ObfuscatedName("eo")
   @ObfuscatedSignature(
      signature = "Lee;"
   )
   static Class153 field2556;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field2557[var1] = var0 - 1;
         var0 += var0;
      }

      field2559 = new int[2000];
      clientVarps = new int[2000];
   }
}
