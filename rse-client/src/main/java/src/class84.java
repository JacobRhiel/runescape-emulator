package src;

public final class class84 extends class189 {

   static class271 field1097 = new class271();
   int field1102;
   class263 field1109;
   int field1106;
   int field1104;
   int field1105;
   int[] field1095;
   class122 field1108;
   int field1110;
   int field1099;
   int field1100;
   int field1098;
   int field1096;
   class122 field1103;
   int field1107;


   void method2007(byte var1) {
      int var2 = this.field1102;
      class263 var3 = this.field1109.method4645((short)128);
      if(var3 != null) {
         this.field1102 = var3.field3350;
         this.field1106 = var3.field3388 * 128;
         this.field1104 = var3.field3390;
         this.field1105 = var3.field3366;
         this.field1095 = var3.field3392;
      } else {
         this.field1102 = -1;
         this.field1106 = 0;
         this.field1104 = 0;
         this.field1105 = 0;
         this.field1095 = null;
      }

      if(var2 != this.field1102 && this.field1108 != null) {
         class64.field553.method2386(this.field1108);
         this.field1108 = null;
      }

   }

   static int method2002(int var0, int var1) {
      class73 var2 = (class73)class100.field1291.method5968((long)var0);
      return var2 == null?-1:(var2.field2109 == class100.field1290.field3542?-1:((class73)var2.field2109).field622);
   }
}
