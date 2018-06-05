package com.client;
import java.util.Calendar;
import java.util.TimeZone;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
public class Class192 {
   @ObfuscatedName("z")
   public static final String[][] field2392 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}};
   @ObfuscatedName("w")
   public static final String[] field2390 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
   @ObfuscatedName("s")
   public static Calendar field2389;
   @ObfuscatedName("n")
   public static boolean field2391;

   static {
      Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
      field2389 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-953028921"
   )
   public static void method3871() {
      Class227.field2580.method3984();
   }
}
