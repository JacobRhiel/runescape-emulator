package src;

import java.util.Iterator;

public class class275 implements Iterable {

   class184 field3543;
   public class184 field3542 = new class184();


   public class275() {
      this.field3542.field2109 = this.field3542;
      this.field3542.field2107 = this.field3542;
   }

   class184 method5005(class184 var1) {
      class184 var2;
      if(var1 == null) {
         var2 = this.field3542.field2109;
      } else {
         var2 = var1;
      }

      if(var2 == this.field3542) {
         this.field3543 = null;
         return null;
      } else {
         this.field3543 = var2.field2109;
         return var2;
      }
   }

   public class184 method5007() {
      return this.method5005((class184)null);
   }

   public void method5010() {
      while(this.field3542.field2109 != this.field3542) {
         this.field3542.field2109.method3653();
      }

   }

   public class184 method4993() {
      class184 var1 = this.field3542.field2109;
      if(var1 == this.field3542) {
         return null;
      } else {
         var1.method3653();
         return var1;
      }
   }

   public void method4999(class184 var1) {
      if(var1.field2107 != null) {
         var1.method3653();
      }

      var1.field2107 = this.field3542.field2107;
      var1.field2109 = this.field3542;
      var1.field2107.field2109 = var1;
      var1.field2109.field2107 = var1;
   }

   public class184 method4996() {
      class184 var1 = this.field3543;
      if(var1 == this.field3542) {
         this.field3543 = null;
         return null;
      } else {
         this.field3543 = var1.field2109;
         return var1;
      }
   }

   public Iterator iterator() {
      return new class273(this);
   }

   public static void method4992(class184 var0, class184 var1) {
      if(var0.field2107 != null) {
         var0.method3653();
      }

      var0.field2107 = var1;
      var0.field2109 = var1.field2109;
      var0.field2107.field2109 = var0;
      var0.field2109.field2107 = var0;
   }
}
