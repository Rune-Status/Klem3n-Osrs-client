package com.client;
import java.util.Iterator;
import java.util.LinkedList;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public class Class20 {
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 589485321
   )
   static int field172;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -569300431
   )
   int field170 = -1;
   @ObfuscatedName("w")
   String field161;
   @ObfuscatedName("s")
   String field171;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 332294683
   )
   int field163 = -1;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -851588879
   )
   int field164 = -1;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lha;"
   )
   Class226 field165 = null;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1049310257
   )
   int field166 = Integer.MAX_VALUE;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1487084263
   )
   int field167 = 0;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1973252047
   )
   int field168 = Integer.MAX_VALUE;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1303313193
   )
   int field162 = 0;
   @ObfuscatedName("p")
   boolean field173 = false;
   @ObfuscatedName("b")
   LinkedList field160;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "1965636190"
   )
   public void method200(Class182 var1, int var2) {
      this.field170 = var2;
      this.field161 = var1.method3738();
      this.field171 = var1.method3738();
      this.field165 = new Class226(var1.method3671());
      this.field163 = var1.method3671();
      var1.method3544();
      this.field173 = var1.method3544() == 1;
      this.field164 = var1.method3544();
      int var3 = var1.method3544();
      this.field160 = new LinkedList();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field160.add(this.method201(var1));
      }

      this.method206();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgk;I)Las;",
      garbageValue = "2074726298"
   )
   Class31 method201(Class182 var1) {
      int var2 = var1.method3544();
      Class15 var3 = (Class15)Class76.method1803(Class15.method145(), var2);
      Object var4 = null;
      switch(var3.field110) {
      case 0:
         var4 = new Class14();
         break;
      case 1:
         var4 = new Class37();
         break;
      case 2:
         var4 = new Class18();
         break;
      case 3:
         var4 = new Class27();
         break;
      default:
         throw new IllegalStateException("");
      }

      ((Class31)var4).vmethod639(var1);
      return (Class31)var4;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIIB)Z",
      garbageValue = "8"
   )
   public boolean method202(int var1, int var2, int var3) {
      Iterator var4 = this.field160.iterator();

      Class31 var5;
      do {
         if (!var4.hasNext()) {
            return false;
         }

         var5 = (Class31)var4.next();
      } while(!var5.vmethod636(var1, var2, var3));

      return true;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "1006376583"
   )
   public boolean method203(int var1, int var2) {
      int var3 = var1 / 64;
      int var4 = var2 / 64;
      if (var3 >= this.field166 && var3 <= this.field167) {
         if (var4 >= this.field168 && var4 <= this.field162) {
            Iterator var5 = this.field160.iterator();

            Class31 var6;
            do {
               if (!var5.hasNext()) {
                  return false;
               }

               var6 = (Class31)var5.next();
            } while(!var6.vmethod637(var1, var2));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IIIB)[I",
      garbageValue = "-19"
   )
   public int[] method213(int var1, int var2, int var3) {
      Iterator var4 = this.field160.iterator();

      Class31 var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (Class31)var4.next();
      } while(!var5.vmethod636(var1, var2, var3));

      return var5.vmethod638(var1, var2, var3);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(III)Lha;",
      garbageValue = "-2056689977"
   )
   public Class226 method205(int var1, int var2) {
      Iterator var3 = this.field160.iterator();

      Class31 var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (Class31)var3.next();
      } while(!var4.vmethod637(var1, var2));

      return var4.vmethod659(var1, var2);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1897199586"
   )
   void method206() {
      Iterator var1 = this.field160.iterator();

      while(var1.hasNext()) {
         Class31 var2 = (Class31)var1.next();
         var2.vmethod635(this);
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-31"
   )
   public int method207() {
      return this.field170;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-8"
   )
   public boolean method208() {
      return this.field173;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "210931606"
   )
   public String method209() {
      return this.field161;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1948906738"
   )
   public String method210() {
      return this.field171;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "118"
   )
   int method211() {
      return this.field163;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "57"
   )
   public int method212() {
      return this.field164;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-162318051"
   )
   public int method258() {
      return this.field166;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2125416250"
   )
   public int method214() {
      return this.field167;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "308300610"
   )
   public int method247() {
      return this.field168;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "255269420"
   )
   public int method249() {
      return this.field162;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1363563177"
   )
   public int method217() {
      return this.field165.field2564;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "825438900"
   )
   public int method218() {
      return this.field165.field2567;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-108"
   )
   public int method219() {
      return this.field165.field2565;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)Lha;",
      garbageValue = "-1421911827"
   )
   public Class226 method256() {
      return new Class226(this.field165);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)[Liz;",
      garbageValue = "-4"
   )
   public static Class242[] method216() {
      return new Class242[]{Class242.field3125, Class242.field3118, Class242.field3121, Class242.field3120, Class242.field3122, Class242.field3119};
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)J",
      garbageValue = "-1525705371"
   )
   public static long method262(int var0) {
      return Class120.field1647[var0];
   }

   @ObfuscatedName("gd")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2118827798"
   )
   static boolean method260() {
      return (Client.field658 & 4) != 0;
   }

   @ObfuscatedName("jt")
   @ObfuscatedSignature(
      signature = "(Lbj;ZI)V",
      garbageValue = "1846472560"
   )
   static final void method261(Class55 var0, boolean var1) {
      int var2 = var0.field501;
      int var3 = (int)var0.field2421;
      var0.method4064();
      if (var1) {
         Class66.method1622(var2);
      }

      Class130.method3077(var2);
      Class230 var4 = Class26.method434(var3);
      if (var4 != null) {
         Class60.method1114(var4);
      }

      Class170.method3448();
      if (Client.field683 != -1) {
         int var5 = Client.field683;
         if (Class261.method4931(var5)) {
            Class83.method1923(Class42.field366[var5], 1);
         }
      }

   }
}
