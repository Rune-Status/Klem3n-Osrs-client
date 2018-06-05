package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class Class164 {
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 2146339647
   )
   int field2025 = 0;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1748488477
   )
   int field2026 = 0;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -229074279
   )
   int field2027;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1893638093
   )
   int field2030;
   @ObfuscatedName("ap")
   public int[][] field2029;

   public Class164(int var1, int var2) {
      this.field2027 = var1;
      this.field2030 = var2;
      this.field2029 = new int[this.field2027][this.field2030];
      this.method3392();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "87"
   )
   public void method3392() {
      for(int var1 = 0; var1 < this.field2027; ++var1) {
         for(int var2 = 0; var2 < this.field2030; ++var2) {
            if (var1 != 0 && var2 != 0 && var1 < this.field2027 - 5 && var2 < this.field2030 - 5) {
               this.field2029[var1][var2] = 16777216;
            } else {
               this.field2029[var1][var2] = 16777215;
            }
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIIZI)V",
      garbageValue = "1912386247"
   )
   public void method3393(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field2025;
      var2 -= this.field2026;
      if (var3 == 0) {
         if (var4 == 0) {
            this.method3397(var1, var2, 128);
            this.method3397(var1 - 1, var2, 8);
         }

         if (var4 == 1) {
            this.method3397(var1, var2, 2);
            this.method3397(var1, var2 + 1, 32);
         }

         if (var4 == 2) {
            this.method3397(var1, var2, 8);
            this.method3397(var1 + 1, var2, 128);
         }

         if (var4 == 3) {
            this.method3397(var1, var2, 32);
            this.method3397(var1, var2 - 1, 2);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (var4 == 0) {
            this.method3397(var1, var2, 1);
            this.method3397(var1 - 1, var2 + 1, 16);
         }

         if (var4 == 1) {
            this.method3397(var1, var2, 4);
            this.method3397(var1 + 1, var2 + 1, 64);
         }

         if (var4 == 2) {
            this.method3397(var1, var2, 16);
            this.method3397(var1 + 1, var2 - 1, 1);
         }

         if (var4 == 3) {
            this.method3397(var1, var2, 64);
            this.method3397(var1 - 1, var2 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.method3397(var1, var2, 130);
            this.method3397(var1 - 1, var2, 8);
            this.method3397(var1, var2 + 1, 32);
         }

         if (var4 == 1) {
            this.method3397(var1, var2, 10);
            this.method3397(var1, var2 + 1, 32);
            this.method3397(var1 + 1, var2, 128);
         }

         if (var4 == 2) {
            this.method3397(var1, var2, 40);
            this.method3397(var1 + 1, var2, 128);
            this.method3397(var1, var2 - 1, 2);
         }

         if (var4 == 3) {
            this.method3397(var1, var2, 160);
            this.method3397(var1, var2 - 1, 2);
            this.method3397(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.method3397(var1, var2, 65536);
               this.method3397(var1 - 1, var2, 4096);
            }

            if (var4 == 1) {
               this.method3397(var1, var2, 1024);
               this.method3397(var1, var2 + 1, 16384);
            }

            if (var4 == 2) {
               this.method3397(var1, var2, 4096);
               this.method3397(var1 + 1, var2, 65536);
            }

            if (var4 == 3) {
               this.method3397(var1, var2, 16384);
               this.method3397(var1, var2 - 1, 1024);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.method3397(var1, var2, 512);
               this.method3397(var1 - 1, var2 + 1, 8192);
            }

            if (var4 == 1) {
               this.method3397(var1, var2, 2048);
               this.method3397(var1 + 1, var2 + 1, 32768);
            }

            if (var4 == 2) {
               this.method3397(var1, var2, 8192);
               this.method3397(var1 + 1, var2 - 1, 512);
            }

            if (var4 == 3) {
               this.method3397(var1, var2, 32768);
               this.method3397(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.method3397(var1, var2, 66560);
               this.method3397(var1 - 1, var2, 4096);
               this.method3397(var1, var2 + 1, 16384);
            }

            if (var4 == 1) {
               this.method3397(var1, var2, 5120);
               this.method3397(var1, var2 + 1, 16384);
               this.method3397(var1 + 1, var2, 65536);
            }

            if (var4 == 2) {
               this.method3397(var1, var2, 20480);
               this.method3397(var1 + 1, var2, 65536);
               this.method3397(var1, var2 - 1, 1024);
            }

            if (var4 == 3) {
               this.method3397(var1, var2, 81920);
               this.method3397(var1, var2 - 1, 1024);
               this.method3397(var1 - 1, var2, 4096);
            }
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIIIZB)V",
      garbageValue = "126"
   )
   public void method3394(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = 256;
      if (var5) {
         var6 += 131072;
      }

      var1 -= this.field2025;
      var2 -= this.field2026;

      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         if (var7 >= 0 && var7 < this.field2027) {
            for(int var8 = var2; var8 < var2 + var4; ++var8) {
               if (var8 >= 0 && var8 < this.field2030) {
                  this.method3397(var7, var8, var6);
               }
            }
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-770386169"
   )
   public void method3395(int var1, int var2) {
      var1 -= this.field2025;
      var2 -= this.field2026;
      this.field2029[var1][var2] |= 2097152;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "90"
   )
   public void method3410(int var1, int var2) {
      var1 -= this.field2025;
      var2 -= this.field2026;
      this.field2029[var1][var2] |= 262144;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIIS)V",
      garbageValue = "23621"
   )
   void method3397(int var1, int var2, int var3) {
      this.field2029[var1][var2] |= var3;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(IIIIZI)V",
      garbageValue = "-30475067"
   )
   public void method3391(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field2025;
      var2 -= this.field2026;
      if (var3 == 0) {
         if (var4 == 0) {
            this.method3400(var1, var2, 128);
            this.method3400(var1 - 1, var2, 8);
         }

         if (var4 == 1) {
            this.method3400(var1, var2, 2);
            this.method3400(var1, var2 + 1, 32);
         }

         if (var4 == 2) {
            this.method3400(var1, var2, 8);
            this.method3400(var1 + 1, var2, 128);
         }

         if (var4 == 3) {
            this.method3400(var1, var2, 32);
            this.method3400(var1, var2 - 1, 2);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (var4 == 0) {
            this.method3400(var1, var2, 1);
            this.method3400(var1 - 1, var2 + 1, 16);
         }

         if (var4 == 1) {
            this.method3400(var1, var2, 4);
            this.method3400(var1 + 1, var2 + 1, 64);
         }

         if (var4 == 2) {
            this.method3400(var1, var2, 16);
            this.method3400(var1 + 1, var2 - 1, 1);
         }

         if (var4 == 3) {
            this.method3400(var1, var2, 64);
            this.method3400(var1 - 1, var2 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.method3400(var1, var2, 130);
            this.method3400(var1 - 1, var2, 8);
            this.method3400(var1, var2 + 1, 32);
         }

         if (var4 == 1) {
            this.method3400(var1, var2, 10);
            this.method3400(var1, var2 + 1, 32);
            this.method3400(var1 + 1, var2, 128);
         }

         if (var4 == 2) {
            this.method3400(var1, var2, 40);
            this.method3400(var1 + 1, var2, 128);
            this.method3400(var1, var2 - 1, 2);
         }

         if (var4 == 3) {
            this.method3400(var1, var2, 160);
            this.method3400(var1, var2 - 1, 2);
            this.method3400(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.method3400(var1, var2, 65536);
               this.method3400(var1 - 1, var2, 4096);
            }

            if (var4 == 1) {
               this.method3400(var1, var2, 1024);
               this.method3400(var1, var2 + 1, 16384);
            }

            if (var4 == 2) {
               this.method3400(var1, var2, 4096);
               this.method3400(var1 + 1, var2, 65536);
            }

            if (var4 == 3) {
               this.method3400(var1, var2, 16384);
               this.method3400(var1, var2 - 1, 1024);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.method3400(var1, var2, 512);
               this.method3400(var1 - 1, var2 + 1, 8192);
            }

            if (var4 == 1) {
               this.method3400(var1, var2, 2048);
               this.method3400(var1 + 1, var2 + 1, 32768);
            }

            if (var4 == 2) {
               this.method3400(var1, var2, 8192);
               this.method3400(var1 + 1, var2 - 1, 512);
            }

            if (var4 == 3) {
               this.method3400(var1, var2, 32768);
               this.method3400(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.method3400(var1, var2, 66560);
               this.method3400(var1 - 1, var2, 4096);
               this.method3400(var1, var2 + 1, 16384);
            }

            if (var4 == 1) {
               this.method3400(var1, var2, 5120);
               this.method3400(var1, var2 + 1, 16384);
               this.method3400(var1 + 1, var2, 65536);
            }

            if (var4 == 2) {
               this.method3400(var1, var2, 20480);
               this.method3400(var1 + 1, var2, 65536);
               this.method3400(var1, var2 - 1, 1024);
            }

            if (var4 == 3) {
               this.method3400(var1, var2, 81920);
               this.method3400(var1, var2 - 1, 1024);
               this.method3400(var1 - 1, var2, 4096);
            }
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIIIZI)V",
      garbageValue = "1761910676"
   )
   public void method3399(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if (var6) {
         var7 += 131072;
      }

      var1 -= this.field2025;
      var2 -= this.field2026;
      int var8;
      if (var5 == 1 || var5 == 3) {
         var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for(var8 = var1; var8 < var3 + var1; ++var8) {
         if (var8 >= 0 && var8 < this.field2027) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if (var9 >= 0 && var9 < this.field2030) {
                  this.method3400(var8, var9, var7);
               }
            }
         }
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "2133692895"
   )
   void method3400(int var1, int var2, int var3) {
      this.field2029[var1][var2] &= ~var3;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1440413395"
   )
   public void method3401(int var1, int var2) {
      var1 -= this.field2025;
      var2 -= this.field2026;
      this.field2029[var1][var2] &= -262145;
   }
}
