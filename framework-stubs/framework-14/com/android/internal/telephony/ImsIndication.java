package com.android.internal.telephony;

public class ImsIndication extends android.hardware.radio.ims.IRadioImsIndication.Stub {
    public ImsIndication(com.android.internal.telephony.RIL p0) { super(); }
    public java.lang.String getInterfaceHash() { return null; }
    public int getInterfaceVersion() { return 0; }
    public void onConnectionSetupFailure(int p0, int p1, android.hardware.radio.ims.ConnectionFailureInfo p2) {}
    public void notifyAnbr(int p0, int p1, int p2, int p3) {}
    public void triggerImsDeregistration(int p0, int p1) {}
}
