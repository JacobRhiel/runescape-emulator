package src;

public abstract class class243 {

   static class343 field3140 = new class343();
   static int field3143 = 0;
   int[] field3137;
   Object[] field3138;
   Object[][] field3146;
   boolean field3142;
   int[][] field3135;
   class344[] field3136;
   class344 field3131;
   int[] field3133;
   int[] field3134;
   public int field3141;
   boolean field3132;
   int[] field3129;
   int field3128;
   int[] field3130;
   int[][] field3127;


   class243(boolean var1, boolean var2) {
      this.field3142 = var1;
      this.field3132 = var2;
   }

   public int[] method4234(int var1, int var2) {
      return var1 >= 0 && var1 < this.field3135.length?this.field3135[var1]:null;
   }

   public byte[] method4263(int var1, int var2, int[] var3, int var4) {
      if(var1 >= 0 && var1 < this.field3146.length && this.field3146[var1] != null && var2 >= 0 && var2 < this.field3146[var1].length) {
         if(this.field3146[var1][var2] == null) {
            boolean var5 = this.method4239(var1, var3, 1499207460);
            if(!var5) {
               this.vmethod4322(var1, (byte)-48);
               var5 = this.method4239(var1, var3, 1499207460);
               if(!var5) {
                  return null;
               }
            }
         }

         byte[] var6 = class39.method644(this.field3146[var1][var2], false, -185232058);
         if(this.field3132) {
            this.field3146[var1][var2] = null;
         }

         return var6;
      } else {
         return null;
      }
   }

   public int method4235(byte var1) {
      return this.field3146.length;
   }

   public byte[] method4231(int var1, int var2) {
      if(this.field3146.length == 1) {
         return this.method4224(0, var1, (byte)-120);
      } else if(this.field3146[var1].length == 1) {
         return this.method4224(var1, 0, (byte)-88);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] method4232(int var1, int var2, int var3) {
      if(var1 >= 0 && var1 < this.field3146.length && this.field3146[var1] != null && var2 >= 0 && var2 < this.field3146[var1].length) {
         if(this.field3146[var1][var2] == null) {
            boolean var4 = this.method4239(var1, (int[])null, 1499207460);
            if(!var4) {
               this.vmethod4322(var1, (byte)-122);
               var4 = this.method4239(var1, (int[])null, 1499207460);
               if(!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = class39.method644(this.field3146[var1][var2], false, -1320974572);
         return var5;
      } else {
         return null;
      }
   }

   public boolean method4238(int var1, int var2, int var3) {
      if(var1 >= 0 && var1 < this.field3146.length && this.field3146[var1] != null && var2 >= 0 && var2 < this.field3146[var1].length) {
         if(this.field3146[var1][var2] != null) {
            return true;
         } else if(this.field3138[var1] != null) {
            return true;
         } else {
            this.vmethod4322(var1, (byte)-65);
            return this.field3138[var1] != null;
         }
      } else {
         return false;
      }
   }

   public byte[] method4224(int var1, int var2, byte var3) {
      return this.method4263(var1, var2, (int[])null, 867631074);
   }

   void vmethod4322(int var1, byte var2) {}

   public byte[] method4225(int var1, byte var2) {
      if(this.field3146.length == 1) {
         return this.method4232(0, var1, 1209733320);
      } else if(this.field3146[var1].length == 1) {
         return this.method4232(var1, 0, 1528478123);
      } else {
         throw new RuntimeException();
      }
   }

   public int method4246(int var1, byte var2) {
      return this.field3146[var1].length;
   }

   int vmethod4346(int var1, byte var2) {
      return this.field3138[var1] != null?100:0;
   }

   void method4222(byte[] var1, int var2) {
      this.field3141 = class19.method225(var1, var1.length, -1953007669);
      class309 var3 = new class309(class217.method4013(var1, -1768210051));
      int var4 = var3.readUnsignedByte((byte)72);
      if(var4 >= 5 && var4 <= 7) {
         if(var4 >= 6) {
            var3.method5552(297718403);
         }

         int var5 = var3.readUnsignedByte((byte)99);
         if(var4 >= 7) {
            this.field3128 = var3.method5751(1537726341);
         } else {
            this.field3128 = var3.readShort((byte)87);
         }

         int var6 = 0;
         int var7 = -1;
         this.field3137 = new int[this.field3128];
         int var8;
         if(var4 >= 7) {
            for(var8 = 0; var8 < this.field3128; ++var8) {
               this.field3137[var8] = var6 += var3.method5751(1111897430);
               if(this.field3137[var8] > var7) {
                  var7 = this.field3137[var8];
               }
            }
         } else {
            for(var8 = 0; var8 < this.field3128; ++var8) {
               this.field3137[var8] = var6 += var3.readShort((byte)101);
               if(this.field3137[var8] > var7) {
                  var7 = this.field3137[var8];
               }
            }
         }

         this.field3129 = new int[var7 + 1];
         this.field3133 = new int[var7 + 1];
         this.field3134 = new int[var7 + 1];
         this.field3135 = new int[var7 + 1][];
         this.field3138 = new Object[var7 + 1];
         this.field3146 = new Object[var7 + 1][];
         if(var5 != 0) {
            this.field3130 = new int[var7 + 1];

            for(var8 = 0; var8 < this.field3128; ++var8) {
               this.field3130[this.field3137[var8]] = var3.method5552(297718403);
            }

            this.field3131 = new class344(this.field3130);
         }

         for(var8 = 0; var8 < this.field3128; ++var8) {
            this.field3129[this.field3137[var8]] = var3.method5552(297718403);
         }

         for(var8 = 0; var8 < this.field3128; ++var8) {
            this.field3133[this.field3137[var8]] = var3.method5552(297718403);
         }

         for(var8 = 0; var8 < this.field3128; ++var8) {
            this.field3134[this.field3137[var8]] = var3.readShort((byte)26);
         }

         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         if(var4 >= 7) {
            for(var8 = 0; var8 < this.field3128; ++var8) {
               var9 = this.field3137[var8];
               var10 = this.field3134[var9];
               var6 = 0;
               var11 = -1;
               this.field3135[var9] = new int[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var13 = this.field3135[var9][var12] = var6 += var3.method5751(958741216);
                  if(var13 > var11) {
                     var11 = var13;
                  }
               }

               this.field3146[var9] = new Object[var11 + 1];
            }
         } else {
            for(var8 = 0; var8 < this.field3128; ++var8) {
               var9 = this.field3137[var8];
               var10 = this.field3134[var9];
               var6 = 0;
               var11 = -1;
               this.field3135[var9] = new int[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var13 = this.field3135[var9][var12] = var6 += var3.readShort((byte)51);
                  if(var13 > var11) {
                     var11 = var13;
                  }
               }

               this.field3146[var9] = new Object[var11 + 1];
            }
         }

         if(var5 != 0) {
            this.field3127 = new int[var7 + 1][];
            this.field3136 = new class344[var7 + 1];

            for(var8 = 0; var8 < this.field3128; ++var8) {
               var9 = this.field3137[var8];
               var10 = this.field3134[var9];
               this.field3127[var9] = new int[this.field3146[var9].length];

               for(var11 = 0; var11 < var10; ++var11) {
                  this.field3127[var9][this.field3135[var9][var11]] = var3.method5552(297718403);
               }

               this.field3136[var9] = new class344(this.field3127[var9]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   public boolean method4241(String var1, String var2, int var3) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field3131.method6594(class256.method4533(var1, -906146296), 1863702029);
      int var5 = this.field3136[var4].method6594(class256.method4533(var2, -703976719), -2045442128);
      return this.method4238(var4, var5, 1871586288);
   }

   void vmethod4321(int var1, byte var2) {}

   public boolean method4250(int var1, byte var2) {
      if(this.field3138[var1] != null) {
         return true;
      } else {
         this.vmethod4322(var1, (byte)-50);
         return this.field3138[var1] != null;
      }
   }

   public boolean method4299(String var1, String var2, int var3) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field3131.method6594(class256.method4533(var1, -2103318126), 236563562);
      if(var4 < 0) {
         return false;
      } else {
         int var5 = this.field3136[var4].method6594(class256.method4533(var2, -1375483313), 1811190208);
         return var5 >= 0;
      }
   }

   public int method4240(String var1, short var2) {
      var1 = var1.toLowerCase();
      return this.field3131.method6594(class256.method4533(var1, 1768819219), -44557237);
   }

   public int method4233(int var1, String var2, int var3) {
      var2 = var2.toLowerCase();
      return this.field3136[var1].method6594(class256.method4533(var2, -862553073), -1690036589);
   }

   public boolean method4227(int var1, int var2) {
      if(this.field3146.length == 1) {
         return this.method4238(0, var1, 1845653958);
      } else if(this.field3146[var1].length == 1) {
         return this.method4238(var1, 0, 1940165874);
      } else {
         throw new RuntimeException();
      }
   }

   boolean method4239(int var1, int[] var2, int var3) {
      if(this.field3138[var1] == null) {
         return false;
      } else {
         int var4 = this.field3134[var1];
         int[] var5 = this.field3135[var1];
         Object[] var6 = this.field3146[var1];
         boolean var7 = true;

         for(int var8 = 0; var8 < var4; ++var8) {
            if(var6[var5[var8]] == null) {
               var7 = false;
               break;
            }
         }

         if(var7) {
            return true;
         } else {
            byte[] var22;
            if(var2 != null && (var2[0] != 0 || var2[1] != 0 || var2[2] != 0 || var2[3] != 0)) {
               var22 = class39.method644(this.field3138[var1], true, -1844589800);
               class309 var9 = new class309(var22);
               var9.method5727(var2, 5, var9.field3709.length, -189170169);
            } else {
               var22 = class39.method644(this.field3138[var1], false, -1169948803);
            }

            byte[] var26 = class217.method4013(var22, -472194185);
            if(this.field3142) {
               this.field3138[var1] = null;
            }

            int var11;
            if(var4 > 1) {
               int var10 = var26.length;
               --var10;
               var11 = var26[var10] & 255;
               var10 -= var4 * var11 * 4;
               class309 var12 = new class309(var26);
               int[] var13 = new int[var4];
               var12.field3710 = var10;

               int var15;
               int var16;
               for(int var14 = 0; var14 < var11; ++var14) {
                  var15 = 0;

                  for(var16 = 0; var16 < var4; ++var16) {
                     var15 += var12.method5552(297718403);
                     var13[var16] += var15;
                  }
               }

               byte[][] var24 = new byte[var4][];

               for(var15 = 0; var15 < var4; ++var15) {
                  var24[var15] = new byte[var13[var15]];
                  var13[var15] = 0;
               }

               var12.field3710 = var10;
               var15 = 0;

               int var18;
               for(var16 = 0; var16 < var11; ++var16) {
                  int var17 = 0;

                  for(var18 = 0; var18 < var4; ++var18) {
                     var17 += var12.method5552(297718403);
                     System.arraycopy(var26, var15, var24[var18], var13[var18], var17);
                     var13[var18] += var17;
                     var15 += var17;
                  }
               }

               for(var16 = 0; var16 < var4; ++var16) {
                  if(!this.field3132) {
                     var18 = var5[var16];
                     byte[] var20 = var24[var16];
                     Object var19;
                     if(var20 == null) {
                        var19 = null;
                     } else if(var20.length > 136) {
                        class215 var21 = new class215();
                        var21.vmethod4006(var20, (byte)0);
                        var19 = var21;
                     } else {
                        var19 = var20;
                     }

                     var6[var18] = var19;
                  } else {
                     var6[var5[var16]] = var24[var16];
                  }
               }
            } else if(!this.field3132) {
               var11 = var5[0];
               Object var27;
               if(var26 == null) {
                  var27 = null;
               } else if(var26.length > 136) {
                  class215 var28 = new class215();
                  var28.vmethod4006(var26, (byte)0);
                  var27 = var28;
               } else {
                  var27 = var26;
               }

               var6[var11] = var27;
            } else {
               var6[var5[0]] = var26;
            }

            return true;
         }
      }
   }

   public byte[] method4223(String var1, String var2, int var3) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field3131.method6594(class256.method4533(var1, 47129089), -1974610778);
      int var5 = this.field3136[var4].method6594(class256.method4533(var2, 276129338), 1364949468);
      return this.method4224(var4, var5, (byte)-55);
   }

   public void method4236(int var1) {
      for(int var2 = 0; var2 < this.field3138.length; ++var2) {
         this.field3138[var2] = null;
      }

   }

   public void method4273(byte var1) {
      for(int var2 = 0; var2 < this.field3146.length; ++var2) {
         if(this.field3146[var2] != null) {
            for(int var3 = 0; var3 < this.field3146[var2].length; ++var3) {
               this.field3146[var2][var3] = null;
            }
         }
      }

   }

   public boolean method4229(int var1) {
      boolean var2 = true;

      for(int var3 = 0; var3 < this.field3137.length; ++var3) {
         int var4 = this.field3137[var3];
         if(this.field3138[var4] == null) {
            this.vmethod4322(var4, (byte)-42);
            if(this.field3138[var4] == null) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public boolean method4245(String var1, short var2) {
      var1 = var1.toLowerCase();
      int var3 = this.field3131.method6594(class256.method4533(var1, -834042878), 1826284219);
      return this.method4250(var3, (byte)-74);
   }

   public int method4261(String var1, byte var2) {
      var1 = var1.toLowerCase();
      int var3 = this.field3131.method6594(class256.method4533(var1, -1191987049), 1199374760);
      return this.vmethod4346(var3, (byte)9);
   }

   public void method4260(String var1, int var2) {
      var1 = var1.toLowerCase();
      int var3 = this.field3131.method6594(class256.method4533(var1, 1072032882), 629789787);
      if(var3 >= 0) {
         this.vmethod4321(var3, (byte)-11);
      }
   }

   public void method4237(int var1, int var2) {
      for(int var3 = 0; var3 < this.field3146[var1].length; ++var3) {
         this.field3146[var1][var3] = null;
      }

   }
}
