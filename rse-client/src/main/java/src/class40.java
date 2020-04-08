package src;

public class class40 {

   static final class40 field302 = new class40(0);
   static final class40 field303 = new class40(1);
   static class226 field307;
   static class333[] field306;
   final int field310;


   class40(int var1) {
      this.field310 = var1;
   }

   static final void method648(class308 var0, byte var1) {
      int var2 = 0;
      var0.method5496((byte)-50);

      int var3;
      int var4;
      int var5;
      for(var3 = 0; var3 < class98.field1278; ++var3) {
         var4 = class98.field1271[var3];
         if((class98.field1267[var4] & 1) == 0) {
            if(var2 > 0) {
               --var2;
               class98.field1267[var4] = (byte)(class98.field1267[var4] | 2);
            } else {
               var5 = var0.method5495(1, (byte)99);
               if(var5 == 0) {
                  var2 = class63.method1200(var0, 537227900);
                  class98.field1267[var4] = (byte)(class98.field1267[var4] | 2);
               } else {
                  class25.method278(var0, var4, (short)10549);
               }
            }
         }
      }

      var0.method5498(-141464408);
      if(var2 != 0) {
         throw new RuntimeException();
      } else {
         var0.method5496((byte)-47);

         for(var3 = 0; var3 < class98.field1278; ++var3) {
            var4 = class98.field1271[var3];
            if((class98.field1267[var4] & 1) != 0) {
               if(var2 > 0) {
                  --var2;
                  class98.field1267[var4] = (byte)(class98.field1267[var4] | 2);
               } else {
                  var5 = var0.method5495(1, (byte)-10);
                  if(var5 == 0) {
                     var2 = class63.method1200(var0, 282500303);
                     class98.field1267[var4] = (byte)(class98.field1267[var4] | 2);
                  } else {
                     class25.method278(var0, var4, (short)18742);
                  }
               }
            }
         }

         var0.method5498(-1757420255);
         if(var2 != 0) {
            throw new RuntimeException();
         } else {
            var0.method5496((byte)-37);

            for(var3 = 0; var3 < class98.field1272; ++var3) {
               var4 = class98.field1270[var3];
               if((class98.field1267[var4] & 1) != 0) {
                  if(var2 > 0) {
                     --var2;
                     class98.field1267[var4] = (byte)(class98.field1267[var4] | 2);
                  } else {
                     var5 = var0.method5495(1, (byte)92);
                     if(var5 == 0) {
                        var2 = class63.method1200(var0, -1781517790);
                        class98.field1267[var4] = (byte)(class98.field1267[var4] | 2);
                     } else if(class22.method257(var0, var4, (byte)127)) {
                        class98.field1267[var4] = (byte)(class98.field1267[var4] | 2);
                     }
                  }
               }
            }

            var0.method5498(-448898557);
            if(var2 != 0) {
               throw new RuntimeException();
            } else {
               var0.method5496((byte)24);

               for(var3 = 0; var3 < class98.field1272; ++var3) {
                  var4 = class98.field1270[var3];
                  if((class98.field1267[var4] & 1) == 0) {
                     if(var2 > 0) {
                        --var2;
                        class98.field1267[var4] = (byte)(class98.field1267[var4] | 2);
                     } else {
                        var5 = var0.method5495(1, (byte)93);
                        if(var5 == 0) {
                           var2 = class63.method1200(var0, -767275623);
                           class98.field1267[var4] = (byte)(class98.field1267[var4] | 2);
                        } else if(class22.method257(var0, var4, (byte)127)) {
                           class98.field1267[var4] = (byte)(class98.field1267[var4] | 2);
                        }
                     }
                  }
               }

               var0.method5498(-1266425720);
               if(var2 != 0) {
                  throw new RuntimeException();
               } else {
                  class98.field1278 = 0;
                  class98.field1272 = 0;

                  for(var3 = 1; var3 < 2048; ++var3) {
                     class98.field1267[var3] = (byte)(class98.field1267[var3] >> 1);
                     class75 var6 = client.players[var3];
                     if(var6 != null) {
                        class98.field1271[++class98.field1278 - 1] = var3;
                     } else {
                        class98.field1270[++class98.field1272 - 1] = var3;
                     }
                  }

               }
            }
         }
      }
   }
}
