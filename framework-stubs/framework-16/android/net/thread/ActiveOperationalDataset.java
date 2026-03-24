package android.net.thread;

@android.annotation.FlaggedApi("com.android.net.thread.flags.thread_enabled")
public final class ActiveOperationalDataset implements android.os.Parcelable {
    public static final int CHANNEL_MAX_24_GHZ = 26;
    public static final int CHANNEL_MIN_24_GHZ = 11;
    public static final int CHANNEL_PAGE_24_GHZ = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.thread.ActiveOperationalDataset> CREATOR = null;
    public static final int LENGTH_EXTENDED_PAN_ID = 8;
    public static final int LENGTH_MAX_DATASET_TLVS = 254;
    public static final int LENGTH_MAX_NETWORK_NAME_BYTES = 16;
    public static final int LENGTH_MESH_LOCAL_PREFIX_BITS = 64;
    public static final int LENGTH_MIN_NETWORK_NAME_BYTES = 1;
    public static final int LENGTH_NETWORK_KEY = 16;
    public static final int LENGTH_PSKC = 16;
    ActiveOperationalDataset() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public static android.net.thread.ActiveOperationalDataset fromThreadTlvs(byte[] p0) { return null; }
    @android.annotation.NonNull
    public android.net.thread.OperationalDatasetTimestamp getActiveTimestamp() { return null; }
    public int getChannel() { return 0; }
    @android.annotation.NonNull
    public android.util.SparseArray<byte[]> getChannelMask() { return null; }
    public int getChannelPage() { return 0; }
    @android.annotation.NonNull
    public byte[] getExtendedPanId() { return null; }
    @android.annotation.NonNull
    public android.net.IpPrefix getMeshLocalPrefix() { return null; }
    @android.annotation.NonNull
    public byte[] getNetworkKey() { return null; }
    @android.annotation.NonNull
    public java.lang.String getNetworkName() { return null; }
    public int getPanId() { return 0; }
    @android.annotation.NonNull
    public byte[] getPskc() { return null; }
    @android.annotation.NonNull
    public android.net.thread.ActiveOperationalDataset.SecurityPolicy getSecurityPolicy() { return null; }
    @android.annotation.NonNull
    public byte[] toThreadTlvs() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.net.thread.ActiveOperationalDataset p0) {}
        @android.annotation.NonNull
        public android.net.thread.ActiveOperationalDataset build() { return null; }
        @android.annotation.NonNull
        public android.net.thread.ActiveOperationalDataset.Builder setActiveTimestamp(android.net.thread.OperationalDatasetTimestamp p0) { return null; }
        @android.annotation.NonNull
        public android.net.thread.ActiveOperationalDataset.Builder setChannel(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.thread.ActiveOperationalDataset.Builder setChannelMask(android.util.SparseArray<byte[]> p0) { return null; }
        @android.annotation.NonNull
        public android.net.thread.ActiveOperationalDataset.Builder setExtendedPanId(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.thread.ActiveOperationalDataset.Builder setMeshLocalPrefix(android.net.IpPrefix p0) { return null; }
        @android.annotation.NonNull
        public android.net.thread.ActiveOperationalDataset.Builder setNetworkKey(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.thread.ActiveOperationalDataset.Builder setNetworkName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.thread.ActiveOperationalDataset.Builder setPanId(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.thread.ActiveOperationalDataset.Builder setPskc(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.thread.ActiveOperationalDataset.Builder setSecurityPolicy(android.net.thread.ActiveOperationalDataset.SecurityPolicy p0) { return null; }
    }

    public static final class SecurityPolicy {
        public static final int DEFAULT_ROTATION_TIME_HOURS = 672;
        public static final int LENGTH_MIN_SECURITY_POLICY_FLAGS = 1;
        public SecurityPolicy(int p0, byte[] p1) {}
        @android.annotation.NonNull
        public byte[] getFlags() { return null; }
        public int getRotationTimeHours() { return 0; }
    }
}
