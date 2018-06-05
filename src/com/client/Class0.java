package com.client;
import java.util.Comparator;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
final class Class0 implements Comparator {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static Class247 field2;
   @ObfuscatedName("jx")
   @ObfuscatedGetter(
      intValue = 469420815
   )
   static int field1;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ls;Ls;I)I",
      garbageValue = "-1267869339"
   )
   int method1(Class2 var1, Class2 var2) {
      return var1.field19 < var2.field19 ? -1 : (var2.field19 == var1.field19 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method1((Class2)var1, (Class2)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1721619760"
   )
   public static void method7() {
      Class23.field188.method3999(5);
      Class23.field189.method3999(5);
   }
}
