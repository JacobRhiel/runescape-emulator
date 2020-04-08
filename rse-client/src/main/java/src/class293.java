package src;

public class class293 extends class288 {

   static int field3626;
   boolean field3625;
   boolean field3623;


   int method5258(class293 var1, int var2) {
      return super.field3610 == client.field680 && client.field680 != var1.field3610?-1:(client.field680 == var1.field3610 && super.field3610 != client.field680?1:(super.field3610 != 0 && var1.field3610 == 0?-1:(var1.field3610 != 0 && super.field3610 == 0?1:(this.field3625 && !var1.field3625?-1:(!this.field3625 && var1.field3625?1:(this.field3623 && !var1.field3623?-1:(!this.field3623 && var1.field3623?1:(super.field3610 != 0?super.field3609 - var1.field3609:var1.field3609 - super.field3609))))))));
   }

   public int vmethod5257(class283 var1, int var2) {
      return this.method5258((class293)var1, -818958017);
   }

   public int compareTo(Object var1) {
      return this.method5258((class293)var1, -1645564523);
   }
}
