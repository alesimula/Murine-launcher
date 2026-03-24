package com.android.internal.telephony;

public class RadioNetworkProxy extends com.android.internal.telephony.RadioServiceProxy {
    public RadioNetworkProxy() { super(); }
    public com.android.internal.telephony.HalVersion setAidl(com.android.internal.telephony.HalVersion p0, android.hardware.radio.network.IRadioNetwork p1) { return null; }
    public android.hardware.radio.network.IRadioNetwork getAidl() { return null; }
    public void clear() {}
    public boolean isEmpty() { return false; }
    public void getAllowedNetworkTypesBitmap(int p0) throws android.os.RemoteException {}
    public void getAvailableBandModes(int p0) throws android.os.RemoteException {}
    public void getAvailableNetworks(int p0) throws android.os.RemoteException {}
    public void getBarringInfo(int p0) throws android.os.RemoteException {}
    public void getCdmaRoamingPreference(int p0) throws android.os.RemoteException {}
    public void getCellInfoList(int p0) throws android.os.RemoteException {}
    public void getDataRegistrationState(int p0, com.android.internal.telephony.HalVersion p1) throws android.os.RemoteException {}
    public void getImsRegistrationState(int p0) throws android.os.RemoteException {}
    public void getNetworkSelectionMode(int p0) throws android.os.RemoteException {}
    public void getOperator(int p0) throws android.os.RemoteException {}
    public void getSignalStrength(int p0) throws android.os.RemoteException {}
    public void getSystemSelectionChannels(int p0) throws android.os.RemoteException {}
    public void getVoiceRadioTechnology(int p0) throws android.os.RemoteException {}
    public void getVoiceRegistrationState(int p0, com.android.internal.telephony.HalVersion p1) throws android.os.RemoteException {}
    public void isNrDualConnectivityEnabled(int p0) throws android.os.RemoteException {}
    public void responseAcknowledgement() throws android.os.RemoteException {}
    public void setAllowedNetworkTypesBitmap(int p0, int p1) throws android.os.RemoteException {}
    public void setPreferredNetworkTypeBitmap(int p0, int p1) throws android.os.RemoteException {}
    public void setBandMode(int p0, int p1) throws android.os.RemoteException {}
    public void setBarringPassword(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
    public void setCdmaRoamingPreference(int p0, int p1) throws android.os.RemoteException {}
    public void setCellInfoListRate(int p0, int p1) throws android.os.RemoteException {}
    public void setIndicationFilter(int p0, int p1) throws android.os.RemoteException {}
    public void setLinkCapacityReportingCriteria(int p0, int p1, int p2, int p3, int[] p4, int[] p5, int p6) throws android.os.RemoteException {}
    public void setLocationUpdates(int p0, boolean p1) throws android.os.RemoteException {}
    public void setNetworkSelectionModeAutomatic(int p0) throws android.os.RemoteException {}
    public void setNetworkSelectionModeManual(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
    public void setNrDualConnectivityState(int p0, byte p1) throws android.os.RemoteException {}
    public void setSignalStrengthReportingCriteria(int p0, java.util.List<android.telephony.SignalThresholdInfo> p1) throws android.os.RemoteException {}
    public void setSuppServiceNotifications(int p0, boolean p1) throws android.os.RemoteException {}
    public void setSystemSelectionChannels(int p0, java.util.List<android.telephony.RadioAccessSpecifier> p1) throws android.os.RemoteException {}
    public void startNetworkScan(int p0, android.telephony.NetworkScanRequest p1, com.android.internal.telephony.HalVersion p2, android.os.Message p3) throws android.os.RemoteException {}
    public void stopNetworkScan(int p0) throws android.os.RemoteException {}
    public void supplyNetworkDepersonalization(int p0, java.lang.String p1) throws android.os.RemoteException {}
    public void getUsageSetting(int p0) throws android.os.RemoteException {}
    public void setUsageSetting(int p0, int p1) throws android.os.RemoteException {}
    public void setEmergencyMode(int p0, int p1) throws android.os.RemoteException {}
    public void triggerEmergencyNetworkScan(int p0, android.hardware.radio.network.EmergencyNetworkScanTrigger p1) throws android.os.RemoteException {}
    public void cancelEmergencyNetworkScan(int p0, boolean p1) throws android.os.RemoteException {}
    public void exitEmergencyMode(int p0) throws android.os.RemoteException {}
    public void setNullCipherAndIntegrityEnabled(int p0, boolean p1) throws android.os.RemoteException {}
    public void isNullCipherAndIntegrityEnabled(int p0) throws android.os.RemoteException {}
    public void isN1ModeEnabled(int p0) throws android.os.RemoteException {}
    public void setN1ModeEnabled(int p0, boolean p1) throws android.os.RemoteException {}
}
