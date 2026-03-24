package com.android.internal.telephony;

public class NetworkIndication extends android.hardware.radio.network.IRadioNetworkIndication.Stub {
    public NetworkIndication(com.android.internal.telephony.RIL p0) { super(); }
    public void barringInfoChanged(int p0, android.hardware.radio.network.CellIdentity p1, android.hardware.radio.network.BarringInfo[] p2) {}
    public void cdmaPrlChanged(int p0, int p1) {}
    public void cellInfoList(int p0, android.hardware.radio.network.CellInfo[] p1) {}
    public void currentLinkCapacityEstimate(int p0, android.hardware.radio.network.LinkCapacityEstimate p1) {}
    public void currentPhysicalChannelConfigs(int p0, android.hardware.radio.network.PhysicalChannelConfig[] p1) {}
    public void currentSignalStrength(int p0, android.hardware.radio.network.SignalStrength p1) {}
    public void imsNetworkStateChanged(int p0) {}
    public void networkScanResult(int p0, android.hardware.radio.network.NetworkScanResult p1) {}
    public void networkStateChanged(int p0) {}
    public void nitzTimeReceived(int p0, java.lang.String p1, long p2, long p3) {}
    public void registrationFailed(int p0, android.hardware.radio.network.CellIdentity p1, java.lang.String p2, int p3, int p4, int p5) {}
    public void restrictedStateChanged(int p0, int p1) {}
    public void suppSvcNotify(int p0, android.hardware.radio.network.SuppSvcNotification p1) {}
    public void voiceRadioTechChanged(int p0, int p1) {}
    public void emergencyNetworkScanResult(int p0, android.hardware.radio.network.EmergencyRegResult p1) {}
    public java.lang.String getInterfaceHash() { return null; }
    public int getInterfaceVersion() { return 0; }
}
