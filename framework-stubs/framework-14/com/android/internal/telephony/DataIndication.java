package com.android.internal.telephony;

public class DataIndication extends android.hardware.radio.data.IRadioDataIndication.Stub {
    public DataIndication(com.android.internal.telephony.RIL p0) { super(); }
    public void dataCallListChanged(int p0, android.hardware.radio.data.SetupDataCallResult[] p1) {}
    public void keepaliveStatus(int p0, android.hardware.radio.data.KeepaliveStatus p1) {}
    public void pcoData(int p0, android.hardware.radio.data.PcoDataInfo p1) {}
    public void unthrottleApn(int p0, android.hardware.radio.data.DataProfileInfo p1) throws android.os.RemoteException {}
    public void slicingConfigChanged(int p0, android.hardware.radio.data.SlicingConfig p1) throws android.os.RemoteException {}
    public java.lang.String getInterfaceHash() { return null; }
    public int getInterfaceVersion() { return 0; }
}
