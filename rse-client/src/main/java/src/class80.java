package src;

public class class80 {

   static int field1044 = 0;
   static int field1045 = 0;
   static int[] field1048 = new int[]{1, 1, 1, 1};
   static int[] field1047 = new int[]{0, 1, 2, 3};
   int field1049;
   int field1054;
   int field1050;
   String field1051;
   int field1040;
   String field1052;
   int field1053;


   boolean method1886(byte var1) {
      return (1 & this.field1049) != 0;
   }

   boolean method1859(int var1) {
      return (33554432 & this.field1049) != 0;
   }

   boolean method1858(int var1) {
      return (536870912 & this.field1049) != 0;
   }

   boolean method1865(byte var1) {
      return (1073741824 & this.field1049) != 0;
   }

   boolean method1856(int var1) {
      return (4 & this.field1049) != 0;
   }

   boolean method1857(byte var1) {
      return (8 & this.field1049) != 0;
   }

   boolean method1855(int var1) {
      return (2 & this.field1049) != 0;
   }

   static final void method1884(int var0, int var1, int var2) {
      class271 var3 = client.field808[class71.field610][var0][var1];
      if(var3 == null) {
         class14.field60.method3184(class71.field610, var0, var1);
      } else {
         long var4 = -99999999L;
         class96 var6 = null;

         class96 var7;
         for(var7 = (class96)var3.method4931(); var7 != null; var7 = (class96)var3.method4949()) {
            class264 var8 = class30.method373(var7.field1254, (byte)70);
            long var9 = (long)var8.field3417;
            if(var8.field3418 == 1) {
               var9 *= (long)(var7.field1257 + 1);
            }

            if(var9 > var4) {
               var4 = var9;
               var6 = var7;
            }
         }

         if(var6 == null) {
            class14.field60.method3184(class71.field610, var0, var1);
         } else {
            var3.method4927(var6);
            class96 var13 = null;
            class96 var12 = null;

            for(var7 = (class96)var3.method4931(); var7 != null; var7 = (class96)var3.method4949()) {
               if(var7.field1254 != var6.field1254) {
                  if(var13 == null) {
                     var13 = var7;
                  }

                  if(var13.field1254 != var7.field1254 && var12 == null) {
                     var12 = var7;
                  }
               }
            }

            long var10 = class337.method6337(var0, var1, 3, false, 0, 990473034);
            class14.field60.method3170(class71.field610, var0, var1, class277.method5013(var0 * 128 + 64, var1 * 128 + 64, class71.field610, 5787884), var6, var10, var13, var12);
         }
      }
   }

   public static void method1894(class243 var0, class243 var1, class243 var2, class243 var3, short var4) {
      class226.field2559 = var0;
      class116.field1455 = var1;
      class221.field2521 = var2;
      class226.field2560 = var3;
      class226.field2693 = new class226[class226.field2559.method4235((byte)-30)][];
      class226.field2583 = new boolean[class226.field2559.method4235((byte)-27)];
   }

   public static boolean method1893(char var0, byte var1) {
      return var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
   }
}
