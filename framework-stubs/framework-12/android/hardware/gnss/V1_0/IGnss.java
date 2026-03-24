package android.hardware.gnss.V1_0;

public interface IGnss extends android.internal.hidl.base.V1_0.IBase {
    public static final java.lang.String kInterfaceName = "android.hardware.gnss@1.0::IGnss";
    public static android.hardware.gnss.V1_0.IGnss asInterface(android.os.IHwBinder p0) { return null; }
    public static android.hardware.gnss.V1_0.IGnss castFrom(android.os.IHwInterface p0) { return null; }
    public android.os.IHwBinder asBinder();
    public static android.hardware.gnss.V1_0.IGnss getService(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
    public static android.hardware.gnss.V1_0.IGnss getService(boolean p0) throws android.os.RemoteException { return null; }
    @java.lang.Deprecated
    public static android.hardware.gnss.V1_0.IGnss getService(java.lang.String p0) throws android.os.RemoteException { return null; }
    @java.lang.Deprecated
    public static android.hardware.gnss.V1_0.IGnss getService() throws android.os.RemoteException { return null; }
    public boolean setCallback(android.hardware.gnss.V1_0.IGnssCallback p0) throws android.os.RemoteException;
    public boolean start() throws android.os.RemoteException;
    public boolean stop() throws android.os.RemoteException;
    public void cleanup() throws android.os.RemoteException;
    public boolean injectTime(long p0, long p1, int p2) throws android.os.RemoteException;
    public boolean injectLocation(double p0, double p1, float p2) throws android.os.RemoteException;
    public void deleteAidingData(short p0) throws android.os.RemoteException;
    public boolean setPositionMode(byte p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public android.hardware.gnss.V1_0.IAGnssRil getExtensionAGnssRil() throws android.os.RemoteException;
    public android.hardware.gnss.V1_0.IGnssGeofencing getExtensionGnssGeofencing() throws android.os.RemoteException;
    public android.hardware.gnss.V1_0.IAGnss getExtensionAGnss() throws android.os.RemoteException;
    public android.hardware.gnss.V1_0.IGnssNi getExtensionGnssNi() throws android.os.RemoteException;
    public android.hardware.gnss.V1_0.IGnssMeasurement getExtensionGnssMeasurement() throws android.os.RemoteException;
    public android.hardware.gnss.V1_0.IGnssNavigationMessage getExtensionGnssNavigationMessage() throws android.os.RemoteException;
    public android.hardware.gnss.V1_0.IGnssXtra getExtensionXtra() throws android.os.RemoteException;
    public android.hardware.gnss.V1_0.IGnssConfiguration getExtensionGnssConfiguration() throws android.os.RemoteException;
    public android.hardware.gnss.V1_0.IGnssDebug getExtensionGnssDebug() throws android.os.RemoteException;
    public android.hardware.gnss.V1_0.IGnssBatching getExtensionGnssBatching() throws android.os.RemoteException;
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

    public static final class GnssAidingData {
        public static final short DELETE_EPHEMERIS = 1;
        public static final short DELETE_ALMANAC = 2;
        public static final short DELETE_POSITION = 4;
        public static final short DELETE_TIME = 8;
        public static final short DELETE_IONO = 16;
        public static final short DELETE_UTC = 32;
        public static final short DELETE_HEALTH = 64;
        public static final short DELETE_SVDIR = 128;
        public static final short DELETE_SVSTEER = 256;
        public static final short DELETE_SADATA = 512;
        public static final short DELETE_RTI = 1024;
        public static final short DELETE_CELLDB_INFO = -32768;
        public static final short DELETE_ALL = -1;
        public GnssAidingData() {}
        public static final java.lang.String toString(short p0) { return null; }
        public static final java.lang.String dumpBitfield(short p0) { return null; }
    }

    public static final class GnssPositionMode {
        public static final byte STANDALONE = 0;
        public static final byte MS_BASED = 1;
        public static final byte MS_ASSISTED = 2;
        public GnssPositionMode() {}
        public static final java.lang.String toString(byte p0) { return null; }
        public static final java.lang.String dumpBitfield(byte p0) { return null; }
    }

    public static final class GnssPositionRecurrence {
        public static final int RECURRENCE_PERIODIC = 0;
        public static final int RECURRENCE_SINGLE = 1;
        public GnssPositionRecurrence() {}
        public static final java.lang.String toString(int p0) { return null; }
        public static final java.lang.String dumpBitfield(int p0) { return null; }
    }

    public static final class Proxy implements android.hardware.gnss.V1_0.IGnss {
        private android.os.IHwBinder mRemote;
        public Proxy(android.os.IHwBinder p0) {}
        public android.os.IHwBinder asBinder() { return null; }
        public java.lang.String toString() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public boolean setCallback(android.hardware.gnss.V1_0.IGnssCallback p0) throws android.os.RemoteException { return false; }
        public boolean start() throws android.os.RemoteException { return false; }
        public boolean stop() throws android.os.RemoteException { return false; }
        public void cleanup() throws android.os.RemoteException {}
        public boolean injectTime(long p0, long p1, int p2) throws android.os.RemoteException { return false; }
        public boolean injectLocation(double p0, double p1, float p2) throws android.os.RemoteException { return false; }
        public void deleteAidingData(short p0) throws android.os.RemoteException {}
        public boolean setPositionMode(byte p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException { return false; }
        public android.hardware.gnss.V1_0.IAGnssRil getExtensionAGnssRil() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.V1_0.IGnssGeofencing getExtensionGnssGeofencing() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.V1_0.IAGnss getExtensionAGnss() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.V1_0.IGnssNi getExtensionGnssNi() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.V1_0.IGnssMeasurement getExtensionGnssMeasurement() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.V1_0.IGnssNavigationMessage getExtensionGnssNavigationMessage() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.V1_0.IGnssXtra getExtensionXtra() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.V1_0.IGnssConfiguration getExtensionGnssConfiguration() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.V1_0.IGnssDebug getExtensionGnssDebug() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.V1_0.IGnssBatching getExtensionGnssBatching() throws android.os.RemoteException { return null; }
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

    public static abstract class Stub extends android.os.HwBinder implements android.hardware.gnss.V1_0.IGnss {
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
