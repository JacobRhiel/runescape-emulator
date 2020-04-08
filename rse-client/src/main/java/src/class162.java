package src;

public class class162 extends class284 {

   final boolean field1988;


   public class162(boolean var1) {
      this.field1988 = var1;
   }

   int method3488(class288 var1, class288 var2, int var3) {
      if(client.field680 == var1.field3610) {
         if(var2.field3610 != client.field680) {
            return this.field1988?-1:1;
         }
      } else if(var2.field3610 == client.field680) {
         return this.field1988?1:-1;
      }

      return this.method5087(var1, var2, 268954102);
   }

   public int compare(Object var1, Object var2) {
      return this.method3488((class288)var1, (class288)var2, -956709758);
   }

   static final int method3489(byte var0) {
      if(class76.field676.field1077) {
         return class71.field610;
      } else {
         int var1 = 3;
         if(class74.field638 < 310) {
            int var2;
            int var3;
            if(client.field754 == 1) {
               var2 = class116.field1454 >> 7;
               var3 = class191.field2206 >> 7;
            } else {
               var2 = class311.field3717.field983 >> 7;
               var3 = class311.field3717.field973 >> 7;
            }

            int var4 = class31.field220 >> 7;
            int var5 = class200.field2372 >> 7;
            if(var4 < 0 || var5 < 0 || var4 >= 104 || var5 >= 104) {
               return class71.field610;
            }

            if(var2 < 0 || var3 < 0 || var2 >= 104 || var3 >= 104) {
               return class71.field610;
            }

            if((class64.field535[class71.field610][var4][var5] & 4) != 0) {
               var1 = class71.field610;
            }

            int var6;
            if(var2 > var4) {
               var6 = var2 - var4;
            } else {
               var6 = var4 - var2;
            }

            int var7;
            if(var3 > var5) {
               var7 = var3 - var5;
            } else {
               var7 = var5 - var3;
            }

            int var8;
            int var9;
            if(var6 > var7) {
               var8 = var7 * 65536 / var6;
               var9 = '\u8000';

               while(var2 != var4) {
                  if(var4 < var2) {
                     ++var4;
                  } else if(var4 > var2) {
                     --var4;
                  }

                  if((class64.field535[class71.field610][var4][var5] & 4) != 0) {
                     var1 = class71.field610;
                  }

                  var9 += var8;
                  if(var9 >= 65536) {
                     var9 -= 65536;
                     if(var5 < var3) {
                        ++var5;
                     } else if(var5 > var3) {
                        --var5;
                     }

                     if((class64.field535[class71.field610][var4][var5] & 4) != 0) {
                        var1 = class71.field610;
                     }
                  }
               }
            } else if(var7 > 0) {
               var8 = var6 * 65536 / var7;
               var9 = '\u8000';

               while(var5 != var3) {
                  if(var5 < var3) {
                     ++var5;
                  } else if(var5 > var3) {
                     --var5;
                  }

                  if((class64.field535[class71.field610][var4][var5] & 4) != 0) {
                     var1 = class71.field610;
                  }

                  var9 += var8;
                  if(var9 >= 65536) {
                     var9 -= 65536;
                     if(var4 < var2) {
                        ++var4;
                     } else if(var4 > var2) {
                        --var4;
                     }

                     if((class64.field535[class71.field610][var4][var5] & 4) != 0) {
                        var1 = class71.field610;
                     }
                  }
               }
            }
         }

         if(class311.field3717.field983 >= 0 && class311.field3717.field973 >= 0 && class311.field3717.field983 < 13312 && class311.field3717.field973 < 13312) {
            if((class64.field535[class71.field610][class311.field3717.field983 >> 7][class311.field3717.field973 >> 7] & 4) != 0) {
               var1 = class71.field610;
            }

            return var1;
         } else {
            return class71.field610;
         }
      }
   }
}
