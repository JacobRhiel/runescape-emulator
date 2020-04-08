package src;

import java.io.IOException;
import java.net.Socket;

public class class315 extends class314 {

   class316 field3772;
   class318 field3770;
   Socket field3774;


   class315(Socket var1, int var2, int var3) throws IOException {
      this.field3774 = var1;
      this.field3774.setSoTimeout(30000);
      this.field3774.setTcpNoDelay(true);
      this.field3774.setReceiveBufferSize(65536);
      this.field3774.setSendBufferSize(65536);
      this.field3770 = new class318(this.field3774.getInputStream(), var2);
      this.field3772 = new class316(this.field3774.getOutputStream(), var3);
   }

   public void vmethod5866(byte var1) {
      this.field3772.method5888(1845686279);

      try {
         this.field3774.close();
      } catch (IOException var3) {
         ;
      }

      this.field3770.method5918(-424049486);
   }

   public boolean vmethod5861(int var1, byte var2) throws IOException {
      return this.field3770.method5907(var1, (byte)-72);
   }

   public int vmethod5864(byte[] var1, int var2, int var3, byte var4) throws IOException {
      return this.field3770.method5911(var1, var2, var3, 1983189445);
   }

   public void vmethod5878(byte[] var1, int var2, int var3, int var4) throws IOException {
      this.field3772.method5881(var1, var2, var3, (short)-5417);
   }

   public int vmethod5862(int var1) throws IOException {
      return this.field3770.method5908((byte)23);
   }

   public int vmethod5863(int var1) throws IOException {
      return this.field3770.method5909((byte)0);
   }

   protected void finalize() {
      this.vmethod5866((byte)-94);
   }

   protected void aav() {
      this.vmethod5866((byte)-4);
   }

   protected void aaf() {
      this.vmethod5866((byte)-13);
   }

   protected void aaw() {
      this.vmethod5866((byte)-89);
   }

   protected void aay() {
      this.vmethod5866((byte)-117);
   }
}
