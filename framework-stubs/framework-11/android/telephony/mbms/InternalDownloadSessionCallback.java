package android.telephony.mbms;

public class InternalDownloadSessionCallback extends android.telephony.mbms.IMbmsDownloadSessionCallback.Stub {
    private final java.util.concurrent.Executor mExecutor = null;
    private final android.telephony.mbms.MbmsDownloadSessionCallback mAppCallback = null;
    private volatile boolean mIsStopped;
    public InternalDownloadSessionCallback(android.telephony.mbms.MbmsDownloadSessionCallback p0, java.util.concurrent.Executor p1) { super(); }
    public void onError(int p0, java.lang.String p1) {}
    public void onFileServicesUpdated(java.util.List<android.telephony.mbms.FileServiceInfo> p0) {}
    public void onMiddlewareReady() {}
    public void stop() {}
}
