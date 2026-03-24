package android.telephony.ims.aidl;

public interface IImsRcsFeature extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IImsRcsFeature";
    public int queryCapabilityStatus() throws android.os.RemoteException;
    public int getFeatureState() throws android.os.RemoteException;
    public void addCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException;
    public void removeCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException;
    public void changeCapabilitiesConfiguration(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException;
    public void queryCapabilityConfiguration(int p0, int p1, android.telephony.ims.aidl.IImsCapabilityCallback p2) throws android.os.RemoteException;
    public void setCapabilityExchangeEventListener(android.telephony.ims.aidl.ICapabilityExchangeEventListener p0) throws android.os.RemoteException;
    public void publishCapabilities(java.lang.String p0, android.telephony.ims.aidl.IPublishResponseCallback p1) throws android.os.RemoteException;
    public void subscribeForCapabilities(java.util.List<android.net.Uri> p0, android.telephony.ims.aidl.ISubscribeResponseCallback p1) throws android.os.RemoteException;
    public void sendOptionsCapabilityRequest(android.net.Uri p0, java.util.List<java.lang.String> p1, android.telephony.ims.aidl.IOptionsResponseCallback p2) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IImsRcsFeature {
        public Default() {}
        public int queryCapabilityStatus() throws android.os.RemoteException { return 0; }
        public int getFeatureState() throws android.os.RemoteException { return 0; }
        public void addCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException {}
        public void removeCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException {}
        public void changeCapabilitiesConfiguration(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
        public void queryCapabilityConfiguration(int p0, int p1, android.telephony.ims.aidl.IImsCapabilityCallback p2) throws android.os.RemoteException {}
        public void setCapabilityExchangeEventListener(android.telephony.ims.aidl.ICapabilityExchangeEventListener p0) throws android.os.RemoteException {}
        public void publishCapabilities(java.lang.String p0, android.telephony.ims.aidl.IPublishResponseCallback p1) throws android.os.RemoteException {}
        public void subscribeForCapabilities(java.util.List<android.net.Uri> p0, android.telephony.ims.aidl.ISubscribeResponseCallback p1) throws android.os.RemoteException {}
        public void sendOptionsCapabilityRequest(android.net.Uri p0, java.util.List<java.lang.String> p1, android.telephony.ims.aidl.IOptionsResponseCallback p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IImsRcsFeature {
        static final int TRANSACTION_queryCapabilityStatus = 1;
        static final int TRANSACTION_getFeatureState = 2;
        static final int TRANSACTION_addCapabilityCallback = 3;
        static final int TRANSACTION_removeCapabilityCallback = 4;
        static final int TRANSACTION_changeCapabilitiesConfiguration = 5;
        static final int TRANSACTION_queryCapabilityConfiguration = 6;
        static final int TRANSACTION_setCapabilityExchangeEventListener = 7;
        static final int TRANSACTION_publishCapabilities = 8;
        static final int TRANSACTION_subscribeForCapabilities = 9;
        static final int TRANSACTION_sendOptionsCapabilityRequest = 10;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IImsRcsFeature asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.ims.aidl.IImsRcsFeature p0) { return false; }
        public static android.telephony.ims.aidl.IImsRcsFeature getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.ims.aidl.IImsRcsFeature {
            private android.os.IBinder mRemote;
            public static android.telephony.ims.aidl.IImsRcsFeature sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int queryCapabilityStatus() throws android.os.RemoteException { return 0; }
            public int getFeatureState() throws android.os.RemoteException { return 0; }
            public void addCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException {}
            public void removeCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException {}
            public void changeCapabilitiesConfiguration(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
            public void queryCapabilityConfiguration(int p0, int p1, android.telephony.ims.aidl.IImsCapabilityCallback p2) throws android.os.RemoteException {}
            public void setCapabilityExchangeEventListener(android.telephony.ims.aidl.ICapabilityExchangeEventListener p0) throws android.os.RemoteException {}
            public void publishCapabilities(java.lang.String p0, android.telephony.ims.aidl.IPublishResponseCallback p1) throws android.os.RemoteException {}
            public void subscribeForCapabilities(java.util.List<android.net.Uri> p0, android.telephony.ims.aidl.ISubscribeResponseCallback p1) throws android.os.RemoteException {}
            public void sendOptionsCapabilityRequest(android.net.Uri p0, java.util.List<java.lang.String> p1, android.telephony.ims.aidl.IOptionsResponseCallback p2) throws android.os.RemoteException {}
        }
    }
}
