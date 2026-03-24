package android.net.wifi.nl80211;

public interface IPnoScanEvent extends android.os.IInterface {
    public void OnPnoNetworkFound() throws android.os.RemoteException;
    public void OnPnoScanFailed() throws android.os.RemoteException;

    public static class Default implements android.net.wifi.nl80211.IPnoScanEvent {
        public Default() {}
        public void OnPnoNetworkFound() throws android.os.RemoteException {}
        public void OnPnoScanFailed() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.nl80211.IPnoScanEvent {
        private static final java.lang.String DESCRIPTOR = "android.net.wifi.nl80211.IPnoScanEvent";
        static final int TRANSACTION_OnPnoNetworkFound = 1;
        static final int TRANSACTION_OnPnoScanFailed = 2;
        public Stub() { super(); }
        public static android.net.wifi.nl80211.IPnoScanEvent asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.wifi.nl80211.IPnoScanEvent p0) { return false; }
        public static android.net.wifi.nl80211.IPnoScanEvent getDefaultImpl() { return null; }

        private static class Proxy implements android.net.wifi.nl80211.IPnoScanEvent {
            private android.os.IBinder mRemote;
            public static android.net.wifi.nl80211.IPnoScanEvent sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void OnPnoNetworkFound() throws android.os.RemoteException {}
            public void OnPnoScanFailed() throws android.os.RemoteException {}
        }
    }
}
