package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public final class Class134 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Ldf;"
   )
   public Class127 field1844;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1650174027
   )
   int field1841;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 220137999
   )
   int field1837;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -461194739
   )
   int field1838;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1049351685
   )
   int field1839;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 2137493405
   )
   int field1845;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1953890163
   )
   int field1842;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1165658199
   )
   int field1843;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -902758735
   )
   int field1840;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 949196043
   )
   int field1850;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1947694915
   )
   int field1846;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1135945905
   )
   int field1847;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      longValue = -7950024877031331151L
   )
   public long field1848 = 0L;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -2116359181
   )
   int field1849 = 0;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)Lce;",
      garbageValue = "-10"
   )
   static Class84 method3104(int var0, int var1) {
      Class84 var2 = (Class84)Class84.field1190.method3989((long)(var0 << 16));
      if (var2 != null) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = Client.field854.method4642(var3);
         if (var4 == -1) {
            return null;
         } else {
            byte[] var5 = Client.field854.method4689(var4);
            if (var5 != null) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = Class10.method97(var5);
               if (var2 != null) {
                  Class84.field1190.method3983(var2, (long)(var0 << 16));
                  return var2;
               }
            }

            return null;
         }
      }
   }

   @ObfuscatedName("fb")
   @ObfuscatedSignature(
      signature = "(Lbu;III)V",
      garbageValue = "-1928445443"
   )
   static void method3102(Class60 var0, int var1, int var2) {
      if (var0.field903 == var1 && var1 != -1) {
         int var3 = Class3.method25(var1).field3553;
         if (var3 == 1) {
            var0.field904 = 0;
            var0.field901 = 0;
            var0.field906 = var2;
            var0.field907 = 0;
         }

         if (var3 == 2) {
            var0.field907 = 0;
         }
      } else if (var1 == -1 || var0.field903 == -1 || Class3.method25(var1).field3547 >= Class3.method25(var0.field903).field3547) {
         var0.field903 = var1;
         var0.field904 = 0;
         var0.field901 = 0;
         var0.field906 = var2;
         var0.field907 = 0;
         var0.field930 = var0.field909;
      }

   }

   @ObfuscatedName("ih")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "176398255"
   )
   static final void method3103() {
      boolean var0 = false;

      while(!var0) {
         var0 = true;

         for(int var1 = 0; var1 < Client.field771 - 1; ++var1) {
            if (Client.field720[var1] < 1000 && Client.field720[var1 + 1] > 1000) {
               String var2 = Client.field740[var1];
               Client.field740[var1] = Client.field740[var1 + 1];
               Client.field740[var1 + 1] = var2;
               String var3 = Client.field735[var1];
               Client.field735[var1] = Client.field735[var1 + 1];
               Client.field735[var1 + 1] = var3;
               int var4 = Client.field720[var1];
               Client.field720[var1] = Client.field720[var1 + 1];
               Client.field720[var1 + 1] = var4;
               var4 = Client.field718[var1];
               Client.field718[var1] = Client.field718[var1 + 1];
               Client.field718[var1 + 1] = var4;
               var4 = Client.field851[var1];
               Client.field851[var1] = Client.field851[var1 + 1];
               Client.field851[var1 + 1] = var4;
               var4 = Client.field794[var1];
               Client.field794[var1] = Client.field794[var1 + 1];
               Client.field794[var1 + 1] = var4;
               boolean var5 = Client.field590[var1];
               Client.field590[var1] = Client.field590[var1 + 1];
               Client.field590[var1 + 1] = var5;
               var0 = false;
            }
         }
      }

   }
}
