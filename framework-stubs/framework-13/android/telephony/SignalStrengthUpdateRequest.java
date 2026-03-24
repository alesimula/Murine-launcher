package android.telephony;

public final class SignalStrengthUpdateRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.SignalStrengthUpdateRequest> CREATOR = null;
    public java.util.Collection<android.telephony.SignalThresholdInfo> getSignalThresholdInfos() { return null; }
    public boolean isReportingRequestedWhileIdle() { return false; }
    @android.annotation.SystemApi
    public boolean isSystemThresholdReportingRequestedWhileIdle() { return false; }
    public android.os.IBinder getLiveToken() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        public android.telephony.SignalStrengthUpdateRequest.Builder setSignalThresholdInfos(java.util.Collection<android.telephony.SignalThresholdInfo> p0) { return null; }
        public android.telephony.SignalStrengthUpdateRequest.Builder setReportingRequestedWhileIdle(boolean p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.LISTEN_ALWAYS_REPORTED_SIGNAL_STRENGTH")
        public android.telephony.SignalStrengthUpdateRequest.Builder setSystemThresholdReportingRequestedWhileIdle(boolean p0) { return null; }
        public android.telephony.SignalStrengthUpdateRequest build() { return null; }
    }
}
