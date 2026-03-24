package com.android.internal.telephony;

public class RadioMessagingProxy extends com.android.internal.telephony.RadioServiceProxy {
    public RadioMessagingProxy() { super(); }
    public com.android.internal.telephony.HalVersion setAidl(com.android.internal.telephony.HalVersion p0, android.hardware.radio.messaging.IRadioMessaging p1) { return null; }
    public android.hardware.radio.messaging.IRadioMessaging getAidl() { return null; }
    public void clear() {}
    public boolean isEmpty() { return false; }
    public void acknowledgeIncomingGsmSmsWithPdu(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException {}
    public void acknowledgeLastIncomingCdmaSms(int p0, boolean p1, int p2) throws android.os.RemoteException {}
    public void acknowledgeLastIncomingGsmSms(int p0, boolean p1, int p2) throws android.os.RemoteException {}
    public void deleteSmsOnRuim(int p0, int p1) throws android.os.RemoteException {}
    public void deleteSmsOnSim(int p0, int p1) throws android.os.RemoteException {}
    public void getCdmaBroadcastConfig(int p0) throws android.os.RemoteException {}
    public void getGsmBroadcastConfig(int p0) throws android.os.RemoteException {}
    public void getSmscAddress(int p0) throws android.os.RemoteException {}
    public void reportSmsMemoryStatus(int p0, boolean p1) throws android.os.RemoteException {}
    public void responseAcknowledgement() throws android.os.RemoteException {}
    public void sendCdmaSms(int p0, byte[] p1) throws android.os.RemoteException {}
    public void sendCdmaSmsExpectMore(int p0, byte[] p1) throws android.os.RemoteException {}
    public void sendImsSms(int p0, java.lang.String p1, java.lang.String p2, byte[] p3, int p4, int p5) throws android.os.RemoteException {}
    public void sendSms(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
    public void sendSmsExpectMore(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
    public void setCdmaBroadcastActivation(int p0, boolean p1) throws android.os.RemoteException {}
    public void setCdmaBroadcastConfig(int p0, com.android.internal.telephony.cdma.CdmaSmsBroadcastConfigInfo[] p1) throws android.os.RemoteException {}
    public void setGsmBroadcastActivation(int p0, boolean p1) throws android.os.RemoteException {}
    public void setGsmBroadcastConfig(int p0, com.android.internal.telephony.gsm.SmsBroadcastConfigInfo[] p1) throws android.os.RemoteException {}
    public void setSmscAddress(int p0, java.lang.String p1) throws android.os.RemoteException {}
    public void writeSmsToRuim(int p0, int p1, byte[] p2) throws android.os.RemoteException {}
    public void writeSmsToSim(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
}
