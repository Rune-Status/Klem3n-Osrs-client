package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
public class Class56 extends Class204 {
   @ObfuscatedName("z")
   Object[] field512;
   @ObfuscatedName("w")
   boolean field505;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   Class230 field506;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1049191845
   )
   int field511;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1598662979
   )
   int field508;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 879102033
   )
   int field517;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   Class230 field507;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1181936113
   )
   int field509;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1478440877
   )
   int field513;
   @ObfuscatedName("e")
   String field504;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1140422785
   )
   int field514;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 285302449
   )
   int field515 = 76;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/Object;B)V",
      garbageValue = "-106"
   )
   public void method1024(Object[] var1) {
      this.field512 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-529454320"
   )
   public void method1025(int var1) {
      this.field515 = var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "1438520718"
   )
   static void method1030(boolean var0) {
      Class78.field1103 = "";
      Class78.field1112 = "Enter your username/email & password.";
      Class78.field1105 = "";
      Class78.field1081 = 2;
      if (var0) {
         Class78.field1086 = "";
      }

      if (Class78.field1106 == null || Class78.field1106.length() <= 0) {
         if (Class10.field61.field959 != null) {
            Class78.field1106 = Class10.field61.field959;
            Class78.field1108 = true;
         } else {
            Class78.field1108 = false;
         }
      }

      Class34.method586();
   }

   @ObfuscatedName("fg")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "54"
   )
   static final void method1031(String var0) {
      if (var0.equalsIgnoreCase("toggleroof")) {
         Class10.field61.field960 = !Class10.field61.field960;
         Class54.method1018();
         if (Class10.field61.field960) {
            Class143.method3172(99, "", "Roofs are now all hidden");
         } else {
            Class143.method3172(99, "", "Roofs will only be removed selectively");
         }
      }

      if (var0.equalsIgnoreCase("displayfps")) {
         Client.field597 = !Client.field597;
      }

      if (var0.equalsIgnoreCase("renderself")) {
         Client.field699 = !Client.field699;
      }

      if (var0.equalsIgnoreCase("mouseovertext")) {
         Client.field728 = !Client.field728;
      }

      if (Client.field747 >= 2) {
         if (var0.equalsIgnoreCase("showcoord")) {
            Class53.field476.field3839 = !Class53.field476.field3839;
         }

         if (var0.equalsIgnoreCase("fpson")) {
            Client.field597 = true;
         }

         if (var0.equalsIgnoreCase("fpsoff")) {
            Client.field597 = false;
         }

         if (var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if (var0.equalsIgnoreCase("clientdrop")) {
            Class30.method516();
         }
      }

      Class172 var1 = Class26.method433(ClientPackets.field2187, Client.field626.field1218);
      var1.field2257.method3532(var0.length() + 1);
      var1.field2257.method3699(var0);
      Client.field626.method1980(var1);
   }

   @ObfuscatedName("io")
   @ObfuscatedSignature(
      signature = "(Lhi;Ljt;IIZI)V",
      garbageValue = "-2096518256"
   )
   static final void method1027(Class230 var0, Class269 var1, int var2, int var3, boolean var4) {
      String[] var5 = var1.field3425;
      byte var6 = -1;
      String var7 = null;
      if (var5 != null && var5[var3] != null) {
         if (var3 == 0) {
            var6 = 33;
         } else if (var3 == 1) {
            var6 = 34;
         } else if (var3 == 2) {
            var6 = 35;
         } else if (var3 == 3) {
            var6 = 36;
         } else {
            var6 = 37;
         }

         var7 = var5[var3];
      } else if (var3 == 4) {
         var6 = 37;
         var7 = "Drop";
      }

      if (var6 != -1 && var7 != null) {
         Class243.method4612(var7, Class6.method71(16748608) + var1.field3433, var6, var1.field3431, var2, var0.field2691, var4);
      }

   }
}
