package src;

public class class260 extends class184 {

   static class154 field3303 = new class154(64);
   static int[] field3309;
   static class333 field3308;
   static int[] field3310;
   static class243 field3305;
   static int[] field3306;
   class325 field3304;


   void method4561(class309 var1, int var2, int var3) {
      if(var2 == 249) {
         this.field3304 = class246.method4375(var1, this.field3304, -1200832608);
      }

   }

   public int method4564(int var1, int var2, int var3) {
      class325 var5 = this.field3304;
      int var4;
      if(var5 == null) {
         var4 = var2;
      } else {
         class188 var6 = (class188)var5.method5968((long)var1);
         if(var6 == null) {
            var4 = var2;
         } else {
            var4 = var6.field2114;
         }
      }

      return var4;
   }

   public String method4562(int var1, String var2, int var3) {
      return class9.method122(this.field3304, var1, var2, (short)171);
   }

   void method4585(int var1) {}

   void method4563(class309 var1, byte var2) {
      while(true) {
         int var3 = var1.readUnsignedByte((byte)114);
         if(var3 == 0) {
            return;
         }

         this.method4561(var1, var3, 675280031);
      }
   }

   static char method4565(char var0, short var1) {
      return var0 != 181 && var0 != 402?Character.toTitleCase(var0):var0;
   }
}
