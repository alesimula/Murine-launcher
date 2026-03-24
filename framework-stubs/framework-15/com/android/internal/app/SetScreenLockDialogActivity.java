package com.android.internal.app;

public class SetScreenLockDialogActivity extends com.android.internal.app.AlertActivity implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener {
    public static final java.lang.String EXTRA_LAUNCH_REASON = "launch_reason";
    public static final java.lang.String EXTRA_ORIGIN_USER_ID = "origin_user_id";
    public static final int LAUNCH_REASON_UNKNOWN = -1;
    public static final int LAUNCH_REASON_DISABLE_QUIET_MODE = 1;
    public static final int LAUNCH_REASON_PRIVATE_SPACE_SETTINGS_ACCESS = 2;
    public SetScreenLockDialogActivity() { super(); }
    @android.annotation.RequiresPermission("android.permission.HIDE_OVERLAY_WINDOWS")
    protected void onCreate(android.os.Bundle p0) {}
    public void onDismiss(android.content.DialogInterface p0) {}
    public void onClick(android.content.DialogInterface p0, int p1) {}
    public static android.content.Intent createBaseIntent(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LaunchReason {
    }
}
