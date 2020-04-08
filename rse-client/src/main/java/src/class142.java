package src;

public class class142 {

   public static boolean field1847 = true;
   static boolean field1876 = false;
   static int[] field1810 = new int[4];
   static int field1853 = 0;
   static int field1833;
   static class271 field1855 = new class271();
   static int field1825 = 0;
   static int field1813 = 4;
   static int field1824 = 0;
   static class149[] field1854 = new class149[500];
   public static int field1845 = -1;
   static int field1874;
   static class149[][] field1852 = new class149[field1813][500];
   static boolean field1841 = false;
   static int field1850;
   static class151[] field1867 = new class151[100];
   static int field1863 = 0;
   static int field1834;
   static int field1843 = 0;
   static int field1836;
   static int field1844 = 0;
   static int field1831;
   static int field1837;
   public static int field1846 = -1;
   static int field1832;
   static int field1838;
   static int field1827;
   static int field1839;
   static boolean[][][][] field1869 = new boolean[8][32][51][51];
   static int field1828;
   static int field1829;
   static int field1860;
   static boolean[][] field1835;
   static final int[] field1856 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   static final int[] field1870 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
   static final int[] field1858 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
   static final int[] field1820 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
   static final int[] field1842 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
   static final int[] field1814 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
   static final int[] field1861 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
   static int field1873;
   static int field1840;
   static int field1821;
   static int field1830;
   static int field1871;
   static int field1872;
   int field1857 = 0;
   int field1817 = 0;
   int[][][] field1819;
   int field1826;
   int field1811;
   class135[][][] field1815;
   class151[] field1849 = new class151[5000];
   int field1862;
   int[][][] field1812;
   int[][] field1866 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   int[][] field1818 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};


   public class142(int var1, int var2, int var3, int[][][] var4) {
      this.field1811 = var1;
      this.field1826 = var2;
      this.field1862 = var3;
      this.field1815 = new class135[var1][var2][var3];
      this.field1819 = new int[var1][var2 + 1][var3 + 1];
      this.field1812 = var4;
      this.method3194();
   }

   boolean method3163(int var1, int var2, int var3) {
      int var4 = this.field1819[var1][var2][var3];
      if(var4 == -field1850) {
         return false;
      } else if(var4 == field1850) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if(this.method3214(var5 + 1, this.field1812[var1][var2][var3], var6 + 1) && this.method3214(var5 + 128 - 1, this.field1812[var1][var2 + 1][var3], var6 + 1) && this.method3214(var5 + 128 - 1, this.field1812[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method3214(var5 + 1, this.field1812[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field1819[var1][var2][var3] = field1850;
            return true;
         } else {
            this.field1819[var1][var2][var3] = -field1850;
            return false;
         }
      }
   }

   boolean method3181(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class144 var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if(var15 < 0 || var16 < 0 || var15 >= this.field1826 || var16 >= this.field1862) {
               return false;
            }

            class135 var17 = this.field1815[var1][var15][var16];
            if(var17 != null && var17.field1664 >= 5) {
               return false;
            }
         }
      }

      class151 var21 = new class151();
      var21.field1956 = var12;
      var21.field1953 = var14;
      var21.field1943 = var1;
      var21.field1942 = var6;
      var21.field1948 = var7;
      var21.field1941 = var8;
      var21.field1944 = var9;
      var21.field1952 = var10;
      var21.field1946 = var2;
      var21.field1940 = var3;
      var21.field1947 = var2 + var4 - 1;
      var21.field1945 = var3 + var5 - 1;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var22 = var3; var22 < var3 + var5; ++var22) {
            int var18 = 0;
            if(var16 > var2) {
               ++var18;
            }

            if(var16 < var2 + var4 - 1) {
               var18 += 4;
            }

            if(var22 > var3) {
               var18 += 8;
            }

            if(var22 < var3 + var5 - 1) {
               var18 += 2;
            }

            for(int var19 = var1; var19 >= 0; --var19) {
               if(this.field1815[var19][var16][var22] == null) {
                  this.field1815[var19][var16][var22] = new class135(var19, var16, var22);
               }
            }

            class135 var23 = this.field1815[var1][var16][var22];
            var23.field1673[var23.field1664] = var21;
            var23.field1671[var23.field1664] = var18;
            var23.field1672 |= var18;
            ++var23.field1664;
         }
      }

      if(var11) {
         this.field1849[this.field1817++] = var21;
      }

      return true;
   }

   void method3178(class151 var1) {
      for(int var2 = var1.field1946; var2 <= var1.field1947; ++var2) {
         for(int var3 = var1.field1940; var3 <= var1.field1945; ++var3) {
            class135 var4 = this.field1815[var1.field1943][var2][var3];
            if(var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.field1664; ++var5) {
                  if(var4.field1673[var5] == var1) {
                     --var4.field1664;

                     for(int var6 = var5; var6 < var4.field1664; ++var6) {
                        var4.field1673[var6] = var4.field1673[var6 + 1];
                        var4.field1671[var6] = var4.field1671[var6 + 1];
                     }

                     var4.field1673[var4.field1664] = null;
                     break;
                  }
               }

               var4.field1672 = 0;

               for(var5 = 0; var5 < var4.field1664; ++var5) {
                  var4.field1672 |= var4.field1671[var5];
               }
            }
         }
      }

   }

   public void method3199(int var1, int var2, int var3, boolean var4) {
      if(!method3201() || var4) {
         field1841 = true;
         field1876 = var4;
         field1863 = var1;
         field1843 = var2;
         field1844 = var3;
         field1845 = -1;
         field1846 = -1;
      }
   }

   boolean method3214(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < field1853; ++var4) {
         class149 var5 = field1854[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if(var5.field1916 == 1) {
            var6 = var5.field1910 - var1;
            if(var6 > 0) {
               var7 = (var6 * var5.field1920 >> 8) + var5.field1905;
               var8 = (var6 * var5.field1908 >> 8) + var5.field1913;
               var9 = (var6 * var5.field1921 >> 8) + var5.field1915;
               var10 = (var6 * var5.field1922 >> 8) + var5.field1918;
               if(var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field1916 == 2) {
            var6 = var1 - var5.field1910;
            if(var6 > 0) {
               var7 = (var6 * var5.field1920 >> 8) + var5.field1905;
               var8 = (var6 * var5.field1908 >> 8) + var5.field1913;
               var9 = (var6 * var5.field1921 >> 8) + var5.field1915;
               var10 = (var6 * var5.field1922 >> 8) + var5.field1918;
               if(var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field1916 == 3) {
            var6 = var5.field1905 - var3;
            if(var6 > 0) {
               var7 = (var6 * var5.field1917 >> 8) + var5.field1910;
               var8 = (var6 * var5.field1914 >> 8) + var5.field1919;
               var9 = (var6 * var5.field1921 >> 8) + var5.field1915;
               var10 = (var6 * var5.field1922 >> 8) + var5.field1918;
               if(var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field1916 == 4) {
            var6 = var3 - var5.field1905;
            if(var6 > 0) {
               var7 = (var6 * var5.field1917 >> 8) + var5.field1910;
               var8 = (var6 * var5.field1914 >> 8) + var5.field1919;
               var9 = (var6 * var5.field1921 >> 8) + var5.field1915;
               var10 = (var6 * var5.field1922 >> 8) + var5.field1918;
               if(var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field1916 == 5) {
            var6 = var2 - var5.field1915;
            if(var6 > 0) {
               var7 = (var6 * var5.field1917 >> 8) + var5.field1910;
               var8 = (var6 * var5.field1914 >> 8) + var5.field1919;
               var9 = (var6 * var5.field1920 >> 8) + var5.field1905;
               var10 = (var6 * var5.field1908 >> 8) + var5.field1913;
               if(var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   void method3195(class130 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if(var12 != this.field1811) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if(var13 >= 0 && var13 < this.field1826) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if(var14 >= 0 && var14 < this.field1862 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
                        class135 var15 = this.field1815[var12][var13][var14];
                        if(var15 != null) {
                           int var16 = (this.field1812[var12][var13 + 1][var14] + this.field1812[var12][var13 + 1][var14 + 1] + this.field1812[var12][var13][var14] + this.field1812[var12][var13][var14 + 1]) / 4 - (this.field1812[var2][var3 + 1][var4] + this.field1812[var2][var3][var4] + this.field1812[var2][var3 + 1][var4 + 1] + this.field1812[var2][var3][var4 + 1]) / 4;
                           class145 var17 = var15.field1665;
                           if(var17 != null) {
                              class130 var18;
                              if(var17.field1888 instanceof class130) {
                                 var18 = (class130)var17.field1888;
                                 class130.method2876(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if(var17.field1890 instanceof class130) {
                                 var18 = (class130)var17.field1890;
                                 class130.method2876(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.field1664; ++var23) {
                              class151 var19 = var15.field1673[var23];
                              if(var19 != null && var19.field1944 instanceof class130) {
                                 class130 var20 = (class130)var19.field1944;
                                 int var21 = var19.field1947 - var19.field1946 + 1;
                                 int var22 = var19.field1945 - var19.field1940 + 1;
                                 class130.method2876(var1, var20, (var21 - var5) * 64 + (var19.field1946 - var3) * 128, var16, (var19.field1940 - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   boolean method3289(int var1, int var2, int var3, int var4) {
      if(!this.method3163(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.field1812[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if(var4 < 16) {
            if(var4 == 1) {
               if(var5 > field1833) {
                  if(!this.method3214(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method3214(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method3214(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method3214(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method3214(var5, var9, var6)) {
                  return false;
               }

               if(!this.method3214(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 2) {
               if(var6 < field1874) {
                  if(!this.method3214(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if(!this.method3214(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method3214(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if(!this.method3214(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method3214(var5, var9, var6 + 128)) {
                  return false;
               }

               if(!this.method3214(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 4) {
               if(var5 < field1833) {
                  if(!this.method3214(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if(!this.method3214(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method3214(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if(!this.method3214(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method3214(var5 + 128, var9, var6)) {
                  return false;
               }

               if(!this.method3214(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 8) {
               if(var6 > field1874) {
                  if(!this.method3214(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method3214(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method3214(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method3214(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if(!this.method3214(var5, var9, var6)) {
                  return false;
               }

               if(!this.method3214(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         return !this.method3214(var5 + 64, var10, var6 + 64)?false:(var4 == 16?this.method3214(var5, var9, var6 + 128):(var4 == 32?this.method3214(var5 + 128, var9, var6 + 128):(var4 == 64?this.method3214(var5 + 128, var9, var6):(var4 == 128?this.method3214(var5, var9, var6):true))));
      }
   }

   void method3205(class140 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - field1833;
      int var11;
      int var12 = var11 = (var8 << 7) - field1874;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.field1812[var2][var7][var8] - field1834;
      int var18 = this.field1812[var2][var7 + 1][var8] - field1834;
      int var19 = this.field1812[var2][var7 + 1][var8 + 1] - field1834;
      int var20 = this.field1812[var2][var7][var8 + 1] - field1834;
      int var21 = var10 * var6 + var5 * var12 >> 16;
      var12 = var12 * var6 - var5 * var10 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var3 * var12 >> 16;
      var12 = var3 * var17 + var12 * var4 >> 16;
      var17 = var21;
      if(var12 >= 50) {
         var21 = var14 * var6 + var5 * var11 >> 16;
         var11 = var11 * var6 - var5 * var14 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var3 * var11 >> 16;
         var11 = var3 * var18 + var11 * var4 >> 16;
         var18 = var21;
         if(var11 >= 50) {
            var21 = var13 * var6 + var5 * var16 >> 16;
            var16 = var16 * var6 - var5 * var13 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var3 * var16 >> 16;
            var16 = var3 * var19 + var16 * var4 >> 16;
            var19 = var21;
            if(var16 >= 50) {
               var21 = var9 * var6 + var5 * var15 >> 16;
               var15 = var15 * var6 - var5 * var9 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var3 * var15 >> 16;
               var15 = var3 * var20 + var15 * var4 >> 16;
               if(var15 >= 50) {
                  int var22 = var10 * class139.field1780 / var12 + class139.field1775;
                  int var23 = var17 * class139.field1780 / var12 + class139.field1788;
                  int var24 = var14 * class139.field1780 / var11 + class139.field1775;
                  int var25 = var18 * class139.field1780 / var11 + class139.field1788;
                  int var26 = var13 * class139.field1780 / var16 + class139.field1775;
                  int var27 = var19 * class139.field1780 / var16 + class139.field1788;
                  int var28 = var9 * class139.field1780 / var15 + class139.field1775;
                  int var29 = var21 * class139.field1780 / var15 + class139.field1788;
                  class139.field1789 = 0;
                  int var30;
                  if((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     class139.field1778 = false;
                     if(var26 < 0 || var28 < 0 || var24 < 0 || var26 > class139.field1783 || var28 > class139.field1783 || var24 > class139.field1783) {
                        class139.field1778 = true;
                     }

                     if(field1841 && method3208(field1843, field1844, var27, var29, var25, var26, var28, var24)) {
                        field1845 = var7;
                        field1846 = var8;
                     }

                     if(var1.field1798 == -1) {
                        if(var1.field1803 != 12345678) {
                           class139.method3091(var27, var29, var25, var26, var28, var24, var1.field1803, var1.field1800, var1.field1797);
                        }
                     } else if(!field1847) {
                        if(var1.field1801) {
                           class139.method3121(var27, var29, var25, var26, var28, var24, var1.field1803, var1.field1800, var1.field1797, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field1798);
                        } else {
                           class139.method3121(var27, var29, var25, var26, var28, var24, var1.field1803, var1.field1800, var1.field1797, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field1798);
                        }
                     } else {
                        var30 = class139.field1781.vmethod3372(var1.field1798, (short)-417);
                        class139.method3091(var27, var29, var25, var26, var28, var24, method3207(var30, var1.field1803), method3207(var30, var1.field1800), method3207(var30, var1.field1797));
                     }
                  }

                  if((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     class139.field1778 = false;
                     if(var22 < 0 || var24 < 0 || var28 < 0 || var22 > class139.field1783 || var24 > class139.field1783 || var28 > class139.field1783) {
                        class139.field1778 = true;
                     }

                     if(field1841 && method3208(field1843, field1844, var23, var25, var29, var22, var24, var28)) {
                        field1845 = var7;
                        field1846 = var8;
                     }

                     if(var1.field1798 == -1) {
                        if(var1.field1799 != 12345678) {
                           class139.method3091(var23, var25, var29, var22, var24, var28, var1.field1799, var1.field1797, var1.field1800);
                        }
                     } else if(!field1847) {
                        class139.method3121(var23, var25, var29, var22, var24, var28, var1.field1799, var1.field1797, var1.field1800, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field1798);
                     } else {
                        var30 = class139.field1781.vmethod3372(var1.field1798, (short)-19229);
                        class139.method3091(var23, var25, var29, var22, var24, var28, method3207(var30, var1.field1799), method3207(var30, var1.field1797), method3207(var30, var1.field1800));
                     }
                  }

               }
            }
         }
      }
   }

   void method3286(class131 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.field1621.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field1621[var9] - field1833;
         var11 = var1.field1606[var9] - field1834;
         var12 = var1.field1607[var9] - field1874;
         var13 = var12 * var4 + var5 * var10 >> 16;
         var12 = var5 * var12 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var3 * var11 - var12 * var2 >> 16;
         var12 = var11 * var2 + var3 * var12 >> 16;
         if(var12 < 50) {
            return;
         }

         if(var1.field1614 != null) {
            class131.field1613[var9] = var10;
            class131.field1623[var9] = var13;
            class131.field1620[var9] = var12;
         }

         class131.field1615[var9] = var10 * class139.field1780 / var12 + class139.field1775;
         class131.field1605[var9] = var13 * class139.field1780 / var12 + class139.field1788;
      }

      class139.field1789 = 0;
      var8 = var1.field1625.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field1625[var9];
         var11 = var1.field1612[var9];
         var12 = var1.field1622[var9];
         var13 = class131.field1615[var10];
         int var14 = class131.field1615[var11];
         int var15 = class131.field1615[var12];
         int var16 = class131.field1605[var10];
         int var17 = class131.field1605[var11];
         int var18 = class131.field1605[var12];
         if((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            class139.field1778 = false;
            if(var13 < 0 || var14 < 0 || var15 < 0 || var13 > class139.field1783 || var14 > class139.field1783 || var15 > class139.field1783) {
               class139.field1778 = true;
            }

            if(field1841 && method3208(field1843, field1844, var16, var17, var18, var13, var14, var15)) {
               field1845 = var6;
               field1846 = var7;
            }

            if(var1.field1614 != null && var1.field1614[var9] != -1) {
               if(!field1847) {
                  if(var1.field1611) {
                     class139.method3121(var16, var17, var18, var13, var14, var15, var1.field1608[var9], var1.field1609[var9], var1.field1610[var9], class131.field1613[0], class131.field1613[1], class131.field1613[3], class131.field1623[0], class131.field1623[1], class131.field1623[3], class131.field1620[0], class131.field1620[1], class131.field1620[3], var1.field1614[var9]);
                  } else {
                     class139.method3121(var16, var17, var18, var13, var14, var15, var1.field1608[var9], var1.field1609[var9], var1.field1610[var9], class131.field1613[var10], class131.field1613[var11], class131.field1613[var12], class131.field1623[var10], class131.field1623[var11], class131.field1623[var12], class131.field1620[var10], class131.field1620[var11], class131.field1620[var12], var1.field1614[var9]);
                  }
               } else {
                  int var19 = class139.field1781.vmethod3372(var1.field1614[var9], (short)-32497);
                  class139.method3091(var16, var17, var18, var13, var14, var15, method3207(var19, var1.field1608[var9]), method3207(var19, var1.field1609[var9]), method3207(var19, var1.field1610[var9]));
               }
            } else if(var1.field1608[var9] != 12345678) {
               class139.method3091(var16, var17, var18, var13, var14, var15, var1.field1608[var9], var1.field1609[var9], var1.field1610[var9]);
            }
         }
      }

   }

   void method3294(class130 var1, int var2, int var3, int var4) {
      class135 var5;
      class130 var6;
      if(var3 < this.field1826) {
         var5 = this.field1815[var2][var3 + 1][var4];
         if(var5 != null && var5.field1667 != null && var5.field1667.field1630 instanceof class130) {
            var6 = (class130)var5.field1667.field1630;
            class130.method2876(var1, var6, 128, 0, 0, true);
         }
      }

      if(var4 < this.field1826) {
         var5 = this.field1815[var2][var3][var4 + 1];
         if(var5 != null && var5.field1667 != null && var5.field1667.field1630 instanceof class130) {
            var6 = (class130)var5.field1667.field1630;
            class130.method2876(var1, var6, 0, 0, 128, true);
         }
      }

      if(var3 < this.field1826 && var4 < this.field1862) {
         var5 = this.field1815[var2][var3 + 1][var4 + 1];
         if(var5 != null && var5.field1667 != null && var5.field1667.field1630 instanceof class130) {
            var6 = (class130)var5.field1667.field1630;
            class130.method2876(var1, var6, 128, 0, 128, true);
         }
      }

      if(var3 < this.field1826 && var4 > 0) {
         var5 = this.field1815[var2][var3 + 1][var4 - 1];
         if(var5 != null && var5.field1667 != null && var5.field1667.field1630 instanceof class130) {
            var6 = (class130)var5.field1667.field1630;
            class130.method2876(var1, var6, 128, 0, -128, true);
         }
      }

   }

   public void method3194() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.field1811; ++var1) {
         for(var2 = 0; var2 < this.field1826; ++var2) {
            for(int var3 = 0; var3 < this.field1862; ++var3) {
               this.field1815[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < field1813; ++var1) {
         for(var2 = 0; var2 < field1810[var1]; ++var2) {
            field1852[var1][var2] = null;
         }

         field1810[var1] = 0;
      }

      for(var1 = 0; var1 < this.field1817; ++var1) {
         this.field1849[var1] = null;
      }

      this.field1817 = 0;

      for(var1 = 0; var1 < field1867.length; ++var1) {
         field1867[var1] = null;
      }

   }

   boolean method3212(int var1, int var2, int var3, int var4) {
      if(!this.method3163(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method3214(var5 + 1, this.field1812[var1][var2][var3] - var4, var6 + 1) && this.method3214(var5 + 128 - 1, this.field1812[var1][var2 + 1][var3] - var4, var6 + 1) && this.method3214(var5 + 128 - 1, this.field1812[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method3214(var5 + 1, this.field1812[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   boolean method3213(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if(var3 == var2 && var5 == var4) {
         if(!this.method3163(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method3214(var7 + 1, this.field1812[var1][var2][var4] - var6, var8 + 1) && this.method3214(var7 + 128 - 1, this.field1812[var1][var2 + 1][var4] - var6, var8 + 1) && this.method3214(var7 + 128 - 1, this.field1812[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method3214(var7 + 1, this.field1812[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if(this.field1819[var1][var7][var8] == -field1850) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.field1812[var1][var2][var4] - var6;
         if(!this.method3214(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if(!this.method3214(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if(!this.method3214(var7, var9, var11)) {
                  return false;
               } else if(!this.method3214(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   void method3209() {
      int var1 = field1810[field1825];
      class149[] var2 = field1852[field1825];
      field1853 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         class149 var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         boolean var8;
         int var9;
         if(var4.field1909 == 1) {
            var5 = var4.field1911 - field1831 + 25;
            if(var5 >= 0 && var5 <= 50) {
               var6 = var4.field1907 - field1832 + 25;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field1923 - field1832 + 25;
               if(var7 > 50) {
                  var7 = 50;
               }

               var8 = false;

               while(var6 <= var7) {
                  if(field1835[var5][var6++]) {
                     var8 = true;
                     break;
                  }
               }

               if(var8) {
                  var9 = field1833 - var4.field1910;
                  if(var9 > 32) {
                     var4.field1916 = 1;
                  } else {
                     if(var9 >= -32) {
                        continue;
                     }

                     var4.field1916 = 2;
                     var9 = -var9;
                  }

                  var4.field1920 = (var4.field1905 - field1874 << 8) / var9;
                  var4.field1908 = (var4.field1913 - field1874 << 8) / var9;
                  var4.field1921 = (var4.field1915 - field1834 << 8) / var9;
                  var4.field1922 = (var4.field1918 - field1834 << 8) / var9;
                  field1854[field1853++] = var4;
               }
            }
         } else if(var4.field1909 == 2) {
            var5 = var4.field1907 - field1832 + 25;
            if(var5 >= 0 && var5 <= 50) {
               var6 = var4.field1911 - field1831 + 25;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field1906 - field1831 + 25;
               if(var7 > 50) {
                  var7 = 50;
               }

               var8 = false;

               while(var6 <= var7) {
                  if(field1835[var6++][var5]) {
                     var8 = true;
                     break;
                  }
               }

               if(var8) {
                  var9 = field1874 - var4.field1905;
                  if(var9 > 32) {
                     var4.field1916 = 3;
                  } else {
                     if(var9 >= -32) {
                        continue;
                     }

                     var4.field1916 = 4;
                     var9 = -var9;
                  }

                  var4.field1917 = (var4.field1910 - field1833 << 8) / var9;
                  var4.field1914 = (var4.field1919 - field1833 << 8) / var9;
                  var4.field1921 = (var4.field1915 - field1834 << 8) / var9;
                  var4.field1922 = (var4.field1918 - field1834 << 8) / var9;
                  field1854[field1853++] = var4;
               }
            }
         } else if(var4.field1909 == 4) {
            var5 = var4.field1915 - field1834;
            if(var5 > 128) {
               var6 = var4.field1907 - field1832 + 25;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field1923 - field1832 + 25;
               if(var7 > 50) {
                  var7 = 50;
               }

               if(var6 <= var7) {
                  int var13 = var4.field1911 - field1831 + 25;
                  if(var13 < 0) {
                     var13 = 0;
                  }

                  var9 = var4.field1906 - field1831 + 25;
                  if(var9 > 50) {
                     var9 = 50;
                  }

                  boolean var10 = false;

                  label129:
                  for(int var11 = var13; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if(field1835[var11][var12]) {
                           var10 = true;
                           break label129;
                        }
                     }
                  }

                  if(var10) {
                     var4.field1916 = 5;
                     var4.field1917 = (var4.field1910 - field1833 << 8) / var5;
                     var4.field1914 = (var4.field1919 - field1833 << 8) / var5;
                     var4.field1920 = (var4.field1905 - field1874 << 8) / var5;
                     var4.field1908 = (var4.field1913 - field1874 << 8) / var5;
                     field1854[field1853++] = var4;
                  }
               }
            }
         }
      }

   }

   public long method3189(int var1, int var2, int var3) {
      class135 var4 = this.field1815[var1][var2][var3];
      return var4 != null && var4.field1665 != null?var4.field1665.field1891:0L;
   }

   public void method3184(int var1, int var2, int var3) {
      class135 var4 = this.field1815[var1][var2][var3];
      if(var4 != null) {
         var4.field1668 = null;
      }
   }

   public long method3190(int var1, int var2, int var3) {
      class135 var4 = this.field1815[var1][var2][var3];
      return var4 != null && var4.field1666 != null?var4.field1666.field1933:0L;
   }

   public long method3191(int var1, int var2, int var3) {
      class135 var4 = this.field1815[var1][var2][var3];
      if(var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.field1664; ++var5) {
            class151 var6 = var4.field1673[var5];
            long var8 = var6.field1956;
            int var10 = (int)(var8 >>> 14 & 3L);
            boolean var7 = var10 == 2;
            if(var7 && var2 == var6.field1946 && var3 == var6.field1940) {
               return var6.field1956;
            }
         }

         return 0L;
      }
   }

   public void method3170(int var1, int var2, int var3, int var4, class144 var5, long var6, class144 var8, class144 var9) {
      class129 var10 = new class129();
      var10.field1556 = var5;
      var10.field1562 = var2 * 128 + 64;
      var10.field1555 = var3 * 128 + 64;
      var10.field1557 = var4;
      var10.field1564 = var6;
      var10.field1559 = var8;
      var10.field1558 = var9;
      int var11 = 0;
      class135 var12 = this.field1815[var1][var2][var3];
      if(var12 != null) {
         for(int var13 = 0; var13 < var12.field1664; ++var13) {
            if((var12.field1673[var13].field1953 & 256) == 256 && var12.field1673[var13].field1944 instanceof class136) {
               class136 var14 = (class136)var12.field1673[var13].field1944;
               var14.method2955();
               if(var14.field1883 > var11) {
                  var11 = var14.field1883;
               }
            }
         }
      }

      var10.field1560 = var11;
      if(this.field1815[var1][var2][var3] == null) {
         this.field1815[var1][var2][var3] = new class135(var1, var2, var3);
      }

      this.field1815[var1][var2][var3].field1668 = var10;
   }

   void method3303(class135 var1, boolean var2) {
      field1855.method4952(var1);

      while(true) {
         class135 var3 = (class135)field1855.method4929();
         if(var3 == null) {
            return;
         }

         if(var3.field1661) {
            int var4 = var3.field1660;
            int var5 = var3.field1659;
            int var6 = var3.field1677;
            int var7 = var3.field1662;
            class135[][] var8 = this.field1815[var6];
            class135 var9;
            class145 var10;
            int var11;
            class151 var12;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            boolean var20;
            int var21;
            class135 var36;
            if(var3.field1674) {
               if(var2) {
                  if(var6 > 0) {
                     var9 = this.field1815[var6 - 1][var4][var5];
                     if(var9 != null && var9.field1661) {
                        continue;
                     }
                  }

                  if(var4 <= field1831 && var4 > field1827) {
                     var9 = var8[var4 - 1][var5];
                     if(var9 != null && var9.field1661 && (var9.field1674 || (var3.field1672 & 1) == 0)) {
                        continue;
                     }
                  }

                  if(var4 >= field1831 && var4 < field1828 - 1) {
                     var9 = var8[var4 + 1][var5];
                     if(var9 != null && var9.field1661 && (var9.field1674 || (var3.field1672 & 4) == 0)) {
                        continue;
                     }
                  }

                  if(var5 <= field1832 && var5 > field1829) {
                     var9 = var8[var4][var5 - 1];
                     if(var9 != null && var9.field1661 && (var9.field1674 || (var3.field1672 & 8) == 0)) {
                        continue;
                     }
                  }

                  if(var5 >= field1832 && var5 < field1860 - 1) {
                     var9 = var8[var4][var5 + 1];
                     if(var9 != null && var9.field1661 && (var9.field1674 || (var3.field1672 & 2) == 0)) {
                        continue;
                     }
                  }
               } else {
                  var2 = true;
               }

               var3.field1674 = false;
               if(var3.field1681 != null) {
                  var9 = var3.field1681;
                  if(var9.field1663 != null) {
                     if(!this.method3163(0, var4, var5)) {
                        this.method3205(var9.field1663, 0, field1836, field1837, field1838, field1839, var4, var5);
                     }
                  } else if(var9.field1675 != null && !this.method3163(0, var4, var5)) {
                     this.method3286(var9.field1675, field1836, field1837, field1838, field1839, var4, var5);
                  }

                  var10 = var9.field1665;
                  if(var10 != null) {
                     var10.field1888.vmethod3351(0, field1836, field1837, field1838, field1839, var10.field1885 - field1833, var10.field1893 - field1834, var10.field1886 - field1874, var10.field1891);
                  }

                  for(var11 = 0; var11 < var9.field1664; ++var11) {
                     var12 = var9.field1673[var11];
                     if(var12 != null) {
                        var12.field1944.vmethod3351(var12.field1952, field1836, field1837, field1838, field1839, var12.field1942 - field1833, var12.field1941 - field1834, var12.field1948 - field1874, var12.field1956);
                     }
                  }
               }

               var20 = false;
               if(var3.field1663 != null) {
                  if(!this.method3163(var7, var4, var5)) {
                     var20 = true;
                     if(var3.field1663.field1803 != 12345678 || field1841 && var6 <= field1863) {
                        this.method3205(var3.field1663, var7, field1836, field1837, field1838, field1839, var4, var5);
                     }
                  }
               } else if(var3.field1675 != null && !this.method3163(var7, var4, var5)) {
                  var20 = true;
                  this.method3286(var3.field1675, field1836, field1837, field1838, field1839, var4, var5);
               }

               var21 = 0;
               var11 = 0;
               class145 var31 = var3.field1665;
               class150 var13 = var3.field1666;
               if(var31 != null || var13 != null) {
                  if(var4 == field1831) {
                     ++var21;
                  } else if(field1831 < var4) {
                     var21 += 2;
                  }

                  if(var5 == field1832) {
                     var21 += 3;
                  } else if(field1832 > var5) {
                     var21 += 6;
                  }

                  var11 = field1856[var21];
                  var3.field1680 = field1858[var21];
               }

               if(var31 != null) {
                  if((var31.field1884 & field1870[var21]) != 0) {
                     if(var31.field1884 == 16) {
                        var3.field1669 = 3;
                        var3.field1678 = field1820[var21];
                        var3.field1679 = 3 - var3.field1678;
                     } else if(var31.field1884 == 32) {
                        var3.field1669 = 6;
                        var3.field1678 = field1842[var21];
                        var3.field1679 = 6 - var3.field1678;
                     } else if(var31.field1884 == 64) {
                        var3.field1669 = 12;
                        var3.field1678 = field1861[var21];
                        var3.field1679 = 12 - var3.field1678;
                     } else {
                        var3.field1669 = 9;
                        var3.field1678 = field1814[var21];
                        var3.field1679 = 9 - var3.field1678;
                     }
                  } else {
                     var3.field1669 = 0;
                  }

                  if((var31.field1884 & var11) != 0 && !this.method3289(var7, var4, var5, var31.field1884)) {
                     var31.field1888.vmethod3351(0, field1836, field1837, field1838, field1839, var31.field1885 - field1833, var31.field1893 - field1834, var31.field1886 - field1874, var31.field1891);
                  }

                  if((var31.field1889 & var11) != 0 && !this.method3289(var7, var4, var5, var31.field1889)) {
                     var31.field1890.vmethod3351(0, field1836, field1837, field1838, field1839, var31.field1885 - field1833, var31.field1893 - field1834, var31.field1886 - field1874, var31.field1891);
                  }
               }

               if(var13 != null && !this.method3212(var7, var4, var5, var13.field1931.field1883)) {
                  if((var13.field1927 & var11) != 0) {
                     var13.field1931.vmethod3351(0, field1836, field1837, field1838, field1839, var13.field1932 - field1833 + var13.field1929, var13.field1937 - field1834, var13.field1926 - field1874 + var13.field1938, var13.field1933);
                  } else if(var13.field1927 == 256) {
                     var14 = var13.field1932 - field1833;
                     var15 = var13.field1937 - field1834;
                     var16 = var13.field1926 - field1874;
                     var17 = var13.field1928;
                     if(var17 != 1 && var17 != 2) {
                        var18 = var14;
                     } else {
                        var18 = -var14;
                     }

                     int var19;
                     if(var17 != 2 && var17 != 3) {
                        var19 = var16;
                     } else {
                        var19 = -var16;
                     }

                     if(var19 < var18) {
                        var13.field1931.vmethod3351(0, field1836, field1837, field1838, field1839, var14 + var13.field1929, var15, var16 + var13.field1938, var13.field1933);
                     } else if(var13.field1934 != null) {
                        var13.field1934.vmethod3351(0, field1836, field1837, field1838, field1839, var14, var15, var16, var13.field1933);
                     }
                  }
               }

               if(var20) {
                  class132 var22 = var3.field1667;
                  if(var22 != null) {
                     var22.field1630.vmethod3351(0, field1836, field1837, field1838, field1839, var22.field1629 - field1833, var22.field1627 - field1834, var22.field1628 - field1874, var22.field1631);
                  }

                  class129 var23 = var3.field1668;
                  if(var23 != null && var23.field1560 == 0) {
                     if(var23.field1559 != null) {
                        var23.field1559.vmethod3351(0, field1836, field1837, field1838, field1839, var23.field1562 - field1833, var23.field1557 - field1834, var23.field1555 - field1874, var23.field1564);
                     }

                     if(var23.field1558 != null) {
                        var23.field1558.vmethod3351(0, field1836, field1837, field1838, field1839, var23.field1562 - field1833, var23.field1557 - field1834, var23.field1555 - field1874, var23.field1564);
                     }

                     if(var23.field1556 != null) {
                        var23.field1556.vmethod3351(0, field1836, field1837, field1838, field1839, var23.field1562 - field1833, var23.field1557 - field1834, var23.field1555 - field1874, var23.field1564);
                     }
                  }
               }

               var14 = var3.field1672;
               if(var14 != 0) {
                  if(var4 < field1831 && (var14 & 4) != 0) {
                     var36 = var8[var4 + 1][var5];
                     if(var36 != null && var36.field1661) {
                        field1855.method4952(var36);
                     }
                  }

                  if(var5 < field1832 && (var14 & 2) != 0) {
                     var36 = var8[var4][var5 + 1];
                     if(var36 != null && var36.field1661) {
                        field1855.method4952(var36);
                     }
                  }

                  if(var4 > field1831 && (var14 & 1) != 0) {
                     var36 = var8[var4 - 1][var5];
                     if(var36 != null && var36.field1661) {
                        field1855.method4952(var36);
                     }
                  }

                  if(var5 > field1832 && (var14 & 8) != 0) {
                     var36 = var8[var4][var5 - 1];
                     if(var36 != null && var36.field1661) {
                        field1855.method4952(var36);
                     }
                  }
               }
            }

            if(var3.field1669 != 0) {
               var20 = true;

               for(var21 = 0; var21 < var3.field1664; ++var21) {
                  if(var3.field1673[var21].field1951 != field1850 && (var3.field1671[var21] & var3.field1669) == var3.field1678) {
                     var20 = false;
                     break;
                  }
               }

               if(var20) {
                  var10 = var3.field1665;
                  if(!this.method3289(var7, var4, var5, var10.field1884)) {
                     var10.field1888.vmethod3351(0, field1836, field1837, field1838, field1839, var10.field1885 - field1833, var10.field1893 - field1834, var10.field1886 - field1874, var10.field1891);
                  }

                  var3.field1669 = 0;
               }
            }

            int var24;
            int var25;
            if(var3.field1676) {
               try {
                  int var34 = var3.field1664;
                  var3.field1676 = false;
                  var21 = 0;

                  label544:
                  for(var11 = 0; var11 < var34; ++var11) {
                     var12 = var3.field1673[var11];
                     if(var12.field1951 != field1850) {
                        for(var24 = var12.field1946; var24 <= var12.field1947; ++var24) {
                           for(var14 = var12.field1940; var14 <= var12.field1945; ++var14) {
                              var36 = var8[var24][var14];
                              if(var36.field1674) {
                                 var3.field1676 = true;
                                 continue label544;
                              }

                              if(var36.field1669 != 0) {
                                 var16 = 0;
                                 if(var24 > var12.field1946) {
                                    ++var16;
                                 }

                                 if(var24 < var12.field1947) {
                                    var16 += 4;
                                 }

                                 if(var14 > var12.field1940) {
                                    var16 += 8;
                                 }

                                 if(var14 < var12.field1945) {
                                    var16 += 2;
                                 }

                                 if((var16 & var36.field1669) == var3.field1679) {
                                    var3.field1676 = true;
                                    continue label544;
                                 }
                              }
                           }
                        }

                        field1867[var21++] = var12;
                        var24 = field1831 - var12.field1946;
                        var14 = var12.field1947 - field1831;
                        if(var14 > var24) {
                           var24 = var14;
                        }

                        var15 = field1832 - var12.field1940;
                        var16 = var12.field1945 - field1832;
                        if(var16 > var15) {
                           var12.field1950 = var24 + var16;
                        } else {
                           var12.field1950 = var24 + var15;
                        }
                     }
                  }

                  while(var21 > 0) {
                     var11 = -50;
                     var25 = -1;

                     for(var24 = 0; var24 < var21; ++var24) {
                        class151 var35 = field1867[var24];
                        if(var35.field1951 != field1850) {
                           if(var35.field1950 > var11) {
                              var11 = var35.field1950;
                              var25 = var24;
                           } else if(var11 == var35.field1950) {
                              var15 = var35.field1942 - field1833;
                              var16 = var35.field1948 - field1874;
                              var17 = field1867[var25].field1942 - field1833;
                              var18 = field1867[var25].field1948 - field1874;
                              if(var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                 var25 = var24;
                              }
                           }
                        }
                     }

                     if(var25 == -1) {
                        break;
                     }

                     class151 var33 = field1867[var25];
                     var33.field1951 = field1850;
                     if(!this.method3213(var7, var33.field1946, var33.field1947, var33.field1940, var33.field1945, var33.field1944.field1883)) {
                        var33.field1944.vmethod3351(var33.field1952, field1836, field1837, field1838, field1839, var33.field1942 - field1833, var33.field1941 - field1834, var33.field1948 - field1874, var33.field1956);
                     }

                     for(var14 = var33.field1946; var14 <= var33.field1947; ++var14) {
                        for(var15 = var33.field1940; var15 <= var33.field1945; ++var15) {
                           class135 var26 = var8[var14][var15];
                           if(var26.field1669 != 0) {
                              field1855.method4952(var26);
                           } else if((var14 != var4 || var15 != var5) && var26.field1661) {
                              field1855.method4952(var26);
                           }
                        }
                     }
                  }

                  if(var3.field1676) {
                     continue;
                  }
               } catch (Exception var28) {
                  var3.field1676 = false;
               }
            }

            if(var3.field1661 && var3.field1669 == 0) {
               if(var4 <= field1831 && var4 > field1827) {
                  var9 = var8[var4 - 1][var5];
                  if(var9 != null && var9.field1661) {
                     continue;
                  }
               }

               if(var4 >= field1831 && var4 < field1828 - 1) {
                  var9 = var8[var4 + 1][var5];
                  if(var9 != null && var9.field1661) {
                     continue;
                  }
               }

               if(var5 <= field1832 && var5 > field1829) {
                  var9 = var8[var4][var5 - 1];
                  if(var9 != null && var9.field1661) {
                     continue;
                  }
               }

               if(var5 >= field1832 && var5 < field1860 - 1) {
                  var9 = var8[var4][var5 + 1];
                  if(var9 != null && var9.field1661) {
                     continue;
                  }
               }

               var3.field1661 = false;
               --field1824;
               class129 var32 = var3.field1668;
               if(var32 != null && var32.field1560 != 0) {
                  if(var32.field1559 != null) {
                     var32.field1559.vmethod3351(0, field1836, field1837, field1838, field1839, var32.field1562 - field1833, var32.field1557 - field1834 - var32.field1560, var32.field1555 - field1874, var32.field1564);
                  }

                  if(var32.field1558 != null) {
                     var32.field1558.vmethod3351(0, field1836, field1837, field1838, field1839, var32.field1562 - field1833, var32.field1557 - field1834 - var32.field1560, var32.field1555 - field1874, var32.field1564);
                  }

                  if(var32.field1556 != null) {
                     var32.field1556.vmethod3351(0, field1836, field1837, field1838, field1839, var32.field1562 - field1833, var32.field1557 - field1834 - var32.field1560, var32.field1555 - field1874, var32.field1564);
                  }
               }

               if(var3.field1680 != 0) {
                  class150 var29 = var3.field1666;
                  if(var29 != null && !this.method3212(var7, var4, var5, var29.field1931.field1883)) {
                     if((var29.field1927 & var3.field1680) != 0) {
                        var29.field1931.vmethod3351(0, field1836, field1837, field1838, field1839, var29.field1932 - field1833 + var29.field1929, var29.field1937 - field1834, var29.field1926 - field1874 + var29.field1938, var29.field1933);
                     } else if(var29.field1927 == 256) {
                        var11 = var29.field1932 - field1833;
                        var25 = var29.field1937 - field1834;
                        var24 = var29.field1926 - field1874;
                        var14 = var29.field1928;
                        if(var14 != 1 && var14 != 2) {
                           var15 = var11;
                        } else {
                           var15 = -var11;
                        }

                        if(var14 != 2 && var14 != 3) {
                           var16 = var24;
                        } else {
                           var16 = -var24;
                        }

                        if(var16 >= var15) {
                           var29.field1931.vmethod3351(0, field1836, field1837, field1838, field1839, var11 + var29.field1929, var25, var24 + var29.field1938, var29.field1933);
                        } else if(var29.field1934 != null) {
                           var29.field1934.vmethod3351(0, field1836, field1837, field1838, field1839, var11, var25, var24, var29.field1933);
                        }
                     }
                  }

                  class145 var27 = var3.field1665;
                  if(var27 != null) {
                     if((var27.field1889 & var3.field1680) != 0 && !this.method3289(var7, var4, var5, var27.field1889)) {
                        var27.field1890.vmethod3351(0, field1836, field1837, field1838, field1839, var27.field1885 - field1833, var27.field1893 - field1834, var27.field1886 - field1874, var27.field1891);
                     }

                     if((var27.field1884 & var3.field1680) != 0 && !this.method3289(var7, var4, var5, var27.field1884)) {
                        var27.field1888.vmethod3351(0, field1836, field1837, field1838, field1839, var27.field1885 - field1833, var27.field1893 - field1834, var27.field1886 - field1874, var27.field1891);
                     }
                  }
               }

               class135 var30;
               if(var6 < this.field1811 - 1) {
                  var30 = this.field1815[var6 + 1][var4][var5];
                  if(var30 != null && var30.field1661) {
                     field1855.method4952(var30);
                  }
               }

               if(var4 < field1831) {
                  var30 = var8[var4 + 1][var5];
                  if(var30 != null && var30.field1661) {
                     field1855.method4952(var30);
                  }
               }

               if(var5 < field1832) {
                  var30 = var8[var4][var5 + 1];
                  if(var30 != null && var30.field1661) {
                     field1855.method4952(var30);
                  }
               }

               if(var4 > field1831) {
                  var30 = var8[var4 - 1][var5];
                  if(var30 != null && var30.field1661) {
                     field1855.method4952(var30);
                  }
               }

               if(var5 > field1832) {
                  var30 = var8[var4][var5 - 1];
                  if(var30 != null && var30.field1661) {
                     field1855.method4952(var30);
                  }
               }
            }
         }
      }
   }

   public long method3309(int var1, int var2, int var3) {
      class135 var4 = this.field1815[var1][var2][var3];
      return var4 != null && var4.field1667 != null?var4.field1667.field1631:0L;
   }

   public int method3193(int var1, int var2, int var3, long var4) {
      class135 var6 = this.field1815[var1][var2][var3];
      if(var6 == null) {
         return -1;
      } else if(var6.field1665 != null && var6.field1665.field1891 == var4) {
         return var6.field1665.field1887 & 255;
      } else if(var6.field1666 != null && var6.field1666.field1933 == var4) {
         return var6.field1666.field1924 & 255;
      } else if(var6.field1667 != null && var6.field1667.field1631 == var4) {
         return var6.field1667.field1632 & 255;
      } else {
         for(int var7 = 0; var7 < var6.field1664; ++var7) {
            if(var6.field1673[var7].field1956 == var4) {
               return var6.field1673[var7].field1953 & 255;
            }
         }

         return -1;
      }
   }

   public class145 method3185(int var1, int var2, int var3) {
      class135 var4 = this.field1815[var1][var2][var3];
      return var4 == null?null:var4.field1665;
   }

   public class150 method3238(int var1, int var2, int var3) {
      class135 var4 = this.field1815[var1][var2][var3];
      return var4 == null?null:var4.field1666;
   }

   public class151 method3187(int var1, int var2, int var3) {
      class135 var4 = this.field1815[var1][var2][var3];
      if(var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.field1664; ++var5) {
            class151 var6 = var4.field1673[var5];
            long var8 = var6.field1956;
            int var10 = (int)(var8 >>> 14 & 3L);
            boolean var7 = var10 == 2;
            if(var7 && var2 == var6.field1946 && var3 == var6.field1940) {
               return var6;
            }
         }

         return null;
      }
   }

   public class132 method3188(int var1, int var2, int var3) {
      class135 var4 = this.field1815[var1][var2][var3];
      return var4 != null && var4.field1667 != null?var4.field1667:null;
   }

   public void method3345(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      class135 var7 = this.field1815[var4][var5][var6];
      if(var7 != null) {
         class140 var8 = var7.field1663;
         int var10;
         if(var8 != null) {
            int var9 = var8.field1796;
            if(var9 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var9;
                  var1[var2 + 1] = var9;
                  var1[var2 + 2] = var9;
                  var1[var2 + 3] = var9;
                  var2 += var3;
               }

            }
         } else {
            class131 var18 = var7.field1675;
            if(var18 != null) {
               var10 = var18.field1624;
               int var11 = var18.field1616;
               int var12 = var18.field1618;
               int var13 = var18.field1619;
               int[] var14 = this.field1866[var10];
               int[] var15 = this.field1818[var11];
               int var16 = 0;
               int var17;
               if(var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0?var12:var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if(var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   public boolean method3174(int var1, int var2, int var3, int var4, int var5, class144 var6, int var7, long var8, boolean var10) {
      if(var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var5 + var2;
         int var14 = var3 + var5;
         if(var10) {
            if(var7 > 640 && var7 < 1408) {
               var14 += 128;
            }

            if(var7 > 1152 && var7 < 1920) {
               var13 += 128;
            }

            if(var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if(var7 > 128 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         var14 /= 128;
         return this.method3181(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   public boolean method3175(int var1, int var2, int var3, int var4, int var5, class144 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null?true:this.method3181(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   public void method3180(int var1, int var2, int var3) {
      class135 var4 = this.field1815[var1][var2][var3];
      if(var4 != null) {
         var4.field1665 = null;
      }
   }

   public void method3262(int var1, int var2, int var3) {
      class135 var4 = this.field1815[var1][var2][var3];
      if(var4 != null) {
         var4.field1666 = null;
      }
   }

   public void method3182(int var1, int var2, int var3) {
      class135 var4 = this.field1815[var1][var2][var3];
      if(var4 != null) {
         for(int var5 = 0; var5 < var4.field1664; ++var5) {
            class151 var6 = var4.field1673[var5];
            long var8 = var6.field1956;
            int var10 = (int)(var8 >>> 14 & 3L);
            boolean var7 = var10 == 2;
            if(var7 && var2 == var6.field1946 && var3 == var6.field1940) {
               this.method3178(var6);
               return;
            }
         }

      }
   }

   public void method3183(int var1, int var2, int var3) {
      class135 var4 = this.field1815[var1][var2][var3];
      if(var4 != null) {
         var4.field1667 = null;
      }
   }

   public void method3325() {
      field1876 = true;
   }

   public void method3164(int var1) {
      this.field1857 = var1;

      for(int var2 = 0; var2 < this.field1826; ++var2) {
         for(int var3 = 0; var3 < this.field1862; ++var3) {
            if(this.field1815[var1][var2][var3] == null) {
               this.field1815[var1][var2][var3] = new class135(var1, var2, var3);
            }
         }
      }

   }

   public void method3162(int var1, int var2, int var3, int var4, class144 var5, long var6, int var8) {
      if(var5 != null) {
         class132 var9 = new class132();
         var9.field1630 = var5;
         var9.field1629 = var2 * 128 + 64;
         var9.field1628 = var3 * 128 + 64;
         var9.field1627 = var4;
         var9.field1631 = var6;
         var9.field1632 = var8;
         if(this.field1815[var1][var2][var3] == null) {
            this.field1815[var1][var2][var3] = new class135(var1, var2, var3);
         }

         this.field1815[var1][var2][var3].field1667 = var9;
      }
   }

   public boolean method3173(int var1, int var2, int var3, int var4, int var5, int var6, class144 var7, int var8, long var9, int var11) {
      if(var7 == null) {
         return true;
      } else {
         int var12 = var5 * 64 + var2 * 128;
         int var13 = var6 * 64 + var3 * 128;
         return this.method3181(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   public void method3269(int var1, int var2, int var3, int var4, class144 var5, class144 var6, int var7, int var8, long var9, int var11) {
      if(var5 != null || var6 != null) {
         class145 var12 = new class145();
         var12.field1891 = var9;
         var12.field1887 = var11;
         var12.field1885 = var2 * 128 + 64;
         var12.field1886 = var3 * 128 + 64;
         var12.field1893 = var4;
         var12.field1888 = var5;
         var12.field1890 = var6;
         var12.field1884 = var7;
         var12.field1889 = var8;

         for(int var13 = var1; var13 >= 0; --var13) {
            if(this.field1815[var13][var2][var3] == null) {
               this.field1815[var13][var2][var3] = new class135(var13, var2, var3);
            }
         }

         this.field1815[var1][var2][var3].field1665 = var12;
      }
   }

   public void method3203(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 < 0) {
         var1 = 0;
      } else if(var1 >= this.field1826 * 128) {
         var1 = this.field1826 * 128 - 1;
      }

      if(var3 < 0) {
         var3 = 0;
      } else if(var3 >= this.field1862 * 128) {
         var3 = this.field1862 * 128 - 1;
      }

      if(var4 < 128) {
         var4 = 128;
      } else if(var4 > 383) {
         var4 = 383;
      }

      ++field1850;
      field1836 = class139.field1794[var4];
      field1837 = class139.field1795[var4];
      field1838 = class139.field1794[var5];
      field1839 = class139.field1795[var5];
      field1835 = field1869[(var4 - 128) / 32][var5 / 64];
      field1833 = var1;
      field1834 = var2;
      field1874 = var3;
      field1831 = var1 / 128;
      field1832 = var3 / 128;
      field1825 = var6;
      field1827 = field1831 - 25;
      if(field1827 < 0) {
         field1827 = 0;
      }

      field1829 = field1832 - 25;
      if(field1829 < 0) {
         field1829 = 0;
      }

      field1828 = field1831 + 25;
      if(field1828 > this.field1826) {
         field1828 = this.field1826;
      }

      field1860 = field1832 + 25;
      if(field1860 > this.field1862) {
         field1860 = this.field1862;
      }

      this.method3209();
      field1824 = 0;

      int var7;
      class135[][] var8;
      int var9;
      int var10;
      for(var7 = this.field1857; var7 < this.field1811; ++var7) {
         var8 = this.field1815[var7];

         for(var9 = field1827; var9 < field1828; ++var9) {
            for(var10 = field1829; var10 < field1860; ++var10) {
               class135 var11 = var8[var9][var10];
               if(var11 != null) {
                  if(var11.field1670 <= var6 && (field1835[var9 - field1831 + 25][var10 - field1832 + 25] || this.field1812[var7][var9][var10] - var2 >= 2000)) {
                     var11.field1674 = true;
                     var11.field1661 = true;
                     if(var11.field1664 > 0) {
                        var11.field1676 = true;
                     } else {
                        var11.field1676 = false;
                     }

                     ++field1824;
                  } else {
                     var11.field1674 = false;
                     var11.field1661 = false;
                     var11.field1669 = 0;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      int var14;
      class135 var15;
      int var16;
      for(var7 = this.field1857; var7 < this.field1811; ++var7) {
         var8 = this.field1815[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = var9 + field1831;
            var16 = field1831 - var9;
            if(var10 >= field1827 || var16 < field1828) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = var12 + field1832;
                  var14 = field1832 - var12;
                  if(var10 >= field1827) {
                     if(var13 >= field1829) {
                        var15 = var8[var10][var13];
                        if(var15 != null && var15.field1674) {
                           this.method3303(var15, true);
                        }
                     }

                     if(var14 < field1860) {
                        var15 = var8[var10][var14];
                        if(var15 != null && var15.field1674) {
                           this.method3303(var15, true);
                        }
                     }
                  }

                  if(var16 < field1828) {
                     if(var13 >= field1829) {
                        var15 = var8[var16][var13];
                        if(var15 != null && var15.field1674) {
                           this.method3303(var15, true);
                        }
                     }

                     if(var14 < field1860) {
                        var15 = var8[var16][var14];
                        if(var15 != null && var15.field1674) {
                           this.method3303(var15, true);
                        }
                     }
                  }

                  if(field1824 == 0) {
                     field1841 = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.field1857; var7 < this.field1811; ++var7) {
         var8 = this.field1815[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = var9 + field1831;
            var16 = field1831 - var9;
            if(var10 >= field1827 || var16 < field1828) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = var12 + field1832;
                  var14 = field1832 - var12;
                  if(var10 >= field1827) {
                     if(var13 >= field1829) {
                        var15 = var8[var10][var13];
                        if(var15 != null && var15.field1674) {
                           this.method3303(var15, false);
                        }
                     }

                     if(var14 < field1860) {
                        var15 = var8[var10][var14];
                        if(var15 != null && var15.field1674) {
                           this.method3303(var15, false);
                        }
                     }
                  }

                  if(var16 < field1828) {
                     if(var13 >= field1829) {
                        var15 = var8[var16][var13];
                        if(var15 != null && var15.field1674) {
                           this.method3303(var15, false);
                        }
                     }

                     if(var14 < field1860) {
                        var15 = var8[var16][var14];
                        if(var15 != null && var15.field1674) {
                           this.method3303(var15, false);
                        }
                     }
                  }

                  if(field1824 == 0) {
                     field1841 = false;
                     return;
                  }
               }
            }
         }
      }

      field1841 = false;
   }

   public void method3285(int var1, int var2, int var3, int var4, class144 var5, class144 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if(var5 != null) {
         class150 var14 = new class150();
         var14.field1933 = var11;
         var14.field1924 = var13;
         var14.field1932 = var2 * 128 + 64;
         var14.field1926 = var3 * 128 + 64;
         var14.field1937 = var4;
         var14.field1931 = var5;
         var14.field1934 = var6;
         var14.field1927 = var7;
         var14.field1928 = var8;
         var14.field1929 = var9;
         var14.field1938 = var10;

         for(int var15 = var1; var15 >= 0; --var15) {
            if(this.field1815[var15][var2][var3] == null) {
               this.field1815[var15][var2][var3] = new class135(var15, var2, var3);
            }
         }

         this.field1815[var1][var2][var3].field1666 = var14;
      }
   }

   public void method3177() {
      for(int var1 = 0; var1 < this.field1817; ++var1) {
         class151 var2 = this.field1849[var1];
         this.method3178(var2);
         this.field1849[var1] = null;
      }

      this.field1817 = 0;
   }

   public void method3248(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1811; ++var4) {
         for(int var5 = 0; var5 < this.field1826; ++var5) {
            for(int var6 = 0; var6 < this.field1862; ++var6) {
               class135 var7 = this.field1815[var4][var5][var6];
               if(var7 != null) {
                  class145 var8 = var7.field1665;
                  class130 var10;
                  if(var8 != null && var8.field1888 instanceof class130) {
                     class130 var9 = (class130)var8.field1888;
                     this.method3195(var9, var4, var5, var6, 1, 1);
                     if(var8.field1890 instanceof class130) {
                        var10 = (class130)var8.field1890;
                        this.method3195(var10, var4, var5, var6, 1, 1);
                        class130.method2876(var9, var10, 0, 0, 0, false);
                        var8.field1890 = var10.method2886(var10.field1587, var10.field1593, var1, var2, var3);
                     }

                     var8.field1888 = var9.method2886(var9.field1587, var9.field1593, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.field1664; ++var12) {
                     class151 var14 = var7.field1673[var12];
                     if(var14 != null && var14.field1944 instanceof class130) {
                        class130 var11 = (class130)var14.field1944;
                        this.method3195(var11, var4, var5, var6, var14.field1947 - var14.field1946 + 1, var14.field1945 - var14.field1940 + 1);
                        var14.field1944 = var11.method2886(var11.field1587, var11.field1593, var1, var2, var3);
                     }
                  }

                  class132 var13 = var7.field1667;
                  if(var13 != null && var13.field1630 instanceof class130) {
                     var10 = (class130)var13.field1630;
                     this.method3294(var10, var4, var5, var6);
                     var13.field1630 = var10.method2886(var10.field1587, var10.field1593, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   public void method3165(int var1, int var2) {
      class135 var3 = this.field1815[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         class135 var5 = this.field1815[var4][var1][var2] = this.field1815[var4 + 1][var1][var2];
         if(var5 != null) {
            --var5.field1677;

            for(int var6 = 0; var6 < var5.field1664; ++var6) {
               class151 var7 = var5.field1673[var6];
               long var9 = var7.field1956;
               int var11 = (int)(var9 >>> 14 & 3L);
               boolean var8 = var11 == 2;
               if(var8 && var7.field1946 == var1 && var2 == var7.field1940) {
                  --var7.field1943;
               }
            }
         }
      }

      if(this.field1815[0][var1][var2] == null) {
         this.field1815[0][var1][var2] = new class135(0, var1, var2);
      }

      this.field1815[0][var1][var2].field1681 = var3;
      this.field1815[3][var1][var2] = null;
   }

   public void method3167(int var1, int var2, int var3, int var4) {
      class135 var5 = this.field1815[var1][var2][var3];
      if(var5 != null) {
         this.field1815[var1][var2][var3].field1670 = var4;
      }
   }

   public void method3168(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      class140 var21;
      int var22;
      if(var4 == 0) {
         var21 = new class140(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.field1815[var22][var2][var3] == null) {
               this.field1815[var22][var2][var3] = new class135(var22, var2, var3);
            }
         }

         this.field1815[var1][var2][var3].field1663 = var21;
      } else if(var4 != 1) {
         class131 var23 = new class131(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.field1815[var22][var2][var3] == null) {
               this.field1815[var22][var2][var3] = new class135(var22, var2, var3);
            }
         }

         this.field1815[var1][var2][var3].field1675 = var23;
      } else {
         var21 = new class140(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7);

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.field1815[var22][var2][var3] == null) {
               this.field1815[var22][var2][var3] = new class135(var22, var2, var3);
            }
         }

         this.field1815[var1][var2][var3].field1663 = var21;
      }
   }

   public void method3196(int var1, int var2, int var3, int var4) {
      class135 var5 = this.field1815[var1][var2][var3];
      if(var5 != null) {
         class150 var6 = var5.field1666;
         if(var6 != null) {
            var6.field1929 = var4 * var6.field1929 / 16;
            var6.field1938 = var4 * var6.field1938 / 16;
         }
      }
   }

   public static boolean method3201() {
      return field1876 && field1845 != -1;
   }

   static boolean method3208(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if(var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if(var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if(var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3);
         int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7);
         return var8 == 0?(var9 != 0?(var9 < 0?var10 <= 0:var10 >= 0):true):(var8 < 0?var9 <= 0 && var10 <= 0:var9 >= 0 && var10 >= 0);
      }
   }

   static final int method3207(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   public static void method3197(int[] var0, int var1, int var2, int var3, int var4) {
      field1873 = 0;
      field1840 = 0;
      field1821 = var3;
      field1830 = var4;
      field1871 = var3 / 2;
      field1872 = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][32][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = 128; var6 <= 383; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            field1836 = class139.field1794[var6];
            field1837 = class139.field1795[var6];
            field1838 = class139.field1794[var7];
            field1839 = class139.field1795[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for(int var10 = -26; var10 < 26; ++var10) {
               var11 = -26;

               while(var11 < 26) {
                  var12 = var10 * 128;
                  int var13 = var11 * 128;
                  boolean var14 = false;
                  int var15 = -var1;

                  while(true) {
                     if(var15 <= var2) {
                        if(!method3198(var12, var0[var8] + var15, var13)) {
                           var15 += 128;
                           continue;
                        }

                        var14 = true;
                     }

                     var5[var8][var9][var10 + 1 + 25][var11 + 1 + 25] = var14;
                     ++var11;
                     break;
                  }
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < 32; ++var7) {
            for(var8 = -25; var8 < 25; ++var8) {
               var9 = -25;

               while(var9 < 25) {
                  boolean var16 = false;
                  var11 = -1;

                  label66:
                  while(true) {
                     if(var11 <= 1) {
                        var12 = -1;

                        while(true) {
                           if(var12 > 1) {
                              ++var11;
                              continue label66;
                           }

                           if(var5[var6][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
                              var16 = true;
                              break;
                           }

                           if(var5[var6][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
                              var16 = true;
                              break;
                           }

                           if(var5[var6 + 1][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
                              var16 = true;
                              break;
                           }

                           if(var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
                              var16 = true;
                              break;
                           }

                           ++var12;
                        }
                     }

                     field1869[var6][var7][var8 + 25][var9 + 25] = var16;
                     ++var9;
                     break;
                  }
               }
            }
         }
      }

   }

   public static void method3333() {
      field1845 = -1;
      field1876 = false;
   }

   public static void method3263(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class149 var8 = new class149();
      var8.field1911 = var2 / 128;
      var8.field1906 = var3 / 128;
      var8.field1907 = var4 / 128;
      var8.field1923 = var5 / 128;
      var8.field1909 = var1;
      var8.field1910 = var2;
      var8.field1919 = var3;
      var8.field1905 = var4;
      var8.field1913 = var5;
      var8.field1915 = var6;
      var8.field1918 = var7;
      field1852[var0][field1810[var0]++] = var8;
   }

   static boolean method3198(int var0, int var1, int var2) {
      int var3 = var0 * field1839 + var2 * field1838 >> 16;
      int var4 = var2 * field1839 - var0 * field1838 >> 16;
      int var5 = var4 * field1837 + field1836 * var1 >> 16;
      int var6 = field1837 * var1 - var4 * field1836 >> 16;
      if(var5 >= 50 && var5 <= 3500) {
         int var7 = var3 * 128 / var5 + field1871;
         int var8 = var6 * 128 / var5 + field1872;
         return var7 >= field1873 && var7 <= field1821 && var8 >= field1840 && var8 <= field1830;
      } else {
         return false;
      }
   }
}
