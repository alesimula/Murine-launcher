package android.telephony.ims.stub;

@android.annotation.SystemApi
public class SipTransportImplBase {
    public SipTransportImplBase() {}
    public SipTransportImplBase(java.util.concurrent.Executor p0) {}
    @android.annotation.SuppressLint("ExecutorRegistration")
    public void createSipDelegate(int p0, android.telephony.ims.DelegateRequest p1, android.telephony.ims.DelegateStateCallback p2, android.telephony.ims.DelegateMessageCallback p3) {}
    public void destroySipDelegate(android.telephony.ims.stub.SipDelegate p0, int p1) {}
    public android.telephony.ims.aidl.ISipTransport getBinder() { return null; }
    public final void setDefaultExecutor(java.util.concurrent.Executor p0) {}
}
