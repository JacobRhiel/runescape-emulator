package src;

public class class311 {

   static int field3718 = 0;
   static class75 field3717;
   static int field3716 = 0;
   static int field3720 = 0;
   static byte[][] field3723 = new byte[1000][];
   public static byte[][][] field3722;
   static byte[][] field3719 = new byte[250][];
   static byte[][] field3721 = new byte[50][];
   public static int[] field3715;


   static synchronized byte[] method5805(int var0, boolean var1, int var2) {
      byte[] var3;
      if(var0 != 100) {
         if(var0 < 100) {
            ;
         }
      } else if(field3718 > 0) {
         var3 = field3723[--field3718];
         field3723[field3718] = null;
         return var3;
      }

      if(var0 != 5000) {
         if(var0 < 5000) {
            ;
         }
      } else if(field3716 > 0) {
         var3 = field3719[--field3716];
         field3719[field3716] = null;
         return var3;
      }

      if(var0 != 30000) {
         if(var0 < 30000) {
            ;
         }
      } else if(field3720 > 0) {
         var3 = field3721[--field3720];
         field3721[field3720] = null;
         return var3;
      }

      if(field3722 != null) {
         for(int var5 = 0; var5 < class350.field4067.length; ++var5) {
            if(class350.field4067[var5] != var0) {
               if(var0 < class350.field4067[var5]) {
                  ;
               }
            } else if(field3715[var5] > 0) {
               byte[] var4 = field3722[var5][--field3715[var5]];
               field3722[var5][field3715[var5]] = null;
               return var4;
            }
         }
      }

      return new byte[var0];
   }
}
