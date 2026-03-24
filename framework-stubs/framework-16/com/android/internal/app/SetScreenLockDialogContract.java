package com.android.internal.app;

public final class SetScreenLockDialogContract {
    public static final java.lang.String EXTRA_LAUNCH_REASON = "launch_reason";
    public static final java.lang.String EXTRA_ORIGIN_USER_ID = "origin_user_id";
    public static final int LAUNCH_REASON_UNKNOWN = -1;
    public static final int LAUNCH_REASON_DISABLE_QUIET_MODE = 1;
    public static final int LAUNCH_REASON_PRIVATE_SPACE_SETTINGS_ACCESS = 2;
    public static final int LAUNCH_REASON_RESET_PRIVATE_SPACE_SETTINGS_ACCESS = 3;
    public SetScreenLockDialogContract() {}
    public static android.content.Intent createDialogIntent(int p0) { return null; }
    public static android.content.Intent createUserSpecificDialogIntent(int p0, int p1) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LaunchReason {
    }
}
