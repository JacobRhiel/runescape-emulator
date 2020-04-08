package src;

import java.io.File;

public class class176 {

   public static class351 field2053 = null;
   public static class351 field2051 = null;
   public static class351 field2055 = null;
   public static File field2048;


   public static String method3563(class309 var0, int var1) {
      String var2;
      try {
         int var3 = var0.method5561(1055024096);
         if(var3 > 32767) {
            var3 = 32767;
         }

         byte[] var4 = new byte[var3];
         var0.field3710 += class219.field2513.method4017(var0.field3709, var0.field3710, var4, 0, var3, (byte)-45);
         String var5 = class35.method507(var4, 0, var3, (byte)5);
         var2 = var5;
      } catch (Exception var7) {
         var2 = "Cabbage";
      }

      return var2;
   }
}
