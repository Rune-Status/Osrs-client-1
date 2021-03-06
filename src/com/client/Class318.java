package com.client;
import com.conf.mapping.ObfuscatedName;
import com.conf.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
public final class Class318 extends Class314 {
   @ObfuscatedName("z")
   public int[] field3791;
   @ObfuscatedName("w")
   public int field3787;
   @ObfuscatedName("s")
   public int field3788;
   @ObfuscatedName("l")
   public int field3793;
   @ObfuscatedName("u")
   int field3790;
   @ObfuscatedName("q")
   public int field3796;
   @ObfuscatedName("k")
   public int field3792;

   public Class318(int[] var1, int var2, int var3) {
      this.field3791 = var1;
      this.field3787 = this.field3796 = var2;
      this.field3788 = this.field3792 = var3;
      this.field3790 = 0;
      this.field3793 = 0;
   }

   public Class318(int var1, int var2) {
      this(new int[var2 * var1], var1, var2);
   }

   Class318() {
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "()Lll;"
   )
   public Class318 method5840() {
      Class318 var1 = new Class318(this.field3787, this.field3788);
      var1.field3796 = this.field3796;
      var1.field3792 = this.field3792;
      var1.field3793 = this.field3796 - this.field3787 - this.field3793;
      var1.field3790 = this.field3790;

      for(int var2 = 0; var2 < this.field3788; ++var2) {
         for(int var3 = 0; var3 < this.field3787; ++var3) {
            var1.field3791[var3 + var2 * this.field3787] = this.field3791[var2 * this.field3787 + this.field3787 - 1 - var3];
         }
      }

      return var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "()Lll;"
   )
   public Class318 method5852() {
      Class318 var1 = new Class318(this.field3796, this.field3792);

      for(int var2 = 0; var2 < this.field3788; ++var2) {
         for(int var3 = 0; var3 < this.field3787; ++var3) {
            var1.field3791[var3 + (var2 + this.field3790) * this.field3796 + this.field3793] = this.field3791[var3 + var2 * this.field3787];
         }
      }

      return var1;
   }

   @ObfuscatedName("s")
   public void method5850() {
      Class314.method5718(this.field3791, this.field3787, this.field3788);
   }

   @ObfuscatedName("l")
   public void method5843() {
      if (this.field3787 != this.field3796 || this.field3788 != this.field3792) {
         int[] var1 = new int[this.field3796 * this.field3792];

         for(int var2 = 0; var2 < this.field3788; ++var2) {
            for(int var3 = 0; var3 < this.field3787; ++var3) {
               var1[var3 + (var2 + this.field3790) * this.field3796 + this.field3793] = this.field3791[var3 + var2 * this.field3787];
            }
         }

         this.field3791 = var1;
         this.field3787 = this.field3796;
         this.field3788 = this.field3792;
         this.field3793 = 0;
         this.field3790 = 0;
      }
   }

   @ObfuscatedName("u")
   public void method5844(int var1) {
      if (this.field3787 != this.field3796 || this.field3788 != this.field3792) {
         int var2 = var1;
         if (var1 > this.field3793) {
            var2 = this.field3793;
         }

         int var3 = var1;
         if (var1 + this.field3793 + this.field3787 > this.field3796) {
            var3 = this.field3796 - this.field3793 - this.field3787;
         }

         int var4 = var1;
         if (var1 > this.field3790) {
            var4 = this.field3790;
         }

         int var5 = var1;
         if (var1 + this.field3790 + this.field3788 > this.field3792) {
            var5 = this.field3792 - this.field3790 - this.field3788;
         }

         int var6 = var2 + var3 + this.field3787;
         int var7 = var4 + var5 + this.field3788;
         int[] var8 = new int[var6 * var7];

         for(int var9 = 0; var9 < this.field3788; ++var9) {
            for(int var10 = 0; var10 < this.field3787; ++var10) {
               var8[var6 * (var9 + var4) + var10 + var2] = this.field3791[var10 + var9 * this.field3787];
            }
         }

         this.field3791 = var8;
         this.field3787 = var6;
         this.field3788 = var7;
         this.field3793 -= var2;
         this.field3790 -= var4;
      }
   }

   @ObfuscatedName("q")
   public void method5934() {
      int[] var1 = new int[this.field3787 * this.field3788];
      int var2 = 0;

      for(int var3 = 0; var3 < this.field3788; ++var3) {
         for(int var4 = this.field3787 - 1; var4 >= 0; --var4) {
            var1[var2++] = this.field3791[var4 + var3 * this.field3787];
         }
      }

      this.field3791 = var1;
      this.field3793 = this.field3796 - this.field3787 - this.field3793;
   }

   @ObfuscatedName("i")
   public void method5842() {
      int[] var1 = new int[this.field3787 * this.field3788];
      int var2 = 0;

      for(int var3 = this.field3788 - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < this.field3787; ++var4) {
            var1[var2++] = this.field3791[var4 + var3 * this.field3787];
         }
      }

      this.field3791 = var1;
      this.field3790 = this.field3792 - this.field3788 - this.field3790;
   }

   @ObfuscatedName("x")
   public void method5847(int var1) {
      int[] var2 = new int[this.field3787 * this.field3788];
      int var3 = 0;

      for(int var4 = 0; var4 < this.field3788; ++var4) {
         for(int var5 = 0; var5 < this.field3787; ++var5) {
            int var6 = this.field3791[var3];
            if (var6 == 0) {
               if (var5 > 0 && this.field3791[var3 - 1] != 0) {
                  var6 = var1;
               } else if (var4 > 0 && this.field3791[var3 - this.field3787] != 0) {
                  var6 = var1;
               } else if (var5 < this.field3787 - 1 && this.field3791[var3 + 1] != 0) {
                  var6 = var1;
               } else if (var4 < this.field3788 - 1 && this.field3791[var3 + this.field3787] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.field3791 = var2;
   }

   @ObfuscatedName("e")
   public void method5848(int var1) {
      for(int var2 = this.field3788 - 1; var2 > 0; --var2) {
         int var3 = var2 * this.field3787;

         for(int var4 = this.field3787 - 1; var4 > 0; --var4) {
            if (this.field3791[var4 + var3] == 0 && this.field3791[var4 + var3 - 1 - this.field3787] != 0) {
               this.field3791[var4 + var3] = var1;
            }
         }
      }

   }

   @ObfuscatedName("p")
   public void method5849(int var1, int var2) {
      var1 += this.field3793;
      var2 += this.field3790;
      int var3 = var1 + var2 * Class314.field3761;
      int var4 = 0;
      int var5 = this.field3788;
      int var6 = this.field3787;
      int var7 = Class314.field3761 - var6;
      int var8 = 0;
      int var9;
      if (var2 < Class314.field3763) {
         var9 = Class314.field3763 - var2;
         var5 -= var9;
         var2 = Class314.field3763;
         var4 += var9 * var6;
         var3 += var9 * Class314.field3761;
      }

      if (var5 + var2 > Class314.field3764) {
         var5 -= var5 + var2 - Class314.field3764;
      }

      if (var1 < Class314.field3765) {
         var9 = Class314.field3765 - var1;
         var6 -= var9;
         var1 = Class314.field3765;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 + var1 > Class314.field3760) {
         var9 = var6 + var1 - Class314.field3760;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         method5926(Class314.field3766, this.field3791, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedName("n")
   public void method5851(int var1, int var2) {
      var1 += this.field3793;
      var2 += this.field3790;
      int var3 = var1 + var2 * Class314.field3761;
      int var4 = 0;
      int var5 = this.field3788;
      int var6 = this.field3787;
      int var7 = Class314.field3761 - var6;
      int var8 = 0;
      int var9;
      if (var2 < Class314.field3763) {
         var9 = Class314.field3763 - var2;
         var5 -= var9;
         var2 = Class314.field3763;
         var4 += var9 * var6;
         var3 += var9 * Class314.field3761;
      }

      if (var5 + var2 > Class314.field3764) {
         var5 -= var5 + var2 - Class314.field3764;
      }

      if (var1 < Class314.field3765) {
         var9 = Class314.field3765 - var1;
         var6 -= var9;
         var1 = Class314.field3765;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 + var1 > Class314.field3760) {
         var9 = var6 + var1 - Class314.field3760;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         method5859(Class314.field3766, this.field3791, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedName("g")
   public void method5853(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         int var5 = this.field3787;
         int var6 = this.field3788;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.field3796;
         int var10 = this.field3792;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         int var13;
         if (this.field3793 > 0) {
            var13 = (var11 + (this.field3793 << 16) - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.field3793 << 16);
         }

         if (this.field3790 > 0) {
            var13 = (var12 + (this.field3790 << 16) - 1) / var12;
            var2 += var13;
            var8 += var13 * var12 - (this.field3790 << 16);
         }

         if (var5 < var9) {
            var3 = (var11 + ((var5 << 16) - var7) - 1) / var11;
         }

         if (var6 < var10) {
            var4 = (var12 + ((var6 << 16) - var8) - 1) / var12;
         }

         var13 = var1 + var2 * Class314.field3761;
         int var14 = Class314.field3761 - var3;
         if (var2 + var4 > Class314.field3764) {
            var4 -= var2 + var4 - Class314.field3764;
         }

         int var15;
         if (var2 < Class314.field3763) {
            var15 = Class314.field3763 - var2;
            var4 -= var15;
            var13 += var15 * Class314.field3761;
            var8 += var12 * var15;
         }

         if (var3 + var1 > Class314.field3760) {
            var15 = var3 + var1 - Class314.field3760;
            var3 -= var15;
            var14 += var15;
         }

         if (var1 < Class314.field3765) {
            var15 = Class314.field3765 - var1;
            var3 -= var15;
            var13 += var15;
            var7 += var11 * var15;
            var14 += var15;
         }

         method5854(Class314.field3766, this.field3791, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
      }
   }

   @ObfuscatedName("r")
   public void method5855(int var1, int var2, int var3, int var4) {
      if (var3 == 256) {
         this.method5851(var1, var2);
      } else {
         var1 += this.field3793;
         var2 += this.field3790;
         int var5 = var1 + var2 * Class314.field3761;
         int var6 = 0;
         int var7 = this.field3788;
         int var8 = this.field3787;
         int var9 = Class314.field3761 - var8;
         int var10 = 0;
         int var11;
         if (var2 < Class314.field3763) {
            var11 = Class314.field3763 - var2;
            var7 -= var11;
            var2 = Class314.field3763;
            var6 += var11 * var8;
            var5 += var11 * Class314.field3761;
         }

         if (var7 + var2 > Class314.field3764) {
            var7 -= var7 + var2 - Class314.field3764;
         }

         if (var1 < Class314.field3765) {
            var11 = Class314.field3765 - var1;
            var8 -= var11;
            var1 = Class314.field3765;
            var6 += var11;
            var5 += var11;
            var10 += var11;
            var9 += var11;
         }

         if (var8 + var1 > Class314.field3760) {
            var11 = var8 + var1 - Class314.field3760;
            var8 -= var11;
            var10 += var11;
            var9 += var11;
         }

         if (var8 > 0 && var7 > 0) {
            method5897(Class314.field3766, this.field3791, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   @ObfuscatedName("o")
   public void method5857(int var1, int var2, int var3) {
      var1 += this.field3793;
      var2 += this.field3790;
      int var4 = var1 + var2 * Class314.field3761;
      int var5 = 0;
      int var6 = this.field3788;
      int var7 = this.field3787;
      int var8 = Class314.field3761 - var7;
      int var9 = 0;
      int var10;
      if (var2 < Class314.field3763) {
         var10 = Class314.field3763 - var2;
         var6 -= var10;
         var2 = Class314.field3763;
         var5 += var10 * var7;
         var4 += var10 * Class314.field3761;
      }

      if (var6 + var2 > Class314.field3764) {
         var6 -= var6 + var2 - Class314.field3764;
      }

      if (var1 < Class314.field3765) {
         var10 = Class314.field3765 - var1;
         var7 -= var10;
         var1 = Class314.field3765;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 + var1 > Class314.field3760) {
         var10 = var7 + var1 - Class314.field3760;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         method5846(Class314.field3766, this.field3791, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   @ObfuscatedName("a")
   public void method5856(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.field3787;
         int var7 = this.field3788;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field3796;
         int var11 = this.field3792;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (this.field3793 > 0) {
            var14 = (var12 + (this.field3793 << 16) - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field3793 << 16);
         }

         if (this.field3790 > 0) {
            var14 = (var13 + (this.field3790 << 16) - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.field3790 << 16);
         }

         if (var6 < var10) {
            var3 = (var12 + ((var6 << 16) - var8) - 1) / var12;
         }

         if (var7 < var11) {
            var4 = (var13 + ((var7 << 16) - var9) - 1) / var13;
         }

         var14 = var1 + var2 * Class314.field3761;
         int var15 = Class314.field3761 - var3;
         if (var2 + var4 > Class314.field3764) {
            var4 -= var2 + var4 - Class314.field3764;
         }

         int var16;
         if (var2 < Class314.field3763) {
            var16 = Class314.field3763 - var2;
            var4 -= var16;
            var14 += var16 * Class314.field3761;
            var9 += var13 * var16;
         }

         if (var3 + var1 > Class314.field3760) {
            var16 = var3 + var1 - Class314.field3760;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < Class314.field3765) {
            var16 = Class314.field3765 - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         method5860(Class314.field3766, this.field3791, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   @ObfuscatedName("v")
   public void method5861(int var1, int var2, int var3) {
      var1 += this.field3793;
      var2 += this.field3790;
      int var4 = var1 + var2 * Class314.field3761;
      int var5 = 0;
      int var6 = this.field3788;
      int var7 = this.field3787;
      int var8 = Class314.field3761 - var7;
      int var9 = 0;
      int var10;
      if (var2 < Class314.field3763) {
         var10 = Class314.field3763 - var2;
         var6 -= var10;
         var2 = Class314.field3763;
         var5 += var10 * var7;
         var4 += var10 * Class314.field3761;
      }

      if (var6 + var2 > Class314.field3764) {
         var6 -= var6 + var2 - Class314.field3764;
      }

      if (var1 < Class314.field3765) {
         var10 = Class314.field3765 - var1;
         var7 -= var10;
         var1 = Class314.field3765;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 + var1 > Class314.field3760) {
         var10 = var7 + var1 - Class314.field3760;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         if (var3 == 256) {
            method5862(0, 0, 0, Class314.field3766, this.field3791, var5, 0, var4, 0, var7, var6, var8, var9);
         } else {
            method5917(0, 0, 0, Class314.field3766, this.field3791, var5, 0, var4, 0, var7, var6, var8, var9, var3);
         }

      }
   }

   @ObfuscatedName("ab")
   public void method5904(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.field3787;
         int var7 = this.field3788;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field3796;
         int var11 = this.field3792;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (this.field3793 > 0) {
            var14 = (var12 + (this.field3793 << 16) - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field3793 << 16);
         }

         if (this.field3790 > 0) {
            var14 = (var13 + (this.field3790 << 16) - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.field3790 << 16);
         }

         if (var6 < var10) {
            var3 = (var12 + ((var6 << 16) - var8) - 1) / var12;
         }

         if (var7 < var11) {
            var4 = (var13 + ((var7 << 16) - var9) - 1) / var13;
         }

         var14 = var1 + var2 * Class314.field3761;
         int var15 = Class314.field3761 - var3;
         if (var2 + var4 > Class314.field3764) {
            var4 -= var2 + var4 - Class314.field3764;
         }

         int var16;
         if (var2 < Class314.field3763) {
            var16 = Class314.field3763 - var2;
            var4 -= var16;
            var14 += var16 * Class314.field3761;
            var9 += var13 * var16;
         }

         if (var3 + var1 > Class314.field3760) {
            var16 = var3 + var1 - Class314.field3760;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < Class314.field3765) {
            var16 = Class314.field3765 - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         if (var5 == 256) {
            method5933(0, 0, 0, var8, this.field3791, Class314.field3766, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
         } else {
            method5913(0, 0, 0, var8, this.field3791, Class314.field3766, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5);
         }

      }
   }

   @ObfuscatedName("as")
   public void method5867(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0 ? -var2 : 0;
      int var10 = var2 + this.field3788 <= var6 ? this.field3788 : var6 - var2;
      int var11 = var1 < 0 ? -var1 : 0;
      int var10000;
      if (this.field3787 + var1 <= var5) {
         var10000 = this.field3787;
      } else {
         var10000 = var5 - var1;
      }

      int var13 = var3 + var11 + (var9 + var2 + var4) * Class314.field3761 + var1;
      int var14 = var9 + var2;

      for(int var15 = var9; var15 < var10; ++var15) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if (var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if (this.field3787 + var1 <= var16 + var17) {
            var12 = this.field3787;
         } else {
            var12 = var16 + var17 - var1;
         }

         for(int var20 = var19; var20 < var12; ++var20) {
            int var21 = this.field3791[var20 + var15 * this.field3787];
            if (var21 != 0) {
               Class314.field3766[var18++] = var21;
            } else {
               ++var18;
            }
         }

         var13 += Class314.field3761;
      }

   }

   @ObfuscatedName("an")
   public void method5845(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin((double)var7 / 326.11D) * 65536.0D);
         int var14 = (int)(Math.cos((double)var7 / 326.11D) * 65536.0D);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = var12 * var13 + var11 * var14 + (var5 << 16);
         int var16 = var12 * var14 - var11 * var13 + (var6 << 16);
         int var17 = var1 + var2 * Class314.field3761;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               Class314.field3766[var19++] = this.field3791[this.field3787 * (var21 >> 16) + (var20 >> 16)];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += Class314.field3761;
         }
      } catch (Exception var23) {
         ;
      }

   }

   @ObfuscatedName("ao")
   public void method5865(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0D);
         int var13 = (int)(Math.cos(var7) * 65536.0D);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = var11 * var12 + var10 * var13 + (var5 << 16);
         int var15 = var11 * var13 - var10 * var12 + (var6 << 16);
         int var16 = var1 + var2 * Class314.field3761;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.field3791[this.field3787 * (var19 >> 16) + (var18 >> 16)];
               if (var20 != 0) {
                  Class314.field3766[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += Class314.field3761;
         }
      } catch (Exception var22) {
         ;
      }

   }

   @ObfuscatedName("at")
   public void method5870(int var1, int var2, int var3, int var4) {
      this.method5871(this.field3796 << 3, this.field3792 << 3, var1 << 4, var2 << 4, var3, var4);
   }

   @ObfuscatedName("ai")
   void method5871(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.field3793 << 4;
         var2 -= this.field3790 << 4;
         double var7 = (double)(var5 & '\uffff') * 9.587379924285257E-5D;
         int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5D);
         int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5D);
         int var11 = var10 * -var1 + -var2 * var9;
         int var12 = -var2 * var10 + var9 * -(-var1);
         int var13 = var10 * ((this.field3787 << 4) - var1) + -var2 * var9;
         int var14 = var9 * -((this.field3787 << 4) - var1) + -var2 * var10;
         int var15 = ((this.field3788 << 4) - var2) * var9 + var10 * -var1;
         int var16 = ((this.field3788 << 4) - var2) * var10 + var9 * -(-var1);
         int var17 = ((this.field3788 << 4) - var2) * var9 + var10 * ((this.field3787 << 4) - var1);
         int var18 = ((this.field3788 << 4) - var2) * var10 + var9 * -((this.field3787 << 4) - var1);
         int var19;
         int var20;
         if (var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if (var15 < var19) {
            var19 = var15;
         }

         if (var17 < var19) {
            var19 = var17;
         }

         if (var15 > var20) {
            var20 = var15;
         }

         if (var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if (var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if (var16 < var21) {
            var21 = var16;
         }

         if (var18 < var21) {
            var21 = var18;
         }

         if (var16 > var22) {
            var22 = var16;
         }

         if (var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + 4095 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if (var19 < Class314.field3765) {
            var19 = Class314.field3765;
         }

         if (var20 > Class314.field3760) {
            var20 = Class314.field3760;
         }

         if (var21 < Class314.field3763) {
            var21 = Class314.field3763;
         }

         if (var22 > Class314.field3764) {
            var22 = Class314.field3764;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var19 + var21 * Class314.field3761;
               double var24 = 1.6777216E7D / (double)var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5D);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5D);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var29 * var27 >> 4) + (var2 << 8);
               int var32;
               int var33;
               int var34;
               int var35;
               int var36;
               int var37;
               int var38;
               if (var27 == 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += Class314.field3761) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31;
                        var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.field3787 << 12) < 0 && var31 - (this.field3788 << 12) < 0) {
                           for(; var37 < 0; ++var37) {
                              var38 = this.field3791[(var35 >> 12) + (var36 >> 12) * this.field3787];
                              if (var38 != 0) {
                                 Class314.field3766[var34++] = var38;
                              } else {
                                 ++var34;
                              }
                           }
                        }

                        ++var33;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += Class314.field3761) {
                        var34 = var23;
                        var35 = var30;
                        var36 = (var28 * var26 >> 4) + var31;
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.field3787 << 12) < 0) {
                           if ((var32 = var36 - (this.field3788 << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var36 - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.field3791[(var35 >> 12) + (var36 >> 12) * this.field3787];
                              if (var38 != 0) {
                                 Class314.field3766[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += Class314.field3761) {
                        var34 = var23;
                        var35 = var30;
                        var36 = (var28 * var26 >> 4) + var31;
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.field3787 << 12) < 0) {
                           if (var36 < 0) {
                              var32 = (var26 - 1 - var36) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var36 + 1 - (this.field3788 << 12) - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.field3791[(var35 >> 12) + (var36 >> 12) * this.field3787];
                              if (var38 != 0) {
                                 Class314.field3766[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += Class314.field3761) {
                        var34 = var23;
                        var35 = (var28 * var27 >> 4) + var30;
                        var36 = var31;
                        var37 = var20;
                        if (var31 >= 0 && var31 - (this.field3788 << 12) < 0) {
                           if ((var32 = var35 - (this.field3787 << 12)) >= 0) {
                              var32 = (var27 - var32) / var27;
                              var37 = var20 + var32;
                              var35 += var27 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var35 - var27) / var27) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.field3791[(var35 >> 12) + (var36 >> 12) * this.field3787];
                              if (var38 != 0) {
                                 Class314.field3766[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var35 += var27;
                              ++var37;
                           }
                        }

                        ++var33;
                        var31 += var27;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += Class314.field3761) {
                        var34 = var23;
                        var35 = (var28 * var27 >> 4) + var30;
                        var36 = (var28 * var26 >> 4) + var31;
                        var37 = var20;
                        if ((var32 = var35 - (this.field3787 << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if ((var32 = var36 - (this.field3788 << 12)) >= 0) {
                           var32 = (var26 - var32) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (var36 - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.field3791[(var35 >> 12) + (var36 >> 12) * this.field3787];
                           if (var38 != 0) {
                              Class314.field3766[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += Class314.field3761) {
                        var34 = var23;
                        var35 = (var28 * var27 >> 4) + var30;
                        var36 = (var28 * var26 >> 4) + var31;
                        var37 = var20;
                        if ((var32 = var35 - (this.field3787 << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if (var36 < 0) {
                           var32 = (var26 - 1 - var36) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (var36 + 1 - (this.field3788 << 12) - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.field3791[(var35 >> 12) + (var36 >> 12) * this.field3787];
                           if (var38 != 0) {
                              Class314.field3766[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for(var33 = var22; var33 < 0; var23 += Class314.field3761) {
                     var34 = var23;
                     var35 = (var28 * var27 >> 4) + var30;
                     var36 = var31;
                     var37 = var20;
                     if (var31 >= 0 && var31 - (this.field3788 << 12) < 0) {
                        if (var35 < 0) {
                           var32 = (var27 - 1 - var35) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 + 1 - (this.field3787 << 12) - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.field3791[(var35 >> 12) + (var36 >> 12) * this.field3787];
                           if (var38 != 0) {
                              Class314.field3766[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           ++var37;
                        }
                     }

                     ++var33;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for(var33 = var22; var33 < 0; var23 += Class314.field3761) {
                     var34 = var23;
                     var35 = (var28 * var27 >> 4) + var30;
                     var36 = (var28 * var26 >> 4) + var31;
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (var35 + 1 - (this.field3787 << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if ((var32 = var36 - (this.field3788 << 12)) >= 0) {
                        var32 = (var26 - var32) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (var36 - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.field3791[(var35 >> 12) + (var36 >> 12) * this.field3787];
                        if (var38 != 0) {
                           Class314.field3766[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for(var33 = var22; var33 < 0; var23 += Class314.field3761) {
                     var34 = var23;
                     var35 = (var28 * var27 >> 4) + var30;
                     var36 = (var28 * var26 >> 4) + var31;
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (var35 + 1 - (this.field3787 << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if (var36 < 0) {
                        var32 = (var26 - 1 - var36) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (var36 + 1 - (this.field3788 << 12) - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.field3791[(var35 >> 12) + (var36 >> 12) * this.field3787];
                        if (var38 != 0) {
                           Class314.field3766[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("ac")
   public void method5872(int var1, int var2, int var3, int var4) {
      if (var3 <= this.field3796 && var4 <= this.field3792) {
         int var5 = var3 * this.field3793 / this.field3796 + var1;
         int var6 = (var3 * (this.field3793 + this.field3787) + this.field3796 - 1) / this.field3796 + var1;
         int var7 = var2 + var4 * this.field3790 / this.field3792;
         int var8 = var2 + (this.field3792 + (this.field3790 + this.field3788) * var4 - 1) / this.field3792;
         if (var5 < Class314.field3765) {
            var5 = Class314.field3765;
         }

         if (var6 > Class314.field3760) {
            var6 = Class314.field3760;
         }

         if (var7 < Class314.field3763) {
            var7 = Class314.field3763;
         }

         if (var8 > Class314.field3764) {
            var8 = Class314.field3764;
         }

         if (var5 < var6 && var7 < var8) {
            int var9 = var5 + var7 * Class314.field3761;
            int var10 = Class314.field3761 - (var6 - var5);
            if (var9 < Class314.field3766.length) {
               for(int var11 = var7; var11 < var8; ++var11) {
                  for(int var12 = var5; var12 < var6; ++var12) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.field3796 / var3 - (this.field3793 << 4);
                     int var16 = (var13 + 16) * this.field3796 / var3 - (this.field3793 << 4);
                     int var17 = var14 * this.field3792 / var4 - (this.field3790 << 4);
                     int var18 = (var14 + 16) * this.field3792 / var4 - (this.field3790 << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if (var19 != 0) {
                        if (var15 < 0) {
                           var15 = 0;
                        }

                        if (var16 >= this.field3787 << 4) {
                           var16 = this.field3787 << 4;
                        }

                        if (var17 < 0) {
                           var17 = 0;
                        }

                        if (var18 >= this.field3788 << 4) {
                           var18 = this.field3788 << 4;
                        }

                        --var16;
                        --var18;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        int var28;
                        for(var28 = var17; var28 <= var18; ++var28) {
                           int var29 = 16;
                           if (var28 == var17) {
                              var29 = var22;
                           }

                           if (var28 == var18) {
                              var29 = var23;
                           }

                           for(int var30 = var15; var30 <= var16; ++var30) {
                              int var31 = this.field3791[var30 + var28 * this.field3787];
                              if (var31 != 0) {
                                 int var32;
                                 if (var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if (var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += var32 * (var31 >> 16 & 255);
                                 var25 += var32 * (var31 >> 8 & 255);
                                 var26 += (var31 & 255) * var32;
                              }
                           }
                        }

                        if (var27 >= var19) {
                           var28 = var26 / var27 + (var24 / var27 << 16) + (var25 / var27 << 8);
                           if (var28 == 0) {
                              var28 = 1;
                           }

                           Class314.field3766[var9] = var28;
                        }

                        ++var9;
                     }
                  }

                  var9 += var10;
               }

            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("b")
   static void method5926(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = -var5; var8 < 0; ++var8) {
         int var9;
         for(var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         for(var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
            ;
         }

         var3 += var6;
         var2 += var7;
      }

   }

   @ObfuscatedName("f")
   static void method5859(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("m")
   static void method5854(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = var11 * (var4 >> 16);

         for(int var15 = -var7; var15 < 0; ++var15) {
            var2 = var1[(var3 >> 16) + var14];
            if (var2 != 0) {
               var0[var5++] = var2;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }

   @ObfuscatedName("t")
   static void method5897(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = 256 - var9;
      int var12 = (var10 & 16711935) * var11 & -16711936;
      int var13 = (var10 & '\uff00') * var11 & 16711680;
      var10 = (var12 | var13) >>> 8;

      for(int var14 = -var6; var14 < 0; ++var14) {
         for(int var15 = -var5; var15 < 0; ++var15) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var12 = var9 * (var2 & 16711935) & -16711936;
               var13 = (var2 & '\uff00') * var9 & 16711680;
               var0[var4++] = var10 + ((var12 | var13) >>> 8);
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("y")
   static void method5846(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var13 & 16711935) * var10 + var9 * (var2 & 16711935) & -16711936) + ((var2 & '\uff00') * var9 + var10 * (var13 & '\uff00') & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("c")
   static void method5860(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int var13 = 256 - var12;
      int var14 = var3;

      for(int var15 = -var8; var15 < 0; ++var15) {
         int var16 = var11 * (var4 >> 16);

         for(int var17 = -var7; var17 < 0; ++var17) {
            var2 = var1[(var3 >> 16) + var16];
            if (var2 != 0) {
               int var18 = var0[var5];
               var0[var5++] = ((var2 & '\uff00') * var12 + var13 * (var18 & '\uff00') & 16711680) + ((var18 & 16711935) * var13 + var12 * (var2 & 16711935) & -16711936) >> 8;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }

   }

   @ObfuscatedName("af")
   static void method5862(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   @ObfuscatedName("ah")
   static void method5917(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = var13 * (var0 & 16711935);
               var0 = (var1 & -16711936) + (var13 * var0 - var1 & 16711680) >>> 8;
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   @ObfuscatedName("aw")
   static void method5933(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      for(int var16 = var3; var8 < 0; ++var8) {
         var7 = var15 * (var9 >> 16);

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var16;
         var10 += var11;
      }

   }

   @ObfuscatedName("ak")
   static void method5913(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      for(int var17 = var3; var8 < 0; ++var8) {
         var7 = var15 * (var9 >> 16);

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var16;
               var0 = (var1 & -16711936) + (var0 * var16 - var1 & 16711680) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
      }

   }
}
