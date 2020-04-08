package src;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public class class152 implements Runnable {

   static class314 field1960;
   static int[][] field1957;
   volatile boolean field1958;
   Queue field1961 = new LinkedList();
   final Thread field1959 = new Thread(this);


   public class152() {
      this.field1959.setPriority(1);
      this.field1959.start();
   }

   public void method3395(byte var1) {
      this.field1958 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field1959.join();
      } catch (InterruptedException var5) {
         ;
      }

   }

   public class153 method3397(URL var1, byte var2) {
      class153 var3 = new class153(var1);
      synchronized(this) {
         this.field1961.add(var3);
         this.notify();
         return var3;
      }
   }

   public void run() {
      while(!this.field1958) {
         try {
            class153 var1;
            synchronized(this) {
               var1 = (class153)this.field1961.poll();
               if(var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var13) {
                     ;
                  }
                  continue;
               }
            }

            DataInputStream var2 = null;
            URLConnection var3 = null;

            try {
               var3 = var1.field1962.openConnection();
               var3.setConnectTimeout(5000);
               var3.setReadTimeout(5000);
               var3.setUseCaches(false);
               var3.setRequestProperty("Connection", "close");
               int var7 = var3.getContentLength();
               if(var7 >= 0) {
                  byte[] var5 = new byte[var7];
                  var2 = new DataInputStream(var3.getInputStream());
                  var2.readFully(var5);
                  var1.field1964 = var5;
               }

               var1.field1963 = true;
            } catch (IOException var14) {
               var1.field1963 = true;
            } finally {
               if(var2 != null) {
                  var2.close();
               }

               if(var3 != null && var3 instanceof HttpURLConnection) {
                  ((HttpURLConnection)var3).disconnect();
               }

            }
         } catch (Exception var17) {
            class229.method4189((String)null, var17, -1131770525);
         }
      }

   }
}
