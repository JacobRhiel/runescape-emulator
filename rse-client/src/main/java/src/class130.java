package src;

public class class130 extends class144 {

   static int[] field1603 = class139.field1794;
   static int[] field1576 = new int[10000];
   static int[] field1604 = class139.field1795;
   static int[] field1601 = new int[10000];
   static int field1588 = 0;
   boolean field1565 = false;
   int[] field1585;
   int[] field1566;
   class138[] field1590;
   int field1598 = 0;
   short[] field1578;
   int field1569 = 0;
   int field1595;
   int[] field1586;
   int[] field1592;
   int[] field1568;
   byte[] field1573;
   short[] field1577;
   class138[] field1591;
   int field1597;
   int field1567;
   class146[] field1572;
   int[] field1570;
   int[][] field1600;
   int field1599;
   byte field1579 = 0;
   int[][] field1596;
   int[] field1589;
   int field1594;
   int field1580;
   int[] field1571;
   public short field1587;
   byte[] field1602;
   public short field1593;
   byte[] field1575;
   byte[] field1581;
   byte[] field1574;
   short[] field1582;
   short[] field1583;
   short[] field1584;


   class130() {}

   public class130(class130[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      this.field1598 = 0;
      this.field1569 = 0;
      this.field1580 = 0;
      this.field1579 = -1;

      int var9;
      class130 var10;
      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if(var10 != null) {
            this.field1598 += var10.field1598;
            this.field1569 += var10.field1569;
            this.field1580 += var10.field1580;
            if(var10.field1574 != null) {
               var4 = true;
            } else {
               if(this.field1579 == -1) {
                  this.field1579 = var10.field1579;
               }

               if(this.field1579 != var10.field1579) {
                  var4 = true;
               }
            }

            var3 |= var10.field1573 != null;
            var5 |= var10.field1575 != null;
            var6 |= var10.field1586 != null;
            var7 |= var10.field1578 != null;
            var8 |= var10.field1602 != null;
         }
      }

      this.field1566 = new int[this.field1598];
      this.field1592 = new int[this.field1598];
      this.field1568 = new int[this.field1598];
      this.field1585 = new int[this.field1598];
      this.field1570 = new int[this.field1569];
      this.field1571 = new int[this.field1569];
      this.field1589 = new int[this.field1569];
      if(var3) {
         this.field1573 = new byte[this.field1569];
      }

      if(var4) {
         this.field1574 = new byte[this.field1569];
      }

      if(var5) {
         this.field1575 = new byte[this.field1569];
      }

      if(var6) {
         this.field1586 = new int[this.field1569];
      }

      if(var7) {
         this.field1578 = new short[this.field1569];
      }

      if(var8) {
         this.field1602 = new byte[this.field1569];
      }

      this.field1577 = new short[this.field1569];
      if(this.field1580 > 0) {
         this.field1581 = new byte[this.field1580];
         this.field1582 = new short[this.field1580];
         this.field1583 = new short[this.field1580];
         this.field1584 = new short[this.field1580];
      }

      this.field1598 = 0;
      this.field1569 = 0;
      this.field1580 = 0;

      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if(var10 != null) {
            int var11;
            for(var11 = 0; var11 < var10.field1569; ++var11) {
               if(var3 && var10.field1573 != null) {
                  this.field1573[this.field1569] = var10.field1573[var11];
               }

               if(var4) {
                  if(var10.field1574 != null) {
                     this.field1574[this.field1569] = var10.field1574[var11];
                  } else {
                     this.field1574[this.field1569] = var10.field1579;
                  }
               }

               if(var5 && var10.field1575 != null) {
                  this.field1575[this.field1569] = var10.field1575[var11];
               }

               if(var6 && var10.field1586 != null) {
                  this.field1586[this.field1569] = var10.field1586[var11];
               }

               if(var7) {
                  if(var10.field1578 != null) {
                     this.field1578[this.field1569] = var10.field1578[var11];
                  } else {
                     this.field1578[this.field1569] = -1;
                  }
               }

               if(var8) {
                  if(var10.field1602 != null && var10.field1602[var11] != -1) {
                     this.field1602[this.field1569] = (byte)(this.field1580 + var10.field1602[var11]);
                  } else {
                     this.field1602[this.field1569] = -1;
                  }
               }

               this.field1577[this.field1569] = var10.field1577[var11];
               this.field1570[this.field1569] = this.method2870(var10, var10.field1570[var11]);
               this.field1571[this.field1569] = this.method2870(var10, var10.field1571[var11]);
               this.field1589[this.field1569] = this.method2870(var10, var10.field1589[var11]);
               ++this.field1569;
            }

            for(var11 = 0; var11 < var10.field1580; ++var11) {
               byte var12 = this.field1581[this.field1580] = var10.field1581[var11];
               if(var12 == 0) {
                  this.field1582[this.field1580] = (short)this.method2870(var10, var10.field1582[var11]);
                  this.field1583[this.field1580] = (short)this.method2870(var10, var10.field1583[var11]);
                  this.field1584[this.field1580] = (short)this.method2870(var10, var10.field1584[var11]);
               }

               ++this.field1580;
            }
         }
      }

   }

   class130(byte[] var1) {
      if(var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.method2880(var1);
      } else {
         this.method2868(var1);
      }

   }

   public class130(class130 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.field1598 = var1.field1598;
      this.field1569 = var1.field1569;
      this.field1580 = var1.field1580;
      int var6;
      if(var2) {
         this.field1566 = var1.field1566;
         this.field1592 = var1.field1592;
         this.field1568 = var1.field1568;
      } else {
         this.field1566 = new int[this.field1598];
         this.field1592 = new int[this.field1598];
         this.field1568 = new int[this.field1598];

         for(var6 = 0; var6 < this.field1598; ++var6) {
            this.field1566[var6] = var1.field1566[var6];
            this.field1592[var6] = var1.field1592[var6];
            this.field1568[var6] = var1.field1568[var6];
         }
      }

      if(var3) {
         this.field1577 = var1.field1577;
      } else {
         this.field1577 = new short[this.field1569];

         for(var6 = 0; var6 < this.field1569; ++var6) {
            this.field1577[var6] = var1.field1577[var6];
         }
      }

      if(!var4 && var1.field1578 != null) {
         this.field1578 = new short[this.field1569];

         for(var6 = 0; var6 < this.field1569; ++var6) {
            this.field1578[var6] = var1.field1578[var6];
         }
      } else {
         this.field1578 = var1.field1578;
      }

      this.field1575 = var1.field1575;
      this.field1570 = var1.field1570;
      this.field1571 = var1.field1571;
      this.field1589 = var1.field1589;
      this.field1573 = var1.field1573;
      this.field1574 = var1.field1574;
      this.field1602 = var1.field1602;
      this.field1579 = var1.field1579;
      this.field1581 = var1.field1581;
      this.field1582 = var1.field1582;
      this.field1583 = var1.field1583;
      this.field1584 = var1.field1584;
      this.field1585 = var1.field1585;
      this.field1586 = var1.field1586;
      this.field1600 = var1.field1600;
      this.field1596 = var1.field1596;
      this.field1590 = var1.field1590;
      this.field1572 = var1.field1572;
      this.field1591 = var1.field1591;
      this.field1587 = var1.field1587;
      this.field1593 = var1.field1593;
   }

   void method2885() {
      if(!this.field1565) {
         super.field1883 = 0;
         this.field1567 = 0;
         this.field1595 = 999999;
         this.field1597 = -999999;
         this.field1594 = -99999;
         this.field1599 = 99999;

         for(int var1 = 0; var1 < this.field1598; ++var1) {
            int var2 = this.field1566[var1];
            int var3 = this.field1592[var1];
            int var4 = this.field1568[var1];
            if(var2 < this.field1595) {
               this.field1595 = var2;
            }

            if(var2 > this.field1597) {
               this.field1597 = var2;
            }

            if(var4 < this.field1599) {
               this.field1599 = var4;
            }

            if(var4 > this.field1594) {
               this.field1594 = var4;
            }

            if(-var3 > super.field1883) {
               super.field1883 = -var3;
            }

            if(var3 > this.field1567) {
               this.field1567 = var3;
            }
         }

         this.field1565 = true;
      }
   }

   public void method2883() {
      if(this.field1590 == null) {
         this.field1590 = new class138[this.field1598];

         int var1;
         for(var1 = 0; var1 < this.field1598; ++var1) {
            this.field1590[var1] = new class138();
         }

         for(var1 = 0; var1 < this.field1569; ++var1) {
            int var2 = this.field1570[var1];
            int var3 = this.field1571[var1];
            int var4 = this.field1589[var1];
            int var5 = this.field1566[var3] - this.field1566[var2];
            int var6 = this.field1592[var3] - this.field1592[var2];
            int var7 = this.field1568[var3] - this.field1568[var2];
            int var8 = this.field1566[var4] - this.field1566[var2];
            int var9 = this.field1592[var4] - this.field1592[var2];
            int var10 = this.field1568[var4] - this.field1568[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if(var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if(this.field1573 == null) {
               var15 = 0;
            } else {
               var15 = this.field1573[var1];
            }

            if(var15 == 0) {
               class138 var16 = this.field1590[var2];
               var16.field1768 += var11;
               var16.field1765 += var12;
               var16.field1766 += var13;
               ++var16.field1767;
               var16 = this.field1590[var3];
               var16.field1768 += var11;
               var16.field1765 += var12;
               var16.field1766 += var13;
               ++var16.field1767;
               var16 = this.field1590[var4];
               var16.field1768 += var11;
               var16.field1765 += var12;
               var16.field1766 += var13;
               ++var16.field1767;
            } else if(var15 == 1) {
               if(this.field1572 == null) {
                  this.field1572 = new class146[this.field1569];
               }

               class146 var17 = this.field1572[var1] = new class146();
               var17.field1898 = var11;
               var17.field1895 = var12;
               var17.field1896 = var13;
            }
         }

      }
   }

   void method2884() {
      this.field1590 = null;
      this.field1591 = null;
      this.field1572 = null;
      this.field1565 = false;
   }

   public class130 method2871() {
      class130 var1 = new class130();
      if(this.field1573 != null) {
         var1.field1573 = new byte[this.field1569];

         for(int var2 = 0; var2 < this.field1569; ++var2) {
            var1.field1573[var2] = this.field1573[var2];
         }
      }

      var1.field1598 = this.field1598;
      var1.field1569 = this.field1569;
      var1.field1580 = this.field1580;
      var1.field1566 = this.field1566;
      var1.field1592 = this.field1592;
      var1.field1568 = this.field1568;
      var1.field1570 = this.field1570;
      var1.field1571 = this.field1571;
      var1.field1589 = this.field1589;
      var1.field1574 = this.field1574;
      var1.field1575 = this.field1575;
      var1.field1602 = this.field1602;
      var1.field1577 = this.field1577;
      var1.field1578 = this.field1578;
      var1.field1579 = this.field1579;
      var1.field1581 = this.field1581;
      var1.field1582 = this.field1582;
      var1.field1583 = this.field1583;
      var1.field1584 = this.field1584;
      var1.field1585 = this.field1585;
      var1.field1586 = this.field1586;
      var1.field1600 = this.field1600;
      var1.field1596 = this.field1596;
      var1.field1590 = this.field1590;
      var1.field1572 = this.field1572;
      var1.field1587 = this.field1587;
      var1.field1593 = this.field1593;
      return var1;
   }

   public void method2879(short var1, short var2) {
      for(int var3 = 0; var3 < this.field1569; ++var3) {
         if(this.field1577[var3] == var1) {
            this.field1577[var3] = var2;
         }
      }

   }

   public void method2882(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1598; ++var4) {
         this.field1566[var4] = this.field1566[var4] * var1 / 128;
         this.field1592[var4] = var2 * this.field1592[var4] / 128;
         this.field1568[var4] = var3 * this.field1568[var4] / 128;
      }

      this.method2884();
   }

   void method2868(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      class309 var4 = new class309(var1);
      class309 var5 = new class309(var1);
      class309 var6 = new class309(var1);
      class309 var7 = new class309(var1);
      class309 var8 = new class309(var1);
      var4.field3710 = var1.length - 18;
      int var9 = var4.readShort((byte)25);
      int var10 = var4.readShort((byte)64);
      int var11 = var4.readUnsignedByte((byte)126);
      int var12 = var4.readUnsignedByte((byte)115);
      int var13 = var4.readUnsignedByte((byte)70);
      int var14 = var4.readUnsignedByte((byte)69);
      int var15 = var4.readUnsignedByte((byte)59);
      int var16 = var4.readUnsignedByte((byte)52);
      int var17 = var4.readShort((byte)54);
      int var18 = var4.readShort((byte)94);
      int var19 = var4.readShort((byte)113);
      int var20 = var4.readShort((byte)35);
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if(var13 == 255) {
         var45 += var10;
      }

      int var25 = var45;
      if(var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if(var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if(var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if(var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      int var10000 = var45 + var19;
      this.field1598 = var9;
      this.field1569 = var10;
      this.field1580 = var11;
      this.field1566 = new int[var9];
      this.field1592 = new int[var9];
      this.field1568 = new int[var9];
      this.field1570 = new int[var10];
      this.field1571 = new int[var10];
      this.field1589 = new int[var10];
      if(var11 > 0) {
         this.field1581 = new byte[var11];
         this.field1582 = new short[var11];
         this.field1583 = new short[var11];
         this.field1584 = new short[var11];
      }

      if(var16 == 1) {
         this.field1585 = new int[var9];
      }

      if(var12 == 1) {
         this.field1573 = new byte[var10];
         this.field1602 = new byte[var10];
         this.field1578 = new short[var10];
      }

      if(var13 == 255) {
         this.field1574 = new byte[var10];
      } else {
         this.field1579 = (byte)var13;
      }

      if(var14 == 1) {
         this.field1575 = new byte[var10];
      }

      if(var15 == 1) {
         this.field1586 = new int[var10];
      }

      this.field1577 = new short[var10];
      var4.field3710 = var21;
      var5.field3710 = var32;
      var6.field3710 = var33;
      var7.field3710 = var45;
      var8.field3710 = var27;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.readUnsignedByte((byte)66);
         var40 = 0;
         if((var39 & 1) != 0) {
            var40 = var5.method5628(1517353363);
         }

         var41 = 0;
         if((var39 & 2) != 0) {
            var41 = var6.method5628(1517353363);
         }

         var42 = 0;
         if((var39 & 4) != 0) {
            var42 = var7.method5628(1517353363);
         }

         this.field1566[var38] = var35 + var40;
         this.field1592[var38] = var36 + var41;
         this.field1568[var38] = var37 + var42;
         var35 = this.field1566[var38];
         var36 = this.field1592[var38];
         var37 = this.field1568[var38];
         if(var16 == 1) {
            this.field1585[var38] = var8.readUnsignedByte((byte)45);
         }
      }

      var4.field3710 = var30;
      var5.field3710 = var26;
      var6.field3710 = var24;
      var7.field3710 = var28;
      var8.field3710 = var25;

      for(var38 = 0; var38 < var10; ++var38) {
         this.field1577[var38] = (short)var4.readShort((byte)85);
         if(var12 == 1) {
            var39 = var5.readUnsignedByte((byte)119);
            if((var39 & 1) == 1) {
               this.field1573[var38] = 1;
               var2 = true;
            } else {
               this.field1573[var38] = 0;
            }

            if((var39 & 2) == 2) {
               this.field1602[var38] = (byte)(var39 >> 2);
               this.field1578[var38] = this.field1577[var38];
               this.field1577[var38] = 127;
               if(this.field1578[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.field1602[var38] = -1;
               this.field1578[var38] = -1;
            }
         }

         if(var13 == 255) {
            this.field1574[var38] = var6.readByte(-1608725293);
         }

         if(var14 == 1) {
            this.field1575[var38] = var7.readByte(-467521125);
         }

         if(var15 == 1) {
            this.field1586[var38] = var8.readUnsignedByte((byte)37);
         }
      }

      var4.field3710 = var29;
      var5.field3710 = var23;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.readUnsignedByte((byte)116);
         if(var43 == 1) {
            var38 = var4.method5628(1517353363) + var41;
            var39 = var4.method5628(1517353363) + var38;
            var40 = var4.method5628(1517353363) + var39;
            var41 = var40;
            this.field1570[var42] = var38;
            this.field1571[var42] = var39;
            this.field1589[var42] = var40;
         }

         if(var43 == 2) {
            var39 = var40;
            var40 = var4.method5628(1517353363) + var41;
            var41 = var40;
            this.field1570[var42] = var38;
            this.field1571[var42] = var39;
            this.field1589[var42] = var40;
         }

         if(var43 == 3) {
            var38 = var40;
            var40 = var4.method5628(1517353363) + var41;
            var41 = var40;
            this.field1570[var42] = var38;
            this.field1571[var42] = var39;
            this.field1589[var42] = var40;
         }

         if(var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.method5628(1517353363) + var41;
            var41 = var40;
            this.field1570[var42] = var38;
            this.field1571[var42] = var44;
            this.field1589[var42] = var40;
         }
      }

      var4.field3710 = var31;

      for(var42 = 0; var42 < var11; ++var42) {
         this.field1581[var42] = 0;
         this.field1582[var42] = (short)var4.readShort((byte)70);
         this.field1583[var42] = (short)var4.readShort((byte)116);
         this.field1584[var42] = (short)var4.readShort((byte)58);
      }

      if(this.field1602 != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.field1602[var43] & 255;
            if(var44 != 255) {
               if(this.field1570[var43] == (this.field1582[var44] & '\uffff') && this.field1571[var43] == (this.field1583[var44] & '\uffff') && this.field1589[var43] == (this.field1584[var44] & '\uffff')) {
                  this.field1602[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if(!var46) {
            this.field1602 = null;
         }
      }

      if(!var3) {
         this.field1578 = null;
      }

      if(!var2) {
         this.field1573 = null;
      }

   }

   public void method2931(short var1, short var2) {
      if(this.field1578 != null) {
         for(int var3 = 0; var3 < this.field1569; ++var3) {
            if(this.field1578[var3] == var1) {
               this.field1578[var3] = var2;
            }
         }

      }
   }

   public final class136 method2886(int var1, int var2, int var3, int var4, int var5) {
      this.method2883();
      int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3 + var4 * var4));
      int var7 = var6 * var2 >> 8;
      class136 var8 = new class136();
      var8.field1694 = new int[this.field1569];
      var8.field1695 = new int[this.field1569];
      var8.field1747 = new int[this.field1569];
      if(this.field1580 > 0 && this.field1602 != null) {
         int[] var9 = new int[this.field1580];

         int var10;
         for(var10 = 0; var10 < this.field1569; ++var10) {
            if(this.field1602[var10] != -1) {
               ++var9[this.field1602[var10] & 255];
            }
         }

         var8.field1698 = 0;

         for(var10 = 0; var10 < this.field1580; ++var10) {
            if(var9[var10] > 0 && this.field1581[var10] == 0) {
               ++var8.field1698;
            }
         }

         var8.field1685 = new int[var8.field1698];
         var8.field1704 = new int[var8.field1698];
         var8.field1705 = new int[var8.field1698];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.field1580; ++var11) {
            if(var9[var11] > 0 && this.field1581[var11] == 0) {
               var8.field1685[var10] = this.field1582[var11] & '\uffff';
               var8.field1704[var10] = this.field1583[var11] & '\uffff';
               var8.field1705[var10] = this.field1584[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field1699 = new byte[this.field1569];

         for(var11 = 0; var11 < this.field1569; ++var11) {
            if(this.field1602[var11] != -1) {
               var8.field1699[var11] = (byte)var9[this.field1602[var11] & 255];
            } else {
               var8.field1699[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.field1569; ++var16) {
         byte var17;
         if(this.field1573 == null) {
            var17 = 0;
         } else {
            var17 = this.field1573[var16];
         }

         byte var18;
         if(this.field1575 == null) {
            var18 = 0;
         } else {
            var18 = this.field1575[var16];
         }

         short var12;
         if(this.field1578 == null) {
            var12 = -1;
         } else {
            var12 = this.field1578[var16];
         }

         if(var18 == -2) {
            var17 = 3;
         }

         if(var18 == -1) {
            var17 = 2;
         }

         class138 var13;
         int var14;
         class146 var19;
         if(var12 == -1) {
            if(var17 == 0) {
               int var15 = this.field1577[var16] & '\uffff';
               if(this.field1591 != null && this.field1591[this.field1570[var16]] != null) {
                  var13 = this.field1591[this.field1570[var16]];
               } else {
                  var13 = this.field1590[this.field1570[var16]];
               }

               var14 = (var4 * var13.field1765 + var5 * var13.field1766 + var3 * var13.field1768) / (var7 * var13.field1767) + var1;
               var8.field1694[var16] = method2888(var15, var14);
               if(this.field1591 != null && this.field1591[this.field1571[var16]] != null) {
                  var13 = this.field1591[this.field1571[var16]];
               } else {
                  var13 = this.field1590[this.field1571[var16]];
               }

               var14 = (var4 * var13.field1765 + var5 * var13.field1766 + var3 * var13.field1768) / (var7 * var13.field1767) + var1;
               var8.field1695[var16] = method2888(var15, var14);
               if(this.field1591 != null && this.field1591[this.field1589[var16]] != null) {
                  var13 = this.field1591[this.field1589[var16]];
               } else {
                  var13 = this.field1590[this.field1589[var16]];
               }

               var14 = (var4 * var13.field1765 + var5 * var13.field1766 + var3 * var13.field1768) / (var7 * var13.field1767) + var1;
               var8.field1747[var16] = method2888(var15, var14);
            } else if(var17 == 1) {
               var19 = this.field1572[var16];
               var14 = (var4 * var19.field1895 + var5 * var19.field1896 + var3 * var19.field1898) / (var7 / 2 + var7) + var1;
               var8.field1694[var16] = method2888(this.field1577[var16] & '\uffff', var14);
               var8.field1747[var16] = -1;
            } else if(var17 == 3) {
               var8.field1694[var16] = 128;
               var8.field1747[var16] = -1;
            } else {
               var8.field1747[var16] = -2;
            }
         } else if(var17 == 0) {
            if(this.field1591 != null && this.field1591[this.field1570[var16]] != null) {
               var13 = this.field1591[this.field1570[var16]];
            } else {
               var13 = this.field1590[this.field1570[var16]];
            }

            var14 = (var4 * var13.field1765 + var5 * var13.field1766 + var3 * var13.field1768) / (var7 * var13.field1767) + var1;
            var8.field1694[var16] = method2924(var14);
            if(this.field1591 != null && this.field1591[this.field1571[var16]] != null) {
               var13 = this.field1591[this.field1571[var16]];
            } else {
               var13 = this.field1590[this.field1571[var16]];
            }

            var14 = (var4 * var13.field1765 + var5 * var13.field1766 + var3 * var13.field1768) / (var7 * var13.field1767) + var1;
            var8.field1695[var16] = method2924(var14);
            if(this.field1591 != null && this.field1591[this.field1589[var16]] != null) {
               var13 = this.field1591[this.field1589[var16]];
            } else {
               var13 = this.field1590[this.field1589[var16]];
            }

            var14 = (var4 * var13.field1765 + var5 * var13.field1766 + var3 * var13.field1768) / (var7 * var13.field1767) + var1;
            var8.field1747[var16] = method2924(var14);
         } else if(var17 == 1) {
            var19 = this.field1572[var16];
            var14 = (var4 * var19.field1895 + var5 * var19.field1896 + var3 * var19.field1898) / (var7 / 2 + var7) + var1;
            var8.field1694[var16] = method2924(var14);
            var8.field1747[var16] = -1;
         } else {
            var8.field1747[var16] = -2;
         }
      }

      this.method2887();
      var8.field1686 = this.field1598;
      var8.field1687 = this.field1566;
      var8.field1688 = this.field1592;
      var8.field1732 = this.field1568;
      var8.field1690 = this.field1569;
      var8.field1691 = this.field1570;
      var8.field1682 = this.field1571;
      var8.field1725 = this.field1589;
      var8.field1697 = this.field1574;
      var8.field1708 = this.field1575;
      var8.field1701 = this.field1579;
      var8.field1718 = this.field1600;
      var8.field1730 = this.field1596;
      var8.field1700 = this.field1578;
      return var8;
   }

   void method2880(byte[] var1) {
      class309 var2 = new class309(var1);
      class309 var3 = new class309(var1);
      class309 var4 = new class309(var1);
      class309 var5 = new class309(var1);
      class309 var6 = new class309(var1);
      class309 var7 = new class309(var1);
      class309 var8 = new class309(var1);
      var2.field3710 = var1.length - 23;
      int var9 = var2.readShort((byte)93);
      int var10 = var2.readShort((byte)27);
      int var11 = var2.readUnsignedByte((byte)50);
      int var12 = var2.readUnsignedByte((byte)20);
      int var13 = var2.readUnsignedByte((byte)94);
      int var14 = var2.readUnsignedByte((byte)52);
      int var15 = var2.readUnsignedByte((byte)16);
      int var16 = var2.readUnsignedByte((byte)61);
      int var17 = var2.readUnsignedByte((byte)17);
      int var18 = var2.readShort((byte)25);
      int var19 = var2.readShort((byte)60);
      int var20 = var2.readShort((byte)68);
      int var21 = var2.readShort((byte)16);
      int var22 = var2.readShort((byte)102);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if(var11 > 0) {
         this.field1581 = new byte[var11];
         var2.field3710 = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.field1581[var26] = var2.readByte(-1775793103);
            if(var27 == 0) {
               ++var23;
            }

            if(var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if(var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if(var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if(var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if(var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if(var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if(var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if(var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.field1598 = var9;
      this.field1569 = var10;
      this.field1580 = var11;
      this.field1566 = new int[var9];
      this.field1592 = new int[var9];
      this.field1568 = new int[var9];
      this.field1570 = new int[var10];
      this.field1571 = new int[var10];
      this.field1589 = new int[var10];
      if(var17 == 1) {
         this.field1585 = new int[var9];
      }

      if(var12 == 1) {
         this.field1573 = new byte[var10];
      }

      if(var13 == 255) {
         this.field1574 = new byte[var10];
      } else {
         this.field1579 = (byte)var13;
      }

      if(var14 == 1) {
         this.field1575 = new byte[var10];
      }

      if(var15 == 1) {
         this.field1586 = new int[var10];
      }

      if(var16 == 1) {
         this.field1578 = new short[var10];
      }

      if(var16 == 1 && var11 > 0) {
         this.field1602 = new byte[var10];
      }

      this.field1577 = new short[var10];
      if(var11 > 0) {
         this.field1582 = new short[var11];
         this.field1583 = new short[var11];
         this.field1584 = new short[var11];
      }

      var2.field3710 = var11;
      var3.field3710 = var38;
      var4.field3710 = var39;
      var5.field3710 = var40;
      var6.field3710 = var32;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.readUnsignedByte((byte)34);
         var53 = 0;
         if((var52 & 1) != 0) {
            var53 = var3.method5628(1517353363);
         }

         var54 = 0;
         if((var52 & 2) != 0) {
            var54 = var4.method5628(1517353363);
         }

         var55 = 0;
         if((var52 & 4) != 0) {
            var55 = var5.method5628(1517353363);
         }

         this.field1566[var51] = var48 + var53;
         this.field1592[var51] = var49 + var54;
         this.field1568[var51] = var50 + var55;
         var48 = this.field1566[var51];
         var49 = this.field1592[var51];
         var50 = this.field1568[var51];
         if(var17 == 1) {
            this.field1585[var51] = var6.readUnsignedByte((byte)41);
         }
      }

      var2.field3710 = var37;
      var3.field3710 = var28;
      var4.field3710 = var30;
      var5.field3710 = var33;
      var6.field3710 = var31;
      var7.field3710 = var35;
      var8.field3710 = var36;

      for(var51 = 0; var51 < var10; ++var51) {
         this.field1577[var51] = (short)var2.readShort((byte)26);
         if(var12 == 1) {
            this.field1573[var51] = var3.readByte(-997513272);
         }

         if(var13 == 255) {
            this.field1574[var51] = var4.readByte(-787593124);
         }

         if(var14 == 1) {
            this.field1575[var51] = var5.readByte(-2126715139);
         }

         if(var15 == 1) {
            this.field1586[var51] = var6.readUnsignedByte((byte)16);
         }

         if(var16 == 1) {
            this.field1578[var51] = (short)(var7.readShort((byte)65) - 1);
         }

         if(this.field1602 != null && this.field1578[var51] != -1) {
            this.field1602[var51] = (byte)(var8.readUnsignedByte((byte)21) - 1);
         }
      }

      var2.field3710 = var34;
      var3.field3710 = var29;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.readUnsignedByte((byte)106);
         if(var56 == 1) {
            var51 = var2.method5628(1517353363) + var54;
            var52 = var2.method5628(1517353363) + var51;
            var53 = var2.method5628(1517353363) + var52;
            var54 = var53;
            this.field1570[var55] = var51;
            this.field1571[var55] = var52;
            this.field1589[var55] = var53;
         }

         if(var56 == 2) {
            var52 = var53;
            var53 = var2.method5628(1517353363) + var54;
            var54 = var53;
            this.field1570[var55] = var51;
            this.field1571[var55] = var52;
            this.field1589[var55] = var53;
         }

         if(var56 == 3) {
            var51 = var53;
            var53 = var2.method5628(1517353363) + var54;
            var54 = var53;
            this.field1570[var55] = var51;
            this.field1571[var55] = var52;
            this.field1589[var55] = var53;
         }

         if(var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.method5628(1517353363) + var54;
            var54 = var53;
            this.field1570[var55] = var51;
            this.field1571[var55] = var57;
            this.field1589[var55] = var53;
         }
      }

      var2.field3710 = var41;
      var3.field3710 = var42;
      var4.field3710 = var43;
      var5.field3710 = var44;
      var6.field3710 = var45;
      var7.field3710 = var46;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.field1581[var55] & 255;
         if(var56 == 0) {
            this.field1582[var55] = (short)var2.readShort((byte)43);
            this.field1583[var55] = (short)var2.readShort((byte)98);
            this.field1584[var55] = (short)var2.readShort((byte)97);
         }
      }

      var2.field3710 = var26;
      var55 = var2.readUnsignedByte((byte)50);
      if(var55 != 0) {
         new class143();
         var2.readShort((byte)30);
         var2.readShort((byte)110);
         var2.readShort((byte)82);
         var2.method5552(297718403);
      }

   }

   public class130 method2872(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method2885();
      int var7 = var2 + this.field1595;
      int var8 = var2 + this.field1597;
      int var9 = var4 + this.field1599;
      int var10 = var4 + this.field1594;
      if(var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if(var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
            return this;
         } else {
            class130 var11 = new class130();
            var11.field1598 = this.field1598;
            var11.field1569 = this.field1569;
            var11.field1580 = this.field1580;
            var11.field1566 = this.field1566;
            var11.field1568 = this.field1568;
            var11.field1570 = this.field1570;
            var11.field1571 = this.field1571;
            var11.field1589 = this.field1589;
            var11.field1573 = this.field1573;
            var11.field1574 = this.field1574;
            var11.field1575 = this.field1575;
            var11.field1602 = this.field1602;
            var11.field1577 = this.field1577;
            var11.field1578 = this.field1578;
            var11.field1579 = this.field1579;
            var11.field1581 = this.field1581;
            var11.field1582 = this.field1582;
            var11.field1583 = this.field1583;
            var11.field1584 = this.field1584;
            var11.field1585 = this.field1585;
            var11.field1586 = this.field1586;
            var11.field1600 = this.field1600;
            var11.field1596 = this.field1596;
            var11.field1587 = this.field1587;
            var11.field1593 = this.field1593;
            var11.field1592 = new int[var11.field1598];
            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if(var6 == 0) {
               for(var12 = 0; var12 < var11.field1598; ++var12) {
                  var13 = var2 + this.field1566[var12];
                  var14 = var4 + this.field1568[var12];
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field1592[var12] = var21 + this.field1592[var12] - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field1598; ++var12) {
                  var13 = (-this.field1592[var12] << 16) / super.field1883;
                  if(var13 < var6) {
                     var14 = var2 + this.field1566[var12];
                     var15 = var4 + this.field1568[var12];
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field1592[var12] = (var6 - var13) * (var22 - var3) / var6 + this.field1592[var12];
                  }
               }
            }

            var11.method2884();
            return var11;
         }
      } else {
         return this;
      }
   }

   public void method2878(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1598; ++var4) {
         this.field1566[var4] += var1;
         this.field1592[var4] += var2;
         this.field1568[var4] += var3;
      }

      this.method2884();
   }

   void method2887() {
      int[] var1;
      int var2;
      int var3;
      int var4;
      if(this.field1585 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field1598; ++var3) {
            var4 = this.field1585[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field1600 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field1600[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field1598; this.field1600[var4][var1[var4]++] = var3++) {
            var4 = this.field1585[var3];
         }

         this.field1585 = null;
      }

      if(this.field1586 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field1569; ++var3) {
            var4 = this.field1586[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field1596 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field1596[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field1569; this.field1596[var4][var1[var4]++] = var3++) {
            var4 = this.field1586[var3];
         }

         this.field1586 = null;
      }

   }

   public void method2881() {
      int var1;
      for(var1 = 0; var1 < this.field1598; ++var1) {
         this.field1568[var1] = -this.field1568[var1];
      }

      for(var1 = 0; var1 < this.field1569; ++var1) {
         int var2 = this.field1570[var1];
         this.field1570[var1] = this.field1589[var1];
         this.field1589[var1] = var2;
      }

      this.method2884();
   }

   public void method2877(int var1) {
      int var2 = field1603[var1];
      int var3 = field1604[var1];

      for(int var4 = 0; var4 < this.field1598; ++var4) {
         int var5 = var2 * this.field1568[var4] + var3 * this.field1566[var4] >> 16;
         this.field1568[var4] = var3 * this.field1568[var4] - var2 * this.field1566[var4] >> 16;
         this.field1566[var4] = var5;
      }

      this.method2884();
   }

   public void method2874() {
      for(int var1 = 0; var1 < this.field1598; ++var1) {
         int var2 = this.field1566[var1];
         this.field1566[var1] = this.field1568[var1];
         this.field1568[var1] = -var2;
      }

      this.method2884();
   }

   public void method2875() {
      for(int var1 = 0; var1 < this.field1598; ++var1) {
         this.field1566[var1] = -this.field1566[var1];
         this.field1568[var1] = -this.field1568[var1];
      }

      this.method2884();
   }

   public void method2896() {
      for(int var1 = 0; var1 < this.field1598; ++var1) {
         int var2 = this.field1568[var1];
         this.field1568[var1] = this.field1566[var1];
         this.field1566[var1] = -var2;
      }

      this.method2884();
   }

   final int method2870(class130 var1, int var2) {
      int var3 = -1;
      int var4 = var1.field1566[var2];
      int var5 = var1.field1592[var2];
      int var6 = var1.field1568[var2];

      for(int var7 = 0; var7 < this.field1598; ++var7) {
         if(var4 == this.field1566[var7] && var5 == this.field1592[var7] && var6 == this.field1568[var7]) {
            var3 = var7;
            break;
         }
      }

      if(var3 == -1) {
         this.field1566[this.field1598] = var4;
         this.field1592[this.field1598] = var5;
         this.field1568[this.field1598] = var6;
         if(var1.field1585 != null) {
            this.field1585[this.field1598] = var1.field1585[var2];
         }

         var3 = this.field1598++;
      }

      return var3;
   }

   public static class130 method2865(class243 var0, int var1, int var2) {
      byte[] var3 = var0.method4224(var1, var2, (byte)-22);
      return var3 == null?null:new class130(var3);
   }

   static void method2876(class130 var0, class130 var1, int var2, int var3, int var4, boolean var5) {
      var0.method2885();
      var0.method2883();
      var1.method2885();
      var1.method2883();
      ++field1588;
      int var6 = 0;
      int[] var7 = var1.field1566;
      int var8 = var1.field1598;

      int var9;
      for(var9 = 0; var9 < var0.field1598; ++var9) {
         class138 var10 = var0.field1590[var9];
         if(var10.field1767 != 0) {
            int var11 = var0.field1592[var9] - var3;
            if(var11 <= var1.field1567) {
               int var12 = var0.field1566[var9] - var2;
               if(var12 >= var1.field1595 && var12 <= var1.field1597) {
                  int var13 = var0.field1568[var9] - var4;
                  if(var13 >= var1.field1599 && var13 <= var1.field1594) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        class138 var15 = var1.field1590[var14];
                        if(var12 == var7[var14] && var13 == var1.field1568[var14] && var11 == var1.field1592[var14] && var15.field1767 != 0) {
                           if(var0.field1591 == null) {
                              var0.field1591 = new class138[var0.field1598];
                           }

                           if(var1.field1591 == null) {
                              var1.field1591 = new class138[var8];
                           }

                           class138 var16 = var0.field1591[var9];
                           if(var16 == null) {
                              var16 = var0.field1591[var9] = new class138(var10);
                           }

                           class138 var17 = var1.field1591[var14];
                           if(var17 == null) {
                              var17 = var1.field1591[var14] = new class138(var15);
                           }

                           var16.field1768 += var15.field1768;
                           var16.field1765 += var15.field1765;
                           var16.field1766 += var15.field1766;
                           var16.field1767 += var15.field1767;
                           var17.field1768 += var10.field1768;
                           var17.field1765 += var10.field1765;
                           var17.field1766 += var10.field1766;
                           var17.field1767 += var10.field1767;
                           ++var6;
                           field1576[var9] = field1588;
                           field1601[var14] = field1588;
                        }
                     }
                  }
               }
            }
         }
      }

      if(var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.field1569; ++var9) {
            if(field1576[var0.field1570[var9]] == field1588 && field1576[var0.field1571[var9]] == field1588 && field1576[var0.field1589[var9]] == field1588) {
               if(var0.field1573 == null) {
                  var0.field1573 = new byte[var0.field1569];
               }

               var0.field1573[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.field1569; ++var9) {
            if(field1588 == field1601[var1.field1570[var9]] && field1588 == field1601[var1.field1571[var9]] && field1588 == field1601[var1.field1589[var9]]) {
               if(var1.field1573 == null) {
                  var1.field1573 = new byte[var1.field1569];
               }

               var1.field1573[var9] = 2;
            }
         }

      }
   }

   static final int method2924(int var0) {
      if(var0 < 2) {
         var0 = 2;
      } else if(var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   static final int method2888(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }
}
