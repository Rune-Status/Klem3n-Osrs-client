package com.client;
import java.lang.ref.SoftReference;

import com.conf.mapping.ObfuscatedName;

@ObfuscatedName("gf")
public class Class207 extends Class212 {
   @ObfuscatedName("z")
   SoftReference field2429;

   Class207(Object var1, int var2) {
      super(var2);
      this.field2429 = new SoftReference(var1);
   }

   @ObfuscatedName("z")
   Object vmethod4137() {
      return this.field2429.get();
   }

   @ObfuscatedName("w")
   boolean vmethod4136() {
      return true;
   }
}
