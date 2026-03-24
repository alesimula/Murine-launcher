package android.telecom;

public final class ConnectionRequest implements android.os.Parcelable {
    private final android.telecom.PhoneAccountHandle mAccountHandle = null;
    private final android.net.Uri mAddress = null;
    private final android.os.Bundle mExtras = null;
    private final int mVideoState = 0;
    private final java.lang.String mTelecomCallId = null;
    private final boolean mShouldShowIncomingCallUi = false;
    private final android.os.ParcelFileDescriptor mRttPipeToInCall = null;
    private final android.os.ParcelFileDescriptor mRttPipeFromInCall = null;
    private android.telecom.Connection.RttTextStream mRttTextStream;
    private java.util.List<android.net.Uri> mParticipants;
    private final boolean mIsAdhocConference = false;
    public static final android.os.Parcelable.Creator<android.telecom.ConnectionRequest> CREATOR = null;
    public ConnectionRequest(android.telecom.PhoneAccountHandle p0, android.net.Uri p1, android.os.Bundle p2) {}
    public ConnectionRequest(android.telecom.PhoneAccountHandle p0, android.net.Uri p1, android.os.Bundle p2, int p3) {}
    public ConnectionRequest(android.telecom.PhoneAccountHandle p0, android.net.Uri p1, android.os.Bundle p2, int p3, java.lang.String p4, boolean p5) {}
    private ConnectionRequest(android.telecom.PhoneAccountHandle p0, android.net.Uri p1, android.os.Bundle p2, int p3, java.lang.String p4, boolean p5, android.os.ParcelFileDescriptor p6, android.os.ParcelFileDescriptor p7) {}
    private ConnectionRequest(android.telecom.PhoneAccountHandle p0, android.net.Uri p1, android.os.Bundle p2, int p3, java.lang.String p4, boolean p5, android.os.ParcelFileDescriptor p6, android.os.ParcelFileDescriptor p7, java.util.List<android.net.Uri> p8, boolean p9) {}
    private ConnectionRequest(android.os.Parcel p0) {}
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
    private static java.lang.String bundleToString(android.os.Bundle p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.telecom.PhoneAccountHandle mAccountHandle;
        private android.net.Uri mAddress;
        private android.os.Bundle mExtras;
        private int mVideoState;
        private java.lang.String mTelecomCallId;
        private boolean mShouldShowIncomingCallUi;
        private android.os.ParcelFileDescriptor mRttPipeToInCall;
        private android.os.ParcelFileDescriptor mRttPipeFromInCall;
        private java.util.List<android.net.Uri> mParticipants;
        private boolean mIsAdhocConference;
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
