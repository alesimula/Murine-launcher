package com.android.internal.org.bouncycastle.cert.ocsp;

public class OCSPResp {
    public static final int SUCCESSFUL = 0;
    public static final int MALFORMED_REQUEST = 1;
    public static final int INTERNAL_ERROR = 2;
    public static final int TRY_LATER = 3;
    public static final int SIG_REQUIRED = 5;
    public static final int UNAUTHORIZED = 6;
    public OCSPResp(com.android.internal.org.bouncycastle.asn1.ocsp.OCSPResponse p0) {}
    public OCSPResp(byte[] p0) throws java.io.IOException {}
    public OCSPResp(java.io.InputStream p0) throws java.io.IOException {}
    public int getStatus() { return 0; }
    public java.lang.Object getResponseObject() throws com.android.internal.org.bouncycastle.cert.ocsp.OCSPException { return null; }
    public byte[] getEncoded() throws java.io.IOException { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ocsp.OCSPResponse toASN1Structure() { return null; }
}
