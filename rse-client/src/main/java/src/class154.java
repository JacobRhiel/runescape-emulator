package src;

public final class class154 {

   int field1971;
   class325 field1972;
   class275 field1970 = new class275();
   class184 field1973 = new class184();
   int field1969;


   public class154(int var1) {
      this.field1969 = var1;
      this.field1971 = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
         ;
      }

      this.field1972 = new class325(var2);
   }

   public class184 method3418(long var1) {
      class184 var3 = (class184)this.field1972.method5968(var1);
      if(var3 != null) {
         this.field1970.method4999(var3);
      }

      return var3;
   }

   public void method3424(class184 var1, long var2) {
      if(this.field1971 == 0) {
         class184 var4 = this.field1970.method4993();
         var4.method3657();
         var4.method3653();
         if(var4 == this.field1973) {
            var4 = this.field1970.method4993();
            var4.method3657();
            var4.method3653();
         }
      } else {
         --this.field1971;
      }

      this.field1972.method5963(var1, var2);
      this.field1970.method4999(var1);
   }

   public void method3413() {
      this.field1970.method5010();
      this.field1972.method5964();
      this.field1973 = new class184();
      this.field1971 = this.field1969;
   }

   public void method3411(long var1) {
      class184 var3 = (class184)this.field1972.method5968(var1);
      if(var3 != null) {
         var3.method3657();
         var3.method3653();
         ++this.field1971;
      }

   }
}
