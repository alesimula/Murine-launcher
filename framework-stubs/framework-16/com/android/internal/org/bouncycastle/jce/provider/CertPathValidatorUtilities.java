package com.android.internal.org.bouncycastle.jce.provider;

class CertPathValidatorUtilities {
    protected static final java.lang.String CERTIFICATE_POLICIES = null;
    protected static final java.lang.String BASIC_CONSTRAINTS = null;
    protected static final java.lang.String POLICY_MAPPINGS = null;
    protected static final java.lang.String SUBJECT_ALTERNATIVE_NAME = null;
    protected static final java.lang.String NAME_CONSTRAINTS = null;
    protected static final java.lang.String KEY_USAGE = null;
    protected static final java.lang.String INHIBIT_ANY_POLICY = null;
    protected static final java.lang.String ISSUING_DISTRIBUTION_POINT = null;
    protected static final java.lang.String DELTA_CRL_INDICATOR = null;
    protected static final java.lang.String POLICY_CONSTRAINTS = null;
    protected static final java.lang.String FRESHEST_CRL = null;
    protected static final java.lang.String CRL_DISTRIBUTION_POINTS = null;
    protected static final java.lang.String AUTHORITY_KEY_IDENTIFIER = null;
    protected static final java.lang.String ANY_POLICY = "2.5.29.32.0";
    protected static final java.lang.String CRL_NUMBER = null;
    protected static final int KEY_CERT_SIGN = 5;
    protected static final int CRL_SIGN = 6;
    protected static final java.lang.String[] crlReasons = null;
    CertPathValidatorUtilities() {}
    static java.util.Collection findTargets(com.android.internal.org.bouncycastle.jcajce.PKIXExtendedBuilderParameters p0) throws java.security.cert.CertPathBuilderException { return null; }
    protected static java.security.cert.TrustAnchor findTrustAnchor(java.security.cert.X509Certificate p0, java.util.Set p1) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException { return null; }
    protected static java.security.cert.TrustAnchor findTrustAnchor(java.security.cert.X509Certificate p0, java.util.Set p1, java.lang.String p2) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException { return null; }
    static boolean isIssuerTrustAnchor(java.security.cert.X509Certificate p0, java.util.Set p1, java.lang.String p2) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException { return false; }
    static java.util.List<com.android.internal.org.bouncycastle.jcajce.PKIXCertStore> getAdditionalStoresFromAltNames(byte[] p0, java.util.Map<com.android.internal.org.bouncycastle.asn1.x509.GeneralName, com.android.internal.org.bouncycastle.jcajce.PKIXCertStore> p1) throws java.security.cert.CertificateParsingException { return null; }
    protected static java.util.Date getValidityDate(com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters p0, java.util.Date p1) { return null; }
    protected static boolean isSelfIssued(java.security.cert.X509Certificate p0) { return false; }
    protected static com.android.internal.org.bouncycastle.asn1.ASN1Primitive getExtensionValue(java.security.cert.X509Extension p0, java.lang.String p1) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException { return null; }
    protected static com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier(java.security.PublicKey p0) throws java.security.cert.CertPathValidatorException { return null; }
    protected static final java.util.Set getQualifierSet(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) throws java.security.cert.CertPathValidatorException { return null; }
    protected static com.android.internal.org.bouncycastle.jce.provider.PKIXPolicyNode removePolicyNode(com.android.internal.org.bouncycastle.jce.provider.PKIXPolicyNode p0, java.util.List[] p1, com.android.internal.org.bouncycastle.jce.provider.PKIXPolicyNode p2) { return null; }
    protected static boolean processCertD1i(int p0, java.util.List[] p1, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p2, java.util.Set p3) { return false; }
    protected static void processCertD1ii(int p0, java.util.List[] p1, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p2, java.util.Set p3) {}
    protected static void prepareNextCertB1(int p0, java.util.List[] p1, java.lang.String p2, java.util.Map p3, java.security.cert.X509Certificate p4) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException, java.security.cert.CertPathValidatorException {}
    protected static com.android.internal.org.bouncycastle.jce.provider.PKIXPolicyNode prepareNextCertB2(int p0, java.util.List[] p1, java.lang.String p2, com.android.internal.org.bouncycastle.jce.provider.PKIXPolicyNode p3) { return null; }
    protected static boolean isAnyPolicy(java.util.Set p0) { return false; }
    protected static void findCertificates(java.util.LinkedHashSet p0, com.android.internal.org.bouncycastle.jcajce.PKIXCertStoreSelector p1, java.util.List p2) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException {}
    static java.util.List<com.android.internal.org.bouncycastle.jcajce.PKIXCRLStore> getAdditionalStoresFromCRLDistributionPoint(com.android.internal.org.bouncycastle.asn1.x509.CRLDistPoint p0, java.util.Map<com.android.internal.org.bouncycastle.asn1.x509.GeneralName, com.android.internal.org.bouncycastle.jcajce.PKIXCRLStore> p1, java.util.Date p2, com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper p3) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException { return null; }
    protected static void getCRLIssuersFromDistributionPoint(com.android.internal.org.bouncycastle.asn1.x509.DistributionPoint p0, java.util.Collection p1, java.security.cert.X509CRLSelector p2) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException {}
    protected static void getCertStatus(java.util.Date p0, java.security.cert.X509CRL p1, java.lang.Object p2, com.android.internal.org.bouncycastle.jce.provider.CertStatus p3) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException {}
    protected static java.util.Set getDeltaCRLs(java.util.Date p0, java.security.cert.X509CRL p1, java.util.List<java.security.cert.CertStore> p2, java.util.List<com.android.internal.org.bouncycastle.jcajce.PKIXCRLStore> p3, com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper p4) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException { return null; }
    protected static java.util.Set getCompleteCRLs(com.android.internal.org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters p0, com.android.internal.org.bouncycastle.asn1.x509.DistributionPoint p1, java.lang.Object p2, com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters p3, java.util.Date p4) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException, com.android.internal.org.bouncycastle.jce.provider.RecoverableCertPathValidatorException { return null; }
    protected static java.util.Date getValidCertDateFromValidityModel(java.util.Date p0, int p1, java.security.cert.CertPath p2, int p3) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException { return null; }
    protected static java.security.PublicKey getNextWorkingKey(java.util.List p0, int p1, com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper p2) throws java.security.cert.CertPathValidatorException { return null; }
    static java.util.Collection findIssuerCerts(java.security.cert.X509Certificate p0, java.util.List<java.security.cert.CertStore> p1, java.util.List<com.android.internal.org.bouncycastle.jcajce.PKIXCertStore> p2) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException { return null; }
    protected static void verifyX509Certificate(java.security.cert.X509Certificate p0, java.security.PublicKey p1, java.lang.String p2) throws java.security.GeneralSecurityException {}
    static void checkCRLsNotEmpty(com.android.internal.org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters p0, java.util.Set p1, java.lang.Object p2) throws com.android.internal.org.bouncycastle.jce.provider.RecoverableCertPathValidatorException {}
}
