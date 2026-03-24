package android.net.lowpan;

public class LowpanIdentity implements android.os.Parcelable {
    private static final java.lang.String TAG = null;
    public static final int UNSPECIFIED_CHANNEL = -1;
    public static final int UNSPECIFIED_PANID = -1;
    private java.lang.String mName;
    private boolean mIsNameValid;
    private byte[] mRawName;
    private java.lang.String mType;
    private byte[] mXpanid;
    private int mPanid;
    private int mChannel;
    public static final android.os.Parcelable.Creator<android.net.lowpan.LowpanIdentity> CREATOR = null;
    LowpanIdentity() {}
    public java.lang.String getName() { return null; }
    public boolean isNameValid() { return false; }
    public byte[] getRawName() { return null; }
    public byte[] getXpanid() { return null; }
    public int getPanid() { return 0; }
    public java.lang.String getType() { return null; }
    public int getChannel() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        final android.net.lowpan.LowpanIdentity mIdentity = null;
        public Builder() {}
        private static java.lang.String escape(byte[] p0) { return null; }
        public android.net.lowpan.LowpanIdentity.Builder setLowpanIdentity(android.net.lowpan.LowpanIdentity p0) { return null; }
        public android.net.lowpan.LowpanIdentity.Builder setName(java.lang.String p0) { return null; }
        public android.net.lowpan.LowpanIdentity.Builder setRawName(byte[] p0) { return null; }
        public android.net.lowpan.LowpanIdentity.Builder setXpanid(byte[] p0) { return null; }
        public android.net.lowpan.LowpanIdentity.Builder setPanid(int p0) { return null; }
        public android.net.lowpan.LowpanIdentity.Builder setType(java.lang.String p0) { return null; }
        public android.net.lowpan.LowpanIdentity.Builder setChannel(int p0) { return null; }
        public android.net.lowpan.LowpanIdentity build() { return null; }
    }
}
