package android.bluetooth.le;

public interface IAdvertisingSetCallback extends android.os.IInterface {
    public void onAdvertisingSetStarted(int p0, int p1, int p2) throws android.os.RemoteException;
    public void onOwnAddressRead(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void onAdvertisingSetStopped(int p0) throws android.os.RemoteException;
    public void onAdvertisingEnabled(int p0, boolean p1, int p2) throws android.os.RemoteException;
    public void onAdvertisingDataSet(int p0, int p1) throws android.os.RemoteException;
    public void onScanResponseDataSet(int p0, int p1) throws android.os.RemoteException;
    public void onAdvertisingParametersUpdated(int p0, int p1, int p2) throws android.os.RemoteException;
    public void onPeriodicAdvertisingParametersUpdated(int p0, int p1) throws android.os.RemoteException;
    public void onPeriodicAdvertisingDataSet(int p0, int p1) throws android.os.RemoteException;
    public void onPeriodicAdvertisingEnabled(int p0, boolean p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.le.IAdvertisingSetCallback {
        public Default() {}
        public void onAdvertisingSetStarted(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void onOwnAddressRead(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void onAdvertisingSetStopped(int p0) throws android.os.RemoteException {}
        public void onAdvertisingEnabled(int p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void onAdvertisingDataSet(int p0, int p1) throws android.os.RemoteException {}
        public void onScanResponseDataSet(int p0, int p1) throws android.os.RemoteException {}
        public void onAdvertisingParametersUpdated(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void onPeriodicAdvertisingParametersUpdated(int p0, int p1) throws android.os.RemoteException {}
        public void onPeriodicAdvertisingDataSet(int p0, int p1) throws android.os.RemoteException {}
        public void onPeriodicAdvertisingEnabled(int p0, boolean p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.le.IAdvertisingSetCallback {
        public static final java.lang.String DESCRIPTOR = "android.bluetooth.le.IAdvertisingSetCallback";
        static final int TRANSACTION_onAdvertisingSetStarted = 1;
        static final int TRANSACTION_onOwnAddressRead = 2;
        static final int TRANSACTION_onAdvertisingSetStopped = 3;
        static final int TRANSACTION_onAdvertisingEnabled = 4;
        static final int TRANSACTION_onAdvertisingDataSet = 5;
        static final int TRANSACTION_onScanResponseDataSet = 6;
        static final int TRANSACTION_onAdvertisingParametersUpdated = 7;
        static final int TRANSACTION_onPeriodicAdvertisingParametersUpdated = 8;
        static final int TRANSACTION_onPeriodicAdvertisingDataSet = 9;
        static final int TRANSACTION_onPeriodicAdvertisingEnabled = 10;
        public Stub() { super(); }
        public static android.bluetooth.le.IAdvertisingSetCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.le.IAdvertisingSetCallback p0) { return false; }
        public static android.bluetooth.le.IAdvertisingSetCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.le.IAdvertisingSetCallback {
            private android.os.IBinder mRemote;
            public static android.bluetooth.le.IAdvertisingSetCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAdvertisingSetStarted(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void onOwnAddressRead(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void onAdvertisingSetStopped(int p0) throws android.os.RemoteException {}
            public void onAdvertisingEnabled(int p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void onAdvertisingDataSet(int p0, int p1) throws android.os.RemoteException {}
            public void onScanResponseDataSet(int p0, int p1) throws android.os.RemoteException {}
            public void onAdvertisingParametersUpdated(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void onPeriodicAdvertisingParametersUpdated(int p0, int p1) throws android.os.RemoteException {}
            public void onPeriodicAdvertisingDataSet(int p0, int p1) throws android.os.RemoteException {}
            public void onPeriodicAdvertisingEnabled(int p0, boolean p1, int p2) throws android.os.RemoteException {}
        }
    }
}
