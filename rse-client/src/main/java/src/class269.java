package src;

public final class class269 {

   class184 field3529 = new class184();


   public class269() {
      this.field3529.field2109 = this.field3529;
      this.field3529.field2107 = this.field3529;
   }

   public void method4851(class184 var1) {
      if(var1.field2107 != null) {
         var1.method3653();
      }

      var1.field2107 = this.field3529;
      var1.field2109 = this.field3529.field2109;
      var1.field2107.field2109 = var1;
      var1.field2109.field2107 = var1;
   }

   public void method4850(class184 var1) {
      if(var1.field2107 != null) {
         var1.method3653();
      }

      var1.field2107 = this.field3529.field2107;
      var1.field2109 = this.field3529;
      var1.field2107.field2109 = var1;
      var1.field2109.field2107 = var1;
   }

   public class184 method4854() {
      class184 var1 = this.field3529.field2109;
      return var1 == this.field3529?null:var1;
   }
}
