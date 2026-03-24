package android.app;

public class AlarmManager {
    public static final int RTC_WAKEUP = 0;
    public static final int RTC = 1;
    public static final int ELAPSED_REALTIME_WAKEUP = 2;
    public static final int ELAPSED_REALTIME = 3;
    public static final java.lang.String ACTION_NEXT_ALARM_CLOCK_CHANGED = "android.app.action.NEXT_ALARM_CLOCK_CHANGED";
    public static final java.lang.String ACTION_SCHEDULE_EXACT_ALARM_PERMISSION_STATE_CHANGED = "android.app.action.SCHEDULE_EXACT_ALARM_PERMISSION_STATE_CHANGED";
    public static final long WINDOW_EXACT = 0L;
    public static final long WINDOW_HEURISTIC = -1L;
    public static final int FLAG_STANDALONE = 1;
    public static final int FLAG_WAKE_FROM_IDLE = 2;
    public static final int FLAG_ALLOW_WHILE_IDLE = 4;
    public static final int FLAG_ALLOW_WHILE_IDLE_UNRESTRICTED = 8;
    public static final int FLAG_IDLE_UNTIL = 16;
    public static final int FLAG_ALLOW_WHILE_IDLE_COMPAT = 32;
    public static final int FLAG_PRIORITIZE = 64;
    public static final long REQUIRE_EXACT_ALARM_PERMISSION = 171306433L;
    public static final long ENFORCE_MINIMUM_WINDOW_ON_INEXACT_ALARMS = 185199076L;
    public static final long ENABLE_USE_EXACT_ALARM = 218533173L;
    public static final long SCHEDULE_EXACT_ALARM_DENIED_BY_DEFAULT = 226439802L;
    public static final long INTERVAL_FIFTEEN_MINUTES = 900000L;
    public static final long INTERVAL_HALF_HOUR = 1800000L;
    public static final long INTERVAL_HOUR = 3600000L;
    public static final long INTERVAL_HALF_DAY = 43200000L;
    public static final long INTERVAL_DAY = 86400000L;
    AlarmManager(android.app.IAlarmManager p0, android.content.Context p1) {}
    public void set(int p0, long p1, android.app.PendingIntent p2) {}
    public void set(int p0, long p1, java.lang.String p2, android.app.AlarmManager.OnAlarmListener p3, android.os.Handler p4) {}
    public void setRepeating(int p0, long p1, long p2, android.app.PendingIntent p3) {}
    public void setWindow(int p0, long p1, long p2, android.app.PendingIntent p3) {}
    public void setWindow(int p0, long p1, long p2, java.lang.String p3, android.app.AlarmManager.OnAlarmListener p4, android.os.Handler p5) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SCHEDULE_PRIORITIZED_ALARM")
    public void setPrioritized(int p0, long p1, long p2, java.lang.String p3, java.util.concurrent.Executor p4, android.app.AlarmManager.OnAlarmListener p5) {}
    @android.annotation.RequiresPermission(value="android.permission.SCHEDULE_EXACT_ALARM", conditional=true)
    public void setExact(int p0, long p1, android.app.PendingIntent p2) {}
    @android.annotation.RequiresPermission(value="android.permission.SCHEDULE_EXACT_ALARM", conditional=true)
    public void setExact(int p0, long p1, java.lang.String p2, android.app.AlarmManager.OnAlarmListener p3, android.os.Handler p4) {}
    public void setIdleUntil(int p0, long p1, java.lang.String p2, android.app.AlarmManager.OnAlarmListener p3, android.os.Handler p4) {}
    @android.annotation.RequiresPermission("android.permission.SCHEDULE_EXACT_ALARM")
    public void setAlarmClock(android.app.AlarmManager.AlarmClockInfo p0, android.app.PendingIntent p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public void set(int p0, long p1, long p2, long p3, android.app.PendingIntent p4, android.os.WorkSource p5) {}
    public void set(int p0, long p1, long p2, long p3, java.lang.String p4, android.app.AlarmManager.OnAlarmListener p5, android.os.Handler p6, android.os.WorkSource p7) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public void set(int p0, long p1, long p2, long p3, android.app.AlarmManager.OnAlarmListener p4, android.os.Handler p5, android.os.WorkSource p6) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.UPDATE_DEVICE_STATS", "android.permission.SCHEDULE_EXACT_ALARM"}, conditional=true)
    public void setExact(int p0, long p1, java.lang.String p2, java.util.concurrent.Executor p3, android.os.WorkSource p4, android.app.AlarmManager.OnAlarmListener p5) {}
    public void setInexactRepeating(int p0, long p1, long p2, android.app.PendingIntent p3) {}
    public void setAndAllowWhileIdle(int p0, long p1, android.app.PendingIntent p2) {}
    @android.annotation.RequiresPermission(value="android.permission.SCHEDULE_EXACT_ALARM", conditional=true)
    public void setExactAndAllowWhileIdle(int p0, long p1, android.app.PendingIntent p2) {}
    public void cancel(android.app.PendingIntent p0) {}
    public void cancel(android.app.AlarmManager.OnAlarmListener p0) {}
    @android.annotation.RequiresPermission("android.permission.SET_TIME")
    public void setTime(long p0) {}
    @android.annotation.RequiresPermission("android.permission.SET_TIME_ZONE")
    public void setTimeZone(java.lang.String p0) {}
    public long getNextWakeFromIdleTime() { return 0L; }
    public boolean canScheduleExactAlarms() { return false; }
    public boolean hasScheduleExactAlarm(java.lang.String p0, int p1) { return false; }
    public android.app.AlarmManager.AlarmClockInfo getNextAlarmClock() { return null; }
    public android.app.AlarmManager.AlarmClockInfo getNextAlarmClock(int p0) { return null; }

    public static final class AlarmClockInfo implements android.os.Parcelable {
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
        java.util.concurrent.Executor mExecutor;
        android.app.IAlarmCompleteListener mCompletion;
        public ListenerWrapper(android.app.AlarmManager p0, android.app.AlarmManager.OnAlarmListener p1) { super(); }
        void setExecutor(java.util.concurrent.Executor p0) {}
        public void cancel() {}
        public void doAlarm(android.app.IAlarmCompleteListener p0) {}
        public void run() {}
    }

    public static interface OnAlarmListener {
        public void onAlarm();
    }
}
