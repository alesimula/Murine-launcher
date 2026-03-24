package android.media;

public final class AudioTimestamp {
    public static final int TIMEBASE_MONOTONIC = 0;
    public static final int TIMEBASE_BOOTTIME = 1;
    public long framePosition;
    public long nanoTime;
    public AudioTimestamp() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Timebase {
    }
}
