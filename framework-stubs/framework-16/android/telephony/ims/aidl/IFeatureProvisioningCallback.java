package android.telephony.ims.aidl;

public interface IFeatureProvisioningCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IFeatureProvisioningCallback";
    public void onFeatureProvisioningChanged(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void onRcsFeatureProvisioningChanged(int p0, int p1, boolean p2) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IFeatureProvisioningCallback {
        public Default() {}
        public void onFeatureProvisioningChanged(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void onRcsFeatureProvisioningChanged(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IFeatureProvisioningCallback {
        static final int TRANSACTION_onFeatureProvisioningChanged = 1;
        static final int TRANSACTION_onRcsFeatureProvisioningChanged = 2;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IFeatureProvisioningCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.ims.aidl.IFeatureProvisioningCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onFeatureProvisioningChanged(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void onRcsFeatureProvisioningChanged(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        }
    }
}
