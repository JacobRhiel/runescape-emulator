package src;

public class class161 extends class284 {

   static class245 field1987;
   final boolean field1986;


   public class161(boolean var1) {
      this.field1986 = var1;
   }

   int method3485(class288 var1, class288 var2, int var3) {
      return client.field680 == var1.field3610 && var2.field3610 == client.field680?(this.field1986?var1.method5068(-1106641864).method5240(var2.method5068(-1106641864), (byte)-24):var2.method5068(-1106641864).method5240(var1.method5068(-1106641864), (byte)-21)):this.method5087(var1, var2, 1451673304);
   }

   public int compare(Object var1, Object var2) {
      return this.method3485((class288)var1, (class288)var2, -54374446);
   }

   public static class267 method3477(int var0, int var1) {
      class267 var2 = (class267)class267.field3498.method3418((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = class267.field3504.method4224(4, var0, (byte)-43);
         var2 = new class267();
         if(var3 != null) {
            var2.method4799(new class309(var3), var0, -1372531887);
         }

         var2.method4798(-1555097959);
         class267.field3498.method3424(var2, (long)var0);
         return var2;
      }
   }

   public static class196 method3482(byte var0) {
      return class196.field2341 == 0?new class196():class196.field2336[--class196.field2341];
   }

   static void method3483(class80[] var0, int var1, int var2, int[] var3, int[] var4, int var5) {
      if(var1 < var2) {
         int var6 = var1 - 1;
         int var7 = var2 + 1;
         int var8 = (var2 + var1) / 2;
         class80 var9 = var0[var8];
         var0[var8] = var0[var1];
         var0[var1] = var9;

         label181:
         while(var6 < var7) {
            boolean var10 = true;

            while(true) {
               --var7;
               int var11 = 0;

               while(true) {
                  int var12;
                  int var13;
                  if(var11 < 4) {
                     if(var3[var11] == 2) {
                        var12 = var0[var7].field1054;
                        var13 = var9.field1054;
                     } else if(var3[var11] == 1) {
                        var12 = var0[var7].field1050;
                        var13 = var9.field1050;
                        if(var12 == -1 && var4[var11] == 1) {
                           var12 = 2001;
                        }

                        if(var13 == -1 && var4[var11] == 1) {
                           var13 = 2001;
                        }
                     } else if(var3[var11] == 3) {
                        var12 = var0[var7].method1886((byte)-109)?1:0;
                        var13 = var9.method1886((byte)-41)?1:0;
                     } else {
                        var12 = var0[var7].field1040;
                        var13 = var9.field1040;
                     }

                     if(var12 == var13) {
                        if(var11 == 3) {
                           var10 = false;
                        }

                        ++var11;
                        continue;
                     }

                     if((var4[var11] != 1 || var12 <= var13) && (var4[var11] != 0 || var12 >= var13)) {
                        var10 = false;
                     }
                  }

                  if(!var10) {
                     var10 = true;

                     while(true) {
                        ++var6;
                        var11 = 0;

                        while(true) {
                           if(var11 < 4) {
                              if(var3[var11] == 2) {
                                 var12 = var0[var6].field1054;
                                 var13 = var9.field1054;
                              } else if(var3[var11] == 1) {
                                 var12 = var0[var6].field1050;
                                 var13 = var9.field1050;
                                 if(var12 == -1 && var4[var11] == 1) {
                                    var12 = 2001;
                                 }

                                 if(var13 == -1 && var4[var11] == 1) {
                                    var13 = 2001;
                                 }
                              } else if(var3[var11] == 3) {
                                 var12 = var0[var6].method1886((byte)42)?1:0;
                                 var13 = var9.method1886((byte)-105)?1:0;
                              } else {
                                 var12 = var0[var6].field1040;
                                 var13 = var9.field1040;
                              }

                              if(var12 == var13) {
                                 if(var11 == 3) {
                                    var10 = false;
                                 }

                                 ++var11;
                                 continue;
                              }

                              if((var4[var11] != 1 || var12 >= var13) && (var4[var11] != 0 || var12 <= var13)) {
                                 var10 = false;
                              }
                           }

                           if(!var10) {
                              if(var6 < var7) {
                                 class80 var14 = var0[var6];
                                 var0[var6] = var0[var7];
                                 var0[var7] = var14;
                              }
                              continue label181;
                           }
                           break;
                        }
                     }
                  }
                  break;
               }
            }
         }

         method3483(var0, var1, var7, var3, var4, 943885059);
         method3483(var0, var7 + 1, var2, var3, var4, 943885059);
      }

   }

   static void method3484(int var0) {
      class64.field537 = 99;
      class64.field538 = new byte[4][104][104];
      class348.field4061 = new byte[4][104][104];
      class64.field539 = new byte[4][104][104];
      class64.field540 = new byte[4][104][104];
      class51.field404 = new int[4][105][105];
      class117.field1462 = new byte[4][105][105];
      class64.field545 = new int[105][105];
      class21.field116 = new int[104];
      class168.field2005 = new int[104];
      class260.field3306 = new int[104];
      class64.field554 = new int[104];
      class83.field1086 = new int[104];
   }

   public static int method3486(long var0) {
      return (int)(var0 >>> 7 & 127L);
   }
}
