package src;

import java.util.Comparator;

public abstract class class284 implements Comparator {

   static int[] field3593;
   Comparator field3594;


   protected final int method5087(class283 var1, class283 var2, int var3) {
      return this.field3594 == null?0:this.field3594.compare(var1, var2);
   }

   final void method5086(Comparator var1, int var2) {
      if(this.field3594 == null) {
         this.field3594 = var1;
      } else if(this.field3594 instanceof class284) {
         ((class284)this.field3594).method5086(var1, 1701908034);
      }

   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static int method5095(int var0, class101 var1, boolean var2, int var3) {
      if(var0 == 3300) {
         class85.field1115[++class85.field1117 - 1] = client.field689;
         return 1;
      } else {
         int var4;
         int var5;
         if(var0 == 3301) {
            class85.field1117 -= 2;
            var4 = class85.field1115[class85.field1117];
            var5 = class85.field1115[class85.field1117 + 1];
            class85.field1115[++class85.field1117 - 1] = class201.method3740(var4, var5, 1010005518);
            return 1;
         } else if(var0 == 3302) {
            class85.field1117 -= 2;
            var4 = class85.field1115[class85.field1117];
            var5 = class85.field1115[class85.field1117 + 1];
            class85.field1115[++class85.field1117 - 1] = class196.method3690(var4, var5, 1872697875);
            return 1;
         } else if(var0 == 3303) {
            class85.field1117 -= 2;
            var4 = class85.field1115[class85.field1117];
            var5 = class85.field1115[class85.field1117 + 1];
            class85.field1115[++class85.field1117 - 1] = class93.method2143(var4, var5, 2128537982);
            return 1;
         } else if(var0 == 3304) {
            var4 = class85.field1115[--class85.field1117];
            class85.field1115[++class85.field1117 - 1] = class231.method4193(var4, (byte)111).field3197;
            return 1;
         } else if(var0 == 3305) {
            var4 = class85.field1115[--class85.field1117];
            class85.field1115[++class85.field1117 - 1] = client.field686[var4];
            return 1;
         } else if(var0 == 3306) {
            var4 = class85.field1115[--class85.field1117];
            class85.field1115[++class85.field1117 - 1] = client.field752[var4];
            return 1;
         } else if(var0 == 3307) {
            var4 = class85.field1115[--class85.field1117];
            class85.field1115[++class85.field1117 - 1] = client.field821[var4];
            return 1;
         } else {
            int var6;
            if(var0 == 3308) {
               var4 = class71.field610;
               var5 = (class311.field3717.field983 >> 7) + class69.field590 * 731242929;
               var6 = (class311.field3717.field973 >> 7) + class89.field1152 * 1825982697;
               class85.field1115[++class85.field1117 - 1] = (var5 << 14) + var6 + (var4 << 28);
               return 1;
            } else if(var0 == 3309) {
               var4 = class85.field1115[--class85.field1117];
               class85.field1115[++class85.field1117 - 1] = var4 >> 14 & 16383;
               return 1;
            } else if(var0 == 3310) {
               var4 = class85.field1115[--class85.field1117];
               class85.field1115[++class85.field1117 - 1] = var4 >> 28;
               return 1;
            } else if(var0 == 3311) {
               var4 = class85.field1115[--class85.field1117];
               class85.field1115[++class85.field1117 - 1] = var4 & 16383;
               return 1;
            } else if(var0 == 3312) {
               class85.field1115[++class85.field1117 - 1] = client.field683?1:0;
               return 1;
            } else if(var0 == 3313) {
               class85.field1117 -= 2;
               var4 = class85.field1115[class85.field1117] + '\u8000';
               var5 = class85.field1115[class85.field1117 + 1];
               class85.field1115[++class85.field1117 - 1] = class201.method3740(var4, var5, 1010005518);
               return 1;
            } else if(var0 == 3314) {
               class85.field1117 -= 2;
               var4 = class85.field1115[class85.field1117] + '\u8000';
               var5 = class85.field1115[class85.field1117 + 1];
               class85.field1115[++class85.field1117 - 1] = class196.method3690(var4, var5, 1872697875);
               return 1;
            } else if(var0 == 3315) {
               class85.field1117 -= 2;
               var4 = class85.field1115[class85.field1117] + '\u8000';
               var5 = class85.field1115[class85.field1117 + 1];
               class85.field1115[++class85.field1117 - 1] = class93.method2143(var4, var5, 1982516906);
               return 1;
            } else if(var0 == 3316) {
               if(client.field849 >= 2) {
                  class85.field1115[++class85.field1117 - 1] = client.field849;
               } else {
                  class85.field1115[++class85.field1117 - 1] = 0;
               }

               return 1;
            } else if(var0 == 3317) {
               class85.field1115[++class85.field1117 - 1] = client.field917;
               return 1;
            } else if(var0 == 3318) {
               class85.field1115[++class85.field1117 - 1] = client.field680;
               return 1;
            } else if(var0 == 3321) {
               class85.field1115[++class85.field1117 - 1] = client.field847;
               return 1;
            } else if(var0 == 3322) {
               class85.field1115[++class85.field1117 - 1] = client.field848;
               return 1;
            } else if(var0 == 3323) {
               if(client.field710) {
                  class85.field1115[++class85.field1117 - 1] = 1;
               } else {
                  class85.field1115[++class85.field1117 - 1] = 0;
               }

               return 1;
            } else if(var0 == 3324) {
               class85.field1115[++class85.field1117 - 1] = client.field681;
               return 1;
            } else if(var0 == 3325) {
               class85.field1117 -= 4;
               var4 = class85.field1115[class85.field1117];
               var5 = class85.field1115[class85.field1117 + 1];
               var6 = class85.field1115[class85.field1117 + 2];
               int var7 = class85.field1115[class85.field1117 + 3];
               var4 += var5 << 14;
               var4 += var6 << 28;
               var4 += var7;
               class85.field1115[++class85.field1117 - 1] = var4;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }
}
