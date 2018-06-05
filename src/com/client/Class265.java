package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
public class Class265 extends Class206 {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static Class200 field3334 = new Class200(64);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   Class197 field3335;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "-12113"
   )
   public void method4961() {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "-1049647297"
   )
   public void method4960(Class182 var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.method4967(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;IB)V",
      garbageValue = "49"
   )
   void method4967(Class182 var1, int var2) {
      if (var2 == 249) {
         this.field3335 = Class39.method691(var1, this.field3335);
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1625397785"
   )
   public int method4962(int var1, int var2) {
      return Class67.method1668(this.field3335, var1, var2);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1321856430"
   )
   public String method4963(int var1, String var2) {
      return Class17.method171(this.field3335, var1, var2);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;S)Ljava/lang/String;",
      garbageValue = "-15504"
   )
   public static String method4976(CharSequence var0) {
      int var2 = var0.length();
      char[] var3 = new char[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = '*';
      }

      String var1 = new String(var3);
      return var1;
   }
}
