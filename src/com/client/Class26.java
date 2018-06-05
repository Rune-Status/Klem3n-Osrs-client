package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
public class Class26 {
   @ObfuscatedName("bg")
   static String field219;
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      signature = "Lbq;"
   )
   static Class57 field220;
   @ObfuscatedName("dc")
   @ObfuscatedGetter(
      intValue = 1566983967
   )
   static int field223;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lfi;Lgs;I)Lfn;",
      garbageValue = "-1221349687"
   )
   public static Class172 method433(ClientPackets var0, Class190 var1) {
      Class172 var2;
      if (Class172.field2258 == 0) {
         var2 = new Class172();
      } else {
         var2 = Class172.field2256[--Class172.field2258];
      }

      var2.field2254 = var0;
      var2.field2253 = var0.field2177;
      if (var2.field2253 == -1) {
         var2.field2257 = new Class189(260);
      } else if (var2.field2253 == -2) {
         var2.field2257 = new Class189(10000);
      } else if (var2.field2253 <= 18) {
         var2.field2257 = new Class189(20);
      } else if (var2.field2253 <= 98) {
         var2.field2257 = new Class189(100);
      } else {
         var2.field2257 = new Class189(260);
      }

      var2.field2257.method3838(var1);
      var2.field2257.method3819(var2.field2254.field2233);
      var2.field2255 = 0;
      return var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)Lhi;",
      garbageValue = "-49"
   )
   public static Class230 method434(int var0) {
      int var1 = var0 >> 16;
      int var2 = var0 & '\uffff';
      if (Class42.field366[var1] == null || Class42.field366[var1][var2] == null) {
         boolean var3 = Class261.method4931(var1);
         if (!var3) {
            return null;
         }
      }

      return Class42.field366[var1][var2];
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1481626830"
   )
   public static void method427(int var0) {
      Class217.field2460 = 1;
      Class138.field1871 = null;
      Class217.field2461 = -1;
      Class217.field2462 = -1;
      Class309.field3740 = 0;
      Class217.field2463 = false;
      Class6.field37 = var0;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lbb;Lbb;IZB)I",
      garbageValue = "30"
   )
   static int method428(Class65 var0, Class65 var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var4 = var0.field955;
         int var5 = var1.field955;
         if (!var3) {
            if (var4 == -1) {
               var4 = 2001;
            }

            if (var5 == -1) {
               var5 = 2001;
            }
         }

         return var4 - var5;
      } else if (var2 == 2) {
         return var0.field952 - var1.field952;
      } else if (var2 == 3) {
         if (var0.field951.equals("-")) {
            if (var1.field951.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.field951.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.field951.compareTo(var1.field951);
         }
      } else if (var2 == 4) {
         return var0.method1569() ? (var1.method1569() ? 0 : 1) : (var1.method1569() ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method1567() ? (var1.method1567() ? 0 : 1) : (var1.method1567() ? -1 : 0);
      } else if (var2 == 6) {
         return var0.method1568() ? (var1.method1568() ? 0 : 1) : (var1.method1568() ? -1 : 0);
      } else if (var2 == 7) {
         return var0.method1589() ? (var1.method1589() ? 0 : 1) : (var1.method1589() ? -1 : 0);
      } else {
         return var0.field947 - var1.field947;
      }
   }
}
