package com.client;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
public class Class48 implements MouseListener, MouseMotionListener, FocusListener {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lax;"
   )
   public static Class48 field429 = new Class48();
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1210703827
   )
   static volatile int field417 = 0;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -408912375
   )
   public static volatile int field424 = 0;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -333703105
   )
   public static int field425 = 0;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1905746791
   )
   public static volatile int field422 = -1;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1976419829
   )
   public static int field426 = 0;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1193765943
   )
   public static volatile int field423 = -1;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -182158863
   )
   public static int field419 = 0;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -569585645
   )
   public static volatile int field421 = 0;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1462111047
   )
   public static volatile int field420 = 0;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 894647401
   )
   public static volatile int field434 = 0;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      longValue = 2696384854056822279L
   )
   public static volatile long field430 = 0L;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1681711897
   )
   public static int field431 = 0;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1469671121
   )
   public static int field432 = 0;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -2008842241
   )
   public static int field428 = 0;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      longValue = 7842482435590182425L
   )
   public static long field433 = 0L;
   @ObfuscatedName("jz")
   @ObfuscatedGetter(
      intValue = -1699928239
   )
   static int field435;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/event/MouseEvent;I)I",
      garbageValue = "-1838071369"
   )
   final int method916(MouseEvent var1) {
      int var2 = var1.getButton();
      if (!var1.isAltDown() && var2 != 2) {
         return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if (field429 != null) {
         field417 = 0;
         field420 = var1.getX();
         field434 = var1.getY();
         field430 = Class182.method3547();
         field421 = this.method916(var1);
         if (field421 != 0) {
            field424 = field421;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (field429 != null) {
         field417 = 0;
         field424 = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      if (field429 != null) {
         field417 = 0;
         field422 = var1.getX();
         field423 = var1.getY();
      }

   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      if (field429 != null) {
         field417 = 0;
         field422 = var1.getX();
         field423 = var1.getY();
      }

   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if (field429 != null) {
         field417 = 0;
         field422 = var1.getX();
         field423 = var1.getY();
      }

   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (field429 != null) {
         field424 = 0;
      }

   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if (field429 != null) {
         field417 = 0;
         field422 = -1;
         field423 = -1;
      }

   }

   public final void mouseClicked(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   @ObfuscatedName("ej")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "537461702"
   )
   static void method947(int var0) {
      if (var0 != Client.field589) {
         if (Client.field589 == 0) {
            Class182.field2334.method842();
         }

         if (var0 == 20 || var0 == 40 || var0 == 45) {
            Client.field615 = 0;
            Client.field616 = 0;
            Client.field617 = 0;
            Client.field804.method5246(var0);
            if (var0 != 20) {
               NetWriter.method2005(false);
            }
         }

         if (var0 != 20 && var0 != 40 && Class62.field869 != null) {
            Class62.field869.vmethod3346();
            Class62.field869 = null;
         }

         if (Client.field589 == 25) {
            Client.field751 = 0;
            Client.field633 = 0;
            Client.field634 = 1;
            Client.field635 = 0;
            Client.field636 = 1;
         }

         if (var0 != 5 && var0 != 10) {
            if (var0 == 20) {
               NetWriter.method1994(Class22.field183, Class175.field2270, true, Client.field589 == 11 ? 4 : 0);
            } else if (var0 == 11) {
               NetWriter.method1994(Class22.field183, Class175.field2270, false, 4);
            } else {
               Class59.method1079();
            }
         } else {
            NetWriter.method1994(Class22.field183, Class175.field2270, true, 0);
         }

         Client.field589 = var0;
      }
   }

   @ObfuscatedName("gq")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "96"
   )
   static boolean method943() {
      return (Client.field658 & 2) != 0;
   }

   @ObfuscatedName("hx")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "1368654361"
   )
   static final void method948(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < Client.field603; ++var4) {
         if (Client.field786[var4] + Client.field641[var4] > var0 && Client.field786[var4] < var0 + var2 && Client.field787[var4] + Client.field789[var4] > var1 && Client.field787[var4] < var3 + var1) {
            Client.field697[var4] = true;
         }
      }

   }
}
