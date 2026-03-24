package com.android.internal.org.bouncycastle.crypto.modes;

public interface AEADBlockCipher extends com.android.internal.org.bouncycastle.crypto.modes.AEADCipher {
    public com.android.internal.org.bouncycastle.crypto.BlockCipher getUnderlyingCipher();
}
