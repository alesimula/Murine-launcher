package com.android.internal.org.bouncycastle.cms;

class CMSUtils {
    CMSUtils() {}
    static boolean isMQV(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return false; }
    static boolean isEC(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return false; }
    static boolean isGOST(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return false; }
    static boolean isDES(java.lang.String p0) { return false; }
    static boolean isEquivalent(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1) { return false; }
    static com.android.internal.org.bouncycastle.asn1.cms.ContentInfo readContentInfo(byte[] p0) throws com.android.internal.org.bouncycastle.cms.CMSException { return null; }
    static com.android.internal.org.bouncycastle.asn1.cms.ContentInfo readContentInfo(java.io.InputStream p0) throws com.android.internal.org.bouncycastle.cms.CMSException { return null; }
    static com.android.internal.org.bouncycastle.asn1.ASN1Set convertToDlSet(java.util.Set<com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier> p0) { return null; }
    static void addDigestAlgs(java.util.Set<com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier> p0, com.android.internal.org.bouncycastle.cms.SignerInformation p1, com.android.internal.org.bouncycastle.operator.DigestAlgorithmIdentifierFinder p2) {}
    static java.util.List getCertificatesFromStore(com.android.internal.org.bouncycastle.util.Store p0) throws com.android.internal.org.bouncycastle.cms.CMSException { return null; }
    static java.util.List getAttributeCertificatesFromStore(com.android.internal.org.bouncycastle.util.Store p0) throws com.android.internal.org.bouncycastle.cms.CMSException { return null; }
    static java.util.List getCRLsFromStore(com.android.internal.org.bouncycastle.util.Store p0) throws com.android.internal.org.bouncycastle.cms.CMSException { return null; }
    static com.android.internal.org.bouncycastle.asn1.ASN1Set createBerSetFromList(java.util.List p0) { return null; }
    static com.android.internal.org.bouncycastle.asn1.ASN1Set createDlSetFromList(java.util.List p0) { return null; }
    static com.android.internal.org.bouncycastle.asn1.ASN1Set createDerSetFromList(java.util.List p0) { return null; }
    static java.io.OutputStream createBEROctetOutputStream(java.io.OutputStream p0, int p1, boolean p2, int p3) throws java.io.IOException { return null; }
    public static byte[] streamToByteArray(java.io.InputStream p0) throws java.io.IOException { return null; }
    public static byte[] streamToByteArray(java.io.InputStream p0, int p1) throws java.io.IOException { return null; }
    static java.io.InputStream attachDigestsToInputStream(java.util.Collection p0, java.io.InputStream p1) { return null; }
    static java.io.OutputStream attachSignersToOutputStream(java.util.Collection p0, java.io.OutputStream p1) { return null; }
    static java.io.OutputStream getSafeOutputStream(java.io.OutputStream p0) { return null; }
    static java.io.OutputStream getSafeTeeOutputStream(java.io.OutputStream p0, java.io.OutputStream p1) { return null; }
}
