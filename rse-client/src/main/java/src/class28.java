package src;

public class class28 implements class46 {

   int field182;
   int field176;
   int field175;
   int field186;
   int field184;
   int field178;
   int field174;
   int field183;
   int field181;
   int field180;
   int field185;
   int field177;
   int field179;
   int field172;


   public boolean vmethod872(int var1, int var2, int var3) {
      return var1 >= (this.field175 << 6) + (this.field182 << 3) && var1 <= (this.field175 << 6) + (this.field184 << 3) + 7 && var2 >= (this.field181 << 6) + (this.field183 << 3) && var2 <= (this.field181 << 6) + (this.field185 << 3) + 7;
   }

   public boolean vmethod871(int var1, int var2, int var3, int var4) {
      return var1 >= this.field176 && var1 < this.field186 + this.field176?var2 >= (this.field174 << 6) + (this.field178 << 3) && var2 <= (this.field174 << 6) + (this.field180 << 3) + 7 && var3 >= (this.field177 << 6) + (this.field179 << 3) && var3 <= (this.field177 << 6) + (this.field172 << 3) + 7:false;
   }

   public void vmethod870(class35 var1, int var2) {
      if(var1.field258 > this.field175) {
         var1.field258 = this.field175;
      }

      if(var1.field259 < this.field175) {
         var1.field259 = this.field175;
      }

      if(var1.field261 > this.field181) {
         var1.field261 = this.field181;
      }

      if(var1.field253 < this.field181) {
         var1.field253 = this.field181;
      }

   }

   public class222 vmethod890(int var1, int var2, int var3) {
      if(!this.vmethod872(var1, var2, -1286113119)) {
         return null;
      } else {
         int var4 = this.field174 * 64 - this.field175 * 64 + (this.field178 * 8 - this.field182 * 8) + var1;
         int var5 = this.field177 * 64 - this.field181 * 64 + var2 + (this.field179 * 8 - this.field183 * 8);
         return new class222(this.field176, var4, var5);
      }
   }

   public int[] vmethod873(int var1, int var2, int var3, int var4) {
      if(!this.vmethod871(var1, var2, var3, -1273994480)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field175 * 64 - this.field174 * 64 + var2 + (this.field182 * 8 - this.field178 * 8), var3 + (this.field181 * 64 - this.field177 * 64) + (this.field183 * 8 - this.field179 * 8)};
         return var5;
      }
   }

   public void vmethod885(class309 var1, int var2) {
      this.field176 = var1.readUnsignedByte((byte)118);
      this.field186 = var1.readUnsignedByte((byte)84);
      this.field174 = var1.writeShort((byte)25);
      this.field178 = var1.readUnsignedByte((byte)53);
      this.field180 = var1.readUnsignedByte((byte)24);
      this.field177 = var1.writeShort((byte)119);
      this.field179 = var1.readUnsignedByte((byte)90);
      this.field172 = var1.readUnsignedByte((byte)110);
      this.field175 = var1.writeShort((byte)66);
      this.field182 = var1.readUnsignedByte((byte)12);
      this.field184 = var1.readUnsignedByte((byte)92);
      this.field181 = var1.writeShort((byte)46);
      this.field183 = var1.readUnsignedByte((byte)54);
      this.field185 = var1.readUnsignedByte((byte)106);
      this.method327(-1832298319);
   }

   void method327(int var1) {}

   static final void method335(class308 var0, int var1) {
      for(int var2 = 0; var2 < client.field851; ++var2) {
         int var3 = client.field725[var2];
         class88 var4 = client.field721[var3];
         int var5 = var0.readUnsignedByte((byte)71);
         int var6;
         int var7;
         int var8;
         if((var5 & 128) != 0) {
            var6 = var0.readLEShortA(-1307628826);
            if(var6 == '\uffff') {
               var6 = -1;
            }

            var7 = var0.readUnsignedByte((byte)24);
            if(var6 == var4.field1016 && var6 != -1) {
               var8 = class253.method4478(var6, 1299300986).field3525;
               if(var8 == 1) {
                  var4.field1014 = 0;
                  var4.field1007 = 0;
                  var4.field1008 = var7;
                  var4.field1011 = 0;
               }

               if(var8 == 2) {
                  var4.field1011 = 0;
               }
            } else if(var6 == -1 || var4.field1016 == -1 || class253.method4478(var6, 1013286527).field3519 >= class253.method4478(var4.field1016, 1218652928).field3519) {
               var4.field1016 = var6;
               var4.field1014 = 0;
               var4.field1007 = 0;
               var4.field1008 = var7;
               var4.field1011 = 0;
               var4.field1032 = var4.field1027;
            }
         }

         int var9;
         if((var5 & 16) != 0) {
            var6 = var0.readLEShortA((byte)123);
            var7 = var0.readLEShortA(-706114222);
            var8 = var4.field983 - (var6 - class69.field590 * 731242929 - class69.field590 * 731242929) * 64;
            var9 = var4.field973 - (var7 - class89.field1152 * 1825982697 - class89.field1152 * 1825982697) * 64;
            if(var8 != 0 || var9 != 0) {
               var4.field1015 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
            }
         }

         if((var5 & 32) != 0) {
            var4.field1148 = class237.method4201(var0.readLEShortA(-904491103), -35139096);
            var4.field976 = var4.field1148.field3470;
            var4.field1026 = var4.field1148.field3489;
            var4.field993 = var4.field1148.field3472;
            var4.field982 = var4.field1148.field3473;
            var4.field1003 = var4.field1148.field3474;
            var4.field984 = var4.field1148.field3475;
            var4.field978 = var4.field1148.field3469;
            var4.field1010 = var4.field1148.field3491;
            var4.field980 = var4.field1148.field3471;
         }

         if((var5 & 8) != 0) {
            var4.field999 = var0.writeShort((byte)38);
            if(var4.field999 == '\uffff') {
               var4.field999 = -1;
            }
         }

         if((var5 & 2) != 0) {
            var4.field1009 = var0.readLEShortA(-1889162822);
            var6 = var0.readMEInt((byte)-22);
            var4.field1033 = var6 >> 16;
            var4.field1013 = (var6 & '\uffff') + client.field689;
            var4.field1006 = 0;
            var4.field1012 = 0;
            if(var4.field1013 > client.field689) {
               var4.field1006 = -1;
            }

            if(var4.field1009 == '\uffff') {
               var4.field1009 = -1;
            }
         }

         if((var5 & 64) != 0) {
            var4.field1002 = var0.method5667(-520096457);
            var4.field989 = 100;
         }

         if((var5 & 1) != 0) {
            var6 = var0.readByteS(-576195763);
            int var10;
            int var11;
            int var12;
            if(var6 > 0) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var9 = -1;
                  var10 = -1;
                  var11 = -1;
                  var8 = var0.method5561(795070630);
                  if(var8 == 32767) {
                     var8 = var0.method5561(1716036806);
                     var10 = var0.method5561(1285876529);
                     var9 = var0.method5561(1809580616);
                     var11 = var0.method5561(1161729017);
                  } else if(var8 != 32766) {
                     var10 = var0.method5561(655741900);
                  } else {
                     var8 = -1;
                  }

                  var12 = var0.method5561(1187474607);
                  var4.method1845(var8, var10, var9, var11, client.field689, var12, -1774762927);
               }
            }

            var7 = var0.readByteN(1624802147);
            if(var7 > 0) {
               for(var8 = 0; var8 < var7; ++var8) {
                  var9 = var0.method5561(1016845309);
                  var10 = var0.method5561(1315200137);
                  if(var10 != 32767) {
                     var11 = var0.method5561(2145187715);
                     var12 = var0.readByteN(1811680304);
                     int var13 = var10 > 0?var0.readByteS(-576195763):var12;
                     var4.method1831(var9, client.field689, var10, var11, var12, var13, (byte)-58);
                  } else {
                     var4.method1832(var9, 671360815);
                  }
               }
            }
         }

         if((var5 & 4) != 0) {
            var4.field990 = var0.method5580(-194142844);
            var4.field1017 = var0.method5581(12345678);
            var4.field972 = var0.method5579(-1739412623);
            var4.field1018 = var0.readByte(-536961223);
            var4.field1019 = var0.readLEShort((byte)126) + client.field689;
            var4.field1020 = var0.readLEShortA((byte)102) + client.field689;
            var4.field1021 = var0.writeShort((byte)31);
            var4.field1027 = 1;
            var4.field1032 = 0;
            var4.field990 += var4.field1028[0];
            var4.field1017 += var4.field1029[0];
            var4.field972 += var4.field1028[0];
            var4.field1018 += var4.field1029[0];
         }
      }

   }

   static final void method308(int var0, int var1, int var2, int var3) {
      if(var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var4 = class277.method5013(var0, var1, class71.field610, -1942367532) - var2;
         var0 -= class31.field220;
         var4 -= class14.field63;
         var1 -= class200.field2372;
         int var5 = class139.field1794[class74.field638];
         int var6 = class139.field1795[class74.field638];
         int var7 = class139.field1794[class32.field230];
         int var8 = class139.field1795[class32.field230];
         int var9 = var0 * var8 + var7 * var1 >> 16;
         var1 = var8 * var1 - var0 * var7 >> 16;
         var0 = var9;
         var9 = var6 * var4 - var5 * var1 >> 16;
         var1 = var6 * var1 + var5 * var4 >> 16;
         if(var1 >= 50) {
            client.field812 = var0 * client.field943 / var1 + client.field820 / 2;
            client.field780 = var9 * client.field943 / var1 + client.field942 / 2;
         } else {
            client.field812 = -1;
            client.field780 = -1;
         }

      } else {
         client.field812 = -1;
         client.field780 = -1;
      }
   }
}
