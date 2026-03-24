package com.android.internal.org.bouncycastle.crypto;

public interface CryptoServiceProperties {
    public int bitsOfSecurity();
    public java.lang.String getServiceName();
    public com.android.internal.org.bouncycastle.crypto.CryptoServicePurpose getPurpose();
    public java.lang.Object getParams();
}
