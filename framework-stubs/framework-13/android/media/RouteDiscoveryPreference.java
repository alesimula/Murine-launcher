package android.media;

public final class RouteDiscoveryPreference implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.RouteDiscoveryPreference> CREATOR = null;
    @android.annotation.SystemApi
    public static final android.media.RouteDiscoveryPreference EMPTY = null;
    RouteDiscoveryPreference(android.media.RouteDiscoveryPreference.Builder p0) {}
    RouteDiscoveryPreference(android.os.Parcel p0) {}
    public java.util.List<java.lang.String> getPreferredFeatures() { return null; }
    public java.util.List<java.lang.String> getDeduplicationPackageOrder() { return null; }
    public java.util.List<java.lang.String> getAllowedPackages() { return null; }
    public boolean shouldPerformActiveScan() { return false; }
    public boolean shouldRemoveDuplicates() { return false; }
    public android.os.Bundle getExtras() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        java.util.List<java.lang.String> mPreferredFeatures;
        java.util.List<java.lang.String> mPackageOrder;
        java.util.List<java.lang.String> mAllowedPackages;
        boolean mActiveScan;
        android.os.Bundle mExtras;
        public Builder(java.util.List<java.lang.String> p0, boolean p1) {}
        public Builder(android.media.RouteDiscoveryPreference p0) {}
        public Builder(java.util.Collection<android.media.RouteDiscoveryPreference> p0) {}
        public android.media.RouteDiscoveryPreference.Builder setPreferredFeatures(java.util.List<java.lang.String> p0) { return null; }
        public android.media.RouteDiscoveryPreference.Builder setAllowedPackages(java.util.List<java.lang.String> p0) { return null; }
        public android.media.RouteDiscoveryPreference.Builder setShouldPerformActiveScan(boolean p0) { return null; }
        public android.media.RouteDiscoveryPreference.Builder setDeduplicationPackageOrder(java.util.List<java.lang.String> p0) { return null; }
        public android.media.RouteDiscoveryPreference.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.media.RouteDiscoveryPreference build() { return null; }
    }
}
