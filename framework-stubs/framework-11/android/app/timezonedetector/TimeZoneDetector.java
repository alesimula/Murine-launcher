package android.app.timezonedetector;

public interface TimeZoneDetector {
    public static android.app.timezonedetector.ManualTimeZoneSuggestion createManualTimeZoneSuggestion(java.lang.String p0, java.lang.String p1) { return null; }
    public void suggestManualTimeZone(android.app.timezonedetector.ManualTimeZoneSuggestion p0);
    public void suggestTelephonyTimeZone(android.app.timezonedetector.TelephonyTimeZoneSuggestion p0);
}
