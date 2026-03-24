package com.android.internal.org.bouncycastle.crypto;

public interface RawAgreement {
    public void init(com.android.internal.org.bouncycastle.crypto.CipherParameters p0);
    public int getAgreementSize();
    public void calculateAgreement(com.android.internal.org.bouncycastle.crypto.CipherParameters p0, byte[] p1, int p2);
}
