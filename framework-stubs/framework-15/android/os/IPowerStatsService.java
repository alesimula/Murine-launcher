package android.os;

public interface IPowerStatsService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IPowerStatsService";
    public static final java.lang.String KEY_MONITORS = "monitors";
    public static final java.lang.String KEY_ENERGY = "energy";
    public static final java.lang.String KEY_TIMESTAMPS = "timestamps";
    public static final int RESULT_SUCCESS = 0;
    public static final int RESULT_UNSUPPORTED_POWER_MONITOR = 1;
    public void getSupportedPowerMonitors(android.os.ResultReceiver p0) throws android.os.RemoteException;
    public void getPowerMonitorReadings(int[] p0, android.os.ResultReceiver p1) throws android.os.RemoteException;

    public static class Default implements android.os.IPowerStatsService {
        public Default() {}
        public void getSupportedPowerMonitors(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        public void getPowerMonitorReadings(int[] p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IPowerStatsService {
        static final int TRANSACTION_getSupportedPowerMonitors = 1;
        static final int TRANSACTION_getPowerMonitorReadings = 2;
        public Stub() { super(); }
        public static android.os.IPowerStatsService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IPowerStatsService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getSupportedPowerMonitors(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            public void getPowerMonitorReadings(int[] p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        }
    }
}
