package android.app.timedetector;

public class TimeDetectorHelper {
    public static final android.app.timedetector.TimeDetectorHelper INSTANCE = null;
    protected TimeDetectorHelper() {}
    public int getManualDateSelectionYearMin() { return 0; }
    public int getManualDateSelectionYearMax() { return 0; }
    @android.annotation.NonNull
    public java.time.Instant getManualSuggestionLowerBound() { return null; }
    @android.annotation.NonNull
    public java.time.Instant getAutoSuggestionLowerBoundDefault() { return null; }
    @android.annotation.NonNull
    public java.time.Instant getSuggestionUpperBound() { return null; }
}
