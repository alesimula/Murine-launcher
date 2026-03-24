package android.net.wifi.nl80211;

public interface IScanEvent extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.wifi.nl80211.IScanEvent";
    public void OnScanResultReady() throws android.os.RemoteException;
    public void OnScanFailed() throws android.os.RemoteException;
    public void OnScanRequestFailed(int p0) throws android.os.RemoteException;

    public static class Default implements android.net.wifi.nl80211.IScanEvent {
        public Default() {}
        public void OnScanResultReady() throws android.os.RemoteException {}
        public void OnScanFailed() throws android.os.RemoteException {}
        public void OnScanRequestFailed(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.nl80211.IScanEvent {
        static final int TRANSACTION_OnScanResultReady = 1;
        static final int TRANSACTION_OnScanFailed = 2;
        static final int TRANSACTION_OnScanRequestFailed = 3;
        public Stub() { super(); }
        public static android.net.wifi.nl80211.IScanEvent asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.net.wifi.nl80211.IScanEvent {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void OnScanResultReady() throws android.os.RemoteException {}
            public void OnScanFailed() throws android.os.RemoteException {}
            public void OnScanRequestFailed(int p0) throws android.os.RemoteException {}
        }
    }
}
