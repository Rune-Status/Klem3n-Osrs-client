package com.client;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
public abstract class Class285 {
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -115006045
   )
   final int field3620;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 2097572835
   )
   int field3619 = 0;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "[Ljx;"
   )
   Class282[] field3623;
   @ObfuscatedName("k")
   HashMap field3618;
   @ObfuscatedName("i")
   HashMap field3622;
   @ObfuscatedName("x")
   Comparator field3621 = null;

   Class285(int var1) {
      this.field3620 = var1;
      this.field3623 = this.vmethod5462(var1);
      this.field3618 = new HashMap(var1 / 8);
      this.field3622 = new HashMap(var1 / 8);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Ljx;",
      garbageValue = "2139940378"
   )
   abstract Class282 vmethod5461();

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)[Ljx;",
      garbageValue = "828432673"
   )
   abstract Class282[] vmethod5462(int var1);

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1666752471"
   )
   public void method5326() {
      this.field3619 = 0;
      Arrays.fill(this.field3623, (Object)null);
      this.field3618.clear();
      this.field3622.clear();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "821008449"
   )
   public int method5327() {
      return this.field3619;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-546371351"
   )
   public boolean method5328() {
      return this.field3620 == this.field3619;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Z",
      garbageValue = "-1323034650"
   )
   public boolean method5329(Class291 var1) {
      if (!var1.method5441()) {
         return false;
      } else {
         return this.field3618.containsKey(var1) ? true : this.field3622.containsKey(var1);
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Ljx;",
      garbageValue = "-1029474979"
   )
   public Class282 method5330(Class291 var1) {
      Class282 var2 = this.method5331(var1);
      return var2 != null ? var2 : this.method5390(var1);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Ljx;",
      garbageValue = "-520899073"
   )
   Class282 method5331(Class291 var1) {
      return !var1.method5441() ? null : (Class282)this.field3618.get(var1);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Ljx;",
      garbageValue = "-2122724226"
   )
   Class282 method5390(Class291 var1) {
      return !var1.method5441() ? null : (Class282)this.field3622.get(var1);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Z",
      garbageValue = "-630765365"
   )
   public final boolean method5393(Class291 var1) {
      Class282 var2 = this.method5331(var1);
      if (var2 == null) {
         return false;
      } else {
         this.method5334(var2);
         return true;
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(Ljx;I)V",
      garbageValue = "-570676385"
   )
   final void method5334(Class282 var1) {
      int var2 = this.method5339(var1);
      if (var2 != -1) {
         this.method5343(var2);
         this.method5395(var1);
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Ljx;",
      garbageValue = "261191446"
   )
   Class282 method5377(Class291 var1) {
      return this.method5335(var1, (Class291)null);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lkm;Lkm;I)Ljx;",
      garbageValue = "2051302762"
   )
   Class282 method5335(Class291 var1, Class291 var2) {
      if (this.method5331(var1) != null) {
         throw new IllegalStateException();
      } else {
         Class282 var3 = this.vmethod5461();
         var3.method5290(var1, var2);
         this.method5341(var3);
         this.method5342(var3);
         return var3;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IB)Ljx;",
      garbageValue = "99"
   )
   public final Class282 method5336(int var1) {
      if (var1 >= 0 && var1 < this.field3619) {
         return this.field3623[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1076089262"
   )
   public final void method5337() {
      if (this.field3621 == null) {
         Arrays.sort(this.field3623, 0, this.field3619);
      } else {
         Arrays.sort(this.field3623, 0, this.field3619, this.field3621);
      }

   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(Ljx;Lkm;Lkm;B)V",
      garbageValue = "15"
   )
   final void method5338(Class282 var1, Class291 var2, Class291 var3) {
      this.method5395(var1);
      var1.method5290(var2, var3);
      this.method5342(var1);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(Ljx;B)I",
      garbageValue = "1"
   )
   final int method5339(Class282 var1) {
      for(int var2 = 0; var2 < this.field3619; ++var2) {
         if (this.field3623[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Ljx;I)V",
      garbageValue = "-1961233435"
   )
   final void method5395(Class282 var1) {
      if (this.field3618.remove(var1.field3610) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.field3611 != null) {
            this.field3622.remove(var1.field3611);
         }

      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(Ljx;I)V",
      garbageValue = "234221683"
   )
   final void method5341(Class282 var1) {
      this.field3623[++this.field3619 - 1] = var1;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(Ljx;I)V",
      garbageValue = "-914048201"
   )
   final void method5342(Class282 var1) {
      this.field3618.put(var1.field3610, var1);
      if (var1.field3611 != null) {
         Class282 var2 = (Class282)this.field3622.put(var1.field3611, var1);
         if (var2 != null && var2 != var1) {
            var2.field3611 = null;
         }
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1797268727"
   )
   final void method5343(int var1) {
      --this.field3619;
      if (var1 < this.field3619) {
         System.arraycopy(this.field3623, var1 + 1, this.field3623, var1, this.field3619 - var1);
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "20160"
   )
   public final void method5346() {
      this.field3621 = null;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;B)V",
      garbageValue = "-105"
   )
   public final void method5347(Comparator var1) {
      if (this.field3621 == null) {
         this.field3621 = var1;
      } else if (this.field3621 instanceof Class283) {
         ((Class283)this.field3621).method5307(var1);
      }

   }
}
