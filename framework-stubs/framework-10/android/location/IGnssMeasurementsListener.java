package android.location;

public interface IGnssMeasurementsListener extends android.os.IInterface {
    public void onGnssMeasurementsReceived(android.location.GnssMeasurementsEvent p0) throws android.os.RemoteException;
    public void onStatusChanged(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.location.IGnssMeasurementsListener {
        private static final java.lang.String DESCRIPTOR = "android.location.IGnssMeasurementsListener";
        static final int TRANSACTION_onGnssMeasurementsReceived = 1;
        static final int TRANSACTION_onStatusChanged = 2;
        public Stub() { super(); }
        public static android.location.IGnssMeasurementsListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.location.IGnssMeasurementsListener p0) { return false; }
        public static android.location.IGnssMeasurementsListener getDefaultImpl() { return null; }

        private static class Proxy implements android.location.IGnssMeasurementsListener {
            private android.os.IBinder mRemote;
            public static android.location.IGnssMeasurementsListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onGnssMeasurementsReceived(android.location.GnssMeasurementsEvent p0) throws android.os.RemoteException {}
            public void onStatusChanged(int p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.location.IGnssMeasurementsListener {
        public Default() {}
        public void onGnssMeasurementsReceived(android.location.GnssMeasurementsEvent p0) throws android.os.RemoteException {}
        public void onStatusChanged(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
