package com.android.internal.telephony;

public class RadioModemProxy extends com.android.internal.telephony.RadioServiceProxy {
    public RadioModemProxy() { super(); }
    public com.android.internal.telephony.HalVersion setAidl(com.android.internal.telephony.HalVersion p0, android.hardware.radio.modem.IRadioModem p1) { return null; }
    public android.hardware.radio.modem.IRadioModem getAidl() { return null; }
    public void clear() {}
    public boolean isEmpty() { return false; }
    public void enableModem(int p0, boolean p1) throws android.os.RemoteException {}
    public void getBasebandVersion(int p0) throws android.os.RemoteException {}
    public void getDeviceIdentity(int p0) throws android.os.RemoteException {}
    public void getImei(int p0) throws android.os.RemoteException {}
    public void getHardwareConfig(int p0) throws android.os.RemoteException {}
    public void getModemActivityInfo(int p0) throws android.os.RemoteException {}
    public void getModemStackStatus(int p0) throws android.os.RemoteException {}
    public void getRadioCapability(int p0) throws android.os.RemoteException {}
    public void nvReadItem(int p0, int p1) throws android.os.RemoteException {}
    public void nvResetConfig(int p0, int p1) throws android.os.RemoteException {}
    public void nvWriteCdmaPrl(int p0, byte[] p1) throws android.os.RemoteException {}
    public void nvWriteItem(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
    public void requestShutdown(int p0) throws android.os.RemoteException {}
    public void responseAcknowledgement() throws android.os.RemoteException {}
    public void sendDeviceState(int p0, int p1, boolean p2) throws android.os.RemoteException {}
    public void setRadioCapability(int p0, com.android.internal.telephony.RadioCapability p1) throws android.os.RemoteException {}
    public void setRadioPower(int p0, boolean p1, boolean p2, boolean p3) throws android.os.RemoteException {}
}
