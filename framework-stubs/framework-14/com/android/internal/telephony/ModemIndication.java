package com.android.internal.telephony;

public class ModemIndication extends android.hardware.radio.modem.IRadioModemIndication.Stub {
    public ModemIndication(com.android.internal.telephony.RIL p0) { super(); }
    public void hardwareConfigChanged(int p0, android.hardware.radio.modem.HardwareConfig[] p1) {}
    public void modemReset(int p0, java.lang.String p1) {}
    public void radioCapabilityIndication(int p0, android.hardware.radio.modem.RadioCapability p1) {}
    public void radioStateChanged(int p0, int p1) {}
    public void rilConnected(int p0) {}
    public java.lang.String getInterfaceHash() { return null; }
    public int getInterfaceVersion() { return 0; }
}
