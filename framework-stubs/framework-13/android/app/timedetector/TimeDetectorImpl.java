package android.app.timedetector;

public final class TimeDetectorImpl implements android.app.timedetector.TimeDetector {
    public TimeDetectorImpl() throws android.os.ServiceManager.ServiceNotFoundException {}
    public void suggestTelephonyTime(android.app.timedetector.TelephonyTimeSuggestion p0) {}
    public boolean suggestManualTime(android.app.timedetector.ManualTimeSuggestion p0) { return false; }
    public void suggestNetworkTime(android.app.timedetector.NetworkTimeSuggestion p0) {}
    public void suggestGnssTime(android.app.timedetector.GnssTimeSuggestion p0) {}
}
