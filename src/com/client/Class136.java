package com.client;
import java.net.URL;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class Class136 {
   @ObfuscatedName("fl")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   static Class318 field1862;
   @ObfuscatedName("z")
   final URL field1867;
   @ObfuscatedName("w")
   volatile boolean field1859;
   @ObfuscatedName("s")
   volatile byte[] field1861;

   Class136(URL var1) {
      this.field1867 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "3647"
   )
   public boolean method3117() {
      return this.field1859;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)[B",
      garbageValue = "228107899"
   )
   public byte[] method3116() {
      return this.field1861;
   }
}
