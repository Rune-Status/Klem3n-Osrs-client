package com.client;
import java.util.Comparator;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
public class Class308 implements Comparator {
   @ObfuscatedName("z")
   final boolean field3738;

   public Class308(boolean var1) {
      this.field3738 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljx;Ljx;B)I",
      garbageValue = "-98"
   )
   int method5664(Class282 var1, Class282 var2) {
      return this.field3738 ? var1.vmethod5453(var2) : var2.vmethod5453(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method5664((Class282)var1, (Class282)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
