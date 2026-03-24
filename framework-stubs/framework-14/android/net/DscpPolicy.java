package android.net;

public final class DscpPolicy implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.DscpPolicy> CREATOR = null;
    public static final int PROTOCOL_ANY = -1;
    public static final int SOURCE_PORT_ANY = -1;
    DscpPolicy() {}
    public int describeContents() { return 0; }
    public int getPolicyId() { return 0; }
    public int getDscpValue() { return 0; }
    @android.annotation.Nullable
    public java.net.InetAddress getSourceAddress() { return null; }
    @android.annotation.Nullable
    public java.net.InetAddress getDestinationAddress() { return null; }
    public int getSourcePort() { return 0; }
    public int getProtocol() { return 0; }
    @android.annotation.Nullable
    public android.util.Range<java.lang.Integer> getDestinationPortRange() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0, int p1) {}
        @android.annotation.NonNull
        public android.net.DscpPolicy.Builder setSourceAddress(java.net.InetAddress p0) { return null; }
        @android.annotation.NonNull
        public android.net.DscpPolicy.Builder setDestinationAddress(java.net.InetAddress p0) { return null; }
        @android.annotation.NonNull
        public android.net.DscpPolicy.Builder setSourcePort(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.DscpPolicy.Builder setProtocol(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.DscpPolicy.Builder setDestinationPortRange(android.util.Range<java.lang.Integer> p0) { return null; }
        @android.annotation.NonNull
        public android.net.DscpPolicy build() { return null; }
    }
}
