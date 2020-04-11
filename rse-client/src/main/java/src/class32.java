package src;

public class class32 extends class43 {

   static int field230;
   final int field228;
   class37 field226;
   int field224;
   int field229;
   int field227;
   final class38 field225;


   class32(class222 var1, class222 var2, int var3, class38 var4) {
      super(var1, var2);
      this.field228 = var3;
      this.field225 = var4;
      this.method390((short)18302);
   }

   class37 vmethod710(int var1) {
      return this.field226;
   }

   public int vmethod685(byte var1) {
      return this.field227;
   }

   void method390(short var1) {
      this.field227 = class33.method435(this.field228, 1650295452).method4645((short)128).field3372;
      this.field226 = this.field225.method549(class25.method279(this.field227, 36808725), (byte)93);
      class251 var2 = class25.method279(this.vmethod685((byte)49), -236097721);
      class334 var3 = var2.method4443(false, 1828911427);
      if(var3 != null) {
         this.field224 = var3.field3889;
         this.field229 = var3.field3899;
      } else {
         this.field224 = 0;
         this.field229 = 0;
      }

   }

   int vmethod688(int var1) {
      return this.field224;
   }

   int vmethod693(int var1) {
      return this.field229;
   }

   static void method406(int var0, int var1) {
      client.field893 = 0L;
      if(var0 >= 2) {
         client.field894 = true;
      } else {
         client.field894 = false;
      }

      if(class74.method1327(2095073196) == 1) {
         class42.field318.method1017(765, 503, 133431336);
      } else {
         class42.field318.method1017(7680, 2160, -943083531);
      }

      if(client.field687 >= 25) {
         class196 var2 = class146.method3363(ClientPacket.field2257, client.field761.field1340, -1746993437);
         var2.field2338.readByte(class74.method1327(2092673023), 1258821856);
         var2.field2338.readShort(class37.field277, (byte)-77);
         var2.field2338.readShort(class221.field2525, (byte)-82);
         client.field761.method2361(var2, 348040455);
      }

   }

   public static int method407(int var0, byte var1) {
      return class31.method387(class137.field1757[var0]);
   }
}
