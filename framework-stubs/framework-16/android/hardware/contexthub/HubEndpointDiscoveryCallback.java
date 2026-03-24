package android.hardware.contexthub;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.chre.flags.offload_api")
public interface HubEndpointDiscoveryCallback {
    public void onEndpointsStarted(java.util.List<android.hardware.contexthub.HubDiscoveryInfo> p0);
    public void onEndpointsStopped(java.util.List<android.hardware.contexthub.HubDiscoveryInfo> p0, int p1);
}
