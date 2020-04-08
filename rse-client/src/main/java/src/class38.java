package src;

import java.util.*;
import java.util.Map.Entry;

public class class38 {

   public static class158 field289 = new class158(37748736, 256);
   static class317 field295;
   static class245 field293;
   List field282;
   LinkedList field286;
   HashMap field290;
   class24 field279;
   int field283;
   int field288;
   int field284;
   final HashMap field291;
   int field287;


   class38(int var1, int var2, int var3, HashMap var4) {
      this.field283 = var1;
      this.field284 = var2;
      this.field286 = new LinkedList();
      this.field282 = new LinkedList();
      this.field290 = new HashMap();
      this.field287 = var3 | -16777216;
      this.field291 = var4;
   }

   void method527(int var1, int var2, class30 var3, byte var4) {
      for(int var5 = 0; var5 < var3.field200; ++var5) {
         class34[] var6 = var3.field207[var5][var1][var2];
         if(var6 != null && var6.length != 0) {
            class34[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               class34 var9 = var7[var8];
               int var11 = var9.field247;
               boolean var10 = var11 >= class229.field2732.field2741 && var11 <= class229.field2742.field2741 || var11 == class229.field2722.field2741;
               if(var10) {
                  class263 var12 = class33.method435(var9.field249, 1650295452);
                  int var13 = var12.field3363 != 0?-3407872:-3355444;
                  if(var9.field247 == class229.field2732.field2741) {
                     this.method552(var1, var2, var9.field250, var13, (byte)-23);
                  }

                  if(var9.field247 == class229.field2728.field2741) {
                     this.method552(var1, var2, var9.field250, -3355444, (byte)-42);
                     this.method552(var1, var2, var9.field250 + 1, var13, (byte)-39);
                  }

                  if(var9.field247 == class229.field2742.field2741) {
                     if(var9.field250 == 0) {
                        class330.method6057(this.field288 * var1, this.field288 * (63 - var2), 1, var13);
                     }

                     if(var9.field250 == 1) {
                        class330.method6057(this.field288 * var1 + this.field288 - 1, this.field288 * (63 - var2), 1, var13);
                     }

                     if(var9.field250 == 2) {
                        class330.method6057(this.field288 + this.field288 * var1 - 1, this.field288 * (63 - var2) + this.field288 - 1, 1, var13);
                     }

                     if(var9.field250 == 3) {
                        class330.method6057(this.field288 * var1, this.field288 * (63 - var2) + this.field288 - 1, 1, var13);
                     }
                  }

                  if(var9.field247 == class229.field2722.field2741) {
                     int var14 = var9.field250 % 2;
                     int var15;
                     if(var14 == 0) {
                        for(var15 = 0; var15 < this.field288; ++var15) {
                           class330.method6057(var15 + this.field288 * var1, (64 - var2) * this.field288 - 1 - var15, 1, var13);
                        }
                     } else {
                        for(var15 = 0; var15 < this.field288; ++var15) {
                           class330.method6057(var15 + this.field288 * var1, var15 + this.field288 * (63 - var2), 1, var13);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void method560(int var1, int var2, HashSet var3, int var4, int var5) {
      float var6 = (float)var4 / 64.0F;
      float var7 = var6 / 2.0F;
      Iterator var8 = this.field290.entrySet().iterator();

      while(var8.hasNext()) {
         Entry var9 = (Entry)var8.next();
         class222 var10 = (class222)var9.getKey();
         int var11 = (int)((float)var1 + var6 * (float)var10.field2532 - var7);
         int var12 = (int)((float)(var2 + var4) - (float)var10.field2529 * var6 - var7);
         class43 var13 = (class43)var9.getValue();
         if(var13 != null && var13.method689((short)-9910)) {
            var13.field330 = var11;
            var13.field329 = var12;
            class251 var14 = class25.method279(var13.vmethod685((byte)24), -1471142754);
            if(!var3.contains(Integer.valueOf(var14.method4458(1436204675)))) {
               this.method542(var13, var11, var12, var6, 1195952860);
            }
         }
      }

   }

   void method518(int var1, int var2, class30 var3, class333[] var4, int var5) {
      for(int var6 = 0; var6 < var3.field200; ++var6) {
         class34[] var7 = var3.field207[var6][var1][var2];
         if(var7 != null && var7.length != 0) {
            class34[] var8 = var7;

            for(int var9 = 0; var9 < var8.length; ++var9) {
               class34 var10 = var8[var9];
               if(!class144.method3360(var10.field247, -1030899417)) {
                  int var12 = var10.field247;
                  boolean var11 = var12 == class229.field2740.field2741;
                  if(!var11) {
                     continue;
                  }
               }

               class263 var13 = class33.method435(var10.field249, 1650295452);
               if(var13.field3391 != -1) {
                  if(var13.field3391 != 46 && var13.field3391 != 52) {
                     var4[var13.field3391].method6174(this.field288 * var1, this.field288 * (63 - var2), this.field288 * 2, this.field288 * 2);
                  } else {
                     var4[var13.field3391].method6174(this.field288 * var1, this.field288 * (63 - var2), this.field288 * 2 + 1, this.field288 * 2 + 1);
                  }
               }
            }
         }
      }

   }

   void method534(int var1, int var2, class30 var3, class49 var4, class36 var5, int var6) {
      int var7 = var3.field204[0][var1][var2] - 1;
      int var8 = var3.field196[0][var1][var2] - 1;
      if(var7 == -1 && var8 == -1) {
         class330.method6052(this.field288 * var1, this.field288 * (63 - var2), this.field288, this.field288, this.field287);
      }

      int var9 = 16711935;
      if(var8 != -1) {
         var9 = class169.method3531(var8, this.field287, 2060432902);
      }

      if(var8 > -1 && var3.field205[0][var1][var2] == 0) {
         class330.method6052(this.field288 * var1, this.field288 * (63 - var2), this.field288, this.field288, var9);
      } else {
         int var10 = this.method536(var1, var2, var3, var5, 1185225383);
         if(var8 == -1) {
            class330.method6052(this.field288 * var1, this.field288 * (63 - var2), this.field288, this.field288, var10);
         } else {
            var4.method818(this.field288 * var1, this.field288 * (63 - var2), var10, var9, this.field288, this.field288, var3.field205[0][var1][var2], var3.field206[0][var1][var2], (byte)-32);
         }
      }
   }

   void method585(int var1, int var2, HashSet var3, int var4, int var5) {
      float var6 = (float)var4 / 64.0F;
      Iterator var7 = this.field282.iterator();

      while(var7.hasNext()) {
         class43 var8 = (class43)var7.next();
         if(var8.method689((short)-25779)) {
            int var9 = var8.field326.field2532 % 64;
            int var10 = var8.field326.field2529 % 64;
            var8.field330 = (int)((float)var9 * var6 + (float)var1);
            var8.field329 = (int)((float)var2 + (float)(63 - var10) * var6);
            if(!var3.contains(Integer.valueOf(var8.vmethod685((byte)10)))) {
               this.method542(var8, var8.field330, var8.field329, var6, 1195952860);
            }
         }
      }

   }

   int method546(class334 var1, class265 var2, byte var3) {
      switch(var2.field3454) {
      case 0:
         return -var1.field3889 / 2;
      case 2:
         return 0;
      default:
         return -var1.field3889;
      }
   }

   void method533(int var1, int var2, class30 var3, class49 var4, class333[] var5, int var6) {
      this.method527(var1, var2, var3, (byte)-16);
      this.method518(var1, var2, var3, var5, -2109478496);
   }

   void method597(List var1, int var2) {
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class27 var4 = (class27)var3.next();
         if(var4.field326.field2532 >> 6 == this.field283 && var4.field326.field2529 >> 6 == this.field284) {
            class27 var5 = new class27(var4.field326, var4.field326, var4.field169, this.method548(var4.field169, 1415397741));
            this.field282.add(var5);
         }
      }

   }

   class37 method549(class251 var1, byte var2) {
      if(var1.field3215 != null && this.field291 != null && this.field291.get(class26.field159) != null) {
         int var4 = var1.field3217;
         class26[] var5 = class26.method284(-1367790562);
         int var6 = 0;

         class26 var3;
         while(true) {
            if(var6 >= var5.length) {
               var3 = null;
               break;
            }

            class26 var7 = var5[var6];
            if(var4 == var7.field155) {
               var3 = var7;
               break;
            }

            ++var6;
         }

         if(var3 == null) {
            return null;
         } else {
            class304 var15 = (class304)this.field291.get(var3);
            if(var15 == null) {
               return null;
            } else {
               int var16 = var15.method5454(var1.field3215, 1000000);
               String[] var8 = new String[var16];
               var15.method5385(var1.field3215, (int[])null, var8);
               int var9 = var8.length * var15.field3682 / 2;
               int var10 = 0;
               String[] var11 = var8;

               for(int var12 = 0; var12 < var11.length; ++var12) {
                  String var13 = var11[var12];
                  int var14 = var15.method5384(var13);
                  if(var14 > var10) {
                     var10 = var14;
                  }
               }

               return new class37(var1.field3215, var10, var9, var3);
            }
         }
      } else {
         return null;
      }
   }

   void method540(HashSet var1, int var2, int var3, int var4) {
      Iterator var5 = this.field282.iterator();

      while(var5.hasNext()) {
         class43 var6 = (class43)var5.next();
         if(var6.method689((short)-17885)) {
            class251 var7 = class25.method279(var6.vmethod685((byte)46), 1775736073);
            if(var7 != null && var1.contains(Integer.valueOf(var7.method4458(1295053818)))) {
               this.method541(var7, var6.field330, var6.field329, var2, var3, (short)4032);
            }
         }
      }

   }

   void method535(int var1, int var2, class30 var3, class49 var4, byte var5) {
      for(int var6 = 1; var6 < var3.field200; ++var6) {
         int var7 = var3.field196[var6][var1][var2] - 1;
         if(var7 > -1) {
            int var8 = class169.method3531(var7, this.field287, 2018320702);
            if(var3.field205[var6][var1][var2] == 0) {
               class330.method6052(this.field288 * var1, this.field288 * (63 - var2), this.field288, this.field288, var8);
            } else {
               var4.method818(this.field288 * var1, this.field288 * (63 - var2), 0, var8, this.field288, this.field288, var3.field205[var6][var1][var2], var3.field206[var6][var1][var2], (byte)-77);
            }
         }
      }

   }

   void method543(class251 var1, int var2, int var3, byte var4) {
      class334 var5 = var1.method4443(false, 1139158524);
      if(var5 != null) {
         int var6 = this.method546(var5, var1.field3228, (byte)1);
         int var7 = this.method547(var5, var1.field3226, (byte)-110);
         var5.method6187(var6 + var2, var3 + var7);
      }

   }

   int method547(class334 var1, class248 var2, byte var3) {
      switch(var2.field3194) {
      case 0:
         return 0;
      case 1:
         return -var1.field3899 / 2;
      default:
         return -var1.field3899;
      }
   }

   void method544(class43 var1, class251 var2, int var3, int var4, float var5, int var6) {
      class37 var7 = var1.vmethod710(-171990446);
      if(var7 != null) {
         if(var7.field274.method289(var5, (byte)-55)) {
            class304 var8 = (class304)this.field291.get(var7.field274);
            var8.method5397(var7.field272, var3 - var7.field273 / 2, var4, var7.field273, var7.field271, -16777216 | var2.field3216, 0, 1, 0, var8.field3682 / 2);
         }
      }
   }

   void method522(int var1, int var2, int var3, int var4, class30 var5, short var6) {
      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         int var8 = var2;

         while(var8 < var2 + var4) {
            int var9 = 0;

            while(true) {
               if(var9 < var5.field200) {
                  label61: {
                     class34[] var10 = var5.field207[var9][var7][var8];
                     if(var10 != null && var10.length != 0) {
                        class34[] var11 = var10;

                        for(int var12 = 0; var12 < var11.length; ++var12) {
                           class34 var13 = var11[var12];
                           class263 var14 = class33.method435(var13.field249, 1650295452);
                           if(class64.method1239(var14, -1065823023)) {
                              this.method564(var14, var9, var7, var8, var5, -332727967);
                              break label61;
                           }
                        }
                     }

                     ++var9;
                     continue;
                  }
               }

               ++var8;
               break;
            }
         }
      }

   }

   int method536(int var1, int var2, class30 var3, class36 var4, int var5) {
      return var3.field204[0][var1][var2] == 0?this.field287:var4.method512(var1, var2, 1469556779);
   }

   boolean method539(class243 var1, int var2) {
      this.field290.clear();
      if(this.field279 != null) {
         this.field279.method352(var1, -1013927348);
         if(this.field279.method370(-2034466824)) {
            this.method522(0, 0, 64, 64, this.field279, (short)-7361);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var3 = true;

         Iterator var4;
         class48 var5;
         for(var4 = this.field286.iterator(); var4.hasNext(); var3 &= var5.method370(-1589760652)) {
            var5 = (class48)var4.next();
            var5.method352(var1, -652815893);
         }

         if(var3) {
            var4 = this.field286.iterator();

            while(var4.hasNext()) {
               var5 = (class48)var4.next();
               this.method522(var5.method784(-2123096151) * 8, var5.method789(-50915018) * 8, 8, 8, var5, (short)-32666);
            }
         }

         return var3;
      }
   }

   List method551(int var1) {
      LinkedList var2 = new LinkedList();
      var2.addAll(this.field282);
      var2.addAll(this.field290.values());
      return var2;
   }

   class37 method548(int var1, int var2) {
      class251 var3 = class25.method279(var1, -2023666447);
      return this.method549(var3, (byte)27);
   }

   void method541(class251 var1, int var2, int var3, int var4, int var5, short var6) {
      class334 var7 = var1.method4443(false, 1102324644);
      if(var7 != null) {
         var7.method6187(var2 - var7.field3889 / 2, var3 - var7.field3899 / 2);
         if(var4 % var5 < var5 / 2) {
            class330.method6110(var2, var3, 15, 16776960, 128);
            class330.method6110(var2, var3, 7, 16777215, 256);
         }

      }
   }

   void method564(class263 var1, int var2, int var3, int var4, class30 var5, int var6) {
      class222 var7 = new class222(var2, var3 + this.field283 * 64, this.field284 * 64 + var4);
      class222 var8 = null;
      if(this.field279 != null) {
         var8 = new class222(this.field279.field199 + var2, var3 + this.field279.field203 * 64, var4 + this.field279.field195 * 64);
      } else {
         class48 var9 = (class48)var5;
         var8 = new class222(var2 + var9.field199, var3 + var9.field203 * 64 + var9.method786((byte)3) * 8, var9.field195 * 64 + var4 + var9.method787(-1104006476) * 8);
      }

      Object var11;
      if(var1.field3385 != null) {
         var11 = new class32(var8, var7, var1.field3351, this);
      } else {
         class251 var10 = class25.method279(var1.field3372, -1600921872);
         var11 = new class27(var8, var7, var10.field3212, this.method549(var10, (byte)98));
      }

      this.field290.put(new class222(0, var3, var4), var11);
   }

   void method581(short var1) {
      Iterator var2 = this.field290.values().iterator();

      while(var2.hasNext()) {
         class43 var3 = (class43)var2.next();
         if(var3 instanceof class32) {
            ((class32)var3).method390((short)10774);
         }
      }

   }

   void method542(class43 var1, int var2, int var3, float var4, int var5) {
      class251 var6 = class25.method279(var1.vmethod685((byte)10), 272400005);
      this.method543(var6, var2, var3, (byte)15);
      this.method544(var1, var6, var2, var3, var4, 630638914);
   }

   void method618(HashSet var1, int var2, int var3, byte var4) {
      Iterator var5 = this.field290.values().iterator();

      while(var5.hasNext()) {
         class43 var6 = (class43)var5.next();
         if(var6.method689((short)-3925)) {
            int var7 = var6.vmethod685((byte)30);
            if(var1.contains(Integer.valueOf(var7))) {
               class251 var8 = class25.method279(var7, -1327384623);
               this.method541(var8, var6.field330, var6.field329, var2, var3, (short)4032);
            }
         }
      }

      this.method540(var1, var2, var3, 1080849523);
   }

   void method552(int var1, int var2, int var3, int var4, byte var5) {
      var3 %= 4;
      if(var3 == 0) {
         class330.method6059(this.field288 * var1, this.field288 * (63 - var2), this.field288, var4);
      }

      if(var3 == 1) {
         class330.method6057(this.field288 * var1, this.field288 * (63 - var2), this.field288, var4);
      }

      if(var3 == 2) {
         class330.method6059(this.field288 + this.field288 * var1 - 1, this.field288 * (63 - var2), this.field288, var4);
      }

      if(var3 == 3) {
         class330.method6057(this.field288 * var1, this.field288 * (63 - var2) + this.field288 - 1, this.field288, var4);
      }

   }

   void method531(class49 var1, class333[] var2, class36 var3, int var4) {
      int var5;
      int var6;
      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method534(var5, var6, this.field279, var1, var3, 700550528);
            this.method535(var5, var6, this.field279, var1, (byte)7);
         }
      }

      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method533(var5, var6, this.field279, var1, var2, 642220126);
         }
      }

   }

   void method532(class49 var1, class333[] var2, class36 var3, byte var4) {
      Iterator var5 = this.field286.iterator();

      class48 var6;
      int var7;
      int var8;
      while(var5.hasNext()) {
         var6 = (class48)var5.next();

         for(var7 = var6.method784(-2146696934) * 8; var7 < var6.method784(-2058477548) * 8 + 8; ++var7) {
            for(var8 = var6.method789(-99924711) * 8; var8 < var6.method789(1625905585) * 8 + 8; ++var8) {
               this.method534(var7, var8, var6, var1, var3, -1562643404);
               this.method535(var7, var8, var6, var1, (byte)7);
            }
         }
      }

      var5 = this.field286.iterator();

      while(var5.hasNext()) {
         var6 = (class48)var5.next();

         for(var7 = var6.method784(-2040885780) * 8; var7 < var6.method784(-2106316858) * 8 + 8; ++var7) {
            for(var8 = var6.method789(-301988857) * 8; var8 < var6.method789(559439119) * 8 + 8; ++var8) {
               this.method533(var7, var8, var6, var1, var2, -1088050040);
            }
         }
      }

   }

   void method529(int var1, int var2, int var3, HashSet var4, byte var5) {
      if(var4 == null) {
         var4 = new HashSet();
      }

      this.method560(var1, var2, var4, var3, -1793934594);
      this.method585(var1, var2, var4, var3, -1206739508);
   }

   List method606(int var1, int var2, int var3, int var4, int var5, int var6) {
      LinkedList var7 = new LinkedList();
      if(var4 >= var1 && var5 >= var2) {
         if(var4 < var3 + var1 && var5 < var3 + var2) {
            Iterator var8 = this.field290.values().iterator();

            class43 var9;
            while(var8.hasNext()) {
               var9 = (class43)var8.next();
               if(var9.method689((short)-32437) && var9.method711(var4, var5, -57056512)) {
                  var7.add(var9);
               }
            }

            var8 = this.field282.iterator();

            while(var8.hasNext()) {
               var9 = (class43)var8.next();
               if(var9.method689((short)-29281) && var9.method711(var4, var5, -1549550670)) {
                  var7.add(var9);
               }
            }

            return var7;
         } else {
            return var7;
         }
      } else {
         return var7;
      }
   }

   void method526(int var1) {
      if(this.field279 != null) {
         this.field279.method360(778691024);
      } else {
         Iterator var2 = this.field286.iterator();

         while(var2.hasNext()) {
            class48 var3 = (class48)var2.next();
            var3.method360(-339955393);
         }
      }

   }

   void method528(int var1, class49 var2, class333[] var3, class243 var4, class243 var5, int var6) {
      this.field288 = var1;
      if(this.field279 != null || !this.field286.isEmpty()) {
         int var8 = this.field283;
         int var9 = this.field284;
         class334 var7 = (class334)field289.method3458(class265.method4753(var8, var9, var1, (byte)-36));
         if(var7 == null) {
            boolean var10 = true;
            var10 &= this.method539(var4, 155508897);
            int var12;
            if(this.field279 != null) {
               var12 = this.field279.field201;
            } else {
               var12 = ((class30)this.field286.getFirst()).field201;
            }

            var10 &= var5.method4250(var12, (byte)-102);
            if(var10) {
               byte[] var11 = var5.method4231(var12, 1106447442);
               class36 var13;
               if(var11 == null) {
                  var13 = new class36();
               } else {
                  var13 = new class36(class200.method3731(var11, 1914543417).field3896);
               }

               class334 var15 = new class334(this.field288 * 64, this.field288 * 64);
               var15.method6179();
               if(this.field279 != null) {
                  this.method531(var2, var3, var13, -1199825986);
               } else {
                  this.method532(var2, var3, var13, (byte)-33);
               }

               int var16 = this.field283;
               int var17 = this.field284;
               int var18 = this.field288;
               field289.method3445(var15, class265.method4753(var16, var17, var18, (byte)-25), var15.field3896.length * 4);
               this.method526(-949994571);
            }
         }
      }
   }

   void method519(int var1, int var2, int var3, int var4) {
      int var6 = this.field283;
      int var7 = this.field284;
      int var8 = this.field288;
      class334 var5 = (class334)field289.method3458(class265.method4753(var6, var7, var8, (byte)3));
      if(var5 != null) {
         if(var3 == this.field288 * 64) {
            var5.method6185(var1, var2);
         } else {
            var5.method6287(var1, var2, var3, var3);
         }

      }
   }

   void method520(class24 var1, List var2, int var3) {
      this.field290.clear();
      this.field279 = var1;
      this.method597(var2, -2024138363);
   }

   void method561(HashSet var1, List var2, int var3) {
      this.field290.clear();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         class48 var5 = (class48)var4.next();
         if(var5.method358(-1491010463) == this.field283 && var5.method359(-1765071550) == this.field284) {
            this.field286.add(var5);
         }
      }

      this.method597(var2, -2024138363);
   }

   static final void method537(byte var0) {
      for(int var1 = 0; var1 < class98.field1278; ++var1) {
         class75 var2 = client.players[class98.field1271[var1]];
         var2.method1375((byte)81);
      }

   }

   static final void method630(int var0) {
      int[] var1 = class98.field1271;

      int var2;
      for(var2 = 0; var2 < class98.field1278; ++var2) {
         class75 var3 = client.players[var1[var2]];
         if(var3 != null && var3.field989 > 0) {
            --var3.field989;
            if(var3.field989 == 0) {
               var3.field1002 = null;
            }
         }
      }

      for(var2 = 0; var2 < client.field722; ++var2) {
         int var5 = client.field723[var2];
         class88 var4 = client.field721[var5];
         if(var4 != null && var4.field989 > 0) {
            --var4.field989;
            if(var4.field989 == 0) {
               var4.field1002 = null;
            }
         }
      }

   }

   static final void method640(class266 var0, int var1, int var2, int var3, int var4) {
      if(client.field693 < 400) {
         if(var0.field3490 != null) {
            var0 = var0.method4766(-2051225078);
         }

         if(var0 != null) {
            if(var0.field3493) {
               if(!var0.field3462 || client.field840 == var1) {
                  String var5 = var0.field3465;
                  int var8;
                  int var9;
                  if(var0.field3482 != 0) {
                     var8 = var0.field3482;
                     var9 = class311.field3717.field650;
                     int var10 = var9 - var8;
                     String var7;
                     if(var10 < -9) {
                        var7 = class297.method5314(16711680, 256459510);
                     } else if(var10 < -6) {
                        var7 = class297.method5314(16723968, 1622831477);
                     } else if(var10 < -3) {
                        var7 = class297.method5314(16740352, 1776307595);
                     } else if(var10 < 0) {
                        var7 = class297.method5314(16756736, -105054858);
                     } else if(var10 > 9) {
                        var7 = class297.method5314('\uff00', -656189730);
                     } else if(var10 > 6) {
                        var7 = class297.method5314(4259584, 1530284325);
                     } else if(var10 > 3) {
                        var7 = class297.method5314(8453888, 432184684);
                     } else if(var10 > 0) {
                        var7 = class297.method5314(12648192, -633412241);
                     } else {
                        var7 = class297.method5314(16776960, 1292429129);
                     }

                     var5 = var5 + var7 + " " + " (" + "level-" + var0.field3482 + ")";
                  }

                  if(var0.field3462 && client.field825) {
                     class285.method5111("Examine", class297.method5314(16776960, 385667423) + var5, 1003, var1, var2, var3, (byte)47);
                  }

                  if(client.field833 == 1) {
                     class285.method5111("Use", client.field933 + " " + "->" + " " + class297.method5314(16776960, -1863301522) + var5, 7, var1, var2, var3, (byte)49);
                  } else if(client.field835) {
                     if((class43.field336 & 2) == 2) {
                        class285.method5111(client.field838, client.field839 + " " + "->" + " " + class297.method5314(16776960, 290660081) + var5, 8, var1, var2, var3, (byte)74);
                     }
                  } else {
                     int var11 = var0.field3462 && client.field825?2000:0;
                     String[] var12 = var0.field3480;
                     if(var12 != null) {
                        for(var8 = 4; var8 >= 0; --var8) {
                           if(var12[var8] != null && !var12[var8].equalsIgnoreCase("Attack")) {
                              var9 = 0;
                              if(var8 == 0) {
                                 var9 = var11 + 9;
                              }

                              if(var8 == 1) {
                                 var9 = var11 + 10;
                              }

                              if(var8 == 2) {
                                 var9 = var11 + 11;
                              }

                              if(var8 == 3) {
                                 var9 = var11 + 12;
                              }

                              if(var8 == 4) {
                                 var9 = var11 + 13;
                              }

                              class285.method5111(var12[var8], class297.method5314(16776960, 1742524934) + var5, var9, var1, var2, var3, (byte)88);
                           }
                        }
                     }

                     if(var12 != null) {
                        for(var8 = 4; var8 >= 0; --var8) {
                           if(var12[var8] != null && var12[var8].equalsIgnoreCase("Attack")) {
                              short var13 = 0;
                              if(client.field706 != class93.field1185) {
                                 if(client.field706 == class93.field1183 || client.field706 == class93.field1188 && var0.field3482 > class311.field3717.field650) {
                                    var13 = 2000;
                                 }

                                 var9 = 0;
                                 if(var8 == 0) {
                                    var9 = var13 + 9;
                                 }

                                 if(var8 == 1) {
                                    var9 = var13 + 10;
                                 }

                                 if(var8 == 2) {
                                    var9 = var13 + 11;
                                 }

                                 if(var8 == 3) {
                                    var9 = var13 + 12;
                                 }

                                 if(var8 == 4) {
                                    var9 = var13 + 13;
                                 }

                                 class285.method5111(var12[var8], class297.method5314(16776960, -1166732072) + var5, var9, var1, var2, var3, (byte)110);
                              }
                           }
                        }
                     }

                     if(!var0.field3462 || !client.field825) {
                        class285.method5111("Examine", class297.method5314(16776960, 453485766) + var5, 1003, var1, var2, var3, (byte)49);
                     }
                  }

               }
            }
         }
      }
   }
}
