package src;

public class class228 {

   static class245 field2717;


   static boolean method4178(class243 var0, int var1, int var2) {
      byte[] var3 = var0.method4231(var1, 210765415);
      if(var3 == null) {
         return false;
      } else {
         class210.method3960(var3, (byte)-111);
         return true;
      }
   }

   public static final int method4181(class347 var0, int var1) {
      if(var0 == null) {
         return 12;
      } else {
         switch(var0.field4058) {
         case 7:
            return 20;
         default:
            return 12;
         }
      }
   }

   static void method4180(int var0, class317 var1, class245 var2, int var3) {
      class241 var4 = new class241();
      var4.field3117 = 1;
      var4.field2116 = (long)var0;
      var4.field3114 = var1;
      var4.field3115 = var2;
      class271 var5 = class244.field3149;
      synchronized(class244.field3149) {
         class244.field3149.method4952(var4);
      }

      Object var10 = class244.field3150;
      synchronized(class244.field3150) {
         if(class244.field3151 == 0) {
            class197.field2349 = new Thread(new class244());
            class197.field2349.setDaemon(true);
            class197.field2349.start();
            class197.field2349.setPriority(5);
         }

         class244.field3151 = 600;
      }
   }

   public static class250 method4179(int var0, byte var1) {
      class250 var2 = (class250)class250.field3206.method3418((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = class250.field3208.method4224(16, var0, (byte)-70);
         var2 = new class250();
         if(var3 != null) {
            var2.method4427(new class309(var3), 888817873);
         }

         class250.field3206.method3424(var2, (long)var0);
         return var2;
      }
   }
}
