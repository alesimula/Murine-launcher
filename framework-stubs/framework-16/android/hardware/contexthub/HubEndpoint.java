package android.hardware.contexthub;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.chre.flags.offload_api")
public class HubEndpoint {
    public static final int REASON_FAILURE = 0;
    public static final int REASON_OPEN_ENDPOINT_SESSION_REQUEST_REJECTED = 3;
    public static final int REASON_CLOSE_ENDPOINT_SESSION_REQUESTED = 4;
    public static final int REASON_ENDPOINT_INVALID = 5;
    public static final int REASON_PERMISSION_DENIED = 9;
    public static final int REASON_ENDPOINT_STOPPED = 6;
    public void register(android.hardware.location.IContextHubService p0) {}
    public void unregister() {}
    public void openSession(android.hardware.contexthub.HubEndpointInfo p0, java.lang.String p1) {}
    public void closeSession(android.hardware.contexthub.HubEndpointSession p0) {}
    void sendMessage(android.hardware.contexthub.HubEndpointSession p0, android.hardware.contexthub.HubMessage p1, android.hardware.location.IContextHubTransactionCallback p2) {}
    public int getVersion() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getTag() { return null; }
    @android.annotation.NonNull
    public java.util.Collection<android.hardware.contexthub.HubServiceInfo> getServiceInfoCollection() { return null; }
    @android.annotation.Nullable
    public android.hardware.contexthub.HubEndpointLifecycleCallback getLifecycleCallback() { return null; }
    @android.annotation.Nullable
    public android.hardware.contexthub.HubEndpointMessageCallback getMessageCallback() { return null; }

    public static final class Builder {
        public Builder(android.content.Context p0) {}
        @android.annotation.NonNull
        public android.hardware.contexthub.HubEndpoint.Builder setVersion(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.contexthub.HubEndpoint.Builder setTag(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.contexthub.HubEndpoint.Builder setLifecycleCallback(android.hardware.contexthub.HubEndpointLifecycleCallback p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.contexthub.HubEndpoint.Builder setLifecycleCallback(java.util.concurrent.Executor p0, android.hardware.contexthub.HubEndpointLifecycleCallback p1) { return null; }
        @android.annotation.NonNull
        public android.hardware.contexthub.HubEndpoint.Builder setMessageCallback(android.hardware.contexthub.HubEndpointMessageCallback p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.contexthub.HubEndpoint.Builder setMessageCallback(java.util.concurrent.Executor p0, android.hardware.contexthub.HubEndpointMessageCallback p1) { return null; }
        @android.annotation.NonNull
        public android.hardware.contexthub.HubEndpoint.Builder setServiceInfoCollection(java.util.Collection<android.hardware.contexthub.HubServiceInfo> p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.contexthub.HubEndpoint build() { return null; }
    }

    static interface EndpointConsumer {
        public void accept(android.hardware.contexthub.IContextHubEndpoint p0) throws android.os.RemoteException;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Reason {
    }
}
