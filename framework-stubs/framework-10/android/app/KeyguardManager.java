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
    public static final java.lang.String EXTRA_BIOMETRIC_PROMPT_BUNDLE = "android.app.extra.BIOMETRIC_PROMPT_BUNDLE";
    public static final java.lang.String EXTRA_TITLE = "android.app.extra.TITLE";
    public static final java.lang.String EXTRA_DESCRIPTION = "android.app.extra.DESCRIPTION";
    public static final java.lang.String EXTRA_ALTERNATE_BUTTON_LABEL = "android.app.extra.ALTERNATE_BUTTON_LABEL";
    public static final int RESULT_ALTERNATE = 1;
    @java.lang.Deprecated
    public android.content.Intent createConfirmDeviceCredentialIntent(java.lang.CharSequence p0, java.lang.CharSequence p1) { return null; }
    public android.content.Intent createConfirmDeviceCredentialIntent(java.lang.CharSequence p0, java.lang.CharSequence p1, int p2) { return null; }
    @android.annotation.SystemApi
    public android.content.Intent createConfirmFactoryResetCredentialIntent(java.lang.CharSequence p0, java.lang.CharSequence p1, java.lang.CharSequence p2) { return null; }
    @android.annotation.SystemApi
    public void setPrivateNotificationsAllowed(boolean p0) {}
    @android.annotation.SystemApi
    public boolean getPrivateNotificationsAllowed() { return false; }
    private java.lang.String getSettingsPackageForIntent(android.content.Intent p0) { return null; }
    KeyguardManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    @java.lang.Deprecated
    public android.app.KeyguardManager.KeyguardLock newKeyguardLock(java.lang.String p0) { return null; }
    public boolean isKeyguardLocked() { return false; }
    public boolean isKeyguardSecure() { return false; }
    public boolean inKeyguardRestrictedInputMode() { return false; }
    public boolean isDeviceLocked() { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public boolean isDeviceLocked(int p0) { return false; }
    public boolean isDeviceSecure() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isDeviceSecure(int p0) { return false; }
    @java.lang.Deprecated
    public void dismissKeyguard(android.app.Activity p0, android.app.KeyguardManager.KeyguardDismissCallback p1, android.os.Handler p2) {}
    public void requestDismissKeyguard(android.app.Activity p0, android.app.KeyguardManager.KeyguardDismissCallback p1) {}
    @android.annotation.SystemApi
    public void requestDismissKeyguard(android.app.Activity p0, java.lang.CharSequence p1, android.app.KeyguardManager.KeyguardDismissCallback p2) {}
    @java.lang.Deprecated
    public void exitKeyguardSecurely(android.app.KeyguardManager.OnKeyguardExitResult p0) {}

    @java.lang.Deprecated
    public static interface OnKeyguardExitResult {
        public void onKeyguardExitResult(boolean p0);
    }

    @java.lang.Deprecated
    public class KeyguardLock {
        private final android.os.IBinder mToken = null;
        private final java.lang.String mTag = null;
        KeyguardLock(android.app.KeyguardManager p0, java.lang.String p1) {}
        public void disableKeyguard() {}
        public void reenableKeyguard() {}
    }

    public static abstract class KeyguardDismissCallback {
        public KeyguardDismissCallback() {}
        public void onDismissError() {}
        public void onDismissSucceeded() {}
        public void onDismissCancelled() {}
    }
}
