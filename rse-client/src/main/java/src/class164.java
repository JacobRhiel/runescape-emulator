package src;

public class class164 extends class284 {

   final boolean field1992;


   public class164(boolean var1) {
      this.field1992 = var1;
   }

   int method3497(class288 var1, class288 var2, int var3) {
      return var1.field3610 != 0 && var2.field3610 != 0?(this.field1992?var1.field3609 - var2.field3609:var2.field3609 - var1.field3609):this.method5087(var1, var2, 442718620);
   }

   public int compare(Object var1, Object var2) {
      return this.method3497((class288)var1, (class288)var2, -1450384887);
   }

   public static boolean method3502(class243 var0, int var1, int var2, int var3) {
      byte[] var4 = var0.method4224(var1, var2, (byte)-1);
      if(var4 == null) {
         return false;
      } else {
         class210.method3960(var4, (byte)-75);
         return true;
      }
   }
}
