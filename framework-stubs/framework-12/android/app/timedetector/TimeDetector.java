package android.app.timedetector;

public interface TimeDetector {
    public static final java.lang.String SHELL_COMMAND_SERVICE_NAME = "time_detector";
    public static final java.lang.String SHELL_COMMAND_IS_AUTO_DETECTION_ENABLED = "is_auto_detection_enabled";
    public static android.app.timedetector.ManualTimeSuggestion createManualTimeSuggestion(long p0, java.lang.String p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.SUGGEST_TELEPHONY_TIME_AND_ZONE")
    public void suggestTelephonyTime(android.app.timedetector.TelephonyTimeSuggestion p0);
    @android.annotation.RequiresPermission("android.permission.SUGGEST_MANUAL_TIME_AND_ZONE")
    public boolean suggestManualTime(android.app.timedetector.ManualTimeSuggestion p0);
    @android.annotation.RequiresPermission("android.permission.SET_TIME")
    public void suggestNetworkTime(android.app.timedetector.NetworkTimeSuggestion p0);
    @android.annotation.RequiresPermission("android.permission.SET_TIME")
    public void suggestGnssTime(android.app.timedetector.GnssTimeSuggestion p0);
}
