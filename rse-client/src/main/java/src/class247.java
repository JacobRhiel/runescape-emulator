package src;

import java.util.HashMap;

public class class247 {

   final HashMap field3189 = new HashMap();
   int field3188 = 0;
   int[] field3186 = new int[2048];
   class328 field3185 = new class328(0, 0);
   int[] field3184 = new int[2048];


   public class247() {
      class69.method1277(573845052);
   }

   class334 method4378(int var1, int var2) {
      if(!this.field3189.containsKey(Integer.valueOf(var1))) {
         this.method4387(var1, (byte)1);
      }

      return (class334)this.field3189.get(Integer.valueOf(var1));
   }

   void method4387(int var1, byte var2) {
      int var3 = var1 * 2 + 1;
      double[] var4 = class105.method2381(0.0D, (double)((float)var1 / 3.0F), var1, (byte)54);
      double var5 = var4[var1] * var4[var1];
      int[] var7 = new int[var3 * var3];
      boolean var8 = false;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = 0; var10 < var3; ++var10) {
            int var11 = var7[var10 + var3 * var9] = (int)(256.0D * (var4[var9] * var4[var10] / var5));
            if(!var8 && var11 > 0) {
               var8 = true;
            }
         }
      }

      class334 var12 = new class334(var7, var3, var3);
      this.field3189.put(Integer.valueOf(var1), var12);
   }

   public final void method4382(int var1) {
      this.field3188 = 0;
   }

   public final void method4381(int var1, int var2, int var3) {
      if(this.field3188 < this.field3186.length) {
         this.field3186[this.field3188] = var1;
         this.field3184[this.field3188] = var2;
         ++this.field3188;
      }
   }

   void method4402(class334 var1, class334 var2, class328 var3, int var4) {
      if(var3.field3855 != 0 && var3.field3856 != 0) {
         int var5 = 0;
         int var6 = 0;
         if(var3.field3857 == 0) {
            var5 = var1.field3889 - var3.field3855;
         }

         if(var3.field3853 == 0) {
            var6 = var1.field3899 - var3.field3856;
         }

         int var7 = var5 + var6 * var1.field3889;
         int var8 = var2.field3889 * var3.field3853 + var3.field3857;

         for(int var9 = 0; var9 < var3.field3856; ++var9) {
            for(int var10 = 0; var10 < var3.field3855; ++var10) {
               int var10001 = var8++;
               var2.field3896[var10001] += var1.field3896[var7++];
            }

            var7 += var1.field3889 - var3.field3855;
            var8 += var2.field3889 - var3.field3855;
         }

      }
   }

   public final void method4383(int var1, int var2, class334 var3, float var4, int var5) {
      int var6 = (int)(var4 * 18.0F);
      class334 var7 = this.method4378(var6, 1164975013);
      int var8 = var6 * 2 + 1;
      class328 var9 = new class328(0, 0, var3.field3889, var3.field3899);
      class328 var10 = new class328(0, 0);
      this.field3185.method6015(var8, var8, 838675503);
      System.nanoTime();

      int var11;
      int var12;
      int var13;
      for(var11 = 0; var11 < this.field3188; ++var11) {
         var12 = this.field3186[var11];
         var13 = this.field3184[var11];
         int var14 = (int)((float)(var12 - var1) * var4) - var6;
         int var15 = (int)((float)var3.field3899 - (float)(var13 - var2) * var4) - var6;
         this.field3185.method6014(var14, var15, 1269806188);
         this.field3185.method6013(var9, var10, (byte)-7);
         this.method4402(var7, var3, var10, -1592905794);
      }

      System.nanoTime();
      System.nanoTime();

      for(var11 = 0; var11 < var3.field3896.length; ++var11) {
         if(var3.field3896[var11] == 0) {
            var3.field3896[var11] = -16777216;
         } else {
            var12 = (var3.field3896[var11] + 64 - 1) / 256;
            if(var12 <= 0) {
               var3.field3896[var11] = -16777216;
            } else {
               if(var12 > class344.field4034.length) {
                  var12 = class344.field4034.length;
               }

               var13 = class344.field4034[var12 - 1];
               var3.field3896[var11] = -16777216 | var13;
            }
         }
      }

      System.nanoTime();
   }
}
