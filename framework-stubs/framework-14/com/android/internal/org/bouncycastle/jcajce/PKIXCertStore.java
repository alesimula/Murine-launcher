package com.android.internal.org.bouncycastle.jcajce;

public interface PKIXCertStore<T extends java.security.cert.Certificate> extends com.android.internal.org.bouncycastle.util.Store<T> {
    public java.util.Collection<T> getMatches(com.android.internal.org.bouncycastle.util.Selector<T> p0) throws com.android.internal.org.bouncycastle.util.StoreException;
}
