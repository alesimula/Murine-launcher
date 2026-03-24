package android.telephony.data;

public final class TrafficDescriptor implements android.os.Parcelable {
    private final java.lang.String mDnn = null;
    private final byte[] mOsAppId = null;
    public static final android.os.Parcelable.Creator<android.telephony.data.TrafficDescriptor> CREATOR = null;
    private TrafficDescriptor(android.os.Parcel p0) {}
    public TrafficDescriptor(java.lang.String p0, byte[] p1) {}
    public java.lang.String getDataNetworkName() { return null; }
    public byte[] getOsAppId() { return null; }
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        private java.lang.String mDnn;
        private byte[] mOsAppId;
        public Builder() {}
        public android.telephony.data.TrafficDescriptor.Builder setDataNetworkName(java.lang.String p0) { return null; }
        public android.telephony.data.TrafficDescriptor.Builder setOsAppId(byte[] p0) { return null; }
        public android.telephony.data.TrafficDescriptor build() { return null; }
    }
}
