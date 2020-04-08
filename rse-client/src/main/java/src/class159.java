package src;

import java.lang.ref.SoftReference;

public class class159 extends class157 {

   SoftReference field1981;


   class159(Object var1, int var2) {
      super(var2);
      this.field1981 = new SoftReference(var1);
   }

   boolean vmethod3462() {
      return true;
   }

   Object vmethod3461() {
      return this.field1981.get();
   }
}
