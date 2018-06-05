package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class Class172 extends Class204 {
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "[Lfn;"
   )
   static Class172[] field2256 = new Class172[300];
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 2054951839
   )
   static int field2258 = 0;
   @ObfuscatedName("i")
   static int[] field2260;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lfi;"
   )
   Class169 field2254;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 9187127
   )
   int field2253;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgi;"
   )
   public Class189 field2257;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -590159423
   )
   public int field2255;

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1433475815"
   )
   public void method3460() {
      if (field2258 < field2256.length) {
         field2256[++field2258 - 1] = this;
      }
   }

   @ObfuscatedName("z")
   public static String method3457(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; var3 != 0L; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = Class303.field3720[(int)(var6 - var0 * 37L)];
               if (var8 == '_') {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lll;IIII)V",
      garbageValue = "-1222974971"
   )
   static void method3458(Class318 var0, int var1, int var2, int var3) {
      Class23.field188.method3998(var0, Class43.method716(var1, var2, var3), var0.field3791.length * 4);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-101"
   )
   static void method3456() {
      Class83.field1180.clear();
      Class83.field1181.method3951();
      Class83.field1184.method4168();
      Class83.field1186 = 0;
   }
}
