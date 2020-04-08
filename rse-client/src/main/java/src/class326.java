package src;

import java.util.Iterator;

public class class326 implements Iterator {

   class189 field3847 = null;
   class189 field3845;
   class325 field3846;
   int field3844;


   class326(class325 var1) {
      this.field3846 = var1;
      this.method5986();
   }

   void method5986() {
      this.field3845 = this.field3846.field3840[0].field2117;
      this.field3844 = 1;
      this.field3847 = null;
   }

   public void remove() {
      if(this.field3847 == null) {
         throw new IllegalStateException();
      } else {
         this.field3847.method3657();
         this.field3847 = null;
      }
   }

   public Object next() {
      class189 var1;
      if(this.field3846.field3840[this.field3844 - 1] != this.field3845) {
         var1 = this.field3845;
         this.field3845 = var1.field2117;
         this.field3847 = var1;
         return var1;
      } else {
         do {
            if(this.field3844 >= this.field3846.field3839) {
               return null;
            }

            var1 = this.field3846.field3840[this.field3844++].field2117;
         } while(var1 == this.field3846.field3840[this.field3844 - 1]);

         this.field3845 = var1.field2117;
         this.field3847 = var1;
         return var1;
      }
   }

   public boolean hasNext() {
      if(this.field3846.field3840[this.field3844 - 1] != this.field3845) {
         return true;
      } else {
         while(this.field3844 < this.field3846.field3839) {
            if(this.field3846.field3840[this.field3844++].field2117 != this.field3846.field3840[this.field3844 - 1]) {
               this.field3845 = this.field3846.field3840[this.field3844 - 1].field2117;
               return true;
            }

            this.field3845 = this.field3846.field3840[this.field3844 - 1];
         }

         return false;
      }
   }
}
