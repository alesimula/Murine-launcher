package android.os;

public abstract class SimpleClock extends java.time.Clock {
    private final java.time.ZoneId zone = null;
    public SimpleClock(java.time.ZoneId p0) { super(); }
    public java.time.ZoneId getZone() { return null; }
    public java.time.Clock withZone(java.time.ZoneId p0) { return null; }
    public abstract long millis();
    public java.time.Instant instant() { return null; }
}
