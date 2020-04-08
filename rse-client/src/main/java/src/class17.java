package src;

import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Comparator;

final class class17 implements Comparator {

   static int field91;


   int method170(class16 var1, class16 var2, byte var3) {
      return var1.field85.field100 < var2.field85.field100?-1:(var2.field85.field100 == var1.field85.field100?0:1);
   }

   public int compare(Object var1, Object var2) {
      return this.method170((class16)var1, (class16)var2, (byte)-105);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static void method179(Component var0, int var1) {
      var0.addMouseListener(class63.field510);
      var0.addMouseMotionListener(class63.field510);
      var0.addFocusListener(class63.field510);
   }

   static class226 method181(class226 var0, byte var1) {
      int var2 = class57.method958(class71.method1283(var0, -1876754341), (short)-1870);
      if(var2 == 0) {
         return null;
      } else {
         for(int var3 = 0; var3 < var2; ++var3) {
            var0 = class208.method3898(var0.field2586, (byte)-4);
            if(var0 == null) {
               return null;
            }
         }

         return var0;
      }
   }

   public static void method169(class309 var0, int var1, short var2) {
      class106 var3 = new class106();
      var3.field1353 = var0.readUnsignedByte((byte)103);
      var3.field1347 = var0.method5552(297718403);
      var3.field1348 = new int[var3.field1353];
      var3.field1350 = new int[var3.field1353];
      var3.field1349 = new Field[var3.field1353];
      var3.field1351 = new int[var3.field1353];
      var3.field1352 = new Method[var3.field1353];
      var3.field1346 = new byte[var3.field1353][][];

      for(int var4 = 0; var4 < var3.field1353; ++var4) {
         try {
            int var5 = var0.readUnsignedByte((byte)17);
            String var6;
            String var7;
            int var8;
            if(var5 != 0 && var5 != 1 && var5 != 2) {
               if(var5 == 3 || var5 == 4) {
                  var6 = var0.method5667(-1554167460);
                  var7 = var0.method5667(-1625090508);
                  var8 = var0.readUnsignedByte((byte)105);
                  String[] var9 = new String[var8];

                  for(int var10 = 0; var10 < var8; ++var10) {
                     var9[var10] = var0.method5667(-1916463378);
                  }

                  String var21 = var0.method5667(-1103123488);
                  byte[][] var11 = new byte[var8][];
                  int var13;
                  if(var5 == 3) {
                     for(int var12 = 0; var12 < var8; ++var12) {
                        var13 = var0.method5552(297718403);
                        var11[var12] = new byte[var13];
                        var0.method5620(var11[var12], 0, var13, -1770968214);
                     }
                  }

                  var3.field1348[var4] = var5;
                  Class[] var22 = new Class[var8];

                  for(var13 = 0; var13 < var8; ++var13) {
                     var22[var13] = class2.method24(var9[var13], (byte)-80);
                  }

                  Class var23 = class2.method24(var21, (byte)-9);
                  if(class2.method24(var6, (byte)2).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var14 = class2.method24(var6, (byte)-45).getDeclaredMethods();
                  Method[] var15 = var14;

                  for(int var16 = 0; var16 < var15.length; ++var16) {
                     Method var17 = var15[var16];
                     if(var17.getName().equals(var7)) {
                        Class[] var18 = var17.getParameterTypes();
                        if(var22.length == var18.length) {
                           boolean var19 = true;

                           for(int var20 = 0; var20 < var22.length; ++var20) {
                              if(var18[var20] != var22[var20]) {
                                 var19 = false;
                                 break;
                              }
                           }

                           if(var19 && var23 == var17.getReturnType()) {
                              var3.field1352[var4] = var17;
                           }
                        }
                     }
                  }

                  var3.field1346[var4] = var11;
               }
            } else {
               var6 = var0.method5667(-1899434427);
               var7 = var0.method5667(-1464121173);
               var8 = 0;
               if(var5 == 1) {
                  var8 = var0.method5552(297718403);
               }

               var3.field1348[var4] = var5;
               var3.field1351[var4] = var8;
               if(class2.method24(var6, (byte)15).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var3.field1349[var4] = class2.method24(var6, (byte)-52).getDeclaredField(var7);
            }
         } catch (ClassNotFoundException var25) {
            var3.field1350[var4] = -1;
         } catch (SecurityException var26) {
            var3.field1350[var4] = -2;
         } catch (NullPointerException var27) {
            var3.field1350[var4] = -3;
         } catch (Exception var28) {
            var3.field1350[var4] = -4;
         } catch (Throwable var29) {
            var3.field1350[var4] = -5;
         }
      }

      class105.field1341.method4858(var3);
   }
}
