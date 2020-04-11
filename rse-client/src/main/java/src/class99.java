package src;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class class99 {

   public static class243 field1288;
   static class340 field1287;
   String[] field1284;
   Map field1283;
   boolean[] field1282;
   boolean field1286 = false;
   long field1281;


   class99() {
      int var1 = class18.field102.method4246(19, (byte)-9);
      this.field1283 = new HashMap();
      this.field1282 = new boolean[var1];

      int var2;
      for(var2 = 0; var2 < var1; ++var2) {
         class252 var4 = (class252)class252.field3231.method3418((long)var2);
         class252 var3;
         if(var4 != null) {
            var3 = var4;
         } else {
            byte[] var5 = class252.field3232.method4224(19, var2, (byte)-105);
            var4 = new class252();
            if(var5 != null) {
               var4.method4463(new class309(var5), (byte)-75);
            }

            class252.field3231.method3424(var4, (long)var2);
            var3 = var4;
         }

         this.field1282[var2] = var3.field3233;
      }

      var2 = 0;
      if(class18.field102.method4329(15, 2030059947)) {
         var2 = class18.field102.method4246(15, (byte)-35);
      }

      this.field1284 = new String[var2];
      this.method2248(349952581);
   }

   class352 method2246(boolean var1, short var2) {
      return class54.method919("2", class341.field3965.field3109, var1, 2098850883);
   }

   boolean method2250(int var1) {
      return this.field1286;
   }

   void method2247(int var1) {
      class352 var2 = this.method2246(true, (short)6254);

      try {
         int var3 = 3;
         int var4 = 0;
         Iterator var5 = this.field1283.entrySet().iterator();

         while(var5.hasNext()) {
            Entry var6 = (Entry)var5.next();
            int var7 = ((Integer)var6.getKey()).intValue();
            if(this.field1282[var7]) {
               Object var8 = var6.getValue();
               var3 += 3;
               if(var8 instanceof Integer) {
                  var3 += 4;
               } else if(var8 instanceof String) {
                  var3 += class234.method4198((String)var8, (byte)-31);
               }

               ++var4;
            }
         }

         class309 var25 = new class309(var3);
         var25.readByte(2, 1258821856);
         var25.readShort(var4, (byte)-31);
         Iterator var26 = this.field1283.entrySet().iterator();

         while(var26.hasNext()) {
            Entry var14 = (Entry)var26.next();
            int var15 = ((Integer)var14.getKey()).intValue();
            if(this.field1282[var15]) {
               var25.readShort(var15, (byte)-102);
               Object var9 = var14.getValue();
               class3 var10 = class3.method38(var9.getClass(), -1981111471);
               var25.readByte(var10.field9, 1258821856);
               class0 var11 = class3.method40(var9.getClass(), -334212288);
               var11.vmethod64(var9, var25, (byte)3);
            }
         }

         var2.method6653(var25.field3709, 0, var25.field3710, (byte)-67);
      } catch (Exception var23) {
         ;
      } finally {
         try {
            var2.method6648((byte)10);
         } catch (Exception var22) {
            ;
         }

      }

      this.field1286 = false;
      this.field1281 = class217.method4014(-364225251);
   }

   void method2248(int var1) {
      class352 var2 = this.method2246(false, (short)16127);

      label229: {
         try {
            byte[] var3 = new byte[(int)var2.method6650((byte)48)];

            int var5;
            for(int var4 = 0; var4 < var3.length; var4 += var5) {
               var5 = var2.method6658(var3, var4, var3.length - var4, -1347223389);
               if(var5 == -1) {
                  throw new EOFException();
               }
            }

            class309 var15 = new class309(var3);
            if(var15.field3709.length - var15.field3710 >= 1) {
               int var16 = var15.readUnsignedByte((byte)12);
               if(var16 >= 0 && var16 <= 2) {
                  int var8;
                  int var9;
                  int var10;
                  int var17;
                  if(var16 >= 2) {
                     var17 = var15.readShort((byte)34);
                     var8 = 0;

                     while(true) {
                        if(var8 >= var17) {
                           break label229;
                        }

                        var9 = var15.readShort((byte)68);
                        var10 = var15.readUnsignedByte((byte)89);
                        class3 var11 = (class3)class16.method159(class3.method46(1220518321), var10, -1609956543);
                        Object var12 = var11.method42(var15, (byte)22);
                        if(this.field1282[var9]) {
                           this.field1283.put(Integer.valueOf(var9), var12);
                        }

                        ++var8;
                     }
                  } else {
                     var17 = var15.readShort((byte)32);

                     for(var8 = 0; var8 < var17; ++var8) {
                        var9 = var15.readShort((byte)30);
                        var10 = var15.readInt(297718403);
                        if(this.field1282[var9]) {
                           this.field1283.put(Integer.valueOf(var9), Integer.valueOf(var10));
                        }
                     }

                     var8 = var15.readShort((byte)44);
                     var9 = 0;

                     while(true) {
                        if(var9 >= var8) {
                           break label229;
                        }

                        var15.readShort((byte)105);
                        var15.method5667(-754295191);
                        ++var9;
                     }
                  }
               }

               return;
            }
         } catch (Exception var26) {
            break label229;
         } finally {
            try {
               var2.method6648((byte)10);
            } catch (Exception var25) {
               ;
            }

         }

         return;
      }

      this.field1286 = false;
   }

   String method2244(int var1, byte var2) {
      return this.field1284[var1];
   }

   int method2240(int var1, byte var2) {
      Object var3 = this.field1283.get(Integer.valueOf(var1));
      return var3 instanceof Integer?((Integer)var3).intValue():-1;
   }

   void method2239(int var1, int var2, int var3) {
      this.field1283.put(Integer.valueOf(var1), Integer.valueOf(var2));
      if(this.field1282[var1]) {
         this.field1286 = true;
      }

   }

   String method2264(int var1, int var2) {
      Object var3 = this.field1283.get(Integer.valueOf(var1));
      return var3 instanceof String?(String)var3:"";
   }

   void method2266(int var1, String var2, short var3) {
      this.field1284[var1] = var2;
   }

   void method2272(int var1, String var2, int var3) {
      this.field1283.put(Integer.valueOf(var1), var2);
   }

   void method2245(int var1) {
      int var2;
      for(var2 = 0; var2 < this.field1282.length; ++var2) {
         if(!this.field1282[var2]) {
            this.field1283.remove(Integer.valueOf(var2));
         }
      }

      for(var2 = 0; var2 < this.field1284.length; ++var2) {
         this.field1284[var2] = null;
      }

   }

   void method2274(int var1) {
      if(this.field1286 && this.field1281 < class217.method4014(10638835) - 60000L) {
         this.method2247(-1677614475);
      }

   }

   static final void method2280(int var0) {
      if(!class137.field1755) {
         int var1 = class142.field1836;
         int var2 = class142.field1837;
         int var3 = class142.field1838;
         int var4 = class142.field1839;
         byte var5 = 50;
         short var6 = 3500;
         int var7 = (class137.field1754 - class139.field1775) * var5 / class139.field1780;
         int var8 = (class137.field1752 - class139.field1788) * var5 / class139.field1780;
         int var9 = (class137.field1754 - class139.field1775) * var6 / class139.field1780;
         int var10 = (class137.field1752 - class139.field1788) * var6 / class139.field1780;
         int var11 = class139.method3137(var8, var5, var2, var1);
         int var12 = class139.method3104(var8, var5, var2, var1);
         var8 = var11;
         var11 = class139.method3137(var10, var6, var2, var1);
         int var13 = class139.method3104(var10, var6, var2, var1);
         var10 = var11;
         var11 = class139.method3101(var7, var12, var4, var3);
         var12 = class139.method3102(var7, var12, var4, var3);
         var7 = var11;
         var11 = class139.method3101(var9, var13, var4, var3);
         var13 = class139.method3102(var9, var13, var4, var3);
         class137.field1756 = (var7 + var11) / 2;
         class300.field3653 = (var10 + var8) / 2;
         class265.field3456 = (var13 + var12) / 2;
         class137.field1753 = (var11 - var7) / 2;
         class179.field2061 = (var10 - var8) / 2;
         class16.field75 = (var13 - var12) / 2;
         class23.field134 = Math.abs(class137.field1753);
         class137.field1758 = Math.abs(class179.field2061);
         class93.field1182 = Math.abs(class16.field75);
      }
   }

   static int method2281(int var0, int var1, int var2) {
      int var3 = var1 - 334;
      if(var3 < 0) {
         var3 = 0;
      } else if(var3 > 100) {
         var3 = 100;
      }

      int var4 = (client.field850 - client.field897) * var3 / 100 + client.field897;
      return var0 * var4 / 256;
   }
}
