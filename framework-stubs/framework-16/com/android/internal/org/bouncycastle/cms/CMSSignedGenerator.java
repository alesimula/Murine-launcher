package com.android.internal.org.bouncycastle.cms;

public class CMSSignedGenerator {
    public static final java.lang.String DIGEST_SHA1 = null;
    public static final java.lang.String DIGEST_SHA224 = null;
    public static final java.lang.String DIGEST_SHA256 = null;
    public static final java.lang.String DIGEST_SHA384 = null;
    public static final java.lang.String DIGEST_SHA512 = null;
    public static final java.lang.String DIGEST_MD5 = null;
    public static final java.lang.String ENCRYPTION_RSA = null;
    public static final java.lang.String ENCRYPTION_DSA = null;
    public static final java.lang.String ENCRYPTION_ECDSA = null;
    public static final java.lang.String ENCRYPTION_RSA_PSS = null;
    protected java.util.List certs;
    protected java.util.List crls;
    protected java.util.List _signers;
    protected java.util.List signerGens;
    protected java.util.Map digests;
    protected com.android.internal.org.bouncycastle.operator.DigestAlgorithmIdentifierFinder digestAlgIdFinder;
    protected CMSSignedGenerator() {}
    protected CMSSignedGenerator(com.android.internal.org.bouncycastle.operator.DigestAlgorithmIdentifierFinder p0) {}
    protected java.util.Map getBaseParameters(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1, byte[] p2) { return null; }
    public void addCertificate(com.android.internal.org.bouncycastle.cert.X509CertificateHolder p0) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public void addCertificates(com.android.internal.org.bouncycastle.util.Store p0) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public void addCRL(com.android.internal.org.bouncycastle.cert.X509CRLHolder p0) {}
    public void addCRLs(com.android.internal.org.bouncycastle.util.Store p0) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public void addAttributeCertificate(com.android.internal.org.bouncycastle.cert.X509AttributeCertificateHolder p0) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public void addAttributeCertificates(com.android.internal.org.bouncycastle.util.Store p0) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public void addSigners(com.android.internal.org.bouncycastle.cms.SignerInformationStore p0) {}
    public void addSignerInfoGenerator(com.android.internal.org.bouncycastle.cms.SignerInfoGenerator p0) {}
    public java.util.Map getGeneratedDigests() { return null; }
}
