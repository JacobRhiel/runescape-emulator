package src;

public class class105 {

   public static class270 field1341 = new class270();
   static int[] field1345;


   public static double[] method2381(double var0, double var2, int var4, byte var5) {
      int var6 = var4 * 2 + 1;
      double[] var7 = new double[var6];
      int var8 = -var4;

      for(int var9 = 0; var8 <= var4; ++var9) {
         var7[var9] = class321.method5934((double)var8, var0, var2);
         ++var8;
      }

      return var7;
   }

   public static int method2379(CharSequence var0, int var1, boolean var2, byte var3) {
      if(var1 >= 2 && var1 <= 36) {
         boolean var4 = false;
         boolean var5 = false;
         int var6 = 0;
         int var7 = var0.length();

         for(int var8 = 0; var8 < var7; ++var8) {
            char var9 = var0.charAt(var8);
            if(var8 == 0) {
               if(var9 == 45) {
                  var4 = true;
                  continue;
               }

               if(var9 == 43) {
                  continue;
               }
            }

            int var11;
            if(var9 >= 48 && var9 <= 57) {
               var11 = var9 - 48;
            } else if(var9 >= 65 && var9 <= 90) {
               var11 = var9 - 55;
            } else {
               if(var9 < 97 || var9 > 122) {
                  throw new NumberFormatException();
               }

               var11 = var9 - 87;
            }

            if(var11 >= var1) {
               throw new NumberFormatException();
            }

            if(var4) {
               var11 = -var11;
            }

            int var10 = var6 * var1 + var11;
            if(var10 / var1 != var6) {
               throw new NumberFormatException();
            }

            var6 = var10;
            var5 = true;
         }

         if(!var5) {
            throw new NumberFormatException();
         } else {
            return var6;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   public static void method2380(class243 var0, String var1, String var2, int var3, boolean var4, int var5) {
      int var6 = var0.method4240(var1, (short)9761);
      int var7 = var0.method4233(var6, var2, 1882982797);
      class74.method1321(var0, var6, var7, var3, var4, -1342711563);
   }
}
