package com.android.internal.org.bouncycastle.operator;

public interface DigestAlgorithmIdentifierFinder {
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier find(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0);
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier find(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0);
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier find(java.lang.String p0);
}
