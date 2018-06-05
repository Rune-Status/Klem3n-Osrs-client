package com.client;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
public class Class23 {
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   static Class201 field188 = new Class201(37748736, 256);
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   static Class201 field189 = new Class201(256, 256);
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Lha;"
   )
   static final Class226 field193 = new Class226();
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1247610435
   )
   int field191;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1988652209
   )
   int field192;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lp;"
   )
   Class10 field197;
   @ObfuscatedName("b")
   LinkedList field195;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1028613213
   )
   int field194;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1441464419
   )
   int field187;
   @ObfuscatedName("g")
   List field196;
   @ObfuscatedName("m")
   HashMap field199;
   @ObfuscatedName("r")
   final HashMap field198;

   Class23(int var1, int var2, int var3, HashMap var4) {
      this.field191 = var1;
      this.field192 = var2;
      this.field195 = new LinkedList();
      this.field196 = new LinkedList();
      this.field199 = new HashMap();
      this.field194 = var3 | -16777216;
      this.field198 = var4;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IIIS)V",
      garbageValue = "-4430"
   )
   void method314(int var1, int var2, int var3) {
      int var5 = this.field191;
      int var6 = this.field192;
      int var7 = this.field187;
      Class318 var4 = (Class318)field188.method3997(Class43.method716(var5, var6, var7));
      if (var4 != null) {
         if (var3 == this.field187 * 64) {
            var4.method5849(var1, var2);
         } else {
            var4.method5872(var1, var2, var3, var3);
         }

      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lp;Ljava/util/List;I)V",
      garbageValue = "-463048404"
   )
   void method400(Class10 var1, List var2) {
      this.field199.clear();
      this.field197 = var1;
      this.method294(0, 0, 64, 64, this.field197);
      this.method289(var2);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;Ljava/util/List;B)V",
      garbageValue = "89"
   )
   void method287(HashSet var1, List var2) {
      this.field199.clear();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Class34 var4 = (Class34)var3.next();
         if (var4.method149() == this.field191 && var4.method168() == this.field192) {
            this.field195.add(var4);
            this.method294(var4.method565() * 8, var4.method563() * 8, 8, 8, var4);
         }
      }

      this.method289(var2);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIILr;I)V",
      garbageValue = "-1457555663"
   )
   void method294(int var1, int var2, int var3, int var4, Class16 var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         label55:
         for(int var7 = var2; var7 < var2 + var4; ++var7) {
            Class226 var8 = new Class226(0, var6, var7);

            for(int var9 = 0; var9 < var5.field121; ++var9) {
               Class19[] var10 = var5.field126[var9][var6][var7];
               if (var10 != null && var10.length != 0) {
                  Class19[] var11 = var10;

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     Class19 var13 = var11[var12];
                     Class255 var14 = this.method348(var13.field158);
                     if (var14 != null) {
                        Class226 var15 = new Class226(var9, this.field191 * 64 + var6, this.field192 * 64 + var7);
                        Class226 var16 = null;
                        if (this.field197 != null) {
                           var16 = new Class226(this.field197.field120 + var9, var6 + this.field197.field127 * 64, var7 + this.field197.field117 * 64);
                        } else {
                           Class34 var17 = (Class34)var5;
                           var16 = new Class226(var9 + var17.field120, var6 + var17.field127 * 64 + var17.method584() * 8, var17.field117 * 64 + var7 + var17.method564() * 8);
                        }

                        Class28 var18 = new Class28(var14.field3238, var16, var15, this.method318(var14));
                        this.field199.put(var8, var18);
                        continue label55;
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ljava/util/List;B)V",
      garbageValue = "-10"
   )
   void method289(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         Class13 var3 = (Class13)var2.next();
         if (var3.field88.field2564 >> 6 == this.field191 && var3.field88.field2565 >> 6 == this.field192) {
            Class28 var4 = new Class28(var3.field83, var3.field88, var3.field88, this.method306(var3.field83));
            this.field196.add(var4);
         }
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(ILai;[Lh;[Lly;I)V",
      garbageValue = "2109575831"
   )
   void method290(int var1, Class35 var2, Class23[] var3, Class317[] var4) {
      this.field187 = var1;
      if (this.field197 != null || !this.field195.isEmpty()) {
         int var6 = this.field191;
         int var7 = this.field192;
         Class318 var5 = (Class318)field188.method3997(Class43.method716(var6, var7, var1));
         if (var5 == null) {
            Class21 var8 = this.method297(this.field191, this.field192, var3);
            Class318 var9 = new Class318(this.field187 * 64, this.field187 * 64);
            var9.method5850();
            if (this.field197 != null) {
               this.method293(var2, var3, var4, var8);
            } else {
               this.method373(var2, var4, var8);
            }

            Class172.method3458(var9, this.field191, this.field192, this.field187);
         }
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(IIILjava/util/HashSet;I)V",
      garbageValue = "1346650712"
   )
   void method382(int var1, int var2, int var3, HashSet var4) {
      if (var4 == null) {
         var4 = new HashSet();
      }

      this.method380(var1, var2, var4, var3);
      this.method337(var1, var2, var4, var3);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;III)V",
      garbageValue = "476011751"
   )
   void method311(HashSet var1, int var2, int var3) {
      Iterator var4 = this.field199.values().iterator();

      while(var4.hasNext()) {
         Class28 var5 = (Class28)var4.next();
         if (var1.contains(var5.field240)) {
            Class255 var6 = Class255.field3246[var5.field240];
            this.method307(var6, var5.field235, var5.field245, var2, var3);
         }
      }

      this.method309(var1, var2, var3);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lai;[Lh;[Lly;Lj;I)V",
      garbageValue = "-488045984"
   )
   void method293(Class35 var1, Class23[] var2, Class317[] var3, Class21 var4) {
      int var5;
      int var6;
      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method320(var5, var6, this.field197, var1, var4);
            this.method296(var5, var6, this.field197, var1);
         }
      }

      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method295(var5, var6, this.field197, var1, var3);
         }
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lai;[Lly;Lj;B)V",
      garbageValue = "-48"
   )
   void method373(Class35 var1, Class317[] var2, Class21 var3) {
      Iterator var4 = this.field195.iterator();

      Class34 var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (Class34)var4.next();

         for(var6 = var5.method565() * 8; var6 < var5.method565() * 8 + 8; ++var6) {
            for(var7 = var5.method563() * 8; var7 < var5.method563() * 8 + 8; ++var7) {
               this.method320(var6, var7, var5, var1, var3);
               this.method296(var6, var7, var5, var1);
            }
         }
      }

      var4 = this.field195.iterator();

      while(var4.hasNext()) {
         var5 = (Class34)var4.next();

         for(var6 = var5.method565() * 8; var6 < var5.method565() * 8 + 8; ++var6) {
            for(var7 = var5.method563() * 8; var7 < var5.method563() * 8 + 8; ++var7) {
               this.method295(var6, var7, var5, var1, var2);
            }
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IILr;Lai;[Lly;I)V",
      garbageValue = "1267553766"
   )
   void method295(int var1, int var2, Class16 var3, Class35 var4, Class317[] var5) {
      this.method304(var1, var2, var3);
      this.method406(var1, var2, var3, var5);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IILr;Lai;Lj;I)V",
      garbageValue = "126232194"
   )
   void method320(int var1, int var2, Class16 var3, Class35 var4, Class21 var5) {
      int var6 = var3.field125[0][var1][var2] - 1;
      int var7 = var3.field123[0][var1][var2] - 1;
      if (var6 == -1 && var7 == -1) {
         Class314.method5763(this.field187 * var1, this.field187 * (63 - var2), this.field187, this.field187, this.field194);
      }

      int var8 = 16711935;
      if (var7 != -1) {
         var8 = Class6.method69(var7, this.field194);
      }

      if (var7 > -1 && var3.field124[0][var1][var2] == 0) {
         Class314.method5763(this.field187 * var1, this.field187 * (63 - var2), this.field187, this.field187, var8);
      } else {
         int var9 = this.method302(var1, var2, var3, var5);
         if (var7 == -1) {
            Class314.method5763(this.field187 * var1, this.field187 * (63 - var2), this.field187, this.field187, var9);
         } else {
            var4.method606(this.field187 * var1, this.field187 * (63 - var2), var9, var8, this.field187, this.field187, var3.field124[0][var1][var2], var3.field116[0][var1][var2]);
         }
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(IILr;Lai;I)V",
      garbageValue = "1017441024"
   )
   void method296(int var1, int var2, Class16 var3, Class35 var4) {
      for(int var5 = 1; var5 < var3.field121; ++var5) {
         int var6 = var3.field123[var5][var1][var2] - 1;
         if (var6 > -1) {
            int var7 = Class6.method69(var6, this.field194);
            if (var3.field124[var5][var1][var2] == 0) {
               Class314.method5763(this.field187 * var1, this.field187 * (63 - var2), this.field187, this.field187, var7);
            } else {
               var4.method606(this.field187 * var1, this.field187 * (63 - var2), 0, var7, this.field187, this.field187, var3.field124[var5][var1][var2], var3.field116[var5][var1][var2]);
            }
         }
      }

   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(II[Lh;I)Lj;",
      garbageValue = "-1376488982"
   )
   Class21 method297(int var1, int var2, Class23[] var3) {
      Class21 var4 = (Class21)field189.method3997(Class43.method716(var1, var2, 0));
      Class21 var5 = var4;
      if (var4 == null) {
         var5 = this.method298(var3);
         Class12.method104(var5, var1, var2);
      }

      return var5;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "([Lh;B)Lj;",
      garbageValue = "6"
   )
   Class21 method298(Class23[] var1) {
      Class32 var2 = new Class32(64, 64);
      if (this.field197 != null) {
         this.method300(0, 0, 64, 64, this.field197, var2);
      } else {
         Iterator var3 = this.field195.iterator();

         while(var3.hasNext()) {
            Class34 var4 = (Class34)var3.next();
            this.method300(var4.method565() * 8, var4.method563() * 8, 8, 8, var4, var2);
         }
      }

      this.method299(var1, var2);
      Class21 var5 = new Class21();
      var5.method265(var2);
      return var5;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([Lh;Lan;I)V",
      garbageValue = "1463076234"
   )
   void method299(Class23[] var1, Class32 var2) {
      Class240[] var3 = Class9.method85();
      Class240[] var4 = var3;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         Class240 var6 = var4[var5];
         if (var1[var6.vmethod5815()] != null) {
            byte var7 = 0;
            byte var8 = 0;
            byte var9 = 64;
            byte var10 = 64;
            byte var11 = 0;
            byte var12 = 0;
            switch(var6.field3104) {
            case 0:
               var8 = 59;
               var10 = 5;
               var11 = 59;
               var9 = 5;
               break;
            case 1:
               var11 = 59;
               var9 = 5;
               break;
            case 2:
               var12 = 59;
               var10 = 5;
               var7 = 59;
               var9 = 5;
               break;
            case 3:
               var8 = 59;
               var10 = 5;
               break;
            case 4:
               var11 = 59;
               var12 = 59;
               var9 = 5;
               var10 = 5;
               break;
            case 5:
               var8 = 59;
               var10 = 5;
               var7 = 59;
               var9 = 5;
               break;
            case 6:
               var12 = 59;
               var10 = 5;
               break;
            case 7:
               var7 = 59;
               var9 = 5;
            }

            this.method301(var11, var12, var7, var8, var9, var10, var1[var6.vmethod5815()], var2);
         }
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(IIIILr;Lan;I)V",
      garbageValue = "1938287225"
   )
   void method300(int var1, int var2, int var3, int var4, Class16 var5, Class32 var6) {
      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         for(int var8 = var2; var8 < var2 + var4; ++var8) {
            int var9 = var5.field125[0][var7][var8] - 1;
            if (var9 != -1) {
               Class259 var10 = Class49.method953(var9);
               var6.method541(var7, var8, 5, var10);
            }
         }
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IIIIIILh;Lan;I)V",
      garbageValue = "2106846136"
   )
   void method301(int var1, int var2, int var3, int var4, int var5, int var6, Class23 var7, Class32 var8) {
      for(int var9 = 0; var9 < var5; ++var9) {
         for(int var10 = 0; var10 < var6; ++var10) {
            int var11 = var7.method322(var9 + var1, var10 + var2);
            if (var11 != -1) {
               Class259 var12 = Class49.method953(var11);
               var8.method541(var3 + var9, var10 + var4, 5, var12);
            }
         }
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(IILr;Lj;I)I",
      garbageValue = "-2041354337"
   )
   int method302(int var1, int var2, Class16 var3, Class21 var4) {
      return var3.field125[0][var1][var2] == 0 ? this.field194 : var4.method272(var1, var2);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(IILr;[Lly;I)V",
      garbageValue = "-1488997280"
   )
   void method406(int var1, int var2, Class16 var3, Class317[] var4) {
      for(int var5 = 0; var5 < var3.field121; ++var5) {
         Class19[] var6 = var3.field126[var5][var1][var2];
         if (var6 != null && var6.length != 0) {
            Class19[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               Class19 var9 = var7[var8];
               if (!Class152.method3247(var9.field155)) {
                  int var11 = var9.field155;
                  boolean var10 = var11 == Class233.field2776.field2777;
                  if (!var10) {
                     continue;
                  }
               }

               Class268 var12 = Class110.method2527(var9.field158);
               if (var12.field3415 != -1) {
                  if (var12.field3415 != 46 && var12.field3415 != 52) {
                     var4[var12.field3415].method5825(this.field187 * var1, this.field187 * (63 - var2), this.field187 * 2, this.field187 * 2);
                  } else {
                     var4[var12.field3415].method5825(this.field187 * var1, this.field187 * (63 - var2), this.field187 * 2 + 1, this.field187 * 2 + 1);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(IILr;B)V",
      garbageValue = "-83"
   )
   void method304(int var1, int var2, Class16 var3) {
      for(int var4 = 0; var4 < var3.field121; ++var4) {
         Class19[] var5 = var3.field126[var4][var1][var2];
         if (var5 != null && var5.length != 0) {
            Class19[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               Class19 var8 = var6[var7];
               if (Class129.method3073(var8.field155)) {
                  Class268 var9 = Class110.method2527(var8.field158);
                  int var10 = var9.field3388 != 0 ? -3407872 : -3355444;
                  if (var8.field155 == Class233.field2773.field2777) {
                     this.method321(var1, var2, var8.field157, var10);
                  }

                  if (var8.field155 == Class233.field2755.field2777) {
                     this.method321(var1, var2, var8.field157, -3355444);
                     this.method321(var1, var2, var8.field157 + 1, var10);
                  }

                  if (var8.field155 == Class233.field2757.field2777) {
                     if (var8.field157 == 0) {
                        Class314.method5736(this.field187 * var1, this.field187 * (63 - var2), 1, var10);
                     }

                     if (var8.field157 == 1) {
                        Class314.method5736(this.field187 * var1 + this.field187 - 1, this.field187 * (63 - var2), 1, var10);
                     }

                     if (var8.field157 == 2) {
                        Class314.method5736(this.field187 * var1 + this.field187 - 1, this.field187 * (63 - var2) + this.field187 - 1, 1, var10);
                     }

                     if (var8.field157 == 3) {
                        Class314.method5736(this.field187 * var1, this.field187 * (63 - var2) + this.field187 - 1, 1, var10);
                     }
                  }

                  if (var8.field155 == Class233.field2758.field2777) {
                     int var11 = var8.field157 % 2;
                     int var12;
                     if (var11 == 0) {
                        for(var12 = 0; var12 < this.field187; ++var12) {
                           Class314.method5736(var12 + this.field187 * var1, (64 - var2) * this.field187 - 1 - var12, 1, var10);
                        }
                     } else {
                        for(var12 = 0; var12 < this.field187; ++var12) {
                           Class314.method5736(var12 + this.field187 * var1, var12 + this.field187 * (63 - var2), 1, var10);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(IILjava/util/HashSet;IB)V",
      garbageValue = "-22"
   )
   void method380(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.field199.entrySet().iterator();

      while(var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         Class226 var9 = (Class226)var8.getKey();
         int var10 = (int)((float)var9.field2564 * var5 + (float)var1 - var6);
         int var11 = (int)((float)(var2 + var4) - (float)var9.field2565 * var5 - var6);
         Class28 var12 = (Class28)var8.getValue();
         if (var12 != null) {
            var12.field235 = var10;
            var12.field245 = var11;
            Class255 var13 = Class255.field3246[var12.field240];
            if (!var3.contains(var13.method4821())) {
               this.method308(var12, var10, var11, var5);
            }
         }
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;III)V",
      garbageValue = "1896087870"
   )
   void method309(HashSet var1, int var2, int var3) {
      Iterator var4 = this.field196.iterator();

      while(var4.hasNext()) {
         Class28 var5 = (Class28)var4.next();
         Class255 var6 = Class255.field3246[var5.field240];
         if (var6 != null && var1.contains(var6.method4821())) {
            this.method307(var6, var5.field235, var5.field245, var2, var3);
         }
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(Lie;IIIII)V",
      garbageValue = "112631536"
   )
   void method307(Class255 var1, int var2, int var3, int var4, int var5) {
      Class318 var6 = var1.method4815(false);
      if (var6 != null) {
         var6.method5851(var2 - var6.field3787 / 2, var3 - var6.field3788 / 2);
         if (var4 % var5 < var5 / 2) {
            Class314.method5784(var2, var3, 15, 16776960, 128);
            Class314.method5784(var2, var3, 7, 16777215, 256);
         }

      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lab;IIFI)V",
      garbageValue = "-1276060102"
   )
   void method308(Class28 var1, int var2, int var3, float var4) {
      Class255 var5 = Class255.field3246[var1.field240];
      this.method317(var5, var2, var3);
      this.method362(var1, var5, var2, var3, var4);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(Lie;III)V",
      garbageValue = "-1923264171"
   )
   void method317(Class255 var1, int var2, int var3) {
      Class318 var4 = var1.method4815(false);
      if (var4 != null) {
         int var5 = this.method288(var4, var1.field3252);
         int var6 = this.method284(var4, var1.field3253);
         var4.method5851(var5 + var2, var3 + var6);
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(Lab;Lie;IIFB)V",
      garbageValue = "1"
   )
   void method362(Class28 var1, Class255 var2, int var3, int var4, float var5) {
      if (var1.field246 != null) {
         if (var1.field246.field181.method103(var5)) {
            Class298 var6 = (Class298)this.field198.get(var1.field246.field181);
            var6.method5526(var1.field246.field186, var3 - var1.field246.field184 / 2, var4, var1.field246.field184, var1.field246.field182, -16777216 | var2.field3242, 0, 1, 0, var6.field3695 / 2);
         }
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(IILjava/util/HashSet;IB)V",
      garbageValue = "-39"
   )
   void method337(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      Iterator var6 = this.field196.iterator();

      while(var6.hasNext()) {
         Class28 var7 = (Class28)var6.next();
         int var8 = var7.field236.field2564 % 64;
         int var9 = var7.field236.field2565 % 64;
         var7.field235 = (int)((float)var1 + var5 * (float)var8);
         var7.field245 = (int)(var5 * (float)(63 - var9) + (float)var2);
         if (!var3.contains(var7.field240)) {
            this.method308(var7, var7.field235, var7.field245, var5);
         }
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "3"
   )
   void method340() {
      if (this.field197 != null) {
         for(int var1 = 0; var1 < 64; ++var1) {
            for(int var2 = 0; var2 < 64; ++var2) {
               this.method313(var1, var2, this.field197);
            }
         }
      } else {
         Iterator var5 = this.field195.iterator();

         while(var5.hasNext()) {
            Class34 var6 = (Class34)var5.next();

            for(int var3 = var6.method565() * 8; var3 < var6.method565() * 8 + 8; ++var3) {
               for(int var4 = var6.method563() * 8; var4 < var6.method563() * 8 + 8; ++var4) {
                  this.method313(var3, var4, var6);
               }
            }
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(IILr;I)V",
      garbageValue = "602031848"
   )
   void method313(int var1, int var2, Class16 var3) {
      field193.method4436(0, var1, var2);

      for(int var4 = 0; var4 < var3.field121; ++var4) {
         Class19[] var5 = var3.field126[var4][var1][var2];
         if (var5 != null && var5.length != 0) {
            Class19[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               Class19 var8 = var6[var7];
               Class255 var9 = this.method348(var8.field158);
               if (var9 != null) {
                  Class28 var10 = (Class28)this.field199.get(field193);
                  if (var10 != null) {
                     if (var10.field240 != var9.field3238) {
                        Class28 var16 = new Class28(var9.field3238, var10.field243, var10.field236, this.method318(var9));
                        this.field199.put(new Class226(field193), var16);
                        var10 = var16;
                     }

                     int var15 = var10.field243.field2567 - var10.field236.field2567;
                     var10.field236.field2567 = var4;
                     var10.field243.field2567 = var15 + var4;
                     return;
                  }

                  Class226 var11 = new Class226(var4, this.field191 * 64 + var1, this.field192 * 64 + var2);
                  Class226 var12 = null;
                  if (this.field197 != null) {
                     var12 = new Class226(this.field197.field120 + var4, this.field197.field127 * 64 + var1, var2 + this.field197.field117 * 64);
                  } else {
                     Iterator var13 = this.field195.iterator();

                     while(var13.hasNext()) {
                        Class34 var14 = (Class34)var13.next();
                        if (var14.method562(var1, var2)) {
                           var12 = new Class226(var4 + var14.field120, var1 + var14.field127 * 64 + var14.method584() * 8, var2 + var14.field117 * 64 + var14.method564() * 8);
                           break;
                        }
                     }
                  }

                  if (var12 != null) {
                     var10 = new Class28(var9.field3238, var12, var11, this.method318(var9));
                     this.field199.put(new Class226(field193), var10);
                     return;
                  }
               }
            }
         }
      }

      this.field199.remove(field193);
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(Lll;Ljd;I)I",
      garbageValue = "624399097"
   )
   int method288(Class318 var1, Class270 var2) {
      switch(var2.field3482) {
      case 0:
         return -var1.field3787 / 2;
      case 1:
         return 0;
      default:
         return -var1.field3787;
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(Lll;Lis;I)I",
      garbageValue = "105388050"
   )
   int method284(Class318 var1, Class252 var2) {
      switch(var2.field3223) {
      case 1:
         return -var1.field3788 / 2;
      case 2:
         return 0;
      default:
         return -var1.field3788;
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(II)Lie;",
      garbageValue = "764273111"
   )
   Class255 method348(int var1) {
      Class268 var2 = Class110.method2527(var1);
      if (var2.field3410 != null) {
         var2 = var2.method5056();
         if (var2 == null) {
            return null;
         }
      }

      return var2.field3397 != -1 ? Class255.field3246[var2.field3397] : null;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(II)Ld;",
      garbageValue = "1836375512"
   )
   Class22 method306(int var1) {
      Class255 var2 = Class255.field3246[var1];
      return this.method318(var2);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(Lie;I)Ld;",
      garbageValue = "1728647620"
   )
   Class22 method318(Class255 var1) {
      if (var1.field3241 != null && this.field198 != null && this.field198.get(Class12.field70) != null) {
         Class12 var2 = Class12.method101(var1.field3243);
         if (var2 == null) {
            return null;
         } else {
            Class298 var3 = (Class298)this.field198.get(var2);
            if (var3 == null) {
               return null;
            } else {
               int var4 = var3.method5520(var1.field3241, 1000000);
               String[] var5 = new String[var4];
               var3.method5518(var1.field3241, (int[])null, var5);
               int var6 = var5.length * var3.field3695 / 2;
               int var7 = 0;
               String[] var8 = var5;

               for(int var9 = 0; var9 < var8.length; ++var9) {
                  String var10 = var8[var9];
                  int var11 = var3.method5517(var10);
                  if (var11 > var7) {
                     var7 = var11;
                  }
               }

               return new Class22(var1.field3241, var7, var6, var2);
            }
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(IIIIII)Ljava/util/List;",
      garbageValue = "-1031458872"
   )
   List method319(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var3 + var1 && var5 < var3 + var2) {
            Iterator var7 = this.field199.values().iterator();

            Class28 var8;
            while(var7.hasNext()) {
               var8 = (Class28)var7.next();
               if (var8.method464(var4, var5)) {
                  var6.add(var8);
               }
            }

            var7 = this.field196.iterator();

            while(var7.hasNext()) {
               var8 = (Class28)var7.next();
               if (var8.method464(var4, var5)) {
                  var6.add(var8);
               }
            }

            return var6;
         } else {
            return var6;
         }
      } else {
         return var6;
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(B)Ljava/util/List;",
      garbageValue = "23"
   )
   List method356() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.field196);
      var1.addAll(this.field199.values());
      return var1;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "-60"
   )
   void method321(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if (var3 == 0) {
         Class314.method5738(this.field187 * var1, this.field187 * (63 - var2), this.field187, var4);
      }

      if (var3 == 1) {
         Class314.method5736(this.field187 * var1, this.field187 * (63 - var2), this.field187, var4);
      }

      if (var3 == 2) {
         Class314.method5738(this.field187 * var1 + this.field187 - 1, this.field187 * (63 - var2), this.field187, var4);
      }

      if (var3 == 3) {
         Class314.method5736(this.field187 * var1, this.field187 * (63 - var2) + this.field187 - 1, this.field187, var4);
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1433133625"
   )
   int method322(int var1, int var2) {
      if (this.field197 != null) {
         return this.field197.method153(var1, var2);
      } else {
         if (!this.field195.isEmpty()) {
            Iterator var3 = this.field195.iterator();

            while(var3.hasNext()) {
               Class34 var4 = (Class34)var3.next();
               if (var4.method562(var1, var2)) {
                  return var4.method153(var1, var2);
               }
            }
         }

         return -1;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)[Lli;",
      garbageValue = "-13"
   )
   public static Class316[] method423() {
      return new Class316[]{Class316.field3771, Class316.field3775, Class316.field3774, Class316.field3772, Class316.field3773};
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(ILir;Ljava/lang/String;Ljava/lang/String;IZI)V",
      garbageValue = "-469912607"
   )
   public static void method422(int var0, Class247 var1, String var2, String var3, int var4, boolean var5) {
      int var6 = var1.method4642(var2);
      int var7 = var1.method4643(var6, var3);
      Class65.method1602(var0, var1, var6, var7, var4, var5);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;II[BII)I",
      garbageValue = "488772559"
   )
   public static int method421(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var0.charAt(var6 + var1);
         if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
            var3[var6 + var4] = (byte)var7;
         } else if (var7 == 8364) {
            var3[var6 + var4] = -128;
         } else if (var7 == 8218) {
            var3[var6 + var4] = -126;
         } else if (var7 == 402) {
            var3[var6 + var4] = -125;
         } else if (var7 == 8222) {
            var3[var6 + var4] = -124;
         } else if (var7 == 8230) {
            var3[var6 + var4] = -123;
         } else if (var7 == 8224) {
            var3[var6 + var4] = -122;
         } else if (var7 == 8225) {
            var3[var6 + var4] = -121;
         } else if (var7 == 710) {
            var3[var6 + var4] = -120;
         } else if (var7 == 8240) {
            var3[var6 + var4] = -119;
         } else if (var7 == 352) {
            var3[var6 + var4] = -118;
         } else if (var7 == 8249) {
            var3[var6 + var4] = -117;
         } else if (var7 == 338) {
            var3[var6 + var4] = -116;
         } else if (var7 == 381) {
            var3[var6 + var4] = -114;
         } else if (var7 == 8216) {
            var3[var6 + var4] = -111;
         } else if (var7 == 8217) {
            var3[var6 + var4] = -110;
         } else if (var7 == 8220) {
            var3[var6 + var4] = -109;
         } else if (var7 == 8221) {
            var3[var6 + var4] = -108;
         } else if (var7 == 8226) {
            var3[var6 + var4] = -107;
         } else if (var7 == 8211) {
            var3[var6 + var4] = -106;
         } else if (var7 == 8212) {
            var3[var6 + var4] = -105;
         } else if (var7 == 732) {
            var3[var6 + var4] = -104;
         } else if (var7 == 8482) {
            var3[var6 + var4] = -103;
         } else if (var7 == 353) {
            var3[var6 + var4] = -102;
         } else if (var7 == 8250) {
            var3[var6 + var4] = -101;
         } else if (var7 == 339) {
            var3[var6 + var4] = -100;
         } else if (var7 == 382) {
            var3[var6 + var4] = -98;
         } else if (var7 == 376) {
            var3[var6 + var4] = -97;
         } else {
            var3[var6 + var4] = 63;
         }
      }

      return var5;
   }
}
