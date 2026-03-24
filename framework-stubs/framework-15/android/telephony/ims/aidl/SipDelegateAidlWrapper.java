package android.telephony.ims.aidl;

public class SipDelegateAidlWrapper implements android.telephony.ims.DelegateStateCallback, android.telephony.ims.DelegateMessageCallback {
    public SipDelegateAidlWrapper(java.util.concurrent.Executor p0, android.telephony.ims.aidl.ISipDelegateStateCallback p1, android.telephony.ims.aidl.ISipDelegateMessageCallback p2) {}
    public void onMessageReceived(android.telephony.ims.SipMessage p0) {}
    public void onMessageSent(java.lang.String p0) {}
    public void onMessageSendFailure(java.lang.String p0, int p1) {}
    public void onCreated(android.telephony.ims.stub.SipDelegate p0, java.util.Set<android.telephony.ims.FeatureTagState> p1) {}
    public void onFeatureTagRegistrationChanged(android.telephony.ims.DelegateRegistrationState p0) {}
    public void onImsConfigurationChanged(android.telephony.ims.SipDelegateImsConfiguration p0) {}
    public void onConfigurationChanged(android.telephony.ims.SipDelegateConfiguration p0) {}
    public void onDestroyed(int p0) {}
    public android.telephony.ims.stub.SipDelegate getDelegate() { return null; }
    public android.telephony.ims.aidl.ISipDelegate getDelegateBinder() { return null; }
    public android.telephony.ims.aidl.ISipDelegateStateCallback getStateCallbackBinder() { return null; }
}
