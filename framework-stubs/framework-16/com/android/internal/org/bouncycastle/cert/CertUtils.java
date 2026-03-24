package com.android.internal.org.bouncycastle.cert;

class CertUtils {
    CertUtils() {}
    static com.android.internal.org.bouncycastle.asn1.ASN1Primitive parseNonEmptyASN1(byte[] p0) throws java.io.IOException { return null; }
    static com.android.internal.org.bouncycastle.cert.X509CertificateHolder generateFullCert(com.android.internal.org.bouncycastle.operator.ContentSigner p0, com.android.internal.org.bouncycastle.asn1.x509.TBSCertificate p1) { return null; }
    static com.android.internal.org.bouncycastle.cert.X509AttributeCertificateHolder generateFullAttrCert(com.android.internal.org.bouncycastle.operator.ContentSigner p0, com.android.internal.org.bouncycastle.asn1.x509.AttributeCertificateInfo p1) { return null; }
    static java.util.Set getCriticalExtensionOIDs(com.android.internal.org.bouncycastle.asn1.x509.Extensions p0) { return null; }
    static java.util.Set getNonCriticalExtensionOIDs(com.android.internal.org.bouncycastle.asn1.x509.Extensions p0) { return null; }
    static java.util.List getExtensionOIDs(com.android.internal.org.bouncycastle.asn1.x509.Extensions p0) { return null; }
    static void addExtension(com.android.internal.org.bouncycastle.asn1.x509.ExtensionsGenerator p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, boolean p2, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p3) throws com.android.internal.org.bouncycastle.cert.CertIOException {}
    static com.android.internal.org.bouncycastle.asn1.DERBitString booleanToBitString(boolean[] p0) { return null; }
    static boolean[] bitStringToBoolean(com.android.internal.org.bouncycastle.asn1.ASN1BitString p0) { return null; }
    static java.util.Date recoverDate(com.android.internal.org.bouncycastle.asn1.ASN1GeneralizedTime p0) { return null; }
    static boolean isAlgIdEqual(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1) { return false; }
    static com.android.internal.org.bouncycastle.asn1.x509.ExtensionsGenerator doReplaceExtension(com.android.internal.org.bouncycastle.asn1.x509.ExtensionsGenerator p0, com.android.internal.org.bouncycastle.asn1.x509.Extension p1) { return null; }
    static com.android.internal.org.bouncycastle.asn1.x509.ExtensionsGenerator doRemoveExtension(com.android.internal.org.bouncycastle.asn1.x509.ExtensionsGenerator p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1) { return null; }
    static com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject trimExtensions(int p0, com.android.internal.org.bouncycastle.asn1.x509.Extensions p1) { return null; }
}
