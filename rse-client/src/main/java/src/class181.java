package src;

public class class181 {

   int field2087;
   public int field2085 = 0;
   public int[][] field2092;
   int field2084;
   public int field2086 = 0;


   public class181(int var1, int var2) {
      this.field2087 = var1;
      this.field2084 = var2;
      this.field2092 = new int[this.field2087][this.field2084];
      this.method3618(-341280098);
   }

   void method3619(int var1, int var2, int var3, byte var4) {
      this.field2092[var1][var2] &= ~var3;
   }

   void method3616(int var1, int var2, int var3, int var4) {
      this.field2092[var1][var2] |= var3;
   }

   public void method3618(int var1) {
      for(int var2 = 0; var2 < this.field2087; ++var2) {
         for(int var3 = 0; var3 < this.field2084; ++var3) {
            if(var2 != 0 && var3 != 0 && var2 < this.field2087 - 5 && var3 < this.field2084 - 5) {
               this.field2092[var2][var3] = 16777216;
            } else {
               this.field2092[var2][var3] = 16777215;
            }
         }
      }

   }

   public void method3617(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      var1 -= this.field2085;
      var2 -= this.field2086;
      if(var3 == 0) {
         if(var4 == 0) {
            this.method3619(var1, var2, 128, (byte)61);
            this.method3619(var1 - 1, var2, 8, (byte)49);
         }

         if(var4 == 1) {
            this.method3619(var1, var2, 2, (byte)36);
            this.method3619(var1, var2 + 1, 32, (byte)-48);
         }

         if(var4 == 2) {
            this.method3619(var1, var2, 8, (byte)14);
            this.method3619(var1 + 1, var2, 128, (byte)53);
         }

         if(var4 == 3) {
            this.method3619(var1, var2, 32, (byte)-34);
            this.method3619(var1, var2 - 1, 2, (byte)106);
         }
      }

      if(var3 == 1 || var3 == 3) {
         if(var4 == 0) {
            this.method3619(var1, var2, 1, (byte)9);
            this.method3619(var1 - 1, var2 + 1, 16, (byte)-4);
         }

         if(var4 == 1) {
            this.method3619(var1, var2, 4, (byte)49);
            this.method3619(var1 + 1, var2 + 1, 64, (byte)-16);
         }

         if(var4 == 2) {
            this.method3619(var1, var2, 16, (byte)-44);
            this.method3619(var1 + 1, var2 - 1, 1, (byte)45);
         }

         if(var4 == 3) {
            this.method3619(var1, var2, 64, (byte)-49);
            this.method3619(var1 - 1, var2 - 1, 4, (byte)-21);
         }
      }

      if(var3 == 2) {
         if(var4 == 0) {
            this.method3619(var1, var2, 130, (byte)-109);
            this.method3619(var1 - 1, var2, 8, (byte)-8);
            this.method3619(var1, var2 + 1, 32, (byte)28);
         }

         if(var4 == 1) {
            this.method3619(var1, var2, 10, (byte)94);
            this.method3619(var1, var2 + 1, 32, (byte)13);
            this.method3619(var1 + 1, var2, 128, (byte)17);
         }

         if(var4 == 2) {
            this.method3619(var1, var2, 40, (byte)95);
            this.method3619(var1 + 1, var2, 128, (byte)-15);
            this.method3619(var1, var2 - 1, 2, (byte)26);
         }

         if(var4 == 3) {
            this.method3619(var1, var2, 160, (byte)-34);
            this.method3619(var1, var2 - 1, 2, (byte)82);
            this.method3619(var1 - 1, var2, 8, (byte)-11);
         }
      }

      if(var5) {
         if(var3 == 0) {
            if(var4 == 0) {
               this.method3619(var1, var2, 65536, (byte)-19);
               this.method3619(var1 - 1, var2, 4096, (byte)36);
            }

            if(var4 == 1) {
               this.method3619(var1, var2, 1024, (byte)-43);
               this.method3619(var1, var2 + 1, 16384, (byte)-78);
            }

            if(var4 == 2) {
               this.method3619(var1, var2, 4096, (byte)-9);
               this.method3619(var1 + 1, var2, 65536, (byte)-75);
            }

            if(var4 == 3) {
               this.method3619(var1, var2, 16384, (byte)9);
               this.method3619(var1, var2 - 1, 1024, (byte)-31);
            }
         }

         if(var3 == 1 || var3 == 3) {
            if(var4 == 0) {
               this.method3619(var1, var2, 512, (byte)55);
               this.method3619(var1 - 1, var2 + 1, 8192, (byte)-87);
            }

            if(var4 == 1) {
               this.method3619(var1, var2, 2048, (byte)27);
               this.method3619(var1 + 1, var2 + 1, '\u8000', (byte)-37);
            }

            if(var4 == 2) {
               this.method3619(var1, var2, 8192, (byte)0);
               this.method3619(var1 + 1, var2 - 1, 512, (byte)70);
            }

            if(var4 == 3) {
               this.method3619(var1, var2, '\u8000', (byte)-18);
               this.method3619(var1 - 1, var2 - 1, 2048, (byte)29);
            }
         }

         if(var3 == 2) {
            if(var4 == 0) {
               this.method3619(var1, var2, 66560, (byte)-14);
               this.method3619(var1 - 1, var2, 4096, (byte)13);
               this.method3619(var1, var2 + 1, 16384, (byte)-52);
            }

            if(var4 == 1) {
               this.method3619(var1, var2, 5120, (byte)36);
               this.method3619(var1, var2 + 1, 16384, (byte)83);
               this.method3619(var1 + 1, var2, 65536, (byte)-29);
            }

            if(var4 == 2) {
               this.method3619(var1, var2, 20480, (byte)110);
               this.method3619(var1 + 1, var2, 65536, (byte)-74);
               this.method3619(var1, var2 - 1, 1024, (byte)-30);
            }

            if(var4 == 3) {
               this.method3619(var1, var2, 81920, (byte)22);
               this.method3619(var1, var2 - 1, 1024, (byte)-17);
               this.method3619(var1 - 1, var2, 4096, (byte)21);
            }
         }
      }

   }

   public void method3637(int var1, int var2, byte var3) {
      var1 -= this.field2085;
      var2 -= this.field2086;
      this.field2092[var1][var2] &= -262145;
   }

   public void method3635(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      int var8 = 256;
      if(var6) {
         var8 += 131072;
      }

      var1 -= this.field2085;
      var2 -= this.field2086;
      int var9;
      if(var5 == 1 || var5 == 3) {
         var9 = var3;
         var3 = var4;
         var4 = var9;
      }

      for(var9 = var1; var9 < var3 + var1; ++var9) {
         if(var9 >= 0 && var9 < this.field2087) {
            for(int var10 = var2; var10 < var2 + var4; ++var10) {
               if(var10 >= 0 && var10 < this.field2084) {
                  this.method3619(var9, var10, var8, (byte)49);
               }
            }
         }
      }

   }

   public void method3615(int var1, int var2, int var3) {
      var1 -= this.field2085;
      var2 -= this.field2086;
      this.field2092[var1][var2] |= 262144;
   }

   public void method3613(int var1, int var2, int var3, int var4, boolean var5, byte var6) {
      int var7 = 256;
      if(var5) {
         var7 += 131072;
      }

      var1 -= this.field2085;
      var2 -= this.field2086;

      for(int var8 = var1; var8 < var3 + var1; ++var8) {
         if(var8 >= 0 && var8 < this.field2087) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if(var9 >= 0 && var9 < this.field2084) {
                  this.method3616(var8, var9, var7, 2136101912);
               }
            }
         }
      }

   }

   public void method3614(int var1, int var2, int var3) {
      var1 -= this.field2085;
      var2 -= this.field2086;
      this.field2092[var1][var2] |= 2097152;
   }

   public void method3612(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      var1 -= this.field2085;
      var2 -= this.field2086;
      if(var3 == 0) {
         if(var4 == 0) {
            this.method3616(var1, var2, 128, 2136101912);
            this.method3616(var1 - 1, var2, 8, 2136101912);
         }

         if(var4 == 1) {
            this.method3616(var1, var2, 2, 2136101912);
            this.method3616(var1, var2 + 1, 32, 2136101912);
         }

         if(var4 == 2) {
            this.method3616(var1, var2, 8, 2136101912);
            this.method3616(var1 + 1, var2, 128, 2136101912);
         }

         if(var4 == 3) {
            this.method3616(var1, var2, 32, 2136101912);
            this.method3616(var1, var2 - 1, 2, 2136101912);
         }
      }

      if(var3 == 1 || var3 == 3) {
         if(var4 == 0) {
            this.method3616(var1, var2, 1, 2136101912);
            this.method3616(var1 - 1, var2 + 1, 16, 2136101912);
         }

         if(var4 == 1) {
            this.method3616(var1, var2, 4, 2136101912);
            this.method3616(var1 + 1, var2 + 1, 64, 2136101912);
         }

         if(var4 == 2) {
            this.method3616(var1, var2, 16, 2136101912);
            this.method3616(var1 + 1, var2 - 1, 1, 2136101912);
         }

         if(var4 == 3) {
            this.method3616(var1, var2, 64, 2136101912);
            this.method3616(var1 - 1, var2 - 1, 4, 2136101912);
         }
      }

      if(var3 == 2) {
         if(var4 == 0) {
            this.method3616(var1, var2, 130, 2136101912);
            this.method3616(var1 - 1, var2, 8, 2136101912);
            this.method3616(var1, var2 + 1, 32, 2136101912);
         }

         if(var4 == 1) {
            this.method3616(var1, var2, 10, 2136101912);
            this.method3616(var1, var2 + 1, 32, 2136101912);
            this.method3616(var1 + 1, var2, 128, 2136101912);
         }

         if(var4 == 2) {
            this.method3616(var1, var2, 40, 2136101912);
            this.method3616(var1 + 1, var2, 128, 2136101912);
            this.method3616(var1, var2 - 1, 2, 2136101912);
         }

         if(var4 == 3) {
            this.method3616(var1, var2, 160, 2136101912);
            this.method3616(var1, var2 - 1, 2, 2136101912);
            this.method3616(var1 - 1, var2, 8, 2136101912);
         }
      }

      if(var5) {
         if(var3 == 0) {
            if(var4 == 0) {
               this.method3616(var1, var2, 65536, 2136101912);
               this.method3616(var1 - 1, var2, 4096, 2136101912);
            }

            if(var4 == 1) {
               this.method3616(var1, var2, 1024, 2136101912);
               this.method3616(var1, var2 + 1, 16384, 2136101912);
            }

            if(var4 == 2) {
               this.method3616(var1, var2, 4096, 2136101912);
               this.method3616(var1 + 1, var2, 65536, 2136101912);
            }

            if(var4 == 3) {
               this.method3616(var1, var2, 16384, 2136101912);
               this.method3616(var1, var2 - 1, 1024, 2136101912);
            }
         }

         if(var3 == 1 || var3 == 3) {
            if(var4 == 0) {
               this.method3616(var1, var2, 512, 2136101912);
               this.method3616(var1 - 1, var2 + 1, 8192, 2136101912);
            }

            if(var4 == 1) {
               this.method3616(var1, var2, 2048, 2136101912);
               this.method3616(var1 + 1, var2 + 1, '\u8000', 2136101912);
            }

            if(var4 == 2) {
               this.method3616(var1, var2, 8192, 2136101912);
               this.method3616(var1 + 1, var2 - 1, 512, 2136101912);
            }

            if(var4 == 3) {
               this.method3616(var1, var2, '\u8000', 2136101912);
               this.method3616(var1 - 1, var2 - 1, 2048, 2136101912);
            }
         }

         if(var3 == 2) {
            if(var4 == 0) {
               this.method3616(var1, var2, 66560, 2136101912);
               this.method3616(var1 - 1, var2, 4096, 2136101912);
               this.method3616(var1, var2 + 1, 16384, 2136101912);
            }

            if(var4 == 1) {
               this.method3616(var1, var2, 5120, 2136101912);
               this.method3616(var1, var2 + 1, 16384, 2136101912);
               this.method3616(var1 + 1, var2, 65536, 2136101912);
            }

            if(var4 == 2) {
               this.method3616(var1, var2, 20480, 2136101912);
               this.method3616(var1 + 1, var2, 65536, 2136101912);
               this.method3616(var1, var2 - 1, 1024, 2136101912);
            }

            if(var4 == 3) {
               this.method3616(var1, var2, 81920, 2136101912);
               this.method3616(var1, var2 - 1, 1024, 2136101912);
               this.method3616(var1 - 1, var2, 4096, 2136101912);
            }
         }
      }

   }
}
