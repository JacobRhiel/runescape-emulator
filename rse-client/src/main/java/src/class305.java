package src;

import java.util.Random;

public abstract class class305 extends class330 {

   static int field3680 = -1;
   static String[] field3677 = new String[100];
   static int field3688 = -1;
   static Random field3696 = new Random();
   static int field3685 = 256;
   static int field3689 = -1;
   static int field3691 = 0;
   static int field3692 = 0;
   static int field3693 = -1;
   static int field3694 = 0;
   static int field3695 = 0;
   public static class333[] field3690;
   public int field3682 = 0;
   int[] field3681;
   byte[][] field3687 = new byte[256][];
   public int field3683;
   public int field3684;
   int[] field3697;
   int[] field3676;
   byte[] field3686;
   int[] field3678;
   int[] field3679;


   class305(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      this.field3697 = var2;
      this.field3676 = var3;
      this.field3678 = var4;
      this.field3679 = var5;
      this.method5393(var1);
      this.field3687 = var7;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;

      for(int var10 = 0; var10 < 256; ++var10) {
         if(this.field3676[var10] < var8 && this.field3679[var10] != 0) {
            var8 = this.field3676[var10];
         }

         if(this.field3676[var10] + this.field3679[var10] > var9) {
            var9 = this.field3676[var10] + this.field3679[var10];
         }
      }

      this.field3683 = this.field3682 - var8;
      this.field3684 = var9 - this.field3682;
   }

   class305(byte[] var1) {
      this.method5393(var1);
   }

   void method5398(int var1, int var2) {
      field3680 = -1;
      field3688 = -1;
      field3689 = var2;
      field3693 = var2;
      field3691 = var1;
      field3692 = var1;
      field3685 = 256;
      field3694 = 0;
      field3695 = 0;
   }

   public int method5384(String var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if(var6 == 60) {
               var2 = var5;
            } else {
               if(var6 == 62 && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if(var7.equals("lt")) {
                     var6 = 60;
                  } else {
                     if(!var7.equals("gt")) {
                        if(var7.startsWith("img=")) {
                           try {
                              int var8 = class64.method1217(var7.substring(4), 1872751399);
                              var4 += field3690[var8].field3882;
                              var3 = -1;
                           } catch (Exception var10) {
                              ;
                           }
                        }
                        continue;
                     }

                     var6 = 62;
                  }
               }

               if(var6 == 160) {
                  var6 = 32;
               }

               if(var2 == -1) {
                  var4 += this.field3681[(char)(class175.method3559(var6, (byte)108) & 255)];
                  if(this.field3686 != null && var3 != -1) {
                     var4 += this.field3686[var6 + (var3 << 8)];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   public int method5385(String var1, int[] var2, String[] var3) {
      if(var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if(var15 == 60) {
               var10 = var14;
            } else {
               if(var15 == 62 && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if(var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if(var16.equals("lt")) {
                     var4 += this.method5383('<');
                     if(this.field3686 != null && var11 != -1) {
                        var4 += this.field3686[(var11 << 8) + 60];
                     }

                     var11 = 60;
                  } else if(var16.equals("gt")) {
                     var4 += this.method5383('>');
                     if(this.field3686 != null && var11 != -1) {
                        var4 += this.field3686[(var11 << 8) + 62];
                     }

                     var11 = 62;
                  } else if(var16.startsWith("img=")) {
                     try {
                        int var17 = class64.method1217(var16.substring(4), 1327507873);
                        var4 += field3690[var17].field3882;
                        var11 = 0;
                     } catch (Exception var20) {
                        ;
                     }
                  }

                  var15 = 0;
               }

               if(var10 == -1) {
                  if(var15 != 0) {
                     var6.append(var15);
                     var4 += this.method5383(var15);
                     if(this.field3686 != null && var11 != -1) {
                        var4 += this.field3686[var15 + (var11 << 8)];
                     }

                     var11 = var15;
                  }

                  if(var15 == 32) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if(var2 != null && var4 > var2[var12 < var2.length?var12:var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if(var15 == 45) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var19 = var6.toString();
         if(var19.length() > var5) {
            var3[var12++] = var19.substring(var5, var19.length());
         }

         return var12;
      }
   }

   void method5447(String var1, int var2, int var3) {
      var3 -= this.field3682;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if(var1.charAt(var6) != 0) {
            char var7 = (char)(class175.method3559(var1.charAt(var6), (byte)84) & 255);
            if(var7 == 60) {
               var4 = var6;
            } else {
               int var9;
               if(var7 == 62 && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if(var8.equals("lt")) {
                     var7 = 60;
                  } else {
                     if(!var8.equals("gt")) {
                        if(var8.startsWith("img=")) {
                           try {
                              var9 = class64.method1217(var8.substring(4), -809012169);
                              class333 var10 = field3690[var9];
                              var10.method6173(var2, var3 + this.field3682 - var10.field3887);
                              var2 += var10.field3882;
                              var5 = -1;
                           } catch (Exception var14) {
                              ;
                           }
                        } else {
                           this.method5399(var8);
                        }
                        continue;
                     }

                     var7 = 62;
                  }
               }

               if(var7 == 160) {
                  var7 = 32;
               }

               if(var4 == -1) {
                  if(this.field3686 != null && var5 != -1) {
                     var2 += this.field3686[var7 + (var5 << 8)];
                  }

                  int var12 = this.field3678[var7];
                  var9 = this.field3679[var7];
                  if(var7 != 32) {
                     if(field3685 == 256) {
                        if(field3693 != -1) {
                           method5450(this.field3687[var7], var2 + this.field3697[var7] + 1, var3 + this.field3676[var7] + 1, var12, var9, field3693);
                        }

                        this.vmethod5439(this.field3687[var7], var2 + this.field3697[var7], var3 + this.field3676[var7], var12, var9, field3692);
                     } else {
                        if(field3693 != -1) {
                           method5404(this.field3687[var7], var2 + this.field3697[var7] + 1, var3 + this.field3676[var7] + 1, var12, var9, field3693, field3685);
                        }

                        this.vmethod5477(this.field3687[var7], var2 + this.field3697[var7], var3 + this.field3676[var7], var12, var9, field3692, field3685);
                     }
                  } else if(field3694 > 0) {
                     field3695 += field3694;
                     var2 += field3695 >> 8;
                     field3695 &= 255;
                  }

                  int var13 = this.field3681[var7];
                  if(field3680 != -1) {
                     class330.method6057(var2, var3 + (int)((double)this.field3682 * 0.7D), var13, field3680);
                  }

                  if(field3688 != -1) {
                     class330.method6057(var2, var3 + this.field3682 + 1, var13, field3688);
                  }

                  var2 += var13;
                  var5 = var7;
               }
            }
         }
      }

   }

   void method5393(byte[] var1) {
      this.field3681 = new int[256];
      int var2;
      if(var1.length == 257) {
         for(var2 = 0; var2 < this.field3681.length; ++var2) {
            this.field3681[var2] = var1[var2] & 255;
         }

         this.field3682 = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.field3681[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[256];
         int[] var4 = new int[256];

         int var5;
         for(var5 = 0; var5 < 256; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var11 = new byte[256][];

         int var8;
         for(int var6 = 0; var6 < 256; ++var6) {
            var11[var6] = new byte[var10[var6]];
            byte var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = var7;
            }
         }

         byte[][] var12 = new byte[256][];

         int var13;
         for(var13 = 0; var13 < 256; ++var13) {
            var12[var13] = new byte[var10[var13]];
            byte var14 = 0;

            for(int var9 = 0; var9 < var12[var13].length; ++var9) {
               var14 += var1[var2++];
               var12[var13][var9] = var14;
            }
         }

         this.field3686 = new byte[65536];

         for(var13 = 0; var13 < 256; ++var13) {
            if(var13 != 32 && var13 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if(var8 != 32 && var8 != 160) {
                     this.field3686[var8 + (var13 << 8)] = (byte)method5451(var11, var12, var4, this.field3681, var10, var13, var8);
                  }
               }
            }
         }

         this.field3682 = var4[32] + var10[32];
      }

   }

   void method5402(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.field3682;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if(var1.charAt(var9) != 0) {
            char var10 = (char)(class175.method3559(var1.charAt(var9), (byte)99) & 255);
            if(var10 == 60) {
               var6 = var9;
            } else {
               int var12;
               int var13;
               int var14;
               if(var10 == 62 && var6 != -1) {
                  String var11 = var1.substring(var6 + 1, var9);
                  var6 = -1;
                  if(var11.equals("lt")) {
                     var10 = 60;
                  } else {
                     if(!var11.equals("gt")) {
                        if(var11.startsWith("img=")) {
                           try {
                              if(var4 != null) {
                                 var12 = var4[var8];
                              } else {
                                 var12 = 0;
                              }

                              if(var5 != null) {
                                 var13 = var5[var8];
                              } else {
                                 var13 = 0;
                              }

                              ++var8;
                              var14 = class64.method1217(var11.substring(4), 1547480966);
                              class333 var15 = field3690[var14];
                              var15.method6173(var12 + var2, var13 + (var3 + this.field3682 - var15.field3887));
                              var2 += var15.field3882;
                              var7 = -1;
                           } catch (Exception var19) {
                              ;
                           }
                        } else {
                           this.method5399(var11);
                        }
                        continue;
                     }

                     var10 = 62;
                  }
               }

               if(var10 == 160) {
                  var10 = 32;
               }

               if(var6 == -1) {
                  if(this.field3686 != null && var7 != -1) {
                     var2 += this.field3686[var10 + (var7 << 8)];
                  }

                  int var17 = this.field3678[var10];
                  var12 = this.field3679[var10];
                  if(var4 != null) {
                     var13 = var4[var8];
                  } else {
                     var13 = 0;
                  }

                  if(var5 != null) {
                     var14 = var5[var8];
                  } else {
                     var14 = 0;
                  }

                  ++var8;
                  if(var10 != 32) {
                     if(field3685 == 256) {
                        if(field3693 != -1) {
                           method5450(this.field3687[var10], var13 + var2 + this.field3697[var10] + 1, var3 + var14 + this.field3676[var10] + 1, var17, var12, field3693);
                        }

                        this.vmethod5439(this.field3687[var10], var13 + var2 + this.field3697[var10], var3 + var14 + this.field3676[var10], var17, var12, field3692);
                     } else {
                        if(field3693 != -1) {
                           method5404(this.field3687[var10], var13 + var2 + this.field3697[var10] + 1, var3 + var14 + this.field3676[var10] + 1, var17, var12, field3693, field3685);
                        }

                        this.vmethod5477(this.field3687[var10], var13 + var2 + this.field3697[var10], var3 + var14 + this.field3676[var10], var17, var12, field3692, field3685);
                     }
                  } else if(field3694 > 0) {
                     field3695 += field3694;
                     var2 += field3695 >> 8;
                     field3695 &= 255;
                  }

                  int var18 = this.field3681[var10];
                  if(field3680 != -1) {
                     class330.method6057(var2, var3 + (int)((double)this.field3682 * 0.7D), var18, field3680);
                  }

                  if(field3688 != -1) {
                     class330.method6057(var2, var3 + this.field3682, var18, field3688);
                  }

                  var2 += var18;
                  var7 = var10;
               }
            }
         }
      }

   }

   int method5383(char var1) {
      if(var1 == 160) {
         var1 = 32;
      }

      return this.field3681[class175.method3559(var1, (byte)66) & 255];
   }

   public int method5454(String var1, int var2) {
      return this.method5385(var1, new int[]{var2}, field3677);
   }

   void method5399(String var1) {
      try {
         int var2;
         String var3;
         if(var1.startsWith("col=")) {
            var3 = var1.substring(4);
            var2 = class105.method2379(var3, 16, true, (byte)30);
            field3692 = var2;
         } else if(var1.equals("/col")) {
            field3692 = field3691;
         } else if(var1.startsWith("str=")) {
            var3 = var1.substring(4);
            var2 = class105.method2379(var3, 16, true, (byte)-3);
            field3680 = var2;
         } else if(var1.equals("str")) {
            field3680 = 8388608;
         } else if(var1.equals("/str")) {
            field3680 = -1;
         } else if(var1.startsWith("u=")) {
            var3 = var1.substring(2);
            var2 = class105.method2379(var3, 16, true, (byte)6);
            field3688 = var2;
         } else if(var1.equals("u")) {
            field3688 = 0;
         } else if(var1.equals("/u")) {
            field3688 = -1;
         } else if(var1.startsWith("shad=")) {
            var3 = var1.substring(5);
            var2 = class105.method2379(var3, 16, true, (byte)68);
            field3693 = var2;
         } else if(var1.equals("shad")) {
            field3693 = 0;
         } else if(var1.equals("/shad")) {
            field3693 = field3689;
         } else if(var1.equals("br")) {
            this.method5398(field3691, field3689);
         }
      } catch (Exception var5) {
         ;
      }

   }

   public int method5397(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if(var1 == null) {
         return 0;
      } else {
         this.method5398(var6, var7);
         if(var10 == 0) {
            var10 = this.field3682;
         }

         int[] var11 = new int[]{var4};
         if(var5 < var10 + this.field3683 + this.field3684 && var5 < var10 + var10) {
            var11 = null;
         }

         int var12 = this.method5385(var1, var11, field3677);
         if(var9 == 3 && var12 == 1) {
            var9 = 1;
         }

         int var13;
         int var14;
         if(var9 == 0) {
            var13 = var3 + this.field3683;
         } else if(var9 == 1) {
            var13 = var3 + (var5 - this.field3683 - this.field3684 - var10 * (var12 - 1)) / 2 + this.field3683;
         } else if(var9 == 2) {
            var13 = var3 + var5 - this.field3684 - var10 * (var12 - 1);
         } else {
            var14 = (var5 - this.field3683 - this.field3684 - var10 * (var12 - 1)) / (var12 + 1);
            if(var14 < 0) {
               var14 = 0;
            }

            var13 = var3 + var14 + this.field3683;
            var10 += var14;
         }

         for(var14 = 0; var14 < var12; ++var14) {
            if(var8 == 0) {
               this.method5447(field3677[var14], var2, var13);
            } else if(var8 == 1) {
               this.method5447(field3677[var14], var2 + (var4 - this.method5384(field3677[var14])) / 2, var13);
            } else if(var8 == 2) {
               this.method5447(field3677[var14], var2 + var4 - this.method5384(field3677[var14]), var13);
            } else if(var14 == var12 - 1) {
               this.method5447(field3677[var14], var2, var13);
            } else {
               this.method5400(field3677[var14], var4);
               this.method5447(field3677[var14], var2, var13);
               field3694 = 0;
            }

            var13 += var10;
         }

         return var12;
      }
   }

   void method5400(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if(var6 == 60) {
            var4 = true;
         } else if(var6 == 62) {
            var4 = false;
         } else if(!var4 && var6 == 32) {
            ++var3;
         }
      }

      if(var3 > 0) {
         field3694 = (var2 - this.method5384(var1) << 8) / var3;
      }

   }

   abstract void vmethod5439(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   abstract void vmethod5477(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public int method5386(String var1, int var2) {
      int var3 = this.method5385(var1, new int[]{var2}, field3677);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.method5384(field3677[var5]);
         if(var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   public void method5392(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method5398(var4, var5);
         this.method5447(var1, var2 - this.method5384(var1) / 2, var3);
      }
   }

   public void method5407(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method5398(var4, var5);
         field3696.setSeed((long)var6);
         field3685 = 192 + (field3696.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if((field3696.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.method5402(var1, var2, var3, var7, (int[])null);
      }
   }

   public void method5389(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method5398(var4, var5);
         this.method5447(var1, var2, var3);
      }
   }

   public void method5391(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method5398(var4, var5);
         this.method5447(var1, var2 - this.method5384(var1), var3);
      }
   }

   public void method5394(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method5398(var4, var5);
         int[] var7 = new int[var1.length()];

         for(int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method5402(var1, var2 - this.method5384(var1) / 2, var3, (int[])null, var7);
      }
   }

   public void method5395(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method5398(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method5402(var1, var2 - this.method5384(var1) / 2, var3, var7, var8);
      }
   }

   public void method5396(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 != null) {
         this.method5398(var4, var5);
         double var8 = 7.0D - (double)var7 / 8.0D;
         if(var8 < 0.0D) {
            var8 = 0.0D;
         }

         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
         }

         this.method5402(var1, var2 - this.method5384(var1) / 2, var3, (int[])null, var10);
      }
   }

   public void method5390(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method5398(var4, var5);
         field3685 = var6;
         this.method5447(var1, var2, var3);
      }
   }

   static int method5451(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if(var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if(var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if(var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if(var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   static void method5450(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * class330.field3865;
      int var7 = class330.field3865 - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if(var2 < class330.field3862) {
         var10 = class330.field3862 - var2;
         var4 -= var10;
         var2 = class330.field3862;
         var9 += var3 * var10;
         var6 += var10 * class330.field3865;
      }

      if(var2 + var4 > class330.field3866) {
         var4 -= var2 + var4 - class330.field3866;
      }

      if(var1 < class330.field3867) {
         var10 = class330.field3867 - var1;
         var3 -= var10;
         var1 = class330.field3867;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if(var3 + var1 > class330.field3868) {
         var10 = var3 + var1 - class330.field3868;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if(var3 > 0 && var4 > 0) {
         method5406(class330.field3864, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   static void method5406(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void method5408(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & '\uff00') * var9 & 16711680) + (var9 * (var2 & 16711935) & -16711936) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & '\uff00') * var9 & 16711680) + ((var12 & 16711935) * var9 & -16711936) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void method5404(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * class330.field3865;
      int var8 = class330.field3865 - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if(var2 < class330.field3862) {
         var11 = class330.field3862 - var2;
         var4 -= var11;
         var2 = class330.field3862;
         var10 += var3 * var11;
         var7 += var11 * class330.field3865;
      }

      if(var2 + var4 > class330.field3866) {
         var4 -= var2 + var4 - class330.field3866;
      }

      if(var1 < class330.field3867) {
         var11 = class330.field3867 - var1;
         var3 -= var11;
         var1 = class330.field3867;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if(var3 + var1 > class330.field3868) {
         var11 = var3 + var1 - class330.field3868;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if(var3 > 0 && var4 > 0) {
         method5408(class330.field3864, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   public static String method5388(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if(var4 == 60 || var4 == 62) {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for(int var7 = 0; var7 < var1; ++var7) {
         char var5 = var0.charAt(var7);
         if(var5 == 60) {
            var6.append("<lt>");
         } else if(var5 == 62) {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }
}
