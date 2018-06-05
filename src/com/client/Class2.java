package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
public class Class2 {
   @ObfuscatedName("ga")
   @ObfuscatedGetter(
      intValue = -313553599
   )
   static int field23;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -939579551
   )
   public final int field19;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      longValue = 3949284830848608531L
   )
   public final long field20;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lu;"
   )
   public final Class4 field17;
   @ObfuscatedName("l")
   String field18;
   @ObfuscatedName("u")
   String field21;

   @ObfuscatedSignature(
      signature = "(Lgk;BI)V"
   )
   Class2(Class182 var1, byte var2, int var3) {
      this.field18 = var1.method3738();
      this.field21 = var1.method3738();
      this.field19 = var1.readUnsignedShort();
      this.field20 = var1.method3554();
      int var4 = var1.method3671();
      int var5 = var1.method3671();
      this.field17 = new Class4();
      this.field17.method44(2);
      this.field17.method40(var2);
      this.field17.field30 = var4;
      this.field17.field33 = var5;
      this.field17.field32 = 0;
      this.field17.field28 = 0;
      this.field17.field29 = var3;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "1845946507"
   )
   public String method16() {
      return this.field18;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1459489481"
   )
   public String method18() {
      return this.field21;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)Ljk;",
      garbageValue = "-241404147"
   )
   public static Class260 method23(int var0) {
      Class260 var1 = (Class260)Class260.field3291.method3989((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Class260.field3292.method4625(3, var0);
         var1 = new Class260();
         if (var2 != null) {
            var1.method4894(new Class182(var2));
         }

         Class260.field3291.method3983(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
      garbageValue = "127"
   )
   static void method22(String var0, String var1, String var2) {
      Class78.field1103 = var0;
      Class78.field1112 = var1;
      Class78.field1105 = var2;
   }
}
