package src;

public final class class135 extends class189 {

   class151[] field1673 = new class151[5];
   int[] field1671 = new int[5];
   class129 field1668;
   class140 field1663;
   class150 field1666;
   class145 field1665;
   class132 field1667;
   int field1664;
   int field1672 = 0;
   class131 field1675;
   boolean field1661;
   int field1677;
   int field1670;
   int field1660;
   int field1659;
   int field1662;
   class135 field1681;
   boolean field1674;
   int field1669;
   boolean field1676;
   int field1678;
   int field1680;
   int field1679;


   class135(int var1, int var2, int var3) {
      this.field1662 = this.field1677 = var1;
      this.field1660 = var2;
      this.field1659 = var3;
   }

   static void method2946(byte var0) {
      class214.method4002(1022010485);
      client.field822[0] = "Cancel";
      client.field823[0] = "";
      client.field779[0] = 1006;
      client.field809[0] = false;
      client.field693 = 1;
   }

   static final void method2947(int var0) {
      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      if(client.field754 == 0) {
         var1 = class311.field3717.field983;
         var2 = class311.field3717.field973;
         if(class116.field1454 - var1 < -500 || class116.field1454 - var1 > 500 || ServerPacket.field2206 - var2 < -500 || ServerPacket.field2206 - var2 > 500) {
            class116.field1454 = var1;
            ServerPacket.field2206 = var2;
         }

         if(var1 != class116.field1454) {
            class116.field1454 += (var1 - class116.field1454) / 16;
         }

         if(var2 != ServerPacket.field2206) {
            ServerPacket.field2206 += (var2 - ServerPacket.field2206) / 16;
         }

         var3 = class116.field1454 >> 7;
         var4 = ServerPacket.field2206 >> 7;
         var5 = class277.method5013(class116.field1454, ServerPacket.field2206, class71.field610, -213957736);
         var6 = 0;
         int var7;
         if(var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
            for(var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
               for(int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                  int var9 = class71.field610;
                  if(var9 < 3 && (class64.field535[1][var7][var8] & 2) == 2) {
                     ++var9;
                  }

                  int var10 = var5 - class64.field549[var9][var7][var8];
                  if(var10 > var6) {
                     var6 = var10;
                  }
               }
            }
         }

         var7 = var6 * 192;
         if(var7 > 98048) {
            var7 = 98048;
         }

         if(var7 < '\u8000') {
            var7 = '\u8000';
         }

         if(var7 > client.field941) {
            client.field941 += (var7 - client.field941) / 24;
         } else if(var7 < client.field941) {
            client.field941 += (var7 - client.field941) / 80;
         }

         client.field756 = class277.method5013(class311.field3717.field983, class311.field3717.field973, class71.field610, -1893901347) - client.field755;
      } else if(client.field754 == 1) {
         if(client.field770 && class311.field3717 != null) {
            var1 = class311.field3717.field1028[0];
            var2 = class311.field3717.field1029[0];
            if(var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
               class116.field1454 = class311.field3717.field983;
               var3 = class277.method5013(class311.field3717.field983, class311.field3717.field973, class71.field610, 1434350846) - client.field755;
               if(var3 < client.field756) {
                  client.field756 = var3;
               }

               ServerPacket.field2206 = class311.field3717.field973;
               client.field770 = false;
            }
         }

         short var11 = -1;
         if(class54.field426[33]) {
            var11 = 0;
         } else if(class54.field426[49]) {
            var11 = 1024;
         }

         if(class54.field426[48]) {
            if(var11 == 0) {
               var11 = 1792;
            } else if(var11 == 1024) {
               var11 = 1280;
            } else {
               var11 = 1536;
            }
         } else if(class54.field426[50]) {
            if(var11 == 0) {
               var11 = 256;
            } else if(var11 == 1024) {
               var11 = 768;
            } else {
               var11 = 512;
            }
         }

         byte var12 = 0;
         if(class54.field426[35]) {
            var12 = -1;
         } else if(class54.field426[51]) {
            var12 = 1;
         }

         var3 = 0;
         if(var11 >= 0 || var12 != 0) {
            var3 = class54.field426[81]?client.field890:client.field760;
            var3 *= 16;
            client.field724 = var11;
            client.field759 = var12;
         }

         if(client.field757 < var3) {
            client.field757 += var3 / 8;
            if(client.field757 > var3) {
               client.field757 = var3;
            }
         } else if(client.field757 > var3) {
            client.field757 = client.field757 * 9 / 10;
         }

         if(client.field757 > 0) {
            var4 = client.field757 / 16;
            if(client.field724 >= 0) {
               var1 = client.field724 - class32.field230 & 2047;
               var5 = class139.field1794[var1];
               var6 = class139.field1795[var1];
               class116.field1454 += var5 * var4 / 65536;
               ServerPacket.field2206 += var6 * var4 / 65536;
            }

            if(client.field759 != 0) {
               client.field756 += var4 * client.field759;
               if(client.field756 > 0) {
                  client.field756 = 0;
               }
            }
         } else {
            client.field724 = -1;
            client.field759 = -1;
         }

         if(class54.field426[13]) {
            client.field761.method2361(class146.method3363(ClientPacket.field2306, client.field761.field1340, -1758003060), 847143217);
            client.field754 = 0;
         }
      }

      if(class63.field521 == 4 && class217.field2506) {
         var1 = class63.field518 - client.field753;
         client.field751 = var1 * 2;
         client.field753 = var1 != -1 && var1 != 1?(client.field753 + class63.field518) / 2:class63.field518;
         var2 = client.field740 - class63.field517;
         client.field708 = var2 * 2;
         client.field740 = var2 != -1 && var2 != 1?(class63.field517 + client.field740) / 2:class63.field517;
      } else {
         if(class54.field426[96]) {
            client.field708 += (-24 - client.field708) / 2;
         } else if(class54.field426[97]) {
            client.field708 += (24 - client.field708) / 2;
         } else {
            client.field708 /= 2;
         }

         if(class54.field426[98]) {
            client.field751 += (12 - client.field751) / 2;
         } else if(class54.field426[99]) {
            client.field751 += (-12 - client.field751) / 2;
         } else {
            client.field751 /= 2;
         }

         client.field753 = class63.field518;
         client.field740 = class63.field517;
      }

      client.field909 = client.field708 / 2 + client.field909 & 2047;
      client.field824 += client.field751 / 2;
      if(client.field824 < 128) {
         client.field824 = 128;
      }

      if(client.field824 > 383) {
         client.field824 = 383;
      }

   }
}
