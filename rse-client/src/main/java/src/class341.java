package src;

public class class341 {

   static class240 field3965;
   boolean field3960 = false;
   int field3967 = 0;
   class243 field3964;
   String field3963;


   class341(class243 var1) {
      this.field3964 = var1;
   }

   int method6370(int var1) {
      if(this.field3967 < 33) {
         if(!this.field3964.method4241(class44.field340.field344, this.field3963, 354544290)) {
            return this.field3967;
         }

         this.field3967 = 33;
      }

      if(this.field3967 == 33) {
         if(this.field3964.method4299(class44.field341.field344, this.field3963, 1971024882) && !this.field3964.method4241(class44.field341.field344, this.field3963, -1008702991)) {
            return this.field3967;
         }

         this.field3967 = 66;
      }

      if(this.field3967 == 66) {
         if(!this.field3964.method4241(this.field3963, class44.field343.field344, -357800056)) {
            return this.field3967;
         }

         this.field3967 = 100;
         this.field3960 = true;
      }

      return this.field3967;
   }

   boolean method6367(byte var1) {
      return this.field3960;
   }

   void method6366(String var1, int var2) {
      if(var1 != null && !var1.isEmpty()) {
         if(var1 != this.field3963) {
            this.field3963 = var1;
            this.field3967 = 0;
            this.field3960 = false;
            this.method6370(-339187615);
         }
      }
   }

   int method6369(byte var1) {
      return this.field3967;
   }
}
