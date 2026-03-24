package com.android.internal.org.bouncycastle.cms;

public interface CMSTypedData extends com.android.internal.org.bouncycastle.cms.CMSProcessable {
    public com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType();
}
