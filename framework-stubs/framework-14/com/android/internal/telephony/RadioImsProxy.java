package com.android.internal.telephony;

public class RadioImsProxy extends com.android.internal.telephony.RadioServiceProxy {
    public RadioImsProxy() { super(); }
    public com.android.internal.telephony.HalVersion setAidl(com.android.internal.telephony.HalVersion p0, android.hardware.radio.ims.IRadioIms p1) { return null; }
    public android.hardware.radio.ims.IRadioIms getAidl() { return null; }
    public void clear() {}
    public boolean isEmpty() { return false; }
    public void responseAcknowledgement() throws android.os.RemoteException {}
    public void setSrvccCallInfo(int p0, android.hardware.radio.ims.SrvccCall[] p1) throws android.os.RemoteException {}
    public void updateImsRegistrationInfo(int p0, android.hardware.radio.ims.ImsRegistration p1) throws android.os.RemoteException {}
    public void startImsTraffic(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
    public void stopImsTraffic(int p0, int p1) throws android.os.RemoteException {}
    public void triggerEpsFallback(int p0, int p1) throws android.os.RemoteException {}
    public void sendAnbrQuery(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
    public void updateImsCallStatus(int p0, android.hardware.radio.ims.ImsCall[] p1) throws android.os.RemoteException {}
}
