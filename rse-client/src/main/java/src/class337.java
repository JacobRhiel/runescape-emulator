package src;

public final class class337 {

   int field3916;
   int field3915;
   int field3914;
   int[] field3913 = new int[256];
   int[] field3909 = new int[256];
   int field3912;


   public class337(int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.field3909[var2] = var1[var2];
      }

      this.method6326(2132925629);
   }

   final void method6328(int var1) {
      this.field3916 += ++this.field3914;

      for(int var2 = 0; var2 < 256; ++var2) {
         int var3 = this.field3913[var2];
         if((var2 & 2) == 0) {
            if((var2 & 1) == 0) {
               this.field3912 ^= this.field3912 << 13;
            } else {
               this.field3912 ^= this.field3912 >>> 6;
            }
         } else if((var2 & 1) == 0) {
            this.field3912 ^= this.field3912 << 2;
         } else {
            this.field3912 ^= this.field3912 >>> 16;
         }

         this.field3912 += this.field3913[var2 + 128 & 255];
         int var4;
         this.field3913[var2] = var4 = this.field3913[(var3 & 1020) >> 2] + this.field3912 + this.field3916;
         this.field3909[var2] = this.field3916 = this.field3913[(var4 >> 8 & 1020) >> 2] + var3;
      }

   }

   public final int method6327(int var1) {
      if(this.field3915 == 0) {
         this.method6328(1716731154);
         this.field3915 = 256;
      }

      return this.field3909[this.field3915 - 1];
   }

   final void method6326(int var1) {
      int var10 = -1640531527;
      int var9 = -1640531527;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;

      int var2;
      for(var2 = 0; var2 < 4; ++var2) {
         var3 ^= var4 << 11;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 << 8;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 >>> 16;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 << 10;
         var10 += var7;
         var8 += var9;
         var8 ^= var9 >>> 4;
         var3 += var8;
         var9 += var10;
         var9 ^= var10 << 8;
         var4 += var9;
         var10 += var3;
         var10 ^= var3 >>> 9;
         var5 += var10;
         var3 += var4;
      }

      for(var2 = 0; var2 < 256; var2 += 8) {
         var3 += this.field3909[var2];
         var4 += this.field3909[var2 + 1];
         var5 += this.field3909[var2 + 2];
         var6 += this.field3909[var2 + 3];
         var7 += this.field3909[var2 + 4];
         var8 += this.field3909[var2 + 5];
         var9 += this.field3909[var2 + 6];
         var10 += this.field3909[var2 + 7];
         var3 ^= var4 << 11;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 << 8;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 >>> 16;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 << 10;
         var10 += var7;
         var8 += var9;
         var8 ^= var9 >>> 4;
         var3 += var8;
         var9 += var10;
         var9 ^= var10 << 8;
         var4 += var9;
         var10 += var3;
         var10 ^= var3 >>> 9;
         var5 += var10;
         var3 += var4;
         this.field3913[var2] = var3;
         this.field3913[var2 + 1] = var4;
         this.field3913[var2 + 2] = var5;
         this.field3913[var2 + 3] = var6;
         this.field3913[var2 + 4] = var7;
         this.field3913[var2 + 5] = var8;
         this.field3913[var2 + 6] = var9;
         this.field3913[var2 + 7] = var10;
      }

      for(var2 = 0; var2 < 256; var2 += 8) {
         var3 += this.field3913[var2];
         var4 += this.field3913[var2 + 1];
         var5 += this.field3913[var2 + 2];
         var6 += this.field3913[var2 + 3];
         var7 += this.field3913[var2 + 4];
         var8 += this.field3913[var2 + 5];
         var9 += this.field3913[var2 + 6];
         var10 += this.field3913[var2 + 7];
         var3 ^= var4 << 11;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 << 8;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 >>> 16;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 << 10;
         var10 += var7;
         var8 += var9;
         var8 ^= var9 >>> 4;
         var3 += var8;
         var9 += var10;
         var9 ^= var10 << 8;
         var4 += var9;
         var10 += var3;
         var10 ^= var3 >>> 9;
         var5 += var10;
         var3 += var4;
         this.field3913[var2] = var3;
         this.field3913[var2 + 1] = var4;
         this.field3913[var2 + 2] = var5;
         this.field3913[var2 + 3] = var6;
         this.field3913[var2 + 4] = var7;
         this.field3913[var2 + 5] = var8;
         this.field3913[var2 + 6] = var9;
         this.field3913[var2 + 7] = var10;
      }

      this.method6328(1562843782);
      this.field3915 = 256;
   }

   public final int method6325(int var1) {
      if(this.field3915 == 0) {
         this.method6328(-1611356921);
         this.field3915 = 256;
      }

      return this.field3909[--this.field3915];
   }

   public static long method6337(int var0, int var1, int var2, boolean var3, int var4, int var5) {
      long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if(var3) {
         var6 |= 65536L;
      }

      return var6;
   }
}
