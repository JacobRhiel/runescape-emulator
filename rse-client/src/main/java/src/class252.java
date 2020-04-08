package src;

public class class252 extends class184 {

   public static class154 field3231 = new class154(64);
   public static class243 field3232;
   public boolean field3233 = false;


   void method4464(class309 var1, int var2, int var3) {
      if(var2 == 2) {
         this.field3233 = true;
      }

   }

   public void method4463(class309 var1, byte var2) {
      while(true) {
         int var3 = var1.readUnsignedByte((byte)17);
         if(var3 == 0) {
            return;
         }

         this.method4464(var1, var3, -1942328984);
      }
   }
}
