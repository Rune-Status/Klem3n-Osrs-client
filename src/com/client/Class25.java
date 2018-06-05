package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
public class Class25 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lv;"
   )
   static final Class25 field212 = new Class25(0);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lv;"
   )
   static final Class25 field209 = new Class25(1);
   @ObfuscatedName("c")
   static int[] field215;
   @ObfuscatedName("fn")
   @ObfuscatedSignature(
      signature = "[Lly;"
   )
   static Class317[] field214;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1536539371
   )
   final int field211;

   Class25(int var1) {
      this.field211 = var1;
   }

   @ObfuscatedName("jd")
   @ObfuscatedSignature(
      signature = "(Lhi;I)Z",
      garbageValue = "2065048163"
   )
   static final boolean method426(Class230 var0) {
      int var1 = var0.field2609;
      if (var1 == 205) {
         Client.field627 = 250;
         return true;
      } else {
         int var2;
         int var3;
         if (var1 >= 300 && var1 <= 313) {
            var2 = (var1 - 300) / 2;
            var3 = var1 & 1;
            Client.field841.method4478(var2, var3 == 1);
         }

         if (var1 >= 314 && var1 <= 323) {
            var2 = (var1 - 314) / 2;
            var3 = var1 & 1;
            Client.field841.method4493(var2, var3 == 1);
         }

         if (var1 == 324) {
            Client.field841.method4465(false);
         }

         if (var1 == 325) {
            Client.field841.method4465(true);
         }

         if (var1 == 326) {
            Class172 var4 = Class26.method433(Class169.field2173, Client.field626.field1218);
            Client.field841.method4466(var4.field2257);
            Client.field626.method1980(var4);
            return true;
         } else {
            return false;
         }
      }
   }
}
