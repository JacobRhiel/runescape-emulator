package src;

import java.io.IOException;

public class class299 {

   static char[] field3646 = new char[64];
   static char[] field3647;
   static char[] field3648;
   static int[] field3649;
   static class334[] field3650;


   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         field3646[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field3646[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field3646[var0] = (char)(var0 + 48 - 52);
      }

      field3646[62] = 43;
      field3646[63] = 47;
      field3647 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field3647[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field3647[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field3647[var0] = (char)(var0 + 48 - 52);
      }

      field3647[62] = 42;
      field3647[63] = 45;
      field3648 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field3648[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field3648[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field3648[var0] = (char)(var0 + 48 - 52);
      }

      field3648[62] = 45;
      field3648[63] = 95;
      field3649 = new int[128];

      for(var0 = 0; var0 < field3649.length; ++var0) {
         field3649[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         field3649[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         field3649[var0] = var0 - 97 + 26;
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         field3649[var0] = var0 - 48 + 52;
      }

      int[] var2 = field3649;
      field3649[43] = 62;
      var2[42] = 62;
      int[] var1 = field3649;
      field3649[47] = 63;
      var1[45] = 63;
   }

   static void method5322(class243 var0, class243 var1, boolean var2, int var3, int var4) {
      if(class94.field1205) {
         if(var3 == 4) {
            class94.field1204 = 4;
         }

      } else {
         class94.field1204 = var3;
         class330.method6049();
         byte[] var5 = var0.method4223("title.jpg", "", -1226254785);
         class94.field1193 = class200.method3731(var5, 1925772237);
         class215.field2501 = class94.field1193.method6177();
         if((client.field681 & 536870912) != 0) {
            class3.field18 = class7.method105(var1, "logo_deadman_mode", "", (byte)1);
         } else if((client.field681 & 1073741824) != 0) {
            class3.field18 = class7.method105(var1, "logo_seasonal_mode", "", (byte)1);
         } else {
            class3.field18 = class7.method105(var1, "logo", "", (byte)1);
         }

         class143.field1878 = class7.method105(var1, "titlebox", "", (byte)1);
         class76.field674 = class7.method105(var1, "titlebutton", "", (byte)1);
         int var7 = var1.method4240("runes", (short)-18406);
         int var8 = var1.method4233(var7, "", 709668582);
         class333[] var9;
         if(!class164.method3502(var1, var7, var8, -1869394818)) {
            var9 = null;
         } else {
            var9 = class230.method4190(1434727833);
         }

         class94.field1190 = var9;
         class317.field3784 = class292.method5246(var1, "title_mute", "", (byte)93);
         class4.field21 = class7.method105(var1, "options_radio_buttons,0", "", (byte)1);
         class26.field160 = class7.method105(var1, "options_radio_buttons,4", "", (byte)1);
         class94.field1194 = class7.method105(var1, "options_radio_buttons,2", "", (byte)1);
         class94.field1195 = class7.method105(var1, "options_radio_buttons,6", "", (byte)1);
         class26.field158 = class4.field21.field3883;
         class219.field2515 = class4.field21.field3885;
         class173.field2027 = new class81(class94.field1190);
         if(var2) {
            class94.field1220 = "";
            class94.field1210 = "";
         }

         class86.field1141 = 0;
         class173.field2025 = "";
         class94.field1214 = true;
         class94.field1219 = false;
         if(!class76.field676.field1078) {
            class35.method461(2, class43.field328, "scape main", "", 255, false, 350541226);
         } else {
            class206.field2406 = 1;
            class206.field2407 = null;
            class206.field2408 = -1;
            class206.field2413 = -1;
            class219.field2514 = 0;
            class19.field106 = false;
            class93.field1187 = 2;
         }

         if(class246.field3180 != null) {
            try {
               class309 var10 = new class309(4);
               var10.readByte(3, 1258821856);
               var10.method5588(0, 1120871833);
               class246.field3180.vmethod5878(var10.field3709, 0, 4, 236801869);
            } catch (IOException var13) {
               try {
                  class246.field3180.vmethod5866((byte)-120);
               } catch (Exception var12) {
                  ;
               }

               ++class246.field3183;
               class246.field3180 = null;
            }
         }

         class94.field1205 = true;
         class94.field1191 = (class37.field277 - 765) / 2;
         class94.field1215 = class94.field1191 + 202;
         class104.field1331 = class94.field1215 + 180;
         class94.field1193.method6185(class94.field1191, 0);
         class215.field2501.method6185(class94.field1191 + 382, 0);
         class3.field18.method6173(class94.field1191 + 382 - class3.field18.field3883 / 2, 18);
      }
   }
}
