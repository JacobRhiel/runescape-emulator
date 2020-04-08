package src;

import java.io.IOException;
import java.io.OutputStream;

public class class316 implements Runnable {

   boolean field3782;
   IOException field3781;
   int field3775 = 0;
   OutputStream field3776;
   Thread field3779;
   int field3780 = 0;
   int field3777;
   byte[] field3778;


   class316(OutputStream var1, int var2) {
      this.field3776 = var1;
      this.field3777 = var2 + 1;
      this.field3778 = new byte[this.field3777];
      this.field3779 = new Thread(this);
      this.field3779.setDaemon(true);
      this.field3779.start();
   }

   void method5881(byte[] var1, int var2, int var3, short var4) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            if(this.field3781 != null) {
               throw new IOException(this.field3781.toString());
            } else {
               int var6;
               if(this.field3775 <= this.field3780) {
                  var6 = this.field3777 - this.field3780 + this.field3775 - 1;
               } else {
                  var6 = this.field3775 - this.field3780 - 1;
               }

               if(var6 < var3) {
                  throw new IOException("");
               } else {
                  if(var3 + this.field3780 <= this.field3777) {
                     System.arraycopy(var1, var2, this.field3778, this.field3780, var3);
                  } else {
                     int var7 = this.field3777 - this.field3780;
                     System.arraycopy(var1, var2, this.field3778, this.field3780, var7);
                     System.arraycopy(var1, var7 + var2, this.field3778, 0, var3 - var7);
                  }

                  this.field3780 = (var3 + this.field3780) % this.field3777;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method5888(int var1) {
      synchronized(this) {
         this.field3782 = true;
         this.notifyAll();
      }

      try {
         this.field3779.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   boolean method5882(byte var1) {
      if(this.field3782) {
         try {
            this.field3776.close();
            if(this.field3781 == null) {
               this.field3781 = new IOException("");
            }
         } catch (IOException var3) {
            if(this.field3781 == null) {
               this.field3781 = new IOException(var3);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void run() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if(this.field3781 != null) {
                  return;
               }

               if(this.field3775 <= this.field3780) {
                  var1 = this.field3780 - this.field3775;
               } else {
                  var1 = this.field3777 - this.field3775 + this.field3780;
               }

               if(var1 > 0) {
                  break;
               }

               try {
                  this.field3776.flush();
               } catch (IOException var11) {
                  this.field3781 = var11;
                  return;
               }

               if(this.method5882((byte)27)) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var12) {
                  ;
               }
            }
         }

         try {
            if(var1 + this.field3775 <= this.field3777) {
               this.field3776.write(this.field3778, this.field3775, var1);
            } else {
               int var7 = this.field3777 - this.field3775;
               this.field3776.write(this.field3778, this.field3775, var7);
               this.field3776.write(this.field3778, 0, var1 - var7);
            }
         } catch (IOException var10) {
            IOException var2 = var10;
            synchronized(this) {
               this.field3781 = var2;
               return;
            }
         }

         synchronized(this) {
            this.field3775 = (var1 + this.field3775) % this.field3777;
         }
      } while(!this.method5882((byte)86));

   }
}
