package com.android.internal.telephony;

public class SimResponse extends android.hardware.radio.sim.IRadioSimResponse.Stub {
    public SimResponse(com.android.internal.telephony.RIL p0) { super(); }
    public void acknowledgeRequest(int p0) {}
    public void areUiccApplicationsEnabledResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) {}
    public void changeIccPin2ForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public void changeIccPinForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public void enableUiccApplicationsResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void getAllowedCarriersResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.CarrierRestrictions p1, int p2) {}
    public void getCdmaSubscriptionResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) {}
    public void getCdmaSubscriptionSourceResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public void getFacilityLockForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public void getIccCardStatusResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.CardStatus p1) {}
    public void getImsiForAppResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) {}
    public void getSimPhonebookCapacityResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.PhonebookCapacity p1) {}
    public void getSimPhonebookRecordsResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void iccCloseLogicalChannelResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void iccCloseLogicalChannelWithSessionInfoResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void iccIoForAppResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) {}
    public void iccOpenLogicalChannelResponse(android.hardware.radio.RadioResponseInfo p0, int p1, byte[] p2) {}
    public void iccTransmitApduBasicChannelResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) {}
    public void iccTransmitApduLogicalChannelResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) {}
    public void reportStkServiceIsRunningResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void requestIccSimAuthenticationResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) {}
    public void requestIsimAuthenticationResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) {}
    public void sendEnvelopeResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) {}
    public void sendEnvelopeWithStatusResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) {}
    public void sendTerminalResponseToSimResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setAllowedCarriersResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setCarrierInfoForImsiEncryptionResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setCdmaSubscriptionSourceResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setFacilityLockForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public void setSimCardPowerResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setUiccSubscriptionResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void supplyIccPin2ForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public void supplyIccPinForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public void supplyIccPuk2ForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public void supplyIccPukForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public void supplySimDepersonalizationResponse(android.hardware.radio.RadioResponseInfo p0, int p1, int p2) {}
    public void updateSimPhonebookRecordsResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public java.lang.String getInterfaceHash() { return null; }
    public int getInterfaceVersion() { return 0; }
}
