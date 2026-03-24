package android.net;

@android.annotation.FlaggedApi("com.android.net.flags.ipv6_over_ble")
public final class L2capNetworkSpecifier extends android.net.NetworkSpecifier implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.L2capNetworkSpecifier> CREATOR = null;
    public static final int HEADER_COMPRESSION_6LOWPAN = 2;
    public static final int HEADER_COMPRESSION_ANY = 0;
    public static final int HEADER_COMPRESSION_NONE = 1;
    public static final int PSM_ANY = 0;
    public static final int ROLE_ANY = 0;
    public static final int ROLE_CLIENT = 1;
    public static final int ROLE_SERVER = 2;
    L2capNetworkSpecifier() { super(); }
    public int describeContents() { return 0; }
    public int getHeaderCompression() { return 0; }
    public int getPsm() { return 0; }
    @android.annotation.Nullable
    public android.net.MacAddress getRemoteAddress() { return null; }
    public int getRole() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.L2capNetworkSpecifier build() { return null; }
        @android.annotation.NonNull
        public android.net.L2capNetworkSpecifier.Builder setHeaderCompression(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.L2capNetworkSpecifier.Builder setPsm(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.L2capNetworkSpecifier.Builder setRemoteAddress(android.net.MacAddress p0) { return null; }
        @android.annotation.NonNull
        public android.net.L2capNetworkSpecifier.Builder setRole(int p0) { return null; }
    }
}
