package android.telephony.ims;

@android.annotation.SystemApi
public interface DelegateStateCallback {
    public void onCreated(android.telephony.ims.stub.SipDelegate p0, java.util.Set<android.telephony.ims.FeatureTagState> p1);
    public void onDestroyed(int p0);
    @java.lang.Deprecated
    public void onImsConfigurationChanged(android.telephony.ims.SipDelegateImsConfiguration p0);
    public void onConfigurationChanged(android.telephony.ims.SipDelegateConfiguration p0);
    public void onFeatureTagRegistrationChanged(android.telephony.ims.DelegateRegistrationState p0);
}
