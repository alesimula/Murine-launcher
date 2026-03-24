package android.telecom;

public final class ParcelableConference implements android.os.Parcelable {
    private final android.telecom.PhoneAccountHandle mPhoneAccount = null;
    private final int mState = 0;
    private final int mConnectionCapabilities = 0;
    private final int mConnectionProperties = 0;
    private final java.util.List<java.lang.String> mConnectionIds = null;
    private final long mConnectTimeMillis = 0L;
    private final com.android.internal.telecom.IVideoProvider mVideoProvider = null;
    private final int mVideoState = 0;
    private final android.telecom.StatusHints mStatusHints = null;
    private final android.os.Bundle mExtras = null;
    private final long mConnectElapsedTimeMillis = 0L;
    private final android.net.Uri mAddress = null;
    private final int mAddressPresentation = 0;
    private final java.lang.String mCallerDisplayName = null;
    private final int mCallerDisplayNamePresentation = 0;
    private final android.telecom.DisconnectCause mDisconnectCause = null;
    private final boolean mRingbackRequested = false;
    private final int mCallDirection = 0;
    public static final android.os.Parcelable.Creator<android.telecom.ParcelableConference> CREATOR = null;
    private ParcelableConference(android.telecom.PhoneAccountHandle p0, int p1, int p2, int p3, java.util.List<java.lang.String> p4, com.android.internal.telecom.IVideoProvider p5, int p6, long p7, long p8, android.telecom.StatusHints p9, android.os.Bundle p10, android.net.Uri p11, int p12, java.lang.String p13, int p14, android.telecom.DisconnectCause p15, boolean p16, int p17) {}
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
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.telecom.PhoneAccountHandle mPhoneAccount = null;
        private final int mState = 0;
        private int mConnectionCapabilities;
        private int mConnectionProperties;
        private java.util.List<java.lang.String> mConnectionIds;
        private long mConnectTimeMillis;
        private com.android.internal.telecom.IVideoProvider mVideoProvider;
        private int mVideoState;
        private android.telecom.StatusHints mStatusHints;
        private android.os.Bundle mExtras;
        private long mConnectElapsedTimeMillis;
        private android.net.Uri mAddress;
        private int mAddressPresentation;
        private java.lang.String mCallerDisplayName;
        private int mCallerDisplayNamePresentation;
        private android.telecom.DisconnectCause mDisconnectCause;
        private boolean mRingbackRequested;
        private int mCallDirection;
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
