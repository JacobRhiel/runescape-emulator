package src;

public final class class88 extends class78 {

   static class245 field1151;
   class266 field1148;


   protected final class136 vmethod3353(int var1) {
      if(this.field1148 == null) {
         return null;
      } else {
         class268 var2 = super.field1016 != -1 && super.field1008 == 0?class253.method4478(super.field1016, 1126899100):null;
         class268 var3 = super.field1024 != -1 && (super.field978 != super.field1024 || var2 == null)?class253.method4478(super.field1024, 1087960495):null;
         class136 var4 = this.field1148.method4764(var2, super.field1014, var3, super.field974, -251854058);
         if(var4 == null) {
            return null;
         } else {
            var4.method2955();
            super.field1023 = var4.field1883;
            if(super.field1009 != -1 && super.field1006 != -1) {
               class136 var5 = class63.method1205(super.field1009, -1174861111).method4467(super.field1006, -1827248134);
               if(var5 != null) {
                  var5.method2966(0, -super.field1033, 0);
                  class136[] var6 = new class136[]{var4, var5};
                  var4 = new class136(var6, 2);
               }
            }

            if(this.field1148.field3470 == 1) {
               var4.field1716 = true;
            }

            return var4;
         }
      }
   }

   final boolean vmethod2118(int var1) {
      return this.field1148 != null;
   }

   final void method2119(int var1, byte var2, int var3) {
      int var4 = super.field1028[0];
      int var5 = super.field1029[0];
      if(var1 == 0) {
         --var4;
         ++var5;
      }

      if(var1 == 1) {
         ++var5;
      }

      if(var1 == 2) {
         ++var4;
         ++var5;
      }

      if(var1 == 3) {
         --var4;
      }

      if(var1 == 4) {
         ++var4;
      }

      if(var1 == 5) {
         --var4;
         --var5;
      }

      if(var1 == 6) {
         --var5;
      }

      if(var1 == 7) {
         ++var4;
         --var5;
      }

      if(super.field1016 != -1 && class253.method4478(super.field1016, 2026586541).field3524 == 1) {
         super.field1016 = -1;
      }

      if(super.field1027 < 9) {
         ++super.field1027;
      }

      for(int var6 = super.field1027; var6 > 0; --var6) {
         super.field1028[var6] = super.field1028[var6 - 1];
         super.field1029[var6] = super.field1029[var6 - 1];
         super.field1022[var6] = super.field1022[var6 - 1];
      }

      super.field1028[0] = var4;
      super.field1029[0] = var5;
      super.field1022[0] = var2;
   }

   final void method2122(int var1, int var2, boolean var3, byte var4) {
      if(super.field1016 != -1 && class253.method4478(super.field1016, 2016256819).field3524 == 1) {
         super.field1016 = -1;
      }

      if(!var3) {
         int var5 = var1 - super.field1028[0];
         int var6 = var2 - super.field1029[0];
         if(var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
            if(super.field1027 < 9) {
               ++super.field1027;
            }

            for(int var7 = super.field1027; var7 > 0; --var7) {
               super.field1028[var7] = super.field1028[var7 - 1];
               super.field1029[var7] = super.field1029[var7 - 1];
               super.field1022[var7] = super.field1022[var7 - 1];
            }

            super.field1028[0] = var1;
            super.field1029[0] = var2;
            super.field1022[0] = 1;
            return;
         }
      }

      super.field1027 = 0;
      super.field1032 = 0;
      super.field1031 = 0;
      super.field1028[0] = var1;
      super.field1029[0] = var2;
      super.field983 = super.field976 * 64 + super.field1028[0] * 128;
      super.field973 = super.field976 * 64 + super.field1029[0] * 128;
   }

   public static final int method2132(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if(0.0D != var2) {
         double var12;
         if(var4 < 0.5D) {
            var12 = (1.0D + var2) * var4;
         } else {
            var12 = var2 + var4 - var4 * var2;
         }

         double var14 = var4 * 2.0D - var12;
         double var16 = var0 + 0.3333333333333333D;
         if(var16 > 1.0D) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333D;
         if(var20 < 0.0D) {
            ++var20;
         }

         if(var16 * 6.0D < 1.0D) {
            var6 = var14 + var16 * (var12 - var14) * 6.0D;
         } else if(var16 * 2.0D < 1.0D) {
            var6 = var12;
         } else if(var16 * 3.0D < 2.0D) {
            var6 = (var12 - var14) * (0.6666666666666666D - var16) * 6.0D + var14;
         } else {
            var6 = var14;
         }

         if(var0 * 6.0D < 1.0D) {
            var8 = var14 + (var12 - var14) * 6.0D * var0;
         } else if(var0 * 2.0D < 1.0D) {
            var8 = var12;
         } else if(3.0D * var0 < 2.0D) {
            var8 = var14 + (var12 - var14) * (0.6666666666666666D - var0) * 6.0D;
         } else {
            var8 = var14;
         }

         if(var20 * 6.0D < 1.0D) {
            var10 = var14 + 6.0D * (var12 - var14) * var20;
         } else if(var20 * 2.0D < 1.0D) {
            var10 = var12;
         } else if(3.0D * var20 < 2.0D) {
            var10 = (var12 - var14) * (0.6666666666666666D - var20) * 6.0D + var14;
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(var6 * 256.0D);
      int var13 = (int)(var8 * 256.0D);
      int var23 = (int)(var10 * 256.0D);
      int var15 = var23 + (var13 << 8) + (var22 << 16);
      return var15;
   }

   static int method2133(int var0, class101 var1, boolean var2, int var3) {
      class226 var4 = var2?class20.field115:class85.field1130;
      if(var0 == 1700) {
         class85.field1115[++class85.field1117 - 1] = var4.field2704;
         return 1;
      } else if(var0 == 1701) {
         if(var4.field2704 != -1) {
            class85.field1115[++class85.field1117 - 1] = var4.field2694;
         } else {
            class85.field1115[++class85.field1117 - 1] = 0;
         }

         return 1;
      } else if(var0 == 1702) {
         class85.field1115[++class85.field1117 - 1] = var4.field2709;
         return 1;
      } else {
         return 2;
      }
   }

   static int method2131(int var0, class101 var1, boolean var2, byte var3) {
      if(var0 == 3200) {
         class85.field1117 -= 3;
         class143.method3350(class85.field1115[class85.field1117], class85.field1115[class85.field1117 + 1], class85.field1115[class85.field1117 + 2], 536184368);
         return 1;
      } else if(var0 == 3201) {
         class240.method4219(class85.field1115[--class85.field1117], 1083978305);
         return 1;
      } else if(var0 == 3202) {
         class85.field1117 -= 2;
         class248.method4415(class85.field1115[class85.field1117], class85.field1115[class85.field1117 + 1], 1708311518);
         return 1;
      } else {
         return 2;
      }
   }
}
