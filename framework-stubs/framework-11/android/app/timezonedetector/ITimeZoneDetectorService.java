package android.app.timezonedetector;

public interface ITimeZoneDetectorService extends android.os.IInterface {
    public void suggestManualTimeZone(android.app.timezonedetector.ManualTimeZoneSuggestion p0) throws android.os.RemoteException;
    public void suggestTelephonyTimeZone(android.app.timezonedetector.TelephonyTimeZoneSuggestion p0) throws android.os.RemoteException;

    public static class Default implements android.app.timezonedetector.ITimeZoneDetectorService {
        public Default() {}
        public void suggestManualTimeZone(android.app.timezonedetector.ManualTimeZoneSuggestion p0) throws android.os.RemoteException {}
        public void suggestTelephonyTimeZone(android.app.timezonedetector.TelephonyTimeZoneSuggestion p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.timezonedetector.ITimeZoneDetectorService {
        private static final java.lang.String DESCRIPTOR = "android.app.timezonedetector.ITimeZoneDetectorService";
        static final int TRANSACTION_suggestManualTimeZone = 1;
        static final int TRANSACTION_suggestTelephonyTimeZone = 2;
        public Stub() { super(); }
        public static android.app.timezonedetector.ITimeZoneDetectorService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.timezonedetector.ITimeZoneDetectorService p0) { return false; }
        public static android.app.timezonedetector.ITimeZoneDetectorService getDefaultImpl() { return null; }

        private static class Proxy implements android.app.timezonedetector.ITimeZoneDetectorService {
            private android.os.IBinder mRemote;
            public static android.app.timezonedetector.ITimeZoneDetectorService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void suggestManualTimeZone(android.app.timezonedetector.ManualTimeZoneSuggestion p0) throws android.os.RemoteException {}
            public void suggestTelephonyTimeZone(android.app.timezonedetector.TelephonyTimeZoneSuggestion p0) throws android.os.RemoteException {}
        }
    }
}
