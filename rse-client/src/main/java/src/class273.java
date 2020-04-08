package src;

import java.util.Iterator;

public class class273 implements Iterator {

   class184 field3537;
   class184 field3538 = null;
   class275 field3536;


   class273(class275 var1) {
      this.field3536 = var1;
      this.field3537 = this.field3536.field3542.field2109;
      this.field3538 = null;
   }

   public boolean hasNext() {
      return this.field3536.field3542 != this.field3537;
   }

   public void remove() {
      this.field3538.method3653();
      this.field3538 = null;
   }

   public Object next() {
      class184 var1 = this.field3537;
      if(var1 == this.field3536.field3542) {
         var1 = null;
         this.field3537 = null;
      } else {
         this.field3537 = var1.field2109;
      }

      this.field3538 = var1;
      return var1;
   }
}
