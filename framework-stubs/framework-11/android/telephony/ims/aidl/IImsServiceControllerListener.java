package android.telephony.ims.aidl;

public interface IImsServiceControllerListener extends android.os.IInterface {
    public void onUpdateSupportedImsFeatures(android.telephony.ims.stub.ImsFeatureConfiguration p0) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IImsServiceControllerListener {
        public Default() {}
        public void onUpdateSupportedImsFeatures(android.telephony.ims.stub.ImsFeatureConfiguration p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IImsServiceControllerListener {
        private static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IImsServiceControllerListener";
        static final int TRANSACTION_onUpdateSupportedImsFeatures = 1;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IImsServiceControllerListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.ims.aidl.IImsServiceControllerListener p0) { return false; }
        public static android.telephony.ims.aidl.IImsServiceControllerListener getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.ims.aidl.IImsServiceControllerListener {
            private android.os.IBinder mRemote;
            public static android.telephony.ims.aidl.IImsServiceControllerListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onUpdateSupportedImsFeatures(android.telephony.ims.stub.ImsFeatureConfiguration p0) throws android.os.RemoteException {}
        }
    }
}
