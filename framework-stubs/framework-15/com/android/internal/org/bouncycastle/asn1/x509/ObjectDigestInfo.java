package com.android.internal.org.bouncycastle.asn1.x509;

public class ObjectDigestInfo extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    public static final int publicKey = 0;
    public static final int publicKeyCert = 1;
    public static final int otherObjectDigest = 2;
    com.android.internal.org.bouncycastle.asn1.ASN1Enumerated digestedObjectType;
    com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier otherObjectTypeID;
    com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier digestAlgorithm;
    com.android.internal.org.bouncycastle.asn1.DERBitString objectDigest;
    public static com.android.internal.org.bouncycastle.asn1.x509.ObjectDigestInfo getInstance(java.lang.Object p0) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.x509.ObjectDigestInfo getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public ObjectDigestInfo(int p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p2, byte[] p3) { super(); }
    public com.android.internal.org.bouncycastle.asn1.ASN1Enumerated getDigestedObjectType() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier getOtherObjectTypeID() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithm() { return null; }
    public com.android.internal.org.bouncycastle.asn1.DERBitString getObjectDigest() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
