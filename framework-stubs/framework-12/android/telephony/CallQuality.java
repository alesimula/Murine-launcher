package android.telephony;

@android.annotation.SystemApi
public final class CallQuality implements android.os.Parcelable {
    public static final int CALL_QUALITY_EXCELLENT = 0;
    public static final int CALL_QUALITY_GOOD = 1;
    public static final int CALL_QUALITY_FAIR = 2;
    public static final int CALL_QUALITY_POOR = 3;
    public static final int CALL_QUALITY_BAD = 4;
    public static final int CALL_QUALITY_NOT_AVAILABLE = 5;
    private int mDownlinkCallQualityLevel;
    private int mUplinkCallQualityLevel;
    private int mCallDuration;
    private int mNumRtpPacketsTransmitted;
    private int mNumRtpPacketsReceived;
    private int mNumRtpPacketsTransmittedLost;
    private int mNumRtpPacketsNotReceived;
    private int mAverageRelativeJitter;
    private int mMaxRelativeJitter;
    private int mAverageRoundTripTime;
    private int mCodecType;
    private boolean mRtpInactivityDetected;
    private boolean mRxSilenceDetected;
    private boolean mTxSilenceDetected;
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
    public int getCodecType() { return 0; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallQualityLevel {
    }
}
