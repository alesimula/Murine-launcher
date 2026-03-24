package com.android.internal.org.bouncycastle.jcajce.util;

public class BCJcaJceHelper extends com.android.internal.org.bouncycastle.jcajce.util.ProviderJcaJceHelper {
    private static volatile java.security.Provider bcProvider;
    private static synchronized java.security.Provider getBouncyCastleProvider() { return null; }
    public BCJcaJceHelper() { super(null); }
}
