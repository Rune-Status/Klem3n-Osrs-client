package com.client;
import java.io.IOException;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
public class Class36 {
   @ObfuscatedName("pj")
   @ObfuscatedSignature(
      signature = "Lca;"
   )
   static Class88 field310;
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "Llm;"
   )
   static Class322 field306;
   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static Class249 field312;
   @ObfuscatedName("fz")
   @ObfuscatedSignature(
      signature = "[Lll;"
   )
   static Class318[] field314;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 975450249
   )
   public int field307;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lha;"
   )
   public Class226 field311;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lha;"
   )
   public Class226 field308;

   @ObfuscatedSignature(
      signature = "(ILha;Lha;)V"
   )
   public Class36(int var1, Class226 var2, Class226 var3) {
      this.field307 = var1;
      this.field311 = var2;
      this.field308 = var3;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lfd;ZI)V",
      garbageValue = "-2121353984"
   )
   public static void method633(Class157 var0, boolean var1) {
      if (Class250.field3200 != null) {
         try {
            Class250.field3200.vmethod3346();
         } catch (Exception var6) {
            ;
         }

         Class250.field3200 = null;
      }

      Class250.field3200 = var0;
      Class222.method4410(var1);
      Class250.field3209.field2339 = 0;
      Class250.field3208 = null;
      Class301.field3713 = null;
      Class250.field3210 = 0;

      while(true) {
         Class246 var2 = (Class246)Class250.field3199.method4018();
         if (var2 == null) {
            while(true) {
               var2 = (Class246)Class250.field3206.method4018();
               if (var2 == null) {
                  if (Class250.field3213 != 0) {
                     try {
                        Class182 var7 = new Class182(4);
                        var7.method3532(4);
                        var7.method3532(Class250.field3213);
                        var7.method3755(0);
                        Class250.field3200.vmethod3347(var7.payload, 0, 4);
                     } catch (IOException var5) {
                        try {
                           Class250.field3200.vmethod3346();
                        } catch (Exception var4) {
                           ;
                        }

                        ++Class250.field3215;
                        Class250.field3200 = null;
                     }
                  }

                  Class250.field3197 = 0;
                  Class250.field3203 = Class182.method3547();
                  return;
               }

               Class250.field3202.method3908(var2);
               Class250.field3204.method4016(var2, var2.field2421);
               ++Class250.field3205;
               --Class250.field3207;
            }
         }

         Class250.field3212.method4016(var2, var2.field2421);
         ++Class250.field3211;
         --Class250.field3198;
      }
   }

   @ObfuscatedName("fn")
   @ObfuscatedSignature(
      signature = "(Lhi;III)V",
      garbageValue = "-201841471"
   )
   static final void method632(Class230 var0, int var1, int var2) {
      if (Client.field810 == 0 || Client.field810 == 3) {
         if (Class48.field431 == 1 || !Class253.field3229 && Class48.field431 == 4) {
            Class224 var3 = var0.method4517(true);
            if (var3 == null) {
               return;
            }

            int var4 = Class48.field432 - var1;
            int var5 = Class48.field428 - var2;
            if (var3.method4423(var4, var5)) {
               var4 -= var3.field2553 / 2;
               var5 -= var3.field2549 / 2;
               int var6 = Client.field717 & 2047;
               int var7 = Class122.field1681[var6];
               int var8 = Class122.field1693[var6];
               int var9 = var5 * var7 + var4 * var8 >> 11;
               int var10 = var8 * var5 - var4 * var7 >> 11;
               int var11 = var9 + Class138.field1876.field931 >> 7;
               int var12 = Class138.field1876.field881 - var10 >> 7;
               Class172 var13 = Class26.method433(Class169.field2135, Client.field626.field1218);
               var13.field2257.method3532(18);
               var13.field2257.method3755(var11 + Class62.field868);
               var13.field2257.method3575(Class39.field341[82] ? (Class39.field341[81] ? 2 : 1) : 0);
               var13.field2257.method3582(var12 + Client.field754);
               var13.field2257.method3532(var4);
               var13.field2257.method3532(var5);
               var13.field2257.method3755(Client.field717);
               var13.field2257.method3532(57);
               var13.field2257.method3532(0);
               var13.field2257.method3532(0);
               var13.field2257.method3532(89);
               var13.field2257.method3755(Class138.field1876.field931);
               var13.field2257.method3755(Class138.field1876.field881);
               var13.field2257.method3532(63);
               Client.field626.method1980(var13);
               Client.field808 = var11;
               Client.field809 = var12;
            }
         }

      }
   }
}
