package src;

public class class83 {

   static int[] field1086;
   int field1092 = 0;
   public final class285 field1093;
   public final class291 field1090;
   final class347 field1091;


   class83(class347 var1) {
      this.field1091 = var1;
      this.field1090 = new class291(var1);
      this.field1093 = new class285(var1);
   }

   final boolean method1951(class292 var1, int var2) {
      class293 var3 = (class293)this.field1090.method5202(var1, -292785066);
      return var3 != null && var3.method5215(-182915585);
   }

   final boolean method1946(int var1) {
      return this.field1090.method5174(1500565158) || this.field1090.method5115((byte)4) >= 200 && client.field798 != 1;
   }

   final boolean method1948(byte var1) {
      return this.field1093.method5174(-759710154) || this.field1093.method5115((byte)4) >= 100 && client.field798 != 1;
   }

   final boolean method1977(class292 var1, boolean var2, int var3) {
      return var1 == null?false:(var1.equals(class311.field3717.field652)?true:this.field1090.method5236(var1, var2, -141392117));
   }

   final boolean method1944(class292 var1, byte var2) {
      return var1 == null?false:this.field1093.method5117(var1, 330121019);
   }

   final void method1949(class309 var1, int var2, int var3) {
      this.field1090.method5231(var1, var2, (byte)51);
      this.field1092 = 2;
      class236.method4200((byte)121);
   }

   final void method1939(byte var1) {
      this.field1092 = 1;
   }

   boolean method1938(int var1) {
      return this.field1092 == 2;
   }

   final void method1945(String var1, byte var2) {
      if(var1 != null) {
         class292 var3 = new class292(var1, this.field1091);
         if(var3.method5239(-1005152425)) {
            if(this.method1946(2128609566)) {
               class193.method3674(1902674476);
            } else if(class311.field3717.field652.equals(var3)) {
               class16.method165("You can\'t add yourself to your own friend list", 62688093);
            } else if(this.method1977(var3, false, -1582358200)) {
               class55.method946(var1, 1003949082);
            } else if(this.method1944(var3, (byte)-125)) {
               class82.method1936(var1, (byte)102);
            } else {
               class196 var4 = class146.method3363(class192.field2290, client.field761.field1340, -1840577517);
               var4.field2338.method5531(class234.method4198(var1, (byte)-14), 1258821856);
               var4.field2338.method5627(var1, 1801099985);
               client.field761.method2361(var4, 1191922733);
            }
         }
      }
   }

   final void method1981(String var1, byte var2) {
      if(var1 != null) {
         class292 var3 = new class292(var1, this.field1091);
         if(var3.method5239(-1005152425)) {
            if(this.field1090.method5121(var3, -734937712)) {
               class179.method3585((byte)2);
               class196 var4 = class146.method3363(class192.field2297, client.field761.field1340, -1846959933);
               var4.field2338.method5531(class234.method4198(var1, (byte)60), 1258821856);
               var4.field2338.method5627(var1, 728404971);
               client.field761.method2361(var4, 337262150);
            }

            class236.method4200((byte)75);
         }
      }
   }

   final void method1947(String var1, byte var2) {
      if(var1 != null) {
         class292 var3 = new class292(var1, this.field1091);
         if(var3.method5239(-1005152425)) {
            if(this.method1948((byte)-46)) {
               class16.method165("Your ignore list is full. Max of 100 for free users, and 400 for members", 62688093);
            } else if(class311.field3717.field652.equals(var3)) {
               class103.method2337(266221696);
            } else if(this.method1944(var3, (byte)-29)) {
               class16.method165(var1 + " is already on your ignore list", 62688093);
            } else if(this.method1977(var3, false, -1865309245)) {
               class195.method3678(var1, 2095745244);
            } else {
               class196 var4 = class146.method3363(class192.field2216, client.field761.field1340, -1836596392);
               var4.field2338.method5531(class234.method4198(var1, (byte)90), 1258821856);
               var4.field2338.method5627(var1, 1788916250);
               client.field761.method2361(var4, 350987826);
            }
         }
      }
   }

   final void method1950(String var1, byte var2) {
      if(var1 != null) {
         class292 var3 = new class292(var1, this.field1091);
         if(var3.method5239(-1005152425)) {
            if(this.field1093.method5121(var3, -734937712)) {
               class179.method3585((byte)2);
               class196 var4 = class146.method3363(class192.field2222, client.field761.field1340, -2127171437);
               var4.field2338.method5531(class234.method4198(var1, (byte)64), 1258821856);
               var4.field2338.method5627(var1, 763943099);
               client.field761.method2361(var4, 858861236);
            }

            class301.method5359(946943550);
         }
      }
   }

   final void method1996(int var1) {
      this.field1092 = 0;
      this.field1090.method5161(2036948332);
      this.field1093.method5161(2000581726);
   }

   final void method1941(int var1) {
      for(class295 var2 = (class295)this.field1090.field3615.method4965(); var2 != null; var2 = (class295)this.field1090.field3615.method4961()) {
         if((long)var2.field3636 < class217.method4014(1159044349) / 1000L - 5L) {
            if(var2.field3637 > 0) {
               class141.method3161(5, "", var2.field3638 + " has logged in.", 2039922341);
            }

            if(var2.field3637 == 0) {
               class141.method3161(5, "", var2.field3638 + " has logged out.", -634099510);
            }

            var2.method3654();
         }
      }

   }
}
