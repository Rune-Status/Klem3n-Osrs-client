package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
public class Class96 {
   @ObfuscatedName("z")
   int field1316 = 2;
   @ObfuscatedName("w")
   int[] field1323 = new int[2];
   @ObfuscatedName("s")
   int[] field1319 = new int[2];
   @ObfuscatedName("l")
   int field1314;
   @ObfuscatedName("u")
   int field1318;
   @ObfuscatedName("q")
   int field1317;
   @ObfuscatedName("k")
   int field1320;
   @ObfuscatedName("i")
   int field1321;
   @ObfuscatedName("e")
   int field1322;
   @ObfuscatedName("p")
   int field1315;
   @ObfuscatedName("b")
   int field1324;

   Class96() {
      this.field1323[0] = 0;
      this.field1323[1] = 65535;
      this.field1319[0] = 0;
      this.field1319[1] = 65535;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lgk;)V"
   )
   final void method2199(Class182 var1) {
      this.field1317 = var1.method3544();
      this.field1314 = var1.method3671();
      this.field1318 = var1.method3671();
      this.method2197(var1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;)V"
   )
   final void method2197(Class182 var1) {
      this.field1316 = var1.method3544();
      this.field1323 = new int[this.field1316];
      this.field1319 = new int[this.field1316];

      for(int var2 = 0; var2 < this.field1316; ++var2) {
         this.field1323[var2] = var1.method3550();
         this.field1319[var2] = var1.method3550();
      }

   }

   @ObfuscatedName("s")
   final void method2198() {
      this.field1320 = 0;
      this.field1321 = 0;
      this.field1322 = 0;
      this.field1315 = 0;
      this.field1324 = 0;
   }

   @ObfuscatedName("l")
   final int method2206(int var1) {
      if (this.field1324 >= this.field1320) {
         this.field1315 = this.field1319[this.field1321++] << 15;
         if (this.field1321 >= this.field1316) {
            this.field1321 = this.field1316 - 1;
         }

         this.field1320 = (int)((double)this.field1323[this.field1321] / 65536.0D * (double)var1);
         if (this.field1320 > this.field1324) {
            this.field1322 = ((this.field1319[this.field1321] << 15) - this.field1315) / (this.field1320 - this.field1324);
         }
      }

      this.field1315 += this.field1322;
      ++this.field1324;
      return this.field1315 - this.field1322 >> 15;
   }
}
