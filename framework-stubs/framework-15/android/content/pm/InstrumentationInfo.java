package android.content.pm;

public class InstrumentationInfo extends android.content.pm.PackageItemInfo implements android.os.Parcelable {
    public java.lang.String targetPackage;
    public java.lang.String targetProcesses;
    public java.lang.String sourceDir;
    public java.lang.String publicSourceDir;
    public java.lang.String[] splitNames;
    public java.lang.String[] splitSourceDirs;
    public java.lang.String[] splitPublicSourceDirs;
    public android.util.SparseArray<int[]> splitDependencies;
    public java.lang.String dataDir;
    public java.lang.String deviceProtectedDataDir;
    public java.lang.String credentialProtectedDataDir;
    public java.lang.String primaryCpuAbi;
    public java.lang.String secondaryCpuAbi;
    public java.lang.String nativeLibraryDir;
    public java.lang.String secondaryNativeLibraryDir;
    public boolean handleProfiling;
    public boolean functionalTest;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.pm.InstrumentationInfo> CREATOR = null;
    public InstrumentationInfo() { super(); }
    public InstrumentationInfo(android.content.pm.InstrumentationInfo p0) { super(); }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void copyTo(android.content.pm.ApplicationInfo p0) {}
}
