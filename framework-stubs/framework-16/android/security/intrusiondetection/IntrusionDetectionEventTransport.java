package android.security.intrusiondetection;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.security.afl_api")
@android.annotation.SuppressLint("NotCloseable")
public class IntrusionDetectionEventTransport {
    android.security.intrusiondetection.IIntrusionDetectionEventTransport mBinderImpl;
    public IntrusionDetectionEventTransport() {}
    @android.annotation.NonNull
    public android.os.IBinder getBinder() { return null; }
    public boolean initialize() { return false; }
    public boolean addData(java.util.List<android.security.intrusiondetection.IntrusionDetectionEvent> p0) { return false; }
    public boolean release() { return false; }

    class TransportImpl extends android.security.intrusiondetection.IIntrusionDetectionEventTransport.Stub {
        TransportImpl(android.security.intrusiondetection.IntrusionDetectionEventTransport p0) { super(); }
        public void initialize(com.android.internal.infra.AndroidFuture<java.lang.Boolean> p0) {}
        public void addData(java.util.List<android.security.intrusiondetection.IntrusionDetectionEvent> p0, com.android.internal.infra.AndroidFuture<java.lang.Boolean> p1) {}
        public void release(com.android.internal.infra.AndroidFuture<java.lang.Boolean> p0) {}
    }
}
