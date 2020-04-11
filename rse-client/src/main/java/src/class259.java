package src;

public class class259 extends class184 {

   public static class154 field3295 = new class154(64);
   public static class243 field3297;
   char field3302;
   boolean field3300 = true;
   public int field3298;
   public String field3299;


   void method4549(class309 var1, int var2, int var3) {
      if(var2 == 1) {
         this.field3302 = class236.method4199(var1.readByte(-1556367137), -1712005839);
      } else if(var2 == 2) {
         this.field3298 = var1.readInt(297718403);
      } else if(var2 == 4) {
         this.field3300 = false;
      } else if(var2 == 5) {
         this.field3299 = var1.method5667(-1347045003);
      }

   }

   void method4547(byte var1) {}

   void method4557(class309 var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte((byte)119);
         if(var3 == 0) {
            return;
         }

         this.method4549(var1, var3, -1589952103);
      }
   }

   public boolean method4550(int var1) {
      return this.field3302 == 115;
   }
}
