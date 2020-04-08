package src;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class class180 extends class314 implements Runnable {

   int field2071 = 0;
   boolean field2072 = false;
   int field2064 = 0;
   boolean field2073 = false;
   InputStream field2066;
   byte[] field2070;
   class174 field2069;
   final int field2074;
   OutputStream field2067;
   class175 field2068;
   Socket field2065;
   final int field2075;


   public class180(Socket var1, class175 var2, int var3) throws IOException {
      this.field2068 = var2;
      this.field2065 = var1;
      this.field2074 = var3;
      this.field2075 = var3 - 100;
      this.field2065.setSoTimeout(30000);
      this.field2065.setTcpNoDelay(true);
      this.field2065.setReceiveBufferSize(65536);
      this.field2065.setSendBufferSize(65536);
      this.field2066 = this.field2065.getInputStream();
      this.field2067 = this.field2065.getOutputStream();
   }

   void method3592(byte[] var1, int var2, int var3, byte var4) throws IOException {
      if(!this.field2072) {
         if(this.field2073) {
            this.field2073 = false;
            throw new IOException();
         } else {
            if(this.field2070 == null) {
               this.field2070 = new byte[this.field2074];
            }

            synchronized(this) {
               for(int var6 = 0; var6 < var3; ++var6) {
                  this.field2070[this.field2071] = var1[var6 + var2];
                  this.field2071 = (this.field2071 + 1) % this.field2074;
                  if((this.field2064 + this.field2075) % this.field2074 == this.field2071) {
                     throw new IOException();
                  }
               }

               if(this.field2069 == null) {
                  this.field2069 = this.field2068.method3551(this, 3, (byte)-102);
               }

               this.notifyAll();
            }
         }
      }
   }

   public void vmethod5866(byte var1) {
      if(!this.field2072) {
         synchronized(this) {
            this.field2072 = true;
            this.notifyAll();
         }

         if(this.field2069 != null) {
            while(this.field2069.field2033 == 0) {
               class169.method3527(1L);
            }

            if(this.field2069.field2033 == 1) {
               try {
                  ((Thread)this.field2069.field2030).join();
               } catch (InterruptedException var4) {
                  ;
               }
            }
         }

         this.field2069 = null;
      }
   }

   public boolean vmethod5861(int var1, byte var2) throws IOException {
      return this.field2072?false:this.field2066.available() >= var1;
   }

   public int vmethod5864(byte[] var1, int var2, int var3, byte var4) throws IOException {
      if(this.field2072) {
         return 0;
      } else {
         int var5;
         int var6;
         for(var5 = var3; var3 > 0; var3 -= var6) {
            var6 = this.field2066.read(var1, var2, var3);
            if(var6 <= 0) {
               throw new EOFException();
            }

            var2 += var6;
         }

         return var5;
      }
   }

   public void vmethod5878(byte[] var1, int var2, int var3, int var4) throws IOException {
      this.method3592(var1, var2, var3, (byte)-21);
   }

   public int vmethod5862(int var1) throws IOException {
      return this.field2072?0:this.field2066.available();
   }

   public int vmethod5863(int var1) throws IOException {
      return this.field2072?0:this.field2066.read();
   }

   protected void aaf() {
      this.vmethod5866((byte)-105);
   }

   protected void finalize() {
      this.vmethod5866((byte)7);
   }

   protected void aav() {
      this.vmethod5866((byte)-99);
   }

   protected void aaw() {
      this.vmethod5866((byte)-87);
   }

   protected void aay() {
      this.vmethod5866((byte)-5);
   }

   public void run() {
      while(true) {
         try {
            label83: {
               int var1;
               int var2;
               synchronized(this) {
                  if(this.field2071 == this.field2064) {
                     if(this.field2072) {
                        break label83;
                     }

                     try {
                        this.wait();
                     } catch (InterruptedException var10) {
                        ;
                     }
                  }

                  var2 = this.field2064;
                  if(this.field2071 >= this.field2064) {
                     var1 = this.field2071 - this.field2064;
                  } else {
                     var1 = this.field2074 - this.field2064;
                  }
               }

               if(var1 <= 0) {
                  continue;
               }

               try {
                  this.field2067.write(this.field2070, var2, var1);
               } catch (IOException var9) {
                  this.field2073 = true;
               }

               this.field2064 = (var1 + this.field2064) % this.field2074;

               try {
                  if(this.field2071 == this.field2064) {
                     this.field2067.flush();
                  }
               } catch (IOException var8) {
                  this.field2073 = true;
               }
               continue;
            }

            try {
               if(this.field2066 != null) {
                  this.field2066.close();
               }

               if(this.field2067 != null) {
                  this.field2067.close();
               }

               if(this.field2065 != null) {
                  this.field2065.close();
               }
            } catch (IOException var7) {
               ;
            }

            this.field2070 = null;
         } catch (Exception var12) {
            class229.method4189((String)null, var12, -1131770525);
         }

         return;
      }
   }
}
