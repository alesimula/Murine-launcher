package android.telecom;

public abstract class Connection extends android.telecom.Conferenceable {
    public static final int STATE_INITIALIZING = 0;
    public static final int STATE_NEW = 1;
    public static final int STATE_RINGING = 2;
    public static final int STATE_DIALING = 3;
    public static final int STATE_ACTIVE = 4;
    public static final int STATE_HOLDING = 5;
    public static final int STATE_DISCONNECTED = 6;
    public static final int STATE_PULLING_CALL = 7;
    public static final int VERIFICATION_STATUS_NOT_VERIFIED = 0;
    public static final int VERIFICATION_STATUS_PASSED = 1;
    public static final int VERIFICATION_STATUS_FAILED = 2;
    public static final int CAPABILITY_HOLD = 1;
    public static final int CAPABILITY_SUPPORT_HOLD = 2;
    public static final int CAPABILITY_MERGE_CONFERENCE = 4;
    public static final int CAPABILITY_SWAP_CONFERENCE = 8;
    public static final int CAPABILITY_UNUSED = 16;
    public static final int CAPABILITY_RESPOND_VIA_TEXT = 32;
    public static final int CAPABILITY_MUTE = 64;
    public static final int CAPABILITY_MANAGE_CONFERENCE = 128;
    public static final int CAPABILITY_SUPPORTS_VT_LOCAL_RX = 256;
    public static final int CAPABILITY_SUPPORTS_VT_LOCAL_TX = 512;
    public static final int CAPABILITY_SUPPORTS_VT_LOCAL_BIDIRECTIONAL = 768;
    public static final int CAPABILITY_SUPPORTS_VT_REMOTE_RX = 1024;
    public static final int CAPABILITY_SUPPORTS_VT_REMOTE_TX = 2048;
    public static final int CAPABILITY_SUPPORTS_VT_REMOTE_BIDIRECTIONAL = 3072;
    public static final int CAPABILITY_SEPARATE_FROM_CONFERENCE = 4096;
    public static final int CAPABILITY_DISCONNECT_FROM_CONFERENCE = 8192;
    public static final int CAPABILITY_UNUSED_2 = 16384;
    public static final int CAPABILITY_UNUSED_3 = 32768;
    public static final int CAPABILITY_UNUSED_4 = 65536;
    public static final int CAPABILITY_UNUSED_5 = 131072;
    @android.annotation.SystemApi
    public static final int CAPABILITY_SPEED_UP_MT_AUDIO = 262144;
    public static final int CAPABILITY_CAN_UPGRADE_TO_VIDEO = 524288;
    public static final int CAPABILITY_CAN_PAUSE_VIDEO = 1048576;
    @android.annotation.SystemApi
    public static final int CAPABILITY_CONFERENCE_HAS_NO_CHILDREN = 2097152;
    public static final int CAPABILITY_CAN_SEND_RESPONSE_VIA_CONNECTION = 4194304;
    public static final int CAPABILITY_CANNOT_DOWNGRADE_VIDEO_TO_AUDIO = 8388608;
    public static final int CAPABILITY_CAN_PULL_CALL = 16777216;
    public static final int CAPABILITY_SUPPORT_DEFLECT = 33554432;
    public static final int CAPABILITY_ADD_PARTICIPANT = 67108864;
    public static final int CAPABILITY_TRANSFER = 134217728;
    public static final int CAPABILITY_TRANSFER_CONSULTATIVE = 268435456;
    @android.annotation.SystemApi
    public static final int PROPERTY_EMERGENCY_CALLBACK_MODE = 1;
    @android.annotation.SystemApi
    public static final int PROPERTY_GENERIC_CONFERENCE = 2;
    public static final int PROPERTY_HIGH_DEF_AUDIO = 4;
    public static final int PROPERTY_WIFI = 8;
    public static final int PROPERTY_IS_EXTERNAL_CALL = 16;
    public static final int PROPERTY_HAS_CDMA_VOICE_PRIVACY = 32;
    @android.annotation.SystemApi
    public static final int PROPERTY_IS_DOWNGRADED_CONFERENCE = 64;
    public static final int PROPERTY_SELF_MANAGED = 128;
    public static final int PROPERTY_IS_RTT = 256;
    public static final int PROPERTY_ASSISTED_DIALING = 512;
    public static final int PROPERTY_NETWORK_IDENTIFIED_EMERGENCY_CALL = 1024;
    @android.annotation.SystemApi
    public static final int PROPERTY_REMOTELY_HOSTED = 2048;
    public static final int PROPERTY_IS_ADHOC_CONFERENCE = 4096;
    public static final int PROPERTY_CROSS_SIM = 8192;
    public static final int AUDIO_CODEC_NONE = 0;
    public static final int AUDIO_CODEC_AMR = 1;
    public static final int AUDIO_CODEC_AMR_WB = 2;
    public static final int AUDIO_CODEC_QCELP13K = 3;
    public static final int AUDIO_CODEC_EVRC = 4;
    public static final int AUDIO_CODEC_EVRC_B = 5;
    public static final int AUDIO_CODEC_EVRC_WB = 6;
    public static final int AUDIO_CODEC_EVRC_NW = 7;
    public static final int AUDIO_CODEC_GSM_EFR = 8;
    public static final int AUDIO_CODEC_GSM_FR = 9;
    public static final int AUDIO_CODEC_GSM_HR = 10;
    public static final int AUDIO_CODEC_G711U = 11;
    public static final int AUDIO_CODEC_G723 = 12;
    public static final int AUDIO_CODEC_G711A = 13;
    public static final int AUDIO_CODEC_G722 = 14;
    public static final int AUDIO_CODEC_G711AB = 15;
    public static final int AUDIO_CODEC_G729 = 16;
    public static final int AUDIO_CODEC_EVS_NB = 17;
    public static final int AUDIO_CODEC_EVS_WB = 18;
    public static final int AUDIO_CODEC_EVS_SWB = 19;
    public static final int AUDIO_CODEC_EVS_FB = 20;
    public static final java.lang.String EXTRA_CALLER_NUMBER_VERIFICATION_STATUS = "android.telecom.extra.CALLER_NUMBER_VERIFICATION_STATUS";
    public static final java.lang.String EXTRA_LAST_FORWARDED_NUMBER = "android.telecom.extra.LAST_FORWARDED_NUMBER";
    public static final java.lang.String EXTRA_CHILD_ADDRESS = "android.telecom.extra.CHILD_ADDRESS";
    public static final java.lang.String EXTRA_CALL_SUBJECT = "android.telecom.extra.CALL_SUBJECT";
    public static final java.lang.String EXTRA_ANSWERING_DROPS_FG_CALL = "android.telecom.extra.ANSWERING_DROPS_FG_CALL";
    public static final java.lang.String EXTRA_ANSWERING_DROPS_FG_CALL_APP_NAME = "android.telecom.extra.ANSWERING_DROPS_FG_CALL_APP_NAME";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_DISABLE_ADD_CALL = "android.telecom.extra.DISABLE_ADD_CALL";
    public static final java.lang.String EXTRA_ORIGINAL_CONNECTION_ID = "android.telecom.extra.ORIGINAL_CONNECTION_ID";
    public static final java.lang.String EXTRA_REMOTE_PHONE_ACCOUNT_HANDLE = "android.telecom.extra.REMOTE_PHONE_ACCOUNT_HANDLE";
    public static final java.lang.String EXTRA_REMOTE_CONNECTION_ORIGINATING_PACKAGE_NAME = "android.telecom.extra.REMOTE_CONNECTION_ORIGINATING_PACKAGE_NAME";
    public static final java.lang.String EXTRA_IS_RTT_AUDIO_PRESENT = "android.telecom.extra.IS_RTT_AUDIO_PRESENT";
    public static final java.lang.String EXTRA_AUDIO_CODEC = "android.telecom.extra.AUDIO_CODEC";
    public static final java.lang.String EXTRA_AUDIO_CODEC_BITRATE_KBPS = "android.telecom.extra.AUDIO_CODEC_BITRATE_KBPS";
    public static final java.lang.String EXTRA_AUDIO_CODEC_BANDWIDTH_KHZ = "android.telecom.extra.AUDIO_CODEC_BANDWIDTH_KHZ";
    public static final java.lang.String EXTRA_IS_DEVICE_TO_DEVICE_COMMUNICATION_AVAILABLE = "android.telecom.extra.IS_DEVICE_TO_DEVICE_COMMUNICATION_AVAILABLE";
    public static final java.lang.String EVENT_ON_HOLD_TONE_START = "android.telecom.event.ON_HOLD_TONE_START";
    public static final java.lang.String EVENT_ON_HOLD_TONE_END = "android.telecom.event.ON_HOLD_TONE_END";
    public static final java.lang.String EVENT_CALL_PULL_FAILED = "android.telecom.event.CALL_PULL_FAILED";
    public static final java.lang.String EVENT_CALL_MERGE_FAILED = "android.telecom.event.CALL_MERGE_FAILED";
    public static final java.lang.String EVENT_CALL_HOLD_FAILED = "android.telecom.event.CALL_HOLD_FAILED";
    public static final java.lang.String EVENT_CALL_SWITCH_FAILED = "android.telecom.event.CALL_SWITCH_FAILED";
    public static final java.lang.String EVENT_MERGE_START = "android.telecom.event.MERGE_START";
    public static final java.lang.String EVENT_MERGE_COMPLETE = "android.telecom.event.MERGE_COMPLETE";
    public static final java.lang.String EVENT_CALL_REMOTELY_HELD = "android.telecom.event.CALL_REMOTELY_HELD";
    public static final java.lang.String EVENT_CALL_REMOTELY_UNHELD = "android.telecom.event.CALL_REMOTELY_UNHELD";
    public static final java.lang.String EVENT_HANDOVER_COMPLETE = "android.telecom.event.HANDOVER_COMPLETE";
    public static final java.lang.String EVENT_HANDOVER_FAILED = "android.telecom.event.HANDOVER_FAILED";
    public static final java.lang.String EXTRA_SIP_INVITE = "android.telecom.extra.SIP_INVITE";
    public static final java.lang.String EVENT_RTT_AUDIO_INDICATION_CHANGED = "android.telecom.event.RTT_AUDIO_INDICATION_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String EVENT_DEVICE_TO_DEVICE_MESSAGE = "android.telecom.event.DEVICE_TO_DEVICE_MESSAGE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_DEVICE_TO_DEVICE_MESSAGE_TYPE = "android.telecom.extra.DEVICE_TO_DEVICE_MESSAGE_TYPE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_DEVICE_TO_DEVICE_MESSAGE_VALUE = "android.telecom.extra.DEVICE_TO_DEVICE_MESSAGE_VALUE";
    public static final java.lang.String EVENT_CALL_QUALITY_REPORT = "android.telecom.event.CALL_QUALITY_REPORT";
    public static final java.lang.String EXTRA_CALL_QUALITY_REPORT = "android.telecom.extra.CALL_QUALITY_REPORT";
    private static final boolean PII_DEBUG = Boolean.valueOf(false);
    private final android.telecom.Connection.Listener mConnectionDeathListener = null;
    private final android.telecom.Conference.Listener mConferenceDeathListener = null;
    private final java.util.Set<android.telecom.Connection.Listener> mListeners = null;
    private final java.util.List<android.telecom.Conferenceable> mConferenceables = null;
    private final java.util.List<android.telecom.Conferenceable> mUnmodifiableConferenceables = null;
    private java.lang.String mTelecomCallId;
    private android.telecom.PhoneAccountHandle mPhoneAccountHandle;
    private int mState;
    private android.telecom.CallAudioState mCallAudioState;
    private android.net.Uri mAddress;
    private int mAddressPresentation;
    private java.lang.String mCallerDisplayName;
    private int mCallerDisplayNamePresentation;
    private boolean mRingbackRequested;
    private int mConnectionCapabilities;
    private int mConnectionProperties;
    private int mSupportedAudioRoutes;
    private android.telecom.Connection.VideoProvider mVideoProvider;
    private boolean mAudioModeIsVoip;
    private long mConnectTimeMillis;
    private long mConnectElapsedTimeMillis;
    private android.telecom.StatusHints mStatusHints;
    private int mVideoState;
    private android.telecom.DisconnectCause mDisconnectCause;
    private android.telecom.Conference mConference;
    private android.telecom.ConnectionService mConnectionService;
    private android.os.Bundle mExtras;
    private final java.lang.Object mExtrasLock = null;
    private int mCallDirection;
    private java.util.Set<java.lang.String> mPreviousExtraKeys;
    private int mCallerNumberVerificationStatus;
    public static java.lang.String capabilitiesToString(int p0) { return null; }
    public static java.lang.String capabilitiesToStringShort(int p0) { return null; }
    private static java.lang.String capabilitiesToStringInternal(int p0, boolean p1) { return null; }
    public static java.lang.String propertiesToString(int p0) { return null; }
    public static java.lang.String propertiesToStringShort(int p0) { return null; }
    private static java.lang.String propertiesToStringInternal(int p0, boolean p1) { return null; }
    public Connection() { super(); }
    @android.annotation.SystemApi
    public final java.lang.String getTelecomCallId() { return null; }
    public final android.net.Uri getAddress() { return null; }
    public final int getAddressPresentation() { return 0; }
    public final java.lang.String getCallerDisplayName() { return null; }
    public final int getCallerDisplayNamePresentation() { return 0; }
    public final int getState() { return 0; }
    public final int getVideoState() { return 0; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public final android.telecom.AudioState getAudioState() { return null; }
    public final android.telecom.CallAudioState getCallAudioState() { return null; }
    public final android.telecom.Conference getConference() { return null; }
    public final boolean isRingbackRequested() { return false; }
    public final boolean getAudioModeIsVoip() { return false; }
    @android.annotation.SystemApi
    public final long getConnectTimeMillis() { return 0L; }
    @android.annotation.SystemApi
    public final long getConnectionStartElapsedRealtimeMillis() { return 0L; }
    public final android.telecom.StatusHints getStatusHints() { return null; }
    public final android.os.Bundle getExtras() { return null; }
    final android.telecom.Connection addConnectionListener(android.telecom.Connection.Listener p0) { return null; }
    final android.telecom.Connection removeConnectionListener(android.telecom.Connection.Listener p0) { return null; }
    public final android.telecom.DisconnectCause getDisconnectCause() { return null; }
    @android.annotation.SystemApi
    public void setTelecomCallId(java.lang.String p0) {}
    final void setCallAudioState(android.telecom.CallAudioState p0) {}
    public static java.lang.String stateToString(int p0) { return null; }
    public final int getConnectionCapabilities() { return 0; }
    public final int getConnectionProperties() { return 0; }
    public final int getSupportedAudioRoutes() { return 0; }
    public final void setAddress(android.net.Uri p0, int p1) {}
    public final void setCallerDisplayName(java.lang.String p0, int p1) {}
    public final void setVideoState(int p0) {}
    public final void setActive() {}
    public final void setRinging() {}
    public final void setInitializing() {}
    public final void setInitialized() {}
    public final void setDialing() {}
    public final void setPulling() {}
    public final void setOnHold() {}
    public final void setVideoProvider(android.telecom.Connection.VideoProvider p0) {}
    public final android.telecom.Connection.VideoProvider getVideoProvider() { return null; }
    public final void setDisconnected(android.telecom.DisconnectCause p0) {}
    public final void setPostDialWait(java.lang.String p0) {}
    public final void setNextPostDialChar(char p0) {}
    public final void setRingbackRequested(boolean p0) {}
    public final void setConnectionCapabilities(int p0) {}
    public final void setConnectionProperties(int p0) {}
    public final void setSupportedAudioRoutes(int p0) {}
    public final void destroy() {}
    public final void setAudioModeIsVoip(boolean p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public final void setConnectTimeMillis(long p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public final void setConnectionStartElapsedRealtimeMillis(long p0) {}
    public final void setStatusHints(android.telecom.StatusHints p0) {}
    public final void setConferenceableConnections(java.util.List<android.telecom.Connection> p0) {}
    public final void setConferenceables(java.util.List<android.telecom.Conferenceable> p0) {}
    @android.annotation.SystemApi
    public final void resetConnectionTime() {}
    public final java.util.List<android.telecom.Conferenceable> getConferenceables() { return null; }
    public final void setConnectionService(android.telecom.ConnectionService p0) {}
    public final void unsetConnectionService(android.telecom.ConnectionService p0) {}
    public final boolean setConference(android.telecom.Conference p0) { return false; }
    public final void resetConference() {}
    public final void setExtras(android.os.Bundle p0) {}
    public final void putExtras(android.os.Bundle p0) {}
    public final void removeExtras(java.util.List<java.lang.String> p0) {}
    public final void removeExtras(java.lang.String... p0) {}
    public final void setAudioRoute(int p0) {}
    public void requestBluetoothAudio(android.bluetooth.BluetoothDevice p0) {}
    public final void sendRttInitiationSuccess() {}
    public final void sendRttInitiationFailure(int p0) {}
    public final void sendRttSessionRemotelyTerminated() {}
    public final void sendRemoteRttRequest() {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void onAudioStateChanged(android.telecom.AudioState p0) {}
    public void onCallAudioStateChanged(android.telecom.CallAudioState p0) {}
    public void onUsingAlternativeUi(boolean p0) {}
    public void onTrackedByNonUiService(boolean p0) {}
    public void onStateChanged(int p0) {}
    public void onPlayDtmfTone(char p0) {}
    public void onStopDtmfTone() {}
    public void onDisconnect() {}
    public void onDisconnectConferenceParticipant(android.net.Uri p0) {}
    public void onSeparate() {}
    public void onAddConferenceParticipants(java.util.List<android.net.Uri> p0) {}
    public void onAbort() {}
    public void onHold() {}
    public void onUnhold() {}
    public void onAnswer(int p0) {}
    public void onAnswer() {}
    public void onDeflect(android.net.Uri p0) {}
    public void onReject() {}
    public void onReject(int p0) {}
    public void onReject(java.lang.String p0) {}
    public void onTransfer(android.net.Uri p0, boolean p1) {}
    public void onTransfer(android.telecom.Connection p0) {}
    public void onSilence() {}
    public void onPostDialContinue(boolean p0) {}
    public void onPullExternalCall() {}
    public void onCallEvent(java.lang.String p0, android.os.Bundle p1) {}
    public void onHandoverComplete() {}
    public void onExtrasChanged(android.os.Bundle p0) {}
    public void onShowIncomingCallUi() {}
    public void onStartRtt(android.telecom.Connection.RttTextStream p0) {}
    public void onStopRtt() {}
    public void handleRttUpgradeResponse(android.telecom.Connection.RttTextStream p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_CONTACTS")
    public void onCallFilteringCompleted(android.telecom.Connection.CallFilteringCompletionInfo p0) {}
    static java.lang.String toLogSafePhoneNumber(java.lang.String p0) { return null; }
    private void setState(int p0) {}
    public static android.telecom.Connection createFailedConnection(android.telecom.DisconnectCause p0) { return null; }
    public void checkImmutable() {}
    public static android.telecom.Connection createCanceledConnection() { return null; }
    private final void fireOnConferenceableConnectionsChanged() {}
    private final void fireConferenceChanged() {}
    private final void clearConferenceableList() {}
    final void handleExtrasChanged(android.os.Bundle p0) {}
    public final void notifyConferenceMergeFailed() {}
    public void notifyPhoneAccountChanged(android.telecom.PhoneAccountHandle p0) {}
    @android.annotation.SystemApi
    public void setPhoneAccountHandle(android.telecom.PhoneAccountHandle p0) {}
    @android.annotation.SystemApi
    public android.telecom.PhoneAccountHandle getPhoneAccountHandle() { return null; }
    public void sendConnectionEvent(java.lang.String p0, android.os.Bundle p1) {}
    public final int getCallDirection() { return 0; }
    @android.annotation.SystemApi
    public void setCallDirection(int p0) {}
    public final int getCallerNumberVerificationStatus() { return 0; }
    public final void setCallerNumberVerificationStatus(int p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioCodec {
    }

    @android.annotation.SystemApi
    public static final class CallFilteringCompletionInfo implements android.os.Parcelable {
        private final boolean mIsBlocked = false;
        private final boolean mIsInContacts = false;
        private final android.telecom.CallScreeningService.CallResponse mCallResponse = null;
        private final android.content.ComponentName mCallScreeningComponent = null;
        public static final android.os.Parcelable.Creator<android.telecom.Connection.CallFilteringCompletionInfo> CREATOR = null;
        public CallFilteringCompletionInfo(boolean p0, boolean p1, android.telecom.CallScreeningService.CallResponse p2, android.content.ComponentName p3) {}
        protected CallFilteringCompletionInfo(android.os.Parcel p0) {}
        public boolean isBlocked() { return false; }
        public boolean isInContacts() { return false; }
        public android.telecom.CallScreeningService.CallResponse getCallResponse() { return null; }
        public android.content.ComponentName getCallScreeningComponent() { return null; }
        public int describeContents() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConnectionState {
    }

    private static class FailureSignalingConnection extends android.telecom.Connection {
        private boolean mImmutable;
        public FailureSignalingConnection(android.telecom.DisconnectCause p0) { super(); }
        public void checkImmutable() {}
    }

    static abstract class Listener {
        Listener() {}
        public void onStateChanged(android.telecom.Connection p0, int p1) {}
        public void onAddressChanged(android.telecom.Connection p0, android.net.Uri p1, int p2) {}
        public void onCallerDisplayNameChanged(android.telecom.Connection p0, java.lang.String p1, int p2) {}
        public void onVideoStateChanged(android.telecom.Connection p0, int p1) {}
        public void onDisconnected(android.telecom.Connection p0, android.telecom.DisconnectCause p1) {}
        public void onPostDialWait(android.telecom.Connection p0, java.lang.String p1) {}
        public void onPostDialChar(android.telecom.Connection p0, char p1) {}
        public void onRingbackRequested(android.telecom.Connection p0, boolean p1) {}
        public void onDestroyed(android.telecom.Connection p0) {}
        public void onConnectionCapabilitiesChanged(android.telecom.Connection p0, int p1) {}
        public void onConnectionPropertiesChanged(android.telecom.Connection p0, int p1) {}
        public void onSupportedAudioRoutesChanged(android.telecom.Connection p0, int p1) {}
        public void onVideoProviderChanged(android.telecom.Connection p0, android.telecom.Connection.VideoProvider p1) {}
        public void onAudioModeIsVoipChanged(android.telecom.Connection p0, boolean p1) {}
        public void onStatusHintsChanged(android.telecom.Connection p0, android.telecom.StatusHints p1) {}
        public void onConferenceablesChanged(android.telecom.Connection p0, java.util.List<android.telecom.Conferenceable> p1) {}
        public void onConferenceChanged(android.telecom.Connection p0, android.telecom.Conference p1) {}
        public void onConferenceMergeFailed(android.telecom.Connection p0) {}
        public void onExtrasChanged(android.telecom.Connection p0, android.os.Bundle p1) {}
        public void onExtrasRemoved(android.telecom.Connection p0, java.util.List<java.lang.String> p1) {}
        public void onConnectionEvent(android.telecom.Connection p0, java.lang.String p1, android.os.Bundle p2) {}
        public void onAudioRouteChanged(android.telecom.Connection p0, int p1, java.lang.String p2) {}
        public void onRttInitiationSuccess(android.telecom.Connection p0) {}
        public void onRttInitiationFailure(android.telecom.Connection p0, int p1) {}
        public void onRttSessionRemotelyTerminated(android.telecom.Connection p0) {}
        public void onRemoteRttRequest(android.telecom.Connection p0) {}
        public void onPhoneAccountChanged(android.telecom.Connection p0, android.telecom.PhoneAccountHandle p1) {}
        public void onConnectionTimeReset(android.telecom.Connection p0) {}
    }

    public static final class RttModifyStatus {
        public static final int SESSION_MODIFY_REQUEST_SUCCESS = 1;
        public static final int SESSION_MODIFY_REQUEST_FAIL = 2;
        public static final int SESSION_MODIFY_REQUEST_INVALID = 3;
        public static final int SESSION_MODIFY_REQUEST_TIMED_OUT = 4;
        public static final int SESSION_MODIFY_REQUEST_REJECTED_BY_REMOTE = 5;
        private RttModifyStatus() {}
    }

    public static final class RttTextStream {
        private static final int READ_BUFFER_SIZE = 1000;
        private final java.io.InputStreamReader mPipeFromInCall = null;
        private final java.io.OutputStreamWriter mPipeToInCall = null;
        private final android.os.ParcelFileDescriptor mFdFromInCall = null;
        private final android.os.ParcelFileDescriptor mFdToInCall = null;
        private final java.io.FileInputStream mFromInCallFileInputStream = null;
        private char[] mReadBuffer;
        public RttTextStream(android.os.ParcelFileDescriptor p0, android.os.ParcelFileDescriptor p1) {}
        public void write(java.lang.String p0) throws java.io.IOException {}
        public java.lang.String read() throws java.io.IOException { return null; }
        public java.lang.String readImmediately() throws java.io.IOException { return null; }
        public android.os.ParcelFileDescriptor getFdFromInCall() { return null; }
        public android.os.ParcelFileDescriptor getFdToInCall() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VerificationStatus {
    }

    public static abstract class VideoProvider {
        public static final int SESSION_EVENT_RX_PAUSE = 1;
        public static final int SESSION_EVENT_RX_RESUME = 2;
        public static final int SESSION_EVENT_TX_START = 3;
        public static final int SESSION_EVENT_TX_STOP = 4;
        public static final int SESSION_EVENT_CAMERA_FAILURE = 5;
        public static final int SESSION_EVENT_CAMERA_READY = 6;
        public static final int SESSION_EVENT_CAMERA_PERMISSION_ERROR = 7;
        public static final int SESSION_MODIFY_REQUEST_SUCCESS = 1;
        public static final int SESSION_MODIFY_REQUEST_FAIL = 2;
        public static final int SESSION_MODIFY_REQUEST_INVALID = 3;
        public static final int SESSION_MODIFY_REQUEST_TIMED_OUT = 4;
        public static final int SESSION_MODIFY_REQUEST_REJECTED_BY_REMOTE = 5;
        private static final int MSG_ADD_VIDEO_CALLBACK = 1;
        private static final int MSG_SET_CAMERA = 2;
        private static final int MSG_SET_PREVIEW_SURFACE = 3;
        private static final int MSG_SET_DISPLAY_SURFACE = 4;
        private static final int MSG_SET_DEVICE_ORIENTATION = 5;
        private static final int MSG_SET_ZOOM = 6;
        private static final int MSG_SEND_SESSION_MODIFY_REQUEST = 7;
        private static final int MSG_SEND_SESSION_MODIFY_RESPONSE = 8;
        private static final int MSG_REQUEST_CAMERA_CAPABILITIES = 9;
        private static final int MSG_REQUEST_CONNECTION_DATA_USAGE = 10;
        private static final int MSG_SET_PAUSE_IMAGE = 11;
        private static final int MSG_REMOVE_VIDEO_CALLBACK = 12;
        private static final java.lang.String SESSION_EVENT_RX_PAUSE_STR = "RX_PAUSE";
        private static final java.lang.String SESSION_EVENT_RX_RESUME_STR = "RX_RESUME";
        private static final java.lang.String SESSION_EVENT_TX_START_STR = "TX_START";
        private static final java.lang.String SESSION_EVENT_TX_STOP_STR = "TX_STOP";
        private static final java.lang.String SESSION_EVENT_CAMERA_FAILURE_STR = "CAMERA_FAIL";
        private static final java.lang.String SESSION_EVENT_CAMERA_READY_STR = "CAMERA_READY";
        private static final java.lang.String SESSION_EVENT_CAMERA_PERMISSION_ERROR_STR = "CAMERA_PERMISSION_ERROR";
        private static final java.lang.String SESSION_EVENT_UNKNOWN_STR = "UNKNOWN";
        private android.telecom.Connection.VideoProvider.VideoProviderHandler mMessageHandler;
        private final android.telecom.Connection.VideoProvider.VideoProviderBinder mBinder = null;
        private java.util.concurrent.ConcurrentHashMap<android.os.IBinder, com.android.internal.telecom.IVideoCallback> mVideoCallbacks;
        public VideoProvider() {}
        public VideoProvider(android.os.Looper p0) {}
        public final com.android.internal.telecom.IVideoProvider getInterface() { return null; }
        public abstract void onSetCamera(java.lang.String p0);
        public void onSetCamera(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4) {}
        public abstract void onSetPreviewSurface(android.view.Surface p0);
        public abstract void onSetDisplaySurface(android.view.Surface p0);
        public abstract void onSetDeviceOrientation(int p0);
        public abstract void onSetZoom(float p0);
        public abstract void onSendSessionModifyRequest(android.telecom.VideoProfile p0, android.telecom.VideoProfile p1);
        public abstract void onSendSessionModifyResponse(android.telecom.VideoProfile p0);
        public abstract void onRequestCameraCapabilities();
        public abstract void onRequestConnectionDataUsage();
        public abstract void onSetPauseImage(android.net.Uri p0);
        public void receiveSessionModifyRequest(android.telecom.VideoProfile p0) {}
        public void receiveSessionModifyResponse(int p0, android.telecom.VideoProfile p1, android.telecom.VideoProfile p2) {}
        public void handleCallSessionEvent(int p0) {}
        public void changePeerDimensions(int p0, int p1) {}
        public void setCallDataUsage(long p0) {}
        public void changeCallDataUsage(long p0) {}
        public void changeCameraCapabilities(android.telecom.VideoProfile.CameraCapabilities p0) {}
        public void changeVideoQuality(int p0) {}
        public static java.lang.String sessionEventToString(int p0) { return null; }

        private final class VideoProviderBinder extends com.android.internal.telecom.IVideoProvider.Stub {
            private VideoProviderBinder(android.telecom.Connection.VideoProvider p0) { super(); }
            public void addVideoCallback(android.os.IBinder p0) {}
            public void removeVideoCallback(android.os.IBinder p0) {}
            public void setCamera(java.lang.String p0, java.lang.String p1, int p2) {}
            public void setPreviewSurface(android.view.Surface p0) {}
            public void setDisplaySurface(android.view.Surface p0) {}
            public void setDeviceOrientation(int p0) {}
            public void setZoom(float p0) {}
            public void sendSessionModifyRequest(android.telecom.VideoProfile p0, android.telecom.VideoProfile p1) {}
            public void sendSessionModifyResponse(android.telecom.VideoProfile p0) {}
            public void requestCameraCapabilities() {}
            public void requestCallDataUsage() {}
            public void setPauseImage(android.net.Uri p0) {}
        }

        private final class VideoProviderHandler extends android.os.Handler {
            public VideoProviderHandler(android.telecom.Connection.VideoProvider p0) { super(); }
            public VideoProviderHandler(android.telecom.Connection.VideoProvider p0, android.os.Looper p1) { super(); }
            public void handleMessage(android.os.Message p0) {}
        }
    }
}
