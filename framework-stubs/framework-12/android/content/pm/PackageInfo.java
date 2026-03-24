package android.content.pm;

public class PackageInfo implements android.os.Parcelable {
    public java.lang.String packageName;
    public java.lang.String[] splitNames;
    @java.lang.Deprecated
    public int versionCode;
    public int versionCodeMajor;
    public java.lang.String versionName;
    public int baseRevisionCode;
    public int[] splitRevisionCodes;
    public java.lang.String sharedUserId;
    public int sharedUserLabel;
    public android.content.pm.ApplicationInfo applicationInfo;
    public long firstInstallTime;
    public long lastUpdateTime;
    public int[] gids;
    public android.content.pm.ActivityInfo[] activities;
    public android.content.pm.ActivityInfo[] receivers;
    public android.content.pm.ServiceInfo[] services;
    public android.content.pm.ProviderInfo[] providers;
    public android.content.pm.InstrumentationInfo[] instrumentation;
    public android.content.pm.PermissionInfo[] permissions;
    public java.lang.String[] requestedPermissions;
    public int[] requestedPermissionsFlags;
    public android.content.pm.Attribution[] attributions;
    public static final int REQUESTED_PERMISSION_REQUIRED = 1;
    public static final int REQUESTED_PERMISSION_GRANTED = 2;
    public static final int REQUESTED_PERMISSION_NEVER_FOR_LOCATION = 65536;
    @java.lang.Deprecated
    public android.content.pm.Signature[] signatures;
    public android.content.pm.SigningInfo signingInfo;
    public android.content.pm.ConfigurationInfo[] configPreferences;
    public android.content.pm.FeatureInfo[] reqFeatures;
    public android.content.pm.FeatureGroupInfo[] featureGroups;
    public static final int INSTALL_LOCATION_UNSPECIFIED = -1;
    public static final int INSTALL_LOCATION_AUTO = 0;
    public static final int INSTALL_LOCATION_INTERNAL_ONLY = 1;
    public static final int INSTALL_LOCATION_PREFER_EXTERNAL = 2;
    public int installLocation;
    public boolean isStub;
    public boolean coreApp;
    public boolean requiredForAllUsers;
    public java.lang.String restrictedAccountType;
    public java.lang.String requiredAccountType;
    public java.lang.String overlayTarget;
    public java.lang.String targetOverlayableName;
    public java.lang.String overlayCategory;
    public int overlayPriority;
    public boolean mOverlayIsStatic;
    public int compileSdkVersion;
    public java.lang.String compileSdkVersionCodename;
    public boolean isApex;
    public static final android.os.Parcelable.Creator<android.content.pm.PackageInfo> CREATOR = null;
    public long getLongVersionCode() { return 0L; }
    public void setLongVersionCode(long p0) {}
    public static long composeLongVersionCode(int p0, int p1) { return 0L; }
    public PackageInfo() {}
    public boolean isOverlayPackage() { return false; }
    public boolean isStaticOverlayPackage() { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private PackageInfo(android.os.Parcel p0) {}
}
