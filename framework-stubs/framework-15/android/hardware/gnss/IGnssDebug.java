package android.hardware.gnss;

public interface IGnssDebug extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "fc957f1d3d261d065ff5e5415f2d21caa79c310f";
    public static final java.lang.String DESCRIPTOR = null;
    public android.hardware.gnss.IGnssDebug.DebugData getDebugData() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class DebugData implements android.os.Parcelable {
        public android.hardware.gnss.IGnssDebug.PositionDebug position;
        public android.hardware.gnss.IGnssDebug.TimeDebug time;
        public java.util.List<android.hardware.gnss.IGnssDebug.SatelliteData> satelliteDataArray;
        public static final android.os.Parcelable.Creator<android.hardware.gnss.IGnssDebug.DebugData> CREATOR = null;
        public DebugData() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static class Default implements android.hardware.gnss.IGnssDebug {
        public Default() {}
        public android.hardware.gnss.IGnssDebug.DebugData getDebugData() throws android.os.RemoteException { return null; }
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static class PositionDebug implements android.os.Parcelable {
        public boolean valid;
        public double latitudeDegrees;
        public double longitudeDegrees;
        public float altitudeMeters;
        public float speedMetersPerSec;
        public float bearingDegrees;
        public double horizontalAccuracyMeters;
        public double verticalAccuracyMeters;
        public double speedAccuracyMetersPerSecond;
        public double bearingAccuracyDegrees;
        public float ageSeconds;
        public static final android.os.Parcelable.Creator<android.hardware.gnss.IGnssDebug.PositionDebug> CREATOR = null;
        public PositionDebug() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static class SatelliteData implements android.os.Parcelable {
        public int svid;
        public int constellation;
        public int ephemerisType;
        public int ephemerisSource;
        public int ephemerisHealth;
        public float ephemerisAgeSeconds;
        public boolean serverPredictionIsAvailable;
        public float serverPredictionAgeSeconds;
        public static final android.os.Parcelable.Creator<android.hardware.gnss.IGnssDebug.SatelliteData> CREATOR = null;
        public SatelliteData() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static @interface SatelliteEphemerisHealth {
        public static final int GOOD = 0;
        public static final int BAD = 1;
        public static final int UNKNOWN = 2;
    }

    public static @interface SatelliteEphemerisType {
        public static final int EPHEMERIS = 0;
        public static final int ALMANAC_ONLY = 1;
        public static final int NOT_AVAILABLE = 2;
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.IGnssDebug {
        static final int TRANSACTION_getDebugData = 1;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.gnss.IGnssDebug asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.gnss.IGnssDebug {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.gnss.IGnssDebug.DebugData getDebugData() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }

    public static class TimeDebug implements android.os.Parcelable {
        public long timeEstimateMs;
        public float timeUncertaintyNs;
        public float frequencyUncertaintyNsPerSec;
        public static final android.os.Parcelable.Creator<android.hardware.gnss.IGnssDebug.TimeDebug> CREATOR = null;
        public TimeDebug() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }
}
