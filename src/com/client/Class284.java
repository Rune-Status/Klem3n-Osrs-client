package com.client;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class Class284 extends Class285 {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   final Class322 field3615;

   @ObfuscatedSignature(
      signature = "(Llm;)V"
   )
   public Class284(Class322 var1) {
      super(400);
      this.field3615 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Ljx;",
      garbageValue = "2139940378"
   )
   Class282 vmethod5461() {
      return new Class286();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)[Ljx;",
      garbageValue = "828432673"
   )
   Class282[] vmethod5462(int var1) {
      return new Class286[var1];
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "777447956"
   )
   public void method5317(Class182 var1, int var2) {
      while(true) {
         if (var1.field2339 < var2) {
            int var3 = var1.method3544();
            boolean var4 = (var3 & 1) == 1;
            Class291 var5 = new Class291(var1.method3738(), this.field3615);
            Class291 var6 = new Class291(var1.method3738(), this.field3615);
            var1.method3738();
            if (var5 != null && var5.method5441()) {
               Class286 var7 = (Class286)this.method5331(var5);
               if (var4) {
                  Class286 var8 = (Class286)this.method5331(var6);
                  if (var8 != null && var8 != var7) {
                     if (var7 != null) {
                        this.method5334(var8);
                     } else {
                        var7 = var8;
                     }
                  }
               }

               if (var7 != null) {
                  this.method5338(var7, var5, var6);
                  continue;
               }

               if (this.method5327() < 400) {
                  int var9 = this.method5327();
                  var7 = (Class286)this.method5335(var5, var6);
                  var7.field3624 = var9;
               }
               continue;
            }

            throw new IllegalStateException();
         }

         return;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "([BI)Lll;",
      garbageValue = "105126678"
   )
   public static final Class318 method5324(byte[] var0) {
      BufferedImage var1 = null;

      try {
         var1 = ImageIO.read(new ByteArrayInputStream(var0));
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         int[] var4 = new int[var2 * var3];
         PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
         var5.grabPixels();
         return new Class318(var4, var2, var3);
      } catch (IOException var7) {
         ;
      } catch (InterruptedException var8) {
         ;
      }

      return new Class318(0, 0);
   }
}
