package com.android.internal.app;

public class DumpHeapActivity extends android.app.Activity {
    public static final java.lang.String KEY_PROCESS = "process";
    public static final java.lang.String KEY_SIZE = "size";
    public static final java.lang.String KEY_IS_USER_INITIATED = "is_user_initiated";
    public static final java.lang.String KEY_IS_SYSTEM_PROCESS = "is_system_process";
    public static final java.lang.String KEY_DIRECT_LAUNCH = "direct_launch";
    public static final java.lang.String ACTION_DELETE_DUMPHEAP = "com.android.server.am.DELETE_DUMPHEAP";
    public static final java.lang.String EXTRA_DELAY_DELETE = "delay_delete";
    public static final android.net.Uri JAVA_URI = null;
    java.lang.String mProcess;
    long mSize;
    android.app.AlertDialog mDialog;
    boolean mHandled;
    public DumpHeapActivity() { super(); }
    protected void onCreate(android.os.Bundle p0) {}
    void scheduleDelete() {}
    protected void onStop() {}
    protected void onDestroy() {}
}
