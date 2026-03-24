package android.hardware.gnss.V2_0;

public interface IGnssMeasurementCallback extends android.hardware.gnss.V1_1.IGnssMeasurementCallback {
    public static final java.lang.String kInterfaceName = "android.hardware.gnss@2.0::IGnssMeasurementCallback";
    public static android.hardware.gnss.V2_0.IGnssMeasurementCallback asInterface(android.os.IHwBinder p0) { return null; }
    public static android.hardware.gnss.V2_0.IGnssMeasurementCallback castFrom(android.os.IHwInterface p0) { return null; }
    public android.os.IHwBinder asBinder();
    public static android.hardware.gnss.V2_0.IGnssMeasurementCallback getService(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
    public static android.hardware.gnss.V2_0.IGnssMeasurementCallback getService(boolean p0) throws android.os.RemoteException { return null; }
    @java.lang.Deprecated
    public static android.hardware.gnss.V2_0.IGnssMeasurementCallback getService(java.lang.String p0) throws android.os.RemoteException { return null; }
    @java.lang.Deprecated
    public static android.hardware.gnss.V2_0.IGnssMeasurementCallback getService() throws android.os.RemoteException { return null; }
    public void gnssMeasurementCb_2_0(android.hardware.gnss.V2_0.IGnssMeasurementCallback.GnssData p0) throws android.os.RemoteException;
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

    public static final class GnssData {
        public java.util.ArrayList<android.hardware.gnss.V2_0.IGnssMeasurementCallback.GnssMeasurement> measurements;
        public android.hardware.gnss.V1_0.IGnssMeasurementCallback.GnssClock clock;
        public android.hardware.gnss.V2_0.ElapsedRealtime elapsedRealtime;
        public GnssData() {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
        public final void readFromParcel(android.os.HwParcel p0) {}
        public static final java.util.ArrayList<android.hardware.gnss.V2_0.IGnssMeasurementCallback.GnssData> readVectorFromParcel(android.os.HwParcel p0) { return null; }
        public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
        public final void writeToParcel(android.os.HwParcel p0) {}
        public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.gnss.V2_0.IGnssMeasurementCallback.GnssData> p1) {}
        public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
    }

    public static final class GnssMeasurement {
        public android.hardware.gnss.V1_1.IGnssMeasurementCallback.GnssMeasurement v1_1;
        public java.lang.String codeType;
        public int state;
        public byte constellation;
        public GnssMeasurement() {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
        public final void readFromParcel(android.os.HwParcel p0) {}
        public static final java.util.ArrayList<android.hardware.gnss.V2_0.IGnssMeasurementCallback.GnssMeasurement> readVectorFromParcel(android.os.HwParcel p0) { return null; }
        public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
        public final void writeToParcel(android.os.HwParcel p0) {}
        public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.gnss.V2_0.IGnssMeasurementCallback.GnssMeasurement> p1) {}
        public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
    }

    public static final class GnssMeasurementState {
        public static final int STATE_UNKNOWN = 0;
        public static final int STATE_CODE_LOCK = 1;
        public static final int STATE_BIT_SYNC = 2;
        public static final int STATE_SUBFRAME_SYNC = 4;
        public static final int STATE_TOW_DECODED = 8;
        public static final int STATE_MSEC_AMBIGUOUS = 16;
        public static final int STATE_SYMBOL_SYNC = 32;
        public static final int STATE_GLO_STRING_SYNC = 64;
        public static final int STATE_GLO_TOD_DECODED = 128;
        public static final int STATE_BDS_D2_BIT_SYNC = 256;
        public static final int STATE_BDS_D2_SUBFRAME_SYNC = 512;
        public static final int STATE_GAL_E1BC_CODE_LOCK = 1024;
        public static final int STATE_GAL_E1C_2ND_CODE_LOCK = 2048;
        public static final int STATE_GAL_E1B_PAGE_SYNC = 4096;
        public static final int STATE_SBAS_SYNC = 8192;
        public static final int STATE_TOW_KNOWN = 16384;
        public static final int STATE_GLO_TOD_KNOWN = 32768;
        public static final int STATE_2ND_CODE_LOCK = 65536;
        public GnssMeasurementState() {}
        public static final java.lang.String toString(int p0) { return null; }
        public static final java.lang.String dumpBitfield(int p0) { return null; }
    }

    public static final class Proxy implements android.hardware.gnss.V2_0.IGnssMeasurementCallback {
        public Proxy(android.os.IHwBinder p0) {}
        public android.os.IHwBinder asBinder() { return null; }
        public java.lang.String toString() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public void GnssMeasurementCb(android.hardware.gnss.V1_0.IGnssMeasurementCallback.GnssData p0) throws android.os.RemoteException {}
        public void gnssMeasurementCb(android.hardware.gnss.V1_1.IGnssMeasurementCallback.GnssData p0) throws android.os.RemoteException {}
        public void gnssMeasurementCb_2_0(android.hardware.gnss.V2_0.IGnssMeasurementCallback.GnssData p0) throws android.os.RemoteException {}
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

    public static abstract class Stub extends android.os.HwBinder implements android.hardware.gnss.V2_0.IGnssMeasurementCallback {
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
