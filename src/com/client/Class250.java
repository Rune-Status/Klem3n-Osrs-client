package com.client;
import java.util.zip.CRC32;

import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class Class250 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lfd;"
   )
   public static Class157 field3200;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1110937007
   )
   public static int field3197 = 0;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      longValue = -5739275915681687991L
   )
   public static long field3203;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   public static Class202 field3212 = new Class202(4096);
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1165925
   )
   public static int field3211 = 0;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   public static Class202 field3199 = new Class202(32);
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1214867787
   )
   public static int field3198 = 0;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lgo;"
   )
   public static Class194 field3202 = new Class194();
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   static Class202 field3204 = new Class202(4096);
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 351524551
   )
   public static int field3205 = 0;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   public static Class202 field3206 = new Class202(4096);
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -887226239
   )
   public static int field3207 = 0;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lig;"
   )
   public static Class246 field3208;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lgk;"
   )
   public static Class182 field3209 = new Class182(8);
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 2092860897
   )
   public static int field3210 = 0;
   @ObfuscatedName("o")
   public static CRC32 field3196 = new CRC32();
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "[Lic;"
   )
   public static Class249[] field3201 = new Class249[256];
   @ObfuscatedName("j")
   public static byte field3213 = 0;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 42575595
   )
   public static int field3214 = 0;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1264842351
   )
   public static int field3215 = 0;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lir;Lir;Lir;I)V",
      garbageValue = "1897264020"
   )
   public static void method4766(Class247 var0, Class247 var1, Class247 var2) {
      Class267.field3367 = var0;
      Class267.field3348 = var1;
      Class139.field1877 = var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(CI)C",
      garbageValue = "-365895890"
   )
   public static char method4770(char var0) {
      switch(var0) {
      case ' ':
      case '-':
      case '_':
      case ' ':
         return '_';
      case '#':
      case '[':
      case ']':
         return var0;
      case 'À':
      case 'Á':
      case 'Â':
      case 'Ã':
      case 'Ä':
      case 'à':
      case 'á':
      case 'â':
      case 'ã':
      case 'ä':
         return 'a';
      case 'Ç':
      case 'ç':
         return 'c';
      case 'È':
      case 'É':
      case 'Ê':
      case 'Ë':
      case 'è':
      case 'é':
      case 'ê':
      case 'ë':
         return 'e';
      case 'Í':
      case 'Î':
      case 'Ï':
      case 'í':
      case 'î':
      case 'ï':
         return 'i';
      case 'Ñ':
      case 'ñ':
         return 'n';
      case 'Ò':
      case 'Ó':
      case 'Ô':
      case 'Õ':
      case 'Ö':
      case 'ò':
      case 'ó':
      case 'ô':
      case 'õ':
      case 'ö':
         return 'o';
      case 'Ù':
      case 'Ú':
      case 'Û':
      case 'Ü':
      case 'ù':
      case 'ú':
      case 'û':
      case 'ü':
         return 'u';
      case 'ß':
         return 'b';
      case 'ÿ':
      case 'Ÿ':
         return 'y';
      default:
         return Character.toLowerCase(var0);
      }
   }
}
