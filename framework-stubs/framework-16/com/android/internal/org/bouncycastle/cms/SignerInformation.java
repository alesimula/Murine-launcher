package com.android.internal.org.bouncycastle.cms;

public class SignerInformation {
    protected final com.android.internal.org.bouncycastle.asn1.cms.SignerInfo info = null;
    protected final com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier digestAlgorithm = null;
    protected final com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier encryptionAlgorithm = null;
    protected final com.android.internal.org.bouncycastle.asn1.ASN1Set signedAttributeSet = null;
    protected final com.android.internal.org.bouncycastle.asn1.ASN1Set unsignedAttributeSet = null;
    SignerInformation(com.android.internal.org.bouncycastle.asn1.cms.SignerInfo p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, com.android.internal.org.bouncycastle.cms.CMSProcessable p2, byte[] p3) {}
    protected SignerInformation(com.android.internal.org.bouncycastle.cms.SignerInformation p0) {}
    protected SignerInformation(com.android.internal.org.bouncycastle.cms.SignerInformation p0, com.android.internal.org.bouncycastle.asn1.cms.SignerInfo p1) {}
    public boolean isCounterSignature() { return false; }
    public com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType() { return null; }
    public com.android.internal.org.bouncycastle.cms.SignerId getSID() { return null; }
    public int getVersion() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithmID() { return null; }
    public java.lang.String getDigestAlgOID() { return null; }
    public byte[] getDigestAlgParams() { return null; }
    public byte[] getContentDigest() { return null; }
    public java.lang.String getEncryptionAlgOID() { return null; }
    public byte[] getEncryptionAlgParams() { return null; }
    public com.android.internal.org.bouncycastle.asn1.cms.AttributeTable getSignedAttributes() { return null; }
    public com.android.internal.org.bouncycastle.asn1.cms.AttributeTable getUnsignedAttributes() { return null; }
    public byte[] getSignature() { return null; }
    public com.android.internal.org.bouncycastle.cms.SignerInformationStore getCounterSignatures() { return null; }
    public byte[] getEncodedSignedAttributes() throws java.io.IOException { return null; }
    public boolean verify(com.android.internal.org.bouncycastle.cms.SignerInformationVerifier p0) throws com.android.internal.org.bouncycastle.cms.CMSException { return false; }
    public com.android.internal.org.bouncycastle.asn1.cms.SignerInfo toASN1Structure() { return null; }
    public static com.android.internal.org.bouncycastle.cms.SignerInformation replaceUnsignedAttributes(com.android.internal.org.bouncycastle.cms.SignerInformation p0, com.android.internal.org.bouncycastle.asn1.cms.AttributeTable p1) { return null; }
    public static com.android.internal.org.bouncycastle.cms.SignerInformation addCounterSigners(com.android.internal.org.bouncycastle.cms.SignerInformation p0, com.android.internal.org.bouncycastle.cms.SignerInformationStore p1) { return null; }
}
