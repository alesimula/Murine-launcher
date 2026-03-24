package android.hardware.contexthub;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.chre.flags.offload_api")
public final class HubEndpointInfo implements android.os.Parcelable {
    public static final int TYPE_FRAMEWORK = 1;
    public static final int TYPE_APP = 2;
    public static final int TYPE_NATIVE = 3;
    public static final int TYPE_NANOAPP = 4;
    public static final int TYPE_HUB_ENDPOINT = 5;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.HubEndpointInfo> CREATOR = null;
    public HubEndpointInfo(android.hardware.contexthub.EndpointInfo p0) {}
    public HubEndpointInfo(java.lang.String p0, int p1, java.lang.String p2, java.util.List<android.hardware.contexthub.HubServiceInfo> p3) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public android.hardware.contexthub.HubEndpointInfo.HubEndpointIdentifier getIdentifier() { return null; }
    public int getType() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getName() { return null; }
    public int getVersion() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getTag() { return null; }
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.NonNull
    public java.util.Collection<java.lang.String> getRequiredPermissions() { return null; }
    @android.annotation.NonNull
    public java.util.Collection<android.hardware.contexthub.HubServiceInfo> getServiceInfoCollection() { return null; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EndpointType {
    }

    public static class HubEndpointIdentifier {
        public HubEndpointIdentifier(long p0, long p1) {}
        public HubEndpointIdentifier(android.hardware.contexthub.EndpointId p0) {}
        public long getEndpoint() { return 0L; }
        public long getHub() { return 0L; }
        public static android.hardware.contexthub.HubEndpointInfo.HubEndpointIdentifier invalid() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }
}
