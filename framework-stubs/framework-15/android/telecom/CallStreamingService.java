package android.telecom;

@android.annotation.SystemApi
public abstract class CallStreamingService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.telecom.CallStreamingService";
    public static final int STREAMING_FAILED_UNKNOWN = 0;
    public static final int STREAMING_FAILED_ALREADY_STREAMING = 1;
    public static final int STREAMING_FAILED_NO_SENDER = 2;
    public static final int STREAMING_FAILED_SENDER_BINDING_ERROR = 3;
    public CallStreamingService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onCallStreamingStarted(android.telecom.StreamingCall p0) {}
    public void onCallStreamingStopped() {}
    public void onCallStreamingStateChanged(int p0) {}

    private final class CallStreamingServiceBinder extends com.android.internal.telecom.ICallStreamingService.Stub {
        public void setStreamingCallAdapter(com.android.internal.telecom.IStreamingCallAdapter p0) throws android.os.RemoteException {}
        public void onCallStreamingStarted(android.telecom.StreamingCall p0) throws android.os.RemoteException {}
        public void onCallStreamingStopped() throws android.os.RemoteException {}
        public void onCallStreamingStateChanged(int p0) throws android.os.RemoteException {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StreamingFailedReason {
    }
}
