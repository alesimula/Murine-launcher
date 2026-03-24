package com.android.internal.telephony;

public interface CommandsInterface {
    public static final int CLIR_DEFAULT = 0;
    public static final int CLIR_INVOCATION = 1;
    public static final int CLIR_SUPPRESSION = 2;
    public static final int SS_STATUS_UNKNOWN = 255;
    public static final int CF_ACTION_DISABLE = 0;
    public static final int CF_ACTION_ENABLE = 1;
    public static final int CF_ACTION_REGISTRATION = 3;
    public static final int CF_ACTION_ERASURE = 4;
    public static final int CF_REASON_UNCONDITIONAL = 0;
    public static final int CF_REASON_BUSY = 1;
    public static final int CF_REASON_NO_REPLY = 2;
    public static final int CF_REASON_NOT_REACHABLE = 3;
    public static final int CF_REASON_ALL = 4;
    public static final int CF_REASON_ALL_CONDITIONAL = 5;
    public static final java.lang.String CB_FACILITY_BAOC = "AO";
    public static final java.lang.String CB_FACILITY_BAOIC = "OI";
    public static final java.lang.String CB_FACILITY_BAOICxH = "OX";
    public static final java.lang.String CB_FACILITY_BAIC = "AI";
    public static final java.lang.String CB_FACILITY_BAICr = "IR";
    public static final java.lang.String CB_FACILITY_BA_ALL = "AB";
    public static final java.lang.String CB_FACILITY_BA_MO = "AG";
    public static final java.lang.String CB_FACILITY_BA_MT = "AC";
    public static final java.lang.String CB_FACILITY_BA_SIM = "SC";
    public static final java.lang.String CB_FACILITY_BA_FD = "FD";
    public static final java.lang.String CB_FACILITY_BIC_ACR = "AR";
    public static final int SERVICE_CLASS_NONE = 0;
    public static final int SERVICE_CLASS_VOICE = 1;
    public static final int SERVICE_CLASS_DATA = 2;
    public static final int SERVICE_CLASS_FAX = 4;
    public static final int SERVICE_CLASS_SMS = 8;
    public static final int SERVICE_CLASS_DATA_SYNC = 16;
    public static final int SERVICE_CLASS_DATA_ASYNC = 32;
    public static final int SERVICE_CLASS_PACKET = 64;
    public static final int SERVICE_CLASS_PAD = 128;
    public static final int SERVICE_CLASS_MAX = 128;
    public static final int USSD_MODE_NOTIFY = 0;
    public static final int USSD_MODE_REQUEST = 1;
    public static final int USSD_MODE_NW_RELEASE = 2;
    public static final int USSD_MODE_LOCAL_CLIENT = 3;
    public static final int USSD_MODE_NOT_SUPPORTED = 4;
    public static final int USSD_MODE_NW_TIMEOUT = 5;
    public static final int GSM_SMS_FAIL_CAUSE_MEMORY_CAPACITY_EXCEEDED = 211;
    public static final int GSM_SMS_FAIL_CAUSE_USIM_APP_TOOLKIT_BUSY = 212;
    public static final int GSM_SMS_FAIL_CAUSE_USIM_DATA_DOWNLOAD_ERROR = 213;
    public static final int GSM_SMS_FAIL_CAUSE_UNSPECIFIED_ERROR = 255;
    public static final int CDMA_SMS_FAIL_CAUSE_INVALID_TELESERVICE_ID = 4;
    public static final int CDMA_SMS_FAIL_CAUSE_RESOURCE_SHORTAGE = 35;
    public static final int CDMA_SMS_FAIL_CAUSE_OTHER_TERMINAL_PROBLEM = 39;
    public static final int CDMA_SMS_FAIL_CAUSE_ENCODING_PROBLEM = 96;
    public static final int IMS_MMTEL_CAPABILITY_VOICE = 1;
    public static final int IMS_MMTEL_CAPABILITY_VIDEO = 2;
    public static final int IMS_MMTEL_CAPABILITY_SMS = 4;
    public static final int IMS_RCS_CAPABILITIES = 8;
    public int getRadioState();
    public void getImsRegistrationState(android.os.Message p0);
    public void registerForRadioStateChanged(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForRadioStateChanged(android.os.Handler p0);
    public void registerForVoiceRadioTechChanged(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForVoiceRadioTechChanged(android.os.Handler p0);
    public void registerForImsNetworkStateChanged(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForImsNetworkStateChanged(android.os.Handler p0);
    public void registerForOn(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForOn(android.os.Handler p0);
    public void registerForAvailable(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForAvailable(android.os.Handler p0);
    public void registerForNotAvailable(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForNotAvailable(android.os.Handler p0);
    public void registerForOffOrNotAvailable(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForOffOrNotAvailable(android.os.Handler p0);
    public void registerForIccStatusChanged(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForIccStatusChanged(android.os.Handler p0);
    public void registerForIccSlotStatusChanged(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForIccSlotStatusChanged(android.os.Handler p0);
    public void registerForCallStateChanged(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForCallStateChanged(android.os.Handler p0);
    public void registerForNetworkStateChanged(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForNetworkStateChanged(android.os.Handler p0);
    public void registerForDataCallListChanged(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForDataCallListChanged(android.os.Handler p0);
    public void registerForApnUnthrottled(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForApnUnthrottled(android.os.Handler p0);
    public void registerForSlicingConfigChanged(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForSlicingConfigChanged(android.os.Handler p0);
    public void registerForInCallVoicePrivacyOn(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForInCallVoicePrivacyOn(android.os.Handler p0);
    public void registerForInCallVoicePrivacyOff(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForInCallVoicePrivacyOff(android.os.Handler p0);
    public void registerForSrvccStateChanged(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForSrvccStateChanged(android.os.Handler p0);
    public void registerForSubscriptionStatusChanged(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForSubscriptionStatusChanged(android.os.Handler p0);
    public void registerForHardwareConfigChanged(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForHardwareConfigChanged(android.os.Handler p0);
    public void setOnNewGsmSms(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unSetOnNewGsmSms(android.os.Handler p0);
    public void setOnNewCdmaSms(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unSetOnNewCdmaSms(android.os.Handler p0);
    public void setOnNewGsmBroadcastSms(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unSetOnNewGsmBroadcastSms(android.os.Handler p0);
    public void setOnSmsOnSim(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unSetOnSmsOnSim(android.os.Handler p0);
    public void setOnSmsStatus(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unSetOnSmsStatus(android.os.Handler p0);
    public void setOnNITZTime(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unSetOnNITZTime(android.os.Handler p0);
    public void setOnUSSD(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unSetOnUSSD(android.os.Handler p0);
    public void setOnSignalStrengthUpdate(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unSetOnSignalStrengthUpdate(android.os.Handler p0);
    public void setOnIccSmsFull(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unSetOnIccSmsFull(android.os.Handler p0);
    public void registerForIccRefresh(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForIccRefresh(android.os.Handler p0);
    public void setOnIccRefresh(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unsetOnIccRefresh(android.os.Handler p0);
    public void setOnCallRing(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unSetOnCallRing(android.os.Handler p0);
    public void setOnRestrictedStateChanged(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unSetOnRestrictedStateChanged(android.os.Handler p0);
    public void setOnSuppServiceNotification(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unSetOnSuppServiceNotification(android.os.Handler p0);
    public void setOnCatSessionEnd(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unSetOnCatSessionEnd(android.os.Handler p0);
    public void setOnCatProactiveCmd(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unSetOnCatProactiveCmd(android.os.Handler p0);
    public void setOnCatEvent(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unSetOnCatEvent(android.os.Handler p0);
    public void setOnCatCallSetUp(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unSetOnCatCallSetUp(android.os.Handler p0);
    public void setSuppServiceNotifications(boolean p0, android.os.Message p1);
    public void setOnCatCcAlphaNotify(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unSetOnCatCcAlphaNotify(android.os.Handler p0);
    public void setOnSs(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unSetOnSs(android.os.Handler p0);
    default public void setOnRegistrationFailed(android.os.Handler p0, int p1, java.lang.Object p2) {}
    default public void unSetOnRegistrationFailed(android.os.Handler p0) {}
    public void registerForDisplayInfo(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForDisplayInfo(android.os.Handler p0);
    public void registerForCallWaitingInfo(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForCallWaitingInfo(android.os.Handler p0);
    public void registerForSignalInfo(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForSignalInfo(android.os.Handler p0);
    public void registerForNumberInfo(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForNumberInfo(android.os.Handler p0);
    public void registerForRedirectedNumberInfo(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForRedirectedNumberInfo(android.os.Handler p0);
    public void registerForLineControlInfo(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForLineControlInfo(android.os.Handler p0);
    public void registerFoT53ClirlInfo(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForT53ClirInfo(android.os.Handler p0);
    public void registerForT53AudioControlInfo(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForT53AudioControlInfo(android.os.Handler p0);
    public void setEmergencyCallbackMode(android.os.Handler p0, int p1, java.lang.Object p2);
    public void registerForCdmaOtaProvision(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForCdmaOtaProvision(android.os.Handler p0);
    public void registerForRingbackTone(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForRingbackTone(android.os.Handler p0);
    public void registerForResendIncallMute(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForResendIncallMute(android.os.Handler p0);
    public void registerForCdmaSubscriptionChanged(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForCdmaSubscriptionChanged(android.os.Handler p0);
    public void registerForCdmaPrlChanged(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForCdmaPrlChanged(android.os.Handler p0);
    public void registerForExitEmergencyCallbackMode(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForExitEmergencyCallbackMode(android.os.Handler p0);
    public void registerForRilConnected(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForRilConnected(android.os.Handler p0);
    default public void registerUiccApplicationEnablementChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    default public void unregisterUiccApplicationEnablementChanged(android.os.Handler p0) {}
    public void supplyIccPin(java.lang.String p0, android.os.Message p1);
    public void supplyIccPinForApp(java.lang.String p0, java.lang.String p1, android.os.Message p2);
    public void supplyIccPuk(java.lang.String p0, java.lang.String p1, android.os.Message p2);
    public void supplyIccPukForApp(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Message p3);
    public void supplyIccPin2(java.lang.String p0, android.os.Message p1);
    public void supplyIccPin2ForApp(java.lang.String p0, java.lang.String p1, android.os.Message p2);
    public void supplyIccPuk2(java.lang.String p0, java.lang.String p1, android.os.Message p2);
    public void supplyIccPuk2ForApp(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Message p3);
    public void changeIccPin(java.lang.String p0, java.lang.String p1, android.os.Message p2);
    public void changeIccPinForApp(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Message p3);
    public void changeIccPin2(java.lang.String p0, java.lang.String p1, android.os.Message p2);
    public void changeIccPin2ForApp(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Message p3);
    public void changeBarringPassword(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Message p3);
    public void supplyNetworkDepersonalization(java.lang.String p0, android.os.Message p1);
    public void supplySimDepersonalization(com.android.internal.telephony.uicc.IccCardApplicationStatus.PersoSubState p0, java.lang.String p1, android.os.Message p2);
    public void getCurrentCalls(android.os.Message p0);
    @java.lang.Deprecated
    public void getPDPContextList(android.os.Message p0);
    public void getDataCallList(android.os.Message p0);
    public void dial(java.lang.String p0, boolean p1, android.telephony.emergency.EmergencyNumber p2, boolean p3, int p4, android.os.Message p5);
    public void dial(java.lang.String p0, boolean p1, android.telephony.emergency.EmergencyNumber p2, boolean p3, int p4, com.android.internal.telephony.UUSInfo p5, android.os.Message p6);
    public void getIMSI(android.os.Message p0);
    public void getIMSIForApp(java.lang.String p0, android.os.Message p1);
    public void getIMEI(android.os.Message p0);
    public void getIMEISV(android.os.Message p0);
    public void hangupConnection(int p0, android.os.Message p1);
    public void hangupWaitingOrBackground(android.os.Message p0);
    public void hangupForegroundResumeBackground(android.os.Message p0);
    public void switchWaitingOrHoldingAndActive(android.os.Message p0);
    public void conference(android.os.Message p0);
    public void setPreferredVoicePrivacy(boolean p0, android.os.Message p1);
    public void getPreferredVoicePrivacy(android.os.Message p0);
    public void separateConnection(int p0, android.os.Message p1);
    public void acceptCall(android.os.Message p0);
    public void rejectCall(android.os.Message p0);
    public void explicitCallTransfer(android.os.Message p0);
    public void getLastCallFailCause(android.os.Message p0);
    @java.lang.Deprecated
    public void getLastPdpFailCause(android.os.Message p0);
    public void getLastDataCallFailCause(android.os.Message p0);
    public void setMute(boolean p0, android.os.Message p1);
    public void getMute(android.os.Message p0);
    public void getSignalStrength(android.os.Message p0);
    public void getVoiceRegistrationState(android.os.Message p0);
    public void getDataRegistrationState(android.os.Message p0);
    public void getOperator(android.os.Message p0);
    public void sendDtmf(char p0, android.os.Message p1);
    public void startDtmf(char p0, android.os.Message p1);
    public void stopDtmf(android.os.Message p0);
    public void sendBurstDtmf(java.lang.String p0, int p1, int p2, android.os.Message p3);
    public void sendSMS(java.lang.String p0, java.lang.String p1, android.os.Message p2);
    public void sendSMSExpectMore(java.lang.String p0, java.lang.String p1, android.os.Message p2);
    public void sendCdmaSms(byte[] p0, android.os.Message p1);
    public void sendCdmaSMSExpectMore(byte[] p0, android.os.Message p1);
    public void sendImsGsmSms(java.lang.String p0, java.lang.String p1, int p2, int p3, android.os.Message p4);
    public void sendImsCdmaSms(byte[] p0, int p1, int p2, android.os.Message p3);
    public void deleteSmsOnSim(int p0, android.os.Message p1);
    public void deleteSmsOnRuim(int p0, android.os.Message p1);
    public void writeSmsToSim(int p0, java.lang.String p1, java.lang.String p2, android.os.Message p3);
    public void writeSmsToRuim(int p0, byte[] p1, android.os.Message p2);
    default public void setRadioPower(boolean p0, android.os.Message p1) {}
    default public void setRadioPower(boolean p0, boolean p1, boolean p2, android.os.Message p3) {}
    public void acknowledgeLastIncomingGsmSms(boolean p0, int p1, android.os.Message p2);
    public void acknowledgeLastIncomingCdmaSms(boolean p0, int p1, android.os.Message p2);
    public void acknowledgeIncomingGsmSmsWithPdu(boolean p0, java.lang.String p1, android.os.Message p2);
    public void iccIO(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, java.lang.String p6, java.lang.String p7, android.os.Message p8);
    public void iccIOForApp(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, android.os.Message p9);
    public void queryCLIP(android.os.Message p0);
    public void getCLIR(android.os.Message p0);
    public void setCLIR(int p0, android.os.Message p1);
    public void queryCallWaiting(int p0, android.os.Message p1);
    public void setCallWaiting(boolean p0, int p1, android.os.Message p2);
    public void setCallForward(int p0, int p1, int p2, java.lang.String p3, int p4, android.os.Message p5);
    public void queryCallForwardStatus(int p0, int p1, java.lang.String p2, android.os.Message p3);
    public void setNetworkSelectionModeAutomatic(android.os.Message p0);
    public void setNetworkSelectionModeManual(java.lang.String p0, int p1, android.os.Message p2);
    public void getNetworkSelectionMode(android.os.Message p0);
    public void getAvailableNetworks(android.os.Message p0);
    public void startNetworkScan(android.telephony.NetworkScanRequest p0, android.os.Message p1);
    public void stopNetworkScan(android.os.Message p0);
    public void getBasebandVersion(android.os.Message p0);
    public void queryFacilityLock(java.lang.String p0, java.lang.String p1, int p2, android.os.Message p3);
    public void queryFacilityLockForApp(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, android.os.Message p4);
    public void setFacilityLock(java.lang.String p0, boolean p1, java.lang.String p2, int p3, android.os.Message p4);
    public void setFacilityLockForApp(java.lang.String p0, boolean p1, java.lang.String p2, int p3, java.lang.String p4, android.os.Message p5);
    public void sendUSSD(java.lang.String p0, android.os.Message p1);
    public void cancelPendingUssd(android.os.Message p0);
    public void resetRadio(android.os.Message p0);
    public void setBandMode(int p0, android.os.Message p1);
    public void queryAvailableBandMode(android.os.Message p0);
    public void setPreferredNetworkType(int p0, android.os.Message p1);
    public void getPreferredNetworkType(android.os.Message p0);
    public void setAllowedNetworkTypesBitmap(int p0, android.os.Message p1);
    public void getAllowedNetworkTypesBitmap(android.os.Message p0);
    default public void setNrDualConnectivityState(int p0, android.os.Message p1, android.os.WorkSource p2) {}
    default public void isNrDualConnectivityEnabled(android.os.Message p0, android.os.WorkSource p1) {}
    default public void setVoNrEnabled(boolean p0, android.os.Message p1, android.os.WorkSource p2) {}
    default public void isVoNrEnabled(android.os.Message p0, android.os.WorkSource p1) {}
    default public void setLocationUpdates(boolean p0, android.os.WorkSource p1, android.os.Message p2) {}
    default public void setLocationUpdates(boolean p0, android.os.Message p1) {}
    public void getSmscAddress(android.os.Message p0);
    public void setSmscAddress(java.lang.String p0, android.os.Message p1);
    public void reportSmsMemoryStatus(boolean p0, android.os.Message p1);
    public void reportStkServiceIsRunning(android.os.Message p0);
    public void invokeOemRilRequestRaw(byte[] p0, android.os.Message p1);
    public void setCarrierInfoForImsiEncryption(android.telephony.ImsiEncryptionInfo p0, android.os.Message p1);
    public void invokeOemRilRequestStrings(java.lang.String[] p0, android.os.Message p1);
    public void setOnUnsolOemHookRaw(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unSetOnUnsolOemHookRaw(android.os.Handler p0);
    public void sendTerminalResponse(java.lang.String p0, android.os.Message p1);
    public void sendEnvelope(java.lang.String p0, android.os.Message p1);
    public void sendEnvelopeWithStatus(java.lang.String p0, android.os.Message p1);
    public void handleCallSetupRequestFromSim(boolean p0, android.os.Message p1);
    public void setGsmBroadcastActivation(boolean p0, android.os.Message p1);
    public void setGsmBroadcastConfig(com.android.internal.telephony.gsm.SmsBroadcastConfigInfo[] p0, android.os.Message p1);
    public void getGsmBroadcastConfig(android.os.Message p0);
    public void getDeviceIdentity(android.os.Message p0);
    public void getImei(android.os.Message p0);
    public void getCDMASubscription(android.os.Message p0);
    public void sendCDMAFeatureCode(java.lang.String p0, android.os.Message p1);
    public void setPhoneType(int p0);
    public void queryCdmaRoamingPreference(android.os.Message p0);
    public void setCdmaRoamingPreference(int p0, android.os.Message p1);
    public void setCdmaSubscriptionSource(int p0, android.os.Message p1);
    public void getCdmaSubscriptionSource(android.os.Message p0);
    public void setTTYMode(int p0, android.os.Message p1);
    public void queryTTYMode(android.os.Message p0);
    public void setupDataCall(int p0, android.telephony.data.DataProfile p1, boolean p2, boolean p3, int p4, android.net.LinkProperties p5, int p6, android.telephony.data.NetworkSliceInfo p7, android.telephony.data.TrafficDescriptor p8, boolean p9, android.os.Message p10);
    public void deactivateDataCall(int p0, int p1, android.os.Message p2);
    public void setCdmaBroadcastActivation(boolean p0, android.os.Message p1);
    public void setCdmaBroadcastConfig(com.android.internal.telephony.cdma.CdmaSmsBroadcastConfigInfo[] p0, android.os.Message p1);
    public void getCdmaBroadcastConfig(android.os.Message p0);
    public void exitEmergencyCallbackMode(android.os.Message p0);
    public void getIccCardStatus(android.os.Message p0);
    public void getIccSlotsStatus(android.os.Message p0);
    public void setLogicalToPhysicalSlotMapping(int[] p0, android.os.Message p1);
    public void requestIccSimAuthentication(int p0, java.lang.String p1, java.lang.String p2, android.os.Message p3);
    public void getVoiceRadioTechnology(android.os.Message p0);
    default public void getCellInfoList(android.os.Message p0, android.os.WorkSource p1) {}
    default public void setCellInfoListRate(int p0, android.os.Message p1, android.os.WorkSource p2) {}
    public void registerForCellInfoList(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForCellInfoList(android.os.Handler p0);
    public void registerForPhysicalChannelConfiguration(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForPhysicalChannelConfiguration(android.os.Handler p0);
    public void setInitialAttachApn(android.telephony.data.DataProfile p0, boolean p1, android.os.Message p2);
    public void setDataProfile(android.telephony.data.DataProfile[] p0, boolean p1, android.os.Message p2);
    public void testingEmergencyCall();
    public void iccOpenLogicalChannel(java.lang.String p0, int p1, android.os.Message p2);
    public void iccCloseLogicalChannel(int p0, boolean p1, android.os.Message p2);
    public void iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6, boolean p7, android.os.Message p8);
    public void iccTransmitApduBasicChannel(int p0, int p1, int p2, int p3, int p4, java.lang.String p5, android.os.Message p6);
    default public void nvReadItem(int p0, android.os.Message p1, android.os.WorkSource p2) {}
    default public void nvWriteItem(int p0, java.lang.String p1, android.os.Message p2, android.os.WorkSource p3) {}
    public void nvWriteCdmaPrl(byte[] p0, android.os.Message p1);
    public void nvResetConfig(int p0, android.os.Message p1);
    public void getHardwareConfig(android.os.Message p0);
    public int getRilVersion();
    @java.lang.Deprecated
    default public com.android.internal.telephony.HalVersion getHalVersion() { return null; }
    default public com.android.internal.telephony.HalVersion getHalVersion(int p0) { return null; }
    public void setUiccSubscription(int p0, int p1, int p2, int p3, android.os.Message p4);
    default public boolean supportsEid() { return false; }
    public void setDataAllowed(boolean p0, android.os.Message p1);
    public void requestShutdown(android.os.Message p0);
    public void setRadioCapability(com.android.internal.telephony.RadioCapability p0, android.os.Message p1);
    public void getRadioCapability(android.os.Message p0);
    public void registerForRadioCapabilityChanged(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForRadioCapabilityChanged(android.os.Handler p0);
    public void startLceService(int p0, boolean p1, android.os.Message p2);
    public void stopLceService(android.os.Message p0);
    public void pullLceData(android.os.Message p0);
    public void registerForLceInfo(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForLceInfo(android.os.Handler p0);
    default public void getModemActivityInfo(android.os.Message p0, android.os.WorkSource p1) {}
    default public void setAllowedCarriers(android.telephony.CarrierRestrictionRules p0, android.os.Message p1, android.os.WorkSource p2) {}
    default public void getAllowedCarriers(android.os.Message p0, android.os.WorkSource p1) {}
    public void registerForPcoData(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForPcoData(android.os.Handler p0);
    public void registerForModemReset(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForModemReset(android.os.Handler p0);
    public void sendDeviceState(int p0, boolean p1, android.os.Message p2);
    public void setUnsolResponseFilter(int p0, android.os.Message p1);
    public void setSignalStrengthReportingCriteria(java.util.List<android.telephony.SignalThresholdInfo> p0, android.os.Message p1);
    public void setLinkCapacityReportingCriteria(int p0, int p1, int p2, int[] p3, int[] p4, int p5, android.os.Message p6);
    default public void setSimCardPower(int p0, android.os.Message p1, android.os.WorkSource p2) {}
    public void registerForCarrierInfoForImsiEncryption(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForCarrierInfoForImsiEncryption(android.os.Handler p0);
    public void registerForNetworkScanResult(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForNetworkScanResult(android.os.Handler p0);
    public void registerForNattKeepaliveStatus(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForNattKeepaliveStatus(android.os.Handler p0);
    public void registerForEmergencyNumberList(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForEmergencyNumberList(android.os.Handler p0);
    public void startNattKeepalive(int p0, android.net.KeepalivePacketData p1, int p2, android.os.Message p3);
    public void stopNattKeepalive(int p0, android.os.Message p1);
    default public void enableModem(boolean p0, android.os.Message p1) {}
    default public void onSlotActiveStatusChange(boolean p0) {}
    default public void getModemStatus(android.os.Message p0) {}
    default public void enableUiccApplications(boolean p0, android.os.Message p1) {}
    default public void setSystemSelectionChannels(java.util.List<android.telephony.RadioAccessSpecifier> p0, android.os.Message p1) {}
    default public void getSystemSelectionChannels(android.os.Message p0) {}
    default public void areUiccApplicationsEnabled(android.os.Message p0) {}
    default public boolean canToggleUiccApplicationsEnablement() { return false; }
    default public java.util.List<android.telephony.ClientRequestStats> getClientRequestStats() { return null; }
    default public void registerForBarringInfoChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    default public void unregisterForBarringInfoChanged(android.os.Handler p0) {}
    default public void getBarringInfo(android.os.Message p0) {}
    default public android.telephony.BarringInfo getLastBarringInfo() { return null; }
    default public void allocatePduSessionId(android.os.Message p0) {}
    default public void releasePduSessionId(android.os.Message p0, int p1) {}
    default public void startHandover(android.os.Message p0, int p1) {}
    default public void cancelHandover(android.os.Message p0, int p1) {}
    default public void setDataThrottling(android.os.Message p0, android.os.WorkSource p1, int p2, long p3) {}
    default public void getSlicingConfig(android.os.Message p0) {}
    default public boolean setModemService(java.lang.String p0) { return false; }
    default public java.lang.String getModemService() { return null; }
    public void getSimPhonebookRecords(android.os.Message p0);
    public void getSimPhonebookCapacity(android.os.Message p0);
    public void updateSimPhonebookRecord(com.android.internal.telephony.uicc.SimPhonebookRecord p0, android.os.Message p1);
    public void registerForSimPhonebookChanged(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForSimPhonebookChanged(android.os.Handler p0);
    public void registerForSimPhonebookRecordsReceived(android.os.Handler p0, int p1, java.lang.Object p2);
    public void unregisterForSimPhonebookRecordsReceived(android.os.Handler p0);
    default public void registerForConnectionSetupFailure(android.os.Handler p0, int p1, java.lang.Object p2) {}
    default public void unregisterForConnectionSetupFailure(android.os.Handler p0) {}
    default public void registerForNotifyAnbr(android.os.Handler p0, int p1, java.lang.Object p2) {}
    default public void unregisterForNotifyAnbr(android.os.Handler p0) {}
    default public void registerForTriggerImsDeregistration(android.os.Handler p0, int p1, java.lang.Object p2) {}
    default public void unregisterForTriggerImsDeregistration(android.os.Handler p0) {}
    default public void setUsageSetting(android.os.Message p0, int p1) {}
    default public void getUsageSetting(android.os.Message p0) {}
    default public void setEmergencyMode(int p0, android.os.Message p1) {}
    default public void triggerEmergencyNetworkScan(int[] p0, int p1, android.os.Message p2) {}
    default public void cancelEmergencyNetworkScan(boolean p0, android.os.Message p1) {}
    default public void exitEmergencyMode(android.os.Message p0) {}
    default public void registerForEmergencyNetworkScan(android.os.Handler p0, int p1, java.lang.Object p2) {}
    default public void unregisterForEmergencyNetworkScan(android.os.Handler p0) {}
    default public void setSrvccCallInfo(com.android.internal.telephony.SrvccConnection[] p0, android.os.Message p1) {}
    default public void updateImsRegistrationInfo(int p0, int p1, int p2, int p3, android.os.Message p4) {}
    default public void startImsTraffic(int p0, int p1, int p2, int p3, android.os.Message p4) {}
    default public void stopImsTraffic(int p0, android.os.Message p1) {}
    default public void triggerEpsFallback(int p0, android.os.Message p1) {}
    default public void sendAnbrQuery(int p0, int p1, int p2, android.os.Message p3) {}
    default public void setNullCipherAndIntegrityEnabled(boolean p0, android.os.Message p1) {}
    default public void isNullCipherAndIntegrityEnabled(android.os.Message p0) {}
    default public void updateImsCallStatus(java.util.List<com.android.internal.telephony.imsphone.ImsCallInfo> p0, android.os.Message p1) {}
    default public void setN1ModeEnabled(boolean p0, android.os.Message p1) {}
    default public void isN1ModeEnabled(android.os.Message p0) {}
    default public void getSatelliteCapabilities(android.os.Message p0) {}
    default public void setSatellitePower(android.os.Message p0, boolean p1) {}
    default public void getSatellitePowerState(android.os.Message p0) {}
    default public void getSatelliteProvisionState(android.os.Message p0) {}
    default public void isSatelliteSupported(android.os.Message p0) {}
    default public void provisionSatelliteService(android.os.Message p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int[] p4) {}
    default public void addAllowedSatelliteContacts(android.os.Message p0, java.lang.String[] p1) {}
    default public void removeAllowedSatelliteContacts(android.os.Message p0, java.lang.String[] p1) {}
    default public void sendSatelliteMessages(android.os.Message p0, java.lang.String[] p1, java.lang.String p2, double p3, double p4) {}
    default public void getPendingSatelliteMessages(android.os.Message p0) {}
    default public void getSatelliteMode(android.os.Message p0) {}
    default public void setSatelliteIndicationFilter(android.os.Message p0, int p1) {}
    default public void startSendingSatellitePointingInfo(android.os.Message p0) {}
    default public void stopSendingSatellitePointingInfo(android.os.Message p0) {}
    default public void getMaxCharactersPerSatelliteTextMessage(android.os.Message p0) {}
    default public void isSatelliteCommunicationAllowedForCurrentLocation(android.os.Message p0) {}
    default public void getTimeForNextSatelliteVisibility(android.os.Message p0) {}
    default public void registerForPendingSatelliteMessageCount(android.os.Handler p0, int p1, java.lang.Object p2) {}
    default public void unregisterForPendingSatelliteMessageCount(android.os.Handler p0) {}
    default public void registerForNewSatelliteMessages(android.os.Handler p0, int p1, java.lang.Object p2) {}
    default public void unregisterForNewSatelliteMessages(android.os.Handler p0) {}
    default public void registerForSatelliteMessagesTransferComplete(android.os.Handler p0, int p1, java.lang.Object p2) {}
    default public void unregisterForSatelliteMessagesTransferComplete(android.os.Handler p0) {}
    default public void registerForSatellitePointingInfoChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    default public void unregisterForSatellitePointingInfoChanged(android.os.Handler p0) {}
    default public void registerForSatelliteModeChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    default public void unregisterForSatelliteModeChanged(android.os.Handler p0) {}
    default public void registerForSatelliteRadioTechnologyChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    default public void unregisterForSatelliteRadioTechnologyChanged(android.os.Handler p0) {}
    default public void registerForSatelliteProvisionStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    default public void unregisterForSatelliteProvisionStateChanged(android.os.Handler p0) {}
}
