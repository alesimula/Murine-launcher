package com.android.internal.app;

public class SuspendedAppActivity extends com.android.internal.app.AlertActivity implements android.content.DialogInterface.OnClickListener {
    public static final java.lang.String EXTRA_SUSPENDED_PACKAGE = "com.android.internal.app.extra.SUSPENDED_PACKAGE";
    public static final java.lang.String EXTRA_SUSPENDING_PACKAGE = "com.android.internal.app.extra.SUSPENDING_PACKAGE";
    public static final java.lang.String EXTRA_SUSPENDING_USER = "com.android.internal.app.extra.SUSPENDING_USER";
    public static final java.lang.String EXTRA_DIALOG_INFO = "com.android.internal.app.extra.DIALOG_INFO";
    public static final java.lang.String EXTRA_ACTIVITY_OPTIONS = "com.android.internal.app.extra.ACTIVITY_OPTIONS";
    public static final java.lang.String EXTRA_UNSUSPEND_INTENT = "com.android.internal.app.extra.UNSUSPEND_INTENT";
    public SuspendedAppActivity() { super(); }
    public void onCreate(android.os.Bundle p0) {}
    protected void onDestroy() {}
    public void onClick(android.content.DialogInterface p0, int p1) {}
    public static android.content.Intent createSuspendedAppInterceptIntent(java.lang.String p0, android.content.pm.UserPackage p1, android.content.pm.SuspendDialogInfo p2, android.os.Bundle p3, android.content.IntentSender p4, int p5) { return null; }
}
