package android.security;

public class Scrypt {
    public Scrypt() {}
    native byte[] nativeScrypt(byte[] p0, byte[] p1, int p2, int p3, int p4, int p5);
    public byte[] scrypt(byte[] p0, byte[] p1, int p2, int p3, int p4, int p5) { return null; }
}
