package android.hardware.contexthub;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.chre.flags.offload_api")
public interface HubEndpointMessageCallback {
    public void onMessageReceived(android.hardware.contexthub.HubEndpointSession p0, android.hardware.contexthub.HubMessage p1);
}
