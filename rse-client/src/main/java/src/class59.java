package src;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class class59 extends class114 {

   AudioFormat field458;
   int field459;
   SourceDataLine field460;
   byte[] field457;


   protected void vmethod2534(int var1) {
      this.field460.flush();
   }

   protected void vmethod2558(byte var1) {
      if(this.field460 != null) {
         this.field460.close();
         this.field460 = null;
      }

   }

   protected void vmethod2530(int var1, int var2) throws LineUnavailableException {
      try {
         Info var3 = new Info(SourceDataLine.class, this.field458, var1 << (class114.field1437?2:1));
         this.field460 = (SourceDataLine)AudioSystem.getLine(var3);
         this.field460.open();
         this.field460.start();
         this.field459 = var1;
      } catch (LineUnavailableException var4) {
         if(class179.method3576(var1, (byte)16) != 1) {
            this.vmethod2530(class216.method4012(var1, -1975590317), -334466824);
         } else {
            this.field460 = null;
            throw var4;
         }
      }
   }

   protected int vmethod2531(int var1) {
      return this.field459 - (this.field460.available() >> (class114.field1437?2:1));
   }

   protected void vmethod2543() {
      int var1 = 256;
      if(class114.field1437) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = super.field1426[var2];
         if((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field457[var2 * 2] = (byte)(var3 >> 8);
         this.field457[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field460.write(this.field457, 0, var1 << 1);
   }

   protected void vmethod2529(int var1) {
      this.field458 = new AudioFormat((float)class114.field1421, 16, class114.field1437?2:1, true, false);
      this.field457 = new byte[256 << (class114.field1437?2:1)];
   }
}
