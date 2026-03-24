package android.telephony;

public final class PhysicalChannelConfig implements android.os.Parcelable {
    public static final int CONNECTION_PRIMARY_SERVING = 1;
    public static final int CONNECTION_SECONDARY_SERVING = 2;
    public static final int CONNECTION_UNKNOWN = 2147483647;
    private int mCellConnectionStatus;
    private int mCellBandwidthDownlinkKhz;
    private int mRat;
    private int mFrequencyRange;
    private int mChannelNumber;
    private int[] mContextIds;
    private int mPhysicalCellId;
    public static final android.os.Parcelable.Creator<android.telephony.PhysicalChannelConfig> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getCellBandwidthDownlink() { return 0; }
    public int[] getContextIds() { return null; }
    public int getFrequencyRange() { return 0; }
    public int getChannelNumber() { return 0; }
    public int getPhysicalCellId() { return 0; }
    public int getRat() { return 0; }
    public int getConnectionStatus() { return 0; }
    private java.lang.String getConnectionStatusString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    private PhysicalChannelConfig(android.os.Parcel p0) {}
    private PhysicalChannelConfig(android.telephony.PhysicalChannelConfig.Builder p0) {}

    public static final class Builder {
        private int mRat;
        private int mFrequencyRange;
        private int mChannelNumber;
        private int mCellBandwidthDownlinkKhz;
        private int mCellConnectionStatus;
        private int[] mContextIds;
        private int mPhysicalCellId;
        public Builder() {}
        public android.telephony.PhysicalChannelConfig build() { return null; }
        public android.telephony.PhysicalChannelConfig.Builder setRat(int p0) { return null; }
        public android.telephony.PhysicalChannelConfig.Builder setFrequencyRange(int p0) { return null; }
        public android.telephony.PhysicalChannelConfig.Builder setChannelNumber(int p0) { return null; }
        public android.telephony.PhysicalChannelConfig.Builder setCellBandwidthDownlinkKhz(int p0) { return null; }
        public android.telephony.PhysicalChannelConfig.Builder setCellConnectionStatus(int p0) { return null; }
        public android.telephony.PhysicalChannelConfig.Builder setContextIds(int[] p0) { return null; }
        public android.telephony.PhysicalChannelConfig.Builder setPhysicalCellId(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConnectionStatus {
    }
}
