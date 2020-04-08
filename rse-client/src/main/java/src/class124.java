package src;

public abstract class class124 extends class189 {

   volatile boolean field1508 = true;
   class127 field1509;
   class124 field1510;
   int field1507;


   protected abstract void vmethod3966(int[] var1, int var2, int var3);

   protected abstract void vmethod3967(int var1);

   final void method2810(int[] var1, int var2, int var3) {
      if(this.field1508) {
         this.vmethod3966(var1, var2, var3);
      } else {
         this.vmethod3967(var3);
      }

   }

   protected abstract class124 vmethod3964();

   protected abstract class124 vmethod3962();

   int vmethod2806() {
      return 255;
   }

   protected abstract int vmethod3963();
}
