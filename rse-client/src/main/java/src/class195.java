package src;

public class class195 {

   static final void method3678(String var0, int var1) {
      class16.method165("Please remove " + var0 + " from your friend list first", 62688093);
   }

   static final void method3679(class226 var0, int var1, short var2) {
      if(var0.field2555 == null) {
         throw new RuntimeException();
      } else {
         if(var0.field2706 == null) {
            var0.field2706 = new int[var0.field2555.length];
         }

         var0.field2706[var1] = Integer.MAX_VALUE;
      }
   }

   static final int method3677(int var0, int var1, int var2, int var3, byte var4) {
      int var5 = 65536 - class139.field1795[var2 * 1024 / var3] >> 1;
      return ((65536 - var5) * var0 >> 16) + (var5 * var1 >> 16);
   }
}
