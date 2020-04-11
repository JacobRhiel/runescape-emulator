package src;

import java.net.URL;
import java.util.Locale;

public class class199 implements class203 {

   public static final class199 field2358 = new class199("EN", "en", "English", class201.field2375, 0, "GB");
   static final class199 field2363 = new class199("DE", "de", "German", class201.field2375, 1, "DE");
   static final class199[] field2361;
   public static final class199 field2367 = new class199("FR", "fr", "French", class201.field2375, 2, "FR");
   static final class199 field2360 = new class199("PT", "pt", "Portuguese", class201.field2375, 3, "BR");
   static final class199 field2359 = new class199("NL", "nl", "Dutch", class201.field2376, 4, "NL");
   public static final class199 field2362 = new class199("ES", "es", "Spanish", class201.field2376, 5, "ES");
   static final class199 field2366 = new class199("ES_MX", "es-mx", "Spanish (Latin American)", class201.field2375, 6, "MX");
   static class226 field2368;
   final String field2365;
   final int field2357;
   final String field2364;


   static {
      class199[] var0 = method3715((byte)-1);
      field2361 = new class199[var0.length];
      class199[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class199 var3 = var1[var2];
         if(field2361[var3.field2357] != null) {
            throw new IllegalStateException();
         }

         field2361[var3.field2357] = var3;
      }

   }

   class199(String var1, String var2, String var3, class201 var4, int var5, String var6) {
      this.field2364 = var1;
      this.field2365 = var2;
      this.field2357 = var5;
      if(var6 != null) {
         new Locale(var2.substring(0, 2), var6);
      } else {
         new Locale(var2.substring(0, 2));
      }

   }

   String method3727(int var1) {
      return this.field2365;
   }

   public int vmethod6149(byte var1) {
      return this.field2357;
   }

   public String toString() {
      return this.method3727(-1528954067).toLowerCase(Locale.ENGLISH);
   }

   public String aak() {
      return this.method3727(-1528954067).toLowerCase(Locale.ENGLISH);
   }

   public String aab() {
      return this.method3727(-1528954067).toLowerCase(Locale.ENGLISH);
   }

   public String aau() {
      return this.method3727(-1528954067).toLowerCase(Locale.ENGLISH);
   }

   static void method3724(byte var0) {
      if(class175.field2039.toLowerCase().indexOf("microsoft") != -1) {
         class54.field438[186] = 57;
         class54.field438[187] = 27;
         class54.field438[188] = 71;
         class54.field438[189] = 26;
         class54.field438[190] = 72;
         class54.field438[191] = 73;
         class54.field438[192] = 58;
         class54.field438[219] = 42;
         class54.field438[220] = 74;
         class54.field438[221] = 43;
         class54.field438[222] = 59;
         class54.field438[223] = 28;
      } else {
         class54.field438[44] = 71;
         class54.field438[45] = 26;
         class54.field438[46] = 72;
         class54.field438[47] = 73;
         class54.field438[59] = 57;
         class54.field438[61] = 27;
         class54.field438[91] = 42;
         class54.field438[92] = 74;
         class54.field438[93] = 43;
         class54.field438[192] = 28;
         class54.field438[222] = 58;
         class54.field438[520] = 59;
      }

   }

   public static class199 method3718(int var0, int var1) {
      return var0 >= 0 && var0 < field2361.length?field2361[var0]:null;
   }

   static class239[] method3730(int var0) {
      return new class239[]{class239.field3097, class239.field3099, class239.field3098, class239.field3102};
   }

   static class199[] method3715(byte var0) {
      return new class199[]{field2367, field2358, field2362, field2359, field2360, field2363, field2366};
   }

   static boolean method3729(int var0) {
      try {
         if(class193.field2318 == null) {
            class193.field2318 = class37.field276.method3397(new URL(class201.field2390), (byte)81);
         } else if(class193.field2318.method3403(-1424081834)) {
            byte[] var1 = class193.field2318.method3406(484192233);
            class309 var2 = new class309(var1);
            var2.readInt(297718403);
            class80.field1044 = var2.readShort((byte)18);
            class324.field3837 = new class80[class80.field1044];

            class80 var4;
            for(int var3 = 0; var3 < class80.field1044; var4.field1054 = var3++) {
               var4 = class324.field3837[var3] = new class80();
               var4.field1040 = var2.readShort((byte)105);
               var4.field1049 = var2.readInt(297718403);
               var4.field1051 = var2.method5667(-1936658852);
               var4.field1052 = var2.method5667(-1867077083);
               var4.field1053 = var2.readUnsignedByte((byte)109);
               var4.field1050 = var2.method5550(1835771986);
            }

            class161.method3483(class324.field3837, 0, class324.field3837.length - 1, class80.field1047, class80.field1048, 943885059);
            class193.field2318 = null;
            return true;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         class193.field2318 = null;
      }

      return false;
   }

   public static int method3728(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if((var5 & 1) == 1) {
         int var7 = var3;
         var3 = var4;
         var4 = var7;
      }

      var2 &= 3;
      return var2 == 0?var0:(var2 == 1?var1:(var2 == 2?7 - var0 - (var3 - 1):7 - var1 - (var4 - 1)));
   }
}
