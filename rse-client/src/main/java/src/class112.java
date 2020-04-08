package src;

public class class112 extends class127 {

   public byte[] field1404;
   public int field1406;
   public boolean field1407;
   public int field1405;
   int field1403;


   class112(int var1, byte[] var2, int var3, int var4) {
      this.field1406 = var1;
      this.field1404 = var2;
      this.field1405 = var3;
      this.field1403 = var4;
   }

   class112(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.field1406 = var1;
      this.field1404 = var2;
      this.field1405 = var3;
      this.field1403 = var4;
      this.field1407 = var5;
   }

   public class112 method2494(class121 var1) {
      this.field1404 = var1.method2628(this.field1404, 2035174504);
      this.field1406 = var1.method2623(this.field1406, (byte)65);
      if(this.field1405 == this.field1403) {
         this.field1405 = this.field1403 = var1.method2634(this.field1405, -548608122);
      } else {
         this.field1405 = var1.method2634(this.field1405, 161653546);
         this.field1403 = var1.method2634(this.field1403, 1426792002);
         if(this.field1405 == this.field1403) {
            --this.field1405;
         }
      }

      return this;
   }
}
