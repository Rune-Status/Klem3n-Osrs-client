package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
public class Class306 {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Lir;III)Z",
      garbageValue = "-1104652703"
   )
   static boolean method5660(Class247 var0, int var1, int var2) {
      byte[] var3 = var0.method4625(var1, var2);
      if (var3 == null) {
         return false;
      } else {
         Class268.method5084(var3);
         return true;
      }
   }
}
