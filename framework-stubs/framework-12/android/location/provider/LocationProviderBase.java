package android.location.provider;

@android.annotation.SystemApi
public abstract class LocationProviderBase {
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String ACTION_NETWORK_PROVIDER = "com.android.location.service.v3.NetworkLocationProvider";
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String ACTION_FUSED_PROVIDER = "com.android.location.service.FusedLocationProvider";
    final java.lang.String mTag = null;
    final java.lang.String mAttributionTag = null;
    final android.os.IBinder mBinder = null;
    volatile android.location.provider.ILocationProviderManager mManager;
    volatile android.location.provider.ProviderProperties mProperties;
    volatile boolean mAllowed;
    public LocationProviderBase(android.content.Context p0, java.lang.String p1, android.location.provider.ProviderProperties p2) {}
    public final android.os.IBinder getBinder() { return null; }
    public void setAllowed(boolean p0) {}
    public boolean isAllowed() { return false; }
    public void setProperties(android.location.provider.ProviderProperties p0) {}
    public android.location.provider.ProviderProperties getProperties() { return null; }
    public void reportLocation(android.location.Location p0) {}
    public void reportLocations(java.util.List<android.location.Location> p0) {}
    public abstract void onSetRequest(android.location.provider.ProviderRequest p0);
    public abstract void onFlush(android.location.provider.LocationProviderBase.OnFlushCompleteCallback p0);
    public abstract void onSendExtraCommand(java.lang.String p0, android.os.Bundle p1);
    private static android.location.Location stripExtras(android.location.Location p0) { return null; }
    private static java.util.List<android.location.Location> stripExtras(java.util.List<android.location.Location> p0) { return null; }

    public static interface OnFlushCompleteCallback {
        public void onFlushComplete();
    }

    private final class Service extends android.location.provider.ILocationProvider.Stub {
        Service(android.location.provider.LocationProviderBase p0) { super(); }
        public void setLocationProviderManager(android.location.provider.ILocationProviderManager p0) {}
        public void setRequest(android.location.provider.ProviderRequest p0) {}
        public void flush() {}
        private void onFlushComplete() {}
        public void sendExtraCommand(java.lang.String p0, android.os.Bundle p1) {}
    }
}
