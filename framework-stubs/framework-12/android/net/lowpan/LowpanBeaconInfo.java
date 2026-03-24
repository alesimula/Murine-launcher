package android.net.lowpan;

public class LowpanBeaconInfo implements android.os.Parcelable {
    public static final int UNKNOWN_RSSI = 2147483647;
    public static final int UNKNOWN_LQI = 0;
    private android.net.lowpan.LowpanIdentity mIdentity;
    private int mRssi;
    private int mLqi;
    private byte[] mBeaconAddress;
    private final java.util.TreeSet<java.lang.Integer> mFlags = null;
    public static final int FLAG_CAN_ASSIST = 1;
    public static final android.os.Parcelable.Creator<android.net.lowpan.LowpanBeaconInfo> CREATOR = null;
    private LowpanBeaconInfo() {}
    public android.net.lowpan.LowpanIdentity getLowpanIdentity() { return null; }
    public int getRssi() { return 0; }
    public int getLqi() { return 0; }
    public byte[] getBeaconAddress() { return null; }
    public java.util.Collection<java.lang.Integer> getFlags() { return null; }
    public boolean isFlagSet(int p0) { return false; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        final android.net.lowpan.LowpanIdentity.Builder mIdentityBuilder = null;
        final android.net.lowpan.LowpanBeaconInfo mBeaconInfo = null;
        public Builder() {}
        public android.net.lowpan.LowpanBeaconInfo.Builder setLowpanIdentity(android.net.lowpan.LowpanIdentity p0) { return null; }
        public android.net.lowpan.LowpanBeaconInfo.Builder setName(java.lang.String p0) { return null; }
        public android.net.lowpan.LowpanBeaconInfo.Builder setXpanid(byte[] p0) { return null; }
        public android.net.lowpan.LowpanBeaconInfo.Builder setPanid(int p0) { return null; }
        public android.net.lowpan.LowpanBeaconInfo.Builder setChannel(int p0) { return null; }
        public android.net.lowpan.LowpanBeaconInfo.Builder setType(java.lang.String p0) { return null; }
        public android.net.lowpan.LowpanBeaconInfo.Builder setRssi(int p0) { return null; }
        public android.net.lowpan.LowpanBeaconInfo.Builder setLqi(int p0) { return null; }
        public android.net.lowpan.LowpanBeaconInfo.Builder setBeaconAddress(byte[] p0) { return null; }
        public android.net.lowpan.LowpanBeaconInfo.Builder setFlag(int p0) { return null; }
        public android.net.lowpan.LowpanBeaconInfo.Builder setFlags(java.util.Collection<java.lang.Integer> p0) { return null; }
        public android.net.lowpan.LowpanBeaconInfo build() { return null; }
    }
}
