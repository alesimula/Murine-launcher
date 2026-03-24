package android.hardware.cas.V1_0;

public interface IMediaCasService extends android.internal.hidl.base.V1_0.IBase {
    public static final java.lang.String kInterfaceName = "android.hardware.cas@1.0::IMediaCasService";
    public static android.hardware.cas.V1_0.IMediaCasService asInterface(android.os.IHwBinder p0) { return null; }
    public static android.hardware.cas.V1_0.IMediaCasService castFrom(android.os.IHwInterface p0) { return null; }
    public android.os.IHwBinder asBinder();
    public static android.hardware.cas.V1_0.IMediaCasService getService(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
    public static android.hardware.cas.V1_0.IMediaCasService getService(boolean p0) throws android.os.RemoteException { return null; }
    public static android.hardware.cas.V1_0.IMediaCasService getService(java.lang.String p0) throws android.os.RemoteException { return null; }
    public static android.hardware.cas.V1_0.IMediaCasService getService() throws android.os.RemoteException { return null; }
    public java.util.ArrayList<android.hardware.cas.V1_0.HidlCasPluginDescriptor> enumeratePlugins() throws android.os.RemoteException;
    public boolean isSystemIdSupported(int p0) throws android.os.RemoteException;
    public android.hardware.cas.V1_0.ICas createPlugin(int p0, android.hardware.cas.V1_0.ICasListener p1) throws android.os.RemoteException;
    public boolean isDescramblerSupported(int p0) throws android.os.RemoteException;
    public android.hardware.cas.V1_0.IDescramblerBase createDescrambler(int p0) throws android.os.RemoteException;
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

    public static final class Proxy implements android.hardware.cas.V1_0.IMediaCasService {
        private android.os.IHwBinder mRemote;
        public Proxy(android.os.IHwBinder p0) {}
        public android.os.IHwBinder asBinder() { return null; }
        public java.lang.String toString() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public java.util.ArrayList<android.hardware.cas.V1_0.HidlCasPluginDescriptor> enumeratePlugins() throws android.os.RemoteException { return null; }
        public boolean isSystemIdSupported(int p0) throws android.os.RemoteException { return false; }
        public android.hardware.cas.V1_0.ICas createPlugin(int p0, android.hardware.cas.V1_0.ICasListener p1) throws android.os.RemoteException { return null; }
        public boolean isDescramblerSupported(int p0) throws android.os.RemoteException { return false; }
        public android.hardware.cas.V1_0.IDescramblerBase createDescrambler(int p0) throws android.os.RemoteException { return null; }
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

    public static abstract class Stub extends android.os.HwBinder implements android.hardware.cas.V1_0.IMediaCasService {
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
