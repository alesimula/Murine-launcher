package android.net;

public final class EthernetNetworkUpdateRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.EthernetNetworkUpdateRequest> CREATOR = null;
    @android.annotation.Nullable
    public android.net.IpConfiguration getIpConfiguration() { return null; }
    @android.annotation.Nullable
    public android.net.NetworkCapabilities getNetworkCapabilities() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.net.EthernetNetworkUpdateRequest p0) {}
        @android.annotation.NonNull
        public android.net.EthernetNetworkUpdateRequest.Builder setIpConfiguration(android.net.IpConfiguration p0) { return null; }
        @android.annotation.NonNull
        public android.net.EthernetNetworkUpdateRequest.Builder setNetworkCapabilities(android.net.NetworkCapabilities p0) { return null; }
        @android.annotation.NonNull
        public android.net.EthernetNetworkUpdateRequest build() { return null; }
    }
}
