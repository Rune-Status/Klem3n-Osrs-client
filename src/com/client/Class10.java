package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class Class10 extends Class16 {
   @ObfuscatedName("qn")
   @ObfuscatedSignature(
      signature = "Lbx;"
   )
   static Class66 field61;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lgk;Lgk;I)V",
      garbageValue = "-1858538420"
   )
   void method95(Class182 var1, Class182 var2) {
      int var3 = var2.method3544();
      if (var3 != Class25.field212.field211) {
         throw new IllegalStateException("");
      } else {
         super.field120 = var2.method3544();
         super.field121 = var2.method3544();
         super.field127 = var2.method3550();
         super.field117 = var2.method3550();
         super.field118 = var2.method3550();
         super.field119 = var2.method3550();
         super.field121 = Math.min(super.field121, 4);
         super.field125 = new short[1][64][64];
         super.field123 = new short[super.field121][64][64];
         super.field124 = new byte[super.field121][64][64];
         super.field116 = new byte[super.field121][64][64];
         super.field126 = new Class19[super.field121][64][64][];
         var3 = var1.method3544();
         if (var3 != Class24.field208.field205) {
            throw new IllegalStateException("");
         } else {
            int var4 = var1.method3544();
            int var5 = var1.method3544();
            if (var4 == super.field118 && var5 == super.field119) {
               for(int var6 = 0; var6 < 64; ++var6) {
                  for(int var7 = 0; var7 < 64; ++var7) {
                     this.method150(var6, var7, var1);
                  }
               }

            } else {
               throw new IllegalStateException("");
            }
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof Class10)) {
         return false;
      } else {
         Class10 var2 = (Class10)var1;
         return super.field118 == var2.field118 && var2.field119 == super.field119;
      }
   }

   public int hashCode() {
      return super.field118 | super.field119 << 8;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-1588398214"
   )
   static void method96(int var0, int var1, int var2, int var3) {
      Class53 var4 = (Class53)Class53.field474.method4020((long)var0);
      if (var4 == null) {
         var4 = new Class53();
         Class53.field474.method4016(var4, (long)var0);
      }

      if (var4.field477.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.field477.length; ++var7) {
            var5[var7] = var4.field477[var7];
            var6[var7] = var4.field473[var7];
         }

         for(var7 = var4.field477.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.field477 = var5;
         var4.field473 = var6;
      }

      var4.field477[var1] = var2;
      var4.field473[var1] = var3;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "([BI)Lce;",
      garbageValue = "-2110987509"
   )
   static Class84 method97(byte[] var0) {
      Class84 var1 = new Class84();
      Class182 var2 = new Class182(var0);
      var2.field2339 = var2.payload.length - 2;
      int var3 = var2.method3550();
      int var4 = var2.payload.length - 2 - var3 - 12;
      var2.field2339 = var4;
      int var5 = var2.method3671();
      var1.field1192 = var2.method3550();
      var1.field1193 = var2.method3550();
      var1.field1188 = var2.method3550();
      var1.field1195 = var2.method3550();
      int var6 = var2.method3544();
      int var7;
      int var8;
      if (var6 > 0) {
         var1.field1194 = var1.method1944(var6);

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var2.method3550();
            Class197 var9 = new Class197(var8 > 0 ? Class146.method3193(var8) : 1);
            var1.field1194[var7] = var9;

            while(var8-- > 0) {
               int var10 = var2.method3671();
               int var11 = var2.method3671();
               var9.method3944(new Class211(var11), (long)var10);
            }
         }
      }

      var2.field2339 = 0;
      var2.method3752();
      var1.field1189 = new int[var5];
      var1.field1196 = new int[var5];
      var1.field1191 = new String[var5];

      for(var7 = 0; var2.field2339 < var4; var1.field1189[var7++] = var8) {
         var8 = var2.method3550();
         if (var8 == 3) {
            var1.field1191[var7] = var2.method3738();
         } else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
            var1.field1196[var7] = var2.method3671();
         } else {
            var1.field1196[var7] = var2.method3544();
         }
      }

      return var1;
   }

   @ObfuscatedName("fp")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1245329475"
   )
   static boolean method92() {
      if (Client.field781 != null && Client.field606 < Client.field781.size()) {
         while(Client.field606 < Client.field781.size()) {
            Class52 var0 = (Class52)Client.field781.get(Client.field606);
            if (!var0.method1000()) {
               return false;
            }

            ++Client.field606;
         }

         return true;
      } else {
         return true;
      }
   }
}
