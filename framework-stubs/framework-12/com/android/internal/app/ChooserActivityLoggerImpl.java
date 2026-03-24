package com.android.internal.app;

public class ChooserActivityLoggerImpl implements com.android.internal.app.ChooserActivityLogger {
    private static final int SHARESHEET_INSTANCE_ID_MAX = 8192;
    private com.android.internal.logging.UiEventLogger mUiEventLogger;
    private com.android.internal.logging.InstanceId mInstanceId;
    private static com.android.internal.logging.InstanceIdSequence sInstanceIdSequence;
    public ChooserActivityLoggerImpl() {}
    public void logShareStarted(int p0, java.lang.String p1, java.lang.String p2, int p3, int p4, boolean p5, int p6, java.lang.String p7) {}
    public void logShareTargetSelected(int p0, java.lang.String p1, int p2) {}
    public void log(com.android.internal.logging.UiEventLogger.UiEventEnum p0, com.android.internal.logging.InstanceId p1) {}
    public com.android.internal.logging.InstanceId getInstanceId() { return null; }
}
