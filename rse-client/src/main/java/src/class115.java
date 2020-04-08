package src;

public class class115 {

   int field1446;
   int field1448;
   int field1453 = 2;
   int field1449;
   int field1444;
   int[] field1443 = new int[2];
   int[] field1445 = new int[2];
   int field1452;
   int field1451;
   int field1450;
   int field1447;


   class115() {
      this.field1443[0] = 0;
      this.field1443[1] = '\uffff';
      this.field1445[0] = 0;
      this.field1445[1] = '\uffff';
   }

   final void method2581(class309 var1) {
      this.field1449 = var1.readUnsignedByte((byte)66);
      this.field1450 = var1.method5552(297718403);
      this.field1447 = var1.method5552(297718403);
      this.method2583(var1);
   }

   final void method2584() {
      this.field1446 = 0;
      this.field1444 = 0;
      this.field1451 = 0;
      this.field1452 = 0;
      this.field1448 = 0;
   }

   final void method2583(class309 var1) {
      this.field1453 = var1.readUnsignedByte((byte)98);
      this.field1443 = new int[this.field1453];
      this.field1445 = new int[this.field1453];

      for(int var2 = 0; var2 < this.field1453; ++var2) {
         this.field1443[var2] = var1.readShort((byte)71);
         this.field1445[var2] = var1.readShort((byte)109);
      }

   }

   final int method2585(int var1) {
      if(this.field1448 >= this.field1446) {
         this.field1452 = this.field1445[this.field1444++] << 15;
         if(this.field1444 >= this.field1453) {
            this.field1444 = this.field1453 - 1;
         }

         this.field1446 = (int)((double)this.field1443[this.field1444] / 65536.0D * (double)var1);
         if(this.field1446 > this.field1448) {
            this.field1451 = ((this.field1445[this.field1444] << 15) - this.field1452) / (this.field1446 - this.field1448);
         }
      }

      this.field1452 += this.field1451;
      ++this.field1448;
      return this.field1452 - this.field1451 >> 15;
   }
}
