package src;

public class class73 extends class184 {

   static String field633;
   String field636;
   class290 field627;
   class290 field628;
   class292 field630;
   int field622;
   int field623;
   int field624;
   String field629;
   String field635;


   class73(int var1, String var2, String var3, String var4) {
      this.field627 = class290.field3614;
      this.field628 = class290.field3614;
      this.method1295(var1, var2, var3, var4, 1722078563);
   }

   void method1296(int var1) {
      this.field628 = class95.field1252.field1093.method5117(this.field630, 682162607)?class290.field3613:class290.field3612;
   }

   void method1298(int var1) {
      this.field627 = class95.field1252.field1090.method5117(this.field630, 590485203)?class290.field3613:class290.field3612;
   }

   void method1295(int var1, String var2, String var3, String var4, int var5) {
      this.field622 = class75.method1342(556074954);
      this.field623 = client.field689;
      this.field624 = var1;
      this.field636 = var2;
      this.method1302(-2096124823);
      this.field629 = var3;
      this.field635 = var4;
      this.method1311(-1417196149);
      this.method1299((byte)-42);
   }

   final void method1302(int var1) {
      if(this.field636 != null) {
         this.field630 = new class292(class149.method3386(this.field636, -91906272), class27.field164);
      } else {
         this.field630 = null;
      }

   }

   void method1311(int var1) {
      this.field627 = class290.field3614;
   }

   void method1299(byte var1) {
      this.field628 = class290.field3614;
   }

   final boolean method1316(byte var1) {
      if(this.field627 == class290.field3614) {
         this.method1298(-1598313930);
      }

      return this.field627 == class290.field3613;
   }

   final boolean method1308(byte var1) {
      if(this.field628 == class290.field3614) {
         this.method1296(-929873231);
      }

      return this.field628 == class290.field3613;
   }

   static void method1300(int var0, int var1, int var2, int var3, int var4) {
      for(class84 var5 = (class84)class84.field1097.method4931(); var5 != null; var5 = (class84)class84.field1097.method4949()) {
         if(var5.field1102 != -1 || var5.field1095 != null) {
            int var6 = 0;
            if(var1 > var5.field1110) {
               var6 += var1 - var5.field1110;
            } else if(var1 < var5.field1099) {
               var6 += var5.field1099 - var1;
            }

            if(var2 > var5.field1100) {
               var6 += var2 - var5.field1100;
            } else if(var2 < var5.field1098) {
               var6 += var5.field1098 - var2;
            }

            if(var6 - 64 <= var5.field1106 && client.field758 != 0 && var0 == var5.field1096) {
               var6 -= 64;
               if(var6 < 0) {
                  var6 = 0;
               }

               int var7 = (var5.field1106 - var6) * client.field758 / var5.field1106;
               if(var5.field1108 == null) {
                  if(var5.field1102 >= 0) {
                     class110 var8 = class110.method2455(class301.field3664, var5.field1102, 0);
                     if(var8 != null) {
                        class112 var9 = var8.method2452().method2494(class25.field148);
                        class122 var10 = class122.method2640(var9, 100, var7);
                        var10.method2675(-1);
                        class64.field553.method2385(var10);
                        var5.field1108 = var10;
                     }
                  }
               } else {
                  var5.field1108.method2645(var7);
               }

               if(var5.field1103 == null) {
                  if(var5.field1095 != null && (var5.field1107 -= var3) <= 0) {
                     int var12 = (int)(Math.random() * (double)var5.field1095.length);
                     class110 var13 = class110.method2455(class301.field3664, var5.field1095[var12], 0);
                     if(var13 != null) {
                        class112 var14 = var13.method2452().method2494(class25.field148);
                        class122 var11 = class122.method2640(var14, 100, var7);
                        var11.method2675(0);
                        class64.field553.method2385(var11);
                        var5.field1103 = var11;
                        var5.field1107 = var5.field1104 + (int)(Math.random() * (double)(var5.field1105 - var5.field1104));
                     }
                  }
               } else {
                  var5.field1103.method2645(var7);
                  if(!var5.field1103.method3658()) {
                     var5.field1103 = null;
                  }
               }
            } else {
               if(var5.field1108 != null) {
                  class64.field553.method2386(var5.field1108);
                  var5.field1108 = null;
               }

               if(var5.field1103 != null) {
                  class64.field553.method2386(var5.field1103);
                  var5.field1103 = null;
               }
            }
         }
      }

   }

   public static void method1319(class243 var0, class243 var1, int var2) {
      class255.field3268 = var0;
      class255.field3266 = var1;
      class255.field3260 = class255.field3268.method4246(3, (byte)-5);
   }

   static int method1318(int var0, class101 var1, boolean var2, int var3) {
      class226 var4 = class208.method3898(class85.field1115[--class85.field1117], (byte)-57);
      if(var0 == 2800) {
         class85.field1115[++class85.field1117 - 1] = class31.method388(class71.method1283(var4, -1777210615), -1866970355);
         return 1;
      } else if(var0 != 2801) {
         if(var0 == 2802) {
            if(var4.field2593 == null) {
               class85.field1118[++class85.field1119 - 1] = "";
            } else {
               class85.field1118[++class85.field1119 - 1] = var4.field2593;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var5 = class85.field1115[--class85.field1117];
         --var5;
         if(var4.field2647 != null && var5 < var4.field2647.length && var4.field2647[var5] != null) {
            class85.field1118[++class85.field1119 - 1] = var4.field2647[var5];
         } else {
            class85.field1118[++class85.field1119 - 1] = "";
         }

         return 1;
      }
   }
}
