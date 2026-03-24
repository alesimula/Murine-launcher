package android.telecom;

@android.annotation.SystemApi
public final class BluetoothCallQualityReport implements android.os.Parcelable {
    public static final java.lang.String EVENT_BLUETOOTH_CALL_QUALITY_REPORT = "android.telecom.event.BLUETOOTH_CALL_QUALITY_REPORT";
    public static final java.lang.String EXTRA_BLUETOOTH_CALL_QUALITY_REPORT = "android.telecom.extra.BLUETOOTH_CALL_QUALITY_REPORT";
    public static final android.os.Parcelable.Creator<android.telecom.BluetoothCallQualityReport> CREATOR = null;
    public long getSentTimestampMillis() { return 0L; }
    public boolean isChoppyVoice() { return false; }
    public int getRssiDbm() { return 0; }
    public int getSnrDb() { return 0; }
    public int getRetransmittedPacketsCount() { return 0; }
    public int getPacketsNotReceivedCount() { return 0; }
    public int getNegativeAcknowledgementCount() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder() {}
        public android.telecom.BluetoothCallQualityReport.Builder setSentTimestampMillis(long p0) { return null; }
        public android.telecom.BluetoothCallQualityReport.Builder setChoppyVoice(boolean p0) { return null; }
        public android.telecom.BluetoothCallQualityReport.Builder setRssiDbm(int p0) { return null; }
        public android.telecom.BluetoothCallQualityReport.Builder setSnrDb(int p0) { return null; }
        public android.telecom.BluetoothCallQualityReport.Builder setRetransmittedPacketsCount(int p0) { return null; }
        public android.telecom.BluetoothCallQualityReport.Builder setPacketsNotReceivedCount(int p0) { return null; }
        public android.telecom.BluetoothCallQualityReport.Builder setNegativeAcknowledgementCount(int p0) { return null; }
        public android.telecom.BluetoothCallQualityReport build() { return null; }
    }
}
