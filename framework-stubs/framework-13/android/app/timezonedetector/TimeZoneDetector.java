package android.app.timezonedetector;

public interface TimeZoneDetector {
    public static final java.lang.String SHELL_COMMAND_SERVICE_NAME = "time_zone_detector";
    public static final java.lang.String SHELL_COMMAND_IS_AUTO_DETECTION_ENABLED = "is_auto_detection_enabled";
    public static final java.lang.String SHELL_COMMAND_SET_AUTO_DETECTION_ENABLED = "set_auto_detection_enabled";
    public static final java.lang.String SHELL_COMMAND_IS_TELEPHONY_DETECTION_SUPPORTED = "is_telephony_detection_supported";
    public static final java.lang.String SHELL_COMMAND_IS_GEO_DETECTION_SUPPORTED = "is_geo_detection_supported";
    public static final java.lang.String SHELL_COMMAND_IS_GEO_DETECTION_ENABLED = "is_geo_detection_enabled";
    public static final java.lang.String SHELL_COMMAND_SET_GEO_DETECTION_ENABLED = "set_geo_detection_enabled";
    public static final java.lang.String SHELL_COMMAND_SUGGEST_GEO_LOCATION_TIME_ZONE = "suggest_geo_location_time_zone";
    public static final java.lang.String SHELL_COMMAND_SUGGEST_MANUAL_TIME_ZONE = "suggest_manual_time_zone";
    public static final java.lang.String SHELL_COMMAND_SUGGEST_TELEPHONY_TIME_ZONE = "suggest_telephony_time_zone";
    public static final java.lang.String SHELL_COMMAND_ENABLE_TELEPHONY_FALLBACK = "enable_telephony_fallback";
    public static final java.lang.String SHELL_COMMAND_DUMP_METRICS = "dump_metrics";
    public static android.app.timezonedetector.ManualTimeZoneSuggestion createManualTimeZoneSuggestion(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.SUGGEST_MANUAL_TIME_AND_ZONE")
    public boolean suggestManualTimeZone(android.app.timezonedetector.ManualTimeZoneSuggestion p0);
    @android.annotation.RequiresPermission("android.permission.SUGGEST_TELEPHONY_TIME_AND_ZONE")
    public void suggestTelephonyTimeZone(android.app.timezonedetector.TelephonyTimeZoneSuggestion p0);
}
