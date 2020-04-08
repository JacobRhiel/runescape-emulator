package src;

import java.util.*;

public final class class45 {

   static class174 field368;
   static class114 field367;
   boolean field350 = false;
   class334 field365;
   boolean field363 = false;
   HashMap field354;
   int field361;
   public int field356 = 0;
   int field362;
   class38[][] field355;
   HashMap field359 = new HashMap();
   class333[] field357;
   final HashMap field360;
   final class243 field358;
   final class243 field351;
   class47 field352;
   int field353;
   int field364;


   public class45(class333[] var1, HashMap var2, class243 var3, class243 var4) {
      this.field357 = var1;
      this.field360 = var2;
      this.field358 = var3;
      this.field351 = var4;
   }

   void method724(int var1) {
      if(this.field354 == null) {
         this.field354 = new HashMap();
      }

      this.field354.clear();

      for(int var2 = 0; var2 < this.field355.length; ++var2) {
         for(int var3 = 0; var3 < this.field355[var2].length; ++var3) {
            List var4 = this.field355[var2][var3].method551(-1911332956);
            Iterator var5 = var4.iterator();

            while(var5.hasNext()) {
               class43 var6 = (class43)var5.next();
               if(var6.method689((short)-27709)) {
                  int var7 = var6.vmethod685((byte)65);
                  if(!this.field354.containsKey(Integer.valueOf(var7))) {
                     LinkedList var8 = new LinkedList();
                     var8.add(var6);
                     this.field354.put(Integer.valueOf(var7), var8);
                  } else {
                     List var9 = (List)this.field354.get(Integer.valueOf(var7));
                     var9.add(var6);
                  }
               }
            }
         }
      }

   }

   class31 method723(int var1, int var2, int var3, int var4, int var5) {
      class31 var6 = new class31(this);
      int var7 = this.field361 + var1;
      int var8 = var2 + this.field362;
      int var9 = var3 + this.field361;
      int var10 = var4 + this.field362;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      int var14 = var10 / 64;
      var6.field215 = var13 - var11 + 1;
      var6.field223 = var14 - var12 + 1;
      var6.field218 = var11 - this.field352.method453(1003198197);
      var6.field219 = var12 - this.field352.method439(500091855);
      if(var6.field218 < 0) {
         var6.field215 += var6.field218;
         var6.field218 = 0;
      }

      if(var6.field218 > this.field355.length - var6.field215) {
         var6.field215 = this.field355.length - var6.field218;
      }

      if(var6.field219 < 0) {
         var6.field223 += var6.field219;
         var6.field219 = 0;
      }

      if(var6.field219 > this.field355[0].length - var6.field223) {
         var6.field223 = this.field355[0].length - var6.field219;
      }

      var6.field215 = Math.min(var6.field215, this.field355.length);
      var6.field223 = Math.min(var6.field223, this.field355[0].length);
      return var6;
   }

   float method727(int var1, int var2, int var3) {
      float var4 = (float)var1 / (float)var2;
      if(var4 > 8.0F) {
         return 8.0F;
      } else if(var4 < 1.0F) {
         return 1.0F;
      } else {
         int var5 = Math.round(var4);
         return Math.abs((float)var5 - var4) < 0.05F?(float)var5:var4;
      }
   }

   public boolean method743(byte var1) {
      return this.field363;
   }

   public HashMap method719(byte var1) {
      this.method724(1193052281);
      return this.field354;
   }

   public void method729(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7, byte var8) {
      if(this.field365 != null) {
         this.field365.method6189(var1, var2, var3, var4);
         if(var6 > 0 && var6 % var7 < var7 / 2) {
            if(this.field354 == null) {
               this.method724(1203186095);
            }

            Iterator var9 = var5.iterator();

            while(var9.hasNext()) {
               int var10 = ((Integer)var9.next()).intValue();
               List var11 = (List)this.field354.get(Integer.valueOf(var10));
               if(var11 != null) {
                  Iterator var12 = var11.iterator();

                  while(var12.hasNext()) {
                     class43 var13 = (class43)var12.next();
                     int var14 = var3 * (var13.field326.field2532 - this.field361) / this.field353;
                     int var15 = var4 - (var13.field326.field2529 - this.field362) * var4 / this.field364;
                     class330.method6110(var14 + var1, var15 + var2, 2, 16776960, 256);
                  }
               }
            }

         }
      }
   }

   public void method725(class243 var1, String var2, boolean var3, int var4) {
      if(!this.field350) {
         this.field363 = false;
         this.field350 = true;
         System.nanoTime();
         int var5 = var1.method4240(class44.field339.field344, (short)739);
         int var6 = var1.method4233(var5, var2, -212174602);
         class309 var7 = new class309(var1.method4223(class44.field339.field344, var2, -1226254785));
         class309 var8 = new class309(var1.method4223(class44.field340.field344, var2, -1226254785));
         System.nanoTime();
         System.nanoTime();
         this.field352 = new class47();

         try {
            this.field352.method775(var7, var8, var6, var3, -661163942);
         } catch (IllegalStateException var20) {
            return;
         }

         this.field352.method457(-2058882064);
         this.field352.method496(-737890030);
         this.field352.method447((byte)-55);
         this.field361 = this.field352.method453(1003198197) * 64;
         this.field362 = this.field352.method439(-788277838) * 64;
         this.field353 = (this.field352.method454(-803925467) - this.field352.method453(1003198197) + 1) * 64;
         this.field364 = (this.field352.method442(-1994113552) - this.field352.method439(-1750287638) + 1) * 64;
         int var17 = this.field352.method454(102814369) - this.field352.method453(1003198197) + 1;
         int var10 = this.field352.method442(-1306656569) - this.field352.method439(-1192300922) + 1;
         System.nanoTime();
         System.nanoTime();
         class77.method1826((byte)-42);
         this.field355 = new class38[var17][var10];
         Iterator var11 = this.field352.field372.iterator();

         while(var11.hasNext()) {
            class24 var12 = (class24)var11.next();
            int var13 = var12.field197;
            int var14 = var12.field198;
            int var15 = var13 - this.field352.method453(1003198197);
            int var16 = var14 - this.field352.method439(995605999);
            this.field355[var15][var16] = new class38(var13, var14, this.field352.method451((byte)0), this.field360);
            this.field355[var15][var16].method520(var12, this.field352.field371, 1320723450);
         }

         for(int var18 = 0; var18 < var17; ++var18) {
            for(int var19 = 0; var19 < var10; ++var19) {
               if(this.field355[var18][var19] == null) {
                  this.field355[var18][var19] = new class38(this.field352.method453(1003198197) + var18, this.field352.method439(2039992980) + var19, this.field352.method451((byte)0), this.field360);
                  this.field355[var18][var19].method561(this.field352.field370, this.field352.field371, -1524913173);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if(var1.method4299(class44.field341.field344, var2, -1797516406)) {
            byte[] var21 = var1.method4223(class44.field341.field344, var2, -1226254785);
            this.field365 = class200.method3731(var21, 1121623670);
         }

         System.nanoTime();
         var1.method4236(504262227);
         var1.method4273((byte)3);
         this.field363 = true;
      }
   }

   public List method722(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      LinkedList var12 = new LinkedList();
      if(!this.field363) {
         return var12;
      } else {
         class31 var13 = this.method723(var1, var2, var3, var4, -1850062895);
         float var14 = this.method727(var7, var3 - var1, -1899828753);
         int var15 = (int)(var14 * 64.0F);
         int var16 = this.field361 + var1;
         int var17 = var2 + this.field362;

         for(int var18 = var13.field218; var18 < var13.field215 + var13.field218; ++var18) {
            for(int var19 = var13.field219; var19 < var13.field223 + var13.field219; ++var19) {
               List var20 = this.field355[var18][var19].method606(var5 + var15 * (this.field355[var18][var19].field283 * 64 - var16) / 64, var8 + var6 - var15 * (this.field355[var18][var19].field284 * 64 - var17 + 64) / 64, var15, var9, var10, -1740751209);
               if(!var20.isEmpty()) {
                  var12.addAll(var20);
               }
            }
         }

         return var12;
      }
   }

   public final void method733(int var1) {
      this.field354 = null;
   }

   public final void method720(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9) {
      int[] var10 = class330.field3864;
      int var11 = class330.field3865;
      int var12 = class330.field3863;
      int[] var13 = new int[4];
      class330.method6047(var13);
      class31 var14 = this.method723(var1, var2, var3, var4, -344532912);
      float var15 = this.method727(var7 - var5, var3 - var1, -619779193);
      int var16 = (int)Math.ceil((double)var15);
      this.field356 = var16;
      if(!this.field359.containsKey(Integer.valueOf(var16))) {
         class49 var17 = new class49(var16);
         var17.method821((byte)-118);
         this.field359.put(Integer.valueOf(var16), var17);
      }

      int var24 = var14.field215 + var14.field218 - 1;
      int var18 = var14.field223 + var14.field219 - 1;

      int var19;
      int var20;
      for(var19 = var14.field218; var19 <= var24; ++var19) {
         for(var20 = var14.field219; var20 <= var18; ++var20) {
            this.field355[var19][var20].method528(var16, (class49)this.field359.get(Integer.valueOf(var16)), this.field357, this.field358, this.field351, 828020907);
         }
      }

      class330.method6043(var10, var11, var12);
      class330.method6048(var13);
      var19 = (int)(var15 * 64.0F);
      var20 = this.field361 + var1;
      int var21 = var2 + this.field362;

      for(int var22 = var14.field218; var22 < var14.field215 + var14.field218; ++var22) {
         for(int var23 = var14.field219; var23 < var14.field223 + var14.field219; ++var23) {
            this.field355[var22][var23].method519(var5 + var19 * (this.field355[var22][var23].field283 * 64 - var20) / 64, var8 - var19 * (this.field355[var22][var23].field284 * 64 - var21 + 64) / 64, var19, 800782831);
         }
      }

   }

   public final void method721(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13, byte var14) {
      class31 var15 = this.method723(var1, var2, var3, var4, -1570230481);
      float var16 = this.method727(var7 - var5, var3 - var1, -1408758083);
      int var17 = (int)(var16 * 64.0F);
      int var18 = this.field361 + var1;
      int var19 = var2 + this.field362;

      int var20;
      int var21;
      for(var20 = var15.field218; var20 < var15.field215 + var15.field218; ++var20) {
         for(var21 = var15.field219; var21 < var15.field223 + var15.field219; ++var21) {
            if(var13) {
               this.field355[var20][var21].method581((short)128);
            }

            this.field355[var20][var21].method529(var5 + var17 * (this.field355[var20][var21].field283 * 64 - var18) / 64, var8 - var17 * (this.field355[var20][var21].field284 * 64 - var19 + 64) / 64, var17, var9, (byte)-19);
         }
      }

      if(var10 != null && var11 > 0) {
         for(var20 = var15.field218; var20 < var15.field215 + var15.field218; ++var20) {
            for(var21 = var15.field219; var21 < var15.field223 + var15.field219; ++var21) {
               this.field355[var20][var21].method618(var10, var11, var12, (byte)-1);
            }
         }
      }

   }

   static int method750(int var0, class101 var1, boolean var2, int var3) {
      class226 var4 = class208.method3898(class85.field1115[--class85.field1117], (byte)-56);
      if(var0 == 2500) {
         class85.field1115[++class85.field1117 - 1] = var4.field2580;
         return 1;
      } else if(var0 == 2501) {
         class85.field1115[++class85.field1117 - 1] = var4.field2653;
         return 1;
      } else if(var0 == 2502) {
         class85.field1115[++class85.field1117 - 1] = var4.field2582;
         return 1;
      } else if(var0 == 2503) {
         class85.field1115[++class85.field1117 - 1] = var4.field2642;
         return 1;
      } else if(var0 == 2504) {
         class85.field1115[++class85.field1117 - 1] = var4.field2629?1:0;
         return 1;
      } else if(var0 == 2505) {
         class85.field1115[++class85.field1117 - 1] = var4.field2586;
         return 1;
      } else {
         return 2;
      }
   }
}
