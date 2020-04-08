package src;

public class class205 {

   int field2401;
   int field2396;
   int field2395;
   byte[] field2402;
   int field2394;
   int field2399;
   byte[] field2398;
   int field2397;
   int field2400;


   public static class334 method3752(class243 var0, int var1, int var2, int var3) {
      return !class164.method3502(var0, var1, var2, -1870952127)?null:class317.method5899(-389802701);
   }

   static final void method3753(class309 var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      int var8;
      if(var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         class64.field535[var1][var2][var3] = 0;

         while(true) {
            var8 = var0.readUnsignedByte((byte)46);
            if(var8 == 0) {
               if(var1 == 0) {
                  int[] var9 = class64.field549[0][var2];
                  int var12 = var2 + var4 + 932731;
                  int var13 = var3 + var5 + 556238;
                  int var14 = class57.method957(var12 + '\ub135', 91923 + var13, 4, (short)-22602) - 128 + (class57.method957(10294 + var12, '\u93bd' + var13, 2, (short)-2512) - 128 >> 1) + (class57.method957(var12, var13, 1, (short)-19625) - 128 >> 2);
                  var14 = (int)(0.3D * (double)var14) + 35;
                  if(var14 < 10) {
                     var14 = 10;
                  } else if(var14 > 60) {
                     var14 = 60;
                  }

                  var9[var3] = -var14 * 8;
               } else {
                  class64.field549[var1][var2][var3] = class64.field549[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if(var8 == 1) {
               int var15 = var0.readUnsignedByte((byte)19);
               if(var15 == 1) {
                  var15 = 0;
               }

               if(var1 == 0) {
                  class64.field549[0][var2][var3] = -var15 * 8;
               } else {
                  class64.field549[var1][var2][var3] = class64.field549[var1 - 1][var2][var3] - var15 * 8;
               }
               break;
            }

            if(var8 <= 49) {
               class348.field4061[var1][var2][var3] = var0.readByte(-1603028719);
               class64.field539[var1][var2][var3] = (byte)((var8 - 2) / 4);
               class64.field540[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3);
            } else if(var8 <= 81) {
               class64.field535[var1][var2][var3] = (byte)(var8 - 49);
            } else {
               class64.field538[var1][var2][var3] = (byte)(var8 - 81);
            }
         }
      } else {
         while(true) {
            var8 = var0.readUnsignedByte((byte)102);
            if(var8 == 0) {
               break;
            }

            if(var8 == 1) {
               var0.readUnsignedByte((byte)12);
               break;
            }

            if(var8 <= 49) {
               var0.readUnsignedByte((byte)25);
            }
         }
      }

   }
}
