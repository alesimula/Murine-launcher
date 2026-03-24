package com.android.internal.org.bouncycastle.jce.provider;

public class X509CRLEntryObject extends java.security.cert.X509CRLEntry {
    private com.android.internal.org.bouncycastle.asn1.x509.TBSCertList.CRLEntry c;
    private com.android.internal.org.bouncycastle.asn1.x500.X500Name certificateIssuer;
    private int hashValue;
    private boolean isHashValueSet;
    public X509CRLEntryObject(com.android.internal.org.bouncycastle.asn1.x509.TBSCertList.CRLEntry p0) { super(); }
    public X509CRLEntryObject(com.android.internal.org.bouncycastle.asn1.x509.TBSCertList.CRLEntry p0, boolean p1, com.android.internal.org.bouncycastle.asn1.x500.X500Name p2) { super(); }
    public boolean hasUnsupportedCriticalExtension() { return false; }
    private com.android.internal.org.bouncycastle.asn1.x500.X500Name loadCertificateIssuer(boolean p0, com.android.internal.org.bouncycastle.asn1.x500.X500Name p1) { return null; }
    public javax.security.auth.x500.X500Principal getCertificateIssuer() { return null; }
    private java.util.Set getExtensionOIDs(boolean p0) { return null; }
    public java.util.Set getCriticalExtensionOIDs() { return null; }
    public java.util.Set getNonCriticalExtensionOIDs() { return null; }
    private com.android.internal.org.bouncycastle.asn1.x509.Extension getExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public byte[] getExtensionValue(java.lang.String p0) { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public byte[] getEncoded() throws java.security.cert.CRLException { return null; }
    public java.math.BigInteger getSerialNumber() { return null; }
    public java.util.Date getRevocationDate() { return null; }
    public boolean hasExtensions() { return false; }
    public java.lang.String toString() { return null; }
}
