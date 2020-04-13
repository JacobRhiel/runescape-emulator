package src;

import java.util.Arrays;

public final class class75 extends class78 {

   class290 field669;
   class223 field646;
   class290 field668;
   class292 field652;
   int skullIcon = -1;
   int headIcon = -1;
   boolean field663;
   String[] field649 = new String[3];
   int field650;
   int field671;
   int field644;
   int field653;
   int field654;
   boolean field651;
   boolean field670;
   class136 field656;
   int field662;
   int field655;
   int field645;
   int field657;
   int field666;
   int field659;
   int field661;
   int field660;
   int field664;
   int field667;
   int field665;
   int field672;


   class75() {
      for(int var1 = 0; var1 < 3; ++var1) {
         this.field649[var1] = "";
      }

      this.field650 = 0;
      this.field671 = 0;
      this.field653 = 0;
      this.field654 = 0;
      this.field663 = false;
      this.field644 = 0;
      this.field651 = false;
      this.field668 = class290.field3614;
      this.field669 = class290.field3614;
      this.field670 = false;
   }

   protected final class136 vmethod3353(int var1) {
      if(this.field646 == null) {
         return null;
      } else {
         class268 var2 = super.field1016 != -1 && super.field1008 == 0?class253.method4478(super.field1016, 1792244593):null;
         class268 var3 = super.field1024 != -1 && !this.field663 && (super.field978 != super.field1024 || var2 == null)?class253.method4478(super.field1024, 1032231596):null;
         class136 var4 = this.field646.method4069(var2, super.field1014, var3, super.field974, -1571730911);
         if(var4 == null) {
            return null;
         } else {
            var4.method2955();
            super.field1023 = var4.field1883;
            class136 var5;
            class136[] var6;
            if(!this.field663 && super.field1009 != -1 && super.field1006 != -1) {
               var5 = class63.method1205(super.field1009, 1540398140).method4467(super.field1006, -1314564797);
               if(var5 != null) {
                  var5.method2966(0, -super.field1033, 0);
                  var6 = new class136[]{var4, var5};
                  var4 = new class136(var6, 2);
               }
            }

            if(!this.field663 && this.field656 != null) {
               if(client.field689 >= this.field654) {
                  this.field656 = null;
               }

               if(client.field689 >= this.field653 && client.field689 < this.field654) {
                  var5 = this.field656;
                  var5.method2966(this.field662 - super.field983, this.field655 - this.field645, this.field657 - super.field973);
                  if(super.field979 == 512) {
                     var5.method2969();
                     var5.method2969();
                     var5.method2969();
                  } else if(super.field979 == 1024) {
                     var5.method2969();
                     var5.method2969();
                  } else if(super.field979 == 1536) {
                     var5.method2969();
                  }

                  var6 = new class136[]{var4, var5};
                  var4 = new class136(var6, 2);
                  if(super.field979 == 512) {
                     var5.method2969();
                  } else if(super.field979 == 1024) {
                     var5.method2969();
                     var5.method2969();
                  } else if(super.field979 == 1536) {
                     var5.method2969();
                     var5.method2969();
                     var5.method2969();
                  }

                  var5.method2966(super.field983 - this.field662, this.field645 - this.field655, super.field973 - this.field657);
               }
            }

            var4.field1716 = true;
            return var4;
         }
      }
   }

   void method1336(byte var1) {
      this.field669 = class70.field596 != null && class70.field596.method5117(this.field652, -816687105)?class290.field3613:class290.field3612;
   }

   void method1333(int var1) {
      this.field668 = class95.field1252.method1951(this.field652, -407468573)?class290.field3613:class290.field3612;
   }

   void method1379(int var1, int var2, int var3) {
      super.field1027 = 0;
      super.field1032 = 0;
      super.field1031 = 0;
      super.field1028[0] = var1;
      super.field1029[0] = var2;
      int var4 = this.method1337((byte)87);
      super.field983 = super.field1028[0] * 128 + var4 * 64;
      super.field973 = super.field1029[0] * 128 + var4 * 64;
      System.out.println(super.field983 + ", " + super.field973);
   }

   int method1337(byte var1) {
      return this.field646 != null && this.field646.field2537 != -1?class237.method4201(this.field646.field2537, 1963102850).field3470:1;
   }

   void method1332(int var1) {
      this.field668 = class290.field3614;
   }

   final void method1341(int var1, int var2, byte var3, int var4) {
      if(super.field1027 < 9) {
         ++super.field1027;
      }

      for(int var5 = super.field1027; var5 > 0; --var5) {
         super.field1028[var5] = super.field1028[var5 - 1];
         super.field1029[var5] = super.field1029[var5 - 1];
         super.field1022[var5] = super.field1022[var5 - 1];
      }

      super.field1028[0] = var1;
      super.field1029[0] = var2;
      super.field1022[0] = var3;
   }

   void method1375(byte var1) {
      this.field669 = class290.field3614;
   }

   final boolean vmethod2118(int var1) {
      return this.field646 != null;
   }

   boolean method1351(int var1) {
      if(this.field668 == class290.field3614) {
         this.method1333(-1863320246);
      }

      return this.field668 == class290.field3613;
   }

   boolean method1334(int var1) {
      if(this.field669 == class290.field3614) {
         this.method1336((byte)101);
      }

      return this.field669 == class290.field3613;
   }

   final void method1330(class309 var1, int var2) {
      var1.field3710 = 0;
      System.out.println("appearance buffer: " + Arrays.toString(var1.field3709));
      int gender = var1.readUnsignedByte((byte)53);
      this.skullIcon = var1.readByte(-477100423);
      this.headIcon = var1.readByte(-791854877);
      System.out.println("update: " + gender + ", " + this.skullIcon + ", " + this.headIcon);
      int var4 = -1;
      this.field644 = 0;
      int[] var5 = new int[12];

      int var7;
      int var8;
      for(int var6 = 0; var6 < 12; ++var6) {
         var7 = var1.readUnsignedByte((byte)81);
         if(var7 == 0) {
            var5[var6] = 0;
         } else {
            var8 = var1.readUnsignedByte((byte)83);
            var5[var6] = var8 + (var7 << 8);
            if(var6 == 0 && var5[0] == '\uffff') {
               var4 = var1.writeShort((byte)115);
               break;
            }

            if(var5[var6] >= 512) {
               int var9 = class30.method373(var5[var6] - 512, (byte)57).field3444;
               if(var9 != 0) {
                  this.field644 = var9;
               }
            }
         }
      }

      int[] var10 = new int[5];

      for(var7 = 0; var7 < 5; ++var7) {
         var8 = var1.readUnsignedByte((byte)12);
         if(var8 < 0 || var8 >= class138.field1764[var7].length) {
            var8 = 0;
         }

         var10[var7] = var8;
      }

      super.field978 = var1.writeShort((byte)67);
      if(super.field978 == '\uffff') {
         super.field978 = -1;
      }

      super.field1010 = var1.writeShort((byte)10);
      if(super.field1010 == '\uffff') {
         super.field1010 = -1;
      }

      super.field980 = super.field1010;
      super.field993 = var1.writeShort((byte)127);
      if(super.field993 == '\uffff') {
         super.field993 = -1;
      }

      super.field982 = var1.writeShort((byte)62);
      if(super.field982 == '\uffff') {
         super.field982 = -1;
      }

      super.field1003 = var1.writeShort((byte)121);
      if(super.field1003 == '\uffff') {
         super.field1003 = -1;
      }

      super.field984 = var1.writeShort((byte)31);
      if(super.field984 == '\uffff') {
         super.field984 = -1;
      }

      super.field985 = var1.writeShort((byte)42);
      if(super.field985 == '\uffff') {
         super.field985 = -1;
      }

      this.field652 = new class292(var1.method5667(-1642072117), class27.field164);
      this.method1332(77261851);
      this.method1375((byte)52);
      if(this == class311.field3717) {
         class350.field4069 = this.field652.method5238(-239023194);
      }

      this.field650 = var1.readUnsignedByte((byte)55);
      this.field671 = var1.writeShort((byte)116);
      this.field651 = var1.readUnsignedByte((byte)124) == 1;
      if(client.field682 == 0 && client.field849 >= 2) {
         this.field651 = false;
      }

      if(this.field646 == null) {
         this.field646 = new class223();
      }

      this.field646.method4080(var5, var10, gender == 1, var4, 522059742);
   }

   final void method1339(int var1, int var2, byte var3, int var4) {
      if(super.field1016 != -1 && class253.method4478(super.field1016, 1418448324).field3524 == 1) {
         super.field1016 = -1;
      }

      super.field1015 = -1;
      if(var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if(super.field1028[0] >= 0 && super.field1028[0] < 104 && super.field1029[0] >= 0 && super.field1029[0] < 104) {
            if(var3 == 2) {
               class117.method2595(this, var1, var2, (byte)2, 1090203781);
            }

            this.method1341(var1, var2, var3, 1447911882);
         } else {
            this.method1379(var1, var2, -2136220182);
         }
      } else {
         this.method1379(var1, var2, -2120345171);
      }

   }

   static int method1342(int var0) {
      return ++class100.field1293 - 1;
   }

   static final void method1369(int var0, int var1) {
      class218.method4019(-1871725154);
      switch(var0) {
      case 1:
         class106.method2382((byte)100);
         break;
      case 2:
         class94.field1204 = 24;
         class79.method1852("The game servers are currently being updated.", "Please wait a few minutes and try again.", "", (byte)21);
      }

   }

   static final void method1380(class226 var0, int var1, int var2, byte var3) {
      if(client.field853 == null && !client.field816) {
         if(var0 != null && class255.method4514(var0, (byte)-1) != null) {
            client.field853 = var0;
            client.field854 = class255.method4514(var0, (byte)-1);
            client.field855 = var1;
            client.field928 = var2;
            class173.field2022 = 0;
            client.field864 = false;
            int var4 = class30.method381((byte)68);
            if(var4 != -1) {
               class43.field338 = new class91();
               class43.field338.field1176 = client.field776[var4];
               class43.field338.field1172 = client.field856[var4];
               class43.field338.field1173 = client.field779[var4];
               class43.field338.field1174 = client.field858[var4];
               class43.field338.field1175 = client.field822[var4];
            }

         }
      }
   }

   static void method1383(int var0) {
      class98.field1278 = 0;

      for(int var1 = 0; var1 < 2048; ++var1) {
         class98.field1269[var1] = null;
         class98.field1273[var1] = 1;
      }

   }

   static void method1384(int var0, boolean var1, int var2, boolean var3, int var4) {
      if(class324.field3837 != null) {
         class143.method3349(0, class324.field3837.length - 1, var0, var1, var2, var3, (byte)-80);
      }

   }
}
