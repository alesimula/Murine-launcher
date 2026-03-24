package com.android.internal.telephony;

public class DataResponse extends android.hardware.radio.data.IRadioDataResponse.Stub {
    public DataResponse(com.android.internal.telephony.RIL p0) { super(); }
    public void acknowledgeRequest(int p0) {}
    public void allocatePduSessionIdResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public void cancelHandoverResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void deactivateDataCallResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void getDataCallListResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.data.SetupDataCallResult[] p1) {}
    public void getSlicingConfigResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.data.SlicingConfig p1) {}
    public void releasePduSessionIdResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setDataAllowedResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setDataProfileResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setDataThrottlingResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setInitialAttachApnResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setupDataCallResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.data.SetupDataCallResult p1) {}
    public void startHandoverResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void startKeepaliveResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.data.KeepaliveStatus p1) {}
    public void stopKeepaliveResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public java.lang.String getInterfaceHash() { return null; }
    public int getInterfaceVersion() { return 0; }
}
