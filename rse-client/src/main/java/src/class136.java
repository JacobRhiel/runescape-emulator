package src;

public class class136 extends class144 {

   static boolean[] field1722 = new boolean[4700];
   static int[] field1737 = new int[1600];
   static int[] field1702 = class139.field1794;
   static class136 field1684 = new class136();
   static byte[] field1746 = new byte[1];
   static class136 field1713 = new class136();
   static int field1740;
   static byte[] field1683 = new byte[1];
   static int[] field1693 = class139.field1795;
   static int field1706;
   static int field1742;
   static int[] field1728 = new int[4700];
   static boolean[] field1721 = new boolean[4700];
   static int[] field1736 = new int[12];
   static int[] field1733 = new int[12];
   static int[][] field1731 = new int[1600][512];
   static int[] field1723 = new int[4700];
   static int[] field1724 = new int[4700];
   static int[] field1696 = new int[10];
   static int[] field1726 = new int[4700];
   static int[] field1703 = new int[4700];
   static int[] field1707 = new int[4700];
   static int[] field1692 = new int[10];
   static int[][] field1727 = new int[12][2000];
   static int[] field1749 = class139.field1793;
   static int[] field1739 = new int[10];
   static int[] field1734 = new int[2000];
   static int[] field1735 = new int[2000];
   static int[] field1748 = class139.field1790;
   static boolean field1743 = true;
   int field1712;
   int field1729 = -1;
   int field1744;
   int[][] field1718;
   int field1686 = 0;
   int[] field1691;
   int field1711;
   int field1690 = 0;
   int[] field1687;
   int[] field1732;
   int[] field1682;
   int[][] field1730;
   byte field1701 = 0;
   int[] field1725;
   int field1710;
   int field1698 = 0;
   int[] field1688;
   byte[] field1697;
   byte[] field1708;
   int[] field1747;
   int[] field1694;
   int field1689;
   public boolean field1716 = false;
   int[] field1695;
   int field1715;
   int field1717 = -1;
   int field1741;
   int field1719 = -1;
   short[] field1700;
   int field1709;
   byte[] field1699;
   int[] field1685;
   int[] field1704;
   int[] field1705;


   class136() {}

   public class136(class136[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      this.field1686 = 0;
      this.field1690 = 0;
      this.field1698 = 0;
      this.field1701 = -1;

      int var7;
      class136 var8;
      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if(var8 != null) {
            this.field1686 += var8.field1686;
            this.field1690 += var8.field1690;
            this.field1698 += var8.field1698;
            if(var8.field1697 != null) {
               var3 = true;
            } else {
               if(this.field1701 == -1) {
                  this.field1701 = var8.field1701;
               }

               if(this.field1701 != var8.field1701) {
                  var3 = true;
               }
            }

            var4 |= var8.field1708 != null;
            var5 |= var8.field1700 != null;
            var6 |= var8.field1699 != null;
         }
      }

      this.field1687 = new int[this.field1686];
      this.field1688 = new int[this.field1686];
      this.field1732 = new int[this.field1686];
      this.field1691 = new int[this.field1690];
      this.field1682 = new int[this.field1690];
      this.field1725 = new int[this.field1690];
      this.field1694 = new int[this.field1690];
      this.field1695 = new int[this.field1690];
      this.field1747 = new int[this.field1690];
      if(var3) {
         this.field1697 = new byte[this.field1690];
      }

      if(var4) {
         this.field1708 = new byte[this.field1690];
      }

      if(var5) {
         this.field1700 = new short[this.field1690];
      }

      if(var6) {
         this.field1699 = new byte[this.field1690];
      }

      if(this.field1698 > 0) {
         this.field1685 = new int[this.field1698];
         this.field1704 = new int[this.field1698];
         this.field1705 = new int[this.field1698];
      }

      this.field1686 = 0;
      this.field1690 = 0;
      this.field1698 = 0;

      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if(var8 != null) {
            int var9;
            for(var9 = 0; var9 < var8.field1690; ++var9) {
               this.field1691[this.field1690] = this.field1686 + var8.field1691[var9];
               this.field1682[this.field1690] = this.field1686 + var8.field1682[var9];
               this.field1725[this.field1690] = this.field1686 + var8.field1725[var9];
               this.field1694[this.field1690] = var8.field1694[var9];
               this.field1695[this.field1690] = var8.field1695[var9];
               this.field1747[this.field1690] = var8.field1747[var9];
               if(var3) {
                  if(var8.field1697 != null) {
                     this.field1697[this.field1690] = var8.field1697[var9];
                  } else {
                     this.field1697[this.field1690] = var8.field1701;
                  }
               }

               if(var4 && var8.field1708 != null) {
                  this.field1708[this.field1690] = var8.field1708[var9];
               }

               if(var5) {
                  if(var8.field1700 != null) {
                     this.field1700[this.field1690] = var8.field1700[var9];
                  } else {
                     this.field1700[this.field1690] = -1;
                  }
               }

               if(var6) {
                  if(var8.field1699 != null && var8.field1699[var9] != -1) {
                     this.field1699[this.field1690] = (byte)(this.field1698 + var8.field1699[var9]);
                  } else {
                     this.field1699[this.field1690] = -1;
                  }
               }

               ++this.field1690;
            }

            for(var9 = 0; var9 < var8.field1698; ++var9) {
               this.field1685[this.field1698] = this.field1686 + var8.field1685[var9];
               this.field1704[this.field1698] = this.field1686 + var8.field1704[var9];
               this.field1705[this.field1698] = this.field1686 + var8.field1705[var9];
               ++this.field1698;
            }

            for(var9 = 0; var9 < var8.field1686; ++var9) {
               this.field1687[this.field1686] = var8.field1687[var9];
               this.field1688[this.field1686] = var8.field1688[var9];
               this.field1732[this.field1686] = var8.field1732[var9];
               ++this.field1686;
            }
         }
      }

   }

   public void method2955() {
      if(this.field1744 != 1) {
         this.field1744 = 1;
         super.field1883 = 0;
         this.field1710 = 0;
         this.field1711 = 0;

         for(int var1 = 0; var1 < this.field1686; ++var1) {
            int var2 = this.field1687[var1];
            int var3 = this.field1688[var1];
            int var4 = this.field1732[var1];
            if(-var3 > super.field1883) {
               super.field1883 = -var3;
            }

            if(var3 > this.field1710) {
               this.field1710 = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if(var5 > this.field1711) {
               this.field1711 = var5;
            }
         }

         this.field1711 = (int)(Math.sqrt((double)this.field1711) + 0.99D);
         this.field1741 = (int)(Math.sqrt((double)(this.field1711 * this.field1711 + super.field1883 * super.field1883)) + 0.99D);
         this.field1712 = this.field1741 + (int)(Math.sqrt((double)(this.field1711 * this.field1711 + this.field1710 * this.field1710)) + 0.99D);
      }
   }

   public void method2959(class147 var1, int var2) {
      if(this.field1718 != null) {
         if(var2 != -1) {
            class134 var3 = var1.field1900[var2];
            class141 var4 = var3.field1652;
            field1740 = 0;
            field1706 = 0;
            field1742 = 0;

            for(int var5 = 0; var5 < var3.field1653; ++var5) {
               int var6 = var3.field1649[var5];
               this.method3014(var4.field1809[var6], var4.field1808[var6], var3.field1648[var5], var3.field1656[var5], var3.field1657[var5]);
            }

            this.method2957();
         }
      }
   }

   void method2957() {
      this.field1744 = 0;
      this.field1729 = -1;
   }

   final void method3015(int var1) {
      int var2 = class139.field1775;
      int var3 = class139.field1788;
      int var4 = 0;
      int var5 = this.field1691[var1];
      int var6 = this.field1682[var1];
      int var7 = this.field1725[var1];
      int var8 = field1728[var5];
      int var9 = field1728[var6];
      int var10 = field1728[var7];
      if(this.field1708 == null) {
         class139.field1789 = 0;
      } else {
         class139.field1789 = this.field1708[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if(var8 >= 50) {
         field1696[var4] = field1723[var5];
         field1692[var4] = field1724[var5];
         field1739[var4++] = this.field1694[var1];
      } else {
         var11 = field1726[var5];
         var12 = field1707[var5];
         var13 = this.field1694[var1];
         if(var10 >= 50) {
            var14 = field1749[var10 - var8] * (50 - var8);
            field1696[var4] = var2 + class139.field1780 * (var11 + ((field1726[var7] - var11) * var14 >> 16)) / 50;
            field1692[var4] = var3 + class139.field1780 * (var12 + ((field1707[var7] - var12) * var14 >> 16)) / 50;
            field1739[var4++] = var13 + ((this.field1747[var1] - var13) * var14 >> 16);
         }

         if(var9 >= 50) {
            var14 = field1749[var9 - var8] * (50 - var8);
            field1696[var4] = var2 + class139.field1780 * (var11 + ((field1726[var6] - var11) * var14 >> 16)) / 50;
            field1692[var4] = var3 + class139.field1780 * (var12 + ((field1707[var6] - var12) * var14 >> 16)) / 50;
            field1739[var4++] = var13 + ((this.field1695[var1] - var13) * var14 >> 16);
         }
      }

      if(var9 >= 50) {
         field1696[var4] = field1723[var6];
         field1692[var4] = field1724[var6];
         field1739[var4++] = this.field1695[var1];
      } else {
         var11 = field1726[var6];
         var12 = field1707[var6];
         var13 = this.field1695[var1];
         if(var8 >= 50) {
            var14 = field1749[var8 - var9] * (50 - var9);
            field1696[var4] = var2 + class139.field1780 * (var11 + ((field1726[var5] - var11) * var14 >> 16)) / 50;
            field1692[var4] = var3 + class139.field1780 * (var12 + ((field1707[var5] - var12) * var14 >> 16)) / 50;
            field1739[var4++] = var13 + ((this.field1694[var1] - var13) * var14 >> 16);
         }

         if(var10 >= 50) {
            var14 = field1749[var10 - var9] * (50 - var9);
            field1696[var4] = var2 + class139.field1780 * (var11 + ((field1726[var7] - var11) * var14 >> 16)) / 50;
            field1692[var4] = var3 + class139.field1780 * (var12 + ((field1707[var7] - var12) * var14 >> 16)) / 50;
            field1739[var4++] = var13 + ((this.field1747[var1] - var13) * var14 >> 16);
         }
      }

      if(var10 >= 50) {
         field1696[var4] = field1723[var7];
         field1692[var4] = field1724[var7];
         field1739[var4++] = this.field1747[var1];
      } else {
         var11 = field1726[var7];
         var12 = field1707[var7];
         var13 = this.field1747[var1];
         if(var9 >= 50) {
            var14 = field1749[var9 - var10] * (50 - var10);
            field1696[var4] = var2 + class139.field1780 * (var11 + ((field1726[var6] - var11) * var14 >> 16)) / 50;
            field1692[var4] = var3 + class139.field1780 * (var12 + ((field1707[var6] - var12) * var14 >> 16)) / 50;
            field1739[var4++] = var13 + ((this.field1695[var1] - var13) * var14 >> 16);
         }

         if(var8 >= 50) {
            var14 = field1749[var8 - var10] * (50 - var10);
            field1696[var4] = var2 + class139.field1780 * (var11 + ((field1726[var5] - var11) * var14 >> 16)) / 50;
            field1692[var4] = var3 + class139.field1780 * (var12 + ((field1707[var5] - var12) * var14 >> 16)) / 50;
            field1739[var4++] = var13 + ((this.field1694[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field1696[0];
      var12 = field1696[1];
      var13 = field1696[2];
      var14 = field1692[0];
      int var15 = field1692[1];
      int var16 = field1692[2];
      class139.field1778 = false;
      int var17;
      int var18;
      int var19;
      int var20;
      if(var4 == 3) {
         if(var11 < 0 || var12 < 0 || var13 < 0 || var11 > class139.field1783 || var12 > class139.field1783 || var13 > class139.field1783) {
            class139.field1778 = true;
         }

         if(this.field1700 != null && this.field1700[var1] != -1) {
            if(this.field1699 != null && this.field1699[var1] != -1) {
               var20 = this.field1699[var1] & 255;
               var17 = this.field1685[var20];
               var18 = this.field1704[var20];
               var19 = this.field1705[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            if(this.field1747[var1] == -1) {
               class139.method3095(var14, var15, var16, var11, var12, var13, this.field1694[var1], this.field1694[var1], this.field1694[var1], field1726[var17], field1726[var18], field1726[var19], field1707[var17], field1707[var18], field1707[var19], field1728[var17], field1728[var18], field1728[var19], this.field1700[var1]);
            } else {
               class139.method3095(var14, var15, var16, var11, var12, var13, field1739[0], field1739[1], field1739[2], field1726[var17], field1726[var18], field1726[var19], field1707[var17], field1707[var18], field1707[var19], field1728[var17], field1728[var18], field1728[var19], this.field1700[var1]);
            }
         } else if(this.field1747[var1] == -1) {
            class139.method3093(var14, var15, var16, var11, var12, var13, field1748[this.field1694[var1]]);
         } else {
            class139.method3091(var14, var15, var16, var11, var12, var13, field1739[0], field1739[1], field1739[2]);
         }
      }

      if(var4 == 4) {
         if(var11 < 0 || var12 < 0 || var13 < 0 || var11 > class139.field1783 || var12 > class139.field1783 || var13 > class139.field1783 || field1696[3] < 0 || field1696[3] > class139.field1783) {
            class139.field1778 = true;
         }

         if(this.field1700 != null && this.field1700[var1] != -1) {
            if(this.field1699 != null && this.field1699[var1] != -1) {
               var20 = this.field1699[var1] & 255;
               var17 = this.field1685[var20];
               var18 = this.field1704[var20];
               var19 = this.field1705[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            short var21 = this.field1700[var1];
            if(this.field1747[var1] == -1) {
               class139.method3095(var14, var15, var16, var11, var12, var13, this.field1694[var1], this.field1694[var1], this.field1694[var1], field1726[var17], field1726[var18], field1726[var19], field1707[var17], field1707[var18], field1707[var19], field1728[var17], field1728[var18], field1728[var19], var21);
               class139.method3095(var14, var16, field1692[3], var11, var13, field1696[3], this.field1694[var1], this.field1694[var1], this.field1694[var1], field1726[var17], field1726[var18], field1726[var19], field1707[var17], field1707[var18], field1707[var19], field1728[var17], field1728[var18], field1728[var19], var21);
            } else {
               class139.method3095(var14, var15, var16, var11, var12, var13, field1739[0], field1739[1], field1739[2], field1726[var17], field1726[var18], field1726[var19], field1707[var17], field1707[var18], field1707[var19], field1728[var17], field1728[var18], field1728[var19], var21);
               class139.method3095(var14, var16, field1692[3], var11, var13, field1696[3], field1739[0], field1739[2], field1739[3], field1726[var17], field1726[var18], field1726[var19], field1707[var17], field1707[var18], field1707[var19], field1728[var17], field1728[var18], field1728[var19], var21);
            }
         } else if(this.field1747[var1] == -1) {
            var17 = field1748[this.field1694[var1]];
            class139.method3093(var14, var15, var16, var11, var12, var13, var17);
            class139.method3093(var14, var16, field1692[3], var11, var13, field1696[3], var17);
         } else {
            class139.method3091(var14, var15, var16, var11, var12, var13, field1739[0], field1739[1], field1739[2]);
            class139.method3091(var14, var16, field1692[3], var11, var13, field1696[3], field1739[0], field1739[2], field1739[3]);
         }
      }

   }

   class136 method2953(boolean var1, class136 var2, byte[] var3) {
      var2.field1686 = this.field1686;
      var2.field1690 = this.field1690;
      var2.field1698 = this.field1698;
      if(var2.field1687 == null || var2.field1687.length < this.field1686) {
         var2.field1687 = new int[this.field1686 + 100];
         var2.field1688 = new int[this.field1686 + 100];
         var2.field1732 = new int[this.field1686 + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.field1686; ++var4) {
         var2.field1687[var4] = this.field1687[var4];
         var2.field1688[var4] = this.field1688[var4];
         var2.field1732[var4] = this.field1732[var4];
      }

      if(var1) {
         var2.field1708 = this.field1708;
      } else {
         var2.field1708 = var3;
         if(this.field1708 == null) {
            for(var4 = 0; var4 < this.field1690; ++var4) {
               var2.field1708[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.field1690; ++var4) {
               var2.field1708[var4] = this.field1708[var4];
            }
         }
      }

      var2.field1691 = this.field1691;
      var2.field1682 = this.field1682;
      var2.field1725 = this.field1725;
      var2.field1694 = this.field1694;
      var2.field1695 = this.field1695;
      var2.field1747 = this.field1747;
      var2.field1697 = this.field1697;
      var2.field1699 = this.field1699;
      var2.field1700 = this.field1700;
      var2.field1701 = this.field1701;
      var2.field1685 = this.field1685;
      var2.field1704 = this.field1704;
      var2.field1705 = this.field1705;
      var2.field1718 = this.field1718;
      var2.field1730 = this.field1730;
      var2.field1716 = this.field1716;
      var2.method2957();
      return var2;
   }

   void method2954(int var1) {
      if(this.field1729 == -1) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field1693[var1];
         int var9 = field1702[var1];

         for(int var10 = 0; var10 < this.field1686; ++var10) {
            int var11 = class139.method3099(this.field1687[var10], this.field1732[var10], var8, var9);
            int var12 = this.field1688[var10];
            int var13 = class139.method3136(this.field1687[var10], this.field1732[var10], var8, var9);
            if(var11 < var2) {
               var2 = var11;
            }

            if(var11 > var5) {
               var5 = var11;
            }

            if(var12 < var3) {
               var3 = var12;
            }

            if(var12 > var6) {
               var6 = var12;
            }

            if(var13 < var4) {
               var4 = var13;
            }

            if(var13 > var7) {
               var7 = var13;
            }
         }

         this.field1689 = (var5 + var2) / 2;
         this.field1715 = (var6 + var3) / 2;
         this.field1709 = (var7 + var4) / 2;
         this.field1729 = (var5 - var2 + 1) / 2;
         this.field1717 = (var6 - var3 + 1) / 2;
         this.field1719 = (var7 - var4 + 1) / 2;
         if(this.field1729 < 32) {
            this.field1729 = 32;
         }

         if(this.field1719 < 32) {
            this.field1719 = 32;
         }

         if(this.field1716) {
            this.field1729 += 8;
            this.field1719 += 8;
         }

      }
   }

   public class136 method2971(boolean var1) {
      if(!var1 && field1683.length < this.field1690) {
         field1683 = new byte[this.field1690 + 100];
      }

      return this.method2953(var1, field1713, field1683);
   }

   void method2984() {
      if(this.field1744 != 2) {
         this.field1744 = 2;
         this.field1711 = 0;

         for(int var1 = 0; var1 < this.field1686; ++var1) {
            int var2 = this.field1687[var1];
            int var3 = this.field1688[var1];
            int var4 = this.field1732[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if(var5 > this.field1711) {
               this.field1711 = var5;
            }
         }

         this.field1711 = (int)(Math.sqrt((double)this.field1711) + 0.99D);
         this.field1741 = this.field1711;
         this.field1712 = this.field1711 + this.field1711;
      }
   }

   public class136 method3013(boolean var1) {
      if(!var1 && field1746.length < this.field1690) {
         field1746 = new byte[this.field1690 + 100];
      }

      return this.method2953(var1, field1684, field1746);
   }

   public void method2965(int var1) {
      int var2 = field1702[var1];
      int var3 = field1693[var1];

      for(int var4 = 0; var4 < this.field1686; ++var4) {
         int var5 = var3 * this.field1688[var4] - var2 * this.field1732[var4] >> 16;
         this.field1732[var4] = var2 * this.field1688[var4] + var3 * this.field1732[var4] >> 16;
         this.field1688[var4] = var5;
      }

      this.method2957();
   }

   public class136 method2985(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method2955();
      int var7 = var2 - this.field1711;
      int var8 = var2 + this.field1711;
      int var9 = var4 - this.field1711;
      int var10 = var4 + this.field1711;
      if(var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if(var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
            return this;
         } else {
            class136 var11;
            if(var5) {
               var11 = new class136();
               var11.field1686 = this.field1686;
               var11.field1690 = this.field1690;
               var11.field1698 = this.field1698;
               var11.field1687 = this.field1687;
               var11.field1732 = this.field1732;
               var11.field1691 = this.field1691;
               var11.field1682 = this.field1682;
               var11.field1725 = this.field1725;
               var11.field1694 = this.field1694;
               var11.field1695 = this.field1695;
               var11.field1747 = this.field1747;
               var11.field1697 = this.field1697;
               var11.field1708 = this.field1708;
               var11.field1699 = this.field1699;
               var11.field1700 = this.field1700;
               var11.field1701 = this.field1701;
               var11.field1685 = this.field1685;
               var11.field1704 = this.field1704;
               var11.field1705 = this.field1705;
               var11.field1718 = this.field1718;
               var11.field1730 = this.field1730;
               var11.field1716 = this.field1716;
               var11.field1688 = new int[var11.field1686];
            } else {
               var11 = this;
            }

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
               for(var12 = 0; var12 < var11.field1686; ++var12) {
                  var13 = var2 + this.field1687[var12];
                  var14 = var4 + this.field1732[var12];
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field1688[var12] = var21 + this.field1688[var12] - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field1686; ++var12) {
                  var13 = (-this.field1688[var12] << 16) / super.field1883;
                  if(var13 < var6) {
                     var14 = var2 + this.field1687[var12];
                     var15 = var4 + this.field1732[var12];
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field1688[var12] = (var6 - var13) * (var22 - var3) / var6 + this.field1688[var12];
                  }
               }
            }

            var11.method2957();
            return var11;
         }
      } else {
         return this;
      }
   }

   void vmethod3351(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      field1737[0] = -1;
      if(this.field1744 != 1) {
         this.method2955();
      }

      this.method2954(var1);
      int var11 = var5 * var8 - var4 * var6 >> 16;
      int var12 = var2 * var7 + var3 * var11 >> 16;
      int var13 = var3 * this.field1711 >> 16;
      int var14 = var12 + var13;
      if(var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var5 * var6 >> 16;
         int var16 = (var15 - this.field1711) * class139.field1780;
         if(var16 / var14 < class139.field1784) {
            int var17 = (var15 + this.field1711) * class139.field1780;
            if(var17 / var14 > class139.field1785) {
               int var18 = var3 * var7 - var11 * var2 >> 16;
               int var19 = var2 * this.field1711 >> 16;
               int var20 = (var18 + var19) * class139.field1780;
               if(var20 / var14 > class139.field1787) {
                  int var21 = (var3 * super.field1883 >> 16) + var19;
                  int var22 = (var18 - var21) * class139.field1780;
                  if(var22 / var14 < class139.field1777) {
                     int var23 = var13 + (var2 * super.field1883 >> 16);
                     boolean var24 = false;
                     boolean var25 = false;
                     if(var12 - var23 <= 50) {
                        var25 = true;
                     }

                     boolean var26 = var25 || this.field1698 > 0;
                     int var27 = class52.method905(1874324581);
                     int var28 = class137.field1752;
                     boolean var30 = class137.field1761;
                     boolean var32 = class121.method2621(var9);
                     boolean var33 = false;
                     int var35;
                     int var36;
                     int var37;
                     if(var32 && var30) {
                        boolean var34 = false;
                        if(field1743) {
                           var34 = class66.method1252(this, var6, var7, var8, 1749928116);
                        } else {
                           var35 = var12 - var13;
                           if(var35 <= 50) {
                              var35 = 50;
                           }

                           if(var15 > 0) {
                              var16 /= var14;
                              var17 /= var35;
                           } else {
                              var17 /= var14;
                              var16 /= var35;
                           }

                           if(var18 > 0) {
                              var22 /= var14;
                              var20 /= var35;
                           } else {
                              var20 /= var14;
                              var22 /= var35;
                           }

                           var36 = var27 - class139.field1775;
                           var37 = var28 - class139.field1788;
                           if(var36 > var16 && var36 < var17 && var37 > var22 && var37 < var20) {
                              var34 = true;
                           }
                        }

                        if(var34) {
                           if(this.field1716) {
                              class137.field1757[++class137.field1759 - 1] = var9;
                           } else {
                              var33 = true;
                           }
                        }
                     }

                     int var47 = class139.field1775;
                     var35 = class139.field1788;
                     var36 = 0;
                     var37 = 0;
                     if(var1 != 0) {
                        var36 = field1702[var1];
                        var37 = field1693[var1];
                     }

                     for(int var38 = 0; var38 < this.field1686; ++var38) {
                        int var39 = this.field1687[var38];
                        int var40 = this.field1688[var38];
                        int var41 = this.field1732[var38];
                        int var42;
                        if(var1 != 0) {
                           var42 = var41 * var36 + var39 * var37 >> 16;
                           var41 = var41 * var37 - var39 * var36 >> 16;
                           var39 = var42;
                        }

                        var39 += var6;
                        var40 += var7;
                        var41 += var8;
                        var42 = var41 * var4 + var5 * var39 >> 16;
                        var41 = var5 * var41 - var39 * var4 >> 16;
                        var39 = var42;
                        var42 = var3 * var40 - var41 * var2 >> 16;
                        var41 = var40 * var2 + var3 * var41 >> 16;
                        field1703[var38] = var41 - var12;
                        if(var41 >= 50) {
                           field1723[var38] = var39 * class139.field1780 / var41 + var47;
                           field1724[var38] = var42 * class139.field1780 / var41 + var35;
                        } else {
                           field1723[var38] = -5000;
                           var24 = true;
                        }

                        if(var26) {
                           field1726[var38] = var39;
                           field1707[var38] = var42;
                           field1728[var38] = var41;
                        }
                     }

                     try {
                        this.method2993(var24, var33, this.field1716, var9);
                     } catch (Exception var46) {
                        ;
                     }

                  }
               }
            }
         }
      }
   }

   public void method2964() {
      for(int var1 = 0; var1 < this.field1686; ++var1) {
         int var2 = this.field1732[var1];
         this.field1732[var1] = this.field1687[var1];
         this.field1687[var1] = -var2;
      }

      this.method2957();
   }

   public void method2967(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1686; ++var4) {
         this.field1687[var4] = this.field1687[var4] * var1 / 128;
         this.field1688[var4] = var2 * this.field1688[var4] / 128;
         this.field1732[var4] = var3 * this.field1732[var4] / 128;
      }

      this.method2957();
   }

   public void method2956() {
      for(int var1 = 0; var1 < this.field1686; ++var1) {
         this.field1687[var1] = -this.field1687[var1];
         this.field1732[var1] = -this.field1732[var1];
      }

      this.method2957();
   }

   public void method2969() {
      for(int var1 = 0; var1 < this.field1686; ++var1) {
         int var2 = this.field1687[var1];
         this.field1687[var1] = this.field1732[var1];
         this.field1732[var1] = -var2;
      }

      this.method2957();
   }

   final void method2972(int var1) {
      if(field1722[var1]) {
         this.method3015(var1);
      } else {
         int var2 = this.field1691[var1];
         int var3 = this.field1682[var1];
         int var4 = this.field1725[var1];
         class139.field1778 = field1721[var1];
         if(this.field1708 == null) {
            class139.field1789 = 0;
         } else {
            class139.field1789 = this.field1708[var1] & 255;
         }

         if(this.field1700 != null && this.field1700[var1] != -1) {
            int var5;
            int var6;
            int var7;
            if(this.field1699 != null && this.field1699[var1] != -1) {
               int var8 = this.field1699[var1] & 255;
               var5 = this.field1685[var8];
               var6 = this.field1704[var8];
               var7 = this.field1705[var8];
            } else {
               var5 = var2;
               var6 = var3;
               var7 = var4;
            }

            if(this.field1747[var1] == -1) {
               class139.method3095(field1724[var2], field1724[var3], field1724[var4], field1723[var2], field1723[var3], field1723[var4], this.field1694[var1], this.field1694[var1], this.field1694[var1], field1726[var5], field1726[var6], field1726[var7], field1707[var5], field1707[var6], field1707[var7], field1728[var5], field1728[var6], field1728[var7], this.field1700[var1]);
            } else {
               class139.method3095(field1724[var2], field1724[var3], field1724[var4], field1723[var2], field1723[var3], field1723[var4], this.field1694[var1], this.field1695[var1], this.field1747[var1], field1726[var5], field1726[var6], field1726[var7], field1707[var5], field1707[var6], field1707[var7], field1728[var5], field1728[var6], field1728[var7], this.field1700[var1]);
            }
         } else if(this.field1747[var1] == -1) {
            class139.method3093(field1724[var2], field1724[var3], field1724[var4], field1723[var2], field1723[var3], field1723[var4], field1748[this.field1694[var1]]);
         } else {
            class139.method3091(field1724[var2], field1724[var3], field1724[var4], field1723[var2], field1723[var3], field1723[var4], this.field1694[var1], this.field1695[var1], this.field1747[var1]);
         }

      }
   }

   public void method2960(class147 var1, int var2, class147 var3, int var4, int[] var5) {
      if(var2 != -1) {
         if(var5 != null && var4 != -1) {
            class134 var6 = var1.field1900[var2];
            class134 var7 = var3.field1900[var4];
            class141 var8 = var6.field1652;
            field1740 = 0;
            field1706 = 0;
            field1742 = 0;
            byte var9 = 0;
            int var13 = var9 + 1;
            int var10 = var5[var9];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.field1653; ++var11) {
               for(var12 = var6.field1649[var11]; var12 > var10; var10 = var5[var13++]) {
                  ;
               }

               if(var12 != var10 || var8.field1809[var12] == 0) {
                  this.method3014(var8.field1809[var12], var8.field1808[var12], var6.field1648[var11], var6.field1656[var11], var6.field1657[var11]);
               }
            }

            field1740 = 0;
            field1706 = 0;
            field1742 = 0;
            var9 = 0;
            var13 = var9 + 1;
            var10 = var5[var9];

            for(var11 = 0; var11 < var7.field1653; ++var11) {
               for(var12 = var7.field1649[var11]; var12 > var10; var10 = var5[var13++]) {
                  ;
               }

               if(var12 == var10 || var8.field1809[var12] == 0) {
                  this.method3014(var8.field1809[var12], var8.field1808[var12], var7.field1648[var11], var7.field1656[var11], var7.field1657[var11]);
               }
            }

            this.method2957();
         } else {
            this.method2959(var1, var2);
         }
      }
   }

   void method3014(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if(var1 == 0) {
         var7 = 0;
         field1740 = 0;
         field1706 = 0;
         field1742 = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var9 = var2[var8];
            if(var9 < this.field1718.length) {
               int[] var10 = this.field1718[var9];

               for(var11 = 0; var11 < var10.length; ++var11) {
                  var12 = var10[var11];
                  field1740 += this.field1687[var12];
                  field1706 += this.field1688[var12];
                  field1742 += this.field1732[var12];
                  ++var7;
               }
            }
         }

         if(var7 > 0) {
            field1740 = var3 + field1740 / var7;
            field1706 = var4 + field1706 / var7;
            field1742 = var5 + field1742 / var7;
         } else {
            field1740 = var3;
            field1706 = var4;
            field1742 = var5;
         }

      } else {
         int[] var18;
         int var19;
         if(var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field1718.length) {
                  var18 = this.field1718[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var11 = var18[var19];
                     this.field1687[var11] += var3;
                     this.field1688[var11] += var4;
                     this.field1732[var11] += var5;
                  }
               }
            }

         } else if(var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field1718.length) {
                  var18 = this.field1718[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var11 = var18[var19];
                     this.field1687[var11] -= field1740;
                     this.field1688[var11] -= field1706;
                     this.field1732[var11] -= field1742;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if(var14 != 0) {
                        var15 = field1702[var14];
                        var16 = field1693[var14];
                        var17 = var15 * this.field1688[var11] + var16 * this.field1687[var11] >> 16;
                        this.field1688[var11] = var16 * this.field1688[var11] - var15 * this.field1687[var11] >> 16;
                        this.field1687[var11] = var17;
                     }

                     if(var12 != 0) {
                        var15 = field1702[var12];
                        var16 = field1693[var12];
                        var17 = var16 * this.field1688[var11] - var15 * this.field1732[var11] >> 16;
                        this.field1732[var11] = var15 * this.field1688[var11] + var16 * this.field1732[var11] >> 16;
                        this.field1688[var11] = var17;
                     }

                     if(var13 != 0) {
                        var15 = field1702[var13];
                        var16 = field1693[var13];
                        var17 = var15 * this.field1732[var11] + var16 * this.field1687[var11] >> 16;
                        this.field1732[var11] = var16 * this.field1732[var11] - var15 * this.field1687[var11] >> 16;
                        this.field1687[var11] = var17;
                     }

                     this.field1687[var11] += field1740;
                     this.field1688[var11] += field1706;
                     this.field1732[var11] += field1742;
                  }
               }
            }

         } else if(var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field1718.length) {
                  var18 = this.field1718[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var11 = var18[var19];
                     this.field1687[var11] -= field1740;
                     this.field1688[var11] -= field1706;
                     this.field1732[var11] -= field1742;
                     this.field1687[var11] = var3 * this.field1687[var11] / 128;
                     this.field1688[var11] = var4 * this.field1688[var11] / 128;
                     this.field1732[var11] = var5 * this.field1732[var11] / 128;
                     this.field1687[var11] += field1740;
                     this.field1688[var11] += field1706;
                     this.field1732[var11] += field1742;
                  }
               }
            }

         } else if(var1 == 5) {
            if(this.field1730 != null && this.field1708 != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if(var8 < this.field1730.length) {
                     var18 = this.field1730[var8];

                     for(var19 = 0; var19 < var18.length; ++var19) {
                        var11 = var18[var19];
                        var12 = (this.field1708[var11] & 255) + var3 * 8;
                        if(var12 < 0) {
                           var12 = 0;
                        } else if(var12 > 255) {
                           var12 = 255;
                        }

                        this.field1708[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   final void method2993(boolean var1, boolean var2, boolean var3, long var4) {
      if(this.field1712 < 1600) {
         int var6;
         for(var6 = 0; var6 < this.field1712; ++var6) {
            field1737[var6] = 0;
         }

         var6 = var3?20:5;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(var7 = 0; var7 < this.field1690; ++var7) {
            if(this.field1747[var7] != -2) {
               var8 = this.field1691[var7];
               var9 = this.field1682[var7];
               var10 = this.field1725[var7];
               var11 = field1723[var8];
               var12 = field1723[var9];
               var13 = field1723[var10];
               int var17;
               int var34;
               if(var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
                  var34 = field1726[var8];
                  var15 = field1726[var9];
                  var16 = field1726[var10];
                  var17 = field1707[var8];
                  var18 = field1707[var9];
                  int var19 = field1707[var10];
                  int var20 = field1728[var8];
                  int var21 = field1728[var9];
                  int var22 = field1728[var10];
                  var34 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var34 * var22;
                  int var25 = var34 * var19 - var17 * var16;
                  if(var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     field1722[var7] = true;
                     int var26 = (field1703[var8] + field1703[var9] + field1703[var10]) / 3 + this.field1741;
                     field1731[var26][field1737[var26]++] = var7;
                  }
               } else {
                  if(var2) {
                     var15 = field1724[var8];
                     var16 = field1724[var9];
                     var17 = field1724[var10];
                     var18 = var6 + class137.field1752;
                     boolean var14;
                     if(var18 < var15 && var18 < var16 && var18 < var17) {
                        var14 = false;
                     } else {
                        var18 = class137.field1752 - var6;
                        if(var18 > var15 && var18 > var16 && var18 > var17) {
                           var14 = false;
                        } else {
                           var18 = var6 + class137.field1754;
                           if(var18 < var11 && var18 < var12 && var18 < var13) {
                              var14 = false;
                           } else {
                              var18 = class137.field1754 - var6;
                              if(var18 > var11 && var18 > var12 && var18 > var13) {
                                 var14 = false;
                              } else {
                                 var14 = true;
                              }
                           }
                        }
                     }

                     if(var14) {
                        class137.field1757[++class137.field1759 - 1] = var4;
                        var2 = false;
                     }
                  }

                  if((var11 - var12) * (field1724[var10] - field1724[var9]) - (var13 - var12) * (field1724[var8] - field1724[var9]) > 0) {
                     field1722[var7] = false;
                     if(var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= class139.field1783 && var12 <= class139.field1783 && var13 <= class139.field1783) {
                        field1721[var7] = false;
                     } else {
                        field1721[var7] = true;
                     }

                     var34 = (field1703[var8] + field1703[var9] + field1703[var10]) / 3 + this.field1741;
                     field1731[var34][field1737[var34]++] = var7;
                  }
               }
            }
         }

         int[] var27;
         if(this.field1697 == null) {
            for(var7 = this.field1712 - 1; var7 >= 0; --var7) {
               var8 = field1737[var7];
               if(var8 > 0) {
                  var27 = field1731[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     this.method2972(var27[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               field1736[var7] = 0;
               field1733[var7] = 0;
            }

            for(var7 = this.field1712 - 1; var7 >= 0; --var7) {
               var8 = field1737[var7];
               if(var8 > 0) {
                  var27 = field1731[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     var11 = var27[var10];
                     byte var33 = this.field1697[var11];
                     var13 = field1736[var33]++;
                     field1727[var33][var13] = var11;
                     if(var33 < 10) {
                        field1733[var33] += var7;
                     } else if(var33 == 10) {
                        field1734[var13] = var7;
                     } else {
                        field1735[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if(field1736[1] > 0 || field1736[2] > 0) {
               var7 = (field1733[1] + field1733[2]) / (field1736[1] + field1736[2]);
            }

            var8 = 0;
            if(field1736[3] > 0 || field1736[4] > 0) {
               var8 = (field1733[3] + field1733[4]) / (field1736[3] + field1736[4]);
            }

            var9 = 0;
            if(field1736[6] > 0 || field1736[8] > 0) {
               var9 = (field1733[8] + field1733[6]) / (field1736[8] + field1736[6]);
            }

            var11 = 0;
            var12 = field1736[10];
            int[] var30 = field1727[10];
            int[] var31 = field1734;
            if(var11 == var12) {
               var11 = 0;
               var12 = field1736[11];
               var30 = field1727[11];
               var31 = field1735;
            }

            if(var11 < var12) {
               var10 = var31[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.method2972(var30[var11++]);
                  if(var11 == var12 && var30 != field1727[11]) {
                     var11 = 0;
                     var12 = field1736[11];
                     var30 = field1727[11];
                     var31 = field1735;
                  }

                  if(var11 < var12) {
                     var10 = var31[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.method2972(var30[var11++]);
                  if(var11 == var12 && var30 != field1727[11]) {
                     var11 = 0;
                     var12 = field1736[11];
                     var30 = field1727[11];
                     var31 = field1735;
                  }

                  if(var11 < var12) {
                     var10 = var31[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.method2972(var30[var11++]);
                  if(var11 == var12 && var30 != field1727[11]) {
                     var11 = 0;
                     var12 = field1736[11];
                     var30 = field1727[11];
                     var31 = field1735;
                  }

                  if(var11 < var12) {
                     var10 = var31[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = field1736[var15];
               int[] var32 = field1727[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.method2972(var32[var18]);
               }
            }

            while(var10 != -1000) {
               this.method2972(var30[var11++]);
               if(var11 == var12 && var30 != field1727[11]) {
                  var11 = 0;
                  var30 = field1727[11];
                  var12 = field1736[11];
                  var31 = field1735;
               }

               if(var11 < var12) {
                  var10 = var31[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   public void method2966(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1686; ++var4) {
         this.field1687[var4] += var1;
         this.field1688[var4] += var2;
         this.field1732[var4] += var3;
      }

      this.method2957();
   }

   public final void method2968(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      field1737[0] = -1;
      if(this.field1744 != 2 && this.field1744 != 1) {
         this.method2984();
      }

      int var8 = class139.field1775;
      int var9 = class139.field1788;
      int var10 = field1702[var1];
      int var11 = field1693[var1];
      int var12 = field1702[var2];
      int var13 = field1693[var2];
      int var14 = field1702[var3];
      int var15 = field1693[var3];
      int var16 = field1702[var4];
      int var17 = field1693[var4];
      int var18 = var16 * var6 + var17 * var7 >> 16;

      for(int var19 = 0; var19 < this.field1686; ++var19) {
         int var20 = this.field1687[var19];
         int var21 = this.field1688[var19];
         int var22 = this.field1732[var19];
         int var23;
         if(var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if(var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if(var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         field1703[var19] = var22 - var18;
         field1723[var19] = var20 * class139.field1780 / var22 + var8;
         field1724[var19] = var23 * class139.field1780 / var22 + var9;
         if(this.field1698 > 0) {
            field1726[var19] = var20;
            field1707[var19] = var23;
            field1728[var19] = var22;
         }
      }

      try {
         this.method2993(false, false, false, 0L);
      } catch (Exception var25) {
         ;
      }

   }

   public final void method2999(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      field1737[0] = -1;
      if(this.field1744 != 2 && this.field1744 != 1) {
         this.method2984();
      }

      int var9 = class139.field1775;
      int var10 = class139.field1788;
      int var11 = field1702[var1];
      int var12 = field1693[var1];
      int var13 = field1702[var2];
      int var14 = field1693[var2];
      int var15 = field1702[var3];
      int var16 = field1693[var3];
      int var17 = field1702[var4];
      int var18 = field1693[var4];
      int var19 = var17 * var6 + var18 * var7 >> 16;

      for(int var20 = 0; var20 < this.field1686; ++var20) {
         int var21 = this.field1687[var20];
         int var22 = this.field1688[var20];
         int var23 = this.field1732[var20];
         int var24;
         if(var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if(var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if(var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field1703[var20] = var23 - var19;
         field1723[var20] = var9 + var21 * class139.field1780 / var8;
         field1724[var20] = var10 + var24 * class139.field1780 / var8;
         if(this.field1698 > 0) {
            field1726[var20] = var21;
            field1707[var20] = var24;
            field1728[var20] = var23;
         }
      }

      try {
         this.method2993(false, false, false, 0L);
      } catch (Exception var26) {
         ;
      }

   }

   public int method2979() {
      this.method2955();
      return this.field1711;
   }
}
