package src;

import java.nio.ByteBuffer;

public class class215 extends class214 {

   static class334 field2501;
   static class245 field2499;
   ByteBuffer field2500;


   public void vmethod4006(byte[] var1, byte var2) {
      this.field2500 = ByteBuffer.allocateDirect(var1.length);
      this.field2500.position(0);
      this.field2500.put(var1);
   }

   byte[] vmethod4008(int var1) {
      byte[] var2 = new byte[this.field2500.capacity()];
      this.field2500.position(0);
      this.field2500.get(var2);
      return var2;
   }
}
