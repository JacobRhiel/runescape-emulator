package src;

public class class173 extends class179 {

   static int field2022;
   static int field2026;
   static String field2025;
   static class81 field2027;
   int field2020 = 256;
   int field2021 = 1;
   long[] field2028 = new long[10];
   int field2023 = 0;
   long field2019 = class217.method4014(-659005435);
   int field2024;


   class173() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field2028[var1] = this.field2019;
      }

   }

   public int vmethod3578(int var1, int var2, int var3) {
      int var4 = this.field2020;
      int var5 = this.field2021;
      this.field2020 = 300;
      this.field2021 = 1;
      this.field2019 = class217.method4014(-1243027812);
      if(this.field2028[this.field2024] == 0L) {
         this.field2020 = var4;
         this.field2021 = var5;
      } else if(this.field2019 > this.field2028[this.field2024]) {
         this.field2020 = (int)((long)(var1 * 2560) / (this.field2019 - this.field2028[this.field2024]));
      }

      if(this.field2020 < 25) {
         this.field2020 = 25;
      }

      if(this.field2020 > 256) {
         this.field2020 = 256;
         this.field2021 = (int)((long)var1 - (this.field2019 - this.field2028[this.field2024]) / 10L);
      }

      if(this.field2021 > var1) {
         this.field2021 = var1;
      }

      this.field2028[this.field2024] = this.field2019;
      this.field2024 = (this.field2024 + 1) % 10;
      int var6;
      if(this.field2021 > 1) {
         for(var6 = 0; var6 < 10; ++var6) {
            if(this.field2028[var6] != 0L) {
               this.field2028[var6] += (long)this.field2021;
            }
         }
      }

      if(this.field2021 < var2) {
         this.field2021 = var2;
      }

      class169.method3527((long)this.field2021);

      for(var6 = 0; this.field2023 < 256; this.field2023 += this.field2020) {
         ++var6;
      }

      this.field2023 &= 255;
      return var6;
   }

   public void vmethod3577(int var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         this.field2028[var2] = 0L;
      }

   }

   static final void method3539(class226[] var0, int var1, int var2) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         class226 var4 = var0[var3];
         if(var4 != null && var4.field2586 == var1 && (!var4.field2566 || !class30.method356(var4, -1425924887))) {
            int var6;
            if(var4.field2569 == 0) {
               if(!var4.field2566 && class30.method356(var4, -1425924887) && var4 != class9.field52) {
                  continue;
               }

               method3539(var0, var4.field2567, -1836353420);
               if(var4.field2697 != null) {
                  method3539(var4.field2697, var4.field2567, -409985550);
               }

               class70 var5 = (class70)client.field841.method6010((long)var4.field2567);
               if(var5 != null) {
                  var6 = var5.field599;
                  if(class81.method1900(var6, -362825596)) {
                     method3539(class226.field2693[var6], -1, 1550179614);
                  }
               }
            }

            if(var4.field2569 == 6) {
               if(var4.field2614 != -1 || var4.field2615 != -1) {
                  boolean var8 = class21.method250(var4, -74932209);
                  if(var8) {
                     var6 = var4.field2615;
                  } else {
                     var6 = var4.field2614;
                  }

                  if(var6 != -1) {
                     class268 var7 = class253.method4478(var6, 2133438301);

                     for(var4.field2696 += client.field741; var4.field2696 > var7.field3514[var4.field2587]; class68.method1273(var4, -871600928)) {
                        var4.field2696 -= var7.field3514[var4.field2587];
                        ++var4.field2587;
                        if(var4.field2587 >= var7.field3513.length) {
                           var4.field2587 -= var7.field3516;
                           if(var4.field2587 < 0 || var4.field2587 >= var7.field3513.length) {
                              var4.field2587 = 0;
                           }
                        }
                     }
                  }
               }

               if(var4.field2623 != 0 && !var4.field2566) {
                  int var9 = var4.field2623 >> 16;
                  var6 = var4.field2623 << 16 >> 16;
                  var9 *= client.field741;
                  var6 *= client.field741;
                  var4.field2618 = var9 + var4.field2618 & 2047;
                  var4.field2619 = var6 + var4.field2619 & 2047;
                  class68.method1273(var4, 1251578887);
               }
            }
         }
      }

   }

   public static boolean method3546(int var0, int var1) {
      return (var0 >> 29 & 1) != 0;
   }
}
