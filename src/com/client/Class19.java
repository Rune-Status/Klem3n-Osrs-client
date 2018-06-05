package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
public class Class19 {
   @ObfuscatedName("qi")
   @ObfuscatedSignature(
      signature = "Lw;"
   )
   static Class1 field154;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -746355455
   )
   static int field152;
   @ObfuscatedName("k")
   static byte[][][] field159;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -628993611
   )
   final int field158;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 982920549
   )
   final int field155;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 454780769
   )
   final int field157;

   Class19(int var1, int var2, int var3) {
      this.field158 = var1;
      this.field155 = var2;
      this.field157 = var3;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(II)Lew;",
      garbageValue = "-838426399"
   )
   static Class130 method198(int var0) {
      Class130 var1 = (Class130)Class273.field3539.method3989((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         Class247 var3 = Class273.field3536;
         Class247 var4 = Class273.field3537;
         boolean var5 = true;
         int[] var6 = var3.method4668(var0);

         for(int var7 = 0; var7 < var6.length; ++var7) {
            byte[] var8 = var3.method4676(var0, var6[var7]);
            if (var8 == null) {
               var5 = false;
            } else {
               int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
               byte[] var10 = var4.method4676(var9, 0);
               if (var10 == null) {
                  var5 = false;
               }
            }
         }

         Class130 var2;
         if (!var5) {
            var2 = null;
         } else {
            try {
               var2 = new Class130(var3, var4, var0, false);
            } catch (Exception var12) {
               var2 = null;
            }
         }

         if (var2 != null) {
            Class273.field3539.method3983(var2, (long)var0);
         }

         return var2;
      }
   }

   @ObfuscatedName("kx")
   @ObfuscatedSignature(
      signature = "(IIIZI)V",
      garbageValue = "-185686221"
   )
   public static void method197(int var0, int var1, int var2, boolean var3) {
      Class172 var4 = Class26.method433(ClientPackets.field2156, Client.field626.field1218);
      var4.field2257.method3575(var2);
      var4.field2257.method3594(var3 ? Client.field853 : 0);
      var4.field2257.method3583(var1);
      var4.field2257.method3771(var0);
      Client.field626.method1980(var4);
   }
}
