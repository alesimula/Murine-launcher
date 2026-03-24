package com.android.internal.telephony;

public class MessagingIndication extends android.hardware.radio.messaging.IRadioMessagingIndication.Stub {
    public MessagingIndication(com.android.internal.telephony.RIL p0) { super(); }
    public void cdmaNewSms(int p0, android.hardware.radio.messaging.CdmaSmsMessage p1) {}
    public void cdmaRuimSmsStorageFull(int p0) {}
    public void newBroadcastSms(int p0, byte[] p1) {}
    public void newSms(int p0, byte[] p1) {}
    public void newSmsOnSim(int p0, int p1) {}
    public void newSmsStatusReport(int p0, byte[] p1) {}
    public void simSmsStorageFull(int p0) {}
    public java.lang.String getInterfaceHash() { return null; }
    public int getInterfaceVersion() { return 0; }
}
