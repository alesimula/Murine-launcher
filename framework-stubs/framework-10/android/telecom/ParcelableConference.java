package android.telecom;

public final class ParcelableConference implements android.os.Parcelable {
    private android.telecom.PhoneAccountHandle mPhoneAccount;
    private int mState;
    private int mConnectionCapabilities;
    private int mConnectionProperties;
    private java.util.List<java.lang.String> mConnectionIds;
    private long mConnectTimeMillis;
    private final com.android.internal.telecom.IVideoProvider mVideoProvider = null;
    private final int mVideoState = 0;
    private android.telecom.StatusHints mStatusHints;
    private android.os.Bundle mExtras;
    private long mConnectElapsedTimeMillis;
    private final android.net.Uri mAddress = null;
    private final int mAddressPresentation = 0;
    private final java.lang.String mCallerDisplayName = null;
    private final int mCallerDisplayNamePresentation = 0;
    public static final android.os.Parcelable.Creator<android.telecom.ParcelableConference> CREATOR = null;
    public ParcelableConference(android.telecom.PhoneAccountHandle p0, int p1, int p2, int p3, java.util.List<java.lang.String> p4, com.android.internal.telecom.IVideoProvider p5, int p6, long p7, long p8, android.telecom.StatusHints p9, android.os.Bundle p10, android.net.Uri p11, int p12, java.lang.String p13, int p14) {}
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
    public int getHandlePresentation() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
