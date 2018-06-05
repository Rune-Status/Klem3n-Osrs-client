package com.client;
import java.util.HashMap;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
public class Class296 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   Class247 field3681;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   Class247 field3679;
   @ObfuscatedName("s")
   HashMap field3680;

   @ObfuscatedSignature(
      signature = "(Lir;Lir;)V"
   )
   public Class296(Class247 var1, Class247 var2) {
      this.field3681 = var1;
      this.field3679 = var2;
      this.field3680 = new HashMap();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "([Lkc;B)Ljava/util/HashMap;",
      garbageValue = "-33"
   )
   public HashMap method5504(Class295[] var1) {
      HashMap var2 = new HashMap();
      Class295[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Class295 var5 = var3[var4];
         if (this.field3680.containsKey(var5)) {
            var2.put(var5, this.field3680.get(var5));
         } else {
            Class247 var7 = this.field3681;
            Class247 var8 = this.field3679;
            String var9 = var5.field3666;
            int var10 = var7.method4642(var9);
            int var11 = var7.method4643(var10, "");
            Class298 var6 = Class58.method1058(var7, var8, var10, var11);
            if (var6 != null) {
               this.field3680.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }
}
