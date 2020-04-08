package src;

public class class107 extends class124 {

   class271 field1356 = new class271();
   class271 field1357 = new class271();
   int field1355 = -1;
   int field1358 = 0;


   void method2398(int[] var1, int var2, int var3) {
      for(class124 var4 = (class124)this.field1356.method4931(); var4 != null; var4 = (class124)this.field1356.method4949()) {
         var4.method2810(var1, var2, var3);
      }

   }

   void method2396(int var1) {
      for(class124 var2 = (class124)this.field1356.method4931(); var2 != null; var2 = (class124)this.field1356.method4949()) {
         var2.vmethod3967(var1);
      }

   }

   public final synchronized void vmethod3966(int[] var1, int var2, int var3) {
      do {
         if(this.field1355 < 0) {
            this.method2398(var1, var2, var3);
            return;
         }

         if(var3 + this.field1358 < this.field1355) {
            this.field1358 += var3;
            this.method2398(var1, var2, var3);
            return;
         }

         int var4 = this.field1355 - this.field1358;
         this.method2398(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field1358 += var4;
         this.method2387();
         class119 var5 = (class119)this.field1357.method4931();
         synchronized(var5) {
            int var7 = var5.method2611(this);
            if(var7 < 0) {
               var5.field1466 = 0;
               this.method2389(var5);
            } else {
               var5.field1466 = var7;
               this.method2388(var5.field2117, var5);
            }
         }
      } while(var3 != 0);

   }

   public final synchronized void vmethod3967(int var1) {
      do {
         if(this.field1355 < 0) {
            this.method2396(var1);
            return;
         }

         if(this.field1358 + var1 < this.field1355) {
            this.field1358 += var1;
            this.method2396(var1);
            return;
         }

         int var2 = this.field1355 - this.field1358;
         this.method2396(var2);
         var1 -= var2;
         this.field1358 += var2;
         this.method2387();
         class119 var3 = (class119)this.field1357.method4931();
         synchronized(var3) {
            int var5 = var3.method2611(this);
            if(var5 < 0) {
               var3.field1466 = 0;
               this.method2389(var3);
            } else {
               var3.field1466 = var5;
               this.method2388(var3.field2117, var3);
            }
         }
      } while(var1 != 0);

   }

   protected class124 vmethod3964() {
      return (class124)this.field1356.method4949();
   }

   void method2387() {
      if(this.field1358 > 0) {
         for(class119 var1 = (class119)this.field1357.method4931(); var1 != null; var1 = (class119)this.field1357.method4949()) {
            var1.field1466 -= this.field1358;
         }

         this.field1355 -= this.field1358;
         this.field1358 = 0;
      }

   }

   public final synchronized void method2385(class124 var1) {
      this.field1356.method4927(var1);
   }

   protected class124 vmethod3962() {
      return (class124)this.field1356.method4931();
   }

   public final synchronized void method2386(class124 var1) {
      var1.method3657();
   }

   void method2389(class119 var1) {
      var1.method3657();
      var1.method2610();
      class189 var2 = this.field1357.field3532.field2117;
      if(var2 == this.field1357.field3532) {
         this.field1355 = -1;
      } else {
         this.field1355 = ((class119)var2).field1466;
      }

   }

   void method2388(class189 var1, class119 var2) {
      while(this.field1357.field3532 != var1 && ((class119)var1).field1466 <= var2.field1466) {
         var1 = var1.field2117;
      }

      class271.method4928(var2, var1);
      this.field1355 = ((class119)this.field1357.field3532.field2117).field1466;
   }

   protected int vmethod3963() {
      return 0;
   }
}
