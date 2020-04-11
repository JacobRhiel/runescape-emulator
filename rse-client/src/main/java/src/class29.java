package src;

public class class29 implements class203 {

   static final class29 field191 = new class29(3, (byte)0);
   static final class29 field188 = new class29(2, (byte)1);
   static final class29 field190 = new class29(0, (byte)2);
   static final class29 field189 = new class29(1, (byte)3);
   final byte field193;
   final int field192;


   class29(int var1, byte var2) {
      this.field192 = var1;
      this.field193 = var2;
   }

   public int vmethod6149(byte var1) {
      return this.field193;
   }

   static class29[] method345(int var0) {
      return new class29[]{field191, field188, field190, field189};
   }

   static void method349(int var0, int var1) {
      if(var0 != -1) {
         if(class81.method1900(var0, 824484622)) {
            class226[] var2 = class226.field2693[var0];

            for(int var3 = 0; var3 < var2.length; ++var3) {
               class226 var4 = var2[var3];
               if(var4.field2654 != null) {
                  class71 var5 = new class71();
                  var5.field612 = var4;
                  var5.field602 = var4.field2654;
                  class223.method4099(var5, 5000000, -1708038674);
               }
            }

         }
      }
   }

   static final boolean method344(class226 var0, byte var1) {
      int var2 = var0.field2571;
      if(var2 == 205) {
         client.field802 = 250;
         return true;
      } else {
         int var3;
         int var4;
         if(var2 >= 300 && var2 <= 313) {
            var3 = (var2 - 300) / 2;
            var4 = var2 & 1;
            client.field944.method4064(var3, var4 == 1, 1928193476);
         }

         if(var2 >= 314 && var2 <= 323) {
            var3 = (var2 - 314) / 2;
            var4 = var2 & 1;
            client.field944.method4065(var3, var4 == 1, -1053799565);
         }

         if(var2 == 324) {
            client.field944.method4066(false, -1082412676);
         }

         if(var2 == 325) {
            client.field944.method4066(true, 1295781489);
         }

         if(var2 == 326) {
            class196 var5 = class146.method3363(ClientPacket.field2239, client.field761.field1340, -1947671807);
            client.field944.method4067(var5.field2338, -1419902667);
            client.field761.method2361(var5, 942666569);
            return true;
         } else {
            return false;
         }
      }
   }

   static final void method348(class77 var0, byte var1) {
      long var2 = 0L;
      int var4 = -1;
      int var5 = 0;
      int var6 = 0;
      if(var0.field959 == 0) {
         var2 = class14.field60.method3189(var0.field962, var0.field960, var0.field961);
      }

      if(var0.field959 == 1) {
         var2 = class14.field60.method3190(var0.field962, var0.field960, var0.field961);
      }

      if(var0.field959 == 2) {
         var2 = class14.field60.method3191(var0.field962, var0.field960, var0.field961);
      }

      if(var0.field959 == 3) {
         var2 = class14.field60.method3309(var0.field962, var0.field960, var0.field961);
      }

      if(var2 != 0L) {
         int var7 = class14.field60.method3193(var0.field962, var0.field960, var0.field961, var2);
         var4 = class31.method387(var2);
         var5 = var7 & 31;
         var6 = var7 >> 6 & 3;
      }

      var0.field958 = var4;
      var0.field963 = var5;
      var0.field968 = var6;
   }

   static void method346(int var0, int var1, int var2) {
      int[] var3 = new int[4];
      int[] var4 = new int[4];
      var3[0] = var0;
      var4[0] = var1;
      int var5 = 1;

      for(int var6 = 0; var6 < 4; ++var6) {
         if(class80.field1047[var6] != var0) {
            var3[var5] = class80.field1047[var6];
            var4[var5] = class80.field1048[var6];
            ++var5;
         }
      }

      class80.field1047 = var3;
      class80.field1048 = var4;
      class161.method3483(class324.field3837, 0, class324.field3837.length - 1, class80.field1047, class80.field1048, 943885059);
   }

   public static int method347(int var0, int var1) {
      return class161.method3486(class137.field1757[var0]);
   }
}
