package android.telecom;

public final class Call {
    public static final int STATE_NEW = 0;
    public static final int STATE_DIALING = 1;
    public static final int STATE_RINGING = 2;
    public static final int STATE_HOLDING = 3;
    public static final int STATE_ACTIVE = 4;
    public static final int STATE_DISCONNECTED = 7;
    public static final int STATE_SELECT_PHONE_ACCOUNT = 8;
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final int STATE_PRE_DIAL_WAIT = 8;
    public static final int STATE_CONNECTING = 9;
    public static final int STATE_DISCONNECTING = 10;
    public static final int STATE_PULLING_CALL = 11;
    public static final int STATE_AUDIO_PROCESSING = 12;
    public static final int STATE_SIMULATED_RINGING = 13;
    @java.lang.Deprecated
    public static final java.lang.String AVAILABLE_PHONE_ACCOUNTS = "selectPhoneAccountAccounts";
    public static final java.lang.String EXTRA_IS_SUPPRESSED_BY_DO_NOT_DISTURB = "android.telecom.extra.IS_SUPPRESSED_BY_DO_NOT_DISTURB";
    public static final java.lang.String EXTRA_SUGGESTED_PHONE_ACCOUNTS = "android.telecom.extra.SUGGESTED_PHONE_ACCOUNTS";
    public static final java.lang.String EXTRA_LAST_EMERGENCY_CALLBACK_TIME_MILLIS = "android.telecom.extra.LAST_EMERGENCY_CALLBACK_TIME_MILLIS";
    public static final java.lang.String EXTRA_SILENT_RINGING_REQUESTED = "android.telecom.extra.SILENT_RINGING_REQUESTED";
    public static final java.lang.String EVENT_REQUEST_HANDOVER = "android.telecom.event.REQUEST_HANDOVER";
    public static final java.lang.String EXTRA_HANDOVER_PHONE_ACCOUNT_HANDLE = "android.telecom.extra.HANDOVER_PHONE_ACCOUNT_HANDLE";
    public static final java.lang.String EXTRA_HANDOVER_VIDEO_STATE = "android.telecom.extra.HANDOVER_VIDEO_STATE";
    public static final java.lang.String EXTRA_HANDOVER_EXTRAS = "android.telecom.extra.HANDOVER_EXTRAS";
    public static final java.lang.String EVENT_HANDOVER_COMPLETE = "android.telecom.event.HANDOVER_COMPLETE";
    public static final java.lang.String EVENT_HANDOVER_SOURCE_DISCONNECTED = "android.telecom.event.HANDOVER_SOURCE_DISCONNECTED";
    public static final java.lang.String EVENT_HANDOVER_FAILED = "android.telecom.event.HANDOVER_FAILED";
    public static final java.lang.String EVENT_DISPLAY_DIAGNOSTIC_MESSAGE = "android.telecom.event.DISPLAY_DIAGNOSTIC_MESSAGE";
    public static final java.lang.String EVENT_CLEAR_DIAGNOSTIC_MESSAGE = "android.telecom.event.CLEAR_DIAGNOSTIC_MESSAGE";
    public static final java.lang.String EXTRA_DIAGNOSTIC_MESSAGE_ID = "android.telecom.extra.DIAGNOSTIC_MESSAGE_ID";
    public static final java.lang.String EXTRA_DIAGNOSTIC_MESSAGE = "android.telecom.extra.DIAGNOSTIC_MESSAGE";
    public static final java.lang.String EVENT_DISPLAY_SOS_MESSAGE = "android.telecom.event.DISPLAY_SOS_MESSAGE";
    public static final int REJECT_REASON_DECLINED = 1;
    public static final int REJECT_REASON_UNWANTED = 2;
    public java.lang.String getRemainingPostDialSequence() { return null; }
    public void answer(int p0) {}
    public void deflect(android.net.Uri p0) {}
    public void reject(boolean p0, java.lang.String p1) {}
    public void reject(int p0) {}
    public void transfer(android.net.Uri p0, boolean p1) {}
    public void transfer(android.telecom.Call p0) {}
    public void disconnect() {}
    public void hold() {}
    public void unhold() {}
    @android.annotation.SystemApi
    public void enterBackgroundAudioProcessing() {}
    @android.annotation.SystemApi
    public void exitBackgroundAudioProcessing(boolean p0) {}
    public void playDtmfTone(char p0) {}
    public void stopDtmfTone() {}
    public void postDialContinue(boolean p0) {}
    public void phoneAccountSelected(android.telecom.PhoneAccountHandle p0, boolean p1) {}
    public void conference(android.telecom.Call p0) {}
    public void splitFromConference() {}
    public void mergeConference() {}
    public void swapConference() {}
    public void addConferenceParticipants(java.util.List<android.net.Uri> p0) {}
    public void pullExternalCall() {}
    public void sendCallEvent(java.lang.String p0, android.os.Bundle p1) {}
    public void sendRttRequest() {}
    public void respondToRttRequest(int p0, boolean p1) {}
    public void handoverTo(android.telecom.PhoneAccountHandle p0, int p1, android.os.Bundle p2) {}
    public void stopRtt() {}
    public final void putExtras(android.os.Bundle p0) {}
    public final void putExtra(java.lang.String p0, boolean p1) {}
    public final void putExtra(java.lang.String p0, int p1) {}
    public final void putExtra(java.lang.String p0, java.lang.String p1) {}
    public final void removeExtras(java.util.List<java.lang.String> p0) {}
    public final void removeExtras(java.lang.String... p0) {}
    public android.telecom.Call getParent() { return null; }
    public java.util.List<android.telecom.Call> getChildren() { return null; }
    public java.util.List<android.telecom.Call> getConferenceableCalls() { return null; }
    @java.lang.Deprecated
    public int getState() { return 0; }
    public android.telecom.Call getGenericConferenceActiveChildCall() { return null; }
    public java.util.List<java.lang.String> getCannedTextResponses() { return null; }
    public android.telecom.InCallService.VideoCall getVideoCall() { return null; }
    public android.telecom.Call.Details getDetails() { return null; }
    public android.telecom.Call.RttCall getRttCall() { return null; }
    public boolean isRttActive() { return false; }
    public void registerCallback(android.telecom.Call.Callback p0) {}
    public void registerCallback(android.telecom.Call.Callback p0, android.os.Handler p1) {}
    public void unregisterCallback(android.telecom.Call.Callback p0) {}
    public java.lang.String toString() { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public void addListener(android.telecom.Call.Listener p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public void removeListener(android.telecom.Call.Listener p0) {}
    Call(android.telecom.Phone p0, java.lang.String p1, android.telecom.InCallAdapter p2, java.lang.String p3, int p4) {}
    Call(android.telecom.Phone p0, java.lang.String p1, android.telecom.InCallAdapter p2, int p3, java.lang.String p4, int p5) {}
    final java.lang.String internalGetCallId() { return null; }
    final void internalUpdate(android.telecom.ParcelableCall p0, java.util.Map<java.lang.String, android.telecom.Call> p1) {}
    final void internalSetPostDialWait(java.lang.String p0) {}
    final void internalSetDisconnected() {}
    final void internalOnConnectionEvent(java.lang.String p0, android.os.Bundle p1) {}
    final void internalOnRttUpgradeRequest(int p0) {}
    final void internalOnRttInitiationFailure(int p0) {}
    final void internalOnHandoverFailed(int p0) {}
    final void internalOnHandoverComplete() {}

    public static class Details {
        public static final int DIRECTION_UNKNOWN = -1;
        public static final int DIRECTION_INCOMING = 0;
        public static final int DIRECTION_OUTGOING = 1;
        public static final int CAPABILITY_HOLD = 1;
        public static final int CAPABILITY_SUPPORT_HOLD = 2;
        public static final int CAPABILITY_MERGE_CONFERENCE = 4;
        public static final int CAPABILITY_SWAP_CONFERENCE = 8;
        public static final int CAPABILITY_UNUSED_1 = 16;
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
        public static final int CAPABILITY_SPEED_UP_MT_AUDIO = 262144;
        public static final int CAPABILITY_CAN_UPGRADE_TO_VIDEO = 524288;
        public static final int CAPABILITY_CAN_PAUSE_VIDEO = 1048576;
        public static final int CAPABILITY_CAN_SEND_RESPONSE_VIA_CONNECTION = 2097152;
        public static final int CAPABILITY_CANNOT_DOWNGRADE_VIDEO_TO_AUDIO = 4194304;
        public static final int CAPABILITY_CAN_PULL_CALL = 8388608;
        public static final int CAPABILITY_SUPPORT_DEFLECT = 16777216;
        public static final int CAPABILITY_ADD_PARTICIPANT = 33554432;
        public static final int CAPABILITY_TRANSFER = 67108864;
        public static final int CAPABILITY_TRANSFER_CONSULTATIVE = 134217728;
        public static final int CAPABILITY_REMOTE_PARTY_SUPPORTS_RTT = 268435456;
        public static final int PROPERTY_CONFERENCE = 1;
        public static final int PROPERTY_GENERIC_CONFERENCE = 2;
        public static final int PROPERTY_EMERGENCY_CALLBACK_MODE = 4;
        public static final int PROPERTY_WIFI = 8;
        public static final int PROPERTY_HIGH_DEF_AUDIO = 16;
        public static final int PROPERTY_ENTERPRISE_CALL = 32;
        public static final int PROPERTY_IS_EXTERNAL_CALL = 64;
        public static final int PROPERTY_HAS_CDMA_VOICE_PRIVACY = 128;
        public static final int PROPERTY_SELF_MANAGED = 256;
        public static final int PROPERTY_ASSISTED_DIALING = 512;
        public static final int PROPERTY_RTT = 1024;
        public static final int PROPERTY_NETWORK_IDENTIFIED_EMERGENCY_CALL = 2048;
        public static final int PROPERTY_VOIP_AUDIO_MODE = 4096;
        public static final int PROPERTY_IS_ADHOC_CONFERENCE = 8192;
        public static final int PROPERTY_CROSS_SIM = 16384;
        public static boolean can(int p0, int p1) { return false; }
        public boolean can(int p0) { return false; }
        public static java.lang.String capabilitiesToString(int p0) { return null; }
        public static boolean hasProperty(int p0, int p1) { return false; }
        public boolean hasProperty(int p0) { return false; }
        public static java.lang.String propertiesToString(int p0) { return null; }
        public final int getState() { return 0; }
        public java.lang.String getTelecomCallId() { return null; }
        public android.net.Uri getHandle() { return null; }
        public int getHandlePresentation() { return 0; }
        public android.net.Uri getContactPhotoUri() { return null; }
        public java.lang.String getCallerDisplayName() { return null; }
        public int getCallerDisplayNamePresentation() { return 0; }
        public android.telecom.PhoneAccountHandle getAccountHandle() { return null; }
        public int getCallCapabilities() { return 0; }
        public int getCallProperties() { return 0; }
        public int getSupportedAudioRoutes() { return 0; }
        public android.telecom.DisconnectCause getDisconnectCause() { return null; }
        public final long getConnectTimeMillis() { return 0L; }
        public android.telecom.GatewayInfo getGatewayInfo() { return null; }
        public int getVideoState() { return 0; }
        public android.telecom.StatusHints getStatusHints() { return null; }
        public android.os.Bundle getExtras() { return null; }
        public android.os.Bundle getIntentExtras() { return null; }
        public long getCreationTimeMillis() { return 0L; }
        public java.lang.String getContactDisplayName() { return null; }
        public int getCallDirection() { return 0; }
        public int getCallerNumberVerificationStatus() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public Details(int p0, java.lang.String p1, android.net.Uri p2, int p3, java.lang.String p4, int p5, android.telecom.PhoneAccountHandle p6, int p7, int p8, android.telecom.DisconnectCause p9, long p10, android.telecom.GatewayInfo p11, int p12, android.telecom.StatusHints p13, android.os.Bundle p14, android.os.Bundle p15, long p16, java.lang.String p17, int p18, int p19, android.net.Uri p20) {}
        public static android.telecom.Call.Details createFromParcelableCall(android.telecom.ParcelableCall p0) { return null; }
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface CallDirection {
        }
    }

    public static final class RttCall {
        public static final int RTT_MODE_INVALID = 0;
        public static final int RTT_MODE_FULL = 1;
        public static final int RTT_MODE_HCO = 2;
        public static final int RTT_MODE_VCO = 3;
        public RttCall(java.lang.String p0, java.io.InputStreamReader p1, java.io.OutputStreamWriter p2, int p3, android.telecom.InCallAdapter p4) {}
        public int getRttAudioMode() { return 0; }
        public void setRttMode(int p0) {}
        public void write(java.lang.String p0) throws java.io.IOException {}
        public java.lang.String read() { return null; }
        public java.lang.String readImmediately() throws java.io.IOException { return null; }
        public void close() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface RttAudioMode {
        }
    }

    public static abstract class Callback {
        public static final int HANDOVER_FAILURE_DEST_APP_REJECTED = 1;
        public static final int HANDOVER_FAILURE_NOT_SUPPORTED = 2;
        public static final int HANDOVER_FAILURE_USER_REJECTED = 3;
        public static final int HANDOVER_FAILURE_ONGOING_EMERGENCY_CALL = 4;
        public static final int HANDOVER_FAILURE_UNKNOWN = 5;
        public Callback() {}
        public void onStateChanged(android.telecom.Call p0, int p1) {}
        public void onParentChanged(android.telecom.Call p0, android.telecom.Call p1) {}
        public void onChildrenChanged(android.telecom.Call p0, java.util.List<android.telecom.Call> p1) {}
        public void onDetailsChanged(android.telecom.Call p0, android.telecom.Call.Details p1) {}
        public void onCannedTextResponsesLoaded(android.telecom.Call p0, java.util.List<java.lang.String> p1) {}
        public void onPostDialWait(android.telecom.Call p0, java.lang.String p1) {}
        public void onVideoCallChanged(android.telecom.Call p0, android.telecom.InCallService.VideoCall p1) {}
        public void onCallDestroyed(android.telecom.Call p0) {}
        public void onConferenceableCallsChanged(android.telecom.Call p0, java.util.List<android.telecom.Call> p1) {}
        public void onConnectionEvent(android.telecom.Call p0, java.lang.String p1, android.os.Bundle p2) {}
        public void onRttModeChanged(android.telecom.Call p0, int p1) {}
        public void onRttStatusChanged(android.telecom.Call p0, boolean p1, android.telecom.Call.RttCall p2) {}
        public void onRttRequest(android.telecom.Call p0, int p1) {}
        public void onRttInitiationFailure(android.telecom.Call p0, int p1) {}
        public void onHandoverComplete(android.telecom.Call p0) {}
        public void onHandoverFailed(android.telecom.Call p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface HandoverFailureErrors {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallState {
    }

    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static abstract class Listener extends android.telecom.Call.Callback {
        public Listener() { super(); }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RejectReason {
    }
}
