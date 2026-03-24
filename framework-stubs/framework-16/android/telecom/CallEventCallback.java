package android.telecom;

public interface CallEventCallback {
    public void onCallEndpointChanged(android.telecom.CallEndpoint p0);
    public void onAvailableCallEndpointsChanged(java.util.List<android.telecom.CallEndpoint> p0);
    public void onMuteStateChanged(boolean p0);
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.transactional_video_state")
    default public void onVideoStateChanged(int p0) {}
    public void onCallStreamingFailed(int p0);
    public void onEvent(java.lang.String p0, android.os.Bundle p1);
}
