package com.android.internal.app;

public class SuspendedAppActivity extends com.android.internal.app.AlertActivity implements android.content.DialogInterface.OnClickListener {
    private static final java.lang.String TAG = null;
    private static final java.lang.String PACKAGE_NAME = "com.android.internal.app";
    public static final java.lang.String EXTRA_SUSPENDED_PACKAGE = "com.android.internal.app.extra.SUSPENDED_PACKAGE";
    public static final java.lang.String EXTRA_SUSPENDING_PACKAGE = "com.android.internal.app.extra.SUSPENDING_PACKAGE";
    public static final java.lang.String EXTRA_DIALOG_INFO = "com.android.internal.app.extra.DIALOG_INFO";
    private android.content.Intent mMoreDetailsIntent;
    private int mUserId;
    private android.content.pm.PackageManager mPm;
    private android.content.res.Resources mSuspendingAppResources;
    private android.content.pm.SuspendDialogInfo mSuppliedDialogInfo;
    public SuspendedAppActivity() { super(); }
    private java.lang.CharSequence getAppLabel(java.lang.String p0) { return null; }
    private android.content.Intent getMoreDetailsActivity(java.lang.String p0, java.lang.String p1, int p2) { return null; }
    private android.graphics.drawable.Drawable resolveIcon() { return null; }
    private java.lang.String resolveTitle() { return null; }
    private java.lang.String resolveDialogMessage(java.lang.String p0, java.lang.String p1) { return null; }
    private java.lang.String resolveNeutralButtonText() { return null; }
    public void onCreate(android.os.Bundle p0) {}
    public void onClick(android.content.DialogInterface p0, int p1) {}
    public static android.content.Intent createSuspendedAppInterceptIntent(java.lang.String p0, java.lang.String p1, android.content.pm.SuspendDialogInfo p2, int p3) { return null; }
}
