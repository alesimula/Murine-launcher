package android.app.admin;

public class DeviceAdminReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = "DevicePolicy";
    private static final boolean LOCAL_LOGV = false;
    public static final java.lang.String ACTION_DEVICE_ADMIN_ENABLED = "android.app.action.DEVICE_ADMIN_ENABLED";
    public static final java.lang.String ACTION_DEVICE_ADMIN_DISABLE_REQUESTED = "android.app.action.DEVICE_ADMIN_DISABLE_REQUESTED";
    public static final java.lang.String EXTRA_DISABLE_WARNING = "android.app.extra.DISABLE_WARNING";
    public static final java.lang.String ACTION_DEVICE_ADMIN_DISABLED = "android.app.action.DEVICE_ADMIN_DISABLED";
    public static final java.lang.String ACTION_PASSWORD_CHANGED = "android.app.action.ACTION_PASSWORD_CHANGED";
    public static final java.lang.String ACTION_PASSWORD_FAILED = "android.app.action.ACTION_PASSWORD_FAILED";
    public static final java.lang.String ACTION_PASSWORD_SUCCEEDED = "android.app.action.ACTION_PASSWORD_SUCCEEDED";
    public static final java.lang.String ACTION_PASSWORD_EXPIRING = "android.app.action.ACTION_PASSWORD_EXPIRING";
    public static final java.lang.String ACTION_LOCK_TASK_ENTERING = "android.app.action.LOCK_TASK_ENTERING";
    public static final java.lang.String ACTION_LOCK_TASK_EXITING = "android.app.action.LOCK_TASK_EXITING";
    public static final java.lang.String EXTRA_LOCK_TASK_PACKAGE = "android.app.extra.LOCK_TASK_PACKAGE";
    public static final java.lang.String ACTION_PROFILE_PROVISIONING_COMPLETE = "android.app.action.PROFILE_PROVISIONING_COMPLETE";
    public static final java.lang.String ACTION_BUGREPORT_SHARING_DECLINED = "android.app.action.BUGREPORT_SHARING_DECLINED";
    public static final java.lang.String ACTION_BUGREPORT_FAILED = "android.app.action.BUGREPORT_FAILED";
    public static final java.lang.String ACTION_BUGREPORT_SHARE = "android.app.action.BUGREPORT_SHARE";
    public static final java.lang.String ACTION_SECURITY_LOGS_AVAILABLE = "android.app.action.SECURITY_LOGS_AVAILABLE";
    public static final java.lang.String ACTION_NETWORK_LOGS_AVAILABLE = "android.app.action.NETWORK_LOGS_AVAILABLE";
    public static final java.lang.String EXTRA_NETWORK_LOGS_TOKEN = "android.app.extra.EXTRA_NETWORK_LOGS_TOKEN";
    public static final java.lang.String EXTRA_NETWORK_LOGS_COUNT = "android.app.extra.EXTRA_NETWORK_LOGS_COUNT";
    public static final java.lang.String ACTION_USER_ADDED = "android.app.action.USER_ADDED";
    public static final java.lang.String ACTION_USER_REMOVED = "android.app.action.USER_REMOVED";
    public static final java.lang.String ACTION_USER_STARTED = "android.app.action.USER_STARTED";
    public static final java.lang.String ACTION_USER_STOPPED = "android.app.action.USER_STOPPED";
    public static final java.lang.String ACTION_USER_SWITCHED = "android.app.action.USER_SWITCHED";
    public static final java.lang.String EXTRA_BUGREPORT_HASH = "android.app.extra.BUGREPORT_HASH";
    public static final java.lang.String EXTRA_BUGREPORT_FAILURE_REASON = "android.app.extra.BUGREPORT_FAILURE_REASON";
    public static final int BUGREPORT_FAILURE_FAILED_COMPLETING = 0;
    public static final int BUGREPORT_FAILURE_FILE_NO_LONGER_AVAILABLE = 1;
    public static final java.lang.String ACTION_CHOOSE_PRIVATE_KEY_ALIAS = "android.app.action.CHOOSE_PRIVATE_KEY_ALIAS";
    public static final java.lang.String EXTRA_CHOOSE_PRIVATE_KEY_SENDER_UID = "android.app.extra.CHOOSE_PRIVATE_KEY_SENDER_UID";
    public static final java.lang.String EXTRA_CHOOSE_PRIVATE_KEY_URI = "android.app.extra.CHOOSE_PRIVATE_KEY_URI";
    public static final java.lang.String EXTRA_CHOOSE_PRIVATE_KEY_ALIAS = "android.app.extra.CHOOSE_PRIVATE_KEY_ALIAS";
    public static final java.lang.String EXTRA_CHOOSE_PRIVATE_KEY_RESPONSE = "android.app.extra.CHOOSE_PRIVATE_KEY_RESPONSE";
    public static final java.lang.String ACTION_NOTIFY_PENDING_SYSTEM_UPDATE = "android.app.action.NOTIFY_PENDING_SYSTEM_UPDATE";
    public static final java.lang.String EXTRA_SYSTEM_UPDATE_RECEIVED_TIME = "android.app.extra.SYSTEM_UPDATE_RECEIVED_TIME";
    public static final java.lang.String DEVICE_ADMIN_META_DATA = "android.app.device_admin";
    public static final java.lang.String ACTION_TRANSFER_OWNERSHIP_COMPLETE = "android.app.action.TRANSFER_OWNERSHIP_COMPLETE";
    public static final java.lang.String ACTION_AFFILIATED_PROFILE_TRANSFER_OWNERSHIP_COMPLETE = "android.app.action.AFFILIATED_PROFILE_TRANSFER_OWNERSHIP_COMPLETE";
    public static final java.lang.String EXTRA_TRANSFER_OWNERSHIP_ADMIN_EXTRAS_BUNDLE = "android.app.extra.TRANSFER_OWNERSHIP_ADMIN_EXTRAS_BUNDLE";
    public static final java.lang.String ACTION_OPERATION_SAFETY_STATE_CHANGED = "android.app.action.OPERATION_SAFETY_STATE_CHANGED";
    public static final java.lang.String ACTION_COMPLIANCE_ACKNOWLEDGEMENT_REQUIRED = "android.app.action.COMPLIANCE_ACKNOWLEDGEMENT_REQUIRED";
    public static final java.lang.String EXTRA_OPERATION_SAFETY_REASON = "android.app.extra.OPERATION_SAFETY_REASON";
    public static final java.lang.String EXTRA_OPERATION_SAFETY_STATE = "android.app.extra.OPERATION_SAFETY_STATE";
    private android.app.admin.DevicePolicyManager mManager;
    private android.content.ComponentName mWho;
    public DeviceAdminReceiver() { super(); }
    public android.app.admin.DevicePolicyManager getManager(android.content.Context p0) { return null; }
    public android.content.ComponentName getWho(android.content.Context p0) { return null; }
    public void onEnabled(android.content.Context p0, android.content.Intent p1) {}
    public java.lang.CharSequence onDisableRequested(android.content.Context p0, android.content.Intent p1) { return null; }
    public void onDisabled(android.content.Context p0, android.content.Intent p1) {}
    @java.lang.Deprecated
    public void onPasswordChanged(android.content.Context p0, android.content.Intent p1) {}
    public void onPasswordChanged(android.content.Context p0, android.content.Intent p1, android.os.UserHandle p2) {}
    @java.lang.Deprecated
    public void onPasswordFailed(android.content.Context p0, android.content.Intent p1) {}
    public void onPasswordFailed(android.content.Context p0, android.content.Intent p1, android.os.UserHandle p2) {}
    @java.lang.Deprecated
    public void onPasswordSucceeded(android.content.Context p0, android.content.Intent p1) {}
    public void onPasswordSucceeded(android.content.Context p0, android.content.Intent p1, android.os.UserHandle p2) {}
    @java.lang.Deprecated
    public void onPasswordExpiring(android.content.Context p0, android.content.Intent p1) {}
    public void onPasswordExpiring(android.content.Context p0, android.content.Intent p1, android.os.UserHandle p2) {}
    public void onProfileProvisioningComplete(android.content.Context p0, android.content.Intent p1) {}
    @java.lang.Deprecated
    public void onReadyForUserInitialization(android.content.Context p0, android.content.Intent p1) {}
    public void onLockTaskModeEntering(android.content.Context p0, android.content.Intent p1, java.lang.String p2) {}
    public void onLockTaskModeExiting(android.content.Context p0, android.content.Intent p1) {}
    public java.lang.String onChoosePrivateKeyAlias(android.content.Context p0, android.content.Intent p1, int p2, android.net.Uri p3, java.lang.String p4) { return null; }
    public void onSystemUpdatePending(android.content.Context p0, android.content.Intent p1, long p2) {}
    public void onBugreportSharingDeclined(android.content.Context p0, android.content.Intent p1) {}
    public void onBugreportShared(android.content.Context p0, android.content.Intent p1, java.lang.String p2) {}
    public void onBugreportFailed(android.content.Context p0, android.content.Intent p1, int p2) {}
    public void onSecurityLogsAvailable(android.content.Context p0, android.content.Intent p1) {}
    public void onNetworkLogsAvailable(android.content.Context p0, android.content.Intent p1, long p2, int p3) {}
    public void onUserAdded(android.content.Context p0, android.content.Intent p1, android.os.UserHandle p2) {}
    public void onUserRemoved(android.content.Context p0, android.content.Intent p1, android.os.UserHandle p2) {}
    public void onUserStarted(android.content.Context p0, android.content.Intent p1, android.os.UserHandle p2) {}
    public void onUserStopped(android.content.Context p0, android.content.Intent p1, android.os.UserHandle p2) {}
    public void onUserSwitched(android.content.Context p0, android.content.Intent p1, android.os.UserHandle p2) {}
    public void onTransferOwnershipComplete(android.content.Context p0, android.os.PersistableBundle p1) {}
    public void onTransferAffiliatedProfileOwnershipComplete(android.content.Context p0, android.os.UserHandle p1) {}
    public void onOperationSafetyStateChanged(android.content.Context p0, int p1, boolean p2) {}
    private void onOperationSafetyStateChanged(android.content.Context p0, android.content.Intent p1) {}
    public void onComplianceAcknowledgementRequired(android.content.Context p0, android.content.Intent p1) {}
    private boolean hasRequiredExtra(android.content.Intent p0, java.lang.String p1) { return false; }
    public void onReceive(android.content.Context p0, android.content.Intent p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BugreportFailureCode {
    }
}
