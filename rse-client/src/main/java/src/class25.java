package src;

public class class25 {

   static class121 field148;
   static class245 field144;


   public static class251 method279(int var0, int var1) {
      return var0 >= 0 && var0 < class251.field3219.length && class251.field3219[var0] != null?class251.field3219[var0]:new class251(var0);
   }

   public static boolean method280(int var0, int var1) {
      return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
   }

   public static void method277(int var0) {
      class105.field1341 = new class270();
   }

   static void method278(class308 var0, int var1, short var2) {
      boolean var3 = var0.method5495(1, (byte)-51) == 1;
      if(var3) {
         class98.field1279[++class98.field1265 - 1] = var1;
      }

      int var4 = var0.method5495(2, (byte)-39);
      class75 var5 = client.players[var1];
      if(var4 == 0) {
         if(var3) {
            var5.field670 = false;
         } else if(client.field797 == var1) {
            throw new RuntimeException();
         } else {
            class98.field1274[var1] = (var5.field666 << 28) + (class69.field590 * 731242929 + var5.field1028[0] >> 13 << 14) + (var5.field1029[0] + class89.field1152 * 1825982697 >> 13);
            if(var5.field1015 != -1) {
               class98.field1275[var1] = var5.field1015;
            } else {
               class98.field1275[var1] = var5.field979;
            }

            class98.field1276[var1] = var5.field999;
            client.players[var1] = null;
            if(var0.method5495(1, (byte)-1) != 0) {
               class22.method257(var0, var1, (byte)127);
            }

         }
      } else {
         int var6;
         int var7;
         int var8;
         if(var4 == 1) {
            var6 = var0.method5495(3, (byte)-36);
            var7 = var5.field1028[0];
            var8 = var5.field1029[0];
            if(var6 == 0) {
               --var7;
               --var8;
            } else if(var6 == 1) {
               --var8;
            } else if(var6 == 2) {
               ++var7;
               --var8;
            } else if(var6 == 3) {
               --var7;
            } else if(var6 == 4) {
               ++var7;
            } else if(var6 == 5) {
               --var7;
               ++var8;
            } else if(var6 == 6) {
               ++var8;
            } else if(var6 == 7) {
               ++var7;
               ++var8;
            }

            if(client.field797 == var1 && (var5.field983 < 1536 || var5.field973 < 1536 || var5.field983 >= 11776 || var5.field973 >= 11776)) {
               var5.method1379(var7, var8, -2125084114);
               var5.field670 = false;
            } else if(var3) {
               var5.field670 = true;
               var5.field665 = var7;
               var5.field672 = var8;
            } else {
               var5.field670 = false;
               var5.method1339(var7, var8, class98.field1273[var1], -1177435020);
            }

         } else if(var4 == 2) {
            var6 = var0.method5495(4, (byte)-87);
            var7 = var5.field1028[0];
            var8 = var5.field1029[0];
            if(var6 == 0) {
               var7 -= 2;
               var8 -= 2;
            } else if(var6 == 1) {
               --var7;
               var8 -= 2;
            } else if(var6 == 2) {
               var8 -= 2;
            } else if(var6 == 3) {
               ++var7;
               var8 -= 2;
            } else if(var6 == 4) {
               var7 += 2;
               var8 -= 2;
            } else if(var6 == 5) {
               var7 -= 2;
               --var8;
            } else if(var6 == 6) {
               var7 += 2;
               --var8;
            } else if(var6 == 7) {
               var7 -= 2;
            } else if(var6 == 8) {
               var7 += 2;
            } else if(var6 == 9) {
               var7 -= 2;
               ++var8;
            } else if(var6 == 10) {
               var7 += 2;
               ++var8;
            } else if(var6 == 11) {
               var7 -= 2;
               var8 += 2;
            } else if(var6 == 12) {
               --var7;
               var8 += 2;
            } else if(var6 == 13) {
               var8 += 2;
            } else if(var6 == 14) {
               ++var7;
               var8 += 2;
            } else if(var6 == 15) {
               var7 += 2;
               var8 += 2;
            }

            if(client.field797 == var1 && (var5.field983 < 1536 || var5.field973 < 1536 || var5.field983 >= 11776 || var5.field973 >= 11776)) {
               var5.method1379(var7, var8, -2123578999);
               var5.field670 = false;
            } else if(var3) {
               var5.field670 = true;
               var5.field665 = var7;
               var5.field672 = var8;
            } else {
               var5.field670 = false;
               var5.method1339(var7, var8, class98.field1273[var1], -603879033);
            }

         } else {
            var6 = var0.method5495(1, (byte)16);
            int var9;
            int var10;
            int var11;
            int var12;
            if(var6 == 0) {
               var7 = var0.method5495(12, (byte)14);
               var8 = var7 >> 10;
               var9 = var7 >> 5 & 31;
               if(var9 > 15) {
                  var9 -= 32;
               }

               var10 = var7 & 31;
               if(var10 > 15) {
                  var10 -= 32;
               }

               var11 = var9 + var5.field1028[0];
               var12 = var10 + var5.field1029[0];
               if(client.field797 == var1 && (var5.field983 < 1536 || var5.field973 < 1536 || var5.field983 >= 11776 || var5.field973 >= 11776)) {
                  var5.method1379(var11, var12, -2147040299);
                  var5.field670 = false;
               } else if(var3) {
                  var5.field670 = true;
                  var5.field665 = var11;
                  var5.field672 = var12;
               } else {
                  var5.field670 = false;
                  var5.method1339(var11, var12, class98.field1273[var1], -1581372991);
               }

               var5.field666 = (byte)(var8 + var5.field666 & 3);
               if(client.field797 == var1) {
                  class71.field610 = var5.field666;
               }

            } else {
               var7 = var0.method5495(30, (byte)109);
               var8 = var7 >> 28;
               var9 = var7 >> 14 & 16383;
               var10 = var7 & 16383;
               var11 = (var9 + var5.field1028[0] + class69.field590 * 731242929 & 16383) - class69.field590 * 731242929;
               var12 = (var10 + class89.field1152 * 1825982697 + var5.field1029[0] & 16383) - class89.field1152 * 1825982697;
               if(client.field797 == var1 && (var5.field983 < 1536 || var5.field973 < 1536 || var5.field983 >= 11776 || var5.field973 >= 11776)) {
                  var5.method1379(var11, var12, -2134283355);
                  var5.field670 = false;
               } else if(var3) {
                  var5.field670 = true;
                  var5.field665 = var11;
                  var5.field672 = var12;
               } else {
                  var5.field670 = false;
                  var5.method1339(var11, var12, class98.field1273[var1], 210118067);
               }

               var5.field666 = (byte)(var8 + var5.field666 & 3);
               if(client.field797 == var1) {
                  class71.field610 = var5.field666;
               }

            }
         }
      }
   }
}
