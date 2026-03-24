package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.util;

public abstract class DSABase extends java.security.SignatureSpi implements com.android.internal.org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers, com.android.internal.org.bouncycastle.asn1.x509.X509ObjectIdentifiers {
    protected com.android.internal.org.bouncycastle.crypto.Digest digest;
    protected com.android.internal.org.bouncycastle.crypto.DSAExt signer;
    protected com.android.internal.org.bouncycastle.crypto.signers.DSAEncoding encoding;
    protected DSABase(com.android.internal.org.bouncycastle.crypto.Digest p0, com.android.internal.org.bouncycastle.crypto.DSAExt p1, com.android.internal.org.bouncycastle.crypto.signers.DSAEncoding p2) { super(); }
    protected void engineUpdate(byte p0) throws java.security.SignatureException {}
    protected void engineUpdate(byte[] p0, int p1, int p2) throws java.security.SignatureException {}
    protected byte[] engineSign() throws java.security.SignatureException { return null; }
    protected boolean engineVerify(byte[] p0) throws java.security.SignatureException { return false; }
    protected void engineSetParameter(java.security.spec.AlgorithmParameterSpec p0) {}
    protected void engineSetParameter(java.lang.String p0, java.lang.Object p1) {}
    protected java.lang.Object engineGetParameter(java.lang.String p0) { return null; }
}
