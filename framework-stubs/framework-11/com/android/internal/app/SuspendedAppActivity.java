package com.android.internal.app;

public class SuspendedAppActivity extends com.android.internal.app.AlertActivity implements android.content.DialogInterface.OnClickListener {
    private static final java.lang.String TAG = null;
    private static final java.lang.String PACKAGE_NAME = "com.android.internal.app";
    public static final java.lang.String EXTRA_SUSPENDED_PACKAGE = "com.android.internal.app.extra.SUSPENDED_PACKAGE";
    public static final java.lang.String EXTRA_SUSPENDING_PACKAGE = "com.android.internal.app.extra.SUSPENDING_PACKAGE";
    public static final java.lang.String EXTRA_DIALOG_INFO = "com.android.internal.app.extra.DIALOG_INFO";
    public static final java.lang.String EXTRA_ACTIVITY_OPTIONS = "com.android.internal.app.extra.ACTIVITY_OPTIONS";
    public static final java.lang.String EXTRA_UNSUSPEND_INTENT = "com.android.internal.app.extra.UNSUSPEND_INTENT";
    private android.content.Intent mMoreDetailsIntent;
    private android.content.IntentSender mOnUnsuspend;
    private java.lang.String mSuspendedPackage;
    private java.lang.String mSuspendingPackage;
    private int mNeutralButtonAction;
    private int mUserId;
    private android.content.pm.PackageManager mPm;
    private android.content.res.Resources mSuspendingAppResources;
    private android.content.pm.SuspendDialogInfo mSuppliedDialogInfo;
    private android.os.Bundle mOptions;
    public SuspendedAppActivity() { super(); }
    private java.lang.CharSequence getAppLabel(java.lang.String p0) { return null; }
    private android.content.Intent getMoreDetailsActivity() { return null; }
    private android.graphics.drawable.Drawable resolveIcon() { return null; }
    private java.lang.String resolveTitle() { return null; }
    private java.lang.String resolveDialogMessage() { return null; }
    private java.lang.String resolveNeutralButtonText() { return null; }
    public void onCreate(android.os.Bundle p0) {}
    private void requestDismissKeyguardIfNeeded(java.lang.CharSequence p0) {}
    public void onClick(android.content.DialogInterface p0, int p1) {}
    public static android.content.Intent createSuspendedAppInterceptIntent(java.lang.String p0, java.lang.String p1, android.content.pm.SuspendDialogInfo p2, android.os.Bundle p3, android.content.IntentSender p4, int p5) { return null; }
}
