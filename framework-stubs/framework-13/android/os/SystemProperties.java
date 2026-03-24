package android.os;

@android.annotation.SystemApi
public class SystemProperties {
    public static final int PROP_NAME_MAX = 2147483647;
    public static final int PROP_VALUE_MAX = 91;
    @android.annotation.SystemApi
    public static java.lang.String get(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public static java.lang.String get(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.SystemApi
    public static int getInt(java.lang.String p0, int p1) { return 0; }
    @android.annotation.SystemApi
    public static long getLong(java.lang.String p0, long p1) { return 0L; }
    @android.annotation.SystemApi
    public static boolean getBoolean(java.lang.String p0, boolean p1) { return false; }
    public static void set(java.lang.String p0, java.lang.String p1) {}
    public static void addChangeCallback(java.lang.Runnable p0) {}
    public static void removeChangeCallback(java.lang.Runnable p0) {}
    public static void reportSyspropChanged() {}
    public static java.lang.String digestOf(java.lang.String... p0) { return null; }
    public static android.os.SystemProperties.Handle find(java.lang.String p0) { return null; }

    public static final class Handle {
        public java.lang.String get() { return null; }
        public int getInt(int p0) { return 0; }
        public long getLong(long p0) { return 0L; }
        public boolean getBoolean(boolean p0) { return false; }
    }
}
