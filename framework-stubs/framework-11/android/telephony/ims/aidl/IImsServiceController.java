package android.telephony.ims.aidl;

public interface IImsServiceController extends android.os.IInterface {
    public void setListener(android.telephony.ims.aidl.IImsServiceControllerListener p0) throws android.os.RemoteException;
    public android.telephony.ims.aidl.IImsMmTelFeature createMmTelFeature(int p0, com.android.ims.internal.IImsFeatureStatusCallback p1) throws android.os.RemoteException;
    public android.telephony.ims.aidl.IImsRcsFeature createRcsFeature(int p0, com.android.ims.internal.IImsFeatureStatusCallback p1) throws android.os.RemoteException;
    public android.telephony.ims.stub.ImsFeatureConfiguration querySupportedImsFeatures() throws android.os.RemoteException;
    public void notifyImsServiceReadyForFeatureCreation() throws android.os.RemoteException;
    public void removeImsFeature(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) throws android.os.RemoteException;
    public android.telephony.ims.aidl.IImsConfig getConfig(int p0) throws android.os.RemoteException;
    public android.telephony.ims.aidl.IImsRegistration getRegistration(int p0) throws android.os.RemoteException;
    public void enableIms(int p0) throws android.os.RemoteException;
    public void disableIms(int p0) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IImsServiceController {
        public Default() {}
        public void setListener(android.telephony.ims.aidl.IImsServiceControllerListener p0) throws android.os.RemoteException {}
        public android.telephony.ims.aidl.IImsMmTelFeature createMmTelFeature(int p0, com.android.ims.internal.IImsFeatureStatusCallback p1) throws android.os.RemoteException { return null; }
        public android.telephony.ims.aidl.IImsRcsFeature createRcsFeature(int p0, com.android.ims.internal.IImsFeatureStatusCallback p1) throws android.os.RemoteException { return null; }
        public android.telephony.ims.stub.ImsFeatureConfiguration querySupportedImsFeatures() throws android.os.RemoteException { return null; }
        public void notifyImsServiceReadyForFeatureCreation() throws android.os.RemoteException {}
        public void removeImsFeature(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) throws android.os.RemoteException {}
        public android.telephony.ims.aidl.IImsConfig getConfig(int p0) throws android.os.RemoteException { return null; }
        public android.telephony.ims.aidl.IImsRegistration getRegistration(int p0) throws android.os.RemoteException { return null; }
        public void enableIms(int p0) throws android.os.RemoteException {}
        public void disableIms(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IImsServiceController {
        private static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IImsServiceController";
        static final int TRANSACTION_setListener = 1;
        static final int TRANSACTION_createMmTelFeature = 2;
        static final int TRANSACTION_createRcsFeature = 3;
        static final int TRANSACTION_querySupportedImsFeatures = 4;
        static final int TRANSACTION_notifyImsServiceReadyForFeatureCreation = 5;
        static final int TRANSACTION_removeImsFeature = 6;
        static final int TRANSACTION_getConfig = 7;
        static final int TRANSACTION_getRegistration = 8;
        static final int TRANSACTION_enableIms = 9;
        static final int TRANSACTION_disableIms = 10;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IImsServiceController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.ims.aidl.IImsServiceController p0) { return false; }
        public static android.telephony.ims.aidl.IImsServiceController getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.ims.aidl.IImsServiceController {
            private android.os.IBinder mRemote;
            public static android.telephony.ims.aidl.IImsServiceController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setListener(android.telephony.ims.aidl.IImsServiceControllerListener p0) throws android.os.RemoteException {}
            public android.telephony.ims.aidl.IImsMmTelFeature createMmTelFeature(int p0, com.android.ims.internal.IImsFeatureStatusCallback p1) throws android.os.RemoteException { return null; }
            public android.telephony.ims.aidl.IImsRcsFeature createRcsFeature(int p0, com.android.ims.internal.IImsFeatureStatusCallback p1) throws android.os.RemoteException { return null; }
            public android.telephony.ims.stub.ImsFeatureConfiguration querySupportedImsFeatures() throws android.os.RemoteException { return null; }
            public void notifyImsServiceReadyForFeatureCreation() throws android.os.RemoteException {}
            public void removeImsFeature(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) throws android.os.RemoteException {}
            public android.telephony.ims.aidl.IImsConfig getConfig(int p0) throws android.os.RemoteException { return null; }
            public android.telephony.ims.aidl.IImsRegistration getRegistration(int p0) throws android.os.RemoteException { return null; }
            public void enableIms(int p0) throws android.os.RemoteException {}
            public void disableIms(int p0) throws android.os.RemoteException {}
        }
    }
}
