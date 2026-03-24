package com.android.internal.org.bouncycastle.crypto.modes.gcm;

public interface GCMExponentiator {
    public void init(byte[] p0);
    public void exponentiateX(long p0, byte[] p1);
}
