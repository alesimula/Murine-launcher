package com.android.internal.telephony;

public class GsmCdmaPhone extends com.android.internal.telephony.Phone {
    public static final java.lang.String LOG_TAG = "GsmCdmaPhone";
    public static final java.lang.String CURR_SUBID = "curr_subid";
    public static final int RESTART_ECM_TIMER = 0;
    public static final int CANCEL_ECM_TIMER = 1;
    public int mCdmaSubscriptionSource;
    public static int ENABLE_UICC_APPS_MAX_RETRIES;
    public static final java.lang.String PROPERTY_CDMA_HOME_OPERATOR_NUMERIC = "ro.cdma.home.operator.numeric";
    public com.android.internal.telephony.GsmCdmaCallTracker mCT;
    public com.android.internal.telephony.ServiceStateTracker mSST;
    public com.android.internal.telephony.emergency.EmergencyNumberTracker mEmergencyNumberTracker;
    public com.android.internal.telephony.CellBroadcastConfigTracker mCellBroadcastConfigTracker;
    public GsmCdmaPhone(android.content.Context p0, com.android.internal.telephony.CommandsInterface p1, com.android.internal.telephony.PhoneNotifier p2, int p3, int p4, com.android.internal.telephony.TelephonyComponentFactory p5) { super((java.lang.String)null, (com.android.internal.telephony.PhoneNotifier)null, (android.content.Context)null, (com.android.internal.telephony.CommandsInterface)null, false); }
    public GsmCdmaPhone(android.content.Context p0, com.android.internal.telephony.CommandsInterface p1, com.android.internal.telephony.PhoneNotifier p2, boolean p3, int p4, int p5, com.android.internal.telephony.TelephonyComponentFactory p6) { super((java.lang.String)null, (com.android.internal.telephony.PhoneNotifier)null, (android.content.Context)null, (com.android.internal.telephony.CommandsInterface)null, false); }
    public GsmCdmaPhone(android.content.Context p0, com.android.internal.telephony.CommandsInterface p1, com.android.internal.telephony.PhoneNotifier p2, boolean p3, int p4, int p5, com.android.internal.telephony.TelephonyComponentFactory p6, com.android.internal.telephony.GsmCdmaPhone.ImsManagerFactory p7) { super((java.lang.String)null, (com.android.internal.telephony.PhoneNotifier)null, (android.content.Context)null, (com.android.internal.telephony.CommandsInterface)null, false); }
    public boolean isPhoneTypeGsm() { return false; }
    public boolean isPhoneTypeCdma() { return false; }
    public boolean isPhoneTypeCdmaLte() { return false; }
    protected void finalize() {}
    public android.telephony.ServiceState getServiceState() { return null; }
    public void setVoiceServiceStateOverride(boolean p0) {}
    public void getCellIdentity(android.os.WorkSource p0, android.os.Message p1) {}
    public com.android.internal.telephony.PhoneConstants.State getState() { return null; }
    public int getPhoneType() { return 0; }
    public com.android.internal.telephony.ServiceStateTracker getServiceStateTracker() { return null; }
    public com.android.internal.telephony.emergency.EmergencyNumberTracker getEmergencyNumberTracker() { return null; }
    public com.android.internal.telephony.CallTracker getCallTracker() { return null; }
    public com.android.internal.telephony.data.AccessNetworksManager getAccessNetworksManager() { return null; }
    public com.android.internal.telephony.DeviceStateMonitor getDeviceStateMonitor() { return null; }
    public com.android.internal.telephony.DisplayInfoController getDisplayInfoController() { return null; }
    public com.android.internal.telephony.SignalStrengthController getSignalStrengthController() { return null; }
    public void updateVoiceMail() {}
    public java.util.List<? extends com.android.internal.telephony.MmiCode> getPendingMmiCodes() { return null; }
    public boolean isDataSuspended() { return false; }
    public int getDataActivityState() { return 0; }
    public void notifyPhoneStateChanged() {}
    public void notifyPreciseCallStateChanged() {}
    public void notifyNewRingingConnection(com.android.internal.telephony.Connection p0) {}
    public void notifyDisconnect(com.android.internal.telephony.Connection p0) {}
    public void notifyUnknownConnection(com.android.internal.telephony.Connection p0) {}
    public boolean isInEmergencyCall() { return false; }
    protected void setIsInEmergencyCall() {}
    public boolean isInEmergencySmsMode() { return false; }
    public void sendEmergencyCallStateChange(boolean p0) {}
    public void setBroadcastEmergencyCallStateChanges(boolean p0) {}
    public void notifySuppServiceFailed(com.android.internal.telephony.PhoneInternalInterface.SuppService p0) {}
    public void notifyServiceStateChanged(android.telephony.ServiceState p0) {}
    void notifyServiceStateChangedForSubId(android.telephony.ServiceState p0, int p1) {}
    public void notifyLocationChanged(android.telephony.CellIdentity p0) {}
    public void notifyCallForwardingIndicator() {}
    public void registerForSuppServiceNotification(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSuppServiceNotification(android.os.Handler p0) {}
    public void registerForSimRecordsLoaded(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSimRecordsLoaded(android.os.Handler p0) {}
    public void acceptCall(int p0) throws com.android.internal.telephony.CallStateException {}
    public void rejectCall() throws com.android.internal.telephony.CallStateException {}
    public void switchHoldingAndActive() throws com.android.internal.telephony.CallStateException {}
    public java.lang.String getIccSerialNumber() { return null; }
    public java.lang.String getFullIccSerialNumber() { return null; }
    public boolean canConference() { return false; }
    public void conference() {}
    public void enableEnhancedVoicePrivacy(boolean p0, android.os.Message p1) {}
    public void getEnhancedVoicePrivacy(android.os.Message p0) {}
    public void clearDisconnected() {}
    public boolean canTransfer() { return false; }
    public void explicitCallTransfer() {}
    public com.android.internal.telephony.GsmCdmaCall getForegroundCall() { return null; }
    public com.android.internal.telephony.GsmCdmaCall getBackgroundCall() { return null; }
    public com.android.internal.telephony.Call getRingingCall() { return null; }
    public com.android.internal.telephony.CarrierPrivilegesTracker getCarrierPrivilegesTracker() { return null; }
    public boolean handleInCallMmiCommands(java.lang.String p0) throws com.android.internal.telephony.CallStateException { return false; }
    public boolean isInCall() { return false; }
    public boolean useImsForEmergency() { return false; }
    public com.android.internal.telephony.Connection startConference(java.lang.String[] p0, com.android.internal.telephony.PhoneInternalInterface.DialArgs p1) throws com.android.internal.telephony.CallStateException { return null; }
    public com.android.internal.telephony.Connection dial(java.lang.String p0, com.android.internal.telephony.PhoneInternalInterface.DialArgs p1, java.util.function.Consumer<com.android.internal.telephony.Phone> p2) throws com.android.internal.telephony.CallStateException { return null; }
    public boolean isNotificationOfWfcCallRequired(java.lang.String p0) { return false; }
    protected com.android.internal.telephony.Connection dialInternal(java.lang.String p0, com.android.internal.telephony.PhoneInternalInterface.DialArgs p1) throws com.android.internal.telephony.CallStateException { return null; }
    protected com.android.internal.telephony.Connection dialInternal(java.lang.String p0, com.android.internal.telephony.PhoneInternalInterface.DialArgs p1, android.os.ResultReceiver p2) throws com.android.internal.telephony.CallStateException { return null; }
    public boolean handlePinMmi(java.lang.String p0) { return false; }
    public boolean handleUssdRequest(java.lang.String p0, android.os.ResultReceiver p1) { return false; }
    public void sendUssdResponse(java.lang.String p0) {}
    public void sendDtmf(char p0) {}
    public void startDtmf(char p0) {}
    public void stopDtmf() {}
    public void sendBurstDtmf(java.lang.String p0, int p1, int p2, android.os.Message p3) {}
    public void setRadioPowerOnForTestEmergencyCall(boolean p0) {}
    public void setRadioPower(boolean p0, boolean p1, boolean p2, boolean p3) {}
    public void setRadioPowerForReason(boolean p0, boolean p1, boolean p2, boolean p3, int p4) {}
    public java.util.Set<java.lang.Integer> getRadioPowerOffReasons() { return null; }
    public java.lang.String getVoiceMailNumber() { return null; }
    public java.lang.String getVoiceMailAlphaTag() { return null; }
    public java.lang.String getDeviceId() { return null; }
    public java.lang.String getDeviceSvn() { return null; }
    public com.android.internal.telephony.uicc.IsimRecords getIsimRecords() { return null; }
    public java.lang.String getImei() { return null; }
    public int getImeiType() { return 0; }
    public java.lang.String getEsn() { return null; }
    public java.lang.String getMeid() { return null; }
    public java.lang.String getNai() { return null; }
    public java.lang.String getSubscriberId() { return null; }
    public android.telephony.ImsiEncryptionInfo getCarrierInfoForImsiEncryption(int p0, boolean p1) { return null; }
    public void setCarrierInfoForImsiEncryption(android.telephony.ImsiEncryptionInfo p0) {}
    public void deleteCarrierInfoForImsiEncryption(int p0) {}
    public int getCarrierId() { return 0; }
    public java.lang.String getCarrierName() { return null; }
    public int getMNOCarrierId() { return 0; }
    public int getSpecificCarrierId() { return 0; }
    public java.lang.String getSpecificCarrierName() { return null; }
    public void resolveSubscriptionCarrierId(java.lang.String p0) {}
    public int getCarrierIdListVersion() { return 0; }
    public int getEmergencyNumberDbVersion() { return 0; }
    public void resetCarrierKeysForImsiEncryption() {}
    public void setCarrierTestOverride(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8) {}
    public java.lang.String getGroupIdLevel1() { return null; }
    public java.lang.String getGroupIdLevel2() { return null; }
    public java.lang.String getLine1Number() { return null; }
    public java.lang.String getPlmn() { return null; }
    protected void updateManualNetworkSelection(com.android.internal.telephony.Phone.NetworkSelectMessage p0) {}
    public java.lang.String getManualNetworkSelectionPlmn() { return null; }
    public java.lang.String getCdmaPrlVersion() { return null; }
    public java.lang.String getCdmaMin() { return null; }
    public boolean isMinInfoReady() { return false; }
    public java.lang.String getMsisdn() { return null; }
    public java.lang.String getLine1AlphaTag() { return null; }
    public boolean setLine1Number(java.lang.String p0, java.lang.String p1, android.os.Message p2) { return false; }
    public void setVoiceMailNumber(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public java.lang.String getSystemProperty(java.lang.String p0, java.lang.String p1) { return null; }
    public boolean useSsOverIms(android.os.Message p0) { return false; }
    public void getCallForwardingOption(int p0, android.os.Message p1) {}
    public void getCallForwardingOption(int p0, int p1, android.os.Message p2) {}
    public void setCallForwardingOption(int p0, int p1, java.lang.String p2, int p3, android.os.Message p4) {}
    public void setCallForwardingOption(int p0, int p1, java.lang.String p2, int p3, int p4, android.os.Message p5) {}
    public void getCallBarring(java.lang.String p0, java.lang.String p1, android.os.Message p2, int p3) {}
    public void setCallBarring(java.lang.String p0, boolean p1, java.lang.String p2, android.os.Message p3, int p4) {}
    public void changeCallBarringPassword(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Message p3) {}
    public void getOutgoingCallerIdDisplay(android.os.Message p0) {}
    public void setOutgoingCallerIdDisplay(int p0, android.os.Message p1) {}
    public void queryCLIP(android.os.Message p0) {}
    public void getCallWaiting(android.os.Message p0) {}
    public void setCallWaiting(boolean p0, android.os.Message p1) {}
    public void setCallWaiting(boolean p0, int p1, android.os.Message p2) {}
    public int getTerminalBasedCallWaitingState(boolean p0) { return 0; }
    public void setTerminalBasedCallWaitingStatus(int p0) {}
    public void setTerminalBasedCallWaitingSupported(boolean p0) {}
    public void getAvailableNetworks(android.os.Message p0) {}
    public void startNetworkScan(android.telephony.NetworkScanRequest p0, android.os.Message p1) {}
    public void stopNetworkScan(android.os.Message p0) {}
    public void setTTYMode(int p0, android.os.Message p1) {}
    public void setUiTTYMode(int p0, android.os.Message p1) {}
    public void setMute(boolean p0) {}
    public boolean getMute() { return false; }
    public void updateServiceLocation(android.os.WorkSource p0) {}
    public void enableLocationUpdates() {}
    public void disableLocationUpdates() {}
    public boolean getDataRoamingEnabled() { return false; }
    public void setDataRoamingEnabled(boolean p0) {}
    public void registerForCdmaOtaStatusChange(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForCdmaOtaStatusChange(android.os.Handler p0) {}
    public void registerForSubscriptionInfoReady(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSubscriptionInfoReady(android.os.Handler p0) {}
    public void setOnEcbModeExitResponse(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unsetOnEcbModeExitResponse(android.os.Handler p0) {}
    public void registerForCallWaiting(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForCallWaiting(android.os.Handler p0) {}
    public boolean isUserDataEnabled() { return false; }
    public void onMMIDone(com.android.internal.telephony.MmiCode p0) {}
    public boolean supports3gppCallForwardingWhileRoaming() { return false; }
    public void handleMessage(android.os.Message p0) {}
    public com.android.internal.telephony.uicc.UiccCardApplication getUiccCardApplication() { return null; }
    protected void onUpdateIccAvailability() {}
    public boolean updateCurrentCarrierInProvider() { return false; }
    public com.android.internal.telephony.IccPhoneBookInterfaceManager getIccPhoneBookInterfaceManager() { return null; }
    public void activateCellBroadcastSms(int p0, android.os.Message p1) {}
    public void getCellBroadcastSmsConfig(android.os.Message p0) {}
    public void setCellBroadcastSmsConfig(int[] p0, android.os.Message p1) {}
    public boolean needsOtaServiceProvisioning() { return false; }
    public boolean isCspPlmnEnabled() { return false; }
    public boolean shouldForceAutoNetworkSelect() { return false; }
    public void exitEmergencyCallbackMode() {}
    public void notifyEmergencyCallRegistrants(boolean p0) {}
    public void handleTimerInEmergencyCallbackMode(int p0) {}
    public boolean isOtaSpNumber(java.lang.String p0) { return false; }
    public int getOtasp() { return 0; }
    public int getCdmaEriIconIndex() { return 0; }
    public int getCdmaEriIconMode() { return 0; }
    public java.lang.String getCdmaEriText() { return null; }
    public boolean isCdmaSubscriptionAppPresent() { return false; }
    protected void phoneObjectUpdater(int p0) {}
    public void setLinkCapacityReportingCriteria(int[] p0, int[] p1, int p2) {}
    public com.android.internal.telephony.IccSmsInterfaceManager getIccSmsInterfaceManager() { return null; }
    public void updatePhoneObject(int p0) {}
    public void setImsRegistrationState(boolean p0) {}
    public boolean getIccRecordsLoaded() { return false; }
    public com.android.internal.telephony.IccCard getIccCard() { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public boolean setOperatorBrandOverride(java.lang.String p0) { return false; }
    public java.lang.String getOperatorNumeric() { return null; }
    public java.lang.String getCountryIso() { return null; }
    public void notifyEcbmTimerReset(java.lang.Boolean p0) {}
    public int getCsCallRadioTech() { return 0; }
    public void registerForEcmTimerReset(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForEcmTimerReset(android.os.Handler p0) {}
    public void registerForVolteSilentRedial(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForVolteSilentRedial(android.os.Handler p0) {}
    public void notifyVolteSilentRedial(java.lang.String p0, int p1) {}
    public void registerForEmergencyDomainSelected(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForEmergencyDomainSelected(android.os.Handler p0) {}
    public void notifyEmergencyDomainSelected(int p0) {}
    public void setVoiceMessageWaiting(int p0, int p1) {}
    public boolean isUtEnabled() { return false; }
    public java.lang.String getDtmfToneDelayKey() { return null; }
    public android.os.PowerManager.WakeLock getWakeLock() { return null; }
    public int getLteOnCdmaMode() { return 0; }
    public void enableUiccApplications(boolean p0, android.os.Message p1) {}
    public boolean canDisablePhysicalSubscription() { return false; }
    public java.util.List<java.lang.String> getEquivalentHomePlmns() { return null; }
    public java.util.List<java.lang.String> getDataServicePackages() { return null; }
    public boolean isImsUseEnabled() { return false; }
    public com.android.internal.telephony.InboundSmsHandler getInboundSmsHandler(boolean p0) { return null; }
    public java.util.List<android.telephony.CellBroadcastIdRange> getCellBroadcastIdRanges() { return null; }
    public void setCellBroadcastIdRanges(java.util.List<android.telephony.CellBroadcastIdRange> p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    public void handleNullCipherEnabledChange() {}
    public boolean isNullCipherAndIntegritySupported() { return false; }

    private static class Cfu {
        final java.lang.String mSetCfNumber = null;
        final android.os.Message mOnComplete = null;
        Cfu(java.lang.String p0, android.os.Message p1) {}
    }

    public static interface ImsManagerFactory {
        public com.android.ims.ImsManager create(android.content.Context p0, int p1);
    }
}
