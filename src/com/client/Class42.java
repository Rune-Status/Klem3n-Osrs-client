package com.client;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public final class Class42 extends Canvas {
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1710290887
   )
   public static int field362;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "[[Lhi;"
   )
   public static Class230[][] field366;
   @ObfuscatedName("z")
   Component field365;

   Class42(Component var1) {
      this.field365 = var1;
   }

   public final void update(Graphics var1) {
      this.field365.update(var1);
   }

   public final void paint(Graphics var1) {
      this.field365.paint(var1);
   }
}
