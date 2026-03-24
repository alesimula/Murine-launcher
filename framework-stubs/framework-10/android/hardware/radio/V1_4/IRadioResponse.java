package android.hardware.radio.V1_4;

public interface IRadioResponse extends android.hardware.radio.V1_3.IRadioResponse {
    public static final java.lang.String kInterfaceName = "android.hardware.radio@1.4::IRadioResponse";
    public static android.hardware.radio.V1_4.IRadioResponse asInterface(android.os.IHwBinder p0) { return null; }
    public static android.hardware.radio.V1_4.IRadioResponse castFrom(android.os.IHwInterface p0) { return null; }
    public android.os.IHwBinder asBinder();
    public static android.hardware.radio.V1_4.IRadioResponse getService(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
    public static android.hardware.radio.V1_4.IRadioResponse getService(boolean p0) throws android.os.RemoteException { return null; }
    public static android.hardware.radio.V1_4.IRadioResponse getService(java.lang.String p0) throws android.os.RemoteException { return null; }
    public static android.hardware.radio.V1_4.IRadioResponse getService() throws android.os.RemoteException { return null; }
    public void emergencyDialResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException;
    public void startNetworkScanResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException;
    public void getCellInfoListResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_4.CellInfo> p1) throws android.os.RemoteException;
    public void getDataRegistrationStateResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_4.DataRegStateResult p1) throws android.os.RemoteException;
    public void getIccCardStatusResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_4.CardStatus p1) throws android.os.RemoteException;
    public void getPreferredNetworkTypeBitmapResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public void setPreferredNetworkTypeBitmapResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException;
    public void getDataCallListResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_4.SetupDataCallResult> p1) throws android.os.RemoteException;
    public void setupDataCallResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_4.SetupDataCallResult p1) throws android.os.RemoteException;
    public void setAllowedCarriersResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException;
    public void getAllowedCarriersResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_4.CarrierRestrictionsWithPriority p1, int p2) throws android.os.RemoteException;
    public void getSignalStrengthResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_4.SignalStrength p1) throws android.os.RemoteException;
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

    public static abstract class Stub extends android.os.HwBinder implements android.hardware.radio.V1_4.IRadioResponse {
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

    public static final class Proxy implements android.hardware.radio.V1_4.IRadioResponse {
        private android.os.IHwBinder mRemote;
        public Proxy(android.os.IHwBinder p0) {}
        public android.os.IHwBinder asBinder() { return null; }
        public java.lang.String toString() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public void getIccCardStatusResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.CardStatus p1) throws android.os.RemoteException {}
        public void supplyIccPinForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void supplyIccPukForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void supplyIccPin2ForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void supplyIccPuk2ForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void changeIccPinForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void changeIccPin2ForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void supplyNetworkDepersonalizationResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void getCurrentCallsResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_0.Call> p1) throws android.os.RemoteException {}
        public void dialResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getIMSIForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException {}
        public void hangupConnectionResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void hangupWaitingOrBackgroundResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void hangupForegroundResumeBackgroundResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void switchWaitingOrHoldingAndActiveResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void conferenceResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void rejectCallResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getLastCallFailCauseResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.LastCallFailCauseInfo p1) throws android.os.RemoteException {}
        public void getSignalStrengthResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.SignalStrength p1) throws android.os.RemoteException {}
        public void getVoiceRegistrationStateResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.VoiceRegStateResult p1) throws android.os.RemoteException {}
        public void getDataRegistrationStateResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.DataRegStateResult p1) throws android.os.RemoteException {}
        public void getOperatorResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void setRadioPowerResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void sendDtmfResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void sendSmsResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.SendSmsResult p1) throws android.os.RemoteException {}
        public void sendSMSExpectMoreResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.SendSmsResult p1) throws android.os.RemoteException {}
        public void setupDataCallResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.SetupDataCallResult p1) throws android.os.RemoteException {}
        public void iccIOForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.IccIoResult p1) throws android.os.RemoteException {}
        public void sendUssdResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void cancelPendingUssdResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getClirResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1, int p2) throws android.os.RemoteException {}
        public void setClirResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getCallForwardStatusResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_0.CallForwardInfo> p1) throws android.os.RemoteException {}
        public void setCallForwardResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getCallWaitingResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void setCallWaitingResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void acknowledgeLastIncomingGsmSmsResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void acceptCallResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void deactivateDataCallResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getFacilityLockForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void setFacilityLockForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void setBarringPasswordResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getNetworkSelectionModeResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
        public void setNetworkSelectionModeAutomaticResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setNetworkSelectionModeManualResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getAvailableNetworksResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_0.OperatorInfo> p1) throws android.os.RemoteException {}
        public void startDtmfResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void stopDtmfResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getBasebandVersionResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException {}
        public void separateConnectionResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setMuteResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getMuteResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
        public void getClipResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void getDataCallListResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_0.SetupDataCallResult> p1) throws android.os.RemoteException {}
        public void setSuppServiceNotificationsResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void writeSmsToSimResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void deleteSmsOnSimResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setBandModeResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getAvailableBandModesResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<java.lang.Integer> p1) throws android.os.RemoteException {}
        public void sendEnvelopeResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException {}
        public void sendTerminalResponseToSimResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void handleStkCallSetupRequestFromSimResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void explicitCallTransferResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setPreferredNetworkTypeResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getPreferredNetworkTypeResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void getNeighboringCidsResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_0.NeighboringCell> p1) throws android.os.RemoteException {}
        public void setLocationUpdatesResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setCdmaSubscriptionSourceResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setCdmaRoamingPreferenceResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getCdmaRoamingPreferenceResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void setTTYModeResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getTTYModeResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void setPreferredVoicePrivacyResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getPreferredVoicePrivacyResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
        public void sendCDMAFeatureCodeResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void sendBurstDtmfResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void sendCdmaSmsResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.SendSmsResult p1) throws android.os.RemoteException {}
        public void acknowledgeLastIncomingCdmaSmsResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getGsmBroadcastConfigResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_0.GsmBroadcastSmsConfigInfo> p1) throws android.os.RemoteException {}
        public void setGsmBroadcastConfigResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setGsmBroadcastActivationResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getCdmaBroadcastConfigResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_0.CdmaBroadcastSmsConfigInfo> p1) throws android.os.RemoteException {}
        public void setCdmaBroadcastConfigResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setCdmaBroadcastActivationResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getCDMASubscriptionResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException {}
        public void writeSmsToRuimResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void deleteSmsOnRuimResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getDeviceIdentityResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public void exitEmergencyCallbackModeResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getSmscAddressResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setSmscAddressResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void reportSmsMemoryStatusResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void reportStkServiceIsRunningResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getCdmaSubscriptionSourceResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void requestIsimAuthenticationResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException {}
        public void acknowledgeIncomingGsmSmsWithPduResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void sendEnvelopeWithStatusResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.IccIoResult p1) throws android.os.RemoteException {}
        public void getVoiceRadioTechnologyResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void getCellInfoListResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_0.CellInfo> p1) throws android.os.RemoteException {}
        public void setCellInfoListRateResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setInitialAttachApnResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getImsRegistrationStateResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void sendImsSmsResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.SendSmsResult p1) throws android.os.RemoteException {}
        public void iccTransmitApduBasicChannelResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.IccIoResult p1) throws android.os.RemoteException {}
        public void iccOpenLogicalChannelResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1, java.util.ArrayList<java.lang.Byte> p2) throws android.os.RemoteException {}
        public void iccCloseLogicalChannelResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void iccTransmitApduLogicalChannelResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.IccIoResult p1) throws android.os.RemoteException {}
        public void nvReadItemResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException {}
        public void nvWriteItemResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void nvWriteCdmaPrlResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void nvResetConfigResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setUiccSubscriptionResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setDataAllowedResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getHardwareConfigResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_0.HardwareConfig> p1) throws android.os.RemoteException {}
        public void requestIccSimAuthenticationResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.IccIoResult p1) throws android.os.RemoteException {}
        public void setDataProfileResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void requestShutdownResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getRadioCapabilityResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.RadioCapability p1) throws android.os.RemoteException {}
        public void setRadioCapabilityResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.RadioCapability p1) throws android.os.RemoteException {}
        public void startLceServiceResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.LceStatusInfo p1) throws android.os.RemoteException {}
        public void stopLceServiceResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.LceStatusInfo p1) throws android.os.RemoteException {}
        public void pullLceDataResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.LceDataInfo p1) throws android.os.RemoteException {}
        public void getModemActivityInfoResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.ActivityStatsInfo p1) throws android.os.RemoteException {}
        public void setAllowedCarriersResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void getAllowedCarriersResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, boolean p1, android.hardware.radio.V1_0.CarrierRestrictions p2) throws android.os.RemoteException {}
        public void sendDeviceStateResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setIndicationFilterResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setSimCardPowerResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void acknowledgeRequest(int p0) throws android.os.RemoteException {}
        public void setCarrierInfoForImsiEncryptionResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setSimCardPowerResponse_1_1(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void startNetworkScanResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void stopNetworkScanResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void startKeepaliveResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_1.KeepaliveStatus p1) throws android.os.RemoteException {}
        public void stopKeepaliveResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getCellInfoListResponse_1_2(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_2.CellInfo> p1) throws android.os.RemoteException {}
        public void getIccCardStatusResponse_1_2(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_2.CardStatus p1) throws android.os.RemoteException {}
        public void setSignalStrengthReportingCriteriaResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setLinkCapacityReportingCriteriaResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getCurrentCallsResponse_1_2(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_2.Call> p1) throws android.os.RemoteException {}
        public void getSignalStrengthResponse_1_2(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_2.SignalStrength p1) throws android.os.RemoteException {}
        public void getVoiceRegistrationStateResponse_1_2(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_2.VoiceRegStateResult p1) throws android.os.RemoteException {}
        public void getDataRegistrationStateResponse_1_2(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_2.DataRegStateResult p1) throws android.os.RemoteException {}
        public void setSystemSelectionChannelsResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void enableModemResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getModemStackStatusResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
        public void emergencyDialResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void startNetworkScanResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getCellInfoListResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_4.CellInfo> p1) throws android.os.RemoteException {}
        public void getDataRegistrationStateResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_4.DataRegStateResult p1) throws android.os.RemoteException {}
        public void getIccCardStatusResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_4.CardStatus p1) throws android.os.RemoteException {}
        public void getPreferredNetworkTypeBitmapResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void setPreferredNetworkTypeBitmapResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getDataCallListResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_4.SetupDataCallResult> p1) throws android.os.RemoteException {}
        public void setupDataCallResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_4.SetupDataCallResult p1) throws android.os.RemoteException {}
        public void setAllowedCarriersResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getAllowedCarriersResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_4.CarrierRestrictionsWithPriority p1, int p2) throws android.os.RemoteException {}
        public void getSignalStrengthResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_4.SignalStrength p1) throws android.os.RemoteException {}
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
}
