package src;

public class class87 extends class189 {

   static int field1145;
   class270 field1144 = new class270();
   class256 field1143;


   class87(class256 var1) {
      this.field1143 = var1;
   }

   void method2111(int var1, int var2, int var3, int var4, byte var5) {
      class79 var6 = null;
      int var7 = 0;

      for(class79 var8 = (class79)this.field1144.method4860(); var8 != null; var8 = (class79)this.field1144.method4915()) {
         ++var7;
         if(var8.field1035 == var1) {
            var8.method1848(var1, var2, var3, var4, -2054467883);
            return;
         }

         if(var8.field1035 <= var1) {
            var6 = var8;
         }
      }

      if(var6 == null) {
         if(var7 < 4) {
            this.field1144.method4880(new class79(var1, var2, var3, var4));
         }

      } else {
         class270.method4893(new class79(var1, var2, var3, var4), var6);
         if(var7 >= 4) {
            this.field1144.method4860().method3657();
         }

      }
   }

   class79 method2115(int var1, int var2) {
      class79 var3 = (class79)this.field1144.method4860();
      if(var3 != null && var3.field1035 <= var1) {
         for(class79 var4 = (class79)this.field1144.method4915(); var4 != null && var4.field1035 <= var1; var4 = (class79)this.field1144.method4915()) {
            var3.method3657();
            var3 = var4;
         }

         if(this.field1143.field3275 + var3.field1035 + var3.field1038 > var1) {
            return var3;
         } else {
            var3.method3657();
            return null;
         }
      } else {
         return null;
      }
   }

   boolean method2112(int var1) {
      return this.field1144.method4867();
   }

   static void method2110(int var0) {
      class94.field1219 = false;
      class94.field1193.method6185(class94.field1191, 0);
      class215.field2501.method6185(class94.field1191 + 382, 0);
      class3.field18.method6173(class94.field1191 + 382 - class3.field18.field3883 / 2, 18);
   }
}
