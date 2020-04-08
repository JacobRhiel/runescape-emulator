package src;

import java.util.*;

public class class342 {

   static final class301 field3971 = class301.field3657;
   static final class301 field3976 = class301.field3658;
   static final class301 field3977 = class301.field3663;
   class333[] field3980;
   boolean field4005 = false;
   HashSet field4012 = new HashSet();
   int field4020 = 3;
   int field4022 = -1;
   HashSet field3975 = new HashSet();
   int field3994 = -1;
   int field4010 = -1;
   boolean field4015 = false;
   HashSet field3997 = new HashSet();
   int field3998 = 50;
   HashMap field3981;
   HashSet field4000 = null;
   class341 field3986;
   Iterator field4011;
   int field3989 = -1;
   float field4006;
   class334 field4009;
   int field4024;
   class35 field3983;
   int field3970 = -1;
   class243 field3972;
   int field3990 = -1;
   class222 field4021 = null;
   int field3988;
   float field3991;
   class45 field3985;
   int field3995 = -1;
   HashMap field3996;
   int field4001 = -1;
   class35 field3984;
   class243 field3968;
   class35 field3982;
   int field4004 = -1;
   class243 field3974;
   int field4002 = -1;
   int field4003 = -1;
   HashSet field4027 = new HashSet();
   class304 field3978;
   int field4014;
   int field3992 = -1;
   List field4018;
   int field3999 = -1;
   int field4025 = -1;
   int field4026 = -1;
   boolean field3993 = true;
   HashSet field4019 = new HashSet();
   final int[] field4017 = new int[]{1008, 1009, 1010, 1011, 1012};
   int field4008;
   int field4023;
   int field4016 = 0;
   long field4007;
   public boolean field4013 = false;


   public class35 method6390(int var1, int var2, int var3, int var4) {
      Iterator var5 = this.field3981.values().iterator();

      class35 var6;
      do {
         if(!var5.hasNext()) {
            return null;
         }

         var6 = (class35)var5.next();
      } while(!var6.method468(var1, var2, var3, (byte)-47));

      return var6;
   }

   boolean method6567(int var1) {
      return this.field3989 != -1 && this.field3990 != -1;
   }

   float method6404(int var1, int var2) {
      return var1 == 25?1.0F:(var1 == 37?1.5F:(var1 == 50?2.0F:(var1 == 75?3.0F:(var1 == 100?4.0F:8.0F))));
   }

   public class35 method6434(int var1, int var2) {
      Iterator var3 = this.field3981.values().iterator();

      class35 var4;
      do {
         if(!var3.hasNext()) {
            return null;
         }

         var4 = (class35)var3.next();
      } while(var4.method441((byte)38) != var1);

      return var4;
   }

   void method6444(class35 var1, int var2) {
      this.field3983 = var1;
      this.field3985 = new class45(this.field3980, this.field3996, this.field3968, this.field3974);
      this.field3986.method6366(this.field3983.method449((byte)21), -2004873028);
   }

   void method6391(class35 var1, byte var2) {
      if(this.field3983 == null || var1 != this.field3983) {
         this.method6444(var1, -1810722368);
         this.method6553(-1, -1, -1, (byte)86);
      }
   }

   public int method6412(byte var1) {
      return this.field3983 == null?-1:this.field4024 + this.field3983.method453(1003198197) * 64;
   }

   void method6385(byte var1) {
      if(class31.field222 != null) {
         this.field3991 = this.field4006;
      } else {
         if(this.field3991 < this.field4006) {
            this.field3991 = Math.min(this.field4006, this.field3991 / 30.0F + this.field3991);
         }

         if(this.field3991 > this.field4006) {
            this.field3991 = Math.max(this.field4006, this.field3991 - this.field3991 / 30.0F);
         }

      }
   }

   void method6474(int var1) {
      this.field3997.clear();
      this.field3997.addAll(this.field3975);
      this.field3997.addAll(this.field4027);
   }

   void method6553(int var1, int var2, int var3, byte var4) {
      if(this.field3983 != null) {
         int[] var5 = this.field3983.method444(var1, var2, var3, (byte)-62);
         if(var5 == null) {
            var5 = this.field3983.method444(this.field3983.method496(567530142), this.field3983.method457(-2108645613), this.field3983.method447((byte)-86), (byte)-83);
         }

         this.method6387(var5[0] - this.field3983.method453(1003198197) * 64, var5[1] - this.field3983.method439(1596015720) * 64, true, 353769390);
         this.field3989 = -1;
         this.field3990 = -1;
         this.field3991 = this.method6404(this.field3983.method452(2036158074), 132963455);
         this.field4006 = this.field3991;
         this.field4018 = null;
         this.field4011 = null;
         this.field3985.method733(2062651870);
      }
   }

   public int method6415(byte var1) {
      return this.field4010;
   }

   public int method6408(int var1) {
      return this.field3983 == null?-1:this.field3988 + this.field3983.method439(944164467) * 64;
   }

   void method6386(int var1) {
      if(this.method6567(-1055552076)) {
         int var2 = this.field3989 - this.field4024;
         int var3 = this.field3990 - this.field3988;
         if(var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         if(var3 != 0) {
            var3 /= Math.min(8, Math.abs(var3));
         }

         this.method6387(var2 + this.field4024, var3 + this.field3988, true, 353769390);
         if(this.field4024 == this.field3989 && this.field3988 == this.field3990) {
            this.field3989 = -1;
            this.field3990 = -1;
         }

      }
   }

   final void method6388(byte var1) {
      this.field4022 = -1;
      this.field3970 = -1;
      this.field4004 = -1;
      this.field4003 = -1;
   }

   public void method6437(int var1, int var2, int var3) {
      if(this.field3983 != null && this.field3983.method443(var1, var2, -541055130)) {
         this.field3989 = var1 - this.field3983.method453(1003198197) * 64;
         this.field3990 = var2 - this.field3983.method439(2084739447) * 64;
      }
   }

   public void method6458(int var1, int var2, byte var3) {
      if(this.field3983 != null) {
         this.method6387(var1 - this.field3983.method453(1003198197) * 64, var2 - this.field3983.method439(1085961439) * 64, true, 353769390);
         this.field3989 = -1;
         this.field3990 = -1;
      }
   }

   void method6450(int var1, int var2, boolean var3, long var4) {
      if(this.field3983 != null) {
         int var6 = (int)((float)this.field4024 + ((float)(var1 - this.field3995) - (float)this.method6415((byte)-27) * this.field3991 / 2.0F) / this.field3991);
         int var7 = (int)((float)this.field3988 - ((float)(var2 - this.field3992) - (float)this.method6416(-165837872) * this.field3991 / 2.0F) / this.field3991);
         this.field4021 = this.field3983.method456(var6 + this.field3983.method453(1003198197) * 64, var7 + this.field3983.method439(-204946563) * 64, (byte)-65);
         if(this.field4021 != null && var3) {
            if(class146.method3365(2004571993) && class54.field426[82] && class54.field426[81]) {
               class14.method148(this.field4021.field2532, this.field4021.field2529, this.field4021.field2528, false, -528873648);
            } else {
               boolean var8 = true;
               if(this.field3993) {
                  int var9 = var1 - this.field4008;
                  int var10 = var2 - this.field4023;
                  if(var4 - this.field4007 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                     var8 = false;
                  }
               }

               if(var8) {
                  class196 var11 = class146.method3363(class192.field2260, client.field761.field1340, -1782506501);
                  var11.field2338.method5689(this.field4021.method4043(-1899522246), 747474969);
                  client.field761.method2361(var11, 824612981);
                  this.field4007 = 0L;
               }
            }
         }
      } else {
         this.field4021 = null;
      }

   }

   final void method6387(int var1, int var2, boolean var3, int var4) {
      this.field4024 = var1;
      this.field3988 = var2;
      class217.method4014(1085553220);
      if(var3) {
         this.method6388((byte)12);
      }

   }

   public int method6416(int var1) {
      return this.field3994;
   }

   public class43 method6436(int var1) {
      if(this.field4011 == null) {
         return null;
      } else {
         class43 var2;
         do {
            if(!this.field4011.hasNext()) {
               return null;
            }

            var2 = (class43)this.field4011.next();
         } while(var2.vmethod685((byte)37) == -1);

         return var2;
      }
   }

   boolean method6400(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      return this.field4009 == null?true:(this.field4009.field3889 == var1 && this.field4009.field3899 == var2?(this.field3985.field356 != this.field4014?true:(this.field3999 != client.field891?true:(var3 <= 0 && var4 <= 0?var3 + var1 < var5 || var2 + var4 < var6:true))):true);
   }

   void method6403(int var1, int var2, int var3, int var4, int var5, int var6) {
      byte var7 = 20;
      int var8 = var3 / 2 + var1;
      int var9 = var4 / 2 + var2 - 18 - var7;
      class330.method6052(var1, var2, var3, var4, -16777216);
      class330.method6137(var8 - 152, var9, 304, 34, -65536);
      class330.method6052(var8 - 150, var9 + 2, var5 * 3, 30, -65536);
      this.field3978.method5392("Loading...", var8, var9 + var7, -1, -1);
   }

   void method6389(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      if(class31.field222 != null) {
         int var8 = 512 / (this.field3985.field356 * 2);
         int var9 = var3 + 512;
         int var10 = var4 + 512;
         float var11 = 1.0F;
         var9 = (int)((float)var9 / var11);
         var10 = (int)((float)var10 / var11);
         int var12 = this.method6412((byte)-33) - var5 / 2 - var8;
         int var13 = this.method6408(-1680543206) - var6 / 2 - var8;
         int var14 = var1 - (var8 + var12 - this.field4025) * this.field3985.field356;
         int var15 = var2 - this.field3985.field356 * (var8 - (var13 - this.field4026));
         if(this.method6400(var9, var10, var14, var15, var3, var4, -1422166631)) {
            if(this.field4009 != null && this.field4009.field3889 == var9 && this.field4009.field3899 == var10) {
               Arrays.fill(this.field4009.field3896, 0);
            } else {
               this.field4009 = new class334(var9, var10);
            }

            this.field4025 = this.method6412((byte)19) - var5 / 2 - var8;
            this.field4026 = this.method6408(-1444727297) - var6 / 2 - var8;
            this.field4014 = this.field3985.field356;
            class31.field222.method4383(this.field4025, this.field4026, this.field4009, (float)this.field4014 / var11, 1134396059);
            this.field3999 = client.field891;
            var14 = var1 - (var12 + var8 - this.field4025) * this.field3985.field356;
            var15 = var2 - this.field3985.field356 * (var8 - (var13 - this.field4026));
         }

         class330.method6051(var1, var2, var3, var4, 0, 128);
         if(var11 == 1.0F) {
            this.field4009.method6197(var14, var15, 192);
         } else {
            this.field4009.method6231(var14, var15, (int)(var11 * (float)var9), (int)(var11 * (float)var10), 192);
         }
      }

   }

   public void method6432(int var1, int var2, int var3, int var4, int var5, byte var6) {
      int[] var7 = new int[4];
      class330.method6047(var7);
      class330.method6045(var1, var2, var3 + var1, var2 + var4);
      class330.method6052(var1, var2, var3, var4, -16777216);
      int var8 = this.field3986.method6369((byte)16);
      if(var8 < 100) {
         this.method6403(var1, var2, var3, var4, var8, 1603223574);
      } else {
         if(!this.field3985.method743((byte)8)) {
            this.field3985.method725(this.field3972, this.field3983.method449((byte)100), client.field683, 1660505626);
            if(!this.field3985.method743((byte)8)) {
               return;
            }
         }

         if(this.field4000 != null) {
            ++this.field4002;
            if(this.field4002 % this.field3998 == 0) {
               this.field4002 = 0;
               ++this.field4001;
            }

            if(this.field4001 >= this.field4020 && !this.field4005) {
               this.field4000 = null;
            }
         }

         int var9 = (int)Math.ceil((double)((float)var3 / this.field3991));
         int var10 = (int)Math.ceil((double)((float)var4 / this.field3991));
         this.field3985.method720(this.field4024 - var9 / 2, this.field3988 - var10 / 2, var9 / 2 + this.field4024, var10 / 2 + this.field3988, var1, var2, var3 + var1, var2 + var4, (byte)8);
         if(!this.field4015) {
            boolean var11 = false;
            if(var5 - this.field4016 > 100) {
               this.field4016 = var5;
               var11 = true;
            }

            this.field3985.method721(this.field4024 - var9 / 2, this.field3988 - var10 / 2, var9 / 2 + this.field4024, var10 / 2 + this.field3988, var1, var2, var3 + var1, var2 + var4, this.field3997, this.field4000, this.field4002, this.field3998, var11, (byte)18);
         }

         this.method6389(var1, var2, var3, var4, var9, var10, (byte)8);
         if(class146.method3365(2112938441) && this.field4013 && this.field4021 != null) {
            this.field3978.method5389("Coord: " + this.field4021, class330.field3867 + 10, class330.field3862 + 20, 16776960, -1);
         }

         this.field4010 = var9;
         this.field3994 = var10;
         this.field3995 = var1;
         this.field3992 = var2;
         class330.method6048(var7);
      }
   }

   public void method6401(int var1, int var2, int var3, int var4, byte var5) {
      if(this.field3986.method6367((byte)85)) {
         if(!this.field3985.method743((byte)8)) {
            this.field3985.method725(this.field3972, this.field3983.method449((byte)121), client.field683, -1706381128);
            if(!this.field3985.method743((byte)8)) {
               return;
            }
         }

         this.field3985.method729(var1, var2, var3, var4, this.field4000, this.field4002, this.field3998, (byte)73);
      }
   }

   public void method6472(int var1) {
      class38.field289.method3446(5);
   }

   public void method6380(class243 var1, class243 var2, class243 var3, class304 var4, HashMap var5, class333[] var6, int var7) {
      this.field3980 = var6;
      this.field3972 = var1;
      this.field3968 = var2;
      this.field3974 = var3;
      this.field3978 = var4;
      this.field3996 = new HashMap();
      this.field3996.put(class26.field159, var5.get(field3971));
      this.field3996.put(class26.field151, var5.get(field3976));
      this.field3996.put(class26.field161, var5.get(field3977));
      this.field3986 = new class341(var1);
      int var8 = this.field3972.method4240(class44.field339.field344, (short)-4568);
      int[] var9 = this.field3972.method4234(var8, 1678035371);
      this.field3981 = new HashMap(var9.length);

      for(int var10 = 0; var10 < var9.length; ++var10) {
         class309 var11 = new class309(this.field3972.method4224(var8, var9[var10], (byte)-88));
         class35 var12 = new class35();
         var12.method471(var11, var9[var10], (byte)9);
         this.field3981.put(var12.method449((byte)76), var12);
         if(var12.method458((byte)-126)) {
            this.field3982 = var12;
         }
      }

      this.method6391(this.field3982, (byte)-18);
      this.field3984 = null;
   }

   public void method6487(int var1, int var2, int var3, boolean var4, int var5) {
      class35 var6 = this.method6390(var1, var2, var3, 1867716364);
      if(var6 == null) {
         if(!var4) {
            return;
         }

         var6 = this.field3982;
      }

      boolean var7 = false;
      if(var6 != this.field3984 || var4) {
         this.field3984 = var6;
         this.method6391(var6, (byte)23);
         var7 = true;
      }

      if(var7 || var4) {
         this.method6553(var1, var2, var3, (byte)45);
      }

   }

   public void method6406(int var1) {
      this.field3986.method6370(-1654768805);
   }

   public void method6382(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7, int var8) {
      if(this.field3986.method6367((byte)30)) {
         this.method6385((byte)22);
         this.method6386(819469805);
         if(var3) {
            int var9 = (int)Math.ceil((double)((float)var6 / this.field3991));
            int var10 = (int)Math.ceil((double)((float)var7 / this.field3991));
            List var11 = this.field3985.method722(this.field4024 - var9 / 2 - 1, this.field3988 - var10 / 2 - 1, var9 / 2 + this.field4024 + 1, var10 / 2 + this.field3988 + 1, var4, var5, var6, var7, var1, var2, 1400578411);
            HashSet var12 = new HashSet();

            Iterator var13;
            class43 var14;
            class71 var15;
            class50 var16;
            for(var13 = var11.iterator(); var13.hasNext(); class76.method1395(var15, 1420275302)) {
               var14 = (class43)var13.next();
               var12.add(var14);
               var15 = new class71();
               var16 = new class50(var14.vmethod685((byte)16), var14.field327, var14.field326);
               var15.method1284(new Object[]{var16, Integer.valueOf(var1), Integer.valueOf(var2)}, -2136371044);
               if(this.field4019.contains(var14)) {
                  var15.method1282(17, (byte)45);
               } else {
                  var15.method1282(15, (byte)100);
               }
            }

            var13 = this.field4019.iterator();

            while(var13.hasNext()) {
               var14 = (class43)var13.next();
               if(!var12.contains(var14)) {
                  var15 = new class71();
                  var16 = new class50(var14.vmethod685((byte)53), var14.field327, var14.field326);
                  var15.method1284(new Object[]{var16, Integer.valueOf(var1), Integer.valueOf(var2)}, -455043076);
                  var15.method1282(16, (byte)120);
                  class76.method1395(var15, 1731861276);
               }
            }

            this.field4019 = var12;
         }
      }
   }

   public void method6426(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      if(this.field3986.method6367((byte)1)) {
         int var8 = (int)Math.ceil((double)((float)var3 / this.field3991));
         int var9 = (int)Math.ceil((double)((float)var4 / this.field3991));
         List var10 = this.field3985.method722(this.field4024 - var8 / 2 - 1, this.field3988 - var9 / 2 - 1, var8 / 2 + this.field4024 + 1, var9 / 2 + this.field3988 + 1, var1, var2, var3, var4, var5, var6, 1894260703);
         if(!var10.isEmpty()) {
            Iterator var11 = var10.iterator();

            boolean var14;
            do {
               if(!var11.hasNext()) {
                  return;
               }

               class43 var12 = (class43)var11.next();
               class251 var13 = class25.method279(var12.vmethod685((byte)83), 1263163113);
               var14 = false;

               for(int var15 = this.field4017.length - 1; var15 >= 0; --var15) {
                  if(var13.field3209[var15] != null) {
                     class285.method5111(var13.field3209[var15], var13.field3227, this.field4017[var15], var12.vmethod685((byte)101), var12.field327.method4043(-276086796), var12.field326.method4043(-709615372), (byte)118);
                     var14 = true;
                  }
               }
            } while(!var14);

         }
      }
   }

   public void method6468(int var1, int var2, class222 var3, class222 var4, byte var5) {
      class71 var6 = new class71();
      class50 var7 = new class50(var2, var3, var4);
      var6.method1284(new Object[]{var7}, -1877597946);
      switch(var1) {
      case 1008:
         var6.method1282(10, (byte)77);
         break;
      case 1009:
         var6.method1282(11, (byte)1);
         break;
      case 1010:
         var6.method1282(12, (byte)92);
         break;
      case 1011:
         var6.method1282(13, (byte)69);
         break;
      case 1012:
         var6.method1282(14, (byte)66);
      }

      class76.method1395(var6, -1349949313);
   }

   public void method6465(int var1, int var2) {
      class35 var3 = this.method6434(var1, 915789616);
      if(var3 != null) {
         this.method6391(var3, (byte)42);
      }

   }

   public int method6405(int var1) {
      return (double)this.field4006 == 1.0D?25:(1.5D == (double)this.field4006?37:((double)this.field4006 == 2.0D?50:(3.0D == (double)this.field4006?75:((double)this.field4006 == 4.0D?100:200))));
   }

   public void method6402(int var1, int var2) {
      this.field4006 = this.method6404(var1, 836995318);
   }

   public boolean method6407(int var1) {
      return this.field3986.method6367((byte)94);
   }

   public class222 method6414(byte var1) {
      return this.field3983 == null?null:this.field3983.method456(this.method6412((byte)49), this.method6408(-1375471719), (byte)-46);
   }

   public void method6383(int var1, int var2, boolean var3, boolean var4, int var5) {
      long var6 = class217.method4014(-1679506097);
      this.method6450(var1, var2, var4, var6);
      if(!this.method6567(408108894) && (var4 || var3)) {
         if(var4) {
            this.field3970 = var1;
            this.field4022 = var2;
            this.field4003 = this.field4024;
            this.field4004 = this.field3988;
         }

         if(this.field4003 != -1) {
            int var8 = var1 - this.field3970;
            int var9 = var2 - this.field4022;
            this.method6387(this.field4003 - (int)((float)var8 / this.field4006), (int)((float)var9 / this.field4006) + this.field4004, false, 353769390);
         }
      } else {
         this.method6388((byte)32);
      }

      if(var4) {
         this.field4007 = var6;
         this.field4008 = var1;
         this.field4023 = var2;
      }

   }

   public void method6410(int var1, int var2, int var3, int var4) {
      if(this.field3983 != null) {
         int[] var5 = this.field3983.method444(var1, var2, var3, (byte)-56);
         if(var5 != null) {
            this.method6437(var5[0], var5[1], 2109166281);
         }

      }
   }

   public void method6411(int var1, int var2, int var3, byte var4) {
      if(this.field3983 != null) {
         int[] var5 = this.field3983.method444(var1, var2, var3, (byte)-44);
         if(var5 != null) {
            this.method6458(var5[0], var5[1], (byte)103);
         }

      }
   }

   public int method6393(int var1) {
      return this.field3983 == null?-1:this.field3983.method441((byte)104);
   }

   public void method6398(int var1) {
      this.field4020 = 3;
   }

   public class35 method6530(int var1) {
      return this.field3983;
   }

   public void method6420(int var1) {
      this.field3998 = 50;
   }

   public void method6417(int var1, byte var2) {
      if(var1 >= 1) {
         this.field4020 = var1;
      }

   }

   public void method6418(int var1) {
      this.field4000 = null;
   }

   public void method6582(int var1, int var2) {
      if(var1 >= 1) {
         this.field3998 = var1;
      }

   }

   public void method6422(int var1, int var2) {
      this.field4000 = new HashSet();
      this.field4000.add(Integer.valueOf(var1));
      this.field4001 = 0;
      this.field4002 = 0;
   }

   public void method6421(boolean var1, int var2) {
      this.field4005 = var1;
   }

   public void method6423(int var1, int var2) {
      this.field4000 = new HashSet();
      this.field4001 = 0;
      this.field4002 = 0;

      for(int var3 = 0; var3 < class277.field3552; ++var3) {
         if(class25.method279(var3, 138767173) != null && class25.method279(var3, -1081771620).field3213 == var1) {
            this.field4000.add(Integer.valueOf(class25.method279(var3, 1008353727).field3212));
         }
      }

   }

   public class43 method6435(int var1) {
      if(!this.field3986.method6367((byte)103)) {
         return null;
      } else if(!this.field3985.method743((byte)8)) {
         return null;
      } else {
         HashMap var2 = this.field3985.method719((byte)-38);
         this.field4018 = new LinkedList();
         Iterator var3 = var2.values().iterator();

         while(var3.hasNext()) {
            List var4 = (List)var3.next();
            this.field4018.addAll(var4);
         }

         this.field4011 = this.field4018.iterator();
         return this.method6436(-528069180);
      }
   }

   public void method6395(boolean var1, int var2) {
      this.field4015 = !var1;
   }

   public boolean method6463(int var1) {
      return !this.field4015;
   }

   public void method6491(int var1, boolean var2, int var3) {
      if(!var2) {
         this.field3975.add(Integer.valueOf(var1));
      } else {
         this.field3975.remove(Integer.valueOf(var1));
      }

      this.method6474(105577872);
   }

   public void method6424(int var1, boolean var2, int var3) {
      if(!var2) {
         this.field4012.add(Integer.valueOf(var1));
      } else {
         this.field4012.remove(Integer.valueOf(var1));
      }

      for(int var4 = 0; var4 < class277.field3552; ++var4) {
         if(class25.method279(var4, -1334655837) != null && class25.method279(var4, -1061825905).field3213 == var1) {
            int var5 = class25.method279(var4, 702368313).field3212;
            if(!var2) {
               this.field4027.add(Integer.valueOf(var5));
            } else {
               this.field4027.remove(Integer.valueOf(var5));
            }
         }
      }

      this.method6474(105577872);
   }

   public boolean method6429(int var1, int var2) {
      return !this.field3975.contains(Integer.valueOf(var1));
   }

   public void method6551(class35 var1, class222 var2, class222 var3, boolean var4, int var5) {
      if(var1 != null) {
         if(this.field3983 == null || var1 != this.field3983) {
            this.method6444(var1, -1921583253);
         }

         if(!var4 && this.field3983.method468(var2.field2528, var2.field2532, var2.field2529, (byte)49)) {
            this.method6553(var2.field2528, var2.field2532, var2.field2529, (byte)50);
         } else {
            this.method6553(var3.field2528, var3.field2532, var3.field2529, (byte)54);
         }

      }
   }

   public boolean method6430(int var1, short var2) {
      return !this.field4012.contains(Integer.valueOf(var1));
   }

   public class222 method6433(int var1, class222 var2, byte var3) {
      if(!this.field3986.method6367((byte)4)) {
         return null;
      } else if(!this.field3985.method743((byte)8)) {
         return null;
      } else if(!this.field3983.method443(var2.field2532, var2.field2529, 1880984161)) {
         return null;
      } else {
         HashMap var4 = this.field3985.method719((byte)-55);
         List var5 = (List)var4.get(Integer.valueOf(var1));
         if(var5 != null && !var5.isEmpty()) {
            class43 var6 = null;
            int var7 = -1;
            Iterator var8 = var5.iterator();

            while(var8.hasNext()) {
               class43 var9 = (class43)var8.next();
               int var10 = var9.field326.field2532 - var2.field2532;
               int var11 = var9.field326.field2529 - var2.field2529;
               int var12 = var10 * var10 + var11 * var11;
               if(var12 == 0) {
                  return var9.field326;
               }

               if(var12 < var7 || var6 == null) {
                  var6 = var9;
                  var7 = var12;
               }
            }

            return var6.field326;
         } else {
            return null;
         }
      }
   }
}
