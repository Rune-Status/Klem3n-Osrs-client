package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
public final class Class241 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IS)Ljo;",
      garbageValue = "-21845"
   )
   public static Class264 method4603(int var0) {
      Class264 var1 = (Class264)Class264.field3328.method3989((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Class264.field3327.method4625(11, var0);
         var1 = new Class264();
         if (var2 != null) {
            var1.method4948(new Class182(var2));
         }

         var1.method4954();
         Class264.field3328.method3983(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("hf")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIIB)V",
      garbageValue = "-35"
   )
   static final void method4602(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Class62 var9 = null;

      for(Class62 var10 = (Class62)Client.field714.method4098(); var10 != null; var10 = (Class62)Client.field714.method4079()) {
         if (var0 == var10.field861 && var10.field857 == var1 && var2 == var10.field858 && var3 == var10.field856) {
            var9 = var10;
            break;
         }
      }

      if (var9 == null) {
         var9 = new Class62();
         var9.field861 = var0;
         var9.field856 = var3;
         var9.field857 = var1;
         var9.field858 = var2;
         Class74.method1800(var9);
         Client.field714.method4073(var9);
      }

      var9.field862 = var4;
      var9.field864 = var5;
      var9.field863 = var6;
      var9.field855 = var7;
      var9.field860 = var8;
   }
}
