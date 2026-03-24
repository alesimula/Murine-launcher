package android.hardware.gnss.V2_0;

public interface IGnssDebug extends android.hardware.gnss.V1_0.IGnssDebug {
    public static final java.lang.String kInterfaceName = "android.hardware.gnss@2.0::IGnssDebug";
    public static android.hardware.gnss.V2_0.IGnssDebug asInterface(android.os.IHwBinder p0) { return null; }
    public static android.hardware.gnss.V2_0.IGnssDebug castFrom(android.os.IHwInterface p0) { return null; }
    public android.os.IHwBinder asBinder();
    public static android.hardware.gnss.V2_0.IGnssDebug getService(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
    public static android.hardware.gnss.V2_0.IGnssDebug getService(boolean p0) throws android.os.RemoteException { return null; }
    @java.lang.Deprecated
    public static android.hardware.gnss.V2_0.IGnssDebug getService(java.lang.String p0) throws android.os.RemoteException { return null; }
    @java.lang.Deprecated
    public static android.hardware.gnss.V2_0.IGnssDebug getService() throws android.os.RemoteException { return null; }
    public android.hardware.gnss.V2_0.IGnssDebug.DebugData getDebugData_2_0() throws android.os.RemoteException;
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

    public static final class DebugData {
        public android.hardware.gnss.V1_0.IGnssDebug.PositionDebug position;
        public android.hardware.gnss.V1_0.IGnssDebug.TimeDebug time;
        public java.util.ArrayList<android.hardware.gnss.V2_0.IGnssDebug.SatelliteData> satelliteDataArray;
        public DebugData() {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
        public final void readFromParcel(android.os.HwParcel p0) {}
        public static final java.util.ArrayList<android.hardware.gnss.V2_0.IGnssDebug.DebugData> readVectorFromParcel(android.os.HwParcel p0) { return null; }
        public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
        public final void writeToParcel(android.os.HwParcel p0) {}
        public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.gnss.V2_0.IGnssDebug.DebugData> p1) {}
        public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
    }

    public static final class Proxy implements android.hardware.gnss.V2_0.IGnssDebug {
        private android.os.IHwBinder mRemote;
        public Proxy(android.os.IHwBinder p0) {}
        public android.os.IHwBinder asBinder() { return null; }
        public java.lang.String toString() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public android.hardware.gnss.V1_0.IGnssDebug.DebugData getDebugData() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.V2_0.IGnssDebug.DebugData getDebugData_2_0() throws android.os.RemoteException { return null; }
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

    public static final class SatelliteData {
        public android.hardware.gnss.V1_0.IGnssDebug.SatelliteData v1_0;
        public byte constellation;
        public SatelliteData() {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
        public final void readFromParcel(android.os.HwParcel p0) {}
        public static final java.util.ArrayList<android.hardware.gnss.V2_0.IGnssDebug.SatelliteData> readVectorFromParcel(android.os.HwParcel p0) { return null; }
        public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
        public final void writeToParcel(android.os.HwParcel p0) {}
        public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.gnss.V2_0.IGnssDebug.SatelliteData> p1) {}
        public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
    }

    public static abstract class Stub extends android.os.HwBinder implements android.hardware.gnss.V2_0.IGnssDebug {
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
