package android.location.provider;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public abstract class GnssAssistanceProviderBase {
    public static final java.lang.String ACTION_GNSS_ASSISTANCE_PROVIDER = "android.location.provider.action.GNSS_ASSISTANCE_PROVIDER";
    final java.lang.String mTag = null;
    @android.annotation.Nullable
    final java.lang.String mAttributionTag = null;
    final android.os.IBinder mBinder = null;
    public GnssAssistanceProviderBase(android.content.Context p0, java.lang.String p1) {}
    @android.annotation.NonNull
    public final android.os.IBinder getBinder() { return null; }
    public abstract void onRequest(android.os.OutcomeReceiver<android.location.GnssAssistance, java.lang.Throwable> p0);

    private class Service extends android.location.provider.IGnssAssistanceProvider.Stub {
        public void request(android.location.provider.IGnssAssistanceCallback p0) {}
    }

    private static class SingleUseCallback implements android.os.OutcomeReceiver<android.location.GnssAssistance, java.lang.Throwable> {
        SingleUseCallback(android.location.provider.IGnssAssistanceCallback p0) {}
        public void onError(java.lang.Throwable p0) {}
        public void onResult(android.location.GnssAssistance p0) {}
    }
}
