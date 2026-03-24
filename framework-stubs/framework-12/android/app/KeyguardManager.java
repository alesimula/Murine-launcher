package android.app;

public class KeyguardManager {
    private static final java.lang.String TAG = "KeyguardManager";
    private final android.content.Context mContext = null;
    private final android.view.IWindowManager mWM = null;
    private final android.app.IActivityManager mAm = null;
    private final android.app.trust.ITrustManager mTrustManager = null;
    private final android.app.INotificationManager mNotificationManager = null;
    public static final java.lang.String ACTION_CONFIRM_DEVICE_CREDENTIAL = "android.app.action.CONFIRM_DEVICE_CREDENTIAL";
    public static final java.lang.String ACTION_CONFIRM_DEVICE_CREDENTIAL_WITH_USER = "android.app.action.CONFIRM_DEVICE_CREDENTIAL_WITH_USER";
    public static final java.lang.String ACTION_CONFIRM_FRP_CREDENTIAL = "android.app.action.CONFIRM_FRP_CREDENTIAL";
    public static final java.lang.String EXTRA_TITLE = "android.app.extra.TITLE";
    public static final java.lang.String EXTRA_DESCRIPTION = "android.app.extra.DESCRIPTION";
    public static final java.lang.String EXTRA_ALTERNATE_BUTTON_LABEL = "android.app.extra.ALTERNATE_BUTTON_LABEL";
    public static final int RESULT_ALTERNATE = 1;
    public static final java.lang.String EXTRA_DISALLOW_BIOMETRICS_IF_POLICY_EXISTS = "check_dpm";
    @android.annotation.SystemApi
    public static final int PASSWORD = 0;
    @android.annotation.SystemApi
    public static final int PIN = 1;
    @android.annotation.SystemApi
    public static final int PATTERN = 2;
    @java.lang.Deprecated
    public android.content.Intent createConfirmDeviceCredentialIntent(java.lang.CharSequence p0, java.lang.CharSequence p1) { return null; }
    public android.content.Intent createConfirmDeviceCredentialIntent(java.lang.CharSequence p0, java.lang.CharSequence p1, int p2) { return null; }
    public android.content.Intent createConfirmDeviceCredentialIntent(java.lang.CharSequence p0, java.lang.CharSequence p1, int p2, boolean p3) { return null; }
    @android.annotation.SystemApi
    public android.content.Intent createConfirmFactoryResetCredentialIntent(java.lang.CharSequence p0, java.lang.CharSequence p1, java.lang.CharSequence p2) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CONTROL_KEYGUARD_SECURE_NOTIFICATIONS")
    public void setPrivateNotificationsAllowed(boolean p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CONTROL_KEYGUARD_SECURE_NOTIFICATIONS")
    public boolean getPrivateNotificationsAllowed() { return false; }
    private java.lang.String getSettingsPackageForIntent(android.content.Intent p0) { return null; }
    KeyguardManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    @java.lang.Deprecated
    public android.app.KeyguardManager.KeyguardLock newKeyguardLock(java.lang.String p0) { return null; }
    public boolean isKeyguardLocked() { return false; }
    public boolean isKeyguardSecure() { return false; }
    public boolean inKeyguardRestrictedInputMode() { return false; }
    public boolean isDeviceLocked() { return false; }
    public boolean isDeviceLocked(int p0) { return false; }
    public boolean isDeviceSecure() { return false; }
    public boolean isDeviceSecure(int p0) { return false; }
    public void requestDismissKeyguard(android.app.Activity p0, android.app.KeyguardManager.KeyguardDismissCallback p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SHOW_KEYGUARD_MESSAGE")
    public void requestDismissKeyguard(android.app.Activity p0, java.lang.CharSequence p1, android.app.KeyguardManager.KeyguardDismissCallback p2) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.DISABLE_KEYGUARD")
    public void exitKeyguardSecurely(android.app.KeyguardManager.OnKeyguardExitResult p0) {}
    private boolean checkInitialLockMethodUsage() { return false; }
    private boolean hasPermission(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SET_INITIAL_LOCK")
    public boolean isValidLockPasswordComplexity(int p0, byte[] p1, int p2) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SET_INITIAL_LOCK")
    public int getMinLockLength(boolean p0, int p1) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SET_INITIAL_LOCK")
    public boolean setLock(int p0, byte[] p1, int p2) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.SET_AND_VERIFY_LOCKSCREEN_CREDENTIALS", "android.permission.ACCESS_KEYGUARD_SECURE_STORAGE"})
    public boolean setLock(int p0, byte[] p1, int p2, byte[] p3) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.SET_AND_VERIFY_LOCKSCREEN_CREDENTIALS", "android.permission.ACCESS_KEYGUARD_SECURE_STORAGE"})
    public boolean checkLock(int p0, byte[] p1) { return false; }
    private com.android.internal.widget.LockscreenCredential createLockscreenCredential(int p0, byte[] p1) { return null; }

    public static abstract class KeyguardDismissCallback {
        public KeyguardDismissCallback() {}
        public void onDismissError() {}
        public void onDismissSucceeded() {}
        public void onDismissCancelled() {}
    }

    @java.lang.Deprecated
    public class KeyguardLock {
        private final android.os.IBinder mToken = null;
        private final java.lang.String mTag = null;
        KeyguardLock(android.app.KeyguardManager p0, java.lang.String p1) {}
        @android.annotation.RequiresPermission("android.permission.DISABLE_KEYGUARD")
        public void disableKeyguard() {}
        @android.annotation.RequiresPermission("android.permission.DISABLE_KEYGUARD")
        public void reenableKeyguard() {}
    }

    static @interface LockTypes {
    }

    @java.lang.Deprecated
    public static interface OnKeyguardExitResult {
        public void onKeyguardExitResult(boolean p0);
    }
}
