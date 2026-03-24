package android.location;

public abstract class LocationManagerInternal {
    public LocationManagerInternal() {}
    public abstract boolean isProviderEnabledForUser(java.lang.String p0, int p1);
    public abstract void addProviderEnabledListener(java.lang.String p0, android.location.LocationManagerInternal.ProviderEnabledListener p1);
    public abstract void removeProviderEnabledListener(java.lang.String p0, android.location.LocationManagerInternal.ProviderEnabledListener p1);
    public abstract boolean isProvider(java.lang.String p0, android.location.util.identity.CallerIdentity p1);
    @android.annotation.Nullable
    public abstract android.location.LocationTime getGnssTimeMillis();
    public abstract void setLocationPackageTagsListener(android.location.LocationManagerInternal.LocationPackageTagsListener p0);

    public static interface LocationPackageTagsListener {
        public void onLocationPackageTagsChanged(int p0, android.os.PackageTagsList p1);
    }

    public static interface ProviderEnabledListener {
        public void onProviderEnabledChanged(java.lang.String p0, int p1, boolean p2);
    }
}
