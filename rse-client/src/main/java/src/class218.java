package src;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class class218 {

   int[] field2511;
   byte[] field2509;
   int[] field2510;


   public class218(byte[] var1) {
      int var2 = var1.length;
      this.field2511 = new int[var2];
      this.field2509 = var1;
      int[] var3 = new int[33];
      this.field2510 = new int[8];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         byte var6 = var1[var5];
         if(var6 != 0) {
            int var7 = 1 << 32 - var6;
            int var8 = var3[var6];
            this.field2511[var5] = var8;
            int var9;
            int var10;
            int var11;
            int var12;
            if((var8 & var7) != 0) {
               var9 = var3[var6 - 1];
            } else {
               var9 = var8 | var7;

               for(var10 = var6 - 1; var10 >= 1; --var10) {
                  var11 = var3[var10];
                  if(var11 != var8) {
                     break;
                  }

                  var12 = 1 << 32 - var10;
                  if((var11 & var12) != 0) {
                     var3[var10] = var3[var10 - 1];
                     break;
                  }

                  var3[var10] = var11 | var12;
               }
            }

            var3[var6] = var9;

            for(var10 = var6 + 1; var10 <= 32; ++var10) {
               if(var8 == var3[var10]) {
                  var3[var10] = var9;
               }
            }

            var10 = 0;

            for(var11 = 0; var11 < var6; ++var11) {
               var12 = Integer.MIN_VALUE >>> var11;
               if((var8 & var12) != 0) {
                  if(this.field2510[var10] == 0) {
                     this.field2510[var10] = var4;
                  }

                  var10 = this.field2510[var10];
               } else {
                  ++var10;
               }

               if(var10 >= this.field2510.length) {
                  int[] var13 = new int[this.field2510.length * 2];

                  for(int var14 = 0; var14 < this.field2510.length; ++var14) {
                     var13[var14] = this.field2510[var14];
                  }

                  this.field2510 = var13;
               }

               var12 >>>= 1;
            }

            this.field2510[var10] = ~var5;
            if(var10 >= var4) {
               var4 = var10 + 1;
            }
         }
      }

   }

   int method4017(byte[] var1, int var2, byte[] var3, int var4, int var5, byte var6) {
      if(var5 == 0) {
         return 0;
      } else {
         int var7 = 0;
         var5 += var4;
         int var8 = var2;

         while(true) {
            byte var9 = var1[var8];
            if(var9 < 0) {
               var7 = this.field2510[var7];
            } else {
               ++var7;
            }

            int var10;
            if((var10 = this.field2510[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if((var9 & 64) != 0) {
               var7 = this.field2510[var7];
            } else {
               ++var7;
            }

            if((var10 = this.field2510[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if((var9 & 32) != 0) {
               var7 = this.field2510[var7];
            } else {
               ++var7;
            }

            if((var10 = this.field2510[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if((var9 & 16) != 0) {
               var7 = this.field2510[var7];
            } else {
               ++var7;
            }

            if((var10 = this.field2510[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if((var9 & 8) != 0) {
               var7 = this.field2510[var7];
            } else {
               ++var7;
            }

            if((var10 = this.field2510[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if((var9 & 4) != 0) {
               var7 = this.field2510[var7];
            } else {
               ++var7;
            }

            if((var10 = this.field2510[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if((var9 & 2) != 0) {
               var7 = this.field2510[var7];
            } else {
               ++var7;
            }

            if((var10 = this.field2510[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if((var9 & 1) != 0) {
               var7 = this.field2510[var7];
            } else {
               ++var7;
            }

            if((var10 = this.field2510[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            ++var8;
         }

         return var8 + 1 - var2;
      }
   }

   int method4018(byte[] var1, int var2, int var3, byte[] var4, int var5, byte var6) {
      int var7 = 0;
      int var8 = var5 << 3;

      for(var3 += var2; var2 < var3; ++var2) {
         int var9 = var1[var2] & 255;
         int var10 = this.field2511[var9];
         byte var11 = this.field2509[var9];
         if(var11 == 0) {
            throw new RuntimeException("" + var9);
         }

         int var12 = var8 >> 3;
         int var13 = var8 & 7;
         var7 &= -var13 >> 31;
         int var14 = (var11 + var13 - 1 >> 3) + var12;
         var13 += 24;
         var4[var12] = (byte)(var7 |= var10 >>> var13);
         if(var12 < var14) {
            ++var12;
            var13 -= 8;
            var4[var12] = (byte)(var7 = var10 >>> var13);
            if(var12 < var14) {
               ++var12;
               var13 -= 8;
               var4[var12] = (byte)(var7 = var10 >>> var13);
               if(var12 < var14) {
                  ++var12;
                  var13 -= 8;
                  var4[var12] = (byte)(var7 = var10 >>> var13);
                  if(var12 < var14) {
                     ++var12;
                     var13 -= 8;
                     var4[var12] = (byte)(var7 = var10 << -var13);
                  }
               }
            }
         }

         var8 += var11;
      }

      return (var8 + 7 >> 3) - var5;
   }

   static final void method4019(int var0) {
      client.field761.method2349(955020520);
      class15.method155((byte)23);
      class14.field60.method3194();

      for(int var1 = 0; var1 < 4; ++var1) {
         client.field737[var1].method3618(-1906958459);
      }

      System.gc();
      class206.field2406 = 1;
      class206.field2407 = null;
      class206.field2408 = -1;
      class206.field2413 = -1;
      class219.field2514 = 0;
      class19.field106 = false;
      class93.field1187 = 2;
      client.field914 = -1;
      client.field915 = false;
      class290.method5225(-1904373301);
      class72.method1293(10, -1913611800);
   }

   public static void method4024(int var0) {
      try {
         File var1 = new File(class30.field212, "random.dat");
         int var3;
         if(var1.exists()) {
            class176.field2053 = new class351(new class352(var1, "rw", 25L), 24, 0);
         } else {
            label32:
            for(int var2 = 0; var2 < class331.field3871.length; ++var2) {
               for(var3 = 0; var3 < class221.field2522.length; ++var3) {
                  File var4 = new File(class221.field2522[var3] + class331.field3871[var2] + File.separatorChar + "random.dat");
                  if(var4.exists()) {
                     class176.field2053 = new class351(new class352(var4, "rw", 25L), 24, 0);
                     break label32;
                  }
               }
            }
         }

         if(class176.field2053 == null) {
            RandomAccessFile var5 = new RandomAccessFile(var1, "rw");
            var3 = var5.read();
            var5.seek(0L);
            var5.write(var3);
            var5.seek(0L);
            var5.close();
            class176.field2053 = new class351(new class352(var1, "rw", 25L), 24, 0);
         }
      } catch (IOException var6) {
         ;
      }

   }

   public static void method4027(int var0) {
      class223.field2536.method3413();
   }

   public static int method4025(CharSequence var0, CharSequence var1, class199 var2, int var3) {
      int var4 = var0.length();
      int var5 = var1.length();
      int var6 = 0;
      int var7 = 0;
      byte var8 = 0;
      byte var9 = 0;

      while(var6 - var8 < var4 || var7 - var9 < var5) {
         if(var6 - var8 >= var4) {
            return -1;
         }

         if(var7 - var9 >= var5) {
            return 1;
         }

         char var10;
         if(var8 != 0) {
            var10 = (char)var8;
            boolean var15 = false;
         } else {
            var10 = var0.charAt(var6++);
         }

         char var11;
         if(var9 != 0) {
            var11 = (char)var9;
            boolean var16 = false;
         } else {
            var11 = var1.charAt(var7++);
         }

         byte var12;
         if(var10 == 198) {
            var12 = 69;
         } else if(var10 == 230) {
            var12 = 101;
         } else if(var10 == 223) {
            var12 = 115;
         } else if(var10 == 338) {
            var12 = 69;
         } else if(var10 == 339) {
            var12 = 101;
         } else {
            var12 = 0;
         }

         var8 = var12;
         byte var13;
         if(var11 == 198) {
            var13 = 69;
         } else if(var11 == 230) {
            var13 = 101;
         } else if(var11 == 223) {
            var13 = 115;
         } else if(var11 == 338) {
            var13 = 69;
         } else if(var11 == 339) {
            var13 = 101;
         } else {
            var13 = 0;
         }

         var9 = var13;
         var10 = class146.method3366(var10, var2, (byte)-64);
         var11 = class146.method3366(var11, var2, (byte)-22);
         if(var10 != var11 && Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
            var10 = Character.toLowerCase(var10);
            var11 = Character.toLowerCase(var11);
            if(var10 != var11) {
               return method4026(var10, var2, 473586883) - method4026(var11, var2, 321529665);
            }
         }
      }

      int var17 = Math.min(var4, var5);

      int var18;
      char var21;
      for(var18 = 0; var18 < var17; ++var18) {
         if(var2 == class199.field2367) {
            var6 = var4 - 1 - var18;
            var7 = var5 - 1 - var18;
         } else {
            var7 = var18;
            var6 = var18;
         }

         char var19 = var0.charAt(var6);
         var21 = var1.charAt(var7);
         if(var19 != var21 && Character.toUpperCase(var19) != Character.toUpperCase(var21)) {
            var19 = Character.toLowerCase(var19);
            var21 = Character.toLowerCase(var21);
            if(var19 != var21) {
               return method4026(var19, var2, 1882549296) - method4026(var21, var2, 442391038);
            }
         }
      }

      var18 = var4 - var5;
      if(var18 != 0) {
         return var18;
      } else {
         for(int var20 = 0; var20 < var17; ++var20) {
            var21 = var0.charAt(var20);
            char var14 = var1.charAt(var20);
            if(var21 != var14) {
               return method4026(var21, var2, 1436003807) - method4026(var14, var2, 1782191035);
            }
         }

         return 0;
      }
   }

   static int method4026(char var0, class199 var1, int var2) {
      int var3 = var0 << 4;
      if(Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var3 = (var0 << 4) + 1;
      }

      if(var0 == 241 && var1 == class199.field2362) {
         var3 = 1762;
      }

      return var3;
   }
}
