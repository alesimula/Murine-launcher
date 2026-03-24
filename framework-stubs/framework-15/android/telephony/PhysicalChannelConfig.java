package android.telephony;

public final class PhysicalChannelConfig implements android.os.Parcelable {
    @java.lang.Deprecated
    public static final int CONNECTION_PRIMARY_SERVING = 1;
    @java.lang.Deprecated
    public static final int CONNECTION_SECONDARY_SERVING = 2;
    @java.lang.Deprecated
    public static final int CONNECTION_UNKNOWN = -1;
    public static final int CHANNEL_NUMBER_UNKNOWN = 2147483647;
    public static final int PHYSICAL_CELL_ID_UNKNOWN = -1;
    public static final int PHYSICAL_CELL_ID_MAXIMUM_VALUE = 1007;
    public static final int CELL_BANDWIDTH_UNKNOWN = 0;
    public static final int FREQUENCY_UNKNOWN = -1;
    public static final int BAND_UNKNOWN = 0;
    @android.annotation.NonNull
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
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.telephony.PhysicalChannelConfig p0) {}
        public android.telephony.PhysicalChannelConfig build() { return null; }
        @android.annotation.NonNull
        public android.telephony.PhysicalChannelConfig.Builder setNetworkType(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.PhysicalChannelConfig.Builder setFrequencyRange(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.PhysicalChannelConfig.Builder setDownlinkChannelNumber(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.PhysicalChannelConfig.Builder setUplinkChannelNumber(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.PhysicalChannelConfig.Builder setCellBandwidthDownlinkKhz(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.PhysicalChannelConfig.Builder setCellBandwidthUplinkKhz(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.PhysicalChannelConfig.Builder setCellConnectionStatus(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.PhysicalChannelConfig.Builder setContextIds(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.PhysicalChannelConfig.Builder setPhysicalCellId(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.PhysicalChannelConfig.Builder setBand(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConnectionStatus {
    }
}
