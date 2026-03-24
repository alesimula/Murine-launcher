package android.net.wifi.aware;

public final class ConfigRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.aware.ConfigRequest> CREATOR = null;
    ConfigRequest() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.OuiKeyedData> getVendorData() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.wifi.aware.ConfigRequest build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.ConfigRequest.Builder setVendorData(java.util.List<android.net.wifi.OuiKeyedData> p0) { return null; }
    }
}
