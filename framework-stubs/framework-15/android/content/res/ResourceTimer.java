package android.content.res;

public final class ResourceTimer {
    public static void start() {}
    public static void dumpTimers(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) {}

    private static class Config {
        int maxTimer;
        int maxBuckets;
        int maxLargest;
        java.lang.String[] timers;
    }

    private static class Timer {
        int count;
        long total;
        int mintime;
        int maxtime;
        int[] largest;
        int[] percentile;
        public java.lang.String toString() { return null; }
    }
}
