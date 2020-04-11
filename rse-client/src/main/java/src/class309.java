package src;

import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;

public class class309 extends class189 {

   static int[] field3714 = new int[256];
   static long[] field3713;
   public byte[] field3709;
   public int field3710;


   static {
      int var2;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(var2 = 0; var2 < 8; ++var2) {
            if((var0 & 1) == 1) {
               var0 = var0 >>> 1 ^ -306674912;
            } else {
               var0 >>>= 1;
            }
         }

         field3714[var1] = var0;
      }

      field3713 = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var4 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if((var4 & 1L) == 1L) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         field3713[var2] = var4;
      }

   }

   public class309(int var1) {
      this.field3709 = class182.method3645(var1, 130729022);
      this.field3710 = 0;
   }

   public class309(byte[] var1) {
      this.field3709 = var1;
      this.field3710 = 0;
   }

   public long method5553(byte var1) {
      long var2 = (long)this.method5552(297718403) & 4294967295L;
      long var4 = (long)this.method5552(297718403) & 4294967295L;
      return (var2 << 32) + var4;
   }

   public int method5561(int var1) {
      int var2 = this.field3709[this.field3710] & 255;
      return var2 < 128?this.readUnsignedByte((byte)53):this.readShort((byte)99) - '\u8000';
   }

   public void method5627(String var1, int var2) {
      int var3 = var1.indexOf(0);
      if(var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field3710 += class90.method2136(var1, 0, var1.length(), this.field3709, this.field3710, -879105119);
         this.field3709[++this.field3710 - 1] = 0;
      }
   }

   public String method5667(int var1) {
      int var2 = this.field3710;

      while(this.field3709[++this.field3710 - 1] != 0) {
         ;
      }

      int var3 = this.field3710 - var2 - 1;
      return var3 == 0?"":class35.method507(this.field3709, var2, var3, (byte)-37);
   }

   public int method5552(int var1) {
      this.field3710 += 4;
      return ((this.field3709[this.field3710 - 3] & 255) << 16) + (this.field3709[this.field3710 - 1] & 255) + ((this.field3709[this.field3710 - 2] & 255) << 8) + ((this.field3709[this.field3710 - 4] & 255) << 24);
   }

   public void readByte(int var1, int var2) {
      this.field3709[++this.field3710 - 1] = (byte)var1;
   }

   public int readUnsignedByte(byte var1) {
      return this.field3709[++this.field3710 - 1] & 255;
   }

   public int method5674(short var1) {
      this.field3710 += 3;
      return ((this.field3709[this.field3710 - 3] & 255) << 16) + (this.field3709[this.field3710 - 1] & 255) + ((this.field3709[this.field3710 - 2] & 255) << 8);
   }

   public void method5529(long var1) {
      this.field3709[++this.field3710 - 1] = (byte)((int)(var1 >> 56));
      this.field3709[++this.field3710 - 1] = (byte)((int)(var1 >> 48));
      this.field3709[++this.field3710 - 1] = (byte)((int)(var1 >> 40));
      this.field3709[++this.field3710 - 1] = (byte)((int)(var1 >> 32));
      this.field3709[++this.field3710 - 1] = (byte)((int)(var1 >> 24));
      this.field3709[++this.field3710 - 1] = (byte)((int)(var1 >> 16));
      this.field3709[++this.field3710 - 1] = (byte)((int)(var1 >> 8));
      this.field3709[++this.field3710 - 1] = (byte)((int)var1);
   }

   public int method5564(byte var1) {
      if(this.field3709[this.field3710] < 0) {
         return this.method5552(297718403) & Integer.MAX_VALUE;
      } else {
         int var2 = this.readShort((byte)107);
         return var2 == 32767?-1:var2;
      }
   }

   public int method5571(int var1) {
      byte var2 = this.field3709[++this.field3710 - 1];

      int var3;
      for(var3 = 0; var2 < 0; var2 = this.field3709[++this.field3710 - 1]) {
         var3 = (var3 | var2 & 127) << 7;
      }

      return var3 | var2;
   }

   public byte readByte(int var1) {
      return this.field3709[++this.field3710 - 1];
   }

   public void method5689(int var1, int var2) {
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 24);
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 16);
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 8);
      this.field3709[++this.field3710 - 1] = (byte)var1;
   }

   public int readShort(byte var1) {
      this.field3710 += 2;
      return (this.field3709[this.field3710 - 1] & 255) + ((this.field3709[this.field3710 - 2] & 255) << 8);
   }

   public void method5596(byte[] var1, int var2, int var3, int var4) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         this.field3709[++this.field3710 - 1] = var1[var5];
      }

   }

   public void method5620(byte[] var1, int var2, int var3, int var4) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         var1[var5] = this.field3709[++this.field3710 - 1];
      }

   }

   public void readShort(int var1, byte var2) {
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 8);
      this.field3709[++this.field3710 - 1] = (byte)var1;
   }

   public int method5550(int var1) {
      this.field3710 += 2;
      int var2 = (this.field3709[this.field3710 - 1] & 255) + ((this.field3709[this.field3710 - 2] & 255) << 8);
      if(var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public String method5557(int var1) {
      byte var2 = this.field3709[++this.field3710 - 1];
      if(var2 != 0) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.field3710;

         while(this.field3709[++this.field3710 - 1] != 0) {
            ;
         }

         int var4 = this.field3710 - var3 - 1;
         return var4 == 0?"":class35.method507(this.field3709, var3, var4, (byte)-16);
      }
   }

   public void method5546(int var1, int var2) {
      if((var1 & -128) != 0) {
         if((var1 & -16384) != 0) {
            if((var1 & -2097152) != 0) {
               if((var1 & -268435456) != 0) {
                  this.readByte(var1 >>> 28 | 128, 1258821856);
               }

               this.readByte(var1 >>> 21 | 128, 1258821856);
            }

            this.readByte(var1 >>> 14 | 128, 1258821856);
         }

         this.readByte(var1 >>> 7 | 128, 1258821856);
      }

      this.readByte(var1 & 127, 1258821856);
   }

   public int method5751(int var1) {
      return this.field3709[this.field3710] < 0?this.method5552(297718403) & Integer.MAX_VALUE:this.readShort((byte)38);
   }

   public void method5727(int[] var1, int var2, int var3, int var4) {
      int var5 = this.field3710;
      this.field3710 = var2;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.method5552(297718403);
         int var9 = this.method5552(297718403);
         int var10 = -957401312;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var8 -= var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3]) {
            var9 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10;
            var10 -= var11;
         }

         this.field3710 -= 8;
         this.method5689(var8, 747474969);
         this.method5689(var9, 747474969);
      }

      this.field3710 = var5;
   }

   public void method5690(boolean var1, int var2) {
      this.readByte(var1?1:0, 1258821856);
   }

   public void method5530(byte var1) {
      if(this.field3709 != null) {
         class51.method899(this.field3709, 1515618060);
      }

      this.field3709 = null;
   }

   public void method5588(int var1, int var2) {
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 16);
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 8);
      this.field3709[++this.field3710 - 1] = (byte)var1;
   }

   public String method5555(byte var1) {
      if(this.field3709[this.field3710] == 0) {
         ++this.field3710;
         return null;
      } else {
         return this.method5667(-472239198);
      }
   }

   public boolean method5682(byte var1) {
      return (this.readUnsignedByte((byte)99) & 1) == 1;
   }

   public int method5628(int var1) {
      int var2 = this.field3709[this.field3710] & 255;
      return var2 < 128?this.readUnsignedByte((byte)108) - 64:this.readShort((byte)72) - '\uc000';
   }

   public void method5641(String var1, short var2) {
      int var3 = var1.indexOf(0);
      if(var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field3709[++this.field3710 - 1] = 0;
         this.field3710 += class90.method2136(var1, 0, var1.length(), this.field3709, this.field3710, 2036361577);
         this.field3709[++this.field3710 - 1] = 0;
      }
   }

   public int method5587(int var1) {
      this.field3710 += 2;
      return ((this.field3709[this.field3710 - 1] & 255) << 8) + (this.field3709[this.field3710 - 2] - 128 & 255);
   }

   public int method5611(int var1) {
      this.field3710 += 4;
      return ((this.field3709[this.field3710 - 2] & 255) << 24) + ((this.field3709[this.field3710 - 4] & 255) << 8) + (this.field3709[this.field3710 - 3] & 255) + ((this.field3709[this.field3710 - 1] & 255) << 16);
   }

   public void method5583(int var1, int var2) {
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 8);
      this.field3709[++this.field3710 - 1] = (byte)(var1 + 128);
   }

   public int method5577(int var1) {
      return 0 - this.field3709[++this.field3710 - 1] & 255;
   }

   public void method5656(int var1, int var2) {
      if(var1 >= 0 && var1 <= 255) {
         this.field3709[this.field3710 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public byte method5581(int var1) {
      return (byte)(128 - this.field3709[++this.field3710 - 1]);
   }

   public int readByteS(int var1) {
      return 128 - this.field3709[++this.field3710 - 1] & 255;
   }

   public int readUnsignedShort(byte var1) {
      this.field3710 += 2;
      return ((this.field3709[this.field3710 - 1] & 255) << 8) + (this.field3709[this.field3710 - 2] & 255);
   }

   public void method5700(int var1, int var2) {
      this.field3709[++this.field3710 - 1] = (byte)(var1 + 128);
   }

   public int method5594(byte var1) {
      this.field3710 += 4;
      return ((this.field3709[this.field3710 - 1] & 255) << 8) + ((this.field3709[this.field3710 - 4] & 255) << 16) + (this.field3709[this.field3710 - 2] & 255) + ((this.field3709[this.field3710 - 3] & 255) << 24);
   }

   public int method5576(int var1) {
      return this.field3709[++this.field3710 - 1] - 128 & 255;
   }

   public void method5582(int var1, int var2) {
      this.field3709[++this.field3710 - 1] = (byte)var1;
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 8);
   }

   public int method5586(byte var1) {
      this.field3710 += 2;
      return (this.field3709[this.field3710 - 1] - 128 & 255) + ((this.field3709[this.field3710 - 2] & 255) << 8);
   }

   public int method5551(int var1, int var2) {
      byte[] var4 = this.field3709;
      int var5 = this.field3710;
      int var6 = -1;

      for(int var7 = var1; var7 < var5; ++var7) {
         var6 = var6 >>> 8 ^ field3714[(var6 ^ var4[var7]) & 255];
      }

      var6 = ~var6;
      this.method5689(var6, 747474969);
      return var6;
   }

   public void writeIntME(int var1, int var2) {
      this.field3709[++this.field3710 - 1] = (byte)(var1 + 128);
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 8);
   }

   public byte method5579(int var1) {
      return (byte)(this.field3709[++this.field3710 - 1] - 128);
   }

   public void method5590(int var1, int var2) {
      this.field3709[++this.field3710 - 1] = (byte)var1;
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 8);
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 16);
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 24);
   }

   public void method5617(int var1, int var2) {
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 16);
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 24);
      this.field3709[++this.field3710 - 1] = (byte)var1;
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 8);
   }

   public int method5592(int var1) {
      this.field3710 += 4;
      return (this.field3709[this.field3710 - 4] & 255) + ((this.field3709[this.field3710 - 3] & 255) << 8) + ((this.field3709[this.field3710 - 2] & 255) << 16) + ((this.field3709[this.field3710 - 1] & 255) << 24);
   }

   public int method5716(int var1) {
      this.field3710 += 2;
      int var2 = (this.field3709[this.field3710 - 1] - 128 & 255) + ((this.field3709[this.field3710 - 2] & 255) << 8);
      if(var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public String method5681(int var1) {
      byte var2 = this.field3709[++this.field3710 - 1];
      if(var2 != 0) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.method5571(-1771949174);
         if(var3 + this.field3710 > this.field3709.length) {
            throw new IllegalStateException("");
         } else {
            byte[] var5 = this.field3709;
            int var6 = this.field3710;
            char[] var7 = new char[var3];
            int var8 = 0;
            int var9 = var6;

            int var12;
            for(int var10 = var6 + var3; var9 < var10; var7[var8++] = (char)var12) {
               int var11 = var5[var9++] & 255;
               if(var11 < 128) {
                  if(var11 == 0) {
                     var12 = '\ufffd';
                  } else {
                     var12 = var11;
                  }
               } else if(var11 < 192) {
                  var12 = '\ufffd';
               } else if(var11 < 224) {
                  if(var9 < var10 && (var5[var9] & 192) == 128) {
                     var12 = (var11 & 31) << 6 | var5[var9++] & 63;
                     if(var12 < 128) {
                        var12 = '\ufffd';
                     }
                  } else {
                     var12 = '\ufffd';
                  }
               } else if(var11 < 240) {
                  if(var9 + 1 < var10 && (var5[var9] & 192) == 128 && (var5[var9 + 1] & 192) == 128) {
                     var12 = (var11 & 15) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
                     if(var12 < 2048) {
                        var12 = '\ufffd';
                     }
                  } else {
                     var12 = '\ufffd';
                  }
               } else if(var11 < 248) {
                  if(var9 + 2 < var10 && (var5[var9] & 192) == 128 && (var5[var9 + 1] & 192) == 128 && (var5[var9 + 2] & 192) == 128) {
                     var12 = (var11 & 7) << 18 | (var5[var9++] & 63) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
                     if(var12 >= 65536 && var12 <= 1114111) {
                        var12 = '\ufffd';
                     } else {
                        var12 = '\ufffd';
                     }
                  } else {
                     var12 = '\ufffd';
                  }
               } else {
                  var12 = '\ufffd';
               }
            }

            String var4 = new String(var7, 0, var8);
            this.field3710 += var3;
            return var4;
         }
      }
   }

   public void method5591(int var1, int var2) {
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 8);
      this.field3709[++this.field3710 - 1] = (byte)var1;
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 24);
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 16);
   }

   public void method5575(int var1, byte var2) {
      this.field3709[++this.field3710 - 1] = (byte)(128 - var1);
   }

   public void method5697(int var1, byte var2) {
      this.field3709[++this.field3710 - 1] = (byte)(0 - var1);
   }

   public byte method5580(int var1) {
      return (byte)(0 - this.field3709[++this.field3710 - 1]);
   }

   public void method5570(BigInteger var1, BigInteger var2, int var3) {
      int var4 = this.field3710;
      this.field3710 = 0;
      byte[] var5 = new byte[var4];
      this.method5620(var5, 0, var4, -84211636);
      BigInteger var6 = new BigInteger(var5);
      BigInteger var7 = var6.modPow(var1, var2);
      byte[] var8 = var7.toByteArray();
      this.field3710 = 0;
      this.readShort(var8.length, (byte)-102);
      this.method5596(var8, 0, var8.length, -1590891251);
   }

   public int method5562(int var1) {
      int var2 = 0;

      int var3;
      for(var3 = this.method5561(1955216542); var3 == 32767; var3 = this.method5561(1608407367)) {
         var2 += 32767;
      }

      var2 += var3;
      return var2;
   }

   public void method5540(CharSequence var1, int var2) {
      int var4 = var1.length();
      int var5 = 0;

      for(int var6 = 0; var6 < var4; ++var6) {
         char var7 = var1.charAt(var6);
         if(var7 <= 127) {
            ++var5;
         } else if(var7 <= 2047) {
            var5 += 2;
         } else {
            var5 += 3;
         }
      }

      this.field3709[++this.field3710 - 1] = 0;
      this.method5546(var5, -2128339921);
      this.field3710 += class144.method3358(this.field3709, this.field3710, var1, -304633818);
   }

   public void method5762(class309 var1, int var2) {
      this.method5596(var1.field3709, 0, var1.field3710, -1590891251);
   }

   public void method5726(int var1, int var2) {
      if(var1 >= 0 && var1 <= '\uffff') {
         this.field3709[this.field3710 - var1 - 2] = (byte)(var1 >> 8);
         this.field3709[this.field3710 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public boolean method5544(int var1) {
      this.field3710 -= 4;
      byte[] var3 = this.field3709;
      int var4 = this.field3710;
      int var5 = -1;

      int var6;
      for(var6 = 0; var6 < var4; ++var6) {
         var5 = var5 >>> 8 ^ field3714[(var5 ^ var3[var6]) & 255];
      }

      var5 = ~var5;
      var6 = this.method5552(297718403);
      return var6 == var5;
   }

   public void method5589(int var1, int var2) {
      this.field3709[++this.field3710 - 1] = (byte)var1;
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 8);
      this.field3709[++this.field3710 - 1] = (byte)(var1 >> 16);
   }

   public void method5707(int var1, int var2) {
      if(var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.field3709[this.field3710 - var1 - 4] = (byte)(var1 >> 24);
         this.field3709[this.field3710 - var1 - 3] = (byte)(var1 >> 16);
         this.field3709[this.field3710 - var1 - 2] = (byte)(var1 >> 8);
         this.field3709[this.field3710 - var1 - 1] = (byte)var1;
      }
   }

   public void method5535(long var1) {
      this.field3709[++this.field3710 - 1] = (byte)((int)(var1 >> 40));
      this.field3709[++this.field3710 - 1] = (byte)((int)(var1 >> 32));
      this.field3709[++this.field3710 - 1] = (byte)((int)(var1 >> 24));
      this.field3709[++this.field3710 - 1] = (byte)((int)(var1 >> 16));
      this.field3709[++this.field3710 - 1] = (byte)((int)(var1 >> 8));
      this.field3709[++this.field3710 - 1] = (byte)((int)var1);
   }

   public void method5536(int[] var1, short var2) {
      int var3 = this.field3710 / 8;
      this.field3710 = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.method5552(297718403);
         int var6 = this.method5552(297718403);
         int var7 = 0;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7) {
            var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
            var7 += var8;
         }

         this.field3710 -= 8;
         this.method5689(var5, 747474969);
         this.method5689(var6, 747474969);
      }

   }

   public void method5568(int[] var1, int var2, int var3, byte var4) {
      int var5 = this.field3710;
      this.field3710 = var2;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.method5552(297718403);
         int var9 = this.method5552(297718403);
         int var10 = 0;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var9 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10) {
            var8 += var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3];
            var10 += var11;
         }

         this.field3710 -= 8;
         this.method5689(var8, 747474969);
         this.method5689(var9, 747474969);
      }

      this.field3710 = var5;
   }

   public void method5574(int var1, byte var2) {
      if(var1 >= 0 && var1 < 128) {
         this.readByte(var1, 1258821856);
      } else if(var1 >= 0 && var1 < '\u8000') {
         this.readShort(var1 + '\u8000', (byte)-62);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method5698(int[] var1, int var2) {
      int var3 = this.field3710 / 8;
      this.field3710 = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.method5552(297718403);
         int var6 = this.method5552(297718403);
         int var7 = -957401312;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var5 -= var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3]) {
            var6 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7;
            var7 -= var8;
         }

         this.field3710 -= 8;
         this.method5689(var5, 747474969);
         this.method5689(var6, 747474969);
      }

   }

   /*
   old:
   public void method5595(byte[] var1, int var2, int var3, byte var4) {
      for(int var5 = var3 + var2 - 1; var5 >= var2; --var5) {
         var1[var5] = (byte)(this.field3709[++this.field3710 - 1] - 128);
      }

   }
 */
   public void method5595(byte[] var1, int var2, int var3, byte var4) {
      for(int var5 = var3 + var2 - 1; var5 >= var2; --var5) {
         var1[var5] = (byte)(this.field3709[++this.field3710 - 1] - 128);
      }

   }

   public static String method5764(long var0) {
      if(var0 > 0L && var0 < 6582952005840035281L) {
         if(0L == var0 % 37L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; var3 != 0L; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = class298.field3644[(int)(var6 - 37L * var0)];
               if(var8 == 95) {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   public static class314 method5767(Socket var0, int var1, int var2, byte var3) throws IOException {
      return new class315(var0, var1, var2);
   }
}
