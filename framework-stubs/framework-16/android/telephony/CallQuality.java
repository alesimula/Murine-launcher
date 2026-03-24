package android.telephony;

@android.annotation.SystemApi
public final class CallQuality implements android.os.Parcelable {
    public static final int CALL_QUALITY_EXCELLENT = 0;
    public static final int CALL_QUALITY_GOOD = 1;
    public static final int CALL_QUALITY_FAIR = 2;
    public static final int CALL_QUALITY_POOR = 3;
    public static final int CALL_QUALITY_BAD = 4;
    public static final int CALL_QUALITY_NOT_AVAILABLE = 5;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.CallQuality> CREATOR = null;
    public CallQuality(android.os.Parcel p0) {}
    public CallQuality() {}
    public CallQuality(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10) {}
    public CallQuality(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, boolean p11, boolean p12, boolean p13) {}
    public int getDownlinkCallQualityLevel() { return 0; }
    public int getUplinkCallQualityLevel() { return 0; }
    public int getCallDuration() { return 0; }
    public int getNumRtpPacketsTransmitted() { return 0; }
    public int getNumRtpPacketsReceived() { return 0; }
    public int getNumRtpPacketsTransmittedLost() { return 0; }
    public int getNumRtpPacketsNotReceived() { return 0; }
    public int getAverageRelativeJitter() { return 0; }
    public int getMaxRelativeJitter() { return 0; }
    public int getAverageRoundTripTime() { return 0; }
    public boolean isRtpInactivityDetected() { return false; }
    public boolean isIncomingSilenceDetectedAtCallSetup() { return false; }
    public boolean isOutgoingSilenceDetectedAtCallSetup() { return false; }
    public int getNumVoiceFrames() { return 0; }
    public int getNumNoDataFrames() { return 0; }
    public int getNumDroppedRtpPackets() { return 0; }
    public long getMinPlayoutDelayMillis() { return 0L; }
    public long getMaxPlayoutDelayMillis() { return 0L; }
    public int getNumRtpSidPacketsReceived() { return 0; }
    public int getNumRtpDuplicatePackets() { return 0; }
    public int getCodecType() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setDownlinkCallQualityLevel(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setUplinkCallQualityLevel(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setCallDurationMillis(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setNumRtpPacketsTransmitted(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setNumRtpPacketsReceived(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setNumRtpPacketsTransmittedLost(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setNumRtpPacketsNotReceived(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setAverageRelativeJitter(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setMaxRelativeJitter(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setAverageRoundTripTimeMillis(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setCodecType(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setRtpInactivityDetected(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setIncomingSilenceDetectedAtCallSetup(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setOutgoingSilenceDetectedAtCallSetup(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setNumVoiceFrames(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setNumNoDataFrames(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setNumDroppedRtpPackets(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setMinPlayoutDelayMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setMaxPlayoutDelayMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setNumRtpSidPacketsReceived(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality.Builder setNumRtpDuplicatePackets(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.CallQuality build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallQualityLevel {
    }
}
