package android.telephony.data;

public final class TrafficDescriptor implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.data.TrafficDescriptor> CREATOR = null;
    public TrafficDescriptor(java.lang.String p0, byte[] p1) {}
    public java.lang.String getDataNetworkName() { return null; }
    public byte[] getOsAppId() { return null; }
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder() {}
        public android.telephony.data.TrafficDescriptor.Builder setDataNetworkName(java.lang.String p0) { return null; }
        public android.telephony.data.TrafficDescriptor.Builder setOsAppId(byte[] p0) { return null; }
        public android.telephony.data.TrafficDescriptor build() { return null; }
    }

    public static final class OsAppId {
        public static final java.util.UUID ANDROID_OS_ID = null;
        public OsAppId(java.util.UUID p0, java.lang.String p1) {}
        public OsAppId(java.util.UUID p0, java.lang.String p1, int p2) {}
        public OsAppId(byte[] p0) {}
        public java.util.UUID getOsId() { return null; }
        public java.lang.String getAppId() { return null; }
        public int getDifferentiator() { return 0; }
        public byte[] getBytes() { return null; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
