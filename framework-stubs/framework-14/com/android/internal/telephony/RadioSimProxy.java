package com.android.internal.telephony;

public class RadioSimProxy extends com.android.internal.telephony.RadioServiceProxy {
    public RadioSimProxy() { super(); }
    public com.android.internal.telephony.HalVersion setAidl(com.android.internal.telephony.HalVersion p0, android.hardware.radio.sim.IRadioSim p1) { return null; }
    public android.hardware.radio.sim.IRadioSim getAidl() { return null; }
    public void clear() {}
    public boolean isEmpty() { return false; }
    public void areUiccApplicationsEnabled(int p0) throws android.os.RemoteException {}
    public void changeIccPin2ForApp(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
    public void changeIccPinForApp(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
    public void enableUiccApplications(int p0, boolean p1) throws android.os.RemoteException {}
    public void getAllowedCarriers(int p0) throws android.os.RemoteException {}
    public void getCdmaSubscription(int p0) throws android.os.RemoteException {}
    public void getCdmaSubscriptionSource(int p0) throws android.os.RemoteException {}
    public void getFacilityLockForApp(int p0, java.lang.String p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException {}
    public void getIccCardStatus(int p0) throws android.os.RemoteException {}
    public void getImsiForApp(int p0, java.lang.String p1) throws android.os.RemoteException {}
    public void getSimPhonebookCapacity(int p0) throws android.os.RemoteException {}
    public void getSimPhonebookRecords(int p0) throws android.os.RemoteException {}
    public void iccCloseLogicalChannel(int p0, int p1, boolean p2) throws android.os.RemoteException {}
    public void iccIoForApp(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, int p6, java.lang.String p7, java.lang.String p8, java.lang.String p9) throws android.os.RemoteException {}
    public void iccOpenLogicalChannel(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
    public void iccTransmitApduBasicChannel(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) throws android.os.RemoteException {}
    public void iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException {}
    public void iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7, boolean p8) throws android.os.RemoteException {}
    public void reportStkServiceIsRunning(int p0) throws android.os.RemoteException {}
    public void requestIccSimAuthentication(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
    public void responseAcknowledgement() throws android.os.RemoteException {}
    public void sendEnvelope(int p0, java.lang.String p1) throws android.os.RemoteException {}
    public void sendEnvelopeWithStatus(int p0, java.lang.String p1) throws android.os.RemoteException {}
    public void sendTerminalResponseToSim(int p0, java.lang.String p1) throws android.os.RemoteException {}
    public void setAllowedCarriers(int p0, android.telephony.CarrierRestrictionRules p1, android.os.Message p2) throws android.os.RemoteException {}
    public void setCarrierInfoForImsiEncryption(int p0, android.telephony.ImsiEncryptionInfo p1) throws android.os.RemoteException {}
    public void setCdmaSubscriptionSource(int p0, int p1) throws android.os.RemoteException {}
    public void setFacilityLockForApp(int p0, java.lang.String p1, boolean p2, java.lang.String p3, int p4, java.lang.String p5) throws android.os.RemoteException {}
    public void setSimCardPower(int p0, int p1, android.os.Message p2) throws android.os.RemoteException {}
    public void setUiccSubscription(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
    public void supplyIccPin2ForApp(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
    public void supplyIccPinForApp(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
    public void supplyIccPuk2ForApp(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
    public void supplyIccPukForApp(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
    public void supplySimDepersonalization(int p0, com.android.internal.telephony.uicc.IccCardApplicationStatus.PersoSubState p1, java.lang.String p2) throws android.os.RemoteException {}
    public void updateSimPhonebookRecords(int p0, com.android.internal.telephony.uicc.SimPhonebookRecord p1) throws android.os.RemoteException {}
}
