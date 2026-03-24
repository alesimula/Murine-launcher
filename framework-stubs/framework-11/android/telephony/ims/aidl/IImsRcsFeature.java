package android.telephony.ims.aidl;

public interface IImsRcsFeature extends android.os.IInterface {
    public void setListener(android.telephony.ims.aidl.IRcsFeatureListener p0) throws android.os.RemoteException;
    public int queryCapabilityStatus() throws android.os.RemoteException;
    public int getFeatureState() throws android.os.RemoteException;
    public void addCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException;
    public void removeCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException;
    public void changeCapabilitiesConfiguration(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException;
    public void queryCapabilityConfiguration(int p0, int p1, android.telephony.ims.aidl.IImsCapabilityCallback p2) throws android.os.RemoteException;
    public void requestCapabilities(java.util.List<android.net.Uri> p0, int p1) throws android.os.RemoteException;
    public void updateCapabilities(android.telephony.ims.RcsContactUceCapability p0, int p1) throws android.os.RemoteException;
    public void sendCapabilityRequest(android.net.Uri p0, android.telephony.ims.RcsContactUceCapability p1, int p2) throws android.os.RemoteException;
    public void respondToCapabilityRequest(java.lang.String p0, android.telephony.ims.RcsContactUceCapability p1, int p2) throws android.os.RemoteException;
    public void respondToCapabilityRequestWithError(android.net.Uri p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IImsRcsFeature {
        public Default() {}
        public void setListener(android.telephony.ims.aidl.IRcsFeatureListener p0) throws android.os.RemoteException {}
        public int queryCapabilityStatus() throws android.os.RemoteException { return 0; }
        public int getFeatureState() throws android.os.RemoteException { return 0; }
        public void addCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException {}
        public void removeCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException {}
        public void changeCapabilitiesConfiguration(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
        public void queryCapabilityConfiguration(int p0, int p1, android.telephony.ims.aidl.IImsCapabilityCallback p2) throws android.os.RemoteException {}
        public void requestCapabilities(java.util.List<android.net.Uri> p0, int p1) throws android.os.RemoteException {}
        public void updateCapabilities(android.telephony.ims.RcsContactUceCapability p0, int p1) throws android.os.RemoteException {}
        public void sendCapabilityRequest(android.net.Uri p0, android.telephony.ims.RcsContactUceCapability p1, int p2) throws android.os.RemoteException {}
        public void respondToCapabilityRequest(java.lang.String p0, android.telephony.ims.RcsContactUceCapability p1, int p2) throws android.os.RemoteException {}
        public void respondToCapabilityRequestWithError(android.net.Uri p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IImsRcsFeature {
        private static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IImsRcsFeature";
        static final int TRANSACTION_setListener = 1;
        static final int TRANSACTION_queryCapabilityStatus = 2;
        static final int TRANSACTION_getFeatureState = 3;
        static final int TRANSACTION_addCapabilityCallback = 4;
        static final int TRANSACTION_removeCapabilityCallback = 5;
        static final int TRANSACTION_changeCapabilitiesConfiguration = 6;
        static final int TRANSACTION_queryCapabilityConfiguration = 7;
        static final int TRANSACTION_requestCapabilities = 8;
        static final int TRANSACTION_updateCapabilities = 9;
        static final int TRANSACTION_sendCapabilityRequest = 10;
        static final int TRANSACTION_respondToCapabilityRequest = 11;
        static final int TRANSACTION_respondToCapabilityRequestWithError = 12;
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
            public void setListener(android.telephony.ims.aidl.IRcsFeatureListener p0) throws android.os.RemoteException {}
            public int queryCapabilityStatus() throws android.os.RemoteException { return 0; }
            public int getFeatureState() throws android.os.RemoteException { return 0; }
            public void addCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException {}
            public void removeCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException {}
            public void changeCapabilitiesConfiguration(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
            public void queryCapabilityConfiguration(int p0, int p1, android.telephony.ims.aidl.IImsCapabilityCallback p2) throws android.os.RemoteException {}
            public void requestCapabilities(java.util.List<android.net.Uri> p0, int p1) throws android.os.RemoteException {}
            public void updateCapabilities(android.telephony.ims.RcsContactUceCapability p0, int p1) throws android.os.RemoteException {}
            public void sendCapabilityRequest(android.net.Uri p0, android.telephony.ims.RcsContactUceCapability p1, int p2) throws android.os.RemoteException {}
            public void respondToCapabilityRequest(java.lang.String p0, android.telephony.ims.RcsContactUceCapability p1, int p2) throws android.os.RemoteException {}
            public void respondToCapabilityRequestWithError(android.net.Uri p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        }
    }
}
