package com.android.internal.org.bouncycastle.jce.provider;

class RFC3280CertPathUtilities {
    public static final java.lang.String CERTIFICATE_POLICIES = null;
    public static final java.lang.String POLICY_MAPPINGS = null;
    public static final java.lang.String INHIBIT_ANY_POLICY = null;
    public static final java.lang.String ISSUING_DISTRIBUTION_POINT = null;
    public static final java.lang.String FRESHEST_CRL = null;
    public static final java.lang.String DELTA_CRL_INDICATOR = null;
    public static final java.lang.String POLICY_CONSTRAINTS = null;
    public static final java.lang.String BASIC_CONSTRAINTS = null;
    public static final java.lang.String CRL_DISTRIBUTION_POINTS = null;
    public static final java.lang.String SUBJECT_ALTERNATIVE_NAME = null;
    public static final java.lang.String NAME_CONSTRAINTS = null;
    public static final java.lang.String AUTHORITY_KEY_IDENTIFIER = null;
    public static final java.lang.String KEY_USAGE = null;
    public static final java.lang.String CRL_NUMBER = null;
    public static final java.lang.String ANY_POLICY = "2.5.29.32.0";
    protected static final int KEY_CERT_SIGN = 5;
    protected static final int CRL_SIGN = 6;
    protected static final java.lang.String[] crlReasons = null;
    RFC3280CertPathUtilities() {}
    protected static void processCRLB2(com.android.internal.org.bouncycastle.asn1.x509.DistributionPoint p0, java.lang.Object p1, java.security.cert.X509CRL p2) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException {}
    protected static void processCRLB1(com.android.internal.org.bouncycastle.asn1.x509.DistributionPoint p0, java.lang.Object p1, java.security.cert.X509CRL p2) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException {}
    protected static com.android.internal.org.bouncycastle.jce.provider.ReasonsMask processCRLD(java.security.cert.X509CRL p0, com.android.internal.org.bouncycastle.asn1.x509.DistributionPoint p1) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException { return null; }
    protected static java.util.Set processCRLF(java.security.cert.X509CRL p0, java.lang.Object p1, java.security.cert.X509Certificate p2, java.security.PublicKey p3, com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters p4, java.util.List p5, com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper p6) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException { return null; }
    protected static java.security.PublicKey processCRLG(java.security.cert.X509CRL p0, java.util.Set p1) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException { return null; }
    protected static java.security.cert.X509CRL processCRLH(java.util.Set p0, java.security.PublicKey p1) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException { return null; }
    protected static void processCRLC(java.security.cert.X509CRL p0, java.security.cert.X509CRL p1, com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters p2) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException {}
    protected static void processCRLI(java.util.Date p0, java.security.cert.X509CRL p1, java.lang.Object p2, com.android.internal.org.bouncycastle.jce.provider.CertStatus p3, com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters p4) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException {}
    protected static void processCRLJ(java.util.Date p0, java.security.cert.X509CRL p1, java.lang.Object p2, com.android.internal.org.bouncycastle.jce.provider.CertStatus p3) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException {}
    protected static com.android.internal.org.bouncycastle.jce.provider.PKIXPolicyNode prepareCertB(java.security.cert.CertPath p0, int p1, java.util.List[] p2, com.android.internal.org.bouncycastle.jce.provider.PKIXPolicyNode p3, int p4) throws java.security.cert.CertPathValidatorException { return null; }
    protected static void prepareNextCertA(java.security.cert.CertPath p0, int p1) throws java.security.cert.CertPathValidatorException {}
    protected static void processCertF(java.security.cert.CertPath p0, int p1, com.android.internal.org.bouncycastle.jce.provider.PKIXPolicyNode p2, int p3) throws java.security.cert.CertPathValidatorException {}
    protected static com.android.internal.org.bouncycastle.jce.provider.PKIXPolicyNode processCertE(java.security.cert.CertPath p0, int p1, com.android.internal.org.bouncycastle.jce.provider.PKIXPolicyNode p2) throws java.security.cert.CertPathValidatorException { return null; }
    protected static void processCertBC(java.security.cert.CertPath p0, int p1, com.android.internal.org.bouncycastle.jce.provider.PKIXNameConstraintValidator p2, boolean p3) throws java.security.cert.CertPathValidatorException {}
    protected static com.android.internal.org.bouncycastle.jce.provider.PKIXPolicyNode processCertD(java.security.cert.CertPath p0, int p1, java.util.Set p2, com.android.internal.org.bouncycastle.jce.provider.PKIXPolicyNode p3, java.util.List[] p4, int p5, boolean p6) throws java.security.cert.CertPathValidatorException { return null; }
    protected static void processCertA(java.security.cert.CertPath p0, com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters p1, java.util.Date p2, com.android.internal.org.bouncycastle.jcajce.PKIXCertRevocationChecker p3, int p4, java.security.PublicKey p5, boolean p6, com.android.internal.org.bouncycastle.asn1.x500.X500Name p7, java.security.cert.X509Certificate p8) throws java.security.cert.CertPathValidatorException {}
    protected static int prepareNextCertI1(java.security.cert.CertPath p0, int p1, int p2) throws java.security.cert.CertPathValidatorException { return 0; }
    protected static int prepareNextCertI2(java.security.cert.CertPath p0, int p1, int p2) throws java.security.cert.CertPathValidatorException { return 0; }
    protected static void prepareNextCertG(java.security.cert.CertPath p0, int p1, com.android.internal.org.bouncycastle.jce.provider.PKIXNameConstraintValidator p2) throws java.security.cert.CertPathValidatorException {}
    protected static void checkCRLs(com.android.internal.org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters p0, com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters p1, java.util.Date p2, java.util.Date p3, java.security.cert.X509Certificate p4, java.security.cert.X509Certificate p5, java.security.PublicKey p6, java.util.List p7, com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper p8) throws com.android.internal.org.bouncycastle.jce.provider.AnnotatedException, com.android.internal.org.bouncycastle.jce.provider.RecoverableCertPathValidatorException {}
    protected static int prepareNextCertJ(java.security.cert.CertPath p0, int p1, int p2) throws java.security.cert.CertPathValidatorException { return 0; }
    protected static void prepareNextCertK(java.security.cert.CertPath p0, int p1) throws java.security.cert.CertPathValidatorException {}
    protected static int prepareNextCertL(java.security.cert.CertPath p0, int p1, int p2) throws java.security.cert.CertPathValidatorException { return 0; }
    protected static int prepareNextCertM(java.security.cert.CertPath p0, int p1, int p2) throws java.security.cert.CertPathValidatorException { return 0; }
    protected static void prepareNextCertN(java.security.cert.CertPath p0, int p1) throws java.security.cert.CertPathValidatorException {}
    protected static void prepareNextCertO(java.security.cert.CertPath p0, int p1, java.util.Set p2, java.util.List p3) throws java.security.cert.CertPathValidatorException {}
    protected static int prepareNextCertH1(java.security.cert.CertPath p0, int p1, int p2) { return 0; }
    protected static int prepareNextCertH2(java.security.cert.CertPath p0, int p1, int p2) { return 0; }
    protected static int prepareNextCertH3(java.security.cert.CertPath p0, int p1, int p2) { return 0; }
    protected static int wrapupCertA(int p0, java.security.cert.X509Certificate p1) { return 0; }
    protected static int wrapupCertB(java.security.cert.CertPath p0, int p1, int p2) throws java.security.cert.CertPathValidatorException { return 0; }
    protected static void wrapupCertF(java.security.cert.CertPath p0, int p1, java.util.List p2, java.util.Set p3) throws java.security.cert.CertPathValidatorException {}
    protected static com.android.internal.org.bouncycastle.jce.provider.PKIXPolicyNode wrapupCertG(java.security.cert.CertPath p0, com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters p1, java.util.Set p2, int p3, java.util.List[] p4, com.android.internal.org.bouncycastle.jce.provider.PKIXPolicyNode p5, java.util.Set p6) throws java.security.cert.CertPathValidatorException { return null; }
}
