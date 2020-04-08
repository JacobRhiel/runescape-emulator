package src;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class class151 {

   int field1946;
   public long field1956 = 0L;
   int field1947;
   int field1953 = 0;
   int field1940;
   int field1945;
   int field1943;
   int field1942;
   int field1948;
   int field1941;
   public class144 field1944;
   int field1952;
   int field1951;
   int field1950;


   public static String method3391(long var0) {
      if(var0 > 0L && var0 < 6582952005840035281L) {
         if(var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; var3 != 0L; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5 = new StringBuilder(var2);

            while(var0 != 0L) {
               long var6 = var0;
               var0 /= 37L;
               var5.append(class298.field3644[(int)(var6 - 37L * var0)]);
            }

            return var5.reverse().toString();
         }
      } else {
         return null;
      }
   }

   public static void method3392(class308 var0, int var1) {
      class106 var2 = (class106)class105.field1341.method4860();
      if(var2 != null) {
         int var3 = var0.field3710;
         var0.method5689(var2.field1347, 747474969);

         for(int var4 = 0; var4 < var2.field1353; ++var4) {
            if(var2.field1350[var4] != 0) {
               var0.method5531(var2.field1350[var4], 1258821856);
            } else {
               try {
                  int var5 = var2.field1348[var4];
                  Field var6;
                  int var7;
                  if(var5 == 0) {
                     var6 = var2.field1349[var4];
                     var7 = var6.getInt((Object)null);
                     var0.method5531(0, 1258821856);
                     var0.method5689(var7, 747474969);
                  } else if(var5 == 1) {
                     var6 = var2.field1349[var4];
                     var6.setInt((Object)null, var2.field1351[var4]);
                     var0.method5531(0, 1258821856);
                  } else if(var5 == 2) {
                     var6 = var2.field1349[var4];
                     var7 = var6.getModifiers();
                     var0.method5531(0, 1258821856);
                     var0.method5689(var7, 747474969);
                  }

                  Method var26;
                  if(var5 == 3) {
                     var26 = var2.field1352[var4];
                     byte[][] var11 = var2.field1346[var4];
                     Object[] var8 = new Object[var11.length];

                     for(int var9 = 0; var9 < var11.length; ++var9) {
                        ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var11[var9]));
                        var8[var9] = var10.readObject();
                     }

                     Object var12 = var26.invoke((Object)null, var8);
                     if(var12 == null) {
                        var0.method5531(0, 1258821856);
                     } else if(var12 instanceof Number) {
                        var0.method5531(1, 1258821856);
                        var0.method5529(((Number)var12).longValue());
                     } else if(var12 instanceof String) {
                        var0.method5531(2, 1258821856);
                        var0.method5627((String)var12, 688553335);
                     } else {
                        var0.method5531(4, 1258821856);
                     }
                  } else if(var5 == 4) {
                     var26 = var2.field1352[var4];
                     var7 = var26.getModifiers();
                     var0.method5531(0, 1258821856);
                     var0.method5689(var7, 747474969);
                  }
               } catch (ClassNotFoundException var14) {
                  var0.method5531(-10, 1258821856);
               } catch (InvalidClassException var15) {
                  var0.method5531(-11, 1258821856);
               } catch (StreamCorruptedException var16) {
                  var0.method5531(-12, 1258821856);
               } catch (OptionalDataException var17) {
                  var0.method5531(-13, 1258821856);
               } catch (IllegalAccessException var18) {
                  var0.method5531(-14, 1258821856);
               } catch (IllegalArgumentException var19) {
                  var0.method5531(-15, 1258821856);
               } catch (InvocationTargetException var20) {
                  var0.method5531(-16, 1258821856);
               } catch (SecurityException var21) {
                  var0.method5531(-17, 1258821856);
               } catch (IOException var22) {
                  var0.method5531(-18, 1258821856);
               } catch (NullPointerException var23) {
                  var0.method5531(-19, 1258821856);
               } catch (Exception var24) {
                  var0.method5531(-20, 1258821856);
               } catch (Throwable var25) {
                  var0.method5531(-21, 1258821856);
               }
            }
         }

         var0.method5551(var3, -176240895);
         var2.method3657();
      }
   }

   public static void method3394(File var0, File var1, short var2) {
      try {
         class352 var3 = new class352(class176.field2048, "rw", 10000L);
         class309 var4 = new class309(500);
         var4.method5531(3, 1258821856);
         var4.method5531(var1 != null?1:0, 1258821856);
         var4.method5540(var0.getPath(), -1160654316);
         if(var1 != null) {
            var4.method5540(var1.getPath(), -977254962);
         }

         var3.method6653(var4.field3709, 0, var4.field3710, (byte)47);
         var3.method6648((byte)10);
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }

   static final void method3393(boolean var0, class308 var1, int var2) {
      client.field738 = var0;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      if(!client.field738) {
         int var3 = var1.readShort((byte)33);
         var4 = var1.readUnsignedShort((byte)50);
         var5 = var1.readShort((byte)23);
         class152.field1957 = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               class152.field1957[var6][var7] = var1.method5552(297718403);
               System.out.println(class152.field1957[var6][var7]);
            }
         }

         class260.field3310 = new int[var5];
         class54.field441 = new int[var5];
         class35.field267 = new int[var5];
         class24.field139 = new byte[var5][];
         class23.field132 = new byte[var5][];
         boolean var17 = false;
         if((var4 / 8 == 48 || var4 / 8 == 49) && var3 / 8 == 48) {
            var17 = true;
         }

         if(var4 / 8 == 48 && var3 / 8 == 148) {
            var17 = true;
         }

         var5 = 0;

         for(var7 = (var4 - 6) / 8; var7 <= (var4 + 6) / 8; ++var7) {
            for(var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; ++var8) {
               var9 = var8 + (var7 << 8);
               if(!var17 || var8 != 49 && var8 != 149 && var8 != 147 && var7 != 50 && (var7 != 49 || var8 != 47)) {
                  class260.field3310[var5] = var9;
                  class54.field441[var5] = class27.field162.method4240("m" + var7 + "_" + var8, (short)4643);
                  class35.field267[var5] = class27.field162.method4240("l" + var7 + "_" + var8, (short)-23838);
                  ++var5;
               }
            }
         }

         class20.method237(var4, var3, true, -1462729636);
      } else {
         boolean var16 = var1.readUnsignedByte((byte)58) == 1;
         var4 = var1.readUnsignedShort((byte)44);
         var5 = var1.method5587(-1663235403);
         var6 = var1.readShort((byte)68);
         var1.method5496((byte)86);

         int var10;
         for(var7 = 0; var7 < 4; ++var7) {
            for(var8 = 0; var8 < 13; ++var8) {
               for(var9 = 0; var9 < 13; ++var9) {
                  var10 = var1.method5495(1, (byte)27);
                  if(var10 == 1) {
                     client.field739[var7][var8][var9] = var1.method5495(26, (byte)84);
                  } else {
                     client.field739[var7][var8][var9] = -1;
                  }
               }
            }
         }

         var1.method5498(1730344583);
         class152.field1957 = new int[var6][4];

         for(var7 = 0; var7 < var6; ++var7) {
            for(var8 = 0; var8 < 4; ++var8) {
               class152.field1957[var7][var8] = var1.method5552(297718403);
            }
         }

         class260.field3310 = new int[var6];
         class54.field441 = new int[var6];
         class35.field267 = new int[var6];
         class24.field139 = new byte[var6][];
         class23.field132 = new byte[var6][];
         var6 = 0;

         for(var7 = 0; var7 < 4; ++var7) {
            for(var8 = 0; var8 < 13; ++var8) {
               for(var9 = 0; var9 < 13; ++var9) {
                  var10 = client.field739[var7][var8][var9];
                  if(var10 != -1) {
                     int var11 = var10 >> 14 & 1023;
                     int var12 = var10 >> 3 & 2047;
                     int var13 = (var11 / 8 << 8) + var12 / 8;

                     int var14;
                     for(var14 = 0; var14 < var6; ++var14) {
                        if(class260.field3310[var14] == var13) {
                           var13 = -1;
                           break;
                        }
                     }

                     if(var13 != -1) {
                        class260.field3310[var6] = var13;
                        var14 = var13 >> 8 & 255;
                        int var15 = var13 & 255;
                        class54.field441[var6] = class27.field162.method4240("m" + var14 + "_" + var15, (short)-5653);
                        class35.field267[var6] = class27.field162.method4240("l" + var14 + "_" + var15, (short)368);
                        ++var6;
                     }
                  }
               }
            }
         }

         class20.method237(var4, var5, !var16, -2141391153);
      }

   }

   static void method3390(class245 var0, String var1, byte var2) {
      class67 var3 = new class67(var0, var1);
      client.field951.add(var3);
      client.field898 += var3.field565;
   }
}
