package src;

public class class165 extends class284 {

   final boolean field1993;


   public class165(boolean var1) {
      this.field1993 = var1;
   }

   int method3503(class288 var1, class288 var2, int var3) {
      if(var1.field3610 != 0) {
         if(var2.field3610 == 0) {
            return this.field1993?-1:1;
         }
      } else if(var2.field3610 != 0) {
         return this.field1993?1:-1;
      }

      return this.method5087(var1, var2, -93661796);
   }

   public int compare(Object var1, Object var2) {
      return this.method3503((class288)var1, (class288)var2, 261090852);
   }

   public static void method3506(int var0) {
      class255.field3262.method3413();
   }

   static final void method3507(class226 var0, int var1) {
      int var2 = var0.field2571;
      if(var2 == 324) {
         if(client.field945 == -1) {
            client.field945 = var0.field2602;
            client.field946 = var0.field2578;
         }

         if(client.field944.field2542) {
            var0.field2602 = client.field945;
         } else {
            var0.field2602 = client.field946;
         }

      } else if(var2 == 325) {
         if(client.field945 == -1) {
            client.field945 = var0.field2602;
            client.field946 = var0.field2578;
         }

         if(client.field944.field2542) {
            var0.field2602 = client.field946;
         } else {
            var0.field2602 = client.field945;
         }

      } else if(var2 == 327) {
         var0.field2618 = 150;
         var0.field2619 = (int)(Math.sin((double)client.field689 / 40.0D) * 256.0D) & 2047;
         var0.field2610 = 5;
         var0.field2611 = 0;
      } else if(var2 == 328) {
         var0.field2618 = 150;
         var0.field2619 = (int)(Math.sin((double)client.field689 / 40.0D) * 256.0D) & 2047;
         var0.field2610 = 5;
         var0.field2611 = 1;
      }
   }

   static final String method3508(int var0, byte var1) {
      String var2 = Integer.toString(var0);

      for(int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
         var2 = var2.substring(0, var3) + "," + var2.substring(var3);
      }

      return var2.length() > 9?" " + class297.method5314('\uff80', 756128105) + var2.substring(0, var2.length() - 8) + "M" + " " + " (" + var2 + ")" + "</col>":(var2.length() > 6?" " + class297.method5314(16777215, -1774162534) + var2.substring(0, var2.length() - 4) + "K" + " " + " (" + var2 + ")" + "</col>":" " + class297.method5314(16776960, -563335143) + var2 + "</col>");
   }

   static final void method3509(int var0, int var1, int var2, int var3, int var4) {
      class137.method3077((short)-3489);
   }
}
