package com.android.internal.org.bouncycastle.operator;

public interface AlgorithmNameFinder {
    public boolean hasAlgorithmName(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0);
    public java.lang.String getAlgorithmName(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0);
    public java.lang.String getAlgorithmName(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0);
}
