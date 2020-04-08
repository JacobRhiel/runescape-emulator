package src;

public class class220 extends class184 {

   public final int[] field2516;
   public final int field2518;
   public final int field2517;
   public final int[] field2519;


   class220(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.field2518 = var1;
      this.field2517 = var2;
      this.field2519 = var3;
      this.field2516 = var4;
   }

   public boolean method4037(int var1, int var2, int var3) {
      if(var2 >= 0 && var2 < this.field2516.length) {
         int var4 = this.field2516[var2];
         if(var1 >= var4 && var1 <= var4 + this.field2519[var2]) {
            return true;
         }
      }

      return false;
   }

   public static class258 method4040(int var0, short var1) {
      class258 var2 = (class258)class258.field3288.method3418((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = class258.field3291.method4224(14, var0, (byte)-127);
         var2 = new class258();
         if(var3 != null) {
            var2.method4536(new class309(var3), (byte)39);
         }

         class258.field3288.method3424(var2, (long)var0);
         return var2;
      }
   }
}
