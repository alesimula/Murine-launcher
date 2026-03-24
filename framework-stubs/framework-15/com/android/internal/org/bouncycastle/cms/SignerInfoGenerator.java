package com.android.internal.org.bouncycastle.cms;

public class SignerInfoGenerator {
    SignerInfoGenerator(com.android.internal.org.bouncycastle.asn1.cms.SignerIdentifier p0, com.android.internal.org.bouncycastle.operator.ContentSigner p1, com.android.internal.org.bouncycastle.operator.DigestCalculatorProvider p2, com.android.internal.org.bouncycastle.cms.CMSSignatureEncryptionAlgorithmFinder p3) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException {}
    SignerInfoGenerator(com.android.internal.org.bouncycastle.asn1.cms.SignerIdentifier p0, com.android.internal.org.bouncycastle.operator.ContentSigner p1, com.android.internal.org.bouncycastle.operator.DigestCalculatorProvider p2, com.android.internal.org.bouncycastle.cms.CMSSignatureEncryptionAlgorithmFinder p3, boolean p4) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException {}
    public SignerInfoGenerator(com.android.internal.org.bouncycastle.cms.SignerInfoGenerator p0, com.android.internal.org.bouncycastle.cms.CMSAttributeTableGenerator p1, com.android.internal.org.bouncycastle.cms.CMSAttributeTableGenerator p2) {}
    SignerInfoGenerator(com.android.internal.org.bouncycastle.asn1.cms.SignerIdentifier p0, com.android.internal.org.bouncycastle.operator.ContentSigner p1, com.android.internal.org.bouncycastle.operator.DigestCalculatorProvider p2, com.android.internal.org.bouncycastle.cms.CMSSignatureEncryptionAlgorithmFinder p3, com.android.internal.org.bouncycastle.cms.CMSAttributeTableGenerator p4, com.android.internal.org.bouncycastle.cms.CMSAttributeTableGenerator p5) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException {}
    public com.android.internal.org.bouncycastle.asn1.cms.SignerIdentifier getSID() { return null; }
    public int getGeneratedVersion() { return 0; }
    public boolean hasAssociatedCertificate() { return false; }
    public com.android.internal.org.bouncycastle.cert.X509CertificateHolder getAssociatedCertificate() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithm() { return null; }
    public java.io.OutputStream getCalculatingOutputStream() { return null; }
    public com.android.internal.org.bouncycastle.asn1.cms.SignerInfo generate(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) throws com.android.internal.org.bouncycastle.cms.CMSException { return null; }
    void setAssociatedCertificate(com.android.internal.org.bouncycastle.cert.X509CertificateHolder p0) {}
    public byte[] getCalculatedDigest() { return null; }
    public com.android.internal.org.bouncycastle.cms.CMSAttributeTableGenerator getSignedAttributeTableGenerator() { return null; }
    public com.android.internal.org.bouncycastle.cms.CMSAttributeTableGenerator getUnsignedAttributeTableGenerator() { return null; }
}
