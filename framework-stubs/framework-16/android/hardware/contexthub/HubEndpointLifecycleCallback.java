package android.hardware.contexthub;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.chre.flags.offload_api")
public interface HubEndpointLifecycleCallback {
    @android.annotation.NonNull
    public android.hardware.contexthub.HubEndpointSessionResult onSessionOpenRequest(android.hardware.contexthub.HubEndpointInfo p0, java.lang.String p1);
    public void onSessionOpened(android.hardware.contexthub.HubEndpointSession p0);
    public void onSessionClosed(android.hardware.contexthub.HubEndpointSession p0, int p1);
}
