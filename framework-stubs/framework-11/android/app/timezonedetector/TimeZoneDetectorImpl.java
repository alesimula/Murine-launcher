package android.app.timezonedetector;

public final class TimeZoneDetectorImpl implements android.app.timezonedetector.TimeZoneDetector {
    private static final java.lang.String TAG = "timezonedetector.TimeZoneDetector";
    private static final boolean DEBUG = false;
    private final android.app.timezonedetector.ITimeZoneDetectorService mITimeZoneDetectorService = null;
    public TimeZoneDetectorImpl() throws android.os.ServiceManager.ServiceNotFoundException {}
    public void suggestManualTimeZone(android.app.timezonedetector.ManualTimeZoneSuggestion p0) {}
    public void suggestTelephonyTimeZone(android.app.timezonedetector.TelephonyTimeZoneSuggestion p0) {}
}
