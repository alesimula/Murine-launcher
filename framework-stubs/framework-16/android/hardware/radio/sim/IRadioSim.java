package android.hardware.radio.sim;

public interface IRadioSim extends android.os.IInterface {
    public static final int VERSION = 4;
    public static final java.lang.String HASH = "fc1a19a4f86a58981158cc8d956763c9d8ace630";
    public static final java.lang.String DESCRIPTOR = null;
    public void areUiccApplicationsEnabled(int p0) throws android.os.RemoteException;
    public void changeIccPin2ForApp(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void changeIccPinForApp(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void enableUiccApplications(int p0, boolean p1) throws android.os.RemoteException;
    public void getAllowedCarriers(int p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void getCdmaSubscription(int p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void getCdmaSubscriptionSource(int p0) throws android.os.RemoteException;
    public void getFacilityLockForApp(int p0, java.lang.String p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException;
    public void getIccCardStatus(int p0) throws android.os.RemoteException;
    public void getImsiForApp(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void getSimPhonebookCapacity(int p0) throws android.os.RemoteException;
    public void getSimPhonebookRecords(int p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void iccCloseLogicalChannel(int p0, int p1) throws android.os.RemoteException;
    public void iccIoForApp(int p0, android.hardware.radio.sim.IccIo p1) throws android.os.RemoteException;
    public void iccOpenLogicalChannel(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void iccTransmitApduBasicChannel(int p0, android.hardware.radio.sim.SimApdu p1) throws android.os.RemoteException;
    public void iccTransmitApduLogicalChannel(int p0, android.hardware.radio.sim.SimApdu p1) throws android.os.RemoteException;
    public void reportStkServiceIsRunning(int p0) throws android.os.RemoteException;
    public void requestIccSimAuthentication(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void responseAcknowledgement() throws android.os.RemoteException;
    public void sendEnvelope(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void sendEnvelopeWithStatus(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void sendTerminalResponseToSim(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setAllowedCarriers(int p0, android.hardware.radio.sim.CarrierRestrictions p1, int p2) throws android.os.RemoteException;
    public void setCarrierInfoForImsiEncryption(int p0, android.hardware.radio.sim.ImsiEncryptionInfo p1) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void setCdmaSubscriptionSource(int p0, int p1) throws android.os.RemoteException;
    public void setFacilityLockForApp(int p0, java.lang.String p1, boolean p2, java.lang.String p3, int p4, java.lang.String p5) throws android.os.RemoteException;
    public void setResponseFunctions(android.hardware.radio.sim.IRadioSimResponse p0, android.hardware.radio.sim.IRadioSimIndication p1) throws android.os.RemoteException;
    public void setSimCardPower(int p0, int p1) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void setUiccSubscription(int p0, android.hardware.radio.sim.SelectUiccSub p1) throws android.os.RemoteException;
    public void supplyIccPin2ForApp(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void supplyIccPinForApp(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void supplyIccPuk2ForApp(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void supplyIccPukForApp(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void supplySimDepersonalization(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void updateSimPhonebookRecords(int p0, android.hardware.radio.sim.PhonebookRecordInfo p1) throws android.os.RemoteException;
    public void iccCloseLogicalChannelWithSessionInfo(int p0, android.hardware.radio.sim.SessionInfo p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.sim.IRadioSim {
        public Default() {}
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
        public void iccCloseLogicalChannel(int p0, int p1) throws android.os.RemoteException {}
        public void iccIoForApp(int p0, android.hardware.radio.sim.IccIo p1) throws android.os.RemoteException {}
        public void iccOpenLogicalChannel(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void iccTransmitApduBasicChannel(int p0, android.hardware.radio.sim.SimApdu p1) throws android.os.RemoteException {}
        public void iccTransmitApduLogicalChannel(int p0, android.hardware.radio.sim.SimApdu p1) throws android.os.RemoteException {}
        public void reportStkServiceIsRunning(int p0) throws android.os.RemoteException {}
        public void requestIccSimAuthentication(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void responseAcknowledgement() throws android.os.RemoteException {}
        public void sendEnvelope(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void sendEnvelopeWithStatus(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void sendTerminalResponseToSim(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setAllowedCarriers(int p0, android.hardware.radio.sim.CarrierRestrictions p1, int p2) throws android.os.RemoteException {}
        public void setCarrierInfoForImsiEncryption(int p0, android.hardware.radio.sim.ImsiEncryptionInfo p1) throws android.os.RemoteException {}
        public void setCdmaSubscriptionSource(int p0, int p1) throws android.os.RemoteException {}
        public void setFacilityLockForApp(int p0, java.lang.String p1, boolean p2, java.lang.String p3, int p4, java.lang.String p5) throws android.os.RemoteException {}
        public void setResponseFunctions(android.hardware.radio.sim.IRadioSimResponse p0, android.hardware.radio.sim.IRadioSimIndication p1) throws android.os.RemoteException {}
        public void setSimCardPower(int p0, int p1) throws android.os.RemoteException {}
        public void setUiccSubscription(int p0, android.hardware.radio.sim.SelectUiccSub p1) throws android.os.RemoteException {}
        public void supplyIccPin2ForApp(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void supplyIccPinForApp(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void supplyIccPuk2ForApp(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void supplyIccPukForApp(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void supplySimDepersonalization(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void updateSimPhonebookRecords(int p0, android.hardware.radio.sim.PhonebookRecordInfo p1) throws android.os.RemoteException {}
        public void iccCloseLogicalChannelWithSessionInfo(int p0, android.hardware.radio.sim.SessionInfo p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.sim.IRadioSim {
        static final int TRANSACTION_areUiccApplicationsEnabled = 1;
        static final int TRANSACTION_changeIccPin2ForApp = 2;
        static final int TRANSACTION_changeIccPinForApp = 3;
        static final int TRANSACTION_enableUiccApplications = 4;
        static final int TRANSACTION_getAllowedCarriers = 5;
        static final int TRANSACTION_getCdmaSubscription = 6;
        static final int TRANSACTION_getCdmaSubscriptionSource = 7;
        static final int TRANSACTION_getFacilityLockForApp = 8;
        static final int TRANSACTION_getIccCardStatus = 9;
        static final int TRANSACTION_getImsiForApp = 10;
        static final int TRANSACTION_getSimPhonebookCapacity = 11;
        static final int TRANSACTION_getSimPhonebookRecords = 12;
        static final int TRANSACTION_iccCloseLogicalChannel = 13;
        static final int TRANSACTION_iccIoForApp = 14;
        static final int TRANSACTION_iccOpenLogicalChannel = 15;
        static final int TRANSACTION_iccTransmitApduBasicChannel = 16;
        static final int TRANSACTION_iccTransmitApduLogicalChannel = 17;
        static final int TRANSACTION_reportStkServiceIsRunning = 18;
        static final int TRANSACTION_requestIccSimAuthentication = 19;
        static final int TRANSACTION_responseAcknowledgement = 20;
        static final int TRANSACTION_sendEnvelope = 21;
        static final int TRANSACTION_sendEnvelopeWithStatus = 22;
        static final int TRANSACTION_sendTerminalResponseToSim = 23;
        static final int TRANSACTION_setAllowedCarriers = 24;
        static final int TRANSACTION_setCarrierInfoForImsiEncryption = 25;
        static final int TRANSACTION_setCdmaSubscriptionSource = 26;
        static final int TRANSACTION_setFacilityLockForApp = 27;
        static final int TRANSACTION_setResponseFunctions = 28;
        static final int TRANSACTION_setSimCardPower = 29;
        static final int TRANSACTION_setUiccSubscription = 30;
        static final int TRANSACTION_supplyIccPin2ForApp = 31;
        static final int TRANSACTION_supplyIccPinForApp = 32;
        static final int TRANSACTION_supplyIccPuk2ForApp = 33;
        static final int TRANSACTION_supplyIccPukForApp = 34;
        static final int TRANSACTION_supplySimDepersonalization = 35;
        static final int TRANSACTION_updateSimPhonebookRecords = 36;
        static final int TRANSACTION_iccCloseLogicalChannelWithSessionInfo = 37;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.sim.IRadioSim asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.sim.IRadioSim {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
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
            public void iccCloseLogicalChannel(int p0, int p1) throws android.os.RemoteException {}
            public void iccIoForApp(int p0, android.hardware.radio.sim.IccIo p1) throws android.os.RemoteException {}
            public void iccOpenLogicalChannel(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void iccTransmitApduBasicChannel(int p0, android.hardware.radio.sim.SimApdu p1) throws android.os.RemoteException {}
            public void iccTransmitApduLogicalChannel(int p0, android.hardware.radio.sim.SimApdu p1) throws android.os.RemoteException {}
            public void reportStkServiceIsRunning(int p0) throws android.os.RemoteException {}
            public void requestIccSimAuthentication(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void responseAcknowledgement() throws android.os.RemoteException {}
            public void sendEnvelope(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void sendEnvelopeWithStatus(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void sendTerminalResponseToSim(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setAllowedCarriers(int p0, android.hardware.radio.sim.CarrierRestrictions p1, int p2) throws android.os.RemoteException {}
            public void setCarrierInfoForImsiEncryption(int p0, android.hardware.radio.sim.ImsiEncryptionInfo p1) throws android.os.RemoteException {}
            public void setCdmaSubscriptionSource(int p0, int p1) throws android.os.RemoteException {}
            public void setFacilityLockForApp(int p0, java.lang.String p1, boolean p2, java.lang.String p3, int p4, java.lang.String p5) throws android.os.RemoteException {}
            public void setResponseFunctions(android.hardware.radio.sim.IRadioSimResponse p0, android.hardware.radio.sim.IRadioSimIndication p1) throws android.os.RemoteException {}
            public void setSimCardPower(int p0, int p1) throws android.os.RemoteException {}
            public void setUiccSubscription(int p0, android.hardware.radio.sim.SelectUiccSub p1) throws android.os.RemoteException {}
            public void supplyIccPin2ForApp(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void supplyIccPinForApp(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void supplyIccPuk2ForApp(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void supplyIccPukForApp(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void supplySimDepersonalization(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void updateSimPhonebookRecords(int p0, android.hardware.radio.sim.PhonebookRecordInfo p1) throws android.os.RemoteException {}
            public void iccCloseLogicalChannelWithSessionInfo(int p0, android.hardware.radio.sim.SessionInfo p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
