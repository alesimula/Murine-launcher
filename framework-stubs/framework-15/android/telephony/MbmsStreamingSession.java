package android.telephony;

public class MbmsStreamingSession implements java.lang.AutoCloseable {
    @android.annotation.SystemApi
    public static final java.lang.String MBMS_STREAMING_SERVICE_ACTION = "android.telephony.action.EmbmsStreaming";
    public static final java.lang.String MBMS_STREAMING_SERVICE_OVERRIDE_METADATA = "mbms-streaming-service-override";
    @android.annotation.Nullable
    public static android.telephony.MbmsStreamingSession create(android.content.Context p0, java.util.concurrent.Executor p1, int p2, android.telephony.mbms.MbmsStreamingSessionCallback p3) { return null; }
    public static android.telephony.MbmsStreamingSession create(android.content.Context p0, java.util.concurrent.Executor p1, android.telephony.mbms.MbmsStreamingSessionCallback p2) { return null; }
    public void close() {}
    public void requestUpdateStreamingServices(java.util.List<java.lang.String> p0) {}
    @android.annotation.Nullable
    public android.telephony.mbms.StreamingService startStreaming(android.telephony.mbms.StreamingServiceInfo p0, java.util.concurrent.Executor p1, android.telephony.mbms.StreamingServiceCallback p2) { return null; }
    public void onStreamingServiceStopped(android.telephony.mbms.StreamingService p0) {}
}
