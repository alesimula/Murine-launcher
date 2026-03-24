package com.android.internal.telephony;

public abstract class Connection {
    public static final java.lang.String ADHOC_CONFERENCE_ADDRESS = "tel:conf-factory";
    public static final int AUDIO_QUALITY_STANDARD = 1;
    public static final int AUDIO_QUALITY_HIGH_DEFINITION = 2;
    public static final float THRESHOLD = 0.009999999776482582f;
    protected java.lang.String mCnapName;
    protected int mCnapNamePresentation;
    protected java.lang.String mAddress;
    protected int mNumberVerificationStatus;
    protected java.lang.String mDialString;
    protected java.lang.String[] mParticipantsToDial;
    protected boolean mIsAdhocConference;
    protected int mNumberPresentation;
    protected boolean mIsIncoming;
    protected long mCreateTime;
    protected long mConnectTime;
    protected long mConnectTimeReal;
    protected long mDuration;
    protected long mHoldingStartTime;
    protected com.android.internal.telephony.Connection mOrigConnection;
    public java.util.Set<com.android.internal.telephony.Connection.Listener> mListeners;
    protected boolean mNumberConverted;
    protected java.lang.String mConvertedNumber;
    protected java.util.ArrayList<java.lang.String> mForwardedNumber;
    protected java.lang.String mPostDialString;
    protected int mNextPostDialChar;
    protected int mCause;
    protected com.android.internal.telephony.Connection.PostDialState mPostDialState;
    protected int mAudioCodec;
    protected float mAudioCodecBitrateKbps;
    protected float mAudioCodecBandwidthKhz;
    java.lang.Object mUserData;
    public com.android.internal.telephony.Call.State mPreHandoverState;
    protected Connection(int p0) {}
    public void setPhoneFactoryProxy(com.android.internal.telephony.Connection.PhoneFactoryProxy p0) {}
    public java.lang.String getTelecomCallId() { return null; }
    public void setTelecomCallId(java.lang.String p0) {}
    public java.lang.String getAddress() { return null; }
    public java.lang.String[] getParticipantsToDial() { return null; }
    public boolean isAdhocConference() { return false; }
    public java.util.ArrayList<java.lang.String> getForwardedNumber() { return null; }
    public java.lang.String getCnapName() { return null; }
    public java.lang.String getOrigDialString() { return null; }
    public java.lang.String getConvertedNumber() { return null; }
    public int getCnapNamePresentation() { return 0; }
    public abstract com.android.internal.telephony.Call getCall();
    public long getCreateTime() { return 0L; }
    public long getConnectTime() { return 0L; }
    public void setConnectTime(long p0) {}
    public void setConnectTimeReal(long p0) {}
    public long getConnectTimeReal() { return 0L; }
    public abstract long getDisconnectTime();
    public long getDurationMillis() { return 0L; }
    public long getHoldingStartTime() { return 0L; }
    public abstract long getHoldDurationMillis();
    public int getDisconnectCause() { return 0; }
    public abstract java.lang.String getVendorDisconnectCause();
    public boolean isIncoming() { return false; }
    public void setIsIncoming(boolean p0) {}
    public boolean isEmergencyCall() { return false; }
    public android.telephony.emergency.EmergencyNumber getEmergencyNumberInfo() { return null; }
    public boolean hasKnownUserIntentEmergency() { return false; }
    public void setEmergencyCallInfo(com.android.internal.telephony.CallTracker p0) {}
    public void setNonDetectableEmergencyCallInfo(int p0) {}
    public void setHasKnownUserIntentEmergency(boolean p0) {}
    public com.android.internal.telephony.Call.State getState() { return null; }
    public com.android.internal.telephony.Call.State getStateBeforeHandover() { return null; }
    public java.util.List<com.android.ims.internal.ConferenceParticipant> getConferenceParticipants() { return null; }
    public boolean isAlive() { return false; }
    public boolean isRinging() { return false; }
    public java.lang.Object getUserData() { return null; }
    public void setUserData(java.lang.Object p0) {}
    public abstract void deflect(java.lang.String p0) throws com.android.internal.telephony.CallStateException;
    public abstract void transfer(java.lang.String p0, boolean p1) throws com.android.internal.telephony.CallStateException;
    public abstract void consultativeTransfer(com.android.internal.telephony.Connection p0) throws com.android.internal.telephony.CallStateException;
    public abstract void hangup() throws com.android.internal.telephony.CallStateException;
    public abstract void separate() throws com.android.internal.telephony.CallStateException;
    public void clearUserData() {}
    public void addPostDialListener(com.android.internal.telephony.Connection.PostDialListener p0) {}
    public final void removePostDialListener(com.android.internal.telephony.Connection.PostDialListener p0) {}
    protected final void clearPostDialListeners() {}
    protected final void notifyPostDialListeners() {}
    protected final void notifyPostDialListenersNextChar(char p0) {}
    public com.android.internal.telephony.Connection.PostDialState getPostDialState() { return null; }
    public java.lang.String getRemainingPostDialString() { return null; }
    public abstract void proceedAfterWaitChar();
    public abstract void proceedAfterWildChar(java.lang.String p0);
    public abstract void cancelPostDial();
    public boolean onDisconnect(int p0) { return false; }
    public abstract int getNumberPresentation();
    public abstract com.android.internal.telephony.UUSInfo getUUSInfo();
    public abstract int getPreciseDisconnectCause();
    public com.android.internal.telephony.Connection getOrigConnection() { return null; }
    public abstract boolean isMultiparty();
    public boolean isConferenceHost() { return false; }
    public boolean isMemberOfPeerConference() { return false; }
    public void migrateFrom(com.android.internal.telephony.Connection p0) {}
    public void addListener(com.android.internal.telephony.Connection.Listener p0) {}
    public final void removeListener(com.android.internal.telephony.Connection.Listener p0) {}
    public int getVideoState() { return 0; }
    public int getConnectionCapabilities() { return 0; }
    public boolean hasCapabilities(int p0) { return false; }
    public static int addCapability(int p0, int p1) { return 0; }
    public static int removeCapability(int p0, int p1) { return 0; }
    public boolean isWifi() { return false; }
    public int getCallRadioTech() { return 0; }
    public boolean getAudioModeIsVoip() { return false; }
    public android.telecom.Connection.VideoProvider getVideoProvider() { return null; }
    public int getAudioQuality() { return 0; }
    public int getCallSubstate() { return 0; }
    public void setVideoState(int p0) {}
    public void setConnectionCapabilities(int p0) {}
    public void setCallRadioTech(int p0) {}
    public void setAudioModeIsVoip(boolean p0) {}
    public void setAudioQuality(int p0) {}
    public void notifyMediaAttributesChanged() {}
    public void setConnectionExtras(android.os.Bundle p0) {}
    public android.os.Bundle getConnectionExtras() { return null; }
    public boolean isActiveCallDisconnectedOnAnswer() { return false; }
    public void setActiveCallDisconnectedOnAnswer(boolean p0) {}
    public boolean shouldAllowAddCallDuringVideoCall() { return false; }
    public void setAllowAddCallDuringVideoCall(boolean p0) {}
    public boolean shouldAllowHoldingVideoCall() { return false; }
    public void setAllowHoldingVideoCall(boolean p0) {}
    public void setIsPulledCall(boolean p0) {}
    public boolean isPulledCall() { return false; }
    public void setPulledDialogId(int p0) {}
    public int getPulledDialogId() { return 0; }
    public void setCallSubstate(int p0) {}
    public void setVideoProvider(android.telecom.Connection.VideoProvider p0) {}
    public void restoreDialedNumberAfterConversion(java.lang.String p0) {}
    public void setAddress(java.lang.String p0, int p1) {}
    public void setDialString(java.lang.String p0) {}
    public void updateConferenceParticipants(java.util.List<com.android.ims.internal.ConferenceParticipant> p0) {}
    public void updateMultipartyState(boolean p0) {}
    public void onConferenceMergeFailed() {}
    public void onExitedEcmMode() {}
    public void onCallPullFailed(com.android.internal.telephony.Connection p0) {}
    public void onOriginalConnectionReplaced(com.android.internal.telephony.Connection p0) {}
    public void onHandoverToWifiFailed() {}
    public void onConnectionEvent(java.lang.String p0, android.os.Bundle p1) {}
    public void onDisconnectConferenceParticipant(android.net.Uri p0) {}
    public void pullExternalCall() {}
    public void onRttModifyRequestReceived() {}
    public void onRttModifyResponseReceived(int p0) {}
    public void onRttInitiated() {}
    public void onRttTerminated() {}
    protected void notifyDisconnect(int p0) {}
    public int getPhoneType() { return 0; }
    public void resetConnectionTime() {}
    public void setIsNetworkIdentifiedEmergencyCall(boolean p0) {}
    public boolean isNetworkIdentifiedEmergencyCall() { return false; }
    public java.lang.String toString() { return null; }
    public int getAudioCodec() { return 0; }
    public float getAudioCodecBitrateKbps() { return 0.0f; }
    public float getAudioCodecBandwidthKhz() { return 0.0f; }
    public int getNumberVerificationStatus() { return 0; }
    public void setNumberVerificationStatus(int p0) {}
    public void receivedDtmfDigit(char p0) {}
    public void onAudioModeIsVoipChanged(int p0) {}
    public void receivedRtpHeaderExtensions(java.util.Set<android.telephony.ims.RtpHeaderExtension> p0) {}

    public static class Capability {
        public static final int SUPPORTS_DOWNGRADE_TO_VOICE_LOCAL = 1;
        public static final int SUPPORTS_DOWNGRADE_TO_VOICE_REMOTE = 2;
        public static final int SUPPORTS_VT_LOCAL_BIDIRECTIONAL = 4;
        public static final int SUPPORTS_VT_REMOTE_BIDIRECTIONAL = 8;
        public static final int IS_EXTERNAL_CONNECTION = 16;
        public static final int IS_PULLABLE = 32;
        public static final int SUPPORTS_RTT_REMOTE = 64;
        public Capability() {}
    }

    public static interface Listener {
        public void onVideoStateChanged(int p0);
        public void onConnectionCapabilitiesChanged(int p0);
        public void onCallRadioTechChanged(int p0);
        public void onVideoProviderChanged(android.telecom.Connection.VideoProvider p0);
        public void onAudioQualityChanged(int p0);
        public void onMediaAttributesChanged();
        public void onConferenceParticipantsChanged(java.util.List<com.android.ims.internal.ConferenceParticipant> p0);
        public void onCallSubstateChanged(int p0);
        public void onMultipartyStateChanged(boolean p0);
        public void onConferenceMergedFailed();
        public void onExtrasChanged(android.os.Bundle p0);
        public void onExitedEcmMode();
        public void onCallPullFailed(com.android.internal.telephony.Connection p0);
        public void onHandoverToWifiFailed();
        public void onConnectionEvent(java.lang.String p0, android.os.Bundle p1);
        public void onRttModifyRequestReceived();
        public void onRttModifyResponseReceived(int p0);
        public void onDisconnect(int p0);
        public void onRttInitiated();
        public void onRttTerminated();
        public void onOriginalConnectionReplaced(com.android.internal.telephony.Connection p0);
        public void onIsNetworkEmergencyCallChanged(boolean p0);
        public void onReceivedDtmfDigit(char p0);
        public void onReceivedRtpHeaderExtensions(java.util.Set<android.telephony.ims.RtpHeaderExtension> p0);
        public void onAudioModeIsVoipChanged(int p0);
    }

    public static abstract class ListenerBase implements com.android.internal.telephony.Connection.Listener {
        public ListenerBase() {}
        public void onVideoStateChanged(int p0) {}
        public void onConnectionCapabilitiesChanged(int p0) {}
        public void onCallRadioTechChanged(int p0) {}
        public void onVideoProviderChanged(android.telecom.Connection.VideoProvider p0) {}
        public void onAudioQualityChanged(int p0) {}
        public void onMediaAttributesChanged() {}
        public void onConferenceParticipantsChanged(java.util.List<com.android.ims.internal.ConferenceParticipant> p0) {}
        public void onCallSubstateChanged(int p0) {}
        public void onMultipartyStateChanged(boolean p0) {}
        public void onConferenceMergedFailed() {}
        public void onExtrasChanged(android.os.Bundle p0) {}
        public void onExitedEcmMode() {}
        public void onCallPullFailed(com.android.internal.telephony.Connection p0) {}
        public void onHandoverToWifiFailed() {}
        public void onConnectionEvent(java.lang.String p0, android.os.Bundle p1) {}
        public void onRttModifyRequestReceived() {}
        public void onRttModifyResponseReceived(int p0) {}
        public void onDisconnect(int p0) {}
        public void onRttInitiated() {}
        public void onRttTerminated() {}
        public void onOriginalConnectionReplaced(com.android.internal.telephony.Connection p0) {}
        public void onIsNetworkEmergencyCallChanged(boolean p0) {}
        public void onReceivedDtmfDigit(char p0) {}
        public void onReceivedRtpHeaderExtensions(java.util.Set<android.telephony.ims.RtpHeaderExtension> p0) {}
        public void onAudioModeIsVoipChanged(int p0) {}
    }

    public static interface PhoneFactoryProxy {
        public com.android.internal.telephony.Phone getPhone(int p0);
        public com.android.internal.telephony.Phone getDefaultPhone();
        public com.android.internal.telephony.Phone[] getPhones();
    }

    public static interface PostDialListener {
        public void onPostDialWait();
        public void onPostDialChar(char p0);
    }

    public static enum PostDialState {
        NOT_STARTED,
        STARTED,
        WAIT,
        WILD,
        COMPLETE,
        CANCELLED,
        PAUSE;
    }
}
