package android.telephony.ims.aidl;

public class SipDelegateConnectionAidlWrapper implements android.telephony.ims.SipDelegateConnection, android.os.IBinder.DeathRecipient {
    public SipDelegateConnectionAidlWrapper(java.util.concurrent.Executor p0, android.telephony.ims.stub.DelegateConnectionStateCallback p1, android.telephony.ims.stub.DelegateConnectionMessageCallback p2) {}
    public void sendMessage(android.telephony.ims.SipMessage p0, long p1) {}
    public void notifyMessageReceived(java.lang.String p0) {}
    public void notifyMessageReceiveError(java.lang.String p0, int p1) {}
    public void cleanupSession(java.lang.String p0) {}
    public void binderDied() {}
    public android.telephony.ims.aidl.ISipDelegateConnectionStateCallback getStateCallbackBinder() { return null; }
    public android.telephony.ims.aidl.ISipDelegateMessageCallback getMessageCallbackBinder() { return null; }
    public android.telephony.ims.aidl.ISipDelegate getSipDelegateBinder() { return null; }
}
