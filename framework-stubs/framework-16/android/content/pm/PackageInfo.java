package android.content.pm;

public class PackageInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public java.lang.String packageName;
    @android.annotation.NonNull
    public java.lang.String[] splitNames;
    @java.lang.Deprecated
    public int versionCode;
    public int versionCodeMajor;
    @android.annotation.Nullable
    public java.lang.String versionName;
    public int baseRevisionCode;
    @android.annotation.NonNull
    public int[] splitRevisionCodes;
    @android.annotation.Nullable
    public java.lang.String sharedUserId;
    public int sharedUserLabel;
    @android.annotation.Nullable
    public android.content.pm.ApplicationInfo applicationInfo;
    public long firstInstallTime;
    public long lastUpdateTime;
    @android.annotation.Nullable
    public int[] gids;
    @android.annotation.Nullable
    public android.content.pm.ActivityInfo[] activities;
    @android.annotation.Nullable
    public android.content.pm.ActivityInfo[] receivers;
    @android.annotation.Nullable
    public android.content.pm.ServiceInfo[] services;
    @android.annotation.Nullable
    public android.content.pm.ProviderInfo[] providers;
    @android.annotation.Nullable
    public android.content.pm.InstrumentationInfo[] instrumentation;
    @android.annotation.Nullable
    public android.content.pm.PermissionInfo[] permissions;
    @android.annotation.Nullable
    public java.lang.String[] requestedPermissions;
    @android.annotation.Nullable
    public int[] requestedPermissionsFlags;
    @android.annotation.Nullable
    public android.content.pm.Attribution[] attributions;
    public static final int REQUESTED_PERMISSION_REQUIRED = 1;
    public static final int REQUESTED_PERMISSION_GRANTED = 2;
    public static final int REQUESTED_PERMISSION_NEVER_FOR_LOCATION = 65536;
    public static final int REQUESTED_PERMISSION_IMPLICIT = 4;
    @java.lang.Deprecated
    @android.annotation.Nullable
    public android.content.pm.Signature[] signatures;
    @android.annotation.Nullable
    public android.content.pm.SigningInfo signingInfo;
    @android.annotation.Nullable
    public android.content.pm.ConfigurationInfo[] configPreferences;
    @android.annotation.Nullable
    public android.content.pm.FeatureInfo[] reqFeatures;
    @android.annotation.Nullable
    public android.content.pm.FeatureGroupInfo[] featureGroups;
    public static final int INSTALL_LOCATION_UNSPECIFIED = -1;
    public static final int INSTALL_LOCATION_AUTO = 0;
    public static final int INSTALL_LOCATION_INTERNAL_ONLY = 1;
    public static final int INSTALL_LOCATION_PREFER_EXTERNAL = 2;
    public int installLocation;
    public boolean isStub;
    public boolean coreApp;
    public boolean requiredForAllUsers;
    @android.annotation.Nullable
    public java.lang.String restrictedAccountType;
    @android.annotation.Nullable
    public java.lang.String requiredAccountType;
    @android.annotation.Nullable
    public java.lang.String overlayTarget;
    @android.annotation.Nullable
    public java.lang.String targetOverlayableName;
    @android.annotation.Nullable
    public java.lang.String overlayCategory;
    public int overlayPriority;
    public boolean mOverlayIsStatic;
    public int compileSdkVersion;
    @android.annotation.Nullable
    public java.lang.String compileSdkVersionCodename;
    public boolean isApex;
    public boolean isActiveApex;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.pm.PackageInfo> CREATOR = null;
    public long getLongVersionCode() { return 0L; }
    public void setLongVersionCode(long p0) {}
    public static long composeLongVersionCode(int p0, int p1) { return 0L; }
    public PackageInfo() {}
    public boolean isOverlayPackage() { return false; }
    public boolean isStaticOverlayPackage() { return false; }
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public long getArchiveTimeMillis() { return 0L; }
    public void setArchiveTimeMillis(long p0) {}
    @android.annotation.Nullable
    @android.annotation.FlaggedApi("android.content.pm.provide_info_of_apk_in_apex")
    public java.lang.String getApexPackageName() { return null; }
    public void setApexPackageName(java.lang.String p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
