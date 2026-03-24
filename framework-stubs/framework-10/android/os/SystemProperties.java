package android.os;

@android.annotation.SystemApi
public class SystemProperties {
    private static final java.lang.String TAG = "SystemProperties";
    private static final boolean TRACK_KEY_ACCESS = false;
    @android.annotation.UnsupportedAppUsage
    public static final int PROP_NAME_MAX = 2147483647;
    public static final int PROP_VALUE_MAX = 91;
    @android.annotation.UnsupportedAppUsage
    private static final java.util.ArrayList<java.lang.Runnable> sChangeCallbacks = null;
    private static final java.util.HashMap<java.lang.String, android.util.MutableInt> sRoReads = null;
    private static void onKeyAccess(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    private static native java.lang.String native_get(java.lang.String p0);
    private static native java.lang.String native_get(java.lang.String p0, java.lang.String p1);
    private static native int native_get_int(java.lang.String p0, int p1);
    @android.annotation.UnsupportedAppUsage
    private static native long native_get_long(java.lang.String p0, long p1);
    private static native boolean native_get_boolean(java.lang.String p0, boolean p1);
    private static native void native_set(java.lang.String p0, java.lang.String p1);
    private static native void native_add_change_callback();
    private static native void native_report_sysprop_change();
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
    @android.annotation.UnsupportedAppUsage
    public static void set(java.lang.String p0, java.lang.String p1) {}
    @android.annotation.UnsupportedAppUsage
    public static void addChangeCallback(java.lang.Runnable p0) {}
    private static void callChangeCallbacks() {}
    @android.annotation.UnsupportedAppUsage
    public static void reportSyspropChanged() {}
    public static java.lang.String digestOf(java.lang.String... p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    private SystemProperties() {}
}
