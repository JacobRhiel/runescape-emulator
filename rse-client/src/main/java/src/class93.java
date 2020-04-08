package src;

public class class93 implements class203 {

   static final class93 field1188 = new class93(0);
   static final class93 field1183 = new class93(1);
   static final class93 field1184 = new class93(2);
   static final class93 field1185 = new class93(3);
   public static int field1187;
   static int field1182;
   final int field1186;


   class93(int var1) {
      this.field1186 = var1;
   }

   public int vmethod6149(byte var1) {
      return this.field1186;
   }

   static class333 method2151(int var0) {
      class333 var1 = new class333();
      var1.field3882 = class335.field3903;
      var1.field3887 = class335.field3902;
      var1.field3884 = class335.field3901[0];
      var1.field3880 = class260.field3309[0];
      var1.field3883 = class335.field3904[0];
      var1.field3885 = class335.field3905[0];
      var1.field3881 = class320.field3812;
      var1.field3886 = class4.field24[0];
      class287.method5211((byte)-126);
      return var1;
   }

   static int method2143(int var0, int var1, int var2) {
      class68 var3 = (class68)class68.field570.method6010((long)var0);
      if(var3 == null) {
         return 0;
      } else if(var1 == -1) {
         return 0;
      } else {
         int var4 = 0;

         for(int var5 = 0; var5 < var3.field576.length; ++var5) {
            if(var3.field571[var5] == var1) {
               var4 += var3.field576[var5];
            }
         }

         return var4;
      }
   }
}
