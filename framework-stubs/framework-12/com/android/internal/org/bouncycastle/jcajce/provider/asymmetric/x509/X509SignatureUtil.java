package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509;

class X509SignatureUtil {
    private static final java.util.Map<com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier, java.lang.String> algNames = null;
    private static final com.android.internal.org.bouncycastle.asn1.ASN1Null derNull = null;
    X509SignatureUtil() {}
    static boolean isCompositeAlgorithm(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0) { return false; }
    static void setSignatureParameters(java.security.Signature p0, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p1) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {}
    static java.lang.String getSignatureName(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0) { return null; }
    private static java.lang.String getDigestAlgName(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    private static java.lang.String findAlgName(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    private static java.lang.String lookupAlg(java.security.Provider p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1) { return null; }
    static void prettyPrintSignature(byte[] p0, java.lang.StringBuffer p1, java.lang.String p2) {}
}
