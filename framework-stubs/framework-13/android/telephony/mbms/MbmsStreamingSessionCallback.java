package android.telephony.mbms;

public class MbmsStreamingSessionCallback {
    public MbmsStreamingSessionCallback() {}
    public void onError(int p0, java.lang.String p1) {}
    public void onStreamingServicesUpdated(java.util.List<android.telephony.mbms.StreamingServiceInfo> p0) {}
    public void onMiddlewareReady() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface StreamingError {
    }
}
