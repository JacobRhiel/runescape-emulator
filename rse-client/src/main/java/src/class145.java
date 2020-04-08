package src;

public final class class145 {

   public long field1891 = 0L;
   int field1887 = 0;
   int field1885;
   int field1886;
   public class144 field1888;
   int field1893;
   public class144 field1890;
   int field1884;
   int field1889;


   static class101 method3361(int var0, int var1, int var2, int var3) {
      int var4 = (var1 << 8) + var0;
      class101 var7 = (class101)class101.field1307.method3418((long)(var4 << 16));
      class101 var6;
      if(var7 != null) {
         var6 = var7;
      } else {
         String var8 = String.valueOf(var4);
         int var9 = class41.field311.method4240(var8, (short)20025);
         if(var9 == -1) {
            var6 = null;
         } else {
            label56: {
               byte[] var10 = class41.field311.method4231(var9, 1070095083);
               if(var10 != null) {
                  if(var10.length <= 1) {
                     var6 = null;
                     break label56;
                  }

                  var7 = class66.method1246(var10, -932748815);
                  if(var7 != null) {
                     class101.field1307.method3424(var7, (long)(var4 << 16));
                     var6 = var7;
                     break label56;
                  }
               }

               var6 = null;
            }
         }
      }

      if(var6 != null) {
         return var6;
      } else {
         int var5 = class58.method963(var2, var0, -2115896796);
         class101 var13 = (class101)class101.field1307.method3418((long)(var5 << 16));
         class101 var14;
         if(var13 != null) {
            var14 = var13;
         } else {
            String var15 = String.valueOf(var5);
            int var11 = class41.field311.method4240(var15, (short)5745);
            if(var11 == -1) {
               var14 = null;
            } else {
               byte[] var12 = class41.field311.method4231(var11, -245869598);
               if(var12 != null) {
                  if(var12.length <= 1) {
                     var14 = null;
                     return var14 != null?var14:null;
                  }

                  var13 = class66.method1246(var12, -932748815);
                  if(var13 != null) {
                     class101.field1307.method3424(var13, (long)(var5 << 16));
                     var14 = var13;
                     return var14 != null?var14:null;
                  }
               }

               var14 = null;
            }
         }

         return var14 != null?var14:null;
      }
   }

   static int method3362(int var0, class101 var1, boolean var2, int var3) {
      if(var0 == 5000) {
         class85.field1115[++class85.field1117 - 1] = client.field896;
         return 1;
      } else if(var0 == 5001) {
         class85.field1117 -= 3;
         client.field896 = class85.field1115[class85.field1117];
         class166.field1996 = class219.method4031(class85.field1115[class85.field1117 + 1], 1754408393);
         if(class166.field1996 == null) {
            class166.field1996 = class319.field3806;
         }

         client.field862 = class85.field1115[class85.field1117 + 2];
         class196 var19 = class146.method3363(class192.field2212, client.field761.field1340, -2072338142);
         var19.field2338.method5531(client.field896, 1258821856);
         var19.field2338.method5531(class166.field1996.field3804, 1258821856);
         var19.field2338.method5531(client.field862, 1258821856);
         client.field761.method2361(var19, 495547088);
         return 1;
      } else {
         String var4;
         int var5;
         if(var0 == 5002) {
            var4 = class85.field1118[--class85.field1119];
            class85.field1117 -= 2;
            var5 = class85.field1115[class85.field1117];
            int var6 = class85.field1115[class85.field1117 + 1];
            class196 var7 = class146.method3363(class192.field2289, client.field761.field1340, -1970903767);
            var7.field2338.method5531(class234.method4198(var4, (byte)31) + 2, 1258821856);
            var7.field2338.method5627(var4, 688583500);
            var7.field2338.method5531(var5 - 1, 1258821856);
            var7.field2338.method5531(var6, 1258821856);
            client.field761.method2361(var7, 1382671119);
            return 1;
         } else {
            int var11;
            if(var0 == 5003) {
               class85.field1117 -= 2;
               var11 = class85.field1115[class85.field1117];
               var5 = class85.field1115[class85.field1117 + 1];
               class73 var16 = class1.method16(var11, var5, (byte)72);
               if(var16 != null) {
                  class85.field1115[++class85.field1117 - 1] = var16.field622;
                  class85.field1115[++class85.field1117 - 1] = var16.field623;
                  class85.field1118[++class85.field1119 - 1] = var16.field636 != null?var16.field636:"";
                  class85.field1118[++class85.field1119 - 1] = var16.field629 != null?var16.field629:"";
                  class85.field1118[++class85.field1119 - 1] = var16.field635 != null?var16.field635:"";
                  class85.field1115[++class85.field1117 - 1] = var16.method1316((byte)1)?1:(var16.method1308((byte)-9)?2:0);
               } else {
                  class85.field1115[++class85.field1117 - 1] = -1;
                  class85.field1115[++class85.field1117 - 1] = 0;
                  class85.field1118[++class85.field1119 - 1] = "";
                  class85.field1118[++class85.field1119 - 1] = "";
                  class85.field1118[++class85.field1119 - 1] = "";
                  class85.field1115[++class85.field1117 - 1] = 0;
               }

               return 1;
            } else if(var0 == 5004) {
               var11 = class85.field1115[--class85.field1117];
               class73 var17 = class77.method1825(var11, 755627010);
               if(var17 != null) {
                  class85.field1115[++class85.field1117 - 1] = var17.field624;
                  class85.field1115[++class85.field1117 - 1] = var17.field623;
                  class85.field1118[++class85.field1119 - 1] = var17.field636 != null?var17.field636:"";
                  class85.field1118[++class85.field1119 - 1] = var17.field629 != null?var17.field629:"";
                  class85.field1118[++class85.field1119 - 1] = var17.field635 != null?var17.field635:"";
                  class85.field1115[++class85.field1117 - 1] = var17.method1316((byte)1)?1:(var17.method1308((byte)67)?2:0);
               } else {
                  class85.field1115[++class85.field1117 - 1] = -1;
                  class85.field1115[++class85.field1117 - 1] = 0;
                  class85.field1118[++class85.field1119 - 1] = "";
                  class85.field1118[++class85.field1119 - 1] = "";
                  class85.field1118[++class85.field1119 - 1] = "";
                  class85.field1115[++class85.field1117 - 1] = 0;
               }

               return 1;
            } else if(var0 == 5005) {
               if(class166.field1996 == null) {
                  class85.field1115[++class85.field1117 - 1] = -1;
               } else {
                  class85.field1115[++class85.field1117 - 1] = class166.field1996.field3804;
               }

               return 1;
            } else if(var0 == 5008) {
               var4 = class85.field1118[--class85.field1119];
               var5 = class85.field1115[--class85.field1117];
               String var15 = var4.toLowerCase();
               byte var18 = 0;
               if(var15.startsWith("yellow:")) {
                  var18 = 0;
                  var4 = var4.substring("yellow:".length());
               } else if(var15.startsWith("red:")) {
                  var18 = 1;
                  var4 = var4.substring("red:".length());
               } else if(var15.startsWith("green:")) {
                  var18 = 2;
                  var4 = var4.substring("green:".length());
               } else if(var15.startsWith("cyan:")) {
                  var18 = 3;
                  var4 = var4.substring("cyan:".length());
               } else if(var15.startsWith("purple:")) {
                  var18 = 4;
                  var4 = var4.substring("purple:".length());
               } else if(var15.startsWith("white:")) {
                  var18 = 5;
                  var4 = var4.substring("white:".length());
               } else if(var15.startsWith("flash1:")) {
                  var18 = 6;
                  var4 = var4.substring("flash1:".length());
               } else if(var15.startsWith("flash2:")) {
                  var18 = 7;
                  var4 = var4.substring("flash2:".length());
               } else if(var15.startsWith("flash3:")) {
                  var18 = 8;
                  var4 = var4.substring("flash3:".length());
               } else if(var15.startsWith("glow1:")) {
                  var18 = 9;
                  var4 = var4.substring("glow1:".length());
               } else if(var15.startsWith("glow2:")) {
                  var18 = 10;
                  var4 = var4.substring("glow2:".length());
               } else if(var15.startsWith("glow3:")) {
                  var18 = 11;
                  var4 = var4.substring("glow3:".length());
               } else if(class199.field2358 != class285.field3597) {
                  if(var15.startsWith("yellow:")) {
                     var18 = 0;
                     var4 = var4.substring("yellow:".length());
                  } else if(var15.startsWith("red:")) {
                     var18 = 1;
                     var4 = var4.substring("red:".length());
                  } else if(var15.startsWith("green:")) {
                     var18 = 2;
                     var4 = var4.substring("green:".length());
                  } else if(var15.startsWith("cyan:")) {
                     var18 = 3;
                     var4 = var4.substring("cyan:".length());
                  } else if(var15.startsWith("purple:")) {
                     var18 = 4;
                     var4 = var4.substring("purple:".length());
                  } else if(var15.startsWith("white:")) {
                     var18 = 5;
                     var4 = var4.substring("white:".length());
                  } else if(var15.startsWith("flash1:")) {
                     var18 = 6;
                     var4 = var4.substring("flash1:".length());
                  } else if(var15.startsWith("flash2:")) {
                     var18 = 7;
                     var4 = var4.substring("flash2:".length());
                  } else if(var15.startsWith("flash3:")) {
                     var18 = 8;
                     var4 = var4.substring("flash3:".length());
                  } else if(var15.startsWith("glow1:")) {
                     var18 = 9;
                     var4 = var4.substring("glow1:".length());
                  } else if(var15.startsWith("glow2:")) {
                     var18 = 10;
                     var4 = var4.substring("glow2:".length());
                  } else if(var15.startsWith("glow3:")) {
                     var18 = 11;
                     var4 = var4.substring("glow3:".length());
                  }
               }

               var15 = var4.toLowerCase();
               byte var8 = 0;
               if(var15.startsWith("wave:")) {
                  var8 = 1;
                  var4 = var4.substring("wave:".length());
               } else if(var15.startsWith("wave2:")) {
                  var8 = 2;
                  var4 = var4.substring("wave2:".length());
               } else if(var15.startsWith("shake:")) {
                  var8 = 3;
                  var4 = var4.substring("shake:".length());
               } else if(var15.startsWith("scroll:")) {
                  var8 = 4;
                  var4 = var4.substring("scroll:".length());
               } else if(var15.startsWith("slide:")) {
                  var8 = 5;
                  var4 = var4.substring("slide:".length());
               } else if(class285.field3597 != class199.field2358) {
                  if(var15.startsWith("wave:")) {
                     var8 = 1;
                     var4 = var4.substring("wave:".length());
                  } else if(var15.startsWith("wave2:")) {
                     var8 = 2;
                     var4 = var4.substring("wave2:".length());
                  } else if(var15.startsWith("shake:")) {
                     var8 = 3;
                     var4 = var4.substring("shake:".length());
                  } else if(var15.startsWith("scroll:")) {
                     var8 = 4;
                     var4 = var4.substring("scroll:".length());
                  } else if(var15.startsWith("slide:")) {
                     var8 = 5;
                     var4 = var4.substring("slide:".length());
                  }
               }

               class196 var9 = class146.method3363(class192.field2229, client.field761.field1340, -2115570666);
               var9.field2338.method5531(0, 1258821856);
               int var10 = var9.field2338.field3710;
               var9.field2338.method5531(var5, 1258821856);
               var9.field2338.method5531(var18, 1258821856);
               var9.field2338.method5531(var8, 1258821856);
               class321.method5932(var9.field2338, var4, (byte)77);
               var9.field2338.method5656(var9.field2338.field3710 - var10, -1075172075);
               client.field761.method2361(var9, 1854763525);
               return 1;
            } else if(var0 == 5009) {
               class85.field1119 -= 2;
               var4 = class85.field1118[class85.field1119];
               String var13 = class85.field1118[class85.field1119 + 1];
               class196 var12 = class146.method3363(class192.field2283, client.field761.field1340, -2050268225);
               var12.field2338.method5532(0, (byte)-46);
               int var14 = var12.field2338.field3710;
               var12.field2338.method5627(var4, 2081249709);
               class321.method5932(var12.field2338, var13, (byte)45);
               var12.field2338.method5726(var12.field2338.field3710 - var14, 733201281);
               client.field761.method2361(var12, 2115119431);
               return 1;
            } else if(var0 != 5015) {
               if(var0 == 5016) {
                  class85.field1115[++class85.field1117 - 1] = client.field862;
                  return 1;
               } else if(var0 == 5017) {
                  var11 = class85.field1115[--class85.field1117];
                  class85.field1115[++class85.field1117 - 1] = class104.method2367(var11, 1838015298);
                  return 1;
               } else if(var0 == 5018) {
                  var11 = class85.field1115[--class85.field1117];
                  class85.field1115[++class85.field1117 - 1] = class84.method2002(var11, -1791981608);
                  return 1;
               } else if(var0 == 5019) {
                  var11 = class85.field1115[--class85.field1117];
                  class85.field1115[++class85.field1117 - 1] = class58.method965(var11, (byte)-91);
                  return 1;
               } else if(var0 == 5020) {
                  var4 = class85.field1118[--class85.field1119];
                  class60.method999(var4, (byte)-9);
                  return 1;
               } else if(var0 == 5021) {
                  client.field814 = class85.field1118[--class85.field1119].toLowerCase().trim();
                  return 1;
               } else if(var0 == 5022) {
                  class85.field1118[++class85.field1119 - 1] = client.field814;
                  return 1;
               } else if(var0 == 5023) {
                  var4 = class85.field1118[--class85.field1119];
                  System.out.println(var4);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if(class311.field3717 != null && class311.field3717.field652 != null) {
                  var4 = class311.field3717.field652.method5238(-956603976);
               } else {
                  var4 = "";
               }

               class85.field1118[++class85.field1119 - 1] = var4;
               return 1;
            }
         }
      }
   }
}
