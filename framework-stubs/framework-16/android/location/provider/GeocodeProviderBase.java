package android.location.provider;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.new_geocoder")
public abstract class GeocodeProviderBase {
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String ACTION_GEOCODE_PROVIDER = "com.android.location.service.GeocodeProvider";
    final java.lang.String mTag = null;
    @android.annotation.Nullable
    final java.lang.String mAttributionTag = null;
    final android.os.IBinder mBinder = null;
    public GeocodeProviderBase(android.content.Context p0, java.lang.String p1) {}
    @android.annotation.NonNull
    public final android.os.IBinder getBinder() { return null; }
    public abstract void onForwardGeocode(android.location.provider.ForwardGeocodeRequest p0, android.os.OutcomeReceiver<java.util.List<android.location.Address>, java.lang.Throwable> p1);
    public abstract void onReverseGeocode(android.location.provider.ReverseGeocodeRequest p0, android.os.OutcomeReceiver<java.util.List<android.location.Address>, java.lang.Throwable> p1);

    private class Service extends android.location.provider.IGeocodeProvider.Stub {
        public void forwardGeocode(android.location.provider.ForwardGeocodeRequest p0, android.location.provider.IGeocodeCallback p1) {}
        public void reverseGeocode(android.location.provider.ReverseGeocodeRequest p0, android.location.provider.IGeocodeCallback p1) {}
    }

    private static class SingleUseCallback implements android.os.OutcomeReceiver<java.util.List<android.location.Address>, java.lang.Throwable> {
        SingleUseCallback(android.location.provider.IGeocodeCallback p0) {}
        public void onError(java.lang.Throwable p0) {}
        public void onResult(java.util.List<android.location.Address> p0) {}
    }
}
