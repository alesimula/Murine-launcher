package android.app.admin;

public final class PackagePolicy implements android.os.Parcelable {
    public static final int PACKAGE_POLICY_BLOCKLIST = 1;
    public static final int PACKAGE_POLICY_ALLOWLIST_AND_SYSTEM = 2;
    public static final int PACKAGE_POLICY_ALLOWLIST = 3;
    public static final android.os.Parcelable.Creator<android.app.admin.PackagePolicy> CREATOR = null;
    public PackagePolicy(int p0) {}
    public PackagePolicy(int p0, java.util.Set<java.lang.String> p1) {}
    public int getPolicyType() { return 0; }
    public java.util.Set<java.lang.String> getPackageNames() { return null; }
    public boolean isPackageAllowed(java.lang.String p0, java.util.Set<java.lang.String> p1) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PackagePolicyType {
    }
}
