package android.hardware.gnss.V2_0;

public interface IGnssCallback extends android.hardware.gnss.V1_1.IGnssCallback {
    public static final java.lang.String kInterfaceName = "android.hardware.gnss@2.0::IGnssCallback";
    public static android.hardware.gnss.V2_0.IGnssCallback asInterface(android.os.IHwBinder p0) { return null; }
    public static android.hardware.gnss.V2_0.IGnssCallback castFrom(android.os.IHwInterface p0) { return null; }
    public android.os.IHwBinder asBinder();
    public static android.hardware.gnss.V2_0.IGnssCallback getService(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
    public static android.hardware.gnss.V2_0.IGnssCallback getService(boolean p0) throws android.os.RemoteException { return null; }
    public static android.hardware.gnss.V2_0.IGnssCallback getService(java.lang.String p0) throws android.os.RemoteException { return null; }
    public static android.hardware.gnss.V2_0.IGnssCallback getService() throws android.os.RemoteException { return null; }
    public void gnssSetCapabilitiesCb_2_0(int p0) throws android.os.RemoteException;
    public void gnssLocationCb_2_0(android.hardware.gnss.V2_0.GnssLocation p0) throws android.os.RemoteException;
    public void gnssRequestLocationCb_2_0(boolean p0, boolean p1) throws android.os.RemoteException;
    public void gnssSvStatusCb_2_0(java.util.ArrayList<android.hardware.gnss.V2_0.IGnssCallback.GnssSvInfo> p0) throws android.os.RemoteException;
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

    public static final class Capabilities {
        public static final int SCHEDULING = 1;
        public static final int MSB = 2;
        public static final int MSA = 4;
        public static final int SINGLE_SHOT = 8;
        public static final int ON_DEMAND_TIME = 16;
        public static final int GEOFENCING = 32;
        public static final int MEASUREMENTS = 64;
        public static final int NAV_MESSAGES = 128;
        public static final int LOW_POWER_MODE = 256;
        public static final int SATELLITE_BLACKLIST = 512;
        public static final int MEASUREMENT_CORRECTIONS = 1024;
        public Capabilities() {}
        public static final java.lang.String toString(int p0) { return null; }
        public static final java.lang.String dumpBitfield(int p0) { return null; }
    }

    public static final class GnssSvInfo {
        public android.hardware.gnss.V1_0.IGnssCallback.GnssSvInfo v1_0;
        public byte constellation;
        public GnssSvInfo() {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
        public final void readFromParcel(android.os.HwParcel p0) {}
        public static final java.util.ArrayList<android.hardware.gnss.V2_0.IGnssCallback.GnssSvInfo> readVectorFromParcel(android.os.HwParcel p0) { return null; }
        public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
        public final void writeToParcel(android.os.HwParcel p0) {}
        public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.gnss.V2_0.IGnssCallback.GnssSvInfo> p1) {}
        public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
    }

    public static final class Proxy implements android.hardware.gnss.V2_0.IGnssCallback {
        private android.os.IHwBinder mRemote;
        public Proxy(android.os.IHwBinder p0) {}
        public android.os.IHwBinder asBinder() { return null; }
        public java.lang.String toString() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public void gnssLocationCb(android.hardware.gnss.V1_0.GnssLocation p0) throws android.os.RemoteException {}
        public void gnssStatusCb(byte p0) throws android.os.RemoteException {}
        public void gnssSvStatusCb(android.hardware.gnss.V1_0.IGnssCallback.GnssSvStatus p0) throws android.os.RemoteException {}
        public void gnssNmeaCb(long p0, java.lang.String p1) throws android.os.RemoteException {}
        public void gnssSetCapabilitesCb(int p0) throws android.os.RemoteException {}
        public void gnssAcquireWakelockCb() throws android.os.RemoteException {}
        public void gnssReleaseWakelockCb() throws android.os.RemoteException {}
        public void gnssRequestTimeCb() throws android.os.RemoteException {}
        public void gnssSetSystemInfoCb(android.hardware.gnss.V1_0.IGnssCallback.GnssSystemInfo p0) throws android.os.RemoteException {}
        public void gnssNameCb(java.lang.String p0) throws android.os.RemoteException {}
        public void gnssRequestLocationCb(boolean p0) throws android.os.RemoteException {}
        public void gnssSetCapabilitiesCb_2_0(int p0) throws android.os.RemoteException {}
        public void gnssLocationCb_2_0(android.hardware.gnss.V2_0.GnssLocation p0) throws android.os.RemoteException {}
        public void gnssRequestLocationCb_2_0(boolean p0, boolean p1) throws android.os.RemoteException {}
        public void gnssSvStatusCb_2_0(java.util.ArrayList<android.hardware.gnss.V2_0.IGnssCallback.GnssSvInfo> p0) throws android.os.RemoteException {}
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

    public static abstract class Stub extends android.os.HwBinder implements android.hardware.gnss.V2_0.IGnssCallback {
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
