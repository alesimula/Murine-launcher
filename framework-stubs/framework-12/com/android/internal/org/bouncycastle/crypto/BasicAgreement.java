package com.android.internal.org.bouncycastle.crypto;

public interface BasicAgreement {
    public void init(com.android.internal.org.bouncycastle.crypto.CipherParameters p0);
    public int getFieldSize();
    public java.math.BigInteger calculateAgreement(com.android.internal.org.bouncycastle.crypto.CipherParameters p0);
}
