package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public class Class179 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)Lid;",
      garbageValue = "909001219"
   )
   public static Class243 method3517(int var0) {
      Class243[] var1 = new Class243[]{Class243.field3132, Class243.field3136, Class243.field3131, Class243.field3134};
      Class243[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Class243 var4 = var2[var3];
         if (var0 == var4.field3133) {
            return var4;
         }
      }

      return null;
   }
}
