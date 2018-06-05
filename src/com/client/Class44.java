package com.client;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
public class Class44 extends Class95 {
   @ObfuscatedName("z")
   AudioFormat field373;
   @ObfuscatedName("w")
   SourceDataLine field374;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1571871947
   )
   int field372;
   @ObfuscatedName("l")
   byte[] field375;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2015063069"
   )
   protected void vmethod2176() {
      this.field373 = new AudioFormat((float)Class95.field1300, 16, Class95.field1295 ? 2 : 1, true, false);
      this.field375 = new byte[256 << (Class95.field1295 ? 2 : 1)];
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IS)V",
      garbageValue = "255"
   )
   protected void vmethod2163(int var1) throws LineUnavailableException {
      try {
         Info var2 = new Info(SourceDataLine.class, this.field373, var1 << (Class95.field1295 ? 2 : 1));
         this.field374 = (SourceDataLine)AudioSystem.getLine(var2);
         this.field374.open();
         this.field374.start();
         this.field372 = var1;
      } catch (LineUnavailableException var5) {
         int var4 = (var1 >>> 1 & 1431655765) + (var1 & 1431655765);
         var4 = (var4 >>> 2 & 858993459) + (var4 & 858993459);
         var4 = (var4 >>> 4) + var4 & 252645135;
         var4 += var4 >>> 8;
         var4 += var4 >>> 16;
         int var3 = var4 & 255;
         if (var3 != 1) {
            this.vmethod2163(Class146.method3193(var1));
         } else {
            this.field374 = null;
            throw var5;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "83"
   )
   protected int vmethod2153() {
      return this.field372 - (this.field374.available() >> (Class95.field1295 ? 2 : 1));
   }

   @ObfuscatedName("l")
   protected void vmethod2154() {
      int var1 = 256;
      if (Class95.field1295) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = super.field1299[var2];
         if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field375[var2 * 2] = (byte)(var3 >> 8);
         this.field375[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field374.write(this.field375, 0, var1 << 1);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1323448603"
   )
   protected void vmethod2155() {
      if (this.field374 != null) {
         this.field374.close();
         this.field374 = null;
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2047206903"
   )
   protected void vmethod2156() {
      this.field374.flush();
   }
}
