package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public enum Class244 implements Class188 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Liw;"
   )
   field3146("runescape", "RuneScape", 0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liw;"
   )
   field3141("stellardawn", "Stellar Dawn", 1),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Liw;"
   )
   field3142("game3", "Game 3", 2),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Liw;"
   )
   field3143("game4", "Game 4", 3),
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Liw;"
   )
   field3140("game5", "Game 5", 4),
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Liw;"
   )
   field3145("oldscape", "RuneScape 2007", 5);

   @ObfuscatedName("k")
   public final String field3144;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -974844683
   )
   final int field3147;

   Class244(String var3, String var4, int var5) {
      this.field3144 = var3;
      this.field3147 = var5;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
   )
   public int vmethod5815() {
      return this.field3147;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)[B",
      garbageValue = "-1251005186"
   )
   public static byte[] method4618(CharSequence var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) {
            var2[var3] = (byte)var4;
         } else if (var4 == 8364) {
            var2[var3] = -128;
         } else if (var4 == 8218) {
            var2[var3] = -126;
         } else if (var4 == 402) {
            var2[var3] = -125;
         } else if (var4 == 8222) {
            var2[var3] = -124;
         } else if (var4 == 8230) {
            var2[var3] = -123;
         } else if (var4 == 8224) {
            var2[var3] = -122;
         } else if (var4 == 8225) {
            var2[var3] = -121;
         } else if (var4 == 710) {
            var2[var3] = -120;
         } else if (var4 == 8240) {
            var2[var3] = -119;
         } else if (var4 == 352) {
            var2[var3] = -118;
         } else if (var4 == 8249) {
            var2[var3] = -117;
         } else if (var4 == 338) {
            var2[var3] = -116;
         } else if (var4 == 381) {
            var2[var3] = -114;
         } else if (var4 == 8216) {
            var2[var3] = -111;
         } else if (var4 == 8217) {
            var2[var3] = -110;
         } else if (var4 == 8220) {
            var2[var3] = -109;
         } else if (var4 == 8221) {
            var2[var3] = -108;
         } else if (var4 == 8226) {
            var2[var3] = -107;
         } else if (var4 == 8211) {
            var2[var3] = -106;
         } else if (var4 == 8212) {
            var2[var3] = -105;
         } else if (var4 == 732) {
            var2[var3] = -104;
         } else if (var4 == 8482) {
            var2[var3] = -103;
         } else if (var4 == 353) {
            var2[var3] = -102;
         } else if (var4 == 8250) {
            var2[var3] = -101;
         } else if (var4 == 339) {
            var2[var3] = -100;
         } else if (var4 == 382) {
            var2[var3] = -98;
         } else if (var4 == 376) {
            var2[var3] = -97;
         } else {
            var2[var3] = 63;
         }
      }

      return var2;
   }
}
