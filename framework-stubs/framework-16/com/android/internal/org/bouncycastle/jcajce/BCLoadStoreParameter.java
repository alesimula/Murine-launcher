package com.android.internal.org.bouncycastle.jcajce;

public class BCLoadStoreParameter implements java.security.KeyStore.LoadStoreParameter {
    public BCLoadStoreParameter(java.io.OutputStream p0, char[] p1) {}
    public BCLoadStoreParameter(java.io.InputStream p0, char[] p1) {}
    public BCLoadStoreParameter(java.io.InputStream p0, java.security.KeyStore.ProtectionParameter p1) {}
    public BCLoadStoreParameter(java.io.OutputStream p0, java.security.KeyStore.ProtectionParameter p1) {}
    BCLoadStoreParameter(java.io.InputStream p0, java.io.OutputStream p1, java.security.KeyStore.ProtectionParameter p2) {}
    public java.security.KeyStore.ProtectionParameter getProtectionParameter() { return null; }
    public java.io.OutputStream getOutputStream() { return null; }
    public java.io.InputStream getInputStream() { return null; }
}
