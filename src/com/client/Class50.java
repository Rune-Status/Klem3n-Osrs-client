package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public final class Class50 {
   @ObfuscatedName("pt")
   @ObfuscatedGetter(
      intValue = 1434136439
   )
   static int field456;
   @ObfuscatedName("z")
   static int[][][] field459 = new int[4][105][105];
   @ObfuscatedName("w")
   static byte[][][] field443 = new byte[4][104][104];
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -791731349
   )
   static int field442 = 99;
   @ObfuscatedName("l")
   static byte[][][] field445;
   @ObfuscatedName("q")
   static byte[][][] field446;
   @ObfuscatedName("i")
   static byte[][][] field447;
   @ObfuscatedName("x")
   static int[][] field448;
   @ObfuscatedName("e")
   static int[] field454;
   @ObfuscatedName("o")
   static final int[] field450 = new int[]{1, 2, 4, 8};
   @ObfuscatedName("y")
   static final int[] field451 = new int[]{16, 32, 64, 128};
   @ObfuscatedName("a")
   static final int[] field452 = new int[]{1, 0, -1, 0};
   @ObfuscatedName("j")
   static final int[] field453 = new int[]{0, -1, 0, 1};
   @ObfuscatedName("d")
   static final int[] field458 = new int[]{1, -1, -1, 1};
   @ObfuscatedName("h")
   static final int[] field449 = new int[]{-1, -1, 1, 1};
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 129053467
   )
   static int field457 = (int)(Math.random() * 17.0D) - 8;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1275566919
   )
   static int field455 = (int)(Math.random() * 33.0D) - 16;
   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static Class249 field461;

   @ObfuscatedName("fq")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-29"
   )
   static void method965(int var0, int var1) {
      if (Client.field811 != 0 && var0 != -1) {
         Class63.method1554(Class61.field576, var0, 0, Client.field811, false);
         Client.field813 = true;
      }

   }

   @ObfuscatedName("gk")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-16"
   )
   static void method991(int var0) {
      Client.field791 = 0L;
      if (var0 >= 2) {
         Client.field792 = true;
      } else {
         Client.field792 = false;
      }

      int var1 = Client.field792 ? 2 : 1;
      if (var1 == 1) {
         Class182.field2334.method906(765, 503);
      } else {
         Class182.field2334.method906(7680, 2160);
      }

      if (Client.field589 >= 25) {
         Class172 var2 = Class26.method433(Class169.field2215, Client.field626.field1218);
         Class189 var3 = var2.field2257;
         int var4 = Client.field792 ? 2 : 1;
         var3.method3532(var4);
         var2.field2257.method3755(Class82.field1179);
         var2.field2257.method3755(Class243.field3138);
         Client.field626.method1980(var2);
      }

   }

   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
      garbageValue = "-1119730379"
   )
   public static final void method993(String var0, String var1, int var2, int var3, int var4, int var5) {
      Class243.method4612(var0, var1, var2, var3, var4, var5, false);
   }
}
