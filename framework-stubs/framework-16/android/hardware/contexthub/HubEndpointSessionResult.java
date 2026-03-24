package android.hardware.contexthub;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.chre.flags.offload_api")
public class HubEndpointSessionResult {
    public boolean isAccepted() { return false; }
    @android.annotation.Nullable
    public java.lang.String getReason() { return null; }
    @android.annotation.NonNull
    public static android.hardware.contexthub.HubEndpointSessionResult accept() { return null; }
    @android.annotation.NonNull
    public static android.hardware.contexthub.HubEndpointSessionResult reject(java.lang.String p0) { return null; }
}
