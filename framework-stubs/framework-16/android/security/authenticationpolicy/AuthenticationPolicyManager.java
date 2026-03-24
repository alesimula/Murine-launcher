package android.security.authenticationpolicy;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.security.secure_lockdown")
public final class AuthenticationPolicyManager {
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.security.secure_lockdown")
    public static final int ERROR_UNKNOWN = 0;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.security.secure_lockdown")
    public static final int SUCCESS = 1;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.security.secure_lockdown")
    public static final int ERROR_UNSUPPORTED = 2;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.security.secure_lockdown")
    public static final int ERROR_INVALID_PARAMS = 3;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.security.secure_lockdown")
    public static final int ERROR_NO_BIOMETRICS_ENROLLED = 4;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.security.secure_lockdown")
    public static final int ERROR_INSUFFICIENT_BIOMETRICS = 5;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.security.secure_lockdown")
    public static final int ERROR_ALREADY_ENABLED = 6;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.security.secure_lockdown")
    public static final int ERROR_NOT_AUTHORIZED = 7;
    public AuthenticationPolicyManager(android.content.Context p0, android.security.authenticationpolicy.IAuthenticationPolicyService p1) {}
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.security.secure_lock_device")
    @android.annotation.RequiresPermission("android.permission.MANAGE_SECURE_LOCK_DEVICE")
    public void registerSecureLockDeviceStatusListener(java.util.concurrent.Executor p0, android.security.authenticationpolicy.AuthenticationPolicyManager.SecureLockDeviceStatusListener p1) {}
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.security.secure_lock_device")
    @android.annotation.RequiresPermission("android.permission.MANAGE_SECURE_LOCK_DEVICE")
    public void unregisterSecureLockDeviceStatusListener(android.security.authenticationpolicy.AuthenticationPolicyManager.SecureLockDeviceStatusListener p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_SECURE_LOCK_DEVICE")
    @android.annotation.FlaggedApi("android.security.secure_lock_device")
    public int isSecureLockDeviceAvailable() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_SECURE_LOCK_DEVICE")
    @android.annotation.FlaggedApi("android.security.secure_lockdown")
    public int enableSecureLockDevice(android.security.authenticationpolicy.EnableSecureLockDeviceParams p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_SECURE_LOCK_DEVICE")
    @android.annotation.FlaggedApi("android.security.secure_lockdown")
    public int disableSecureLockDevice(android.security.authenticationpolicy.DisableSecureLockDeviceParams p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_SECURE_LOCK_DEVICE")
    @android.annotation.FlaggedApi("android.security.secure_lock_device")
    public boolean isSecureLockDeviceEnabled() { return false; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    @android.annotation.FlaggedApi("android.hardware.biometrics.identity_check_watch")
    public void startWatchRangingForIdentityCheck(long p0, android.proximity.IProximityResultCallback p1, android.os.Handler p2) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    @android.annotation.FlaggedApi("android.hardware.biometrics.identity_check_watch")
    public void cancelWatchRangingForRequestId(long p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisableSecureLockDeviceRequestStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnableSecureLockDeviceRequestStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IsSecureLockDeviceAvailableRequestStatus {
    }

    private static final class ProximityResultCallbackWrapper extends android.proximity.IProximityResultCallback.Stub {
        ProximityResultCallbackWrapper(android.os.Handler p0, android.proximity.IProximityResultCallback p1) { super(); }
        public void onError(int p0) {}
        public void onSuccess(int p0) {}
    }

    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.security.secure_lock_device")
    public static interface SecureLockDeviceStatusListener {
        public void onSecureLockDeviceEnabledStatusChanged(boolean p0);
        public void onSecureLockDeviceAvailableStatusChanged(int p0);
    }
}
