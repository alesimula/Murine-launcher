package com.android.internal.telecom;

public interface IInCallAdapter extends android.os.IInterface {
    public void answerCall(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void deflectCall(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException;
    public void rejectCall(java.lang.String p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public void rejectCallWithReason(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void transferCall(java.lang.String p0, android.net.Uri p1, boolean p2) throws android.os.RemoteException;
    public void consultativeTransfer(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void disconnectCall(java.lang.String p0) throws android.os.RemoteException;
    public void holdCall(java.lang.String p0) throws android.os.RemoteException;
    public void unholdCall(java.lang.String p0) throws android.os.RemoteException;
    public void mute(boolean p0) throws android.os.RemoteException;
    public void setAudioRoute(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void enterBackgroundAudioProcessing(java.lang.String p0) throws android.os.RemoteException;
    public void exitBackgroundAudioProcessing(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void playDtmfTone(java.lang.String p0, char p1) throws android.os.RemoteException;
    public void stopDtmfTone(java.lang.String p0) throws android.os.RemoteException;
    public void postDialContinue(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void phoneAccountSelected(java.lang.String p0, android.telecom.PhoneAccountHandle p1, boolean p2) throws android.os.RemoteException;
    public void conference(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void splitFromConference(java.lang.String p0) throws android.os.RemoteException;
    public void mergeConference(java.lang.String p0) throws android.os.RemoteException;
    public void swapConference(java.lang.String p0) throws android.os.RemoteException;
    public void addConferenceParticipants(java.lang.String p0, java.util.List<android.net.Uri> p1) throws android.os.RemoteException;
    public void turnOnProximitySensor() throws android.os.RemoteException;
    public void turnOffProximitySensor(boolean p0) throws android.os.RemoteException;
    public void pullExternalCall(java.lang.String p0) throws android.os.RemoteException;
    public void sendCallEvent(java.lang.String p0, java.lang.String p1, int p2, android.os.Bundle p3) throws android.os.RemoteException;
    public void putExtras(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void removeExtras(java.lang.String p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public void sendRttRequest(java.lang.String p0) throws android.os.RemoteException;
    public void respondToRttRequest(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public void stopRtt(java.lang.String p0) throws android.os.RemoteException;
    public void setRttMode(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void handoverTo(java.lang.String p0, android.telecom.PhoneAccountHandle p1, int p2, android.os.Bundle p3) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telecom.IInCallAdapter {
        public Default() {}
        public void answerCall(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void deflectCall(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException {}
        public void rejectCall(java.lang.String p0, boolean p1, java.lang.String p2) throws android.os.RemoteException {}
        public void rejectCallWithReason(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void transferCall(java.lang.String p0, android.net.Uri p1, boolean p2) throws android.os.RemoteException {}
        public void consultativeTransfer(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void disconnectCall(java.lang.String p0) throws android.os.RemoteException {}
        public void holdCall(java.lang.String p0) throws android.os.RemoteException {}
        public void unholdCall(java.lang.String p0) throws android.os.RemoteException {}
        public void mute(boolean p0) throws android.os.RemoteException {}
        public void setAudioRoute(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void enterBackgroundAudioProcessing(java.lang.String p0) throws android.os.RemoteException {}
        public void exitBackgroundAudioProcessing(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void playDtmfTone(java.lang.String p0, char p1) throws android.os.RemoteException {}
        public void stopDtmfTone(java.lang.String p0) throws android.os.RemoteException {}
        public void postDialContinue(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void phoneAccountSelected(java.lang.String p0, android.telecom.PhoneAccountHandle p1, boolean p2) throws android.os.RemoteException {}
        public void conference(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void splitFromConference(java.lang.String p0) throws android.os.RemoteException {}
        public void mergeConference(java.lang.String p0) throws android.os.RemoteException {}
        public void swapConference(java.lang.String p0) throws android.os.RemoteException {}
        public void addConferenceParticipants(java.lang.String p0, java.util.List<android.net.Uri> p1) throws android.os.RemoteException {}
        public void turnOnProximitySensor() throws android.os.RemoteException {}
        public void turnOffProximitySensor(boolean p0) throws android.os.RemoteException {}
        public void pullExternalCall(java.lang.String p0) throws android.os.RemoteException {}
        public void sendCallEvent(java.lang.String p0, java.lang.String p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public void putExtras(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void removeExtras(java.lang.String p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
        public void sendRttRequest(java.lang.String p0) throws android.os.RemoteException {}
        public void respondToRttRequest(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void stopRtt(java.lang.String p0) throws android.os.RemoteException {}
        public void setRttMode(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void handoverTo(java.lang.String p0, android.telecom.PhoneAccountHandle p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.IInCallAdapter {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.IInCallAdapter";
        static final int TRANSACTION_answerCall = 1;
        static final int TRANSACTION_deflectCall = 2;
        static final int TRANSACTION_rejectCall = 3;
        static final int TRANSACTION_rejectCallWithReason = 4;
        static final int TRANSACTION_transferCall = 5;
        static final int TRANSACTION_consultativeTransfer = 6;
        static final int TRANSACTION_disconnectCall = 7;
        static final int TRANSACTION_holdCall = 8;
        static final int TRANSACTION_unholdCall = 9;
        static final int TRANSACTION_mute = 10;
        static final int TRANSACTION_setAudioRoute = 11;
        static final int TRANSACTION_enterBackgroundAudioProcessing = 12;
        static final int TRANSACTION_exitBackgroundAudioProcessing = 13;
        static final int TRANSACTION_playDtmfTone = 14;
        static final int TRANSACTION_stopDtmfTone = 15;
        static final int TRANSACTION_postDialContinue = 16;
        static final int TRANSACTION_phoneAccountSelected = 17;
        static final int TRANSACTION_conference = 18;
        static final int TRANSACTION_splitFromConference = 19;
        static final int TRANSACTION_mergeConference = 20;
        static final int TRANSACTION_swapConference = 21;
        static final int TRANSACTION_addConferenceParticipants = 22;
        static final int TRANSACTION_turnOnProximitySensor = 23;
        static final int TRANSACTION_turnOffProximitySensor = 24;
        static final int TRANSACTION_pullExternalCall = 25;
        static final int TRANSACTION_sendCallEvent = 26;
        static final int TRANSACTION_putExtras = 27;
        static final int TRANSACTION_removeExtras = 28;
        static final int TRANSACTION_sendRttRequest = 29;
        static final int TRANSACTION_respondToRttRequest = 30;
        static final int TRANSACTION_stopRtt = 31;
        static final int TRANSACTION_setRttMode = 32;
        static final int TRANSACTION_handoverTo = 33;
        public Stub() { super(); }
        public static com.android.internal.telecom.IInCallAdapter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telecom.IInCallAdapter {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void answerCall(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void deflectCall(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException {}
            public void rejectCall(java.lang.String p0, boolean p1, java.lang.String p2) throws android.os.RemoteException {}
            public void rejectCallWithReason(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void transferCall(java.lang.String p0, android.net.Uri p1, boolean p2) throws android.os.RemoteException {}
            public void consultativeTransfer(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void disconnectCall(java.lang.String p0) throws android.os.RemoteException {}
            public void holdCall(java.lang.String p0) throws android.os.RemoteException {}
            public void unholdCall(java.lang.String p0) throws android.os.RemoteException {}
            public void mute(boolean p0) throws android.os.RemoteException {}
            public void setAudioRoute(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void enterBackgroundAudioProcessing(java.lang.String p0) throws android.os.RemoteException {}
            public void exitBackgroundAudioProcessing(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void playDtmfTone(java.lang.String p0, char p1) throws android.os.RemoteException {}
            public void stopDtmfTone(java.lang.String p0) throws android.os.RemoteException {}
            public void postDialContinue(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void phoneAccountSelected(java.lang.String p0, android.telecom.PhoneAccountHandle p1, boolean p2) throws android.os.RemoteException {}
            public void conference(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void splitFromConference(java.lang.String p0) throws android.os.RemoteException {}
            public void mergeConference(java.lang.String p0) throws android.os.RemoteException {}
            public void swapConference(java.lang.String p0) throws android.os.RemoteException {}
            public void addConferenceParticipants(java.lang.String p0, java.util.List<android.net.Uri> p1) throws android.os.RemoteException {}
            public void turnOnProximitySensor() throws android.os.RemoteException {}
            public void turnOffProximitySensor(boolean p0) throws android.os.RemoteException {}
            public void pullExternalCall(java.lang.String p0) throws android.os.RemoteException {}
            public void sendCallEvent(java.lang.String p0, java.lang.String p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
            public void putExtras(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void removeExtras(java.lang.String p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
            public void sendRttRequest(java.lang.String p0) throws android.os.RemoteException {}
            public void respondToRttRequest(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void stopRtt(java.lang.String p0) throws android.os.RemoteException {}
            public void setRttMode(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void handoverTo(java.lang.String p0, android.telecom.PhoneAccountHandle p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
        }
    }
}
