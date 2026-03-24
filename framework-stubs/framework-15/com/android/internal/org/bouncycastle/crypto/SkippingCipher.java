package com.android.internal.org.bouncycastle.crypto;

public interface SkippingCipher {
    public long skip(long p0);
    public long seekTo(long p0);
    public long getPosition();
}
