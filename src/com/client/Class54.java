package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
public class Class54 {
   @ObfuscatedName("ov")
   static boolean field489;
   @ObfuscatedName("dd")
   static String field485;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1976820406"
   )
   static void method1021(int var0, int var1) {
      long var2 = (long)((var0 << 16) + var1);
      Class246 var4 = (Class246)Class250.field3204.method4020(var2);
      if (var4 != null) {
         Class250.field3202.method3908(var4);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "152334198"
   )
   static void method1018() {
      Class110 var0 = null;

      try {
         var0 = Class22.method283("", Class112.field1455.field3144, true);
         Class182 var1 = Class10.field61.method1609();
         var0.method2506(var1.payload, 0, var1.field2339);
      } catch (Exception var3) {
         ;
      }

      try {
         if (var0 != null) {
            var0.method2508(true);
         }
      } catch (Exception var2) {
         ;
      }

   }

   @ObfuscatedName("fc")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2135811490"
   )
   static final void method1020() {
      Class43.method715();
      Class259.field3282.method3984();
      Class260.field3291.method3984();
      Class3.method34();
      Class271.field3488.method3984();
      Class271.field3489.method3984();
      Class57.method1036();
      Class273.field3552.method3984();
      Class273.field3539.method3984();
      Class258.field3267.method3984();
      Class258.field3265.method3984();
      Class263.field3321.method3984();
      Class254.field3231.method3984();
      Class267.field3349.method3984();
      Class267.field3356.method3984();
      Class267.field3351.method3984();
      Class261.field3305.method3984();
      Class261.field3306.method3984();
      Class265.field3334.method3984();
      Class264.field3328.method3984();
      ServerPackets.method3444();
      Class192.method3871();
      Class68.method1698();
      ((Class111)Class122.field1667).method2561();
      Class84.field1190.method3984();
      Class77.field1079.method4640();
      Class37.field326.method4640();
      Class224.field2548.method4640();
      Class135.field1852.method4640();
      Class246.field3159.method4640();
      Class80.field1147.method4640();
      Class21.field179.method4640();
      Class175.field2270.method4640();
      Class268.field3419.method4640();
      Class22.field183.method4640();
      Class61.field576.method4640();
      Client.field854.method4640();
   }

   @ObfuscatedName("fx")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2123313201"
   )
   static final void method1017() {
      if (Class63.field879 != null) {
         Class63.field879.method2144();
      }

      if (Class28.field244 != null) {
         Class28.field244.method2144();
      }

   }

   @ObfuscatedName("gs")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-93"
   )
   static void method1019() {
      if (Client.field707 >= 0 && Client.field610[Client.field707] != null) {
         Class11.method98(Client.field610[Client.field707], false);
      }

   }
}
