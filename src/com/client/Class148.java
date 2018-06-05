package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
public class Class148 implements Class147 {
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1540985035
   )
   public static int field1913;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-75"
   )
   static void method3195(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for(int var5 = 0; var5 < 4; ++var5) {
         if (Class65.field946[var5] != var0) {
            var2[var4] = Class65.field946[var5];
            var3[var4] = Class65.field939[var5];
            ++var4;
         }
      }

      Class65.field946 = var2;
      Class65.field939 = var3;
      Class22.method282(Class65.field949, 0, Class65.field949.length - 1, Class65.field946, Class65.field939);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-557133146"
   )
   public static boolean method3196() {
      try {
         if (Class217.field2460 == 2) {
            if (Class177.field2285 == null) {
               Class177.field2285 = Class223.method4415(Class138.field1871, Class217.field2461, Class217.field2462);
               if (Class177.field2285 == null) {
                  return false;
               }
            }

            if (Class80.field1149 == null) {
               Class80.field1149 = new Class98(Class217.field2458, Class217.field2464);
            }

            if (Class217.field2459.method4198(Class177.field2285, Class177.field2284, Class80.field1149, 22050)) {
               Class217.field2459.method4199();
               Class217.field2459.method4236(Class309.field3740);
               Class217.field2459.method4267(Class177.field2285, Class217.field2463);
               Class217.field2460 = 0;
               Class177.field2285 = null;
               Class80.field1149 = null;
               Class138.field1871 = null;
               return true;
            }
         }
      } catch (Exception var1) {
         var1.printStackTrace();
         Class217.field2459.method4202();
         Class217.field2460 = 0;
         Class177.field2285 = null;
         Class80.field1149 = null;
         Class138.field1871 = null;
      }

      return false;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-2017324363"
   )
   public static boolean method3197(int var0) {
      return (var0 >> 31 & 1) != 0;
   }

   @ObfuscatedName("gt")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   static void method3198() {
      if (Class138.field1876.field931 >> 7 == Client.field808 && Class138.field1876.field881 >> 7 == Client.field809) {
         Client.field808 = 0;
      }

   }
}
