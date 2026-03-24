package android.telephony.ims.feature;

@android.annotation.SystemApi
public class MmTelFeature extends android.telephony.ims.feature.ImsFeature {
    private static final java.lang.String LOG_TAG = "MmTelFeature";
    private final android.telephony.ims.aidl.IImsMmTelFeature mImsMMTelBinder = null;
    public static final int PROCESS_CALL_IMS = 0;
    public static final int PROCESS_CALL_CSFB = 1;
    private android.telephony.ims.aidl.IImsMmTelListener mListener;
    public MmTelFeature() { super(); }
    private void setListener(android.telephony.ims.aidl.IImsMmTelListener p0) {}
    private void queryCapabilityConfigurationInternal(int p0, int p1, android.telephony.ims.aidl.IImsCapabilityCallback p2) {}
    public final android.telephony.ims.feature.MmTelFeature.MmTelCapabilities queryCapabilityStatus() { return null; }
    public final void notifyCapabilitiesStatusChanged(android.telephony.ims.feature.MmTelFeature.MmTelCapabilities p0) {}
    public final void notifyIncomingCall(android.telephony.ims.stub.ImsCallSessionImplBase p0, android.os.Bundle p1) {}
    public final void notifyRejectedCall(android.telephony.ims.ImsCallProfile p0, android.telephony.ims.ImsReasonInfo p1) {}
    public final void notifyIncomingCallSession(com.android.ims.internal.IImsCallSession p0, android.os.Bundle p1) {}
    public final void notifyVoiceMessageCountUpdate(int p0) {}
    public boolean queryCapabilityConfiguration(int p0, int p1) { return false; }
    public void changeEnabledCapabilities(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.feature.ImsFeature.CapabilityCallbackProxy p1) {}
    public android.telephony.ims.ImsCallProfile createCallProfile(int p0, int p1) { return null; }
    public com.android.ims.internal.IImsCallSession createCallSessionInterface(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException { return null; }
    public android.telephony.ims.stub.ImsCallSessionImplBase createCallSession(android.telephony.ims.ImsCallProfile p0) { return null; }
    public int shouldProcessCall(java.lang.String[] p0) { return 0; }
    protected com.android.ims.internal.IImsUt getUtInterface() throws android.os.RemoteException { return null; }
    protected com.android.ims.internal.IImsEcbm getEcbmInterface() throws android.os.RemoteException { return null; }
    public com.android.ims.internal.IImsMultiEndpoint getMultiEndpointInterface() throws android.os.RemoteException { return null; }
    public android.telephony.ims.stub.ImsUtImplBase getUt() { return null; }
    public android.telephony.ims.stub.ImsEcbmImplBase getEcbm() { return null; }
    public android.telephony.ims.stub.ImsMultiEndpointImplBase getMultiEndpoint() { return null; }
    public void setUiTtyMode(int p0, android.os.Message p1) {}
    private void setSmsListener(android.telephony.ims.aidl.IImsSmsListener p0) {}
    private void sendSms(int p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, byte[] p5) {}
    private void acknowledgeSms(int p0, int p1, int p2) {}
    private void acknowledgeSmsReport(int p0, int p1, int p2) {}
    private void onSmsReady() {}
    public android.telephony.ims.stub.ImsSmsImplBase getSmsImplementation() { return null; }
    private java.lang.String getSmsFormat() { return null; }
    public void onFeatureRemoved() {}
    public void onFeatureReady() {}
    public final android.telephony.ims.aidl.IImsMmTelFeature getBinder() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProcessCallResult {
    }

    public static class MmTelCapabilities extends android.telephony.ims.feature.ImsFeature.Capabilities {
        public static final int CAPABILITY_TYPE_VOICE = 1;
        public static final int CAPABILITY_TYPE_VIDEO = 2;
        public static final int CAPABILITY_TYPE_UT = 4;
        public static final int CAPABILITY_TYPE_SMS = 8;
        public MmTelCapabilities() { super(); }
        @java.lang.Deprecated
        public MmTelCapabilities(android.telephony.ims.feature.ImsFeature.Capabilities p0) { super(); }
        public MmTelCapabilities(int p0) { super(); }
        public final void addCapabilities(int p0) {}
        public final void removeCapabilities(int p0) {}
        public final boolean isCapable(int p0) { return false; }
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface MmTelCapability {
        }
    }

    public static class Listener extends android.telephony.ims.aidl.IImsMmTelListener.Stub {
        public Listener() { super(); }
        public void onIncomingCall(com.android.ims.internal.IImsCallSession p0, android.os.Bundle p1) {}
        public void onRejectedCall(android.telephony.ims.ImsCallProfile p0, android.telephony.ims.ImsReasonInfo p1) {}
        public void onVoiceMessageCountUpdate(int p0) {}
    }
}
