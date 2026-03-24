package android.hardware.radio.sim;

public interface IRadioSimResponse extends android.os.IInterface {
    public static final int VERSION = 4;
    public static final java.lang.String HASH = "fc1a19a4f86a58981158cc8d956763c9d8ace630";
    public static final java.lang.String DESCRIPTOR = null;
    public void acknowledgeRequest(int p0) throws android.os.RemoteException;
    public void areUiccApplicationsEnabledResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException;
    public void changeIccPin2ForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public void changeIccPinForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public void enableUiccApplicationsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void getAllowedCarriersResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.CarrierRestrictions p1, int p2) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void getCdmaSubscriptionResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void getCdmaSubscriptionSourceResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public void getFacilityLockForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public void getIccCardStatusResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.CardStatus p1) throws android.os.RemoteException;
    public void getImsiForAppResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException;
    public void getSimPhonebookCapacityResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.PhonebookCapacity p1) throws android.os.RemoteException;
    public void getSimPhonebookRecordsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void iccCloseLogicalChannelResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void iccIoForAppResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) throws android.os.RemoteException;
    public void iccOpenLogicalChannelResponse(android.hardware.radio.RadioResponseInfo p0, int p1, byte[] p2) throws android.os.RemoteException;
    public void iccTransmitApduBasicChannelResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) throws android.os.RemoteException;
    public void iccTransmitApduLogicalChannelResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) throws android.os.RemoteException;
    public void reportStkServiceIsRunningResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void requestIccSimAuthenticationResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) throws android.os.RemoteException;
    public void sendEnvelopeResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException;
    public void sendEnvelopeWithStatusResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) throws android.os.RemoteException;
    public void sendTerminalResponseToSimResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setAllowedCarriersResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setCarrierInfoForImsiEncryptionResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void setCdmaSubscriptionSourceResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setFacilityLockForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public void setSimCardPowerResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void setUiccSubscriptionResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void supplyIccPin2ForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public void supplyIccPinForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public void supplyIccPuk2ForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public void supplyIccPukForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public void supplySimDepersonalizationResponse(android.hardware.radio.RadioResponseInfo p0, int p1, int p2) throws android.os.RemoteException;
    public void updateSimPhonebookRecordsResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public void iccCloseLogicalChannelWithSessionInfoResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.sim.IRadioSimResponse {
        public Default() {}
        public void acknowledgeRequest(int p0) throws android.os.RemoteException {}
        public void areUiccApplicationsEnabledResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
        public void changeIccPin2ForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void changeIccPinForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void enableUiccApplicationsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getAllowedCarriersResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.CarrierRestrictions p1, int p2) throws android.os.RemoteException {}
        public void getCdmaSubscriptionResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException {}
        public void getCdmaSubscriptionSourceResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void getFacilityLockForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void getIccCardStatusResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.CardStatus p1) throws android.os.RemoteException {}
        public void getImsiForAppResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException {}
        public void getSimPhonebookCapacityResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.PhonebookCapacity p1) throws android.os.RemoteException {}
        public void getSimPhonebookRecordsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void iccCloseLogicalChannelResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void iccIoForAppResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) throws android.os.RemoteException {}
        public void iccOpenLogicalChannelResponse(android.hardware.radio.RadioResponseInfo p0, int p1, byte[] p2) throws android.os.RemoteException {}
        public void iccTransmitApduBasicChannelResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) throws android.os.RemoteException {}
        public void iccTransmitApduLogicalChannelResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) throws android.os.RemoteException {}
        public void reportStkServiceIsRunningResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void requestIccSimAuthenticationResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) throws android.os.RemoteException {}
        public void sendEnvelopeResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException {}
        public void sendEnvelopeWithStatusResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) throws android.os.RemoteException {}
        public void sendTerminalResponseToSimResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setAllowedCarriersResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setCarrierInfoForImsiEncryptionResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setCdmaSubscriptionSourceResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setFacilityLockForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void setSimCardPowerResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setUiccSubscriptionResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void supplyIccPin2ForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void supplyIccPinForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void supplyIccPuk2ForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void supplyIccPukForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void supplySimDepersonalizationResponse(android.hardware.radio.RadioResponseInfo p0, int p1, int p2) throws android.os.RemoteException {}
        public void updateSimPhonebookRecordsResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void iccCloseLogicalChannelWithSessionInfoResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.sim.IRadioSimResponse {
        static final int TRANSACTION_acknowledgeRequest = 1;
        static final int TRANSACTION_areUiccApplicationsEnabledResponse = 2;
        static final int TRANSACTION_changeIccPin2ForAppResponse = 3;
        static final int TRANSACTION_changeIccPinForAppResponse = 4;
        static final int TRANSACTION_enableUiccApplicationsResponse = 5;
        static final int TRANSACTION_getAllowedCarriersResponse = 6;
        static final int TRANSACTION_getCdmaSubscriptionResponse = 7;
        static final int TRANSACTION_getCdmaSubscriptionSourceResponse = 8;
        static final int TRANSACTION_getFacilityLockForAppResponse = 9;
        static final int TRANSACTION_getIccCardStatusResponse = 10;
        static final int TRANSACTION_getImsiForAppResponse = 11;
        static final int TRANSACTION_getSimPhonebookCapacityResponse = 12;
        static final int TRANSACTION_getSimPhonebookRecordsResponse = 13;
        static final int TRANSACTION_iccCloseLogicalChannelResponse = 14;
        static final int TRANSACTION_iccIoForAppResponse = 15;
        static final int TRANSACTION_iccOpenLogicalChannelResponse = 16;
        static final int TRANSACTION_iccTransmitApduBasicChannelResponse = 17;
        static final int TRANSACTION_iccTransmitApduLogicalChannelResponse = 18;
        static final int TRANSACTION_reportStkServiceIsRunningResponse = 19;
        static final int TRANSACTION_requestIccSimAuthenticationResponse = 20;
        static final int TRANSACTION_sendEnvelopeResponse = 21;
        static final int TRANSACTION_sendEnvelopeWithStatusResponse = 22;
        static final int TRANSACTION_sendTerminalResponseToSimResponse = 23;
        static final int TRANSACTION_setAllowedCarriersResponse = 24;
        static final int TRANSACTION_setCarrierInfoForImsiEncryptionResponse = 25;
        static final int TRANSACTION_setCdmaSubscriptionSourceResponse = 26;
        static final int TRANSACTION_setFacilityLockForAppResponse = 27;
        static final int TRANSACTION_setSimCardPowerResponse = 28;
        static final int TRANSACTION_setUiccSubscriptionResponse = 29;
        static final int TRANSACTION_supplyIccPin2ForAppResponse = 30;
        static final int TRANSACTION_supplyIccPinForAppResponse = 31;
        static final int TRANSACTION_supplyIccPuk2ForAppResponse = 32;
        static final int TRANSACTION_supplyIccPukForAppResponse = 33;
        static final int TRANSACTION_supplySimDepersonalizationResponse = 34;
        static final int TRANSACTION_updateSimPhonebookRecordsResponse = 35;
        static final int TRANSACTION_iccCloseLogicalChannelWithSessionInfoResponse = 36;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.sim.IRadioSimResponse asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.sim.IRadioSimResponse {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void acknowledgeRequest(int p0) throws android.os.RemoteException {}
            public void areUiccApplicationsEnabledResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
            public void changeIccPin2ForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public void changeIccPinForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public void enableUiccApplicationsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void getAllowedCarriersResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.CarrierRestrictions p1, int p2) throws android.os.RemoteException {}
            public void getCdmaSubscriptionResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException {}
            public void getCdmaSubscriptionSourceResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public void getFacilityLockForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public void getIccCardStatusResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.CardStatus p1) throws android.os.RemoteException {}
            public void getImsiForAppResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException {}
            public void getSimPhonebookCapacityResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.PhonebookCapacity p1) throws android.os.RemoteException {}
            public void getSimPhonebookRecordsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void iccCloseLogicalChannelResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void iccIoForAppResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) throws android.os.RemoteException {}
            public void iccOpenLogicalChannelResponse(android.hardware.radio.RadioResponseInfo p0, int p1, byte[] p2) throws android.os.RemoteException {}
            public void iccTransmitApduBasicChannelResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) throws android.os.RemoteException {}
            public void iccTransmitApduLogicalChannelResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) throws android.os.RemoteException {}
            public void reportStkServiceIsRunningResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void requestIccSimAuthenticationResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) throws android.os.RemoteException {}
            public void sendEnvelopeResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException {}
            public void sendEnvelopeWithStatusResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.sim.IccIoResult p1) throws android.os.RemoteException {}
            public void sendTerminalResponseToSimResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setAllowedCarriersResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setCarrierInfoForImsiEncryptionResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setCdmaSubscriptionSourceResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setFacilityLockForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public void setSimCardPowerResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setUiccSubscriptionResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void supplyIccPin2ForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public void supplyIccPinForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public void supplyIccPuk2ForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public void supplyIccPukForAppResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public void supplySimDepersonalizationResponse(android.hardware.radio.RadioResponseInfo p0, int p1, int p2) throws android.os.RemoteException {}
            public void updateSimPhonebookRecordsResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public void iccCloseLogicalChannelWithSessionInfoResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
