package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public class Class124 extends Class204 {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "[Lly;"
   )
   static Class317[] field1708;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = -1804049311
   )
   static int field1709;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 28942011
   )
   int field1704;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1349970051
   )
   int field1705;
   @ObfuscatedName("s")
   int[] field1706;
   @ObfuscatedName("l")
   int[][] field1707;

   Class124(int var1, byte[] var2) {
      this.field1704 = var1;
      Class182 var3 = new Class182(var2);
      this.field1705 = var3.readUnsignedByte();
      this.field1706 = new int[this.field1705];
      this.field1707 = new int[this.field1705][];

      int var4;
      for(var4 = 0; var4 < this.field1705; ++var4) {
         this.field1706[var4] = var3.readUnsignedByte();
      }

      for(var4 = 0; var4 < this.field1705; ++var4) {
         this.field1707[var4] = new int[var3.readUnsignedByte()];
      }

      for(var4 = 0; var4 < this.field1705; ++var4) {
         for(int var5 = 0; var5 < this.field1707[var4].length; ++var5) {
            this.field1707[var4][var5] = var3.readUnsignedByte();
         }
      }

   }
}
