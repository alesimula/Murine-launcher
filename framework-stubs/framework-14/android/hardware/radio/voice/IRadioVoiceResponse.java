package android.hardware.radio.voice;

public interface IRadioVoiceResponse extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "8c5e0d53dc67b5ed221b2da0570a17684d973a20";
    public static final java.lang.String DESCRIPTOR = null;
    public void acceptCallResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void acknowledgeRequest(int p0) throws android.os.RemoteException;
    public void cancelPendingUssdResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void conferenceResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void dialResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void emergencyDialResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void exitEmergencyCallbackModeResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void explicitCallTransferResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void getCallForwardStatusResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.voice.CallForwardInfo[] p1) throws android.os.RemoteException;
    public void getCallWaitingResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1, int p2) throws android.os.RemoteException;
    public void getClipResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public void getClirResponse(android.hardware.radio.RadioResponseInfo p0, int p1, int p2) throws android.os.RemoteException;
    public void getCurrentCallsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.voice.Call[] p1) throws android.os.RemoteException;
    public void getLastCallFailCauseResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.voice.LastCallFailCauseInfo p1) throws android.os.RemoteException;
    public void getMuteResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException;
    public void getPreferredVoicePrivacyResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException;
    public void getTtyModeResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public void handleStkCallSetupRequestFromSimResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void hangupConnectionResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void hangupForegroundResumeBackgroundResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void hangupWaitingOrBackgroundResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void isVoNrEnabledResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException;
    public void rejectCallResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void sendBurstDtmfResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void sendCdmaFeatureCodeResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void sendDtmfResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void sendUssdResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void separateConnectionResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setCallForwardResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setCallWaitingResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setClirResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setMuteResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setPreferredVoicePrivacyResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setTtyModeResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setVoNrEnabledResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void startDtmfResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void stopDtmfResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void switchWaitingOrHoldingAndActiveResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.voice.IRadioVoiceResponse {
        public Default() {}
        public void acceptCallResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void acknowledgeRequest(int p0) throws android.os.RemoteException {}
        public void cancelPendingUssdResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void conferenceResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void dialResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void emergencyDialResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void exitEmergencyCallbackModeResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void explicitCallTransferResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getCallForwardStatusResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.voice.CallForwardInfo[] p1) throws android.os.RemoteException {}
        public void getCallWaitingResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void getClipResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void getClirResponse(android.hardware.radio.RadioResponseInfo p0, int p1, int p2) throws android.os.RemoteException {}
        public void getCurrentCallsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.voice.Call[] p1) throws android.os.RemoteException {}
        public void getLastCallFailCauseResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.voice.LastCallFailCauseInfo p1) throws android.os.RemoteException {}
        public void getMuteResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
        public void getPreferredVoicePrivacyResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
        public void getTtyModeResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void handleStkCallSetupRequestFromSimResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void hangupConnectionResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void hangupForegroundResumeBackgroundResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void hangupWaitingOrBackgroundResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void isVoNrEnabledResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
        public void rejectCallResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void sendBurstDtmfResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void sendCdmaFeatureCodeResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void sendDtmfResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void sendUssdResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void separateConnectionResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setCallForwardResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setCallWaitingResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setClirResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setMuteResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setPreferredVoicePrivacyResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setTtyModeResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setVoNrEnabledResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void startDtmfResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void stopDtmfResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void switchWaitingOrHoldingAndActiveResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.voice.IRadioVoiceResponse {
        static final int TRANSACTION_acceptCallResponse = 1;
        static final int TRANSACTION_acknowledgeRequest = 2;
        static final int TRANSACTION_cancelPendingUssdResponse = 3;
        static final int TRANSACTION_conferenceResponse = 4;
        static final int TRANSACTION_dialResponse = 5;
        static final int TRANSACTION_emergencyDialResponse = 6;
        static final int TRANSACTION_exitEmergencyCallbackModeResponse = 7;
        static final int TRANSACTION_explicitCallTransferResponse = 8;
        static final int TRANSACTION_getCallForwardStatusResponse = 9;
        static final int TRANSACTION_getCallWaitingResponse = 10;
        static final int TRANSACTION_getClipResponse = 11;
        static final int TRANSACTION_getClirResponse = 12;
        static final int TRANSACTION_getCurrentCallsResponse = 13;
        static final int TRANSACTION_getLastCallFailCauseResponse = 14;
        static final int TRANSACTION_getMuteResponse = 15;
        static final int TRANSACTION_getPreferredVoicePrivacyResponse = 16;
        static final int TRANSACTION_getTtyModeResponse = 17;
        static final int TRANSACTION_handleStkCallSetupRequestFromSimResponse = 18;
        static final int TRANSACTION_hangupConnectionResponse = 19;
        static final int TRANSACTION_hangupForegroundResumeBackgroundResponse = 20;
        static final int TRANSACTION_hangupWaitingOrBackgroundResponse = 21;
        static final int TRANSACTION_isVoNrEnabledResponse = 22;
        static final int TRANSACTION_rejectCallResponse = 23;
        static final int TRANSACTION_sendBurstDtmfResponse = 24;
        static final int TRANSACTION_sendCdmaFeatureCodeResponse = 25;
        static final int TRANSACTION_sendDtmfResponse = 26;
        static final int TRANSACTION_sendUssdResponse = 27;
        static final int TRANSACTION_separateConnectionResponse = 28;
        static final int TRANSACTION_setCallForwardResponse = 29;
        static final int TRANSACTION_setCallWaitingResponse = 30;
        static final int TRANSACTION_setClirResponse = 31;
        static final int TRANSACTION_setMuteResponse = 32;
        static final int TRANSACTION_setPreferredVoicePrivacyResponse = 33;
        static final int TRANSACTION_setTtyModeResponse = 34;
        static final int TRANSACTION_setVoNrEnabledResponse = 35;
        static final int TRANSACTION_startDtmfResponse = 36;
        static final int TRANSACTION_stopDtmfResponse = 37;
        static final int TRANSACTION_switchWaitingOrHoldingAndActiveResponse = 38;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.voice.IRadioVoiceResponse asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.voice.IRadioVoiceResponse {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void acceptCallResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void acknowledgeRequest(int p0) throws android.os.RemoteException {}
            public void cancelPendingUssdResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void conferenceResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void dialResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void emergencyDialResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void exitEmergencyCallbackModeResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void explicitCallTransferResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void getCallForwardStatusResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.voice.CallForwardInfo[] p1) throws android.os.RemoteException {}
            public void getCallWaitingResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void getClipResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public void getClirResponse(android.hardware.radio.RadioResponseInfo p0, int p1, int p2) throws android.os.RemoteException {}
            public void getCurrentCallsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.voice.Call[] p1) throws android.os.RemoteException {}
            public void getLastCallFailCauseResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.voice.LastCallFailCauseInfo p1) throws android.os.RemoteException {}
            public void getMuteResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
            public void getPreferredVoicePrivacyResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
            public void getTtyModeResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public void handleStkCallSetupRequestFromSimResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void hangupConnectionResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void hangupForegroundResumeBackgroundResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void hangupWaitingOrBackgroundResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void isVoNrEnabledResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
            public void rejectCallResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void sendBurstDtmfResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void sendCdmaFeatureCodeResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void sendDtmfResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void sendUssdResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void separateConnectionResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setCallForwardResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setCallWaitingResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setClirResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setMuteResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setPreferredVoicePrivacyResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setTtyModeResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setVoNrEnabledResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void startDtmfResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void stopDtmfResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void switchWaitingOrHoldingAndActiveResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
