package android.app.time;

@android.annotation.SystemApi
public final class TimeManager {
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
    @android.annotation.RequiresPermission("android.permission.MANAGE_TIME_AND_ZONE_DETECTION")
    public void removeTimeZoneDetectorListener(android.app.time.TimeManager.TimeZoneDetectorListener p0) {}
    @android.annotation.RequiresPermission("android.permission.SUGGEST_EXTERNAL_TIME")
    public void suggestExternalTime(android.app.time.ExternalTimeSuggestion p0) {}

    @java.lang.FunctionalInterface
    public static interface TimeZoneDetectorListener {
        public void onChange();
    }
}
