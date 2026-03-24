package android.media.metrics;

public abstract class Event {
    final long mTimeSinceCreatedMillis = 0L;
    android.os.Bundle mMetricsBundle;
    Event() {}
    Event(long p0, android.os.Bundle p1) {}
    public long getTimeSinceCreatedMillis() { return 0L; }
    public android.os.Bundle getMetricsBundle() { return null; }
}
