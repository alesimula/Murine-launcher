package com.android.internal.org.bouncycastle.crypto;

public class CryptoServicesPermission extends java.security.Permission {
    public static final java.lang.String GLOBAL_CONFIG = "globalConfig";
    public static final java.lang.String THREAD_LOCAL_CONFIG = "threadLocalConfig";
    public static final java.lang.String DEFAULT_RANDOM = "defaultRandomConfig";
    public CryptoServicesPermission(java.lang.String p0) { super(null); }
    public boolean implies(java.security.Permission p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String getActions() { return null; }
}
