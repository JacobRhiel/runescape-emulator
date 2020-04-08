package src;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class class175 implements Runnable {

   public static String field2039;
   static class304 field2045;
   public static String field2041;
   boolean field2043 = false;
   class174 field2040 = null;
   Thread field2042;
   class174 field2038 = null;


   public class175() {
      field2039 = "Unknown";
      field2041 = "1.6";

      try {
         field2039 = System.getProperty("java.vendor");
         field2041 = System.getProperty("java.version");
      } catch (Exception var2) {
         ;
      }

      this.field2043 = false;
      this.field2042 = new Thread(this);
      this.field2042.setPriority(10);
      this.field2042.setDaemon(true);
      this.field2042.start();
   }

   final class174 method3549(int var1, int var2, int var3, Object var4, int var5) {
      class174 var6 = new class174();
      var6.field2034 = var1;
      var6.field2035 = var2;
      var6.field2036 = var4;
      synchronized(this) {
         if(this.field2038 != null) {
            this.field2038.field2037 = var6;
            this.field2038 = var6;
         } else {
            this.field2038 = this.field2040 = var6;
         }

         this.notify();
         return var6;
      }
   }

   public final class174 method3551(Runnable var1, int var2, byte var3) {
      return this.method3549(2, var2, 0, var1, -957641141);
   }

   public final void method3548(byte var1) {
      synchronized(this) {
         this.field2043 = true;
         this.notifyAll();
      }

      try {
         this.field2042.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   public final class174 method3550(String var1, int var2, byte var3) {
      return this.method3549(1, var2, 0, var1, -957641141);
   }

   public final void run() {
      while(true) {
         class174 var1;
         synchronized(this) {
            while(true) {
               if(this.field2043) {
                  return;
               }

               if(this.field2040 != null) {
                  var1 = this.field2040;
                  this.field2040 = this.field2040.field2037;
                  if(this.field2040 == null) {
                     this.field2038 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var8) {
                  ;
               }
            }
         }

         try {
            int var5 = var1.field2034;
            if(var5 == 1) {
               var1.field2030 = new Socket(InetAddress.getByName((String)var1.field2036), var1.field2035);
            } else if(var5 == 2) {
               Thread var3 = new Thread((Runnable)var1.field2036);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.field2035);
               var1.field2030 = var3;
            } else if(var5 == 4) {
               var1.field2030 = new DataInputStream(((URL)var1.field2036).openStream());
            }

            var1.field2033 = 1;
         } catch (ThreadDeath var6) {
            throw var6;
         } catch (Throwable var7) {
            var1.field2033 = 2;
         }
      }
   }

   public static byte method3559(char var0, byte var1) {
      byte var2;
      if((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if(var0 == 8364) {
            var2 = -128;
         } else if(var0 == 8218) {
            var2 = -126;
         } else if(var0 == 402) {
            var2 = -125;
         } else if(var0 == 8222) {
            var2 = -124;
         } else if(var0 == 8230) {
            var2 = -123;
         } else if(var0 == 8224) {
            var2 = -122;
         } else if(var0 == 8225) {
            var2 = -121;
         } else if(var0 == 710) {
            var2 = -120;
         } else if(var0 == 8240) {
            var2 = -119;
         } else if(var0 == 352) {
            var2 = -118;
         } else if(var0 == 8249) {
            var2 = -117;
         } else if(var0 == 338) {
            var2 = -116;
         } else if(var0 == 381) {
            var2 = -114;
         } else if(var0 == 8216) {
            var2 = -111;
         } else if(var0 == 8217) {
            var2 = -110;
         } else if(var0 == 8220) {
            var2 = -109;
         } else if(var0 == 8221) {
            var2 = -108;
         } else if(var0 == 8226) {
            var2 = -107;
         } else if(var0 == 8211) {
            var2 = -106;
         } else if(var0 == 8212) {
            var2 = -105;
         } else if(var0 == 732) {
            var2 = -104;
         } else if(var0 == 8482) {
            var2 = -103;
         } else if(var0 == 353) {
            var2 = -102;
         } else if(var0 == 8250) {
            var2 = -101;
         } else if(var0 == 339) {
            var2 = -100;
         } else if(var0 == 382) {
            var2 = -98;
         } else if(var0 == 376) {
            var2 = -97;
         } else {
            var2 = 63;
         }
      } else {
         var2 = (byte)var0;
      }

      return var2;
   }
}
