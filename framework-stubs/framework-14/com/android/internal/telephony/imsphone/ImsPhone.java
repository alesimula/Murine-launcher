package com.android.internal.telephony.imsphone;

public class ImsPhone extends com.android.internal.telephony.imsphone.ImsPhoneBase {
    public static final int EVENT_SERVICE_STATE_CHANGED = 76;
    static final int RESTART_ECM_TIMER = 0;
    static final int CANCEL_ECM_TIMER = 1;
    com.android.internal.telephony.Phone mDefaultPhone;
    com.android.internal.telephony.imsphone.ImsPhoneCallTracker mCT;
    com.android.internal.telephony.imsphone.ImsExternalCallTracker mExternalCallTracker;
    com.android.internal.telephony.imsphone.ImsNrSaModeHandler mImsNrSaModeHandler;
    protected void setCurrentSubscriberUris(android.net.Uri[] p0) {}
    public android.net.Uri[] getCurrentSubscriberUris() { return null; }
    public void setCallComposerStatus(int p0) {}
    public int getCallComposerStatus() { return 0; }
    public int getEmergencyNumberDbVersion() { return 0; }
    public com.android.internal.telephony.emergency.EmergencyNumberTracker getEmergencyNumberTracker() { return null; }
    public com.android.internal.telephony.ServiceStateTracker getServiceStateTracker() { return null; }
    public ImsPhone(android.content.Context p0, com.android.internal.telephony.PhoneNotifier p1, com.android.internal.telephony.Phone p2) { super(null, null, null, false); }
    public ImsPhone(android.content.Context p0, com.android.internal.telephony.PhoneNotifier p1, com.android.internal.telephony.Phone p2, com.android.internal.telephony.imsphone.ImsPhone.ImsManagerFactory p3, boolean p4) { super(null, null, null, false); }
    public void dispose() {}
    public android.telephony.ServiceState getServiceState() { return null; }
    public void setServiceState(int p0) {}
    public com.android.internal.telephony.CallTracker getCallTracker() { return null; }
    public com.android.internal.telephony.imsphone.ImsExternalCallTracker getExternalCallTracker() { return null; }
    public java.util.List<? extends com.android.internal.telephony.imsphone.ImsPhoneMmiCode> getPendingMmiCodes() { return null; }
    public void acceptCall(int p0) throws com.android.internal.telephony.CallStateException {}
    public void rejectCall() throws com.android.internal.telephony.CallStateException {}
    public void switchHoldingAndActive() throws com.android.internal.telephony.CallStateException {}
    public boolean canConference() { return false; }
    public boolean canDial() { return false; }
    public void conference() {}
    public void clearDisconnected() {}
    public boolean canTransfer() { return false; }
    public void explicitCallTransfer() throws com.android.internal.telephony.CallStateException {}
    public com.android.internal.telephony.imsphone.ImsPhoneCall getForegroundCall() { return null; }
    public com.android.internal.telephony.imsphone.ImsPhoneCall getBackgroundCall() { return null; }
    public com.android.internal.telephony.imsphone.ImsPhoneCall getRingingCall() { return null; }
    public boolean isImsAvailable() { return false; }
    public com.android.internal.telephony.CarrierPrivilegesTracker getCarrierPrivilegesTracker() { return null; }
    public void holdActiveCall() throws com.android.internal.telephony.CallStateException {}
    public void unholdHeldCall() throws com.android.internal.telephony.CallStateException {}
    public boolean handleUssdRequest(java.lang.String p0, android.os.ResultReceiver p1) throws com.android.internal.telephony.CallStateException { return false; }
    public void notifySuppSvcNotification(com.android.internal.telephony.gsm.SuppServiceNotification p0) {}
    public boolean handleInCallMmiCommands(java.lang.String p0) { return false; }
    boolean isInCall() { return false; }
    public boolean isInImsEcm() { return false; }
    public boolean isInEcm() { return false; }
    public void setIsInEcm(boolean p0) {}
    public void notifyNewRingingConnection(com.android.internal.telephony.Connection p0) {}
    void notifyUnknownConnection(com.android.internal.telephony.Connection p0) {}
    public void notifyForVideoCapabilityChanged(boolean p0) {}
    public void setRadioPower(boolean p0, boolean p1, boolean p2, boolean p3) {}
    public com.android.internal.telephony.Connection startConference(java.lang.String[] p0, com.android.internal.telephony.PhoneInternalInterface.DialArgs p1) throws com.android.internal.telephony.CallStateException { return null; }
    public com.android.internal.telephony.Connection dial(java.lang.String p0, com.android.internal.telephony.PhoneInternalInterface.DialArgs p1, java.util.function.Consumer<com.android.internal.telephony.Phone> p2) throws com.android.internal.telephony.CallStateException { return null; }
    public void sendDtmf(char p0) {}
    public void startDtmf(char p0) {}
    public void stopDtmf() {}
    public void notifyIncomingRing() {}
    public void setMute(boolean p0) {}
    public void setTTYMode(int p0, android.os.Message p1) {}
    public void setUiTTYMode(int p0, android.os.Message p1) {}
    public boolean getMute() { return false; }
    public com.android.internal.telephony.PhoneConstants.State getState() { return null; }
    public void getOutgoingCallerIdDisplay(android.os.Message p0) {}
    public void setOutgoingCallerIdDisplay(int p0, android.os.Message p1) {}
    public void queryCLIP(android.os.Message p0) {}
    public void getCallForwardingOption(int p0, android.os.Message p1) {}
    public void getCallForwardingOption(int p0, int p1, android.os.Message p2) {}
    public void setCallForwardingOption(int p0, int p1, java.lang.String p2, int p3, android.os.Message p4) {}
    public void setCallForwardingOption(int p0, int p1, java.lang.String p2, int p3, int p4, android.os.Message p5) {}
    public void getCallWaiting(android.os.Message p0) {}
    public void setCallWaiting(boolean p0, android.os.Message p1) {}
    public void setCallWaiting(boolean p0, int p1, android.os.Message p2) {}
    public void getCallBarring(java.lang.String p0, android.os.Message p1) {}
    public void getCallBarring(java.lang.String p0, android.os.Message p1, int p2) {}
    public void getCallBarring(java.lang.String p0, java.lang.String p1, android.os.Message p2, int p3) {}
    public void setCallBarring(java.lang.String p0, boolean p1, java.lang.String p2, android.os.Message p3) {}
    public void setCallBarring(java.lang.String p0, boolean p1, java.lang.String p2, android.os.Message p3, int p4) {}
    public void sendUssdResponse(java.lang.String p0) {}
    public void sendUSSD(java.lang.String p0, android.os.Message p1) {}
    public void cancelUSSD(android.os.Message p0) {}
    public void sendErrorResponse(android.os.Message p0, java.lang.Throwable p1) {}
    void onIncomingUSSD(int p0, java.lang.String p1) {}
    public void onMMIDone(com.android.internal.telephony.imsphone.ImsPhoneMmiCode p0) {}
    public java.util.ArrayList<com.android.internal.telephony.Connection> getHandoverConnection() { return null; }
    public void notifySrvccState(int p0) {}
    void initiateSilentRedial() {}
    void initiateSilentRedial(boolean p0, int p1) {}
    public void registerForSilentRedial(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSilentRedial(android.os.Handler p0) {}
    public void registerForSuppServiceNotification(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSuppServiceNotification(android.os.Handler p0) {}
    public int getSubId() { return 0; }
    public int getPhoneId() { return 0; }
    public java.lang.String getLine1Number() { return null; }
    public com.android.internal.telephony.CallForwardInfo[] handleCfQueryResult(android.telephony.ims.ImsCallForwardInfo[] p0) { return null; }
    boolean isCsRetryException(java.lang.Throwable p0) { return false; }
    public void handleMessage(android.os.Message p0) {}
    public com.android.ims.ImsEcbmStateListener getImsEcbmStateListener() { return null; }
    public boolean isInEmergencyCall() { return false; }
    public void exitEmergencyCallbackMode() {}
    protected void handleExitEmergencyCallbackMode() {}
    void handleTimerInEmergencyCallbackMode(int p0) {}
    public void setOnEcbModeExitResponse(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unsetOnEcbModeExitResponse(android.os.Handler p0) {}
    public void onFeatureCapabilityChanged() {}
    public boolean isImsCapabilityAvailable(int p0, int p1) throws com.android.ims.ImsException { return false; }
    public boolean isVolteEnabled() { return false; }
    public boolean isVoiceOverCellularImsEnabled() { return false; }
    public boolean isWifiCallingEnabled() { return false; }
    public boolean isVideoEnabled() { return false; }
    public int getImsRegistrationTech() { return 0; }
    public void getImsRegistrationTech(java.util.function.Consumer<java.lang.Integer> p0) {}
    public void getImsRegistrationState(java.util.function.Consumer<java.lang.Integer> p0) {}
    public com.android.internal.telephony.Phone getDefaultPhone() { return null; }
    public boolean isImsRegistered() { return false; }
    public void setImsRegistered(boolean p0) {}
    public void callEndCleanupHandOverCallIfAny() {}
    public void processDisconnectReason(android.telephony.ims.ImsReasonInfo p0) {}
    public boolean isUtEnabled() { return false; }
    public void sendEmergencyCallStateChange(boolean p0) {}
    public void setBroadcastEmergencyCallStateChanges(boolean p0) {}
    public android.os.PowerManager.WakeLock getWakeLock() { return null; }
    public android.telephony.ims.RegistrationManager.RegistrationCallback getImsMmTelRegistrationCallback() { return null; }
    public void resetImsRegistrationState() {}
    public void setPhoneNumberForSourceIms(android.net.Uri[] p0) {}
    public com.android.internal.telephony.uicc.IccRecords getIccRecords() { return null; }
    public com.android.internal.telephony.PhoneInternalInterface.DialArgs updateDialArgsForVolteSilentRedial(com.android.internal.telephony.PhoneInternalInterface.DialArgs p0, int p1) { return null; }
    public com.android.internal.telephony.metrics.VoiceCallSessionStats getVoiceCallSessionStats() { return null; }
    public com.android.internal.telephony.metrics.ImsStats getImsStats() { return null; }
    public void setImsStats(com.android.internal.telephony.metrics.ImsStats p0) {}
    public boolean hasAliveCall() { return false; }
    public boolean getLastKnownRoamingState() { return false; }
    public void updateImsRegistrationInfo(int p0) {}
    public void setTerminalBasedCallWaitingStatus(int p0) {}
    public void triggerEpsFallback(int p0, android.os.Message p1) {}
    public void startImsTraffic(int p0, int p1, int p2, int p3, android.os.Message p4) {}
    public void stopImsTraffic(int p0, android.os.Message p1) {}
    public void registerForConnectionSetupFailure(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForConnectionSetupFailure(android.os.Handler p0) {}
    public void triggerImsDeregistration(int p0) {}
    public void updateImsCallStatus(java.util.List<com.android.internal.telephony.imsphone.ImsCallInfo> p0, android.os.Message p1) {}
    public void triggerNotifyAnbr(int p0, int p1, int p2) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    private static class Cf {
        final java.lang.String mSetCfNumber = null;
        final android.os.Message mOnComplete = null;
        final boolean mIsCfu = false;
        Cf(java.lang.String p0, boolean p1, android.os.Message p2) {}
    }

    public static class ImsDialArgs extends com.android.internal.telephony.PhoneInternalInterface.DialArgs {
        public final android.telecom.Connection.RttTextStream rttTextStream = null;
        public final int retryCallFailCause = 0;
        public final int retryCallFailNetworkType = 0;
        public final boolean isWpsCall = false;
        ImsDialArgs() { super(null); }

        public static class Builder extends com.android.internal.telephony.PhoneInternalInterface.DialArgs.Builder<com.android.internal.telephony.imsphone.ImsPhone.ImsDialArgs.Builder> {
            public Builder() { super(); }
            public static com.android.internal.telephony.imsphone.ImsPhone.ImsDialArgs.Builder from(com.android.internal.telephony.PhoneInternalInterface.DialArgs p0) { return null; }
            public com.android.internal.telephony.imsphone.ImsPhone.ImsDialArgs.Builder setRttTextStream(android.telecom.Connection.RttTextStream p0) { return null; }
            public com.android.internal.telephony.imsphone.ImsPhone.ImsDialArgs.Builder setRetryCallFailCause(int p0) { return null; }
            public com.android.internal.telephony.imsphone.ImsPhone.ImsDialArgs.Builder setRetryCallFailNetworkType(int p0) { return null; }
            public com.android.internal.telephony.imsphone.ImsPhone.ImsDialArgs.Builder setIsWpsCall(boolean p0) { return null; }
            public com.android.internal.telephony.imsphone.ImsPhone.ImsDialArgs build() { return null; }
        }
    }

    public static interface ImsManagerFactory {
        public com.android.ims.ImsManager create(android.content.Context p0, int p1);
    }

    public static class SS {
        int mCfAction;
        int mCfReason;
        java.lang.String mDialingNumber;
        int mTimerSeconds;
        boolean mEnable;
        int mClirMode;
        java.lang.String mFacility;
        boolean mLockState;
        java.lang.String mPassword;
        int mServiceClass;
        public android.os.Message mOnComplete;
        SS(android.os.Message p0) {}
        SS(boolean p0, android.os.Message p1) {}
        SS(int p0, android.os.Message p1) {}
        SS(boolean p0, int p1, android.os.Message p2) {}
        SS(int p0, int p1, android.os.Message p2) {}
        SS(int p0, int p1, java.lang.String p2, int p3, int p4, android.os.Message p5) {}
        SS(java.lang.String p0, java.lang.String p1, int p2, android.os.Message p3) {}
        SS(java.lang.String p0, boolean p1, java.lang.String p2, int p3, android.os.Message p4) {}
    }
}
