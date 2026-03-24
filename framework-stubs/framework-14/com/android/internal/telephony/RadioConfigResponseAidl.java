package com.android.internal.telephony;

public class RadioConfigResponseAidl extends android.hardware.radio.config.IRadioConfigResponse.Stub {
    public RadioConfigResponseAidl(com.android.internal.telephony.RadioConfig p0, com.android.internal.telephony.HalVersion p1) { super(); }
    public void getHalDeviceCapabilitiesResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
    public void getNumOfLiveModemsResponse(android.hardware.radio.RadioResponseInfo p0, byte p1) throws android.os.RemoteException {}
    public void getPhoneCapabilityResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.config.PhoneCapability p1) throws android.os.RemoteException {}
    public void getSimSlotsStatusResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.config.SimSlotStatus[] p1) throws android.os.RemoteException {}
    public void setNumOfLiveModemsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
    public void setPreferredDataModemResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
    public void setSimSlotsMappingResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
    public java.lang.String getInterfaceHash() { return null; }
    public int getInterfaceVersion() { return 0; }
}
