package android.telecom;

public final class ParcelableConference implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telecom.ParcelableConference> CREATOR = null;
    public java.lang.String toString() { return null; }
    public android.telecom.PhoneAccountHandle getPhoneAccount() { return null; }
    public int getState() { return 0; }
    public int getConnectionCapabilities() { return 0; }
    public int getConnectionProperties() { return 0; }
    public java.util.List<java.lang.String> getConnectionIds() { return null; }
    public long getConnectTimeMillis() { return 0L; }
    public long getConnectElapsedTimeMillis() { return 0L; }
    public com.android.internal.telecom.IVideoProvider getVideoProvider() { return null; }
    public int getVideoState() { return 0; }
    public android.telecom.StatusHints getStatusHints() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public android.net.Uri getHandle() { return null; }
    public final android.telecom.DisconnectCause getDisconnectCause() { return null; }
    public boolean isRingbackRequested() { return false; }
    public int getHandlePresentation() { return 0; }
    public int getCallDirection() { return 0; }
    public java.lang.String getCallerDisplayName() { return null; }
    public int getCallerDisplayNamePresentation() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(android.telecom.PhoneAccountHandle p0, int p1) {}
        public android.telecom.ParcelableConference.Builder setDisconnectCause(android.telecom.DisconnectCause p0) { return null; }
        public android.telecom.ParcelableConference.Builder setRingbackRequested(boolean p0) { return null; }
        public android.telecom.ParcelableConference.Builder setCallerDisplayName(java.lang.String p0, int p1) { return null; }
        public android.telecom.ParcelableConference.Builder setAddress(android.net.Uri p0, int p1) { return null; }
        public android.telecom.ParcelableConference.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.telecom.ParcelableConference.Builder setStatusHints(android.telecom.StatusHints p0) { return null; }
        public android.telecom.ParcelableConference.Builder setConnectTimeMillis(long p0, long p1) { return null; }
        public android.telecom.ParcelableConference.Builder setVideoAttributes(com.android.internal.telecom.IVideoProvider p0, int p1) { return null; }
        public android.telecom.ParcelableConference.Builder setConnectionIds(java.util.List<java.lang.String> p0) { return null; }
        public android.telecom.ParcelableConference.Builder setConnectionProperties(int p0) { return null; }
        public android.telecom.ParcelableConference.Builder setConnectionCapabilities(int p0) { return null; }
        public android.telecom.ParcelableConference.Builder setCallDirection(int p0) { return null; }
        public android.telecom.ParcelableConference build() { return null; }
    }
}
