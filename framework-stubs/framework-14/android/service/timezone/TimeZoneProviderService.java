package android.service.timezone;

@android.annotation.SystemApi
public abstract class TimeZoneProviderService extends android.app.Service {
    public static final java.lang.String TEST_COMMAND_RESULT_SUCCESS_KEY = "SUCCESS";
    public static final java.lang.String TEST_COMMAND_RESULT_ERROR_KEY = "ERROR";
    public static final java.lang.String PRIMARY_LOCATION_TIME_ZONE_PROVIDER_SERVICE_INTERFACE = "android.service.timezone.PrimaryLocationTimeZoneProviderService";
    public static final java.lang.String SECONDARY_LOCATION_TIME_ZONE_PROVIDER_SERVICE_INTERFACE = "android.service.timezone.SecondaryLocationTimeZoneProviderService";
    public TimeZoneProviderService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public final void reportSuggestion(android.service.timezone.TimeZoneProviderSuggestion p0) {}
    public final void reportSuggestion(android.service.timezone.TimeZoneProviderSuggestion p0, android.service.timezone.TimeZoneProviderStatus p1) {}
    public final void reportUncertain() {}
    public final void reportUncertain(android.service.timezone.TimeZoneProviderStatus p0) {}
    public final void reportPermanentFailure(java.lang.Throwable p0) {}
    public abstract void onStartUpdates(long p0);
    public abstract void onStopUpdates();
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    private class TimeZoneProviderServiceWrapper extends android.service.timezone.ITimeZoneProvider.Stub {
        public void startUpdates(android.service.timezone.ITimeZoneProviderManager p0, long p1, long p2) {}
        public void stopUpdates() {}
    }
}
