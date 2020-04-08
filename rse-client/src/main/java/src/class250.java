package src;

public class class250 extends class184 {

   public static class154 field3206 = new class154(64);
   static class334[] field3205;
   public static class243 field3208;
   public static int field3204;
   public int field3207 = 0;


   void method4428(class309 var1, int var2, int var3) {
      if(var2 == 5) {
         this.field3207 = var1.readShort((byte)125);
      }

   }

   void method4427(class309 var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte((byte)41);
         if(var3 == 0) {
            return;
         }

         this.method4428(var1, var3, -478549548);
      }
   }

   public static int method4429(int var0, int var1, byte var2) {
      int var3;
      for(var3 = 0; var1 > 0; --var1) {
         var3 = var3 << 1 | var0 & 1;
         var0 >>>= 1;
      }

      return var3;
   }
}
