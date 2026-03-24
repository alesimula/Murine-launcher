package android.telephony.mbms;

public class InternalGroupCallCallback extends android.telephony.mbms.IGroupCallCallback.Stub {
    private final android.telephony.mbms.GroupCallCallback mAppCallback = null;
    private final java.util.concurrent.Executor mExecutor = null;
    private volatile boolean mIsStopped;
    public InternalGroupCallCallback(android.telephony.mbms.GroupCallCallback p0, java.util.concurrent.Executor p1) { super(); }
    public void onError(int p0, java.lang.String p1) {}
    public void onGroupCallStateChanged(int p0, int p1) {}
    public void onBroadcastSignalStrengthUpdated(int p0) {}
    public void stop() {}
}
