package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public class Class130 extends Class206 {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static Class247 field1801;
   @ObfuscatedName("l")
   static String[] field1800;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "[Lda;"
   )
   Class117[] field1802;

   @ObfuscatedSignature(
      signature = "(Lir;Lir;IZ)V",
      garbageValue = "0"
   )
   public Class130(Class247 var1, Class247 var2, int var3, boolean var4) {
      Class205 var5 = new Class205();
      int var6 = var1.method4636(var3);
      this.field1802 = new Class117[var6];
      int[] var7 = var1.method4668(var3);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         byte[] var9 = var1.method4625(var3, var7[var8]);
         Class124 var10 = null;
         int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

         for(Class124 var12 = (Class124)var5.method4098(); var12 != null; var12 = (Class124)var5.method4079()) {
            if (var11 == var12.field1704) {
               var10 = var12;
               break;
            }
         }

         if (var10 == null) {
            byte[] var13 = var2.method4676(var11, 0);
            var10 = new Class124(var11, var13);
            var5.method4073(var10);
         }

         this.field1802[var7[var8]] = new Class117(var9, var10);
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1439746475"
   )
   public boolean method3075(int var1) {
      return this.field1802[var1].field1552;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)Liu;",
      garbageValue = "1311567042"
   )
   public static Class253 method3074(int var0) {
      Class253 var1 = (Class253)Class253.field3228.method3989((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Class253.field3226.method4625(5, var0);
         var1 = new Class253();
         if (var2 != null) {
            var1.method4799(new Class182(var2));
         }

         Class253.field3228.method3983(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("jg")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "0"
   )
   static void method3077(int var0) {
      for(Class211 var1 = (Class211)Client.field783.method4018(); var1 != null; var1 = (Class211)Client.field783.method4019()) {
         if ((long)var0 == (var1.field2421 >> 48 & 65535L)) {
            var1.method4064();
         }
      }

   }
}
