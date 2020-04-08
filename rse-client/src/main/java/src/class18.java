package src;

public class class18 {

   public static class243 field94;
   static class245 field102;
   byte field98;
   public int field97;
   public int field100;
   public int field95;
   public int field96;
   public int field99;


   public class18() {}

   public class18(class309 var1, boolean var2) {
      this.field98 = var1.readByte(-1182356577);
      this.field95 = var1.readShort((byte)94);
      this.field97 = var1.method5552(297718403);
      this.field100 = var1.method5552(297718403);
      this.field96 = var1.method5552(297718403);
      this.field99 = var1.method5552(297718403);
   }

   void method211(int var1, int var2) {
      this.field98 &= -8;
      this.field98 = (byte)(this.field98 | var1 & 7);
   }

   void method187(int var1, int var2) {
      this.field98 &= -9;
      if(var1 == 1) {
         this.field98 = (byte)(this.field98 | 8);
      }

   }

   public int method186(int var1) {
      return (this.field98 & 8) == 8?1:0;
   }

   public int method185(int var1) {
      return this.field98 & 7;
   }

   static void method210(byte var0) {
      if(client.field835) {
         class226 var1 = class19.method224(class7.field29, client.field836, -1883708300);
         if(var1 != null && var1.field2665 != null) {
            class71 var2 = new class71();
            var2.field612 = var1;
            var2.field602 = var1.field2665;
            class76.method1395(var2, 193917669);
         }

         client.field835 = false;
         class68.method1273(var1, -723852564);
      }
   }

   static final void method212(boolean var0, class308 var1, byte var2) {
      client.field801 = 0;
      client.field851 = 0;
      class27.method304(1081049793);

      int var3;
      while(var1.method5488(client.field761.field1333, (byte)0) >= 27) {
         var3 = var1.method5495(15, (byte)49);
         if(var3 == 32767) {
            break;
         }

         boolean var4 = false;
         if(client.field721[var3] == null) {
            client.field721[var3] = new class88();
            var4 = true;
         }

         class88 var5 = client.field721[var3];
         client.field723[++client.field722 - 1] = var3;
         var5.field1005 = client.field689;
         int var6;
         if(var0) {
            var6 = var1.method5495(8, (byte)-25);
            if(var6 > 127) {
               var6 -= 256;
            }
         } else {
            var6 = var1.method5495(5, (byte)85);
            if(var6 > 15) {
               var6 -= 32;
            }
         }

         int var7 = client.field806[var1.method5495(3, (byte)36)];
         if(var4) {
            var5.field979 = var5.field995 = var7;
         }

         int var8 = var1.method5495(1, (byte)13);
         int var9 = var1.method5495(1, (byte)62);
         if(var9 == 1) {
            client.field725[++client.field851 - 1] = var3;
         }

         int var10;
         if(var0) {
            var10 = var1.method5495(8, (byte)32);
            if(var10 > 127) {
               var10 -= 256;
            }
         } else {
            var10 = var1.method5495(5, (byte)75);
            if(var10 > 15) {
               var10 -= 32;
            }
         }

         var5.field1148 = class237.method4201(var1.method5495(14, (byte)32), 386633685);
         var5.field976 = var5.field1148.field3470;
         var5.field1026 = var5.field1148.field3489;
         if(var5.field1026 == 0) {
            var5.field995 = 0;
         }

         var5.field993 = var5.field1148.field3472;
         var5.field982 = var5.field1148.field3473;
         var5.field1003 = var5.field1148.field3474;
         var5.field984 = var5.field1148.field3475;
         var5.field978 = var5.field1148.field3469;
         var5.field1010 = var5.field1148.field3491;
         var5.field980 = var5.field1148.field3471;
         var5.method2122(class311.field3717.field1028[0] + var10, class311.field3717.field1029[0] + var6, var8 == 1, (byte)88);
      }

      var1.method5498(-1587918842);
      class28.method335(var1, 1398134743);

      for(var3 = 0; var3 < client.field801; ++var3) {
         int var11 = client.field918[var3];
         if(client.field721[var11].field1005 != client.field689) {
            client.field721[var11].field1148 = null;
            client.field721[var11] = null;
         }
      }

      if(var1.field3710 != client.field761.field1333) {
         throw new RuntimeException(var1.field3710 + "," + client.field761.field1333);
      } else {
         for(var3 = 0; var3 < client.field722; ++var3) {
            if(client.field721[client.field723[var3]] == null) {
               throw new RuntimeException(var3 + "," + client.field722);
            }
         }

      }
   }

   static int method191(int var0, class101 var1, boolean var2, byte var3) {
      class226 var4 = var2?class20.field115:class85.field1130;
      if(var0 == 1500) {
         class85.field1115[++class85.field1117 - 1] = var4.field2580;
         return 1;
      } else if(var0 == 1501) {
         class85.field1115[++class85.field1117 - 1] = var4.field2653;
         return 1;
      } else if(var0 == 1502) {
         class85.field1115[++class85.field1117 - 1] = var4.field2582;
         return 1;
      } else if(var0 == 1503) {
         class85.field1115[++class85.field1117 - 1] = var4.field2642;
         return 1;
      } else if(var0 == 1504) {
         class85.field1115[++class85.field1117 - 1] = var4.field2629?1:0;
         return 1;
      } else if(var0 == 1505) {
         class85.field1115[++class85.field1117 - 1] = var4.field2586;
         return 1;
      } else {
         return 2;
      }
   }

   static void method198(String[] var0, short[] var1, int var2, int var3, int var4) {
      if(var2 < var3) {
         int var5 = (var3 + var2) / 2;
         int var6 = var2;
         String var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         short var8 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var8;

         for(int var9 = var2; var9 < var3; ++var9) {
            if(var7 == null || var0[var9] != null && var0[var9].compareTo(var7) < (var9 & 1)) {
               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               short var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var8;
         method198(var0, var1, var2, var6 - 1, 1133748912);
         method198(var0, var1, var6 + 1, var3, 1347659757);
      }

   }
}
