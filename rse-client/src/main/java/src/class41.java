package src;

public class class41 {

   static class128 field314;
   static class245 field311;
   static class328 field315;


   static final void method653(class70 var0, boolean var1, int var2) {
      int var3 = var0.field599;
      int var4 = (int)var0.field2116;
      var0.method3657();
      if(var1) {
         class261.method4590(var3, -1826844578);
      }

      class81.method1924(var3, -232699215);
      class226 var5 = class208.method3898(var4, (byte)-105);
      if(var5 != null) {
         class68.method1273(var5, 1136526695);
      }

      class103.method2340(-2027834560);
      if(client.field924 != -1) {
         class198.method3714(client.field924, 1, (byte)1);
      }

   }

   static String method654(String var0, boolean var1, int var2) {
      String var3 = var1?"https://":"http://";
      if(client.field682 == 1) {
         var0 = var0 + "-wtrc";
      } else if(client.field682 == 2) {
         var0 = var0 + "-wtqa";
      } else if(client.field682 == 3) {
         var0 = var0 + "-wtwip";
      } else if(client.field682 == 5) {
         var0 = var0 + "-wti";
      } else if(client.field682 == 4) {
         var0 = "local";
      }

      String var4 = "";
      if(class24.field137 != null) {
         var4 = "/p=" + class24.field137;
      }

      String var5 = "runescape.com";
      return var3 + var0 + "." + var5 + "/l=" + class285.field3597 + "/a=" + class255.field3271 + var4 + "/";
   }

   static final void method649(class78 var0, int var1, int var2) {
      int var3;
      int var4;
      int var5;
      if(var0.field1019 >= client.field689) {
         var3 = Math.max(1, var0.field1019 - client.field689);
         var4 = var0.field990 * 128 + var0.field976 * 64;
         var5 = var0.field1017 * 128 + var0.field976 * 64;
         var0.field983 += (var4 - var0.field983) / var3;
         var0.field973 += (var5 - var0.field973) / var3;
         var0.field1031 = 0;
         var0.field979 = var0.field1021;
      } else if(var0.field1020 >= client.field689) {
         if(var0.field1020 == client.field689 || var0.field1016 == -1 || var0.field1008 != 0 || var0.field1007 + 1 > class253.method4478(var0.field1016, 1545720902).field3514[var0.field1014]) {
            var3 = var0.field1020 - var0.field1019;
            var4 = client.field689 - var0.field1019;
            var5 = var0.field990 * 128 + var0.field976 * 64;
            int var6 = var0.field1017 * 128 + var0.field976 * 64;
            int var7 = var0.field972 * 128 + var0.field976 * 64;
            int var8 = var0.field1018 * 128 + var0.field976 * 64;
            var0.field983 = (var4 * var7 + var5 * (var3 - var4)) / var3;
            var0.field973 = (var8 * var4 + var6 * (var3 - var4)) / var3;
         }

         var0.field1031 = 0;
         var0.field979 = var0.field1021;
         var0.field995 = var0.field979;
      } else {
         ClientPacket.method3668(var0, 135896742);
      }

      if(var0.field983 < 128 || var0.field973 < 128 || var0.field983 >= 13184 || var0.field973 >= 13184) {
         var0.field1016 = -1;
         var0.field1009 = -1;
         var0.field1019 = 0;
         var0.field1020 = 0;
         var0.field983 = var0.field1028[0] * 128 + var0.field976 * 64;
         var0.field973 = var0.field1029[0] * 128 + var0.field976 * 64;
         var0.method1828(-1960813077);
      }

      if(class311.field3717 == var0 && (var0.field983 < 1536 || var0.field973 < 1536 || var0.field983 >= 11776 || var0.field973 >= 11776)) {
         var0.field1016 = -1;
         var0.field1009 = -1;
         var0.field1019 = 0;
         var0.field1020 = 0;
         var0.field983 = var0.field1028[0] * 128 + var0.field976 * 64;
         var0.field973 = var0.field1029[0] * 128 + var0.field976 * 64;
         var0.method1828(12876572);
      }

      if(var0.field1026 != 0) {
         if(var0.field999 != -1) {
            Object var9 = null;
            if(var0.field999 < '\u8000') {
               var9 = client.field721[var0.field999];
            } else if(var0.field999 >= '\u8000') {
               var9 = client.players[var0.field999 - '\u8000'];
            }

            if(var9 != null) {
               var4 = var0.field983 - ((class78)var9).field983;
               var5 = var0.field973 - ((class78)var9).field973;
               if(var4 != 0 || var5 != 0) {
                  var0.field979 = (int)(Math.atan2((double)var4, (double)var5) * 325.949D) & 2047;
               }
            } else if(var0.field1000) {
               var0.field999 = -1;
               var0.field1000 = false;
            }
         }

         if(var0.field1015 != -1 && (var0.field1027 == 0 || var0.field1031 > 0)) {
            var0.field979 = var0.field1015;
            var0.field1015 = -1;
         }

         var3 = var0.field979 - var0.field995 & 2047;
         if(var3 == 0 && var0.field1000) {
            var0.field999 = -1;
            var0.field1000 = false;
         }

         if(var3 != 0) {
            ++var0.field1025;
            boolean var11;
            if(var3 > 1024) {
               var0.field995 -= var0.field1026;
               var11 = true;
               if(var3 < var0.field1026 || var3 > 2048 - var0.field1026) {
                  var0.field995 = var0.field979;
                  var11 = false;
               }

               if(var0.field1024 == var0.field978 && (var0.field1025 > 25 || var11)) {
                  if(var0.field1010 != -1) {
                     var0.field1024 = var0.field1010;
                  } else {
                     var0.field1024 = var0.field993;
                  }
               }
            } else {
               var0.field995 += var0.field1026;
               var11 = true;
               if(var3 < var0.field1026 || var3 > 2048 - var0.field1026) {
                  var0.field995 = var0.field979;
                  var11 = false;
               }

               if(var0.field1024 == var0.field978 && (var0.field1025 > 25 || var11)) {
                  if(var0.field980 != -1) {
                     var0.field1024 = var0.field980;
                  } else {
                     var0.field1024 = var0.field993;
                  }
               }
            }

            var0.field995 &= 2047;
         } else {
            var0.field1025 = 0;
         }
      }

      var0.field1001 = false;
      class268 var12;
      if(var0.field1024 != -1) {
         var12 = class253.method4478(var0.field1024, 1802255553);
         if(var12 != null && var12.field3513 != null) {
            ++var0.field1004;
            if(var0.field974 < var12.field3513.length && var0.field1004 > var12.field3514[var0.field974]) {
               var0.field1004 = 1;
               ++var0.field974;
               class104.method2368(var12, var0.field974, var0.field983, var0.field973, (byte)41);
            }

            if(var0.field974 >= var12.field3513.length) {
               var0.field1004 = 0;
               var0.field974 = 0;
               class104.method2368(var12, var0.field974, var0.field983, var0.field973, (byte)104);
            }
         } else {
            var0.field1024 = -1;
         }
      }

      if(var0.field1009 != -1 && client.field689 >= var0.field1013) {
         if(var0.field1006 < 0) {
            var0.field1006 = 0;
         }

         var3 = class63.method1205(var0.field1009, -222748117).field3243;
         if(var3 != -1) {
            class268 var10 = class253.method4478(var3, 1478752498);
            if(var10 != null && var10.field3513 != null) {
               ++var0.field1012;
               if(var0.field1006 < var10.field3513.length && var0.field1012 > var10.field3514[var0.field1006]) {
                  var0.field1012 = 1;
                  ++var0.field1006;
                  class104.method2368(var10, var0.field1006, var0.field983, var0.field973, (byte)29);
               }

               if(var0.field1006 >= var10.field3513.length && (var0.field1006 < 0 || var0.field1006 >= var10.field3513.length)) {
                  var0.field1009 = -1;
               }
            } else {
               var0.field1009 = -1;
            }
         } else {
            var0.field1009 = -1;
         }
      }

      if(var0.field1016 != -1 && var0.field1008 <= 1) {
         var12 = class253.method4478(var0.field1016, 1548411000);
         if(var12.field3520 == 1 && var0.field1032 > 0 && var0.field1019 <= client.field689 && var0.field1020 < client.field689) {
            var0.field1008 = 1;
            return;
         }
      }

      if(var0.field1016 != -1 && var0.field1008 == 0) {
         var12 = class253.method4478(var0.field1016, 1006686693);
         if(var12 != null && var12.field3513 != null) {
            ++var0.field1007;
            if(var0.field1014 < var12.field3513.length && var0.field1007 > var12.field3514[var0.field1014]) {
               var0.field1007 = 1;
               ++var0.field1014;
               class104.method2368(var12, var0.field1014, var0.field983, var0.field973, (byte)31);
            }

            if(var0.field1014 >= var12.field3513.length) {
               var0.field1014 -= var12.field3516;
               ++var0.field1011;
               if(var0.field1011 >= var12.field3522) {
                  var0.field1016 = -1;
               } else if(var0.field1014 >= 0 && var0.field1014 < var12.field3513.length) {
                  class104.method2368(var12, var0.field1014, var0.field983, var0.field973, (byte)11);
               } else {
                  var0.field1016 = -1;
               }
            }

            var0.field1001 = var12.field3518;
         } else {
            var0.field1016 = -1;
         }
      }

      if(var0.field1008 > 0) {
         --var0.field1008;
      }

   }
}
