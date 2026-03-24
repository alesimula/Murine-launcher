package com.android.internal.util;

public class WakeupMessage implements android.app.AlarmManager.OnAlarmListener {
    private final android.app.AlarmManager mAlarmManager = null;
    protected final android.os.Handler mHandler = null;
    protected final java.lang.String mCmdName = null;
    protected final int mCmd = 0;
    protected final int mArg1 = 0;
    protected final int mArg2 = 0;
    protected final java.lang.Object mObj = null;
    private final java.lang.Runnable mRunnable = null;
    private boolean mScheduled;
    public WakeupMessage(android.content.Context p0, android.os.Handler p1, java.lang.String p2, int p3, int p4, int p5, java.lang.Object p6) {}
    public WakeupMessage(android.content.Context p0, android.os.Handler p1, java.lang.String p2, int p3, int p4) {}
    public WakeupMessage(android.content.Context p0, android.os.Handler p1, java.lang.String p2, int p3, int p4, int p5) {}
    public WakeupMessage(android.content.Context p0, android.os.Handler p1, java.lang.String p2, int p3) {}
    public WakeupMessage(android.content.Context p0, android.os.Handler p1, java.lang.String p2, java.lang.Runnable p3) {}
    private static android.app.AlarmManager getAlarmManager(android.content.Context p0) { return null; }
    public synchronized void schedule(long p0) {}
    public synchronized void cancel() {}
    public void onAlarm() {}
}
