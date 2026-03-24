package com.android.internal.telephony;

public class VoiceResponse extends android.hardware.radio.voice.IRadioVoiceResponse.Stub {
    public VoiceResponse(com.android.internal.telephony.RIL p0) { super(); }
    public void acknowledgeRequest(int p0) {}
    public void acceptCallResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void cancelPendingUssdResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void conferenceResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void dialResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void emergencyDialResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void exitEmergencyCallbackModeResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void explicitCallTransferResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void getCallForwardStatusResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.voice.CallForwardInfo[] p1) {}
    public void getCallWaitingResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1, int p2) {}
    public void getClipResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public void getClirResponse(android.hardware.radio.RadioResponseInfo p0, int p1, int p2) {}
    public void getCurrentCallsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.voice.Call[] p1) {}
    public void getLastCallFailCauseResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.voice.LastCallFailCauseInfo p1) {}
    public void getMuteResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) {}
    public void getPreferredVoicePrivacyResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) {}
    public void getTtyModeResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public void handleStkCallSetupRequestFromSimResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void hangupConnectionResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void hangupForegroundResumeBackgroundResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void hangupWaitingOrBackgroundResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void isVoNrEnabledResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) {}
    public void rejectCallResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void sendBurstDtmfResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void sendCdmaFeatureCodeResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void sendDtmfResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void sendUssdResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void separateConnectionResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setCallForwardResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setCallWaitingResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setClirResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setMuteResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setPreferredVoicePrivacyResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setTtyModeResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setVoNrEnabledResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void startDtmfResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void stopDtmfResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void switchWaitingOrHoldingAndActiveResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public java.lang.String getInterfaceHash() { return null; }
    public int getInterfaceVersion() { return 0; }
}
