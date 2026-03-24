package com.android.internal.telephony.imsphone;

class ImsPhoneCommandInterface extends com.android.internal.telephony.BaseCommands implements com.android.internal.telephony.CommandsInterface {
    ImsPhoneCommandInterface(android.content.Context p0) { super(null); }
    public void setOnNITZTime(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void getIccCardStatus(android.os.Message p0) {}
    public void getIccSlotsStatus(android.os.Message p0) {}
    public void setLogicalToPhysicalSlotMapping(int[] p0, android.os.Message p1) {}
    public void supplyIccPin(java.lang.String p0, android.os.Message p1) {}
    public void supplyIccPuk(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void supplyIccPin2(java.lang.String p0, android.os.Message p1) {}
    public void supplyIccPuk2(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void changeIccPin(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void changeIccPin2(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void changeBarringPassword(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Message p3) {}
    public void supplyNetworkDepersonalization(java.lang.String p0, android.os.Message p1) {}
    public void supplySimDepersonalization(com.android.internal.telephony.uicc.IccCardApplicationStatus.PersoSubState p0, java.lang.String p1, android.os.Message p2) {}
    public void getCurrentCalls(android.os.Message p0) {}
    @java.lang.Deprecated
    public void getPDPContextList(android.os.Message p0) {}
    public void getDataCallList(android.os.Message p0) {}
    public void dial(java.lang.String p0, boolean p1, android.telephony.emergency.EmergencyNumber p2, boolean p3, int p4, android.os.Message p5) {}
    public void dial(java.lang.String p0, boolean p1, android.telephony.emergency.EmergencyNumber p2, boolean p3, int p4, com.android.internal.telephony.UUSInfo p5, android.os.Message p6) {}
    public void getIMSI(android.os.Message p0) {}
    public void getIMSIForApp(java.lang.String p0, android.os.Message p1) {}
    public void getIMEI(android.os.Message p0) {}
    public void getIMEISV(android.os.Message p0) {}
    public void hangupConnection(int p0, android.os.Message p1) {}
    public void hangupWaitingOrBackground(android.os.Message p0) {}
    public void hangupForegroundResumeBackground(android.os.Message p0) {}
    public void switchWaitingOrHoldingAndActive(android.os.Message p0) {}
    public void conference(android.os.Message p0) {}
    public void setPreferredVoicePrivacy(boolean p0, android.os.Message p1) {}
    public void getPreferredVoicePrivacy(android.os.Message p0) {}
    public void separateConnection(int p0, android.os.Message p1) {}
    public void acceptCall(android.os.Message p0) {}
    public void rejectCall(android.os.Message p0) {}
    public void explicitCallTransfer(android.os.Message p0) {}
    public void getLastCallFailCause(android.os.Message p0) {}
    @java.lang.Deprecated
    public void getLastPdpFailCause(android.os.Message p0) {}
    public void getLastDataCallFailCause(android.os.Message p0) {}
    public void setMute(boolean p0, android.os.Message p1) {}
    public void getMute(android.os.Message p0) {}
    public void getSignalStrength(android.os.Message p0) {}
    public void getVoiceRegistrationState(android.os.Message p0) {}
    public void getDataRegistrationState(android.os.Message p0) {}
    public void getOperator(android.os.Message p0) {}
    public void sendDtmf(char p0, android.os.Message p1) {}
    public void startDtmf(char p0, android.os.Message p1) {}
    public void stopDtmf(android.os.Message p0) {}
    public void sendBurstDtmf(java.lang.String p0, int p1, int p2, android.os.Message p3) {}
    public void sendSMS(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void sendSMSExpectMore(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void sendCdmaSms(byte[] p0, android.os.Message p1) {}
    public void sendCdmaSMSExpectMore(byte[] p0, android.os.Message p1) {}
    public void sendImsGsmSms(java.lang.String p0, java.lang.String p1, int p2, int p3, android.os.Message p4) {}
    public void sendImsCdmaSms(byte[] p0, int p1, int p2, android.os.Message p3) {}
    public void getImsRegistrationState(android.os.Message p0) {}
    public void deleteSmsOnSim(int p0, android.os.Message p1) {}
    public void deleteSmsOnRuim(int p0, android.os.Message p1) {}
    public void writeSmsToSim(int p0, java.lang.String p1, java.lang.String p2, android.os.Message p3) {}
    public void writeSmsToRuim(int p0, byte[] p1, android.os.Message p2) {}
    public void setupDataCall(int p0, android.telephony.data.DataProfile p1, boolean p2, boolean p3, int p4, android.net.LinkProperties p5, int p6, android.telephony.data.NetworkSliceInfo p7, android.telephony.data.TrafficDescriptor p8, boolean p9, android.os.Message p10) {}
    public void deactivateDataCall(int p0, int p1, android.os.Message p2) {}
    public void setRadioPower(boolean p0, android.os.Message p1) {}
    public void setSuppServiceNotifications(boolean p0, android.os.Message p1) {}
    public void acknowledgeLastIncomingGsmSms(boolean p0, int p1, android.os.Message p2) {}
    public void acknowledgeLastIncomingCdmaSms(boolean p0, int p1, android.os.Message p2) {}
    public void acknowledgeIncomingGsmSmsWithPdu(boolean p0, java.lang.String p1, android.os.Message p2) {}
    public void iccIO(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, java.lang.String p6, java.lang.String p7, android.os.Message p8) {}
    public void iccIOForApp(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, android.os.Message p9) {}
    public void getCLIR(android.os.Message p0) {}
    public void setCLIR(int p0, android.os.Message p1) {}
    public void queryCallWaiting(int p0, android.os.Message p1) {}
    public void setCallWaiting(boolean p0, int p1, android.os.Message p2) {}
    public void setNetworkSelectionModeAutomatic(android.os.Message p0) {}
    public void setNetworkSelectionModeManual(java.lang.String p0, int p1, android.os.Message p2) {}
    public void getNetworkSelectionMode(android.os.Message p0) {}
    public void getAvailableNetworks(android.os.Message p0) {}
    public void startNetworkScan(android.telephony.NetworkScanRequest p0, android.os.Message p1) {}
    public void stopNetworkScan(android.os.Message p0) {}
    public void setCallForward(int p0, int p1, int p2, java.lang.String p3, int p4, android.os.Message p5) {}
    public void queryCallForwardStatus(int p0, int p1, java.lang.String p2, android.os.Message p3) {}
    public void queryCLIP(android.os.Message p0) {}
    public void getBasebandVersion(android.os.Message p0) {}
    public void queryFacilityLock(java.lang.String p0, java.lang.String p1, int p2, android.os.Message p3) {}
    public void queryFacilityLockForApp(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, android.os.Message p4) {}
    public void setFacilityLock(java.lang.String p0, boolean p1, java.lang.String p2, int p3, android.os.Message p4) {}
    public void setFacilityLockForApp(java.lang.String p0, boolean p1, java.lang.String p2, int p3, java.lang.String p4, android.os.Message p5) {}
    public void sendUSSD(java.lang.String p0, android.os.Message p1) {}
    public void cancelPendingUssd(android.os.Message p0) {}
    public void resetRadio(android.os.Message p0) {}
    public void invokeOemRilRequestRaw(byte[] p0, android.os.Message p1) {}
    public void invokeOemRilRequestStrings(java.lang.String[] p0, android.os.Message p1) {}
    public void setBandMode(int p0, android.os.Message p1) {}
    public void queryAvailableBandMode(android.os.Message p0) {}
    public void sendTerminalResponse(java.lang.String p0, android.os.Message p1) {}
    public void sendEnvelope(java.lang.String p0, android.os.Message p1) {}
    public void sendEnvelopeWithStatus(java.lang.String p0, android.os.Message p1) {}
    public void handleCallSetupRequestFromSim(boolean p0, android.os.Message p1) {}
    public void setPreferredNetworkType(int p0, android.os.Message p1) {}
    public void getPreferredNetworkType(android.os.Message p0) {}
    public void setAllowedNetworkTypesBitmap(int p0, android.os.Message p1) {}
    public void getAllowedNetworkTypesBitmap(android.os.Message p0) {}
    public void setLocationUpdates(boolean p0, android.os.Message p1) {}
    public void getSmscAddress(android.os.Message p0) {}
    public void setSmscAddress(java.lang.String p0, android.os.Message p1) {}
    public void reportSmsMemoryStatus(boolean p0, android.os.Message p1) {}
    public void reportStkServiceIsRunning(android.os.Message p0) {}
    public void getCdmaSubscriptionSource(android.os.Message p0) {}
    public void getGsmBroadcastConfig(android.os.Message p0) {}
    public void setGsmBroadcastConfig(com.android.internal.telephony.gsm.SmsBroadcastConfigInfo[] p0, android.os.Message p1) {}
    public void setGsmBroadcastActivation(boolean p0, android.os.Message p1) {}
    public void getDeviceIdentity(android.os.Message p0) {}
    public void getImei(android.os.Message p0) {}
    public void getCDMASubscription(android.os.Message p0) {}
    public void setPhoneType(int p0) {}
    public void queryCdmaRoamingPreference(android.os.Message p0) {}
    public void setCdmaRoamingPreference(int p0, android.os.Message p1) {}
    public void setCdmaSubscriptionSource(int p0, android.os.Message p1) {}
    public void queryTTYMode(android.os.Message p0) {}
    public void setTTYMode(int p0, android.os.Message p1) {}
    public void sendCDMAFeatureCode(java.lang.String p0, android.os.Message p1) {}
    public void getCdmaBroadcastConfig(android.os.Message p0) {}
    public void setCdmaBroadcastConfig(com.android.internal.telephony.cdma.CdmaSmsBroadcastConfigInfo[] p0, android.os.Message p1) {}
    public void setCdmaBroadcastActivation(boolean p0, android.os.Message p1) {}
    public void exitEmergencyCallbackMode(android.os.Message p0) {}
    public void supplyIccPinForApp(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void supplyIccPukForApp(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Message p3) {}
    public void supplyIccPin2ForApp(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void supplyIccPuk2ForApp(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Message p3) {}
    public void changeIccPinForApp(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Message p3) {}
    public void changeIccPin2ForApp(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Message p3) {}
    public void requestIccSimAuthentication(int p0, java.lang.String p1, java.lang.String p2, android.os.Message p3) {}
    public void getVoiceRadioTechnology(android.os.Message p0) {}
    public void setInitialAttachApn(android.telephony.data.DataProfile p0, boolean p1, android.os.Message p2) {}
    public void setDataProfile(android.telephony.data.DataProfile[] p0, boolean p1, android.os.Message p2) {}
    public void iccOpenLogicalChannel(java.lang.String p0, int p1, android.os.Message p2) {}
    public void iccCloseLogicalChannel(int p0, boolean p1, android.os.Message p2) {}
    public void iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6, boolean p7, android.os.Message p8) {}
    public void iccTransmitApduBasicChannel(int p0, int p1, int p2, int p3, int p4, java.lang.String p5, android.os.Message p6) {}
    public void nvWriteCdmaPrl(byte[] p0, android.os.Message p1) {}
    public void nvResetConfig(int p0, android.os.Message p1) {}
    public void getHardwareConfig(android.os.Message p0) {}
    public void requestShutdown(android.os.Message p0) {}
    public void setRadioCapability(com.android.internal.telephony.RadioCapability p0, android.os.Message p1) {}
    public void getRadioCapability(android.os.Message p0) {}
    public void startLceService(int p0, boolean p1, android.os.Message p2) {}
    public void stopLceService(android.os.Message p0) {}
    public void pullLceData(android.os.Message p0) {}
    public void setCarrierInfoForImsiEncryption(android.telephony.ImsiEncryptionInfo p0, android.os.Message p1) {}
    public void sendDeviceState(int p0, boolean p1, android.os.Message p2) {}
    public void setUnsolResponseFilter(int p0, android.os.Message p1) {}
    public void setSignalStrengthReportingCriteria(java.util.List<android.telephony.SignalThresholdInfo> p0, android.os.Message p1) {}
    public void setLinkCapacityReportingCriteria(int p0, int p1, int p2, int[] p3, int[] p4, int p5, android.os.Message p6) {}
    public void startNattKeepalive(int p0, android.net.KeepalivePacketData p1, int p2, android.os.Message p3) {}
    public void stopNattKeepalive(int p0, android.os.Message p1) {}
    public void allocatePduSessionId(android.os.Message p0) {}
    public void releasePduSessionId(android.os.Message p0, int p1) {}
    public void startHandover(android.os.Message p0, int p1) {}
    public void cancelHandover(android.os.Message p0, int p1) {}
}
