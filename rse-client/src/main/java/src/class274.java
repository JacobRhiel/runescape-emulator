package src;

import java.util.Iterator;

public class class274 implements Iterator {

   class270 field3540;
   class189 field3539;
   class189 field3541 = null;


   class274(class270 var1) {
      this.method4976(var1);
   }

   void method4984() {
      this.field3539 = this.field3540 != null?this.field3540.field3531.field2117:null;
      this.field3541 = null;
   }

   void method4976(class270 var1) {
      this.field3540 = var1;
      this.method4984();
   }

   public Object next() {
      class189 var1 = this.field3539;
      if(var1 == this.field3540.field3531) {
         var1 = null;
         this.field3539 = null;
      } else {
         this.field3539 = var1.field2117;
      }

      this.field3541 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field3540.field3531 != this.field3539;
   }

   public void remove() {
      this.field3541.method3657();
      this.field3541 = null;
   }
}
