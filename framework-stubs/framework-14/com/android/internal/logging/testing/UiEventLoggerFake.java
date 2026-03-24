package com.android.internal.logging.testing;

public class UiEventLoggerFake implements com.android.internal.logging.UiEventLogger {
    public UiEventLoggerFake() {}
    public java.util.List<com.android.internal.logging.testing.UiEventLoggerFake.FakeUiEvent> getLogs() { return null; }
    public int numLogs() { return 0; }
    public com.android.internal.logging.testing.UiEventLoggerFake.FakeUiEvent get(int p0) { return null; }
    public int eventId(int p0) { return 0; }
    public void log(com.android.internal.logging.UiEventLogger.UiEventEnum p0) {}
    public void log(com.android.internal.logging.UiEventLogger.UiEventEnum p0, com.android.internal.logging.InstanceId p1) {}
    public void log(com.android.internal.logging.UiEventLogger.UiEventEnum p0, int p1, java.lang.String p2) {}
    public void logWithInstanceId(com.android.internal.logging.UiEventLogger.UiEventEnum p0, int p1, java.lang.String p2, com.android.internal.logging.InstanceId p3) {}
    public void logWithPosition(com.android.internal.logging.UiEventLogger.UiEventEnum p0, int p1, java.lang.String p2, int p3) {}
    public void logWithInstanceIdAndPosition(com.android.internal.logging.UiEventLogger.UiEventEnum p0, int p1, java.lang.String p2, com.android.internal.logging.InstanceId p3, int p4) {}

    public static class FakeUiEvent {
        public final int eventId = 0;
        public final int uid = 0;
        public final java.lang.String packageName = null;
        public final com.android.internal.logging.InstanceId instanceId = null;
        public final int position = 0;
        FakeUiEvent(int p0, int p1, java.lang.String p2) {}
        FakeUiEvent(int p0, int p1, java.lang.String p2, com.android.internal.logging.InstanceId p3) {}
        FakeUiEvent(int p0, int p1, java.lang.String p2, com.android.internal.logging.InstanceId p3, int p4) {}
    }
}
