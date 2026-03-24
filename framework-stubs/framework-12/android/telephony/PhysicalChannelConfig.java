package android.telephony;

public final class PhysicalChannelConfig implements android.os.Parcelable {
    public static final int CONNECTION_PRIMARY_SERVING = 1;
    public static final int CONNECTION_SECONDARY_SERVING = 2;
    public static final int CONNECTION_UNKNOWN = -1;
    public static final int CHANNEL_NUMBER_UNKNOWN = 2147483647;
    public static final int PHYSICAL_CELL_ID_UNKNOWN = -1;
    public static final int PHYSICAL_CELL_ID_MAXIMUM_VALUE = 1007;
    public static final int CELL_BANDWIDTH_UNKNOWN = 0;
    public static final int FREQUENCY_UNKNOWN = -1;
    public static final int BAND_UNKNOWN = 0;
    private int mCellConnectionStatus;
    private int mCellBandwidthDownlinkKhz;
    private int mCellBandwidthUplinkKhz;
    private int mNetworkType;
    private int mFrequencyRange;
    private int mDownlinkFrequency;
    private int mUplinkFrequency;
    private int mDownlinkChannelNumber;
    private int mUplinkChannelNumber;
    private int[] mContextIds;
    private int mPhysicalCellId;
    private int mBand;
    public static final android.os.Parcelable.Creator<android.telephony.PhysicalChannelConfig> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getCellBandwidthDownlinkKhz() { return 0; }
    public int getCellBandwidthUplinkKhz() { return 0; }
    public int[] getContextIds() { return null; }
    public int getFrequencyRange() { return 0; }
    public int getDownlinkChannelNumber() { return 0; }
    public int getUplinkChannelNumber() { return 0; }
    public int getBand() { return 0; }
    public int getDownlinkFrequencyKhz() { return 0; }
    public int getUplinkFrequencyKhz() { return 0; }
    public int getPhysicalCellId() { return 0; }
    public int getNetworkType() { return 0; }
    public int getConnectionStatus() { return 0; }
    public android.telephony.PhysicalChannelConfig createLocationInfoSanitizedCopy() { return null; }
    private java.lang.String getConnectionStatusString() { return null; }
    private void setDownlinkFrequency() {}
    private void setUplinkFrequency() {}
    private void setFrequencyRange() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    private PhysicalChannelConfig(android.os.Parcel p0) {}
    private PhysicalChannelConfig(android.telephony.PhysicalChannelConfig.Builder p0) {}

    public static final class Builder {
        private int mNetworkType;
        private int mFrequencyRange;
        private int mDownlinkChannelNumber;
        private int mUplinkChannelNumber;
        private int mCellBandwidthDownlinkKhz;
        private int mCellBandwidthUplinkKhz;
        private int mCellConnectionStatus;
        private int[] mContextIds;
        private int mPhysicalCellId;
        private int mBand;
        public Builder() {}
        public Builder(android.telephony.PhysicalChannelConfig p0) {}
        public android.telephony.PhysicalChannelConfig build() { return null; }
        public android.telephony.PhysicalChannelConfig.Builder setNetworkType(int p0) { return null; }
        public android.telephony.PhysicalChannelConfig.Builder setFrequencyRange(int p0) { return null; }
        public android.telephony.PhysicalChannelConfig.Builder setDownlinkChannelNumber(int p0) { return null; }
        public android.telephony.PhysicalChannelConfig.Builder setUplinkChannelNumber(int p0) { return null; }
        public android.telephony.PhysicalChannelConfig.Builder setCellBandwidthDownlinkKhz(int p0) { return null; }
        public android.telephony.PhysicalChannelConfig.Builder setCellBandwidthUplinkKhz(int p0) { return null; }
        public android.telephony.PhysicalChannelConfig.Builder setCellConnectionStatus(int p0) { return null; }
        public android.telephony.PhysicalChannelConfig.Builder setContextIds(int[] p0) { return null; }
        public android.telephony.PhysicalChannelConfig.Builder setPhysicalCellId(int p0) { return null; }
        public android.telephony.PhysicalChannelConfig.Builder setBand(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConnectionStatus {
    }
}
