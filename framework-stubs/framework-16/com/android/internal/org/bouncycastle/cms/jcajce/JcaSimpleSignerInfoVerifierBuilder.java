package com.android.internal.org.bouncycastle.cms.jcajce;

public class JcaSimpleSignerInfoVerifierBuilder {
    public JcaSimpleSignerInfoVerifierBuilder() {}
    public com.android.internal.org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder setProvider(java.security.Provider p0) { return null; }
    public com.android.internal.org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder setProvider(java.lang.String p0) { return null; }
    public com.android.internal.org.bouncycastle.cms.SignerInformationVerifier build(com.android.internal.org.bouncycastle.cert.X509CertificateHolder p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateException { return null; }
    public com.android.internal.org.bouncycastle.cms.SignerInformationVerifier build(java.security.cert.X509Certificate p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    public com.android.internal.org.bouncycastle.cms.SignerInformationVerifier build(java.security.PublicKey p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }

    private static class Helper {
        com.android.internal.org.bouncycastle.operator.ContentVerifierProvider createContentVerifierProvider(java.security.PublicKey p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
        com.android.internal.org.bouncycastle.operator.ContentVerifierProvider createContentVerifierProvider(java.security.cert.X509Certificate p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
        com.android.internal.org.bouncycastle.operator.ContentVerifierProvider createContentVerifierProvider(com.android.internal.org.bouncycastle.cert.X509CertificateHolder p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateException { return null; }
        com.android.internal.org.bouncycastle.operator.DigestCalculatorProvider createDigestCalculatorProvider() throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    }

    private static class NamedHelper extends com.android.internal.org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper {
        public NamedHelper(java.lang.String p0) { super(); }
        com.android.internal.org.bouncycastle.operator.ContentVerifierProvider createContentVerifierProvider(java.security.PublicKey p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
        com.android.internal.org.bouncycastle.operator.ContentVerifierProvider createContentVerifierProvider(java.security.cert.X509Certificate p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
        com.android.internal.org.bouncycastle.operator.DigestCalculatorProvider createDigestCalculatorProvider() throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
        com.android.internal.org.bouncycastle.operator.ContentVerifierProvider createContentVerifierProvider(com.android.internal.org.bouncycastle.cert.X509CertificateHolder p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateException { return null; }
    }

    private static class ProviderHelper extends com.android.internal.org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper {
        public ProviderHelper(java.security.Provider p0) { super(); }
        com.android.internal.org.bouncycastle.operator.ContentVerifierProvider createContentVerifierProvider(java.security.PublicKey p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
        com.android.internal.org.bouncycastle.operator.ContentVerifierProvider createContentVerifierProvider(java.security.cert.X509Certificate p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
        com.android.internal.org.bouncycastle.operator.DigestCalculatorProvider createDigestCalculatorProvider() throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
        com.android.internal.org.bouncycastle.operator.ContentVerifierProvider createContentVerifierProvider(com.android.internal.org.bouncycastle.cert.X509CertificateHolder p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateException { return null; }
    }
}
