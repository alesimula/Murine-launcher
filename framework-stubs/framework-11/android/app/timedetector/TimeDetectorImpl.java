package android.app.timedetector;

public final class TimeDetectorImpl implements android.app.timedetector.TimeDetector {
    private static final java.lang.String TAG = "timedetector.TimeDetector";
    private static final boolean DEBUG = false;
    private final android.app.timedetector.ITimeDetectorService mITimeDetectorService = null;
    public TimeDetectorImpl() throws android.os.ServiceManager.ServiceNotFoundException {}
    public void suggestTelephonyTime(android.app.timedetector.TelephonyTimeSuggestion p0) {}
    public void suggestManualTime(android.app.timedetector.ManualTimeSuggestion p0) {}
    public void suggestNetworkTime(android.app.timedetector.NetworkTimeSuggestion p0) {}
}
