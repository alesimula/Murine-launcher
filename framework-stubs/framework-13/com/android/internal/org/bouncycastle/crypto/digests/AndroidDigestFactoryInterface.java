package com.android.internal.org.bouncycastle.crypto.digests;

interface AndroidDigestFactoryInterface {
    public com.android.internal.org.bouncycastle.crypto.Digest getMD5();
    public com.android.internal.org.bouncycastle.crypto.Digest getSHA1();
    public com.android.internal.org.bouncycastle.crypto.Digest getSHA224();
    public com.android.internal.org.bouncycastle.crypto.Digest getSHA256();
    public com.android.internal.org.bouncycastle.crypto.Digest getSHA384();
    public com.android.internal.org.bouncycastle.crypto.Digest getSHA512();
}
