package src;

public class class208 extends class189 {

   static class314 field2468;
   int field2454;
   class205 field2460;
   class210 field2446;
   class112 field2447;
   class122 field2463;
   int field2455;
   int field2452;
   int field2445;
   int field2459;
   int field2453;
   int field2465;
   int field2467;
   int field2451;
   int field2462;
   int field2464;
   int field2456;
   int field2457;
   int field2461;
   int field2458;
   int field2449;
   int field2448;


   void method3896(int var1) {
      this.field2446 = null;
      this.field2447 = null;
      this.field2460 = null;
      this.field2463 = null;
   }

   static void method3901(int var0, int var1, int var2) {
      int var3 = class175.field2045.method5384("Choose Option");

      int var4;
      for(var4 = 0; var4 < client.field693; ++var4) {
         class304 var5 = class175.field2045;
         String var6;
         if(var4 < 0) {
            var6 = "";
         } else if(client.field823[var4].length() > 0) {
            var6 = client.field822[var4] + " " + client.field823[var4];
         } else {
            var6 = client.field822[var4];
         }

         int var7 = var5.method5384(var6);
         if(var7 > var3) {
            var3 = var7;
         }
      }

      var3 += 8;
      var4 = client.field693 * 15 + 22;
      int var8 = var0 - var3 / 2;
      if(var3 + var8 > class37.field277) {
         var8 = class37.field277 - var3;
      }

      if(var8 < 0) {
         var8 = 0;
      }

      int var9 = var1;
      if(var1 + var4 > class221.field2525) {
         var9 = class221.field2525 - var4;
      }

      if(var9 < 0) {
         var9 = 0;
      }

      class34.field248 = var8;
      class196.field2343 = var9;
      class49.field383 = var3;
      class48.field376 = client.field693 * 15 + 22;
   }

   public static class226 method3898(int var0, byte var1) {
      int var2 = var0 >> 16;
      int var3 = var0 & '\uffff';
      if(class226.field2693[var2] == null || class226.field2693[var2][var3] == null) {
         boolean var4 = class81.method1900(var2, -1767659218);
         if(!var4) {
            return null;
         }
      }

      return class226.field2693[var2][var3];
   }

   public static String method3900(CharSequence[] var0, int var1, int var2, short var3) {
      if(var2 == 0) {
         return "";
      } else if(var2 == 1) {
         CharSequence var4 = var0[var1];
         return var4 == null?"null":var4.toString();
      } else {
         int var9 = var2 + var1;
         int var5 = 0;

         for(int var6 = var1; var6 < var9; ++var6) {
            CharSequence var7 = var0[var6];
            if(var7 == null) {
               var5 += 4;
            } else {
               var5 += var7.length();
            }
         }

         StringBuilder var10 = new StringBuilder(var5);

         for(int var11 = var1; var11 < var9; ++var11) {
            CharSequence var8 = var0[var11];
            if(var8 == null) {
               var10.append("null");
            } else {
               var10.append(var8);
            }
         }

         return var10.toString();
      }
   }

   public static class332[] method3899(int var0) {
      return new class332[]{class332.field3877, class332.field3875, class332.field3874};
   }
}
