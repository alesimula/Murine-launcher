package com.android.internal.org.bouncycastle.jce.provider;

public class JDKPKCS12StoreParameter implements java.security.KeyStore.LoadStoreParameter {
    public JDKPKCS12StoreParameter() {}
    public java.io.OutputStream getOutputStream() { return null; }
    public java.security.KeyStore.ProtectionParameter getProtectionParameter() { return null; }
    public boolean isUseDEREncoding() { return false; }
    public void setOutputStream(java.io.OutputStream p0) {}
    public void setPassword(char[] p0) {}
    public void setProtectionParameter(java.security.KeyStore.ProtectionParameter p0) {}
    public void setUseDEREncoding(boolean p0) {}
}
