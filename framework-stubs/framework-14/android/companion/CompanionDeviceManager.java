package android.companion;

@android.annotation.SuppressLint("LongLogTag")
public final class CompanionDeviceManager {
    public static final int RESULT_OK = -1;
    public static final int RESULT_CANCELED = 0;
    public static final int RESULT_USER_REJECTED = 1;
    public static final int RESULT_DISCOVERY_TIMEOUT = 2;
    public static final int RESULT_INTERNAL_ERROR = 3;
    public static final java.lang.String REASON_USER_REJECTED = "user_rejected";
    public static final java.lang.String REASON_DISCOVERY_TIMEOUT = "discovery_timeout";
    public static final java.lang.String REASON_INTERNAL_ERROR = "internal_error";
    public static final java.lang.String REASON_CANCELED = "canceled";
    public static final int FLAG_CALL_METADATA = 1;
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_DEVICE = "android.companion.extra.DEVICE";
    public static final java.lang.String EXTRA_ASSOCIATION = "android.companion.extra.ASSOCIATION";
    public static final java.lang.String COMPANION_DEVICE_DISCOVERY_PACKAGE_NAME = "com.android.companiondevicemanager";
    public CompanionDeviceManager(android.companion.ICompanionDeviceManager p0, android.content.Context p1) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.REQUEST_COMPANION_PROFILE_WATCH", "android.permission.REQUEST_COMPANION_PROFILE_COMPUTER", "android.permission.REQUEST_COMPANION_PROFILE_APP_STREAMING", "android.permission.REQUEST_COMPANION_PROFILE_AUTOMOTIVE_PROJECTION"}, conditional=true)
    public void associate(android.companion.AssociationRequest p0, android.companion.CompanionDeviceManager.Callback p1, android.os.Handler p2) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.REQUEST_COMPANION_PROFILE_WATCH", "android.permission.REQUEST_COMPANION_PROFILE_COMPUTER", "android.permission.REQUEST_COMPANION_PROFILE_APP_STREAMING", "android.permission.REQUEST_COMPANION_PROFILE_AUTOMOTIVE_PROJECTION"}, conditional=true)
    public void associate(android.companion.AssociationRequest p0, java.util.concurrent.Executor p1, android.companion.CompanionDeviceManager.Callback p2) {}
    public android.content.IntentSender buildAssociationCancellationIntent() { return null; }
    public void enableSystemDataSyncForTypes(int p0, int p1) {}
    public void disableSystemDataSyncForTypes(int p0, int p1) {}
    @java.lang.Deprecated
    public java.util.List<java.lang.String> getAssociations() { return null; }
    public java.util.List<android.companion.AssociationInfo> getMyAssociations() { return null; }
    @java.lang.Deprecated
    public void disassociate(java.lang.String p0) {}
    public void disassociate(int p0) {}
    public void requestNotificationAccess(android.content.ComponentName p0) {}
    @java.lang.Deprecated
    public boolean hasNotificationAccess(android.content.ComponentName p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_COMPANION_DEVICES")
    public boolean isDeviceAssociatedForWifiConnection(java.lang.String p0, android.net.MacAddress p1, android.os.UserHandle p2) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_COMPANION_DEVICES")
    public java.util.List<android.companion.AssociationInfo> getAllAssociations() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_COMPANION_DEVICES")
    public void addOnAssociationsChangedListener(java.util.concurrent.Executor p0, android.companion.CompanionDeviceManager.OnAssociationsChangedListener p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_COMPANION_DEVICES")
    public void removeOnAssociationsChangedListener(android.companion.CompanionDeviceManager.OnAssociationsChangedListener p0) {}
    public void addOnTransportsChangedListener(java.util.concurrent.Executor p0, android.companion.CompanionDeviceManager.OnTransportsChangedListener p1) {}
    public void removeOnTransportsChangedListener(android.companion.CompanionDeviceManager.OnTransportsChangedListener p0) {}
    public void sendMessage(int p0, byte[] p1, int[] p2) {}
    public void addOnMessageReceivedListener(java.util.concurrent.Executor p0, int p1, android.companion.CompanionDeviceManager.OnMessageReceivedListener p2) {}
    public void removeOnMessageReceivedListener(int p0, android.companion.CompanionDeviceManager.OnMessageReceivedListener p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_COMPANION_DEVICES")
    public boolean canPairWithoutPrompt(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) { return false; }
    @android.annotation.RequiresPermission("android.permission.REQUEST_OBSERVE_COMPANION_DEVICE_PRESENCE")
    public void startObservingDevicePresence(java.lang.String p0) throws android.companion.DeviceNotAssociatedException {}
    @android.annotation.RequiresPermission("android.permission.REQUEST_OBSERVE_COMPANION_DEVICE_PRESENCE")
    public void stopObservingDevicePresence(java.lang.String p0) throws android.companion.DeviceNotAssociatedException {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.DELIVER_COMPANION_MESSAGES")
    public void dispatchMessage(int p0, int p1, byte[] p2) throws android.companion.DeviceNotAssociatedException {}
    @android.annotation.RequiresPermission("android.permission.DELIVER_COMPANION_MESSAGES")
    public void attachSystemDataTransport(int p0, java.io.InputStream p1, java.io.OutputStream p2) throws android.companion.DeviceNotAssociatedException {}
    @android.annotation.RequiresPermission("android.permission.DELIVER_COMPANION_MESSAGES")
    public void detachSystemDataTransport(int p0) throws android.companion.DeviceNotAssociatedException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ASSOCIATE_COMPANION_DEVICES")
    public void associate(java.lang.String p0, android.net.MacAddress p1, byte[] p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_SELF_MANAGED")
    public void notifyDeviceAppeared(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_SELF_MANAGED")
    public void notifyDeviceDisappeared(int p0) {}
    public android.content.IntentSender buildPermissionTransferUserConsentIntent(int p0) throws android.companion.DeviceNotAssociatedException { return null; }
    @java.lang.Deprecated
    public void startSystemDataTransfer(int p0) throws android.companion.DeviceNotAssociatedException {}
    public void startSystemDataTransfer(int p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.companion.CompanionException> p2) throws android.companion.DeviceNotAssociatedException {}
    public boolean isCompanionApplicationBound() { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_COMPANION_DEVICES")
    public void enableSecureTransport(boolean p0) {}

    public static abstract class Callback {
        public Callback() {}
        @java.lang.Deprecated
        public void onDeviceFound(android.content.IntentSender p0) {}
        public void onAssociationPending(android.content.IntentSender p0) {}
        public void onAssociationCreated(android.companion.AssociationInfo p0) {}
        public abstract void onFailure(java.lang.CharSequence p0);
    }

    private static class AssociationRequestCallbackProxy extends android.companion.IAssociationRequestCallback.Stub {
        public void onAssociationPending(android.app.PendingIntent p0) {}
        public void onAssociationCreated(android.companion.AssociationInfo p0) {}
        public void onFailure(java.lang.CharSequence p0) throws android.os.RemoteException {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DataSyncTypes {
    }

    @android.annotation.SystemApi
    public static interface OnAssociationsChangedListener {
        public void onAssociationsChanged(java.util.List<android.companion.AssociationInfo> p0);
    }

    private static class OnAssociationsChangedListenerProxy extends android.companion.IOnAssociationsChangedListener.Stub {
        public void onAssociationsChanged(java.util.List<android.companion.AssociationInfo> p0) {}
    }

    public static interface OnMessageReceivedListener {
        public void onMessageReceived(int p0, byte[] p1);
    }

    private static class OnMessageReceivedListenerProxy extends android.companion.IOnMessageReceivedListener.Stub {
        public void onMessageReceived(int p0, byte[] p1) {}
    }

    public static interface OnTransportsChangedListener {
        public void onTransportsChanged(java.util.List<android.companion.AssociationInfo> p0);
    }

    private static class OnTransportsChangedListenerProxy extends android.companion.IOnTransportsChangedListener.Stub {
        public void onTransportsChanged(java.util.List<android.companion.AssociationInfo> p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
    }

    private static class SystemDataTransferCallbackProxy extends android.companion.ISystemDataTransferCallback.Stub {
        public void onResult() {}
        public void onError(java.lang.String p0) {}
    }

    private class Transport {
        public Transport(android.companion.CompanionDeviceManager p0, int p1, java.io.InputStream p2, java.io.OutputStream p3) {}
        public void start() throws java.io.IOException {}
        public void stop() {}
    }
}
