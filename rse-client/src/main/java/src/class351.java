package src;

import java.io.EOFException;
import java.io.IOException;

public class class351 {

   long field4077;
   int field4081;
   long field4076;
   long field4080 = -1L;
   long field4082;
   long field4074 = -1L;
   class352 field4075;
   int field4084 = 0;
   byte[] field4079;
   byte[] field4085;
   long field4083;


   public class351(class352 var1, int var2, int var3) throws IOException {
      this.field4075 = var1;
      this.field4077 = this.field4083 = var1.method6650((byte)108);
      this.field4085 = new byte[var2];
      this.field4079 = new byte[var3];
      this.field4082 = 0L;
   }

   public void method6610(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if(var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if(this.field4080 != -1L && this.field4082 >= this.field4080 && this.field4082 + (long)var3 <= this.field4080 + (long)this.field4084) {
            System.arraycopy(this.field4079, (int)(this.field4082 - this.field4080), var1, var2, var3);
            this.field4082 += (long)var3;
            return;
         }

         long var5 = this.field4082;
         int var8 = var3;
         int var9;
         if(this.field4082 >= this.field4074 && this.field4082 < this.field4074 + (long)this.field4081) {
            var9 = (int)((long)this.field4081 - (this.field4082 - this.field4074));
            if(var9 > var3) {
               var9 = var3;
            }

            System.arraycopy(this.field4085, (int)(this.field4082 - this.field4074), var1, var2, var9);
            this.field4082 += (long)var9;
            var2 += var9;
            var3 -= var9;
         }

         if(var3 > this.field4085.length) {
            this.field4075.method6647(this.field4082);

            for(this.field4076 = this.field4082; var3 > 0; var3 -= var9) {
               var9 = this.field4075.method6658(var1, var2, var3, 700053306);
               if(var9 == -1) {
                  break;
               }

               this.field4076 += (long)var9;
               this.field4082 += (long)var9;
               var2 += var9;
            }
         } else if(var3 > 0) {
            this.method6615(-2013306645);
            var9 = var3;
            if(var3 > this.field4081) {
               var9 = this.field4081;
            }

            System.arraycopy(this.field4085, 0, var1, var2, var9);
            var2 += var9;
            var3 -= var9;
            this.field4082 += (long)var9;
         }

         if(-1L != this.field4080) {
            if(this.field4080 > this.field4082 && var3 > 0) {
               var9 = var2 + (int)(this.field4080 - this.field4082);
               if(var9 > var3 + var2) {
                  var9 = var3 + var2;
               }

               while(var2 < var9) {
                  var1[var2++] = 0;
                  --var3;
                  ++this.field4082;
               }
            }

            long var14 = -1L;
            long var11 = -1L;
            if(this.field4080 >= var5 && this.field4080 < var5 + (long)var8) {
               var14 = this.field4080;
            } else if(var5 >= this.field4080 && var5 < (long)this.field4084 + this.field4080) {
               var14 = var5;
            }

            if((long)this.field4084 + this.field4080 > var5 && this.field4080 + (long)this.field4084 <= (long)var8 + var5) {
               var11 = this.field4080 + (long)this.field4084;
            } else if((long)var8 + var5 > this.field4080 && var5 + (long)var8 <= (long)this.field4084 + this.field4080) {
               var11 = var5 + (long)var8;
            }

            if(var14 > -1L && var11 > var14) {
               int var13 = (int)(var11 - var14);
               System.arraycopy(this.field4079, (int)(var14 - this.field4080), var1, (int)(var14 - var5) + var2, var13);
               if(var11 > this.field4082) {
                  var3 = (int)((long)var3 - (var11 - this.field4082));
                  this.field4082 = var11;
               }
            }
         }
      } catch (IOException var17) {
         this.field4076 = -1L;
         throw var17;
      }

      if(var3 > 0) {
         throw new EOFException();
      }
   }

   void method6626(int var1) throws IOException {
      if(-1L != this.field4080) {
         if(this.field4076 != this.field4080) {
            this.field4075.method6647(this.field4080);
            this.field4076 = this.field4080;
         }

         this.field4075.method6653(this.field4079, 0, this.field4084, (byte)-102);
         this.field4076 += (long)(this.field4084 * 352301747) * 730352763L;
         if(this.field4076 > this.field4083) {
            this.field4083 = this.field4076;
         }

         long var2 = -1L;
         long var4 = -1L;
         if(this.field4080 >= this.field4074 && this.field4080 < this.field4074 + (long)this.field4081) {
            var2 = this.field4080;
         } else if(this.field4074 >= this.field4080 && this.field4074 < (long)this.field4084 + this.field4080) {
            var2 = this.field4074;
         }

         if((long)this.field4084 + this.field4080 > this.field4074 && this.field4080 + (long)this.field4084 <= this.field4074 + (long)this.field4081) {
            var4 = this.field4080 + (long)this.field4084;
         } else if((long)this.field4081 + this.field4074 > this.field4080 && (long)this.field4081 + this.field4074 <= (long)this.field4084 + this.field4080) {
            var4 = (long)this.field4081 + this.field4074;
         }

         if(var2 > -1L && var4 > var2) {
            int var6 = (int)(var4 - var2);
            System.arraycopy(this.field4079, (int)(var2 - this.field4080), this.field4085, (int)(var2 - this.field4074), var6);
         }

         this.field4080 = -1L;
         this.field4084 = 0;
      }

   }

   public long method6613(byte var1) {
      return this.field4077;
   }

   public void method6612(long var1) throws IOException {
      if(var1 < 0L) {
         throw new IOException("");
      } else {
         this.field4082 = var1;
      }
   }

   public void method6633(byte[] var1, int var2, int var3, byte var4) throws IOException {
      try {
         if(this.field4082 + (long)var3 > this.field4077) {
            this.field4077 = this.field4082 + (long)var3;
         }

         if(this.field4080 != -1L && (this.field4082 < this.field4080 || this.field4082 > (long)this.field4084 + this.field4080)) {
            this.method6626(-985506123);
         }

         if(this.field4080 != -1L && (long)var3 + this.field4082 > this.field4080 + (long)this.field4079.length) {
            int var5 = (int)((long)this.field4079.length - (this.field4082 - this.field4080));
            System.arraycopy(var1, var2, this.field4079, (int)(this.field4082 - this.field4080), var5);
            this.field4082 += (long)var5;
            var2 += var5;
            var3 -= var5;
            this.field4084 = this.field4079.length;
            this.method6626(-985506123);
         }

         if(var3 <= this.field4079.length) {
            if(var3 > 0) {
               if(this.field4080 == -1L) {
                  this.field4080 = this.field4082;
               }

               System.arraycopy(var1, var2, this.field4079, (int)(this.field4082 - this.field4080), var3);
               this.field4082 += (long)var3;
               if(this.field4082 - this.field4080 > (long)this.field4084) {
                  this.field4084 = (int)(this.field4082 - this.field4080);
               }

            }
         } else {
            if(this.field4076 != this.field4082) {
               this.field4075.method6647(this.field4082);
               this.field4076 = this.field4082;
            }

            this.field4075.method6653(var1, var2, var3, (byte)-96);
            this.field4076 += (long)var3;
            if(this.field4076 > this.field4083) {
               this.field4083 = this.field4076;
            }

            long var10 = -1L;
            long var7 = -1L;
            if(this.field4082 >= this.field4074 && this.field4082 < this.field4074 + (long)this.field4081) {
               var10 = this.field4082;
            } else if(this.field4074 >= this.field4082 && this.field4074 < (long)var3 + this.field4082) {
               var10 = this.field4074;
            }

            if(this.field4082 + (long)var3 > this.field4074 && (long)var3 + this.field4082 <= this.field4074 + (long)this.field4081) {
               var7 = (long)var3 + this.field4082;
            } else if((long)this.field4081 + this.field4074 > this.field4082 && this.field4074 + (long)this.field4081 <= (long)var3 + this.field4082) {
               var7 = (long)this.field4081 + this.field4074;
            }

            if(var10 > -1L && var7 > var10) {
               int var9 = (int)(var7 - var10);
               System.arraycopy(var1, (int)((long)var2 + var10 - this.field4082), this.field4085, (int)(var10 - this.field4074), var9);
            }

            this.field4082 += (long)var3;
         }
      } catch (IOException var13) {
         this.field4076 = -1L;
         throw var13;
      }
   }

   void method6615(int var1) throws IOException {
      this.field4081 = 0;
      if(this.field4082 != this.field4076) {
         this.field4075.method6647(this.field4082);
         this.field4076 = this.field4082;
      }

      int var3;
      for(this.field4074 = this.field4082; this.field4081 < this.field4085.length; this.field4081 += var3) {
         int var2 = this.field4085.length - this.field4081;
         if(var2 > 200000000) {
            var2 = 200000000;
         }

         var3 = this.field4075.method6658(this.field4085, this.field4081, var2, -2001298574);
         if(var3 == -1) {
            break;
         }

         this.field4076 += (long)var3;
      }

   }

   public void method6618(int var1) throws IOException {
      this.method6626(-985506123);
      this.field4075.method6648((byte)10);
   }

   public void method6614(byte[] var1, int var2) throws IOException {
      this.method6610(var1, 0, var1.length, 1328285354);
   }
}
