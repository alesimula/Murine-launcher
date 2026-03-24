package com.android.internal.org.bouncycastle.asn1.x509;

public class TBSCertList extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    com.android.internal.org.bouncycastle.asn1.ASN1Integer version;
    com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier signature;
    com.android.internal.org.bouncycastle.asn1.x500.X500Name issuer;
    com.android.internal.org.bouncycastle.asn1.x509.Time thisUpdate;
    com.android.internal.org.bouncycastle.asn1.x509.Time nextUpdate;
    com.android.internal.org.bouncycastle.asn1.ASN1Sequence revokedCertificates;
    com.android.internal.org.bouncycastle.asn1.x509.Extensions crlExtensions;
    public static com.android.internal.org.bouncycastle.asn1.x509.TBSCertList getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.x509.TBSCertList getInstance(java.lang.Object p0) { return null; }
    public TBSCertList(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public int getVersionNumber() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Integer getVersion() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignature() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getIssuer() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Time getThisUpdate() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Time getNextUpdate() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.TBSCertList.CRLEntry[] getRevokedCertificates() { return null; }
    public java.util.Enumeration getRevokedCertificateEnumeration() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Extensions getExtensions() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }

    public static class CRLEntry extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
        com.android.internal.org.bouncycastle.asn1.ASN1Sequence seq;
        com.android.internal.org.bouncycastle.asn1.x509.Extensions crlEntryExtensions;
        public static com.android.internal.org.bouncycastle.asn1.x509.TBSCertList.CRLEntry getInstance(java.lang.Object p0) { return null; }
        public com.android.internal.org.bouncycastle.asn1.ASN1Integer getUserCertificate() { return null; }
        public com.android.internal.org.bouncycastle.asn1.x509.Time getRevocationDate() { return null; }
        public com.android.internal.org.bouncycastle.asn1.x509.Extensions getExtensions() { return null; }
        public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
        public boolean hasExtensions() { return false; }
    }

    private class EmptyEnumeration implements java.util.Enumeration {
        public boolean hasMoreElements() { return false; }
        public java.lang.Object nextElement() { return null; }
    }

    private class RevokedCertificatesEnumeration implements java.util.Enumeration {
        RevokedCertificatesEnumeration(com.android.internal.org.bouncycastle.asn1.x509.TBSCertList p0, java.util.Enumeration p1) {}
        public boolean hasMoreElements() { return false; }
        public java.lang.Object nextElement() { return null; }
    }
}
