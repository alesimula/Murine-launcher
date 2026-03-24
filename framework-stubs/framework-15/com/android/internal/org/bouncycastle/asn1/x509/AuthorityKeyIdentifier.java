package com.android.internal.org.bouncycastle.asn1.x509;

public class AuthorityKeyIdentifier extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    com.android.internal.org.bouncycastle.asn1.ASN1OctetString keyidentifier;
    com.android.internal.org.bouncycastle.asn1.x509.GeneralNames certissuer;
    com.android.internal.org.bouncycastle.asn1.ASN1Integer certserno;
    public static com.android.internal.org.bouncycastle.asn1.x509.AuthorityKeyIdentifier getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.x509.AuthorityKeyIdentifier getInstance(java.lang.Object p0) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.x509.AuthorityKeyIdentifier fromExtensions(com.android.internal.org.bouncycastle.asn1.x509.Extensions p0) { return null; }
    protected AuthorityKeyIdentifier(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public AuthorityKeyIdentifier(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) { super(); }
    public AuthorityKeyIdentifier(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0, com.android.internal.org.bouncycastle.asn1.x509.GeneralNames p1, java.math.BigInteger p2) { super(); }
    public AuthorityKeyIdentifier(com.android.internal.org.bouncycastle.asn1.x509.GeneralNames p0, java.math.BigInteger p1) { super(); }
    public AuthorityKeyIdentifier(byte[] p0) { super(); }
    public AuthorityKeyIdentifier(byte[] p0, com.android.internal.org.bouncycastle.asn1.x509.GeneralNames p1, java.math.BigInteger p2) { super(); }
    public byte[] getKeyIdentifier() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.GeneralNames getAuthorityCertIssuer() { return null; }
    public java.math.BigInteger getAuthorityCertSerialNumber() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
    public java.lang.String toString() { return null; }
}
