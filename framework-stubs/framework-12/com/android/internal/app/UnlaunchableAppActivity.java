package com.android.internal.app;

public class UnlaunchableAppActivity extends android.app.Activity implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnClickListener {
    private static final java.lang.String TAG = "UnlaunchableAppActivity";
    private static final int UNLAUNCHABLE_REASON_QUIET_MODE = 1;
    private static final java.lang.String EXTRA_UNLAUNCHABLE_REASON = "unlaunchable_reason";
    private int mUserId;
    private int mReason;
    private android.content.IntentSender mTarget;
    public UnlaunchableAppActivity() { super(); }
    protected void onCreate(android.os.Bundle p0) {}
    public void onDismiss(android.content.DialogInterface p0) {}
    public void onClick(android.content.DialogInterface p0, int p1) {}
    private static final android.content.Intent createBaseIntent() { return null; }
    public static android.content.Intent createInQuietModeDialogIntent(int p0) { return null; }
    public static android.content.Intent createInQuietModeDialogIntent(int p0, android.content.IntentSender p1) { return null; }
}
