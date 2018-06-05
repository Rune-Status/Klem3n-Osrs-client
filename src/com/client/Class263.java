package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
public class Class263 extends Class206 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static Class247 field3322;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static Class200 field3321 = new Class200(64);
   @ObfuscatedName("n")
   static int[] field3325;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -738108461
   )
   public int field3320;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 676822163
   )
   public int field3323;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1532826907
   )
   public int field3326;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "-1902884964"
   )
   public void method4941(Class182 var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.method4942(var1, var2);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "1481115001"
   )
   void method4942(Class182 var1, int var2) {
      if (var2 == 1) {
         this.field3320 = var1.readUnsignedShort();
         this.field3323 = var1.readUnsignedByte();
         this.field3326 = var1.readUnsignedByte();
      }

   }
}
