package com.android.internal.telephony;

public class RadioResponse extends android.hardware.radio.V1_6.IRadioResponse.Stub {
    com.android.internal.telephony.RIL mRil;
    public RadioResponse(com.android.internal.telephony.RIL p0) { super(); }
    static void sendMessageResponse(android.os.Message p0, java.lang.Object p1) {}
    public void acknowledgeRequest(int p0) {}
    public void getIccCardStatusResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.CardStatus p1) {}
    public void getIccCardStatusResponse_1_2(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_2.CardStatus p1) {}
    public void getIccCardStatusResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_4.CardStatus p1) {}
    public void getIccCardStatusResponse_1_5(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_5.CardStatus p1) {}
    public void supplyIccPinForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) {}
    public void supplyIccPukForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) {}
    public void supplyIccPin2ForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) {}
    public void supplyIccPuk2ForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) {}
    public void changeIccPinForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) {}
    public void changeIccPin2ForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) {}
    public void supplyNetworkDepersonalizationResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) {}
    public void supplySimDepersonalizationResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1, int p2) {}
    public void getCurrentCallsResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_0.Call> p1) {}
    public void getCurrentCallsResponse_1_2(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_2.Call> p1) {}
    public void getCurrentCallsResponse_1_6(android.hardware.radio.V1_6.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_6.Call> p1) {}
    public void dialResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getIMSIForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.lang.String p1) {}
    public void hangupConnectionResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void hangupWaitingOrBackgroundResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void hangupForegroundResumeBackgroundResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void switchWaitingOrHoldingAndActiveResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void conferenceResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void rejectCallResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getLastCallFailCauseResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.LastCallFailCauseInfo p1) {}
    public void getSignalStrengthResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.SignalStrength p1) {}
    public void getSignalStrengthResponse_1_2(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_2.SignalStrength p1) {}
    public void getSignalStrengthResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_4.SignalStrength p1) {}
    public void getSignalStrengthResponse_1_6(android.hardware.radio.V1_6.RadioResponseInfo p0, android.hardware.radio.V1_6.SignalStrength p1) {}
    public void getVoiceRegistrationStateResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.VoiceRegStateResult p1) {}
    public void getVoiceRegistrationStateResponse_1_2(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_2.VoiceRegStateResult p1) {}
    public void getVoiceRegistrationStateResponse_1_5(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_5.RegStateResult p1) {}
    public void getVoiceRegistrationStateResponse_1_6(android.hardware.radio.V1_6.RadioResponseInfo p0, android.hardware.radio.V1_6.RegStateResult p1) {}
    public void getDataRegistrationStateResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.DataRegStateResult p1) {}
    public void getDataRegistrationStateResponse_1_2(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_2.DataRegStateResult p1) {}
    public void getDataRegistrationStateResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_4.DataRegStateResult p1) {}
    public void getDataRegistrationStateResponse_1_5(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_5.RegStateResult p1) {}
    public void getDataRegistrationStateResponse_1_6(android.hardware.radio.V1_6.RadioResponseInfo p0, android.hardware.radio.V1_6.RegStateResult p1) {}
    public void getOperatorResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    public void setRadioPowerResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void sendDtmfResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void sendSmsResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.SendSmsResult p1) {}
    public void sendSmsResponse_1_6(android.hardware.radio.V1_6.RadioResponseInfo p0, android.hardware.radio.V1_0.SendSmsResult p1) {}
    public void sendSMSExpectMoreResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.SendSmsResult p1) {}
    public void sendSmsExpectMoreResponse_1_6(android.hardware.radio.V1_6.RadioResponseInfo p0, android.hardware.radio.V1_0.SendSmsResult p1) {}
    public void setupDataCallResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.SetupDataCallResult p1) {}
    public void setupDataCallResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_4.SetupDataCallResult p1) {}
    public void setupDataCallResponse_1_5(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_5.SetupDataCallResult p1) {}
    public void setupDataCallResponse_1_6(android.hardware.radio.V1_6.RadioResponseInfo p0, android.hardware.radio.V1_6.SetupDataCallResult p1) {}
    public void getDataCallListResponse_1_6(android.hardware.radio.V1_6.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_6.SetupDataCallResult> p1) {}
    public void setSimCardPowerResponse_1_6(android.hardware.radio.V1_6.RadioResponseInfo p0) {}
    public void setAllowedNetworkTypesBitmapResponse(android.hardware.radio.V1_6.RadioResponseInfo p0) {}
    public void getAllowedNetworkTypesBitmapResponse(android.hardware.radio.V1_6.RadioResponseInfo p0, int p1) {}
    public void iccIOForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.IccIoResult p1) {}
    public void sendUssdResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void cancelPendingUssdResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getClirResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1, int p2) {}
    public void setClirResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getCallForwardStatusResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_0.CallForwardInfo> p1) {}
    public void setCallForwardResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getCallWaitingResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, boolean p1, int p2) {}
    public void setCallWaitingResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void acknowledgeLastIncomingGsmSmsResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void acceptCallResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void deactivateDataCallResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getFacilityLockForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) {}
    public void setFacilityLockForAppResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) {}
    public void setBarringPasswordResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getNetworkSelectionModeResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, boolean p1) {}
    public void setNetworkSelectionModeAutomaticResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setNetworkSelectionModeManualResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setNetworkSelectionModeManualResponse_1_5(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getAvailableNetworksResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_0.OperatorInfo> p1) {}
    public void startNetworkScanResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void startNetworkScanResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void startNetworkScanResponse_1_5(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void stopNetworkScanResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void startDtmfResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void stopDtmfResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getBasebandVersionResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.lang.String p1) {}
    public void separateConnectionResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setMuteResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getMuteResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, boolean p1) {}
    public void getClipResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) {}
    public void getDataCallListResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_0.SetupDataCallResult> p1) {}
    public void getDataCallListResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_4.SetupDataCallResult> p1) {}
    public void getDataCallListResponse_1_5(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_5.SetupDataCallResult> p1) {}
    public void sendOemRilRequestRawResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<java.lang.Byte> p1) {}
    public void setSuppServiceNotificationsResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void writeSmsToSimResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) {}
    public void deleteSmsOnSimResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setBandModeResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getAvailableBandModesResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<java.lang.Integer> p1) {}
    public void sendEnvelopeResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.lang.String p1) {}
    public void sendTerminalResponseToSimResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void handleStkCallSetupRequestFromSimResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void explicitCallTransferResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setPreferredNetworkTypeResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setPreferredNetworkTypeBitmapResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getPreferredNetworkTypeResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) {}
    public void getPreferredNetworkTypeBitmapResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) {}
    public void getNeighboringCidsResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_0.NeighboringCell> p1) {}
    public void setLocationUpdatesResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setCdmaSubscriptionSourceResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setCdmaRoamingPreferenceResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getCdmaRoamingPreferenceResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) {}
    public void setTTYModeResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getTTYModeResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) {}
    public void setPreferredVoicePrivacyResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getPreferredVoicePrivacyResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, boolean p1) {}
    public void sendCDMAFeatureCodeResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void sendBurstDtmfResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void sendCdmaSmsResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.SendSmsResult p1) {}
    public void sendCdmaSmsResponse_1_6(android.hardware.radio.V1_6.RadioResponseInfo p0, android.hardware.radio.V1_0.SendSmsResult p1) {}
    public void sendCdmaSmsExpectMoreResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.SendSmsResult p1) {}
    public void sendCdmaSmsExpectMoreResponse_1_6(android.hardware.radio.V1_6.RadioResponseInfo p0, android.hardware.radio.V1_0.SendSmsResult p1) {}
    public void setDataThrottlingResponse(android.hardware.radio.V1_6.RadioResponseInfo p0) {}
    public void acknowledgeLastIncomingCdmaSmsResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getGsmBroadcastConfigResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_0.GsmBroadcastSmsConfigInfo> p1) {}
    public void setGsmBroadcastConfigResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setGsmBroadcastActivationResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getCdmaBroadcastConfigResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_0.CdmaBroadcastSmsConfigInfo> p1) {}
    public void setCdmaBroadcastConfigResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setCdmaBroadcastActivationResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getCDMASubscriptionResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) {}
    public void writeSmsToRuimResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) {}
    public void deleteSmsOnRuimResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getDeviceIdentityResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) {}
    public void exitEmergencyCallbackModeResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getSmscAddressResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.lang.String p1) {}
    public void setSmscAddressResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void reportSmsMemoryStatusResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void reportStkServiceIsRunningResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getCdmaSubscriptionSourceResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) {}
    public void requestIsimAuthenticationResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.lang.String p1) {}
    public void acknowledgeIncomingGsmSmsWithPduResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void sendEnvelopeWithStatusResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.IccIoResult p1) {}
    public void getVoiceRadioTechnologyResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) {}
    public void getCellInfoListResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_0.CellInfo> p1) {}
    public void getCellInfoListResponse_1_2(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_2.CellInfo> p1) {}
    public void getCellInfoListResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_4.CellInfo> p1) {}
    public void getCellInfoListResponse_1_5(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_5.CellInfo> p1) {}
    public void getCellInfoListResponse_1_6(android.hardware.radio.V1_6.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_6.CellInfo> p1) {}
    public void setCellInfoListRateResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setInitialAttachApnResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setInitialAttachApnResponse_1_5(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getImsRegistrationStateResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, boolean p1, int p2) {}
    public void sendImsSmsResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.SendSmsResult p1) {}
    public void iccTransmitApduBasicChannelResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.IccIoResult p1) {}
    public void iccOpenLogicalChannelResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1, java.util.ArrayList<java.lang.Byte> p2) {}
    public void iccCloseLogicalChannelResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void iccTransmitApduLogicalChannelResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.IccIoResult p1) {}
    public void nvReadItemResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.lang.String p1) {}
    public void nvWriteItemResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void nvWriteCdmaPrlResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void nvResetConfigResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setUiccSubscriptionResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setDataAllowedResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getHardwareConfigResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_0.HardwareConfig> p1) {}
    public void requestIccSimAuthenticationResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.IccIoResult p1) {}
    public void setDataProfileResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setDataProfileResponse_1_5(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void requestShutdownResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getRadioCapabilityResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.RadioCapability p1) {}
    public void setRadioCapabilityResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.RadioCapability p1) {}
    public void startLceServiceResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.LceStatusInfo p1) {}
    public void stopLceServiceResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.LceStatusInfo p1) {}
    public void pullLceDataResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.LceDataInfo p1) {}
    public void getModemActivityInfoResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_0.ActivityStatsInfo p1) {}
    public void isNrDualConnectivityEnabledResponse(android.hardware.radio.V1_6.RadioResponseInfo p0, boolean p1) {}
    public void setNrDualConnectivityStateResponse(android.hardware.radio.V1_6.RadioResponseInfo p0) {}
    public void setAllowedCarriersResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, int p1) {}
    public void setAllowedCarriersResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getAllowedCarriersResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, boolean p1, android.hardware.radio.V1_0.CarrierRestrictions p2) {}
    public void getAllowedCarriersResponse_1_4(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_4.CarrierRestrictionsWithPriority p1, int p2) {}
    public void sendDeviceStateResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setCarrierInfoForImsiEncryptionResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setIndicationFilterResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setIndicationFilterResponse_1_5(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setSimCardPowerResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setSignalStrengthReportingCriteriaResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setSignalStrengthReportingCriteriaResponse_1_5(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setLinkCapacityReportingCriteriaResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setLinkCapacityReportingCriteriaResponse_1_5(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setSimCardPowerResponse_1_1(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void startKeepaliveResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_1.KeepaliveStatus p1) {}
    public void stopKeepaliveResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getSimPhonebookRecordsResponse(android.hardware.radio.V1_6.RadioResponseInfo p0) {}
    public void getSimPhonebookCapacityResponse(android.hardware.radio.V1_6.RadioResponseInfo p0, android.hardware.radio.V1_6.PhonebookCapacity p1) {}
    public void updateSimPhonebookRecordsResponse(android.hardware.radio.V1_6.RadioResponseInfo p0, int p1) {}
    public void emergencyDialResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public static void responseInts(int p0, com.android.internal.telephony.RIL p1, android.hardware.radio.RadioResponseInfo p2, int... p3) {}
    public static void responseIntArrayList(int p0, com.android.internal.telephony.RIL p1, android.hardware.radio.RadioResponseInfo p2, java.util.ArrayList<java.lang.Integer> p3) {}
    public static void responseVoid(int p0, com.android.internal.telephony.RIL p1, android.hardware.radio.RadioResponseInfo p2) {}
    public static void responseString(int p0, com.android.internal.telephony.RIL p1, android.hardware.radio.RadioResponseInfo p2, java.lang.String p3) {}
    public static void responseStrings(int p0, com.android.internal.telephony.RIL p1, android.hardware.radio.RadioResponseInfo p2, java.lang.String... p3) {}
    static void responseStringArrayList(com.android.internal.telephony.RIL p0, android.hardware.radio.V1_0.RadioResponseInfo p1, java.util.ArrayList<java.lang.String> p2) {}
    public void enableModemResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getModemStackStatusResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, boolean p1) {}
    public void setSystemSelectionChannelsResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void enableUiccApplicationsResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void areUiccApplicationsEnabledResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, boolean p1) {}
    public void setRadioPowerResponse_1_5(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void setRadioPowerResponse_1_6(android.hardware.radio.V1_6.RadioResponseInfo p0) {}
    public void setSystemSelectionChannelsResponse_1_5(android.hardware.radio.V1_0.RadioResponseInfo p0) {}
    public void getSystemSelectionChannelsResponse(android.hardware.radio.V1_6.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.V1_5.RadioAccessSpecifier> p1) {}
    public void getBarringInfoResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.V1_5.CellIdentity p1, java.util.ArrayList<android.hardware.radio.V1_5.BarringInfo> p2) {}
    public void allocatePduSessionIdResponse(android.hardware.radio.V1_6.RadioResponseInfo p0, int p1) {}
    public void releasePduSessionIdResponse(android.hardware.radio.V1_6.RadioResponseInfo p0) {}
    public void startHandoverResponse(android.hardware.radio.V1_6.RadioResponseInfo p0) {}
    public void cancelHandoverResponse(android.hardware.radio.V1_6.RadioResponseInfo p0) {}
    public void getSlicingConfigResponse(android.hardware.radio.V1_6.RadioResponseInfo p0, android.hardware.radio.V1_6.SlicingConfig p1) {}
}
