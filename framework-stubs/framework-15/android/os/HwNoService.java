package android.os;

final class HwNoService extends android.internal.hidl.manager.V1_2.IServiceManager.Stub implements android.os.IHwBinder, android.os.IHwInterface {
    HwNoService() { super(); }
    public java.lang.String toString() { return null; }
    public android.internal.hidl.base.V1_0.IBase get(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
    public boolean add(java.lang.String p0, android.internal.hidl.base.V1_0.IBase p1) throws android.os.RemoteException { return false; }
    public byte getTransport(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
    public java.util.ArrayList<java.lang.String> list() throws android.os.RemoteException { return null; }
    public java.util.ArrayList<java.lang.String> listByInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
    public boolean registerForNotifications(java.lang.String p0, java.lang.String p1, android.internal.hidl.manager.V1_0.IServiceNotification p2) throws android.os.RemoteException { return false; }
    public java.util.ArrayList<android.internal.hidl.manager.V1_0.IServiceManager.InstanceDebugInfo> debugDump() throws android.os.RemoteException { return null; }
    public void registerPassthroughClient(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
    public boolean unregisterForNotifications(java.lang.String p0, java.lang.String p1, android.internal.hidl.manager.V1_0.IServiceNotification p2) throws android.os.RemoteException { return false; }
    public boolean registerClientCallback(java.lang.String p0, java.lang.String p1, android.internal.hidl.base.V1_0.IBase p2, android.internal.hidl.manager.V1_2.IClientCallback p3) throws android.os.RemoteException { return false; }
    public boolean unregisterClientCallback(android.internal.hidl.base.V1_0.IBase p0, android.internal.hidl.manager.V1_2.IClientCallback p1) throws android.os.RemoteException { return false; }
    public boolean addWithChain(java.lang.String p0, android.internal.hidl.base.V1_0.IBase p1, java.util.ArrayList<java.lang.String> p2) throws android.os.RemoteException { return false; }
    public java.util.ArrayList<java.lang.String> listManifestByInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
    public boolean tryUnregister(java.lang.String p0, java.lang.String p1, android.internal.hidl.base.V1_0.IBase p2) throws android.os.RemoteException { return false; }
}
