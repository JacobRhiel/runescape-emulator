package src;

public class class69 {

   static int field590;
   static class334[] field588;
   static int field585;


   static final void method1275(byte var0) {
      boolean var1 = false;

      while(!var1) {
         var1 = true;

         for(int var2 = 0; var2 < client.field693 - 1; ++var2) {
            if(client.field779[var2] < 1000 && client.field779[var2 + 1] > 1000) {
               String var3 = client.field823[var2];
               client.field823[var2] = client.field823[var2 + 1];
               client.field823[var2 + 1] = var3;
               String var4 = client.field822[var2];
               client.field822[var2] = client.field822[var2 + 1];
               client.field822[var2 + 1] = var4;
               int var5 = client.field779[var2];
               client.field779[var2] = client.field779[var2 + 1];
               client.field779[var2 + 1] = var5;
               var5 = client.field776[var2];
               client.field776[var2] = client.field776[var2 + 1];
               client.field776[var2 + 1] = var5;
               var5 = client.field856[var2];
               client.field856[var2] = client.field856[var2 + 1];
               client.field856[var2 + 1] = var5;
               var5 = client.field858[var2];
               client.field858[var2] = client.field858[var2 + 1];
               client.field858[var2 + 1] = var5;
               boolean var6 = client.field809[var2];
               client.field809[var2] = client.field809[var2 + 1];
               client.field809[var2 + 1] = var6;
               var1 = false;
            }
         }
      }

   }

   static void method1277(int var0) {
      class344.field4034 = new int[2000];
      int var1 = 0;
      int var2 = 240;

      int var4;
      for(byte var3 = 12; var1 < 16; var2 -= var3) {
         var4 = class88.method2132((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var1 / 16.0F + 0.075F));
         class344.field4034[var1] = var4;
         ++var1;
      }

      var2 = 48;

      for(int var6 = var2 / 6; var1 < class344.field4034.length; var2 -= var6) {
         var4 = var1 * 2;

         for(int var5 = class88.method2132((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class344.field4034.length; ++var1) {
            class344.field4034[var1] = var5;
         }
      }

   }

   static void method1276(String var0, boolean var1, byte var2) {
      var0 = var0.toLowerCase();
      short[] var3 = new short[16];
      int var4 = 0;

      for(int var5 = 0; var5 < class336.field3907; ++var5) {
         class264 var6 = class30.method373(var5, (byte)-25);
         if((!var1 || var6.field3446) && var6.field3440 == -1 && var6.field3397.toLowerCase().indexOf(var0) != -1) {
            if(var4 >= 250) {
               class128.field1551 = -1;
               class50.field386 = null;
               return;
            }

            if(var4 >= var3.length) {
               short[] var7 = new short[var3.length * 2];

               for(int var8 = 0; var8 < var4; ++var8) {
                  var7[var8] = var3[var8];
               }

               var3 = var7;
            }

            var3[var4++] = (short)var5;
         }
      }

      class50.field386 = var3;
      class43.field335 = 0;
      class128.field1551 = var4;
      String[] var9 = new String[class128.field1551];

      for(int var10 = 0; var10 < class128.field1551; ++var10) {
         var9[var10] = class30.method373(var3[var10], (byte)94).field3397;
      }

      class234.method4197(var9, class50.field386, (byte)-127);
   }
}
