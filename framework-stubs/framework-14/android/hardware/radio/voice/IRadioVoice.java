package android.hardware.radio.voice;

public interface IRadioVoice extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "8c5e0d53dc67b5ed221b2da0570a17684d973a20";
    public static final java.lang.String DESCRIPTOR = null;
    public void acceptCall(int p0) throws android.os.RemoteException;
    public void cancelPendingUssd(int p0) throws android.os.RemoteException;
    public void conference(int p0) throws android.os.RemoteException;
    public void dial(int p0, android.hardware.radio.voice.Dial p1) throws android.os.RemoteException;
    public void emergencyDial(int p0, android.hardware.radio.voice.Dial p1, int p2, java.lang.String[] p3, int p4, boolean p5, boolean p6) throws android.os.RemoteException;
    public void exitEmergencyCallbackMode(int p0) throws android.os.RemoteException;
    public void explicitCallTransfer(int p0) throws android.os.RemoteException;
    public void getCallForwardStatus(int p0, android.hardware.radio.voice.CallForwardInfo p1) throws android.os.RemoteException;
    public void getCallWaiting(int p0, int p1) throws android.os.RemoteException;
    public void getClip(int p0) throws android.os.RemoteException;
    public void getClir(int p0) throws android.os.RemoteException;
    public void getCurrentCalls(int p0) throws android.os.RemoteException;
    public void getLastCallFailCause(int p0) throws android.os.RemoteException;
    public void getMute(int p0) throws android.os.RemoteException;
    public void getPreferredVoicePrivacy(int p0) throws android.os.RemoteException;
    public void getTtyMode(int p0) throws android.os.RemoteException;
    public void handleStkCallSetupRequestFromSim(int p0, boolean p1) throws android.os.RemoteException;
    public void hangup(int p0, int p1) throws android.os.RemoteException;
    public void hangupForegroundResumeBackground(int p0) throws android.os.RemoteException;
    public void hangupWaitingOrBackground(int p0) throws android.os.RemoteException;
    public void isVoNrEnabled(int p0) throws android.os.RemoteException;
    public void rejectCall(int p0) throws android.os.RemoteException;
    public void responseAcknowledgement() throws android.os.RemoteException;
    public void sendBurstDtmf(int p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public void sendCdmaFeatureCode(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void sendDtmf(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void sendUssd(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void separateConnection(int p0, int p1) throws android.os.RemoteException;
    public void setCallForward(int p0, android.hardware.radio.voice.CallForwardInfo p1) throws android.os.RemoteException;
    public void setCallWaiting(int p0, boolean p1, int p2) throws android.os.RemoteException;
    public void setClir(int p0, int p1) throws android.os.RemoteException;
    public void setMute(int p0, boolean p1) throws android.os.RemoteException;
    public void setPreferredVoicePrivacy(int p0, boolean p1) throws android.os.RemoteException;
    public void setResponseFunctions(android.hardware.radio.voice.IRadioVoiceResponse p0, android.hardware.radio.voice.IRadioVoiceIndication p1) throws android.os.RemoteException;
    public void setTtyMode(int p0, int p1) throws android.os.RemoteException;
    public void setVoNrEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void startDtmf(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void stopDtmf(int p0) throws android.os.RemoteException;
    public void switchWaitingOrHoldingAndActive(int p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.voice.IRadioVoice {
        public Default() {}
        public void acceptCall(int p0) throws android.os.RemoteException {}
        public void cancelPendingUssd(int p0) throws android.os.RemoteException {}
        public void conference(int p0) throws android.os.RemoteException {}
        public void dial(int p0, android.hardware.radio.voice.Dial p1) throws android.os.RemoteException {}
        public void emergencyDial(int p0, android.hardware.radio.voice.Dial p1, int p2, java.lang.String[] p3, int p4, boolean p5, boolean p6) throws android.os.RemoteException {}
        public void exitEmergencyCallbackMode(int p0) throws android.os.RemoteException {}
        public void explicitCallTransfer(int p0) throws android.os.RemoteException {}
        public void getCallForwardStatus(int p0, android.hardware.radio.voice.CallForwardInfo p1) throws android.os.RemoteException {}
        public void getCallWaiting(int p0, int p1) throws android.os.RemoteException {}
        public void getClip(int p0) throws android.os.RemoteException {}
        public void getClir(int p0) throws android.os.RemoteException {}
        public void getCurrentCalls(int p0) throws android.os.RemoteException {}
        public void getLastCallFailCause(int p0) throws android.os.RemoteException {}
        public void getMute(int p0) throws android.os.RemoteException {}
        public void getPreferredVoicePrivacy(int p0) throws android.os.RemoteException {}
        public void getTtyMode(int p0) throws android.os.RemoteException {}
        public void handleStkCallSetupRequestFromSim(int p0, boolean p1) throws android.os.RemoteException {}
        public void hangup(int p0, int p1) throws android.os.RemoteException {}
        public void hangupForegroundResumeBackground(int p0) throws android.os.RemoteException {}
        public void hangupWaitingOrBackground(int p0) throws android.os.RemoteException {}
        public void isVoNrEnabled(int p0) throws android.os.RemoteException {}
        public void rejectCall(int p0) throws android.os.RemoteException {}
        public void responseAcknowledgement() throws android.os.RemoteException {}
        public void sendBurstDtmf(int p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
        public void sendCdmaFeatureCode(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void sendDtmf(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void sendUssd(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void separateConnection(int p0, int p1) throws android.os.RemoteException {}
        public void setCallForward(int p0, android.hardware.radio.voice.CallForwardInfo p1) throws android.os.RemoteException {}
        public void setCallWaiting(int p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void setClir(int p0, int p1) throws android.os.RemoteException {}
        public void setMute(int p0, boolean p1) throws android.os.RemoteException {}
        public void setPreferredVoicePrivacy(int p0, boolean p1) throws android.os.RemoteException {}
        public void setResponseFunctions(android.hardware.radio.voice.IRadioVoiceResponse p0, android.hardware.radio.voice.IRadioVoiceIndication p1) throws android.os.RemoteException {}
        public void setTtyMode(int p0, int p1) throws android.os.RemoteException {}
        public void setVoNrEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void startDtmf(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void stopDtmf(int p0) throws android.os.RemoteException {}
        public void switchWaitingOrHoldingAndActive(int p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.voice.IRadioVoice {
        static final int TRANSACTION_acceptCall = 1;
        static final int TRANSACTION_cancelPendingUssd = 2;
        static final int TRANSACTION_conference = 3;
        static final int TRANSACTION_dial = 4;
        static final int TRANSACTION_emergencyDial = 5;
        static final int TRANSACTION_exitEmergencyCallbackMode = 6;
        static final int TRANSACTION_explicitCallTransfer = 7;
        static final int TRANSACTION_getCallForwardStatus = 8;
        static final int TRANSACTION_getCallWaiting = 9;
        static final int TRANSACTION_getClip = 10;
        static final int TRANSACTION_getClir = 11;
        static final int TRANSACTION_getCurrentCalls = 12;
        static final int TRANSACTION_getLastCallFailCause = 13;
        static final int TRANSACTION_getMute = 14;
        static final int TRANSACTION_getPreferredVoicePrivacy = 15;
        static final int TRANSACTION_getTtyMode = 16;
        static final int TRANSACTION_handleStkCallSetupRequestFromSim = 17;
        static final int TRANSACTION_hangup = 18;
        static final int TRANSACTION_hangupForegroundResumeBackground = 19;
        static final int TRANSACTION_hangupWaitingOrBackground = 20;
        static final int TRANSACTION_isVoNrEnabled = 21;
        static final int TRANSACTION_rejectCall = 22;
        static final int TRANSACTION_responseAcknowledgement = 23;
        static final int TRANSACTION_sendBurstDtmf = 24;
        static final int TRANSACTION_sendCdmaFeatureCode = 25;
        static final int TRANSACTION_sendDtmf = 26;
        static final int TRANSACTION_sendUssd = 27;
        static final int TRANSACTION_separateConnection = 28;
        static final int TRANSACTION_setCallForward = 29;
        static final int TRANSACTION_setCallWaiting = 30;
        static final int TRANSACTION_setClir = 31;
        static final int TRANSACTION_setMute = 32;
        static final int TRANSACTION_setPreferredVoicePrivacy = 33;
        static final int TRANSACTION_setResponseFunctions = 34;
        static final int TRANSACTION_setTtyMode = 35;
        static final int TRANSACTION_setVoNrEnabled = 36;
        static final int TRANSACTION_startDtmf = 37;
        static final int TRANSACTION_stopDtmf = 38;
        static final int TRANSACTION_switchWaitingOrHoldingAndActive = 39;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.voice.IRadioVoice asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.voice.IRadioVoice {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void acceptCall(int p0) throws android.os.RemoteException {}
            public void cancelPendingUssd(int p0) throws android.os.RemoteException {}
            public void conference(int p0) throws android.os.RemoteException {}
            public void dial(int p0, android.hardware.radio.voice.Dial p1) throws android.os.RemoteException {}
            public void emergencyDial(int p0, android.hardware.radio.voice.Dial p1, int p2, java.lang.String[] p3, int p4, boolean p5, boolean p6) throws android.os.RemoteException {}
            public void exitEmergencyCallbackMode(int p0) throws android.os.RemoteException {}
            public void explicitCallTransfer(int p0) throws android.os.RemoteException {}
            public void getCallForwardStatus(int p0, android.hardware.radio.voice.CallForwardInfo p1) throws android.os.RemoteException {}
            public void getCallWaiting(int p0, int p1) throws android.os.RemoteException {}
            public void getClip(int p0) throws android.os.RemoteException {}
            public void getClir(int p0) throws android.os.RemoteException {}
            public void getCurrentCalls(int p0) throws android.os.RemoteException {}
            public void getLastCallFailCause(int p0) throws android.os.RemoteException {}
            public void getMute(int p0) throws android.os.RemoteException {}
            public void getPreferredVoicePrivacy(int p0) throws android.os.RemoteException {}
            public void getTtyMode(int p0) throws android.os.RemoteException {}
            public void handleStkCallSetupRequestFromSim(int p0, boolean p1) throws android.os.RemoteException {}
            public void hangup(int p0, int p1) throws android.os.RemoteException {}
            public void hangupForegroundResumeBackground(int p0) throws android.os.RemoteException {}
            public void hangupWaitingOrBackground(int p0) throws android.os.RemoteException {}
            public void isVoNrEnabled(int p0) throws android.os.RemoteException {}
            public void rejectCall(int p0) throws android.os.RemoteException {}
            public void responseAcknowledgement() throws android.os.RemoteException {}
            public void sendBurstDtmf(int p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
            public void sendCdmaFeatureCode(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void sendDtmf(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void sendUssd(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void separateConnection(int p0, int p1) throws android.os.RemoteException {}
            public void setCallForward(int p0, android.hardware.radio.voice.CallForwardInfo p1) throws android.os.RemoteException {}
            public void setCallWaiting(int p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void setClir(int p0, int p1) throws android.os.RemoteException {}
            public void setMute(int p0, boolean p1) throws android.os.RemoteException {}
            public void setPreferredVoicePrivacy(int p0, boolean p1) throws android.os.RemoteException {}
            public void setResponseFunctions(android.hardware.radio.voice.IRadioVoiceResponse p0, android.hardware.radio.voice.IRadioVoiceIndication p1) throws android.os.RemoteException {}
            public void setTtyMode(int p0, int p1) throws android.os.RemoteException {}
            public void setVoNrEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void startDtmf(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void stopDtmf(int p0) throws android.os.RemoteException {}
            public void switchWaitingOrHoldingAndActive(int p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
