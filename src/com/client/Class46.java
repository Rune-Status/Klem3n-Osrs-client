package com.client;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
public final class Class46 extends Class315 {
   @ObfuscatedName("z")
   Component field384;
   @ObfuscatedName("w")
   Image field383;

   Class46(int var1, int var2, Component var3) {
      super.field3767 = var1;
      super.field3769 = var2;
      super.field3768 = new int[var2 * var1 + 1];
      DataBufferInt var4 = new DataBufferInt(super.field3768, super.field3768.length);
      DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(super.field3767, super.field3769), var4, (Point)null);
      this.field383 = new BufferedImage(var5, var6, false, new Hashtable());
      this.method751(var3);
      this.method5808();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;B)V",
      garbageValue = "-102"
   )
   final void method751(Component var1) {
      this.field384 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1986786716"
   )
   public final void vmethod5809(int var1, int var2) {
      this.method754(this.field384.getGraphics(), var1, var2);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-661513186"
   )
   public final void vmethod5810(int var1, int var2, int var3, int var4) {
      this.method755(this.field384.getGraphics(), var1, var2, var3, var4);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Graphics;III)V",
      garbageValue = "1968187025"
   )
   final void method754(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.field383, var2, var3, this.field384);
      } catch (Exception var5) {
         this.field384.repaint();
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Graphics;IIIIB)V",
      garbageValue = "1"
   )
   final void method755(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var6 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.field383, 0, 0, this.field384);
         var1.setClip(var6);
      } catch (Exception var7) {
         this.field384.repaint();
      }

   }
}
