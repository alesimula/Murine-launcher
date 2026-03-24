package com.android.internal.org.bouncycastle.crypto.params;

public class KDFParameters implements com.android.internal.org.bouncycastle.crypto.DerivationParameters {
    byte[] iv;
    byte[] shared;
    public KDFParameters(byte[] p0, byte[] p1) {}
    public byte[] getSharedSecret() { return null; }
    public byte[] getIV() { return null; }
}
