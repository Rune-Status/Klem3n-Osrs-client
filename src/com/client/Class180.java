package com.client;
import java.nio.ByteBuffer;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class Class180 extends Class186 {
   @ObfuscatedName("z")
   ByteBuffer field2293;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)[B",
      garbageValue = "-44"
   )
   byte[] vmethod3789() {
      byte[] var1 = new byte[this.field2293.capacity()];
      this.field2293.position(0);
      this.field2293.get(var1);
      return var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "339302128"
   )
   void vmethod3792(byte[] var1) {
      this.field2293 = ByteBuffer.allocateDirect(var1.length);
      this.field2293.position(0);
      this.field2293.put(var1);
   }
}
