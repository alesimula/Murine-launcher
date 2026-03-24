package com.android.internal.org.bouncycastle.crypto;

public abstract class PBEParametersGenerator {
    protected byte[] password;
    protected byte[] salt;
    protected int iterationCount;
    protected PBEParametersGenerator() {}
    public void init(byte[] p0, byte[] p1, int p2) {}
    public byte[] getPassword() { return null; }
    public byte[] getSalt() { return null; }
    public int getIterationCount() { return 0; }
    public abstract com.android.internal.org.bouncycastle.crypto.CipherParameters generateDerivedParameters(int p0);
    public abstract com.android.internal.org.bouncycastle.crypto.CipherParameters generateDerivedParameters(int p0, int p1);
    public abstract com.android.internal.org.bouncycastle.crypto.CipherParameters generateDerivedMacParameters(int p0);
    public static byte[] PKCS5PasswordToBytes(char[] p0) { return null; }
    public static byte[] PKCS5PasswordToUTF8Bytes(char[] p0) { return null; }
    public static byte[] PKCS12PasswordToBytes(char[] p0) { return null; }
}
