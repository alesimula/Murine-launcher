package android.telephony.ims.compat.feature;

public class MMTelFeature extends android.telephony.ims.compat.feature.ImsFeature {
    private final java.lang.Object mLock = null;
    private final com.android.ims.internal.IImsMMTelFeature mImsMMTelBinder = null;
    public MMTelFeature() { super(); }
    public final com.android.ims.internal.IImsMMTelFeature getBinder() { return null; }
    public int startSession(android.app.PendingIntent p0, com.android.ims.internal.IImsRegistrationListener p1) { return 0; }
    public void endSession(int p0) {}
    public boolean isConnected(int p0, int p1) { return false; }
    public boolean isOpened() { return false; }
    public void addRegistrationListener(com.android.ims.internal.IImsRegistrationListener p0) {}
    public void removeRegistrationListener(com.android.ims.internal.IImsRegistrationListener p0) {}
    public android.telephony.ims.ImsCallProfile createCallProfile(int p0, int p1, int p2) { return null; }
    public com.android.ims.internal.IImsCallSession createCallSession(int p0, android.telephony.ims.ImsCallProfile p1, com.android.ims.internal.IImsCallSessionListener p2) { return null; }
    public com.android.ims.internal.IImsCallSession getPendingCallSession(int p0, java.lang.String p1) { return null; }
    public android.telephony.ims.stub.ImsUtImplBase getUtInterface() { return null; }
    public com.android.ims.internal.IImsConfig getConfigInterface() { return null; }
    public void turnOnIms() {}
    public void turnOffIms() {}
    public android.telephony.ims.stub.ImsEcbmImplBase getEcbmInterface() { return null; }
    public void setUiTTYMode(int p0, android.os.Message p1) {}
    public android.telephony.ims.stub.ImsMultiEndpointImplBase getMultiEndpointInterface() { return null; }
    public void onFeatureReady() {}
    public void onFeatureRemoved() {}
}
