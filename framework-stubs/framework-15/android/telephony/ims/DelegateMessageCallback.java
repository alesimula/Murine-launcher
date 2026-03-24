package android.telephony.ims;

@android.annotation.SystemApi
public interface DelegateMessageCallback {
    public void onMessageReceived(android.telephony.ims.SipMessage p0);
    public void onMessageSent(java.lang.String p0);
    public void onMessageSendFailure(java.lang.String p0, int p1);
}
