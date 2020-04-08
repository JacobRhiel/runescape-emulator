package src;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class class318 implements Runnable {

   IOException field3798;
   int field3796 = 0;
   int field3797 = 0;
   int field3792;
   byte[] field3795;
   InputStream field3800;
   Thread field3794;


   class318(InputStream var1, int var2) {
      this.field3800 = var1;
      this.field3792 = var2 + 1;
      this.field3795 = new byte[this.field3792];
      this.field3794 = new Thread(this);
      this.field3794.setDaemon(true);
      this.field3794.start();
   }

   boolean method5907(int var1, byte var2) throws IOException {
      if(var1 == 0) {
         return true;
      } else if(var1 > 0 && var1 < this.field3792) {
         synchronized(this) {
            int var4;
            if(this.field3796 <= this.field3797) {
               var4 = this.field3797 - this.field3796;
            } else {
               var4 = this.field3792 - this.field3796 + this.field3797;
            }

            if(var4 < var1) {
               if(this.field3798 != null) {
                  throw new IOException(this.field3798.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   int method5909(byte var1) throws IOException {
      synchronized(this) {
         if(this.field3796 == this.field3797) {
            if(this.field3798 != null) {
               throw new IOException(this.field3798.toString());
            } else {
               return -1;
            }
         } else {
            int var3 = this.field3795[this.field3796] & 255;
            this.field3796 = (this.field3796 + 1) % this.field3792;
            this.notifyAll();
            return var3;
         }
      }
   }

   int method5911(byte[] var1, int var2, int var3, int var4) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var6;
            if(this.field3796 <= this.field3797) {
               var6 = this.field3797 - this.field3796;
            } else {
               var6 = this.field3792 - this.field3796 + this.field3797;
            }

            if(var3 > var6) {
               var3 = var6;
            }

            if(var3 == 0 && this.field3798 != null) {
               throw new IOException(this.field3798.toString());
            } else {
               if(var3 + this.field3796 <= this.field3792) {
                  System.arraycopy(this.field3795, this.field3796, var1, var2, var3);
               } else {
                  int var7 = this.field3792 - this.field3796;
                  System.arraycopy(this.field3795, this.field3796, var1, var2, var7);
                  System.arraycopy(this.field3795, 0, var1, var7 + var2, var3 - var7);
               }

               this.field3796 = (var3 + this.field3796) % this.field3792;
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   int method5908(byte var1) throws IOException {
      synchronized(this) {
         int var3;
         if(this.field3796 <= this.field3797) {
            var3 = this.field3797 - this.field3796;
         } else {
            var3 = this.field3792 - this.field3796 + this.field3797;
         }

         if(var3 <= 0 && this.field3798 != null) {
            throw new IOException(this.field3798.toString());
         } else {
            this.notifyAll();
            return var3;
         }
      }
   }

   void method5918(int var1) {
      synchronized(this) {
         if(this.field3798 == null) {
            this.field3798 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field3794.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   public void run() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if(this.field3798 != null) {
                  return;
               }

               if(this.field3796 == 0) {
                  var1 = this.field3792 - this.field3797 - 1;
               } else if(this.field3796 <= this.field3797) {
                  var1 = this.field3792 - this.field3797;
               } else {
                  var1 = this.field3796 - this.field3797 - 1;
               }

               if(var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var10) {
                  ;
               }
            }
         }

         int var7;
         try {
            var7 = this.field3800.read(this.field3795, this.field3797, var1);
            if(var7 == -1) {
               throw new EOFException();
            }
         } catch (IOException var11) {
            IOException var3 = var11;
            synchronized(this) {
               this.field3798 = var3;
               return;
            }
         }

         synchronized(this) {
            this.field3797 = (var7 + this.field3797) % this.field3792;
         }
      }
   }
}
