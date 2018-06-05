package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public class Class243 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lid;"
   )
   static final Class243 field3131 = new Class243("LIVE", 0);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lid;"
   )
   static final Class243 field3132 = new Class243("BUILDLIVE", 3);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lid;"
   )
   static final Class243 field3136 = new Class243("RC", 1);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lid;"
   )
   static final Class243 field3134 = new Class243("WIP", 2);
   @ObfuscatedName("f")
   static int[] field3137;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -848859815
   )
   public static int field3138;
   @ObfuscatedName("fs")
   @ObfuscatedSignature(
      signature = "[Lly;"
   )
   static Class317[] field3139;
   @ObfuscatedName("u")
   public final String field3135;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2135504665
   )
   final int field3133;

   Class243(String var1, int var2) {
      this.field3135 = var1;
      this.field3133 = var2;
   }

   @ObfuscatedName("ik")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IIIIZB)V",
      garbageValue = "-15"
   )
   static final void method4612(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (!Client.field716) {
         if (Client.field771 < 500) {
            Client.field735[Client.field771] = var0;
            Client.field740[Client.field771] = var1;
            Client.field720[Client.field771] = var2;
            Client.field794[Client.field771] = var3;
            Client.field718[Client.field771] = var4;
            Client.field851[Client.field771] = var5;
            Client.field590[Client.field771] = var6;
            ++Client.field771;
         }

      }
   }
}
