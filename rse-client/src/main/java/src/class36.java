package src;

public final class class36 {

   static class245 field270;
   final int[] field268;


   class36() {
      this.field268 = new int[4096];
   }

   class36(int[] var1) {
      this.field268 = var1;
   }

   final int method512(int var1, int var2, int var3) {
      return this.field268[var1 + var2 * 64];
   }

   static class334[] method516(byte var0) {
      class334[] var1 = new class334[class335.field3900];

      for(int var2 = 0; var2 < class335.field3900; ++var2) {
         class334 var3 = var1[var2] = new class334();
         var3.field3893 = class335.field3903;
         var3.field3890 = class335.field3902;
         var3.field3888 = class335.field3901[var2];
         var3.field3892 = class260.field3309[var2];
         var3.field3889 = class335.field3904[var2];
         var3.field3899 = class335.field3905[var2];
         int var4 = var3.field3899 * var3.field3889;
         byte[] var5 = class4.field24[var2];
         var3.field3896 = new int[var4];

         for(int var6 = 0; var6 < var4; ++var6) {
            var3.field3896[var6] = class320.field3812[var5[var6] & 255];
         }
      }

      class335.field3901 = null;
      class260.field3309 = null;
      class335.field3904 = null;
      class335.field3905 = null;
      class320.field3812 = null;
      class4.field24 = null;
      return var1;
   }

   static class101 method511(int var0, int var1) {
      class101 var2 = (class101)class101.field1307.method3418((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = class41.field311.method4224(var0, 0, (byte)-40);
         if(var3 == null) {
            return null;
         } else {
            var2 = class66.method1246(var3, -932748815);
            class101.field1307.method3424(var2, (long)var0);
            return var2;
         }
      }
   }

   public static void method510(class309 var0, int var1, int var2) {
      if(class176.field2053 != null) {
         try {
            class176.field2053.method6612(0L);
            class176.field2053.method6633(var0.field3709, var1, 24, (byte)-1);
         } catch (Exception var4) {
            ;
         }
      }

   }

   static final void method514(int var0, int var1, int var2, int var3, int var4) {
      for(int var5 = var1; var5 <= var3 + var1; ++var5) {
         for(int var6 = var0; var6 <= var0 + var2; ++var6) {
            if(var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
               class117.field1462[0][var6][var5] = 127;
               if(var0 == var6 && var6 > 0) {
                  class64.field549[0][var6][var5] = class64.field549[0][var6 - 1][var5];
               }

               if(var0 + var2 == var6 && var6 < 103) {
                  class64.field549[0][var6][var5] = class64.field549[0][var6 + 1][var5];
               }

               if(var5 == var1 && var5 > 0) {
                  class64.field549[0][var6][var5] = class64.field549[0][var6][var5 - 1];
               }

               if(var3 + var1 == var5 && var5 < 103) {
                  class64.field549[0][var6][var5] = class64.field549[0][var6][var5 + 1];
               }
            }
         }
      }

   }
}
