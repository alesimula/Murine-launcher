package android.telephony.ims.stub;

@android.annotation.SystemApi
public interface DelegateConnectionStateCallback {
    public void onCreated(android.telephony.ims.SipDelegateConnection p0);
    public void onFeatureTagStatusChanged(android.telephony.ims.DelegateRegistrationState p0, java.util.Set<android.telephony.ims.FeatureTagState> p1);
    @java.lang.Deprecated
    default public void onImsConfigurationChanged(android.telephony.ims.SipDelegateImsConfiguration p0) {}
    public void onConfigurationChanged(android.telephony.ims.SipDelegateConfiguration p0);
    public void onDestroyed(int p0);
}
