package com.client;
import com.conf.mapping.ObfuscatedGetter;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public class Class8 {
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1767584041
   )
   protected static int field48;
   @ObfuscatedName("t")
   static String[] field52;
   @ObfuscatedName("ar")
   protected static String field55;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Llm;B)I",
      garbageValue = "28"
   )
   public static final int method84(Class322 var0) {
      if (var0 == null) {
         return 12;
      } else {
         switch(var0.field3879) {
         case 4:
            return 20;
         default:
            return 12;
         }
      }
   }
}
