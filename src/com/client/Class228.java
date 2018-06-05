package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
public class Class228 {
   @ObfuscatedName("z")
   public static final short[] field2582 = new short[]{6798, 8741, 25238, 4626, 4550};
   @ObfuscatedName("w")
   public static final short[][] field2583 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821}};
   @ObfuscatedName("s")
   public static final short[] field2586 = new short[]{-10304, 9104, -1, -1, -1};
   @ObfuscatedName("l")
   public static final short[][] field2585 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]};

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "1857567287"
   )
   static int method4495(int var0, Class84 var1, boolean var2) {
      Class230 var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = Class26.method434(Class69.field999[--Class69.field1003]);
      } else {
         var3 = var2 ? Class276.field3561 : Class260.field3301;
      }

      String var4 = Class69.field1001[--Class55.field497];
      int[] var5 = null;
      if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
         int var6 = Class69.field999[--Class69.field1003];
         if (var6 > 0) {
            for(var5 = new int[var6]; var6-- > 0; var5[var6] = Class69.field999[--Class69.field1003]) {
               ;
            }
         }

         var4 = var4.substring(0, var4.length() - 1);
      }

      Object[] var8 = new Object[var4.length() + 1];

      int var7;
      for(var7 = var8.length - 1; var7 >= 1; --var7) {
         if (var4.charAt(var7 - 1) == 's') {
            var8[var7] = Class69.field1001[--Class55.field497];
         } else {
            var8[var7] = new Integer(Class69.field999[--Class69.field1003]);
         }
      }

      var7 = Class69.field999[--Class69.field1003];
      if (var7 != -1) {
         var8[0] = new Integer(var7);
      } else {
         var8 = null;
      }

      if (var0 == 1400) {
         var3.field2688 = var8;
      } else if (var0 == 1401) {
         var3.field2614 = var8;
      } else if (var0 == 1402) {
         var3.field2690 = var8;
      } else if (var0 == 1403) {
         var3.field2692 = var8;
      } else if (var0 == 1404) {
         var3.field2694 = var8;
      } else if (var0 == 1405) {
         var3.field2695 = var8;
      } else if (var0 == 1406) {
         var3.field2698 = var8;
      } else if (var0 == 1407) {
         var3.field2699 = var8;
         var3.field2700 = var5;
      } else if (var0 == 1408) {
         var3.field2705 = var8;
      } else if (var0 == 1409) {
         var3.field2706 = var8;
      } else if (var0 == 1410) {
         var3.field2696 = var8;
      } else if (var0 == 1411) {
         var3.field2689 = var8;
      } else if (var0 == 1412) {
         var3.field2594 = var8;
      } else if (var0 == 1414) {
         var3.field2670 = var8;
         var3.field2733 = var5;
      } else if (var0 == 1415) {
         var3.field2703 = var8;
         var3.field2635 = var5;
      } else if (var0 == 1416) {
         var3.field2734 = var8;
      } else if (var0 == 1417) {
         var3.field2707 = var8;
      } else if (var0 == 1418) {
         var3.field2708 = var8;
      } else if (var0 == 1419) {
         var3.field2637 = var8;
      } else if (var0 == 1420) {
         var3.field2718 = var8;
      } else if (var0 == 1421) {
         var3.field2711 = var8;
      } else if (var0 == 1422) {
         var3.field2712 = var8;
      } else if (var0 == 1423) {
         var3.field2654 = var8;
      } else if (var0 == 1424) {
         var3.field2714 = var8;
      } else if (var0 == 1425) {
         var3.field2716 = var8;
      } else if (var0 == 1426) {
         var3.field2693 = var8;
      } else {
         if (var0 != 1427) {
            return 2;
         }

         var3.field2715 = var8;
      }

      var3.field2686 = true;
      return 1;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIIIIIII)Z",
      garbageValue = "-861297609"
   )
   static final boolean method4494(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = Class120.field1649 + var6;
      if (var7 < var0 && var7 < var1 && var7 < var2) {
         return false;
      } else {
         var7 = Class120.field1649 - var6;
         if (var7 > var0 && var7 > var1 && var7 > var2) {
            return false;
         } else {
            var7 = Class120.field1648 + var6;
            if (var7 < var3 && var7 < var4 && var7 < var5) {
               return false;
            } else {
               var7 = Class120.field1648 - var6;
               return var7 <= var3 || var7 <= var4 || var7 <= var5;
            }
         }
      }
   }
}
