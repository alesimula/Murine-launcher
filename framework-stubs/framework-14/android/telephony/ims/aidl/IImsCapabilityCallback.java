package android.telephony.ims.aidl;

public interface IImsCapabilityCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IImsCapabilityCallback";
    public void onQueryCapabilityConfiguration(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void onChangeCapabilityConfigurationError(int p0, int p1, int p2) throws android.os.RemoteException;
    public void onCapabilitiesStatusChanged(int p0) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IImsCapabilityCallback {
        public Default() {}
        public void onQueryCapabilityConfiguration(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void onChangeCapabilityConfigurationError(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void onCapabilitiesStatusChanged(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IImsCapabilityCallback {
        static final int TRANSACTION_onQueryCapabilityConfiguration = 1;
        static final int TRANSACTION_onChangeCapabilityConfigurationError = 2;
        static final int TRANSACTION_onCapabilitiesStatusChanged = 3;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IImsCapabilityCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.ims.aidl.IImsCapabilityCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onQueryCapabilityConfiguration(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void onChangeCapabilityConfigurationError(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void onCapabilitiesStatusChanged(int p0) throws android.os.RemoteException {}
        }
    }
}
