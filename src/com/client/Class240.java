package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
public enum Class240 implements Class188 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lif;"
   )
   field3101(3, 0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lif;"
   )
   field3107(5, 1),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lif;"
   )
   field3097(7, 2),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lif;"
   )
   field3099(2, 3),
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lif;"
   )
   field3100(6, 4),
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lif;"
   )
   field3098(4, 5),
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lif;"
   )
   field3102(1, 6),
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lif;"
   )
   field3103(0, 7);

   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   static Class230 field3096;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1490628439
   )
   public final int field3104;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -838974909
   )
   final int field3105;

   Class240(int var3, int var4) {
      this.field3104 = var3;
      this.field3105 = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
   )
   public int vmethod5815() {
      return this.field3105;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgi;II)Z",
      garbageValue = "-641567256"
   )
   static boolean method4601(Class189 var0, int var1) {
      int var2 = var0.method3817(2);
      int var3;
      int var4;
      int var7;
      int var8;
      int var9;
      int var10;
      if (var2 == 0) {
         if (var0.method3817(1) != 0) {
            method4601(var0, var1);
         }

         var3 = var0.method3817(13);
         var4 = var0.method3817(13);
         boolean var12 = var0.method3817(1) == 1;
         if (var12) {
            Class81.field1166[++Class81.field1165 - 1] = var1;
         }

         if (Client.field610[var1] != null) {
            throw new RuntimeException();
         } else {
            Class60 var6 = Client.field610[var1] = new Class60();
            var6.field574 = var1;
            if (Class81.field1157[var1] != null) {
               var6.method1082(Class81.field1157[var1]);
            }

            var6.field926 = Class81.field1163[var1];
            var6.field897 = Class81.field1164[var1];
            var7 = Class81.field1162[var1];
            var8 = var7 >> 28;
            var9 = var7 >> 14 & 255;
            var10 = var7 & 255;
            var6.field928[0] = Class81.field1153[var1];
            var6.field567 = (byte)var8;
            var6.method1103((var9 << 13) + var3 - Class62.field868, (var10 << 13) + var4 - Client.field754);
            var6.field571 = false;
            return true;
         }
      } else if (var2 == 1) {
         var3 = var0.method3817(2);
         var4 = Class81.field1162[var1];
         Class81.field1162[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28);
         return false;
      } else {
         int var5;
         int var11;
         if (var2 == 2) {
            var3 = var0.method3817(5);
            var4 = var3 >> 3;
            var5 = var3 & 7;
            var11 = Class81.field1162[var1];
            var7 = (var11 >> 28) + var4 & 3;
            var8 = var11 >> 14 & 255;
            var9 = var11 & 255;
            if (var5 == 0) {
               --var8;
               --var9;
            }

            if (var5 == 1) {
               --var9;
            }

            if (var5 == 2) {
               ++var8;
               --var9;
            }

            if (var5 == 3) {
               --var8;
            }

            if (var5 == 4) {
               ++var8;
            }

            if (var5 == 5) {
               --var8;
               ++var9;
            }

            if (var5 == 6) {
               ++var9;
            }

            if (var5 == 7) {
               ++var8;
               ++var9;
            }

            Class81.field1162[var1] = (var8 << 14) + var9 + (var7 << 28);
            return false;
         } else {
            var3 = var0.method3817(18);
            var4 = var3 >> 16;
            var5 = var3 >> 8 & 255;
            var11 = var3 & 255;
            var7 = Class81.field1162[var1];
            var8 = (var7 >> 28) + var4 & 3;
            var9 = var5 + (var7 >> 14) & 255;
            var10 = var11 + var7 & 255;
            Class81.field1162[var1] = (var9 << 14) + var10 + (var8 << 28);
            return false;
         }
      }
   }
}
