package android.service.notification;

public class ScheduleCalendar {
    public static final java.lang.String TAG = "ScheduleCalendar";
    public static final boolean DEBUG = Boolean.valueOf(false);
    public ScheduleCalendar() {}
    public java.lang.String toString() { return null; }
    public boolean exitAtAlarm() { return false; }
    public void setSchedule(android.service.notification.ZenModeConfig.ScheduleInfo p0) {}
    public void maybeSetNextAlarm(long p0, long p1) {}
    public void setTimeZone(java.util.TimeZone p0) {}
    public long getNextChangeTime(long p0) { return 0L; }
    public boolean isInSchedule(long p0) { return false; }
    public boolean isAlarmInSchedule(long p0, long p1) { return false; }
    public boolean shouldExitForAlarm(long p0) { return false; }
    public long getClosestActualTime(long p0, int p1, int p2) { return 0L; }
}
