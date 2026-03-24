package android.app.timedetector;

public interface TimeDetector {
    public static android.app.timedetector.ManualTimeSuggestion createManualTimeSuggestion(long p0, java.lang.String p1) { return null; }
    public void suggestTelephonyTime(android.app.timedetector.TelephonyTimeSuggestion p0);
    public void suggestManualTime(android.app.timedetector.ManualTimeSuggestion p0);
    public void suggestNetworkTime(android.app.timedetector.NetworkTimeSuggestion p0);
}
