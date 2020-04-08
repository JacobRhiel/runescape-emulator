package src;

public class class230 {

   public static final boolean[] field2744 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
   public static int[] field2747 = new int[99];


   static {
      int var0 = 0;

      for(int var1 = 0; var1 < 99; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var3;
         field2747[var1] = var0 / 4;
      }

   }

   public static class333[] method4190(int var0) {
      class333[] var1 = new class333[class335.field3900];

      for(int var2 = 0; var2 < class335.field3900; ++var2) {
         class333 var3 = var1[var2] = new class333();
         var3.field3882 = class335.field3903;
         var3.field3887 = class335.field3902;
         var3.field3884 = class335.field3901[var2];
         var3.field3880 = class260.field3309[var2];
         var3.field3883 = class335.field3904[var2];
         var3.field3885 = class335.field3905[var2];
         var3.field3881 = class320.field3812;
         var3.field3886 = class4.field24[var2];
      }

      class287.method5211((byte)-54);
      return var1;
   }
}
