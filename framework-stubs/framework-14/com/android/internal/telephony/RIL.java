package com.android.internal.telephony;

public class RIL extends com.android.internal.telephony.BaseCommands implements com.android.internal.telephony.CommandsInterface {
    static final java.lang.String RILJ_LOG_TAG = "RILJ";
    static final java.lang.String RILJ_WAKELOCK_TAG = "*telephony-radio*";
    static final java.lang.String RILJ_ACK_WAKELOCK_NAME = "RILJ_ACK_WL";
    static final boolean RILJ_LOGD = true;
    static final boolean RILJ_LOGV = false;
    static final int RIL_HISTOGRAM_BUCKET_COUNT = 5;
    public static final int INVALID_WAKELOCK = -1;
    public static final int FOR_WAKELOCK = 0;
    public static final int FOR_ACK_WAKELOCK = 1;
    public static final com.android.internal.telephony.HalVersion RADIO_HAL_VERSION_UNSUPPORTED = null;
    public static final com.android.internal.telephony.HalVersion RADIO_HAL_VERSION_UNKNOWN = null;
    public static final com.android.internal.telephony.HalVersion RADIO_HAL_VERSION_1_0 = null;
    public static final com.android.internal.telephony.HalVersion RADIO_HAL_VERSION_1_1 = null;
    public static final com.android.internal.telephony.HalVersion RADIO_HAL_VERSION_1_2 = null;
    public static final com.android.internal.telephony.HalVersion RADIO_HAL_VERSION_1_3 = null;
    public static final com.android.internal.telephony.HalVersion RADIO_HAL_VERSION_1_4 = null;
    public static final com.android.internal.telephony.HalVersion RADIO_HAL_VERSION_1_5 = null;
    public static final com.android.internal.telephony.HalVersion RADIO_HAL_VERSION_1_6 = null;
    public static final com.android.internal.telephony.HalVersion RADIO_HAL_VERSION_2_0 = null;
    public static final com.android.internal.telephony.HalVersion RADIO_HAL_VERSION_2_1 = null;
    public final android.os.PowerManager.WakeLock mWakeLock = null;
    public final android.os.PowerManager.WakeLock mAckWakeLock = null;
    final int mWakeLockTimeout = 0;
    final int mAckWakeLockTimeout = 0;
    int mWakeLockCount;
    volatile int mWlSequenceNum;
    volatile int mAckWlSequenceNum;
    android.util.SparseArray<com.android.internal.telephony.RILRequest> mRequestList;
    static android.util.SparseArray<android.telephony.TelephonyHistogram> sRilTimeHistograms;
    java.lang.Object[] mLastNITZTimeInfo;
    int mLastRadioPowerResult;
    boolean mIsRadioProxyInitialized;
    java.util.concurrent.atomic.AtomicBoolean mTestingEmergencyCall;
    final java.lang.Integer mPhoneId = null;
    public static final int MIN_SERVICE_IDX = 0;
    public static final int MAX_SERVICE_IDX = 7;
    final com.android.internal.telephony.RIL.RilHandler mRilHandler = null;
    static final int EVENT_WAKE_LOCK_TIMEOUT = 2;
    static final int EVENT_ACK_WAKE_LOCK_TIMEOUT = 4;
    static final int EVENT_BLOCKING_RESPONSE_TIMEOUT = 5;
    static final int EVENT_RADIO_PROXY_DEAD = 6;
    static final int EVENT_AIDL_PROXY_DEAD = 7;
    static final java.lang.String[] HIDL_SERVICE_NAME = null;
    public static java.util.List<android.telephony.TelephonyHistogram> getTelephonyRILTimingHistograms() { return null; }
    public com.android.internal.telephony.RadioBugDetector getRadioBugDetector() { return null; }
    public boolean setModemService(java.lang.String p0) { return false; }
    public java.lang.String getModemService() { return null; }
    public void setCompatVersion(int p0, com.android.internal.telephony.HalVersion p1) {}
    public com.android.internal.telephony.HalVersion getCompatVersion(int p0) { return null; }
    public synchronized android.hardware.radio.V1_0.IRadio getRadioProxy(android.os.Message p0) { return null; }
    public <T extends com.android.internal.telephony.RadioServiceProxy> T getRadioServiceProxy(java.lang.Class<T> p0, android.os.Message p1) { return null; }
    public synchronized com.android.internal.telephony.RadioServiceProxy getRadioServiceProxy(int p0, android.os.Message p1) { return null; }
    public synchronized void onSlotActiveStatusChange(boolean p0) {}
    public RIL(android.content.Context p0, int p1, int p2) { super(null); }
    public RIL(android.content.Context p0, int p1, int p2, java.lang.Integer p3) { super(null); }
    public RIL(android.content.Context p0, int p1, int p2, java.lang.Integer p3, android.util.SparseArray<com.android.internal.telephony.RadioServiceProxy> p4) { super(null); }
    public void setOnNITZTime(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void getIccCardStatus(android.os.Message p0) {}
    public void getIccSlotsStatus(android.os.Message p0) {}
    public void setLogicalToPhysicalSlotMapping(int[] p0, android.os.Message p1) {}
    public void supplyIccPin(java.lang.String p0, android.os.Message p1) {}
    public void supplyIccPinForApp(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void supplyIccPuk(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void supplyIccPukForApp(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Message p3) {}
    public void supplyIccPin2(java.lang.String p0, android.os.Message p1) {}
    public void supplyIccPin2ForApp(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void supplyIccPuk2(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void supplyIccPuk2ForApp(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Message p3) {}
    public void changeIccPin(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void changeIccPinForApp(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Message p3) {}
    public void changeIccPin2(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void changeIccPin2ForApp(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Message p3) {}
    public void supplyNetworkDepersonalization(java.lang.String p0, android.os.Message p1) {}
    public void supplySimDepersonalization(com.android.internal.telephony.uicc.IccCardApplicationStatus.PersoSubState p0, java.lang.String p1, android.os.Message p2) {}
    public void getCurrentCalls(android.os.Message p0) {}
    public void dial(java.lang.String p0, boolean p1, android.telephony.emergency.EmergencyNumber p2, boolean p3, int p4, android.os.Message p5) {}
    public void enableModem(boolean p0, android.os.Message p1) {}
    public void setSystemSelectionChannels(java.util.List<android.telephony.RadioAccessSpecifier> p0, android.os.Message p1) {}
    public void getSystemSelectionChannels(android.os.Message p0) {}
    public void getModemStatus(android.os.Message p0) {}
    public void dial(java.lang.String p0, boolean p1, android.telephony.emergency.EmergencyNumber p2, boolean p3, int p4, com.android.internal.telephony.UUSInfo p5, android.os.Message p6) {}
    public void getIMSI(android.os.Message p0) {}
    public void getIMSIForApp(java.lang.String p0, android.os.Message p1) {}
    public void hangupConnection(int p0, android.os.Message p1) {}
    public void hangupWaitingOrBackground(android.os.Message p0) {}
    public void hangupForegroundResumeBackground(android.os.Message p0) {}
    public void switchWaitingOrHoldingAndActive(android.os.Message p0) {}
    public void conference(android.os.Message p0) {}
    public void rejectCall(android.os.Message p0) {}
    public void getLastCallFailCause(android.os.Message p0) {}
    public void getSignalStrength(android.os.Message p0) {}
    public void getVoiceRegistrationState(android.os.Message p0) {}
    public void getDataRegistrationState(android.os.Message p0) {}
    public void getOperator(android.os.Message p0) {}
    public void setRadioPower(boolean p0, boolean p1, boolean p2, android.os.Message p3) {}
    public void sendDtmf(char p0, android.os.Message p1) {}
    public void sendSMS(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public static long getOutgoingSmsMessageId(android.os.Message p0) { return 0L; }
    public void sendSMSExpectMore(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void setupDataCall(int p0, android.telephony.data.DataProfile p1, boolean p2, boolean p3, int p4, android.net.LinkProperties p5, int p6, android.telephony.data.NetworkSliceInfo p7, android.telephony.data.TrafficDescriptor p8, boolean p9, android.os.Message p10) {}
    public void iccIO(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, java.lang.String p6, java.lang.String p7, android.os.Message p8) {}
    public void iccIOForApp(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, android.os.Message p9) {}
    public void sendUSSD(java.lang.String p0, android.os.Message p1) {}
    public void cancelPendingUssd(android.os.Message p0) {}
    public void getCLIR(android.os.Message p0) {}
    public void setCLIR(int p0, android.os.Message p1) {}
    public void queryCallForwardStatus(int p0, int p1, java.lang.String p2, android.os.Message p3) {}
    public void setCallForward(int p0, int p1, int p2, java.lang.String p3, int p4, android.os.Message p5) {}
    public void queryCallWaiting(int p0, android.os.Message p1) {}
    public void setCallWaiting(boolean p0, int p1, android.os.Message p2) {}
    public void acknowledgeLastIncomingGsmSms(boolean p0, int p1, android.os.Message p2) {}
    public void acceptCall(android.os.Message p0) {}
    public void deactivateDataCall(int p0, int p1, android.os.Message p2) {}
    public void queryFacilityLock(java.lang.String p0, java.lang.String p1, int p2, android.os.Message p3) {}
    public void queryFacilityLockForApp(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, android.os.Message p4) {}
    public void setFacilityLock(java.lang.String p0, boolean p1, java.lang.String p2, int p3, android.os.Message p4) {}
    public void setFacilityLockForApp(java.lang.String p0, boolean p1, java.lang.String p2, int p3, java.lang.String p4, android.os.Message p5) {}
    public void changeBarringPassword(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Message p3) {}
    public void getNetworkSelectionMode(android.os.Message p0) {}
    public void setNetworkSelectionModeAutomatic(android.os.Message p0) {}
    public void setNetworkSelectionModeManual(java.lang.String p0, int p1, android.os.Message p2) {}
    public void getAvailableNetworks(android.os.Message p0) {}
    public void startNetworkScan(android.telephony.NetworkScanRequest p0, android.os.Message p1) {}
    public void stopNetworkScan(android.os.Message p0) {}
    public void startDtmf(char p0, android.os.Message p1) {}
    public void stopDtmf(android.os.Message p0) {}
    public void separateConnection(int p0, android.os.Message p1) {}
    public void getBasebandVersion(android.os.Message p0) {}
    public void setMute(boolean p0, android.os.Message p1) {}
    public void getMute(android.os.Message p0) {}
    public void queryCLIP(android.os.Message p0) {}
    @java.lang.Deprecated
    public void getPDPContextList(android.os.Message p0) {}
    public void getDataCallList(android.os.Message p0) {}
    public void invokeOemRilRequestRaw(byte[] p0, android.os.Message p1) {}
    public void invokeOemRilRequestStrings(java.lang.String[] p0, android.os.Message p1) {}
    public void setSuppServiceNotifications(boolean p0, android.os.Message p1) {}
    public void writeSmsToSim(int p0, java.lang.String p1, java.lang.String p2, android.os.Message p3) {}
    public void deleteSmsOnSim(int p0, android.os.Message p1) {}
    public void setBandMode(int p0, android.os.Message p1) {}
    public void queryAvailableBandMode(android.os.Message p0) {}
    public void sendEnvelope(java.lang.String p0, android.os.Message p1) {}
    public void sendTerminalResponse(java.lang.String p0, android.os.Message p1) {}
    public void sendEnvelopeWithStatus(java.lang.String p0, android.os.Message p1) {}
    public void explicitCallTransfer(android.os.Message p0) {}
    public void setPreferredNetworkType(int p0, android.os.Message p1) {}
    public void getPreferredNetworkType(android.os.Message p0) {}
    public void setAllowedNetworkTypesBitmap(int p0, android.os.Message p1) {}
    public void getAllowedNetworkTypesBitmap(android.os.Message p0) {}
    public void setLocationUpdates(boolean p0, android.os.WorkSource p1, android.os.Message p2) {}
    public void isNrDualConnectivityEnabled(android.os.Message p0, android.os.WorkSource p1) {}
    public void setNrDualConnectivityState(int p0, android.os.Message p1, android.os.WorkSource p2) {}
    public void isVoNrEnabled(android.os.Message p0, android.os.WorkSource p1) {}
    public void setVoNrEnabled(boolean p0, android.os.Message p1, android.os.WorkSource p2) {}
    public void setCdmaSubscriptionSource(int p0, android.os.Message p1) {}
    public void queryCdmaRoamingPreference(android.os.Message p0) {}
    public void setCdmaRoamingPreference(int p0, android.os.Message p1) {}
    public void queryTTYMode(android.os.Message p0) {}
    public void setTTYMode(int p0, android.os.Message p1) {}
    public void setPreferredVoicePrivacy(boolean p0, android.os.Message p1) {}
    public void getPreferredVoicePrivacy(android.os.Message p0) {}
    public void sendCDMAFeatureCode(java.lang.String p0, android.os.Message p1) {}
    public void sendBurstDtmf(java.lang.String p0, int p1, int p2, android.os.Message p3) {}
    public void sendCdmaSMSExpectMore(byte[] p0, android.os.Message p1) {}
    public void sendCdmaSms(byte[] p0, android.os.Message p1) {}
    public void acknowledgeLastIncomingCdmaSms(boolean p0, int p1, android.os.Message p2) {}
    public void getGsmBroadcastConfig(android.os.Message p0) {}
    public void setGsmBroadcastConfig(com.android.internal.telephony.gsm.SmsBroadcastConfigInfo[] p0, android.os.Message p1) {}
    public void setGsmBroadcastActivation(boolean p0, android.os.Message p1) {}
    public void getCdmaBroadcastConfig(android.os.Message p0) {}
    public void setCdmaBroadcastConfig(com.android.internal.telephony.cdma.CdmaSmsBroadcastConfigInfo[] p0, android.os.Message p1) {}
    public void setCdmaBroadcastActivation(boolean p0, android.os.Message p1) {}
    public void getCDMASubscription(android.os.Message p0) {}
    public void writeSmsToRuim(int p0, byte[] p1, android.os.Message p2) {}
    public void deleteSmsOnRuim(int p0, android.os.Message p1) {}
    public void getDeviceIdentity(android.os.Message p0) {}
    public void getImei(android.os.Message p0) {}
    public void exitEmergencyCallbackMode(android.os.Message p0) {}
    public void getSmscAddress(android.os.Message p0) {}
    public void setSmscAddress(java.lang.String p0, android.os.Message p1) {}
    public void reportSmsMemoryStatus(boolean p0, android.os.Message p1) {}
    public void reportStkServiceIsRunning(android.os.Message p0) {}
    public void getCdmaSubscriptionSource(android.os.Message p0) {}
    public void acknowledgeIncomingGsmSmsWithPdu(boolean p0, java.lang.String p1, android.os.Message p2) {}
    public void getVoiceRadioTechnology(android.os.Message p0) {}
    public void getCellInfoList(android.os.Message p0, android.os.WorkSource p1) {}
    public void setCellInfoListRate(int p0, android.os.Message p1, android.os.WorkSource p2) {}
    public void setInitialAttachApn(android.telephony.data.DataProfile p0, boolean p1, android.os.Message p2) {}
    public void getImsRegistrationState(android.os.Message p0) {}
    public void sendImsGsmSms(java.lang.String p0, java.lang.String p1, int p2, int p3, android.os.Message p4) {}
    public void sendImsCdmaSms(byte[] p0, int p1, int p2, android.os.Message p3) {}
    public void iccTransmitApduBasicChannel(int p0, int p1, int p2, int p3, int p4, java.lang.String p5, android.os.Message p6) {}
    public void iccOpenLogicalChannel(java.lang.String p0, int p1, android.os.Message p2) {}
    public void iccCloseLogicalChannel(int p0, boolean p1, android.os.Message p2) {}
    public void iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6, boolean p7, android.os.Message p8) {}
    public void nvReadItem(int p0, android.os.Message p1, android.os.WorkSource p2) {}
    public void nvWriteItem(int p0, java.lang.String p1, android.os.Message p2, android.os.WorkSource p3) {}
    public void nvWriteCdmaPrl(byte[] p0, android.os.Message p1) {}
    public void nvResetConfig(int p0, android.os.Message p1) {}
    public void setUiccSubscription(int p0, int p1, int p2, int p3, android.os.Message p4) {}
    public boolean supportsEid() { return false; }
    public void setDataAllowed(boolean p0, android.os.Message p1) {}
    public void getHardwareConfig(android.os.Message p0) {}
    public void requestIccSimAuthentication(int p0, java.lang.String p1, java.lang.String p2, android.os.Message p3) {}
    public void setDataProfile(android.telephony.data.DataProfile[] p0, boolean p1, android.os.Message p2) {}
    public void requestShutdown(android.os.Message p0) {}
    public void getRadioCapability(android.os.Message p0) {}
    public void setRadioCapability(com.android.internal.telephony.RadioCapability p0, android.os.Message p1) {}
    public void startLceService(int p0, boolean p1, android.os.Message p2) {}
    public void stopLceService(android.os.Message p0) {}
    public void setDataThrottling(android.os.Message p0, android.os.WorkSource p1, int p2, long p3) {}
    @java.lang.Deprecated
    public void pullLceData(android.os.Message p0) {}
    public void getModemActivityInfo(android.os.Message p0, android.os.WorkSource p1) {}
    public void setAllowedCarriers(android.telephony.CarrierRestrictionRules p0, android.os.Message p1, android.os.WorkSource p2) {}
    public void getAllowedCarriers(android.os.Message p0, android.os.WorkSource p1) {}
    public void sendDeviceState(int p0, boolean p1, android.os.Message p2) {}
    public void setUnsolResponseFilter(int p0, android.os.Message p1) {}
    public void setSignalStrengthReportingCriteria(java.util.List<android.telephony.SignalThresholdInfo> p0, android.os.Message p1) {}
    public void setLinkCapacityReportingCriteria(int p0, int p1, int p2, int[] p3, int[] p4, int p5, android.os.Message p6) {}
    public void setSimCardPower(int p0, android.os.Message p1, android.os.WorkSource p2) {}
    public void setCarrierInfoForImsiEncryption(android.telephony.ImsiEncryptionInfo p0, android.os.Message p1) {}
    public void startNattKeepalive(int p0, android.net.KeepalivePacketData p1, int p2, android.os.Message p3) {}
    public void stopNattKeepalive(int p0, android.os.Message p1) {}
    public void getIMEI(android.os.Message p0) {}
    public void getIMEISV(android.os.Message p0) {}
    @java.lang.Deprecated
    public void getLastPdpFailCause(android.os.Message p0) {}
    public void getLastDataCallFailCause(android.os.Message p0) {}
    public void enableUiccApplications(boolean p0, android.os.Message p1) {}
    public void areUiccApplicationsEnabled(android.os.Message p0) {}
    public boolean canToggleUiccApplicationsEnablement() { return false; }
    public void resetRadio(android.os.Message p0) {}
    public void handleCallSetupRequestFromSim(boolean p0, android.os.Message p1) {}
    public void getBarringInfo(android.os.Message p0) {}
    public void allocatePduSessionId(android.os.Message p0) {}
    public void releasePduSessionId(android.os.Message p0, int p1) {}
    public void startHandover(android.os.Message p0, int p1) {}
    public void cancelHandover(android.os.Message p0, int p1) {}
    public void getSlicingConfig(android.os.Message p0) {}
    public void getSimPhonebookRecords(android.os.Message p0) {}
    public void getSimPhonebookCapacity(android.os.Message p0) {}
    public void updateSimPhonebookRecord(com.android.internal.telephony.uicc.SimPhonebookRecord p0, android.os.Message p1) {}
    public void setUsageSetting(android.os.Message p0, int p1) {}
    public void getUsageSetting(android.os.Message p0) {}
    public void setSrvccCallInfo(com.android.internal.telephony.SrvccConnection[] p0, android.os.Message p1) {}
    public void updateImsRegistrationInfo(int p0, int p1, int p2, int p3, android.os.Message p4) {}
    public void startImsTraffic(int p0, int p1, int p2, int p3, android.os.Message p4) {}
    public void stopImsTraffic(int p0, android.os.Message p1) {}
    public void triggerEpsFallback(int p0, android.os.Message p1) {}
    public void sendAnbrQuery(int p0, int p1, int p2, android.os.Message p3) {}
    public void setEmergencyMode(int p0, android.os.Message p1) {}
    public void triggerEmergencyNetworkScan(int[] p0, int p1, android.os.Message p2) {}
    public void cancelEmergencyNetworkScan(boolean p0, android.os.Message p1) {}
    public void exitEmergencyMode(android.os.Message p0) {}
    public void setNullCipherAndIntegrityEnabled(boolean p0, android.os.Message p1) {}
    public void isNullCipherAndIntegrityEnabled(android.os.Message p0) {}
    public void updateImsCallStatus(java.util.List<com.android.internal.telephony.imsphone.ImsCallInfo> p0, android.os.Message p1) {}
    public void setN1ModeEnabled(boolean p0, android.os.Message p1) {}
    public void isN1ModeEnabled(android.os.Message p0) {}
    public void getSatelliteCapabilities(android.os.Message p0) {}
    public void setSatellitePower(android.os.Message p0, boolean p1) {}
    public void getSatellitePowerState(android.os.Message p0) {}
    public void getSatelliteProvisionState(android.os.Message p0) {}
    public void provisionSatelliteService(android.os.Message p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int[] p4) {}
    public void addAllowedSatelliteContacts(android.os.Message p0, java.lang.String[] p1) {}
    public void removeAllowedSatelliteContacts(android.os.Message p0, java.lang.String[] p1) {}
    public void sendSatelliteMessages(android.os.Message p0, java.lang.String[] p1, java.lang.String p2, double p3, double p4) {}
    public void getPendingSatelliteMessages(android.os.Message p0) {}
    public void getSatelliteMode(android.os.Message p0) {}
    public void setSatelliteIndicationFilter(android.os.Message p0, int p1) {}
    public void isSatelliteSupported(android.os.Message p0) {}
    public void startSendingSatellitePointingInfo(android.os.Message p0) {}
    public void stopSendingSatellitePointingInfo(android.os.Message p0) {}
    public void getMaxCharactersPerSatelliteTextMessage(android.os.Message p0) {}
    public void isSatelliteCommunicationAllowedForCurrentLocation(android.os.Message p0) {}
    public void getTimeForNextSatelliteVisibility(android.os.Message p0) {}
    void processIndication(int p0, int p1) {}
    void processRequestAck(int p0) {}
    public com.android.internal.telephony.RILRequest processResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) { return null; }
    public com.android.internal.telephony.RILRequest processResponse_1_6(android.hardware.radio.V1_6.RadioResponseInfo p0) { return null; }
    public com.android.internal.telephony.RILRequest processResponse(int p0, android.hardware.radio.RadioResponseInfo p1) { return null; }
    public void processResponseDone(com.android.internal.telephony.RILRequest p0, android.hardware.radio.V1_0.RadioResponseInfo p1, java.lang.Object p2) {}
    public void processResponseDone_1_6(com.android.internal.telephony.RILRequest p0, android.hardware.radio.V1_6.RadioResponseInfo p1, java.lang.Object p2) {}
    public void processResponseDone(com.android.internal.telephony.RILRequest p0, android.hardware.radio.RadioResponseInfo p1, java.lang.Object p2) {}
    public void processResponseFallback(com.android.internal.telephony.RILRequest p0, android.hardware.radio.V1_0.RadioResponseInfo p1, java.lang.Object p2) {}
    public android.os.PowerManager.WakeLock getWakeLock(int p0) { return null; }
    public com.android.internal.telephony.RIL.RilHandler getRilHandler() { return null; }
    public android.util.SparseArray<com.android.internal.telephony.RILRequest> getRilRequestList() { return null; }
    com.android.internal.telephony.RadioCapability makeStaticRadioCapability() { return null; }
    static java.lang.String retToString(int p0, java.lang.Object p1) { return null; }
    void writeMetricsCallRing(char[] p0) {}
    void writeMetricsSrvcc(int p0) {}
    void writeMetricsModemRestartEvent(java.lang.String p0) {}
    void notifyRegistrantsRilConnectionChanged(int p0) {}
    void notifyRegistrantsCdmaInfoRec(com.android.internal.telephony.cdma.CdmaInformationRecords p0) {}
    void riljLog(java.lang.String p0) {}
    void riljLoge(java.lang.String p0) {}
    void riljLogv(java.lang.String p0) {}
    boolean isLogOrTrace() { return false; }
    boolean isLogvOrTrace() { return false; }
    void unsljLog(int p0) {}
    void unsljLogMore(int p0, java.lang.String p1) {}
    void unsljLogRet(int p0, java.lang.Object p1) {}
    void unsljLogvRet(int p0, java.lang.Object p1) {}
    public void setPhoneType(int p0) {}
    public void testingEmergencyCall() {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public java.util.List<android.telephony.ClientRequestStats> getClientRequestStats() { return null; }
    public android.telephony.SignalStrength fixupSignalStrength10(android.telephony.SignalStrength p0) { return null; }
    void notifyBarringInfoChanged(android.telephony.BarringInfo p0) {}
    public com.android.internal.telephony.HalVersion getHalVersion(int p0) { return null; }
    public static com.android.internal.telephony.HalVersion getServiceHalVersion(int p0) { return null; }

    private final class BinderServiceDeathRecipient implements android.os.IBinder.DeathRecipient {
        BinderServiceDeathRecipient(com.android.internal.telephony.RIL p0, int p1) {}
        public void linkToDeath(android.os.IBinder p0) throws android.os.RemoteException {}
        public synchronized void unlinkToDeath() {}
        public void binderDied() {}
    }

    final class RadioProxyDeathRecipient implements android.os.IHwBinder.DeathRecipient {
        RadioProxyDeathRecipient(com.android.internal.telephony.RIL p0) {}
        public void serviceDied(long p0) {}
    }

    public class RilHandler extends android.os.Handler {
        public RilHandler(com.android.internal.telephony.RIL p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
