package src;

public class class292 implements Comparable {

   String field3621;
   String field3622;


   public class292(String var1, class347 var2) {
      this.field3621 = var1;
      String var4;
      if(var1 == null) {
         var4 = null;
      } else {
         int var5 = 0;

         int var6;
         boolean var7;
         char var8;
         for(var6 = var1.length(); var5 < var6; ++var5) {
            var8 = var1.charAt(var5);
            var7 = var8 == 160 || var8 == 32 || var8 == 95 || var8 == 45;
            if(!var7) {
               break;
            }
         }

         while(var6 > var5) {
            var8 = var1.charAt(var6 - 1);
            var7 = var8 == 160 || var8 == 32 || var8 == 95 || var8 == 45;
            if(!var7) {
               break;
            }

            --var6;
         }

         int var17 = var6 - var5;
         if(var17 >= 1 && var17 <= class228.method4181(var2, -1599704151)) {
            StringBuilder var15 = new StringBuilder(var17);

            for(int var9 = var5; var9 < var6; ++var9) {
               char var10 = var1.charAt(var9);
               boolean var11;
               if(Character.isISOControl(var10)) {
                  var11 = false;
               } else if(class43.method684(var10, (byte)0)) {
                  var11 = true;
               } else {
                  char[] var16 = class348.field4062;
                  int var13 = 0;

                  label90:
                  while(true) {
                     char var14;
                     if(var13 >= var16.length) {
                        var16 = class348.field4063;

                        for(var13 = 0; var13 < var16.length; ++var13) {
                           var14 = var16[var13];
                           if(var14 == var10) {
                              var11 = true;
                              break label90;
                           }
                        }

                        var11 = false;
                        break;
                     }

                     var14 = var16[var13];
                     if(var14 == var10) {
                        var11 = true;
                        break;
                     }

                     ++var13;
                  }
               }

               if(var11) {
                  char var12;
                  switch(var10) {
                  case 32:
                  case 45:
                  case 95:
                  case 160:
                     var12 = 95;
                     break;
                  case 35:
                  case 91:
                  case 93:
                     var12 = var10;
                     break;
                  case 192:
                  case 193:
                  case 194:
                  case 195:
                  case 196:
                  case 224:
                  case 225:
                  case 226:
                  case 227:
                  case 228:
                     var12 = 97;
                     break;
                  case 199:
                  case 231:
                     var12 = 99;
                     break;
                  case 200:
                  case 201:
                  case 202:
                  case 203:
                  case 232:
                  case 233:
                  case 234:
                  case 235:
                     var12 = 101;
                     break;
                  case 205:
                  case 206:
                  case 207:
                  case 237:
                  case 238:
                  case 239:
                     var12 = 105;
                     break;
                  case 209:
                  case 241:
                     var12 = 110;
                     break;
                  case 210:
                  case 211:
                  case 212:
                  case 213:
                  case 214:
                  case 242:
                  case 243:
                  case 244:
                  case 245:
                  case 246:
                     var12 = 111;
                     break;
                  case 217:
                  case 218:
                  case 219:
                  case 220:
                  case 249:
                  case 250:
                  case 251:
                  case 252:
                     var12 = 117;
                     break;
                  case 223:
                     var12 = 98;
                     break;
                  case 255:
                  case 376:
                     var12 = 121;
                     break;
                  default:
                     var12 = Character.toLowerCase(var10);
                  }

                  if(var12 != 0) {
                     var15.append(var12);
                  }
               }
            }

            if(var15.length() == 0) {
               var4 = null;
            } else {
               var4 = var15.toString();
            }
         } else {
            var4 = null;
         }
      }

      this.field3622 = var4;
   }

   public int method5240(class292 var1, byte var2) {
      return this.field3622 == null?(var1.field3622 == null?0:1):(var1.field3622 == null?-1:this.field3622.compareTo(var1.field3622));
   }

   public boolean method5239(int var1) {
      return this.field3622 != null;
   }

   public String method5238(int var1) {
      return this.field3621;
   }

   public boolean equals(Object var1) {
      if(var1 instanceof class292) {
         class292 var2 = (class292)var1;
         return this.field3622 == null?var2.field3622 == null:(var2.field3622 == null?false:(this.hashCode() != var2.hashCode()?false:this.field3622.equals(var2.field3622)));
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.field3622 == null?0:this.field3622.hashCode();
   }

   public String toString() {
      return this.method5238(-317689789);
   }

   public String aab() {
      return this.method5238(-1676692749);
   }

   public String aak() {
      return this.method5238(-118531807);
   }

   public String aau() {
      return this.method5238(-289977047);
   }

   public int compareTo(Object var1) {
      return this.method5240((class292)var1, (byte)-36);
   }

   public static class333[] method5246(class243 var0, String var1, String var2, byte var3) {
      int var4 = var0.method4240(var1, (short)-3526);
      int var5 = var0.method4233(var4, var2, -377758382);
      class333[] var6;
      if(!class164.method3502(var0, var4, var5, -1389142072)) {
         var6 = null;
      } else {
         var6 = class230.method4190(2135510815);
      }

      return var6;
   }
}
