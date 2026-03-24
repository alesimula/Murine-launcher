package android.telephony.ims.stub;

@android.annotation.SystemApi
public interface DelegateConnectionMessageCallback {
    public void onMessageReceived(android.telephony.ims.SipMessage p0);
    public void onMessageSent(java.lang.String p0);
    public void onMessageSendFailure(java.lang.String p0, int p1);
}
