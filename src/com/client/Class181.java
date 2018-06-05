package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public final class Class181 {
   @ObfuscatedName("qf")
   @ObfuscatedSignature(
      signature = "Lbc;"
   )
   public static Class67 field2332;
   @ObfuscatedName("z")
   final int field2333 = 4096;
   @ObfuscatedName("w")
   final int field2320 = 16;
   @ObfuscatedName("s")
   final int field2327 = 258;
   @ObfuscatedName("l")
   final int field2300 = 6;
   @ObfuscatedName("u")
   final int field2298 = 50;
   @ObfuscatedName("q")
   final int field2299 = 18002;
   @ObfuscatedName("k")
   byte[] field2294;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -189685229
   )
   int field2326 = 0;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1713666481
   )
   int field2302;
   @ObfuscatedName("e")
   byte[] field2305;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 218244667
   )
   int field2313 = 0;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1013289063
   )
   int field2310;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 2020780463
   )
   int field2295;
   @ObfuscatedName("f")
   byte field2307;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1896627185
   )
   int field2308;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1154279369
   )
   int field2309;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -195550973
   )
   int field2316;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 823456491
   )
   int field2311;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1804401527
   )
   int field2312;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1057581785
   )
   int field2304;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1763458429
   )
   int field2314;
   @ObfuscatedName("j")
   int[] field2315 = new int[256];
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1198980805
   )
   int field2325;
   @ObfuscatedName("h")
   int[] field2317 = new int[257];
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1095083449
   )
   int field2318;
   @ObfuscatedName("af")
   boolean[] field2319 = new boolean[256];
   @ObfuscatedName("ah")
   boolean[] field2296 = new boolean[16];
   @ObfuscatedName("ab")
   byte[] field2321 = new byte[256];
   @ObfuscatedName("aw")
   byte[] field2322 = new byte[4096];
   @ObfuscatedName("ak")
   int[] field2323 = new int[16];
   @ObfuscatedName("as")
   byte[] field2324 = new byte[18002];
   @ObfuscatedName("an")
   byte[] field2328 = new byte[18002];
   @ObfuscatedName("ao")
   byte[][] field2303 = new byte[6][258];
   @ObfuscatedName("at")
   int[][] field2301 = new int[6][258];
   @ObfuscatedName("ai")
   int[][] field2297 = new int[6][258];
   @ObfuscatedName("ac")
   int[][] field2329 = new int[6][258];
   @ObfuscatedName("ap")
   int[] field2330 = new int[6];
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -784898283
   )
   int field2331;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lfy;S)V",
      garbageValue = "-23215"
   )
   public static void method3529(Class174 var0) {
      Class300.field3712 = var0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIILjj;II)V",
      garbageValue = "-596460194"
   )
   static void method3528(int var0, int var1, int var2, Class268 var3, int var4) {
      Class68 var5 = new Class68();
      var5.field981 = var0;
      var5.field988 = var1 * 128;
      var5.field983 = var2 * 128;
      int var6 = var3.field3384;
      int var7 = var3.field3385;
      if (var4 == 1 || var4 == 3) {
         var6 = var3.field3385;
         var7 = var3.field3384;
      }

      var5.field984 = (var6 + var1) * 128;
      var5.field992 = (var7 + var2) * 128;
      var5.field987 = var3.field3413;
      var5.field991 = var3.field3414 * 128;
      var5.field989 = var3.field3380;
      var5.field982 = var3.field3408;
      var5.field986 = var3.field3417;
      if (var3.field3410 != null) {
         var5.field994 = var3;
         var5.method1688();
      }

      Class68.field985.method4073(var5);
      if (var5.field986 != null) {
         var5.field990 = var5.field989 + (int)(Math.random() * (double)(var5.field982 - var5.field989));
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-852209287"
   )
   static int method3526(int var0, Class84 var1, boolean var2) {
      int var3;
      if (var0 == 5504) {
         Class69.field1003 -= 2;
         var3 = Class69.field999[Class69.field1003];
         int var4 = Class69.field999[Class69.field1003 + 1];
         if (!Client.field822) {
            Client.field649 = var3;
            Client.field717 = var4;
         }

         return 1;
      } else if (var0 == 5505) {
         Class69.field999[++Class69.field1003 - 1] = Client.field649;
         return 1;
      } else if (var0 == 5506) {
         Class69.field999[++Class69.field1003 - 1] = Client.field717;
         return 1;
      } else if (var0 == 5530) {
         var3 = Class69.field999[--Class69.field1003];
         if (var3 < 0) {
            var3 = 0;
         }

         Client.field644 = var3;
         return 1;
      } else if (var0 == 5531) {
         Class69.field999[++Class69.field1003 - 1] = Client.field644;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("kd")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "799584462"
   )
   static void method3527() {
      if (Client.field663 && Class138.field1876 != null) {
         int var0 = Class138.field1876.field922[0];
         int var1 = Class138.field1876.field872[0];
         if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
         }

         Class109.field1428 = Class138.field1876.field931;
         int var2 = Class27.method460(Class138.field1876.field931, Class138.field1876.field881, Class13.field82) - Client.field644;
         if (var2 < Class269.field3478) {
            Class269.field3478 = var2;
         }

         Class2.field23 = Class138.field1876.field881;
         Client.field663 = false;
      }

   }
}
