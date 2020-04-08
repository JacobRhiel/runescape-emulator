package src;

public class class272 {

   class187 field3534 = new class187();
   class187 field3535;


   public class272() {
      this.field3534.field2113 = this.field3534;
      this.field3534.field2112 = this.field3534;
   }

   public class187 method4965() {
      class187 var1 = this.field3534.field2113;
      if(var1 == this.field3534) {
         this.field3535 = null;
         return null;
      } else {
         this.field3535 = var1.field2113;
         return var1;
      }
   }

   public class187 method4961() {
      class187 var1 = this.field3535;
      if(var1 == this.field3534) {
         this.field3535 = null;
         return null;
      } else {
         this.field3535 = var1.field2113;
         return var1;
      }
   }

   public void method4960(class187 var1) {
      if(var1.field2112 != null) {
         var1.method3654();
      }

      var1.field2112 = this.field3534.field2112;
      var1.field2113 = this.field3534;
      var1.field2112.field2113 = var1;
      var1.field2113.field2112 = var1;
   }
}
