package com.android.internal.telephony.ims;

public class MmTelFeatureCompatAdapter extends android.telephony.ims.feature.MmTelFeature {
    public static final java.lang.String ACTION_IMS_INCOMING_CALL = "com.android.ims.IMS_INCOMING_CALL";
    public static final int FEATURE_TYPE_UNKNOWN = -1;
    public static final int FEATURE_TYPE_VOICE_OVER_LTE = 0;
    public static final int FEATURE_TYPE_VIDEO_OVER_LTE = 1;
    public static final int FEATURE_TYPE_VOICE_OVER_WIFI = 2;
    public static final int FEATURE_TYPE_VIDEO_OVER_WIFI = 3;
    public static final int FEATURE_TYPE_UT_OVER_LTE = 4;
    public static final int FEATURE_TYPE_UT_OVER_WIFI = 5;
    public static final int FEATURE_UNKNOWN = -1;
    public static final int FEATURE_DISABLED = 0;
    public static final int FEATURE_ENABLED = 1;
    public MmTelFeatureCompatAdapter(android.content.Context p0, int p1, com.android.internal.telephony.ims.MmTelInterfaceAdapter p2) { super(); }
    public boolean queryCapabilityConfiguration(int p0, int p1) { return false; }
    public void changeEnabledCapabilities(android.telephony.ims.feature.CapabilityChangeRequest p0, android.telephony.ims.feature.ImsFeature.CapabilityCallbackProxy p1) {}
    public android.telephony.ims.ImsCallProfile createCallProfile(int p0, int p1) { return null; }
    public com.android.ims.internal.IImsCallSession createCallSessionInterface(android.telephony.ims.ImsCallProfile p0) throws android.os.RemoteException { return null; }
    public com.android.ims.internal.IImsUt getUtInterface() throws android.os.RemoteException { return null; }
    public com.android.ims.internal.IImsEcbm getEcbmInterface() throws android.os.RemoteException { return null; }
    public com.android.ims.internal.IImsMultiEndpoint getMultiEndpointInterface() throws android.os.RemoteException { return null; }
    public int getFeatureState() { return 0; }
    public void setUiTtyMode(int p0, android.os.Message p1) {}
    public void onFeatureRemoved() {}
    public void onFeatureReady() {}
    public void enableIms() throws android.os.RemoteException {}
    public void disableIms() throws android.os.RemoteException {}
    public com.android.ims.internal.IImsConfig getOldConfigInterface() { return null; }
    public void addRegistrationAdapter(com.android.internal.telephony.ims.ImsRegistrationCompatAdapter p0) throws android.os.RemoteException {}

    private static class ConfigListener extends com.android.ims.ImsConfigListener.Stub {
        public ConfigListener(int p0, int p1, java.util.concurrent.CountDownLatch p2) { super(); }
        public void onGetFeatureResponse(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onSetFeatureResponse(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onGetVideoQuality(int p0, int p1) throws android.os.RemoteException {}
        public void onSetVideoQuality(int p0) throws android.os.RemoteException {}
        public void getFeatureValueReceived(int p0) {}
        public void setFeatureValueReceived(int p0) {}
    }

    private class ImsRegistrationListenerBase extends com.android.ims.internal.IImsRegistrationListener.Stub {
        public void registrationConnected() throws android.os.RemoteException {}
        public void registrationProgressing() throws android.os.RemoteException {}
        public void registrationConnectedWithRadioTech(int p0) throws android.os.RemoteException {}
        public void registrationProgressingWithRadioTech(int p0) throws android.os.RemoteException {}
        public void registrationDisconnected(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
        public void registrationResumed() throws android.os.RemoteException {}
        public void registrationSuspended() throws android.os.RemoteException {}
        public void registrationServiceCapabilityChanged(int p0, int p1) throws android.os.RemoteException {}
        public void registrationFeatureCapabilityChanged(int p0, int[] p1, int[] p2) throws android.os.RemoteException {}
        public void voiceMessageCountUpdate(int p0) throws android.os.RemoteException {}
        public void registrationAssociatedUriChanged(android.net.Uri[] p0) throws android.os.RemoteException {}
        public void registrationChangeFailed(int p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
    }
}
