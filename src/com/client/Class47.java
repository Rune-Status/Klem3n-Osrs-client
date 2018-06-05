package com.client;
import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.Iterator;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
public abstract class Class47 extends Applet implements Runnable, FocusListener, WindowListener {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lev;"
   )
   protected static Class154 field392;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Laj;"
   )
   static Class47 field386 = null;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1414651903
   )
   static int field387 = 0;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      longValue = -5838759279061655367L
   )
   static long field388 = 0L;
   @ObfuscatedName("q")
   static boolean field389 = false;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1662117949
   )
   static int field391 = 20;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1070405191
   )
   static int field385 = 1;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1422310459
   )
   protected static int field393 = 0;
   @ObfuscatedName("g")
   protected static long[] field394 = new long[32];
   @ObfuscatedName("r")
   protected static long[] field404 = new long[32];
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1878379069
   )
   static int field413 = 500;
   @ObfuscatedName("az")
   static volatile boolean field390 = true;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      longValue = -3346366327004911519L
   )
   static long field415 = -1L;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      longValue = 1928704871308797659L
   )
   static long field416 = -1L;
   @ObfuscatedName("k")
   boolean field401 = false;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 2027069893
   )
   protected int field396;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -81949229
   )
   protected int field397;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1346865451
   )
   int field398 = 0;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 2128545057
   )
   int field411 = 0;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -385865539
   )
   int field395;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1565245549
   )
   int field402;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -318529133
   )
   int field400;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1497598001
   )
   int field414;
   @ObfuscatedName("as")
   Frame field403;
   @ObfuscatedName("an")
   Canvas field405;
   @ObfuscatedName("ao")
   volatile boolean field406 = true;
   @ObfuscatedName("ac")
   boolean field408 = false;
   @ObfuscatedName("ap")
   volatile boolean field409 = false;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      longValue = 2801001644697647105L
   )
   volatile long field410 = 0L;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "Laa;"
   )
   Class38 field407;
   @ObfuscatedName("al")
   Clipboard field412;
   @ObfuscatedName("ae")
   final EventQueue field399;

   protected Class47() {
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
         ;
      }

      this.field399 = var1;
      Class40 var2 = new Class40();
      Class95.field1297 = var2;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "349970276"
   )
   protected final void method906(int var1, int var2) {
      if (this.field400 != var1 || var2 != this.field414) {
         this.method784();
      }

      this.field400 = var1;
      this.field414 = var2;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Object;B)V",
      garbageValue = "-2"
   )
   final void method768(Object var1) {
      if (this.field399 != null) {
         for(int var2 = 0; var2 < 50 && this.field399.peekEvent() != null; ++var2) {
            Class63.method1539(1L);
         }

         if (var1 != null) {
            this.field399.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)Lfp;",
      garbageValue = "10"
   )
   protected Class156 method769() {
      if (this.field407 == null) {
         this.field407 = new Class38();
         this.field407.method665(this.field405);
      }

      return this.field407;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1223644500"
   )
   protected void method770() {
      this.field412 = this.getToolkit().getSystemClipboard();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;S)V",
      garbageValue = "8637"
   )
   protected void method771(String var1) {
      this.field412.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   protected final void method772() {
      if (Class154.field1960.toLowerCase().indexOf("microsoft") != -1) {
         Class39.field334[186] = 57;
         Class39.field334[187] = 27;
         Class39.field334[188] = 71;
         Class39.field334[189] = 26;
         Class39.field334[190] = 72;
         Class39.field334[191] = 73;
         Class39.field334[192] = 58;
         Class39.field334[219] = 42;
         Class39.field334[220] = 74;
         Class39.field334[221] = 43;
         Class39.field334[222] = 59;
         Class39.field334[223] = 28;
      } else {
         Class39.field334[44] = 71;
         Class39.field334[45] = 26;
         Class39.field334[46] = 72;
         Class39.field334[47] = 73;
         Class39.field334[59] = 57;
         Class39.field334[61] = 27;
         Class39.field334[91] = 42;
         Class39.field334[92] = 74;
         Class39.field334[93] = 43;
         Class39.field334[192] = 28;
         Class39.field334[222] = 58;
         Class39.field334[520] = 59;
      }

      Canvas var1 = this.field405;
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(Class39.field337);
      var1.addFocusListener(Class39.field337);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "45124386"
   )
   protected final void method791() {
      Canvas var1 = this.field405;
      var1.addMouseListener(Class48.field429);
      var1.addMouseMotionListener(Class48.field429);
      var1.addFocusListener(Class48.field429);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1629251833"
   )
   final void method854() {
      Container var1 = this.method799();
      if (var1 != null) {
         Class310 var2 = this.method800();
         this.field396 = Math.max(var2.field3747, this.field395);
         this.field397 = Math.max(var2.field3745, this.field402);
         if (this.field396 <= 0) {
            this.field396 = 1;
         }

         if (this.field397 <= 0) {
            this.field397 = 1;
         }

         Class82.field1179 = Math.min(this.field396, this.field400);
         Class243.field3138 = Math.min(this.field397, this.field414);
         this.field398 = (this.field396 - Class82.field1179) / 2;
         this.field411 = 0;
         this.field405.setSize(Class82.field1179, Class243.field3138);
         Class163.field2014 = new Class46(Class82.field1179, Class243.field3138, this.field405);
         if (var1 == this.field403) {
            Insets var3 = this.field403.getInsets();
            this.field405.setLocation(this.field398 + var3.left, var3.top + this.field411);
         } else {
            this.field405.setLocation(this.field398, this.field411);
         }

         this.field406 = true;
         this.vmethod1144();
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2141234055"
   )
   protected abstract void vmethod1144();

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1970135042"
   )
   void method776() {
      int var1 = this.field398;
      int var2 = this.field411;
      int var3 = this.field396 - Class82.field1179 - var1;
      int var4 = this.field397 - Class243.field3138 - var2;
      if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
         try {
            Container var5 = this.method799();
            int var6 = 0;
            int var7 = 0;
            if (var5 == this.field403) {
               Insets var8 = this.field403.getInsets();
               var6 = var8.left;
               var7 = var8.top;
            }

            Graphics var10 = var5.getGraphics();
            var10.setColor(Color.black);
            if (var1 > 0) {
               var10.fillRect(var6, var7, var1, this.field397);
            }

            if (var2 > 0) {
               var10.fillRect(var6, var7, this.field396, var2);
            }

            if (var3 > 0) {
               var10.fillRect(var6 + this.field396 - var3, var7, var3, this.field397);
            }

            if (var4 > 0) {
               var10.fillRect(var6, var7 + this.field397 - var4, this.field396, var4);
            }
         } catch (Exception var9) {
            ;
         }
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   final void method777() {
      Canvas var1 = this.field405;
      var1.removeKeyListener(Class39.field337);
      var1.removeFocusListener(Class39.field337);
      Class39.field329 = -1;
      Canvas var2 = this.field405;
      var2.removeMouseListener(Class48.field429);
      var2.removeMouseMotionListener(Class48.field429);
      var2.removeFocusListener(Class48.field429);
      Class48.field424 = 0;
      if (this.field407 != null) {
         this.field407.method668(this.field405);
      }

      this.method779();
      Canvas var3 = this.field405;
      var3.setFocusTraversalKeysEnabled(false);
      var3.addKeyListener(Class39.field337);
      var3.addFocusListener(Class39.field337);
      Canvas var4 = this.field405;
      var4.addMouseListener(Class48.field429);
      var4.addMouseMotionListener(Class48.field429);
      var4.addFocusListener(Class48.field429);
      if (this.field407 != null) {
         this.field407.method665(this.field405);
      }

      this.method784();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "1907342193"
   )
   protected final void method778(int var1, int var2, int var3) {
      try {
         if (field386 != null) {
            ++field387;
            if (field387 >= 3) {
               this.method788("alreadyloaded");
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         field386 = this;
         Class82.field1179 = var1;
         Class243.field3138 = var2;
         Class42.field362 = var3;
         Class152.field1938 = this;
         if (field392 == null) {
            field392 = new Class154();
         }

         field392.method3249(this, 1);
      } catch (Exception var5) {
         Class5.method65((String)null, var5);
         this.method788("crash");
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1647866935"
   )
   final synchronized void method779() {
      Container var1 = this.method799();
      if (this.field405 != null) {
         this.field405.removeFocusListener(this);
         var1.remove(this.field405);
      }

      Class82.field1179 = Math.max(var1.getWidth(), this.field395);
      Class243.field3138 = Math.max(var1.getHeight(), this.field402);
      Insets var2;
      if (this.field403 != null) {
         var2 = this.field403.getInsets();
         Class82.field1179 -= var2.right + var2.left;
         Class243.field3138 -= var2.bottom + var2.top;
      }

      this.field405 = new Class42(this);
      var1.add(this.field405);
      this.field405.setSize(Class82.field1179, Class243.field3138);
      this.field405.setVisible(true);
      this.field405.setBackground(Color.BLACK);
      if (var1 == this.field403) {
         var2 = this.field403.getInsets();
         this.field405.setLocation(var2.left + this.field398, var2.top + this.field411);
      } else {
         this.field405.setLocation(this.field398, this.field411);
      }

      this.field405.addFocusListener(this);
      this.field405.requestFocus();
      this.field406 = true;
      if (Class163.field2014 != null && Class82.field1179 == Class163.field2014.field3767 && Class243.field3138 == Class163.field2014.field3769) {
         ((Class46)Class163.field2014).method751(this.field405);
         Class163.field2014.vmethod5809(0, 0);
      } else {
         Class163.field2014 = new Class46(Class82.field1179, Class243.field3138, this.field405);
      }

      this.field409 = false;
      this.field410 = Class182.method3547();
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "375421429"
   )
   protected final boolean method774() {
      String var1 = this.getDocumentBase().getHost().toLowerCase();
      if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
         if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
            if (var1.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
                  var1 = var1.substring(0, var1.length() - 1);
               }

               if (var1.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.method788("invalidhost");
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2136042033"
   )
   void method781() {
      long var1 = Class182.method3547();
      long var3 = field404[Class20.field172];
      field404[Class20.field172] = var1;
      Class20.field172 = Class20.field172 + 1 & 31;
      if (0L != var3 && var1 > var3) {
         ;
      }

      synchronized(this) {
         Class18.field146 = field390;
      }

      this.vmethod1136();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "243481673"
   )
   void method782() {
      Container var1 = this.method799();
      long var2 = Class182.method3547();
      long var4 = field394[Class257.field3259];
      field394[Class257.field3259] = var2;
      Class257.field3259 = Class257.field3259 + 1 & 31;
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         field393 = ((var6 >> 1) + 32000) / var6;
      }

      if (++field413 - 1 > 50) {
         field413 -= 50;
         this.field406 = true;
         this.field405.setSize(Class82.field1179, Class243.field3138);
         this.field405.setVisible(true);
         if (var1 == this.field403) {
            Insets var7 = this.field403.getInsets();
            this.field405.setLocation(this.field398 + var7.left, this.field411 + var7.top);
         } else {
            this.field405.setLocation(this.field398, this.field411);
         }
      }

      if (this.field409) {
         this.method777();
      }

      this.method783();
      this.vmethod1137(this.field406);
      if (this.field406) {
         this.method776();
      }

      this.field406 = false;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-460416978"
   )
   final void method783() {
      Class310 var1 = this.method800();
      if (var1.field3747 != this.field396 || this.field397 != var1.field3745 || this.field408) {
         this.method854();
         this.field408 = false;
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   final void method784() {
      this.field408 = true;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-199508735"
   )
   final synchronized void method785() {
      if (!field389) {
         field389 = true;

         try {
            this.field405.removeFocusListener(this);
         } catch (Exception var5) {
            ;
         }

         try {
            this.vmethod1187();
         } catch (Exception var4) {
            ;
         }

         if (this.field403 != null) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
               ;
            }
         }

         if (field392 != null) {
            try {
               field392.method3256();
            } catch (Exception var2) {
               ;
            }
         }

         this.vmethod1132();
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1300111147"
   )
   protected abstract void vmethod1505();

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1052023991"
   )
   protected abstract void vmethod1136();

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "0"
   )
   protected abstract void vmethod1137(boolean var1);

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2060326728"
   )
   protected abstract void vmethod1187();

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;ZI)V",
      garbageValue = "490645637"
   )
   protected final void method796(int var1, String var2, boolean var3) {
      try {
         Graphics var4 = this.field405.getGraphics();
         if (Class154.field1961 == null) {
            Class154.field1961 = new Font("Helvetica", 1, 13);
            Class29.field256 = this.field405.getFontMetrics(Class154.field1961);
         }

         if (var3) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, Class82.field1179, Class243.field3138);
         }

         Color var5 = new Color(140, 17, 17);

         try {
            if (Class71.field1028 == null) {
               Class71.field1028 = this.field405.createImage(304, 34);
            }

            Graphics var6 = Class71.field1028.getGraphics();
            var6.setColor(var5);
            var6.drawRect(0, 0, 303, 33);
            var6.fillRect(2, 2, var1 * 3, 30);
            var6.setColor(Color.black);
            var6.drawRect(1, 1, 301, 31);
            var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
            var6.setFont(Class154.field1961);
            var6.setColor(Color.white);
            var6.drawString(var2, (304 - Class29.field256.stringWidth(var2)) / 2, 22);
            var4.drawImage(Class71.field1028, Class82.field1179 / 2 - 152, Class243.field3138 / 2 - 18, (ImageObserver)null);
         } catch (Exception var9) {
            int var7 = Class82.field1179 / 2 - 152;
            int var8 = Class243.field3138 / 2 - 18;
            var4.setColor(var5);
            var4.drawRect(var7, var8, 303, 33);
            var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(var7 + 1, var8 + 1, 301, 31);
            var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30);
            var4.setFont(Class154.field1961);
            var4.setColor(Color.white);
            var4.drawString(var2, var7 + (304 - Class29.field256.stringWidth(var2)) / 2, var8 + 22);
         }
      } catch (Exception var10) {
         this.field405.repaint();
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-82"
   )
   protected final void method842() {
      Class71.field1028 = null;
      Class154.field1961 = null;
      Class29.field256 = null;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1327956818"
   )
   protected void method788(String var1) {
      if (!this.field401) {
         this.field401 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
            ;
         }

      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(I)Ljava/awt/Container;",
      garbageValue = "-1235194173"
   )
   Container method799() {
      return (Container)(this.field403 != null ? this.field403 : this);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(B)Lkg;",
      garbageValue = "20"
   )
   Class310 method800() {
      Container var1 = this.method799();
      int var2 = Math.max(var1.getWidth(), this.field395);
      int var3 = Math.max(var1.getHeight(), this.field402);
      if (this.field403 != null) {
         Insets var4 = this.field403.getInsets();
         var2 -= var4.left + var4.right;
         var3 -= var4.top + var4.bottom;
      }

      return new Class310(var2, var3);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-997320713"
   )
   protected final boolean method801() {
      return this.field403 != null;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1676093665"
   )
   protected abstract void vmethod1132();

   public final void destroy() {
      if (this == field386 && !field389) {
         field388 = Class182.method3547();
         Class63.method1539(5000L);
         this.method785();
      }
   }

   public final synchronized void paint(Graphics var1) {
      if (this == field386 && !field389) {
         this.field406 = true;
         if (Class182.method3547() - this.field410 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (var2 == null || var2.width >= Class82.field1179 && var2.height >= Class243.field3138) {
               this.field409 = true;
            }
         }

      }
   }

   public void run() {
      try {
         if (Class154.field1960 != null) {
            String var1 = Class154.field1960.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = Class154.field1954;
               if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.method788("wrongjava");
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length(); ++var3) {
                     char var5 = var2.charAt(var3);
                     boolean var4 = var5 >= '0' && var5 <= '9';
                     if (!var4) {
                        break;
                     }
                  }

                  String var6 = var2.substring(6, var3);
                  if (Class102.method2249(var6)) {
                     int var9 = Class68.method1693(var6, 10, true);
                     if (var9 < 10) {
                        this.method788("wrongjava");
                        return;
                     }
                  }
               }

               field385 = 5;
            }
         }

         this.setFocusCycleRoot(true);
         this.method779();
         this.vmethod1505();
         Class43.field368 = Class43.method712();

         while(field388 == 0L || Class182.method3547() < field388) {
            Class8.field48 = Class43.field368.vmethod3331(field391, field385);

            for(int var7 = 0; var7 < Class8.field48; ++var7) {
               this.method781();
            }

            this.method782();
            this.method768(this.field405);
         }
      } catch (Exception var8) {
         Class5.method65((String)null, var8);
         this.method788("crash");
      }

      this.method785();
   }

   public final void start() {
      if (this == field386 && !field389) {
         field388 = 0L;
      }
   }

   public final void stop() {
      if (this == field386 && !field389) {
         field388 = Class182.method3547() + 4000L;
      }
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final void focusGained(FocusEvent var1) {
      field390 = true;
      this.field406 = true;
   }

   public final void focusLost(FocusEvent var1) {
      field390 = false;
   }

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public abstract void init();

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/net/Socket;IIB)Lfd;",
      garbageValue = "-82"
   )
   public static Class157 method911(Socket var0, int var1, int var2) throws IOException {
      return new Class159(var0, var1, var2);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(ILce;ZB)I",
      garbageValue = "-7"
   )
   static int method909(int var0, Class84 var1, boolean var2) {
      int var3 = -1;
      Class230 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = Class69.field999[--Class69.field1003];
         var4 = Class26.method434(var3);
      } else {
         var4 = var2 ? Class276.field3561 : Class260.field3301;
      }

      if (var0 == 1000) {
         Class69.field1003 -= 4;
         var4.field2607 = Class69.field999[Class69.field1003];
         var4.field2615 = Class69.field999[Class69.field1003 + 1];
         var4.field2610 = Class69.field999[Class69.field1003 + 2];
         var4.field2611 = Class69.field999[Class69.field1003 + 3];
         Class60.method1114(var4);
         Class182.field2334.method1152(var4);
         if (var3 != -1 && var4.field2721 == 0) {
            Class163.method3388(Class42.field366[var3 >> 16], var4, false);
         }

         return 1;
      } else if (var0 == 1001) {
         Class69.field1003 -= 4;
         var4.field2616 = Class69.field999[Class69.field1003];
         var4.field2617 = Class69.field999[Class69.field1003 + 1];
         var4.field2612 = Class69.field999[Class69.field1003 + 2];
         var4.field2624 = Class69.field999[Class69.field1003 + 3];
         Class60.method1114(var4);
         Class182.field2334.method1152(var4);
         if (var3 != -1 && var4.field2721 == 0) {
            Class163.method3388(Class42.field366[var3 >> 16], var4, false);
         }

         return 1;
      } else if (var0 == 1003) {
         boolean var5 = Class69.field999[--Class69.field1003] == 1;
         if (var5 != var4.field2625) {
            var4.field2625 = var5;
            Class60.method1114(var4);
         }

         return 1;
      } else if (var0 == 1005) {
         var4.field2648 = Class69.field999[--Class69.field1003] == 1;
         return 1;
      } else if (var0 == 1006) {
         var4.field2740 = Class69.field999[--Class69.field1003] == 1;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "670224222"
   )
   static void method910() {
      Iterator var0 = Class83.field1181.iterator();

      while(var0.hasNext()) {
         Class58 var1 = (Class58)var0.next();
         var1.method1042();
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "0"
   )
   public static final void method913(int var0, int var1) {
      Class120.field1648 = var0;
      Class120.field1649 = var1;
      Class120.field1650 = true;
      Class120.field1656 = 0;
      Class120.field1652 = false;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "794717505"
   )
   static int method914(int var0, Class84 var1, boolean var2) {
      Class230 var3 = var2 ? Class276.field3561 : Class260.field3301;
      if (var0 == 1800) {
         Class69.field999[++Class69.field1003 - 1] = Class154.method3252(Class24.method425(var3));
         return 1;
      } else if (var0 != 1801) {
         if (var0 == 1802) {
            if (var3.field2679 == null) {
               Class69.field1001[++Class55.field497 - 1] = "";
            } else {
               Class69.field1001[++Class55.field497 - 1] = var3.field2679;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = Class69.field999[--Class69.field1003];
         --var4;
         if (var3.field2680 != null && var4 < var3.field2680.length && var3.field2680[var4] != null) {
            Class69.field1001[++Class55.field497 - 1] = var3.field2680[var4];
         } else {
            Class69.field1001[++Class55.field497 - 1] = "";
         }

         return 1;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "([BI)[B",
      garbageValue = "-1083003215"
   )
   static final byte[] method912(byte[] var0) {
      Class182 var1 = new Class182(var0);
      int var2 = var1.readUnsignedByte();
      int var3 = var1.method3671();
      if (var3 < 0 || Class247.field3176 != 0 && var3 > Class247.field3176) {
         throw new RuntimeException();
      } else if (var2 == 0) {
         byte[] var4 = new byte[var3];
         var1.method3539(var4, 0, var3);
         return var4;
      } else {
         int var6 = var1.method3671();
         if (var6 >= 0 && (Class247.field3176 == 0 || var6 <= Class247.field3176)) {
            byte[] var5 = new byte[var6];
            if (var2 == 1) {
               Class176.method3489(var5, var6, var0, var3, 9);
            } else {
               Class247.field3172.method3483(var1, var5);
            }

            return var5;
         } else {
            throw new RuntimeException();
         }
      }
   }
}
