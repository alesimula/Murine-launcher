package android.app.timezonedetector;

public interface ITimeZoneDetectorService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.timezonedetector.ITimeZoneDetectorService";
    public android.app.time.TimeZoneCapabilitiesAndConfig getCapabilitiesAndConfig() throws android.os.RemoteException;
    public void addListener(android.app.time.ITimeZoneDetectorListener p0) throws android.os.RemoteException;
    public void removeListener(android.app.time.ITimeZoneDetectorListener p0) throws android.os.RemoteException;
    public boolean updateConfiguration(android.app.time.TimeZoneConfiguration p0) throws android.os.RemoteException;
    public boolean suggestManualTimeZone(android.app.timezonedetector.ManualTimeZoneSuggestion p0) throws android.os.RemoteException;
    public void suggestTelephonyTimeZone(android.app.timezonedetector.TelephonyTimeZoneSuggestion p0) throws android.os.RemoteException;

    public static class Default implements android.app.timezonedetector.ITimeZoneDetectorService {
        public Default() {}
        public android.app.time.TimeZoneCapabilitiesAndConfig getCapabilitiesAndConfig() throws android.os.RemoteException { return null; }
        public void addListener(android.app.time.ITimeZoneDetectorListener p0) throws android.os.RemoteException {}
        public void removeListener(android.app.time.ITimeZoneDetectorListener p0) throws android.os.RemoteException {}
        public boolean updateConfiguration(android.app.time.TimeZoneConfiguration p0) throws android.os.RemoteException { return false; }
        public boolean suggestManualTimeZone(android.app.timezonedetector.ManualTimeZoneSuggestion p0) throws android.os.RemoteException { return false; }
        public void suggestTelephonyTimeZone(android.app.timezonedetector.TelephonyTimeZoneSuggestion p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.timezonedetector.ITimeZoneDetectorService {
        static final int TRANSACTION_getCapabilitiesAndConfig = 1;
        static final int TRANSACTION_addListener = 2;
        static final int TRANSACTION_removeListener = 3;
        static final int TRANSACTION_updateConfiguration = 4;
        static final int TRANSACTION_suggestManualTimeZone = 5;
        static final int TRANSACTION_suggestTelephonyTimeZone = 6;
        public Stub() { super(); }
        public static android.app.timezonedetector.ITimeZoneDetectorService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.timezonedetector.ITimeZoneDetectorService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.app.time.TimeZoneCapabilitiesAndConfig getCapabilitiesAndConfig() throws android.os.RemoteException { return null; }
            public void addListener(android.app.time.ITimeZoneDetectorListener p0) throws android.os.RemoteException {}
            public void removeListener(android.app.time.ITimeZoneDetectorListener p0) throws android.os.RemoteException {}
            public boolean updateConfiguration(android.app.time.TimeZoneConfiguration p0) throws android.os.RemoteException { return false; }
            public boolean suggestManualTimeZone(android.app.timezonedetector.ManualTimeZoneSuggestion p0) throws android.os.RemoteException { return false; }
            public void suggestTelephonyTimeZone(android.app.timezonedetector.TelephonyTimeZoneSuggestion p0) throws android.os.RemoteException {}
        }
    }
}
