package android.location;

public abstract class LocationManagerInternal {
    public LocationManagerInternal() {}
    public abstract boolean isProviderEnabledForUser(java.lang.String p0, int p1);
    public abstract boolean isProviderPackage(java.lang.String p0);
    public abstract void sendNiResponse(int p0, int p1);
}
