package com.android.internal.telephony;

public class RadioConfigResponseHidl extends android.hardware.radio.config.V1_3.IRadioConfigResponse.Stub {
    public RadioConfigResponseHidl(com.android.internal.telephony.RadioConfig p0, com.android.internal.telephony.HalVersion p1) { super(); }
    public void getSimSlotsStatusResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.config.V1_0.SimSlotStatus> p1) throws android.os.RemoteException {}
    public void setSimSlotsMappingResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
    public void getPhoneCapabilityResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.config.V1_1.PhoneCapability p1) throws android.os.RemoteException {}
    public void setPreferredDataModemResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
    public void setModemsConfigResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
    public void getModemsConfigResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.config.V1_1.ModemsConfig p1) throws android.os.RemoteException {}
    public void getSimSlotsStatusResponse_1_2(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.config.V1_2.SimSlotStatus> p1) throws android.os.RemoteException {}
    public void getHalDeviceCapabilitiesResponse(android.hardware.radio.V1_6.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
}
