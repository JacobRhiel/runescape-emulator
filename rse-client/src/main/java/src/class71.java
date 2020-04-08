package src;

public class class71 extends class189 {

   static int field610;
   int field611 = 76;
   Object[] field602;
   class226 field612;
   int field603;
   int field600;
   class226 field606;
   int field604;
   String field607;
   int field605;
   int field609;
   int field608;
   boolean field601;


   public void method1284(Object[] var1, int var2) {
      this.field602 = var1;
   }

   public void method1282(int var1, byte var2) {
      this.field611 = var1;
   }

   static int method1283(class226 var0, int var1) {
      class188 var2 = (class188)client.field750.method6010((long)var0.field2709 + ((long)var0.field2567 << 32));
      return var2 != null?var2.field2114:var0.field2612;
   }

   static final void method1288(int var0, int var1, int var2, int var3, class334 var4, class220 var5, byte var6) {
      if(var4 != null) {
         int var7 = client.field909 & 2047;
         int var8 = var3 * var3 + var2 * var2;
         if(var8 <= 6400) {
            int var9 = class139.field1794[var7];
            int var10 = class139.field1795[var7];
            int var11 = var10 * var2 + var3 * var9 >> 16;
            int var12 = var3 * var10 - var9 * var2 >> 16;
            if(var8 > 2500) {
               var4.method6203(var11 + var5.field2518 / 2 - var4.field3893 / 2, var5.field2517 / 2 - var12 - var4.field3890 / 2, var0, var1, var5.field2518, var5.field2517, var5.field2516, var5.field2519);
            } else {
               var4.method6187(var0 + var11 + var5.field2518 / 2 - var4.field3893 / 2, var5.field2517 / 2 + var1 - var12 - var4.field3890 / 2);
            }

         }
      }
   }
}
