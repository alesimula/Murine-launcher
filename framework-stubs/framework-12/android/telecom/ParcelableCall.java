package android.telecom;

public final class ParcelableCall implements android.os.Parcelable {
    private final java.lang.String mId = null;
    private final int mState = 0;
    private final android.telecom.DisconnectCause mDisconnectCause = null;
    private final java.util.List<java.lang.String> mCannedSmsResponses = null;
    private final int mCapabilities = 0;
    private final int mProperties = 0;
    private final int mSupportedAudioRoutes = 0;
    private final long mConnectTimeMillis = 0L;
    private final android.net.Uri mHandle = null;
    private final int mHandlePresentation = 0;
    private final java.lang.String mCallerDisplayName = null;
    private final int mCallerDisplayNamePresentation = 0;
    private final android.telecom.GatewayInfo mGatewayInfo = null;
    private final android.telecom.PhoneAccountHandle mAccountHandle = null;
    private final boolean mIsVideoCallProviderChanged = false;
    private final com.android.internal.telecom.IVideoProvider mVideoCallProvider = null;
    private android.telecom.VideoCallImpl mVideoCall;
    private final boolean mIsRttCallChanged = false;
    private final android.telecom.ParcelableRttCall mRttCall = null;
    private final java.lang.String mParentCallId = null;
    private final java.util.List<java.lang.String> mChildCallIds = null;
    private final android.telecom.StatusHints mStatusHints = null;
    private final int mVideoState = 0;
    private final java.util.List<java.lang.String> mConferenceableCallIds = null;
    private final android.os.Bundle mIntentExtras = null;
    private final android.os.Bundle mExtras = null;
    private final long mCreationTimeMillis = 0L;
    private final int mCallDirection = 0;
    private final int mCallerNumberVerificationStatus = 0;
    private final java.lang.String mContactDisplayName = null;
    private final java.lang.String mActiveChildCallId = null;
    public static final android.os.Parcelable.Creator<android.telecom.ParcelableCall> CREATOR = null;
    public ParcelableCall(java.lang.String p0, int p1, android.telecom.DisconnectCause p2, java.util.List<java.lang.String> p3, int p4, int p5, int p6, long p7, android.net.Uri p8, int p9, java.lang.String p10, int p11, android.telecom.GatewayInfo p12, android.telecom.PhoneAccountHandle p13, boolean p14, com.android.internal.telecom.IVideoProvider p15, boolean p16, android.telecom.ParcelableRttCall p17, java.lang.String p18, java.util.List<java.lang.String> p19, android.telecom.StatusHints p20, int p21, java.util.List<java.lang.String> p22, android.os.Bundle p23, android.os.Bundle p24, long p25, int p26, int p27, java.lang.String p28, java.lang.String p29) {}
    public java.lang.String getId() { return null; }
    public int getState() { return 0; }
    public android.telecom.DisconnectCause getDisconnectCause() { return null; }
    public java.util.List<java.lang.String> getCannedSmsResponses() { return null; }
    public int getCapabilities() { return 0; }
    public int getProperties() { return 0; }
    public int getSupportedAudioRoutes() { return 0; }
    public long getConnectTimeMillis() { return 0L; }
    public android.net.Uri getHandle() { return null; }
    public int getHandlePresentation() { return 0; }
    public java.lang.String getCallerDisplayName() { return null; }
    public int getCallerDisplayNamePresentation() { return 0; }
    public android.telecom.GatewayInfo getGatewayInfo() { return null; }
    public android.telecom.PhoneAccountHandle getAccountHandle() { return null; }
    public android.telecom.VideoCallImpl getVideoCallImpl(java.lang.String p0, int p1) { return null; }
    public com.android.internal.telecom.IVideoProvider getVideoProvider() { return null; }
    public boolean getIsRttCallChanged() { return false; }
    public android.telecom.ParcelableRttCall getParcelableRttCall() { return null; }
    public java.lang.String getParentCallId() { return null; }
    public java.util.List<java.lang.String> getChildCallIds() { return null; }
    public java.util.List<java.lang.String> getConferenceableCallIds() { return null; }
    public android.telecom.StatusHints getStatusHints() { return null; }
    public int getVideoState() { return 0; }
    public android.os.Bundle getExtras() { return null; }
    public android.os.Bundle getIntentExtras() { return null; }
    public boolean isVideoCallProviderChanged() { return false; }
    public long getCreationTimeMillis() { return 0L; }
    public int getCallDirection() { return 0; }
    public int getCallerNumberVerificationStatus() { return 0; }
    public java.lang.String getContactDisplayName() { return null; }
    public java.lang.String getActiveChildCallId() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static class ParcelableCallBuilder {
        private java.lang.String mId;
        private int mState;
        private android.telecom.DisconnectCause mDisconnectCause;
        private java.util.List<java.lang.String> mCannedSmsResponses;
        private int mCapabilities;
        private int mProperties;
        private int mSupportedAudioRoutes;
        private long mConnectTimeMillis;
        private android.net.Uri mHandle;
        private int mHandlePresentation;
        private java.lang.String mCallerDisplayName;
        private int mCallerDisplayNamePresentation;
        private android.telecom.GatewayInfo mGatewayInfo;
        private android.telecom.PhoneAccountHandle mAccountHandle;
        private boolean mIsVideoCallProviderChanged;
        private com.android.internal.telecom.IVideoProvider mVideoCallProvider;
        private boolean mIsRttCallChanged;
        private android.telecom.ParcelableRttCall mRttCall;
        private java.lang.String mParentCallId;
        private java.util.List<java.lang.String> mChildCallIds;
        private android.telecom.StatusHints mStatusHints;
        private int mVideoState;
        private java.util.List<java.lang.String> mConferenceableCallIds;
        private android.os.Bundle mIntentExtras;
        private android.os.Bundle mExtras;
        private long mCreationTimeMillis;
        private int mCallDirection;
        private int mCallerNumberVerificationStatus;
        private java.lang.String mContactDisplayName;
        private java.lang.String mActiveChildCallId;
        public ParcelableCallBuilder() {}
        public android.telecom.ParcelableCall.ParcelableCallBuilder setId(java.lang.String p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setState(int p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setDisconnectCause(android.telecom.DisconnectCause p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setCannedSmsResponses(java.util.List<java.lang.String> p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setCapabilities(int p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setProperties(int p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setSupportedAudioRoutes(int p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setConnectTimeMillis(long p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setHandle(android.net.Uri p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setHandlePresentation(int p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setCallerDisplayName(java.lang.String p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setCallerDisplayNamePresentation(int p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setGatewayInfo(android.telecom.GatewayInfo p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setAccountHandle(android.telecom.PhoneAccountHandle p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setIsVideoCallProviderChanged(boolean p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setVideoCallProvider(com.android.internal.telecom.IVideoProvider p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setIsRttCallChanged(boolean p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setRttCall(android.telecom.ParcelableRttCall p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setParentCallId(java.lang.String p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setChildCallIds(java.util.List<java.lang.String> p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setStatusHints(android.telecom.StatusHints p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setVideoState(int p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setConferenceableCallIds(java.util.List<java.lang.String> p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setIntentExtras(android.os.Bundle p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setExtras(android.os.Bundle p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setCreationTimeMillis(long p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setCallDirection(int p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setCallerNumberVerificationStatus(int p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setContactDisplayName(java.lang.String p0) { return null; }
        public android.telecom.ParcelableCall.ParcelableCallBuilder setActiveChildCallId(java.lang.String p0) { return null; }
        public android.telecom.ParcelableCall createParcelableCall() { return null; }
        public static android.telecom.ParcelableCall.ParcelableCallBuilder fromParcelableCall(android.telecom.ParcelableCall p0) { return null; }
    }
}
