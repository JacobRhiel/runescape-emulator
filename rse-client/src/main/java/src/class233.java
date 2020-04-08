package src;

public class class233 {

   public static String field2811 = "Please visit the support page for assistance.";
   public static String field2914 = "Please visit the support page for assistance.";
   public static String field3026 = "";
   public static String field2898 = "Page has opened in a new window.";
   public static String field2807 = "(Please check your popup blocker.)";
   static int field2759;


   public static class239 method4195(int var0, short var1) {
      class239[] var2 = class199.method3730(806638344);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class239 var4 = var2[var3];
         if(var0 == var4.field3101) {
            return var4;
         }
      }

      return null;
   }

   static final int method4196(int var0, int var1, int var2) {
      if(var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }
}
