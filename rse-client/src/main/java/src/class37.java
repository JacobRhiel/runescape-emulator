package src;

public class class37 {

   public static int field277;
   public static short[] field278;
   static class152 field276;
   String field272;
   int field273;
   int field271;
   class26 field274;


   class37(String var1, int var2, int var3, class26 var4) {
      this.field272 = var1;
      this.field273 = var2;
      this.field271 = var3;
      this.field274 = var4;
   }

   static int method517(int var0, class101 var1, boolean var2, int var3) {
      int var4;
      int var5;
      if(var0 == 100) {
         class85.field1117 -= 3;
         var4 = class85.field1115[class85.field1117];
         var5 = class85.field1115[class85.field1117 + 1];
         int var6 = class85.field1115[class85.field1117 + 2];
         if(var5 == 0) {
            throw new RuntimeException();
         } else {
            class226 var7 = class208.method3898(var4, (byte)-1);
            if(var7.field2697 == null) {
               var7.field2697 = new class226[var6 + 1];
            }

            if(var7.field2697.length <= var6) {
               class226[] var8 = new class226[var6 + 1];

               for(int var9 = 0; var9 < var7.field2697.length; ++var9) {
                  var8[var9] = var7.field2697[var9];
               }

               var7.field2697 = var8;
            }

            if(var6 > 0 && var7.field2697[var6 - 1] == null) {
               throw new RuntimeException("" + (var6 - 1));
            } else {
               class226 var13 = new class226();
               var13.field2569 = var5;
               var13.field2586 = var13.field2567 = var7.field2567;
               var13.field2709 = var6;
               var13.field2566 = true;
               var7.field2697[var6] = var13;
               if(var2) {
                  class20.field115 = var13;
               } else {
                  class85.field1130 = var13;
               }

               class68.method1273(var7, 792772494);
               return 1;
            }
         }
      } else {
         class226 var10;
         if(var0 == 101) {
            var10 = var2?class20.field115:class85.field1130;
            class226 var11 = class208.method3898(var10.field2567, (byte)-2);
            var11.field2697[var10.field2709] = null;
            class68.method1273(var11, -249605095);
            return 1;
         } else if(var0 == 102) {
            var10 = class208.method3898(class85.field1115[--class85.field1117], (byte)-19);
            var10.field2697 = null;
            class68.method1273(var10, 2453192);
            return 1;
         } else if(var0 != 200) {
            if(var0 == 201) {
               var10 = class208.method3898(class85.field1115[--class85.field1117], (byte)-97);
               if(var10 != null) {
                  class85.field1115[++class85.field1117 - 1] = 1;
                  if(var2) {
                     class20.field115 = var10;
                  } else {
                     class85.field1130 = var10;
                  }
               } else {
                  class85.field1115[++class85.field1117 - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            class85.field1117 -= 2;
            var4 = class85.field1115[class85.field1117];
            var5 = class85.field1115[class85.field1117 + 1];
            class226 var12 = class19.method224(var4, var5, 143560934);
            if(var12 != null && var5 != -1) {
               class85.field1115[++class85.field1117 - 1] = 1;
               if(var2) {
                  class20.field115 = var12;
               } else {
                  class85.field1130 = var12;
               }
            } else {
               class85.field1115[++class85.field1117 - 1] = 0;
            }

            return 1;
         }
      }
   }
}
