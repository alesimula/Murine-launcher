package android.telephony.data;

@android.annotation.SystemApi
public final class EpsBearerQosSessionAttributes implements android.os.Parcelable, android.net.QosSessionAttributes {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.data.EpsBearerQosSessionAttributes> CREATOR = null;
    public int getQosIdentifier() { return 0; }
    public long getGuaranteedUplinkBitRateKbps() { return 0L; }
    public long getGuaranteedDownlinkBitRateKbps() { return 0L; }
    public long getMaxUplinkBitRateKbps() { return 0L; }
    public long getMaxDownlinkBitRateKbps() { return 0L; }
    @android.annotation.NonNull
    public java.util.List<java.net.InetSocketAddress> getRemoteAddresses() { return null; }
    public EpsBearerQosSessionAttributes(int p0, long p1, long p2, long p3, long p4, java.util.List<java.net.InetSocketAddress> p5) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
