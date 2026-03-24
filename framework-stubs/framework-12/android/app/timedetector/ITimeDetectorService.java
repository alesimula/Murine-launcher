package android.app.timedetector;

public interface ITimeDetectorService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.timedetector.ITimeDetectorService";
    public android.app.time.TimeCapabilitiesAndConfig getCapabilitiesAndConfig() throws android.os.RemoteException;
    public boolean updateConfiguration(android.app.time.TimeConfiguration p0) throws android.os.RemoteException;
    public void suggestExternalTime(android.app.time.ExternalTimeSuggestion p0) throws android.os.RemoteException;
    public void suggestGnssTime(android.app.timedetector.GnssTimeSuggestion p0) throws android.os.RemoteException;
    public boolean suggestManualTime(android.app.timedetector.ManualTimeSuggestion p0) throws android.os.RemoteException;
    public void suggestNetworkTime(android.app.timedetector.NetworkTimeSuggestion p0) throws android.os.RemoteException;
    public void suggestTelephonyTime(android.app.timedetector.TelephonyTimeSuggestion p0) throws android.os.RemoteException;

    public static class Default implements android.app.timedetector.ITimeDetectorService {
        public Default() {}
        public android.app.time.TimeCapabilitiesAndConfig getCapabilitiesAndConfig() throws android.os.RemoteException { return null; }
        public boolean updateConfiguration(android.app.time.TimeConfiguration p0) throws android.os.RemoteException { return false; }
        public void suggestExternalTime(android.app.time.ExternalTimeSuggestion p0) throws android.os.RemoteException {}
        public void suggestGnssTime(android.app.timedetector.GnssTimeSuggestion p0) throws android.os.RemoteException {}
        public boolean suggestManualTime(android.app.timedetector.ManualTimeSuggestion p0) throws android.os.RemoteException { return false; }
        public void suggestNetworkTime(android.app.timedetector.NetworkTimeSuggestion p0) throws android.os.RemoteException {}
        public void suggestTelephonyTime(android.app.timedetector.TelephonyTimeSuggestion p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.timedetector.ITimeDetectorService {
        static final int TRANSACTION_getCapabilitiesAndConfig = 1;
        static final int TRANSACTION_updateConfiguration = 2;
        static final int TRANSACTION_suggestExternalTime = 3;
        static final int TRANSACTION_suggestGnssTime = 4;
        static final int TRANSACTION_suggestManualTime = 5;
        static final int TRANSACTION_suggestNetworkTime = 6;
        static final int TRANSACTION_suggestTelephonyTime = 7;
        public Stub() { super(); }
        public static android.app.timedetector.ITimeDetectorService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.timedetector.ITimeDetectorService p0) { return false; }
        public static android.app.timedetector.ITimeDetectorService getDefaultImpl() { return null; }

        private static class Proxy implements android.app.timedetector.ITimeDetectorService {
            private android.os.IBinder mRemote;
            public static android.app.timedetector.ITimeDetectorService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.app.time.TimeCapabilitiesAndConfig getCapabilitiesAndConfig() throws android.os.RemoteException { return null; }
            public boolean updateConfiguration(android.app.time.TimeConfiguration p0) throws android.os.RemoteException { return false; }
            public void suggestExternalTime(android.app.time.ExternalTimeSuggestion p0) throws android.os.RemoteException {}
            public void suggestGnssTime(android.app.timedetector.GnssTimeSuggestion p0) throws android.os.RemoteException {}
            public boolean suggestManualTime(android.app.timedetector.ManualTimeSuggestion p0) throws android.os.RemoteException { return false; }
            public void suggestNetworkTime(android.app.timedetector.NetworkTimeSuggestion p0) throws android.os.RemoteException {}
            public void suggestTelephonyTime(android.app.timedetector.TelephonyTimeSuggestion p0) throws android.os.RemoteException {}
        }
    }
}
