package com.android.internal.telephony;

public class RadioConfig extends android.os.Handler {
    static final int EVENT_HIDL_SERVICE_DEAD = 1;
    static final int EVENT_AIDL_SERVICE_DEAD = 2;
    static final com.android.internal.telephony.HalVersion RADIO_CONFIG_HAL_VERSION_UNKNOWN = null;
    static final com.android.internal.telephony.HalVersion RADIO_CONFIG_HAL_VERSION_1_0 = null;
    static final com.android.internal.telephony.HalVersion RADIO_CONFIG_HAL_VERSION_1_1 = null;
    static final com.android.internal.telephony.HalVersion RADIO_CONFIG_HAL_VERSION_1_3 = null;
    static final com.android.internal.telephony.HalVersion RADIO_CONFIG_HAL_VERSION_2_0 = null;
    protected com.android.internal.telephony.Registrant mSimSlotStatusRegistrant;
    public static com.android.internal.telephony.RadioConfig getInstance() { return null; }
    public static com.android.internal.telephony.RadioConfig make(android.content.Context p0, com.android.internal.telephony.HalVersion p1) { return null; }
    public void handleMessage(android.os.Message p0) {}
    public com.android.internal.telephony.RadioConfigProxy getRadioConfigProxy(android.os.Message p0) { return null; }
    public boolean setModemService(java.lang.String p0) { return false; }
    public com.android.internal.telephony.RILRequest processResponse(android.hardware.radio.RadioResponseInfo p0) { return null; }
    public com.android.internal.telephony.RILRequest processResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) { return null; }
    public com.android.internal.telephony.RILRequest processResponse_1_6(android.hardware.radio.V1_6.RadioResponseInfo p0) { return null; }
    public void getSimSlotsStatus(android.os.Message p0) {}
    public void setPreferredDataModem(int p0, android.os.Message p1) {}
    public void getPhoneCapability(android.os.Message p0) {}
    public boolean isSetPreferredDataCommandSupported() { return false; }
    public void setSimSlotsMapping(java.util.List<android.telephony.UiccSlotMapping> p0, android.os.Message p1) {}
    public void setNumOfLiveModems(int p0, android.os.Message p1) {}
    public void registerForSimSlotStatusChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSimSlotStatusChanged(android.os.Handler p0) {}
    public void getHalDeviceCapabilities(android.os.Message p0) {}
    public int[] getDeviceNrCapabilities() { return null; }
    public java.lang.String toString() { return null; }
}
