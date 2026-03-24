package com.android.org.conscrypt;

public class OpenSSLSignatureRawECDSA extends java.security.SignatureSpi {
    public OpenSSLSignatureRawECDSA() { super(); }
    protected void engineUpdate(byte p0) {}
    protected void engineUpdate(byte[] p0, int p1, int p2) {}
    protected java.lang.Object engineGetParameter(java.lang.String p0) throws java.security.InvalidParameterException { return null; }
    protected void engineInitSign(java.security.PrivateKey p0) throws java.security.InvalidKeyException {}
    protected void engineInitVerify(java.security.PublicKey p0) throws java.security.InvalidKeyException {}
    protected void engineSetParameter(java.lang.String p0, java.lang.Object p1) throws java.security.InvalidParameterException {}
    protected byte[] engineSign() throws java.security.SignatureException { return null; }
    protected boolean engineVerify(byte[] p0) throws java.security.SignatureException { return false; }
}
