package android.location;

public interface IGnssNmeaListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.location.IGnssNmeaListener";
    public void onNmeaReceived(long p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.location.IGnssNmeaListener {
        public Default() {}
        public void onNmeaReceived(long p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.location.IGnssNmeaListener {
        static final int TRANSACTION_onNmeaReceived = 1;
        public Stub() { super(); }
        public static android.location.IGnssNmeaListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.location.IGnssNmeaListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onNmeaReceived(long p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }
}
