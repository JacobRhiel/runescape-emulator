package src;

public final class class150 {

   public long field1933 = 0L;
   int field1924 = 0;
   int field1929;
   int field1932;
   int field1926;
   int field1938;
   int field1937;
   public class144 field1931;
   public class144 field1934;
   int field1927;
   int field1928;


   static void method3388(int var0, byte[] var1, class317 var2, short var3) {
      class241 var4 = new class241();
      var4.field3117 = 0;
      var4.field2116 = (long)var0;
      var4.field3113 = var1;
      var4.field3114 = var2;
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

   static String method3389(String var0, class226 var1, int var2) {
      if(var0.indexOf("%") != -1) {
         for(int var3 = 1; var3 <= 5; ++var3) {
            while(true) {
               int var4 = var0.indexOf("%" + var3);
               if(var4 == -1) {
                  break;
               }

               String var5 = var0.substring(0, var4);
               int var7 = class64.method1227(var1, var3 - 1, 2058882289);
               String var6;
               if(var7 < 999999999) {
                  var6 = Integer.toString(var7);
               } else {
                  var6 = "*";
               }

               var0 = var5 + var6 + var0.substring(var4 + 2);
            }
         }
      }

      return var0;
   }
}
