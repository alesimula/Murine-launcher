package com.android.internal.org.bouncycastle.cms;

public class SignerInformationVerifier {
    public SignerInformationVerifier(com.android.internal.org.bouncycastle.cms.CMSSignatureAlgorithmNameGenerator p0, com.android.internal.org.bouncycastle.operator.SignatureAlgorithmIdentifierFinder p1, com.android.internal.org.bouncycastle.operator.ContentVerifierProvider p2, com.android.internal.org.bouncycastle.operator.DigestCalculatorProvider p3) {}
    public boolean hasAssociatedCertificate() { return false; }
    public com.android.internal.org.bouncycastle.cert.X509CertificateHolder getAssociatedCertificate() { return null; }
    public com.android.internal.org.bouncycastle.operator.ContentVerifier getContentVerifier(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    public com.android.internal.org.bouncycastle.operator.DigestCalculator getDigestCalculator(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
}
