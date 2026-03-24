package android.app.time;

@android.annotation.SystemApi
public final class TimeManager {
    private static final java.lang.String TAG = "time.TimeManager";
    private static final boolean DEBUG = false;
    private final java.lang.Object mLock = null;
    private final android.app.timezonedetector.ITimeZoneDetectorService mITimeZoneDetectorService = null;
    private final android.app.timedetector.ITimeDetectorService mITimeDetectorService = null;
    private android.app.time.ITimeZoneDetectorListener mTimeZoneDetectorReceiver;
    private android.util.ArrayMap<android.app.time.TimeManager.TimeZoneDetectorListener, android.app.time.TimeManager.TimeZoneDetectorListener> mTimeZoneDetectorListeners;
    public TimeManager() throws android.os.ServiceManager.ServiceNotFoundException {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_TIME_AND_ZONE_DETECTION")
    public android.app.time.TimeZoneCapabilitiesAndConfig getTimeZoneCapabilitiesAndConfig() { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_TIME_AND_ZONE_DETECTION")
    public android.app.time.TimeCapabilitiesAndConfig getTimeCapabilitiesAndConfig() { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_TIME_AND_ZONE_DETECTION")
    public boolean updateTimeConfiguration(android.app.time.TimeConfiguration p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_TIME_AND_ZONE_DETECTION")
    public boolean updateTimeZoneConfiguration(android.app.time.TimeZoneConfiguration p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_TIME_AND_ZONE_DETECTION")
    public void addTimeZoneDetectorListener(java.util.concurrent.Executor p0, android.app.time.TimeManager.TimeZoneDetectorListener p1) {}
    private void notifyTimeZoneDetectorListeners() {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_TIME_AND_ZONE_DETECTION")
    public void removeTimeZoneDetectorListener(android.app.time.TimeManager.TimeZoneDetectorListener p0) {}
    @android.annotation.RequiresPermission("android.permission.SUGGEST_EXTERNAL_TIME")
    public void suggestExternalTime(android.app.time.ExternalTimeSuggestion p0) {}

    @java.lang.FunctionalInterface
    public static interface TimeZoneDetectorListener {
        public void onChange();
    }
}
