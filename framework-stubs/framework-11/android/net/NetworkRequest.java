package android.net;

public class NetworkRequest implements android.os.Parcelable {
    public final android.net.NetworkCapabilities networkCapabilities = null;
    public final int requestId = 0;
    public final int legacyType = 0;
    public final android.net.NetworkRequest.Type type = null;
    public static final android.os.Parcelable.Creator<android.net.NetworkRequest> CREATOR = null;
    public NetworkRequest(android.net.NetworkCapabilities p0, int p1, int p2, android.net.NetworkRequest.Type p3) {}
    public NetworkRequest(android.net.NetworkRequest p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean isListen() { return false; }
    public boolean isRequest() { return false; }
    public boolean isForegroundRequest() { return false; }
    public boolean isBackgroundRequest() { return false; }
    public boolean hasCapability(int p0) { return false; }
    public boolean hasUnwantedCapability(int p0) { return false; }
    public boolean canBeSatisfiedBy(android.net.NetworkCapabilities p0) { return false; }
    public boolean hasTransport(int p0) { return false; }
    public android.net.NetworkSpecifier getNetworkSpecifier() { return null; }
    @android.annotation.SystemApi
    public int getRequestorUid() { return 0; }
    @android.annotation.SystemApi
    public java.lang.String getRequestorPackageName() { return null; }
    public java.lang.String toString() { return null; }
    private int typeToProtoEnum(android.net.NetworkRequest.Type p0) { return 0; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static class Builder {
        private final android.net.NetworkCapabilities mNetworkCapabilities = null;
        public Builder() {}
        public android.net.NetworkRequest build() { return null; }
        public android.net.NetworkRequest.Builder addCapability(int p0) { return null; }
        public android.net.NetworkRequest.Builder removeCapability(int p0) { return null; }
        public android.net.NetworkRequest.Builder setCapabilities(android.net.NetworkCapabilities p0) { return null; }
        public android.net.NetworkRequest.Builder setUids(java.util.Set<android.net.UidRange> p0) { return null; }
        public android.net.NetworkRequest.Builder addUnwantedCapability(int p0) { return null; }
        public android.net.NetworkRequest.Builder clearCapabilities() { return null; }
        public android.net.NetworkRequest.Builder addTransportType(int p0) { return null; }
        public android.net.NetworkRequest.Builder removeTransportType(int p0) { return null; }
        public android.net.NetworkRequest.Builder setLinkUpstreamBandwidthKbps(int p0) { return null; }
        public android.net.NetworkRequest.Builder setLinkDownstreamBandwidthKbps(int p0) { return null; }
        @java.lang.Deprecated
        public android.net.NetworkRequest.Builder setNetworkSpecifier(java.lang.String p0) { return null; }
        public android.net.NetworkRequest.Builder setNetworkSpecifier(android.net.NetworkSpecifier p0) { return null; }
        @android.annotation.SystemApi
        public android.net.NetworkRequest.Builder setSignalStrength(int p0) { return null; }
    }

    public static enum Type {
        NONE,
        LISTEN,
        TRACK_DEFAULT,
        REQUEST,
        BACKGROUND_REQUEST;
        private Type() {}
    }
}
