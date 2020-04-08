package src;

import java.io.*;
import java.util.zip.CRC32;

public class class246 {

   public static int field3182 = 0;
   public static int field3168 = 0;
   static class327 field3171 = new class327(4096);
   public static int field3183 = 0;
   public static class327 field3166 = new class327(4096);
   public static class269 field3170 = new class269();
   public static class242 field3181;
   public static int field3167 = 0;
   public static class327 field3174 = new class327(32);
   public static long field3165;
   public static int field3169 = 0;
   public static class309 field3177;
   public static class327 field3175 = new class327(4096);
   public static int field3172 = 0;
   public static class245[] field3164 = new class245[256];
   public static int field3173 = 0;
   public static class314 field3180;
   public static class309 field3176 = new class309(8);
   public static int field3178 = 0;
   public static CRC32 field3179 = new CRC32();
   public static byte field3163 = 0;


   static long method4376(CharSequence var0, int var1) {
      long var2 = 0L;
      int var4 = var0.length();

      for(int var5 = 0; var5 < var4; ++var5) {
         var2 *= 37L;
         char var6 = var0.charAt(var5);
         if(var6 >= 65 && var6 <= 90) {
            var2 += (long)(var6 + 1 - 65);
         } else if(var6 >= 97 && var6 <= 122) {
            var2 += (long)(var6 + 1 - 97);
         } else if(var6 >= 48 && var6 <= 57) {
            var2 += (long)(var6 + 27 - 48);
         }

         if(var2 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var2 % 37L && var2 != 0L) {
         var2 /= 37L;
      }

      return var2;
   }

   static String method4369(Throwable var0, int var1) throws IOException {
      String var2;
      if(var0 instanceof class350) {
         class350 var3 = (class350)var0;
         var2 = var3.field4071 + " | ";
         var0 = var3.field4068;
      } else {
         var2 = "";
      }

      StringWriter var13 = new StringWriter();
      PrintWriter var4 = new PrintWriter(var13);
      var0.printStackTrace(var4);
      var4.close();
      String var5 = var13.toString();
      BufferedReader var6 = new BufferedReader(new StringReader(var5));
      String var7 = var6.readLine();

      while(true) {
         String var8 = var6.readLine();
         if(var8 == null) {
            var2 = var2 + "| " + var7;
            return var2;
         }

         int var9 = var8.indexOf(40);
         int var10 = var8.indexOf(41, var9 + 1);
         if(var9 >= 0 && var10 >= 0) {
            String var11 = var8.substring(var9 + 1, var10);
            int var12 = var11.indexOf(".java:");
            if(var12 >= 0) {
               var11 = var11.substring(0, var12) + var11.substring(var12 + 5);
               var2 = var2 + var11 + ' ';
               continue;
            }

            var8 = var8.substring(0, var9);
         }

         var8 = var8.trim();
         var8 = var8.substring(var8.lastIndexOf(32) + 1);
         var8 = var8.substring(var8.lastIndexOf(9) + 1);
         var2 = var2 + var8 + ' ';
      }
   }

   static final class325 method4375(class309 var0, class325 var1, int var2) {
      int var3 = var0.readUnsignedByte((byte)64);
      int var4;
      if(var1 == null) {
         var4 = class216.method4012(var3, -1747660778);
         var1 = new class325(var4);
      }

      for(var4 = 0; var4 < var3; ++var4) {
         boolean var5 = var0.readUnsignedByte((byte)16) == 1;
         int var6 = var0.method5674((short)3112);
         Object var7;
         if(var5) {
            var7 = new class185(var0.method5667(-671161491));
         } else {
            var7 = new class188(var0.method5552(297718403));
         }

         var1.method5963((class189)var7, (long)var6);
      }

      return var1;
   }
}
