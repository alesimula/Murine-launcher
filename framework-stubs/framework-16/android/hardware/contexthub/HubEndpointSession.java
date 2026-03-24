package android.hardware.contexthub;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.chre.flags.offload_api")
public class HubEndpointSession implements java.lang.AutoCloseable {
    HubEndpointSession(int p0, android.hardware.contexthub.HubEndpoint p1, android.hardware.contexthub.HubEndpointInfo p2, android.hardware.contexthub.HubEndpointInfo p3, java.lang.String p4) {}
    @android.annotation.NonNull
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public android.hardware.location.ContextHubTransaction<java.lang.Void> sendMessage(android.hardware.contexthub.HubMessage p0) { return null; }
    public int getId() { return 0; }
    public void setOpened() {}
    public void setClosed() {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public void close() {}
    @android.annotation.Nullable
    public java.lang.String getServiceDescriptor() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    protected void finalize() throws java.lang.Throwable {}
}
