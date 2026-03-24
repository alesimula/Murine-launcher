package com.android.internal.telephony;

public class MessagingResponse extends android.hardware.radio.messaging.IRadioMessagingResponse.Stub {
    public MessagingResponse(com.android.internal.telephony.RIL p0) { super(); }
    public void acknowledgeRequest(int p0) {}
    public void acknowledgeIncomingGsmSmsWithPduResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void acknowledgeLastIncomingCdmaSmsResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void acknowledgeLastIncomingGsmSmsResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void deleteSmsOnRuimResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void deleteSmsOnSimResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void getCdmaBroadcastConfigResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.CdmaBroadcastSmsConfigInfo[] p1) {}
    public void getGsmBroadcastConfigResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.GsmBroadcastSmsConfigInfo[] p1) {}
    public void getSmscAddressResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) {}
    public void reportSmsMemoryStatusResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void sendCdmaSmsExpectMoreResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) {}
    public void sendCdmaSmsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) {}
    public void sendImsSmsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) {}
    public void sendSmsExpectMoreResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) {}
    public void sendSmsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) {}
    public void setCdmaBroadcastActivationResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setCdmaBroadcastConfigResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setGsmBroadcastActivationResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setGsmBroadcastConfigResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void setSmscAddressResponse(android.hardware.radio.RadioResponseInfo p0) {}
    public void writeSmsToRuimResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public void writeSmsToSimResponse(android.hardware.radio.RadioResponseInfo p0, int p1) {}
    public java.lang.String getInterfaceHash() { return null; }
    public int getInterfaceVersion() { return 0; }
}
