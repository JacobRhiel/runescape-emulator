package src;

public class class90 {

   public static int method2136(CharSequence var0, int var1, int var2, byte[] var3, int var4, int var5) {
      int var6 = var2 - var1;

      for(int var7 = 0; var7 < var6; ++var7) {
         char var8 = var0.charAt(var7 + var1);
         if((var8 <= 0 || var8 >= 128) && (var8 < 160 || var8 > 255)) {
            if(var8 == 8364) {
               var3[var7 + var4] = -128;
            } else if(var8 == 8218) {
               var3[var7 + var4] = -126;
            } else if(var8 == 402) {
               var3[var7 + var4] = -125;
            } else if(var8 == 8222) {
               var3[var7 + var4] = -124;
            } else if(var8 == 8230) {
               var3[var7 + var4] = -123;
            } else if(var8 == 8224) {
               var3[var7 + var4] = -122;
            } else if(var8 == 8225) {
               var3[var7 + var4] = -121;
            } else if(var8 == 710) {
               var3[var7 + var4] = -120;
            } else if(var8 == 8240) {
               var3[var7 + var4] = -119;
            } else if(var8 == 352) {
               var3[var7 + var4] = -118;
            } else if(var8 == 8249) {
               var3[var7 + var4] = -117;
            } else if(var8 == 338) {
               var3[var7 + var4] = -116;
            } else if(var8 == 381) {
               var3[var7 + var4] = -114;
            } else if(var8 == 8216) {
               var3[var7 + var4] = -111;
            } else if(var8 == 8217) {
               var3[var7 + var4] = -110;
            } else if(var8 == 8220) {
               var3[var7 + var4] = -109;
            } else if(var8 == 8221) {
               var3[var7 + var4] = -108;
            } else if(var8 == 8226) {
               var3[var7 + var4] = -107;
            } else if(var8 == 8211) {
               var3[var7 + var4] = -106;
            } else if(var8 == 8212) {
               var3[var7 + var4] = -105;
            } else if(var8 == 732) {
               var3[var7 + var4] = -104;
            } else if(var8 == 8482) {
               var3[var7 + var4] = -103;
            } else if(var8 == 353) {
               var3[var7 + var4] = -102;
            } else if(var8 == 8250) {
               var3[var7 + var4] = -101;
            } else if(var8 == 339) {
               var3[var7 + var4] = -100;
            } else if(var8 == 382) {
               var3[var7 + var4] = -98;
            } else if(var8 == 376) {
               var3[var7 + var4] = -97;
            } else {
               var3[var7 + var4] = 63;
            }
         } else {
            var3[var7 + var4] = (byte)var8;
         }
      }

      return var6;
   }
}
