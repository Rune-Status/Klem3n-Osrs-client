package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
public class Class277 {
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;B)I",
      garbageValue = "1"
   )
   public static int method5240(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + Class166.method3441(var0.charAt(var3));
      }

      return var2;
   }
}
