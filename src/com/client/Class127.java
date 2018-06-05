package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
public abstract class Class127 extends Class206 {
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = 762597167
   )
   public int field1781 = 1000;

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Ldc;",
      garbageValue = "2119202332"
   )
   protected Class119 vmethod3067() {
      return null;
   }

   @ObfuscatedName("cx")
   void vmethod3063(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      Class119 var11 = this.vmethod3067();
      if (var11 != null) {
         this.field1781 = var11.field1781;
         var11.vmethod3063(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }

   }
}
