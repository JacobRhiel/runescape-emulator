package src;

public class class103 {

   static long field1319;
   static class334 field1325;
   class73[] field1322 = new class73[100];
   int field1321;


   class73 method2334(int var1, String var2, String var3, String var4, int var5) {
      class73 var6 = this.field1322[99];

      for(int var7 = this.field1321; var7 > 0; --var7) {
         if(var7 != 100) {
            this.field1322[var7] = this.field1322[var7 - 1];
         }
      }

      if(var6 == null) {
         var6 = new class73(var1, var2, var4, var3);
      } else {
         var6.method3657();
         var6.method3653();
         var6.method1295(var1, var2, var4, var3, 1398956437);
      }

      this.field1322[0] = var6;
      if(this.field1321 < 100) {
         ++this.field1321;
      }

      return var6;
   }

   class73 method2333(int var1, byte var2) {
      return var1 >= 0 && var1 < this.field1321?this.field1322[var1]:null;
   }

   int method2332(int var1) {
      return this.field1321;
   }

   static void method2341(int var0, String var1, String var2, String var3, int var4) {
      class103 var5 = (class103)class100.field1292.get(Integer.valueOf(var0));
      if(var5 == null) {
         var5 = new class103();
         class100.field1292.put(Integer.valueOf(var0), var5);
      }

      class73 var6 = var5.method2334(var0, var1, var2, var3, 922420852);
      class100.field1291.method5963(var6, (long)var6.field622);
      class100.field1290.method4999(var6);
      client.field903 = client.field865;
   }

   static final void method2342(byte var0) {
      if(class30.field211 != null) {
         class30.field211.method2522((byte)27);
      }

      if(class45.field367 != null) {
         class45.field367.method2522((byte)7);
      }

   }

   static final void method2337(int var0) {
      class16.method165("You can\'t add yourself to your own ignore list", 62688093);
   }

   static class245 method2339(int var0, boolean var1, boolean var2, boolean var3, byte var4) {
      class317 var5 = null;
      if(class176.field2051 != null) {
         var5 = new class317(var0, class176.field2051, class196.field2345[var0], 1000000);
      }

      return new class245(var5, class38.field295, var0, var1, var2, var3);
   }

   static void method2340(int var0) {
      for(int var1 = 0; var1 < client.field693; ++var1) {
         if(class26.method282(client.field779[var1], 723862906)) {
            if(var1 < client.field693 - 1) {
               for(int var2 = var1; var2 < client.field693 - 1; ++var2) {
                  client.field822[var2] = client.field822[var2 + 1];
                  client.field823[var2] = client.field823[var2 + 1];
                  client.field779[var2] = client.field779[var2 + 1];
                  client.field858[var2] = client.field858[var2 + 1];
                  client.field776[var2] = client.field776[var2 + 1];
                  client.field856[var2] = client.field856[var2 + 1];
                  client.field809[var2] = client.field809[var2 + 1];
               }
            }

            --var1;
            --client.field693;
         }
      }

      class208.method3901(class49.field383 / 2 + class34.field248, class196.field2343, -1552340200);
   }
}
