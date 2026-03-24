package com.android.internal.org.bouncycastle.jcajce;

public class PKCS12StoreParameter implements java.security.KeyStore.LoadStoreParameter {
    private final java.io.OutputStream out = null;
    private final java.security.KeyStore.ProtectionParameter protectionParameter = null;
    private final boolean forDEREncoding = false;
    public PKCS12StoreParameter(java.io.OutputStream p0, char[] p1) {}
    public PKCS12StoreParameter(java.io.OutputStream p0, java.security.KeyStore.ProtectionParameter p1) {}
    public PKCS12StoreParameter(java.io.OutputStream p0, char[] p1, boolean p2) {}
    public PKCS12StoreParameter(java.io.OutputStream p0, java.security.KeyStore.ProtectionParameter p1, boolean p2) {}
    public java.io.OutputStream getOutputStream() { return null; }
    public java.security.KeyStore.ProtectionParameter getProtectionParameter() { return null; }
    public boolean isForDEREncoding() { return false; }
}
