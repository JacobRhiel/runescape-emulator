package src;

public final class class158 {

   int field1976;
   class325 field1978;
   class275 field1979 = new class275();
   int field1977;
   class155 field1980;


   public class158(int var1, int var2) {
      this.field1976 = var1;
      this.field1977 = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
         ;
      }

      this.field1978 = new class325(var3);
   }

   public void method3446(int var1) {
      for(class157 var2 = (class157)this.field1979.method5007(); var2 != null; var2 = (class157)this.field1979.method4996()) {
         if(var2.vmethod3462()) {
            if(var2.vmethod3461() == null) {
               var2.method3657();
               var2.method3653();
               this.field1977 += var2.field1975;
            }
         } else if(++var2.field2108 > (long)var1) {
            class159 var3 = new class159(var2.vmethod3461(), var2.field1975);
            this.field1978.method5963(var3, var2.field2116);
            class275.method4992(var3, var2);
            var2.method3657();
            var2.method3653();
         }
      }

   }

   void method3443(long var1) {
      class157 var3 = (class157)this.field1978.method5968(var1);
      this.method3447(var3);
   }

   void method3447(class157 var1) {
      if(var1 != null) {
         var1.method3657();
         var1.method3653();
         this.field1977 += var1.field1975;
      }

   }

   public Object method3458(long var1) {
      class157 var3 = (class157)this.field1978.method5968(var1);
      if(var3 == null) {
         return null;
      } else {
         Object var4 = var3.vmethod3461();
         if(var4 == null) {
            var3.method3657();
            var3.method3653();
            this.field1977 += var3.field1975;
            return null;
         } else {
            if(var3.vmethod3462()) {
               class156 var5 = new class156(var4, var3.field1975);
               this.field1978.method5963(var5, var3.field2116);
               this.field1979.method4999(var5);
               var5.field2108 = 0L;
               var3.method3657();
               var3.method3653();
            } else {
               this.field1979.method4999(var3);
               var3.field2108 = 0L;
            }

            return var4;
         }
      }
   }

   public void method3445(Object var1, long var2, int var4) {
      if(var4 > this.field1976) {
         throw new IllegalStateException();
      } else {
         this.method3443(var2);
         this.field1977 -= var4;

         while(this.field1977 < 0) {
            class157 var5 = (class157)this.field1979.method4993();
            if(var5 == null) {
               throw new RuntimeException("");
            }

            if(!var5.vmethod3462()) {
               ;
            }

            this.method3447(var5);
            if(this.field1980 != null) {
               this.field1980.method3428(var5.vmethod3461());
            }
         }

         class156 var6 = new class156(var1, var4);
         this.field1978.method5963(var6, var2);
         this.field1979.method4999(var6);
         var6.field2108 = 0L;
      }
   }

   public void method3457() {
      this.field1979.method5010();
      this.field1978.method5964();
      this.field1977 = this.field1976;
   }
}
