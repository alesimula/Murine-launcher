package com.android.internal.logging;

public interface UiEventLogger {
    public void log(com.android.internal.logging.UiEventLogger.UiEventEnum p0);
    public void log(com.android.internal.logging.UiEventLogger.UiEventEnum p0, com.android.internal.logging.InstanceId p1);
    public void log(com.android.internal.logging.UiEventLogger.UiEventEnum p0, int p1, java.lang.String p2);
    public void logWithInstanceId(com.android.internal.logging.UiEventLogger.UiEventEnum p0, int p1, java.lang.String p2, com.android.internal.logging.InstanceId p3);
    public void logWithPosition(com.android.internal.logging.UiEventLogger.UiEventEnum p0, int p1, java.lang.String p2, int p3);
    public void logWithInstanceIdAndPosition(com.android.internal.logging.UiEventLogger.UiEventEnum p0, int p1, java.lang.String p2, com.android.internal.logging.InstanceId p3, int p4);

    public static interface UiEventEnum {
        public static final int RESERVE_NEW_UI_EVENT_ID = -2147483648;
        public int getId();
    }
}
