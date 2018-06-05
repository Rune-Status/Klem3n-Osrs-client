package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
public class Class18 implements Class31 {
   @ObfuscatedName("d")
   static String field143;
   @ObfuscatedName("aq")
   protected static boolean field146;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1991100519
   )
   int field137;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1519554033
   )
   int field148;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1074920077
   )
   int field138;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1335404787
   )
   int field139;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 150706285
   )
   int field140;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 620984285
   )
   int field141;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1655913713
   )
   int field142;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 568773153
   )
   int field136;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1297358037
   )
   int field144;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -910953089
   )
   int field145;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(La;B)V",
      garbageValue = "-105"
   )
   public void vmethod635(Class20 var1) {
      if (var1.field166 > this.field142) {
         var1.field166 = this.field142;
      }

      if (var1.field167 < this.field144) {
         var1.field167 = this.field144;
      }

      if (var1.field168 > this.field136) {
         var1.field168 = this.field136;
      }

      if (var1.field162 < this.field145) {
         var1.field162 = this.field145;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "2090621319"
   )
   public boolean vmethod636(int var1, int var2, int var3) {
      if (var1 >= this.field137 && var1 < this.field137 + this.field148) {
         return var2 >> 6 >= this.field138 && var2 >> 6 <= this.field140 && var3 >> 6 >= this.field139 && var3 >> 6 <= this.field141;
      } else {
         return false;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-658565537"
   )
   public boolean vmethod637(int var1, int var2) {
      return var1 >> 6 >= this.field142 && var1 >> 6 <= this.field144 && var2 >> 6 >= this.field136 && var2 >> 6 <= this.field145;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIB)[I",
      garbageValue = "56"
   )
   public int[] vmethod638(int var1, int var2, int var3) {
      if (!this.vmethod636(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field142 * 64 - this.field138 * 64 + var2, var3 + (this.field136 * 64 - this.field139 * 64)};
         return var4;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(III)Lha;",
      garbageValue = "2128900046"
   )
   public Class226 vmethod659(int var1, int var2) {
      if (!this.vmethod637(var1, var2)) {
         return null;
      } else {
         int var3 = this.field138 * 64 - this.field142 * 64 + var1;
         int var4 = this.field139 * 64 - this.field136 * 64 + var2;
         return new Class226(this.field137, var3, var4);
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "-40"
   )
   public void vmethod639(Class182 var1) {
      this.field137 = var1.readUnsignedByte();
      this.field148 = var1.readUnsignedByte();
      this.field138 = var1.readUnsignedShort();
      this.field139 = var1.readUnsignedShort();
      this.field140 = var1.readUnsignedShort();
      this.field141 = var1.readUnsignedShort();
      this.field142 = var1.readUnsignedShort();
      this.field136 = var1.readUnsignedShort();
      this.field144 = var1.readUnsignedShort();
      this.field145 = var1.readUnsignedShort();
      this.method179();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-76"
   )
   void method179() {
   }

   @ObfuscatedName("el")
   @ObfuscatedSignature(
      signature = "(I)Llw;",
      garbageValue = "-948375195"
   )
   static Class321 method196() {
      return Class53.field476;
   }

   @ObfuscatedName("ij")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "1298964684"
   )
   static String method176(int var0) {
      if (var0 < 0) {
         return "";
      } else {
         return Client.field740[var0].length() > 0 ? Client.field735[var0] + " " + Client.field740[var0] : Client.field735[var0];
      }
   }
}
