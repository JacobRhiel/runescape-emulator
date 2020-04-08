package src;

public class class244 implements Runnable {

   public static class271 field3149 = new class271();
   public static class271 field3148 = new class271();
   public static Object field3150 = new Object();
   public static int field3151 = 0;


   public void run() {
      try {
         while(true) {
            class271 var2 = field3149;
            class241 var1;
            synchronized(field3149) {
               var1 = (class241)field3149.method4931();
            }

            Object var14;
            if(var1 != null) {
               if(var1.field3117 == 0) {
                  var1.field3114.method5896((int)var1.field2116, var1.field3113, var1.field3113.length, -1923242861);
                  var2 = field3149;
                  synchronized(field3149) {
                     var1.method3657();
                  }
               } else if(var1.field3117 == 1) {
                  var1.field3113 = var1.field3114.method5897((int)var1.field2116, -613554322);
                  var2 = field3149;
                  synchronized(field3149) {
                     field3148.method4952(var1);
                  }
               }

               var14 = field3150;
               synchronized(field3150) {
                  if(field3151 <= 1) {
                     field3151 = 0;
                     field3150.notifyAll();
                     return;
                  }

                  field3151 = 600;
               }
            } else {
               class169.method3527(100L);
               var14 = field3150;
               synchronized(field3150) {
                  if(field3151 <= 1) {
                     field3151 = 0;
                     field3150.notifyAll();
                     return;
                  }

                  --field3151;
               }
            }
         }
      } catch (Exception var13) {
         class229.method4189((String)null, var13, -1131770525);
      }
   }

   public static int method4316(String var0, int var1) {
      return var0.length() + 2;
   }
}
