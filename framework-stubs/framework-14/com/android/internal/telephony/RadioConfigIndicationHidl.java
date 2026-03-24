package com.android.internal.telephony;

public class RadioConfigIndicationHidl extends android.hardware.radio.config.V1_2.IRadioConfigIndication.Stub {
    public RadioConfigIndicationHidl(com.android.internal.telephony.RadioConfig p0) { super(); }
    public void simSlotsStatusChanged(int p0, java.util.ArrayList<android.hardware.radio.config.V1_0.SimSlotStatus> p1) {}
    public void simSlotsStatusChanged_1_2(int p0, java.util.ArrayList<android.hardware.radio.config.V1_2.SimSlotStatus> p1) {}
}
