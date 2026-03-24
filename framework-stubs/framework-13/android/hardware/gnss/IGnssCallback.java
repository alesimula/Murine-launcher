package android.hardware.gnss;

public interface IGnssCallback extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "fc957f1d3d261d065ff5e5415f2d21caa79c310f";
    public static final java.lang.String DESCRIPTOR = null;
    public static final int CAPABILITY_SCHEDULING = 1;
    public static final int CAPABILITY_MSB = 2;
    public static final int CAPABILITY_MSA = 4;
    public static final int CAPABILITY_SINGLE_SHOT = 8;
    public static final int CAPABILITY_ON_DEMAND_TIME = 16;
    public static final int CAPABILITY_GEOFENCING = 32;
    public static final int CAPABILITY_MEASUREMENTS = 64;
    public static final int CAPABILITY_NAV_MESSAGES = 128;
    public static final int CAPABILITY_LOW_POWER_MODE = 256;
    public static final int CAPABILITY_SATELLITE_BLOCKLIST = 512;
    public static final int CAPABILITY_MEASUREMENT_CORRECTIONS = 1024;
    public static final int CAPABILITY_ANTENNA_INFO = 2048;
    public static final int CAPABILITY_CORRELATION_VECTOR = 4096;
    public static final int CAPABILITY_SATELLITE_PVT = 8192;
    public static final int CAPABILITY_MEASUREMENT_CORRECTIONS_FOR_DRIVING = 16384;
    public void gnssSetCapabilitiesCb(int p0) throws android.os.RemoteException;
    public void gnssStatusCb(int p0) throws android.os.RemoteException;
    public void gnssSvStatusCb(android.hardware.gnss.IGnssCallback.GnssSvInfo[] p0) throws android.os.RemoteException;
    public void gnssLocationCb(android.hardware.gnss.GnssLocation p0) throws android.os.RemoteException;
    public void gnssNmeaCb(long p0, java.lang.String p1) throws android.os.RemoteException;
    public void gnssAcquireWakelockCb() throws android.os.RemoteException;
    public void gnssReleaseWakelockCb() throws android.os.RemoteException;
    public void gnssSetSystemInfoCb(android.hardware.gnss.IGnssCallback.GnssSystemInfo p0) throws android.os.RemoteException;
    public void gnssRequestTimeCb() throws android.os.RemoteException;
    public void gnssRequestLocationCb(boolean p0, boolean p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.gnss.IGnssCallback {
        public Default() {}
        public void gnssSetCapabilitiesCb(int p0) throws android.os.RemoteException {}
        public void gnssStatusCb(int p0) throws android.os.RemoteException {}
        public void gnssSvStatusCb(android.hardware.gnss.IGnssCallback.GnssSvInfo[] p0) throws android.os.RemoteException {}
        public void gnssLocationCb(android.hardware.gnss.GnssLocation p0) throws android.os.RemoteException {}
        public void gnssNmeaCb(long p0, java.lang.String p1) throws android.os.RemoteException {}
        public void gnssAcquireWakelockCb() throws android.os.RemoteException {}
        public void gnssReleaseWakelockCb() throws android.os.RemoteException {}
        public void gnssSetSystemInfoCb(android.hardware.gnss.IGnssCallback.GnssSystemInfo p0) throws android.os.RemoteException {}
        public void gnssRequestTimeCb() throws android.os.RemoteException {}
        public void gnssRequestLocationCb(boolean p0, boolean p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static @interface GnssStatusValue {
        public static final int NONE = 0;
        public static final int SESSION_BEGIN = 1;
        public static final int SESSION_END = 2;
        public static final int ENGINE_ON = 3;
        public static final int ENGINE_OFF = 4;
    }

    public static @interface GnssSvFlags {
        public static final int NONE = 0;
        public static final int HAS_EPHEMERIS_DATA = 1;
        public static final int HAS_ALMANAC_DATA = 2;
        public static final int USED_IN_FIX = 4;
        public static final int HAS_CARRIER_FREQUENCY = 8;
    }

    public static class GnssSvInfo implements android.os.Parcelable {
        public int svid;
        public int constellation;
        public float cN0Dbhz;
        public float basebandCN0DbHz;
        public float elevationDegrees;
        public float azimuthDegrees;
        public long carrierFrequencyHz;
        public int svFlag;
        public static final android.os.Parcelable.Creator<android.hardware.gnss.IGnssCallback.GnssSvInfo> CREATOR = null;
        public GnssSvInfo() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static class GnssSystemInfo implements android.os.Parcelable {
        public int yearOfHw;
        public java.lang.String name;
        public static final android.os.Parcelable.Creator<android.hardware.gnss.IGnssCallback.GnssSystemInfo> CREATOR = null;
        public GnssSystemInfo() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.IGnssCallback {
        static final int TRANSACTION_gnssSetCapabilitiesCb = 1;
        static final int TRANSACTION_gnssStatusCb = 2;
        static final int TRANSACTION_gnssSvStatusCb = 3;
        static final int TRANSACTION_gnssLocationCb = 4;
        static final int TRANSACTION_gnssNmeaCb = 5;
        static final int TRANSACTION_gnssAcquireWakelockCb = 6;
        static final int TRANSACTION_gnssReleaseWakelockCb = 7;
        static final int TRANSACTION_gnssSetSystemInfoCb = 8;
        static final int TRANSACTION_gnssRequestTimeCb = 9;
        static final int TRANSACTION_gnssRequestLocationCb = 10;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.gnss.IGnssCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.gnss.IGnssCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void gnssSetCapabilitiesCb(int p0) throws android.os.RemoteException {}
            public void gnssStatusCb(int p0) throws android.os.RemoteException {}
            public void gnssSvStatusCb(android.hardware.gnss.IGnssCallback.GnssSvInfo[] p0) throws android.os.RemoteException {}
            public void gnssLocationCb(android.hardware.gnss.GnssLocation p0) throws android.os.RemoteException {}
            public void gnssNmeaCb(long p0, java.lang.String p1) throws android.os.RemoteException {}
            public void gnssAcquireWakelockCb() throws android.os.RemoteException {}
            public void gnssReleaseWakelockCb() throws android.os.RemoteException {}
            public void gnssSetSystemInfoCb(android.hardware.gnss.IGnssCallback.GnssSystemInfo p0) throws android.os.RemoteException {}
            public void gnssRequestTimeCb() throws android.os.RemoteException {}
            public void gnssRequestLocationCb(boolean p0, boolean p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
