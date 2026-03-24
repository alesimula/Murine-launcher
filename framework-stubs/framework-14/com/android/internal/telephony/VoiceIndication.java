package com.android.internal.telephony;

public class VoiceIndication extends android.hardware.radio.voice.IRadioVoiceIndication.Stub {
    public VoiceIndication(com.android.internal.telephony.RIL p0) { super(); }
    public void callRing(int p0, boolean p1, android.hardware.radio.voice.CdmaSignalInfoRecord p2) {}
    public void callStateChanged(int p0) {}
    public void cdmaCallWaiting(int p0, android.hardware.radio.voice.CdmaCallWaiting p1) {}
    public void cdmaInfoRec(int p0, android.hardware.radio.voice.CdmaInformationRecord[] p1) {}
    public void cdmaOtaProvisionStatus(int p0, int p1) {}
    public void currentEmergencyNumberList(int p0, android.hardware.radio.voice.EmergencyNumber[] p1) {}
    public void enterEmergencyCallbackMode(int p0) {}
    public void exitEmergencyCallbackMode(int p0) {}
    public void indicateRingbackTone(int p0, boolean p1) {}
    public void onSupplementaryServiceIndication(int p0, android.hardware.radio.voice.StkCcUnsolSsResult p1) {}
    public void onUssd(int p0, int p1, java.lang.String p2) {}
    public void resendIncallMute(int p0) {}
    public void srvccStateNotify(int p0, int p1) {}
    public void stkCallControlAlphaNotify(int p0, java.lang.String p1) {}
    public void stkCallSetup(int p0, long p1) {}
    public java.lang.String getInterfaceHash() { return null; }
    public int getInterfaceVersion() { return 0; }
}
