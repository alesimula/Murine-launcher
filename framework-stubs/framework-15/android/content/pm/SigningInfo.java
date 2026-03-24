package android.content.pm;

public final class SigningInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.pm.SigningInfo> CREATOR = null;
    public SigningInfo() {}
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public SigningInfo(int p0, java.util.Collection<android.content.pm.Signature> p1, java.util.Collection<java.security.PublicKey> p2, java.util.Collection<android.content.pm.Signature> p3) {}
    public SigningInfo(android.content.pm.SigningDetails p0) {}
    public SigningInfo(android.content.pm.SigningInfo p0) {}
    public boolean hasMultipleSigners() { return false; }
    public boolean hasPastSigningCertificates() { return false; }
    public android.content.pm.Signature[] getSigningCertificateHistory() { return null; }
    public android.content.pm.Signature[] getApkContentsSigners() { return null; }
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public int getSchemeVersion() { return 0; }
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    @android.annotation.NonNull
    public java.util.Collection<java.security.PublicKey> getPublicKeys() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public android.content.pm.SigningDetails getSigningDetails() { return null; }
}
