package src;

public class class277 {

   public static int field3552;


   public static void method5014(int var0) {
      class266.field3476.method3413();
      class266.field3463.method3413();
   }

   static final int method5013(int var0, int var1, int var2, int var3) {
      int var4 = var0 >> 7;
      int var5 = var1 >> 7;
      if(var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
         int var6 = var2;
         if(var2 < 3 && (class64.field535[1][var4][var5] & 2) == 2) {
            var6 = var2 + 1;
         }

         int var7 = var0 & 127;
         int var8 = var1 & 127;
         int var9 = (128 - var7) * class64.field549[var6][var4][var5] + var7 * class64.field549[var6][var4 + 1][var5] >> 7;
         int var10 = class64.field549[var6][var4][var5 + 1] * (128 - var7) + class64.field549[var6][var4 + 1][var5 + 1] * var7 >> 7;
         return var9 * (128 - var8) + var10 * var8 >> 7;
      } else {
         return 0;
      }
   }
}
