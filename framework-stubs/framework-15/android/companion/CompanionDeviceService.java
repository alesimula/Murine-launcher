package android.companion;

public abstract class CompanionDeviceService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.companion.CompanionDeviceService";
    public CompanionDeviceService() { super(); }
    @java.lang.Deprecated
    public void onDeviceAppeared(java.lang.String p0) {}
    @java.lang.Deprecated
    public void onDeviceDisappeared(java.lang.String p0) {}
    @java.lang.Deprecated
    public void onMessageDispatchedFromSystem(int p0, int p1, byte[] p2) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.DELIVER_COMPANION_MESSAGES")
    public final void dispatchMessageToSystem(int p0, int p1, byte[] p2) throws android.companion.DeviceNotAssociatedException {}
    @android.annotation.RequiresPermission("android.permission.DELIVER_COMPANION_MESSAGES")
    public final void attachSystemDataTransport(int p0, java.io.InputStream p1, java.io.OutputStream p2) throws android.companion.DeviceNotAssociatedException {}
    @android.annotation.RequiresPermission("android.permission.DELIVER_COMPANION_MESSAGES")
    public final void detachSystemDataTransport(int p0) throws android.companion.DeviceNotAssociatedException {}
    public void onDeviceAppeared(android.companion.AssociationInfo p0) {}
    public void onDeviceDisappeared(android.companion.AssociationInfo p0) {}
    @android.annotation.FlaggedApi("android.companion.device_presence")
    public void onDevicePresenceEvent(android.companion.DevicePresenceEvent p0) {}
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onBindCompanionDeviceService(android.content.Intent p0) {}

    private class Stub extends android.companion.ICompanionDeviceService.Stub {
        final android.os.Handler mMainHandler = null;
        final android.companion.CompanionDeviceService mService = null;
        public void onDeviceAppeared(android.companion.AssociationInfo p0) {}
        public void onDeviceDisappeared(android.companion.AssociationInfo p0) {}
        public void onDevicePresenceEvent(android.companion.DevicePresenceEvent p0) {}
    }
}
