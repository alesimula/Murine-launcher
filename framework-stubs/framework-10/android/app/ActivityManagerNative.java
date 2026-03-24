package android.app;

@java.lang.Deprecated
public abstract class ActivityManagerNative {
    public ActivityManagerNative() {}
    @android.annotation.UnsupportedAppUsage
    public static android.app.IActivityManager asInterface(android.os.IBinder p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static android.app.IActivityManager getDefault() { return null; }
    @android.annotation.UnsupportedAppUsage
    public static boolean isSystemReady() { return false; }
    @android.annotation.UnsupportedAppUsage
    public static void broadcastStickyIntent(android.content.Intent p0, java.lang.String p1, int p2) {}
    public static void broadcastStickyIntent(android.content.Intent p0, java.lang.String p1, int p2, int p3) {}
    public static void noteWakeupAlarm(android.app.PendingIntent p0, int p1, java.lang.String p2, java.lang.String p3) {}
    public static void noteAlarmStart(android.app.PendingIntent p0, int p1, java.lang.String p2) {}
    public static void noteAlarmFinish(android.app.PendingIntent p0, int p1, java.lang.String p2) {}
}
