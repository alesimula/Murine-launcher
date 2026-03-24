package com.android.internal.org.bouncycastle.crypto.modes;

public interface CTRModeCipher extends com.android.internal.org.bouncycastle.crypto.MultiBlockCipher, com.android.internal.org.bouncycastle.crypto.SkippingStreamCipher {
    public com.android.internal.org.bouncycastle.crypto.BlockCipher getUnderlyingCipher();
}
