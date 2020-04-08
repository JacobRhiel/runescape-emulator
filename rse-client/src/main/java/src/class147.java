package src;

public class class147 extends class184 {

   class134[] field1900;


   public class147(class243 var1, class243 var2, int var3, boolean var4) {
      class271 var5 = new class271();
      int var6 = var1.method4246(var3, (byte)53);
      this.field1900 = new class134[var6];
      int[] var7 = var1.method4234(var3, -1725998009);
      int var8 = 0;

      while(var8 < var7.length) {
         byte[] var9 = var1.method4224(var3, var7[var8], (byte)-98);
         class141 var10 = null;
         int var11 = (var9[0] & 255) << 8 | var9[1] & 255;
         class141 var12 = (class141)var5.method4931();

         while(true) {
            if(var12 != null) {
               if(var11 != var12.field1806) {
                  var12 = (class141)var5.method4949();
                  continue;
               }

               var10 = var12;
            }

            if(var10 == null) {
               byte[] var13 = var2.method4232(var11, 0, 1597144570);
               var10 = new class141(var11, var13);
               var5.method4952(var10);
            }

            this.field1900[var7[var8]] = new class134(var9, var10);
            ++var8;
            break;
         }
      }

   }

   public boolean method3368(int var1, int var2) {
      return this.field1900[var1].field1658;
   }

   static void method3371(class245 var0, int var1, int var2, int var3, byte var4, boolean var5, int var6) {
      long var7 = (long)((var1 << 16) + var2);
      class242 var9 = (class242)class246.field3166.method6010(var7);
      if(var9 == null) {
         var9 = (class242)class246.field3174.method6010(var7);
         if(var9 == null) {
            var9 = (class242)class246.field3171.method6010(var7);
            if(var9 != null) {
               if(var5) {
                  var9.method3653();
                  class246.field3166.method5997(var9, var7);
                  --class246.field3172;
                  ++class246.field3167;
               }

            } else {
               if(!var5) {
                  var9 = (class242)class246.field3175.method6010(var7);
                  if(var9 != null) {
                     return;
                  }
               }

               var9 = new class242();
               var9.field3121 = var0;
               var9.field3124 = var3;
               var9.field3120 = var4;
               if(var5) {
                  class246.field3166.method5997(var9, var7);
                  ++class246.field3167;
               } else {
                  class246.field3170.method4850(var9);
                  class246.field3171.method5997(var9, var7);
                  ++class246.field3172;
               }

            }
         }
      }
   }
}
