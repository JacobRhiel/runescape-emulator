package src;

public class class116 implements Runnable {

   static class243 field1455;
   static int field1454;
   volatile class114[] field1456 = new class114[2];


   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            class114 var2 = this.field1456[var1];
            if(var2 != null) {
               var2.method2522((byte)53);
            }
         }
      } catch (Exception var4) {
         class229.method4189((String)null, var4, -1131770525);
      }

   }
}
