package android.service.timezone;

@android.annotation.SystemApi
public abstract class TimeZoneProviderService extends android.app.Service {
    private static final java.lang.String TAG = "TimeZoneProviderService";
    public static final java.lang.String TEST_COMMAND_RESULT_SUCCESS_KEY = "SUCCESS";
    public static final java.lang.String TEST_COMMAND_RESULT_ERROR_KEY = "ERROR";
    public static final java.lang.String PRIMARY_LOCATION_TIME_ZONE_PROVIDER_SERVICE_INTERFACE = "android.service.timezone.PrimaryLocationTimeZoneProviderService";
    public static final java.lang.String SECONDARY_LOCATION_TIME_ZONE_PROVIDER_SERVICE_INTERFACE = "android.service.timezone.SecondaryLocationTimeZoneProviderService";
    private final android.service.timezone.TimeZoneProviderService.TimeZoneProviderServiceWrapper mWrapper = null;
    private final android.os.Handler mHandler = null;
    private android.service.timezone.ITimeZoneProviderManager mManager;
    public TimeZoneProviderService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public final void reportSuggestion(android.service.timezone.TimeZoneProviderSuggestion p0) {}
    public final void reportUncertain() {}
    public final void reportPermanentFailure(java.lang.Throwable p0) {}
    private void onStartUpdatesInternal(android.service.timezone.ITimeZoneProviderManager p0, long p1) {}
    public abstract void onStartUpdates(long p0);
    private void onStopUpdatesInternal() {}
    public abstract void onStopUpdates();

    private class TimeZoneProviderServiceWrapper extends android.service.timezone.ITimeZoneProvider.Stub {
        private TimeZoneProviderServiceWrapper(android.service.timezone.TimeZoneProviderService p0) { super(); }
        public void startUpdates(android.service.timezone.ITimeZoneProviderManager p0, long p1) {}
        public void stopUpdates() {}
    }
}
