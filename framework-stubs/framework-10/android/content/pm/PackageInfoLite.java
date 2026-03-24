package android.content.pm;

public class PackageInfoLite implements android.os.Parcelable {
    public java.lang.String packageName;
    public java.lang.String[] splitNames;
    @java.lang.Deprecated
    public int versionCode;
    public int versionCodeMajor;
    public int baseRevisionCode;
    public int[] splitRevisionCodes;
    public boolean multiArch;
    public int recommendedInstallLocation;
    public int installLocation;
    public android.content.pm.VerifierInfo[] verifiers;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public static final android.os.Parcelable.Creator<android.content.pm.PackageInfoLite> CREATOR = null;
    public long getLongVersionCode() { return 0L; }
    public PackageInfoLite() {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private PackageInfoLite(android.os.Parcel p0) {}
}
