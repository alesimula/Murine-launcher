package android.telephony.data;

@android.annotation.SystemApi
public final class NrQosSessionAttributes implements android.os.Parcelable, android.net.QosSessionAttributes {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.data.NrQosSessionAttributes> CREATOR = null;
    public int getQosIdentifier() { return 0; }
    public int getQosFlowIdentifier() { return 0; }
    public long getGuaranteedUplinkBitRateKbps() { return 0L; }
    public long getGuaranteedDownlinkBitRateKbps() { return 0L; }
    public long getMaxUplinkBitRateKbps() { return 0L; }
    public long getMaxDownlinkBitRateKbps() { return 0L; }
    @android.annotation.NonNull
    public java.time.Duration getBitRateWindowDuration() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.net.InetSocketAddress> getRemoteAddresses() { return null; }
    public NrQosSessionAttributes(int p0, int p1, long p2, long p3, long p4, long p5, long p6, java.util.List<java.net.InetSocketAddress> p7) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
