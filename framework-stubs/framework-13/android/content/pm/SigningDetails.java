package android.content.pm;

public final class SigningDetails implements android.os.Parcelable {
    public static final android.content.pm.SigningDetails UNKNOWN = null;
    public static final android.os.Parcelable.Creator<android.content.pm.SigningDetails> CREATOR = null;
    public SigningDetails(android.content.pm.Signature[] p0, int p1, android.util.ArraySet<java.security.PublicKey> p2, android.content.pm.Signature[] p3) {}
    public SigningDetails(android.content.pm.Signature[] p0, int p1, android.content.pm.Signature[] p2) throws java.security.cert.CertificateException {}
    public SigningDetails(android.content.pm.Signature[] p0, int p1) throws java.security.cert.CertificateException {}
    public SigningDetails(android.content.pm.SigningDetails p0) {}
    public android.content.pm.SigningDetails mergeLineageWith(android.content.pm.SigningDetails p0) { return null; }
    public android.content.pm.SigningDetails mergeLineageWith(android.content.pm.SigningDetails p0, int p1) { return null; }
    public boolean hasCommonAncestor(android.content.pm.SigningDetails p0) { return false; }
    public boolean hasAncestorOrSelfWithDigest(java.util.Set<java.lang.String> p0) { return false; }
    public boolean hasSignatures() { return false; }
    public boolean hasPastSigningCertificates() { return false; }
    public boolean hasAncestorOrSelf(android.content.pm.SigningDetails p0) { return false; }
    public boolean hasAncestor(android.content.pm.SigningDetails p0) { return false; }
    public boolean hasCommonSignerWithCapability(android.content.pm.SigningDetails p0, int p1) { return false; }
    public boolean checkCapability(android.content.pm.SigningDetails p0, int p1) { return false; }
    public boolean checkCapabilityRecover(android.content.pm.SigningDetails p0, int p1) throws java.security.cert.CertificateException { return false; }
    public boolean hasCertificate(android.content.pm.Signature p0) { return false; }
    public boolean hasCertificate(android.content.pm.Signature p0, int p1) { return false; }
    public boolean hasCertificate(byte[] p0) { return false; }
    public boolean checkCapability(java.lang.String p0, int p1) { return false; }
    public boolean hasSha256Certificate(byte[] p0) { return false; }
    public boolean hasSha256Certificate(byte[] p0, int p1) { return false; }
    public boolean signaturesMatchExactly(android.content.pm.SigningDetails p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected SigningDetails(android.os.Parcel p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public static android.util.ArraySet<java.security.PublicKey> toSigningKeys(android.content.pm.Signature[] p0) throws java.security.cert.CertificateException { return null; }
    public android.content.pm.Signature[] getSignatures() { return null; }
    @android.content.pm.SigningDetails.SignatureSchemeVersion
    public int getSignatureSchemeVersion() { return 0; }
    public android.util.ArraySet<java.security.PublicKey> getPublicKeys() { return null; }
    public android.content.pm.Signature[] getPastSigningCertificates() { return null; }

    public static class Builder {
        public Builder() {}
        public android.content.pm.SigningDetails.Builder setSignatures(android.content.pm.Signature[] p0) { return null; }
        public android.content.pm.SigningDetails.Builder setSignatureSchemeVersion(int p0) { return null; }
        public android.content.pm.SigningDetails.Builder setPastSigningCertificates(android.content.pm.Signature[] p0) { return null; }
        public android.content.pm.SigningDetails build() throws java.security.cert.CertificateException { return null; }
    }

    public static @interface CapabilityMergeRule {
        public static final int MERGE_SELF_CAPABILITY = 0;
        public static final int MERGE_OTHER_CAPABILITY = 1;
        public static final int MERGE_RESTRICTED_CAPABILITY = 2;
    }

    public static @interface CertCapabilities {
        public static final int INSTALLED_DATA = 1;
        public static final int SHARED_USER_ID = 2;
        public static final int PERMISSION = 4;
        public static final int ROLLBACK = 8;
        public static final int AUTH = 16;
    }

    public static @interface SignatureSchemeVersion {
        public static final int UNKNOWN = 0;
        public static final int JAR = 1;
        public static final int SIGNING_BLOCK_V2 = 2;
        public static final int SIGNING_BLOCK_V3 = 3;
        public static final int SIGNING_BLOCK_V4 = 4;
    }
}
