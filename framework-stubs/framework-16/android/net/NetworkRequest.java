package android.net;

public class NetworkRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.NetworkRequest> CREATOR = null;
    NetworkRequest() {}
    public boolean canBeSatisfiedBy(android.net.NetworkCapabilities p0) { return false; }
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public int[] getCapabilities() { return null; }
    @android.annotation.NonNull
    public int[] getEnterpriseIds() { return null; }
    @android.annotation.NonNull
    public int[] getForbiddenCapabilities() { return null; }
    @android.annotation.Nullable
    public android.net.NetworkSpecifier getNetworkSpecifier() { return null; }
    @android.annotation.Nullable
    public java.lang.String getRequestorPackageName() { return null; }
    public int getRequestorUid() { return 0; }
    @android.annotation.FlaggedApi("com.android.net.flags.request_restricted_wifi")
    @android.annotation.NonNull
    public java.util.Set<java.lang.Integer> getSubscriptionIds() { return null; }
    @android.annotation.NonNull
    public int[] getTransportTypes() { return null; }
    public boolean hasCapability(int p0) { return false; }
    public boolean hasEnterpriseId(int p0) { return false; }
    public boolean hasForbiddenCapability(int p0) { return false; }
    public boolean hasTransport(int p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        public Builder() {}
        public Builder(android.net.NetworkRequest p0) {}
        public android.net.NetworkRequest.Builder addCapability(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkRequest.Builder addForbiddenCapability(int p0) { return null; }
        public android.net.NetworkRequest.Builder addTransportType(int p0) { return null; }
        public android.net.NetworkRequest build() { return null; }
        @android.annotation.NonNull
        public android.net.NetworkRequest.Builder clearCapabilities() { return null; }
        public android.net.NetworkRequest.Builder removeCapability(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkRequest.Builder removeForbiddenCapability(int p0) { return null; }
        public android.net.NetworkRequest.Builder removeTransportType(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkRequest.Builder setIncludeOtherUidNetworks(boolean p0) { return null; }
        public android.net.NetworkRequest.Builder setNetworkSpecifier(android.net.NetworkSpecifier p0) { return null; }
        @java.lang.Deprecated
        public android.net.NetworkRequest.Builder setNetworkSpecifier(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkRequest.Builder setSignalStrength(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.net.flags.request_restricted_wifi")
        @android.annotation.NonNull
        public android.net.NetworkRequest.Builder setSubscriptionIds(java.util.Set<java.lang.Integer> p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkRequest.Builder setUids(java.util.Set<android.util.Range<java.lang.Integer>> p0) { return null; }
    }
}
