package android.telephony.ims.aidl;

public interface IImsMmTelFeature extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IImsMmTelFeature";
    public void setListener(android.telephony.ims.aidl.IImsMmTelListener p0) throws android.os.RemoteException;
    public int getFeatureState() throws android.os.RemoteException;
    public android.telephony.ims.ImsCallProfile createCallProfile(int p0, int p1) throws android.os.RemoteException;
    public void changeOfferedRtpHeaderExtensionTypes(java.util.List<android.telephony.ims.RtpHeaderExtensionType> p0) throws android.os.RemoteException;
    public com.android.ims.internal.IImsCallSession createCallSession(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException;
    public int shouldProcessCall(java.lang.String[] p0) throws android.os.RemoteException;
    public com.android.ims.internal.IImsUt getUtInterface() throws android.os.RemoteException;
    public com.android.ims.internal.IImsEcbm getEcbmInterface() throws android.os.RemoteException;
    public void setUiTtyMode(int p0, android.os.Message p1) throws android.os.RemoteException;
    public com.android.ims.internal.IImsMultiEndpoint getMultiEndpointInterface() throws android.os.RemoteException;
    public int queryCapabilityStatus() throws android.os.RemoteException;
    public void addCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException;
    public void removeCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException;
    public void changeCapabilitiesConfiguration(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException;
    public void queryCapabilityConfiguration(int p0, int p1, android.telephony.ims.aidl.IImsCapabilityCallback p2) throws android.os.RemoteException;
    public void setSmsListener(android.telephony.ims.aidl.IImsSmsListener p0) throws android.os.RemoteException;
    public void sendSms(int p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, byte[] p5) throws android.os.RemoteException;
    public void acknowledgeSms(int p0, int p1, int p2) throws android.os.RemoteException;
    public void acknowledgeSmsReport(int p0, int p1, int p2) throws android.os.RemoteException;
    public java.lang.String getSmsFormat() throws android.os.RemoteException;
    public void onSmsReady() throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IImsMmTelFeature {
        public Default() {}
        public void setListener(android.telephony.ims.aidl.IImsMmTelListener p0) throws android.os.RemoteException {}
        public int getFeatureState() throws android.os.RemoteException { return 0; }
        public android.telephony.ims.ImsCallProfile createCallProfile(int p0, int p1) throws android.os.RemoteException { return null; }
        public void changeOfferedRtpHeaderExtensionTypes(java.util.List<android.telephony.ims.RtpHeaderExtensionType> p0) throws android.os.RemoteException {}
        public com.android.ims.internal.IImsCallSession createCallSession(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException { return null; }
        public int shouldProcessCall(java.lang.String[] p0) throws android.os.RemoteException { return 0; }
        public com.android.ims.internal.IImsUt getUtInterface() throws android.os.RemoteException { return null; }
        public com.android.ims.internal.IImsEcbm getEcbmInterface() throws android.os.RemoteException { return null; }
        public void setUiTtyMode(int p0, android.os.Message p1) throws android.os.RemoteException {}
        public com.android.ims.internal.IImsMultiEndpoint getMultiEndpointInterface() throws android.os.RemoteException { return null; }
        public int queryCapabilityStatus() throws android.os.RemoteException { return 0; }
        public void addCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException {}
        public void removeCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException {}
        public void changeCapabilitiesConfiguration(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
        public void queryCapabilityConfiguration(int p0, int p1, android.telephony.ims.aidl.IImsCapabilityCallback p2) throws android.os.RemoteException {}
        public void setSmsListener(android.telephony.ims.aidl.IImsSmsListener p0) throws android.os.RemoteException {}
        public void sendSms(int p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, byte[] p5) throws android.os.RemoteException {}
        public void acknowledgeSms(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void acknowledgeSmsReport(int p0, int p1, int p2) throws android.os.RemoteException {}
        public java.lang.String getSmsFormat() throws android.os.RemoteException { return null; }
        public void onSmsReady() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IImsMmTelFeature {
        static final int TRANSACTION_setListener = 1;
        static final int TRANSACTION_getFeatureState = 2;
        static final int TRANSACTION_createCallProfile = 3;
        static final int TRANSACTION_changeOfferedRtpHeaderExtensionTypes = 4;
        static final int TRANSACTION_createCallSession = 5;
        static final int TRANSACTION_shouldProcessCall = 6;
        static final int TRANSACTION_getUtInterface = 7;
        static final int TRANSACTION_getEcbmInterface = 8;
        static final int TRANSACTION_setUiTtyMode = 9;
        static final int TRANSACTION_getMultiEndpointInterface = 10;
        static final int TRANSACTION_queryCapabilityStatus = 11;
        static final int TRANSACTION_addCapabilityCallback = 12;
        static final int TRANSACTION_removeCapabilityCallback = 13;
        static final int TRANSACTION_changeCapabilitiesConfiguration = 14;
        static final int TRANSACTION_queryCapabilityConfiguration = 15;
        static final int TRANSACTION_setSmsListener = 16;
        static final int TRANSACTION_sendSms = 17;
        static final int TRANSACTION_acknowledgeSms = 18;
        static final int TRANSACTION_acknowledgeSmsReport = 19;
        static final int TRANSACTION_getSmsFormat = 20;
        static final int TRANSACTION_onSmsReady = 21;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IImsMmTelFeature asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.ims.aidl.IImsMmTelFeature {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setListener(android.telephony.ims.aidl.IImsMmTelListener p0) throws android.os.RemoteException {}
            public int getFeatureState() throws android.os.RemoteException { return 0; }
            public android.telephony.ims.ImsCallProfile createCallProfile(int p0, int p1) throws android.os.RemoteException { return null; }
            public void changeOfferedRtpHeaderExtensionTypes(java.util.List<android.telephony.ims.RtpHeaderExtensionType> p0) throws android.os.RemoteException {}
            public com.android.ims.internal.IImsCallSession createCallSession(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException { return null; }
            public int shouldProcessCall(java.lang.String[] p0) throws android.os.RemoteException { return 0; }
            public com.android.ims.internal.IImsUt getUtInterface() throws android.os.RemoteException { return null; }
            public com.android.ims.internal.IImsEcbm getEcbmInterface() throws android.os.RemoteException { return null; }
            public void setUiTtyMode(int p0, android.os.Message p1) throws android.os.RemoteException {}
            public com.android.ims.internal.IImsMultiEndpoint getMultiEndpointInterface() throws android.os.RemoteException { return null; }
            public int queryCapabilityStatus() throws android.os.RemoteException { return 0; }
            public void addCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException {}
            public void removeCapabilityCallback(android.telephony.ims.aidl.IImsCapabilityCallback p0) throws android.os.RemoteException {}
            public void changeCapabilitiesConfiguration(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
            public void queryCapabilityConfiguration(int p0, int p1, android.telephony.ims.aidl.IImsCapabilityCallback p2) throws android.os.RemoteException {}
            public void setSmsListener(android.telephony.ims.aidl.IImsSmsListener p0) throws android.os.RemoteException {}
            public void sendSms(int p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, byte[] p5) throws android.os.RemoteException {}
            public void acknowledgeSms(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void acknowledgeSmsReport(int p0, int p1, int p2) throws android.os.RemoteException {}
            public java.lang.String getSmsFormat() throws android.os.RemoteException { return null; }
            public void onSmsReady() throws android.os.RemoteException {}
        }
    }
}
