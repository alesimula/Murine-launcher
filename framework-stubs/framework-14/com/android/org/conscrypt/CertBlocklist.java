package com.android.org.conscrypt;

public interface CertBlocklist {
    public boolean isPublicKeyBlockListed(java.security.PublicKey p0);
    public boolean isSerialNumberBlockListed(java.math.BigInteger p0);
}
