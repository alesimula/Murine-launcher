package com.android.internal.org.bouncycastle.asn1.pkcs;

public class EncryptedPrivateKeyInfo extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    private com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier algId;
    private com.android.internal.org.bouncycastle.asn1.ASN1OctetString data;
    private EncryptedPrivateKeyInfo(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public EncryptedPrivateKeyInfo(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, byte[] p1) { super(); }
    public static com.android.internal.org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo getInstance(java.lang.Object p0) { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getEncryptionAlgorithm() { return null; }
    public byte[] getEncryptedData() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
