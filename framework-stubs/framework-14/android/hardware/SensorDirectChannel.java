package android.hardware;

public final class SensorDirectChannel implements java.nio.channels.Channel {
    public static final int TYPE_MEMORY_FILE = 1;
    public static final int TYPE_HARDWARE_BUFFER = 2;
    public static final int RATE_STOP = 0;
    public static final int RATE_NORMAL = 1;
    public static final int RATE_FAST = 2;
    public static final int RATE_VERY_FAST = 3;
    public boolean isOpen() { return false; }
    @java.lang.Deprecated
    public boolean isValid() { return false; }
    public void close() {}
    public int configure(android.hardware.Sensor p0, int p1) { return 0; }
    SensorDirectChannel(android.hardware.SensorManager p0, int p1, int p2, long p3) {}
    int getNativeHandle() { return 0; }
    static long[] encodeData(android.os.MemoryFile p0) { return null; }
    protected void finalize() throws java.lang.Throwable {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MemoryType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RateLevel {
    }
}
