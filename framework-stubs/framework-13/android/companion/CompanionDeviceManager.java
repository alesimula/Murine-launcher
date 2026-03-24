package android.companion;

public final class CompanionDeviceManager {
    public static final int RESULT_USER_REJECTED = 1;
    public static final int RESULT_DISCOVERY_TIMEOUT = 2;
    public static final int RESULT_INTERNAL_ERROR = 3;
    public static final java.lang.String REASON_USER_REJECTED = "user_rejected";
    public static final java.lang.String REASON_DISCOVERY_TIMEOUT = "discovery_timeout";
    public static final java.lang.String REASON_CANCELED = "canceled";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_DEVICE = "android.companion.extra.DEVICE";
    public static final java.lang.String EXTRA_ASSOCIATION = "android.companion.extra.ASSOCIATION";
    public static final java.lang.String COMPANION_DEVICE_DISCOVERY_PACKAGE_NAME = "com.android.companiondevicemanager";
    public CompanionDeviceManager(android.companion.ICompanionDeviceManager p0, android.content.Context p1) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.REQUEST_COMPANION_PROFILE_WATCH", "android.permission.REQUEST_COMPANION_PROFILE_COMPUTER", "android.permission.REQUEST_COMPANION_PROFILE_APP_STREAMING", "android.permission.REQUEST_COMPANION_PROFILE_AUTOMOTIVE_PROJECTION"}, conditional=true)
    public void associate(android.companion.AssociationRequest p0, android.companion.CompanionDeviceManager.Callback p1, android.os.Handler p2) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.REQUEST_COMPANION_PROFILE_WATCH", "android.permission.REQUEST_COMPANION_PROFILE_COMPUTER", "android.permission.REQUEST_COMPANION_PROFILE_APP_STREAMING", "android.permission.REQUEST_COMPANION_PROFILE_AUTOMOTIVE_PROJECTION"}, conditional=true)
    public void associate(android.companion.AssociationRequest p0, java.util.concurrent.Executor p1, android.companion.CompanionDeviceManager.Callback p2) {}
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
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_COMPANION_DEVICES")
    public boolean canPairWithoutPrompt(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) { return false; }
    @android.annotation.RequiresPermission("android.permission.REQUEST_OBSERVE_COMPANION_DEVICE_PRESENCE")
    public void startObservingDevicePresence(java.lang.String p0) throws android.companion.DeviceNotAssociatedException {}
    @android.annotation.RequiresPermission("android.permission.REQUEST_OBSERVE_COMPANION_DEVICE_PRESENCE")
    public void stopObservingDevicePresence(java.lang.String p0) throws android.companion.DeviceNotAssociatedException {}
    @android.annotation.RequiresPermission("android.permission.DELIVER_COMPANION_MESSAGES")
    public void dispatchMessage(int p0, int p1, byte[] p2) throws android.companion.DeviceNotAssociatedException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ASSOCIATE_COMPANION_DEVICES")
    public void associate(java.lang.String p0, android.net.MacAddress p1, byte[] p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_SELF_MANAGED")
    public void notifyDeviceAppeared(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.REQUEST_COMPANION_SELF_MANAGED")
    public void notifyDeviceDisappeared(int p0) {}

    private static class AssociationRequestCallbackProxy extends android.companion.IAssociationRequestCallback.Stub {
        public void onAssociationPending(android.app.PendingIntent p0) {}
        public void onAssociationCreated(android.companion.AssociationInfo p0) {}
        public void onFailure(java.lang.CharSequence p0) throws android.os.RemoteException {}
    }

    public static abstract class Callback {
        public Callback() {}
        @java.lang.Deprecated
        public void onDeviceFound(android.content.IntentSender p0) {}
        public void onAssociationPending(android.content.IntentSender p0) {}
        public void onAssociationCreated(android.companion.AssociationInfo p0) {}
        public abstract void onFailure(java.lang.CharSequence p0);
    }

    @android.annotation.SystemApi
    public static interface OnAssociationsChangedListener {
        public void onAssociationsChanged(java.util.List<android.companion.AssociationInfo> p0);
    }

    private static class OnAssociationsChangedListenerProxy extends android.companion.IOnAssociationsChangedListener.Stub {
        public void onAssociationsChanged(java.util.List<android.companion.AssociationInfo> p0) {}
    }
}
