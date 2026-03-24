package com.android.internal.org.bouncycastle.cms;

public interface CMSAttributeTableGenerator {
    public static final java.lang.String CONTENT_TYPE = "contentType";
    public static final java.lang.String DIGEST = "digest";
    public static final java.lang.String SIGNATURE = "encryptedDigest";
    public static final java.lang.String DIGEST_ALGORITHM_IDENTIFIER = "digestAlgID";
    public static final java.lang.String MAC_ALGORITHM_IDENTIFIER = "macAlgID";
    public static final java.lang.String SIGNATURE_ALGORITHM_IDENTIFIER = "signatureAlgID";
    public com.android.internal.org.bouncycastle.asn1.cms.AttributeTable getAttributes(java.util.Map p0) throws com.android.internal.org.bouncycastle.cms.CMSAttributeTableGenerationException;
}
