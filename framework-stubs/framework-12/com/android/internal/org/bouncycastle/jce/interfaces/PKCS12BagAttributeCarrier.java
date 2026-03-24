package com.android.internal.org.bouncycastle.jce.interfaces;

public interface PKCS12BagAttributeCarrier {
    public void setBagAttribute(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p1);
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable getBagAttribute(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0);
    public java.util.Enumeration getBagAttributeKeys();
}
