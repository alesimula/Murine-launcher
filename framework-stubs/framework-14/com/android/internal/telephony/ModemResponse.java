package com.android.internal.telephony;

public class ModemResponse extends android.hardware.radio.modem.IRadioModemResponse.Stub {
    public ModemResponse(com.android.internal.telephony.RIL p0) { super(); }
    public void acknowledgeRequest(int p0) {}
    public void enableModemResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void getBasebandVersionResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) {}
    public void getDeviceIdentityResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) {}
    public void getImeiResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.ImeiInfo p1) {}
    public void getHardwareConfigResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.HardwareConfig[] p1) {}
    public void getModemActivityInfoResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.ActivityStatsInfo p1) {}
    public void getModemStackStatusResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) {}
    public void getRadioCapabilityResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.RadioCapability p1) {}
    public void nvReadItemResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) {}
    public void nvResetConfigResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void nvWriteCdmaPrlResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void nvWriteItemResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void requestShutdownResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void sendDeviceStateResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setRadioCapabilityResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.modem.RadioCapability p1) {}
    public void setRadioPowerResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public java.lang.String getInterfaceHash() { return null; }
    public int getInterfaceVersion() { return 0; }
}
