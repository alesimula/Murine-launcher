package android.net;

@android.annotation.FlaggedApi("com.android.net.flags.ipsec_transform_state")
public final class IpSecTransformState implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.IpSecTransformState> CREATOR = null;
    IpSecTransformState() {}
    public int describeContents() { return 0; }
    public long getByteCount() { return 0L; }
    public long getPacketCount() { return 0L; }
    @android.annotation.NonNull
    public byte[] getReplayBitmap() { return null; }
    public long getRxHighestSequenceNumber() { return 0L; }
    public long getTimestampMillis() { return 0L; }
    public long getTxHighestSequenceNumber() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("com.android.net.flags.ipsec_transform_state")
    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.IpSecTransformState build() { return null; }
        @android.annotation.NonNull
        public android.net.IpSecTransformState.Builder setByteCount(long p0) { return null; }
        @android.annotation.NonNull
        public android.net.IpSecTransformState.Builder setPacketCount(long p0) { return null; }
        @android.annotation.NonNull
        public android.net.IpSecTransformState.Builder setReplayBitmap(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.IpSecTransformState.Builder setRxHighestSequenceNumber(long p0) { return null; }
        @android.annotation.NonNull
        public android.net.IpSecTransformState.Builder setTimestampMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.net.IpSecTransformState.Builder setTxHighestSequenceNumber(long p0) { return null; }
    }
}
