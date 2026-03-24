package android.bluetooth.le;

public final class TransportBlockFilter implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.le.TransportBlockFilter> CREATOR = null;
    public static final int WIFI_NAN_HASH_LENGTH_BYTES = 8;
    TransportBlockFilter() {}
    public int getOrgId() { return 0; }
    public int getTdsFlags() { return 0; }
    public int getTdsFlagsMask() { return 0; }
    @android.annotation.Nullable
    public byte[] getTransportData() { return null; }
    @android.annotation.Nullable
    public byte[] getTransportDataMask() { return null; }
    @android.annotation.Nullable
    public byte[] getWifiNanHash() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.bluetooth.le.TransportBlockFilter.Builder setTdsFlags(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.TransportBlockFilter.Builder setTransportData(byte[] p0, byte[] p1) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.TransportBlockFilter.Builder setWifiNanHash(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.TransportBlockFilter build() { return null; }
    }
}
