package android.net.wifi.aware;

public final class ConfigRequest implements android.os.Parcelable {
    public static final int CLUSTER_ID_MIN = 0;
    public static final int CLUSTER_ID_MAX = 65535;
    public static final int NAN_BAND_24GHZ = 0;
    public static final int NAN_BAND_5GHZ = 1;
    public static final int DW_INTERVAL_NOT_INIT = -1;
    public static final int DW_DISABLE = 0;
    public final boolean mSupport5gBand = false;
    public final int mMasterPreference = 0;
    public final int mClusterLow = 0;
    public final int mClusterHigh = 0;
    public final int[] mDiscoveryWindowInterval = null;
    public static final android.os.Parcelable.Creator<android.net.wifi.aware.ConfigRequest> CREATOR = null;
    private ConfigRequest(boolean p0, int p1, int p2, int p3, int[] p4) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void validate() throws java.lang.IllegalArgumentException {}

    public static final class Builder {
        private boolean mSupport5gBand;
        private int mMasterPreference;
        private int mClusterLow;
        private int mClusterHigh;
        private int[] mDiscoveryWindowInterval;
        public Builder() {}
        public android.net.wifi.aware.ConfigRequest.Builder setSupport5gBand(boolean p0) { return null; }
        public android.net.wifi.aware.ConfigRequest.Builder setMasterPreference(int p0) { return null; }
        public android.net.wifi.aware.ConfigRequest.Builder setClusterLow(int p0) { return null; }
        public android.net.wifi.aware.ConfigRequest.Builder setClusterHigh(int p0) { return null; }
        public android.net.wifi.aware.ConfigRequest.Builder setDiscoveryWindowInterval(int p0, int p1) { return null; }
        public android.net.wifi.aware.ConfigRequest build() { return null; }
    }
}
