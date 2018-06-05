package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
public class Class98 {
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 866276291
   )
   static int field1335;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   Class247 field1334;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   Class247 field1331;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   Class202 field1332 = new Class202(256);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   Class202 field1333 = new Class202(256);

   @ObfuscatedSignature(
      signature = "(Lir;Lir;)V"
   )
   public Class98(Class247 var1, Class247 var2) {
      this.field1334 = var1;
      this.field1331 = var2;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II[IB)Lct;",
      garbageValue = "0"
   )
   Class93 method2223(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4;
      Class93 var7 = (Class93)this.field1333.method4020(var5);
      if (var7 != null) {
         return var7;
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         Class91 var8 = Class91.method2071(this.field1334, var1, var2);
         if (var8 == null) {
            return null;
         } else {
            var7 = var8.method2069();
            this.field1333.method4016(var7, var5);
            if (var3 != null) {
               var3[0] -= var7.field1278.length;
            }

            return var7;
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II[II)Lct;",
      garbageValue = "70852076"
   )
   Class93 method2218(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4 ^ 4294967296L;
      Class93 var7 = (Class93)this.field1333.method4020(var5);
      if (var7 != null) {
         return var7;
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         Class92 var8 = (Class92)this.field1332.method4020(var5);
         if (var8 == null) {
            var8 = Class92.method2088(this.field1331, var1, var2);
            if (var8 == null) {
               return null;
            }

            this.field1332.method4016(var8, var5);
         }

         var7 = var8.method2083(var3);
         if (var7 == null) {
            return null;
         } else {
            var8.method4064();
            this.field1333.method4016(var7, var5);
            return var7;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I[II)Lct;",
      garbageValue = "2090805346"
   )
   public Class93 method2216(int var1, int[] var2) {
      if (this.field1334.method4637() == 1) {
         return this.method2223(0, var1, var2);
      } else if (this.field1334.method4636(var1) == 1) {
         return this.method2223(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I[II)Lct;",
      garbageValue = "1187754020"
   )
   public Class93 method2220(int var1, int[] var2) {
      if (this.field1331.method4637() == 1) {
         return this.method2218(0, var1, var2);
      } else if (this.field1331.method4636(var1) == 1) {
         return this.method2218(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }
}
