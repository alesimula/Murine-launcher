package android.content.pm;

public final class SigningInfo implements android.os.Parcelable {
    private final android.content.pm.PackageParser.SigningDetails mSigningDetails = null;
    public static final android.os.Parcelable.Creator<android.content.pm.SigningInfo> CREATOR = null;
    public SigningInfo() {}
    public SigningInfo(android.content.pm.PackageParser.SigningDetails p0) {}
    public SigningInfo(android.content.pm.SigningInfo p0) {}
    private SigningInfo(android.os.Parcel p0) {}
    public boolean hasMultipleSigners() { return false; }
    public boolean hasPastSigningCertificates() { return false; }
    public android.content.pm.Signature[] getSigningCertificateHistory() { return null; }
    public android.content.pm.Signature[] getApkContentsSigners() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
