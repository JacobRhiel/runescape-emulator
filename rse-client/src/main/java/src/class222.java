package src;

public class class222 {

   public static int field2530;
   public static char field2531;
   public int field2528;
   public int field2529;
   public int field2532;


   public class222(class222 var1) {
      this.field2528 = var1.field2528;
      this.field2532 = var1.field2532;
      this.field2529 = var1.field2529;
   }

   public class222(int var1, int var2, int var3) {
      this.field2528 = var1;
      this.field2532 = var2;
      this.field2529 = var3;
   }

   public class222(int var1) {
      if(var1 == -1) {
         this.field2528 = -1;
      } else {
         this.field2528 = var1 >> 28 & 3;
         this.field2532 = var1 >> 14 & 16383;
         this.field2529 = var1 & 16383;
      }

   }

   String method4047(String var1, int var2) {
      return this.field2528 + var1 + (this.field2532 >> 6) + var1 + (this.field2529 >> 6) + var1 + (this.field2532 & 63) + var1 + (this.field2529 & 63);
   }

   public int method4043(int var1) {
      return this.field2528 << 28 | this.field2532 << 14 | this.field2529;
   }

   boolean method4042(class222 var1, int var2) {
      return this.field2528 != var1.field2528?false:(this.field2532 != var1.field2532?false:this.field2529 == var1.field2529);
   }

   public boolean equals(Object var1) {
      return this == var1?true:(!(var1 instanceof class222)?false:this.method4042((class222)var1, -2112462573));
   }

   public String toString() {
      return this.method4047(",", 404618696);
   }

   public String aab() {
      return this.method4047(",", -2099021951);
   }

   public String aau() {
      return this.method4047(",", -332870423);
   }

   public String aak() {
      return this.method4047(",", 406555596);
   }

   public int hashCode() {
      return this.method4043(-1927907066);
   }

   static class248[] method4060(byte var0) {
      return new class248[]{class248.field3193, class248.field3192, class248.field3196};
   }

   static final void method4061(int var0, int var1, int var2, int var3, int var4) {
      ++client.field778;
      if(class311.field3717.field983 >> 7 == client.field910 && class311.field3717.field973 >> 7 == client.field911) {
         client.field910 = 0;
      }

      if(client.field799) {
         class22.method254(class311.field3717, false, -591154231);
      }

      class44.method716(-2140521670);
      class100.method2315(true, (byte)32);
      int var5 = class98.field1278;
      int[] var6 = class98.field1271;

      int var7;
      for(var7 = 0; var7 < var5; ++var7) {
         if(var6[var7] != client.field807 && var6[var7] != client.field797) {
            class22.method254(client.players[var6[var7]], true, -591154231);
         }
      }

      class100.method2315(false, (byte)32);

      for(class95 var20 = (class95)client.field810.method4931(); var20 != null; var20 = (class95)client.field810.method4949()) {
         if(var20.field1227 == class71.field610 && client.field689 <= var20.field1234) {
            if(client.field689 >= var20.field1235) {
               if(var20.field1228 > 0) {
                  class88 var22 = client.field721[var20.field1228 - 1];
                  if(var22 != null && var22.field983 >= 0 && var22.field983 < 13312 && var22.field973 >= 0 && var22.field973 < 13312) {
                     var20.method2196(var22.field983, var22.field973, class277.method5013(var22.field983, var22.field973, var20.field1227, 1387596052) - var20.field1232, client.field689, -251648925);
                  }
               }

               if(var20.field1228 < 0) {
                  var7 = -var20.field1228 - 1;
                  class75 var23;
                  if(var7 == client.field797) {
                     var23 = class311.field3717;
                  } else {
                     var23 = client.players[var7];
                  }

                  if(var23 != null && var23.field983 >= 0 && var23.field983 < 13312 && var23.field973 >= 0 && var23.field973 < 13312) {
                     var20.method2196(var23.field983, var23.field973, class277.method5013(var23.field983, var23.field973, var20.field1227, -714855993) - var20.field1232, client.field689, -251648925);
                  }
               }

               var20.method2194(client.field741, -1296799789);
               class14.field60.method3174(class71.field610, (int)var20.field1240, (int)var20.field1239, (int)var20.field1241, 60, var20, var20.field1247, -1L, false);
            }
         } else {
            var20.method3657();
         }
      }

      class21.method249(-2010586363);
      class204.method3751(var0, var1, var2, var3, true, -1868229835);
      var0 = client.field905;
      var1 = client.field940;
      var2 = client.field820;
      var3 = client.field942;
      class330.method6045(var0, var1, var0 + var2, var3 + var1);
      class139.method3133();
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var21;
      if(!client.field888) {
         var5 = client.field824;
         if(client.field941 / 256 > var5) {
            var5 = client.field941 / 256;
         }

         if(client.field926[4] && client.field730[4] + 128 > var5) {
            var5 = client.field730[4] + 128;
         }

         var21 = client.field909 & 2047;
         var7 = class116.field1454;
         var8 = client.field756;
         var9 = class191.field2206;
         var10 = var5 * 3 + 600;
         var11 = class99.method2281(var10, var3, -938707872);
         var12 = 2048 - var5 & 2047;
         var13 = 2048 - var21 & 2047;
         int var14 = 0;
         int var15 = 0;
         int var16 = var11;
         int var17;
         int var18;
         int var19;
         if(var12 != 0) {
            var17 = class139.field1794[var12];
            var18 = class139.field1795[var12];
            var19 = var15 * var18 - var17 * var11 >> 16;
            var16 = var17 * var15 + var11 * var18 >> 16;
            var15 = var19;
         }

         if(var13 != 0) {
            var17 = class139.field1794[var13];
            var18 = class139.field1795[var13];
            var19 = var18 * var14 + var17 * var16 >> 16;
            var16 = var18 * var16 - var17 * var14 >> 16;
            var14 = var19;
         }

         class31.field220 = var7 - var14;
         class14.field63 = var8 - var15;
         class200.field2372 = var9 - var16;
         class74.field638 = var5;
         class32.field230 = var21;
         if(client.field754 == 1 && client.field849 >= 2 && client.field689 % 50 == 0 && (class116.field1454 >> 7 != class311.field3717.field983 >> 7 || class191.field2206 >> 7 != class311.field3717.field973 >> 7)) {
            var17 = class311.field3717.field666;
            var18 = (class116.field1454 >> 7) + class69.field590 * 731242929;
            var19 = (class191.field2206 >> 7) + class89.field1152 * 1825982697;
            class14.method148(var18, var19, var17, true, 1413232162);
         }
      }

      if(!client.field888) {
         var5 = class162.method3489((byte)87);
      } else {
         var5 = class64.method1238((byte)29);
      }

      var21 = class31.field220;
      var7 = class14.field63;
      var8 = class200.field2372;
      var9 = class74.field638;
      var10 = class32.field230;

      for(var11 = 0; var11 < 5; ++var11) {
         if(client.field926[var11]) {
            var12 = (int)(Math.random() * (double)(client.field788[var11] * 2 + 1) - (double)client.field788[var11] + Math.sin((double)client.field929[var11] / 100.0D * (double)client.field930[var11]) * (double)client.field730[var11]);
            if(var11 == 0) {
               class31.field220 += var12;
            }

            if(var11 == 1) {
               class14.field63 += var12;
            }

            if(var11 == 2) {
               class200.field2372 += var12;
            }

            if(var11 == 3) {
               class32.field230 = var12 + class32.field230 & 2047;
            }

            if(var11 == 4) {
               class74.field638 += var12;
               if(class74.field638 < 128) {
                  class74.field638 = 128;
               }

               if(class74.field638 > 383) {
                  class74.field638 = 383;
               }
            }
         }
      }

      var11 = class63.field517;
      var12 = class63.field518;
      if(class63.field524 != 0) {
         var11 = class63.field525;
         var12 = class63.field520;
      }

      if(var11 >= var0 && var11 < var0 + var2 && var12 >= var1 && var12 < var3 + var1) {
         class314.method5859(var11 - var0, var12 - var1, -842833143);
      } else {
         class62.method1155(-1927353059);
      }

      class103.method2342((byte)-20);
      class330.method6052(var0, var1, var2, var3, 0);
      class103.method2342((byte)44);
      var13 = class139.field1780;
      class139.field1780 = client.field943;
      class14.field60.method3203(class31.field220, class14.field63, class200.field2372, class74.field638, class32.field230, var5);
      class139.field1780 = var13;
      class103.method2342((byte)11);
      class14.field60.method3177();
      class63.method1202(var0, var1, var2, var3, -2142619406);
      class160.method3476(var0, var1, 1975650180);
      ((class128)class139.field1781).method2845(client.field741, 2066840456);
      class165.method3509(var0, var1, var2, var3, -447176134);
      class31.field220 = var21;
      class14.field63 = var7;
      class200.field2372 = var8;
      class74.field638 = var9;
      class32.field230 = var10;
      if(client.field701 && class26.method292(true, false, (byte)98) == 0) {
         client.field701 = false;
      }

      if(client.field701) {
         class330.method6052(var0, var1, var2, var3, 0);
         class214.method4004("Loading - please wait.", false, -1315588734);
      }

   }
}
