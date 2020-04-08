package src;

public class class44 {

   public static final class44 field339 = new class44("details");
   public static final class44 field340 = new class44("compositemap");
   public static final class44 field341 = new class44("compositetexture");
   public static final class44 field343 = new class44("labels");
   static final class44 field345 = new class44("area");
   protected static String field347;
   public final String field344;


   class44(String var1) {
      this.field344 = var1;
   }

   static void method716(int var0) {
      if(client.field807 >= 0 && client.players[client.field807] != null) {
         class22.method254(client.players[client.field807], false, -591154231);
      }

   }

   public static byte[] method715(CharSequence var0, byte var1) {
      int var2 = var0.length();
      byte[] var3 = new byte[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if((var5 <= 0 || var5 >= 128) && (var5 < 160 || var5 > 255)) {
            if(var5 == 8364) {
               var3[var4] = -128;
            } else if(var5 == 8218) {
               var3[var4] = -126;
            } else if(var5 == 402) {
               var3[var4] = -125;
            } else if(var5 == 8222) {
               var3[var4] = -124;
            } else if(var5 == 8230) {
               var3[var4] = -123;
            } else if(var5 == 8224) {
               var3[var4] = -122;
            } else if(var5 == 8225) {
               var3[var4] = -121;
            } else if(var5 == 710) {
               var3[var4] = -120;
            } else if(var5 == 8240) {
               var3[var4] = -119;
            } else if(var5 == 352) {
               var3[var4] = -118;
            } else if(var5 == 8249) {
               var3[var4] = -117;
            } else if(var5 == 338) {
               var3[var4] = -116;
            } else if(var5 == 381) {
               var3[var4] = -114;
            } else if(var5 == 8216) {
               var3[var4] = -111;
            } else if(var5 == 8217) {
               var3[var4] = -110;
            } else if(var5 == 8220) {
               var3[var4] = -109;
            } else if(var5 == 8221) {
               var3[var4] = -108;
            } else if(var5 == 8226) {
               var3[var4] = -107;
            } else if(var5 == 8211) {
               var3[var4] = -106;
            } else if(var5 == 8212) {
               var3[var4] = -105;
            } else if(var5 == 732) {
               var3[var4] = -104;
            } else if(var5 == 8482) {
               var3[var4] = -103;
            } else if(var5 == 353) {
               var3[var4] = -102;
            } else if(var5 == 8250) {
               var3[var4] = -101;
            } else if(var5 == 339) {
               var3[var4] = -100;
            } else if(var5 == 382) {
               var3[var4] = -98;
            } else if(var5 == 376) {
               var3[var4] = -97;
            } else {
               var3[var4] = 63;
            }
         } else {
            var3[var4] = (byte)var5;
         }
      }

      return var3;
   }
}
