package com.client;
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public final class Class38 implements Class156, MouseWheelListener {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 853846113
   )
   int field328 = 0;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "1305046280"
   )
   void method665(Component var1) {
      var1.addMouseWheelListener(this);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "1338502209"
   )
   void method668(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-371619108"
   )
   public synchronized int vmethod3278() {
      int var1 = this.field328;
      this.field328 = 0;
      return var1;
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.field328 += var1.getWheelRotation();
   }
}
