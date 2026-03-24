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
    public static final int AUDIO_HANDLER_ANDROID = 0;
    @android.annotation.SystemApi
    public static final int AUDIO_HANDLER_BASEBAND = 1;
    public static final int EPS_FALLBACK_REASON_INVALID = -1;
    public static final int EPS_FALLBACK_REASON_NO_NETWORK_TRIGGER = 1;
    public static final int EPS_FALLBACK_REASON_NO_NETWORK_RESPONSE = 2;
    public static final int IMS_TRAFFIC_TYPE_NONE = -1;
    public static final int IMS_TRAFFIC_TYPE_EMERGENCY = 0;
    public static final int IMS_TRAFFIC_TYPE_EMERGENCY_SMS = 1;
    public static final int IMS_TRAFFIC_TYPE_VOICE = 2;
    public static final int IMS_TRAFFIC_TYPE_VIDEO = 3;
    public static final int IMS_TRAFFIC_TYPE_SMS = 4;
    public static final int IMS_TRAFFIC_TYPE_REGISTRATION = 5;
    public static final int IMS_TRAFFIC_TYPE_UT_XCAP = 6;
    public static final int IMS_TRAFFIC_DIRECTION_INCOMING = 0;
    public static final int IMS_TRAFFIC_DIRECTION_OUTGOING = 1;
    @android.annotation.SystemApi
    public MmTelFeature() { super(); }
    @android.annotation.SystemApi
    public MmTelFeature(java.util.concurrent.Executor p0) { super(); }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public final android.telephony.ims.feature.MmTelFeature.MmTelCapabilities queryCapabilityStatus() { return null; }
    @android.annotation.SystemApi
    public final void notifyCapabilitiesStatusChanged(android.telephony.ims.feature.MmTelFeature.MmTelCapabilities p0) {}
    @android.annotation.SystemApi
    public final void notifyMediaQualityStatusChanged(android.telephony.ims.MediaQualityStatus p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public final void notifyIncomingCall(android.telephony.ims.stub.ImsCallSessionImplBase p0, android.os.Bundle p1) {}
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public final android.telephony.ims.ImsCallSessionListener notifyIncomingCall(android.telephony.ims.stub.ImsCallSessionImplBase p0, java.lang.String p1, android.os.Bundle p2) { return null; }
    @android.annotation.SystemApi
    public final void notifyRejectedCall(android.telephony.ims.ImsCallProfile p0, android.telephony.ims.ImsReasonInfo p1) {}
    public final void notifyIncomingCallSession(com.android.ims.internal.IImsCallSession p0, android.os.Bundle p1) {}
    @android.annotation.SystemApi
    public final void notifyVoiceMessageCountUpdate(int p0) {}
    @android.annotation.SystemApi
    public final void setCallAudioHandler(int p0) {}
    public final void triggerEpsFallback(int p0) {}
    public final void startImsTrafficSession(int p0, int p1, int p2, java.util.concurrent.Executor p3, android.telephony.ims.feature.ImsTrafficSessionCallback p4) {}
    public final void modifyImsTrafficSession(int p0, android.telephony.ims.feature.ImsTrafficSessionCallback p1) {}
    public final void stopImsTrafficSession(android.telephony.ims.feature.ImsTrafficSessionCallback p0) {}
    @android.annotation.SystemApi
    public boolean queryCapabilityConfiguration(int p0, int p1) { return false; }
    @android.annotation.SystemApi
    public void changeEnabledCapabilities(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.feature.ImsFeature.CapabilityCallbackProxy p1) {}
    @android.annotation.SystemApi
    public void setMediaThreshold(int p0, android.telephony.ims.MediaThreshold p1) {}
    @android.annotation.SystemApi
    public void clearMediaThreshold(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public android.telephony.ims.MediaQualityStatus queryMediaQualityStatus(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public android.telephony.ims.ImsCallProfile createCallProfile(int p0, int p1) { return null; }
    @android.annotation.SystemApi
    public void changeOfferedRtpHeaderExtensionTypes(java.util.Set<android.telephony.ims.RtpHeaderExtensionType> p0) {}
    public com.android.ims.internal.IImsCallSession createCallSessionInterface(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException { return null; }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public android.telephony.ims.stub.ImsCallSessionImplBase createCallSession(android.telephony.ims.ImsCallProfile p0) { return null; }
    @android.annotation.SystemApi
    public int shouldProcessCall(java.lang.String[] p0) { return 0; }
    protected com.android.ims.internal.IImsUt getUtInterface() throws android.os.RemoteException { return null; }
    protected com.android.ims.internal.IImsEcbm getEcbmInterface() throws android.os.RemoteException { return null; }
    public com.android.ims.internal.IImsMultiEndpoint getMultiEndpointInterface() throws android.os.RemoteException { return null; }
    @android.annotation.NonNull
    public android.telephony.ims.stub.ImsSmsImplBase getImsSmsImpl() { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public android.telephony.ims.stub.ImsUtImplBase getUt() { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public android.telephony.ims.stub.ImsEcbmImplBase getEcbm() { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public android.telephony.ims.stub.ImsMultiEndpointImplBase getMultiEndpoint() { return null; }
    @android.annotation.SystemApi
    public void setUiTtyMode(int p0, android.os.Message p1) {}
    @android.annotation.SystemApi
    public void setTerminalBasedCallWaitingStatus(boolean p0) {}
    @android.annotation.SystemApi
    public void notifySrvccStarted(java.util.function.Consumer<java.util.List<android.telephony.ims.SrvccCall>> p0) {}
    @android.annotation.SystemApi
    public void notifySrvccCompleted() {}
    @android.annotation.SystemApi
    public void notifySrvccFailed() {}
    @android.annotation.SystemApi
    public void notifySrvccCanceled() {}
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public android.telephony.ims.stub.ImsSmsImplBase getSmsImplementation() { return null; }
    @android.annotation.SystemApi
    public void onFeatureRemoved() {}
    @android.annotation.SystemApi
    public void onFeatureReady() {}
    public final android.telephony.ims.aidl.IImsMmTelFeature getBinder() { return null; }
    public final void setDefaultExecutor(java.util.concurrent.Executor p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EpsFallbackReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsAudioHandler {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsTrafficDirection {
    }

    public static class ImsTrafficSessionCallbackWrapper {
        public static final int INVALID_TOKEN = -1;
        final void update(java.util.concurrent.Executor p0) {}
        final android.telephony.ims.feature.MmTelFeature.ImsTrafficSessionCallbackWrapper.IImsTrafficSessionCallbackStub getCallbackBinder() { return null; }
        final int getToken() { return 0; }
        final void reset() {}

        private static class IImsTrafficSessionCallbackStub extends android.telephony.ims.aidl.IImsTrafficSessionCallback.Stub {
            IImsTrafficSessionCallbackStub(android.telephony.ims.feature.ImsTrafficSessionCallback p0, java.util.concurrent.Executor p1) { super(); }
            void update(java.util.concurrent.Executor p0) {}
            public void onReady() {}
            public void onError(android.telephony.ims.feature.ConnectionFailureInfo p0) {}
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsTrafficType {
    }

    public static class Listener extends android.telephony.ims.aidl.IImsMmTelListener.Stub {
        public Listener() { super(); }
        @android.annotation.Nullable
        public android.telephony.ims.aidl.IImsCallSessionListener onIncomingCall(com.android.ims.internal.IImsCallSession p0, java.lang.String p1, android.os.Bundle p2) { return null; }
        public void onRejectedCall(android.telephony.ims.ImsCallProfile p0, android.telephony.ims.ImsReasonInfo p1) {}
        public void onVoiceMessageCountUpdate(int p0) {}
        public void onAudioModeIsVoipChanged(int p0) {}
        public void onTriggerEpsFallback(int p0) {}
        public void onStartImsTrafficSession(int p0, int p1, int p2, int p3, android.telephony.ims.aidl.IImsTrafficSessionCallback p4) {}
        public void onModifyImsTrafficSession(int p0, int p1) {}
        public void onStopImsTrafficSession(int p0) {}
        public void onMediaQualityStatusChanged(android.telephony.ims.MediaQualityStatus p0) {}
    }

    public static class MmTelCapabilities extends android.telephony.ims.feature.ImsFeature.Capabilities {
        public static final int CAPABILITY_TYPE_NONE = 0;
        public static final int CAPABILITY_TYPE_VOICE = 1;
        public static final int CAPABILITY_TYPE_VIDEO = 2;
        public static final int CAPABILITY_TYPE_UT = 4;
        public static final int CAPABILITY_TYPE_SMS = 8;
        public static final int CAPABILITY_TYPE_CALL_COMPOSER = 16;
        @android.annotation.FlaggedApi("com.android.server.telecom.flags.business_call_composer")
        public static final int CAPABILITY_TYPE_CALL_COMPOSER_BUSINESS_ONLY = 32;
        public static final int CAPABILITY_TYPE_MAX = 33;
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
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface MmTelCapability {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProcessCallResult {
    }
}
