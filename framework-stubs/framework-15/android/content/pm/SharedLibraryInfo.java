package android.content.pm;

public final class SharedLibraryInfo implements android.os.Parcelable {
    public static final int TYPE_BUILTIN = 0;
    public static final int TYPE_DYNAMIC = 1;
    public static final int TYPE_STATIC = 2;
    public static final int TYPE_SDK_PACKAGE = 3;
    public static final int VERSION_UNDEFINED = -1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.pm.SharedLibraryInfo> CREATOR = null;
    public SharedLibraryInfo(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2, java.lang.String p3, long p4, int p5, android.content.pm.VersionedPackage p6, java.util.List<android.content.pm.VersionedPackage> p7, java.util.List<android.content.pm.SharedLibraryInfo> p8, boolean p9) {}
    public SharedLibraryInfo(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2, java.lang.String p3, long p4, int p5, android.content.pm.VersionedPackage p6, java.util.List<android.content.pm.SharedLibraryInfo> p7, boolean p8, android.util.Pair<java.util.List<android.content.pm.VersionedPackage>, java.util.List<java.lang.Boolean>> p9) {}
    public int getType() { return 0; }
    public boolean isNative() { return false; }
    public java.lang.String getName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPath() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPackageName() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getAllCodePaths() { return null; }
    public void addDependency(android.content.pm.SharedLibraryInfo p0) {}
    public void clearDependencies() {}
    @android.annotation.Nullable
    public java.util.List<android.content.pm.SharedLibraryInfo> getDependencies() { return null; }
    @java.lang.Deprecated
    public int getVersion() { return 0; }
    public long getLongVersion() { return 0L; }
    public boolean isBuiltin() { return false; }
    public boolean isDynamic() { return false; }
    public boolean isStatic() { return false; }
    public boolean isSdk() { return false; }
    @android.annotation.NonNull
    public android.content.pm.VersionedPackage getDeclaringPackage() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.content.pm.VersionedPackage> getDependentPackages() { return null; }
    @android.annotation.FlaggedApi("android.content.pm.sdk_lib_independence")
    @android.annotation.NonNull
    public java.util.List<android.content.pm.VersionedPackage> getOptionalDependentPackages() { return null; }
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
