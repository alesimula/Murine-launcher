package android.service.notification;

public class ScheduleCalendar {
    public static final java.lang.String TAG = "ScheduleCalendar";
    public static final boolean DEBUG = Boolean.valueOf(false);
    private final android.util.ArraySet<java.lang.Integer> mDays = null;
    private final java.util.Calendar mCalendar = null;
    private android.service.notification.ZenModeConfig.ScheduleInfo mSchedule;
    public ScheduleCalendar() {}
    public java.lang.String toString() { return null; }
    public boolean exitAtAlarm() { return false; }
    public void setSchedule(android.service.notification.ZenModeConfig.ScheduleInfo p0) {}
    public void maybeSetNextAlarm(long p0, long p1) {}
    public void setTimeZone(java.util.TimeZone p0) {}
    public long getNextChangeTime(long p0) { return 0L; }
    private long getNextTime(long p0, int p1, int p2) { return 0L; }
    private long getTime(long p0, int p1, int p2) { return 0L; }
    public boolean isInSchedule(long p0) { return false; }
    public boolean isAlarmInSchedule(long p0, long p1) { return false; }
    public boolean shouldExitForAlarm(long p0) { return false; }
    private boolean isInSchedule(int p0, long p1, long p2, long p3) { return false; }
    private int getDayOfWeek(long p0) { return 0; }
    private void updateDays() {}
    private long addDays(long p0, int p1) { return 0L; }
}
