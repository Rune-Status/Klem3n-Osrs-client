package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
public class Class93 extends Class108 {
   @ObfuscatedName("z")
   public int field1279;
   @ObfuscatedName("w")
   public byte[] field1278;
   @ObfuscatedName("s")
   public int field1277;
   @ObfuscatedName("l")
   int field1280;
   @ObfuscatedName("u")
   public boolean field1281;

   Class93(int var1, byte[] var2, int var3, int var4) {
      this.field1279 = var1;
      this.field1278 = var2;
      this.field1277 = var3;
      this.field1280 = var4;
   }

   Class93(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.field1279 = var1;
      this.field1278 = var2;
      this.field1277 = var3;
      this.field1280 = var4;
      this.field1281 = var5;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lcu;)Lct;"
   )
   public Class93 method2115(Class102 var1) {
      this.field1278 = var1.method2239(this.field1278);
      this.field1279 = var1.method2240(this.field1279);
      if (this.field1277 == this.field1280) {
         this.field1277 = this.field1280 = var1.method2241(this.field1277);
      } else {
         this.field1277 = var1.method2241(this.field1277);
         this.field1280 = var1.method2241(this.field1280);
         if (this.field1277 == this.field1280) {
            --this.field1277;
         }
      }

      return this;
   }
}
