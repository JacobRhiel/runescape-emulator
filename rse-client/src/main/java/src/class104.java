package src;

import java.io.IOException;

public class class104 {

   static int field1331;
   class314 field1330;
   class270 field1327 = new class270();
   class308 field1337 = new class308('\u9c40');
   int field1328 = 0;
   class309 field1326 = new class309(5000);
   ServerPacket field1332 = null;
   boolean field1335 = true;
   int field1333 = 0;
   ServerPacket field1329;
   ServerPacket field1339;
   public class337 field1340;
   int field1338 = 0;
   int field1336 = 0;
   ServerPacket field1334;


   class314 method2359(int var1) {
      return this.field1330;
   }

   void method2349(int var1) {
      if(this.field1330 != null) {
         this.field1330.vmethod5866((byte)-88);
         this.field1330 = null;
      }

   }

   void method2350(byte var1) {
      this.field1330 = null;
   }

   final void method2345(int var1) {
      this.field1327.method4866();
      this.field1328 = 0;
   }

   public final void method2361(class196 var1, int var2) {
      this.field1327.method4858(var1);
      var1.field2339 = var1.field2338.field3710;
      var1.field2338.field3710 = 0;
      this.field1328 += var1.field2339;
   }

   void method2354(class314 var1, byte var2) {
      this.field1330 = var1;
   }

   final void method2346(int var1) throws IOException {
      if(this.field1330 != null && this.field1328 > 0) {
         this.field1326.field3710 = 0;

         while(true) {
            class196 var2 = (class196)this.field1327.method4860();
            if(var2 == null || var2.field2339 > this.field1326.field3709.length - this.field1326.field3710) {
               this.field1330.vmethod5878(this.field1326.field3709, 0, this.field1326.field3710, -1739395269);
               this.field1336 = 0;
               break;
            }

            this.field1326.method5596(var2.field2338.field3709, 0, var2.field2339, -1590891251);
            this.field1328 -= var2.field2339;
            var2.method3657();
            var2.field2338.method5530((byte)1);
            var2.method3686(-1494953808);
         }
      }

   }

   public static int method2362(int var0, int var1) {
      long var3 = class137.field1757[var0];
      int var2 = (int)(var3 >>> 0 & 127L);
      return var2;
   }

   static void method2368(class268 var0, int var1, int var2, int var3, byte var4) {
      if(client.field936 < 50 && client.field758 != 0) {
         if(var0.field3515 != null && var1 < var0.field3515.length) {
            int var5 = var0.field3515[var1];
            if(var5 != 0) {
               int var6 = var5 >> 8;
               int var7 = var5 >> 4 & 7;
               int var8 = var5 & 15;
               client.field879[client.field936] = var6;
               client.field920[client.field936] = var7;
               client.field876[client.field936] = 0;
               client.field923[client.field936] = null;
               int var9 = (var2 - 64) / 128;
               int var10 = (var3 - 64) / 128;
               client.field953[client.field936] = var8 + (var10 << 8) + (var9 << 16);
               ++client.field936;
            }
         }
      }
   }

   static int method2367(int var0, int var1) {
      class103 var2 = (class103)class100.field1292.get(Integer.valueOf(var0));
      return var2 == null?0:var2.method2332(-2095560133);
   }
}
