package android.net.nsd;

public final class DiscoveryRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.nsd.DiscoveryRequest> CREATOR = null;
    DiscoveryRequest() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public android.net.Network getNetwork() { return null; }
    @android.annotation.NonNull
    public java.lang.String getServiceType() { return null; }
    @android.annotation.Nullable
    public java.lang.String getSubtype() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.net.nsd.DiscoveryRequest build() { return null; }
        @android.annotation.NonNull
        public android.net.nsd.DiscoveryRequest.Builder setNetwork(android.net.Network p0) { return null; }
        @android.annotation.NonNull
        public android.net.nsd.DiscoveryRequest.Builder setSubtype(java.lang.String p0) { return null; }
    }
}
