package android.telephony.ims.stub;

@android.annotation.SystemApi
public class SipTransportImplBase {
    private static final java.lang.String LOG_TAG = "SipTransportIB";
    private final android.os.IBinder.DeathRecipient mDeathRecipient = null;
    private final android.telephony.ims.aidl.ISipTransport.Stub mSipTransportImpl = null;
    private final java.util.concurrent.Executor mBinderExecutor = null;
    private final java.util.ArrayList<android.telephony.ims.aidl.SipDelegateAidlWrapper> mDelegates = null;
    public SipTransportImplBase(java.util.concurrent.Executor p0) {}
    @android.annotation.SuppressLint("ExecutorRegistration")
    public void createSipDelegate(int p0, android.telephony.ims.DelegateRequest p1, android.telephony.ims.DelegateStateCallback p2, android.telephony.ims.DelegateMessageCallback p3) {}
    public void destroySipDelegate(android.telephony.ims.stub.SipDelegate p0, int p1) {}
    private void createSipDelegateInternal(int p0, android.telephony.ims.DelegateRequest p1, android.telephony.ims.aidl.ISipDelegateStateCallback p2, android.telephony.ims.aidl.ISipDelegateMessageCallback p3) {}
    private void destroySipDelegateInternal(android.telephony.ims.aidl.ISipDelegate p0, int p1) {}
    private void linkDeathRecipient(android.telephony.ims.aidl.SipDelegateAidlWrapper p0) {}
    private void unlinkDeathRecipient(android.telephony.ims.aidl.SipDelegateAidlWrapper p0) {}
    private void binderDiedInternal(android.os.IBinder p0) {}
    public android.telephony.ims.aidl.ISipTransport getBinder() { return null; }
}
