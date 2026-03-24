package com.android.internal.org.bouncycastle.x509;

public abstract class X509StoreSpi {
    public X509StoreSpi() {}
    public abstract void engineInit(com.android.internal.org.bouncycastle.x509.X509StoreParameters p0);
    public abstract java.util.Collection engineGetMatches(com.android.internal.org.bouncycastle.util.Selector p0);
}
