package android.telephony.ims.stub;

@android.annotation.SystemApi
public interface SipDelegate {
    public void sendMessage(android.telephony.ims.SipMessage p0, long p1);
    public void cleanupSession(java.lang.String p0);
    public void notifyMessageReceived(java.lang.String p0);
    public void notifyMessageReceiveError(java.lang.String p0, int p1);
}
