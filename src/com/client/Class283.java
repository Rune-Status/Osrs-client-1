package com.client;
import java.util.Comparator;

import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
public abstract class Class283 implements Comparator {
   @ObfuscatedName("w")
   Comparator field3613;

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;I)V",
      garbageValue = "726846986"
   )
   final void method5307(Comparator var1) {
      if (this.field3613 == null) {
         this.field3613 = var1;
      } else if (this.field3613 instanceof Class283) {
         ((Class283)this.field3613).method5307(var1);
      }

   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(Ljx;Ljx;I)I",
      garbageValue = "-366074461"
   )
   protected final int method5308(Class282 var1, Class282 var2) {
      return this.field3613 == null ? 0 : this.field3613.compare(var1, var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
