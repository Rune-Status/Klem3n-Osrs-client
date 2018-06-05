package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
public final class Class79 extends Class127 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1556168027
   )
   int field1120;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -137784953
   )
   int field1121;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1001488191
   )
   int field1122;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1246023211
   )
   int field1130;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 615566251
   )
   int field1124;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 392987725
   )
   int field1123;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -904504589
   )
   int field1126;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -620277071
   )
   int field1127;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1070958121
   )
   int field1128;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 490522177
   )
   int field1132;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1202003677
   )
   int field1135;
   @ObfuscatedName("b")
   boolean field1133 = false;
   @ObfuscatedName("n")
   double field1144;
   @ObfuscatedName("f")
   double field1125;
   @ObfuscatedName("g")
   double field1137;
   @ObfuscatedName("m")
   double field1131;
   @ObfuscatedName("r")
   double field1136;
   @ObfuscatedName("t")
   double field1129;
   @ObfuscatedName("o")
   double field1138;
   @ObfuscatedName("y")
   double field1139;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 82611727
   )
   int field1140;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 760033287
   )
   int field1141;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Ljn;"
   )
   Class273 field1142;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1358664531
   )
   int field1143 = 0;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -931624513
   )
   int field1134 = 0;

   Class79(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.field1120 = var1;
      this.field1121 = var2;
      this.field1122 = var3;
      this.field1130 = var4;
      this.field1124 = var5;
      this.field1126 = var6;
      this.field1127 = var7;
      this.field1128 = var8;
      this.field1132 = var9;
      this.field1135 = var10;
      this.field1123 = var11;
      this.field1133 = false;
      int var12 = Class57.method1035(this.field1120).field3271;
      if (var12 != -1) {
         this.field1142 = Class3.method25(var12);
      } else {
         this.field1142 = null;
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-432568951"
   )
   final void method1849(int var1, int var2, int var3, int var4) {
      double var5;
      if (!this.field1133) {
         var5 = (double)(var1 - this.field1122);
         double var7 = (double)(var2 - this.field1130);
         double var9 = Math.sqrt(var7 * var7 + var5 * var5);
         this.field1144 = (double)this.field1122 + (double)this.field1132 * var5 / var9;
         this.field1125 = (double)this.field1132 * var7 / var9 + (double)this.field1130;
         this.field1137 = (double)this.field1124;
      }

      var5 = (double)(this.field1127 + 1 - var4);
      this.field1131 = ((double)var1 - this.field1144) / var5;
      this.field1136 = ((double)var2 - this.field1125) / var5;
      this.field1129 = Math.sqrt(this.field1131 * this.field1131 + this.field1136 * this.field1136);
      if (!this.field1133) {
         this.field1138 = -this.field1129 * Math.tan(0.02454369D * (double)this.field1128);
      }

      this.field1139 = ((double)var3 - this.field1137 - var5 * this.field1138) * 2.0D / (var5 * var5);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1768751642"
   )
   final void method1850(int var1) {
      this.field1133 = true;
      this.field1144 += this.field1131 * (double)var1;
      this.field1125 += this.field1136 * (double)var1;
      this.field1137 += (double)var1 * 0.5D * this.field1139 * (double)var1 + (double)var1 * this.field1138;
      this.field1138 += this.field1139 * (double)var1;
      this.field1140 = (int)(Math.atan2(this.field1131, this.field1136) * 325.949D) + 1024 & 2047;
      this.field1141 = (int)(Math.atan2(this.field1138, this.field1129) * 325.949D) & 2047;
      if (this.field1142 != null) {
         this.field1134 += var1;

         while(true) {
            do {
               do {
                  if (this.field1134 <= this.field1142.field3541[this.field1143]) {
                     return;
                  }

                  this.field1134 -= this.field1142.field3541[this.field1143];
                  ++this.field1143;
               } while(this.field1143 < this.field1142.field3540.length);

               this.field1143 -= this.field1142.field3544;
            } while(this.field1143 >= 0 && this.field1143 < this.field1142.field3540.length);

            this.field1143 = 0;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Ldc;",
      garbageValue = "2119202332"
   )
   protected final Class119 vmethod3067() {
      Class258 var1 = Class57.method1035(this.field1120);
      Class119 var2 = var1.method4866(this.field1143);
      if (var2 == null) {
         return null;
      } else {
         var2.method2680(this.field1141);
         return var2;
      }
   }
}
