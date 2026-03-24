package android.hardware.radio.V1_4;

public interface IRadioIndication extends android.hardware.radio.V1_3.IRadioIndication {
    public static final java.lang.String kInterfaceName = "android.hardware.radio@1.4::IRadioIndication";
    public static android.hardware.radio.V1_4.IRadioIndication asInterface(android.os.IHwBinder p0) { return null; }
    public static android.hardware.radio.V1_4.IRadioIndication castFrom(android.os.IHwInterface p0) { return null; }
    public android.os.IHwBinder asBinder();
    public static android.hardware.radio.V1_4.IRadioIndication getService(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
    public static android.hardware.radio.V1_4.IRadioIndication getService(boolean p0) throws android.os.RemoteException { return null; }
    public static android.hardware.radio.V1_4.IRadioIndication getService(java.lang.String p0) throws android.os.RemoteException { return null; }
    public static android.hardware.radio.V1_4.IRadioIndication getService() throws android.os.RemoteException { return null; }
    public void currentEmergencyNumberList(int p0, java.util.ArrayList<android.hardware.radio.V1_4.EmergencyNumber> p1) throws android.os.RemoteException;
    public void cellInfoList_1_4(int p0, java.util.ArrayList<android.hardware.radio.V1_4.CellInfo> p1) throws android.os.RemoteException;
    public void networkScanResult_1_4(int p0, android.hardware.radio.V1_4.NetworkScanResult p1) throws android.os.RemoteException;
    public void currentPhysicalChannelConfigs_1_4(int p0, java.util.ArrayList<android.hardware.radio.V1_4.PhysicalChannelConfig> p1) throws android.os.RemoteException;
    public void dataCallListChanged_1_4(int p0, java.util.ArrayList<android.hardware.radio.V1_4.SetupDataCallResult> p1) throws android.os.RemoteException;
    public void currentSignalStrength_1_4(int p0, android.hardware.radio.V1_4.SignalStrength p1) throws android.os.RemoteException;
    public java.util.ArrayList<java.lang.String> interfaceChain() throws android.os.RemoteException;
    public void debug(android.os.NativeHandle p0, java.util.ArrayList<java.lang.String> p1) throws android.os.RemoteException;
    public java.lang.String interfaceDescriptor() throws android.os.RemoteException;
    public java.util.ArrayList<byte[]> getHashChain() throws android.os.RemoteException;
    public void setHALInstrumentation() throws android.os.RemoteException;
    public boolean linkToDeath(android.os.IHwBinder.DeathRecipient p0, long p1) throws android.os.RemoteException;
    public void ping() throws android.os.RemoteException;
    public android.internal.hidl.base.V1_0.DebugInfo getDebugInfo() throws android.os.RemoteException;
    public void notifySyspropsChanged() throws android.os.RemoteException;
    public boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.HwBinder implements android.hardware.radio.V1_4.IRadioIndication {
        public Stub() { super(); }
        public android.os.IHwBinder asBinder() { return null; }
        public final java.util.ArrayList<java.lang.String> interfaceChain() { return null; }
        public void debug(android.os.NativeHandle p0, java.util.ArrayList<java.lang.String> p1) {}
        public final java.lang.String interfaceDescriptor() { return null; }
        public final java.util.ArrayList<byte[]> getHashChain() { return null; }
        public final void setHALInstrumentation() {}
        public final boolean linkToDeath(android.os.IHwBinder.DeathRecipient p0, long p1) { return false; }
        public final void ping() {}
        public final android.internal.hidl.base.V1_0.DebugInfo getDebugInfo() { return null; }
        public final void notifySyspropsChanged() {}
        public final boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient p0) { return false; }
        public android.os.IHwInterface queryLocalInterface(java.lang.String p0) { return null; }
        public void registerAsService(java.lang.String p0) throws android.os.RemoteException {}
        public java.lang.String toString() { return null; }
        public void onTransact(int p0, android.os.HwParcel p1, android.os.HwParcel p2, int p3) throws android.os.RemoteException {}
    }

    public static final class Proxy implements android.hardware.radio.V1_4.IRadioIndication {
        private android.os.IHwBinder mRemote;
        public Proxy(android.os.IHwBinder p0) {}
        public android.os.IHwBinder asBinder() { return null; }
        public java.lang.String toString() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public void radioStateChanged(int p0, int p1) throws android.os.RemoteException {}
        public void callStateChanged(int p0) throws android.os.RemoteException {}
        public void networkStateChanged(int p0) throws android.os.RemoteException {}
        public void newSms(int p0, java.util.ArrayList<java.lang.Byte> p1) throws android.os.RemoteException {}
        public void newSmsStatusReport(int p0, java.util.ArrayList<java.lang.Byte> p1) throws android.os.RemoteException {}
        public void newSmsOnSim(int p0, int p1) throws android.os.RemoteException {}
        public void onUssd(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void nitzTimeReceived(int p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
        public void currentSignalStrength(int p0, android.hardware.radio.V1_0.SignalStrength p1) throws android.os.RemoteException {}
        public void dataCallListChanged(int p0, java.util.ArrayList<android.hardware.radio.V1_0.SetupDataCallResult> p1) throws android.os.RemoteException {}
        public void suppSvcNotify(int p0, android.hardware.radio.V1_0.SuppSvcNotification p1) throws android.os.RemoteException {}
        public void stkSessionEnd(int p0) throws android.os.RemoteException {}
        public void stkProactiveCommand(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void stkEventNotify(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void stkCallSetup(int p0, long p1) throws android.os.RemoteException {}
        public void simSmsStorageFull(int p0) throws android.os.RemoteException {}
        public void simRefresh(int p0, android.hardware.radio.V1_0.SimRefreshResult p1) throws android.os.RemoteException {}
        public void callRing(int p0, boolean p1, android.hardware.radio.V1_0.CdmaSignalInfoRecord p2) throws android.os.RemoteException {}
        public void simStatusChanged(int p0) throws android.os.RemoteException {}
        public void cdmaNewSms(int p0, android.hardware.radio.V1_0.CdmaSmsMessage p1) throws android.os.RemoteException {}
        public void newBroadcastSms(int p0, java.util.ArrayList<java.lang.Byte> p1) throws android.os.RemoteException {}
        public void cdmaRuimSmsStorageFull(int p0) throws android.os.RemoteException {}
        public void restrictedStateChanged(int p0, int p1) throws android.os.RemoteException {}
        public void enterEmergencyCallbackMode(int p0) throws android.os.RemoteException {}
        public void cdmaCallWaiting(int p0, android.hardware.radio.V1_0.CdmaCallWaiting p1) throws android.os.RemoteException {}
        public void cdmaOtaProvisionStatus(int p0, int p1) throws android.os.RemoteException {}
        public void cdmaInfoRec(int p0, android.hardware.radio.V1_0.CdmaInformationRecords p1) throws android.os.RemoteException {}
        public void indicateRingbackTone(int p0, boolean p1) throws android.os.RemoteException {}
        public void resendIncallMute(int p0) throws android.os.RemoteException {}
        public void cdmaSubscriptionSourceChanged(int p0, int p1) throws android.os.RemoteException {}
        public void cdmaPrlChanged(int p0, int p1) throws android.os.RemoteException {}
        public void exitEmergencyCallbackMode(int p0) throws android.os.RemoteException {}
        public void rilConnected(int p0) throws android.os.RemoteException {}
        public void voiceRadioTechChanged(int p0, int p1) throws android.os.RemoteException {}
        public void cellInfoList(int p0, java.util.ArrayList<android.hardware.radio.V1_0.CellInfo> p1) throws android.os.RemoteException {}
        public void imsNetworkStateChanged(int p0) throws android.os.RemoteException {}
        public void subscriptionStatusChanged(int p0, boolean p1) throws android.os.RemoteException {}
        public void srvccStateNotify(int p0, int p1) throws android.os.RemoteException {}
        public void hardwareConfigChanged(int p0, java.util.ArrayList<android.hardware.radio.V1_0.HardwareConfig> p1) throws android.os.RemoteException {}
        public void radioCapabilityIndication(int p0, android.hardware.radio.V1_0.RadioCapability p1) throws android.os.RemoteException {}
        public void onSupplementaryServiceIndication(int p0, android.hardware.radio.V1_0.StkCcUnsolSsResult p1) throws android.os.RemoteException {}
        public void stkCallControlAlphaNotify(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void lceData(int p0, android.hardware.radio.V1_0.LceDataInfo p1) throws android.os.RemoteException {}
        public void pcoData(int p0, android.hardware.radio.V1_0.PcoDataInfo p1) throws android.os.RemoteException {}
        public void modemReset(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void carrierInfoForImsiEncryption(int p0) throws android.os.RemoteException {}
        public void networkScanResult(int p0, android.hardware.radio.V1_1.NetworkScanResult p1) throws android.os.RemoteException {}
        public void keepaliveStatus(int p0, android.hardware.radio.V1_1.KeepaliveStatus p1) throws android.os.RemoteException {}
        public void networkScanResult_1_2(int p0, android.hardware.radio.V1_2.NetworkScanResult p1) throws android.os.RemoteException {}
        public void cellInfoList_1_2(int p0, java.util.ArrayList<android.hardware.radio.V1_2.CellInfo> p1) throws android.os.RemoteException {}
        public void currentLinkCapacityEstimate(int p0, android.hardware.radio.V1_2.LinkCapacityEstimate p1) throws android.os.RemoteException {}
        public void currentPhysicalChannelConfigs(int p0, java.util.ArrayList<android.hardware.radio.V1_2.PhysicalChannelConfig> p1) throws android.os.RemoteException {}
        public void currentSignalStrength_1_2(int p0, android.hardware.radio.V1_2.SignalStrength p1) throws android.os.RemoteException {}
        public void currentEmergencyNumberList(int p0, java.util.ArrayList<android.hardware.radio.V1_4.EmergencyNumber> p1) throws android.os.RemoteException {}
        public void cellInfoList_1_4(int p0, java.util.ArrayList<android.hardware.radio.V1_4.CellInfo> p1) throws android.os.RemoteException {}
        public void networkScanResult_1_4(int p0, android.hardware.radio.V1_4.NetworkScanResult p1) throws android.os.RemoteException {}
        public void currentPhysicalChannelConfigs_1_4(int p0, java.util.ArrayList<android.hardware.radio.V1_4.PhysicalChannelConfig> p1) throws android.os.RemoteException {}
        public void dataCallListChanged_1_4(int p0, java.util.ArrayList<android.hardware.radio.V1_4.SetupDataCallResult> p1) throws android.os.RemoteException {}
        public void currentSignalStrength_1_4(int p0, android.hardware.radio.V1_4.SignalStrength p1) throws android.os.RemoteException {}
        public java.util.ArrayList<java.lang.String> interfaceChain() throws android.os.RemoteException { return null; }
        public void debug(android.os.NativeHandle p0, java.util.ArrayList<java.lang.String> p1) throws android.os.RemoteException {}
        public java.lang.String interfaceDescriptor() throws android.os.RemoteException { return null; }
        public java.util.ArrayList<byte[]> getHashChain() throws android.os.RemoteException { return null; }
        public void setHALInstrumentation() throws android.os.RemoteException {}
        public boolean linkToDeath(android.os.IHwBinder.DeathRecipient p0, long p1) throws android.os.RemoteException { return false; }
        public void ping() throws android.os.RemoteException {}
        public android.internal.hidl.base.V1_0.DebugInfo getDebugInfo() throws android.os.RemoteException { return null; }
        public void notifySyspropsChanged() throws android.os.RemoteException {}
        public boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient p0) throws android.os.RemoteException { return false; }
    }
}
