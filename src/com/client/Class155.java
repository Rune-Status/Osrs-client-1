package com.client;
import java.io.File;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class Class155 {
   @ObfuscatedName("l")
   static File field1964;
   @ObfuscatedName("u")
   static File field1966;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Ldy;"
   )
   public static Class109 field1968 = null;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Ldy;"
   )
   public static Class109 field1969 = null;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Ldy;"
   )
   public static Class109 field1970 = null;
   @ObfuscatedName("r")
   static String[] field1965;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I",
      garbageValue = "75346420"
   )
   public static int method3269(CharSequence var0, CharSequence var1, int var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      byte var7 = 0;
      byte var8 = 0;

      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         char var9;
         if (var7 != 0) {
            var9 = (char)var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         char var10;
         if (var8 != 0) {
            var10 = (char)var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         byte var11;
         if (var9 == 198) {
            var11 = 69;
         } else if (var9 == 230) {
            var11 = 101;
         } else if (var9 == 223) {
            var11 = 115;
         } else if (var9 == 338) {
            var11 = 69;
         } else if (var9 == 339) {
            var11 = 101;
         } else {
            var11 = 0;
         }

         var7 = var11;
         byte var12;
         if (var10 == 198) {
            var12 = 69;
         } else if (var10 == 230) {
            var12 = 101;
         } else if (var10 == 223) {
            var12 = 115;
         } else if (var10 == 338) {
            var12 = 69;
         } else if (var10 == 339) {
            var12 = 101;
         } else {
            var12 = 0;
         }

         var8 = var12;
         var9 = Class17.method169(var9, var2);
         var10 = Class17.method169(var10, var2);
         if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
            var9 = Character.toLowerCase(var9);
            var10 = Character.toLowerCase(var10);
            if (var10 != var9) {
               return Class139.method3145(var9, var2) - Class139.method3145(var10, var2);
            }
         }
      }

      int var16 = Math.min(var3, var4);

      int var17;
      char var20;
      for(var17 = 0; var17 < var16; ++var17) {
         char var18 = var0.charAt(var17);
         var20 = var1.charAt(var17);
         if (var20 != var18 && Character.toUpperCase(var18) != Character.toUpperCase(var20)) {
            var18 = Character.toLowerCase(var18);
            var20 = Character.toLowerCase(var20);
            if (var20 != var18) {
               return Class139.method3145(var18, var2) - Class139.method3145(var20, var2);
            }
         }
      }

      var17 = var3 - var4;
      if (var17 != 0) {
         return var17;
      } else {
         for(int var19 = 0; var19 < var16; ++var19) {
            var20 = var0.charAt(var19);
            char var13 = var1.charAt(var19);
            if (var20 != var13) {
               return Class139.method3145(var20, var2) - Class139.method3145(var13, var2);
            }
         }

         return 0;
      }
   }

   @ObfuscatedName("hi")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-927006489"
   )
   static void method3275(int var0, int var1, int var2, int var3) {
      Class230 var4 = Class146.method3191(var0, var1);
      if (var4 != null && var4.field2734 != null) {
         Class56 var5 = new Class56();
         var5.field506 = var4;
         var5.field512 = var4.field2734;
         Class68.method1696(var5);
      }

      Client.field737 = var3;
      Client.field785 = true;
      Class40.field361 = var0;
      Client.field736 = var1;
      Class63.field932 = var2;
      Class60.method1114(var4);
   }
}
