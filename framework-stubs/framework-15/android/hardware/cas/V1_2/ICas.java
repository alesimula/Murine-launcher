package android.hardware.cas.V1_2;

public interface ICas extends android.hardware.cas.V1_1.ICas {
    public static final java.lang.String kInterfaceName = "android.hardware.cas@1.2::ICas";
    public static android.hardware.cas.V1_2.ICas asInterface(android.os.IHwBinder p0) { return null; }
    public static android.hardware.cas.V1_2.ICas castFrom(android.os.IHwInterface p0) { return null; }
    public android.os.IHwBinder asBinder();
    public static android.hardware.cas.V1_2.ICas getService(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
    public static android.hardware.cas.V1_2.ICas getService(boolean p0) throws android.os.RemoteException { return null; }
    @java.lang.Deprecated
    public static android.hardware.cas.V1_2.ICas getService(java.lang.String p0) throws android.os.RemoteException { return null; }
    @java.lang.Deprecated
    public static android.hardware.cas.V1_2.ICas getService() throws android.os.RemoteException { return null; }
    public void openSession_1_2(int p0, int p1, android.hardware.cas.V1_2.ICas.openSession_1_2Callback p2) throws android.os.RemoteException;
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

    public static final class Proxy implements android.hardware.cas.V1_2.ICas {
        public Proxy(android.os.IHwBinder p0) {}
        public android.os.IHwBinder asBinder() { return null; }
        public java.lang.String toString() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public int setPrivateData(java.util.ArrayList<java.lang.Byte> p0) throws android.os.RemoteException { return 0; }
        public void openSession(android.hardware.cas.V1_0.ICas.openSessionCallback p0) throws android.os.RemoteException {}
        public int closeSession(java.util.ArrayList<java.lang.Byte> p0) throws android.os.RemoteException { return 0; }
        public int setSessionPrivateData(java.util.ArrayList<java.lang.Byte> p0, java.util.ArrayList<java.lang.Byte> p1) throws android.os.RemoteException { return 0; }
        public int processEcm(java.util.ArrayList<java.lang.Byte> p0, java.util.ArrayList<java.lang.Byte> p1) throws android.os.RemoteException { return 0; }
        public int processEmm(java.util.ArrayList<java.lang.Byte> p0) throws android.os.RemoteException { return 0; }
        public int sendEvent(int p0, int p1, java.util.ArrayList<java.lang.Byte> p2) throws android.os.RemoteException { return 0; }
        public int provision(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int refreshEntitlements(int p0, java.util.ArrayList<java.lang.Byte> p1) throws android.os.RemoteException { return 0; }
        public int release() throws android.os.RemoteException { return 0; }
        public int sendSessionEvent(java.util.ArrayList<java.lang.Byte> p0, int p1, int p2, java.util.ArrayList<java.lang.Byte> p3) throws android.os.RemoteException { return 0; }
        public void openSession_1_2(int p0, int p1, android.hardware.cas.V1_2.ICas.openSession_1_2Callback p2) throws android.os.RemoteException {}
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

    public static abstract class Stub extends android.os.HwBinder implements android.hardware.cas.V1_2.ICas {
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

    @java.lang.FunctionalInterface
    public static interface openSession_1_2Callback {
        public void onValues(int p0, java.util.ArrayList<java.lang.Byte> p1);
    }
}
