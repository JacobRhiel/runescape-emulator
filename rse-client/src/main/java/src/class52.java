package src;

public final class class52 {

   static class334[] field406;
   static int field407;


   static final int method905(int var0) {
      return class137.field1754;
   }

   public static void method900(int var0) {
      class63 var1 = class63.field510;
      synchronized(class63.field510) {
         class63.field521 = class63.field512;
         class63.field517 = class63.field513;
         class63.field518 = class63.field528;
         class63.field515 = class63.field523;
         class63.field524 = class63.field526;
         class63.field525 = class63.field507;
         class63.field520 = class63.field522;
         class63.field527 = class63.field519;
         class63.field526 = 0;
      }
   }

   static int method904(int var0, class101 var1, boolean var2, byte var3) {
      int var4;
      int var5;
      int var7;
      if(var0 == 3400) {
         class85.field1117 -= 2;
         var4 = class85.field1115[class85.field1117];
         var5 = class85.field1115[class85.field1117 + 1];
         class261 var6 = class58.method967(var4, (byte)-86);
         if(var6.field3314 != 115) {
            ;
         }

         for(var7 = 0; var7 < var6.field3317; ++var7) {
            if(var5 == var6.field3320[var7]) {
               class85.field1118[++class85.field1119 - 1] = var6.field3313[var7];
               var6 = null;
               break;
            }
         }

         if(var6 != null) {
            class85.field1118[++class85.field1119 - 1] = var6.field3315;
         }

         return 1;
      } else if(var0 != 3408) {
         if(var0 == 3411) {
            var4 = class85.field1115[--class85.field1117];
            class261 var11 = class58.method967(var4, (byte)-2);
            class85.field1115[++class85.field1117 - 1] = var11.method4589(1493924915);
            return 1;
         } else {
            return 2;
         }
      } else {
         class85.field1117 -= 4;
         var4 = class85.field1115[class85.field1117];
         var5 = class85.field1115[class85.field1117 + 1];
         int var10 = class85.field1115[class85.field1117 + 2];
         var7 = class85.field1115[class85.field1117 + 3];
         class261 var8 = class58.method967(var10, (byte)-113);
         if(var4 == var8.field3318 && var5 == var8.field3314) {
            for(int var9 = 0; var9 < var8.field3317; ++var9) {
               if(var7 == var8.field3320[var9]) {
                  if(var5 == 115) {
                     class85.field1118[++class85.field1119 - 1] = var8.field3313[var9];
                  } else {
                     class85.field1115[++class85.field1117 - 1] = var8.field3311[var9];
                  }

                  var8 = null;
                  break;
               }
            }

            if(var8 != null) {
               if(var5 == 115) {
                  class85.field1118[++class85.field1119 - 1] = var8.field3315;
               } else {
                  class85.field1115[++class85.field1117 - 1] = var8.field3316;
               }
            }

            return 1;
         } else {
            if(var5 == 115) {
               class85.field1118[++class85.field1119 - 1] = "null";
            } else {
               class85.field1115[++class85.field1117 - 1] = 0;
            }

            return 1;
         }
      }
   }

   static final void method902(String var0, int var1, byte var2) {
      class196 var3 = class146.method3363(class192.field2259, client.field761.field1340, -1895086813);
      var3.field2338.method5531(class234.method4198(var0, (byte)109) + 1, 1258821856);
      var3.field2338.method5627(var0, 2039848852);
      var3.field2338.method5697(var1, (byte)-21);
      client.field761.method2361(var3, 852177434);
   }
}
