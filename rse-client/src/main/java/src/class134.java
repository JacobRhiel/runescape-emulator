package src;

public class class134 {

   static int[] field1651 = new int[500];
   static int[] field1655 = new int[500];
   static int[] field1650 = new int[500];
   static int[] field1654 = new int[500];
   class141 field1652 = null;
   boolean field1658 = false;
   int field1653 = -1;
   int[] field1649;
   int[] field1648;
   int[] field1656;
   int[] field1657;


   class134(byte[] var1, class141 var2) {
      this.field1652 = var2;
      class309 var3 = new class309(var1);
      class309 var4 = new class309(var1);
      var3.field3710 = 2;
      int var5 = var3.readUnsignedByte((byte)49);
      int var6 = -1;
      int var7 = 0;
      var4.field3710 = var5 + var3.field3710;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.readUnsignedByte((byte)21);
         if(var9 > 0) {
            if(this.field1652.field1809[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if(this.field1652.field1809[var10] == 0) {
                     field1651[var7] = var10;
                     field1655[var7] = 0;
                     field1650[var7] = 0;
                     field1654[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            field1651[var7] = var8;
            short var11 = 0;
            if(this.field1652.field1809[var8] == 3) {
               var11 = 128;
            }

            if((var9 & 1) != 0) {
               field1655[var7] = var4.method5628(1517353363);
            } else {
               field1655[var7] = var11;
            }

            if((var9 & 2) != 0) {
               field1650[var7] = var4.method5628(1517353363);
            } else {
               field1650[var7] = var11;
            }

            if((var9 & 4) != 0) {
               field1654[var7] = var4.method5628(1517353363);
            } else {
               field1654[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if(this.field1652.field1809[var8] == 5) {
               this.field1658 = true;
            }
         }
      }

      if(var1.length != var4.field3710) {
         throw new RuntimeException();
      } else {
         this.field1653 = var7;
         this.field1649 = new int[var7];
         this.field1648 = new int[var7];
         this.field1656 = new int[var7];
         this.field1657 = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            this.field1649[var8] = field1651[var8];
            this.field1648[var8] = field1655[var8];
            this.field1656[var8] = field1650[var8];
            this.field1657[var8] = field1654[var8];
         }

      }
   }
}
