package android.telephony.ims.feature;

public class MmTelFeature extends android.telephony.ims.feature.ImsFeature {
    @android.annotation.SystemApi
    public static final int PROCESS_CALL_IMS = 0;
    @android.annotation.SystemApi
    public static final int PROCESS_CALL_CSFB = 1;
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_IS_USSD = "android.telephony.ims.feature.extra.IS_USSD";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_IS_UNKNOWN_CALL = "android.telephony.ims.feature.extra.IS_UNKNOWN_CALL";
    @android.annotation.SystemApi
    public MmTelFeature() { super(); }
    @android.annotation.SystemApi
    public MmTelFeature(java.util.concurrent.Executor p0) { super(); }
    @android.annotation.SystemApi
    public final android.telephony.ims.feature.MmTelFeature.MmTelCapabilities queryCapabilityStatus() { return null; }
    @android.annotation.SystemApi
    public final void notifyCapabilitiesStatusChanged(android.telephony.ims.feature.MmTelFeature.MmTelCapabilities p0) {}
    @android.annotation.SystemApi
    public final void notifyIncomingCall(android.telephony.ims.stub.ImsCallSessionImplBase p0, android.os.Bundle p1) {}
    @android.annotation.SystemApi
    public final void notifyRejectedCall(android.telephony.ims.ImsCallProfile p0, android.telephony.ims.ImsReasonInfo p1) {}
    public final void notifyIncomingCallSession(com.android.ims.internal.IImsCallSession p0, android.os.Bundle p1) {}
    @android.annotation.SystemApi
    public final void notifyVoiceMessageCountUpdate(int p0) {}
    @android.annotation.SystemApi
    public boolean queryCapabilityConfiguration(int p0, int p1) { return false; }
    @android.annotation.SystemApi
    public void changeEnabledCapabilities(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.feature.ImsFeature.CapabilityCallbackProxy p1) {}
    @android.annotation.SystemApi
    public android.telephony.ims.ImsCallProfile createCallProfile(int p0, int p1) { return null; }
    @android.annotation.SystemApi
    public void changeOfferedRtpHeaderExtensionTypes(java.util.Set<android.telephony.ims.RtpHeaderExtensionType> p0) {}
    public com.android.ims.internal.IImsCallSession createCallSessionInterface(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException { return null; }
    @android.annotation.SystemApi
    public android.telephony.ims.stub.ImsCallSessionImplBase createCallSession(android.telephony.ims.ImsCallProfile p0) { return null; }
    @android.annotation.SystemApi
    public int shouldProcessCall(java.lang.String[] p0) { return 0; }
    protected com.android.ims.internal.IImsUt getUtInterface() throws android.os.RemoteException { return null; }
    protected com.android.ims.internal.IImsEcbm getEcbmInterface() throws android.os.RemoteException { return null; }
    public com.android.ims.internal.IImsMultiEndpoint getMultiEndpointInterface() throws android.os.RemoteException { return null; }
    @android.annotation.SystemApi
    public android.telephony.ims.stub.ImsUtImplBase getUt() { return null; }
    @android.annotation.SystemApi
    public android.telephony.ims.stub.ImsEcbmImplBase getEcbm() { return null; }
    @android.annotation.SystemApi
    public android.telephony.ims.stub.ImsMultiEndpointImplBase getMultiEndpoint() { return null; }
    @android.annotation.SystemApi
    public void setUiTtyMode(int p0, android.os.Message p1) {}
    @android.annotation.SystemApi
    public android.telephony.ims.stub.ImsSmsImplBase getSmsImplementation() { return null; }
    @android.annotation.SystemApi
    public void onFeatureRemoved() {}
    @android.annotation.SystemApi
    public void onFeatureReady() {}
    public final android.telephony.ims.aidl.IImsMmTelFeature getBinder() { return null; }
    public final void setDefaultExecutor(java.util.concurrent.Executor p0) {}

    public static class Listener extends android.telephony.ims.aidl.IImsMmTelListener.Stub {
        public Listener() { super(); }
        public void onIncomingCall(com.android.ims.internal.IImsCallSession p0, android.os.Bundle p1) {}
        public void onRejectedCall(android.telephony.ims.ImsCallProfile p0, android.telephony.ims.ImsReasonInfo p1) {}
        public void onVoiceMessageCountUpdate(int p0) {}
    }

    public static class MmTelCapabilities extends android.telephony.ims.feature.ImsFeature.Capabilities {
        public static final int CAPABILITY_TYPE_NONE = 0;
        public static final int CAPABILITY_TYPE_VOICE = 1;
        public static final int CAPABILITY_TYPE_VIDEO = 2;
        public static final int CAPABILITY_TYPE_UT = 4;
        public static final int CAPABILITY_TYPE_SMS = 8;
        public static final int CAPABILITY_TYPE_CALL_COMPOSER = 16;
        public static final int CAPABILITY_TYPE_MAX = 17;
        @android.annotation.SystemApi
        public MmTelCapabilities() { super(); }
        @java.lang.Deprecated
        @android.annotation.SystemApi
        public MmTelCapabilities(android.telephony.ims.feature.ImsFeature.Capabilities p0) { super(); }
        @android.annotation.SystemApi
        public MmTelCapabilities(int p0) { super(); }
        @android.annotation.SystemApi
        public final void addCapabilities(int p0) {}
        @android.annotation.SystemApi
        public final void removeCapabilities(int p0) {}
        public final boolean isCapable(int p0) { return false; }
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface MmTelCapability {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProcessCallResult {
    }
}
