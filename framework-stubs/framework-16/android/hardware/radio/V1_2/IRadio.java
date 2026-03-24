package android.hardware.radio.V1_2;

public interface IRadio extends android.hardware.radio.V1_1.IRadio {
    public static final java.lang.String kInterfaceName = "android.hardware.radio@1.2::IRadio";
    public static android.hardware.radio.V1_2.IRadio asInterface(android.os.IHwBinder p0) { return null; }
    public static android.hardware.radio.V1_2.IRadio castFrom(android.os.IHwInterface p0) { return null; }
    public android.os.IHwBinder asBinder();
    public static android.hardware.radio.V1_2.IRadio getService(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
    public static android.hardware.radio.V1_2.IRadio getService(boolean p0) throws android.os.RemoteException { return null; }
    @java.lang.Deprecated
    public static android.hardware.radio.V1_2.IRadio getService(java.lang.String p0) throws android.os.RemoteException { return null; }
    @java.lang.Deprecated
    public static android.hardware.radio.V1_2.IRadio getService() throws android.os.RemoteException { return null; }
    public void startNetworkScan_1_2(int p0, android.hardware.radio.V1_2.NetworkScanRequest p1) throws android.os.RemoteException;
    public void setIndicationFilter_1_2(int p0, int p1) throws android.os.RemoteException;
    public void setSignalStrengthReportingCriteria(int p0, int p1, int p2, java.util.ArrayList<java.lang.Integer> p3, int p4) throws android.os.RemoteException;
    public void setLinkCapacityReportingCriteria(int p0, int p1, int p2, int p3, java.util.ArrayList<java.lang.Integer> p4, java.util.ArrayList<java.lang.Integer> p5, int p6) throws android.os.RemoteException;
    public void setupDataCall_1_2(int p0, int p1, android.hardware.radio.V1_0.DataProfileInfo p2, boolean p3, boolean p4, boolean p5, int p6, java.util.ArrayList<java.lang.String> p7, java.util.ArrayList<java.lang.String> p8) throws android.os.RemoteException;
    public void deactivateDataCall_1_2(int p0, int p1, int p2) throws android.os.RemoteException;
    public java.util.ArrayList<java.lang.String> interfaceChain() throws android.os.RemoteException;
    public void debug(android.os.NativeHandle p0, java.util.ArrayList<java.lang.String> p1) throws android.os.RemoteException;
    public java.lang.String interfaceDescriptor() throws android.os.RemoteException;
    public java.util.ArrayList<byte[]> getHashChain() throws android.os.RemoteException;
    public void setHALInstrumentation() throws android.os.RemoteException;
    public boolean linkToDeath(android.os.IHwBinder.DeathRecipient p0, long p1) throws android.os.RemoteException;
    public void ping() throws android.os.RemoteException;
    public android.internal.hidl.base.V1_0.DebugInfo getDebugInfo() throws android.os.RemoteException;
    public void notifySyspropsChanged() throws android.os.RemoteException;
    public boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient p0) throws android.os.RemoteException;

    public static final class Proxy implements android.hardware.radio.V1_2.IRadio {
        public Proxy(android.os.IHwBinder p0) {}
        public android.os.IHwBinder asBinder() { return null; }
        public java.lang.String toString() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public void setResponseFunctions(android.hardware.radio.V1_0.IRadioResponse p0, android.hardware.radio.V1_0.IRadioIndication p1) throws android.os.RemoteException {}
        public void getIccCardStatus(int p0) throws android.os.RemoteException {}
        public void supplyIccPinForApp(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void supplyIccPukForApp(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void supplyIccPin2ForApp(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void supplyIccPuk2ForApp(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void changeIccPinForApp(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void changeIccPin2ForApp(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void supplyNetworkDepersonalization(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void getCurrentCalls(int p0) throws android.os.RemoteException {}
        public void dial(int p0, android.hardware.radio.V1_0.Dial p1) throws android.os.RemoteException {}
        public void getImsiForApp(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void hangup(int p0, int p1) throws android.os.RemoteException {}
        public void hangupWaitingOrBackground(int p0) throws android.os.RemoteException {}
        public void hangupForegroundResumeBackground(int p0) throws android.os.RemoteException {}
        public void switchWaitingOrHoldingAndActive(int p0) throws android.os.RemoteException {}
        public void conference(int p0) throws android.os.RemoteException {}
        public void rejectCall(int p0) throws android.os.RemoteException {}
        public void getLastCallFailCause(int p0) throws android.os.RemoteException {}
        public void getSignalStrength(int p0) throws android.os.RemoteException {}
        public void getVoiceRegistrationState(int p0) throws android.os.RemoteException {}
        public void getDataRegistrationState(int p0) throws android.os.RemoteException {}
        public void getOperator(int p0) throws android.os.RemoteException {}
        public void setRadioPower(int p0, boolean p1) throws android.os.RemoteException {}
        public void sendDtmf(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void sendSms(int p0, android.hardware.radio.V1_0.GsmSmsMessage p1) throws android.os.RemoteException {}
        public void sendSMSExpectMore(int p0, android.hardware.radio.V1_0.GsmSmsMessage p1) throws android.os.RemoteException {}
        public void setupDataCall(int p0, int p1, android.hardware.radio.V1_0.DataProfileInfo p2, boolean p3, boolean p4, boolean p5) throws android.os.RemoteException {}
        public void iccIOForApp(int p0, android.hardware.radio.V1_0.IccIo p1) throws android.os.RemoteException {}
        public void sendUssd(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void cancelPendingUssd(int p0) throws android.os.RemoteException {}
        public void getClir(int p0) throws android.os.RemoteException {}
        public void setClir(int p0, int p1) throws android.os.RemoteException {}
        public void getCallForwardStatus(int p0, android.hardware.radio.V1_0.CallForwardInfo p1) throws android.os.RemoteException {}
        public void setCallForward(int p0, android.hardware.radio.V1_0.CallForwardInfo p1) throws android.os.RemoteException {}
        public void getCallWaiting(int p0, int p1) throws android.os.RemoteException {}
        public void setCallWaiting(int p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void acknowledgeLastIncomingGsmSms(int p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void acceptCall(int p0) throws android.os.RemoteException {}
        public void deactivateDataCall(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void getFacilityLockForApp(int p0, java.lang.String p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException {}
        public void setFacilityLockForApp(int p0, java.lang.String p1, boolean p2, java.lang.String p3, int p4, java.lang.String p5) throws android.os.RemoteException {}
        public void setBarringPassword(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void getNetworkSelectionMode(int p0) throws android.os.RemoteException {}
        public void setNetworkSelectionModeAutomatic(int p0) throws android.os.RemoteException {}
        public void setNetworkSelectionModeManual(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void getAvailableNetworks(int p0) throws android.os.RemoteException {}
        public void startDtmf(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void stopDtmf(int p0) throws android.os.RemoteException {}
        public void getBasebandVersion(int p0) throws android.os.RemoteException {}
        public void separateConnection(int p0, int p1) throws android.os.RemoteException {}
        public void setMute(int p0, boolean p1) throws android.os.RemoteException {}
        public void getMute(int p0) throws android.os.RemoteException {}
        public void getClip(int p0) throws android.os.RemoteException {}
        public void getDataCallList(int p0) throws android.os.RemoteException {}
        public void setSuppServiceNotifications(int p0, boolean p1) throws android.os.RemoteException {}
        public void writeSmsToSim(int p0, android.hardware.radio.V1_0.SmsWriteArgs p1) throws android.os.RemoteException {}
        public void deleteSmsOnSim(int p0, int p1) throws android.os.RemoteException {}
        public void setBandMode(int p0, int p1) throws android.os.RemoteException {}
        public void getAvailableBandModes(int p0) throws android.os.RemoteException {}
        public void sendEnvelope(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void sendTerminalResponseToSim(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void handleStkCallSetupRequestFromSim(int p0, boolean p1) throws android.os.RemoteException {}
        public void explicitCallTransfer(int p0) throws android.os.RemoteException {}
        public void setPreferredNetworkType(int p0, int p1) throws android.os.RemoteException {}
        public void getPreferredNetworkType(int p0) throws android.os.RemoteException {}
        public void getNeighboringCids(int p0) throws android.os.RemoteException {}
        public void setLocationUpdates(int p0, boolean p1) throws android.os.RemoteException {}
        public void setCdmaSubscriptionSource(int p0, int p1) throws android.os.RemoteException {}
        public void setCdmaRoamingPreference(int p0, int p1) throws android.os.RemoteException {}
        public void getCdmaRoamingPreference(int p0) throws android.os.RemoteException {}
        public void setTTYMode(int p0, int p1) throws android.os.RemoteException {}
        public void getTTYMode(int p0) throws android.os.RemoteException {}
        public void setPreferredVoicePrivacy(int p0, boolean p1) throws android.os.RemoteException {}
        public void getPreferredVoicePrivacy(int p0) throws android.os.RemoteException {}
        public void sendCDMAFeatureCode(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void sendBurstDtmf(int p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
        public void sendCdmaSms(int p0, android.hardware.radio.V1_0.CdmaSmsMessage p1) throws android.os.RemoteException {}
        public void acknowledgeLastIncomingCdmaSms(int p0, android.hardware.radio.V1_0.CdmaSmsAck p1) throws android.os.RemoteException {}
        public void getGsmBroadcastConfig(int p0) throws android.os.RemoteException {}
        public void setGsmBroadcastConfig(int p0, java.util.ArrayList<android.hardware.radio.V1_0.GsmBroadcastSmsConfigInfo> p1) throws android.os.RemoteException {}
        public void setGsmBroadcastActivation(int p0, boolean p1) throws android.os.RemoteException {}
        public void getCdmaBroadcastConfig(int p0) throws android.os.RemoteException {}
        public void setCdmaBroadcastConfig(int p0, java.util.ArrayList<android.hardware.radio.V1_0.CdmaBroadcastSmsConfigInfo> p1) throws android.os.RemoteException {}
        public void setCdmaBroadcastActivation(int p0, boolean p1) throws android.os.RemoteException {}
        public void getCDMASubscription(int p0) throws android.os.RemoteException {}
        public void writeSmsToRuim(int p0, android.hardware.radio.V1_0.CdmaSmsWriteArgs p1) throws android.os.RemoteException {}
        public void deleteSmsOnRuim(int p0, int p1) throws android.os.RemoteException {}
        public void getDeviceIdentity(int p0) throws android.os.RemoteException {}
        public void exitEmergencyCallbackMode(int p0) throws android.os.RemoteException {}
        public void getSmscAddress(int p0) throws android.os.RemoteException {}
        public void setSmscAddress(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void reportSmsMemoryStatus(int p0, boolean p1) throws android.os.RemoteException {}
        public void reportStkServiceIsRunning(int p0) throws android.os.RemoteException {}
        public void getCdmaSubscriptionSource(int p0) throws android.os.RemoteException {}
        public void requestIsimAuthentication(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void acknowledgeIncomingGsmSmsWithPdu(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException {}
        public void sendEnvelopeWithStatus(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void getVoiceRadioTechnology(int p0) throws android.os.RemoteException {}
        public void getCellInfoList(int p0) throws android.os.RemoteException {}
        public void setCellInfoListRate(int p0, int p1) throws android.os.RemoteException {}
        public void setInitialAttachApn(int p0, android.hardware.radio.V1_0.DataProfileInfo p1, boolean p2, boolean p3) throws android.os.RemoteException {}
        public void getImsRegistrationState(int p0) throws android.os.RemoteException {}
        public void sendImsSms(int p0, android.hardware.radio.V1_0.ImsSmsMessage p1) throws android.os.RemoteException {}
        public void iccTransmitApduBasicChannel(int p0, android.hardware.radio.V1_0.SimApdu p1) throws android.os.RemoteException {}
        public void iccOpenLogicalChannel(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void iccCloseLogicalChannel(int p0, int p1) throws android.os.RemoteException {}
        public void iccTransmitApduLogicalChannel(int p0, android.hardware.radio.V1_0.SimApdu p1) throws android.os.RemoteException {}
        public void nvReadItem(int p0, int p1) throws android.os.RemoteException {}
        public void nvWriteItem(int p0, android.hardware.radio.V1_0.NvWriteItem p1) throws android.os.RemoteException {}
        public void nvWriteCdmaPrl(int p0, java.util.ArrayList<java.lang.Byte> p1) throws android.os.RemoteException {}
        public void nvResetConfig(int p0, int p1) throws android.os.RemoteException {}
        public void setUiccSubscription(int p0, android.hardware.radio.V1_0.SelectUiccSub p1) throws android.os.RemoteException {}
        public void setDataAllowed(int p0, boolean p1) throws android.os.RemoteException {}
        public void getHardwareConfig(int p0) throws android.os.RemoteException {}
        public void requestIccSimAuthentication(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void setDataProfile(int p0, java.util.ArrayList<android.hardware.radio.V1_0.DataProfileInfo> p1, boolean p2) throws android.os.RemoteException {}
        public void requestShutdown(int p0) throws android.os.RemoteException {}
        public void getRadioCapability(int p0) throws android.os.RemoteException {}
        public void setRadioCapability(int p0, android.hardware.radio.V1_0.RadioCapability p1) throws android.os.RemoteException {}
        public void startLceService(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void stopLceService(int p0) throws android.os.RemoteException {}
        public void pullLceData(int p0) throws android.os.RemoteException {}
        public void getModemActivityInfo(int p0) throws android.os.RemoteException {}
        public void setAllowedCarriers(int p0, boolean p1, android.hardware.radio.V1_0.CarrierRestrictions p2) throws android.os.RemoteException {}
        public void getAllowedCarriers(int p0) throws android.os.RemoteException {}
        public void sendDeviceState(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setIndicationFilter(int p0, int p1) throws android.os.RemoteException {}
        public void setSimCardPower(int p0, boolean p1) throws android.os.RemoteException {}
        public void responseAcknowledgement() throws android.os.RemoteException {}
        public void setCarrierInfoForImsiEncryption(int p0, android.hardware.radio.V1_1.ImsiEncryptionInfo p1) throws android.os.RemoteException {}
        public void setSimCardPower_1_1(int p0, int p1) throws android.os.RemoteException {}
        public void startNetworkScan(int p0, android.hardware.radio.V1_1.NetworkScanRequest p1) throws android.os.RemoteException {}
        public void stopNetworkScan(int p0) throws android.os.RemoteException {}
        public void startKeepalive(int p0, android.hardware.radio.V1_1.KeepaliveRequest p1) throws android.os.RemoteException {}
        public void stopKeepalive(int p0, int p1) throws android.os.RemoteException {}
        public void startNetworkScan_1_2(int p0, android.hardware.radio.V1_2.NetworkScanRequest p1) throws android.os.RemoteException {}
        public void setIndicationFilter_1_2(int p0, int p1) throws android.os.RemoteException {}
        public void setSignalStrengthReportingCriteria(int p0, int p1, int p2, java.util.ArrayList<java.lang.Integer> p3, int p4) throws android.os.RemoteException {}
        public void setLinkCapacityReportingCriteria(int p0, int p1, int p2, int p3, java.util.ArrayList<java.lang.Integer> p4, java.util.ArrayList<java.lang.Integer> p5, int p6) throws android.os.RemoteException {}
        public void setupDataCall_1_2(int p0, int p1, android.hardware.radio.V1_0.DataProfileInfo p2, boolean p3, boolean p4, boolean p5, int p6, java.util.ArrayList<java.lang.String> p7, java.util.ArrayList<java.lang.String> p8) throws android.os.RemoteException {}
        public void deactivateDataCall_1_2(int p0, int p1, int p2) throws android.os.RemoteException {}
        public java.util.ArrayList<java.lang.String> interfaceChain() throws android.os.RemoteException { return null; }
        public void debug(android.os.NativeHandle p0, java.util.ArrayList<java.lang.String> p1) throws android.os.RemoteException {}
        public java.lang.String interfaceDescriptor() throws android.os.RemoteException { return null; }
        public java.util.ArrayList<byte[]> getHashChain() throws android.os.RemoteException { return null; }
        public void setHALInstrumentation() throws android.os.RemoteException {}
        public boolean linkToDeath(android.os.IHwBinder.DeathRecipient p0, long p1) throws android.os.RemoteException { return false; }
        public void ping() throws android.os.RemoteException {}
        public android.internal.hidl.base.V1_0.DebugInfo getDebugInfo() throws android.os.RemoteException { return null; }
        public void notifySyspropsChanged() throws android.os.RemoteException {}
        public boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient p0) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.HwBinder implements android.hardware.radio.V1_2.IRadio {
        public Stub() { super(); }
        public android.os.IHwBinder asBinder() { return null; }
        public final java.util.ArrayList<java.lang.String> interfaceChain() { return null; }
        public void debug(android.os.NativeHandle p0, java.util.ArrayList<java.lang.String> p1) {}
        public final java.lang.String interfaceDescriptor() { return null; }
        public final java.util.ArrayList<byte[]> getHashChain() { return null; }
        public final void setHALInstrumentation() {}
        public final boolean linkToDeath(android.os.IHwBinder.DeathRecipient p0, long p1) { return false; }
        public final void ping() {}
        public final android.internal.hidl.base.V1_0.DebugInfo getDebugInfo() { return null; }
        public final void notifySyspropsChanged() {}
        public final boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient p0) { return false; }
        public android.os.IHwInterface queryLocalInterface(java.lang.String p0) { return null; }
        public void registerAsService(java.lang.String p0) throws android.os.RemoteException {}
        public java.lang.String toString() { return null; }
        public void onTransact(int p0, android.os.HwParcel p1, android.os.HwParcel p2, int p3) throws android.os.RemoteException {}
    }
}
