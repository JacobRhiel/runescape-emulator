package src;

public class class290 {

   public static final class290 field3614 = new class290();
   public static final class290 field3612 = new class290();
   public static final class290 field3613 = new class290();


   static void method5225(int var0) {
      for(class84 var1 = (class84)class84.field1097.method4931(); var1 != null; var1 = (class84)class84.field1097.method4949()) {
         if(var1.field1108 != null) {
            class64.field553.method2386(var1.field1108);
            var1.field1108 = null;
         }

         if(var1.field1103 != null) {
            class64.field553.method2386(var1.field1103);
            var1.field1103 = null;
         }
      }

      class84.field1097.method4925();
   }

   static final void method5226(class308 var0, byte var1) {
      var0.method5496((byte)-6);
      int var2 = client.field797;
      class75 var3 = class311.field3717 = client.players[var2] = new class75();
      var3.field667 = var2;
      int var4 = var0.method5495(30, (byte)-43);
      byte var5 = (byte)(var4 >> 28);
      int var6 = var4 >> 14 & 16383;
      int var7 = var4 & 16383;
      var3.field1028[0] = var6 - class69.field590 * 731242929;
      var3.field983 = (var3.field1028[0] << 7) + (var3.method1337((byte)52) << 6);
      var3.field1029[0] = var7 - class89.field1152 * 1825982697;
      var3.field973 = (var3.field1029[0] << 7) + (var3.method1337((byte)35) << 6);
      class71.field610 = var3.field666 = var5;
      if(class98.field1269[var2] != null) {
         var3.method1330(class98.field1269[var2], -2042142749);
      }

      class98.field1278 = 0;
      class98.field1271[++class98.field1278 - 1] = var2;
      class98.field1267[var2] = 0;
      class98.field1272 = 0;

      for(int var8 = 1; var8 < 2048; ++var8) {
         if(var2 != var8) {
            int var9 = var0.method5495(18, (byte)-61);
            int var10 = var9 >> 16;
            int var11 = var9 >> 8 & 597;
            int var12 = var9 & 597;
            class98.field1274[var8] = (var11 << 14) + var12 + (var10 << 28);
            class98.field1275[var8] = 0;
            class98.field1276[var8] = -1;
            class98.field1270[++class98.field1272 - 1] = var8;
            class98.field1267[var8] = 0;
         }
      }

      var0.method5498(931642026);
   }
}
