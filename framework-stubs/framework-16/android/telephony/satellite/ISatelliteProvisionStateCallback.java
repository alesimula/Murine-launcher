package android.telephony.satellite;

public interface ISatelliteProvisionStateCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.satellite.ISatelliteProvisionStateCallback";
    public void onSatelliteProvisionStateChanged(boolean p0) throws android.os.RemoteException;
    public void onSatelliteSubscriptionProvisionStateChanged(java.util.List<android.telephony.satellite.SatelliteSubscriberProvisionStatus> p0) throws android.os.RemoteException;

    public static class Default implements android.telephony.satellite.ISatelliteProvisionStateCallback {
        public Default() {}
        public void onSatelliteProvisionStateChanged(boolean p0) throws android.os.RemoteException {}
        public void onSatelliteSubscriptionProvisionStateChanged(java.util.List<android.telephony.satellite.SatelliteSubscriberProvisionStatus> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.satellite.ISatelliteProvisionStateCallback {
        static final int TRANSACTION_onSatelliteProvisionStateChanged = 1;
        static final int TRANSACTION_onSatelliteSubscriptionProvisionStateChanged = 2;
        public Stub() { super(); }
        public static android.telephony.satellite.ISatelliteProvisionStateCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.satellite.ISatelliteProvisionStateCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSatelliteProvisionStateChanged(boolean p0) throws android.os.RemoteException {}
            public void onSatelliteSubscriptionProvisionStateChanged(java.util.List<android.telephony.satellite.SatelliteSubscriberProvisionStatus> p0) throws android.os.RemoteException {}
        }
    }
}
