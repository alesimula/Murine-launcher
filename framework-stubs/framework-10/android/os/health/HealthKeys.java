package android.os.health;

public class HealthKeys {
    public static final int UNKNOWN_KEY = 0;
    public static final int BASE_UID = 10000;
    public static final int BASE_PID = 20000;
    public static final int BASE_PROCESS = 30000;
    public static final int BASE_PACKAGE = 40000;
    public static final int BASE_SERVICE = 50000;
    public static final int TYPE_TIMER = 0;
    public static final int TYPE_MEASUREMENT = 1;
    public static final int TYPE_STATS = 2;
    public static final int TYPE_TIMERS = 3;
    public static final int TYPE_MEASUREMENTS = 4;
    public static final int TYPE_COUNT = 5;
    public HealthKeys() {}

    private static class SortedIntArray {
        int mCount;
        int[] mArray;
        SortedIntArray(int p0) {}
        void addValue(int p0) {}
        int[] getArray() { return null; }
    }

    public static class Constants {
        private final java.lang.String mDataType = null;
        private final int[][] mKeys = null;
        public Constants(java.lang.Class p0) {}
        public java.lang.String getDataType() { return null; }
        public int getSize(int p0) { return 0; }
        public int getIndex(int p0, int p1) { return 0; }
        public int[] getKeys(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
    public static @interface Constant {
        public int type();
    }
}
