package com.android.internal.telephony;

public class NetworkResponse extends android.hardware.radio.network.IRadioNetworkResponse.Stub {
    public NetworkResponse(com.android.internal.telephony.RIL p0) { super(); }
    public void acknowledgeRequest(int p0) {}
    public void getAllowedNetworkTypesBitmapResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public void getAvailableBandModesResponse(android.hardware.radio.RadioResponseInfo p0, int[] p1) {}
    public void getAvailableNetworksResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.OperatorInfo[] p1) {}
    public void getBarringInfoResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.CellIdentity p1, android.hardware.radio.network.BarringInfo[] p2) {}
    public void getCdmaRoamingPreferenceResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public void getCellInfoListResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.CellInfo[] p1) {}
    public void getDataRegistrationStateResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.RegStateResult p1) {}
    public void getImsRegistrationStateResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1, int p2) {}
    public void getNetworkSelectionModeResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) {}
    public void getOperatorResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    public void getSignalStrengthResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.SignalStrength p1) {}
    public void getSystemSelectionChannelsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.RadioAccessSpecifier[] p1) {}
    public void getVoiceRadioTechnologyResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public void getVoiceRegistrationStateResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.RegStateResult p1) {}
    public void isNrDualConnectivityEnabledResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) {}
    public void pullLceDataResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.LceDataInfo p1) {}
    public void setAllowedNetworkTypesBitmapResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setBandModeResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setBarringPasswordResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setCdmaRoamingPreferenceResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setCellInfoListRateResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setIndicationFilterResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setLinkCapacityReportingCriteriaResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setLocationUpdatesResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setNetworkSelectionModeAutomaticResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setNetworkSelectionModeManualResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setNrDualConnectivityStateResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setSignalStrengthReportingCriteriaResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setSuppServiceNotificationsResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setSystemSelectionChannelsResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void startNetworkScanResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void stopNetworkScanResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void supplyNetworkDepersonalizationResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public void setUsageSettingResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void getUsageSettingResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public void setEmergencyModeResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.EmergencyRegResult p1) {}
    public void triggerEmergencyNetworkScanResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void exitEmergencyModeResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void cancelEmergencyNetworkScanResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setNullCipherAndIntegrityEnabledResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void isNullCipherAndIntegrityEnabledResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) {}
    public void isN1ModeEnabledResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) {}
    public void setN1ModeEnabledResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public java.lang.String getInterfaceHash() { return null; }
    public int getInterfaceVersion() { return 0; }
}
