package android.telecom;

public final class ParcelableConnection implements android.os.Parcelable {
    private final android.telecom.PhoneAccountHandle mPhoneAccount = null;
    private final int mState = 0;
    private final int mConnectionCapabilities = 0;
    private final int mConnectionProperties = 0;
    private final int mSupportedAudioRoutes = 0;
    private final android.net.Uri mAddress = null;
    private final int mAddressPresentation = 0;
    private final java.lang.String mCallerDisplayName = null;
    private final int mCallerDisplayNamePresentation = 0;
    private final com.android.internal.telecom.IVideoProvider mVideoProvider = null;
    private final int mVideoState = 0;
    private final boolean mRingbackRequested = false;
    private final boolean mIsVoipAudioMode = false;
    private final long mConnectTimeMillis = 0L;
    private final long mConnectElapsedTimeMillis = 0L;
    private final android.telecom.StatusHints mStatusHints = null;
    private final android.telecom.DisconnectCause mDisconnectCause = null;
    private final java.util.List<java.lang.String> mConferenceableConnectionIds = null;
    private final android.os.Bundle mExtras = null;
    private java.lang.String mParentCallId;
    private int mCallDirection;
    private int mCallerNumberVerificationStatus;
    public static final android.os.Parcelable.Creator<android.telecom.ParcelableConnection> CREATOR = null;
    public ParcelableConnection(android.telecom.PhoneAccountHandle p0, int p1, int p2, int p3, int p4, android.net.Uri p5, int p6, java.lang.String p7, int p8, com.android.internal.telecom.IVideoProvider p9, int p10, boolean p11, boolean p12, long p13, long p14, android.telecom.StatusHints p15, android.telecom.DisconnectCause p16, java.util.List<java.lang.String> p17, android.os.Bundle p18, java.lang.String p19, int p20, int p21) {}
    public ParcelableConnection(android.telecom.PhoneAccountHandle p0, int p1, int p2, int p3, int p4, android.net.Uri p5, int p6, java.lang.String p7, int p8, com.android.internal.telecom.IVideoProvider p9, int p10, boolean p11, boolean p12, long p13, long p14, android.telecom.StatusHints p15, android.telecom.DisconnectCause p16, java.util.List<java.lang.String> p17, android.os.Bundle p18, int p19) {}
    public android.telecom.PhoneAccountHandle getPhoneAccount() { return null; }
    public int getState() { return 0; }
    public int getConnectionCapabilities() { return 0; }
    public int getConnectionProperties() { return 0; }
    public int getSupportedAudioRoutes() { return 0; }
    public android.net.Uri getHandle() { return null; }
    public int getHandlePresentation() { return 0; }
    public java.lang.String getCallerDisplayName() { return null; }
    public int getCallerDisplayNamePresentation() { return 0; }
    public com.android.internal.telecom.IVideoProvider getVideoProvider() { return null; }
    public int getVideoState() { return 0; }
    public boolean isRingbackRequested() { return false; }
    public boolean getIsVoipAudioMode() { return false; }
    public long getConnectTimeMillis() { return 0L; }
    public long getConnectElapsedTimeMillis() { return 0L; }
    public final android.telecom.StatusHints getStatusHints() { return null; }
    public final android.telecom.DisconnectCause getDisconnectCause() { return null; }
    public final java.util.List<java.lang.String> getConferenceableConnectionIds() { return null; }
    public final android.os.Bundle getExtras() { return null; }
    public final java.lang.String getParentCallId() { return null; }
    public int getCallDirection() { return 0; }
    public int getCallerNumberVerificationStatus() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
