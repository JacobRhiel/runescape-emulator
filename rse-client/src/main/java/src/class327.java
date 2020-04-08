package src;

public final class class327 {

   class189[] field3852;
   int field3848 = 0;
   int field3851;
   class189 field3849;
   class189 field3850;


   public class327(int var1) {
      this.field3851 = var1;
      this.field3852 = new class189[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class189 var3 = this.field3852[var2] = new class189();
         var3.field2117 = var3;
         var3.field2115 = var3;
      }

   }

   public class189 method5995() {
      this.field3848 = 0;
      return this.method6003();
   }

   public class189 method6010(long var1) {
      class189 var3 = this.field3852[(int)(var1 & (long)(this.field3851 - 1))];

      for(this.field3850 = var3.field2117; var3 != this.field3850; this.field3850 = this.field3850.field2117) {
         if(this.field3850.field2116 == var1) {
            class189 var4 = this.field3850;
            this.field3850 = this.field3850.field2117;
            return var4;
         }
      }

      this.field3850 = null;
      return null;
   }

   public class189 method6003() {
      class189 var1;
      if(this.field3848 > 0 && this.field3852[this.field3848 - 1] != this.field3849) {
         var1 = this.field3849;
         this.field3849 = var1.field2117;
         return var1;
      } else {
         do {
            if(this.field3848 >= this.field3851) {
               return null;
            }

            var1 = this.field3852[this.field3848++].field2117;
         } while(var1 == this.field3852[this.field3848 - 1]);

         this.field3849 = var1.field2117;
         return var1;
      }
   }

   public void method5997(class189 var1, long var2) {
      if(var1.field2115 != null) {
         var1.method3657();
      }

      class189 var4 = this.field3852[(int)(var2 & (long)(this.field3851 - 1))];
      var1.field2115 = var4.field2115;
      var1.field2117 = var4;
      var1.field2115.field2117 = var1;
      var1.field2117.field2115 = var1;
      var1.field2116 = var2;
   }
}
