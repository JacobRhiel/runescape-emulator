package src;

import java.net.URL;

public class class153 {

   public static class117 field1966;
   volatile byte[] field1964;
   volatile boolean field1963;
   final URL field1962;


   class153(URL var1) {
      this.field1962 = var1;
   }

   public boolean method3403(int var1) {
      return this.field1963;
   }

   public byte[] method3406(int var1) {
      return this.field1964;
   }

   static int method3409(int var0, class101 var1, boolean var2, int var3) {
      class226 var4;
      if(var0 == 2700) {
         var4 = class208.method3898(class85.field1115[--class85.field1117], (byte)-3);
         class85.field1115[++class85.field1117 - 1] = var4.field2704;
         return 1;
      } else if(var0 == 2701) {
         var4 = class208.method3898(class85.field1115[--class85.field1117], (byte)-67);
         if(var4.field2704 != -1) {
            class85.field1115[++class85.field1117 - 1] = var4.field2694;
         } else {
            class85.field1115[++class85.field1117 - 1] = 0;
         }

         return 1;
      } else if(var0 == 2702) {
         int var6 = class85.field1115[--class85.field1117];
         class70 var5 = (class70)client.field841.method6010((long)var6);
         if(var5 != null) {
            class85.field1115[++class85.field1117 - 1] = 1;
         } else {
            class85.field1115[++class85.field1117 - 1] = 0;
         }

         return 1;
      } else if(var0 == 2706) {
         class85.field1115[++class85.field1117 - 1] = client.field924;
         return 1;
      } else {
         return 2;
      }
   }
}
