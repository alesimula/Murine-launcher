package android.telephony.mbms;

public class StreamingServiceCallback {
    public static final int SIGNAL_STRENGTH_UNAVAILABLE = -1;
    public StreamingServiceCallback() {}
    public void onError(int p0, java.lang.String p1) {}
    public void onStreamStateUpdated(int p0, int p1) {}
    public void onMediaDescriptionUpdated() {}
    public void onBroadcastSignalStrengthUpdated(int p0) {}
    public void onStreamMethodUpdated(int p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface StreamingServiceError {
    }
}
