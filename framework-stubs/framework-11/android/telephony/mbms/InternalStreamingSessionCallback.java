package android.telephony.mbms;

public class InternalStreamingSessionCallback extends android.telephony.mbms.IMbmsStreamingSessionCallback.Stub {
    private final java.util.concurrent.Executor mExecutor = null;
    private final android.telephony.mbms.MbmsStreamingSessionCallback mAppCallback = null;
    private volatile boolean mIsStopped;
    public InternalStreamingSessionCallback(android.telephony.mbms.MbmsStreamingSessionCallback p0, java.util.concurrent.Executor p1) { super(); }
    public void onError(int p0, java.lang.String p1) throws android.os.RemoteException {}
    public void onStreamingServicesUpdated(java.util.List<android.telephony.mbms.StreamingServiceInfo> p0) throws android.os.RemoteException {}
    public void onMiddlewareReady() throws android.os.RemoteException {}
    public void stop() {}
}
