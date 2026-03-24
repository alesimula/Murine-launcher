package com.android.internal.org.bouncycastle.crypto.paddings;

public interface BlockCipherPadding {
    public void init(java.security.SecureRandom p0) throws java.lang.IllegalArgumentException;
    public java.lang.String getPaddingName();
    public int addPadding(byte[] p0, int p1);
    public int padCount(byte[] p0) throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException;
}
