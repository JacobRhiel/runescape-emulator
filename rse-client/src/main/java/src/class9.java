package src;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class9 {

   static class226 field52;
   Future field45;
   ExecutorService field49 = Executors.newSingleThreadExecutor();
   final class309 field44;
   final class12 field46;


   public class9(class309 var1, class12 var2) {
      this.field44 = var1;
      this.field46 = var2;
      this.method114(-2043166937);
   }

   void method114(int var1) {
      this.field45 = this.field49.submit(new class8(this, this.field44, this.field46));
   }

   public boolean method111(int var1) {
      return this.field45.isDone();
   }

   public class309 method113(int var1) {
      try {
         return (class309)this.field45.get();
      } catch (Exception var3) {
         return null;
      }
   }

   public void method110(int var1) {
      this.field49.shutdown();
      this.field49 = null;
   }

   static String method122(class325 var0, int var1, String var2, short var3) {
      if(var0 == null) {
         return var2;
      } else {
         class185 var4 = (class185)var0.method5968((long)var1);
         return var4 == null?var2:(String)var4.field2110;
      }
   }

   static final boolean method121(int var0, short var1) {
      if(var0 < 0) {
         return false;
      } else {
         int var2 = client.field779[var0];
         if(var2 >= 2000) {
            var2 -= 2000;
         }

         return var2 == 1007;
      }
   }
}
