package com.android.internal.telephony;

public class ImsResponse extends android.hardware.radio.ims.IRadioImsResponse.Stub {
    public ImsResponse(com.android.internal.telephony.RIL p0) { super(); }
    public java.lang.String getInterfaceHash() { return null; }
    public int getInterfaceVersion() { return 0; }
    public void setSrvccCallInfoResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void updateImsRegistrationInfoResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void startImsTrafficResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.ims.ConnectionFailureInfo p1) {}
    public void stopImsTrafficResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void triggerEpsFallbackResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void sendAnbrQueryResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void updateImsCallStatusResponse(android.hardware.radio.RadioResponseInfo p0) {}
}
