package com.android.internal.telephony;

public class RadioIndication extends android.hardware.radio.V1_6.IRadioIndication.Stub {
    com.android.internal.telephony.RIL mRil;
    RadioIndication(com.android.internal.telephony.RIL p0) { super(); }
    public void radioStateChanged(int p0, int p1) {}
    public void callStateChanged(int p0) {}
    public void networkStateChanged(int p0) {}
    public void newSms(int p0, java.util.ArrayList<java.lang.Byte> p1) {}
    public void newSmsStatusReport(int p0, java.util.ArrayList<java.lang.Byte> p1) {}
    public void newSmsOnSim(int p0, int p1) {}
    public void onUssd(int p0, int p1, java.lang.String p2) {}
    public void nitzTimeReceived(int p0, java.lang.String p1, long p2) {}
    public void currentSignalStrength(int p0, android.hardware.radio.V1_0.SignalStrength p1) {}
    public void currentLinkCapacityEstimate(int p0, android.hardware.radio.V1_2.LinkCapacityEstimate p1) {}
    public void currentLinkCapacityEstimate_1_6(int p0, android.hardware.radio.V1_6.LinkCapacityEstimate p1) {}
    public void currentSignalStrength_1_2(int p0, android.hardware.radio.V1_2.SignalStrength p1) {}
    public void currentSignalStrength_1_4(int p0, android.hardware.radio.V1_4.SignalStrength p1) {}
    public void currentSignalStrength_1_6(int p0, android.hardware.radio.V1_6.SignalStrength p1) {}
    public void currentPhysicalChannelConfigs_1_4(int p0, java.util.ArrayList<android.hardware.radio.V1_4.PhysicalChannelConfig> p1) {}
    public void currentPhysicalChannelConfigs_1_6(int p0, java.util.ArrayList<android.hardware.radio.V1_6.PhysicalChannelConfig> p1) {}
    public void currentPhysicalChannelConfigs(int p0, java.util.ArrayList<android.hardware.radio.V1_2.PhysicalChannelConfig> p1) {}
    public void currentEmergencyNumberList(int p0, java.util.ArrayList<android.hardware.radio.V1_4.EmergencyNumber> p1) {}
    public void dataCallListChanged(int p0, java.util.ArrayList<android.hardware.radio.V1_0.SetupDataCallResult> p1) {}
    public void dataCallListChanged_1_4(int p0, java.util.ArrayList<android.hardware.radio.V1_4.SetupDataCallResult> p1) {}
    public void dataCallListChanged_1_5(int p0, java.util.ArrayList<android.hardware.radio.V1_5.SetupDataCallResult> p1) {}
    public void dataCallListChanged_1_6(int p0, java.util.ArrayList<android.hardware.radio.V1_6.SetupDataCallResult> p1) {}
    public void unthrottleApn(int p0, java.lang.String p1) throws android.os.RemoteException {}
    public void suppSvcNotify(int p0, android.hardware.radio.V1_0.SuppSvcNotification p1) {}
    public void stkSessionEnd(int p0) {}
    public void stkProactiveCommand(int p0, java.lang.String p1) {}
    public void stkEventNotify(int p0, java.lang.String p1) {}
    public void stkCallSetup(int p0, long p1) {}
    public void simSmsStorageFull(int p0) {}
    public void simRefresh(int p0, android.hardware.radio.V1_0.SimRefreshResult p1) {}
    public void callRing(int p0, boolean p1, android.hardware.radio.V1_0.CdmaSignalInfoRecord p2) {}
    public void simStatusChanged(int p0) {}
    public void cdmaNewSms(int p0, android.hardware.radio.V1_0.CdmaSmsMessage p1) {}
    public void newBroadcastSms(int p0, java.util.ArrayList<java.lang.Byte> p1) {}
    public void cdmaRuimSmsStorageFull(int p0) {}
    public void restrictedStateChanged(int p0, int p1) {}
    public void enterEmergencyCallbackMode(int p0) {}
    public void cdmaCallWaiting(int p0, android.hardware.radio.V1_0.CdmaCallWaiting p1) {}
    public void cdmaOtaProvisionStatus(int p0, int p1) {}
    public void cdmaInfoRec(int p0, android.hardware.radio.V1_0.CdmaInformationRecords p1) {}
    public void indicateRingbackTone(int p0, boolean p1) {}
    public void resendIncallMute(int p0) {}
    public void cdmaSubscriptionSourceChanged(int p0, int p1) {}
    public void cdmaPrlChanged(int p0, int p1) {}
    public void exitEmergencyCallbackMode(int p0) {}
    public void rilConnected(int p0) {}
    public void voiceRadioTechChanged(int p0, int p1) {}
    public void cellInfoList(int p0, java.util.ArrayList<android.hardware.radio.V1_0.CellInfo> p1) {}
    public void cellInfoList_1_2(int p0, java.util.ArrayList<android.hardware.radio.V1_2.CellInfo> p1) {}
    public void cellInfoList_1_4(int p0, java.util.ArrayList<android.hardware.radio.V1_4.CellInfo> p1) {}
    public void cellInfoList_1_5(int p0, java.util.ArrayList<android.hardware.radio.V1_5.CellInfo> p1) {}
    public void cellInfoList_1_6(int p0, java.util.ArrayList<android.hardware.radio.V1_6.CellInfo> p1) {}
    public void uiccApplicationsEnablementChanged(int p0, boolean p1) {}
    public void networkScanResult(int p0, android.hardware.radio.V1_1.NetworkScanResult p1) {}
    public void networkScanResult_1_2(int p0, android.hardware.radio.V1_2.NetworkScanResult p1) {}
    public void networkScanResult_1_4(int p0, android.hardware.radio.V1_4.NetworkScanResult p1) {}
    public void networkScanResult_1_5(int p0, android.hardware.radio.V1_5.NetworkScanResult p1) {}
    public void networkScanResult_1_6(int p0, android.hardware.radio.V1_6.NetworkScanResult p1) {}
    public void imsNetworkStateChanged(int p0) {}
    public void subscriptionStatusChanged(int p0, boolean p1) {}
    public void srvccStateNotify(int p0, int p1) {}
    public void hardwareConfigChanged(int p0, java.util.ArrayList<android.hardware.radio.V1_0.HardwareConfig> p1) {}
    public void radioCapabilityIndication(int p0, android.hardware.radio.V1_0.RadioCapability p1) {}
    public void onSupplementaryServiceIndication(int p0, android.hardware.radio.V1_0.StkCcUnsolSsResult p1) {}
    public void stkCallControlAlphaNotify(int p0, java.lang.String p1) {}
    public void lceData(int p0, android.hardware.radio.V1_0.LceDataInfo p1) {}
    public void pcoData(int p0, android.hardware.radio.V1_0.PcoDataInfo p1) {}
    public void modemReset(int p0, java.lang.String p1) {}
    public void carrierInfoForImsiEncryption(int p0) {}
    public void keepaliveStatus(int p0, android.hardware.radio.V1_1.KeepaliveStatus p1) {}
    public void simPhonebookChanged(int p0) {}
    public void simPhonebookRecordsReceived(int p0, byte p1, java.util.ArrayList<android.hardware.radio.V1_6.PhonebookRecordInfo> p2) {}
    public void registrationFailed(int p0, android.hardware.radio.V1_5.CellIdentity p1, java.lang.String p2, int p3, int p4, int p5) {}
    public void barringInfoChanged(int p0, android.hardware.radio.V1_5.CellIdentity p1, java.util.ArrayList<android.hardware.radio.V1_5.BarringInfo> p2) {}
}
