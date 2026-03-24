package com.android.internal.telephony;

public class SimIndication extends android.hardware.radio.sim.IRadioSimIndication.Stub {
    public SimIndication(com.android.internal.telephony.RIL p0) { super(); }
    public void carrierInfoForImsiEncryption(int p0) {}
    public void cdmaSubscriptionSourceChanged(int p0, int p1) {}
    public void simPhonebookChanged(int p0) {}
    public void simPhonebookRecordsReceived(int p0, byte p1, android.hardware.radio.sim.PhonebookRecordInfo[] p2) {}
    public void simRefresh(int p0, android.hardware.radio.sim.SimRefreshResult p1) {}
    public void simStatusChanged(int p0) {}
    public void stkEventNotify(int p0, java.lang.String p1) {}
    public void stkProactiveCommand(int p0, java.lang.String p1) {}
    public void stkSessionEnd(int p0) {}
    public void subscriptionStatusChanged(int p0, boolean p1) {}
    public void uiccApplicationsEnablementChanged(int p0, boolean p1) {}
    public java.lang.String getInterfaceHash() { return null; }
    public int getInterfaceVersion() { return 0; }
}
