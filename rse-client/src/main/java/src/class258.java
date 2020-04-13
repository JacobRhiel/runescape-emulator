package src;

public class class258 extends class184 {

   public static class154 field3288 = new class154(64);
   public static class243 field3291;
   public int field3293;
   public int field3290;
   public int field3287;


   void method4537(class309 var1, int var2, int var3) {
      if(var2 == 1) {
         this.field3293 = var1.writeShort((byte)33);
         this.field3290 = var1.readUnsignedByte((byte)119);
         this.field3287 = var1.readUnsignedByte((byte)127);
      }

   }

   public void method4536(class309 var1, byte var2) {
      while(true) {
         int var3 = var1.readUnsignedByte((byte)91);
         if(var3 == 0) {
            return;
         }

         this.method4537(var1, var3, 842018241);
      }
   }
}
