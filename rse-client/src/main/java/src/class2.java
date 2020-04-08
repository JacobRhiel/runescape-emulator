package src;

final class class2 implements class0 {

   void method36(Long var1, class309 var2, int var3) {
      var2.method5529(var1.longValue());
   }

   public Object vmethod74(class309 var1, int var2) {
      return Long.valueOf(var1.method5553((byte)45));
   }

   public void vmethod64(Object var1, class309 var2, byte var3) {
      this.method36((Long)var1, var2, 1997729156);
   }

   static final void method35(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      if(class81.method1900(var0, 945799654)) {
         class229.method4185(class226.field2693[var0], -1, var1, var2, var3, var4, var5, var6, 635809234);
      }
   }

   static int method28(int var0, class101 var1, boolean var2, int var3) {
      class226 var4;
      if(var0 >= 2000) {
         var0 -= 1000;
         var4 = class208.method3898(class85.field1115[--class85.field1117], (byte)-76);
      } else {
         var4 = var2?class20.field115:class85.field1130;
      }

      class68.method1273(var4, -1659453797);
      if(var0 != 1200 && var0 != 1205 && var0 != 1212) {
         if(var0 == 1201) {
            var4.field2610 = 2;
            var4.field2611 = class85.field1115[--class85.field1117];
            return 1;
         } else if(var0 == 1202) {
            var4.field2610 = 3;
            var4.field2611 = class311.field3717.field646.method4071(2000496598);
            return 1;
         } else {
            return 2;
         }
      } else {
         class85.field1117 -= 2;
         int var5 = class85.field1115[class85.field1117];
         int var6 = class85.field1115[class85.field1117 + 1];
         var4.field2704 = var5;
         var4.field2694 = var6;
         class264 var7 = class30.method373(var5, (byte)53);
         var4.field2618 = var7.field3411;
         var4.field2619 = var7.field3429;
         var4.field2657 = var7.field3413;
         var4.field2616 = var7.field3414;
         var4.field2617 = var7.field3445;
         var4.field2659 = var7.field3410;
         if(var0 == 1205) {
            var4.field2626 = 0;
         } else if(var0 == 1212 | 1 == var7.field3418) {
            var4.field2626 = 1;
         } else {
            var4.field2626 = 2;
         }

         if(var4.field2622 > 0) {
            var4.field2659 = var4.field2659 * 32 / var4.field2622;
         } else if(var4.field2579 > 0) {
            var4.field2659 = var4.field2659 * 32 / var4.field2579;
         }

         return 1;
      }
   }

   static Class method24(String var0, byte var1) throws ClassNotFoundException {
      return var0.equals("B")?Byte.TYPE:(var0.equals("I")?Integer.TYPE:(var0.equals("S")?Short.TYPE:(var0.equals("J")?Long.TYPE:(var0.equals("Z")?Boolean.TYPE:(var0.equals("F")?Float.TYPE:(var0.equals("D")?Double.TYPE:(var0.equals("C")?Character.TYPE:(var0.equals("void")?Void.TYPE:Class.forName(var0)))))))));
   }

   static void method34(boolean var0, byte var1) {
      client.field827 = var0;
   }
}
