package com.android.internal.org.bouncycastle.operator.jcajce;

public class JcaContentVerifierProviderBuilder {
    public JcaContentVerifierProviderBuilder() {}
    public com.android.internal.org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder setProvider(java.security.Provider p0) { return null; }
    public com.android.internal.org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder setProvider(java.lang.String p0) { return null; }
    public com.android.internal.org.bouncycastle.operator.ContentVerifierProvider build(com.android.internal.org.bouncycastle.cert.X509CertificateHolder p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateException { return null; }
    public com.android.internal.org.bouncycastle.operator.ContentVerifierProvider build(java.security.cert.X509Certificate p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    public com.android.internal.org.bouncycastle.operator.ContentVerifierProvider build(java.security.PublicKey p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    public com.android.internal.org.bouncycastle.operator.ContentVerifierProvider build(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }

    private class CompositeVerifier implements com.android.internal.org.bouncycastle.operator.ContentVerifier {
        public CompositeVerifier(com.android.internal.org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder p0, java.security.Signature[] p1) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException {}
        public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() { return null; }
        public java.io.OutputStream getOutputStream() { return null; }
        public boolean verify(byte[] p0) { return false; }
    }

    private class RawSigVerifier extends com.android.internal.org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.SigVerifier implements com.android.internal.org.bouncycastle.operator.RawContentVerifier {
        RawSigVerifier(com.android.internal.org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1, java.security.Signature p2, java.security.Signature p3) { super(null, null, null); }
        public boolean verify(byte[] p0) { return false; }
        public boolean verify(byte[] p0, byte[] p1) { return false; }
    }

    private class SigVerifier implements com.android.internal.org.bouncycastle.operator.ContentVerifier {
        protected final java.io.OutputStream stream = null;
        SigVerifier(com.android.internal.org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1, java.security.Signature p2) {}
        public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() { return null; }
        public java.io.OutputStream getOutputStream() { return null; }
        public boolean verify(byte[] p0) { return false; }
    }
}
