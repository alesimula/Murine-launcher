package android.telecom;

public final class ConnectionRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telecom.ConnectionRequest> CREATOR = null;
    public ConnectionRequest(android.telecom.PhoneAccountHandle p0, android.net.Uri p1, android.os.Bundle p2) {}
    public ConnectionRequest(android.telecom.PhoneAccountHandle p0, android.net.Uri p1, android.os.Bundle p2, int p3) {}
    public ConnectionRequest(android.telecom.PhoneAccountHandle p0, android.net.Uri p1, android.os.Bundle p2, int p3, java.lang.String p4, boolean p5) {}
    public android.telecom.PhoneAccountHandle getAccountHandle() { return null; }
    public android.net.Uri getAddress() { return null; }
    public java.util.List<android.net.Uri> getParticipants() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public int getVideoState() { return 0; }
    @android.annotation.SystemApi
    public java.lang.String getTelecomCallId() { return null; }
    public boolean shouldShowIncomingCallUi() { return false; }
    public boolean isAdhocConferenceCall() { return false; }
    public android.os.ParcelFileDescriptor getRttPipeToInCall() { return null; }
    public android.os.ParcelFileDescriptor getRttPipeFromInCall() { return null; }
    public android.telecom.Connection.RttTextStream getRttTextStream() { return null; }
    public boolean isRequestingRtt() { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public android.telecom.ConnectionRequest.Builder setAccountHandle(android.telecom.PhoneAccountHandle p0) { return null; }
        public android.telecom.ConnectionRequest.Builder setParticipants(java.util.List<android.net.Uri> p0) { return null; }
        public android.telecom.ConnectionRequest.Builder setAddress(android.net.Uri p0) { return null; }
        public android.telecom.ConnectionRequest.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.telecom.ConnectionRequest.Builder setVideoState(int p0) { return null; }
        public android.telecom.ConnectionRequest.Builder setTelecomCallId(java.lang.String p0) { return null; }
        public android.telecom.ConnectionRequest.Builder setShouldShowIncomingCallUi(boolean p0) { return null; }
        public android.telecom.ConnectionRequest.Builder setIsAdhocConferenceCall(boolean p0) { return null; }
        public android.telecom.ConnectionRequest.Builder setRttPipeFromInCall(android.os.ParcelFileDescriptor p0) { return null; }
        public android.telecom.ConnectionRequest.Builder setRttPipeToInCall(android.os.ParcelFileDescriptor p0) { return null; }
        public android.telecom.ConnectionRequest build() { return null; }
    }
}
