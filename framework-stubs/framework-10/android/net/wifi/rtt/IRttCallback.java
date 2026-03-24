package android.net.wifi.rtt;

public interface IRttCallback extends android.os.IInterface {
    public void onRangingFailure(int p0) throws android.os.RemoteException;
    public void onRangingResults(java.util.List<android.net.wifi.rtt.RangingResult> p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.rtt.IRttCallback {
        private static final java.lang.String DESCRIPTOR = "android.net.wifi.rtt.IRttCallback";
        static final int TRANSACTION_onRangingFailure = 1;
        static final int TRANSACTION_onRangingResults = 2;
        public Stub() { super(); }
        public static android.net.wifi.rtt.IRttCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.wifi.rtt.IRttCallback p0) { return false; }
        public static android.net.wifi.rtt.IRttCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.net.wifi.rtt.IRttCallback {
            private android.os.IBinder mRemote;
            public static android.net.wifi.rtt.IRttCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onRangingFailure(int p0) throws android.os.RemoteException {}
            public void onRangingResults(java.util.List<android.net.wifi.rtt.RangingResult> p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.net.wifi.rtt.IRttCallback {
        public Default() {}
        public void onRangingFailure(int p0) throws android.os.RemoteException {}
        public void onRangingResults(java.util.List<android.net.wifi.rtt.RangingResult> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
