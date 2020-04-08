package src;

public class class280 {

   static int field3574;


   public static String method5016(int var0, boolean var1, int var2) {
      if(var1 && var0 >= 0) {
         int var4 = var0;
         String var3;
         if(var1 && var0 >= 0) {
            int var5 = 2;

            for(int var6 = var0 / 10; var6 != 0; ++var5) {
               var6 /= 10;
            }

            char[] var7 = new char[var5];
            var7[0] = 43;

            for(int var8 = var5 - 1; var8 > 0; --var8) {
               int var9 = var4;
               var4 /= 10;
               int var10 = var9 - var4 * 10;
               if(var10 >= 10) {
                  var7[var8] = (char)(var10 + 87);
               } else {
                  var7[var8] = (char)(var10 + 48);
               }
            }

            var3 = new String(var7);
         } else {
            var3 = Integer.toString(var0, 10);
         }

         return var3;
      } else {
         return Integer.toString(var0);
      }
   }
}
