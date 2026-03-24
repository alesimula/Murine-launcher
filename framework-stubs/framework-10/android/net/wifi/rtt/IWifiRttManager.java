package android.net.wifi.rtt;

public interface IWifiRttManager extends android.os.IInterface {
    public boolean isAvailable() throws android.os.RemoteException;
    public void startRanging(android.os.IBinder p0, java.lang.String p1, android.os.WorkSource p2, android.net.wifi.rtt.RangingRequest p3, android.net.wifi.rtt.IRttCallback p4) throws android.os.RemoteException;
    public void cancelRanging(android.os.WorkSource p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.rtt.IWifiRttManager {
        private static final java.lang.String DESCRIPTOR = "android.net.wifi.rtt.IWifiRttManager";
        static final int TRANSACTION_isAvailable = 1;
        static final int TRANSACTION_startRanging = 2;
        static final int TRANSACTION_cancelRanging = 3;
        public Stub() { super(); }
        public static android.net.wifi.rtt.IWifiRttManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.wifi.rtt.IWifiRttManager p0) { return false; }
        public static android.net.wifi.rtt.IWifiRttManager getDefaultImpl() { return null; }

        private static class Proxy implements android.net.wifi.rtt.IWifiRttManager {
            private android.os.IBinder mRemote;
            public static android.net.wifi.rtt.IWifiRttManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isAvailable() throws android.os.RemoteException { return false; }
            public void startRanging(android.os.IBinder p0, java.lang.String p1, android.os.WorkSource p2, android.net.wifi.rtt.RangingRequest p3, android.net.wifi.rtt.IRttCallback p4) throws android.os.RemoteException {}
            public void cancelRanging(android.os.WorkSource p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.net.wifi.rtt.IWifiRttManager {
        public Default() {}
        public boolean isAvailable() throws android.os.RemoteException { return false; }
        public void startRanging(android.os.IBinder p0, java.lang.String p1, android.os.WorkSource p2, android.net.wifi.rtt.RangingRequest p3, android.net.wifi.rtt.IRttCallback p4) throws android.os.RemoteException {}
        public void cancelRanging(android.os.WorkSource p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
