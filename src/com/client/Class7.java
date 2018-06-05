package com.client;
import java.util.Comparator;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
final class Class7 implements Comparator {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static Class247 field42;
   @ObfuscatedName("l")
   static int[] field45;
   @ObfuscatedName("gs")
   @ObfuscatedGetter(
      intValue = -567041405
   )
   static int field41;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ls;Ls;I)I",
      garbageValue = "-657628450"
   )
   int method76(Class2 var1, Class2 var2) {
      return var1.field20 < var2.field20 ? -1 : (var2.field20 == var1.field20 ? 0 : 1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method76((Class2)var1, (Class2)var2);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IS)Z",
      garbageValue = "24612"
   )
   public static boolean method83(int var0) {
      return (var0 >> 28 & 1) != 0;
   }
}
