package android.app;

public class KeyguardManager {
    public static final java.lang.String ACTION_CONFIRM_DEVICE_CREDENTIAL = "android.app.action.CONFIRM_DEVICE_CREDENTIAL";
    public static final java.lang.String ACTION_CONFIRM_DEVICE_CREDENTIAL_WITH_USER = "android.app.action.CONFIRM_DEVICE_CREDENTIAL_WITH_USER";
    public static final java.lang.String ACTION_CONFIRM_FRP_CREDENTIAL = "android.app.action.CONFIRM_FRP_CREDENTIAL";
    public static final java.lang.String ACTION_CONFIRM_REMOTE_DEVICE_CREDENTIAL = "android.app.action.CONFIRM_REMOTE_DEVICE_CREDENTIAL";
    public static final java.lang.String ACTION_PREPARE_REPAIR_MODE_DEVICE_CREDENTIAL = "android.app.action.PREPARE_REPAIR_MODE_DEVICE_CREDENTIAL";
    public static final java.lang.String ACTION_CONFIRM_REPAIR_MODE_DEVICE_CREDENTIAL = "android.app.action.CONFIRM_REPAIR_MODE_DEVICE_CREDENTIAL";
    public static final java.lang.String EXTRA_TITLE = "android.app.extra.TITLE";
    public static final java.lang.String EXTRA_DESCRIPTION = "android.app.extra.DESCRIPTION";
    public static final java.lang.String EXTRA_ALTERNATE_BUTTON_LABEL = "android.app.extra.ALTERNATE_BUTTON_LABEL";
    public static final java.lang.String EXTRA_CHECKBOX_LABEL = "android.app.extra.CHECKBOX_LABEL";
    public static final java.lang.String EXTRA_REMOTE_LOCKSCREEN_VALIDATION_SESSION = "android.app.extra.REMOTE_LOCKSCREEN_VALIDATION_SESSION";
    public static final java.lang.String EXTRA_FORCE_TASK_OVERLAY = "android.app.KeyguardManager.FORCE_TASK_OVERLAY";
    public static final int RESULT_ALTERNATE = 1;
    public static final java.lang.String EXTRA_DISALLOW_BIOMETRICS_IF_POLICY_EXISTS = "check_dpm";
    public static final java.lang.String LOCK_ON_USER_SWITCH_CALLBACK = "onSwitchCallback";
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
    @android.annotation.RequiresPermission("android.permission.CHECK_REMOTE_LOCKSCREEN")
    @android.annotation.NonNull
    public android.content.Intent createConfirmDeviceCredentialForRemoteValidationIntent(android.app.RemoteLockscreenValidationSession p0, android.content.ComponentName p1, java.lang.CharSequence p2, java.lang.CharSequence p3, java.lang.CharSequence p4, java.lang.CharSequence p5) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CONTROL_KEYGUARD_SECURE_NOTIFICATIONS")
    public void setPrivateNotificationsAllowed(boolean p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CONTROL_KEYGUARD_SECURE_NOTIFICATIONS")
    public boolean getPrivateNotificationsAllowed() { return false; }
    KeyguardManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    @java.lang.Deprecated
    public android.app.KeyguardManager.KeyguardLock newKeyguardLock(java.lang.String p0) { return null; }
    public boolean isKeyguardLocked() { return false; }
    public boolean isKeyguardSecure() { return false; }
    public boolean inKeyguardRestrictedInputMode() { return false; }
    public boolean isDeviceLocked() { return false; }
    public boolean isDeviceLocked(int p0) { return false; }
    public boolean isDeviceLocked(int p0, int p1) { return false; }
    public boolean isDeviceSecure() { return false; }
    public boolean isDeviceSecure(int p0) { return false; }
    public boolean isDeviceSecure(int p0, int p1) { return false; }
    public void requestDismissKeyguard(android.app.Activity p0, android.app.KeyguardManager.KeyguardDismissCallback p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SHOW_KEYGUARD_MESSAGE")
    public void requestDismissKeyguard(android.app.Activity p0, java.lang.CharSequence p1, android.app.KeyguardManager.KeyguardDismissCallback p2) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.DISABLE_KEYGUARD")
    public void exitKeyguardSecurely(android.app.KeyguardManager.OnKeyguardExitResult p0) {}
    public boolean checkInitialLockMethodUsage() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SET_INITIAL_LOCK")
    public boolean isValidLockPasswordComplexity(int p0, byte[] p1, int p2) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SET_INITIAL_LOCK")
    public int getMinLockLength(boolean p0, int p1) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SET_INITIAL_LOCK")
    public boolean setLock(int p0, byte[] p1, int p2) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEAK_ESCROW_TOKEN")
    public long addWeakEscrowToken(byte[] p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, android.app.KeyguardManager.WeakEscrowTokenActivatedListener p3) { return 0L; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEAK_ESCROW_TOKEN")
    public boolean removeWeakEscrowToken(long p0, android.os.UserHandle p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEAK_ESCROW_TOKEN")
    public boolean isWeakEscrowTokenActive(long p0, android.os.UserHandle p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEAK_ESCROW_TOKEN")
    public boolean isWeakEscrowTokenValid(long p0, byte[] p1, android.os.UserHandle p2) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEAK_ESCROW_TOKEN")
    public boolean registerWeakEscrowTokenRemovedListener(java.util.concurrent.Executor p0, android.app.KeyguardManager.WeakEscrowTokenRemovedListener p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEAK_ESCROW_TOKEN")
    public boolean unregisterWeakEscrowTokenRemovedListener(android.app.KeyguardManager.WeakEscrowTokenRemovedListener p0) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.SET_AND_VERIFY_LOCKSCREEN_CREDENTIALS", "android.permission.ACCESS_KEYGUARD_SECURE_STORAGE"})
    public boolean setLock(int p0, byte[] p1, int p2, byte[] p3) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.SET_AND_VERIFY_LOCKSCREEN_CREDENTIALS", "android.permission.ACCESS_KEYGUARD_SECURE_STORAGE"})
    public boolean checkLock(int p0, byte[] p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CHECK_REMOTE_LOCKSCREEN")
    @android.annotation.NonNull
    public android.app.RemoteLockscreenValidationSession startRemoteLockscreenValidation() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CHECK_REMOTE_LOCKSCREEN")
    @android.annotation.NonNull
    public android.app.RemoteLockscreenValidationResult validateRemoteLockscreen(byte[] p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.SUBSCRIBE_TO_KEYGUARD_LOCKED_STATE")
    public void addKeyguardLockedStateListener(java.util.concurrent.Executor p0, android.app.KeyguardManager.KeyguardLockedStateListener p1) {}
    @android.annotation.RequiresPermission("android.permission.SUBSCRIBE_TO_KEYGUARD_LOCKED_STATE")
    public void removeKeyguardLockedStateListener(android.app.KeyguardManager.KeyguardLockedStateListener p0) {}
    @android.annotation.RequiresPermission("android.permission.SUBSCRIBE_TO_KEYGUARD_LOCKED_STATE")
    @android.annotation.FlaggedApi("android.app.device_unlock_listener")
    public void addDeviceLockedStateListener(java.util.concurrent.Executor p0, android.app.KeyguardManager.DeviceLockedStateListener p1) {}
    @android.annotation.RequiresPermission("android.permission.SUBSCRIBE_TO_KEYGUARD_LOCKED_STATE")
    @android.annotation.FlaggedApi("android.app.device_unlock_listener")
    public void removeDeviceLockedStateListener(android.app.KeyguardManager.DeviceLockedStateListener p0) {}

    @java.lang.FunctionalInterface
    @android.annotation.FlaggedApi("android.app.device_unlock_listener")
    public static interface DeviceLockedStateListener {
        public void onDeviceLockedStateChanged(boolean p0);
    }

    public static abstract class KeyguardDismissCallback {
        public KeyguardDismissCallback() {}
        public void onDismissError() {}
        public void onDismissSucceeded() {}
        public void onDismissCancelled() {}
    }

    @java.lang.Deprecated
    public class KeyguardLock {
        KeyguardLock(android.app.KeyguardManager p0, java.lang.String p1) {}
        @android.annotation.RequiresPermission("android.permission.DISABLE_KEYGUARD")
        public void disableKeyguard() {}
        @android.annotation.RequiresPermission("android.permission.DISABLE_KEYGUARD")
        public void reenableKeyguard() {}
    }

    @java.lang.FunctionalInterface
    public static interface KeyguardLockedStateListener {
        public void onKeyguardLockedStateChanged(boolean p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface LockTypes {
    }

    @java.lang.Deprecated
    public static interface OnKeyguardExitResult {
        public void onKeyguardExitResult(boolean p0);
    }

    @android.annotation.SystemApi
    public static interface WeakEscrowTokenActivatedListener {
        public void onWeakEscrowTokenActivated(long p0, android.os.UserHandle p1);
    }

    @android.annotation.SystemApi
    public static interface WeakEscrowTokenRemovedListener {
        public void onWeakEscrowTokenRemoved(long p0, android.os.UserHandle p1);
    }
}
