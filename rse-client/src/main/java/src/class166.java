package src;

public class class166 extends class284 {

   static class319 field1996;
   final boolean field1995;


   public class166(boolean var1) {
      this.field1995 = var1;
   }

   int method3515(class288 var1, class288 var2, int var3) {
      return var2.field3610 != var1.field3610?(this.field1995?var1.field3610 - var2.field3610:var2.field3610 - var1.field3610):this.method5087(var1, var2, -1001484067);
   }

   public int compare(Object var1, Object var2) {
      return this.method3515((class288)var1, (class288)var2, 1767041351);
   }

   static void method3511(class80 var0, short var1) {
      if(var0.method1886((byte)14) != client.field683) {
         client.field683 = var0.method1886((byte)-4);
         class67.method1254(var0.method1886((byte)30), (byte)-66);
      }

      class101.field1305 = var0.field1051;
      client.field680 = var0.field1040;
      client.field681 = var0.field1049;
      class26.field157 = client.field682 == 0?'\uaa4a':var0.field1040 + '\u9c40';
      class21.field120 = client.field682 == 0?443:var0.field1040 + '\uc350';
      class280.field3574 = class26.field157;
   }
}
