package src;

final class class1 implements class0 {

   void method8(Integer var1, class309 var2, byte var3) {
      var2.method5689(var1.intValue(), 747474969);
   }

   public Object vmethod74(class309 var1, int var2) {
      return Integer.valueOf(var1.method5552(297718403));
   }

   public void vmethod64(Object var1, class309 var2, byte var3) {
      this.method8((Integer)var1, var2, (byte)-6);
   }

   static String method21(int var0, int var1) {
      return "<img=" + var0 + ">";
   }

   static final void method20(int var0, int var1, int var2, int var3, class334 var4, class220 var5, byte var6) {
      int var7 = var3 * var3 + var2 * var2;
      if(var7 > 4225 && var7 < 90000) {
         int var8 = client.field909 & 2047;
         int var9 = class139.field1794[var8];
         int var10 = class139.field1795[var8];
         int var11 = var10 * var2 + var3 * var9 >> 16;
         int var12 = var3 * var10 - var9 * var2 >> 16;
         double var13 = Math.atan2((double)var11, (double)var12);
         int var15 = var5.field2518 / 2 - 25;
         int var16 = (int)(Math.sin(var13) * (double)var15);
         int var17 = (int)(Math.cos(var13) * (double)var15);
         byte var18 = 20;
         class20.field110.method6205(var16 + (var0 + var5.field2518 / 2 - var18 / 2), var5.field2517 / 2 + var1 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
      } else {
         class71.method1288(var0, var1, var2, var3, var4, var5, (byte)-75);
      }

   }

   static class73 method16(int var0, int var1, byte var2) {
      class103 var3 = (class103)class100.field1292.get(Integer.valueOf(var0));
      return var3.method2333(var1, (byte)49);
   }
}
