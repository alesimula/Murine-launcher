package com.android.internal.org.bouncycastle.cms;

public class CMSSignedData implements com.android.internal.org.bouncycastle.util.Encodable {
    com.android.internal.org.bouncycastle.asn1.cms.SignedData signedData;
    com.android.internal.org.bouncycastle.asn1.cms.ContentInfo contentInfo;
    com.android.internal.org.bouncycastle.cms.CMSTypedData signedContent;
    com.android.internal.org.bouncycastle.cms.SignerInformationStore signerInfoStore;
    public CMSSignedData(byte[] p0) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public CMSSignedData(com.android.internal.org.bouncycastle.cms.CMSProcessable p0, byte[] p1) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public CMSSignedData(java.util.Map p0, byte[] p1) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public CMSSignedData(com.android.internal.org.bouncycastle.cms.CMSProcessable p0, java.io.InputStream p1) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public CMSSignedData(java.io.InputStream p0) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public CMSSignedData(com.android.internal.org.bouncycastle.cms.CMSProcessable p0, com.android.internal.org.bouncycastle.asn1.cms.ContentInfo p1) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public CMSSignedData(java.util.Map p0, com.android.internal.org.bouncycastle.asn1.cms.ContentInfo p1) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public CMSSignedData(com.android.internal.org.bouncycastle.asn1.cms.ContentInfo p0) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public int getVersion() { return 0; }
    public com.android.internal.org.bouncycastle.cms.SignerInformationStore getSignerInfos() { return null; }
    public boolean isDetachedSignature() { return false; }
    public boolean isCertificateManagementMessage() { return false; }
    public com.android.internal.org.bouncycastle.util.Store<com.android.internal.org.bouncycastle.cert.X509CertificateHolder> getCertificates() { return null; }
    public com.android.internal.org.bouncycastle.util.Store<com.android.internal.org.bouncycastle.cert.X509CRLHolder> getCRLs() { return null; }
    public com.android.internal.org.bouncycastle.util.Store<com.android.internal.org.bouncycastle.cert.X509AttributeCertificateHolder> getAttributeCertificates() { return null; }
    public java.util.Set<com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier> getDigestAlgorithmIDs() { return null; }
    public java.lang.String getSignedContentTypeOID() { return null; }
    public com.android.internal.org.bouncycastle.cms.CMSTypedData getSignedContent() { return null; }
    public com.android.internal.org.bouncycastle.asn1.cms.ContentInfo toASN1Structure() { return null; }
    public byte[] getEncoded() throws java.io.IOException { return null; }
    public byte[] getEncoded(java.lang.String p0) throws java.io.IOException { return null; }
    public static com.android.internal.org.bouncycastle.cms.CMSSignedData replaceSigners(com.android.internal.org.bouncycastle.cms.CMSSignedData p0, com.android.internal.org.bouncycastle.cms.SignerInformationStore p1) { return null; }
    public static com.android.internal.org.bouncycastle.cms.CMSSignedData replaceCertificatesAndCRLs(com.android.internal.org.bouncycastle.cms.CMSSignedData p0, com.android.internal.org.bouncycastle.util.Store p1, com.android.internal.org.bouncycastle.util.Store p2, com.android.internal.org.bouncycastle.util.Store p3) throws com.android.internal.org.bouncycastle.cms.CMSException { return null; }
}
