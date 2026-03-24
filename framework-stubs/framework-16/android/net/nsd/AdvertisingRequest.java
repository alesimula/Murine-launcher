package android.net.nsd;

@android.annotation.FlaggedApi("com.android.net.flags.ipv6_over_ble")
public final class AdvertisingRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.nsd.AdvertisingRequest> CREATOR = null;
    public static final long FLAG_SKIP_PROBING = 2L;
    AdvertisingRequest() {}
    public int describeContents() { return 0; }
    public long getFlags() { return 0L; }
    public int getProtocolType() { return 0; }
    @android.annotation.NonNull
    public android.net.nsd.NsdServiceInfo getServiceInfo() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("com.android.net.flags.ipv6_over_ble")
    public static final class Builder {
        public Builder(android.net.nsd.NsdServiceInfo p0) {}
        @android.annotation.NonNull
        public android.net.nsd.AdvertisingRequest build() { return null; }
        @android.annotation.NonNull
        public android.net.nsd.AdvertisingRequest.Builder setFlags(long p0) { return null; }
        @android.annotation.NonNull
        public android.net.nsd.AdvertisingRequest.Builder setProtocolType(int p0) { return null; }
    }
}
