package com.android.internal.org.bouncycastle.crypto.modes;

public interface CBCModeCipher extends com.android.internal.org.bouncycastle.crypto.MultiBlockCipher {
    public com.android.internal.org.bouncycastle.crypto.BlockCipher getUnderlyingCipher();
}
