package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class class15 {

   public static Comparator field66 = new class21();
   public static Comparator field69;
   public static Comparator field68;
   public static Comparator field72;
   static class226[] field70;
   static int field71;
   public final List field67;


   static {
      new class14();
      field69 = new class19();
      field68 = new class20();
      field72 = new class17();
   }

   public class15(class309 var1, boolean var2) {
      int var3 = var1.readShort((byte)68);
      boolean var4 = var1.readUnsignedByte((byte)42) == 1;
      byte var5;
      if(var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = var1.readShort((byte)11);
      this.field67 = new ArrayList(var6);

      for(int var7 = 0; var7 < var6; ++var7) {
         this.field67.add(new class16(var1, var5, var3));
      }

   }

   public void method152(Comparator var1, boolean var2, int var3) {
      if(var2) {
         Collections.sort(this.field67, var1);
      } else {
         Collections.sort(this.field67, Collections.reverseOrder(var1));
      }

   }

   static class147 method154(int var0, int var1) {
      class147 var2 = (class147)class268.field3512.method3418((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         class243 var4 = class343.field4029;
         class243 var5 = class92.field1177;
         boolean var6 = true;
         int[] var7 = var4.method4234(var0, -2049646423);

         for(int var8 = 0; var8 < var7.length; ++var8) {
            byte[] var9 = var4.method4232(var0, var7[var8], 1361179955);
            if(var9 == null) {
               var6 = false;
            } else {
               int var10 = (var9[0] & 255) << 8 | var9[1] & 255;
               byte[] var11 = var5.method4232(var10, 0, 1157529985);
               if(var11 == null) {
                  var6 = false;
               }
            }
         }

         class147 var3;
         if(!var6) {
            var3 = null;
         } else {
            try {
               var3 = new class147(var4, var5, var0, false);
            } catch (Exception var13) {
               var3 = null;
            }
         }

         if(var3 != null) {
            class268.field3512.method3424(var3, (long)var0);
         }

         return var3;
      }
   }

   static final void method155(byte var0) {
      class8.method109((byte)11);
      class254.field3258.method3413();
      class165.method3506(-1985272675);
      class77.method1824(287596023);
      class277.method5014(-1950063557);
      class257.method4534((byte)1);
      class92.method2141((byte)-78);
      class253.field3242.method3413();
      class253.field3239.method3413();
      class210.method3958(-1693684309);
      class250.field3206.method3413();
      class262.field3323.method3413();
      class262.field3321.method3413();
      class262.field3335.method3413();
      class256.field3279.method3413();
      class256.field3274.method3413();
      ClientPacket.method3669(-2105956972);
      class259.field3295.method3413();
      class167.method3519((byte)16);
      class218.method4027(-1258139515);
      class226.field2561.method3413();
      class226.field2562.method3413();
      class226.field2563.method3413();
      class226.field2564.method3413();
      ((class128)class139.field1781).method2844(1982258351);
      class101.field1307.method3413();
      class241.field3112.method4273((byte)3);
      class215.field2499.method4273((byte)3);
      class36.field270.method4273((byte)3);
      class301.field3664.method4273((byte)3);
      class27.field162.method4273((byte)3);
      class43.field328.method4273((byte)3);
      class43.field333.method4273((byte)3);
      class228.field2717.method4273((byte)3);
      class97.field1263.method4273((byte)3);
      class223.field2543.method4273((byte)3);
      class38.field293.method4273((byte)3);
      class41.field311.method4273((byte)3);
   }
}
