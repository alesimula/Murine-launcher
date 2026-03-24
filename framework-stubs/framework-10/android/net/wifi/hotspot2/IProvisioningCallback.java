package android.net.wifi.hotspot2;

public interface IProvisioningCallback extends android.os.IInterface {
    public void onProvisioningFailure(int p0) throws android.os.RemoteException;
    public void onProvisioningStatus(int p0) throws android.os.RemoteException;
    public void onProvisioningComplete() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.hotspot2.IProvisioningCallback {
        private static final java.lang.String DESCRIPTOR = "android.net.wifi.hotspot2.IProvisioningCallback";
        static final int TRANSACTION_onProvisioningFailure = 1;
        static final int TRANSACTION_onProvisioningStatus = 2;
        static final int TRANSACTION_onProvisioningComplete = 3;
        public Stub() { super(); }
        public static android.net.wifi.hotspot2.IProvisioningCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.wifi.hotspot2.IProvisioningCallback p0) { return false; }
        public static android.net.wifi.hotspot2.IProvisioningCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.net.wifi.hotspot2.IProvisioningCallback {
            private android.os.IBinder mRemote;
            public static android.net.wifi.hotspot2.IProvisioningCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onProvisioningFailure(int p0) throws android.os.RemoteException {}
            public void onProvisioningStatus(int p0) throws android.os.RemoteException {}
            public void onProvisioningComplete() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.net.wifi.hotspot2.IProvisioningCallback {
        public Default() {}
        public void onProvisioningFailure(int p0) throws android.os.RemoteException {}
        public void onProvisioningStatus(int p0) throws android.os.RemoteException {}
        public void onProvisioningComplete() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
