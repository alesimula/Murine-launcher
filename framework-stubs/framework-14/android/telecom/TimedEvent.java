package android.telecom;

public abstract class TimedEvent<T extends java.lang.Object> {
    public TimedEvent() {}
    public abstract long getTime();
    public abstract T getKey();
    public static <T extends java.lang.Object> java.util.Map<T, java.lang.Double> averageTimings(java.util.Collection<? extends android.telecom.TimedEvent<T>> p0) { return null; }
}
