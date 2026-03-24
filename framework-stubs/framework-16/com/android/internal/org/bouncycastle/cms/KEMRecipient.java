package com.android.internal.org.bouncycastle.cms;

public interface KEMRecipient extends com.android.internal.org.bouncycastle.cms.Recipient {
    public com.android.internal.org.bouncycastle.cms.RecipientOperator getRecipientOperator(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1, byte[] p2) throws com.android.internal.org.bouncycastle.cms.CMSException;
}
