package src;

public class class10 {

   final int field54;
   final int field53;
   final String field55;


   class10(class309 var1) {
      this(var1.readUnsignedByte((byte)71), var1.readUnsignedByte((byte)88), var1.method5667(-1564619990));
   }

   class10(int var1, int var2, String var3) {
      this.field53 = var1;
      this.field54 = var2;
      this.field55 = var3;
   }

   int method127() {
      return this.field54;
   }

   String method125() {
      return Integer.toHexString(this.field53) + Integer.toHexString(this.field54) + this.field55;
   }
}
