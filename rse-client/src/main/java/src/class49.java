package src;

public class class49 {

   static int field383;
   byte[][][] field379;
   int field382;


   class49(int var1) {
      this.field382 = var1;
   }

   void method822(int var1) {
      byte[] var2 = new byte[this.field382 * this.field382];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field382; ++var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field379[0][0] = var2;
      var2 = new byte[this.field382 * this.field382];
      var3 = 0;

      for(var4 = this.field382 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field379[0][1] = var2;
      var2 = new byte[this.field382 * this.field382];
      var3 = 0;

      for(var4 = 0; var4 < this.field382; ++var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field379[0][2] = var2;
      var2 = new byte[this.field382 * this.field382];
      var3 = 0;

      for(var4 = this.field382 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field379[0][3] = var2;
   }

   int method819(int var1, int var2, int var3) {
      if(var2 == 9) {
         var1 = var1 + 1 & 3;
      }

      if(var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if(var2 == 11) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   void method823(int var1) {
      byte[] var2 = new byte[this.field382 * this.field382];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field382 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field379[1][0] = var2;
      var2 = new byte[this.field382 * this.field382];
      var3 = 0;

      for(var4 = 0; var4 < this.field382; ++var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var3 >= 0 && var3 < var2.length) {
               if(var5 >= var4 << 1) {
                  var2[var3] = -1;
               }

               ++var3;
            } else {
               ++var3;
            }
         }
      }

      this.field379[1][1] = var2;
      var2 = new byte[this.field382 * this.field382];
      var3 = 0;

      for(var4 = 0; var4 < this.field382; ++var4) {
         for(var5 = this.field382 - 1; var5 >= 0; --var5) {
            if(var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field379[1][2] = var2;
      var2 = new byte[this.field382 * this.field382];
      var3 = 0;

      for(var4 = this.field382 - 1; var4 >= 0; --var4) {
         for(var5 = this.field382 - 1; var5 >= 0; --var5) {
            if(var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field379[1][3] = var2;
   }

   int method837(int var1, byte var2) {
      return var1 != 9 && var1 != 10?(var1 == 11?8:var1):1;
   }

   void method824(int var1) {
      byte[] var2 = new byte[this.field382 * this.field382];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field382 - 1; var4 >= 0; --var4) {
         for(var5 = this.field382 - 1; var5 >= 0; --var5) {
            if(var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field379[2][0] = var2;
      var2 = new byte[this.field382 * this.field382];
      var3 = 0;

      for(var4 = this.field382 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field379[2][1] = var2;
      var2 = new byte[this.field382 * this.field382];
      var3 = 0;

      for(var4 = 0; var4 < this.field382; ++var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field379[2][2] = var2;
      var2 = new byte[this.field382 * this.field382];
      var3 = 0;

      for(var4 = 0; var4 < this.field382; ++var4) {
         for(var5 = this.field382 - 1; var5 >= 0; --var5) {
            if(var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field379[2][3] = var2;
   }

   void method817(int var1) {
      byte[] var2 = new byte[this.field382 * this.field382];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field382 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field379[3][0] = var2;
      var2 = new byte[this.field382 * this.field382];
      var3 = 0;

      for(var4 = 0; var4 < this.field382; ++var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field379[3][1] = var2;
      var2 = new byte[this.field382 * this.field382];
      var3 = 0;

      for(var4 = 0; var4 < this.field382; ++var4) {
         for(var5 = this.field382 - 1; var5 >= 0; --var5) {
            if(var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field379[3][2] = var2;
      var2 = new byte[this.field382 * this.field382];
      var3 = 0;

      for(var4 = this.field382 - 1; var4 >= 0; --var4) {
         for(var5 = this.field382 - 1; var5 >= 0; --var5) {
            if(var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field379[3][3] = var2;
   }

   void method826(byte var1) {
      byte[] var2 = new byte[this.field382 * this.field382];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field382 - 1; var4 >= 0; --var4) {
         for(var5 = this.field382 - 1; var5 >= 0; --var5) {
            if(var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field379[4][0] = var2;
      var2 = new byte[this.field382 * this.field382];
      var3 = 0;

      for(var4 = this.field382 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field379[4][1] = var2;
      var2 = new byte[this.field382 * this.field382];
      var3 = 0;

      for(var4 = 0; var4 < this.field382; ++var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field379[4][2] = var2;
      var2 = new byte[this.field382 * this.field382];
      var3 = 0;

      for(var4 = 0; var4 < this.field382; ++var4) {
         for(var5 = this.field382 - 1; var5 >= 0; --var5) {
            if(var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field379[4][3] = var2;
   }

   void method860(byte var1) {
      byte[] var2 = new byte[this.field382 * this.field382];
      boolean var3 = false;
      var2 = new byte[this.field382 * this.field382];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field382; ++var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var5 <= this.field382 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field379[5][0] = var2;
      var2 = new byte[this.field382 * this.field382];
      var6 = 0;

      for(var4 = 0; var4 < this.field382; ++var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var4 <= this.field382 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field379[5][1] = var2;
      var2 = new byte[this.field382 * this.field382];
      var6 = 0;

      for(var4 = 0; var4 < this.field382; ++var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var5 >= this.field382 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field379[5][2] = var2;
      var2 = new byte[this.field382 * this.field382];
      var6 = 0;

      for(var4 = 0; var4 < this.field382; ++var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var4 >= this.field382 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field379[5][3] = var2;
   }

   void method828(byte var1) {
      byte[] var2 = new byte[this.field382 * this.field382];
      boolean var3 = false;
      var2 = new byte[this.field382 * this.field382];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field382; ++var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var5 <= var4 - this.field382 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field379[6][0] = var2;
      var2 = new byte[this.field382 * this.field382];
      var6 = 0;

      for(var4 = this.field382 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var5 <= var4 - this.field382 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field379[6][1] = var2;
      var2 = new byte[this.field382 * this.field382];
      var6 = 0;

      for(var4 = this.field382 - 1; var4 >= 0; --var4) {
         for(var5 = this.field382 - 1; var5 >= 0; --var5) {
            if(var5 <= var4 - this.field382 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field379[6][2] = var2;
      var2 = new byte[this.field382 * this.field382];
      var6 = 0;

      for(var4 = 0; var4 < this.field382; ++var4) {
         for(var5 = this.field382 - 1; var5 >= 0; --var5) {
            if(var5 <= var4 - this.field382 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field379[6][3] = var2;
   }

   void method829(int var1) {
      byte[] var2 = new byte[this.field382 * this.field382];
      boolean var3 = false;
      var2 = new byte[this.field382 * this.field382];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field382; ++var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var5 >= var4 - this.field382 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field379[7][0] = var2;
      var2 = new byte[this.field382 * this.field382];
      var6 = 0;

      for(var4 = this.field382 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field382; ++var5) {
            if(var5 >= var4 - this.field382 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field379[7][1] = var2;
      var2 = new byte[this.field382 * this.field382];
      var6 = 0;

      for(var4 = this.field382 - 1; var4 >= 0; --var4) {
         for(var5 = this.field382 - 1; var5 >= 0; --var5) {
            if(var5 >= var4 - this.field382 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field379[7][2] = var2;
      var2 = new byte[this.field382 * this.field382];
      var6 = 0;

      for(var4 = 0; var4 < this.field382; ++var4) {
         for(var5 = this.field382 - 1; var5 >= 0; --var5) {
            if(var5 >= var4 - this.field382 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field379[7][3] = var2;
   }

   void method821(byte var1) {
      if(this.field379 == null) {
         this.field379 = new byte[8][4][];
         this.method822(1433352887);
         this.method823(-1487501517);
         this.method824(-611900971);
         this.method817(-1800334374);
         this.method826((byte)107);
         this.method860((byte)-68);
         this.method828((byte)44);
         this.method829(1415108138);
      }
   }

   void method818(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9) {
      if(var7 != 0 && this.field382 != 0 && this.field379 != null) {
         var8 = this.method819(var8, var7, -108715988);
         var7 = this.method837(var7, (byte)-51);
         class330.method6054(var1, var2, var5, var6, var3, var4, this.field379[var7 - 1][var8], this.field382, true);
      }
   }

   static final void method848(int var0, int var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < client.field883; ++var5) {
         if(client.field733[var5] + client.field950[var5] > var0 && client.field950[var5] < var0 + var2 && client.field939[var5] + client.field736[var5] > var1 && client.field939[var5] < var3 + var1) {
            client.field886[var5] = true;
         }
      }

   }
}
