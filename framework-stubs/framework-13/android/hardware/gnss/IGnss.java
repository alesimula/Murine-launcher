package android.hardware.gnss;

public interface IGnss extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "fc957f1d3d261d065ff5e5415f2d21caa79c310f";
    public static final java.lang.String DESCRIPTOR = null;
    public static final int ERROR_INVALID_ARGUMENT = 1;
    public static final int ERROR_ALREADY_INIT = 2;
    public static final int ERROR_GENERIC = 3;
    public void setCallback(android.hardware.gnss.IGnssCallback p0) throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public android.hardware.gnss.IGnssPsds getExtensionPsds() throws android.os.RemoteException;
    public android.hardware.gnss.IGnssConfiguration getExtensionGnssConfiguration() throws android.os.RemoteException;
    public android.hardware.gnss.IGnssMeasurementInterface getExtensionGnssMeasurement() throws android.os.RemoteException;
    public android.hardware.gnss.IGnssPowerIndication getExtensionGnssPowerIndication() throws android.os.RemoteException;
    public android.hardware.gnss.IGnssBatching getExtensionGnssBatching() throws android.os.RemoteException;
    public android.hardware.gnss.IGnssGeofence getExtensionGnssGeofence() throws android.os.RemoteException;
    public android.hardware.gnss.IGnssNavigationMessageInterface getExtensionGnssNavigationMessage() throws android.os.RemoteException;
    public android.hardware.gnss.IAGnss getExtensionAGnss() throws android.os.RemoteException;
    public android.hardware.gnss.IAGnssRil getExtensionAGnssRil() throws android.os.RemoteException;
    public android.hardware.gnss.IGnssDebug getExtensionGnssDebug() throws android.os.RemoteException;
    public android.hardware.gnss.visibility_control.IGnssVisibilityControl getExtensionGnssVisibilityControl() throws android.os.RemoteException;
    public void start() throws android.os.RemoteException;
    public void stop() throws android.os.RemoteException;
    public void injectTime(long p0, long p1, int p2) throws android.os.RemoteException;
    public void injectLocation(android.hardware.gnss.GnssLocation p0) throws android.os.RemoteException;
    public void injectBestLocation(android.hardware.gnss.GnssLocation p0) throws android.os.RemoteException;
    public void deleteAidingData(int p0) throws android.os.RemoteException;
    public void setPositionMode(android.hardware.gnss.IGnss.PositionModeOptions p0) throws android.os.RemoteException;
    public android.hardware.gnss.IGnssAntennaInfo getExtensionGnssAntennaInfo() throws android.os.RemoteException;
    public android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsInterface getExtensionMeasurementCorrections() throws android.os.RemoteException;
    public void startSvStatus() throws android.os.RemoteException;
    public void stopSvStatus() throws android.os.RemoteException;
    public void startNmea() throws android.os.RemoteException;
    public void stopNmea() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.gnss.IGnss {
        public Default() {}
        public void setCallback(android.hardware.gnss.IGnssCallback p0) throws android.os.RemoteException {}
        public void close() throws android.os.RemoteException {}
        public android.hardware.gnss.IGnssPsds getExtensionPsds() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.IGnssConfiguration getExtensionGnssConfiguration() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.IGnssMeasurementInterface getExtensionGnssMeasurement() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.IGnssPowerIndication getExtensionGnssPowerIndication() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.IGnssBatching getExtensionGnssBatching() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.IGnssGeofence getExtensionGnssGeofence() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.IGnssNavigationMessageInterface getExtensionGnssNavigationMessage() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.IAGnss getExtensionAGnss() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.IAGnssRil getExtensionAGnssRil() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.IGnssDebug getExtensionGnssDebug() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.visibility_control.IGnssVisibilityControl getExtensionGnssVisibilityControl() throws android.os.RemoteException { return null; }
        public void start() throws android.os.RemoteException {}
        public void stop() throws android.os.RemoteException {}
        public void injectTime(long p0, long p1, int p2) throws android.os.RemoteException {}
        public void injectLocation(android.hardware.gnss.GnssLocation p0) throws android.os.RemoteException {}
        public void injectBestLocation(android.hardware.gnss.GnssLocation p0) throws android.os.RemoteException {}
        public void deleteAidingData(int p0) throws android.os.RemoteException {}
        public void setPositionMode(android.hardware.gnss.IGnss.PositionModeOptions p0) throws android.os.RemoteException {}
        public android.hardware.gnss.IGnssAntennaInfo getExtensionGnssAntennaInfo() throws android.os.RemoteException { return null; }
        public android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsInterface getExtensionMeasurementCorrections() throws android.os.RemoteException { return null; }
        public void startSvStatus() throws android.os.RemoteException {}
        public void stopSvStatus() throws android.os.RemoteException {}
        public void startNmea() throws android.os.RemoteException {}
        public void stopNmea() throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static @interface GnssAidingData {
        public static final int EPHEMERIS = 1;
        public static final int ALMANAC = 2;
        public static final int POSITION = 4;
        public static final int TIME = 8;
        public static final int IONO = 16;
        public static final int UTC = 32;
        public static final int HEALTH = 64;
        public static final int SVDIR = 128;
        public static final int SVSTEER = 256;
        public static final int SADATA = 512;
        public static final int RTI = 1024;
        public static final int CELLDB_INFO = 32768;
        public static final int ALL = 65535;
    }

    public static @interface GnssPositionMode {
        public static final int STANDALONE = 0;
        public static final int MS_BASED = 1;
        public static final int MS_ASSISTED = 2;
    }

    public static @interface GnssPositionRecurrence {
        public static final int RECURRENCE_PERIODIC = 0;
        public static final int RECURRENCE_SINGLE = 1;
    }

    public static class PositionModeOptions implements android.os.Parcelable {
        public int mode;
        public int recurrence;
        public int minIntervalMs;
        public int preferredAccuracyMeters;
        public int preferredTimeMs;
        public boolean lowPowerMode;
        public static final android.os.Parcelable.Creator<android.hardware.gnss.IGnss.PositionModeOptions> CREATOR = null;
        public PositionModeOptions() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.IGnss {
        static final int TRANSACTION_setCallback = 1;
        static final int TRANSACTION_close = 2;
        static final int TRANSACTION_getExtensionPsds = 3;
        static final int TRANSACTION_getExtensionGnssConfiguration = 4;
        static final int TRANSACTION_getExtensionGnssMeasurement = 5;
        static final int TRANSACTION_getExtensionGnssPowerIndication = 6;
        static final int TRANSACTION_getExtensionGnssBatching = 7;
        static final int TRANSACTION_getExtensionGnssGeofence = 8;
        static final int TRANSACTION_getExtensionGnssNavigationMessage = 9;
        static final int TRANSACTION_getExtensionAGnss = 10;
        static final int TRANSACTION_getExtensionAGnssRil = 11;
        static final int TRANSACTION_getExtensionGnssDebug = 12;
        static final int TRANSACTION_getExtensionGnssVisibilityControl = 13;
        static final int TRANSACTION_start = 14;
        static final int TRANSACTION_stop = 15;
        static final int TRANSACTION_injectTime = 16;
        static final int TRANSACTION_injectLocation = 17;
        static final int TRANSACTION_injectBestLocation = 18;
        static final int TRANSACTION_deleteAidingData = 19;
        static final int TRANSACTION_setPositionMode = 20;
        static final int TRANSACTION_getExtensionGnssAntennaInfo = 21;
        static final int TRANSACTION_getExtensionMeasurementCorrections = 22;
        static final int TRANSACTION_startSvStatus = 23;
        static final int TRANSACTION_stopSvStatus = 24;
        static final int TRANSACTION_startNmea = 25;
        static final int TRANSACTION_stopNmea = 26;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.gnss.IGnss asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.gnss.IGnss {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setCallback(android.hardware.gnss.IGnssCallback p0) throws android.os.RemoteException {}
            public void close() throws android.os.RemoteException {}
            public android.hardware.gnss.IGnssPsds getExtensionPsds() throws android.os.RemoteException { return null; }
            public android.hardware.gnss.IGnssConfiguration getExtensionGnssConfiguration() throws android.os.RemoteException { return null; }
            public android.hardware.gnss.IGnssMeasurementInterface getExtensionGnssMeasurement() throws android.os.RemoteException { return null; }
            public android.hardware.gnss.IGnssPowerIndication getExtensionGnssPowerIndication() throws android.os.RemoteException { return null; }
            public android.hardware.gnss.IGnssBatching getExtensionGnssBatching() throws android.os.RemoteException { return null; }
            public android.hardware.gnss.IGnssGeofence getExtensionGnssGeofence() throws android.os.RemoteException { return null; }
            public android.hardware.gnss.IGnssNavigationMessageInterface getExtensionGnssNavigationMessage() throws android.os.RemoteException { return null; }
            public android.hardware.gnss.IAGnss getExtensionAGnss() throws android.os.RemoteException { return null; }
            public android.hardware.gnss.IAGnssRil getExtensionAGnssRil() throws android.os.RemoteException { return null; }
            public android.hardware.gnss.IGnssDebug getExtensionGnssDebug() throws android.os.RemoteException { return null; }
            public android.hardware.gnss.visibility_control.IGnssVisibilityControl getExtensionGnssVisibilityControl() throws android.os.RemoteException { return null; }
            public void start() throws android.os.RemoteException {}
            public void stop() throws android.os.RemoteException {}
            public void injectTime(long p0, long p1, int p2) throws android.os.RemoteException {}
            public void injectLocation(android.hardware.gnss.GnssLocation p0) throws android.os.RemoteException {}
            public void injectBestLocation(android.hardware.gnss.GnssLocation p0) throws android.os.RemoteException {}
            public void deleteAidingData(int p0) throws android.os.RemoteException {}
            public void setPositionMode(android.hardware.gnss.IGnss.PositionModeOptions p0) throws android.os.RemoteException {}
            public android.hardware.gnss.IGnssAntennaInfo getExtensionGnssAntennaInfo() throws android.os.RemoteException { return null; }
            public android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsInterface getExtensionMeasurementCorrections() throws android.os.RemoteException { return null; }
            public void startSvStatus() throws android.os.RemoteException {}
            public void stopSvStatus() throws android.os.RemoteException {}
            public void startNmea() throws android.os.RemoteException {}
            public void stopNmea() throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
