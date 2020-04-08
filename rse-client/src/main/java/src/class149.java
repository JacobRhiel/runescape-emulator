package src;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public final class class149 {

   int field1916;
   int field1910;
   int field1905;
   int field1909;
   int field1920;
   int field1911;
   int field1913;
   int field1908;
   int field1907;
   int field1917;
   int field1915;
   int field1919;
   int field1921;
   int field1914;
   int field1918;
   int field1922;
   int field1923;
   int field1906;


   static String method3386(String var0, int var1) {
      class238[] var2 = class70.method1278((byte)74);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class238 var4 = var2[var3];
         if(var4.field3088 != -1 && var0.startsWith(class1.method21(var4.field3088, 2042283659))) {
            var0 = var0.substring(6 + Integer.toString(var4.field3088).length());
            break;
         }
      }

      return var0;
   }

   public static final class114 method3387(class175 var0, int var1, int var2, int var3) {
      if(class114.field1421 == 0) {
         throw new IllegalStateException();
      } else if(var1 >= 0 && var1 < 2) {
         if(var2 < 256) {
            var2 = 256;
         }

         try {
            class114 var4 = class114.field1425.vmethod2428(65536);
            var4.field1426 = new int[(class114.field1437?2:1) * 256];
            var4.field1431 = var2;
            var4.vmethod2529(-515177845);
            var4.field1442 = (var2 & -1024) + 1024;
            if(var4.field1442 > 16384) {
               var4.field1442 = 16384;
            }

            var4.vmethod2530(var4.field1442, -1743473511);
            if(class114.field1423 > 0 && class332.field3878 == null) {
               class332.field3878 = new class116();
               class114.field1420 = Executors.newScheduledThreadPool(1);
               class114.field1420.scheduleAtFixedRate(class332.field3878, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if(class332.field3878 != null) {
               if(class332.field3878.field1456[var1] != null) {
                  throw new IllegalArgumentException();
               }

               class332.field3878.field1456[var1] = var4;
            }

            return var4;
         } catch (Throwable var5) {
            return new class114();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
