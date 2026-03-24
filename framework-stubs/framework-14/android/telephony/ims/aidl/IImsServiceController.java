package android.telephony.ims.aidl;

public interface IImsServiceController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IImsServiceController";
    public void setListener(android.telephony.ims.aidl.IImsServiceControllerListener p0) throws android.os.RemoteException;
    public android.telephony.ims.aidl.IImsMmTelFeature createMmTelFeature(int p0, int p1) throws android.os.RemoteException;
    public android.telephony.ims.aidl.IImsMmTelFeature createEmergencyOnlyMmTelFeature(int p0) throws android.os.RemoteException;
    public android.telephony.ims.aidl.IImsRcsFeature createRcsFeature(int p0, int p1) throws android.os.RemoteException;
    public android.telephony.ims.stub.ImsFeatureConfiguration querySupportedImsFeatures() throws android.os.RemoteException;
    public long getImsServiceCapabilities() throws android.os.RemoteException;
    public void addFeatureStatusCallback(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) throws android.os.RemoteException;
    public void removeFeatureStatusCallback(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) throws android.os.RemoteException;
    public void notifyImsServiceReadyForFeatureCreation() throws android.os.RemoteException;
    public void removeImsFeature(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public android.telephony.ims.aidl.IImsConfig getConfig(int p0, int p1) throws android.os.RemoteException;
    public android.telephony.ims.aidl.IImsRegistration getRegistration(int p0, int p1) throws android.os.RemoteException;
    public android.telephony.ims.aidl.ISipTransport getSipTransport(int p0) throws android.os.RemoteException;
    public void enableIms(int p0, int p1) throws android.os.RemoteException;
    public void disableIms(int p0, int p1) throws android.os.RemoteException;
    public void resetIms(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IImsServiceController {
        public Default() {}
        public void setListener(android.telephony.ims.aidl.IImsServiceControllerListener p0) throws android.os.RemoteException {}
        public android.telephony.ims.aidl.IImsMmTelFeature createMmTelFeature(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.telephony.ims.aidl.IImsMmTelFeature createEmergencyOnlyMmTelFeature(int p0) throws android.os.RemoteException { return null; }
        public android.telephony.ims.aidl.IImsRcsFeature createRcsFeature(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.telephony.ims.stub.ImsFeatureConfiguration querySupportedImsFeatures() throws android.os.RemoteException { return null; }
        public long getImsServiceCapabilities() throws android.os.RemoteException { return 0L; }
        public void addFeatureStatusCallback(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) throws android.os.RemoteException {}
        public void removeFeatureStatusCallback(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) throws android.os.RemoteException {}
        public void notifyImsServiceReadyForFeatureCreation() throws android.os.RemoteException {}
        public void removeImsFeature(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public android.telephony.ims.aidl.IImsConfig getConfig(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.telephony.ims.aidl.IImsRegistration getRegistration(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.telephony.ims.aidl.ISipTransport getSipTransport(int p0) throws android.os.RemoteException { return null; }
        public void enableIms(int p0, int p1) throws android.os.RemoteException {}
        public void disableIms(int p0, int p1) throws android.os.RemoteException {}
        public void resetIms(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IImsServiceController {
        static final int TRANSACTION_setListener = 1;
        static final int TRANSACTION_createMmTelFeature = 2;
        static final int TRANSACTION_createEmergencyOnlyMmTelFeature = 3;
        static final int TRANSACTION_createRcsFeature = 4;
        static final int TRANSACTION_querySupportedImsFeatures = 5;
        static final int TRANSACTION_getImsServiceCapabilities = 6;
        static final int TRANSACTION_addFeatureStatusCallback = 7;
        static final int TRANSACTION_removeFeatureStatusCallback = 8;
        static final int TRANSACTION_notifyImsServiceReadyForFeatureCreation = 9;
        static final int TRANSACTION_removeImsFeature = 10;
        static final int TRANSACTION_getConfig = 11;
        static final int TRANSACTION_getRegistration = 12;
        static final int TRANSACTION_getSipTransport = 13;
        static final int TRANSACTION_enableIms = 14;
        static final int TRANSACTION_disableIms = 15;
        static final int TRANSACTION_resetIms = 16;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IImsServiceController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.ims.aidl.IImsServiceController {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setListener(android.telephony.ims.aidl.IImsServiceControllerListener p0) throws android.os.RemoteException {}
            public android.telephony.ims.aidl.IImsMmTelFeature createMmTelFeature(int p0, int p1) throws android.os.RemoteException { return null; }
            public android.telephony.ims.aidl.IImsMmTelFeature createEmergencyOnlyMmTelFeature(int p0) throws android.os.RemoteException { return null; }
            public android.telephony.ims.aidl.IImsRcsFeature createRcsFeature(int p0, int p1) throws android.os.RemoteException { return null; }
            public android.telephony.ims.stub.ImsFeatureConfiguration querySupportedImsFeatures() throws android.os.RemoteException { return null; }
            public long getImsServiceCapabilities() throws android.os.RemoteException { return 0L; }
            public void addFeatureStatusCallback(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) throws android.os.RemoteException {}
            public void removeFeatureStatusCallback(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) throws android.os.RemoteException {}
            public void notifyImsServiceReadyForFeatureCreation() throws android.os.RemoteException {}
            public void removeImsFeature(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public android.telephony.ims.aidl.IImsConfig getConfig(int p0, int p1) throws android.os.RemoteException { return null; }
            public android.telephony.ims.aidl.IImsRegistration getRegistration(int p0, int p1) throws android.os.RemoteException { return null; }
            public android.telephony.ims.aidl.ISipTransport getSipTransport(int p0) throws android.os.RemoteException { return null; }
            public void enableIms(int p0, int p1) throws android.os.RemoteException {}
            public void disableIms(int p0, int p1) throws android.os.RemoteException {}
            public void resetIms(int p0, int p1) throws android.os.RemoteException {}
        }
    }
}
