package src;

import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;

public class class35 {

   static Image field265;
   static int[] field267;
   String field254;
   int field255 = -1;
   String field257;
   int field260 = -1;
   boolean field262 = false;
   int field256 = -1;
   class222 field263 = null;
   LinkedList field266;
   int field259 = 0;
   int field253 = 0;
   int field258 = Integer.MAX_VALUE;
   int field261 = Integer.MAX_VALUE;


   public void method471(class309 var1, int var2, byte var3) {
      this.field260 = var2;
      this.field257 = var1.method5667(-1424274065);
      this.field254 = var1.method5667(-1706246464);
      this.field263 = new class222(var1.readInt(297718403));
      this.field255 = var1.readInt(297718403);
      var1.readUnsignedByte((byte)14);
      this.field262 = var1.readUnsignedByte((byte)72) == 1;
      this.field256 = var1.readUnsignedByte((byte)24);
      int var4 = var1.readUnsignedByte((byte)60);
      this.field266 = new LinkedList();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field266.add(this.method455(var1, 647857344));
      }

      this.method446(969855429);
   }

   public boolean method443(int var1, int var2, int var3) {
      int var4 = var1 / 64;
      int var5 = var2 / 64;
      if(var4 >= this.field258 && var4 <= this.field259) {
         if(var5 >= this.field261 && var5 <= this.field253) {
            Iterator var6 = this.field266.iterator();

            class46 var7;
            do {
               if(!var6.hasNext()) {
                  return false;
               }

               var7 = (class46)var6.next();
            } while(!var7.vmethod872(var1, var2, -1383343929));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public int method441(byte var1) {
      return this.field260;
   }

   public int[] method444(int var1, int var2, int var3, byte var4) {
      Iterator var5 = this.field266.iterator();

      class46 var6;
      do {
         if(!var5.hasNext()) {
            return null;
         }

         var6 = (class46)var5.next();
      } while(!var6.vmethod871(var1, var2, var3, -65934716));

      return var6.vmethod873(var1, var2, var3, 1656767825);
   }

   public int method453(int var1) {
      return this.field258;
   }

   public int method439(int var1) {
      return this.field261;
   }

   public boolean method468(int var1, int var2, int var3, byte var4) {
      Iterator var5 = this.field266.iterator();

      class46 var6;
      do {
         if(!var5.hasNext()) {
            return false;
         }

         var6 = (class46)var5.next();
      } while(!var6.vmethod871(var1, var2, var3, 596235621));

      return true;
   }

   public class222 method456(int var1, int var2, byte var3) {
      Iterator var4 = this.field266.iterator();

      class46 var5;
      do {
         if(!var4.hasNext()) {
            return null;
         }

         var5 = (class46)var4.next();
      } while(!var5.vmethod872(var1, var2, -240937232));

      return var5.vmethod890(var1, var2, -226825052);
   }

   public int method496(int var1) {
      return this.field263.field2528;
   }

   public String method449(byte var1) {
      return this.field257;
   }

   public int method457(int var1) {
      return this.field263.field2532;
   }

   public int method447(byte var1) {
      return this.field263.field2529;
   }

   public int method452(int var1) {
      return this.field256;
   }

   void method446(int var1) {
      Iterator var2 = this.field266.iterator();

      while(var2.hasNext()) {
         class46 var3 = (class46)var2.next();
         var3.vmethod870(this, 1890497148);
      }

   }

   class46 method455(class309 var1, int var2) {
      int var3 = var1.readUnsignedByte((byte)97);
      class29 var4 = (class29)class16.method159(class29.method345(-1086432793), var3, -1609956543);
      Object var5 = null;
      switch(var4.field192) {
      case 0:
         var5 = new class28();
         break;
      case 1:
         var5 = new class51();
         break;
      case 2:
         var5 = new class42();
         break;
      case 3:
         var5 = new class33();
         break;
      default:
         throw new IllegalStateException("");
      }

      ((class46)var5).vmethod885(var1, -1393433755);
      return (class46)var5;
   }

   public int method454(int var1) {
      return this.field259;
   }

   public boolean method458(byte var1) {
      return this.field262;
   }

   public int method442(int var1) {
      return this.field253;
   }

   int method451(byte var1) {
      return this.field255;
   }

   public String method450(int var1) {
      return this.field254;
   }

   public class222 method460(int var1) {
      return new class222(this.field263);
   }

   public static String method507(byte[] var0, int var1, int var2, byte var3) {
      char[] var4 = new char[var2];
      int var5 = 0;

      for(int var6 = 0; var6 < var2; ++var6) {
         int var7 = var0[var6 + var1] & 255;
         if(var7 != 0) {
            if(var7 >= 128 && var7 < 160) {
               char var8 = class297.field3641[var7 - 128];
               if(var8 == 0) {
                  var8 = 63;
               }

               var7 = var8;
            }

            var4[var5++] = (char)var7;
         }
      }

      return new String(var4, 0, var5);
   }

   static void method509(int var0) {
      class352 var1 = null;

      try {
         var1 = class54.method919("", class341.field3965.field3109, true, 636702164);
         class309 var2 = class76.field676.method1929(745371681);
         var1.method6653(var2.field3709, 0, var2.field3710, (byte)-83);
      } catch (Exception var4) {
         ;
      }

      try {
         if(var1 != null) {
            var1.method6651(true, 2141113619);
         }
      } catch (Exception var3) {
         ;
      }

   }

   static void method508(int var0) {
      if(class21.field121 != null) {
         class21.field121.method6487(class71.field610, (class311.field3717.field983 >> 7) + class69.field590 * 731242929, (class311.field3717.field973 >> 7) + class89.field1152 * 1825982697, false, 1519014469);
         class21.field121.method6406(-182915585);
      }

   }

   public static void method461(int var0, class243 var1, String var2, String var3, int var4, boolean var5, int var6) {
      int var7 = var1.method4240(var2, (short)-2181);
      int var8 = var1.method4233(var7, var3, 1819692028);
      class146.method3364(var0, var1, var7, var8, var4, var5, (byte)-65);
   }
}
