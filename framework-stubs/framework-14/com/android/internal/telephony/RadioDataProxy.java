package com.android.internal.telephony;

public class RadioDataProxy extends com.android.internal.telephony.RadioServiceProxy {
    public RadioDataProxy() { super(); }
    public com.android.internal.telephony.HalVersion setAidl(com.android.internal.telephony.HalVersion p0, android.hardware.radio.data.IRadioData p1) { return null; }
    public android.hardware.radio.data.IRadioData getAidl() { return null; }
    public void clear() {}
    public boolean isEmpty() { return false; }
    public void allocatePduSessionId(int p0) throws android.os.RemoteException {}
    public void cancelHandover(int p0, int p1) throws android.os.RemoteException {}
    public void deactivateDataCall(int p0, int p1, int p2) throws android.os.RemoteException {}
    public void getDataCallList(int p0) throws android.os.RemoteException {}
    public void getSlicingConfig(int p0) throws android.os.RemoteException {}
    public void releasePduSessionId(int p0, int p1) throws android.os.RemoteException {}
    public void responseAcknowledgement() throws android.os.RemoteException {}
    public void setDataAllowed(int p0, boolean p1) throws android.os.RemoteException {}
    public void setDataProfile(int p0, android.telephony.data.DataProfile[] p1, boolean p2) throws android.os.RemoteException {}
    public void setDataThrottling(int p0, byte p1, long p2) throws android.os.RemoteException {}
    public void setInitialAttachApn(int p0, android.telephony.data.DataProfile p1, boolean p2) throws android.os.RemoteException {}
    public void setupDataCall(int p0, int p1, int p2, android.telephony.data.DataProfile p3, boolean p4, boolean p5, int p6, android.net.LinkProperties p7, int p8, android.telephony.data.NetworkSliceInfo p9, android.telephony.data.TrafficDescriptor p10, boolean p11) throws android.os.RemoteException {}
    public void startHandover(int p0, int p1) throws android.os.RemoteException {}
    public void startKeepalive(int p0, int p1, android.net.KeepalivePacketData p2, int p3, android.os.Message p4) throws android.os.RemoteException {}
    public void stopKeepalive(int p0, int p1) throws android.os.RemoteException {}
}
