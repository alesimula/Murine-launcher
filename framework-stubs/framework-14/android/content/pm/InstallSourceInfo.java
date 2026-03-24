package android.content.pm;

public final class InstallSourceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.InstallSourceInfo> CREATOR = null;
    public InstallSourceInfo(java.lang.String p0, android.content.pm.SigningInfo p1, java.lang.String p2, java.lang.String p3) {}
    public InstallSourceInfo(java.lang.String p0, android.content.pm.SigningInfo p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String getInitiatingPackageName() { return null; }
    public android.content.pm.SigningInfo getInitiatingPackageSigningInfo() { return null; }
    public java.lang.String getOriginatingPackageName() { return null; }
    public java.lang.String getInstallingPackageName() { return null; }
    public java.lang.String getUpdateOwnerPackageName() { return null; }
    public int getPackageSource() { return 0; }
}
