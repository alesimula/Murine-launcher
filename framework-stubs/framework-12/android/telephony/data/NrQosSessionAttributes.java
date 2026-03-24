package android.telephony.data;

@android.annotation.SystemApi
public final class NrQosSessionAttributes implements android.os.Parcelable, android.net.QosSessionAttributes {
    private static final java.lang.String TAG = null;
    private final int m5Qi = 0;
    private final int mQfi = 0;
    private final long mMaxUplinkBitRate = 0L;
    private final long mMaxDownlinkBitRate = 0L;
    private final long mGuaranteedUplinkBitRate = 0L;
    private final long mGuaranteedDownlinkBitRate = 0L;
    private final long mAveragingWindow = 0L;
    private final java.util.List<java.net.InetSocketAddress> mRemoteAddresses = null;
    public static final android.os.Parcelable.Creator<android.telephony.data.NrQosSessionAttributes> CREATOR = null;
    public int getQosIdentifier() { return 0; }
    public int getQosFlowIdentifier() { return 0; }
    public long getGuaranteedUplinkBitRateKbps() { return 0L; }
    public long getGuaranteedDownlinkBitRateKbps() { return 0L; }
    public long getMaxUplinkBitRateKbps() { return 0L; }
    public long getMaxDownlinkBitRateKbps() { return 0L; }
    public java.time.Duration getBitRateWindowDuration() { return null; }
    public java.util.List<java.net.InetSocketAddress> getRemoteAddresses() { return null; }
    public NrQosSessionAttributes(int p0, int p1, long p2, long p3, long p4, long p5, long p6, java.util.List<java.net.InetSocketAddress> p7) {}
    private static java.util.List<java.net.InetSocketAddress> copySocketAddresses(java.util.List<java.net.InetSocketAddress> p0) { return null; }
    private NrQosSessionAttributes(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
