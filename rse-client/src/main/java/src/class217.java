package src;

public class class217 {

   static boolean field2506;


   public static final synchronized long method4014(int var0) {
      long var1 = System.currentTimeMillis();
      if(var1 < class306.field3698) {
         class306.field3699 += class306.field3698 - var1;
      }

      class306.field3698 = var1;
      return var1 + class306.field3699;
   }

   static final byte[] method4013(byte[] var0, int var1) {
      class309 var2 = new class309(var0);
      int var3 = var2.readUnsignedByte((byte)59);
      int var4 = var2.readInt(297718403);
      if(var4 >= 0 && (class243.field3143 == 0 || var4 <= class243.field3143)) {
         if(var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method5620(var5, 0, var4, -1176132955);
            return var5;
         } else {
            int var7 = var2.readInt(297718403);
            if(var7 >= 0 && (class243.field3143 == 0 || var7 <= class243.field3143)) {
               byte[] var6 = new byte[var7];
               if(var3 == 1) {
                  class313.method5831(var6, var7, var0, var4, 9);
               } else {
                  class243.field3140.method6590(var2, var6, -631538696);
               }

               return var6;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   static String method4015(class226 var0, int var1, int var2) {
      int var4 = class71.method1283(var0, -1336071782);
      boolean var3 = (var4 >> var1 + 1 & 1) != 0;
      return !var3 && var0.field2673 == null?null:(var0.field2647 != null && var0.field2647.length > var1 && var0.field2647[var1] != null && var0.field2647[var1].trim().length() != 0?var0.field2647[var1]:null);
   }
}
