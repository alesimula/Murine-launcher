package android.internal.hidl.manager.V1_2;

public interface IServiceManager extends android.internal.hidl.manager.V1_1.IServiceManager {
    public static final java.lang.String kInterfaceName = "android.hidl.manager@1.2::IServiceManager";
    public static android.internal.hidl.manager.V1_2.IServiceManager asInterface(android.os.IHwBinder p0) { return null; }
    public static android.internal.hidl.manager.V1_2.IServiceManager castFrom(android.os.IHwInterface p0) { return null; }
    public android.os.IHwBinder asBinder();
    public static android.internal.hidl.manager.V1_2.IServiceManager getService(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
    public static android.internal.hidl.manager.V1_2.IServiceManager getService(boolean p0) throws android.os.RemoteException { return null; }
    @java.lang.Deprecated
    public static android.internal.hidl.manager.V1_2.IServiceManager getService(java.lang.String p0) throws android.os.RemoteException { return null; }
    @java.lang.Deprecated
    public static android.internal.hidl.manager.V1_2.IServiceManager getService() throws android.os.RemoteException { return null; }
    public boolean registerClientCallback(java.lang.String p0, java.lang.String p1, android.internal.hidl.base.V1_0.IBase p2, android.internal.hidl.manager.V1_2.IClientCallback p3) throws android.os.RemoteException;
    public boolean unregisterClientCallback(android.internal.hidl.base.V1_0.IBase p0, android.internal.hidl.manager.V1_2.IClientCallback p1) throws android.os.RemoteException;
    public boolean addWithChain(java.lang.String p0, android.internal.hidl.base.V1_0.IBase p1, java.util.ArrayList<java.lang.String> p2) throws android.os.RemoteException;
    public java.util.ArrayList<java.lang.String> listManifestByInterface(java.lang.String p0) throws android.os.RemoteException;
    public boolean tryUnregister(java.lang.String p0, java.lang.String p1, android.internal.hidl.base.V1_0.IBase p2) throws android.os.RemoteException;
    public java.util.ArrayList<java.lang.String> interfaceChain() throws android.os.RemoteException;
    public void debug(android.os.NativeHandle p0, java.util.ArrayList<java.lang.String> p1) throws android.os.RemoteException;
    public java.lang.String interfaceDescriptor() throws android.os.RemoteException;
    public java.util.ArrayList<byte[]> getHashChain() throws android.os.RemoteException;
    public void setHALInstrumentation() throws android.os.RemoteException;
    public boolean linkToDeath(android.os.IHwBinder.DeathRecipient p0, long p1) throws android.os.RemoteException;
    public void ping() throws android.os.RemoteException;
    public android.internal.hidl.base.V1_0.DebugInfo getDebugInfo() throws android.os.RemoteException;
    public void notifySyspropsChanged() throws android.os.RemoteException;
    public boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient p0) throws android.os.RemoteException;

    public static final class Proxy implements android.internal.hidl.manager.V1_2.IServiceManager {
        public Proxy(android.os.IHwBinder p0) {}
        public android.os.IHwBinder asBinder() { return null; }
        public java.lang.String toString() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
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
        public java.util.ArrayList<java.lang.String> interfaceChain() throws android.os.RemoteException { return null; }
        public void debug(android.os.NativeHandle p0, java.util.ArrayList<java.lang.String> p1) throws android.os.RemoteException {}
        public java.lang.String interfaceDescriptor() throws android.os.RemoteException { return null; }
        public java.util.ArrayList<byte[]> getHashChain() throws android.os.RemoteException { return null; }
        public void setHALInstrumentation() throws android.os.RemoteException {}
        public boolean linkToDeath(android.os.IHwBinder.DeathRecipient p0, long p1) throws android.os.RemoteException { return false; }
        public void ping() throws android.os.RemoteException {}
        public android.internal.hidl.base.V1_0.DebugInfo getDebugInfo() throws android.os.RemoteException { return null; }
        public void notifySyspropsChanged() throws android.os.RemoteException {}
        public boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient p0) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.HwBinder implements android.internal.hidl.manager.V1_2.IServiceManager {
        public Stub() { super(); }
        public android.os.IHwBinder asBinder() { return null; }
        public final java.util.ArrayList<java.lang.String> interfaceChain() { return null; }
        public void debug(android.os.NativeHandle p0, java.util.ArrayList<java.lang.String> p1) {}
        public final java.lang.String interfaceDescriptor() { return null; }
        public final java.util.ArrayList<byte[]> getHashChain() { return null; }
        public final void setHALInstrumentation() {}
        public final boolean linkToDeath(android.os.IHwBinder.DeathRecipient p0, long p1) { return false; }
        public final void ping() {}
        public final android.internal.hidl.base.V1_0.DebugInfo getDebugInfo() { return null; }
        public final void notifySyspropsChanged() {}
        public final boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient p0) { return false; }
        public android.os.IHwInterface queryLocalInterface(java.lang.String p0) { return null; }
        public void registerAsService(java.lang.String p0) throws android.os.RemoteException {}
        public java.lang.String toString() { return null; }
        public void onTransact(int p0, android.os.HwParcel p1, android.os.HwParcel p2, int p3) throws android.os.RemoteException {}
    }
}
