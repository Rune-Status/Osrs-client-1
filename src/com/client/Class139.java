package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class Class139 extends Class283 {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   static Class247 field1877;
   @ObfuscatedName("z")
   final boolean field1881;

   public Class139(boolean var1) {
      this.field1881 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lkz;Lkz;B)I",
      garbageValue = "58"
   )
   int method3139(Class287 var1, Class287 var2) {
      if (Client.field581 == var1.field3628) {
         if (var2.field3628 != Client.field581) {
            return this.field1881 ? -1 : 1;
         }
      } else if (var2.field3628 == Client.field581) {
         return this.field1881 ? 1 : -1;
      }

      return this.method5308(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method3139((Class287)var1, (Class287)var2);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1945605014"
   )
   static int method3143(int var0, int var1) {
      Class53 var2 = (Class53)Class53.field474.method4020((long)var0);
      if (var2 == null) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.field473.length; ++var4) {
            if (var2.field477[var4] == var1) {
               var3 += var2.field473[var4];
            }
         }

         return var3;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(CIB)I",
      garbageValue = "125"
   )
   static int method3145(char var0, int var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = (var0 << 4) + 1;
      }

      return var2;
   }

   @ObfuscatedName("kf")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "497607232"
   )
   static String method3138(String var0) {
      Class242[] var1 = Class20.method216();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         Class242 var3 = var1[var2];
         if (var3.field3128 != -1) {
            int var6 = var3.field3128;
            String var5 = "<img=" + var6 + ">";
            if (var0.startsWith(var5)) {
               var0 = var0.substring(6 + Integer.toString(var3.field3128).length());
               break;
            }
         }
      }

      return var0;
   }
}
