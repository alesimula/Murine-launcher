package android.telephony;

public final class SignalStrengthUpdateRequest implements android.os.Parcelable {
    private final java.util.List<android.telephony.SignalThresholdInfo> mSignalThresholdInfos = null;
    private final boolean mIsReportingRequestedWhileIdle = false;
    private final boolean mIsSystemThresholdReportingRequestedWhileIdle = false;
    private final android.os.IBinder mLiveToken = null;
    public static final android.os.Parcelable.Creator<android.telephony.SignalStrengthUpdateRequest> CREATOR = null;
    private SignalStrengthUpdateRequest(java.util.List<android.telephony.SignalThresholdInfo> p0, boolean p1, boolean p2) {}
    private SignalStrengthUpdateRequest(android.os.Parcel p0) {}
    public java.util.Collection<android.telephony.SignalThresholdInfo> getSignalThresholdInfos() { return null; }
    public boolean isReportingRequestedWhileIdle() { return false; }
    public boolean isSystemThresholdReportingRequestedWhileIdle() { return false; }
    public android.os.IBinder getLiveToken() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    private static void validate(java.util.Collection<android.telephony.SignalThresholdInfo> p0) {}

    public static final class Builder {
        private java.util.List<android.telephony.SignalThresholdInfo> mSignalThresholdInfos;
        private boolean mIsReportingRequestedWhileIdle;
        private boolean mIsSystemThresholdReportingRequestedWhileIdle;
        public Builder() {}
        public android.telephony.SignalStrengthUpdateRequest.Builder setSignalThresholdInfos(java.util.Collection<android.telephony.SignalThresholdInfo> p0) { return null; }
        public android.telephony.SignalStrengthUpdateRequest.Builder setReportingRequestedWhileIdle(boolean p0) { return null; }
        public android.telephony.SignalStrengthUpdateRequest.Builder setSystemThresholdReportingRequestedWhileIdle(boolean p0) { return null; }
        public android.telephony.SignalStrengthUpdateRequest build() { return null; }
    }
}
