package com.android.internal.telephony;

public class CallManager {
    static final int EVENT_PRECISE_CALL_STATE_CHANGED = 101;
    static final int EVENT_RINGBACK_TONE = 105;
    static final int EVENT_CALL_WAITING = 108;
    protected final com.android.internal.telephony.RegistrantList mPreciseCallStateRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mNewRingingConnectionRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mIncomingRingRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mDisconnectRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mMmiRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mUnknownConnectionRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mRingbackToneRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mOnHoldToneRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mInCallVoicePrivacyOnRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mInCallVoicePrivacyOffRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mCallWaitingRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mDisplayInfoRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mSignalInfoRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mCdmaOtaStatusChangeRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mResendIncallMuteRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mMmiInitiateRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mMmiCompleteRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mEcmTimerResetRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mSubscriptionInfoReadyRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mSuppServiceFailedRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mServiceStateChangedRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mPostDialCharacterRegistrants = null;
    protected final com.android.internal.telephony.RegistrantList mTtyModeReceivedRegistrants = null;
    public static com.android.internal.telephony.CallManager getInstance() { return null; }
    public com.android.internal.telephony.PhoneConstants.State getState() { return null; }
    public com.android.internal.telephony.PhoneConstants.State getState(int p0) { return null; }
    public int getServiceState() { return 0; }
    public int getServiceState(int p0) { return 0; }
    public com.android.internal.telephony.Phone getPhoneInCall() { return null; }
    public boolean registerPhone(com.android.internal.telephony.Phone p0) { return false; }
    public void unregisterPhone(com.android.internal.telephony.Phone p0) {}
    public com.android.internal.telephony.Phone getDefaultPhone() { return null; }
    public com.android.internal.telephony.Phone getFgPhone() { return null; }
    public com.android.internal.telephony.Phone getFgPhone(int p0) { return null; }
    public com.android.internal.telephony.Phone getBgPhone() { return null; }
    public com.android.internal.telephony.Phone getRingingPhone() { return null; }
    public com.android.internal.telephony.Phone getRingingPhone(int p0) { return null; }
    public java.lang.Object getRegistrantIdentifier() { return null; }
    public void rejectCall(com.android.internal.telephony.Call p0) throws com.android.internal.telephony.CallStateException {}
    public boolean canConference(com.android.internal.telephony.Call p0) { return false; }
    public boolean canConference(com.android.internal.telephony.Call p0, int p1) { return false; }
    public void conference(com.android.internal.telephony.Call p0) throws com.android.internal.telephony.CallStateException {}
    public com.android.internal.telephony.Connection dial(com.android.internal.telephony.Phone p0, java.lang.String p1, int p2) throws com.android.internal.telephony.CallStateException { return null; }
    public com.android.internal.telephony.Connection dial(com.android.internal.telephony.Phone p0, java.lang.String p1, com.android.internal.telephony.UUSInfo p2, int p3) throws com.android.internal.telephony.CallStateException { return null; }
    public void clearDisconnected() {}
    public void clearDisconnected(int p0) {}
    public boolean canTransfer(com.android.internal.telephony.Call p0) { return false; }
    public boolean canTransfer(com.android.internal.telephony.Call p0, int p1) { return false; }
    public void explicitCallTransfer(com.android.internal.telephony.Call p0) throws com.android.internal.telephony.CallStateException {}
    public java.util.List<? extends com.android.internal.telephony.MmiCode> getPendingMmiCodes(com.android.internal.telephony.Phone p0) { return null; }
    public boolean sendUssdResponse(com.android.internal.telephony.Phone p0, java.lang.String p1) { return false; }
    public void setMute(boolean p0) {}
    public boolean getMute() { return false; }
    public void setEchoSuppressionEnabled() {}
    public boolean sendDtmf(char p0) { return false; }
    public boolean startDtmf(char p0) { return false; }
    public void stopDtmf() {}
    public boolean sendBurstDtmf(java.lang.String p0, int p1, int p2, android.os.Message p3) { return false; }
    public void registerForDisconnect(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForDisconnect(android.os.Handler p0) {}
    public void registerForPreciseCallStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForPreciseCallStateChanged(android.os.Handler p0) {}
    public void registerForUnknownConnection(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForUnknownConnection(android.os.Handler p0) {}
    public void registerForNewRingingConnection(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForNewRingingConnection(android.os.Handler p0) {}
    public void registerForIncomingRing(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForIncomingRing(android.os.Handler p0) {}
    public void registerForRingbackTone(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForRingbackTone(android.os.Handler p0) {}
    public void registerForOnHoldTone(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForOnHoldTone(android.os.Handler p0) {}
    public void registerForResendIncallMute(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForResendIncallMute(android.os.Handler p0) {}
    public void registerForMmiInitiate(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForMmiInitiate(android.os.Handler p0) {}
    public void registerForMmiComplete(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForMmiComplete(android.os.Handler p0) {}
    public void registerForEcmTimerReset(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForEcmTimerReset(android.os.Handler p0) {}
    public void registerForServiceStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForServiceStateChanged(android.os.Handler p0) {}
    public void registerForSuppServiceFailed(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSuppServiceFailed(android.os.Handler p0) {}
    public void registerForInCallVoicePrivacyOn(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForInCallVoicePrivacyOn(android.os.Handler p0) {}
    public void registerForInCallVoicePrivacyOff(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForInCallVoicePrivacyOff(android.os.Handler p0) {}
    public void registerForCallWaiting(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForCallWaiting(android.os.Handler p0) {}
    public void registerForSignalInfo(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSignalInfo(android.os.Handler p0) {}
    public void registerForDisplayInfo(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForDisplayInfo(android.os.Handler p0) {}
    public void registerForCdmaOtaStatusChange(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForCdmaOtaStatusChange(android.os.Handler p0) {}
    public void registerForSubscriptionInfoReady(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSubscriptionInfoReady(android.os.Handler p0) {}
    public void registerForPostDialCharacter(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForPostDialCharacter(android.os.Handler p0) {}
    public void registerForTtyModeReceived(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForTtyModeReceived(android.os.Handler p0) {}
    public java.util.List<com.android.internal.telephony.Call> getRingingCalls() { return null; }
    public java.util.List<com.android.internal.telephony.Call> getForegroundCalls() { return null; }
    public java.util.List<com.android.internal.telephony.Call> getBackgroundCalls() { return null; }
    public boolean hasActiveFgCall() { return false; }
    public boolean hasActiveFgCall(int p0) { return false; }
    public boolean hasActiveBgCall() { return false; }
    public boolean hasActiveBgCall(int p0) { return false; }
    public boolean hasActiveRingingCall() { return false; }
    public boolean hasActiveRingingCall(int p0) { return false; }
    public com.android.internal.telephony.Call getActiveFgCall() { return null; }
    public com.android.internal.telephony.Call getActiveFgCall(int p0) { return null; }
    public com.android.internal.telephony.Call getFirstActiveBgCall() { return null; }
    public com.android.internal.telephony.Call getFirstActiveBgCall(int p0) { return null; }
    public com.android.internal.telephony.Call getFirstActiveRingingCall() { return null; }
    public com.android.internal.telephony.Call getFirstActiveRingingCall(int p0) { return null; }
    public com.android.internal.telephony.Call.State getActiveFgCallState() { return null; }
    public com.android.internal.telephony.Call.State getActiveFgCallState(int p0) { return null; }
    public java.util.List<com.android.internal.telephony.Connection> getFgCallConnections() { return null; }
    public java.util.List<com.android.internal.telephony.Connection> getFgCallConnections(int p0) { return null; }
    public java.util.List<com.android.internal.telephony.Connection> getBgCallConnections() { return null; }
    public boolean hasDisconnectedFgCall() { return false; }
    public boolean hasDisconnectedFgCall(int p0) { return false; }
    public boolean hasDisconnectedBgCall() { return false; }
    public boolean hasDisconnectedBgCall(int p0) { return false; }

    private class CallManagerHandler extends android.os.Handler {
        public void handleMessage(android.os.Message p0) {}
    }
}
