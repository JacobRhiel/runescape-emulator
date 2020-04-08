package src;

public class class196 extends class189 {

   static class196[] field2336 = new class196[300];
   static int field2341 = 0;
   static int field2343;
   public static class351[] field2345;
   public class308 field2338;
   public int field2339;
   public class192 field2347;
   public int field2337;


   public void method3686(int var1) {
      if(field2341 < field2336.length) {
         field2336[++field2341 - 1] = this;
      }
   }

   public static int method3689(int var0, int var1) {
      int var2 = 0;
      if(var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var2 += 16;
      }

      if(var0 >= 256) {
         var0 >>>= 8;
         var2 += 8;
      }

      if(var0 >= 16) {
         var0 >>>= 4;
         var2 += 4;
      }

      if(var0 >= 4) {
         var0 >>>= 2;
         var2 += 2;
      }

      if(var0 >= 1) {
         var0 >>>= 1;
         ++var2;
      }

      return var0 + var2;
   }

   static int method3690(int var0, int var1, int var2) {
      class68 var3 = (class68)class68.field570.method6010((long)var0);
      return var3 == null?0:(var1 >= 0 && var1 < var3.field576.length?var3.field576[var1]:0);
   }
}
