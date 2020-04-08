package src;

public class class39 {

   static final class39 field300 = new class39(0);
   static final class39 field297 = new class39(1);
   final int field298;


   class39(int var1) {
      this.field298 = var1;
   }

   public static class304 method647(class243 var0, class243 var1, String var2, String var3, int var4) {
      int var5 = var0.method4240(var2, (short)-3620);
      int var6 = var0.method4233(var5, var3, 662061888);
      class304 var7;
      if(!class164.method3502(var0, var5, var6, -2117212000)) {
         var7 = null;
      } else {
         var7 = class138.method3080(var1.method4224(var5, var6, (byte)-14), -1694309156);
      }

      return var7;
   }

   static void method645(int var0, int var1) {
      class94.field1204 = 12;
      class94.field1201 = var0;
   }

   public static byte[] method644(Object var0, boolean var1, int var2) {
      if(var0 == null) {
         return null;
      } else if(var0 instanceof byte[]) {
         byte[] var4 = (byte[])((byte[])var0);
         return var1?class265.method4758(var4, -1597872585):var4;
      } else if(var0 instanceof class214) {
         class214 var3 = (class214)var0;
         return var3.vmethod4008(1422436059);
      } else {
         throw new IllegalArgumentException();
      }
   }

   static class93[] method643(byte var0) {
      return new class93[]{class93.field1188, class93.field1184, class93.field1185, class93.field1183};
   }

   static void method646(int var0, String var1, short var2) {
      int var3 = class98.field1278;
      int[] var4 = class98.field1271;
      boolean var5 = false;
      class292 var6 = new class292(var1, class27.field164);

      for(int var7 = 0; var7 < var3; ++var7) {
         class75 var8 = client.players[var4[var7]];
         if(var8 != null && var8 != class311.field3717 && var8.field652 != null && var8.field652.equals(var6)) {
            class196 var9;
            if(var0 == 1) {
               var9 = class146.method3363(class192.field2267, client.field761.field1340, -1814876219);
               var9.field2338.method5531(0, 1258821856);
               var9.field2338.writeIntME(var4[var7], -178401269);
               client.field761.method2361(var9, 1107468075);
            } else if(var0 == 4) {
               var9 = class146.method3363(class192.field2282, client.field761.field1340, -1743183533);
               var9.field2338.method5532(var4[var7], (byte)-36);
               var9.field2338.method5575(0, (byte)16);
               client.field761.method2361(var9, 1922660779);
            } else if(var0 == 6) {
               var9 = class146.method3363(class192.field2250, client.field761.field1340, -1748490008);
               var9.field2338.method5697(0, (byte)91);
               var9.field2338.writeIntME(var4[var7], 1367734381);
               client.field761.method2361(var9, 1176961597);
            } else if(var0 == 7) {
               var9 = class146.method3363(class192.field2301, client.field761.field1340, -1866283189);
               var9.field2338.method5531(0, 1258821856);
               var9.field2338.method5532(var4[var7], (byte)-11);
               client.field761.method2361(var9, 663362923);
            }

            var5 = true;
            break;
         }
      }

      if(!var5) {
         class141.method3161(4, "", "Unable to find " + var1, 15607041);
      }

   }
}
