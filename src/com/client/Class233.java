package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public enum Class233 implements Class188 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2773(0, 0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2775(1, 0),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2755(2, 0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2757(3, 0),
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2758(9, 2),
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2754(4, 1),
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2770(5, 1),
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2761(6, 1),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2762(7, 1),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2763(8, 1),
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2760(12, 2),
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2765(13, 2),
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2766(14, 2),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2767(15, 2),
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2768(16, 2),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2769(17, 2),
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2774(18, 2),
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2771(19, 2),
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2772(20, 2),
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2756(21, 2),
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2759(10, 2),
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2764(11, 2),
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   field2776(22, 3);

   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -89106173
   )
   public final int field2777;

   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "0"
   )
   Class233(int var3, int var4) {
      this.field2777 = var3;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
   )
   public int vmethod5815() {
      return this.field2777;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lir;II)Lly;",
      garbageValue = "-1839830741"
   )
   public static Class317 method4589(Class247 var0, int var1) {
      byte[] var3 = var0.method4689(var1);
      boolean var2;
      if (var3 == null) {
         var2 = false;
      } else {
         Class268.method5084(var3);
         var2 = true;
      }

      return !var2 ? null : Class305.method5658();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "-31"
   )
   static final void method4588(String var0) {
      StringBuilder var10000 = (new StringBuilder()).append(var0);
      Object var10001 = null;
      String var1 = var10000.append(" is already on your friend list").toString();
      Class143.method3172(30, "", var1);
   }
}
