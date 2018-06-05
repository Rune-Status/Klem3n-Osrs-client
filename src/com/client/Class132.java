package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public final class Class132 {
   @ObfuscatedName("mp")
   @ObfuscatedSignature(
      signature = "[Lhi;"
   )
   static Class230[] field1814;
   @ObfuscatedName("ij")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   static Class230 field1819;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1489724317
   )
   int field1807;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1317247961
   )
   int field1804;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -496376973
   )
   int field1805;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 793292825
   )
   int field1820;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1286710007
   )
   int field1813;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 236157701
   )
   int field1809;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1746982005
   )
   int field1821;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -927006489
   )
   int field1822;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -422885885
   )
   int field1811;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 2060892371
   )
   int field1812;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 2060435561
   )
   int field1808;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1832511085
   )
   int field1806;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -376026905
   )
   int field1815;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1668773103
   )
   int field1816;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1826745175
   )
   int field1817;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1352607471
   )
   int field1818;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -690074873
   )
   int field1803;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -972074235
   )
   int field1810;

   @ObfuscatedName("it")
   @ObfuscatedSignature(
      signature = "(Lhi;I)Z",
      garbageValue = "-2063892769"
   )
   static final boolean method3097(Class230 var0) {
      if (var0.field2719 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < var0.field2719.length; ++var1) {
            int var2 = Class137.method3119(var0, var1);
            int var3 = var0.field2720[var1];
            if (var0.field2719[var1] == 2) {
               if (var2 >= var3) {
                  return false;
               }
            } else if (var0.field2719[var1] == 3) {
               if (var2 <= var3) {
                  return false;
               }
            } else if (var0.field2719[var1] == 4) {
               if (var3 == var2) {
                  return false;
               }
            } else if (var2 != var3) {
               return false;
            }
         }

         return true;
      }
   }

   @ObfuscatedName("ke")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1450282680"
   )
   static void method3096(int var0) {
      Client.field655 = var0;
   }
}
