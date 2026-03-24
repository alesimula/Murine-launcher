package android.app;

public class AlarmManager {
    private static final java.lang.String TAG = "AlarmManager";
    public static final int RTC_WAKEUP = 0;
    public static final int RTC = 1;
    public static final int ELAPSED_REALTIME_WAKEUP = 2;
    public static final int ELAPSED_REALTIME = 3;
    public static final java.lang.String ACTION_NEXT_ALARM_CLOCK_CHANGED = "android.app.action.NEXT_ALARM_CLOCK_CHANGED";
    public static final long WINDOW_EXACT = 0L;
    public static final long WINDOW_HEURISTIC = -1L;
    public static final int FLAG_STANDALONE = 1;
    public static final int FLAG_WAKE_FROM_IDLE = 2;
    public static final int FLAG_ALLOW_WHILE_IDLE = 4;
    public static final int FLAG_ALLOW_WHILE_IDLE_UNRESTRICTED = 8;
    public static final int FLAG_IDLE_UNTIL = 16;
    private final android.app.IAlarmManager mService = null;
    private final android.content.Context mContext = null;
    private final java.lang.String mPackageName = null;
    private final boolean mAlwaysExact = false;
    private final int mTargetSdkVersion = 0;
    private final android.os.Handler mMainThreadHandler = null;
    private static java.util.WeakHashMap<android.app.AlarmManager.OnAlarmListener, java.lang.ref.WeakReference<android.app.AlarmManager.ListenerWrapper>> sWrappers;
    public static final long INTERVAL_FIFTEEN_MINUTES = 900000L;
    public static final long INTERVAL_HALF_HOUR = 1800000L;
    public static final long INTERVAL_HOUR = 3600000L;
    public static final long INTERVAL_HALF_DAY = 43200000L;
    public static final long INTERVAL_DAY = 86400000L;
    AlarmManager(android.app.IAlarmManager p0, android.content.Context p1) {}
    private long legacyExactLength() { return 0L; }
    public void set(int p0, long p1, android.app.PendingIntent p2) {}
    public void set(int p0, long p1, java.lang.String p2, android.app.AlarmManager.OnAlarmListener p3, android.os.Handler p4) {}
    public void setRepeating(int p0, long p1, long p2, android.app.PendingIntent p3) {}
    public void setWindow(int p0, long p1, long p2, android.app.PendingIntent p3) {}
    public void setWindow(int p0, long p1, long p2, java.lang.String p3, android.app.AlarmManager.OnAlarmListener p4, android.os.Handler p5) {}
    public void setExact(int p0, long p1, android.app.PendingIntent p2) {}
    public void setExact(int p0, long p1, java.lang.String p2, android.app.AlarmManager.OnAlarmListener p3, android.os.Handler p4) {}
    public void setIdleUntil(int p0, long p1, java.lang.String p2, android.app.AlarmManager.OnAlarmListener p3, android.os.Handler p4) {}
    public void setAlarmClock(android.app.AlarmManager.AlarmClockInfo p0, android.app.PendingIntent p1) {}
    @android.annotation.SystemApi
    public void set(int p0, long p1, long p2, long p3, android.app.PendingIntent p4, android.os.WorkSource p5) {}
    public void set(int p0, long p1, long p2, long p3, java.lang.String p4, android.app.AlarmManager.OnAlarmListener p5, android.os.Handler p6, android.os.WorkSource p7) {}
    @android.annotation.SystemApi
    public void set(int p0, long p1, long p2, long p3, android.app.AlarmManager.OnAlarmListener p4, android.os.Handler p5, android.os.WorkSource p6) {}
    private void setImpl(int p0, long p1, long p2, long p3, int p4, android.app.PendingIntent p5, android.app.AlarmManager.OnAlarmListener p6, java.lang.String p7, android.os.Handler p8, android.os.WorkSource p9, android.app.AlarmManager.AlarmClockInfo p10) {}
    public void setInexactRepeating(int p0, long p1, long p2, android.app.PendingIntent p3) {}
    public void setAndAllowWhileIdle(int p0, long p1, android.app.PendingIntent p2) {}
    public void setExactAndAllowWhileIdle(int p0, long p1, android.app.PendingIntent p2) {}
    public void cancel(android.app.PendingIntent p0) {}
    public void cancel(android.app.AlarmManager.OnAlarmListener p0) {}
    public void setTime(long p0) {}
    public void setTimeZone(java.lang.String p0) {}
    public long getNextWakeFromIdleTime() { return 0L; }
    public android.app.AlarmManager.AlarmClockInfo getNextAlarmClock() { return null; }
    public android.app.AlarmManager.AlarmClockInfo getNextAlarmClock(int p0) { return null; }

    public static final class AlarmClockInfo implements android.os.Parcelable {
        private final long mTriggerTime = 0L;
        private final android.app.PendingIntent mShowIntent = null;
        public static final android.os.Parcelable.Creator<android.app.AlarmManager.AlarmClockInfo> CREATOR = null;
        public AlarmClockInfo(long p0, android.app.PendingIntent p1) {}
        AlarmClockInfo(android.os.Parcel p0) {}
        public long getTriggerTime() { return 0L; }
        public android.app.PendingIntent getShowIntent() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AlarmType {
    }

    final class ListenerWrapper extends android.app.IAlarmListener.Stub implements java.lang.Runnable {
        final android.app.AlarmManager.OnAlarmListener mListener = null;
        android.os.Handler mHandler;
        android.app.IAlarmCompleteListener mCompletion;
        public ListenerWrapper(android.app.AlarmManager p0, android.app.AlarmManager.OnAlarmListener p1) { super(); }
        public void setHandler(android.os.Handler p0) {}
        public void cancel() {}
        public void doAlarm(android.app.IAlarmCompleteListener p0) {}
        public void run() {}
    }

    public static interface OnAlarmListener {
        public void onAlarm();
    }
}
