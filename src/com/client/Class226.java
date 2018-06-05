package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
public class Class226 {
   @ObfuscatedName("fj")
   @ObfuscatedGetter(
      intValue = 1986316761
   )
   static int field2568;
   @ObfuscatedName("gi")
   @ObfuscatedGetter(
      intValue = -1575232807
   )
   static int field2563;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 208134387
   )
   public int field2567;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 44298731
   )
   public int field2564;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -187382705
   )
   public int field2565;

   @ObfuscatedSignature(
      signature = "(Lha;)V"
   )
   public Class226(Class226 var1) {
      this.field2567 = var1.field2567;
      this.field2564 = var1.field2564;
      this.field2565 = var1.field2565;
   }

   public Class226(int var1, int var2, int var3) {
      this.field2567 = var1;
      this.field2564 = var2;
      this.field2565 = var3;
   }

   public Class226() {
      this.field2567 = -1;
   }

   public Class226(int var1) {
      if (var1 == -1) {
         this.field2567 = -1;
      } else {
         this.field2567 = var1 >> 28 & 3;
         this.field2564 = var1 >> 14 & 16383;
         this.field2565 = var1 & 16383;
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "-2113986105"
   )
   public void method4436(int var1, int var2, int var3) {
      this.field2567 = var1;
      this.field2564 = var2;
      this.field2565 = var3;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1904396734"
   )
   public int method4437() {
      return this.field2567 << 28 | this.field2564 << 14 | this.field2565;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lha;I)Z",
      garbageValue = "-1097701365"
   )
   boolean method4439(Class226 var1) {
      if (this.field2567 != var1.field2567) {
         return false;
      } else if (this.field2564 != var1.field2564) {
         return false;
      } else {
         return this.field2565 == var1.field2565;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-1171766630"
   )
   String method4441(String var1) {
      return this.field2567 + var1 + (this.field2564 >> 6) + var1 + (this.field2565 >> 6) + var1 + (this.field2564 & 63) + var1 + (this.field2565 & 63);
   }

   public int hashCode() {
      return this.method4437();
   }

   public String toString() {
      return this.method4441(",");
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof Class226) ? false : this.method4439((Class226)var1);
      }
   }
}
